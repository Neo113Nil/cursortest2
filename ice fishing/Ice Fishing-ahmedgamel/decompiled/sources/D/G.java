package D;

import S7.AbstractC0410y;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import u.AbstractC5050e;
import v7.AbstractC5119j;
import z7.C5241e;
import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes.dex */
public final class G implements V7.b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f332n;

    /* renamed from: u, reason: collision with root package name */
    public int f333u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f334v;

    /* renamed from: w, reason: collision with root package name */
    public Object f335w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f336x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f337y;

    public G(l4.g gVar) {
        this.f332n = 3;
        ArrayList arrayList = (ArrayList) gVar.f38917v;
        int size = arrayList.size();
        this.f334v = (String[]) ((ArrayList) gVar.f38916u).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f335w = dArr;
        ArrayList arrayList2 = (ArrayList) gVar.f38918w;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i4 = 0; i4 < size3; i4++) {
            dArr2[i4] = ((Double) arrayList2.get(i4)).doubleValue();
        }
        this.f336x = dArr2;
        this.f337y = new int[size];
        this.f333u = 0;
    }

    public static /* synthetic */ void n(G g9, String str, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = g9.f333u;
        }
        g9.m(i, str, (i4 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i4 = i + 4;
        if (i4 < charSequence.length()) {
            ((StringBuilder) this.f336x).append((char) (q(charSequence, i + 3) + (q(charSequence, i) << 12) + (q(charSequence, i + 1) << 8) + (q(charSequence, i + 2) << 4)));
            return i4;
        }
        this.f333u = i;
        if (i4 < charSequence.length()) {
            return a(charSequence, this.f333u);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        int i = this.f333u;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f337y;
            if (i >= str.length()) {
                this.f333u = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f333u = i;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i++;
        }
    }

    public void c(int i, String str) {
        String str2 = (String) this.f337y;
        if (str2.length() - i < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != (str2.charAt(i + i4) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, 6);
                throw null;
            }
        }
        this.f333u = str.length() + i;
    }

    public String d() {
        g('\"');
        int i = this.f333u;
        String str = (String) this.f337y;
        int p02 = Q7.j.p0(str, '\"', i, 4);
        if (p02 == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i4 = i;
        while (i4 < p02) {
            if (str.charAt(i4) == '\\') {
                int i6 = this.f333u;
                char charAt = str.charAt(i4);
                boolean z6 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f336x).append((CharSequence) str, i6, i4);
                        int s9 = s(i4 + 1);
                        if (s9 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i9 = s9 + 1;
                        char charAt2 = str.charAt(s9);
                        if (charAt2 == 'u') {
                            i9 = a(str, i9);
                        } else {
                            char c9 = charAt2 < 'u' ? g8.c.f37735a[charAt2] : (char) 0;
                            if (c9 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f336x).append(c9);
                        }
                        i6 = s(i9);
                        if (i6 == -1) {
                            n(this, "Unexpected EOF", i6, 4);
                            throw null;
                        }
                    } else {
                        i4++;
                        if (i4 >= str.length()) {
                            ((StringBuilder) this.f336x).append((CharSequence) str, i6, i4);
                            i6 = s(i4);
                            if (i6 == -1) {
                                n(this, "Unexpected EOF", i6, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i4);
                        }
                    }
                    i4 = i6;
                    z6 = true;
                    charAt = str.charAt(i4);
                }
                String obj = !z6 ? str.subSequence(i6, i4).toString() : k(i6, i4);
                this.f333u = i4 + 1;
                return obj;
            }
            i4++;
        }
        this.f333u = p02 + 1;
        String substring = str.substring(i, p02);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        byte d9;
        do {
            int i = this.f333u;
            if (i == -1) {
                return (byte) 10;
            }
            String str = (String) this.f337y;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i4 = this.f333u;
            this.f333u = i4 + 1;
            d9 = g8.l.d(str.charAt(i4));
        } while (d9 == 3);
        return d9;
    }

    public byte f(byte b9) {
        byte e9 = e();
        if (e9 == b9) {
            return e9;
        }
        o(b9, true);
        throw null;
    }

    public void g(char c9) {
        if (this.f333u == -1) {
            w(c9);
            throw null;
        }
        while (true) {
            int i = this.f333u;
            String str = (String) this.f337y;
            if (i >= str.length()) {
                this.f333u = -1;
                w(c9);
                throw null;
            }
            int i4 = this.f333u;
            this.f333u = i4 + 1;
            char charAt = str.charAt(i4);
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
    
        n(r22, "Numeric value overflow", 0, 6);
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
    
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a3, code lost:
    
        n(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0113, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        n(r22, "Unexpected symbol '" + r15 + "' in numeric literal", 0, 6);
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
    
        n(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        n(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r22.f333u = r12;
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
    
        n(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0185, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long h() {
        boolean z6;
        boolean z9;
        boolean z10;
        int s9 = s(t());
        String str = (String) this.f337y;
        if (s9 < str.length() && s9 != -1) {
            if (str.charAt(s9) == '\"') {
                s9++;
                if (s9 == str.length()) {
                    n(this, "EOF", 0, 6);
                    throw null;
                }
                z6 = true;
            } else {
                z6 = false;
            }
            int i = s9;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            long j6 = 0;
            long j9 = 0;
            while (true) {
                if (i == str.length()) {
                    z9 = z6;
                    z10 = z12;
                    break;
                }
                char charAt = str.charAt(i);
                if ((charAt != 'e' && charAt != 'E') || z12) {
                    z9 = z6;
                    if (charAt == '-' && z12) {
                        if (i == s9) {
                            n(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                            throw null;
                        }
                        i++;
                        z6 = z9;
                        z11 = false;
                    } else if (charAt != '+' || !z12) {
                        z10 = z12;
                        if (charAt != '-') {
                            if (g8.l.d(charAt) != 0) {
                                break;
                            }
                            i++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z10) {
                                j6 = (j6 * 10) + i4;
                                z6 = z9;
                            } else {
                                j9 = (j9 * 10) - i4;
                                if (j9 > 0) {
                                    n(this, "Numeric value overflow", 0, 6);
                                    throw null;
                                }
                                z6 = z9;
                                i = i;
                            }
                            z12 = z10;
                        } else {
                            if (i != s9) {
                                n(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                                throw null;
                            }
                            i++;
                            z6 = z9;
                            z12 = z10;
                            z13 = true;
                        }
                    } else {
                        if (i == s9) {
                            n(this, "Unexpected symbol '+' in numeric literal", 0, 6);
                            throw null;
                        }
                        i++;
                        z6 = z9;
                        z11 = true;
                    }
                } else {
                    if (i == s9) {
                        n(this, "Unexpected symbol " + charAt + " in numeric literal", 0, 6);
                        throw null;
                    }
                    i++;
                    z11 = true;
                    z12 = true;
                }
            }
        } else {
            n(this, "EOF", 0, 6);
            throw null;
        }
    }

    public String i() {
        String str = (String) this.f335w;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.h.b(str);
        this.f335w = null;
        return str;
    }

    public String j() {
        String str = (String) this.f335w;
        if (str != null) {
            kotlin.jvm.internal.h.b(str);
            this.f335w = null;
            return str;
        }
        int t6 = t();
        String str2 = (String) this.f337y;
        if (t6 >= str2.length() || t6 == -1) {
            n(this, "EOF", t6, 4);
            throw null;
        }
        byte d9 = g8.l.d(str2.charAt(t6));
        if (d9 == 1) {
            return i();
        }
        if (d9 != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(t6), 0, 6);
            throw null;
        }
        boolean z6 = false;
        while (g8.l.d(str2.charAt(t6)) == 0) {
            t6++;
            if (t6 >= str2.length()) {
                ((StringBuilder) this.f336x).append((CharSequence) str2, this.f333u, t6);
                int s9 = s(t6);
                if (s9 == -1) {
                    this.f333u = t6;
                    return k(0, 0);
                }
                t6 = s9;
                z6 = true;
            }
        }
        String obj = !z6 ? str2.subSequence(this.f333u, t6).toString() : k(this.f333u, t6);
        this.f333u = t6;
        return obj;
    }

    public String k(int i, int i4) {
        ((StringBuilder) this.f336x).append((CharSequence) this.f337y, i, i4);
        StringBuilder sb = (StringBuilder) this.f336x;
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    @Override // V7.b
    public Object l(V7.c cVar, InterfaceC5240d interfaceC5240d) {
        u7.v vVar = u7.v.f41073a;
        if (this.f333u == -3) {
            InterfaceC5245i context = interfaceC5240d.getContext();
            Boolean bool = Boolean.FALSE;
            S7.r rVar = S7.r.f3069v;
            InterfaceC5245i interfaceC5245i = (InterfaceC5245i) this.f334v;
            InterfaceC5245i n9 = !((Boolean) interfaceC5245i.l(bool, rVar)).booleanValue() ? context.n(interfaceC5245i) : AbstractC0410y.h(context, interfaceC5245i, false);
            if (kotlin.jvm.internal.h.a(n9, context)) {
                Object p9 = p(cVar, interfaceC5240d);
                if (p9 == A7.a.f215n) {
                    return p9;
                }
            } else {
                C5241e c5241e = C5241e.f42240n;
                if (kotlin.jvm.internal.h.a(n9.m(c5241e), context.m(c5241e))) {
                    InterfaceC5245i context2 = interfaceC5240d.getContext();
                    if (!(cVar instanceof W7.u ? true : cVar instanceof W7.n)) {
                        cVar = new V7.f(cVar, context2);
                    }
                    Object a9 = W7.o.a(n9, cVar, X7.a.l(n9), new W7.f(this, null), interfaceC5240d);
                    if (a9 == A7.a.f215n) {
                        return a9;
                    }
                }
            }
        }
        Object e9 = AbstractC0410y.e(new W7.d(this, cVar, null), interfaceC5240d);
        A7.a aVar = A7.a.f215n;
        if (e9 != aVar) {
            e9 = vVar;
        }
        return e9 == aVar ? e9 : vVar;
    }

    public void m(int i, String message, String hint) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder c9 = AbstractC5050e.c(message, " at path: ");
        c9.append(((F.d) this.f334v).f());
        c9.append(concat);
        throw g8.l.b(i, (String) this.f337y, c9.toString());
    }

    public void o(byte b9, boolean z6) {
        String j6 = g8.l.j(b9);
        int i = z6 ? this.f333u - 1 : this.f333u;
        int i4 = this.f333u;
        String str = (String) this.f337y;
        n(this, x.m("Expected ", j6, ", but had '", (i4 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, 4);
        throw null;
    }

    public Object p(V7.c cVar, InterfaceC5240d interfaceC5240d) {
        Object e9 = AbstractC0410y.e(new W7.j(this, cVar, null), interfaceC5240d);
        return e9 == A7.a.f215n ? e9 : u7.v.f41073a;
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
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public byte r() {
        int i = this.f333u;
        while (true) {
            int s9 = s(i);
            if (s9 == -1) {
                this.f333u = s9;
                return (byte) 10;
            }
            char charAt = ((String) this.f337y).charAt(s9);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f333u = s9;
                return g8.l.d(charAt);
            }
            i = s9 + 1;
        }
    }

    public int s(int i) {
        if (i < ((String) this.f337y).length()) {
            return i;
        }
        return -1;
    }

    public int t() {
        char charAt;
        int i = this.f333u;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.f337y;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.f333u = i;
        return i;
    }

    public String toString() {
        switch (this.f332n) {
            case 1:
                return ((V7.l) this.f336x) + " -> " + u();
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f337y);
                sb.append("', currentPosition=");
                return x.n(sb, this.f333u, ')');
            default:
                return super.toString();
        }
    }

    public String u() {
        ArrayList arrayList = new ArrayList(4);
        C5246j c5246j = C5246j.f42241n;
        InterfaceC5245i interfaceC5245i = (InterfaceC5245i) this.f334v;
        if (interfaceC5245i != c5246j) {
            arrayList.add("context=" + interfaceC5245i);
        }
        int i = this.f333u;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        U7.a aVar = U7.a.f3342n;
        U7.a aVar2 = (U7.a) this.f335w;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + AbstractC5119j.C(arrayList, ", ", null, null, null, 62) + ']';
    }

    public boolean v() {
        int t6 = t();
        String str = (String) this.f337y;
        if (t6 == str.length() || t6 == -1 || str.charAt(t6) != ',') {
            return false;
        }
        this.f333u++;
        return true;
    }

    public void w(char c9) {
        int i = this.f333u;
        if (i > 0 && c9 == '\"') {
            try {
                this.f333u = i - 1;
                String j6 = j();
                this.f333u = i;
                if (kotlin.jvm.internal.h.a(j6, "null")) {
                    m(this.f333u - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f333u = i;
                throw th;
            }
        }
        o(g8.l.d(c9), true);
        throw null;
    }

    public G(V7.g gVar, V7.l lVar, InterfaceC5245i interfaceC5245i, int i, U7.a aVar) {
        this.f332n = 1;
        this.f332n = 1;
        this.f334v = interfaceC5245i;
        this.f333u = i;
        this.f335w = aVar;
        this.f336x = lVar;
        this.f337y = gVar;
    }

    public G(u uVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i4;
        this.f332n = 0;
        new ArrayList();
        this.f337y = new Bundle();
        this.f336x = uVar;
        Context context = uVar.f389a;
        this.f334v = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f335w = C.a(context, uVar.f406s);
        } else {
            this.f335w = new Notification.Builder(uVar.f389a);
        }
        Notification notification = uVar.f409v;
        int i6 = 0;
        ((Notification.Builder) this.f335w).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(uVar.f393e).setContentText(uVar.f394f).setContentInfo(null).setContentIntent(uVar.f395g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(uVar.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f335w;
        IconCompat iconCompat = uVar.f396h;
        A.b(builder, iconCompat == null ? null : H.c.c(iconCompat, context));
        ((Notification.Builder) this.f335w).setSubText(null).setUsesChronometer(false).setPriority(uVar.f397j);
        Iterator it = uVar.f390b.iterator();
        while (it.hasNext()) {
            C0285o c0285o = (C0285o) it.next();
            if (c0285o.f378b == null && (i4 = c0285o.f381e) != 0) {
                c0285o.f378b = IconCompat.b(i4);
            }
            IconCompat iconCompat2 = c0285o.f378b;
            Notification.Action.Builder a9 = A.a(iconCompat2 != null ? H.c.c(iconCompat2, null) : null, c0285o.f382f, c0285o.f383g);
            Bundle bundle3 = c0285o.f377a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z6 = c0285o.f379c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
            int i9 = Build.VERSION.SDK_INT;
            B.a(a9, z6);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i9 >= 28) {
                D.b(a9, 0);
            }
            if (i9 >= 29) {
                E.c(a9, false);
            }
            if (i9 >= 31) {
                F.a(a9, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0285o.f380d);
            y.b(a9, bundle2);
            y.a((Notification.Builder) this.f335w, y.d(a9));
        }
        Bundle bundle4 = uVar.f403p;
        if (bundle4 != null) {
            ((Bundle) this.f337y).putAll(bundle4);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f335w).setShowWhen(uVar.f398k);
        y.i((Notification.Builder) this.f335w, uVar.f402o);
        y.g((Notification.Builder) this.f335w, uVar.f400m);
        y.j((Notification.Builder) this.f335w, null);
        y.h((Notification.Builder) this.f335w, uVar.f401n);
        this.f333u = uVar.f407t;
        z.b((Notification.Builder) this.f335w, null);
        z.c((Notification.Builder) this.f335w, uVar.f404q);
        z.f((Notification.Builder) this.f335w, uVar.f405r);
        z.d((Notification.Builder) this.f335w, null);
        z.e((Notification.Builder) this.f335w, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = uVar.f410w;
        ArrayList arrayList3 = uVar.f391c;
        if (i10 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw x.i(it2);
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
                z.a((Notification.Builder) this.f335w, (String) it3.next());
            }
        }
        ArrayList arrayList4 = uVar.f392d;
        if (arrayList4.size() > 0) {
            if (uVar.f403p == null) {
                uVar.f403p = new Bundle();
            }
            Bundle bundle5 = uVar.f403p.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i11 = 0;
            while (i11 < arrayList4.size()) {
                String num = Integer.toString(i11);
                C0285o c0285o2 = (C0285o) arrayList4.get(i11);
                Bundle bundle8 = new Bundle();
                if (c0285o2.f378b == null && (i = c0285o2.f381e) != 0) {
                    c0285o2.f378b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c0285o2.f378b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i6);
                bundle8.putCharSequence("title", c0285o2.f382f);
                bundle8.putParcelable("actionIntent", c0285o2.f383g);
                Bundle bundle9 = c0285o2.f377a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0285o2.f379c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0285o2.f380d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i11++;
                i6 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (uVar.f403p == null) {
                uVar.f403p = new Bundle();
            }
            uVar.f403p.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f337y).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f335w).setExtras(uVar.f403p);
        B.e((Notification.Builder) this.f335w, null);
        if (i12 >= 26) {
            C.b((Notification.Builder) this.f335w, 0);
            C.e((Notification.Builder) this.f335w, null);
            C.f((Notification.Builder) this.f335w, null);
            C.g((Notification.Builder) this.f335w, 0L);
            C.d((Notification.Builder) this.f335w, uVar.f407t);
            if (!TextUtils.isEmpty(uVar.f406s)) {
                ((Notification.Builder) this.f335w).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw x.i(it4);
            }
        }
        if (i12 >= 29) {
            E.a((Notification.Builder) this.f335w, uVar.f408u);
            E.b((Notification.Builder) this.f335w, null);
        }
    }

    public G(String source) {
        this.f332n = 2;
        kotlin.jvm.internal.h.e(source, "source");
        F.d dVar = new F.d((byte) 0, 5);
        dVar.f918c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        dVar.f919d = iArr;
        dVar.f917b = -1;
        this.f334v = dVar;
        this.f336x = new StringBuilder();
        this.f337y = source;
    }
}
