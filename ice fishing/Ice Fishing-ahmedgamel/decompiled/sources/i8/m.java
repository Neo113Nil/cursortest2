package i8;

import java.util.ArrayList;
import java.util.Iterator;
import v7.AbstractC5130k;
import v7.AbstractC5131l;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f38151a;

    /* renamed from: d, reason: collision with root package name */
    public String f38154d;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f38157g;

    /* renamed from: h, reason: collision with root package name */
    public String f38158h;

    /* renamed from: b, reason: collision with root package name */
    public String f38152b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f38153c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f38155e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f38156f = AbstractC5130k.w("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int Z8 = Q7.j.Z(str, '&', i, 4);
            if (Z8 == -1) {
                Z8 = str.length();
            }
            int Z9 = Q7.j.Z(str, '=', i, 4);
            if (Z9 == -1 || Z9 > Z8) {
                String substring = str.substring(i, Z8);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, Z9);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(Z9 + 1, Z8);
                kotlin.jvm.internal.h.d(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i = Z8 + 1;
        }
        return arrayList;
    }

    public final n a() {
        ArrayList arrayList;
        String str = this.f38151a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String c9 = x8.a.c(0, this.f38152b, 0, 7);
        String c10 = x8.a.c(0, this.f38153c, 0, 7);
        String str2 = this.f38154d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b9 = b();
        ArrayList arrayList2 = this.f38156f;
        ArrayList arrayList3 = new ArrayList(AbstractC5131l.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(x8.a.c(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = this.f38157g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC5131l.y(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? x8.a.c(0, str3, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f38158h;
        return new n(str, c9, c10, str2, b9, arrayList, str4 != null ? x8.a.c(0, str4, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.f38155e;
        if (i != -1) {
            return i;
        }
        String str = this.f38151a;
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
        int i6;
        int b9;
        int i9;
        int b10;
        char c9;
        char charAt;
        kotlin.jvm.internal.h.e(input, "input");
        byte[] bArr = j8.c.f38482a;
        int f3 = j8.c.f(0, input.length(), input);
        int g4 = j8.c.g(f3, input.length(), input);
        if (g4 - f3 < 2) {
            i6 = -1;
            i = 6;
        } else {
            char charAt2 = input.charAt(f3);
            char c10 = 'a';
            i = 6;
            if ((kotlin.jvm.internal.h.f(charAt2, 97) >= 0 && kotlin.jvm.internal.h.f(charAt2, 122) <= 0) || (kotlin.jvm.internal.h.f(charAt2, 65) >= 0 && kotlin.jvm.internal.h.f(charAt2, 90) <= 0)) {
                i6 = f3 + 1;
                while (true) {
                    if (i6 >= g4) {
                        break;
                    }
                    char charAt3 = input.charAt(i6);
                    if ((c10 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i6++;
                        c10 = 'a';
                    }
                }
            }
            i6 = -1;
        }
        if (i6 == -1) {
            if (nVar == null) {
                int i10 = i;
                throw new IllegalArgumentException(u1.h.f("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > i10 ? Q7.j.o0(i10, input).concat("...") : input));
            }
            this.f38151a = nVar.f38159a;
        } else if (Q7.q.Q(input, f3, "https:", true)) {
            this.f38151a = "https";
            f3 += 6;
        } else {
            if (!Q7.q.Q(input, f3, "http:", true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = input.substring(0, i6);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f38151a = "http";
            f3 += 5;
        }
        int i11 = 0;
        for (int i12 = f3; i12 < g4 && ((charAt = input.charAt(i12)) == '/' || charAt == '\\'); i12++) {
            i11++;
        }
        ArrayList arrayList = this.f38156f;
        char c11 = '#';
        if (i11 < 2 && nVar != null) {
            if (kotlin.jvm.internal.h.a(nVar.f38159a, this.f38151a)) {
                this.f38152b = nVar.e();
                this.f38153c = nVar.a();
                this.f38154d = nVar.f38162d;
                this.f38155e = nVar.f38163e;
                arrayList.clear();
                arrayList.addAll(nVar.c());
                if (f3 == g4 || input.charAt(f3) == '#') {
                    String d2 = nVar.d();
                    this.f38157g = d2 != null ? d(x8.a.a(0, 0, 83, d2, " \"'<>#")) : null;
                }
                b10 = j8.c.b(f3, g4, input, "?#");
                if (f3 != b10) {
                    char charAt4 = input.charAt(f3);
                    if (charAt4 == '/' || charAt4 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        f3++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (f3 < b10) {
                        int b11 = j8.c.b(f3, b10, input, "/\\");
                        boolean z3 = b11 < b10;
                        String a9 = x8.a.a(f3, b11, 112, input, " \"<>^`{}|/\\?#");
                        if (!a9.equals(com.anythink.core.common.d.j.f12378z) && !a9.equalsIgnoreCase("%2e")) {
                            if (a9.equals("..") || a9.equalsIgnoreCase("%2e.") || a9.equalsIgnoreCase(".%2e") || a9.equalsIgnoreCase("%2e%2e")) {
                                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                    arrayList.add("");
                                } else {
                                    arrayList.set(arrayList.size() - 1, "");
                                }
                                f3 = !z3 ? b11 + 1 : b11;
                            } else {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, a9);
                                } else {
                                    arrayList.add(a9);
                                }
                                if (z3) {
                                    arrayList.add("");
                                }
                            }
                        }
                        if (!z3) {
                        }
                    }
                }
                if (b10 < g4 || input.charAt(b10) != '?') {
                    c9 = '#';
                } else {
                    c9 = '#';
                    int c12 = j8.c.c(input, b10, g4, '#');
                    this.f38157g = d(x8.a.a(b10 + 1, c12, 80, input, " \"'<>#"));
                    b10 = c12;
                }
                if (b10 < g4 || input.charAt(b10) != c9) {
                }
                this.f38158h = x8.a.a(b10 + 1, g4, 48, input, "");
                return;
            }
        }
        int i13 = f3 + i11;
        boolean z6 = false;
        boolean z9 = false;
        while (true) {
            b9 = j8.c.b(i13, g4, input, "@/\\?#");
            char charAt5 = b9 != g4 ? input.charAt(b9) : (char) 65535;
            if (charAt5 == 65535 || charAt5 == c11 || charAt5 == '/' || charAt5 == '\\' || charAt5 == '?') {
                break;
            }
            if (charAt5 == '@') {
                if (z6) {
                    this.f38153c += "%40" + x8.a.a(i13, b9, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                    z6 = z6;
                } else {
                    boolean z10 = z6;
                    int c13 = j8.c.c(input, i13, b9, ':');
                    String a10 = x8.a.a(i13, c13, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                    if (z9) {
                        a10 = D.y.s(new StringBuilder(), this.f38152b, "%40", a10);
                    }
                    this.f38152b = a10;
                    if (c13 != b9) {
                        this.f38153c = x8.a.a(c13 + 1, b9, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                        z6 = true;
                    } else {
                        z6 = z10;
                    }
                    z9 = true;
                }
                i13 = b9 + 1;
                c11 = '#';
            }
        }
        int i14 = i13;
        while (true) {
            if (i14 >= b9) {
                i14 = b9;
                break;
            }
            char charAt6 = input.charAt(i14);
            if (charAt6 == ':') {
                break;
            }
            if (charAt6 == '[') {
                do {
                    i14++;
                    if (i14 < b9) {
                    }
                } while (input.charAt(i14) != ']');
            }
            i14++;
        }
        int i15 = i14 + 1;
        if (i15 < b9) {
            this.f38154d = j8.b.b(x8.a.c(i13, input, i14, 4));
            try {
                i9 = Integer.parseInt(x8.a.a(i15, b9, 120, input, ""));
                if (1 <= i9) {
                }
            } catch (NumberFormatException unused) {
            }
            i9 = -1;
            this.f38155e = i9;
            if (i9 == -1) {
                StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                String substring2 = input.substring(i15, b9);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                sb2.append(substring2);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            int i16 = -1;
            this.f38154d = j8.b.b(x8.a.c(i13, input, i14, 4));
            String str = this.f38151a;
            kotlin.jvm.internal.h.b(str);
            if (str.equals("http")) {
                i16 = 80;
            } else if (str.equals("https")) {
                i16 = 443;
            }
            this.f38155e = i16;
        }
        if (this.f38154d == null) {
            StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
            String substring3 = input.substring(i13, i14);
            kotlin.jvm.internal.h.d(substring3, "substring(...)");
            sb3.append(substring3);
            sb3.append('\"');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        f3 = b9;
        b10 = j8.c.b(f3, g4, input, "?#");
        if (f3 != b10) {
        }
        if (b10 < g4) {
        }
        c9 = '#';
        if (b10 < g4) {
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
        String str = this.f38151a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f38152b.length() > 0 || this.f38153c.length() > 0) {
            sb.append(this.f38152b);
            if (this.f38153c.length() > 0) {
                sb.append(':');
                sb.append(this.f38153c);
            }
            sb.append('@');
        }
        String str2 = this.f38154d;
        if (str2 != null) {
            if (Q7.j.V(str2, ':')) {
                sb.append('[');
                sb.append(this.f38154d);
                sb.append(']');
            } else {
                sb.append(this.f38154d);
            }
        }
        int i = -1;
        if (this.f38155e != -1 || this.f38151a != null) {
            int b9 = b();
            String str3 = this.f38151a;
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
        ArrayList arrayList = this.f38156f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            sb.append('/');
            sb.append((String) arrayList.get(i6));
        }
        if (this.f38157g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f38157g;
            kotlin.jvm.internal.h.b(arrayList2);
            N7.a v9 = V2.a.v(V2.a.x(0, arrayList2.size()), 2);
            int i9 = v9.f2017n;
            int i10 = v9.f2018u;
            int i11 = v9.f2019v;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i9);
                    String str5 = (String) arrayList2.get(i9 + 1);
                    if (i9 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
        }
        if (this.f38158h != null) {
            sb.append('#');
            sb.append(this.f38158h);
        }
        return sb.toString();
    }
}
