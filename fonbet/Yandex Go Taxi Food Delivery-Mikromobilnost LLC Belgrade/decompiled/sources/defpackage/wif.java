package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.squareup.moshi.Moshi;
import com.yandex.go.delivery.rental_duration_selector.DeliveryRentalDurationModalView;
import com.yandex.go.delivery.rental_duration_selector.e;
import com.yandex.go.delivery.sdd_slots_selector.DeliverySddIntervalsModalView;
import com.yandex.go.search.model.DecideLaterConfig;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.dashboard.internal.data.DashboardApi;
import com.ybsdk.feature.dashboard.internal.data.a;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import com.ybsdk.utils.poller.b;
import ru.yandex.taxi.delivery.interactors.m;
import ru.yandex.taxi.logistics.ndd_route_selector.view.filters.DeliveryFilterModalView;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.c;

/* loaded from: classes5.dex */
public final class wif implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public /* synthetic */ wif(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }

    public static wig a(fjg fjgVar, tw51 tw51Var) {
        fjgVar.getClass();
        xvf0 b = i5m.b(ddp0.a);
        int i = 26;
        oxf oxfVar = new oxf(tw51Var, i);
        srb srbVar = new srb(new ayf(tw51Var, 18), i);
        ayf ayfVar = new ayf(tw51Var, 17);
        ayf ayfVar2 = new ayf(tw51Var, 11);
        ayf ayfVar3 = new ayf(tw51Var, 8);
        ayf ayfVar4 = new ayf(tw51Var, 10);
        int i2 = 24;
        oxf oxfVar2 = new oxf(tw51Var, i2);
        epf epfVar = new epf(srbVar, ayfVar, ayfVar2, ayfVar3, ayfVar4, oxfVar2, new ayf(tw51Var, 22), 1);
        f2b f2bVar = new f2b(oxfVar, epfVar, oxfVar2, i2);
        ayf ayfVar5 = new ayf(tw51Var, 5);
        oxf oxfVar3 = new oxf(tw51Var, 29);
        ayf ayfVar6 = new ayf(tw51Var, 3);
        int i3 = 19;
        srb srbVar2 = new srb(new oxf(tw51Var, i3), 27);
        ayf ayfVar7 = new ayf(tw51Var, 2);
        ayf ayfVar8 = new ayf(tw51Var, 1);
        n3w a = n3w.a(tw51Var);
        kk kkVar = new kk(a, i3);
        oxf oxfVar4 = new oxf(tw51Var, 28);
        ayf ayfVar9 = new ayf(tw51Var, 21);
        ayf ayfVar10 = new ayf(tw51Var, 0);
        ayf ayfVar11 = new ayf(tw51Var, 7);
        kk kkVar2 = new kk(a, 20);
        ayf ayfVar12 = new ayf(tw51Var, 12);
        n3w a2 = n3w.a(new umg(new pzf(f2bVar, ayfVar5, oxfVar3, ayfVar6, srbVar2, ayfVar7, ayfVar8, kkVar, oxfVar4, ayfVar9, ayfVar10, ayfVar11, new ncb(ayfVar9, kkVar2, ayfVar8, ayfVar12, new oxf(tw51Var, 25), oxfVar, 10))));
        ayf ayfVar13 = new ayf(tw51Var, 16);
        ayf ayfVar14 = new ayf(tw51Var, 13);
        n3w a3 = n3w.a(new amg(new apf(epfVar, ayfVar8, ayfVar13, ayfVar14, 5)));
        kk kkVar3 = new kk(a, 18);
        ayf ayfVar15 = new ayf(tw51Var, 6);
        oxf oxfVar5 = new oxf(tw51Var, 27);
        ayf ayfVar16 = new ayf(tw51Var, 15);
        k4 k4Var = new k4(a2, a3, kkVar3, kkVar2, ayfVar8, ayfVar12, ayfVar9, ayfVar15, oxfVar5, ayfVar16, ayfVar8, 3);
        ayf ayfVar17 = new ayf(tw51Var, 9);
        wif wifVar = new wif((Object) srbVar, (xvf0) ayfVar3, 3);
        int i4 = 20;
        xvf0 b2 = i5m.b(new bpf(new wif((Object) srbVar, (xvf0) new ayf(tw51Var, 14), 1), new oxf(tw51Var, 21), new oxf(tw51Var, 22), new oxf(tw51Var, i4), 2));
        bpf bpfVar = new bpf((xvf0) ayfVar17, (xvf0) ayfVar7, (xvf0) wifVar, b2, 4, false);
        int i5 = 23;
        bpf bpfVar2 = new bpf(n3w.a(new eng(new ik0(bpfVar, new oxf(tw51Var, i5), ayfVar8, ayfVar13, ayfVar14, new ayf(tw51Var, i5), new ayf(tw51Var, 19), ayfVar5, srbVar2, oxfVar, new ayf(tw51Var, 4), ayfVar6, b2, oxfVar3, new ayf(tw51Var, i4), ayfVar10))), ayfVar16, ayfVar8, ayfVar9, 3);
        vcp0 vcp0Var = (vcp0) b.get();
        h9g h9gVar = (h9g) tw51Var;
        Moshi moshi = (Moshi) h9gVar.v.k.get();
        q5z.h(moshi);
        return new wig(vcp0Var, ImmutableMap.g("DashboardV4Info", new mlg(moshi, h9gVar.g())), ImmutableMap.j(DashboardV3Fragment.class, k4Var, DashboardFragment.class, bpfVar2));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        int i3 = 3;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                qif qifVar = (qif) ((xvf0) obj).get();
                ((peb) xvf0Var).get();
                return new vif(qifVar);
            case 1:
                return new a((DashboardApi) ((srb) obj).get(), (b) ((ayf) xvf0Var).get());
            case 2:
                return a((fjg) obj, (tw51) ((n3w) xvf0Var).a);
            case 3:
                return new com.ybsdk.feature.dashboard.internal.data.b((DashboardApi) ((srb) obj).get(), (fdr) ((ayf) xvf0Var).get());
            case 4:
                return new lxg((dqe0) ((xvf0) obj).get(), (b0j) ((c0j) xvf0Var).get());
            case 5:
                return new oxg((DecideLaterConfig) ((s51) xvf0Var).get(), (zuj0) ((xvf0) obj).get());
            case 6:
                return new xjg((AppAnalyticsReporter) ((ayf) obj).get(), (m501) ((ayf) xvf0Var).get(), false, i2);
            case 7:
                return new com.ybsdk.feature.change.payment.method.internal.domain.a((com.ybsdk.feature.change.payment.method.internal.repositories.a) ((xvf0) obj).get(), (b) ((oxf) xvf0Var).get());
            case 8:
                return new d800((ufb0) ((tzf) obj).get(), (w030) ((tzf) xvf0Var).get(), i2);
            case 9:
                bvh bvhVar = (bvh) ((n3w) obj).a;
                zuh zuhVar = (zuh) ((dyf) xvf0Var).get();
                wwf wwfVar = new wwf();
                wwfVar.a = bvhVar;
                wwfVar.b = zuhVar;
                wwfVar.c = bvf0.c(bvhVar.c);
                return wwfVar;
            case 10:
                return new zc((w030) ((xvf0) obj).get(), (q4g) ((qrb) xvf0Var).get(), i3);
            case 11:
                return new h1i((i130) ((fyf) obj).get(), ((fyf) xvf0Var).b.H);
            case 12:
                return new t1i((qcp0) ((iyf) obj).get(), (apf) ((bpf) xvf0Var).get());
            case 13:
                return new zc(5, (i130) ((xvf0) obj).get(), (abe) ((rwh) xvf0Var).get());
            case 14:
                return new ru.yandex.taxi.delivery.interactors.b((ru.yandex.taxi.delivery.interactors.a) ((o4f) obj).get(), (m) ((fyf) xvf0Var).get());
            case 15:
                return new j4i((jc00) ((ywf) obj).get(), (q5i) ((n3w) xvf0Var).a);
            case 16:
                return new ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.a((c) ((jyf) obj).get(), (com.yandex.delivery.utils.dialogmanager.a) ((can) xvf0Var).get());
            case 17:
                return new j0g((zch) ((rwh) obj).get(), (wiq0) ((lyf) xvf0Var).get());
            case 18:
                return new j0g((c) ((m1g) obj).get(), (p33) ((lk) xvf0Var).get());
            case 19:
                return new DeliveryFilterModalView((Context) ((l4g) obj).get(), (t9i) ((wif) xvf0Var).get());
            case 20:
                return new t9i((u9i) ((xvf0) obj).get(), (fi50) ((di20) xvf0Var).get());
            case 21:
                return new zc((w030) ((n4g) obj).get(), (DeliveryFilterModalView) ((wif) xvf0Var).get(), 6);
            case 22:
                return new iii((wwf) ((wrh) xvf0Var).get(), (i130) ((xvf0) obj).get());
            case 23:
                return new gmi((lx4) ((xvf0) obj).get(), (o61) ((rwh) xvf0Var).get());
            case 24:
                return new DeliveryRentalDurationModalView((Context) ((oyf) xvf0Var).get(), (e) ((xvf0) obj).get());
            case 25:
                return new dr7((w030) ((xvf0) obj).get(), (j4n) ((epf) xvf0Var).get(), i3);
            case 26:
                return new DeliverySddIntervalsModalView((Context) ((pyf) xvf0Var).get(), (com.yandex.go.delivery.sdd_slots_selector.a) ((xvf0) obj).get());
            case 27:
                return new woi((c4r0) ((n4g) obj).get(), (c8r) ((n4g) xvf0Var).get());
            case 28:
                return new j0g((vp21) ((c1g) obj).get(), (gsi) ((r2i) xvf0Var).get());
            default:
                return new ru.yandex.taxi.delivery.impl.badges.a((ru.yandex.taxi.logistics.payment_method_selector.requirement.a) ((e840) obj).get(), (ogi) ((pgi) xvf0Var).get());
        }
    }

    public /* synthetic */ wif(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }
}
