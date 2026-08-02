package org.joda.time.tz;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.cr3;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public class CachedDateTimeZone extends DateTimeZone {
    public static final int f;
    private static final long serialVersionUID = 5472298452022250685L;
    public final transient cr3[] e;
    private final DateTimeZone iZone;

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = RemoteCameraConfig.Mic.BUFFER_SIZE;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        f = i - 1;
    }

    public CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.f());
        this.e = new cr3[f + 1];
        this.iZone = dateTimeZone;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final String h(long j) {
        return v(j).b(j);
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public final int j(long j) {
        return v(j).c(j);
    }

    @Override // org.joda.time.DateTimeZone
    public final int o(long j) {
        return v(j).d(j);
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean p() {
        return this.iZone.p();
    }

    @Override // org.joda.time.DateTimeZone
    public final long q(long j) {
        return this.iZone.q(j);
    }

    @Override // org.joda.time.DateTimeZone
    public final long s(long j) {
        return this.iZone.s(j);
    }

    public final cr3 v(long j) {
        int i = (int) (j >> 32);
        int i2 = f & i;
        cr3[] cr3VarArr = this.e;
        cr3 cr3Var = cr3VarArr[i2];
        if (cr3Var != null && ((int) (cr3Var.a >> 32)) == i) {
            return cr3Var;
        }
        long j2 = j & (-4294967296L);
        cr3 cr3Var2 = new cr3(this.iZone, j2);
        long j3 = 4294967295L | j2;
        cr3 cr3Var3 = cr3Var2;
        while (true) {
            long q = this.iZone.q(j2);
            if (q == j2 || q > j3) {
                break;
            }
            cr3 cr3Var4 = new cr3(this.iZone, q);
            cr3Var3.e = cr3Var4;
            cr3Var3 = cr3Var4;
            j2 = q;
        }
        cr3VarArr[i2] = cr3Var2;
        return cr3Var2;
    }
}
