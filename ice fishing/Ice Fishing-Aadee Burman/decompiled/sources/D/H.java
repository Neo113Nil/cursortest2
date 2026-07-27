package D;

import S7.AbstractC0406y;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import u.AbstractC5049e;
import v7.AbstractC5129j;
import z7.C5268e;
import z7.C5273j;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes.dex */
public final class H implements V7.b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f435n;

    /* renamed from: u, reason: collision with root package name */
    public int f436u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f437v;

    /* renamed from: w, reason: collision with root package name */
    public Object f438w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f439x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f440y;

    public H(j4.g gVar) {
        this.f435n = 3;
        ArrayList arrayList = (ArrayList) gVar.f38405v;
        int size = arrayList.size();
        this.f437v = (String[]) ((ArrayList) gVar.f38404u).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f438w = dArr;
        ArrayList arrayList2 = (ArrayList) gVar.f38406w;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i6 = 0; i6 < size3; i6++) {
            dArr2[i6] = ((Double) arrayList2.get(i6)).doubleValue();
        }
        this.f439x = dArr2;
        this.f440y = new int[size];
        this.f436u = 0;
    }

    public static /* synthetic */ void m(H h9, String str, int i, int i6) {
        if ((i6 & 2) != 0) {
            i = h9.f436u;
        }
        h9.l(i, str, (i6 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i6 = i + 4;
        if (i6 < charSequence.length()) {
            ((StringBuilder) this.f439x).append((char) (q(charSequence, i + 3) + (q(charSequence, i) << 12) + (q(charSequence, i + 1) << 8) + (q(charSequence, i + 2) << 4)));
            return i6;
        }
        this.f436u = i;
        if (i6 < charSequence.length()) {
            return a(charSequence, this.f436u);
        }
        m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        int i = this.f436u;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f440y;
            if (i >= str.length()) {
                this.f436u = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f436u = i;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i++;
        }
    }

    public void c(int i, String str) {
        String str2 = (String) this.f440y;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) != (str2.charAt(i + i6) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, 6);
                throw null;
            }
        }
        this.f436u = str.length() + i;
    }

    public String d() {
        g('\"');
        int i = this.f436u;
        String str = (String) this.f440y;
        int Z8 = Q7.j.Z(str, '\"', i, 4);
        if (Z8 == -1) {
            j();
            n((byte) 1, false);
            throw null;
        }
        int i6 = i;
        while (i6 < Z8) {
            if (str.charAt(i6) == '\\') {
                int i9 = this.f436u;
                char charAt = str.charAt(i6);
                boolean z3 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f439x).append((CharSequence) str, i9, i6);
                        int s9 = s(i6 + 1);
                        if (s9 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i10 = s9 + 1;
                        char charAt2 = str.charAt(s9);
                        if (charAt2 == 'u') {
                            i10 = a(str, i10);
                        } else {
                            char c9 = charAt2 < 'u' ? g8.c.f37710a[charAt2] : (char) 0;
                            if (c9 == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f439x).append(c9);
                        }
                        i9 = s(i10);
                        if (i9 == -1) {
                            m(this, "Unexpected EOF", i9, 4);
                            throw null;
                        }
                    } else {
                        i6++;
                        if (i6 >= str.length()) {
                            ((StringBuilder) this.f439x).append((CharSequence) str, i9, i6);
                            i9 = s(i6);
                            if (i9 == -1) {
                                m(this, "Unexpected EOF", i9, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i6);
                        }
                    }
                    i6 = i9;
                    z3 = true;
                    charAt = str.charAt(i6);
                }
                String obj = !z3 ? str.subSequence(i9, i6).toString() : k(i9, i6);
                this.f436u = i6 + 1;
                return obj;
            }
            i6++;
        }
        this.f436u = Z8 + 1;
        String substring = str.substring(i, Z8);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        byte d2;
        do {
            int i = this.f436u;
            if (i == -1) {
                return (byte) 10;
            }
            String str = (String) this.f440y;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i6 = this.f436u;
            this.f436u = i6 + 1;
            d2 = g8.l.d(str.charAt(i6));
        } while (d2 == 3);
        return d2;
    }

    public byte f(byte b9) {
        byte e9 = e();
        if (e9 == b9) {
            return e9;
        }
        n(b9, true);
        throw null;
    }

    public void g(char c9) {
        if (this.f436u == -1) {
            w(c9);
            throw null;
        }
        while (true) {
            int i = this.f436u;
            String str = (String) this.f440y;
            if (i >= str.length()) {
                this.f436u = -1;
                w(c9);
                throw null;
            }
            int i6 = this.f436u;
            this.f436u = i6 + 1;
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c9) {
                    return;
                }
                w(c9);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        m(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x014f, code lost:
    
        if (r5 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0151, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0191, code lost:
    
        throw new B0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r14 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0194, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0199, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019c, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x019d, code lost:
    
        m(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a3, code lost:
    
        m(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0113, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        m(r22, "Unexpected symbol '" + r15 + "' in numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0123, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012d, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        m(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        m(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r22.f436u = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0140, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0142, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        if (r5 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0156, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0161, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0169, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016d, code lost:
    
        m(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0185, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long h() {
        boolean z3;
        boolean z6;
        boolean z9;
        int s9 = s(t());
        String str = (String) this.f440y;
        if (s9 < str.length() && s9 != -1) {
            if (str.charAt(s9) == '\"') {
                s9++;
                if (s9 == str.length()) {
                    m(this, "EOF", 0, 6);
                    throw null;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            int i = s9;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            long j6 = 0;
            long j9 = 0;
            while (true) {
                if (i == str.length()) {
                    z6 = z3;
                    z9 = z11;
                    break;
                }
                char charAt = str.charAt(i);
                if ((charAt != 'e' && charAt != 'E') || z11) {
                    z6 = z3;
                    if (charAt == '-' && z11) {
                        if (i == s9) {
                            m(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                            throw null;
                        }
                        i++;
                        z3 = z6;
                        z10 = false;
                    } else if (charAt != '+' || !z11) {
                        z9 = z11;
                        if (charAt != '-') {
                            if (g8.l.d(charAt) != 0) {
                                break;
                            }
                            i++;
                            int i6 = charAt - '0';
                            if (i6 < 0 || i6 >= 10) {
                                break;
                            }
                            if (z9) {
                                j6 = (j6 * 10) + i6;
                                z3 = z6;
                            } else {
                                j9 = (j9 * 10) - i6;
                                if (j9 > 0) {
                                    m(this, "Numeric value overflow", 0, 6);
                                    throw null;
                                }
                                z3 = z6;
                                i = i;
                            }
                            z11 = z9;
                        } else {
                            if (i != s9) {
                                m(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                                throw null;
                            }
                            i++;
                            z3 = z6;
                            z11 = z9;
                            z12 = true;
                        }
                    } else {
                        if (i == s9) {
                            m(this, "Unexpected symbol '+' in numeric literal", 0, 6);
                            throw null;
                        }
                        i++;
                        z3 = z6;
                        z10 = true;
                    }
                } else {
                    if (i == s9) {
                        m(this, "Unexpected symbol " + charAt + " in numeric literal", 0, 6);
                        throw null;
                    }
                    i++;
                    z10 = true;
                    z11 = true;
                }
            }
        } else {
            m(this, "EOF", 0, 6);
            throw null;
        }
    }

    public String i() {
        String str = (String) this.f438w;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.h.b(str);
        this.f438w = null;
        return str;
    }

    public String j() {
        String str = (String) this.f438w;
        if (str != null) {
            kotlin.jvm.internal.h.b(str);
            this.f438w = null;
            return str;
        }
        int t6 = t();
        String str2 = (String) this.f440y;
        if (t6 >= str2.length() || t6 == -1) {
            m(this, "EOF", t6, 4);
            throw null;
        }
        byte d2 = g8.l.d(str2.charAt(t6));
        if (d2 == 1) {
            return i();
        }
        if (d2 != 0) {
            m(this, "Expected beginning of the string, but got " + str2.charAt(t6), 0, 6);
            throw null;
        }
        boolean z3 = false;
        while (g8.l.d(str2.charAt(t6)) == 0) {
            t6++;
            if (t6 >= str2.length()) {
                ((StringBuilder) this.f439x).append((CharSequence) str2, this.f436u, t6);
                int s9 = s(t6);
                if (s9 == -1) {
                    this.f436u = t6;
                    return k(0, 0);
                }
                t6 = s9;
                z3 = true;
            }
        }
        String obj = !z3 ? str2.subSequence(this.f436u, t6).toString() : k(this.f436u, t6);
        this.f436u = t6;
        return obj;
    }

    public String k(int i, int i6) {
        ((StringBuilder) this.f439x).append((CharSequence) this.f440y, i, i6);
        StringBuilder sb = (StringBuilder) this.f439x;
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void l(int i, String message, String hint) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder c9 = AbstractC5049e.c(message, " at path: ");
        c9.append(((F.d) this.f437v).f());
        c9.append(concat);
        throw g8.l.b(i, (String) this.f440y, c9.toString());
    }

    public void n(byte b9, boolean z3) {
        String j6 = g8.l.j(b9);
        int i = z3 ? this.f436u - 1 : this.f436u;
        int i6 = this.f436u;
        String str = (String) this.f440y;
        m(this, y.p("Expected ", j6, ", but had '", (i6 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, 4);
        throw null;
    }

    public Object o(V7.c cVar, InterfaceC5267d interfaceC5267d) {
        Object e9 = AbstractC0406y.e(new W7.j(this, cVar, null), interfaceC5267d);
        return e9 == A7.a.f58n ? e9 : u7.v.f41350a;
    }

    @Override // V7.b
    public Object p(V7.c cVar, InterfaceC5267d interfaceC5267d) {
        u7.v vVar = u7.v.f41350a;
        if (this.f436u == -3) {
            InterfaceC5272i context = interfaceC5267d.getContext();
            Boolean bool = Boolean.FALSE;
            S7.r rVar = S7.r.f2986v;
            InterfaceC5272i interfaceC5272i = (InterfaceC5272i) this.f437v;
            InterfaceC5272i n9 = !((Boolean) interfaceC5272i.l(bool, rVar)).booleanValue() ? context.n(interfaceC5272i) : AbstractC0406y.h(context, interfaceC5272i, false);
            if (kotlin.jvm.internal.h.a(n9, context)) {
                Object o6 = o(cVar, interfaceC5267d);
                if (o6 == A7.a.f58n) {
                    return o6;
                }
            } else {
                C5268e c5268e = C5268e.f42268n;
                if (kotlin.jvm.internal.h.a(n9.m(c5268e), context.m(c5268e))) {
                    InterfaceC5272i context2 = interfaceC5267d.getContext();
                    if (!(cVar instanceof W7.u ? true : cVar instanceof W7.n)) {
                        cVar = new V7.f(cVar, context2);
                    }
                    Object a9 = W7.o.a(n9, cVar, X7.a.l(n9), new W7.f(this, null), interfaceC5267d);
                    if (a9 == A7.a.f58n) {
                        return a9;
                    }
                }
            }
        }
        Object e9 = AbstractC0406y.e(new W7.d(this, cVar, null), interfaceC5267d);
        A7.a aVar = A7.a.f58n;
        if (e9 != aVar) {
            e9 = vVar;
        }
        return e9 == aVar ? e9 : vVar;
    }

    public int q(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public byte r() {
        int i = this.f436u;
        while (true) {
            int s9 = s(i);
            if (s9 == -1) {
                this.f436u = s9;
                return (byte) 10;
            }
            char charAt = ((String) this.f440y).charAt(s9);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f436u = s9;
                return g8.l.d(charAt);
            }
            i = s9 + 1;
        }
    }

    public int s(int i) {
        if (i < ((String) this.f440y).length()) {
            return i;
        }
        return -1;
    }

    public int t() {
        char charAt;
        int i = this.f436u;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.f440y;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.f436u = i;
        return i;
    }

    public String toString() {
        switch (this.f435n) {
            case 1:
                return ((V7.l) this.f439x) + " -> " + u();
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f440y);
                sb.append("', currentPosition=");
                return y.q(sb, this.f436u, ')');
            default:
                return super.toString();
        }
    }

    public String u() {
        ArrayList arrayList = new ArrayList(4);
        C5273j c5273j = C5273j.f42269n;
        InterfaceC5272i interfaceC5272i = (InterfaceC5272i) this.f437v;
        if (interfaceC5272i != c5273j) {
            arrayList.add("context=" + interfaceC5272i);
        }
        int i = this.f436u;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        U7.a aVar = U7.a.f3219n;
        U7.a aVar2 = (U7.a) this.f438w;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + AbstractC5129j.E(arrayList, ", ", null, null, null, 62) + ']';
    }

    public boolean v() {
        int t6 = t();
        String str = (String) this.f440y;
        if (t6 == str.length() || t6 == -1 || str.charAt(t6) != ',') {
            return false;
        }
        this.f436u++;
        return true;
    }

    public void w(char c9) {
        int i = this.f436u;
        if (i > 0 && c9 == '\"') {
            try {
                this.f436u = i - 1;
                String j6 = j();
                this.f436u = i;
                if (kotlin.jvm.internal.h.a(j6, "null")) {
                    l(this.f436u - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f436u = i;
                throw th;
            }
        }
        n(g8.l.d(c9), true);
        throw null;
    }

    public H(V7.g gVar, V7.l lVar, InterfaceC5272i interfaceC5272i, int i, U7.a aVar) {
        this.f435n = 1;
        this.f435n = 1;
        this.f437v = interfaceC5272i;
        this.f436u = i;
        this.f438w = aVar;
        this.f439x = lVar;
        this.f440y = gVar;
    }

    public H(v vVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i6;
        this.f435n = 0;
        new ArrayList();
        this.f440y = new Bundle();
        this.f439x = vVar;
        Context context = vVar.f494a;
        this.f437v = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f438w = D.a(context, vVar.f511s);
        } else {
            this.f438w = new Notification.Builder(vVar.f494a);
        }
        Notification notification = vVar.f514v;
        int i9 = 0;
        ((Notification.Builder) this.f438w).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(vVar.f498e).setContentText(vVar.f499f).setContentInfo(null).setContentIntent(vVar.f500g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(vVar.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f438w;
        IconCompat iconCompat = vVar.f501h;
        B.b(builder, iconCompat == null ? null : H.c.c(iconCompat, context));
        ((Notification.Builder) this.f438w).setSubText(null).setUsesChronometer(false).setPriority(vVar.f502j);
        Iterator it = vVar.f495b.iterator();
        while (it.hasNext()) {
            C0297p c0297p = (C0297p) it.next();
            if (c0297p.f483b == null && (i6 = c0297p.f486e) != 0) {
                c0297p.f483b = IconCompat.b(i6);
            }
            IconCompat iconCompat2 = c0297p.f483b;
            Notification.Action.Builder a9 = B.a(iconCompat2 != null ? H.c.c(iconCompat2, null) : null, c0297p.f487f, c0297p.f488g);
            Bundle bundle3 = c0297p.f482a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z3 = c0297p.f484c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            int i10 = Build.VERSION.SDK_INT;
            C.a(a9, z3);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i10 >= 28) {
                E.b(a9, 0);
            }
            if (i10 >= 29) {
                F.c(a9, false);
            }
            if (i10 >= 31) {
                G.a(a9, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0297p.f485d);
            z.b(a9, bundle2);
            z.a((Notification.Builder) this.f438w, z.d(a9));
        }
        Bundle bundle4 = vVar.f508p;
        if (bundle4 != null) {
            ((Bundle) this.f440y).putAll(bundle4);
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f438w).setShowWhen(vVar.f503k);
        z.i((Notification.Builder) this.f438w, vVar.f507o);
        z.g((Notification.Builder) this.f438w, vVar.f505m);
        z.j((Notification.Builder) this.f438w, null);
        z.h((Notification.Builder) this.f438w, vVar.f506n);
        this.f436u = vVar.f512t;
        A.b((Notification.Builder) this.f438w, null);
        A.c((Notification.Builder) this.f438w, vVar.f509q);
        A.f((Notification.Builder) this.f438w, vVar.f510r);
        A.d((Notification.Builder) this.f438w, null);
        A.e((Notification.Builder) this.f438w, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = vVar.f515w;
        ArrayList arrayList3 = vVar.f496c;
        if (i11 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw y.j(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    s.c cVar = new s.c(arrayList2.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                A.a((Notification.Builder) this.f438w, (String) it3.next());
            }
        }
        ArrayList arrayList4 = vVar.f497d;
        if (arrayList4.size() > 0) {
            if (vVar.f508p == null) {
                vVar.f508p = new Bundle();
            }
            Bundle bundle5 = vVar.f508p.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList4.size()) {
                String num = Integer.toString(i12);
                C0297p c0297p2 = (C0297p) arrayList4.get(i12);
                Bundle bundle8 = new Bundle();
                if (c0297p2.f483b == null && (i = c0297p2.f486e) != 0) {
                    c0297p2.f483b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c0297p2.f483b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i9);
                bundle8.putCharSequence("title", c0297p2.f487f);
                bundle8.putParcelable("actionIntent", c0297p2.f488g);
                Bundle bundle9 = c0297p2.f482a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0297p2.f484c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0297p2.f485d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i12++;
                i9 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (vVar.f508p == null) {
                vVar.f508p = new Bundle();
            }
            vVar.f508p.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f440y).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f438w).setExtras(vVar.f508p);
        C.e((Notification.Builder) this.f438w, null);
        if (i13 >= 26) {
            D.b((Notification.Builder) this.f438w, 0);
            D.e((Notification.Builder) this.f438w, null);
            D.f((Notification.Builder) this.f438w, null);
            D.g((Notification.Builder) this.f438w, 0L);
            D.d((Notification.Builder) this.f438w, vVar.f512t);
            if (!TextUtils.isEmpty(vVar.f511s)) {
                ((Notification.Builder) this.f438w).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw y.j(it4);
            }
        }
        if (i13 >= 29) {
            F.a((Notification.Builder) this.f438w, vVar.f513u);
            F.b((Notification.Builder) this.f438w, null);
        }
    }

    public H(String source) {
        this.f435n = 2;
        kotlin.jvm.internal.h.e(source, "source");
        F.d dVar = new F.d((byte) 0, 6);
        dVar.f855c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        dVar.f856d = iArr;
        dVar.f854b = -1;
        this.f437v = dVar;
        this.f439x = new StringBuilder();
        this.f440y = source;
    }
}
