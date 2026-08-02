package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class vgb1 {
    public static final boolean c(Certificate certificate) {
        Set<String> nonCriticalExtensionOIDs;
        return (certificate instanceof X509Certificate) && (nonCriticalExtensionOIDs = ((X509Certificate) certificate).getNonCriticalExtensionOIDs()) != null && nonCriticalExtensionOIDs.contains("1.3.6.1.4.1.11129.2.4.2");
    }

    public static final boolean d(long j) {
        if (j <= 0) {
            return true;
        }
        Date b = bzk0.b(new Date(j));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(b);
        calendar.add(5, 1);
        return bzk0.b(new Date(System.currentTimeMillis())).after(calendar.getTime());
    }

    public static final q0x e(Certificate certificate, Certificate certificate2) {
        byo byoVar;
        i2 i2Var = new i2(certificate.getEncoded());
        try {
            g79 h = g79.h(i2Var.k());
            fzo fzoVar = h.b.E;
            if (fzoVar != null) {
                byoVar = (byo) fzoVar.a.get(new t2("2.5.29.35"));
            } else {
                byoVar = null;
            }
            q0x q0xVar = new q0x(h.b.x, aba1.d(certificate2.getPublicKey()), byoVar, true);
            i2Var.close();
            return q0xVar;
        } finally {
        }
    }

    public abstract String a();

    public Object b() {
        if (this instanceof elu0) {
            return ((elu0) this).b;
        }
        if (this instanceof dlu0) {
            return Long.valueOf(((dlu0) this).b);
        }
        if (this instanceof zku0) {
            return Boolean.valueOf(((zku0) this).b);
        }
        if (this instanceof clu0) {
            return Double.valueOf(((clu0) this).b);
        }
        if (this instanceof alu0) {
            return new jdc(((alu0) this).b);
        }
        if (this instanceof glu0) {
            return new rg21(((glu0) this).b);
        }
        if (this instanceof yku0) {
            return ((yku0) this).b;
        }
        if (this instanceof blu0) {
            return ((blu0) this).b;
        }
        w511.b();
        return null;
    }
}
