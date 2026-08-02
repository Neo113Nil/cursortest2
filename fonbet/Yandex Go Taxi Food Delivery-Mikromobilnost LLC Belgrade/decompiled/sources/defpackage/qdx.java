package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import java.io.OutputStream;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncodingException;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes9.dex */
public final class qdx implements xrw, xbi0, qrv {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object w;
    public Object x;

    public qdx(OutputStream outputStream) {
        this.a = 1;
        this.c = outputStream;
        this.w = n67.c.b(512);
        this.x = ui9.c.b(128);
    }

    @Override // defpackage.qrv
    public void b(int i) {
        this.b = i;
    }

    @Override // defpackage.qrv
    public RectF c(float f, float f2, float f3, boolean z) {
        return null;
    }

    @Override // defpackage.qrv
    public float e(int i) {
        zrv zrvVar = (zrv) this.c;
        sb2 sb2Var = zrvVar.b;
        if (!(sb2Var instanceof yrv)) {
            return 0.0f;
        }
        float f = ((yrv) zrvVar.c).z;
        return (q(i) * (((yrv) sb2Var).z - f)) + f;
    }

    @Override // defpackage.qrv
    public bb1 f(int i) {
        zrv zrvVar = (zrv) this.c;
        sb2 sb2Var = zrvVar.c;
        sb2 sb2Var2 = zrvVar.b;
        if (sb2Var2 instanceof xrv) {
            float q0 = ((xrv) sb2Var).y.q0();
            return new vrv(g8e.b(((xrv) sb2Var2).y.q0(), q0, q(i), q0));
        }
        if (!(sb2Var2 instanceof yrv)) {
            w511.b();
            return null;
        }
        yrv yrvVar = (yrv) sb2Var;
        float f = yrvVar.z;
        wrv wrvVar = yrvVar.y;
        float f2 = wrvVar.f + f;
        yrv yrvVar2 = (yrv) sb2Var2;
        float f3 = yrvVar2.z;
        wrv wrvVar2 = yrvVar2.y;
        float b = g8e.b(wrvVar2.f + f3, f2, q(i), f2);
        float f4 = wrvVar.g + f;
        float b2 = g8e.b(wrvVar2.g + f3, f4, q(i), f4);
        float f5 = wrvVar.h;
        return new wrv(b, b2, g8e.b(wrvVar2.h, f5, q(i), f5));
    }

    @Override // defpackage.qrv
    public int g(int i) {
        zrv zrvVar = (zrv) this.c;
        sb2 sb2Var = zrvVar.b;
        if (!(sb2Var instanceof yrv)) {
            return 0;
        }
        yrv yrvVar = (yrv) zrvVar.c;
        return ((Integer) ((ArgbEvaluator) this.w).evaluate(q(i), Integer.valueOf(yrvVar.A), Integer.valueOf(((yrv) sb2Var).A))).intValue();
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return Integer.valueOf(((cne0) this.w).i((String) this.c, this.b));
    }

    @Override // defpackage.qrv
    public void h(float f, int i) {
        s(1.0f - f, i);
        int i2 = this.b;
        if (i < i2 - 1) {
            s(f, i + 1);
        } else if (i2 > 1) {
            s(f, 0);
        }
    }

