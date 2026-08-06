package defpackage;

/* loaded from: classes.dex */
public final class ei implements defpackage.i31, defpackage.im0 {
    public defpackage.lj AARZUJiTa;
    public java.lang.Throwable EXtogiMhuM;
    public final defpackage.i31 adDC3e2L;
    public final defpackage.di riuEU0zW4;
    public final defpackage.im0 xiZrDbcSW0;

    public ei(defpackage.i31 i31Var) {
        defpackage.km0 km0Var = new defpackage.km0();
        i31Var.getClass();
        this.adDC3e2L = i31Var;
        this.xiZrDbcSW0 = km0Var;
        this.riuEU0zW4 = new defpackage.di(this);
    }

    public final void AARZUJiTa(java.lang.StringBuilder sb) {
        int i;
        if (this.AARZUJiTa == null && this.EXtogiMhuM == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            defpackage.lj ljVar = this.AARZUJiTa;
            if (ljVar != null) {
                sb.append("\t\tCoroutine: " + ljVar);
                sb.append('\n');
            }
            java.lang.Throwable th = this.EXtogiMhuM;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                java.lang.String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                java.util.Iterator it = defpackage.td.mL9sMlGfef(defpackage.rc1.CGXpA9s3RjIa(stringWriter2)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((java.lang.String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.riuEU0zW4 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t\tPrepared Statement Cache Size: ");
            defpackage.di diVar = this.riuEU0zW4;
            synchronized (diVar.r1MBDhnF) {
                i = diVar.F7NU4MC0GW;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.im0
    public final java.lang.Object F7NU4MC0GW(defpackage.fj fjVar) {
        return this.xiZrDbcSW0.F7NU4MC0GW(fjVar);
    }

    @Override // defpackage.i31
    public final boolean SyNS6RMn() {
        return this.adDC3e2L.SyNS6RMn();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.di diVar = this.riuEU0zW4;
        if (diVar != null) {
            diVar.adDC3e2L(-1);
        }
        this.adDC3e2L.close();
    }

    @Override // defpackage.i31
    public final defpackage.k31 nBH8hAHy(java.lang.String str) {
        str.getClass();
        defpackage.di diVar = this.riuEU0zW4;
        if (diVar == null) {
            return this.adDC3e2L.nBH8hAHy(str);
        }
        java.lang.Object r1MBDhnF = diVar.r1MBDhnF(str);
        r1MBDhnF.getClass();
        return new defpackage.ci((defpackage.k31) r1MBDhnF);
    }

    @Override // defpackage.im0
    public final void oh6vYeIP(java.lang.Object obj) {
        this.xiZrDbcSW0.oh6vYeIP(null);
    }

    public final java.lang.String toString() {
        return this.adDC3e2L.toString();
    }
}
