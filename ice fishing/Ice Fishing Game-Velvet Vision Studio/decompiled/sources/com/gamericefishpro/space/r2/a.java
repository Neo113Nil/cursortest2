package com.gamericefishpro.space.r2;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final com.gamericefishpro.space.y2.c a;
    public final int b;
    public final long c;
    public final com.gamericefishpro.space.s2.i d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Code duplicated, block: B:102:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0196  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0209  */
    /* JADX WARN: Code duplicated, block: B:140:0x020b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0227  */
    /* JADX WARN: Code duplicated, block: B:144:0x0241  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245 A[LOOP:1: B:145:0x0243->B:146:0x0245, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0270  */
    /* JADX WARN: Code duplicated, block: B:150:0x0274  */
    /* JADX WARN: Code duplicated, block: B:152:0x028c  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0241, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:150:0x0274, please report this as an issue */
    public a(com.gamericefishpro.space.y2.c cVar, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        char c;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        com.gamericefishpro.space.s2.i iVarA;
        int i7;
        a aVar;
        int i8;
        int i9;
        int i10;
        Layout layout;
        Spanned spanned;
        com.gamericefishpro.space.a3.c[] cVarArr;
        CharSequence charSequence2;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        Object obj;
        int spanEnd;
        int lineForOffset;
        boolean z;
        boolean z2;
        boolean z3;
        com.gamericefishpro.space.n1.c cVar2;
        float fG;
        int i12;
        int i13;
        this.a = cVar;
        this.b = i;
        this.c = j;
        if (com.gamericefishpro.space.c3.a.i(j) != 0 || com.gamericefishpro.space.c3.a.j(j) != 0) {
            com.gamericefishpro.space.w2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            com.gamericefishpro.space.w2.a.a("maxLines should be greater than 0");
        }
        i0 i0Var = cVar.e;
        CharSequence charSequence3 = cVar.A;
        if (i2 == 2) {
            i3 = 0;
            if (!com.gamericefishpro.space.c3.n.a(i0Var.a.h, com.gamericefishpro.space.hj.c.C(0)) && !com.gamericefishpro.space.c3.n.a(i0Var.a.h, com.gamericefishpro.space.c3.n.c) && (i13 = i0Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence3.length() != 0) {
                Spannable spannableString = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                if (spannableString == null) {
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    spannableString = new SpannableString(charSequence3);
                }
                charSequence = charSequence3;
                charSequence = charSequence3;
                Spannable spannable = spannableString;
                boolean zC = com.gamericefishpro.space.s2.f.c(spannable, com.gamericefishpro.space.t2.c.class);
                charSequence = spannable;
                if (!zC) {
                    spannable.setSpan(new com.gamericefishpro.space.t2.c(), spannable.length() - 1, spannable.length() - 1, 33);
                    charSequence = spannable;
                }
            }
        } else {
            i3 = 0;
            charSequence = charSequence3;
        }
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        CharSequence charSequence4 = charSequence;
        this.e = charSequence4;
        p pVar = i0Var.b;
        b0 b0Var = i0Var.a;
        int i14 = pVar.a;
        int i15 = 3;
        int i16 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i17 = i14 == 4 ? 1 : i3;
        int i18 = pVar.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = pVar.g;
        int i20 = i19 & 255;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & 255;
        if (i21 == 1) {
            i15 = i3;
        } else if (i21 == 2) {
            i15 = 1;
        } else if (i21 == 3) {
            i15 = 2;
        } else if (i21 != 4) {
            i15 = i3;
        }
        int i22 = (i19 >> 16) & 255;
        if (i22 != 1) {
            i5 = 2;
            i6 = i22 == 2 ? 1 : i6;
            if (i2 == i5) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i2 == 5) {
                    if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c = ' ';
                        truncateAt = null;
                    }
                    iVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
                    Layout layout2 = iVarA.e;
                    i7 = i16;
                    if (Build.VERSION.SDK_INT < 35 || cVar.z.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        aVar = this;
                        i8 = i;
                        i9 = i7;
                        i10 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i10 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        a aVar2 = this;
                        i8 = i;
                        i9 = i7;
                        iVarA = aVar2.a(i9, i17, truncateAt, i8, i18, i4, i15, i6, TextUtils.concat(charSequenceArr));
                        aVar = aVar2;
                    }
                    int i23 = iVarA.f;
                    if (i2 == i10 || iVarA.a() <= com.gamericefishpro.space.c3.a.g(j) || i8 <= 1) {
                        aVar.d = iVarA;
                    } else {
                        int iG = com.gamericefishpro.space.c3.a.g(j);
                        int i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                i24 = i23;
                                break;
                            } else if (iVarA.d(i24) > iG) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i24 >= 0 && i24 != aVar.b) {
                            iVarA = aVar.a(i9, i17, truncateAt, i24 < 1 ? 1 : i24, i18, i4, i15, i6, aVar.e);
                        }
                        aVar.d = iVarA;
                    }
                    aVar.a.z.c(b0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c), b0Var.a.a());
                    layout = aVar.d.e;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        Intrinsics.c(text, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), com.gamericefishpro.space.a3.c.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            Intrinsics.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            cVarArr = (com.gamericefishpro.space.a3.c[]) ((Spanned) text2).getSpans(0, layout.getText().length(), com.gamericefishpro.space.a3.c.class);
                        } else {
                            cVarArr = null;
                        }
                    } else {
                        cVarArr = null;
                    }
                    if (cVarArr != null) {
                        for (com.gamericefishpro.space.a3.c cVar3 : cVarArr) {
                            cVar3.i.setValue(new com.gamericefishpro.space.n1.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c)));
                        }
                    }
                    charSequence2 = aVar.e;
                    if (charSequence2 instanceof Spanned) {
                        spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), com.gamericefishpro.space.t2.i.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            com.gamericefishpro.space.t2.i iVar = (com.gamericefishpro.space.t2.i) obj2;
                            int spanStart = spanned2.getSpanStart(iVar);
                            spanEnd = spanned2.getSpanEnd(iVar);
                            lineForOffset = aVar.d.e.getLineForOffset(spanStart);
                            if (lineForOffset >= aVar.b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (aVar.d.e.getEllipsisCount(lineForOffset) > 0 || spanEnd <= aVar.d.e.getEllipsisStart(lineForOffset) + aVar.d.e.getLineStart(lineForOffset)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (spanEnd > aVar.d.e(lineForOffset)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && !z3 && !z) {
                                int iOrdinal = (aVar.d.e.isRtlCharAt(spanStart) ? com.gamericefishpro.space.b3.j.e : com.gamericefishpro.space.b3.j.d).ordinal();
                                if (iOrdinal == 0) {
                                    fG = aVar.d.g(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new com.gamericefishpro.space.oh.k();
                                    }
                                    float fG2 = aVar.d.g(spanStart, false);
                                    if (!iVar.v) {
                                        com.gamericefishpro.space.w2.a.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fG = fG2 - iVar.e;
                                }
                                if (!iVar.v) {
                                    com.gamericefishpro.space.w2.a.b("PlaceholderSpan is not laid out yet.");
                                }
                                float f = iVar.e + fG;
                                float fC = aVar.d.c(lineForOffset) - iVar.b();
                                cVar2 = new com.gamericefishpro.space.n1.c(fG, fC, f, iVar.b() + fC);
                            }
                            arrayList.add(cVar2);
                        }
                        obj = arrayList;
                    } else {
                        obj = com.gamericefishpro.space.ph.g0.d;
                    }
                    aVar.f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c = ' ';
            truncateAt = truncateAt2;
            iVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
            Layout layout3 = iVarA.e;
            i7 = i16;
            if (Build.VERSION.SDK_INT < 35) {
                aVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            } else {
                aVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            }
            int i25 = iVarA.f;
            if (i2 == i10) {
                aVar.d = iVarA;
            } else {
                aVar.d = iVarA;
            }
            aVar.a.z.c(b0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c), b0Var.a.a());
            layout = aVar.d.e;
            if (layout.getText() instanceof Spanned) {
                cVarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                Intrinsics.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), com.gamericefishpro.space.a3.c.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    Intrinsics.c(text4, "null cannot be cast to non-null type android.text.Spanned");
                    cVarArr = (com.gamericefishpro.space.a3.c[]) ((Spanned) text4).getSpans(0, layout.getText().length(), com.gamericefishpro.space.a3.c.class);
                } else {
                    cVarArr = null;
                }
            }
            if (cVarArr != null) {
                while (i12 < r2) {
                    cVar3.i.setValue(new com.gamericefishpro.space.n1.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c)));
                }
            }
            charSequence2 = aVar.e;
            if (charSequence2 instanceof Spanned) {
                obj = com.gamericefishpro.space.ph.g0.d;
            } else {
                spanned2 = (Spanned) charSequence2;
                Object[] spans2 = spanned2.getSpans(0, charSequence2.length(), com.gamericefishpro.space.t2.i.class);
                arrayList = new ArrayList(spans2.length);
                while (i11 < r4) {
                    com.gamericefishpro.space.t2.i iVar2 = (com.gamericefishpro.space.t2.i) obj2;
                    int spanStart2 = spanned2.getSpanStart(iVar2);
                    spanEnd = spanned2.getSpanEnd(iVar2);
                    lineForOffset = aVar.d.e.getLineForOffset(spanStart2);
                    if (lineForOffset >= aVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (aVar.d.e.getEllipsisCount(lineForOffset) > 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > aVar.d.e(lineForOffset)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar2 = z2 ? null : null;
                    arrayList.add(cVar2);
                }
                obj = arrayList;
            }
            aVar.f = obj;
        }
        i5 = 2;
        i6 = i3;
        if (i2 == i5) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 == 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c = ' ';
                    truncateAt = null;
                }
                iVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
                Layout layout4 = iVarA.e;
                i7 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                    aVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                } else {
                    aVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                }
                int i26 = iVarA.f;
                if (i2 == i10) {
                    aVar.d = iVarA;
                } else {
                    aVar.d = iVarA;
                }
                aVar.a.z.c(b0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c), b0Var.a.a());
                layout = aVar.d.e;
                if (layout.getText() instanceof Spanned) {
                    cVarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    Intrinsics.c(text5, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), com.gamericefishpro.space.a3.c.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        Intrinsics.c(text6, "null cannot be cast to non-null type android.text.Spanned");
                        cVarArr = (com.gamericefishpro.space.a3.c[]) ((Spanned) text6).getSpans(0, layout.getText().length(), com.gamericefishpro.space.a3.c.class);
                    } else {
                        cVarArr = null;
                    }
                }
                if (cVarArr != null) {
                    while (i12 < r2) {
                        cVar3.i.setValue(new com.gamericefishpro.space.n1.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c)));
                    }
                }
                charSequence2 = aVar.e;
                if (charSequence2 instanceof Spanned) {
                    obj = com.gamericefishpro.space.ph.g0.d;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    Object[] spans3 = spanned2.getSpans(0, charSequence2.length(), com.gamericefishpro.space.t2.i.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i11 < r4) {
                        com.gamericefishpro.space.t2.i iVar3 = (com.gamericefishpro.space.t2.i) obj2;
                        int spanStart3 = spanned2.getSpanStart(iVar3);
                        spanEnd = spanned2.getSpanEnd(iVar3);
                        lineForOffset = aVar.d.e.getLineForOffset(spanStart3);
                        if (lineForOffset >= aVar.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (aVar.d.e.getEllipsisCount(lineForOffset) > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > aVar.d.e(lineForOffset)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                        }
                        arrayList.add(cVar2);
                    }
                    obj = arrayList;
                }
                aVar.f = obj;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c = ' ';
        truncateAt = truncateAt2;
        iVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
        Layout layout5 = iVarA.e;
        i7 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            aVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        } else {
            aVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        }
        int i27 = iVarA.f;
        if (i2 == i10) {
            aVar.d = iVarA;
        } else {
            aVar.d = iVarA;
        }
        aVar.a.z.c(b0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c), b0Var.a.a());
        layout = aVar.d.e;
        if (layout.getText() instanceof Spanned) {
            cVarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            Intrinsics.c(text7, "null cannot be cast to non-null type android.text.Spanned");
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), com.gamericefishpro.space.a3.c.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                Intrinsics.c(text8, "null cannot be cast to non-null type android.text.Spanned");
                cVarArr = (com.gamericefishpro.space.a3.c[]) ((Spanned) text8).getSpans(0, layout.getText().length(), com.gamericefishpro.space.a3.c.class);
            } else {
                cVarArr = null;
            }
        }
        if (cVarArr != null) {
            while (i12 < r2) {
                cVar3.i.setValue(new com.gamericefishpro.space.n1.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.c())) << c)));
            }
        }
        charSequence2 = aVar.e;
        if (charSequence2 instanceof Spanned) {
            obj = com.gamericefishpro.space.ph.g0.d;
        } else {
            spanned2 = (Spanned) charSequence2;
            Object[] spans4 = spanned2.getSpans(0, charSequence2.length(), com.gamericefishpro.space.t2.i.class);
            arrayList = new ArrayList(spans4.length);
            while (i11 < r4) {
                com.gamericefishpro.space.t2.i iVar4 = (com.gamericefishpro.space.t2.i) obj2;
                int spanStart4 = spanned2.getSpanStart(iVar4);
                spanEnd = spanned2.getSpanEnd(iVar4);
                lineForOffset = aVar.d.e.getLineForOffset(spanStart4);
                if (lineForOffset >= aVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (aVar.d.e.getEllipsisCount(lineForOffset) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > aVar.d.e(lineForOffset)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(cVar2);
            }
            obj = arrayList;
        }
        aVar.f = obj;
    }

    public final com.gamericefishpro.space.s2.i a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        r rVar;
        float fC = c();
        com.gamericefishpro.space.y2.c cVar = this.a;
        com.gamericefishpro.space.y2.e eVar = cVar.z;
        int i8 = cVar.E;
        com.gamericefishpro.space.s2.d dVar = cVar.B;
        i0 i0Var = cVar.e;
        com.gamericefishpro.space.y2.a aVar = com.gamericefishpro.space.y2.b.a;
        s sVar = i0Var.c;
        return new com.gamericefishpro.space.s2.i(charSequence, fC, eVar, i, truncateAt, i8, (sVar == null || (rVar = sVar.a) == null) ? false : rVar.a, i3, i5, i6, i7, i4, i2, dVar);
    }

    public final float b() {
        return this.d.a();
    }

    public final float c() {
        return com.gamericefishpro.space.c3.a.h(this.c);
    }

    public final void d(com.gamericefishpro.space.o1.q qVar) {
        Canvas canvasA = com.gamericefishpro.space.o1.c.a(qVar);
        com.gamericefishpro.space.s2.i iVar = this.d;
        if (iVar.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), b());
        }
        int i = iVar.g;
        if (canvasA.getClipBounds(iVar.o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = com.gamericefishpro.space.s2.j.a;
            Object hVar = threadLocal.get();
            if (hVar == null) {
                hVar = new com.gamericefishpro.space.s2.h();
                threadLocal.set(hVar);
            }
            com.gamericefishpro.space.s2.h hVar2 = (com.gamericefishpro.space.s2.h) hVar;
            hVar2.a = canvasA;
            try {
                iVar.e.draw(hVar2);
                hVar2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1) * i);
                }
            } catch (Throwable th) {
                hVar2.a = null;
                throw th;
            }
        }
        if (iVar.d) {
            canvasA.restore();
        }
    }
}
