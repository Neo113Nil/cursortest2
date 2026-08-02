package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.d;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class r230 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t230 b;
    public final /* synthetic */ l030 c;

    public /* synthetic */ r230(t230 t230Var, l030 l030Var, int i) {
        this.a = i;
        this.b = t230Var;
        this.c = l030Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        t230 t230Var = this.b;
        zy11 zy11Var = zy11.a;
        l030 l030Var = this.c;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f(t230Var.b, btsVar, qti.e), ua3.a.a(t230Var.x), ib51.a.a(t230Var.z)}, wwg.S(-214714035, true, new r230(t230Var, l030Var, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.b(t230Var.b, (ThemeStyle) f.a(t230Var.y.a, ThemeStyle.DEFAULT, null, btsVar2, 48, 2).getValue(), wwg.S(-539504107, true, new r230(t230Var, l030Var, i2), btsVar2), btsVar2, 392);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(848748670, true, new r230(t230Var, l030Var, 3), btsVar3), btsVar3, 6);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    t230 t230Var2 = this.b;
                    yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), t230Var2.w, 17);
                    rs31 a = f5z.a(btsVar4);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        d dVar = (d) ooc.G(qoi0.a(d.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                        oz40 b = f.b(dVar.A, btsVar4);
                        oz40 b2 = f.b(dVar.B, btsVar4);
                        oz40 b3 = f.b(dVar.C, btsVar4);
                        oz40 b4 = f.b(dVar.D, btsVar4);
                        t230Var2.c(l030Var.a instanceof xi8, (qkg) b.getValue(), (qkg) b2.getValue(), (qkg) b3.getValue(), ((u030) b4.getValue()).a, ((u030) b4.getValue()).b, l030Var.c, ((Number) f.b(t230Var2.A.b, btsVar4).getValue()).intValue(), btsVar4, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
