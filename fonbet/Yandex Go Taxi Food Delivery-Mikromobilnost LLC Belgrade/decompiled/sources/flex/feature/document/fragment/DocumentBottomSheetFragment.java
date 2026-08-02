package flex.feature.document.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.bxl;
import defpackage.cmi;
import defpackage.cxl;
import defpackage.dxl;
import defpackage.gfe;
import defpackage.h3m;
import defpackage.h5z0;
import defpackage.hk91;
import defpackage.i3y;
import defpackage.ivg;
import defpackage.je4;
import defpackage.jl40;
import defpackage.kr;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.q1i0;
import defpackage.rzo;
import defpackage.tls;
import defpackage.u1m;
import defpackage.ucs;
import defpackage.wi91;
import defpackage.yta1;
import defpackage.ywl;
import defpackage.zr31;
import defpackage.zu;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u001bH\u0017¢\u0006\u0004\b'\u0010\u001eJ!\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0017¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0011\u00106\u001a\u0004\u0018\u000105H\u0004¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0004¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000201H\u0004¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000201H\u0004¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u000201H\u0004¢\u0006\u0004\b>\u0010<J\u000f\u0010?\u001a\u000201H\u0004¢\u0006\u0004\b?\u0010<J\u000f\u0010A\u001a\u00020@H\u0004¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u000201H\u0004¢\u0006\u0004\bC\u0010<J\u000f\u0010D\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010\u0005J\u0017\u0010E\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bE\u00104J\u0017\u0010F\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bF\u00104J\u000f\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010\u0005J\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010L2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bM\u0010NR\u001d\u0010\t\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\bR$\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010T\u001a\u0002018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bT\u0010<\"\u0004\bV\u00104R\u0018\u0010W\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Lflex/feature/document/fragment/DocumentBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lzu;", "Lucs;", "<init>", "()V", "Lflex/engine/a;", "createDocumentEngine", "()Lflex/engine/a;", "engine", "Lzy11;", "onDocumentEngineCreated", "(Lflex/engine/a;)V", "Lkotlin/Function1;", "callback", "setOnEngineReadyCallback", "(Ltls;)V", "removeOnEngineReadyCallback", "onBackStackChanged", "Lkr;", "action", "dispatchAction", "(Lkr;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "onDetach", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "", "cancelable", "setCancelable", "(Z)V", "Lu1m;", "getDocumentQuery", "()Lu1m;", "Lywl;", "getDocument", "()Lywl;", "isFullscreen", "()Z", "isCloseOnTapOutside", "isCloseOnSlideDown", "isDimBackground", "", "getDefaultHeight", "()F", "shouldLoadByQuery", "setupCancelableBehavior", "setupCancelOnTouchOutside", "setupCancelOnSlideDown", "setupDefaultHeight", "", "peekHeight", "setupPeekHeight", "(I)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getBottomSheetBehavior", "(Landroid/content/DialogInterface;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "engine$delegate", "Li3y;", "getEngine", "engineReadyCallback", "Ltls;", "isFocused", "Z", "setFocused", "savedInstanceStateBundle", "Landroid/os/Bundle;", "Companion", "cxl", "flex-document-fragment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DocumentBottomSheetFragment extends BottomSheetDialogFragment implements zu, ucs {
    private static final int BUNDLE_CAPACITY = 6;
    private static final String CLOSE_ON_SLIDE_DOWN_KEY = "close_on_slide_down";
    private static final String CLOSE_ON_TAP_OUTSIDE_KEY = "close_on_tap_outside";
    public static final cxl Companion = new cxl();
    private static final String DEFAULT_HEIGHT_KEY = "default_height";
    private static final String DIM_BACKGROUND_KEY = "dim_background";
    private static final String DOCUMENT_LABEL_KEY = "document_label";
    private static final String FULLSCREEN_KEY = "fullscreen";
    private static final String QUERY_KEY = "query";
    private static final String SAVED_DOCUMENT_STATE_BUNDLE_KEY = "document_state_bundle";
    private static final String SHOULD_LOAD_BY_QUERY = "should_load_by_query";

    /* renamed from: engine$delegate, reason: from kotlin metadata */
    private final i3y engine = a.b(LazyThreadSafetyMode.NONE, new bxl(0, this));
    private tls engineReadyCallback;
    private boolean isFocused;
    private Bundle savedInstanceStateBundle;

    /* JADX INFO: Access modifiers changed from: private */
    public static final flex.engine.a engine_delegate$lambda$1(DocumentBottomSheetFragment documentBottomSheetFragment) {
        flex.engine.a createDocumentEngine = documentBottomSheetFragment.createDocumentEngine();
        if (createDocumentEngine != null) {
            createDocumentEngine.z(documentBottomSheetFragment.savedInstanceStateBundle);
        }
        if (createDocumentEngine != null) {
            documentBottomSheetFragment.onDocumentEngineCreated(createDocumentEngine);
        }
        return createDocumentEngine;
    }

    private final BottomSheetBehavior<View> getBottomSheetBehavior(DialogInterface dialog) {
        View findViewById = ((BottomSheetDialog) dialog).findViewById(leh0.design_bottom_sheet);
        if (findViewById != null) {
            return BottomSheetBehavior.D(findViewById);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final flex.engine.a getEngine() {
        return (flex.engine.a) this.engine.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$6$lambda$4(DocumentBottomSheetFragment documentBottomSheetFragment, DialogInterface dialogInterface) {
        BottomSheetBehavior<View> bottomSheetBehavior = documentBottomSheetFragment.getBottomSheetBehavior(dialogInterface);
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.W(3);
        }
    }

    private final void setupCancelOnSlideDown(boolean cancelable) {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        View findViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(leh0.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior.D(findViewById).T(cancelable);
        }
    }

    private final void setupCancelOnTouchOutside(boolean cancelable) {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        View findViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(leh0.touch_outside);
        if (cancelable) {
            if (findViewById != null) {
                findViewById.setOnClickListener(new cmi(9, this));
            }
        } else if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCancelOnTouchOutside$lambda$9(DocumentBottomSheetFragment documentBottomSheetFragment, View view) {
        Dialog dialog;
        Dialog dialog2 = documentBottomSheetFragment.getDialog();
        if (dialog2 == null || !dialog2.isShowing() || (dialog = documentBottomSheetFragment.getDialog()) == null) {
            return;
        }
        dialog.cancel();
    }

    private final void setupCancelableBehavior() {
        setupCancelOnTouchOutside(isCloseOnTapOutside());
        setupCancelOnSlideDown(isCloseOnSlideDown());
    }

    private final void setupDefaultHeight() {
        int i = rzo.r(getDefaultHeight()).w;
        if (i > 0) {
            setupPeekHeight(i);
        }
    }

    private final void setupPeekHeight(int peekHeight) {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        View findViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(leh0.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior.D(findViewById).V(peekHeight, false);
        }
    }

    public abstract flex.engine.a createDocumentEngine();

    @Override // defpackage.zu
    public void dispatchAction(kr action) {
        flex.engine.a engine = getEngine();
        if (engine != null) {
            engine.k(action);
        }
    }

    public final float getDefaultHeight() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getFloat(DEFAULT_HEIGHT_KEY, 0.0f);
        }
        return 0.0f;
    }

    public final ywl getDocument() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(DOCUMENT_LABEL_KEY) : null;
        if (string != null) {
            return (ywl) h3m.b.a.get(string);
        }
        return null;
    }

    public final u1m getDocumentQuery() {
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle(QUERY_KEY) : null;
        if (bundle != null) {
            return hk91.e(bundle);
        }
        return null;
    }

    public final boolean isCloseOnSlideDown() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(CLOSE_ON_SLIDE_DOWN_KEY, false);
        }
        return false;
    }

    public final boolean isCloseOnTapOutside() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(CLOSE_ON_TAP_OUTSIDE_KEY, false);
        }
        return false;
    }

    public final boolean isDimBackground() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(DIM_BACKGROUND_KEY, false);
        }
        return false;
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final boolean isFullscreen() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(FULLSCREEN_KEY, false);
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
    }

    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(je4 je4Var) {
    }

    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // defpackage.ucs
    public void onBackStackChanged() {
        flex.engine.a engine;
        if (isStateSaved()) {
            return;
        }
        boolean l = jl40.l(kotlin.collections.a.b0(getParentFragmentManager().c.f()), this);
        this.isFocused = l;
        if (!l || (engine = getEngine()) == null) {
            return;
        }
        if (engine.j0) {
            ny61.r("Can't trim document after destroy");
        } else if (engine.k0) {
            engine.w(false);
            engine.k0 = false;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        gfe gfeVar;
        flex.engine.a engine = getEngine();
        if (engine == null || (gfeVar = engine.f0) == null) {
            return;
        }
        gfeVar.c();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceStateBundle = savedInstanceState;
        if (isDimBackground()) {
            setStyle(1, q1i0.DocumentBottomSheet_Dimmed);
        } else {
            setStyle(1, q1i0.DocumentBottomSheet_Transparent);
        }
        getParentFragmentManager().o.add(this);
        flex.engine.a engine = getEngine();
        if (engine == null) {
            h5z0.a.d("Engine is null, check if arguments are correct", new Object[0]);
            return;
        }
        u1m documentQuery = getDocumentQuery();
        zr31 d = wi91.d(this, documentQuery);
        engine.r(d.a, savedInstanceState != null, d.b);
        if (engine.o()) {
            return;
        }
        ywl document = getDocument();
        if (documentQuery != null && shouldLoadByQuery()) {
            flex.engine.a.q(engine, documentQuery, document, false, 4);
        } else if (document != null) {
            engine.B(document, null);
        } else {
            h5z0.a.d("There is no document or query", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Dialog dialog;
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        setupCancelableBehavior();
        if (isFullscreen() && (dialog = getDialog()) != null) {
            dialog.setOnShowListener(new ivg(this, 1));
        }
        Dialog dialog2 = getDialog();
        KeyEvent.Callback findViewById = dialog2 != null ? dialog2.findViewById(leh0.design_bottom_sheet) : null;
        FrameLayout frameLayout2 = findViewById instanceof FrameLayout ? (FrameLayout) findViewById : null;
        if (frameLayout2 != null) {
            BottomSheetBehavior.D(frameLayout2).v(new dxl(this));
        }
        flex.engine.a engine = getEngine();
        if (engine != null) {
            engine.g(frameLayout, getViewLifecycleOwner());
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Bundle arguments;
        String string;
        super.onDestroy();
        flex.engine.a engine = getEngine();
        if (engine != null) {
            engine.i();
        }
        if (!yta1.b(this) || (arguments = getArguments()) == null || (string = arguments.getString(DOCUMENT_LABEL_KEY)) == null) {
            return;
        }
        h3m.b.a(string);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        getParentFragmentManager().o.remove(this);
        super.onDetach();
    }

    public void onDocumentEngineCreated(flex.engine.a engine) {
        tls tlsVar = this.engineReadyCallback;
        if (tlsVar != null) {
            tlsVar.invoke(engine);
            this.engineReadyCallback = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        flex.engine.a engine;
        super.onSaveInstanceState(outState);
        if (getParentFragment() == null || (engine = getEngine()) == null) {
            return;
        }
        outState.putBundle(SAVED_DOCUMENT_STATE_BUNDLE_KEY, engine.A());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupDefaultHeight();
    }

    public final void removeOnEngineReadyCallback() {
        this.engineReadyCallback = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        setupCancelableBehavior();
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    public final void setOnEngineReadyCallback(tls callback) {
        flex.engine.a engine = getEngine();
        if (engine == null || engine.j0) {
            this.engineReadyCallback = callback;
        } else {
            callback.invoke(engine);
        }
    }

    public final boolean shouldLoadByQuery() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(SHOULD_LOAD_BY_QUERY, false);
        }
        return false;
    }
}
