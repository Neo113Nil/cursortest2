package com.datadog.android.rum.internal.instrumentation.gestures;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.room.util.DBUtil;
import coil3.svg.internal.AndroidSvg;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.FixedWindowCallback;
import com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.google.android.gms.internal.mlkit_vision_common.zzib;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class WindowCallbackWrapper extends FixedWindowCallback {
    public final Function1 copyEvent;
    public final AndroidSvg gesturesDetector;
    public final InternalLogger internalLogger;
    public final InternalSdkCore sdkCore;
    public final JetpackViewAttributesProvider[] targetAttributesProviders;
    public final WeakReference windowReference;
    public final Window.Callback wrappedCallback;

    /* renamed from: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            motionEvent.getClass();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.getClass();
            return obtain;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowCallbackWrapper(Window window, InternalSdkCore internalSdkCore, Window.Callback callback, AndroidSvg androidSvg, NoOpInteractionPredicate noOpInteractionPredicate, JetpackViewAttributesProvider[] jetpackViewAttributesProviderArr, InternalLogger internalLogger) {
        super(callback);
        window.getClass();
        internalSdkCore.getClass();
        internalLogger.getClass();
        this.sdkCore = internalSdkCore;
        this.wrappedCallback = callback;
        this.gesturesDetector = androidSvg;
        this.copyEvent = AnonymousClass1.INSTANCE;
        this.targetAttributesProviders = jetpackViewAttributesProviderArr;
        this.internalLogger = internalLogger;
        this.windowReference = new WeakReference(window);
    }

    @Override // com.datadog.android.rum.internal.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window window;
        View currentFocus;
        if (keyEvent == null) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), WindowCallbackWrapper$dispatchKeyEvent$1.INSTANCE, null, 56);
        } else {
            int keyCode = keyEvent.getKeyCode();
            InternalSdkCore internalSdkCore = this.sdkCore;
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore);
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                rumMonitor.addAction(RumActionType.BACK, "back", emptyMap);
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1 && (window = (Window) this.windowReference.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("action.target.classname", zzib.targetClassName(currentFocus)), new Pair("action.target.resource_id", zzib.resourceIdName(window.getContext(), currentFocus.getId())));
                for (JetpackViewAttributesProvider jetpackViewAttributesProvider : this.targetAttributesProviders) {
                    jetpackViewAttributesProvider.getClass();
                    JetpackViewAttributesProvider.extractAttributes(currentFocus, mutableMapOf);
                }
                GlobalRumMonitor.get(internalSdkCore).addAction(RumActionType.CLICK, "", mutableMapOf);
            }
        }
        try {
            return this.wrappedCallback.dispatchKeyEvent(keyEvent);
        } catch (NullPointerException e) {
            this.logOrRethrowWrappedCallbackException(e);
            return true;
        }
    }

    @Override // com.datadog.android.rum.internal.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        if (motionEvent != null) {
            MotionEvent motionEvent2 = (MotionEvent) this.copyEvent.invoke(motionEvent);
            try {
                try {
                    this.gesturesDetector.onTouchEvent(motionEvent2);
                } catch (Exception e) {
                    DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), WindowCallbackWrapper$dispatchKeyEvent$1.INSTANCE$1, e, 48);
                }
                motionEvent2.recycle();
            } catch (Throwable th) {
                motionEvent2.recycle();
                throw th;
            }
        } else {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), WindowCallbackWrapper$dispatchKeyEvent$1.INSTANCE$2, null, 56);
        }
        try {
            return this.wrappedCallback.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException e2) {
            this.logOrRethrowWrappedCallbackException(e2);
            return true;
        }
    }

    public final void logOrRethrowWrappedCallbackException(NullPointerException nullPointerException) {
        String message = nullPointerException.getMessage();
        if (message == null || !StringsKt.contains((CharSequence) message, (CharSequence) "Parameter specified as non-null is null", false)) {
            throw nullPointerException;
        }
        DBUtil.log$default(this.internalLogger, 5, InternalLogger.Target.MAINTAINER, WindowCallbackWrapper$dispatchKeyEvent$1.INSTANCE$3, nullPointerException, false, 48);
    }

    @Override // com.datadog.android.rum.internal.FixedWindowCallback, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        Window window = (Window) this.windowReference.get();
        GlobalRumMonitor.get(this.sdkCore).addAction(RumActionType.TAP, "", MapsKt__MapsKt.mutableMapOf(new Pair("action.target.classname", menuItem.getClass().getCanonicalName()), new Pair("action.target.resource_id", zzib.resourceIdName(window != null ? window.getContext() : null, menuItem.getItemId())), new Pair("action.target.title", menuItem.getTitle())));
        try {
            return this.wrappedCallback.onMenuItemSelected(i, menuItem);
        } catch (NullPointerException e) {
            this.logOrRethrowWrappedCallbackException(e);
            return true;
        }
    }
}
