package defpackage;

import android.content.res.Resources;
import androidx.fragment.app.t;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class cdl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jdl b;

    public /* synthetic */ cdl(jdl jdlVar, int i) {
        this.a = i;
        this.b = jdlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        upl uplVar;
        switch (this.a) {
            case 0:
                jdl jdlVar = this.b;
                BottomSheetBehavior bottomSheetBehavior = jdlVar.s;
                if (bottomSheetBehavior == null) {
                    Intrinsics.j("behavior");
                    throw null;
                }
                if (bottomSheetBehavior.getState() == 3) {
                    BottomSheetBehavior bottomSheetBehavior2 = jdlVar.s;
                    if (bottomSheetBehavior2 == null) {
                        Intrinsics.j("behavior");
                        throw null;
                    }
                    bottomSheetBehavior2.setState(4);
                }
                return Unit.a;
            case 1:
                jdl jdlVar2 = this.b;
                ddl ddlVar = jdl.G;
                mwk G = jdlVar2.B().G();
                if (G == null || (uplVar = (upl) dag.p(G, new vpl())) == null) {
                    uplVar = upl.a;
                }
                int ordinal = uplVar.ordinal();
                if (ordinal == 0) {
                    BottomSheetBehavior bottomSheetBehavior3 = jdlVar2.s;
                    if (bottomSheetBehavior3 == null) {
                        Intrinsics.j("behavior");
                        throw null;
                    }
                    if (bottomSheetBehavior3.getState() == 4) {
                        BottomSheetBehavior bottomSheetBehavior4 = jdlVar2.s;
                        if (bottomSheetBehavior4 == null) {
                            Intrinsics.j("behavior");
                            throw null;
                        }
                        if (bottomSheetBehavior4.isDraggable()) {
                            jdlVar2.B().C.f();
                            BottomSheetBehavior bottomSheetBehavior5 = jdlVar2.s;
                            if (bottomSheetBehavior5 == null) {
                                Intrinsics.j("behavior");
                                throw null;
                            }
                            bottomSheetBehavior5.setState(3);
                        }
                    }
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    t tVar = ((a9l) jdlVar2.p.getValue()).a;
                    jyr jyrVar = VideoClipActivity.y;
                    tVar.startActivity(l3l.e(tVar, null, 6));
                }
                return Unit.a;
            case 2:
                jdl jdlVar3 = this.b;
                ddl ddlVar2 = jdl.G;
                Resources resources = jdlVar3.requireContext().getApplicationContext().getResources();
                resources.getClass();
                fnb m = jdlVar3.g.m();
                l18 l18Var = l18.b;
                bdt I = hag.I(u3h.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new grl(m, resources, (u3h) qdcVar.C(I));
            case 3:
                jdl jdlVar4 = this.b;
                kkl kklVar = jdlVar4.m;
                t requireActivity = jdlVar4.requireActivity();
                requireActivity.getClass();
                kxi d = jdlVar4.d();
                kklVar.getClass();
                return new a9l(requireActivity, d);
            case 4:
                jdl jdlVar5 = this.b;
                kkl kklVar2 = jdlVar5.m;
                t requireActivity2 = jdlVar5.requireActivity();
                requireActivity2.getClass();
                kxi d2 = jdlVar5.d();
                kklVar2.getClass();
                l13 l13Var = kklVar2.b;
                bdt I2 = hag.I(dk4.class);
                qdc qdcVar2 = l13Var.a;
                Set set = l13Var.b;
                return new jvo(requireActivity2, d2.a, (dk4) qdcVar2.D(I2, l13Var, set), ((oq7) l13Var.a.D(hag.I(oq7.class), l13Var, set)).a);
            default:
                jdl jdlVar6 = this.b;
                ddl ddlVar3 = jdl.G;
                return new fle(wke.a, jdlVar6.n.c, wyf.F(jdlVar6.getLifecycle()));
        }
    }
}
