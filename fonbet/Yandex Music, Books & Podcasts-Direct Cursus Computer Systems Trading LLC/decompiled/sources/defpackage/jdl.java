package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.player.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljdl;", "Ljnb;", "<init>", "()V", "ddl", "player-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class jdl extends jnb {
    public static final ddl G;
    public static final /* synthetic */ s9f[] H;
    public int A;
    public ObjectAnimator B;
    public g1e C;
    public final ru2 D;
    public final gfo E;
    public float F;
    public final ybf j = new ybf(ern.a(grl.class), new idl(this, 0), new lvj(6, new cdl(this, 2)));
    public final cvo k = new cvo(wjb.PlayerScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf l = new ybf(ern.a(j4l.class), new idl(this, 1), new lvj(7, new aok(22)));
    public final kkl m;
    public final cjl n;
    public final boolean o;
    public final jyr p;
    public final jyr q;
    public ComposeView r;
    public BottomSheetBehavior s;
    public CoordinatorLayout t;
    public kub u;
    public final jyr v;
    public final rhp w;
    public final xdr x;
    public azr y;
    public int z;

    static {
        opi opiVar = new opi(jdl.class, "informersContainerHeightJob", "getInformersContainerHeightJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        H = new s9f[]{opiVar};
        G = new ddl();
    }

    public jdl() {
        l18 l18Var = l18.b;
        bdt I = hag.I(kkl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.m = (kkl) qdcVar.C(I);
        bdt I2 = hag.I(cjl.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.n = (cjl) qdcVar2.C(I2);
        bdt I3 = hag.I(byb.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        String b = ((tnq) ((byb) qdcVar3.C(I3)).c(ern.a(tnq.class))).b();
        boolean z = true;
        if (!Intrinsics.d(b, "on") && (!Intrinsics.d(b, "on_without_9_android") || Build.VERSION.SDK_INT == 28)) {
            z = false;
        }
        this.o = z;
        this.p = btf.b(new cdl(this, 3));
        this.q = btf.b(new cdl(this, 4));
        this.v = btf.b(new cdl(this, 5));
        this.w = new rhp();
        this.x = ydr.a(Float.valueOf(0.0f));
        this.D = new ru2(5, this);
        this.E = gfo.Player;
    }

    public static final void A(jdl jdlVar, float f) {
        ComposeView composeView = jdlVar.r;
        if (composeView == null) {
            return;
        }
        int height = composeView.getHeight();
        BottomSheetBehavior bottomSheetBehavior = jdlVar.s;
        if (bottomSheetBehavior == null) {
            Intrinsics.j("behavior");
            throw null;
        }
        int peekHeight = height - bottomSheetBehavior.getPeekHeight();
        if (composeView.getTop() <= peekHeight) {
            int height2 = composeView.getHeight() - composeView.getTop();
            BottomSheetBehavior bottomSheetBehavior2 = jdlVar.s;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.j("behavior");
                throw null;
            }
            peekHeight = height2 - bottomSheetBehavior2.getPeekHeight();
        }
        if (f == 0.0f) {
            BottomSheetBehavior bottomSheetBehavior3 = jdlVar.s;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.j("behavior");
                throw null;
            }
            if (bottomSheetBehavior3.getState() == 5) {
                return;
            }
        }
        ssd l = jdlVar.l();
        mjl mjlVar = l instanceof mjl ? (mjl) l : null;
        if (mjlVar != null) {
            ((a) mjlVar).E(peekHeight, f);
        }
        if (f > 0.0f) {
            ObjectAnimator objectAnimator = jdlVar.B;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            jdlVar.B = null;
        }
        if (jdlVar.F == 0.0f && f > 0.0f) {
            t1f t1fVar = jdlVar.B().s;
            xdr xdrVar = (xdr) t1fVar.d;
            z1h z1hVar = (z1h) t1fVar.b;
            if (z1hVar.a(((Boolean) xdrVar.getValue()).booleanValue())) {
                z1hVar.c(p2h.b);
            }
        }
        jdlVar.F = f;
    }

    public final grl B() {
        return (grl) this.j.getValue();
    }

    public final void D() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        lx7 i = ff7.i(context);
        E(i.L(((fle) this.v.getValue()).a(i)));
    }

    public final void E(int i) {
        int i2 = this.A;
        Parcelable parcelable = requireArguments().getParcelable("playerScreen:args");
        if (parcelable == null) {
            xq0.x("Required value was null.");
            return;
        }
        int i3 = i2 + ((v9l) parcelable).a + this.z + i;
        BottomSheetBehavior bottomSheetBehavior = this.s;
        if (bottomSheetBehavior == null) {
            Intrinsics.j("behavior");
            throw null;
        }
        if (bottomSheetBehavior.getPeekHeight() != i3 || i3 <= 0) {
            BottomSheetBehavior bottomSheetBehavior2 = this.s;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.j("behavior");
                throw null;
            }
            if (bottomSheetBehavior2.getState() != 2 || i3 <= 0) {
                BottomSheetBehavior bottomSheetBehavior3 = this.s;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.setPeekHeight(i3);
                    return;
                } else {
                    Intrinsics.j("behavior");
                    throw null;
                }
            }
            BottomSheetBehavior bottomSheetBehavior4 = this.s;
            if (bottomSheetBehavior4 != null) {
                bottomSheetBehavior4.addBottomSheetCallback(new xe3(6, this));
            } else {
                Intrinsics.j("behavior");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        getLifecycle().a(this.D);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        grl B = B();
        a9l a9lVar = (a9l) this.p.getValue();
        jvo jvoVar = (jvo) this.q.getValue();
        l13 l13Var = this.m.b;
        this.u = new kub(requireActivity, B, a9lVar, jvoVar, new fal((g64) l13Var.a(hag.I(g64.class)), (dk4) l13Var.a(hag.I(dk4.class))), wyf.F(getLifecycle()), (c2h) kkl.a().c, new msj(0, this.m, kkl.class, "isPlayerActionsDisabled", "isPlayerActionsDisabled()Z", 0, 10));
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(requireContext());
        this.t = coordinatorLayout;
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new wcj(10, composeView, this), 1378878514, true));
        this.r = composeView;
        xk6 xk6Var = new xk6(-1, -1);
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior(requireContext(), null);
        xk6Var.b(bottomSheetBehavior);
        this.s = bottomSheetBehavior;
        coordinatorLayout.addView(composeView, xk6Var);
        return coordinatorLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        this.w.d(H[0], null);
        this.r = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        getLifecycle().d(this.D);
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        super.onPause();
        grl B = B();
        xdr xdrVar = (xdr) B.z.d;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        nwh nwhVar = B.C;
        nwhVar.a = false;
        ((p9l) nwhVar.i).b();
        ((p2b) nwhVar.j).b();
        xdr xdrVar2 = this.n.b;
        aal aalVar = aal.c;
        xdrVar2.getClass();
        xdrVar2.m(null, aalVar);
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        grl B = B();
        xdr xdrVar = (xdr) B.z.d;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        nwh nwhVar = B.C;
        nwhVar.a = true;
        Object value = ((vdr) nwhVar.f).getValue();
        aal aalVar = aal.b;
        if (value == aalVar && ((Boolean) ((fkn) nwhVar.d).a.getValue()).booleanValue()) {
            if (((Boolean) ((vdr) nwhVar.e).getValue()).booleanValue()) {
                ((p9l) nwhVar.i).a();
            }
            if (((Boolean) ((vdr) nwhVar.b).getValue()).booleanValue()) {
                ((p2b) nwhVar.j).a();
            }
        }
        xdr xdrVar2 = this.n.b;
        BottomSheetBehavior bottomSheetBehavior = this.s;
        if (bottomSheetBehavior == null) {
            Intrinsics.j("behavior");
            throw null;
        }
        int state = bottomSheetBehavior.getState();
        if (state == 1) {
            aalVar = aal.d;
        } else if (state != 3) {
            aalVar = state != 4 ? aal.a : aal.c;
        }
        xdrVar2.getClass();
        xdrVar2.m(null, aalVar);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        azr azrVar;
        Window window;
        view.getClass();
        BottomSheetBehavior bottomSheetBehavior = this.s;
        Continuation continuation = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.j("behavior");
            throw null;
        }
        bottomSheetBehavior.addBottomSheetCallback(new gdl(this, view));
        ox6.B(this.x, wyf.F(getLifecycle()), new edl(this, 4));
        t l = l();
        if (l == null || (window = l.getWindow()) == null) {
            azrVar = null;
        } else {
            azrVar = new azr(l, window);
            BottomSheetBehavior bottomSheetBehavior2 = this.s;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.j("behavior");
                throw null;
            }
            bottomSheetBehavior2.addBottomSheetCallback(azrVar);
        }
        this.y = azrVar;
        Context requireContext = requireContext();
        requireContext.getClass();
        lx7 i = ff7.i(requireContext);
        this.A = i.L(zs4.b(i));
        D();
        uvg uvgVar = new uvg(25, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(view, uvgVar);
        ox6.B(B().E, wyf.F(getLifecycle()), new edl(this, 5));
        x0q x0qVar = B().F;
        nyf lifecycle = getLifecycle();
        lifecycle.getClass();
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Check failed.");
            return;
        }
        int i2 = 3;
        x97.y(wyf.F(lifecycle), null, null, new c5l(lifecycle, x0qVar, continuation, this, 2), 3);
        if (!this.o) {
            ox6.B(B().x, wyf.F(getLifecycle()), new edl(this, 6));
            kub kubVar = this.u;
            if (kubVar == null) {
                Intrinsics.j("expandedPlayerPresenter");
                throw null;
            }
            ox6.B(zsd.b0(new a1l(kubVar.m, 13)), wyf.F(getLifecycle()), new edl(this, 1));
            kub kubVar2 = this.u;
            if (kubVar2 == null) {
                Intrinsics.j("expandedPlayerPresenter");
                throw null;
            }
            ox6.B(kubVar2.o, wyf.F(getLifecycle()), new edl(this, 2));
        }
        ox6.B(this.n.e, wyf.F(getLifecycle()), new edl(this, i2));
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getE() {
        return this.E;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getK() {
        return this.k;
    }
}
