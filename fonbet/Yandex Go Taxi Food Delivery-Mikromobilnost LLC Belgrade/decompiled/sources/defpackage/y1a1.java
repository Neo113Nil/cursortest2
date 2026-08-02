package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class y1a1 extends mha1 {
    public final l1a1 A;
    public final l1a1 B;
    public final l1a1 C;
    public final l1a1 D;
    public final l1a1 E;
    public final l1a1 F;
    public final l1a1 G;
    public final l1a1 H;
    public char w;
    public long x;
    public String y;
    public final l1a1 z;

    public y1a1(g gVar) {
        super(gVar);
        this.w = (char) 0;
        this.x = -1L;
        this.z = new l1a1(this, 6, false, false);
        this.A = new l1a1(this, 6, true, false);
        this.B = new l1a1(this, 6, false, true);
        this.C = new l1a1(this, 5, false, false);
        this.D = new l1a1(this, 5, true, false);
        this.E = new l1a1(this, 5, false, true);
        this.F = new l1a1(this, 4, false, false);
        this.G = new l1a1(this, 3, false, false);
        this.H = new l1a1(this, 2, false, false);
    }

    public static r1a1 Og(String str) {
        if (str == null) {
            return null;
        }
        return new r1a1(str);
    }

    public static String Rg(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String Sg = Sg(obj, z);
        String Sg2 = Sg(obj2, z);
        String Sg3 = Sg(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = Extension.COLON_SPACE;
        }
        boolean isEmpty = TextUtils.isEmpty(Sg);
        String str3 = Extension.FIX_SPACE;
        if (!isEmpty) {
            sb.append(str2);
            sb.append(Sg);
            str2 = Extension.FIX_SPACE;
        }
        if (TextUtils.isEmpty(Sg2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(Sg2);
        }
        if (!TextUtils.isEmpty(Sg3)) {
            sb.append(str3);
            sb.append(Sg3);
        }
        return sb.toString();
    }

    public static String Sg(Object obj, boolean z) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            x4e.A(round, str, "...", sb);
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof r1a1 ? ((r1a1) obj).a() : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = g.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(Extension.COLON_SPACE);
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // defpackage.mha1
    public final boolean Hg() {
        return false;
    }

    public final l1a1 Kg() {
        return this.z;
    }

    public final l1a1 Lg() {
        return this.C;
    }

    public final l1a1 Mg() {
        return this.G;
    }

    public final l1a1 Ng() {
        return this.H;
    }

    public final void Pg(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(Qg(), i)) {
            Log.println(i, Qg(), Rg(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        cvw.l(str);
        aaa1 aaa1Var = ((g) this.b).z;
        if (aaa1Var == null) {
            Log.println(6, Qg(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!aaa1Var.c) {
                Log.println(6, Qg(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            aaa1Var.Pg(new e1a1(this, i, str, obj, obj2, obj3));
        }
    }

    public final String Qg() {
        String str;
        synchronized (this) {
            try {
                if (this.y == null) {
                    ((g) ((g) this.b).w.b).getClass();
                    this.y = "FA";
                }
                cvw.l(this.y);
                str = this.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
