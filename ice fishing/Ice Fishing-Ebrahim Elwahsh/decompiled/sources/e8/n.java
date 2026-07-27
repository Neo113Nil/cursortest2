package e8;

import a.AbstractC0415a;
import java.util.ArrayList;
import java.util.Iterator;
import r7.AbstractC4980k;
import r7.AbstractC4981l;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f37429a;

    /* renamed from: d, reason: collision with root package name */
    public String f37432d;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f37435g;

    /* renamed from: h, reason: collision with root package name */
    public String f37436h;

    /* renamed from: b, reason: collision with root package name */
    public String f37430b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f37431c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f37433e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f37434f = AbstractC4980k.C("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int Q3 = M7.j.Q(str, '&', i, 4);
            if (Q3 == -1) {
                Q3 = str.length();
            }
            int Q8 = M7.j.Q(str, '=', i, 4);
            if (Q8 == -1 || Q8 > Q3) {
                String substring = str.substring(i, Q3);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, Q8);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(Q8 + 1, Q3);
                kotlin.jvm.internal.h.d(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i = Q3 + 1;
        }
        return arrayList;
    }

    public final o a() {
        ArrayList arrayList;
        String str = this.f37429a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String c4 = t8.a.c(0, this.f37430b, 0, 7);
        String c9 = t8.a.c(0, this.f37431c, 0, 7);
        String str2 = this.f37432d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b9 = b();
        ArrayList arrayList2 = this.f37434f;
        ArrayList arrayList3 = new ArrayList(AbstractC4981l.E(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(t8.a.c(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = this.f37435g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC4981l.E(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? t8.a.c(0, str3, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f37436h;
        return new o(str, c4, c9, str2, b9, arrayList, str4 != null ? t8.a.c(0, str4, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.f37433e;
        if (i != -1) {
            return i;
        }
        String str = this.f37429a;
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
    public final void c(o oVar, String input) {
        int i;
        int i4;
        int b9;
        int i9;
        int b10;
        char c4;
        char charAt;
        kotlin.jvm.internal.h.e(input, "input");
        byte[] bArr = f8.c.f37814a;
        int f6 = f8.c.f(0, input.length(), input);
        int g9 = f8.c.g(f6, input.length(), input);
        if (g9 - f6 < 2) {
            i4 = -1;
            i = 6;
        } else {
            char charAt2 = input.charAt(f6);
            char c9 = 'a';
            i = 6;
            if ((kotlin.jvm.internal.h.f(charAt2, 97) >= 0 && kotlin.jvm.internal.h.f(charAt2, 122) <= 0) || (kotlin.jvm.internal.h.f(charAt2, 65) >= 0 && kotlin.jvm.internal.h.f(charAt2, 90) <= 0)) {
                i4 = f6 + 1;
                while (true) {
                    if (i4 >= g9) {
                        break;
                    }
                    char charAt3 = input.charAt(i4);
                    if ((c9 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i4++;
                        c9 = 'a';
                    }
                }
            }
            i4 = -1;
        }
        if (i4 == -1) {
            if (oVar == null) {
                int i10 = i;
                throw new IllegalArgumentException(AbstractC5051n.f("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > i10 ? M7.j.f0(i10, input).concat("...") : input));
            }
            this.f37429a = oVar.f37437a;
        } else if (M7.q.H(input, f6, "https:", true)) {
            this.f37429a = "https";
            f6 += 6;
        } else {
            if (!M7.q.H(input, f6, "http:", true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = input.substring(0, i4);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f37429a = "http";
            f6 += 5;
        }
        int i11 = 0;
        for (int i12 = f6; i12 < g9 && ((charAt = input.charAt(i12)) == '/' || charAt == '\\'); i12++) {
            i11++;
        }
        ArrayList arrayList = this.f37434f;
        char c10 = '#';
        if (i11 < 2 && oVar != null) {
            if (kotlin.jvm.internal.h.a(oVar.f37437a, this.f37429a)) {
                this.f37430b = oVar.e();
                this.f37431c = oVar.a();
                this.f37432d = oVar.f37440d;
                this.f37433e = oVar.f37441e;
                arrayList.clear();
                arrayList.addAll(oVar.c());
                if (f6 == g9 || input.charAt(f6) == '#') {
                    String d2 = oVar.d();
                    this.f37435g = d2 != null ? d(t8.a.a(0, 0, 83, d2, " \"'<>#")) : null;
                }
                b10 = f8.c.b(f6, g9, input, "?#");
                if (f6 != b10) {
                    char charAt4 = input.charAt(f6);
                    if (charAt4 == '/' || charAt4 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        f6++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (f6 < b10) {
                        int b11 = f8.c.b(f6, b10, input, "/\\");
                        boolean z8 = b11 < b10;
                        String a9 = t8.a.a(f6, b11, 112, input, " \"<>^`{}|/\\?#");
                        if (!a9.equals(com.anythink.core.common.d.j.f12535z) && !a9.equalsIgnoreCase("%2e")) {
                            if (a9.equals("..") || a9.equalsIgnoreCase("%2e.") || a9.equalsIgnoreCase(".%2e") || a9.equalsIgnoreCase("%2e%2e")) {
                                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                    arrayList.add("");
                                } else {
                                    arrayList.set(arrayList.size() - 1, "");
                                }
                                f6 = !z8 ? b11 + 1 : b11;
                            } else {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, a9);
                                } else {
                                    arrayList.add(a9);
                                }
                                if (z8) {
                                    arrayList.add("");
                                }
                            }
                        }
                        if (!z8) {
                        }
                    }
                }
                if (b10 < g9 || input.charAt(b10) != '?') {
                    c4 = '#';
                } else {
                    c4 = '#';
                    int c11 = f8.c.c(input, b10, g9, '#');
                    this.f37435g = d(t8.a.a(b10 + 1, c11, 80, input, " \"'<>#"));
                    b10 = c11;
                }
                if (b10 < g9 || input.charAt(b10) != c4) {
                }
                this.f37436h = t8.a.a(b10 + 1, g9, 48, input, "");
                return;
            }
        }
        int i13 = f6 + i11;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            b9 = f8.c.b(i13, g9, input, "@/\\?#");
            char charAt5 = b9 != g9 ? input.charAt(b9) : (char) 65535;
            if (charAt5 == 65535 || charAt5 == c10 || charAt5 == '/' || charAt5 == '\\' || charAt5 == '?') {
                break;
            }
            if (charAt5 == '@') {
                if (z9) {
                    this.f37431c += "%40" + t8.a.a(i13, b9, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                    z9 = z9;
                } else {
                    boolean z11 = z9;
                    int c12 = f8.c.c(input, i13, b9, ':');
                    String a10 = t8.a.a(i13, c12, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                    if (z10) {
                        a10 = D.y.o(new StringBuilder(), this.f37430b, "%40", a10);
                    }
                    this.f37430b = a10;
                    if (c12 != b9) {
                        this.f37431c = t8.a.a(c12 + 1, b9, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                        z9 = true;
                    } else {
                        z9 = z11;
                    }
                    z10 = true;
                }
                i13 = b9 + 1;
                c10 = '#';
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
            this.f37432d = f8.b.b(t8.a.c(i13, input, i14, 4));
            try {
                i9 = Integer.parseInt(t8.a.a(i15, b9, 120, input, ""));
                if (1 <= i9) {
                }
            } catch (NumberFormatException unused) {
            }
            i9 = -1;
            this.f37433e = i9;
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
            this.f37432d = f8.b.b(t8.a.c(i13, input, i14, 4));
            String str = this.f37429a;
            kotlin.jvm.internal.h.b(str);
            if (str.equals("http")) {
                i16 = 80;
            } else if (str.equals("https")) {
                i16 = 443;
            }
            this.f37433e = i16;
        }
        if (this.f37432d == null) {
            StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
            String substring3 = input.substring(i13, i14);
            kotlin.jvm.internal.h.d(substring3, "substring(...)");
            sb3.append(substring3);
            sb3.append('\"');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        f6 = b9;
        b10 = f8.c.b(f6, g9, input, "?#");
        if (f6 != b10) {
        }
        if (b10 < g9) {
        }
        c4 = '#';
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
        String str = this.f37429a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f37430b.length() > 0 || this.f37431c.length() > 0) {
            sb.append(this.f37430b);
            if (this.f37431c.length() > 0) {
                sb.append(':');
                sb.append(this.f37431c);
            }
            sb.append('@');
        }
        String str2 = this.f37432d;
        if (str2 != null) {
            if (M7.j.M(str2, ':')) {
                sb.append('[');
                sb.append(this.f37432d);
                sb.append(']');
            } else {
                sb.append(this.f37432d);
            }
        }
        int i = -1;
        if (this.f37433e != -1 || this.f37429a != null) {
            int b9 = b();
            String str3 = this.f37429a;
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
        ArrayList arrayList = this.f37434f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append('/');
            sb.append((String) arrayList.get(i4));
        }
        if (this.f37435g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f37435g;
            kotlin.jvm.internal.h.b(arrayList2);
            J7.a C7 = AbstractC0415a.C(AbstractC0415a.E(0, arrayList2.size()), 2);
            int i9 = C7.f1464n;
            int i10 = C7.f1465u;
            int i11 = C7.f1466v;
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
        if (this.f37436h != null) {
            sb.append('#');
            sb.append(this.f37436h);
        }
        return sb.toString();
    }
}
