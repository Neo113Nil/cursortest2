package flex.feature.document.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import defpackage.bxl;
import defpackage.gfe;
import defpackage.h3m;
import defpackage.h5z0;
import defpackage.hk91;
import defpackage.i3y;
import defpackage.kr;
import defpackage.leh0;
import defpackage.q1i0;
import defpackage.sxl;
import defpackage.tls;
import defpackage.u1m;
import defpackage.wi91;
import defpackage.yta1;
import defpackage.ywl;
import defpackage.zr31;
import defpackage.zu;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH$¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ-\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0017¢\u0006\u0004\b(\u0010\u0004J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0004¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0004¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020-H\u0004¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020-H\u0004¢\u0006\u0004\b9\u00108R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\nR$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lflex/feature/document/fragment/DocumentDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lzu;", "<init>", "()V", "Lzy11;", "setupCancelableBehavior", "setupCancelOnTouchOutside", "Lflex/engine/a;", "createDocumentEngine", "()Lflex/engine/a;", "engine", "onDocumentEngineCreated", "(Lflex/engine/a;)V", "Lkotlin/Function1;", "callback", "setOnEngineReadyCallback", "(Ltls;)V", "removeOnEngineReadyCallback", "Lkr;", "action", "dispatchAction", "(Lkr;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "", "cancelable", "setCancelable", "(Z)V", "Lu1m;", "getDocumentQuery", "()Lu1m;", "Lywl;", "getDocument", "()Lywl;", "isFullscreen", "()Z", "isAnimated", "engine$delegate", "Li3y;", "getEngine", "engineReadyCallback", "Ltls;", "savedInstanceStateBundle", "Landroid/os/Bundle;", "Companion", "sxl", "flex-document-fragment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DocumentDialogFragment extends DialogFragment implements zu {
    private static final String ANIMATED_KEY = "animated";
    private static final int BUNDLE_CAPACITY = 4;
    public static final sxl Companion = new sxl();
    private static final String DOCUMENT_LABEL_KEY = "document_label";
    private static final String FULLSCREEN_KEY = "fullscreen";
    private static final String QUERY_KEY = "query";
    private static final String SAVED_DOCUMENT_STATE_BUNDLE_KEY = "document_state_bundle";

    /* renamed from: engine$delegate, reason: from kotlin metadata */
    private final i3y engine = a.a(new bxl(1, this));
    private tls engineReadyCallback;
    private Bundle savedInstanceStateBundle;

    /* JADX INFO: Access modifiers changed from: private */
    public static final flex.engine.a engine_delegate$lambda$1(DocumentDialogFragment documentDialogFragment) {
        flex.engine.a createDocumentEngine = documentDialogFragment.createDocumentEngine();
        if (createDocumentEngine != null) {
            createDocumentEngine.z(documentDialogFragment.savedInstanceStateBundle);
        }
        if (createDocumentEngine != null) {
            documentDialogFragment.onDocumentEngineCreated(createDocumentEngine);
        }
        return createDocumentEngine;
    }

    private final flex.engine.a getEngine() {
        return (flex.engine.a) this.engine.getValue();
    }

    private final void setupCancelOnTouchOutside() {
        Window window;
        View decorView;
        Dialog dialog = getDialog();
        View findViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(leh0.touch_outside);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
    }

    private final void setupCancelableBehavior() {
        setupCancelOnTouchOutside();
    }

    public abstract flex.engine.a createDocumentEngine();

    @Override // defpackage.zu
    public void dispatchAction(kr action) {
        flex.engine.a engine = getEngine();
        if (engine != null) {
            engine.k(action);
        }
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

    public final boolean isAnimated() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(ANIMATED_KEY, false);
        }
        return false;
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
        flex.engine.a engine = getEngine();
        if (isFullscreen()) {
            setStyle(0, q1i0.DocumentDialog_Fullscreen);
        }
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
        if (documentQuery != null) {
            flex.engine.a.q(engine, documentQuery, document, false, 4);
        } else if (document != null) {
            engine.B(document, null);
        } else {
            h5z0.a.d("There is no document or query", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        flex.engine.a engine;
        Dialog dialog;
        Window window;
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        setupCancelableBehavior();
        if (isAnimated() && (engine = getEngine()) != null && !engine.o() && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(q1i0.DocumentDialog_SlideBottomAnimation);
        }
        flex.engine.a engine2 = getEngine();
        if (engine2 != null) {
            engine2.g(frameLayout, getViewLifecycleOwner());
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

    public final void removeOnEngineReadyCallback() {
        this.engineReadyCallback = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        setupCancelableBehavior();
    }

    public final void setOnEngineReadyCallback(tls callback) {
        flex.engine.a engine = getEngine();
        if (engine == null || engine.j0) {
            this.engineReadyCallback = callback;
        } else {
            callback.invoke(engine);
        }
    }
}
