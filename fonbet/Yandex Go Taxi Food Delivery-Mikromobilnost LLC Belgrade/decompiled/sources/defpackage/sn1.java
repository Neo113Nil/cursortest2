package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.chargers.subscription.presentation.landing.c;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets.a;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;

/* loaded from: classes5.dex */
public final /* synthetic */ class sn1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ sn1(int i, int i2, List list) {
        this.a = i2;
        this.b = list;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int preserveStoriesOrder$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        List list = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.c(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                a.c(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                qib1.a(list, (fid) obj, vng.O(9));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                w691.b(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                c.g(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                spb1.d(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.cost_details.ui.a.d(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    btsVar.e0(-1711239497);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a.d((foj) it.next(), btsVar, 0);
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                pj91.c(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                spb1.c(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                k4b1.l(list, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                preserveStoriesOrder$lambda$0 = StoriesPreviewsListView.preserveStoriesOrder$lambda$0(list, (rpu0) obj, (rpu0) obj2);
                break;
            default:
                preserveStoriesOrder$lambda$0 = jl40.q(list.indexOf(((Story) obj).b), list.indexOf(((Story) obj2).b));
                break;
        }
        return Integer.valueOf(preserveStoriesOrder$lambda$0);
    }

    public /* synthetic */ sn1(List list, int i) {
        this.a = i;
        this.b = list;
    }
}
