package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ long i;
    public final /* synthetic */ b0 v;

    public /* synthetic */ a(x xVar, String str, long j, int i) {
        this.d = i;
        this.e = str;
        this.i = j;
        this.v = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x xVar = (x) this.v;
                String str = (String) this.e;
                xVar.r();
                com.gamericefishpro.space.v8.c0.d(str);
                com.gamericefishpro.space.t.e eVar = xVar.i;
                boolean zIsEmpty = eVar.isEmpty();
                long j = this.i;
                if (zIsEmpty) {
                    xVar.v = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.i < 100) {
                    eVar.put(str, 1);
                    xVar.e.put(str, Long.valueOf(j));
                } else {
                    v0 v0Var = ((r1) xVar.d).y;
                    r1.l(v0Var);
                    v0Var.B.a("Too many ads visible");
                }
                break;
            case 1:
                x xVar2 = (x) this.v;
                String str2 = (String) this.e;
                r1 r1Var = (r1) xVar2.d;
                xVar2.r();
                com.gamericefishpro.space.v8.c0.d(str2);
                com.gamericefishpro.space.t.e eVar2 = xVar2.i;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    e3 e3Var = r1Var.E;
                    v0 v0Var3 = r1Var.y;
                    r1.k(e3Var);
                    b3 b3VarX = e3Var.x(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        com.gamericefishpro.space.t.e eVar3 = xVar2.e;
                        Long l = (Long) eVar3.get(str2);
                        long j2 = this.i;
                        if (l == null) {
                            r1.l(v0Var3);
                            v0Var3.y.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j2 - l.longValue();
                            eVar3.remove(str2);
                            xVar2.w(str2, jLongValue, b3VarX);
                        }
                        if (eVar2.isEmpty()) {
                            long j3 = xVar2.v;
                            if (j3 != 0) {
                                xVar2.v(j2 - j3, b3VarX);
                                xVar2.v = 0L;
                            } else {
                                r1.l(v0Var3);
                                v0Var3.y.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                e3 e3Var2 = (e3) this.v;
                e3Var2.v((b3) this.e, false, this.i);
                e3Var2.w = null;
                o3 o3VarO = ((r1) e3Var2.d).o();
                o3VarO.r();
                o3VarO.s();
                o3VarO.F(new com.gamericefishpro.space.va.a(o3VarO, (b3) null));
                break;
        }
    }

    public a(e3 e3Var, b3 b3Var, long j) {
        this.d = 2;
        this.e = b3Var;
        this.i = j;
        Objects.requireNonNull(e3Var);
        this.v = e3Var;
    }
}
