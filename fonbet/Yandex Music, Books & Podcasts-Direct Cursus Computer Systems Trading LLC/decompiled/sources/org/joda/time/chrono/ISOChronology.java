package org.joda.time.chrono;

import defpackage.aun;
import defpackage.d2a;
import defpackage.rk4;
import defpackage.tq1;
import defpackage.w9e;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class ISOChronology extends AssembledChronology {
    public static final ISOChronology J;
    public static final ConcurrentHashMap K;
    private static final long serialVersionUID = -6212696554273812441L;

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;
        public transient DateTimeZone a;

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.a = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.V(this.a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.a);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        K = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.L0, null);
        J = iSOChronology;
        concurrentHashMap.put(DateTimeZone.a, iSOChronology);
    }

    public static ISOChronology U() {
        return V(DateTimeZone.e());
    }

    public static ISOChronology V(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.e();
        }
        ConcurrentHashMap concurrentHashMap = K;
        ISOChronology iSOChronology = (ISOChronology) concurrentHashMap.get(dateTimeZone);
        if (iSOChronology == null) {
            iSOChronology = new ISOChronology(ZonedChronology.X(J, dateTimeZone), null);
            ISOChronology iSOChronology2 = (ISOChronology) concurrentHashMap.putIfAbsent(dateTimeZone, iSOChronology);
            if (iSOChronology2 != null) {
                return iSOChronology2;
            }
        }
        return iSOChronology;
    }

    private Object writeReplace() {
        DateTimeZone k = k();
        Stub stub = new Stub();
        stub.a = k;
        return stub;
    }

    @Override // org.joda.time.chrono.AssembledChronology, defpackage.rk4
    public final rk4 H() {
        return J;
    }

    @Override // defpackage.rk4
    public final rk4 I(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.e();
        }
        return dateTimeZone == k() ? this : V(dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public final void N(tq1 tq1Var) {
        if (P().k() == DateTimeZone.a) {
            w9e w9eVar = w9e.c;
            DateTimeFieldType dateTimeFieldType = DateTimeFieldType.a;
            d2a d2aVar = new d2a(w9eVar);
            tq1Var.H = d2aVar;
            tq1Var.k = d2aVar.d;
            tq1Var.G = new aun(d2aVar, d2aVar.b.g(), DateTimeFieldType.d);
            tq1Var.C = new aun((d2a) tq1Var.H, tq1Var.h, DateTimeFieldType.i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return k().equals(((ISOChronology) obj).k());
        }
        return false;
    }

    public final int hashCode() {
        return k().hashCode() + 800855;
    }

    public final String toString() {
        DateTimeZone k = k();
        if (k == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + k.f() + ']';
    }
}
