package org.joda.time;

import com.connectsdk.discovery.DiscoveryProvider;
import defpackage.cve;
import defpackage.hrg;
import defpackage.isc;
import defpackage.ouj;
import defpackage.pd7;
import defpackage.qq6;
import defpackage.rk4;
import defpackage.sd7;
import defpackage.tzm;
import defpackage.vo7;
import defpackage.xq0;
import defpackage.xtw;
import defpackage.yc7;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;

/* loaded from: classes5.dex */
public abstract class DateTimeZone implements Serializable {
    public static final DateTimeZone a = UTCDateTimeZone.e;
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        public transient String a;

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.a = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.c(this.a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.a);
        }
    }

    public DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
        } else {
            xq0.x("Id must not be null");
            throw null;
        }
    }

    public static DateTimeZone c(String str) {
        if (str == null) {
            return e();
        }
        boolean equals = str.equals("UTC");
        DateTimeZone dateTimeZone = a;
        if (!equals) {
            DateTimeZone a2 = l().a(str);
            if (a2 != null) {
                return a2;
            }
            if (!str.startsWith("+") && !str.startsWith("-")) {
                xq0.x(hrg.q("The datetime zone id '", str, "' is not recognised"));
                return null;
            }
            int r = r(str);
            if (r != 0) {
                return r == 0 ? dateTimeZone : new FixedDateTimeZone(r, r, t(r), null);
            }
        }
        return dateTimeZone;
    }

    public static DateTimeZone d(TimeZone timeZone) {
        char charAt;
        if (timeZone == null) {
            return e();
        }
        String id = timeZone.getID();
        if (id == null) {
            xq0.x("The TimeZone id must not be null");
            return null;
        }
        boolean equals = id.equals("UTC");
        DateTimeZone dateTimeZone = a;
        if (!equals) {
            String str = (String) a.a.get(id);
            tzm l = l();
            DateTimeZone a2 = str != null ? l.a(str) : null;
            if (a2 == null) {
                a2 = l.a(id);
            }
            if (a2 != null) {
                return a2;
            }
            if (str != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
                xq0.x(hrg.q("The datetime zone id '", id, "' is not recognised"));
                return null;
            }
            String substring = id.substring(3);
            if (substring.length() > 2 && (charAt = substring.charAt(1)) > '9' && Character.isDigit(charAt)) {
                StringBuilder sb = new StringBuilder(substring);
                for (int i = 0; i < sb.length(); i++) {
                    int digit = Character.digit(sb.charAt(i), 10);
                    if (digit >= 0) {
                        sb.setCharAt(i, (char) (digit + 48));
                    }
                }
                substring = sb.toString();
            }
            int r = r(substring);
            if (r != 0) {
                return r == 0 ? dateTimeZone : new FixedDateTimeZone(r, r, t(r), null);
            }
        }
        return dateTimeZone;
    }

    public static DateTimeZone e() {
        AtomicReference atomicReference = d;
        DateTimeZone dateTimeZone = (DateTimeZone) atomicReference.get();
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
            if (property != null) {
                dateTimeZone = c(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZone == null) {
            try {
                dateTimeZone = d(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZone == null) {
            dateTimeZone = a;
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        while (!atomicReference.compareAndSet(null, dateTimeZone2)) {
            if (atomicReference.get() != null) {
                return (DateTimeZone) atomicReference.get();
            }
        }
        return dateTimeZone2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vo7 i() {
        vo7 vo7Var;
        vo7 vo7Var2;
        String property;
        AtomicReference atomicReference = c;
        vo7 vo7Var3 = (vo7) atomicReference.get();
        if (vo7Var3 != null) {
            return vo7Var3;
        }
        try {
            property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            try {
                Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                if (!vo7.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + vo7.class);
                }
                vo7Var = (vo7) cls.asSubclass(vo7.class).getConstructor(null).newInstance(null);
                if (vo7Var == null) {
                    vo7Var = new vo7();
                    vo7Var.a = vo7.a();
                    vo7Var.b = vo7.a();
                }
                vo7Var2 = vo7Var;
                while (!atomicReference.compareAndSet(null, vo7Var2)) {
                    if (atomicReference.get() != null) {
                        return (vo7) atomicReference.get();
                    }
                }
                return vo7Var2;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        vo7Var = null;
        if (vo7Var == null) {
        }
        vo7Var2 = vo7Var;
        while (!atomicReference.compareAndSet(null, vo7Var2)) {
        }
        return vo7Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(2:4|5)|(3:35|36|(6:38|12|13|(3:16|(3:18|19|20)(1:22)|14)|23|24)(2:39|40))|7|8|(6:28|29|13|(1:14)|23|24)|10|11|12|13|(1:14)|23|24) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:3|4|5|(3:35|36|(6:38|12|13|(3:16|(3:18|19|20)(1:22)|14)|23|24)(2:39|40))|7|8|(6:28|29|13|(1:14)|23|24)|10|11|12|13|(1:14)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r1.printStackTrace();
        r1 = new defpackage.zet();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tzm l() {
        tzm tzmVar;
        tzm tzmVar2;
        String property;
        AtomicReference atomicReference = b;
        tzm tzmVar3 = (tzm) atomicReference.get();
        if (tzmVar3 != null) {
            return tzmVar3;
        }
        try {
            property = System.getProperty("org.joda.time.DateTimeZone.Provider");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            try {
                Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                if (!tzm.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + tzm.class);
                }
                tzmVar2 = (tzm) cls.asSubclass(tzm.class).getConstructor(null).newInstance(null);
                u(tzmVar2);
                tzmVar = tzmVar2;
                while (!atomicReference.compareAndSet(null, tzmVar)) {
                    if (atomicReference.get() != null) {
                        return (tzm) atomicReference.get();
                    }
                }
                return tzmVar;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
        if (property2 != null) {
            try {
                tzmVar = new xtw(new File(property2));
                u(tzmVar);
                while (!atomicReference.compareAndSet(null, tzmVar)) {
                }
                return tzmVar;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        tzmVar2 = new xtw();
        u(tzmVar2);
        tzmVar = tzmVar2;
        while (!atomicReference.compareAndSet(null, tzmVar)) {
        }
        return tzmVar;
    }

    public static int r(String str) {
        String k;
        yc7 yc7Var = a.b;
        cve cveVar = yc7Var.b;
        rk4 rk4Var = yc7Var.c;
        if (cveVar == null) {
            qq6.d("Parsing not supported");
            return 0;
        }
        AtomicReference atomicReference = sd7.a;
        rk4 U = rk4Var == null ? ISOChronology.U() : rk4Var;
        if (rk4Var == null) {
            rk4Var = U;
        }
        DateTimeZone dateTimeZone = yc7Var.d;
        if (dateTimeZone != null) {
            rk4Var = rk4Var.I(dateTimeZone);
        }
        pd7 pd7Var = new pd7(rk4Var);
        int b2 = cveVar.b(pd7Var, str, 0);
        if (b2 < 0) {
            b2 = ~b2;
        } else if (b2 >= str.length()) {
            return -((int) pd7Var.b(str));
        }
        String str2 = str.toString();
        int i = isc.b;
        String concat = str2.length() <= b2 + 35 ? str2 : str2.substring(0, b2 + 32).concat("...");
        if (b2 <= 0) {
            k = ouj.k('\"', "Invalid format: \"", concat);
        } else if (b2 >= str2.length()) {
            k = hrg.q("Invalid format: \"", concat, "\" is too short");
        } else {
            StringBuilder u = ouj.u("Invalid format: \"", concat, "\" is malformed at \"");
            u.append(concat.substring(b2));
            u.append('\"');
            k = u.toString();
        }
        throw new IllegalArgumentException(k);
    }

    public static String t(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        try {
            isc.a(stringBuffer, i2, 2);
        } catch (IOException unused) {
        }
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / DiscoveryProvider.TIMEOUT;
        stringBuffer.append(':');
        try {
            isc.a(stringBuffer, i4, 2);
        } catch (IOException unused2) {
        }
        int i5 = i3 - (i4 * DiscoveryProvider.TIMEOUT);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(':');
        try {
            isc.a(stringBuffer, i6, 2);
        } catch (IOException unused3) {
        }
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        try {
            isc.a(stringBuffer, i7, 3);
        } catch (IOException unused4) {
        }
        return stringBuffer.toString();
    }

    public static void u(tzm tzmVar) {
        Set b2 = tzmVar.b();
        if (b2 == null || b2.size() == 0) {
            xq0.x("The provider doesn't have any available ids");
            return;
        }
        if (!b2.contains("UTC")) {
            xq0.x("The provider doesn't support UTC");
            return;
        }
        DateTimeZone a2 = tzmVar.a("UTC");
        ((UTCDateTimeZone) a).getClass();
        if (a2 instanceof UTCDateTimeZone) {
            return;
        }
        xq0.x("Invalid UTC zone provided");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2 != (r6 != r0 ? r6 : Long.MAX_VALUE)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2) {
        int j3 = j(j2);
        long j4 = j - j3;
        if (j(j4) == j3) {
            return j4;
        }
        int j5 = j(j);
        long j6 = j - j5;
        int j7 = j(j6);
        if (j5 != j7 && j5 < 0) {
            long q = q(j6);
            if (q == j6) {
                q = Long.MAX_VALUE;
            }
            long j8 = j - j7;
            long q2 = q(j8);
        }
        j5 = j7;
        long j9 = j5;
        long j10 = j - j9;
        if ((j ^ j10) >= 0 || (j ^ j9) >= 0) {
            return j10;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    public final long b(long j) {
        long j2 = j(j);
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    public final String f() {
        return this.iID;
    }

    public final String g(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String h = h(j);
        if (h == null) {
            return this.iID;
        }
        vo7 i = i();
        String str = this.iID;
        String str2 = null;
        if (i != null) {
            String[] c2 = i.c(locale, str, h, j(j) == o(j));
            if (c2 != null) {
                str2 = c2[1];
            }
        } else {
            String[] b2 = i.b(str, h, locale);
            if (b2 != null) {
                str2 = b2[1];
            }
        }
        return str2 != null ? str2 : t(j(j));
    }

    public abstract String h(long j);

    public abstract int hashCode();

    public abstract int j(long j);

    public int k(long j) {
        int j2 = j(j);
        long j3 = j - j2;
        int j4 = j(j3);
        if (j2 != j4) {
            if (j2 - j4 < 0) {
                long q = q(j3);
                if (q == j3) {
                    q = Long.MAX_VALUE;
                }
                long j5 = j - j4;
                long q2 = q(j5);
                if (q != (q2 != j5 ? q2 : Long.MAX_VALUE)) {
                    return j2;
                }
            }
        } else if (j2 >= 0) {
            long s = s(j3);
            if (s < j3) {
                int j6 = j(s);
                if (j3 - s <= j6 - j2) {
                    return j6;
                }
            }
        }
        return j4;
    }

    public final String n(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String h = h(j);
        if (h == null) {
            return this.iID;
        }
        vo7 i = i();
        String str = this.iID;
        String str2 = null;
        if (i != null) {
            String[] c2 = i.c(locale, str, h, j(j) == o(j));
            if (c2 != null) {
                str2 = c2[0];
            }
        } else {
            String[] b2 = i.b(str, h, locale);
            if (b2 != null) {
                str2 = b2[0];
            }
        }
        return str2 != null ? str2 : t(j(j));
    }

    public abstract int o(long j);

    public abstract boolean p();

    public abstract long q(long j);

    public abstract long s(long j);

    public final String toString() {
        return this.iID;
    }

    public Object writeReplace() throws ObjectStreamException {
        String str = this.iID;
        Stub stub = new Stub();
        stub.a = str;
        return stub;
    }
}
