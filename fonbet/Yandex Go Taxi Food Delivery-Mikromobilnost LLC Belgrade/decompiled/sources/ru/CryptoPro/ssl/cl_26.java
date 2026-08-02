package ru.CryptoPro.ssl;

import defpackage.ds61;
import defpackage.dy31;
import defpackage.g8e;
import defpackage.htf0;
import defpackage.oyr;
import defpackage.qq61;
import java.security.AccessController;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.params.ECDSAParamsSpec;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
final class cl_26 extends cl_66 {
    public static final cl_26 f;
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public static final int[] i;
    public final int[] e;

    static {
        ArrayList arrayList;
        new HashMap();
        synchronized (cl_39.class) {
        }
        cl_27.b(ECDSAParamsSpec.ECDSA_P256_NAME);
        String str = (String) AccessController.doPrivileged(new htf0("jdk.tls.namedGroups", 6));
        int i2 = 0;
        if (str != null && str.length() != 0 && str.length() > 1 && str.charAt(0) == '\"' && g8e.a(1, str) == '\"') {
            str = oyr.g(1, 1, str);
        }
        if (str == null || str.length() == 0) {
            int[] iArr = {23, 24, 25, 9, 10, 11, 12, 13, 14, 22};
            ArrayList arrayList2 = new ArrayList(10);
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = iArr[i3];
            }
            arrayList = arrayList2;
        } else {
            String[] split = str.split(",");
            arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                String trim = str2.trim();
                if (!trim.isEmpty()) {
                    cl_27.b(trim);
                }
            }
            if (arrayList.isEmpty()) {
                boolean z = cl_73.a;
                synchronized (cl_73.class) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            SSLLogger.fine("Initialized [jdk.tls.namedGroups|default] list contains no available elliptic curves. ".concat(str != null ? oyr.p(Extension.O_BRAKE, str, Extension.C_BRAKE) : "[Default]"));
        }
        i = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        f = new cl_26(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl_26(cl_46 cl_46Var, int i2) {
        super(r0);
        cl_36 cl_36Var = cl_36.e;
        int d = cl_46Var.d();
        if ((i2 & 1) != 0 || d + 2 != i2) {
            dy31.j(cl_36Var, " extension");
            throw null;
        }
        this.e = new int[d >> 1];
        int i3 = 0;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = cl_46Var.d();
            i3++;
        }
    }

    public static int c(ECParameterSpec eCParameterSpec) {
        Integer num;
        boolean z = cl_73.a;
        ds61 a = qq61.a(eCParameterSpec);
        String objectIdentifier = a == null ? null : a.b.toString();
        if (objectIdentifier == null || (num = (Integer) g.get(objectIdentifier)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static boolean d(int i2) {
        for (int i3 : i) {
            if (i2 == i3) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        int[] iArr = this.e;
        int length = iArr.length << 1;
        cl_62Var.e(length + 2);
        cl_62Var.e(length);
        for (int i2 : iArr) {
            cl_62Var.e(i2);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        return (this.e.length << 1) + 6;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Extension " + this.d + ", curve names: {");
        boolean z = true;
        for (int i2 : this.e) {
            if (z) {
                z = false;
            } else {
                sb.append(Extension.FIX_SPACE);
            }
            cl_27[] values = cl_27.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    str = null;
                    break;
                }
                cl_27 cl_27Var = values[i3];
                if (cl_27Var.z == i2) {
                    str = cl_27Var.A;
                    break;
                }
                i3++;
            }
            if (str != null) {
                sb.append(str);
            } else {
                if (i2 == 65281) {
                    str2 = "arbitrary_explicit_prime_curves";
                } else if (i2 == 65282) {
                    str2 = "arbitrary_explicit_char2_curves";
                } else {
                    str2 = "unknown curve " + i2;
                }
                sb.append(str2);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public cl_26(int[] iArr) {
        super(cl_36.e);
        this.e = iArr;
    }
}
