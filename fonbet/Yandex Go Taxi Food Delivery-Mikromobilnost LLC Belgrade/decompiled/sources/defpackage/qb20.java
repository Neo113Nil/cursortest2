package defpackage;

import com.squareup.wire.ProtoAdapter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import ru.yandex.alice.protos.endpoint.capabilities.js.TMetricaCapability;

/* loaded from: classes8.dex */
public final class qb20 implements bnj {
    public final zwf0 a;
    public final zq6 b;
    public final t830 c;
    public final Set w = Collections.singleton(new dnj("send_metrica_event"));

    public qb20(zq6 zq6Var, t830 t830Var, zwf0 zwf0Var) {
        this.a = zwf0Var;
        this.b = zq6Var;
        this.c = t830Var;
    }

    @Override // defpackage.bnj
    public final void h(smj smjVar) {
        syj0 a;
        if (jl40.l(smjVar.b(), "send_metrica_event")) {
            gnj c = smjVar.c();
            ProtoAdapter<TMetricaCapability.TSendMetricaEventDirective> protoAdapter = TMetricaCapability.TSendMetricaEventDirective.ADAPTER;
            if (c instanceof fnj) {
                a = this.c.a(TMetricaCapability.TSendMetricaEventDirective.class, ((fnj) c).a()).a(ob20.a);
            } else {
                if (!(c instanceof enj)) {
                    w511.b();
                    return;
                }
                a = jaa1.a(protoAdapter, ((enj) c).a()).a(pb20.a);
            }
            if (!(a instanceof lyj0)) {
                if (a instanceof jyj0) {
                    this.a.f("MetricaDirectiveHandler", b64.l("Fail to deserialize ", qoi0.a(c.getClass()).d(), " send metrica event directive: ", ((txg) ((jyj0) a).a).a()));
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            TMetricaCapability.TMetricaEvent event = ((TMetricaCapability.TSendMetricaEventDirective) ((lyj0) a).a).getEvent();
            if (event != null) {
                String name = event.getName();
                cbh cbhVar = null;
                if (name.length() <= 0) {
                    name = null;
                }
                if (name != null) {
                    Map<String, ?> body = event.getBody();
                    cbhVar = new cbh(name, body != null ? new JSONObject(body).toString() : null, 4);
                }
                if (cbhVar == null) {
                    return;
                }
                this.b.b(cbhVar);
            }
        }
    }

    @Override // defpackage.bnj
    public final Set m() {
        return this.w;
    }
}
