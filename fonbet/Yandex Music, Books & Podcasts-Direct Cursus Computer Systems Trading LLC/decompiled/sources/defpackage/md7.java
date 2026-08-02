package defpackage;

import java.util.ArrayList;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public final class md7 {
    public final /* synthetic */ int a = 0;
    public final ArrayList b = new ArrayList();
    public Object c;

    public /* synthetic */ md7(Object obj) {
        this.c = obj;
    }

    public static boolean n(String str, CharSequence charSequence, int i) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(String str, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public void a(Object obj, String str) {
        this.b.add(ouj.o(str, "=", String.valueOf(obj)));
    }

    public void b(yc7 yc7Var) {
        if (yc7Var != null) {
            d(yc7Var.a, yc7Var.b);
        } else {
            xq0.x("No formatter supplied");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [qd7] */
    /* JADX WARN: Type inference failed for: r6v0, types: [qd7] */
    public void c(dve[] dveVarArr) {
        int length = dveVarArr.length;
        int i = 0;
        if (length == 1) {
            dve dveVar = dveVarArr[0];
            if (dveVar != null) {
                d(null, dveVar);
                return;
            } else {
                xq0.x("No parser supplied");
                return;
            }
        }
        cve[] cveVarArr = new cve[length];
        while (i < length - 1) {
            dve dveVar2 = dveVarArr[i];
            if (dveVar2 == null) {
                dveVar2 = dveVar2 == null ? null : new qd7(dveVar2);
            }
            cveVarArr[i] = dveVar2;
            if (dveVar2 == null) {
                xq0.x("Incomplete parser array");
                return;
            }
            i++;
        }
        dve dveVar3 = dveVarArr[i];
        if (dveVar3 == null) {
            dveVar3 = dveVar3 == null ? null : new qd7(dveVar3);
        }
        cveVarArr[i] = dveVar3;
        d(null, new dd7(cveVarArr));
    }

    public void d(qve qveVar, cve cveVar) {
        this.c = null;
        ArrayList arrayList = this.b;
        arrayList.add(qveVar);
        arrayList.add(cveVar);
    }

    public void e(Object obj) {
        this.c = null;
        ArrayList arrayList = this.b;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    public void f(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            xq0.x("Field type must not be null");
            return;
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            e7o.e();
        } else if (i <= 1) {
            e(new ld7(dateTimeFieldType, i2, false));
        } else {
            e(new fd7(dateTimeFieldType, i2, false, i));
        }
    }

    public void g(DateTimeFieldType dateTimeFieldType, int i) {
        if (i > 0) {
            e(new bd7(dateTimeFieldType, i, false, i));
        } else {
            xq0.x(k5r.i(i, "Illegal number of digits: "));
        }
    }

    public void h(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            e7o.e();
        } else {
            e(new cd7(dateTimeFieldType, i, i2));
        }
    }

    public void i(char c) {
        e(new zc7(c));
    }

    public void j(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                e(new gd7(str));
            } else {
                e(new zc7(str.charAt(0)));
            }
        }
    }

    public void k(dve dveVar) {
        if (dveVar != null) {
            d(null, new dd7(new cve[]{dveVar, null}));
        } else {
            xq0.x("No parser supplied");
        }
    }

    public void l(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            e7o.e();
        } else if (i <= 1) {
            e(new ld7(dateTimeFieldType, i2, true));
        } else {
            e(new fd7(dateTimeFieldType, i2, true, i));
        }
    }

    public void m(DateTimeFieldType dateTimeFieldType) {
        e(new hd7(dateTimeFieldType, false));
    }

    public Object p() {
        Object obj = this.c;
        if (obj == null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 2) {
                Object obj2 = arrayList.get(0);
                Object obj3 = arrayList.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new ad7(arrayList);
            }
            this.c = obj;
        }
        return obj;
    }

    public yc7 q() {
        Object p = p();
        cve cveVar = null;
        qve qveVar = (!(p instanceof qve) || ((p instanceof ad7) && ((ad7) p).a == null)) ? null : (qve) p;
        if ((p instanceof cve) && (!(p instanceof ad7) || ((ad7) p).b != null)) {
            cveVar = (cve) p;
        }
        if (qveVar != null || cveVar != null) {
            return new yc7(qveVar, cveVar);
        }
        qq6.d("Both printing and parsing not supported");
        return null;
    }

    public dve r() {
        Object p = p();
        if ((p instanceof cve) && (!(p instanceof ad7) || ((ad7) p).b != null)) {
            return dve.c((cve) p);
        }
        qq6.d("Parsing is not supported");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public md7() {
    }
}
