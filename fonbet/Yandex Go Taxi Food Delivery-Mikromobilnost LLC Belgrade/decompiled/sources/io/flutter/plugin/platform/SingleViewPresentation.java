package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import defpackage.qwc0;
import defpackage.tg;
import io.flutter.view.AccessibilityBridge;

/* loaded from: classes4.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final tg accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private AccessibilityDelegatingFrameLayout rootView;
    private boolean startFocused;
    private final e state;
    private int viewId;

    public static class AccessibilityDelegatingFrameLayout extends FrameLayout {
        private final tg accessibilityEventsDelegate;
        private final View embeddedView;

        public AccessibilityDelegatingFrameLayout(Context context, tg tgVar, View view) {
            super(context);
            this.accessibilityEventsDelegate = tgVar;
            this.embeddedView = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            tg tgVar = this.accessibilityEventsDelegate;
            View view2 = this.embeddedView;
            AccessibilityBridge accessibilityBridge = tgVar.a;
            if (accessibilityBridge == null) {
                return false;
            }
            return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view2, view, accessibilityEvent);
        }
    }

    public static class PresentationContext extends ContextWrapper {
        private final Context flutterAppWindowContext;
        private WindowManager windowManager;
        private final WindowManagerHandler windowManagerHandler;

        public PresentationContext(Context context, WindowManagerHandler windowManagerHandler, Context context2) {
            super(context);
            this.windowManagerHandler = windowManagerHandler;
            this.flutterAppWindowContext = context2;
        }

        private WindowManager getWindowManager() {
            if (this.windowManager == null) {
                this.windowManager = this.windowManagerHandler;
            }
            return this.windowManager;
        }

        private boolean isCalledFromAlertDialog() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 0; i < stackTrace.length && i < 11; i++) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? isCalledFromAlertDialog() ? this.flutterAppWindowContext.getSystemService(str) : getWindowManager() : super.getSystemService(str);
        }
    }

    public SingleViewPresentation(Context context, Display display, qwc0 qwc0Var, tg tgVar, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new ImmContext(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = tgVar;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        eVar.a = qwc0Var;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public e detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = this.rootView;
        if (accessibilityDelegatingFrameLayout != null) {
            accessibilityDelegatingFrameLayout.removeAllViews();
        }
        return this.state;
    }

    public qwc0 getView() {
        return this.state.a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        e eVar = this.state;
        if (eVar.c == null) {
            eVar.c = new SingleViewFakeWindowViewGroup(getContext());
        }
        if (this.state.b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            e eVar2 = this.state;
            eVar2.b = new WindowManagerHandler(windowManager, eVar2.c);
        }
        this.container = new FrameLayout(getContext());
        PresentationContext presentationContext = new PresentationContext(getContext(), this.state.b, this.outerContext);
        View view = this.state.a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(presentationContext);
        }
        this.container.addView(view);
        AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = new AccessibilityDelegatingFrameLayout(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = accessibilityDelegatingFrameLayout;
        accessibilityDelegatingFrameLayout.addView(this.container);
        this.rootView.addView(this.state.c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public static class ImmContext extends ContextWrapper {
        private final InputMethodManager inputMethodManager;

        private ImmContext(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.inputMethodManager = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new ImmContext(super.createDisplayContext(display), this.inputMethodManager);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.inputMethodManager : super.getSystemService(str);
        }

        public ImmContext(Context context) {
            this(context, null);
        }
    }

    public SingleViewPresentation(Context context, Display display, tg tgVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new ImmContext(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = tgVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
