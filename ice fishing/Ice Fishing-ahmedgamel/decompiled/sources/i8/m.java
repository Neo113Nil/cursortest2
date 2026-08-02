package i8;

import java.util.ArrayList;
import java.util.Iterator;
import v7.AbstractC5120k;
import v7.AbstractC5121l;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f38270a;

    /* renamed from: d, reason: collision with root package name */
    public String f38273d;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f38276g;

    /* renamed from: h, reason: collision with root package name */
    public String f38277h;

    /* renamed from: b, reason: collision with root package name */
    public String f38271b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f38272c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f38274e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f38275f = AbstractC5120k.u("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int p02 = Q7.j.p0(str, '&', i, 4);
            if (p02 == -1) {
                p02 = str.length();
            }
            int p03 = Q7.j.p0(str, '=', i, 4);
            if (p03 == -1 || p03 > p02) {
                String substring = str.substring(i, p02);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, p03);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(p03 + 1, p02);
                kotlin.jvm.internal.h.d(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i = p02 + 1;
        }
        return arrayList;
    }

    public final n a() {
        ArrayList arrayList;
        String str = this.f38270a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String c9 = x8.a.c(0, this.f38271b, 0, 7);
        String c10 = x8.a.c(0, this.f38272c, 0, 7);
        String str2 = this.f38273d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b9 = b();
        ArrayList arrayList2 = this.f38275f;
        ArrayList arrayList3 = new ArrayList(AbstractC5121l.w(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(x8.a.c(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = this.f38276g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC5121l.w(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? x8.a.c(0, str3, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f38277h;
        return new n(str, c9, c10, str2, b9, arrayList, str4 != null ? x8.a.c(0, str4, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.f38274e;
        if (i != -1) {
            return i;
        }
        String str = this.f38270a;
        kotlin.jvm.internal.h.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0208, code lost:
    
        if (r3 < 65536) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x007c, code lost:
    
        if (r15 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0323 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(n nVar, String input) {
        int i;
        int i4;
        int b9;
        int i6;
        int b10;
        char c9;
        char charAt;
        kotlin.jvm.internal.h.e(input, "input");
        byte[] bArr = j8.c.f38494a;
        int f2 = j8.c.f(0, input.length(), input);
        int g9 = j8.c.g(f2, input.length(), input);
        if (g9 - f2 < 2) {
            i4 = -1;
            i = 6;
        } else {
            char charAt2 = input.charAt(f2);
            char c10 = 'a';
            i = 6;
            if ((kotlin.jvm.internal.h.f(charAt2, 97) >= 0 && kotlin.jvm.internal.h.f(charAt2, 122) <= 0) || (kotlin.jvm.internal.h.f(charAt2, 65) >= 0 && kotlin.jvm.internal.h.f(charAt2, 90) <= 0)) {
                i4 = f2 + 1;
                while (true) {
                    if (i4 >= g9) {
                        break;
                    }
                    char charAt3 = input.charAt(i4);
                    if ((c10 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i4++;
                        c10 = 'a';
                    }
                }
            }
            i4 = -1;
        }
        if (i4 == -1) {
            if (nVar == null) {
                int i9 = i;
                throw new IllegalArgumentException(AbstractC5128c.f("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > i9 ? Q7.j.E0(i9, input).concat("...") : input));
            }
            this.f38270a = nVar.f38278a;
        } else if (Q7.q.g0(input, f2, "https:", true)) {
            this.f38270a = "https";
            f2 += 6;
        } else {
            if (!Q7.q.g0(input, f2, "http:", true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = input.substring(0, i4);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f38270a = "http";
            f2 += 5;
        }
        int i10 = 0;
        for (int i11 = f2; i11 < g9 && ((charAt = input.charAt(i11)) == '/' || charAt == '\\'); i11++) {
            i10++;
        }
        ArrayList arrayList = this.f38275f;
        char c11 = '#';
        if (i10 < 2 && nVar != null) {
            if (kotlin.jvm.internal.h.a(nVar.f38278a, this.f38270a)) {
                this.f38271b = nVar.e();
                this.f38272c = nVar.a();
                this.f38273d = nVar.f38281d;
                this.f38274e = nVar.f38282e;
                arrayList.clear();
                arrayList.addAll(nVar.c());
                if (f2 == g9 || input.charAt(f2) == '#') {
                    String d9 = nVar.d();
                    this.f38276g = d9 != null ? d(x8.a.a(0, 0, 83, d9, " \"'<>#")) : null;
                }
                b10 = j8.c.b(f2, g9, input, "?#");
                if (f2 != b10) {
                    char charAt4 = input.charAt(f2);
                    if (charAt4 == '/' || charAt4 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        f2++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (f2 < b10) {
                        int b11 = j8.c.b(f2, b10, input, "/\\");
                        boolean z6 = b11 < b10;
                        String a9 = x8.a.a(f2, b11, 112, input, " \"<>^`{}|/\\?#");
                        if (!a9.equals(com.anythink.core.common.d.j.f13164z) && !a9.equalsIgnoreCase("%2e")) {
                            if (a9.equals("..") || a9.equalsIgnoreCase("%2e.") || a9.equalsIgnoreCase(".%2e") || a9.equalsIgnoreCase("%2e%2e")) {
                                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                    arrayList.add("");
                                } else {
                                    arrayList.set(arrayList.size() - 1, "");
                                }
                                f2 = !z6 ? b11 + 1 : b11;
                            } else {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, a9);
                                } else {
                                    arrayList.add(a9);
                                }
                                if (z6) {
                                    arrayList.add("");
                                }
                            }
                        }
                        if (!z6) {
                        }
                    }
                }
                if (b10 < g9 || input.charAt(b10) != '?') {
                    c9 = '#';
                } else {
                    c9 = '#';
                    int c12 = j8.c.c(input, b10, g9, '#');
                    this.f38276g = d(x8.a.a(b10 + 1, c12, 80, input, " \"'<>#"));
                    b10 = c12;
                }
                if (b10 < g9 || input.charAt(b10) != c9) {
                }
                this.f38277h = x8.a.a(b10 + 1, g9, 48, input, "");
                return;
            }
        }
        int i12 = f2 + i10;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            b9 = j8.c.b(i12, g9, input, "@/\\?#");
            char charAt5 = b9 != g9 ? input.charAt(b9) : (char) 65535;
            if (charAt5 == 65535 || charAt5 == c11 || charAt5 == '/' || charAt5 == '\\' || charAt5 == '?') {
                break;
            }
            if (charAt5 == '@') {
                if (z9) {
                    this.f38272c += "%40" + x8.a.a(i12, b9, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                    z9 = z9;
                } else {
                    boolean z11 = z9;
                    int c13 = j8.c.c(input, i12, b9, ':');
                    String a10 = x8.a.a(i12, c13, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                    if (z10) {
                        a10 = D.x.p(new StringBuilder(), this.f38271b, "%40", a10);
                    }
                    this.f38271b = a10;
                    if (c13 != b9) {
                        this.f38272c = x8.a.a(c13 + 1, b9, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                        z9 = true;
                    } else {
                        z9 = z11;
                    }
                    z10 = true;
                }
                i12 = b9 + 1;
                c11 = '#';
            }
        }
        int i13 = i12;
        while (true) {
            if (i13 >= b9) {
                i13 = b9;
                break;
            }
            char charAt6 = input.charAt(i13);
            if (charAt6 == ':') {
                break;
            }
            if (charAt6 == '[') {
                do {
                    i13++;
                    if (i13 < b9) {
                    }
                } while (input.charAt(i13) != ']');
            }
            i13++;
        }
        int i14 = i13 + 1;
        if (i14 < b9) {
            this.f38273d = j8.b.b(x8.a.c(i12, input, i13, 4));
            try {
                i6 = Integer.parseInt(x8.a.a(i14, b9, 120, input, ""));
                if (1 <= i6) {
                }
            } catch (NumberFormatException unused) {
            }
            i6 = -1;
            this.f38274e = i6;
            if (i6 == -1) {
                StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                String substring2 = input.substring(i14, b9);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                sb2.append(substring2);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            int i15 = -1;
            this.f38273d = j8.b.b(x8.a.c(i12, input, i13, 4));
            String str = this.f38270a;
            kotlin.jvm.internal.h.b(str);
            if (str.equals("http")) {
                i15 = 80;
            } else if (str.equals("https")) {
                i15 = 443;
            }
            this.f38274e = i15;
        }
        if (this.f38273d == null) {
            StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
            String substring3 = input.substring(i12, i13);
            kotlin.jvm.internal.h.d(substring3, "substring(...)");
            sb3.append(substring3);
            sb3.append('\"');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        f2 = b9;
        b10 = j8.c.b(f2, g9, input, "?#");
        if (f2 != b10) {
        }
        if (b10 < g9) {
        }
        c9 = '#';
        if (b10 < g9) {
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
        String str = this.f38270a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f38271b.length() > 0 || this.f38272c.length() > 0) {
            sb.append(this.f38271b);
            if (this.f38272c.length() > 0) {
                sb.append(':');
                sb.append(this.f38272c);
            }
            sb.append('@');
        }
        String str2 = this.f38273d;
        if (str2 != null) {
            if (Q7.j.l0(str2, ':')) {
                sb.append('[');
                sb.append(this.f38273d);
                sb.append(']');
            } else {
                sb.append(this.f38273d);
            }
        }
        int i = -1;
        if (this.f38274e != -1 || this.f38270a != null) {
            int b9 = b();
            String str3 = this.f38270a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
            }
            sb.append(':');
            sb.append(b9);
        }
        ArrayList arrayList = this.f38275f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append('/');
            sb.append((String) arrayList.get(i4));
        }
        if (this.f38276g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f38276g;
            kotlin.jvm.internal.h.b(arrayList2);
            N7.a t6 = S0.f.t(S0.f.x(0, arrayList2.size()), 2);
            int i6 = t6.f2105n;
            int i9 = t6.f2106u;
            int i10 = t6.f2107v;
            if ((i10 > 0 && i6 <= i9) || (i10 < 0 && i9 <= i6)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i6);
                    String str5 = (String) arrayList2.get(i6 + 1);
                    if (i6 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i6 == i9) {
                        break;
                    }
                    i6 += i10;
                }
            }
        }
        if (this.f38277h != null) {
            sb.append('#');
            sb.append(this.f38277h);
        }
        return sb.toString();
    }
}
