package defpackage;

import com.yandex.go.navigator.driving.analytics.a;
import com.yandex.go.navigator.driving.experiment.d;
import com.yandex.go.navigator.gas_stations.experiment.c;
import defpackage.ipv;
import defpackage.zjm;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class zjm {
    public final c a;
    public final ipv b;
    public final com.yandex.go.navigator.share.experiment.c c;
    public final d d;
    public final re50 e;
    public final a f;
    public final r0 g = bvf0.c(new imm(true));
    public final i3y h = kotlin.a.a(new sls() { // from class: com.yandex.go.navigator.driving.e
        @Override // defpackage.sls
        public final Object invoke() {
            zjm zjmVar = zjm.this;
            com.yandex.go.navigator.gas_stations.experiment.c cVar = zjmVar.a;
            com.yandex.go.navigator.gas_stations.experiment.b bVar = new com.yandex.go.navigator.gas_stations.experiment.b(cVar.b, cVar);
            ipv ipvVar = zjmVar.b;
            com.yandex.go.navigator.incidents.experiment.c cVar2 = new com.yandex.go.navigator.incidents.experiment.c(ipvVar.b, ipvVar);
            com.yandex.go.navigator.share.experiment.c cVar3 = zjmVar.c;
            return new kotlinx.coroutines.flow.m0(kotlinx.coroutines.flow.e.m(bVar, cVar2, new com.yandex.go.navigator.share.experiment.b(cVar3.d, cVar3), zjmVar.d.b, new DrivingModalContentRepository$buttonsExperimentsFlow$1(zjmVar, null)), zjmVar.g, new DrivingModalContentRepository$drivingModalContentFlow$2$1(3, null));
        }
    });

    public zjm(c cVar, ipv ipvVar, com.yandex.go.navigator.share.experiment.c cVar2, d dVar, re50 re50Var, a aVar) {
        this.a = cVar;
        this.b = ipvVar;
        this.c = cVar2;
        this.d = dVar;
        this.e = re50Var;
        this.f = aVar;
    }
}
