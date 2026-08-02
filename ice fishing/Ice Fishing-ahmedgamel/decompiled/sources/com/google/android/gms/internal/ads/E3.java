package com.google.android.gms.internal.ads;

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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class E3 implements InterfaceC3891s3 {

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f25292z = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public final boolean f25293n;

    /* renamed from: u, reason: collision with root package name */
    public final C4107w3 f25294u;

    /* renamed from: w, reason: collision with root package name */
    public LinkedHashMap f25296w;

    /* renamed from: x, reason: collision with root package name */
    public float f25297x = -3.4028235E38f;

    /* renamed from: y, reason: collision with root package name */
    public float f25298y = -3.4028235E38f;

    /* renamed from: v, reason: collision with root package name */
    public final Cr f25295v = new Cr();

    public E3(List list) {
        if (list == null || list.isEmpty()) {
            this.f25293n = false;
            this.f25294u = null;
            return;
        }
        this.f25293n = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        AbstractC2792Sd.i(str.startsWith("Format:"));
        C4107w3 a9 = C4107w3.a(str);
        a9.getClass();
        this.f25294u = a9;
        a(new Cr((byte[]) list.get(1)), charset);
    }

    public static long b(String str) {
        Matcher matcher = f25292z.matcher(str.trim());
        if (!matcher.matches()) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        String group = matcher.group(1);
        String str2 = AbstractC3182eu.f30782a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public static int c(long j6, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j6) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j6) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j6));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2 A[Catch: RuntimeException -> 0x0209, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x0209, blocks: (B:90:0x01d9, B:92:0x01e7, B:94:0x01ed, B:98:0x020e, B:100:0x0212, B:101:0x0221, B:103:0x0225, B:104:0x0234, B:106:0x0238, B:108:0x0240, B:110:0x026a, B:112:0x026e, B:115:0x027f, B:117:0x0283, B:120:0x0294, B:122:0x0298, B:125:0x02a9, B:127:0x02ad, B:130:0x02be, B:132:0x02c2, B:134:0x02ca, B:139:0x02e7, B:137:0x02da, B:150:0x0248, B:96:0x01f8), top: B:89:0x01d9, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Cr cr, Charset charset) {
        int i;
        String trim;
        int i4;
        Integer a9;
        Integer a10;
        int i6;
        float f2;
        int i9;
        int i10;
        H3 h3;
        int parseInt;
        int i11;
        boolean z6;
        while (true) {
            int i12 = 8;
            while (true) {
                String n9 = cr.n(charset);
                if (n9 == null) {
                    return;
                }
                int i13 = 2;
                int i14 = 91;
                int i15 = 0;
                if ("[Script Info]".equalsIgnoreCase(n9)) {
                    while (true) {
                        String n10 = cr.n(charset);
                        if (n10 == null) {
                            break;
                        }
                        if (cr.B() != 0) {
                            if ((cr.t(charset) != 0 ? UC.a(r4 >>> 8) : 1114112) == 91) {
                                break;
                            }
                        }
                        String[] split = n10.split(":");
                        if (split.length == 2) {
                            String f9 = AbstractC3066cl.f(split[0].trim());
                            switch (f9.hashCode()) {
                                case 1879649548:
                                    if (f9.equals("playresx")) {
                                        z6 = false;
                                        break;
                                    }
                                    z6 = -1;
                                    break;
                                case 1879649549:
                                    if (f9.equals("playresy")) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = -1;
                                    break;
                                default:
                                    z6 = -1;
                                    break;
                            }
                            if (!z6) {
                                this.f25297x = Float.parseFloat(split[1].trim());
                            } else if (z6) {
                                try {
                                    this.f25298y = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(n9)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    F3 f32 = null;
                    while (true) {
                        String n11 = cr.n(charset);
                        if (n11 != null) {
                            if (cr.B() != 0) {
                                if ((cr.t(charset) != 0 ? UC.a(r0 >>> i12) : 1114112) == i14) {
                                }
                            }
                            if (n11.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(n11.substring(7), ",");
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                int i26 = i15;
                                while (true) {
                                    int length = split2.length;
                                    if (i26 < length) {
                                        String f10 = AbstractC3066cl.f(split2[i26].trim());
                                        switch (f10.hashCode()) {
                                            case -1178781136:
                                                if (f10.equals("italic")) {
                                                    i = 6;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -1026963764:
                                                if (f10.equals("underline")) {
                                                    i = 7;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -192095652:
                                                if (f10.equals("strikeout")) {
                                                    i = 8;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -70925746:
                                                if (f10.equals("primarycolour")) {
                                                    i = i13;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 3029637:
                                                if (f10.equals("bold")) {
                                                    i = 5;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 3373707:
                                                if (f10.equals("name")) {
                                                    i = i15;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 366554320:
                                                if (f10.equals("fontsize")) {
                                                    i = 4;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 767321349:
                                                if (f10.equals("borderstyle")) {
                                                    i = 9;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 1767875043:
                                                if (f10.equals("alignment")) {
                                                    i = 1;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 1988365454:
                                                if (f10.equals("outlinecolour")) {
                                                    i = 3;
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
                                                i16 = i26;
                                                break;
                                            case 1:
                                                i17 = i26;
                                                break;
                                            case 2:
                                                i18 = i26;
                                                break;
                                            case 3:
                                                i19 = i26;
                                                break;
                                            case 4:
                                                i20 = i26;
                                                break;
                                            case 5:
                                                i21 = i26;
                                                break;
                                            case 6:
                                                i22 = i26;
                                                break;
                                            case 7:
                                                i23 = i26;
                                                break;
                                            case 8:
                                                i24 = i26;
                                                break;
                                            case 9:
                                                i25 = i26;
                                                break;
                                        }
                                        i26++;
                                    } else {
                                        f32 = i16 != -1 ? new F3(i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, length) : null;
                                        i12 = 8;
                                    }
                                }
                            } else {
                                if (n11.startsWith("Style:")) {
                                    if (f32 == null) {
                                        AbstractC2991bG.y("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(n11));
                                    } else {
                                        AbstractC2792Sd.i(n11.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(n11.substring(6), ",");
                                        int length2 = split3.length;
                                        int i27 = f32.f25497k;
                                        if (length2 != i27) {
                                            String str = AbstractC3182eu.f30782a;
                                            Locale locale = Locale.US;
                                            StringBuilder j6 = Wv.j(i27, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            j6.append(n11);
                                            j6.append("'");
                                            AbstractC2991bG.y("SsaStyle", j6.toString());
                                        } else {
                                            try {
                                                trim = split3[f32.f25488a].trim();
                                                int i28 = f32.f25489b;
                                                if (i28 != -1) {
                                                    String trim2 = split3[i28].trim();
                                                    try {
                                                        i11 = Integer.parseInt(trim2.trim());
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    switch (i11) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            AbstractC2991bG.y("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(trim2)));
                                                            i11 = -1;
                                                            break;
                                                    }
                                                    i4 = i11;
                                                } else {
                                                    i4 = -1;
                                                }
                                                int i29 = f32.f25490c;
                                                a9 = i29 != -1 ? H3.a(split3[i29].trim()) : null;
                                                int i30 = f32.f25491d;
                                                a10 = i30 != -1 ? H3.a(split3[i30].trim()) : null;
                                                i6 = f32.f25492e;
                                            } catch (RuntimeException e9) {
                                                AbstractC2991bG.C("SsaStyle", D.x.p(new StringBuilder(n11.length() + 36), "Skipping malformed 'Style:' line: '", n11, "'"), e9);
                                            }
                                            if (i6 != -1) {
                                                String trim3 = split3[i6].trim();
                                                try {
                                                    f2 = Float.parseFloat(trim3);
                                                } catch (NumberFormatException e10) {
                                                    StringBuilder sb = new StringBuilder(String.valueOf(trim3).length() + 29);
                                                    sb.append("Failed to parse font size: '");
                                                    sb.append(trim3);
                                                    sb.append("'");
                                                    AbstractC2991bG.C("SsaStyle", sb.toString(), e10);
                                                }
                                                int i31 = f32.f25493f;
                                                boolean z9 = i31 == -1 && H3.b(split3[i31].trim());
                                                int i32 = f32.f25494g;
                                                boolean z10 = i32 == -1 && H3.b(split3[i32].trim());
                                                int i33 = f32.f25495h;
                                                boolean z11 = i33 == -1 && H3.b(split3[i33].trim());
                                                int i34 = f32.i;
                                                boolean z12 = i34 == -1 && H3.b(split3[i34].trim());
                                                i9 = f32.f25496j;
                                                if (i9 != -1) {
                                                    String trim4 = split3[i9].trim();
                                                    try {
                                                        parseInt = Integer.parseInt(trim4.trim());
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i10 = parseInt;
                                                        h3 = new H3(trim, i4, a9, a10, f2, z9, z10, z11, z12, i10);
                                                        if (h3 != null) {
                                                            linkedHashMap.put(h3.f25976a, h3);
                                                        }
                                                    }
                                                    AbstractC2991bG.y("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim4)));
                                                }
                                                i10 = -1;
                                                h3 = new H3(trim, i4, a9, a10, f2, z9, z10, z11, z12, i10);
                                                if (h3 != null) {
                                                }
                                            }
                                            f2 = -3.4028235E38f;
                                            int i312 = f32.f25493f;
                                            if (i312 == -1) {
                                            }
                                            int i322 = f32.f25494g;
                                            if (i322 == -1) {
                                            }
                                            int i332 = f32.f25495h;
                                            if (i332 == -1) {
                                            }
                                            int i342 = f32.i;
                                            if (i342 == -1) {
                                            }
                                            i9 = f32.f25496j;
                                            if (i9 != -1) {
                                            }
                                            i10 = -1;
                                            h3 = new H3(trim, i4, a9, a10, f2, z9, z10, z11, z12, i10);
                                            if (h3 != null) {
                                            }
                                        }
                                        h3 = null;
                                        if (h3 != null) {
                                        }
                                    }
                                }
                                i12 = 8;
                                i13 = 2;
                                i14 = 91;
                                i15 = 0;
                            }
                        }
                    }
                    this.f25296w = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(n9)) {
                    AbstractC2991bG.t("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(n9)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x01be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:66:0x01a3, B:68:0x01af, B:75:0x01b6, B:70:0x01cf, B:77:0x01c1), top: B:65:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        C4107w3 c4107w3;
        Charset charset;
        C4107w3 c4107w32;
        Cr cr;
        int parseInt;
        long b9;
        int i6;
        float f2;
        float f9;
        int i9;
        Layout.Alignment alignment;
        int i10;
        PointF pointF;
        float f10;
        float f11;
        float f12;
        int i11;
        Integer num;
        C4107w3 c4107w33;
        Cr cr2;
        Matcher matcher;
        Matcher matcher2;
        int i12;
        Matcher matcher3;
        Matcher matcher4;
        boolean find;
        boolean find2;
        PointF pointF2;
        String str;
        String str2;
        int i13;
        E3 e32 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cr cr3 = e32.f25295v;
        cr3.z(i + i4, bArr);
        cr3.E(i);
        Charset q8 = cr3.q();
        if (q8 == null) {
            q8 = StandardCharsets.UTF_8;
        }
        if (e32.f25293n) {
            c4107w3 = e32.f25294u;
        } else {
            e32.a(cr3, q8);
            c4107w3 = null;
        }
        while (true) {
            String n9 = cr3.n(q8);
            int i14 = 1;
            if (n9 == null) {
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    List list = (List) arrayList.get(i15);
                    if (list.isEmpty()) {
                        if (i15 != 0) {
                            i15++;
                        } else {
                            i15 = 0;
                        }
                    }
                    if (i15 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    long longValue = ((Long) arrayList2.get(i15)).longValue();
                    bVar.mo9a(new C3676o3(list, longValue, ((Long) arrayList2.get(i15 + 1)).longValue() - longValue));
                    i15++;
                }
                return;
            }
            if (n9.startsWith("Format:")) {
                c4107w3 = C4107w3.a(n9);
            } else {
                if (n9.startsWith("Dialogue:")) {
                    if (c4107w3 == null) {
                        AbstractC2991bG.y("SsaParser", "Skipping dialogue line before complete format: ".concat(n9));
                    } else {
                        AbstractC2792Sd.i(n9.startsWith("Dialogue:"));
                        String substring = n9.substring(9);
                        int i16 = c4107w3.f35562f;
                        String[] split = substring.split(",", i16);
                        if (split.length != i16) {
                            AbstractC2991bG.y("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(n9));
                        } else {
                            int i17 = c4107w3.f35557a;
                            if (i17 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i17].trim());
                                } catch (RuntimeException unused) {
                                    com.IceFishing.LiveIceFishing.k.y(split[i17], "Fail to parse layer: ", "SsaParser");
                                }
                                b9 = b(split[c4107w3.f35558b]);
                                if (b9 != com.anythink.basead.exoplayer.b.f7168b) {
                                    AbstractC2991bG.y("SsaParser", "Skipping invalid timing: ".concat(n9));
                                    charset = q8;
                                    c4107w32 = c4107w3;
                                    cr = cr3;
                                } else {
                                    long b10 = b(split[c4107w3.f35559c]);
                                    if (b10 == com.anythink.basead.exoplayer.b.f7168b || b10 <= b9) {
                                        charset = q8;
                                        c4107w32 = c4107w3;
                                        cr = cr3;
                                        AbstractC2991bG.y("SsaParser", "Skipping invalid timing: ".concat(n9));
                                    } else {
                                        LinkedHashMap linkedHashMap = e32.f25296w;
                                        H3 h3 = (linkedHashMap == null || (i13 = c4107w3.f35560d) == -1) ? null : (H3) linkedHashMap.get(split[i13].trim());
                                        String str3 = split[c4107w3.f35561e];
                                        Matcher matcher5 = G3.f25701a.matcher(str3);
                                        PointF pointF3 = null;
                                        int i18 = -1;
                                        while (matcher5.find()) {
                                            String group = matcher5.group(i14);
                                            group.getClass();
                                            Charset charset2 = q8;
                                            try {
                                                matcher3 = G3.f25702b.matcher(group);
                                                c4107w33 = c4107w3;
                                                try {
                                                    matcher4 = G3.f25703c.matcher(group);
                                                    find = matcher3.find();
                                                    find2 = matcher4.find();
                                                } catch (RuntimeException unused2) {
                                                    cr2 = cr3;
                                                    matcher = matcher5;
                                                    try {
                                                        matcher2 = G3.f25704d.matcher(group);
                                                        if (matcher2.find()) {
                                                        }
                                                        i12 = -1;
                                                        if (i12 != -1) {
                                                        }
                                                    } catch (RuntimeException unused3) {
                                                    }
                                                    matcher5 = matcher;
                                                    q8 = charset2;
                                                    c4107w3 = c4107w33;
                                                    cr3 = cr2;
                                                    i14 = 1;
                                                }
                                            } catch (RuntimeException unused4) {
                                                c4107w33 = c4107w3;
                                            }
                                            if (find) {
                                                if (find2) {
                                                    cr2 = cr3;
                                                    matcher = matcher5;
                                                    try {
                                                        StringBuilder sb = new StringBuilder(group.length() + 82);
                                                        sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                        sb.append(group);
                                                        sb.append("'");
                                                        AbstractC2991bG.t("SsaStyle.Overrides", sb.toString());
                                                    } catch (RuntimeException unused5) {
                                                    }
                                                } else {
                                                    cr2 = cr3;
                                                    matcher = matcher5;
                                                }
                                                str = matcher3.group(1);
                                                str2 = matcher3.group(2);
                                            } else {
                                                cr2 = cr3;
                                                matcher = matcher5;
                                                if (find2) {
                                                    String group2 = matcher4.group(1);
                                                    String group3 = matcher4.group(2);
                                                    str = group2;
                                                    str2 = group3;
                                                } else {
                                                    pointF2 = null;
                                                    if (pointF2 != null) {
                                                        pointF3 = pointF2;
                                                    }
                                                    matcher2 = G3.f25704d.matcher(group);
                                                    if (matcher2.find()) {
                                                        String group4 = matcher2.group(1);
                                                        if (group4 == null) {
                                                            throw null;
                                                        }
                                                        try {
                                                            i12 = Integer.parseInt(group4.trim());
                                                        } catch (NumberFormatException unused6) {
                                                        }
                                                        switch (i12) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                break;
                                                            default:
                                                                AbstractC2991bG.y("SsaStyle", "Ignoring unknown alignment: ".concat(group4));
                                                                break;
                                                        }
                                                        if (i12 != -1) {
                                                            i18 = i12;
                                                            matcher5 = matcher;
                                                            q8 = charset2;
                                                            c4107w3 = c4107w33;
                                                            cr3 = cr2;
                                                            i14 = 1;
                                                        }
                                                        matcher5 = matcher;
                                                        q8 = charset2;
                                                        c4107w3 = c4107w33;
                                                        cr3 = cr2;
                                                        i14 = 1;
                                                    }
                                                    i12 = -1;
                                                    if (i12 != -1) {
                                                    }
                                                    matcher5 = matcher;
                                                    q8 = charset2;
                                                    c4107w3 = c4107w33;
                                                    cr3 = cr2;
                                                    i14 = 1;
                                                }
                                            }
                                            if (str == null) {
                                                throw null;
                                            }
                                            float parseFloat = Float.parseFloat(str.trim());
                                            if (str2 == null) {
                                                throw null;
                                            }
                                            pointF2 = new PointF(parseFloat, Float.parseFloat(str2.trim()));
                                            if (pointF2 != null) {
                                            }
                                            matcher2 = G3.f25704d.matcher(group);
                                            if (matcher2.find()) {
                                            }
                                            i12 = -1;
                                            if (i12 != -1) {
                                            }
                                            matcher5 = matcher;
                                            q8 = charset2;
                                            c4107w3 = c4107w33;
                                            cr3 = cr2;
                                            i14 = 1;
                                        }
                                        charset = q8;
                                        c4107w32 = c4107w3;
                                        cr = cr3;
                                        String replace = G3.f25701a.matcher(str3).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f13 = e32.f25297x;
                                        float f14 = e32.f25298y;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (h3 != null) {
                                            Integer num2 = h3.f25978c;
                                            if (num2 != null) {
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            }
                                            if (h3.f25984j != 3 || (num = h3.f25979d) == null) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = -3.4028235E38f;
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f15 = h3.f25980e;
                                            if (f15 == f2 || f14 == f2) {
                                                f12 = -3.4028235E38f;
                                                i9 = Integer.MIN_VALUE;
                                            } else {
                                                f12 = f15 / f14;
                                                i9 = 1;
                                            }
                                            boolean z6 = h3.f25982g;
                                            boolean z9 = h3.f25981f;
                                            if (z9 && z6) {
                                                i11 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                i6 = 0;
                                            } else {
                                                i11 = 33;
                                                i6 = 0;
                                                if (z9) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z6) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (h3.f25983h) {
                                                spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i11);
                                            }
                                            if (h3.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i11);
                                            }
                                            f9 = f12;
                                        } else {
                                            i6 = 0;
                                            f2 = -3.4028235E38f;
                                            f9 = -3.4028235E38f;
                                            i9 = Integer.MIN_VALUE;
                                        }
                                        if (i18 == -1) {
                                            i18 = h3 != null ? h3.f25977b : -1;
                                        }
                                        switch (i18) {
                                            case 0:
                                            default:
                                                com.IceFishing.LiveIceFishing.k.s(Wv.b(i18, 19), i18, "Unknown alignment: ", "SsaParser");
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
                                        switch (i18) {
                                            case 0:
                                            default:
                                                com.IceFishing.LiveIceFishing.k.s(Wv.b(i18, 19), i18, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i10 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i10 = i6;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i10 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i10 = 2;
                                                break;
                                        }
                                        switch (i18) {
                                            case -1:
                                                pointF = pointF3;
                                                break;
                                            case 0:
                                            default:
                                                com.IceFishing.LiveIceFishing.k.s(Wv.b(i18, 19), i18, "Unknown alignment: ", "SsaParser");
                                                pointF = pointF3;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                pointF = pointF3;
                                                i19 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                pointF = pointF3;
                                                i19 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i19 = i6;
                                                pointF = pointF3;
                                                break;
                                        }
                                        if (pointF == null || f14 == f2 || f13 == f2) {
                                            float f16 = 0.5f;
                                            float f17 = i10 != 0 ? i10 != 1 ? i10 != 2 ? f2 : 0.95f : 0.5f : 0.05f;
                                            if (i19 == 0) {
                                                f16 = 0.05f;
                                            } else if (i19 != 1) {
                                                f16 = i19 != 2 ? f2 : 0.95f;
                                            }
                                            f10 = f17;
                                            f11 = f16;
                                        } else {
                                            float f18 = pointF.x / f13;
                                            f11 = pointF.y / f14;
                                            f10 = f18;
                                        }
                                        C4302zj c4302zj = new C4302zj(spannableString, alignment, null, null, f11, i6, i19, f10, i10, i9, f9, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, parseInt);
                                        int c9 = c(b10, arrayList2, arrayList);
                                        for (int c10 = c(b9, arrayList2, arrayList); c10 < c9; c10++) {
                                            ((List) arrayList.get(c10)).add(c4302zj);
                                        }
                                    }
                                }
                                e32 = this;
                                q8 = charset;
                                c4107w3 = c4107w32;
                                cr3 = cr;
                            }
                            parseInt = 0;
                            b9 = b(split[c4107w3.f35558b]);
                            if (b9 != com.anythink.basead.exoplayer.b.f7168b) {
                            }
                            e32 = this;
                            q8 = charset;
                            c4107w3 = c4107w32;
                            cr3 = cr;
                        }
                    }
                }
                charset = q8;
                c4107w32 = c4107w3;
                cr = cr3;
                e32 = this;
                q8 = charset;
                c4107w3 = c4107w32;
                cr3 = cr;
            }
        }
    }
}
