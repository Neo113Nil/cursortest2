package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class i8u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8u b;

    public /* synthetic */ i8u(l8u l8uVar, int i) {
        this.a = i;
        this.b = l8uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                l8u l8uVar = this.b;
                return new i9u(l8uVar.d(), (d8u) l8uVar.m.getValue());
            case 1:
                l8u l8uVar2 = this.b;
                return new k8u(l8uVar2, l8uVar2.requireContext());
            case 2:
                l8u l8uVar3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(e4u.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                e4u e4uVar = (e4u) qdcVar.C(I);
                t requireActivity = l8uVar3.requireActivity();
                requireActivity.getClass();
                kxi d = l8uVar3.d();
                l13 l13Var = e4uVar.a;
                return new d8u((VideoClipActivity) requireActivity, (mza) l13Var.a.D(hag.I(mza.class), l13Var, l13Var.b), d);
            default:
                l8u l8uVar4 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(e4u.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                e4u e4uVar2 = (e4u) qdcVar2.C(I2);
                t requireActivity2 = l8uVar4.requireActivity();
                requireActivity2.getClass();
                fnb m = l8uVar4.g.m();
                l13 l13Var2 = e4uVar2.a;
                return new jvo(requireActivity2, m, (dk4) l13Var2.a.D(hag.I(dk4.class), l13Var2, l13Var2.b), ((oq7) l13Var2.a.D(hag.I(oq7.class), l13Var2, l13Var2.b)).a);
        }
    }
}
