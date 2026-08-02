package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class NF extends AbstractC4117wD {
    public static final AbstractC3531lK k(C4178xK c4178xK) {
        String D8;
        int B3 = c4178xK.B();
        AbstractC3531lK n9 = n(c4178xK, B3);
        if (n9 == null) {
            return m(c4178xK, B3);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int i = c4178xK.f35770z;
            if (i == 0) {
                i = c4178xK.b();
            }
            String str = null;
            if (i == 2 || i == 4 || i == 17) {
                if (n9 instanceof C3477kK) {
                    int i4 = c4178xK.f35770z;
                    if (i4 == 0) {
                        i4 = c4178xK.b();
                    }
                    if (i4 != 4) {
                        throw c4178xK.K("END_ARRAY");
                    }
                    int i6 = c4178xK.f35761D;
                    c4178xK.f35761D = i6 - 1;
                    int[] iArr = c4178xK.f35763F;
                    int i9 = i6 - 2;
                    iArr[i9] = iArr[i9] + 1;
                    c4178xK.f35770z = 0;
                } else {
                    int i10 = c4178xK.f35770z;
                    if (i10 == 0) {
                        i10 = c4178xK.b();
                    }
                    if (i10 != 2) {
                        throw c4178xK.K("END_OBJECT");
                    }
                    int i11 = c4178xK.f35761D;
                    int i12 = i11 - 1;
                    c4178xK.f35761D = i12;
                    c4178xK.f35762E[i12] = null;
                    int[] iArr2 = c4178xK.f35763F;
                    int i13 = i11 - 2;
                    iArr2[i13] = iArr2[i13] + 1;
                    c4178xK.f35770z = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return n9;
                }
                n9 = (AbstractC3531lK) arrayDeque.removeLast();
            } else {
                if (n9 instanceof C3639nK) {
                    int i14 = c4178xK.f35770z;
                    if (i14 == 0) {
                        i14 = c4178xK.b();
                    }
                    if (i14 == 14) {
                        D8 = c4178xK.E();
                    } else if (i14 == 12) {
                        D8 = c4178xK.D('\'');
                    } else {
                        if (i14 != 13) {
                            throw c4178xK.K("a name");
                        }
                        D8 = c4178xK.D('\"');
                    }
                    str = D8;
                    c4178xK.f35770z = 0;
                    c4178xK.f35762E[c4178xK.f35761D - 1] = str;
                    if (!UC.e(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int B9 = c4178xK.B();
                AbstractC3531lK n10 = n(c4178xK, B9);
                AbstractC3531lK m9 = n10 == null ? m(c4178xK, B9) : n10;
                if (n9 instanceof C3477kK) {
                    ((C3477kK) n9).f32196n.add(m9);
                } else {
                    C3639nK c3639nK = (C3639nK) n9;
                    if (c3639nK.f33498n.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    c3639nK.f33498n.put(str, m9);
                }
                if (n10 != null) {
                    arrayDeque.addLast(n9);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    n9 = m9;
                } else {
                    continue;
                }
            }
        }
    }

    public static void l(C4232yK c4232yK, AbstractC3531lK abstractC3531lK) {
        if (abstractC3531lK == null || (abstractC3531lK instanceof C3585mK)) {
            c4232yK.b();
            return;
        }
        boolean z6 = abstractC3531lK instanceof C3747pK;
        androidx.fragment.app.Y y7 = c4232yK.f35927n;
        if (z6) {
            C3747pK d9 = abstractC3531lK.d();
            Serializable serializable = d9.f33853n;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean booleanValue = serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d9.a());
                    c4232yK.z();
                    c4232yK.C();
                    y7.write(true != booleanValue ? "false" : "true");
                    return;
                }
                String a9 = d9.a();
                if (a9 == null) {
                    c4232yK.b();
                    return;
                }
                c4232yK.z();
                c4232yK.C();
                c4232yK.A(a9);
                return;
            }
            Number e9 = d9.e();
            if (e9 == null) {
                c4232yK.b();
                return;
            }
            c4232yK.z();
            String obj = e9.toString();
            Class<?> cls = e9.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                    if (c4232yK.f35925A != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                    }
                } else if (cls != Float.class && cls != Double.class && !C4232yK.f35923C.matcher(obj).matches()) {
                    String valueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                }
            }
            c4232yK.C();
            y7.append((CharSequence) obj);
            return;
        }
        boolean z9 = abstractC3531lK instanceof C3477kK;
        if (z9) {
            c4232yK.z();
            c4232yK.C();
            int i = c4232yK.f35929v;
            int[] iArr = c4232yK.f35928u;
            if (i == iArr.length) {
                c4232yK.f35928u = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = c4232yK.f35928u;
            int i4 = c4232yK.f35929v;
            c4232yK.f35929v = i4 + 1;
            iArr2[i4] = 1;
            y7.write(91);
            if (!z9) {
                throw new IllegalStateException("Not a JSON Array: ".concat(abstractC3531lK.toString()));
            }
            Iterator it = ((C3477kK) abstractC3531lK).f32196n.iterator();
            while (it.hasNext()) {
                l(c4232yK, (AbstractC3531lK) it.next());
            }
            c4232yK.i(1, 2, ']');
            return;
        }
        if (!(abstractC3531lK instanceof C3639nK)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(abstractC3531lK.getClass())));
        }
        c4232yK.z();
        c4232yK.C();
        int i6 = c4232yK.f35929v;
        int[] iArr3 = c4232yK.f35928u;
        if (i6 == iArr3.length) {
            c4232yK.f35928u = Arrays.copyOf(iArr3, i6 + i6);
        }
        int[] iArr4 = c4232yK.f35928u;
        int i9 = c4232yK.f35929v;
        c4232yK.f35929v = i9 + 1;
        iArr4[i9] = 3;
        y7.write(123);
        Iterator it2 = ((C3908sK) abstractC3531lK.c().f33498n.entrySet()).iterator();
        while (((C3854rK) it2).hasNext()) {
            C4016uK a10 = ((C3854rK) it2).a();
            String str = (String) a10.getKey();
            Objects.requireNonNull(str, "name == null");
            if (c4232yK.f35926B != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int j6 = c4232yK.j();
            if (j6 != 3 && j6 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            c4232yK.f35926B = str;
            l(c4232yK, (AbstractC3531lK) a10.getValue());
        }
        c4232yK.i(3, 5, '}');
    }

    public static final AbstractC3531lK m(C4178xK c4178xK, int i) {
        int i4 = i - 1;
        if (i4 == 5) {
            String j6 = c4178xK.j();
            if (UC.e(j6)) {
                return new C3747pK(j6);
            }
            throw new IOException("illegal characters in string");
        }
        if (i4 == 6) {
            return new C3747pK(new OF(c4178xK.j()));
        }
        boolean z6 = true;
        if (i4 != 7) {
            if (i4 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(UC.b(i)));
            }
            int i6 = c4178xK.f35770z;
            if (i6 == 0) {
                i6 = c4178xK.b();
            }
            if (i6 != 7) {
                throw c4178xK.K("null");
            }
            c4178xK.f35770z = 0;
            int[] iArr = c4178xK.f35763F;
            int i9 = c4178xK.f35761D - 1;
            iArr[i9] = iArr[i9] + 1;
            return C3585mK.f32722n;
        }
        int i10 = c4178xK.f35770z;
        if (i10 == 0) {
            i10 = c4178xK.b();
        }
        if (i10 == 5) {
            c4178xK.f35770z = 0;
            int[] iArr2 = c4178xK.f35763F;
            int i11 = c4178xK.f35761D - 1;
            iArr2[i11] = iArr2[i11] + 1;
        } else {
            if (i10 != 6) {
                throw c4178xK.K("a boolean");
            }
            c4178xK.f35770z = 0;
            int[] iArr3 = c4178xK.f35763F;
            int i12 = c4178xK.f35761D - 1;
            iArr3[i12] = iArr3[i12] + 1;
            z6 = false;
        }
        return new C3747pK(Boolean.valueOf(z6));
    }

    public static final AbstractC3531lK n(C4178xK c4178xK, int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            int i6 = c4178xK.f35770z;
            if (i6 == 0) {
                i6 = c4178xK.b();
            }
            if (i6 != 3) {
                throw c4178xK.K("BEGIN_ARRAY");
            }
            c4178xK.F(1);
            c4178xK.f35763F[c4178xK.f35761D - 1] = 0;
            c4178xK.f35770z = 0;
            return new C3477kK();
        }
        if (i4 != 2) {
            return null;
        }
        int i9 = c4178xK.f35770z;
        if (i9 == 0) {
            i9 = c4178xK.b();
        }
        if (i9 != 1) {
            throw c4178xK.K("BEGIN_OBJECT");
        }
        c4178xK.F(3);
        c4178xK.f35770z = 0;
        return new C3639nK();
    }
}
