package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gk implements defpackage.y61, defpackage.ro0 {
    public java.lang.Throwable P05cfTpS5W5L;
    public defpackage.jm QiMR8OkAhezm;
    public final defpackage.y61 WDYagTQQm9ns;
    public final defpackage.fk e6mdH7fiFuta;
    public final defpackage.ro0 oh71FJcDz6S2;

    public gk(defpackage.y61 y61Var) {
        defpackage.to0 to0Var = new defpackage.to0();
        y61Var.getClass();
        this.WDYagTQQm9ns = y61Var;
        this.oh71FJcDz6S2 = to0Var;
        this.e6mdH7fiFuta = new defpackage.fk(this);
    }

    @Override // defpackage.ro0
    public final java.lang.Object JhCgjQRTAOCT(defpackage.ll llVar) {
        return this.oh71FJcDz6S2.JhCgjQRTAOCT(llVar);
    }

    public final void QiMR8OkAhezm(java.lang.StringBuilder sb) {
        int i;
        if (this.QiMR8OkAhezm == null && this.P05cfTpS5W5L == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            defpackage.jm jmVar = this.QiMR8OkAhezm;
            if (jmVar != null) {
                sb.append("\t\tCoroutine: " + jmVar);
                sb.append('\n');
            }
            java.lang.Throwable th = this.P05cfTpS5W5L;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                java.lang.String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                java.util.Iterator it = defpackage.hf.GoIRkIe1iwj6(defpackage.tg1.GoIRkIe1iwj6(stringWriter2)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((java.lang.String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.e6mdH7fiFuta != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t\tPrepared Statement Cache Size: ");
            defpackage.fk fkVar = this.e6mdH7fiFuta;
            synchronized (fkVar.fWTAfUmVKrZq) {
                i = fkVar.JhCgjQRTAOCT;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.y61
    public final defpackage.a71 UmgHb6n58gfG(java.lang.String str) {
        str.getClass();
        defpackage.fk fkVar = this.e6mdH7fiFuta;
        if (fkVar == null) {
            return this.WDYagTQQm9ns.UmgHb6n58gfG(str);
        }
        java.lang.Object fWTAfUmVKrZq = fkVar.fWTAfUmVKrZq(str);
        fWTAfUmVKrZq.getClass();
        return new defpackage.ek((defpackage.a71) fWTAfUmVKrZq);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.fk fkVar = this.e6mdH7fiFuta;
        if (fkVar != null) {
            fkVar.oh71FJcDz6S2(-1);
        }
        this.WDYagTQQm9ns.close();
    }

    @Override // defpackage.y61
    public final boolean gUjdnLbkVAaA() {
        return this.WDYagTQQm9ns.gUjdnLbkVAaA();
    }

    @Override // defpackage.ro0
    public final void giKS3J6vZuNy(java.lang.Object obj) {
        this.oh71FJcDz6S2.giKS3J6vZuNy(null);
    }

    public final java.lang.String toString() {
        return this.WDYagTQQm9ns.toString();
    }
}
