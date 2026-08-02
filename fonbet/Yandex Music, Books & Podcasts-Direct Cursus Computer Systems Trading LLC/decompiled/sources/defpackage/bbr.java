package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.math.BigDecimal;
import kotlin.KotlinVersion;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class bbr extends z3f {
    public final /* synthetic */ int a;

    public /* synthetic */ bbr(int i) {
        this.a = i;
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        long parseLong;
        switch (this.a) {
            case 0:
                return l7fVar.f0();
            case 1:
                int i = l7fVar.g;
                if (i == 0) {
                    i = l7fVar.o();
                }
                boolean z = false;
                if (i == 5) {
                    l7fVar.g = 0;
                    int[] iArr = l7fVar.d;
                    int i2 = l7fVar.a - 1;
                    iArr[i2] = iArr[i2] + 1;
                    z = true;
                } else {
                    if (i != 6) {
                        b6e.k(f1d.w(l7fVar.peek()), l7fVar.getPath(), "Expected a boolean but was ");
                        return null;
                    }
                    l7fVar.g = 0;
                    int[] iArr2 = l7fVar.d;
                    int i3 = l7fVar.a - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) ksw.J(l7fVar, "a byte", -128, KotlinVersion.MAX_COMPONENT_VALUE));
            case 3:
                String f0 = l7fVar.f0();
                if (f0.length() <= 1) {
                    return Character.valueOf(f0.charAt(0));
                }
                throw new wp3(hrg.r("Expected a char but was ", ouj.k('\"', "\"", f0), " at path ", l7fVar.getPath()));
            case 4:
                return Double.valueOf(l7fVar.nextDouble());
            case 5:
                float nextDouble = (float) l7fVar.nextDouble();
                if (!Float.isInfinite(nextDouble)) {
                    return Float.valueOf(nextDouble);
                }
                throw new wp3("JSON forbids NaN and infinities: " + nextDouble + " at path " + l7fVar.getPath());
            case 6:
                return Integer.valueOf(l7fVar.nextInt());
            case 7:
                int i4 = l7fVar.g;
                if (i4 == 0) {
                    i4 = l7fVar.o();
                }
                if (i4 == 16) {
                    l7fVar.g = 0;
                    int[] iArr3 = l7fVar.d;
                    int i5 = l7fVar.a - 1;
                    iArr3[i5] = iArr3[i5] + 1;
                    parseLong = l7fVar.h;
                } else {
                    if (i4 == 17) {
                        hi3 hi3Var = l7fVar.f;
                        long j = l7fVar.i;
                        hi3Var.getClass();
                        l7fVar.j = hi3Var.F0(j, Charsets.UTF_8);
                    } else if (i4 == 9 || i4 == 8) {
                        String Q = i4 == 9 ? l7fVar.Q(l7f.l) : l7fVar.Q(l7f.k);
                        l7fVar.j = Q;
                        try {
                            parseLong = Long.parseLong(Q);
                            l7fVar.g = 0;
                            int[] iArr4 = l7fVar.d;
                            int i6 = l7fVar.a - 1;
                            iArr4[i6] = iArr4[i6] + 1;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (i4 != 11) {
                        b6e.k(f1d.w(l7fVar.peek()), l7fVar.getPath(), "Expected a long but was ");
                        return null;
                    }
                    l7fVar.g = 11;
                    try {
                        parseLong = new BigDecimal(l7fVar.j).longValueExact();
                        l7fVar.j = null;
                        l7fVar.g = 0;
                        int[] iArr5 = l7fVar.d;
                        int i7 = l7fVar.a - 1;
                        iArr5[i7] = iArr5[i7] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        b6e.k(l7fVar.j, l7fVar.getPath(), "Expected a long but was ");
                    }
                }
                return Long.valueOf(parseLong);
            default:
                return Short.valueOf((short) ksw.J(l7fVar, "a short", -32768, 32767));
        }
    }

    @Override // defpackage.z3f
    public final void e(n7f n7fVar, Object obj) {
        switch (this.a) {
            case 0:
                n7fVar.Q((String) obj);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!n7fVar.f) {
                    n7fVar.R();
                    n7fVar.a();
                    n7fVar.h.S0(booleanValue ? PListParser.TAG_TRUE : PListParser.TAG_FALSE);
                    int[] iArr = n7fVar.d;
                    int i = n7fVar.a - 1;
                    iArr[i] = iArr[i] + 1;
                    break;
                } else {
                    xq0.q("Boolean cannot be used as a map key in JSON at path ".concat(n7fVar.getPath()));
                    break;
                }
            case 2:
                n7fVar.P(((Byte) obj).intValue() & KotlinVersion.MAX_COMPONENT_VALUE);
                break;
            case 3:
                n7fVar.Q(((Character) obj).toString());
                break;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
                    if (!n7fVar.f) {
                        n7fVar.R();
                        n7fVar.a();
                        n7fVar.h.S0(Double.toString(doubleValue));
                        int[] iArr2 = n7fVar.d;
                        int i2 = n7fVar.a - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                        break;
                    } else {
                        n7fVar.f = false;
                        n7fVar.z(Double.toString(doubleValue));
                        break;
                    }
                } else {
                    b6e.i(doubleValue, "Numeric values must be finite, but was ");
                    break;
                }
                break;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                String obj2 = f.toString();
                if (!obj2.equals("-Infinity") && !obj2.equals("Infinity") && !obj2.equals("NaN")) {
                    if (!n7fVar.f) {
                        n7fVar.R();
                        n7fVar.a();
                        n7fVar.h.S0(obj2);
                        int[] iArr3 = n7fVar.d;
                        int i3 = n7fVar.a - 1;
                        iArr3[i3] = iArr3[i3] + 1;
                        break;
                    } else {
                        n7fVar.f = false;
                        n7fVar.z(obj2);
                        break;
                    }
                } else {
                    kac.j(f, "Numeric values must be finite, but was ");
                    break;
                }
                break;
            case 6:
                n7fVar.P(((Integer) obj).intValue());
                break;
            case 7:
                n7fVar.P(((Long) obj).longValue());
                break;
            default:
                n7fVar.P(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
