package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ggv extends FrameLayout implements xpr {
    public final ru3 a;
    public final kbv b;
    public List c;
    public uu3 d;
    public float e;
    public float f;

    public ggv(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = uu3.g;
        this.e = 0.0533f;
        this.f = 0.08f;
        ru3 ru3Var = new ru3(context, 0);
        this.a = ru3Var;
        kbv kbvVar = new kbv(context, null, 2);
        this.b = kbvVar;
        kbvVar.setBackgroundColor(0);
        addView(ru3Var);
        addView(kbvVar);
    }

    @Override // defpackage.xpr
    public final void a(List list, uu3 uu3Var, float f, float f2) {
        this.d = uu3Var;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            rv6 rv6Var = (rv6) list.get(i);
            if (rv6Var.d != null) {
                arrayList.add(rv6Var);
            } else {
                arrayList2.add(rv6Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, uu3Var, f, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float X = y1g.X(i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f);
        if (X == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(X / getContext().getResources().getDisplayMetrics().density)};
        int i2 = dvt.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x01f0, code lost:
    
        if (r25 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01f3, code lost:
    
        r10 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x01f4, code lost:
    
        r27 = r10;
        r25 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01f9, code lost:
    
        if (r25 != 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String format;
        float f;
        int i;
        String format2;
        String str;
        int i2;
        Layout.Alignment alignment;
        int i3;
        String str2;
        int i4;
        String str3;
        Object obj;
        String str4;
        CharSequence charSequence;
        String str5;
        String str6;
        float f2;
        String str7;
        String str8;
        String str9;
        yx3 yx3Var;
        boolean z;
        String str10;
        Object[] objArr;
        int i5;
        int i6;
        int i7;
        String format3;
        String str11;
        float f3;
        String str12;
        Layout.Alignment alignment2;
        int i8;
        String str13;
        StringBuilder sb = new StringBuilder();
        String S = ot0.S(this.d.a);
        int i9 = 0;
        String b = b(0, this.e);
        float f4 = 1.2f;
        Float valueOf = Float.valueOf(1.2f);
        uu3 uu3Var = this.d;
        int i10 = uu3Var.d;
        int i11 = uu3Var.e;
        int i12 = 2;
        int i13 = 1;
        if (i10 == 1) {
            Object[] objArr2 = {ot0.S(i11)};
            int i14 = dvt.a;
            format = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i10 == 2) {
            String S2 = ot0.S(i11);
            int i15 = dvt.a;
            Locale locale = Locale.US;
            format = "0.1em 0.12em 0.15em ".concat(S2);
        } else if (i10 == 3) {
            String S3 = ot0.S(i11);
            int i16 = dvt.a;
            Locale locale2 = Locale.US;
            format = "0.06em 0.08em 0.15em ".concat(S3);
        } else if (i10 != 4) {
            format = "unset";
        } else {
            String S4 = ot0.S(i11);
            int i17 = dvt.a;
            Locale locale3 = Locale.US;
            format = "-0.05em -0.05em 0.15em ".concat(S4);
        }
        Object[] objArr3 = {S, b, valueOf, format};
        int i18 = dvt.a;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        String S5 = ot0.S(this.d.b);
        String str14 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(S5);
        String str15 = ";";
        sb2.append(";");
        hashMap.put(".default_bg,.default_bg *", sb2.toString());
        int i19 = 0;
        while (i19 < this.c.size()) {
            rv6 rv6Var = (rv6) this.c.get(i19);
            float f5 = rv6Var.h;
            int i20 = rv6Var.p;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            float f7 = f4;
            int i21 = rv6Var.i;
            int i22 = -100;
            if (i21 == i13) {
                f = -3.4028235E38f;
                i = -50;
            } else if (i21 != i12) {
                i = i9;
                f = -3.4028235E38f;
            } else {
                f = -3.4028235E38f;
                i = -100;
            }
            float f8 = rv6Var.e;
            if (f8 == f) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f) * 100.0f));
            } else if (rv6Var.f != i13) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf(f8 * 100.0f));
                int i23 = rv6Var.g;
                i22 = i20 == i13 ? -(i23 != i13 ? i23 != i12 ? 0 : -100 : -50) : i23 != i13 ? i23 != i12 ? 0 : -100 : -50;
            } else {
                if (f8 >= 0.0f) {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(f8 * f7));
                    i2 = 0;
                } else {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(((-f8) - 1.0f) * f7));
                    i2 = i13;
                }
                i22 = 0;
                float f9 = rv6Var.j;
                String format4 = f9 == f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f)) : "fit-content";
                alignment = rv6Var.b;
                String str16 = "end";
                if (alignment != null) {
                    i4 = i13;
                    str2 = "center";
                    i3 = 2;
                } else {
                    int i24 = egv.a[alignment.ordinal()];
                    if (i24 != i13) {
                        i3 = 2;
                        str2 = i24 != 2 ? "center" : "end";
                    } else {
                        i3 = 2;
                        str2 = "start";
                    }
                    i4 = 1;
                }
                String str17 = i20 == i4 ? i20 != i3 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
                String b2 = b(rv6Var.n, rv6Var.o);
                String S6 = ot0.S(!rv6Var.l ? rv6Var.m : this.d.c);
                String str18 = "right";
                int i25 = i2;
                if (i20 == 1) {
                    if (i20 != 2) {
                        String str19 = i25 != 0 ? "bottom" : "top";
                        obj = "left";
                        str3 = str19;
                    }
                }
                if (i20 != 2 || i20 == 1) {
                    str4 = CameraProperty.HEIGHT;
                    int i26 = i22;
                    i22 = i;
                    i = i26;
                } else {
                    str4 = CameraProperty.WIDTH;
                }
                String str20 = str4;
                charSequence = rv6Var.a;
                float f10 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = j4r.a;
                int i27 = i;
                int i28 = i19;
                if (charSequence != null) {
                    yx3Var = new yx3("", false);
                    str8 = str15;
                    str5 = "";
                } else {
                    str5 = "";
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        HashSet hashSet = new HashSet();
                        str6 = "start";
                        f2 = f6;
                        BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        int length = backgroundColorSpanArr.length;
                        int i29 = 0;
                        while (i29 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i29].getBackgroundColor()));
                            i29++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        HashMap hashMap2 = new HashMap();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            String i30 = k5r.i(intValue, "bg_");
                            Iterator it2 = it;
                            String s = hrg.s(".", i30, ",.", i30, " *");
                            String S7 = ot0.S(intValue);
                            int i31 = dvt.a;
                            Locale locale4 = Locale.US;
                            hashMap2.put(s, str14 + S7 + str15);
                            it = it2;
                            str16 = str16;
                        }
                        str7 = str16;
                        SparseArray sparseArray = new SparseArray();
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        int length2 = spans.length;
                        int i32 = 0;
                        while (i32 < length2) {
                            Object obj2 = spans[i32];
                            String str21 = str15;
                            boolean z2 = obj2 instanceof StrikethroughSpan;
                            String str22 = null;
                            if (z2) {
                                z = z2;
                                format3 = "<span style='text-decoration:line-through;'>";
                                str10 = str14;
                            } else {
                                z = z2;
                                if (obj2 instanceof ForegroundColorSpan) {
                                    String S8 = ot0.S(((ForegroundColorSpan) obj2).getForegroundColor());
                                    int i33 = dvt.a;
                                    Locale locale5 = Locale.US;
                                    str10 = str14;
                                    format3 = hrg.q("<span style='color:", S8, ";'>");
                                } else {
                                    str10 = str14;
                                    if (obj2 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj2).getBackgroundColor();
                                        int i34 = dvt.a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        format3 = dfi.c(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj2 instanceof h3e) {
                                            format3 = "<span style='text-combine-upright:all;'>";
                                        } else if (obj2 instanceof AbsoluteSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj2).getDip() ? r3.getSize() : r3.getSize() / f10)};
                                            int i35 = dvt.a;
                                            format3 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj2 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj2).getSizeChange() * 100.0f)};
                                            int i36 = dvt.a;
                                            format3 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else {
                                            if (obj2 instanceof TypefaceSpan) {
                                                String family = ((TypefaceSpan) obj2).getFamily();
                                                if (family != null) {
                                                    int i37 = dvt.a;
                                                    Locale locale7 = Locale.US;
                                                    format3 = hrg.q("<span style='font-family:\"", family, "\";'>");
                                                }
                                                i5 = length2;
                                                i6 = i32;
                                                format3 = null;
                                            } else if (obj2 instanceof StyleSpan) {
                                                int style = ((StyleSpan) obj2).getStyle();
                                                if (style == 1) {
                                                    format3 = "<b>";
                                                } else if (style != 2) {
                                                    if (style == 3) {
                                                        format3 = "<b><i>";
                                                    }
                                                    i5 = length2;
                                                    i6 = i32;
                                                    format3 = null;
                                                } else {
                                                    format3 = "<i>";
                                                }
                                            } else if (obj2 instanceof gjo) {
                                                int i38 = ((gjo) obj2).b;
                                                if (i38 == -1) {
                                                    format3 = "<ruby style='ruby-position:unset;'>";
                                                } else if (i38 != 1) {
                                                    if (i38 == 2) {
                                                        format3 = "<ruby style='ruby-position:under;'>";
                                                    }
                                                    i5 = length2;
                                                    i6 = i32;
                                                    format3 = null;
                                                } else {
                                                    format3 = "<ruby style='ruby-position:over;'>";
                                                }
                                            } else if (obj2 instanceof UnderlineSpan) {
                                                format3 = "<u>";
                                            } else {
                                                if (obj2 instanceof nas) {
                                                    nas nasVar = (nas) obj2;
                                                    int i39 = nasVar.a;
                                                    int i40 = nasVar.b;
                                                    i5 = length2;
                                                    StringBuilder sb3 = new StringBuilder();
                                                    i6 = i32;
                                                    if (i40 != 1) {
                                                        i7 = 2;
                                                        if (i40 == 2) {
                                                            sb3.append("open ");
                                                        }
                                                    } else {
                                                        i7 = 2;
                                                        sb3.append("filled ");
                                                    }
                                                    if (i39 == 0) {
                                                        sb3.append("none");
                                                    } else if (i39 == 1) {
                                                        sb3.append("circle");
                                                    } else if (i39 == i7) {
                                                        sb3.append("dot");
                                                    } else if (i39 != 3) {
                                                        sb3.append("unset");
                                                    } else {
                                                        sb3.append("sesame");
                                                    }
                                                    Object[] objArr6 = {sb3.toString(), nasVar.c != 2 ? "over right" : "under left"};
                                                    int i41 = dvt.a;
                                                    format3 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                                }
                                                i5 = length2;
                                                i6 = i32;
                                                format3 = null;
                                            }
                                            if (!z || (obj2 instanceof ForegroundColorSpan) || (obj2 instanceof BackgroundColorSpan) || (obj2 instanceof h3e) || (obj2 instanceof AbsoluteSizeSpan) || (obj2 instanceof RelativeSizeSpan) || (obj2 instanceof nas)) {
                                                str11 = "</span>";
                                            } else if (obj2 instanceof TypefaceSpan) {
                                                str11 = ((TypefaceSpan) obj2).getFamily() != null ? "</span>" : null;
                                            } else {
                                                if (obj2 instanceof StyleSpan) {
                                                    int style2 = ((StyleSpan) obj2).getStyle();
                                                    if (style2 == 1) {
                                                        str22 = "</b>";
                                                    } else if (style2 == 2) {
                                                        str22 = "</i>";
                                                    } else if (style2 == 3) {
                                                        str22 = "</i></b>";
                                                    }
                                                } else if (obj2 instanceof gjo) {
                                                    str22 = "<rt>" + j4r.a(((gjo) obj2).a) + "</rt></ruby>";
                                                } else if (obj2 instanceof UnderlineSpan) {
                                                    str22 = "</u>";
                                                }
                                                str11 = str22;
                                            }
                                            int spanStart = spanned.getSpanStart(obj2);
                                            int spanEnd = spanned.getSpanEnd(obj2);
                                            if (format3 != null) {
                                                str11.getClass();
                                                h4r h4rVar = new h4r(spanStart, spanEnd, format3, str11);
                                                i4r i4rVar = (i4r) sparseArray.get(spanStart);
                                                if (i4rVar == null) {
                                                    i4rVar = new i4r();
                                                    sparseArray.put(spanStart, i4rVar);
                                                }
                                                i4rVar.a.add(h4rVar);
                                                i4r i4rVar2 = (i4r) sparseArray.get(spanEnd);
                                                if (i4rVar2 == null) {
                                                    i4rVar2 = new i4r();
                                                    sparseArray.put(spanEnd, i4rVar2);
                                                }
                                                i4rVar2.b.add(h4rVar);
                                            }
                                            i32 = i6 + 1;
                                            str15 = str21;
                                            str14 = str10;
                                            spans = objArr;
                                            length2 = i5;
                                        }
                                    }
                                    i5 = length2;
                                    i6 = i32;
                                    if (z) {
                                    }
                                    str11 = "</span>";
                                    int spanStart2 = spanned.getSpanStart(obj2);
                                    int spanEnd2 = spanned.getSpanEnd(obj2);
                                    if (format3 != null) {
                                    }
                                    i32 = i6 + 1;
                                    str15 = str21;
                                    str14 = str10;
                                    spans = objArr;
                                    length2 = i5;
                                }
                            }
                            objArr = spans;
                            i5 = length2;
                            i6 = i32;
                            if (z) {
                            }
                            str11 = "</span>";
                            int spanStart22 = spanned.getSpanStart(obj2);
                            int spanEnd22 = spanned.getSpanEnd(obj2);
                            if (format3 != null) {
                            }
                            i32 = i6 + 1;
                            str15 = str21;
                            str14 = str10;
                            spans = objArr;
                            length2 = i5;
                        }
                        str8 = str15;
                        str9 = str14;
                        StringBuilder sb4 = new StringBuilder(spanned.length());
                        int i42 = 0;
                        int i43 = 0;
                        while (i42 < sparseArray.size()) {
                            int keyAt = sparseArray.keyAt(i42);
                            sb4.append(j4r.a(spanned.subSequence(i43, keyAt)));
                            i4r i4rVar3 = (i4r) sparseArray.get(keyAt);
                            ArrayList arrayList = i4rVar3.b;
                            ArrayList arrayList2 = i4rVar3.a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, h4r.f);
                            Iterator it3 = i4rVar3.b.iterator();
                            while (it3.hasNext()) {
                                sb4.append(((h4r) it3.next()).d);
                            }
                            Collections.sort(arrayList2, h4r.e);
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                sb4.append(((h4r) it4.next()).c);
                            }
                            i42++;
                            i43 = keyAt;
                            sparseArray = sparseArray2;
                        }
                        sb4.append(j4r.a(spanned.subSequence(i43, spanned.length())));
                        yx3Var = new yx3(sb4.toString(), false);
                        for (String str23 : hashMap.keySet()) {
                            String str24 = (String) hashMap.put(str23, (String) hashMap.get(str23));
                            vq1.A(str24 == null || str24.equals(hashMap.get(str23)));
                        }
                        Integer valueOf2 = Integer.valueOf(i28);
                        Float valueOf3 = Float.valueOf(f2);
                        Integer valueOf4 = Integer.valueOf(i27);
                        Integer valueOf5 = Integer.valueOf(i22);
                        f3 = rv6Var.q;
                        if (f3 != 0.0f) {
                            Object[] objArr7 = {(i20 == 2 || i20 == 1) ? "skewY" : "skewX", Float.valueOf(f3)};
                            int i44 = dvt.a;
                            str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                        } else {
                            str12 = str5;
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2, obj, valueOf3, str3, str, str20, format4, str2, str17, b2, S6, valueOf4, valueOf5, str12));
                        sb.append("<span class='default_bg'>");
                        alignment2 = rv6Var.c;
                        String str25 = yx3Var.a;
                        if (alignment2 != null) {
                            int i45 = egv.a[alignment2.ordinal()];
                            if (i45 != 1) {
                                i8 = 2;
                                str13 = i45 != 2 ? "center" : str7;
                            } else {
                                i8 = 2;
                                str13 = str6;
                            }
                            sb.append("<span style='display:inline-block; text-align:" + str13 + ";'>");
                            sb.append(str25);
                            sb.append("</span>");
                        } else {
                            i8 = 2;
                            sb.append(str25);
                        }
                        sb.append("</span></div>");
                        i19 = i28 + 1;
                        i12 = i8;
                        f4 = f7;
                        str15 = str8;
                        str14 = str9;
                        i9 = 0;
                        i13 = 1;
                    } else {
                        str8 = str15;
                        yx3Var = new yx3(j4r.a(charSequence), false);
                    }
                }
                str9 = str14;
                str6 = "start";
                f2 = f6;
                str7 = "end";
                while (r3.hasNext()) {
                }
                Integer valueOf22 = Integer.valueOf(i28);
                Float valueOf32 = Float.valueOf(f2);
                Integer valueOf42 = Integer.valueOf(i27);
                Integer valueOf52 = Integer.valueOf(i22);
                f3 = rv6Var.q;
                if (f3 != 0.0f) {
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf22, obj, valueOf32, str3, str, str20, format4, str2, str17, b2, S6, valueOf42, valueOf52, str12));
                sb.append("<span class='default_bg'>");
                alignment2 = rv6Var.c;
                String str252 = yx3Var.a;
                if (alignment2 != null) {
                }
                sb.append("</span></div>");
                i19 = i28 + 1;
                i12 = i8;
                f4 = f7;
                str15 = str8;
                str14 = str9;
                i9 = 0;
                i13 = 1;
            }
            str = format2;
            i2 = 0;
            float f92 = rv6Var.j;
            String format42 = f92 == f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f92 * 100.0f)) : "fit-content";
            alignment = rv6Var.b;
            String str162 = "end";
            if (alignment != null) {
            }
            String str172 = i20 == i4 ? i20 != i3 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String b22 = b(rv6Var.n, rv6Var.o);
            String S62 = ot0.S(!rv6Var.l ? rv6Var.m : this.d.c);
            String str182 = "right";
            int i252 = i2;
            if (i20 == 1) {
            }
            if (i20 != 2) {
            }
            str4 = CameraProperty.HEIGHT;
            int i262 = i22;
            i22 = i;
            i = i262;
            String str202 = str4;
            charSequence = rv6Var.a;
            float f102 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = j4r.a;
            int i272 = i;
            int i282 = i19;
            if (charSequence != null) {
            }
            str9 = str14;
            str6 = "start";
            f2 = f6;
            str7 = "end";
            while (r3.hasNext()) {
            }
            Integer valueOf222 = Integer.valueOf(i282);
            Float valueOf322 = Float.valueOf(f2);
            Integer valueOf422 = Integer.valueOf(i272);
            Integer valueOf522 = Integer.valueOf(i22);
            f3 = rv6Var.q;
            if (f3 != 0.0f) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf222, obj, valueOf322, str3, str, str202, format42, str2, str172, b22, S62, valueOf422, valueOf522, str12));
            sb.append("<span class='default_bg'>");
            alignment2 = rv6Var.c;
            String str2522 = yx3Var.a;
            if (alignment2 != null) {
            }
            sb.append("</span></div>");
            i19 = i282 + 1;
            i12 = i8;
            f4 = f7;
            str15 = str8;
            str14 = str9;
            i9 = 0;
            i13 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str26 : hashMap.keySet()) {
            sb5.append(str26);
            sb5.append("{");
            sb5.append((String) hashMap.get(str26));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, sb5.toString());
        this.b.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
