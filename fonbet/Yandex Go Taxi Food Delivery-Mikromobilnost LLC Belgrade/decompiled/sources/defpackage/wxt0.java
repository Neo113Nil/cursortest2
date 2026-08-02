package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class wxt0 implements q2v0 {
    public static final Pattern z = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final vxt0 b;
    public final ef90 c;
    public LinkedHashMap w;
    public float x;
    public float y;

    public wxt0(List list) {
        this.x = -3.4028235E38f;
        this.y = -3.4028235E38f;
        this.c = new ef90();
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String p = tw21.p((byte[]) list.get(0));
        d6z.l(p.startsWith("Format:"));
        vxt0 b = vxt0.b(p);
        b.getClass();
        this.b = b;
        c(new ef90((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long e(String str) {
        Matcher matcher = z.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = tw21.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // defpackage.q2v0
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        Charset charset;
        long j;
        vxt0 vxt0Var;
        ef90 ef90Var;
        float f;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        wxt0 wxt0Var = this;
        long j2 = p2v0Var.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ef90 ef90Var2 = wxt0Var.c;
        ef90Var2.I(i + i2, bArr);
        ef90Var2.K(i);
        Charset G = ef90Var2.G();
        if (G == null) {
            G = StandardCharsets.UTF_8;
        }
        boolean z2 = wxt0Var.a;
        if (!z2) {
            wxt0Var.c(ef90Var2, G);
        }
        vxt0 vxt0Var2 = z2 ? wxt0Var.b : null;
        while (true) {
            String l = ef90Var2.l(G);
            if (l == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !p2v0Var.a) ? null : new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    List list = (List) arrayList.get(i12);
                    if (!list.isEmpty() || i12 == 0) {
                        if (i12 == arrayList.size() - 1) {
                            ny61.k();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i12)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i12 + 1)).longValue() - ((Long) arrayList2.get(i12)).longValue();
                        if (j3 == -9223372036854775807L || longValue >= j3) {
                            c9eVar.accept(new tdf(list, longValue, longValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new tdf(list, longValue, longValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        c9eVar.accept((tdf) it.next());
                    }
                    return;
                }
                return;
            }
            if (l.startsWith("Format:")) {
                vxt0Var2 = vxt0.b(l);
            } else {
                if (l.startsWith("Dialogue:")) {
                    if (vxt0Var2 == null) {
                        lk91.j("Skipping dialogue line before complete format: ".concat(l));
                    } else {
                        int i13 = vxt0Var2.e;
                        d6z.l(l.startsWith("Dialogue:"));
                        String[] split = l.substring(9).split(",", i13);
                        if (split.length != i13) {
                            lk91.j("Skipping dialogue line with fewer columns than format: ".concat(l));
                        } else {
                            long e = e(split[vxt0Var2.a]);
                            if (e == -9223372036854775807L) {
                                lk91.j("Skipping invalid timing: ".concat(l));
                            } else {
                                j = j2;
                                long e2 = e(split[vxt0Var2.b]);
                                if (e2 == -9223372036854775807L || e2 <= e) {
                                    charset = G;
                                    vxt0Var = vxt0Var2;
                                    ef90Var = ef90Var2;
                                    lk91.j("Skipping invalid timing: ".concat(l));
                                } else {
                                    LinkedHashMap linkedHashMap = wxt0Var.w;
                                    zxt0 zxt0Var = (linkedHashMap == null || (i11 = vxt0Var2.c) == -1) ? null : (zxt0) linkedHashMap.get(split[i11].trim());
                                    String str = split[vxt0Var2.d];
                                    Matcher matcher = yxt0.a.matcher(str);
                                    int i14 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        Charset charset2 = G;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a = yxt0.a(group);
                                            if (a != null) {
                                                pointF = a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = yxt0.d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i10 = zxt0.a(group2);
                                            } else {
                                                i10 = -1;
                                            }
                                            if (i10 != -1) {
                                                i14 = i10;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        G = charset2;
                                    }
                                    charset = G;
                                    String replace = yxt0.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f3 = wxt0Var.x;
                                    float f4 = wxt0Var.y;
                                    SpannableString spannableString = new SpannableString(replace);
                                    ndf ndfVar = new ndf();
                                    ndfVar.a = spannableString;
                                    if (zxt0Var != null) {
                                        boolean z3 = zxt0Var.g;
                                        Integer num = zxt0Var.d;
                                        Integer num2 = zxt0Var.c;
                                        if (num2 != null) {
                                            vxt0Var = vxt0Var2;
                                            ef90Var = ef90Var2;
                                            f = f3;
                                            i6 = 0;
                                            i7 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            vxt0Var = vxt0Var2;
                                            ef90Var = ef90Var2;
                                            f = f3;
                                            i6 = 0;
                                            i7 = 33;
                                        }
                                        if (zxt0Var.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i6, spannableString.length(), i7);
                                        }
                                        float f5 = zxt0Var.e;
                                        if (f5 != -3.4028235E38f && f4 != -3.4028235E38f) {
                                            ndfVar.k = f5 / f4;
                                            ndfVar.j = 1;
                                        }
                                        boolean z4 = zxt0Var.f;
                                        if (z4 && z3) {
                                            i8 = 0;
                                            i9 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i8 = 0;
                                            i9 = 33;
                                            if (z4) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z3) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (zxt0Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), i9);
                                        }
                                        if (zxt0Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), i9);
                                        }
                                    } else {
                                        vxt0Var = vxt0Var2;
                                        ef90Var = ef90Var2;
                                        f = f3;
                                    }
                                    int i15 = i14;
                                    if (i15 == -1) {
                                        i15 = zxt0Var != null ? zxt0Var.b : -1;
                                    }
                                    switch (i15) {
                                        case 0:
                                        default:
                                            xvz.v(i15, "Unknown alignment: ");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    ndfVar.c = alignment;
                                    int i16 = Integer.MIN_VALUE;
                                    switch (i15) {
                                        case 0:
                                        default:
                                            xvz.v(i15, "Unknown alignment: ");
                                        case -1:
                                            i3 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i3 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i3 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i3 = 2;
                                            break;
                                    }
                                    ndfVar.i = i3;
                                    switch (i15) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            xvz.v(i15, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i16 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i16 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i16 = 0;
                                            break;
                                    }
                                    ndfVar.g = i16;
                                    PointF pointF2 = pointF;
                                    if (pointF2 == null || f4 == -3.4028235E38f || f == -3.4028235E38f) {
                                        int i17 = ndfVar.i;
                                        float f6 = 0.5f;
                                        if (i17 != 0) {
                                            i4 = 1;
                                            if (i17 != 1) {
                                                i5 = 2;
                                                f2 = i17 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i5 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i4 = 1;
                                            i5 = 2;
                                            f2 = 0.05f;
                                        }
                                        ndfVar.h = f2;
                                        if (i16 == 0) {
                                            f6 = 0.05f;
                                        } else if (i16 != i4) {
                                            f6 = i16 != i5 ? -3.4028235E38f : 0.95f;
                                        }
                                        ndfVar.e = f6;
                                        ndfVar.f = 0;
                                    } else {
                                        ndfVar.h = pointF2.x / f;
                                        ndfVar.e = pointF2.y / f4;
                                        ndfVar.f = 0;
                                    }
                                    odf a2 = ndfVar.a();
                                    int a3 = a(e2, arrayList2, arrayList);
                                    for (int a4 = a(e, arrayList2, arrayList); a4 < a3; a4++) {
                                        ((List) arrayList.get(a4)).add(a2);
                                    }
                                }
                                wxt0Var = this;
                                j2 = j;
                                G = charset;
                                ef90Var2 = ef90Var;
                                vxt0Var2 = vxt0Var;
                            }
                        }
                    }
                }
                charset = G;
                j = j2;
                vxt0Var = vxt0Var2;
                ef90Var = ef90Var2;
                wxt0Var = this;
                j2 = j;
                G = charset;
                ef90Var2 = ef90Var;
                vxt0Var2 = vxt0Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ef90 ef90Var, Charset charset) {
        int i;
        zxt0 zxt0Var;
        while (true) {
            String l = ef90Var.l(charset);
            if (l == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            char c = '[';
            if ("[Script Info]".equalsIgnoreCase(l)) {
                while (true) {
                    String l2 = ef90Var.l(charset);
                    if (l2 != null && (ef90Var.a() == 0 || ef90Var.f(charset) != '[')) {
                        String[] split = l2.split(":");
                        if (split.length == 2) {
                            String g = f0b1.g(split[0].trim());
                            g.getClass();
                            if (g.equals("playresx")) {
                                this.x = Float.parseFloat(split[1].trim());
                            } else if (g.equals("playresy")) {
                                try {
                                    this.y = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(l)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    xxt0 xxt0Var = null;
                    while (true) {
                        String l3 = ef90Var.l(charset);
                        if (l3 != null && (ef90Var.a() == 0 || ef90Var.f(charset) != c)) {
                            int i4 = -1;
                            if (l3.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(l3.substring(7), ",");
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i3; i15 < split2.length; i15++) {
                                    String g2 = f0b1.g(split2[i15].trim());
                                    g2.getClass();
                                    switch (g2.hashCode()) {
                                        case -1178781136:
                                            if (g2.equals("italic")) {
                                                i = i3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (g2.equals("underline")) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (g2.equals("strikeout")) {
                                                i = i2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (g2.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (g2.equals("bold")) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (g2.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (g2.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (g2.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (g2.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (g2.equals("outlinecolour")) {
                                                i = 9;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    xxt0Var = new xxt0(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length);
                                }
                            } else {
                                if (l3.startsWith("Style:")) {
                                    if (xxt0Var == null) {
                                        lk91.j("Skipping 'Style:' line before 'Format:' line: ".concat(l3));
                                    } else {
                                        d6z.l(l3.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(l3.substring(6), ",");
                                        int length = split3.length;
                                        int i16 = xxt0Var.k;
                                        if (length != i16) {
                                            int length2 = split3.length;
                                            int i17 = tw21.a;
                                            Locale locale = Locale.US;
                                            StringBuilder s = b64.s(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            s.append(l3);
                                            s.append("'");
                                            lk91.j(s.toString());
                                        } else {
                                            try {
                                                String trim = split3[xxt0Var.a].trim();
                                                int i18 = xxt0Var.b;
                                                int a = i18 != -1 ? zxt0.a(split3[i18].trim()) : -1;
                                                int i19 = xxt0Var.c;
                                                Integer c2 = i19 != -1 ? zxt0.c(split3[i19].trim()) : null;
                                                int i20 = xxt0Var.d;
                                                Integer c3 = i20 != -1 ? zxt0.c(split3[i20].trim()) : null;
                                                int i21 = xxt0Var.e;
                                                float f = -3.4028235E38f;
                                                if (i21 != -1) {
                                                    String trim2 = split3[i21].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        lk91.k("Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i22 = xxt0Var.f;
                                                boolean z2 = i22 != -1 && zxt0.b(split3[i22].trim());
                                                int i23 = xxt0Var.g;
                                                boolean z3 = i23 != -1 && zxt0.b(split3[i23].trim());
                                                int i24 = xxt0Var.h;
                                                boolean z4 = i24 != -1 && zxt0.b(split3[i24].trim());
                                                int i25 = xxt0Var.i;
                                                boolean z5 = i25 != -1 && zxt0.b(split3[i25].trim());
                                                int i26 = xxt0Var.j;
                                                if (i26 != -1) {
                                                    String trim3 = split3[i26].trim();
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3.trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i4 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    lk91.j("Ignoring unknown BorderStyle: " + trim3);
                                                }
                                                zxt0Var = new zxt0(trim, a, c2, c3, f2, z2, z3, z4, z5, i4);
                                            } catch (RuntimeException e2) {
                                                lk91.k("Skipping malformed 'Style:' line: '" + l3 + "'", e2);
                                            }
                                            if (zxt0Var != null) {
                                                linkedHashMap.put(zxt0Var.a, zxt0Var);
                                            }
                                        }
                                        zxt0Var = null;
                                        if (zxt0Var != null) {
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                                c = '[';
                            }
                        }
                    }
                }
                this.w = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(l)) {
                lk91.h("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(l)) {
                return;
            }
        }
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 1;
    }

    public wxt0() {
        this(null);
    }
}
