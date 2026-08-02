package defpackage;

import android.graphics.Bitmap;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes7.dex */
public final class ve81 extends zt71 {
    public final dl81 m = new dl81();
    public final dl81 n = new dl81();
    public final qb81 o = new qb81();
    public Inflater p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.zt71
    public final fh81 c(int i, byte[] bArr, boolean z) {
        char c;
        r871 r871Var;
        int i2;
        int i3;
        int u;
        dl81 dl81Var = this.m;
        dl81Var.a = bArr;
        dl81Var.c = i;
        int i4 = 0;
        dl81Var.b = 0;
        char c2 = 255;
        if (i > 0 && (bArr[0] & 255) == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            Inflater inflater = this.p;
            dl81 dl81Var2 = this.n;
            if (rf71.p(dl81Var, dl81Var2, inflater)) {
                byte[] bArr2 = dl81Var2.a;
                int i5 = dl81Var2.c;
                dl81Var.a = bArr2;
                dl81Var.c = i5;
                dl81Var.b = 0;
            }
        }
        qb81 qb81Var = this.o;
        qb81Var.d = 0;
        int[] iArr = qb81Var.b;
        dl81 dl81Var3 = qb81Var.a;
        qb81Var.e = 0;
        qb81Var.f = 0;
        qb81Var.g = 0;
        qb81Var.h = 0;
        qb81Var.i = 0;
        dl81Var3.i(0);
        qb81Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i6 = dl81Var.c;
            if (i6 - dl81Var.b < 3) {
                return new shu(Collections.unmodifiableList(arrayList), 3);
            }
            int s = dl81Var.s();
            int x = dl81Var.x();
            int i7 = dl81Var.b;
            int i8 = i7 + x;
            if (i8 > i6) {
                dl81Var.m(i6);
                c = c2;
                r871Var = null;
            } else {
                char c3 = 128;
                if (s != 128) {
                    switch (s) {
                        case 20:
                            if (x % 5 == 2) {
                                dl81Var.m(i7 + 2);
                                Arrays.fill(iArr, i4);
                                int i9 = x / 5;
                                int i10 = i4;
                                while (i10 < i9) {
                                    int s2 = dl81Var.s();
                                    char c4 = c3;
                                    double s3 = dl81Var.s();
                                    double s4 = dl81Var.s() - 128;
                                    int i11 = (int) ((1.402d * s4) + s3);
                                    double s5 = dl81Var.s() - 128;
                                    int i12 = (int) ((s3 - (0.34414d * s5)) - (s4 * 0.71414d));
                                    int i13 = (int) ((s5 * 1.772d) + s3);
                                    int s6 = dl81Var.s() << 24;
                                    int i14 = rf71.a;
                                    iArr[s2] = Math.max(0, Math.min(i13, 255)) | s6 | (Math.max(0, Math.min(i11, 255)) << 16) | (Math.max(0, Math.min(i12, 255)) << 8);
                                    i10++;
                                    c2 = 255;
                                    c3 = c4;
                                }
                                c = c2;
                                qb81Var.c = true;
                                break;
                            }
                            c = c2;
                            break;
                        case 21:
                            if (x >= 4) {
                                dl81Var.m(i7 + 3);
                                int i15 = x - 4;
                                if (((128 & dl81Var.s()) != 0 ? 1 : i4) != 0) {
                                    if (i15 >= 7 && (u = dl81Var.u()) >= 4) {
                                        qb81Var.h = dl81Var.x();
                                        qb81Var.i = dl81Var.x();
                                        dl81Var3.i(u - 4);
                                        i15 = x - 11;
                                    }
                                }
                                int i16 = dl81Var3.b;
                                int i17 = dl81Var3.c;
                                if (i16 < i17 && i15 > 0) {
                                    int min = Math.min(i15, i17 - i16);
                                    dl81Var.d(i16, min, dl81Var3.a);
                                    dl81Var3.m(i16 + min);
                                }
                            }
                            c = c2;
                            break;
                        case 22:
                            if (x >= 19) {
                                qb81Var.d = dl81Var.x();
                                qb81Var.e = dl81Var.x();
                                dl81Var.m(dl81Var.b + 11);
                                qb81Var.f = dl81Var.x();
                                qb81Var.g = dl81Var.x();
                            }
                            c = c2;
                            break;
                        default:
                            c = c2;
                            break;
                    }
                    i4 = 0;
                    r871Var = null;
                } else {
                    c = c2;
                    if (qb81Var.d == 0 || qb81Var.e == 0 || qb81Var.h == 0 || qb81Var.i == 0 || (i2 = dl81Var3.c) == 0 || dl81Var3.b != i2 || !qb81Var.c) {
                        r871Var = null;
                    } else {
                        dl81Var3.m(0);
                        int i18 = qb81Var.h * qb81Var.i;
                        int[] iArr2 = new int[i18];
                        int i19 = 0;
                        while (i19 < i18) {
                            int s7 = dl81Var3.s();
                            if (s7 != 0) {
                                i3 = i19 + 1;
                                iArr2[i19] = iArr[s7];
                            } else {
                                int s8 = dl81Var3.s();
                                if (s8 != 0) {
                                    i3 = ((s8 & 64) == 0 ? s8 & 63 : ((s8 & 63) << 8) | dl81Var3.s()) + i19;
                                    Arrays.fill(iArr2, i19, i3, (s8 & 128) == 0 ? 0 : iArr[dl81Var3.s()]);
                                }
                            }
                            i19 = i3;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, qb81Var.h, qb81Var.i, Bitmap.Config.ARGB_8888);
                        float f = qb81Var.f;
                        float f2 = qb81Var.d;
                        float f3 = f / f2;
                        float f4 = qb81Var.g;
                        float f5 = qb81Var.e;
                        r871Var = new r871(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, qb81Var.h / f2, qb81Var.i / f5, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
                    }
                    i4 = 0;
                    qb81Var.d = 0;
                    qb81Var.e = 0;
                    qb81Var.f = 0;
                    qb81Var.g = 0;
                    qb81Var.h = 0;
                    qb81Var.i = 0;
                    dl81Var3.i(0);
                    qb81Var.c = false;
                }
                dl81Var.m(i8);
            }
            if (r871Var != null) {
                arrayList.add(r871Var);
            }
            c2 = c;
        }
    }
}
