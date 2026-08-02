package defpackage;

import com.connectsdk.service.DeviceService;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class mun implements df, tqg {
    public final ri7 a;
    public final tf6 b;
    public final g06 c = new g06(fsg.b(mun.class.getSimpleName()));

    public mun(ri7 ri7Var, tf6 tf6Var) {
        this.a = ri7Var;
        this.b = tf6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(mun munVar, jun junVar, dn9 dn9Var, cg6 cg6Var) {
        lun lunVar;
        int i;
        oun ounVar;
        StackTraceElement stackTraceElement;
        String str;
        if (cg6Var instanceof lun) {
            lunVar = (lun) cg6Var;
            int i2 = lunVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lunVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lunVar.l;
                nm6 nm6Var = nm6.a;
                i = lunVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ri7 ri7Var = (ri7) ywf.L(munVar, munVar.a);
                    pg pgVar = junVar.a;
                    q2a q2aVar = (q2a) dn9Var.b;
                    lunVar.j = junVar;
                    lunVar.k = dn9Var;
                    lunVar.n = 1;
                    obj = ri7Var.b(pgVar, q2aVar, lunVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dn9Var = lunVar.k;
                    junVar = lunVar.j;
                    qgg.h0(obj);
                }
                ounVar = (oun) obj;
                if (!(ounVar instanceof t7c)) {
                    f0q f0qVar = ((z2a) dn9Var.c).a;
                    t7c t7cVar = (t7c) ounVar;
                    f0q f0qVar2 = t7cVar.c;
                    String str2 = junVar.a.a;
                    f0q f0qVar3 = f0q.b;
                    f0q y = asq.y(t75.c(new zzt(dfi.n("documentQueryPath", str2))));
                    if (f0qVar2 != null) {
                        f0qVar = f0qVar.a(f0qVar2);
                    }
                    xv.F((ldi) ywf.L(munVar, (ldi) dn9Var.d), t7cVar.a, new z2a(f0qVar.a(y)));
                } else {
                    if (!(ounVar instanceof s3o)) {
                        b6e.s();
                        return null;
                    }
                    xv.F((ldi) ywf.L(munVar, (ldi) dn9Var.d), junVar.b, (z2a) dn9Var.c);
                    g06 g06Var = munVar.c;
                    jyr a = fsg.a(fsg.d(((s3o) ounVar).a.getMessage(), DeviceService.KEY_DESC));
                    c5b c5bVar = c5b.a;
                    htb htbVar = ((thc) g06Var.c).a;
                    boolean booleanValue = Boolean.FALSE.booleanValue();
                    vhc vhcVar = vhc.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        Integer num = new Integer(stackTraceElement.getLineNumber());
                        Integer num2 = num.intValue() > 0 ? num : null;
                        if (num2 == null || (str = num2.toString()) == null) {
                            str = "No line info";
                        }
                        vhcVar = new vhc(fileName, methodName, str);
                    }
                    g06Var.N(yhc.DEBUG, "Got failed response while dispatching remote action", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                }
                return Unit.a;
            }
        }
        lunVar = new lun(munVar, cg6Var);
        Object obj2 = lunVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lunVar.n;
        if (i != 0) {
        }
        ounVar = (oun) obj2;
        if (!(ounVar instanceof t7c)) {
        }
        return Unit.a;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.c;
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        x97.y(this.b, null, null, new kun(this, (jun) mdVar, dn9Var, null, 0), 3);
    }
}
