package defpackage;

import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import com.yandex.passport.api.g;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class mz2 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mz2(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        int i2 = 2;
        int i3 = R.drawable.ic_android_wave;
        Object[] objArr = 0;
        int i4 = 1;
        switch (i) {
            case 0:
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                ngg.H(ifpVar, "recently");
                return Unit.a;
            case 1:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                return Unit.a;
            case 2:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.B(opfVar, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 3:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.t(jfpVar2, "non_music_speakers_block");
                return Unit.a;
            case 4:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.t(jfpVar3, "non_music_total_duration_block");
                return Unit.a;
            case 5:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.t(jfpVar4, "non_music_explicit_block");
                return Unit.a;
            case 6:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.w(jfpVar5);
                wfp.x(jfpVar5, -2.0f);
                return Unit.a;
            case 7:
                u0j u0jVar = (u0j) obj;
                u0jVar.getClass();
                return Boolean.valueOf(u0jVar == u0j.a);
            case 8:
                cb3 cb3Var = (cb3) obj;
                cb3Var.getClass();
                if (cb3Var instanceof ya3) {
                    j = 0;
                } else if ((cb3Var instanceof ab3) || (cb3Var instanceof bb3)) {
                    j = 200;
                } else {
                    if (!Intrinsics.d(cb3Var, wa3.a)) {
                        b6e.s();
                        return null;
                    }
                    j = 2000;
                }
                return Long.valueOf(j);
            case 9:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.q(jfpVar6, 0);
                return Unit.a;
            case 10:
                vz1.e((o18) obj, yk.class).D(new mz2(11));
                return Unit.a;
            case 11:
                ((l13) obj).getClass();
                return new yk(new dl(0));
            case 12:
                sf3 sf3Var = (sf3) obj;
                sf3Var.getClass();
                if (sf3Var.b) {
                    i3 = R.drawable.ic_landing_default;
                } else if (!sf3Var.a) {
                    i3 = R.drawable.ic_android_home_default_test;
                }
                return Integer.valueOf(i3);
            case 13:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_my_music_test_default);
            case 14:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_my_music_test_active);
            case 15:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_wave);
            case 16:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_wave);
            case 17:
                sf3 sf3Var2 = (sf3) obj;
                sf3Var2.getClass();
                if (sf3Var2.b) {
                    i3 = R.drawable.ic_landing_active;
                } else if (!sf3Var2.a) {
                    i3 = R.drawable.ic_android_home_active_test;
                }
                return Integer.valueOf(i3);
            case 18:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_podcast_default);
            case 19:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_podcast_active);
            case 20:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_concerts_light_theme_default);
            case 21:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_concerts_light_theme_active);
            case 22:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_kid_default);
            case 23:
                ((sf3) obj).getClass();
                return Integer.valueOf(R.drawable.ic_android_kid_active);
            case 24:
                ((Integer) obj).intValue();
                int i5 = BottomsheetCollapsingTopBar.q;
                return Unit.a;
            case 25:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, bk3.class).E(new mz2(26));
                o18Var.b(hag.I(xrt.class)).E(new mz2(27));
                o18Var.b(hag.I(ok3.class)).E(new mz2(28));
                o18Var.b(hag.I(rk3.class)).E(new mz2(29));
                o18Var.b(hag.I(yj3.class)).E(new zj3(objArr == true ? 1 : 0));
                o18Var.b(hag.I(xj3.class)).E(new zj3(i4));
                o18Var.b(hag.I(jk3.class)).E(new zj3(i2));
                o18Var.b(hag.I(ik3.class)).E(new zj3(3));
                return Unit.a;
            case 26:
                ((l13) obj).getClass();
                return new bk3(1);
            case 27:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new xrt(l13Var.b(hag.I(dqi.class), true));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new ok3((g) l13Var2.a.D(hag.I(g.class), l13Var2, l13Var2.b));
            default:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I = hag.I(ok3.class);
                qdc qdcVar = l13Var3.a;
                Set set = l13Var3.b;
                return new rk3((ok3) qdcVar.D(I, l13Var3, set), (xrt) qdcVar.D(hag.I(xrt.class), l13Var3, set), new uf3(i2));
        }
    }
}
