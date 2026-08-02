package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class gvj {
    public final String a;
    public final lik b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public gvj(String str, lik likVar) {
        bjk bjkVar = bjk.a;
        this.a = str;
        this.b = likVar;
        final int i = 0;
        this.c = btf.b(new Function0(this, i) { // from class: fvj
            public final /* synthetic */ int a;
            public final /* synthetic */ gvj b;

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            {
                this.a = i;
                switch (i) {
                }
                bjk bjkVar2 = bjk.a;
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (this.a) {
                    case 0:
                        bjk bjkVar2 = bjk.b;
                        gvj gvjVar = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(njk.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        return new zhk(bjkVar2, gvjVar.b, btf.b(new s9j(29)));
                    default:
                        gvj gvjVar2 = this.b;
                        return new ey2(gvjVar2.a, bjk.b);
                }
            }
        });
        this.d = btf.b(new s9j(20));
        final int i2 = 1;
        this.e = btf.b(new Function0(this, i2) { // from class: fvj
            public final /* synthetic */ int a;
            public final /* synthetic */ gvj b;

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            {
                this.a = i2;
                switch (i2) {
                }
                bjk bjkVar2 = bjk.a;
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (this.a) {
                    case 0:
                        bjk bjkVar2 = bjk.b;
                        gvj gvjVar = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(njk.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        return new zhk(bjkVar2, gvjVar.b, btf.b(new s9j(29)));
                    default:
                        gvj gvjVar2 = this.b;
                        return new ey2(gvjVar2.a, bjk.b);
                }
            }
        });
    }

    public final void a(mkj mkjVar) {
        ((zhk) this.c.getValue()).e();
        if (mkjVar != null) {
            Iterator it = mkjVar.b.entrySet().iterator();
            while (it.hasNext()) {
                ((lkj) ((kkj) this.d.getValue())).b((bve) ((Map.Entry) it.next()).getValue());
            }
        }
    }
}