    @Override // defpackage.xrw
    public void i(char c) {
        byte[] bArr = (byte[]) this.w;
        if (c < 128) {
            if (bArr.length - this.b < 1) {
                n();
            }
            int i = this.b;
            this.b = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.b < 2) {
                n();
            }
            int i2 = this.b;
            int i3 = i2 + 1;
            this.b = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.b = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.b < 1) {
                n();
            }
            int i4 = this.b;
            this.b = i4 + 1;
            bArr[i4] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.b < 3) {
                n();
            }
            int i5 = this.b;
            int i6 = i5 + 1;
            this.b = i6;
            bArr[i5] = (byte) ((c >> '\f') | 224);
            int i7 = i5 + 2;
            this.b = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.b = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            String str = null;
            throw new JsonEncodingException(oyr.j(c, "Unexpected code point: ", ". Check your strings for malformed UTF-8 sequences."), str, str, 6);
        }
        if (bArr.length - this.b < 4) {
            n();
        }
        int i8 = (c >> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        bArr[i9] = (byte) i8;
        int i11 = i9 + 2;
        this.b = i11;
        bArr[i10] = (byte) (((c >> '\f') & 63) | 128);
        int i12 = i9 + 3;
        this.b = i12;
        bArr[i11] = (byte) (((c >> 6) & 63) | 128);
        this.b = i9 + 4;
        bArr[i12] = (byte) ((c & '?') | 128);
    }

    @Override // defpackage.qrv
    public int j(int i) {
        float q = q(i);
        zrv zrvVar = (zrv) this.c;
        return ((Integer) ((ArgbEvaluator) this.w).evaluate(q, Integer.valueOf(zrvVar.c.r()), Integer.valueOf(zrvVar.b.r()))).intValue();
    }

    @Override // defpackage.xrw
    public void k(String str) {
        int i;
        m(0, str.length() + 2);
        char[] cArr = (char[]) this.x;
        cArr[0] = OpenList.CHAR_QUOTE;
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            byte[] bArr = ytu0.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    m(i3, 2);
                    char charAt = str.charAt(i4);
                    byte[] bArr2 = ytu0.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i3 + 1;
                            ((char[]) this.x)[i3] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = ytu0.a[charAt];
                                m(i3, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.x, i3);
                                i3 = str2.length() + i3;
                            } else {
                                char[] cArr2 = (char[]) this.x;
                                cArr2[i3] = CSPStore.UNIQUE_SEPARATOR;
                                cArr2[i3 + 1] = (char) b;
                                i3 += 2;
                            }
                        }
                    } else {
                        i = i3 + 1;
                        ((char[]) this.x)[i3] = charAt;
                    }
                    i3 = i;
                }
                m(i3, 1);
                char[] cArr3 = (char[]) this.x;
                cArr3[i3] = OpenList.CHAR_QUOTE;
                t(cArr3, i3 + 1);
                n();
                return;
            }
            i3++;
        }
        cArr[i2] = OpenList.CHAR_QUOTE;
        t(cArr, length + 2);
        n();
    }

    @Override // defpackage.xrw
    public void l(String str) {
        int length = str.length();
        m(0, length);
        str.getChars(0, length, (char[]) this.x, 0);
        t((char[]) this.x, length);
    }

    public void m(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.x;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.x = Arrays.copyOf(cArr, i3);
        }
    }

    public void n() {
        ((OutputStream) this.c).write((byte[]) this.w, 0, this.b);
        this.b = 0;
    }

    public String o() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.w)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean l = jl40.l(serialDescriptor.getKind(), ovu0.h);
                int[] iArr = (int[]) this.x;
                if (!l) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(Extension.DOT_CHAR);
                        sb.append(serialDescriptor.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.x)[i2]);
                    sb.append("]");
                }
            } else if (obj == o430.A) {
                sb.append("[<debug info disabled>]");
            } else if (obj != kl40.C) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.qrv
    public void onPageSelected(int i) {
        SparseArray sparseArray = (SparseArray) this.x;
        sparseArray.clear();
        sparseArray.put(i, Float.valueOf(1.0f));
    }

    public float q(int i) {
        return ((Number) ((SparseArray) this.x).get(i, Float.valueOf(0.0f))).floatValue();
    }

    public void r() {
        int i = this.b * 2;
        this.w = Arrays.copyOf((Object[]) this.w, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        f73.h(0, 0, 14, (int[]) this.x, iArr);
        this.x = iArr;
    }

    public void s(float f, int i) {
        SparseArray sparseArray = (SparseArray) this.x;
        if (f == 0.0f) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, Float.valueOf(Math.abs(f)));
        }
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        String str = (String) this.c;
        ((cne0) this.x).p(((Number) obj2).intValue(), str);
    }

    public void t(char[] cArr, int i) {
        byte[] bArr = (byte[]) this.w;
        if (i < 0) {
            ny61.g("count < 0");
            return;
        }
        if (i > cArr.length) {
            w511.n(b64.t(i, "count > string.length: ", " > "), cArr.length);
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.b < 1) {
                    n();
                }
                int i3 = this.b;
                int i4 = i3 + 1;
                this.b = i4;
                bArr[i3] = (byte) c;
                i2++;
                int min = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < min) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.b;
                        this.b = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.b < 2) {
                        n();
                    }
                    int i6 = this.b;
                    int i7 = i6 + 1;
                    this.b = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.b = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.b < 3) {
                        n();
                    }
                    int i8 = this.b;
                    int i9 = i8 + 1;
                    this.b = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.b = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.b = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.b < 1) {
                            n();
                        }
                        int i12 = this.b;
                        this.b = i12 + 1;
                        bArr[i12] = 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.b < 4) {
                            n();
                        }
                        int i14 = (i13 >> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
                        int i15 = this.b;
                        int i16 = i15 + 1;
                        this.b = i16;
                        bArr[i15] = (byte) i14;
                        int i17 = i15 + 2;
                        this.b = i17;
                        bArr[i16] = (byte) (((i13 >> 12) & 63) | 128);
                        int i18 = i15 + 3;
                        this.b = i18;
                        bArr[i17] = (byte) (((i13 >> 6) & 63) | 128);
                        this.b = i15 + 4;
                        bArr[i18] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return o();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xrw
    public void writeLong(long j) {
        l(String.valueOf(j));
    }

    public qdx(int i, cne0 cne0Var, cne0 cne0Var2, String str) {
        this.a = 2;
        this.c = str;
        this.w = cne0Var;
        this.b = i;
        this.x = cne0Var2;
    }

    public qdx(zrv zrvVar) {
        this.a = 4;
        this.c = zrvVar;
        this.w = new ArgbEvaluator();
        this.x = new SparseArray();
    }

    public qdx(Context context, a3v a3vVar, x3s x3sVar) {
        this.a = 3;
        this.c = context;
        this.w = a3vVar;
        this.x = x3sVar;
        this.b = xw31.b(mrg0.go_design_s_space, context);
    }

    public qdx(ccx ccxVar) {
        this.a = 0;
        this.c = ccxVar;
        this.w = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.x = iArr;
        this.b = -1;
    }
}
