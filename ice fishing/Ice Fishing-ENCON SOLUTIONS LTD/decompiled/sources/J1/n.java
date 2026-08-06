package J1;

import java.util.ArrayList;
import java.util.Iterator;
import u0.AbstractC1050a;
import w1.C1060a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f895a;

    /* renamed from: d, reason: collision with root package name */
    public String f898d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f900f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f901g;

    /* renamed from: h, reason: collision with root package name */
    public String f902h;

    /* renamed from: b, reason: collision with root package name */
    public String f896b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f897c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f899e = -1;

    public n() {
        ArrayList arrayList = new ArrayList();
        this.f900f = arrayList;
        arrayList.add("");
    }

    public final o a() {
        ArrayList arrayList;
        String str = this.f895a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e2 = C0051b.e(this.f896b, 0, 0, false, 7);
        String e3 = C0051b.e(this.f897c, 0, 0, false, 7);
        String str2 = this.f898d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b2 = b();
        ArrayList arrayList2 = this.f900f;
        ArrayList arrayList3 = new ArrayList(i1.k.E(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0051b.e((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f901g;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(i1.k.E(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 == null ? null : C0051b.e(str3, 0, 0, true, 3));
            }
        }
        String str4 = this.f902h;
        return new o(str, e2, e3, str2, b2, arrayList3, arrayList, str4 != null ? C0051b.e(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i2 = this.f899e;
        if (i2 != -1) {
            return i2;
        }
        String str = this.f895a;
        kotlin.jvm.internal.i.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x027c, code lost:
    
        if (r1 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x007c, code lost:
    
        if (r5 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00dc A[EDGE_INSN: B:179:0x00dc->B:16:0x00dc BREAK  A[LOOP:0: B:10:0x00c7->B:177:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(o oVar, String str) {
        int i2;
        int i3;
        int i4;
        char c2;
        char c3;
        int i5;
        int g2;
        char charAt;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        char c4;
        int i9;
        boolean z2;
        int i10;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        int i11;
        int i12;
        int g3;
        ArrayList arrayList3;
        int i13;
        byte[] bArr = K1.b.f1051a;
        int n2 = K1.b.n(str, 0, str.length());
        int o2 = K1.b.o(str, n2, str.length());
        char c5 = 65535;
        if (o2 - n2 >= 2) {
            char charAt2 = str.charAt(n2);
            char c6 = 'a';
            if ((kotlin.jvm.internal.i.f(charAt2, 97) >= 0 && kotlin.jvm.internal.i.f(charAt2, 122) <= 0) || (kotlin.jvm.internal.i.f(charAt2, 65) >= 0 && kotlin.jvm.internal.i.f(charAt2, 90) <= 0)) {
                i2 = n2 + 1;
                while (true) {
                    if (i2 >= o2) {
                        break;
                    }
                    int i14 = i2 + 1;
                    char charAt3 = str.charAt(i2);
                    if ((c6 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i2 = i14;
                        c6 = 'a';
                    }
                }
                String str5 = "http";
                String str6 = "https";
                String str7 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i2 == -1) {
                    if (z1.o.Q(n2, str, "https:", true)) {
                        this.f895a = "https";
                        n2 += 6;
                    } else {
                        if (!z1.o.Q(n2, str, "http:", true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = str.substring(0, i2);
                            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f895a = "http";
                        n2 += 5;
                    }
                } else {
                    if (oVar == null) {
                        throw new IllegalArgumentException(kotlin.jvm.internal.i.h(str.length() > 6 ? kotlin.jvm.internal.i.h("...", z1.g.j0(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
                    }
                    this.f895a = oVar.f904a;
                }
                i3 = n2;
                i4 = 0;
                while (true) {
                    c2 = '/';
                    c3 = '\\';
                    if (i3 < o2) {
                        break;
                    }
                    i13 = i3 + 1;
                    char charAt4 = str.charAt(i3);
                    if (charAt4 != '\\' && charAt4 != '/') {
                        break;
                    }
                    i4++;
                    i3 = i13;
                }
                ArrayList arrayList4 = this.f900f;
                char c7 = '#';
                if (i4 < 2 && oVar != null) {
                    if (kotlin.jvm.internal.i.a(oVar.f904a, this.f895a)) {
                        this.f896b = oVar.e();
                        this.f897c = oVar.a();
                        this.f898d = oVar.f907d;
                        this.f899e = oVar.f908e;
                        arrayList4.clear();
                        arrayList4.addAll(oVar.c());
                        if (n2 == o2 || str.charAt(n2) == '#') {
                            String d2 = oVar.d();
                            this.f901g = d2 == null ? null : C0051b.f(C0051b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211));
                        }
                        arrayList = arrayList4;
                        i9 = o2;
                        z2 = false;
                        i12 = i9;
                        g3 = K1.b.g(str, n2, i12, "?#");
                        if (n2 != g3) {
                            char charAt5 = str.charAt(n2);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                n2++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i15 = n2;
                            while (i15 < g3) {
                                int g4 = K1.b.g(str, i15, g3, "/\\");
                                boolean z3 = g4 < g3 ? true : z2;
                                String b2 = C0051b.b(str, i15, g4, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!b2.equals(".") && !b2.equalsIgnoreCase("%2e")) {
                                    if (b2.equals("..") || b2.equalsIgnoreCase("%2e.") || b2.equalsIgnoreCase(".%2e") || b2.equalsIgnoreCase("%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i15 = !z3 ? g4 + 1 : g4;
                                    } else {
                                        if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, b2);
                                        } else {
                                            arrayList3.add(b2);
                                        }
                                        if (z3) {
                                            arrayList3.add("");
                                        }
                                    }
                                }
                                if (!z3) {
                                }
                            }
                        }
                        if (g3 < i12 && str.charAt(g3) == '?') {
                            int f2 = K1.b.f(str, '#', g3, i12);
                            this.f901g = C0051b.f(C0051b.b(str, g3 + 1, f2, " \"'<>#", true, false, true, false, 208));
                            g3 = f2;
                        }
                        if (g3 < i12 || str.charAt(g3) != '#') {
                            return;
                        }
                        this.f902h = C0051b.b(str, g3 + 1, i12, "", true, false, false, true, 176);
                        return;
                    }
                }
                i5 = n2 + i4;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    g2 = K1.b.g(str, i5, o2, "@/\\?#");
                    charAt = g2 == o2 ? str.charAt(g2) : c5;
                    if (charAt == c5 || charAt == c7 || charAt == c2 || charAt == c3 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z4) {
                            arrayList2 = arrayList4;
                            str2 = str7;
                            str3 = str6;
                            str4 = str5;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f897c);
                            sb2.append("%40");
                            i11 = g2;
                            sb2.append(C0051b.b(str, i5, g2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                            this.f897c = sb2.toString();
                        } else {
                            int f3 = K1.b.f(str, ':', i5, g2);
                            arrayList2 = arrayList4;
                            str2 = str7;
                            str3 = str6;
                            str4 = str5;
                            String b3 = C0051b.b(str, i5, f3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z5) {
                                b3 = this.f896b + "%40" + b3;
                            }
                            this.f896b = b3;
                            if (f3 != g2) {
                                this.f897c = C0051b.b(str, f3 + 1, g2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z4 = true;
                            }
                            i11 = g2;
                            z5 = true;
                        }
                        i5 = i11 + 1;
                        str7 = str2;
                        arrayList4 = arrayList2;
                        str6 = str3;
                        str5 = str4;
                        c2 = '/';
                        c7 = '#';
                        c3 = '\\';
                        c5 = 65535;
                    }
                }
                arrayList = arrayList4;
                String str8 = str7;
                String str9 = str6;
                String str10 = str5;
                i6 = i5;
                while (true) {
                    if (i6 >= g2) {
                        i7 = g2;
                        break;
                    }
                    char charAt6 = str.charAt(i6);
                    if (charAt6 == '[') {
                        do {
                            i6++;
                            if (i6 >= g2) {
                                break;
                            }
                        } while (str.charAt(i6) != ']');
                    } else if (charAt6 == ':') {
                        i7 = i6;
                        break;
                    }
                    i6++;
                }
                i8 = i7 + 1;
                if (i8 >= g2) {
                    this.f898d = AbstractC1050a.D(C0051b.e(str, i5, i7, false, 4));
                    i9 = o2;
                    try {
                        i10 = Integer.parseInt(C0051b.b(str, i8, g2, "", false, false, false, false, 248));
                        if (1 <= i10) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.f899e = i10;
                    if (i10 == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i8, g2);
                        kotlin.jvm.internal.i.d(substring2, str8);
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    c4 = '\"';
                    z2 = false;
                } else {
                    c4 = '\"';
                    i9 = o2;
                    z2 = false;
                    this.f898d = AbstractC1050a.D(C0051b.e(str, i5, i7, false, 4));
                    String str11 = this.f895a;
                    kotlin.jvm.internal.i.b(str11);
                    this.f899e = str11.equals(str10) ? 80 : str11.equals(str9) ? 443 : -1;
                }
                if (this.f898d != null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i5, i7);
                    kotlin.jvm.internal.i.d(substring3, str8);
                    sb4.append(substring3);
                    sb4.append(c4);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                n2 = g2;
                i12 = i9;
                g3 = K1.b.g(str, n2, i12, "?#");
                if (n2 != g3) {
                }
                if (g3 < i12) {
                    int f22 = K1.b.f(str, '#', g3, i12);
                    this.f901g = C0051b.f(C0051b.b(str, g3 + 1, f22, " \"'<>#", true, false, true, false, 208));
                    g3 = f22;
                }
                if (g3 < i12) {
                    return;
                } else {
                    return;
                }
            }
        }
        i2 = -1;
        String str52 = "http";
        String str62 = "https";
        String str72 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i2 == -1) {
        }
        i3 = n2;
        i4 = 0;
        while (true) {
            c2 = '/';
            c3 = '\\';
            if (i3 < o2) {
            }
            i4++;
            i3 = i13;
        }
        ArrayList arrayList42 = this.f900f;
        char c72 = '#';
        if (i4 < 2) {
            if (kotlin.jvm.internal.i.a(oVar.f904a, this.f895a)) {
            }
        }
        i5 = n2 + i4;
        boolean z42 = false;
        boolean z52 = false;
        while (true) {
            g2 = K1.b.g(str, i5, o2, "@/\\?#");
            if (g2 == o2) {
            }
            if (charAt == c5) {
                break;
            } else {
                break;
            }
        }
        arrayList = arrayList42;
        String str82 = str72;
        String str92 = str62;
        String str102 = str52;
        i6 = i5;
        while (true) {
            if (i6 >= g2) {
            }
            i6++;
        }
        i8 = i7 + 1;
        if (i8 >= g2) {
        }
        if (this.f898d != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f895a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f896b.length() > 0 || this.f897c.length() > 0) {
            sb.append(this.f896b);
            if (this.f897c.length() > 0) {
                sb.append(':');
                sb.append(this.f897c);
            }
            sb.append('@');
        }
        String str2 = this.f898d;
        if (str2 != null) {
            if (z1.g.S(str2, ':')) {
                sb.append('[');
                sb.append(this.f898d);
                sb.append(']');
            } else {
                sb.append(this.f898d);
            }
        }
        int i2 = -1;
        if (this.f899e != -1 || this.f895a != null) {
            int b2 = b();
            String str3 = this.f895a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i2 = 80;
                } else if (str3.equals("https")) {
                    i2 = 443;
                }
            }
            sb.append(':');
            sb.append(b2);
        }
        ArrayList arrayList = this.f900f;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((String) arrayList.get(i3));
        }
        if (this.f901g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f901g;
            kotlin.jvm.internal.i.b(arrayList2);
            C1060a C2 = AbstractC1050a.C(AbstractC1050a.E(0, arrayList2.size()), 2);
            int i4 = C2.f8516a;
            int i5 = C2.f8517b;
            int i6 = C2.f8518c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    int i7 = i4 + i6;
                    String str4 = (String) arrayList2.get(i4);
                    String str5 = (String) arrayList2.get(i4 + 1);
                    if (i4 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 = i7;
                }
            }
        }
        if (this.f902h != null) {
            sb.append('#');
            sb.append(this.f902h);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
