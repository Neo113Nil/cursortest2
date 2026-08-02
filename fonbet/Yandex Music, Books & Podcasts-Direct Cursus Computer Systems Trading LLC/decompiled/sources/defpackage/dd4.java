package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class dd4 {
    public final Context a;
    public final qne b;
    public final y8p c;
    public final vy7 d;
    public final jyr e;
    public final jyr f;

    public dd4(Context context, qne qneVar, y8p y8pVar, vy7 vy7Var) {
        y8pVar.getClass();
        vy7Var.getClass();
        this.a = context;
        this.b = qneVar;
        this.c = y8pVar;
        this.d = vy7Var;
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: cd4
            public final /* synthetic */ dd4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new pzc(this.b.b);
                    default:
                        return new fwd("client", new v5(17, this.b));
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: cd4
            public final /* synthetic */ dd4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new pzc(this.b.b);
                    default:
                        return new fwd("client", new v5(17, this.b));
                }
            }
        });
    }

    public final zd0 a(String str, c9n c9nVar, fwd fwdVar) {
        str.getClass();
        dfw dfwVar = (dfw) this.b.b;
        ssg.a(4, "GRPC.ChannelProvider", "construct channel for " + str + ", okHttpChannelLibSsl=" + dfwVar.invoke(), null);
        Executor u = u2x.u(dm6.b);
        List w = xz0.w(new ho4[]{(pzc) this.e.getValue(), (fwd) this.f.getValue(), fwdVar});
        boolean booleanValue = ((Boolean) dfwVar.invoke()).booleanValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Context context = this.a;
        if (!booleanValue) {
            ae0 ae0Var = new ae0(str);
            ae0Var.b = context;
            hoj hojVar = ae0Var.a;
            hojVar.g = 1;
            hojVar.C(u);
            hojVar.L(u);
            if (c9nVar != null) {
                hojVar.k0(c9nVar.b);
                long j = c9nVar.c;
                hojVar.getClass();
                o2g.J("keepalive timeout must be positive", j > 0);
                long nanos = timeUnit.toNanos(j);
                hojVar.i = nanos;
                hojVar.i = Math.max(nanos, 10000000L);
            }
            hojVar.I(w);
            return (zd0) ae0Var.k();
        }
        hoj hojVar2 = new hoj(str);
        hojVar2.g = 1;
        l13 l13Var = this.d.a;
        hojVar2.e = new mxf(new nxf(((i0j) l13Var.a.D(hag.I(i0j.class), l13Var, l13Var.b)).d));
        hojVar2.g = 1;
        hojVar2.C(u);
        hojVar2.L(u);
        if (c9nVar != null) {
            hojVar2.k0(c9nVar.b);
            long j2 = c9nVar.c;
            o2g.J("keepalive timeout must be positive", j2 > 0);
            long nanos2 = timeUnit.toNanos(j2);
            hojVar2.i = nanos2;
            hojVar2.i = Math.max(nanos2, 10000000L);
        }
        ae0 ae0Var2 = new ae0(hojVar2);
        ae0Var2.b = context;
        hojVar2.I(w);
        return (zd0) ae0Var2.k();
    }
}
