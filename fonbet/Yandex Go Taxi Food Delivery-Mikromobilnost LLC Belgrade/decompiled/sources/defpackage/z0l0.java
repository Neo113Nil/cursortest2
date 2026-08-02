package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.semantics.f;
import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import com.yandex.go.navigator.main_screen.n;
import com.yandex.go.navigator.main_screen.o;
import com.yandex.go.safety.center.l;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final /* synthetic */ class z0l0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ z0l0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 9;
        char c = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((c1l0) obj).o1();
                break;
            case 1:
                o oVar = ((n) obj).a;
                oVar.P.e = true;
                oVar.S(null);
                break;
            case 2:
                o oVar2 = ((n) obj).a;
                oVar2.P.e = true;
                oVar2.S(null);
                break;
            case 3:
                break;
            case 4:
                float f = a5l0.a;
                break;
            case 5:
                w610 w610Var = (w610) obj;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                f.d((mnq0) obj);
                break;
            case 10:
                wvw wvwVar = (wvw) obj;
                switch (wvwVar.a) {
                    case 0:
                        zsa zsaVar = (zsa) wvwVar.b;
                        zsaVar.r(new qu(i2));
                        ((vvw) zsaVar.F).invoke();
                        break;
                    default:
                        zsa zsaVar2 = (zsa) wvwVar.b;
                        zsaVar2.r(new qu(i2));
                        ((sls) zsaVar2.F).invoke();
                        break;
                }
            case 11:
                ((wvw) obj).n1();
                break;
            case 12:
                ((wvw) obj).n1();
                break;
            case 13:
                ((nal0) obj).g();
                break;
            case 14:
                wij wijVar = (wij) obj;
                break;
            case 15:
                ((ig50) obj).a.r(new ej40(20));
                break;
            case 16:
                f.d((mnq0) obj);
                break;
            case 17:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nzs.s(listItemComponent, -1, -2);
                listItemComponent.inflateTrailView(fuh0.route_stop_trail_icons);
                listItemComponent.setTitleTextSizePx(tje.u(16, listItemComponent.getContext()));
                break;
            case 18:
                break;
            case 19:
                l lVar = ((rtl0) ((oql0) obj)).a;
                itl0 itl0Var = (itl0) lVar.x;
                if (itl0Var != null) {
                    lVar.P(itl0Var);
                    break;
                }
                break;
            case 20:
                l lVar2 = ((utl0) obj).a;
                lVar2.z((m950) lVar2.I.get(), new vtl0(lVar2));
                break;
            case 21:
                l lVar3 = ((vtl0) obj).a;
                itl0 itl0Var2 = (itl0) lVar3.x;
                if (itl0Var2 != null) {
                    lVar3.A((m950) lVar3.K.get(), itl0Var2, new ptl0(lVar3, c == true ? 1 : 0));
                    break;
                }
                break;
            case 22:
                jst.e.k((Throwable) obj, "Failed to send sos (safetycenter) information");
                break;
            case 23:
                hyl0 hyl0Var = (hyl0) obj;
                jyl0 jyl0Var = hyl0Var.a;
                SafetyNewbiesVerificationExperiment safetyNewbiesVerificationExperiment = hyl0Var.b;
                SafetyNewbiesVerificationExperiment.PhotoStep photoStep = safetyNewbiesVerificationExperiment.e;
                if (photoStep != null) {
                    jyl0Var.A((m950) jyl0Var.F.get(), new gxl0(photoStep, safetyNewbiesVerificationExperiment.c), new iyl0(jyl0Var, safetyNewbiesVerificationExperiment));
                    break;
                } else {
                    jyl0Var.r(new qu(i2));
                    break;
                }
            case 24:
                ((hxl0) obj).a.r(new z0l0(25));
                break;
            case 25:
                ((iyl0) obj).a.r(new qu(i2));
                break;
            case 26:
                ((iyl0) obj).a.r(new qu(i2));
                break;
            case 27:
                ixl0 ixl0Var = (ixl0) obj;
                ixl0Var.a.P(ixl0Var.b);
                break;
            case 28:
                ((ixl0) obj).a.r(new z0l0(26));
                break;
            default:
                pe0 pe0Var = (pe0) obj;
                pe0Var.a.Q(pe0Var.b);
                break;
        }
        return zy11Var;
    }
}
