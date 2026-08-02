package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class zzw0 {
    public static final zzw0[] i = {new zzw0(false, 3, 5, 8, 8, 1, 3, 5), new zzw0(false, 5, 7, 10, 10, 1, 5, 7), new zzw0(true, 5, 7, 16, 6, 1, 5, 7), new zzw0(false, 8, 10, 12, 12, 1, 8, 10), new zzw0(true, 10, 11, 14, 6, 2, 10, 11), new zzw0(false, 12, 12, 14, 14, 1, 12, 12), new zzw0(true, 16, 14, 24, 10, 1, 16, 14), new zzw0(false, 18, 14, 16, 16, 1, 18, 14), new zzw0(false, 22, 18, 18, 18, 1, 22, 18), new zzw0(true, 22, 18, 16, 10, 2, 22, 18), new zzw0(false, 30, 20, 20, 20, 1, 30, 20), new zzw0(true, 32, 24, 16, 14, 2, 32, 24), new zzw0(false, 36, 24, 22, 22, 1, 36, 24), new zzw0(false, 44, 28, 24, 24, 1, 44, 28), new zzw0(true, 49, 28, 22, 14, 2, 49, 28), new zzw0(false, 62, 36, 14, 14, 4, 62, 36), new zzw0(false, 86, 42, 16, 16, 4, 86, 42), new zzw0(false, 114, 48, 18, 18, 4, 114, 48), new zzw0(false, 144, 56, 20, 20, 4, 144, 56), new zzw0(false, 174, 68, 22, 22, 4, 174, 68), new zzw0(false, 204, 84, 24, 24, 4, 102, 42), new zzw0(false, 280, 112, 14, 14, 16, PollMessageDraft.MAX_ANSWER_LENGTH, 56), new zzw0(false, 368, 144, 16, 16, 16, 92, 36), new zzw0(false, 456, 192, 18, 18, 16, 114, 48), new zzw0(false, 576, 224, 20, 20, 16, 144, 56), new zzw0(false, 696, 272, 22, 22, 16, 174, 68), new zzw0(false, 816, 336, 24, 24, 16, HProv.PP_LCD_QUERY, 56), new zzw0(false, 1050, 408, 18, 18, 36, 175, 68), new zzw0(false, 1304, 496, 20, 20, 36, HProv.PP_HANDLE_COUNT, 62), new mog(false, 1558, 620, 22, 22, 36, -1, 62)};
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public zzw0(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public static zzw0 e(int i2, SymbolShapeHint symbolShapeHint) {
        for (int i3 = 0; i3 < 30; i3++) {
            zzw0 zzw0Var = i[i3];
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && zzw0Var.a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || zzw0Var.a) && i2 <= zzw0Var.b)) {
                return zzw0Var;
            }
        }
        ny61.g(oyr.i(i2, "Can't find a symbol arrangement that matches the message. Data codewords: "));
        return null;
    }

    public int a(int i2) {
        return this.g;
    }

    public final int b() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                ny61.r("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i3;
    }

    public int c() {
        return this.b / this.g;
    }

    public final int d() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        ny61.r("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i2 = this.d;
        sb.append(i2);
        sb.append('x');
        int i3 = this.e;
        sb.append(i3);
        sb.append(", symbol size ");
        sb.append((b() * 2) + (b() * i2));
        sb.append('x');
        sb.append((d() * 2) + (d() * i3));
        sb.append(", symbol data size ");
        sb.append(b() * i2);
        sb.append('x');
        sb.append(d() * i3);
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
