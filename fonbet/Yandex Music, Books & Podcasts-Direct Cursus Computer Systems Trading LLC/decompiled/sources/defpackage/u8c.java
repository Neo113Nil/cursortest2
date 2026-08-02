package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class u8c extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ v8c s;
    public final /* synthetic */ lum t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8c(v8c v8cVar, lum lumVar, int i) {
        super(0);
        this.r = i;
        this.s = v8cVar;
        this.t = lumVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        bz2 bz2Var;
        bz2 bz2Var2;
        switch (this.r) {
            case 0:
                v8c v8cVar = this.s;
                lum lumVar = this.t;
                qzc qzcVar = v8c.i;
                if (qzc.c) {
                    t8c t8cVar = (t8c) v8cVar.g.get(lumVar);
                    i = t8cVar != null ? t8cVar.a : 0;
                    t8c t8cVar2 = (t8c) v8cVar.g.get(lumVar);
                    if (t8cVar2 != null) {
                        t8cVar2.a = i + 1;
                    }
                    v8cVar.c++;
                    if (!v8cVar.d && ((bz2Var2 = v8cVar.h) == null || !bz2Var2.b)) {
                        v8cVar.d = true;
                        v8cVar.e = new ci0((ujl) v8cVar.a.b);
                        bz2 bz2Var3 = v8cVar.h;
                        if (bz2Var3 != null) {
                            bz2Var3.K();
                        }
                    }
                } else {
                    synchronized (((cuk) qzcVar.b)) {
                        try {
                            t8c t8cVar3 = (t8c) v8cVar.g.get(lumVar);
                            i = t8cVar3 != null ? t8cVar3.a : 0;
                            t8c t8cVar4 = (t8c) v8cVar.g.get(lumVar);
                            if (t8cVar4 != null) {
                                t8cVar4.a = i + 1;
                            }
                            v8cVar.c++;
                            if (!v8cVar.d && ((bz2Var = v8cVar.h) == null || !bz2Var.b)) {
                                v8cVar.d = true;
                                v8cVar.e = new ci0((ujl) v8cVar.a.b);
                                bz2 bz2Var4 = v8cVar.h;
                                if (bz2Var4 != null) {
                                    bz2Var4.K();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return Unit.a;
            default:
                v8c v8cVar2 = this.s;
                lum lumVar2 = this.t;
                qzc qzcVar2 = v8c.i;
                if (qzc.c) {
                    t8c t8cVar5 = (t8c) v8cVar2.g.get(lumVar2);
                    int i2 = t8cVar5 != null ? t8cVar5.a : 0;
                    t8c t8cVar6 = (t8c) v8cVar2.g.get(lumVar2);
                    if (t8cVar6 != null) {
                        t8cVar6.a = Math.max(i2 - 1, 0);
                    }
                    v8cVar2.c = Math.max(v8cVar2.c - 1, 0);
                } else {
                    synchronized (((cuk) qzcVar2.b)) {
                        try {
                            t8c t8cVar7 = (t8c) v8cVar2.g.get(lumVar2);
                            int i3 = t8cVar7 != null ? t8cVar7.a : 0;
                            t8c t8cVar8 = (t8c) v8cVar2.g.get(lumVar2);
                            if (t8cVar8 != null) {
                                t8cVar8.a = Math.max(i3 - 1, 0);
                            }
                            v8cVar2.c = Math.max(v8cVar2.c - 1, 0);
                        } finally {
                        }
                    }
                }
                return Unit.a;
        }
    }
}
