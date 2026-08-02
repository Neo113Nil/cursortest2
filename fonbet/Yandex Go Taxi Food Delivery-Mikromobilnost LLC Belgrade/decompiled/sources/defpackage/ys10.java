package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.tariffcard.interactor.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlinx.coroutines.flow.e;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.domain.a;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.masstransit.di.b;
import ru.yandex.taxi.masstransit.paymentcards.d;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class ys10 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ ys10(v7p v7pVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = v7pVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        boolean z = false;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new xs10((Activity) xvf0Var2.get(), (su10) ((br10) xvf0Var).get());
            case 1:
                return new a((u6u0) ((gxf) xvf0Var2).get(), (dci) ((gxf) xvf0Var).get());
            case 2:
                return new ru.yandex.taxi.logistics.sdk.mission_details.data.a(i5m.a(xvf0Var2), (tj20) ((di20) xvf0Var).get());
            case 3:
                return new k130((String) ((n3w) xvf0Var2).a, (o5s) ((p3g) xvf0Var).get());
            case 4:
                return new aoi((w3i) ((bo2) xvf0Var).get(), new lvn(), new mvn());
            case 5:
                return new a930((s411) ((ibz0) xvf0Var2).get(), (c) ((b3g) xvf0Var).get());
            case 6:
                d dVar = (d) ((cfw0) xvf0Var).get();
                dVar.a(new b(e.d(((tu30) xvf0Var2.get()).b)));
                return dVar;
            case 7:
                ((d701) xvf0Var2).get();
                return new dj30((b611) ((jqz0) xvf0Var).get());
            case 8:
                return new ru.yandex.taxi.masstransit.mapper.b((zuj0) ((v3g) xvf0Var2).get(), (ru.yandex.taxi.masstransit.mapper.a) ((ci3) xvf0Var).get());
            case 9:
                return new fp30((gyc) ((e3g) xvf0Var2).get(), (ah00) ((f3g) xvf0Var).get());
            case 10:
                return new ru.yandex.taxi.masstransit.mapper.e((Context) ((u3g) xvf0Var2).get(), (ru.yandex.taxi.masstransit.mapper.d) ((i020) xvf0Var).get());
            case 11:
                return new j540((wnt) ((u3g) xvf0Var).get(), (dne0) ((v3g) xvf0Var2).get());
            case 12:
                return new f((rz0) ((q02) xvf0Var).get(), (c) xvf0Var2.get());
            case 13:
                return new com.yandex.go.navigator.driving.experiment.d((rqo) xvf0Var2.get(), (com.yandex.go.navigator.utils.a) ((zfa) xvf0Var).get());
            case 14:
                return new re50((ya50) ((x0z) xvf0Var).get(), (mf50) xvf0Var2.get());
            case 15:
                return new oh50((ji50) ((n3w) xvf0Var2).a, (qh50) ((ys10) xvf0Var).get());
            case 16:
                return new qh50((k) ((n4g) xvf0Var2).get(), (zuj0) ((n4g) xvf0Var).get());
            case 17:
                return new ai50((wiq0) ((n4g) xvf0Var2).get(), (lx4) ((l4g) xvf0Var).get());
            case 18:
                return new ci50((atd0) ((n4g) xvf0Var2).get(), (li50) ((ge50) xvf0Var).get());
            case 19:
                return new com.yandex.fintechsdk.core.nfc.impl.internal.a((agt) ((t160) xvf0Var).get(), (z22) xvf0Var2.get());
            case 20:
                return new ht10((Context) ((exf) xvf0Var2).get(), (fza0) ((exf) xvf0Var).get(), z, 17);
            case 21:
                return new ht10((lg5) ((twf) xvf0Var2).get(), (sae) ((p6f) xvf0Var).get(), z, 19);
            case 22:
                return new bf70((mg11) xvf0Var2, (xea) xvf0Var);
            case 23:
                return new gi70((com.yandex.go.taxi.order.bubble.b) ((jc50) xvf0Var).get(), (ah00) xvf0Var2.get());
            case 24:
                return new ht10((gzh) xvf0Var2.get(), (yj70) ((lq40) xvf0Var).get(), z, 22);
            case 25:
                smp smpVar = (smp) ((o4g) xvf0Var2).get();
                Set set = (Set) ((y2r0) xvf0Var).get();
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i231) it.next()).create());
                }
                c231[] c231VarArr = (c231[]) arrayList.toArray(new c231[0]);
                com.yandex.div.core.expression.variables.a a = smpVar.a();
                a.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                return a;
            case 26:
                return new dv70((ev70) ((o4g) xvf0Var2).get(), (xu70) ((n3w) xvf0Var).a);
            case 27:
                return new sx70((x770) ((f870) xvf0Var2).get(), (xl10) ((aos) xvf0Var).get());
            case 28:
                return new zy70((com.yandex.go.taxi.order.provider.a) ((zyf) xvf0Var2).get(), (dr00) ((zyf) xvf0Var).get());
            default:
                return new com.yandex.fintechsdk.data.payment.impl.internal.order.a((d180) xvf0Var2.get(), (com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.a) ((zi60) xvf0Var).get());
        }
    }

    public /* synthetic */ ys10(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
