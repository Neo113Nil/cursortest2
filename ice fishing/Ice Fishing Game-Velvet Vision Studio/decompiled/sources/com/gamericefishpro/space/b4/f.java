package com.gamericefishpro.space.b4;

import android.net.Uri;
import com.gamericefishpro.space.c3.p;
import com.gamericefishpro.space.i9.k4;
import com.gamericefishpro.space.z.e1;
import com.gamericefishpro.space.z.q1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.a2.a {
    public boolean d;
    public final Object e;

    public f(Uri uri, boolean z, boolean z2) {
        this.e = uri;
        this.d = z;
    }

    @Override // com.gamericefishpro.space.a2.a
    public long H(int i, long j, long j2) {
        if (!this.d) {
            return 0L;
        }
        q1 q1Var = (q1) this.e;
        if (q1Var.a.b()) {
            return 0L;
        }
        return q1Var.h(q1Var.d(q1Var.a.e(q1Var.d(q1Var.g(j2)))));
    }

    public boolean a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public boolean b(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        e eVar = (e) this.e;
        if (eVar == null) {
            return a();
        }
        eVar.getClass();
        char c = 0;
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            f fVar = g.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return a();
        }
        return false;
    }

    public k4 c(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        Object obj = k4.g;
        return new k4(this, str, lValueOf, 0);
    }

    public k4 d(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = k4.g;
        return new k4(this, str, boolValueOf, 1);
    }

    public k4 e(String str, String str2) {
        Object obj = k4.g;
        return new k4(this, str, str2, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.a2.a
    public Object k(long j, long j2, com.gamericefishpro.space.th.a aVar) {
        e1 e1Var;
        long jD;
        if (aVar instanceof e1) {
            e1Var = (e1) aVar;
            int i = e1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                e1Var.v = i - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, (com.gamericefishpro.space.vh.c) aVar);
            }
        } else {
            e1Var = new e1(this, (com.gamericefishpro.space.vh.c) aVar);
        }
        Object objA = e1Var.e;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = e1Var.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objA);
            jD = 0;
            if (this.d) {
                q1 q1Var = (q1) this.e;
                if (!q1Var.i) {
                    e1Var.d = j2;
                    e1Var.v = 1;
                    objA = q1Var.a(j2, e1Var);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                }
                jD = p.d(j2, jD);
            }
            return new p(jD);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = e1Var.d;
        com.gamericefishpro.space.wa.b.P(objA);
        jD = ((p) objA).a;
        jD = p.d(j2, jD);
        return new p(jD);
    }

    public /* synthetic */ f(Object obj, boolean z) {
        this.e = obj;
        this.d = z;
    }

    public f(e eVar, boolean z) {
        this.e = eVar;
        this.d = z;
    }
}
