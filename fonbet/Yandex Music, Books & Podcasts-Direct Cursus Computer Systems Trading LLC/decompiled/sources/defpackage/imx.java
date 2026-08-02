package defpackage;

/* loaded from: classes.dex */
public abstract class imx implements Cloneable {
    public final jmx a;
    public jmx b;

    public imx(jmx jmxVar) {
        this.a = jmxVar;
        if (jmxVar.h()) {
            xq0.x("Default instance must be immutable.");
            throw null;
        }
        this.b = (jmx) jmxVar.i(4, null);
    }

    public final jmx b() {
        boolean h = this.b.h();
        jmx jmxVar = this.b;
        if (h) {
            jmxVar.getClass();
            hnx.c.a(jmxVar.getClass()).a(jmxVar);
            jmxVar.e();
            jmxVar = this.b;
        }
        boolean z = true;
        byte byteValue = ((Byte) jmxVar.i(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean f = hnx.c.a(jmxVar.getClass()).f(jmxVar);
                jmxVar.i(2, true == f ? jmxVar : null);
                z = f;
            }
        }
        if (z) {
            return jmxVar;
        }
        throw new wp3("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void c() {
        if (this.b.h()) {
            return;
        }
        jmx jmxVar = (jmx) this.a.i(4, null);
        hnx.c.a(jmxVar.getClass()).d(jmxVar, this.b);
        this.b = jmxVar;
    }

    public final Object clone() {
        imx imxVar = (imx) this.a.i(5, null);
        boolean h = this.b.h();
        jmx jmxVar = this.b;
        if (h) {
            jmxVar.getClass();
            hnx.c.a(jmxVar.getClass()).a(jmxVar);
            jmxVar.e();
            jmxVar = this.b;
        }
        imxVar.b = jmxVar;
        return imxVar;
    }
}
