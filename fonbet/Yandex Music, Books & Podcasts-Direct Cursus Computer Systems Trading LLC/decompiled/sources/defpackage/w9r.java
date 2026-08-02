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
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* loaded from: classes.dex */
public final class w9r implements upr {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final v9r b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final d7k c = new d7k();

    public w9r(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String r = dvt.r((byte[]) list.get(0));
        vq1.v(r.startsWith("Format:"));
        v9r b = v9r.b(r);
        b.getClass();
        this.b = b;
        b(new d7k((byte[]) list.get(1)), StandardCharsets.UTF_8);
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

    public static long c(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = dvt.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d7k d7kVar, Charset charset) {
        int i;
        z9r z9rVar;
        while (true) {
            String i2 = d7kVar.i(charset);
            if (i2 == null) {
                return;
            }
            int i3 = 2;
            int i4 = 0;
            char c = '[';
            if ("[Script Info]".equalsIgnoreCase(i2)) {
                while (true) {
                    String i5 = d7kVar.i(charset);
                    if (i5 != null && (d7kVar.a() == 0 || d7kVar.c(charset) != '[')) {
                        String[] split = i5.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        if (split.length == 2) {
                            String M = ltg.M(split[0].trim());
                            M.getClass();
                            if (M.equals("playresx")) {
                                this.e = Float.parseFloat(split[1].trim());
                            } else if (M.equals("playresy")) {
                                try {
                                    this.f = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(i2)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    x9r x9rVar = null;
                    while (true) {
                        String i6 = d7kVar.i(charset);
                        if (i6 != null && (d7kVar.a() == 0 || d7kVar.c(charset) != c)) {
                            int i7 = -1;
                            if (i6.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(i6.substring(7), StringUtils.COMMA);
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                for (int i18 = i4; i18 < split2.length; i18++) {
                                    String M2 = ltg.M(split2[i18].trim());
                                    M2.getClass();
                                    switch (M2.hashCode()) {
                                        case -1178781136:
                                            if (M2.equals("italic")) {
                                                i = i4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (M2.equals("underline")) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (M2.equals("strikeout")) {
                                                i = i3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (M2.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (M2.equals("bold")) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (M2.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (M2.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (M2.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (M2.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (M2.equals("outlinecolour")) {
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
                                            i14 = i18;
                                            break;
                                        case 1:
                                            i15 = i18;
                                            break;
                                        case 2:
                                            i16 = i18;
                                            break;
                                        case 3:
                                            i10 = i18;
                                            break;
                                        case 4:
                                            i13 = i18;
                                            break;
                                        case 5:
                                            i8 = i18;
                                            break;
                                        case 6:
                                            i12 = i18;
                                            break;
                                        case 7:
                                            i17 = i18;
                                            break;
                                        case 8:
                                            i9 = i18;
                                            break;
                                        case 9:
                                            i11 = i18;
                                            break;
                                    }
                                }
                                if (i8 != -1) {
                                    x9rVar = new x9r(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, split2.length);
                                }
                            } else {
                                if (i6.startsWith("Style:")) {
                                    if (x9rVar == null) {
                                        vq1.n0("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(i6));
                                    } else {
                                        vq1.v(i6.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(i6.substring(6), StringUtils.COMMA);
                                        int length = split3.length;
                                        int i19 = x9rVar.k;
                                        if (length != i19) {
                                            int length2 = split3.length;
                                            int i20 = dvt.a;
                                            Locale locale = Locale.US;
                                            StringBuilder l = dfi.l("Skipping malformed 'Style:' line (expected ", i19, length2, " values, found ", "): '");
                                            l.append(i6);
                                            l.append("'");
                                            vq1.n0("SsaStyle", l.toString());
                                        } else {
                                            try {
                                                String trim = split3[x9rVar.a].trim();
                                                int i21 = x9rVar.b;
                                                int a = i21 != -1 ? z9r.a(split3[i21].trim()) : -1;
                                                int i22 = x9rVar.c;
                                                Integer c2 = i22 != -1 ? z9r.c(split3[i22].trim()) : null;
                                                int i23 = x9rVar.d;
                                                Integer c3 = i23 != -1 ? z9r.c(split3[i23].trim()) : null;
                                                int i24 = x9rVar.e;
                                                float f = -3.4028235E38f;
                                                if (i24 != -1) {
                                                    String trim2 = split3[i24].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        vq1.o0("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i25 = x9rVar.f;
                                                boolean z = i25 != -1 && z9r.b(split3[i25].trim());
                                                int i26 = x9rVar.g;
                                                boolean z2 = i26 != -1 && z9r.b(split3[i26].trim());
                                                int i27 = x9rVar.h;
                                                boolean z3 = i27 != -1 && z9r.b(split3[i27].trim());
                                                int i28 = x9rVar.i;
                                                boolean z4 = i28 != -1 && z9r.b(split3[i28].trim());
                                                int i29 = x9rVar.j;
                                                if (i29 != -1) {
                                                    String trim3 = split3[i29].trim();
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3.trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i7 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    vq1.n0("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                                }
                                                z9rVar = new z9r(trim, a, c2, c3, f2, z, z2, z3, z4, i7);
                                            } catch (RuntimeException e2) {
                                                vq1.o0("SsaStyle", "Skipping malformed 'Style:' line: '" + i6 + "'", e2);
                                            }
                                            if (z9rVar != null) {
                                                linkedHashMap.put(z9rVar.a, z9rVar);
                                            }
                                        }
                                        z9rVar = null;
                                        if (z9rVar != null) {
                                        }
                                    }
                                }
                                i3 = 2;
                                i4 = 0;
                                c = '[';
                            }
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(i2)) {
                vq1.Y("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(i2)) {
                return;
            }
        }
    }

    @Override // defpackage.upr
    public final void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var) {
        Charset charset;
        d7k d7kVar;
        v9r v9rVar;
        long j;
        float f;
        int i3;
        int i4;
        float f2;
        int i5;
        Layout.Alignment alignment;
        PointF pointF;
        int i6;
        int i7;
        float f3;
        float f4;
        float f5;
        boolean z;
        int i8;
        int i9;
        float f6;
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        w9r w9rVar = this;
        long j2 = tprVar.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d7k d7kVar2 = w9rVar.c;
        d7kVar2.F(i + i2, bArr);
        d7kVar2.H(i);
        Charset D = d7kVar2.D();
        if (D == null) {
            D = StandardCharsets.UTF_8;
        }
        boolean z2 = w9rVar.a;
        if (!z2) {
            w9rVar.b(d7kVar2, D);
        }
        v9r v9rVar2 = z2 ? w9rVar.b : null;
        while (true) {
            String i15 = d7kVar2.i(D);
            if (i15 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !tprVar.a) ? null : new ArrayList();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    List list = (List) arrayList.get(i16);
                    if (!list.isEmpty() || i16 == 0) {
                        if (i16 == arrayList.size() - 1) {
                            e7o.n();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i16)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i16 + 1)).longValue() - ((Long) arrayList2.get(i16)).longValue();
                        if (j3 == -9223372036854775807L || longValue >= j3) {
                            ua6Var.accept(new uv6(longValue, longValue2, list));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new uv6(longValue, longValue2, list));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ua6Var.accept((uv6) it.next());
                    }
                    return;
                }
                return;
            }
            if (i15.startsWith("Format:")) {
                v9rVar2 = v9r.b(i15);
            } else {
                if (i15.startsWith("Dialogue:")) {
                    if (v9rVar2 == null) {
                        vq1.n0("SsaParser", "Skipping dialogue line before complete format: ".concat(i15));
                    } else {
                        int i17 = v9rVar2.e;
                        vq1.v(i15.startsWith("Dialogue:"));
                        String[] split = i15.substring(9).split(StringUtils.COMMA, i17);
                        if (split.length != i17) {
                            vq1.n0("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(i15));
                        } else {
                            long c = c(split[v9rVar2.a]);
                            charset = D;
                            if (c == -9223372036854775807L) {
                                vq1.n0("SsaParser", "Skipping invalid timing: ".concat(i15));
                                j = j2;
                                v9rVar = v9rVar2;
                                d7kVar = d7kVar2;
                                w9rVar = this;
                                D = charset;
                                j2 = j;
                                v9rVar2 = v9rVar;
                                d7kVar2 = d7kVar;
                            } else {
                                j = j2;
                                long c2 = c(split[v9rVar2.b]);
                                if (c2 == -9223372036854775807L || c2 <= c) {
                                    v9rVar = v9rVar2;
                                    d7kVar = d7kVar2;
                                    vq1.n0("SsaParser", "Skipping invalid timing: ".concat(i15));
                                } else {
                                    LinkedHashMap linkedHashMap = w9rVar.d;
                                    z9r z9rVar = (linkedHashMap == null || (i14 = v9rVar2.c) == -1) ? null : (z9r) linkedHashMap.get(split[i14].trim());
                                    String str = split[v9rVar2.d];
                                    Matcher matcher = y9r.a.matcher(str);
                                    int i18 = -1;
                                    PointF pointF2 = null;
                                    while (matcher.find()) {
                                        v9r v9rVar3 = v9rVar2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a = y9r.a(group);
                                            if (a != null) {
                                                pointF2 = a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = y9r.d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i13 = z9r.a(group2);
                                            } else {
                                                i13 = -1;
                                            }
                                            if (i13 != -1) {
                                                i18 = i13;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        v9rVar2 = v9rVar3;
                                    }
                                    v9rVar = v9rVar2;
                                    String replace = y9r.a.matcher(str).replaceAll("").replace("\\N", StringUtil.LF).replace("\\n", StringUtil.LF).replace("\\h", " ");
                                    float f8 = w9rVar.e;
                                    float f9 = w9rVar.f;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (z9rVar != null) {
                                        boolean z3 = z9rVar.g;
                                        Integer num = z9rVar.d;
                                        Integer num2 = z9rVar.c;
                                        if (num2 != null) {
                                            z = z3;
                                            d7kVar = d7kVar2;
                                            f = f8;
                                            i8 = 33;
                                            i9 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            z = z3;
                                            d7kVar = d7kVar2;
                                            f = f8;
                                            i8 = 33;
                                            i9 = 0;
                                        }
                                        if (z9rVar.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i9, spannableString.length(), i8);
                                        }
                                        float f10 = z9rVar.e;
                                        if (f10 == -3.4028235E38f || f9 == -3.4028235E38f) {
                                            f6 = -3.4028235E38f;
                                            i10 = Integer.MIN_VALUE;
                                        } else {
                                            f6 = f10 / f9;
                                            i10 = 1;
                                        }
                                        boolean z4 = z9rVar.f;
                                        if (z4 && z) {
                                            f7 = f6;
                                            i11 = i10;
                                            i12 = 33;
                                            i3 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f7 = f6;
                                            i11 = i10;
                                            i12 = 33;
                                            i3 = 0;
                                            if (z4) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (z9rVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i12);
                                        }
                                        if (z9rVar.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i12);
                                        }
                                        i4 = i18;
                                        f2 = f7;
                                        i5 = i11;
                                    } else {
                                        d7kVar = d7kVar2;
                                        f = f8;
                                        i3 = 0;
                                        i4 = i18;
                                        f2 = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    if (i4 == -1) {
                                        i4 = z9rVar != null ? z9rVar.b : -1;
                                    }
                                    switch (i4) {
                                        case 0:
                                        default:
                                            dfi.o(i4, "Unknown alignment: ", "SsaParser");
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
                                    int i19 = Integer.MIN_VALUE;
                                    switch (i4) {
                                        case 0:
                                        default:
                                            dfi.o(i4, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i3 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
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
                                    switch (i4) {
                                        case 0:
                                        default:
                                            dfi.o(i4, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            pointF = pointF2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            pointF = pointF2;
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            pointF = pointF2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            pointF = pointF2;
                                            i19 = 0;
                                            break;
                                    }
                                    if (pointF == null || f9 == -3.4028235E38f || f == -3.4028235E38f) {
                                        float f11 = 0.5f;
                                        if (i3 != 0) {
                                            i7 = 1;
                                            if (i3 != 1) {
                                                i6 = 2;
                                                f3 = i3 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i6 = 2;
                                                f3 = 0.5f;
                                            }
                                        } else {
                                            i6 = 2;
                                            i7 = 1;
                                            f3 = 0.05f;
                                        }
                                        if (i19 == 0) {
                                            f11 = 0.05f;
                                        } else if (i19 != i7) {
                                            f11 = i19 != i6 ? -3.4028235E38f : 0.95f;
                                        }
                                        f4 = f11;
                                        f5 = f3;
                                    } else {
                                        float f12 = pointF.x / f;
                                        f4 = pointF.y / f9;
                                        f5 = f12;
                                    }
                                    rv6 rv6Var = new rv6(spannableString, alignment, null, null, f4, 0, i19, f5, i3, i5, f2, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int a2 = a(c2, arrayList2, arrayList);
                                    for (int a3 = a(c, arrayList2, arrayList); a3 < a2; a3++) {
                                        ((List) arrayList.get(a3)).add(rv6Var);
                                    }
                                }
                                w9rVar = this;
                                D = charset;
                                j2 = j;
                                v9rVar2 = v9rVar;
                                d7kVar2 = d7kVar;
                            }
                        }
                    }
                }
                charset = D;
                j = j2;
                v9rVar = v9rVar2;
                d7kVar = d7kVar2;
                w9rVar = this;
                D = charset;
                j2 = j;
                v9rVar2 = v9rVar;
                d7kVar2 = d7kVar;
            }
        }
    }

    @Override // defpackage.upr
    public final int y() {
        return 1;
    }
}
