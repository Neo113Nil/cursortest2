package defpackage;

import android.widget.TextView;

/* loaded from: classes4.dex */
public abstract class v3a1 {
    public static boolean a(dl81 dl81Var, cfr cfrVar, int i, r291 r291Var) {
        int i2;
        int i3;
        int i4;
        int s;
        long t = dl81Var.t();
        long j = t >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i5 = (int) ((t >> 12) & 15);
        int i6 = (int) ((t >> 8) & 15);
        int i7 = (int) ((t >> 4) & 15);
        int i8 = (int) ((t >> 1) & 7);
        boolean z2 = (t & 1) == 1;
        if (i7 <= 7) {
            if (i7 != cfrVar.g - 1) {
                return false;
            }
        } else if (i7 > 10 || cfrVar.g != 2) {
            return false;
        }
        if (!(i8 == 0 || i8 == cfrVar.i) || z2) {
            return false;
        }
        try {
            long y = dl81Var.y();
            if (!z) {
                y *= cfrVar.b;
            }
            r291Var.a = y;
            switch (i5) {
                case 1:
                    i2 = 192;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i3 = i5 - 2;
                    i4 = 576;
                    i2 = i4 << i3;
                    break;
                case 6:
                    s = dl81Var.s();
                    i2 = s + 1;
                    break;
                case 7:
                    s = dl81Var.x();
                    i2 = s + 1;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i3 = i5 - 8;
                    i4 = 256;
                    i2 = i4 << i3;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            if (i2 == -1 || i2 > cfrVar.b) {
                return false;
            }
            int i9 = cfrVar.e;
            if (i6 != 0) {
                if (i6 <= 11) {
                    if (i6 != cfrVar.f) {
                        return false;
                    }
                } else if (i6 != 12) {
                    if (i6 > 14) {
                        return false;
                    }
                    int x = dl81Var.x();
                    if (i6 == 14) {
                        x *= 10;
                    }
                    if (x != i9) {
                        return false;
                    }
                } else if (dl81Var.s() * 1000 != i9) {
                    return false;
                }
            }
            int s2 = dl81Var.s();
            int i10 = dl81Var.b;
            byte[] bArr = dl81Var.a;
            int i11 = i10 - 1;
            int i12 = 0;
            for (int i13 = dl81Var.b; i13 < i11; i13++) {
                i12 = rf71.o[i12 ^ (bArr[i13] & 255)];
            }
            int i14 = rf71.a;
            return s2 == i12;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final void b(jyl jylVar, m0m m0mVar, tls tlsVar, tse tseVar) {
        g0c a = qoi0.a(ooe0.class);
        i3y i3yVar = ryl.c;
        jylVar.a(a, new poe0(m0mVar, tseVar, null, tlsVar, ck91.b(), 0));
        jylVar.a(qoi0.a(ywi0.class), new zwi0(0));
        jylVar.a(qoi0.a(l0c.class), new m0c(0));
    }

    public static final void c(TextView textView, CharSequence charSequence) {
        boolean z;
        if (charSequence != null) {
            textView.setText(charSequence);
            z = true;
        } else {
            z = false;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public static final f530 d(wls wlsVar) {
        return new cly0(wlsVar);
    }
}
