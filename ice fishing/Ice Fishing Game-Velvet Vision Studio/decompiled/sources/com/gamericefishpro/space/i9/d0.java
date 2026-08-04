package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final com.gamericefishpro.space.u6.i a;
    public com.gamericefishpro.space.u6.n b;
    public final com.gamericefishpro.space.a8.c c;
    public final t d;

    public d0() {
        com.gamericefishpro.space.u6.i iVar = new com.gamericefishpro.space.u6.i(3);
        this.a = iVar;
        this.b = ((com.gamericefishpro.space.u6.n) iVar.b).e();
        this.c = new com.gamericefishpro.space.a8.c(13);
        this.d = new t(3);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: com.gamericefishpro.space.i9.a
            public final /* synthetic */ d0 e;

            {
                this.e = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return new h4(this.e.c);
                    default:
                        return new h4(this.e.d);
                }
            }
        };
        v5 v5Var = (v5) iVar.d;
        ((HashMap) v5Var.d).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) v5Var.d).put("internal.eventLogger", new Callable(this) { // from class: com.gamericefishpro.space.i9.a
            public final /* synthetic */ d0 e;

            {
                this.e = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return new h4(this.e.c);
                    default:
                        return new h4(this.e.d);
                }
            }
        });
    }

    public final boolean a(b bVar) throws p0 {
        com.gamericefishpro.space.a8.c cVar = this.c;
        try {
            cVar.e = bVar;
            cVar.i = bVar.clone();
            ((ArrayList) cVar.v).clear();
            ((com.gamericefishpro.space.u6.n) this.a.c).h("runtime.counter", new g(Double.valueOf(0.0d)));
            this.d.d(this.b.e(), cVar);
            return (((b) cVar.i).equals((b) cVar.e) && ((ArrayList) cVar.v).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new p0(th);
        }
    }

    public final void b(u3 u3Var) {
        h hVar;
        try {
            com.gamericefishpro.space.u6.i iVar = this.a;
            this.b = ((com.gamericefishpro.space.u6.n) iVar.b).e();
            if (iVar.g(this.b, (v3[]) u3Var.p().toArray(new v3[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (t3 t3Var : u3Var.q().p()) {
                List listQ = t3Var.q();
                String strP = t3Var.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    n nVarG = iVar.g(this.b, (v3) it.next());
                    if (!(nVarG instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    com.gamericefishpro.space.u6.n nVar = this.b;
                    if (nVar.g(strP)) {
                        n nVarJ = nVar.j(strP);
                        if (!(nVarJ instanceof h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        hVar = (h) nVarJ;
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    hVar.a(this.b, Collections.singletonList(nVarG));
                }
            }
        } catch (Throwable th) {
            throw new p0(th);
        }
    }
}
