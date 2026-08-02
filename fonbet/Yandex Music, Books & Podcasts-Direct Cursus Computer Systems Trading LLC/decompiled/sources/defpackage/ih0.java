package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class ih0 {
    public final long a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:110:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ih0(mh0 mh0Var, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        c4r c4rVar;
        int i10;
        int i11;
        c4r c4rVar2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        int i12;
        int i13;
        ih0 ih0Var;
        int i14;
        int i15;
        int i16;
        Layout layout;
        mtp[] mtpVarArr;
        CharSequence charSequence2;
        Object obj;
        int i17;
        ynn ynnVar;
        float h;
        float d;
        int b;
        float g;
        float f;
        float d2;
        this.c = mh0Var;
        this.b = i;
        this.a = j;
        if (ga6.j(j) != 0 || ga6.k(j) != 0) {
            tme.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            tme.a("maxLines should be greater than 0");
        }
        ges gesVar = mh0Var.b;
        CharSequence charSequence3 = mh0Var.h;
        if (i2 == 2) {
            i3 = 0;
            charSequence = charSequence3;
            if (!kes.a(gesVar.a.h, v7g.z(0))) {
                charSequence = charSequence3;
                if (!kes.a(gesVar.a.h, kes.c)) {
                    int i18 = gesVar.b.a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i18 != Integer.MIN_VALUE && i18 != 5 && i18 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean e0 = o2g.e0(spannableString, oie.class);
                            charSequence = spannableString;
                            if (!e0) {
                                spannableString.setSpan(new oie(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i3 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.e = charSequence4;
        x5k x5kVar = gesVar.b;
        c4r c4rVar3 = gesVar.a;
        int i19 = x5kVar.a;
        int i20 = 3;
        int i21 = i19 == 1 ? 3 : i19 == 2 ? 4 : i19 == 3 ? 2 : (i19 != 5 && i19 == 6) ? 1 : i3;
        int i22 = i19 == 4 ? 1 : i3;
        int i23 = x5kVar.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i24 = x5kVar.g;
        int i25 = u5g.b;
        int i26 = i24 & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i26 != 1) {
            if (i26 == 2) {
                i4 = i24;
                i5 = i22;
                i6 = 1;
            } else if (i26 == 3) {
                i4 = i24;
                i5 = i22;
                i6 = 2;
            }
            i7 = (i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i7 != 1) {
                if (i7 == 2) {
                    i20 = 1;
                } else if (i7 == 3) {
                    i20 = 2;
                } else if (i7 == 4) {
                }
                i8 = (i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 == 1) {
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        c4rVar = c4rVar3;
                        i10 = i21;
                        i11 = 1;
                        if (i2 != i9) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i2 != 4) {
                                c4rVar2 = c4rVar;
                                truncateAt = null;
                                ads a = a(i10, i5, truncateAt, i, i23, i6, i20, i11, charSequence4);
                                Layout layout2 = a.f;
                                i12 = i10;
                                if (Build.VERSION.SDK_INT < 35 || mh0Var.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    i13 = 2;
                                    ih0Var = this;
                                    i14 = i;
                                    i15 = i12;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i13 = 2;
                                    CharSequence concat = TextUtils.concat(charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length()));
                                    ih0Var = this;
                                    i14 = i;
                                    i15 = i12;
                                    a = ih0Var.a(i15, i5, truncateAt, i14, i23, i6, i20, i11, concat);
                                }
                                int i27 = a.g;
                                if (i2 == i13) {
                                    i16 = i13;
                                    if (a.a() > ga6.h(j) && i14 > 1) {
                                        int h2 = ga6.h(j);
                                        int i28 = 0;
                                        while (true) {
                                            if (i28 >= i27) {
                                                break;
                                            }
                                            if (a.e(i28) > h2) {
                                                i27 = i28;
                                                break;
                                            }
                                            i28++;
                                        }
                                        if (i27 >= 0 && i27 != ih0Var.b) {
                                            a = ih0Var.a(i15, i5, truncateAt, i27 < 1 ? 1 : i27, i23, i6, i20, i11, (CharSequence) ih0Var.e);
                                        }
                                        ih0Var.d = a;
                                        ((mh0) ih0Var.c).g.c(c4rVar2.a.c(), (Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32), c4rVar2.a.b());
                                        layout = ((ads) ih0Var.d).f;
                                        if (layout.getText() instanceof Spanned) {
                                            CharSequence text = layout.getText();
                                            text.getClass();
                                            Spanned spanned = (Spanned) text;
                                            if (spanned.nextSpanTransition(-1, spanned.length(), mtp.class) != spanned.length()) {
                                                CharSequence text2 = layout.getText();
                                                text2.getClass();
                                                mtpVarArr = (mtp[]) ((Spanned) text2).getSpans(0, layout.getText().length(), mtp.class);
                                                if (mtpVarArr != null) {
                                                    int i29 = 0;
                                                    while (i29 < mtpVarArr.length) {
                                                        int i30 = i29 + 1;
                                                        try {
                                                            mtpVarArr[i29].c.setValue(new nmq((Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32)));
                                                            i29 = i30;
                                                        } catch (ArrayIndexOutOfBoundsException e) {
                                                            wvs.h(e.getMessage());
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                charSequence2 = (CharSequence) ih0Var.e;
                                                if (charSequence2 instanceof Spanned) {
                                                    Spanned spanned2 = (Spanned) charSequence2;
                                                    Object[] spans = spanned2.getSpans(0, charSequence2.length(), ssk.class);
                                                    ArrayList arrayList = new ArrayList(spans.length);
                                                    int length2 = spans.length;
                                                    int i31 = 0;
                                                    while (i31 < length2) {
                                                        ssk sskVar = (ssk) spans[i31];
                                                        int spanStart = spanned2.getSpanStart(sskVar);
                                                        int spanEnd = spanned2.getSpanEnd(sskVar);
                                                        int lineForOffset = ((ads) ih0Var.d).f.getLineForOffset(spanStart);
                                                        boolean z = lineForOffset >= ih0Var.b;
                                                        boolean z2 = ((ads) ih0Var.d).f.getEllipsisCount(lineForOffset) > 0 && spanEnd > ((ads) ih0Var.d).f.getEllipsisStart(lineForOffset);
                                                        boolean z3 = spanEnd > ((ads) ih0Var.d).f(lineForOffset);
                                                        if (z2 || z3 || z) {
                                                            i17 = i16;
                                                            ynnVar = null;
                                                        } else {
                                                            int ordinal = (((ads) ih0Var.d).f.isRtlCharAt(spanStart) ? i2o.b : i2o.a).ordinal();
                                                            if (ordinal == 0) {
                                                                h = ((ads) ih0Var.d).h(spanStart, false);
                                                            } else {
                                                                if (ordinal != 1) {
                                                                    b6e.s();
                                                                    throw null;
                                                                }
                                                                float h3 = ((ads) ih0Var.d).h(spanStart, false);
                                                                if (!sskVar.j) {
                                                                    tme.c("PlaceholderSpan is not laid out yet.");
                                                                }
                                                                h = h3 - sskVar.h;
                                                            }
                                                            if (!sskVar.j) {
                                                                tme.c("PlaceholderSpan is not laid out yet.");
                                                            }
                                                            float f2 = sskVar.h + h;
                                                            ads adsVar = (ads) ih0Var.d;
                                                            switch (sskVar.f) {
                                                                case 0:
                                                                    i17 = i16;
                                                                    d = adsVar.d(lineForOffset);
                                                                    b = sskVar.b();
                                                                    g = d - b;
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                case 1:
                                                                    i17 = i16;
                                                                    g = adsVar.g(lineForOffset);
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                case 2:
                                                                    i17 = i16;
                                                                    d = adsVar.e(lineForOffset);
                                                                    b = sskVar.b();
                                                                    g = d - b;
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                case 3:
                                                                    i17 = i16;
                                                                    g = ((adsVar.e(lineForOffset) + adsVar.g(lineForOffset)) - sskVar.b()) / i17;
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                case 4:
                                                                    f = sskVar.a().ascent;
                                                                    d2 = adsVar.d(lineForOffset);
                                                                    g = d2 + f;
                                                                    i17 = i16;
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                case 5:
                                                                    g = (adsVar.d(lineForOffset) + sskVar.a().descent) - sskVar.b();
                                                                    i17 = i16;
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                case 6:
                                                                    Paint.FontMetricsInt a2 = sskVar.a();
                                                                    f = ((a2.ascent + a2.descent) - sskVar.b()) / 2;
                                                                    d2 = adsVar.d(lineForOffset);
                                                                    g = d2 + f;
                                                                    i17 = i16;
                                                                    ynnVar = new ynn(h, g, f2, sskVar.b() + g);
                                                                    break;
                                                                default:
                                                                    xq0.q("unexpected verticalAlignment");
                                                                    throw null;
                                                            }
                                                        }
                                                        arrayList.add(ynnVar);
                                                        i31++;
                                                        i16 = i17;
                                                    }
                                                    obj = arrayList;
                                                } else {
                                                    obj = c5b.a;
                                                }
                                                ih0Var.f = obj;
                                            }
                                        }
                                        mtpVarArr = null;
                                        if (mtpVarArr != null) {
                                        }
                                        charSequence2 = (CharSequence) ih0Var.e;
                                        if (charSequence2 instanceof Spanned) {
                                        }
                                        ih0Var.f = obj;
                                    }
                                } else {
                                    i16 = i13;
                                }
                                ih0Var.d = a;
                                ((mh0) ih0Var.c).g.c(c4rVar2.a.c(), (Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32), c4rVar2.a.b());
                                layout = ((ads) ih0Var.d).f;
                                if (layout.getText() instanceof Spanned) {
                                }
                                mtpVarArr = null;
                                if (mtpVarArr != null) {
                                }
                                charSequence2 = (CharSequence) ih0Var.e;
                                if (charSequence2 instanceof Spanned) {
                                }
                                ih0Var.f = obj;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        c4rVar2 = c4rVar;
                        truncateAt = truncateAt2;
                        ads a3 = a(i10, i5, truncateAt, i, i23, i6, i20, i11, charSequence4);
                        Layout layout22 = a3.f;
                        i12 = i10;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        i13 = 2;
                        ih0Var = this;
                        i14 = i;
                        i15 = i12;
                        int i272 = a3.g;
                        if (i2 == i13) {
                        }
                        ih0Var.d = a3;
                        ((mh0) ih0Var.c).g.c(c4rVar2.a.c(), (Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32), c4rVar2.a.b());
                        layout = ((ads) ih0Var.d).f;
                        if (layout.getText() instanceof Spanned) {
                        }
                        mtpVarArr = null;
                        if (mtpVarArr != null) {
                        }
                        charSequence2 = (CharSequence) ih0Var.e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        ih0Var.f = obj;
                    }
                }
                c4rVar = c4rVar3;
                i10 = i21;
                i11 = i3;
                if (i2 != i9) {
                }
                c4rVar2 = c4rVar;
                truncateAt = truncateAt2;
                ads a32 = a(i10, i5, truncateAt, i, i23, i6, i20, i11, charSequence4);
                Layout layout222 = a32.f;
                i12 = i10;
                if (Build.VERSION.SDK_INT < 35) {
                }
                i13 = 2;
                ih0Var = this;
                i14 = i;
                i15 = i12;
                int i2722 = a32.g;
                if (i2 == i13) {
                }
                ih0Var.d = a32;
                ((mh0) ih0Var.c).g.c(c4rVar2.a.c(), (Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32), c4rVar2.a.b());
                layout = ((ads) ih0Var.d).f;
                if (layout.getText() instanceof Spanned) {
                }
                mtpVarArr = null;
                if (mtpVarArr != null) {
                }
                charSequence2 = (CharSequence) ih0Var.e;
                if (charSequence2 instanceof Spanned) {
                }
                ih0Var.f = obj;
            }
            i20 = i3;
            i8 = (i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i8 == 1) {
            }
            c4rVar = c4rVar3;
            i10 = i21;
            i11 = i3;
            if (i2 != i9) {
            }
            c4rVar2 = c4rVar;
            truncateAt = truncateAt2;
            ads a322 = a(i10, i5, truncateAt, i, i23, i6, i20, i11, charSequence4);
            Layout layout2222 = a322.f;
            i12 = i10;
            if (Build.VERSION.SDK_INT < 35) {
            }
            i13 = 2;
            ih0Var = this;
            i14 = i;
            i15 = i12;
            int i27222 = a322.g;
            if (i2 == i13) {
            }
            ih0Var.d = a322;
            ((mh0) ih0Var.c).g.c(c4rVar2.a.c(), (Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32), c4rVar2.a.b());
            layout = ((ads) ih0Var.d).f;
            if (layout.getText() instanceof Spanned) {
            }
            mtpVarArr = null;
            if (mtpVarArr != null) {
            }
            charSequence2 = (CharSequence) ih0Var.e;
            if (charSequence2 instanceof Spanned) {
            }
            ih0Var.f = obj;
        }
        i4 = i24;
        i5 = i22;
        i6 = i3;
        i7 = (i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i7 != 1) {
        }
        i20 = i3;
        i8 = (i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i8 == 1) {
        }
        c4rVar = c4rVar3;
        i10 = i21;
        i11 = i3;
        if (i2 != i9) {
        }
        c4rVar2 = c4rVar;
        truncateAt = truncateAt2;
        ads a3222 = a(i10, i5, truncateAt, i, i23, i6, i20, i11, charSequence4);
        Layout layout22222 = a3222.f;
        i12 = i10;
        if (Build.VERSION.SDK_INT < 35) {
        }
        i13 = 2;
        ih0Var = this;
        i14 = i;
        i15 = i12;
        int i272222 = a3222.g;
        if (i2 == i13) {
        }
        ih0Var.d = a3222;
        ((mh0) ih0Var.c).g.c(c4rVar2.a.c(), (Float.floatToRawIntBits(ih0Var.b()) & 4294967295L) | (Float.floatToRawIntBits(ih0Var.d()) << 32), c4rVar2.a.b());
        layout = ((ads) ih0Var.d).f;
        if (layout.getText() instanceof Spanned) {
        }
        mtpVarArr = null;
        if (mtpVarArr != null) {
        }
        charSequence2 = (CharSequence) ih0Var.e;
        if (charSequence2 instanceof Spanned) {
        }
        ih0Var.f = obj;
    }

    public ads a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        duk dukVar;
        float d = d();
        mh0 mh0Var = (mh0) this.c;
        yi0 yi0Var = mh0Var.g;
        int i8 = mh0Var.l;
        bpf bpfVar = mh0Var.i;
        ges gesVar = mh0Var.b;
        jh0 jh0Var = kh0.a;
        nuk nukVar = gesVar.c;
        return new ads(charSequence, d, yi0Var, i, truncateAt, i8, (nukVar == null || (dukVar = nukVar.b) == null) ? false : dukVar.a, i3, i5, i6, i7, i4, i2, bpfVar);
    }

    public float b() {
        return ((ads) this.d).a();
    }

    public long c(ynn ynnVar, int i, e7o e7oVar) {
        kbp sodVar;
        int i2;
        int[] iArr;
        ads adsVar = (ads) this.d;
        RectF E = uwf.E(ynnVar);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        y5 y5Var = new y5(2, e7oVar);
        Layout layout = adsVar.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArr = sb.j(adsVar, E, i3, y5Var);
        } else {
            gs4 c = adsVar.c();
            if (i3 == 1) {
                sodVar = new atn(19, layout.getText(), adsVar.j());
            } else {
                CharSequence text = layout.getText();
                sodVar = i4 >= 29 ? new sod(text, adsVar.a) : new tod(text);
            }
            kbp kbpVar = sodVar;
            int lineForVertical = layout.getLineForVertical((int) E.top);
            if (E.top <= adsVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < adsVar.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) E.bottom);
                if (lineForVertical2 != 0 || E.bottom >= adsVar.g(0)) {
                    int I = v3g.I(adsVar, layout, c, i5, E, kbpVar, y5Var, true);
                    while (true) {
                        i2 = i5;
                        if (I != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        I = v3g.I(adsVar, layout, c, i5, E, kbpVar, y5Var, true);
                    }
                    if (I != -1) {
                        int i6 = lineForVertical2;
                        int I2 = v3g.I(adsVar, layout, c, i6, E, kbpVar, y5Var, false);
                        while (I2 == -1 && i2 < i6) {
                            i6--;
                            I2 = v3g.I(adsVar, layout, c, i6, E, kbpVar, y5Var, false);
                        }
                        if (I2 != -1) {
                            iArr = new int[]{kbpVar.g(I + 1), kbpVar.h(I2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? rds.b : y5g.P(iArr[0], iArr[1]);
    }

    public float d() {
        return ga6.i(this.a);
    }

    public void e(mu3 mu3Var) {
        Canvas a = vd0.a(mu3Var);
        ads adsVar = (ads) this.d;
        if (adsVar.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = adsVar.h;
        if (a.getClipBounds(adsVar.p)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            q9s q9sVar = eds.a;
            q9sVar.a = a;
            adsVar.f.draw(q9sVar);
            if (i != 0) {
                a.translate(0.0f, (-1) * i);
            }
        }
        if (adsVar.d) {
            a.restore();
        }
    }

    public void f(mu3 mu3Var, long j, otp otpVar, aas aasVar, kpa kpaVar, int i) {
        yi0 yi0Var = ((mh0) this.c).g;
        int i2 = yi0Var.c;
        yi0Var.d(j);
        yi0Var.f(otpVar);
        yi0Var.g(aasVar);
        yi0Var.e(kpaVar);
        yi0Var.b(i);
        e(mu3Var);
        yi0Var.b(i2);
    }

    public void g(mu3 mu3Var, ai3 ai3Var, float f, otp otpVar, aas aasVar, kpa kpaVar) {
        yi0 yi0Var = ((mh0) this.c).g;
        int i = yi0Var.c;
        float d = d();
        float b = b();
        yi0Var.c(ai3Var, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        yi0Var.f(otpVar);
        yi0Var.g(aasVar);
        yi0Var.e(kpaVar);
        yi0Var.b(3);
        e(mu3Var);
        yi0Var.b(i);
    }

    public ih0(long j, fwk fwkVar, String str, int i, dxb dxbVar, xnf xnfVar) {
        fwkVar.getClass();
        this.a = j;
        this.c = fwkVar;
        this.d = str;
        this.b = i;
        this.e = dxbVar;
        this.f = xnfVar;
    }
}
