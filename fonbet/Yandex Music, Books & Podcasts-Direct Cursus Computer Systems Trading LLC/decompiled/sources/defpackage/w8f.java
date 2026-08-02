package defpackage;

import androidx.fragment.app.y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class w8f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8f b;

    public /* synthetic */ w8f(x8f x8fVar, int i) {
        this.a = i;
        this.b = x8fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                x8f x8fVar = this.b;
                mqs mqsVar = x8fVar.l;
                if (mqsVar == null) {
                    Intrinsics.j("track");
                    throw null;
                }
                df3 df3Var = a4g.D(gys.NonMusicHolder, mqsVar) ? df3.EPISODE_BOTTOMSHEET : df3.TRACK_BOTTOMSHEET;
                ef3 ef3Var = ef3.b;
                ve veVar = x8fVar.m;
                if (veVar == null) {
                    Intrinsics.j("actionContext");
                    throw null;
                }
                ef3.g(ef3Var, veVar.a, df3Var, pe3.READ_MORE);
                x8fVar.dismissAllowingStateLoss();
                mqs mqsVar2 = x8fVar.l;
                if (mqsVar2 == null) {
                    Intrinsics.j("track");
                    throw null;
                }
                dy7 dy7Var = (dy7) x8fVar.r.getValue();
                kxi d = x8fVar.d();
                pu0 t = pd.t(new qzm[0]);
                y parentFragmentManager = x8fVar.getParentFragmentManager();
                parentFragmentManager.getClass();
                rre.a0(mqsVar2, dy7Var, d, t, parentFragmentManager, true);
                return Unit.a;
            default:
                BottomSheetBehavior bottomSheetBehavior = this.b.k;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                }
                return Unit.a;
        }
    }
}
