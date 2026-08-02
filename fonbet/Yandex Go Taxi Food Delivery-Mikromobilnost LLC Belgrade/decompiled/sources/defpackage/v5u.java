package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.yandex.quark.js.event.b;
import com.yandex.quark.js.event.i;
import com.yandex.quark.platform.utils.directive.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;

/* loaded from: classes8.dex */
public final class v5u implements ifo {
    public final zwf0 a;
    public final gvc0 b;
    public final t830 c;

    public v5u(zwf0 zwf0Var, gvc0 gvc0Var, t830 t830Var) {
        this.a = zwf0Var;
        this.b = gvc0Var;
        this.c = t830Var;
    }

    @Override // defpackage.ifo
    public final boolean c(i iVar) {
        return iVar instanceof b;
    }

    @Override // defpackage.ifo
    public final Object g(i iVar, ContinuationImpl continuationImpl) {
        syj0 a;
        Object fnjVar;
        tdo tdoVar = (tdo) ((b) iVar).a();
        png b = tdoVar.b();
        t830 t830Var = this.c;
        ProtoAdapter<TDirective> protoAdapter = TDirective.ADAPTER;
        byte[] b2 = b.b();
        if (b2 != null) {
            a = jaa1.a(protoAdapter, b2).a(t5u.a);
        } else {
            String a2 = b.a();
            a = a2 != null ? t830Var.a(TDirective.class, a2).a(u5u.a) : new jyj0(yng.b);
        }
        if (!(a instanceof lyj0)) {
            if (a instanceof jyj0) {
                this.a.f("HandlePlatformDirectiveEventHandler", b64.l("Failed to decode directive ", tdoVar.c(), Extension.COLON_SPACE, ((zng) ((jyj0) a).a).a()));
                return zy11.a;
            }
            w511.b();
            return null;
        }
        syj0 a3 = a.a((TDirective) ((lyj0) a).a, this.c);
        if (a3 instanceof lyj0) {
            fnjVar = ((lyj0) a3).a;
        } else {
            if (!(a3 instanceof jyj0)) {
                w511.b();
                return null;
            }
            fnjVar = new fnj("{}");
        }
        gvc0 gvc0Var = this.b;
        String a4 = tdoVar.a();
        smj smjVar = new smj(tdoVar.c(), (gnj) fnjVar);
        synchronized (gvc0Var) {
            u28 u28Var = (u28) gvc0Var.c.get(new z28(a4));
            if (u28Var == null) {
                gvc0Var.a.e("PlatformCapabilityRegistry", "Drop unsupported directive " + dnj.a(smjVar.b()) + " for capability " + z28.a(a4));
            } else {
                u28Var.d().h(smjVar);
            }
        }
        return zy11.a;
    }
}
