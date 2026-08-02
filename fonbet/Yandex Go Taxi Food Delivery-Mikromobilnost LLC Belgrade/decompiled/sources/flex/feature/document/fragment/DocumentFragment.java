package flex.feature.document.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import defpackage.a0m;
import defpackage.ck91;
import defpackage.h3m;
import defpackage.h5z0;
import defpackage.hk91;
import defpackage.i3y;
import defpackage.je4;
import defpackage.jl40;
import defpackage.kr;
import defpackage.ny61;
import defpackage.ryl;
import defpackage.sls;
import defpackage.tls;
import defpackage.u1m;
import defpackage.ucs;
import defpackage.wi91;
import defpackage.yta1;
import defpackage.ywl;
import defpackage.zr31;
import defpackage.zu;
import flex.engine.a;
import flex.feature.document.fragment.DocumentFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH$¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001eH\u0017¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J-\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\u0011H\u0014¢\u0006\u0004\b1\u0010\u0005J\u0011\u00102\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0004¢\u0006\u0004\b5\u00106R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u00103R\u001d\u0010\t\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bD\u0010\u000f\"\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lflex/feature/document/fragment/DocumentFragment;", "Landroidx/fragment/app/Fragment;", "Lzu;", "Lucs;", "<init>", "()V", "Lu1m;", DocumentFragment.QUERY_KEY, "", "documentLabel", "Lflex/engine/a;", "createDocumentEngine", "(Lu1m;Ljava/lang/String;)Lflex/engine/a;", "", "shouldLoadDocument", "()Z", "engine", "Lzy11;", "onDocumentEngineCreated", "(Lflex/engine/a;)V", "Lkotlin/Function1;", "callback", "setOnEngineReadyCallback", "(Ltls;)V", "removeOnEngineReadyCallback", "onBackStackChanged", "Lkr;", "action", "dispatchAction", "(Lkr;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "onDetach", "destroyEngine", "getDocumentQuery", "()Lu1m;", "Lywl;", "getDocument", "()Lywl;", "query$delegate", "Li3y;", "getQuery", "documentLabel$delegate", "getDocumentLabel", "()Ljava/lang/String;", "_engine", "Lflex/engine/a;", "engineReadyCallback", "Ltls;", "engine$delegate", "getEngine", "()Lflex/engine/a;", "isFocused", "Z", "setFocused", "(Z)V", "savedInstanceStateBundle", "Landroid/os/Bundle;", "Companion", "a0m", "flex-document-fragment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DocumentFragment extends Fragment implements zu, ucs {
    private static final int BUNDLE_CAPACITY = 2;
    public static final a0m Companion = new a0m();
    private static final String DOCUMENT_LABEL_KEY = "document_label";
    private static final String QUERY_KEY = "query";
    private static final String SAVED_DOCUMENT_STATE_BUNDLE_KEY = "document_state_bundle";
    private a _engine;

    /* renamed from: documentLabel$delegate, reason: from kotlin metadata */
    private final i3y documentLabel;

    /* renamed from: engine$delegate, reason: from kotlin metadata */
    private final i3y engine;
    private tls engineReadyCallback;
    private boolean isFocused;

    /* renamed from: query$delegate, reason: from kotlin metadata */
    private final i3y query;
    private Bundle savedInstanceStateBundle;

    public DocumentFragment() {
        final int i = 0;
        this.query = kotlin.a.a(new sls(this) { // from class: zzl
            public final /* synthetic */ DocumentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                u1m query_delegate$lambda$1;
                String documentLabel_delegate$lambda$2;
                a engine_delegate$lambda$4;
                int i2 = i;
                DocumentFragment documentFragment = this.b;
                switch (i2) {
                    case 0:
                        query_delegate$lambda$1 = DocumentFragment.query_delegate$lambda$1(documentFragment);
                        return query_delegate$lambda$1;
                    case 1:
                        documentLabel_delegate$lambda$2 = DocumentFragment.documentLabel_delegate$lambda$2(documentFragment);
                        return documentLabel_delegate$lambda$2;
                    default:
                        engine_delegate$lambda$4 = DocumentFragment.engine_delegate$lambda$4(documentFragment);
                        return engine_delegate$lambda$4;
                }
            }
        });
        final int i2 = 1;
        this.documentLabel = kotlin.a.a(new sls(this) { // from class: zzl
            public final /* synthetic */ DocumentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                u1m query_delegate$lambda$1;
                String documentLabel_delegate$lambda$2;
                a engine_delegate$lambda$4;
                int i22 = i2;
                DocumentFragment documentFragment = this.b;
                switch (i22) {
                    case 0:
                        query_delegate$lambda$1 = DocumentFragment.query_delegate$lambda$1(documentFragment);
                        return query_delegate$lambda$1;
                    case 1:
                        documentLabel_delegate$lambda$2 = DocumentFragment.documentLabel_delegate$lambda$2(documentFragment);
                        return documentLabel_delegate$lambda$2;
                    default:
                        engine_delegate$lambda$4 = DocumentFragment.engine_delegate$lambda$4(documentFragment);
                        return engine_delegate$lambda$4;
                }
            }
        });
        final int i3 = 2;
        this.engine = kotlin.a.a(new sls(this) { // from class: zzl
            public final /* synthetic */ DocumentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                u1m query_delegate$lambda$1;
                String documentLabel_delegate$lambda$2;
                a engine_delegate$lambda$4;
                int i22 = i3;
                DocumentFragment documentFragment = this.b;
                switch (i22) {
                    case 0:
                        query_delegate$lambda$1 = DocumentFragment.query_delegate$lambda$1(documentFragment);
                        return query_delegate$lambda$1;
                    case 1:
                        documentLabel_delegate$lambda$2 = DocumentFragment.documentLabel_delegate$lambda$2(documentFragment);
                        return documentLabel_delegate$lambda$2;
                    default:
                        engine_delegate$lambda$4 = DocumentFragment.engine_delegate$lambda$4(documentFragment);
                        return engine_delegate$lambda$4;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String documentLabel_delegate$lambda$2(DocumentFragment documentFragment) {
        Bundle arguments = documentFragment.getArguments();
        if (arguments != null) {
            return arguments.getString(DOCUMENT_LABEL_KEY);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a engine_delegate$lambda$4(DocumentFragment documentFragment) {
        a aVar = documentFragment._engine;
        if (aVar == null || aVar.j0) {
            a createDocumentEngine = documentFragment.createDocumentEngine(documentFragment.getQuery(), documentFragment.getDocumentLabel());
            if (createDocumentEngine != null) {
                createDocumentEngine.z(documentFragment.savedInstanceStateBundle);
            }
            documentFragment._engine = createDocumentEngine;
            if (createDocumentEngine != null) {
                documentFragment.onDocumentEngineCreated(createDocumentEngine);
            }
        }
        return documentFragment._engine;
    }

    private final String getDocumentLabel() {
        return (String) this.documentLabel.getValue();
    }

    private final u1m getQuery() {
        return (u1m) this.query.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1m query_delegate$lambda$1(DocumentFragment documentFragment) {
        Bundle bundle;
        Bundle arguments = documentFragment.getArguments();
        if (arguments == null || (bundle = arguments.getBundle(QUERY_KEY)) == null) {
            return null;
        }
        return hk91.e(bundle);
    }

    public abstract a createDocumentEngine(u1m query, String documentLabel);

    public void destroyEngine() {
        String string;
        a engine = getEngine();
        if (engine != null) {
            engine.i();
        }
        if (yta1.b(this)) {
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString(DOCUMENT_LABEL_KEY)) != null) {
                h3m.b.a(string);
            }
            u1m documentQuery = getDocumentQuery();
            if (documentQuery != null) {
                i3y i3yVar = ryl.c;
                ck91.b().c(documentQuery);
            }
        }
    }

    @Override // defpackage.zu
    public void dispatchAction(kr action) {
        a engine = getEngine();
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

    public final a getEngine() {
        return (a) this.engine.getValue();
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(je4 je4Var) {
    }

    @Override // defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // defpackage.ucs
    public void onBackStackChanged() {
        a engine;
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceStateBundle = savedInstanceState;
        a engine = getEngine();
        getParentFragmentManager().o.add(this);
        if (engine == null) {
            h5z0.a.d("Engine is null, check if arguments are correct", new Object[0]);
            return;
        }
        u1m documentQuery = getDocumentQuery();
        zr31 d = wi91.d(this, documentQuery);
        engine.r(d.a, savedInstanceState != null, d.b);
        if (!shouldLoadDocument() || engine.o()) {
            return;
        }
        ywl document = getDocument();
        if (documentQuery != null) {
            if (engine.q0) {
                return;
            }
            a.q(engine, documentQuery, document, false, 4);
        } else if (document != null) {
            engine.B(document, null);
        } else {
            h5z0.a.d("There is no document or query", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        a engine = getEngine();
        if (engine != null) {
            engine.g(frameLayout, getViewLifecycleOwner());
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        removeOnEngineReadyCallback();
        destroyEngine();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        getParentFragmentManager().o.remove(this);
        super.onDetach();
    }

    public void onDocumentEngineCreated(a engine) {
        tls tlsVar = this.engineReadyCallback;
        if (tlsVar != null) {
            tlsVar.invoke(engine);
            this.engineReadyCallback = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        a aVar;
        super.onSaveInstanceState(outState);
        if (getParentFragment() == null || (aVar = this._engine) == null) {
            return;
        }
        outState.putBundle(SAVED_DOCUMENT_STATE_BUNDLE_KEY, aVar.A());
    }

    public final void removeOnEngineReadyCallback() {
        this.engineReadyCallback = null;
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    public final void setOnEngineReadyCallback(tls callback) {
        a aVar = this._engine;
        if (aVar == null || aVar.j0) {
            this.engineReadyCallback = callback;
        } else {
            callback.invoke(aVar);
        }
    }

    public boolean shouldLoadDocument() {
        return true;
    }
}
