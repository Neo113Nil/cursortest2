package h2;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o2.d f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2608c;

    /* renamed from: d, reason: collision with root package name */
    public final i2.k f2609d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f2610e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2611f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(o2.d dVar, int i10, int i11, long j3) {
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        a0 a0Var;
        int i19;
        int i20;
        int i21;
        char c3;
        a0 a0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        i2.k a6;
        int i22;
        a aVar;
        int i23;
        int i24;
        int i25;
        Layout layout;
        q2.b[] bVarArr;
        CharSequence charSequence2;
        Object obj;
        e1.c cVar;
        float g8;
        this.f2606a = dVar;
        this.f2607b = i10;
        this.f2608c = j3;
        if (s2.a.i(j3) != 0 || s2.a.j(j3) != 0) {
            m2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            m2.a.a("maxLines should be greater than 0");
        }
        h0 h0Var = dVar.f5154b;
        CharSequence charSequence3 = dVar.f5160h;
        if (i11 == 2) {
            i12 = 0;
            charSequence = charSequence3;
            if (!s2.n.a(h0Var.f2674a.f2619h, bc.a0.t(0))) {
                charSequence = charSequence3;
                if (!s2.n.a(h0Var.f2674a.f2619h, s2.n.f6401c)) {
                    int i26 = h0Var.f2675b.f2696a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i26 != Integer.MIN_VALUE && i26 != 5 && i26 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean c7 = i2.h.c(spannableString, j2.c.class);
                            charSequence = spannableString;
                            if (!c7) {
                                spannableString.setSpan(new j2.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i12 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f2610e = charSequence4;
        q qVar = h0Var.f2675b;
        a0 a0Var3 = h0Var.f2674a;
        int i27 = qVar.f2696a;
        int i28 = 3;
        int i29 = i27 == 1 ? 3 : i27 == 2 ? 4 : i27 == 3 ? 2 : (i27 != 5 && i27 == 6) ? 1 : i12;
        int i30 = i27 == 4 ? 1 : i12;
        int i31 = qVar.f2703h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i12;
        int i32 = qVar.f2702g;
        int i33 = i32 & 255;
        if (i33 != 1) {
            if (i33 == 2) {
                i13 = i32;
                i14 = i30;
                i15 = 1;
            } else if (i33 == 3) {
                i13 = i32;
                i14 = i30;
                i15 = 2;
            }
            i16 = (i13 >> 8) & 255;
            if (i16 != 1) {
                if (i16 == 2) {
                    i28 = 1;
                } else if (i16 == 3) {
                    i28 = 2;
                } else if (i16 == 4) {
                }
                i17 = (i13 >> 16) & 255;
                if (i17 == 1) {
                    i18 = 2;
                } else {
                    i18 = 2;
                    if (i17 == 2) {
                        a0Var = a0Var3;
                        i19 = i29;
                        i20 = 1;
                        if (i11 != i18) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i11 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i11 != 4) {
                                i21 = i31;
                                c3 = ' ';
                                a0Var2 = a0Var;
                                truncateAt = null;
                                a6 = a(i19, i14, truncateAt, i10, i21, i15, i28, i20, charSequence4);
                                Layout layout2 = a6.f3137e;
                                i22 = i19;
                                if (Build.VERSION.SDK_INT < 35 || dVar.f5159g.getLetterSpacing() == 0.0f || (!(i11 == 4 || i11 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    aVar = this;
                                    i23 = i10;
                                    i24 = i22;
                                    i25 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i25 = 2;
                                    CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                                    aVar = this;
                                    i23 = i10;
                                    i24 = i22;
                                    a6 = aVar.a(i24, i14, truncateAt, i23, i21, i15, i28, i20, TextUtils.concat(charSequenceArr));
                                }
                                int i34 = a6.f3138f;
                                if (i11 == i25 || a6.a() <= s2.a.g(j3) || i23 <= 1) {
                                    aVar.f2609d = a6;
                                } else {
                                    int g10 = s2.a.g(j3);
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 >= i34) {
                                            i35 = i34;
                                            break;
                                        } else if (a6.d(i35) > g10) {
                                            break;
                                        } else {
                                            i35++;
                                        }
                                    }
                                    if (i35 >= 0 && i35 != aVar.f2607b) {
                                        a6 = aVar.a(i24, i14, truncateAt, i35 < 1 ? 1 : i35, i21, i15, i28, i20, aVar.f2610e);
                                    }
                                    aVar.f2609d = a6;
                                }
                                aVar.f2606a.f5159g.c(a0Var2.f2612a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c3), a0Var2.f2612a.a());
                                layout = aVar.f2609d.f3137e;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    pc.j.c(text, "null cannot be cast to non-null type android.text.Spanned");
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), q2.b.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        pc.j.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                                        bVarArr = (q2.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), q2.b.class);
                                        if (bVarArr != null) {
                                            bc.b h10 = pc.j.h(bVarArr);
                                            while (h10.hasNext()) {
                                                ((q2.b) h10.next()).f5747i.setValue(new e1.e((Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c3)));
                                            }
                                        }
                                        charSequence2 = aVar.f2610e;
                                        if (charSequence2 instanceof Spanned) {
                                            obj = bc.v.f1067g;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence2;
                                            Object[] spans = spanned2.getSpans(0, charSequence2.length(), j2.i.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj2 : spans) {
                                                j2.i iVar = (j2.i) obj2;
                                                int spanStart = spanned2.getSpanStart(iVar);
                                                int spanEnd = spanned2.getSpanEnd(iVar);
                                                int lineForOffset = aVar.f2609d.f3137e.getLineForOffset(spanStart);
                                                boolean z10 = lineForOffset >= aVar.f2607b;
                                                boolean z11 = aVar.f2609d.f3137e.getEllipsisCount(lineForOffset) > 0 && spanEnd > aVar.f2609d.f3137e.getEllipsisStart(lineForOffset);
                                                boolean z12 = spanEnd > aVar.f2609d.e(lineForOffset);
                                                if (z11 || z12 || z10) {
                                                    cVar = null;
                                                } else {
                                                    int ordinal = (aVar.f2609d.f3137e.isRtlCharAt(spanStart) ? r2.j.f6029h : r2.j.f6028g).ordinal();
                                                    if (ordinal == 0) {
                                                        g8 = aVar.f2609d.g(spanStart, false);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            throw new ac.d();
                                                        }
                                                        float g11 = aVar.f2609d.g(spanStart, false);
                                                        if (!iVar.f3519j) {
                                                            m2.a.b("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        g8 = g11 - iVar.f3517h;
                                                    }
                                                    if (!iVar.f3519j) {
                                                        m2.a.b("PlaceholderSpan is not laid out yet.");
                                                    }
                                                    float c10 = aVar.f2609d.c(lineForOffset) - iVar.b();
                                                    cVar = new e1.c(g8, c10, iVar.f3517h + g8, iVar.b() + c10);
                                                }
                                                arrayList.add(cVar);
                                            }
                                            obj = arrayList;
                                        }
                                        aVar.f2611f = obj;
                                    }
                                }
                                bVarArr = null;
                                if (bVarArr != null) {
                                }
                                charSequence2 = aVar.f2610e;
                                if (charSequence2 instanceof Spanned) {
                                }
                                aVar.f2611f = obj;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i21 = i31;
                        c3 = ' ';
                        a0Var2 = a0Var;
                        truncateAt = truncateAt2;
                        a6 = a(i19, i14, truncateAt, i10, i21, i15, i28, i20, charSequence4);
                        Layout layout22 = a6.f3137e;
                        i22 = i19;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        aVar = this;
                        i23 = i10;
                        i24 = i22;
                        i25 = 2;
                        int i342 = a6.f3138f;
                        if (i11 == i25) {
                        }
                        aVar.f2609d = a6;
                        aVar.f2606a.f5159g.c(a0Var2.f2612a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c3), a0Var2.f2612a.a());
                        layout = aVar.f2609d.f3137e;
                        if (layout.getText() instanceof Spanned) {
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = aVar.f2610e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        aVar.f2611f = obj;
                    }
                }
                a0Var = a0Var3;
                i19 = i29;
                i20 = i12;
                if (i11 != i18) {
                }
                i21 = i31;
                c3 = ' ';
                a0Var2 = a0Var;
                truncateAt = truncateAt2;
                a6 = a(i19, i14, truncateAt, i10, i21, i15, i28, i20, charSequence4);
                Layout layout222 = a6.f3137e;
                i22 = i19;
                if (Build.VERSION.SDK_INT < 35) {
                }
                aVar = this;
                i23 = i10;
                i24 = i22;
                i25 = 2;
                int i3422 = a6.f3138f;
                if (i11 == i25) {
                }
                aVar.f2609d = a6;
                aVar.f2606a.f5159g.c(a0Var2.f2612a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c3), a0Var2.f2612a.a());
                layout = aVar.f2609d.f3137e;
                if (layout.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence2 = aVar.f2610e;
                if (charSequence2 instanceof Spanned) {
                }
                aVar.f2611f = obj;
            }
            i28 = i12;
            i17 = (i13 >> 16) & 255;
            if (i17 == 1) {
            }
            a0Var = a0Var3;
            i19 = i29;
            i20 = i12;
            if (i11 != i18) {
            }
            i21 = i31;
            c3 = ' ';
            a0Var2 = a0Var;
            truncateAt = truncateAt2;
            a6 = a(i19, i14, truncateAt, i10, i21, i15, i28, i20, charSequence4);
            Layout layout2222 = a6.f3137e;
            i22 = i19;
            if (Build.VERSION.SDK_INT < 35) {
            }
            aVar = this;
            i23 = i10;
            i24 = i22;
            i25 = 2;
            int i34222 = a6.f3138f;
            if (i11 == i25) {
            }
            aVar.f2609d = a6;
            aVar.f2606a.f5159g.c(a0Var2.f2612a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c3), a0Var2.f2612a.a());
            layout = aVar.f2609d.f3137e;
            if (layout.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence2 = aVar.f2610e;
            if (charSequence2 instanceof Spanned) {
            }
            aVar.f2611f = obj;
        }
        i13 = i32;
        i14 = i30;
        i15 = i12;
        i16 = (i13 >> 8) & 255;
        if (i16 != 1) {
        }
        i28 = i12;
        i17 = (i13 >> 16) & 255;
        if (i17 == 1) {
        }
        a0Var = a0Var3;
        i19 = i29;
        i20 = i12;
        if (i11 != i18) {
        }
        i21 = i31;
        c3 = ' ';
        a0Var2 = a0Var;
        truncateAt = truncateAt2;
        a6 = a(i19, i14, truncateAt, i10, i21, i15, i28, i20, charSequence4);
        Layout layout22222 = a6.f3137e;
        i22 = i19;
        if (Build.VERSION.SDK_INT < 35) {
        }
        aVar = this;
        i23 = i10;
        i24 = i22;
        i25 = 2;
        int i342222 = a6.f3138f;
        if (i11 == i25) {
        }
        aVar.f2609d = a6;
        aVar.f2606a.f5159g.c(a0Var2.f2612a.c(), (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << c3), a0Var2.f2612a.a());
        layout = aVar.f2609d.f3137e;
        if (layout.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence2 = aVar.f2610e;
        if (charSequence2 instanceof Spanned) {
        }
        aVar.f2611f = obj;
    }

    public final i2.k a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        s sVar;
        float c3 = c();
        o2.d dVar = this.f2606a;
        o2.e eVar = dVar.f5159g;
        int i17 = dVar.f5164l;
        i2.f fVar = dVar.f5161i;
        h0 h0Var = dVar.f5154b;
        o2.a aVar = o2.b.f5151a;
        t tVar = h0Var.f2676c;
        return new i2.k(charSequence, c3, eVar, i10, truncateAt, i17, (tVar == null || (sVar = tVar.f2708a) == null) ? false : sVar.f2707a, i12, i14, i15, i16, i13, i11, fVar);
    }

    public final float b() {
        return this.f2609d.a();
    }

    public final float c() {
        return s2.a.h(this.f2608c);
    }

    public final void d(f1.o oVar) {
        Canvas a6 = f1.c.a(oVar);
        i2.k kVar = this.f2609d;
        if (kVar.f3136d) {
            a6.save();
            a6.clipRect(0.0f, 0.0f, c(), b());
        }
        int i10 = kVar.f3139g;
        if (a6.getClipBounds(kVar.f3147o)) {
            if (i10 != 0) {
                a6.translate(0.0f, i10);
            }
            i2.j jVar = i2.l.f3149a;
            jVar.f3132a = a6;
            kVar.f3137e.draw(jVar);
            if (i10 != 0) {
                a6.translate(0.0f, (-1) * i10);
            }
        }
        if (kVar.f3136d) {
            a6.restore();
        }
    }
}
