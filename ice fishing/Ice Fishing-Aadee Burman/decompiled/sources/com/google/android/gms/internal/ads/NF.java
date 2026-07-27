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
public abstract class NF extends AbstractC4094wD {
    public static final AbstractC3508lK k(C4155xK c4155xK) {
        String D8;
        int B9 = c4155xK.B();
        AbstractC3508lK n9 = n(c4155xK, B9);
        if (n9 == null) {
            return m(c4155xK, B9);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int i = c4155xK.f34989z;
            if (i == 0) {
                i = c4155xK.b();
            }
            String str = null;
            if (i == 2 || i == 4 || i == 17) {
                if (n9 instanceof C3454kK) {
                    int i6 = c4155xK.f34989z;
                    if (i6 == 0) {
                        i6 = c4155xK.b();
                    }
                    if (i6 != 4) {
                        throw c4155xK.K("END_ARRAY");
                    }
                    int i9 = c4155xK.f34980D;
                    c4155xK.f34980D = i9 - 1;
                    int[] iArr = c4155xK.f34982F;
                    int i10 = i9 - 2;
                    iArr[i10] = iArr[i10] + 1;
                    c4155xK.f34989z = 0;
                } else {
                    int i11 = c4155xK.f34989z;
                    if (i11 == 0) {
                        i11 = c4155xK.b();
                    }
                    if (i11 != 2) {
                        throw c4155xK.K("END_OBJECT");
                    }
                    int i12 = c4155xK.f34980D;
                    int i13 = i12 - 1;
                    c4155xK.f34980D = i13;
                    c4155xK.f34981E[i13] = null;
                    int[] iArr2 = c4155xK.f34982F;
                    int i14 = i12 - 2;
                    iArr2[i14] = iArr2[i14] + 1;
                    c4155xK.f34989z = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return n9;
                }
                n9 = (AbstractC3508lK) arrayDeque.removeLast();
            } else {
                if (n9 instanceof C3616nK) {
                    int i15 = c4155xK.f34989z;
                    if (i15 == 0) {
                        i15 = c4155xK.b();
                    }
                    if (i15 == 14) {
                        D8 = c4155xK.E();
                    } else if (i15 == 12) {
                        D8 = c4155xK.D('\'');
                    } else {
                        if (i15 != 13) {
                            throw c4155xK.K("a name");
                        }
                        D8 = c4155xK.D('\"');
                    }
                    str = D8;
                    c4155xK.f34989z = 0;
                    c4155xK.f34981E[c4155xK.f34980D - 1] = str;
                    if (!UC.e(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int B10 = c4155xK.B();
                AbstractC3508lK n10 = n(c4155xK, B10);
                AbstractC3508lK m4 = n10 == null ? m(c4155xK, B10) : n10;
                if (n9 instanceof C3454kK) {
                    ((C3454kK) n9).f31417n.add(m4);
                } else {
                    C3616nK c3616nK = (C3616nK) n9;
                    if (c3616nK.f32720n.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    c3616nK.f32720n.put(str, m4);
                }
                if (n10 != null) {
                    arrayDeque.addLast(n9);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    n9 = m4;
                } else {
                    continue;
                }
            }
        }
    }

    public static void l(C4209yK c4209yK, AbstractC3508lK abstractC3508lK) {
        if (abstractC3508lK == null || (abstractC3508lK instanceof C3562mK)) {
            c4209yK.b();
            return;
        }
        boolean z3 = abstractC3508lK instanceof C3724pK;
        androidx.fragment.app.Y y7 = c4209yK.f35141n;
        if (z3) {
            C3724pK d2 = abstractC3508lK.d();
            Serializable serializable = d2.f33063n;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean booleanValue = serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d2.a());
                    c4209yK.z();
                    c4209yK.C();
                    y7.write(true != booleanValue ? "false" : "true");
                    return;
                }
                String a9 = d2.a();
                if (a9 == null) {
                    c4209yK.b();
                    return;
                }
                c4209yK.z();
                c4209yK.C();
                c4209yK.A(a9);
                return;
            }
            Number e9 = d2.e();
            if (e9 == null) {
                c4209yK.b();
                return;
            }
            c4209yK.z();
            String obj = e9.toString();
            Class<?> cls = e9.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                    if (c4209yK.f35139A != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                    }
                } else if (cls != Float.class && cls != Double.class && !C4209yK.f35137C.matcher(obj).matches()) {
                    String valueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                }
            }
            c4209yK.C();
            y7.append((CharSequence) obj);
            return;
        }
        boolean z6 = abstractC3508lK instanceof C3454kK;
        if (z6) {
            c4209yK.z();
            c4209yK.C();
            int i = c4209yK.f35143v;
            int[] iArr = c4209yK.f35142u;
            if (i == iArr.length) {
                c4209yK.f35142u = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = c4209yK.f35142u;
            int i6 = c4209yK.f35143v;
            c4209yK.f35143v = i6 + 1;
            iArr2[i6] = 1;
            y7.write(91);
            if (!z6) {
                throw new IllegalStateException("Not a JSON Array: ".concat(abstractC3508lK.toString()));
            }
            Iterator it = ((C3454kK) abstractC3508lK).f31417n.iterator();
            while (it.hasNext()) {
                l(c4209yK, (AbstractC3508lK) it.next());
            }
            c4209yK.i(1, 2, ']');
            return;
        }
        if (!(abstractC3508lK instanceof C3616nK)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(abstractC3508lK.getClass())));
        }
        c4209yK.z();
        c4209yK.C();
        int i9 = c4209yK.f35143v;
        int[] iArr3 = c4209yK.f35142u;
        if (i9 == iArr3.length) {
            c4209yK.f35142u = Arrays.copyOf(iArr3, i9 + i9);
        }
        int[] iArr4 = c4209yK.f35142u;
        int i10 = c4209yK.f35143v;
        c4209yK.f35143v = i10 + 1;
        iArr4[i10] = 3;
        y7.write(123);
        Iterator it2 = ((C3885sK) abstractC3508lK.c().f32720n.entrySet()).iterator();
        while (((C3831rK) it2).hasNext()) {
            C3993uK a10 = ((C3831rK) it2).a();
            String str = (String) a10.getKey();
            Objects.requireNonNull(str, "name == null");
            if (c4209yK.f35140B != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int j6 = c4209yK.j();
            if (j6 != 3 && j6 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            c4209yK.f35140B = str;
            l(c4209yK, (AbstractC3508lK) a10.getValue());
        }
        c4209yK.i(3, 5, '}');
    }

    public static final AbstractC3508lK m(C4155xK c4155xK, int i) {
        int i6 = i - 1;
        if (i6 == 5) {
            String j6 = c4155xK.j();
            if (UC.e(j6)) {
                return new C3724pK(j6);
            }
            throw new IOException("illegal characters in string");
        }
        if (i6 == 6) {
            return new C3724pK(new OF(c4155xK.j()));
        }
        boolean z3 = true;
        if (i6 != 7) {
            if (i6 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(UC.b(i)));
            }
            int i9 = c4155xK.f34989z;
            if (i9 == 0) {
                i9 = c4155xK.b();
            }
            if (i9 != 7) {
                throw c4155xK.K("null");
            }
            c4155xK.f34989z = 0;
            int[] iArr = c4155xK.f34982F;
            int i10 = c4155xK.f34980D - 1;
            iArr[i10] = iArr[i10] + 1;
            return C3562mK.f31942n;
        }
        int i11 = c4155xK.f34989z;
        if (i11 == 0) {
            i11 = c4155xK.b();
        }
        if (i11 == 5) {
            c4155xK.f34989z = 0;
            int[] iArr2 = c4155xK.f34982F;
            int i12 = c4155xK.f34980D - 1;
            iArr2[i12] = iArr2[i12] + 1;
        } else {
            if (i11 != 6) {
                throw c4155xK.K("a boolean");
            }
            c4155xK.f34989z = 0;
            int[] iArr3 = c4155xK.f34982F;
            int i13 = c4155xK.f34980D - 1;
            iArr3[i13] = iArr3[i13] + 1;
            z3 = false;
        }
        return new C3724pK(Boolean.valueOf(z3));
    }

    public static final AbstractC3508lK n(C4155xK c4155xK, int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            int i9 = c4155xK.f34989z;
            if (i9 == 0) {
                i9 = c4155xK.b();
            }
            if (i9 != 3) {
                throw c4155xK.K("BEGIN_ARRAY");
            }
            c4155xK.F(1);
            c4155xK.f34982F[c4155xK.f34980D - 1] = 0;
            c4155xK.f34989z = 0;
            return new C3454kK();
        }
        if (i6 != 2) {
            return null;
        }
        int i10 = c4155xK.f34989z;
        if (i10 == 0) {
            i10 = c4155xK.b();
        }
        if (i10 != 1) {
            throw c4155xK.K("BEGIN_OBJECT");
        }
        c4155xK.F(3);
        c4155xK.f34989z = 0;
        return new C3616nK();
    }
}
