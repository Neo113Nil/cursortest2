package javax.jmdns.impl;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.a4e;
import defpackage.cdg;
import defpackage.d77;
import defpackage.dkp;
import defpackage.e77;
import defpackage.ekp;
import defpackage.f1d;
import defpackage.fkp;
import defpackage.gkp;
import defpackage.h67;
import defpackage.hrg;
import defpackage.j67;
import defpackage.ouj;
import defpackage.p2f;
import defpackage.pv7;
import defpackage.s67;
import defpackage.t67;
import defpackage.u67;
import defpackage.v67;
import defpackage.vz1;
import defpackage.w67;
import defpackage.x67;
import defpackage.y67;
import java.io.ByteArrayOutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class a extends fkp implements d77 {
    public static final Logger r = Logger.getLogger(a.class.getName());
    public final String b;
    public final String c;
    public final String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public byte[] k;
    public Hashtable l;
    public final Set m;
    public final Set n;
    public transient String o;
    public final boolean p;
    public final gkp q;

    public a(fkp fkpVar) {
        this.m = Collections.synchronizedSet(new LinkedHashSet());
        this.n = Collections.synchronizedSet(new LinkedHashSet());
        if (fkpVar != null) {
            a aVar = (a) fkpVar;
            String str = aVar.b;
            this.b = str == null ? "local" : str;
            String str2 = aVar.c;
            this.c = str2 == null ? "tcp" : str2;
            String str3 = aVar.d;
            this.d = str3 == null ? "" : str3;
            this.e = fkpVar.e();
            this.f = fkpVar.g();
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = fkpVar.h();
            this.p = aVar.p;
            for (Inet6Address inet6Address : fkpVar.d()) {
                this.n.add(inet6Address);
            }
            for (Inet4Address inet4Address : fkpVar.c()) {
                this.m.add(inet4Address);
            }
        }
        this.q = new gkp(this);
    }

    public static HashMap l(Map map) {
        HashMap hashMap = new HashMap(5);
        ekp ekpVar = ekp.a;
        String str = "local";
        String str2 = map.containsKey(ekpVar) ? (String) map.get(ekpVar) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        hashMap.put(ekpVar, w(str));
        ekp ekpVar2 = ekp.b;
        String str3 = "tcp";
        String str4 = map.containsKey(ekpVar2) ? (String) map.get(ekpVar2) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        hashMap.put(ekpVar2, w(str3));
        ekp ekpVar3 = ekp.c;
        String str5 = "";
        String str6 = map.containsKey(ekpVar3) ? (String) map.get(ekpVar3) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        hashMap.put(ekpVar3, w(str6));
        ekp ekpVar4 = ekp.d;
        String str7 = map.containsKey(ekpVar4) ? (String) map.get(ekpVar4) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        hashMap.put(ekpVar4, w(str7));
        ekp ekpVar5 = ekp.e;
        String str8 = map.containsKey(ekpVar5) ? (String) map.get(ekpVar5) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        hashMap.put(ekpVar5, w(str5));
        return hashMap;
    }

    public static HashMap n(String str) {
        String w;
        String substring;
        String str2;
        int indexOf;
        String substring2;
        String str3;
        String str4;
        String lowerCase = str.toLowerCase();
        String str5 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int indexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            w = w(str.substring(0, indexOf2));
            substring = str.substring(indexOf2);
        } else {
            if (lowerCase.contains("_") || !lowerCase.contains(".")) {
                if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (indexOf = lowerCase.indexOf("._")) > 0) {
                    substring2 = str.substring(0, indexOf);
                    int i = indexOf + 1;
                    if (i < lowerCase.length()) {
                        str3 = lowerCase.substring(i);
                        str = str.substring(i);
                    } else {
                        str3 = lowerCase;
                    }
                } else {
                    str3 = lowerCase;
                    substring2 = "";
                }
                int lastIndexOf = str3.lastIndexOf("._");
                if (lastIndexOf > 0) {
                    int i2 = lastIndexOf + 2;
                    str4 = str.substring(i2, str3.indexOf(46, i2));
                } else {
                    str4 = "";
                }
                if (str4.length() > 0) {
                    int indexOf3 = str3.indexOf("_" + str4.toLowerCase() + ".");
                    int length = str4.length() + indexOf3 + 2;
                    int length2 = str3.length() - (str3.endsWith(".") ? 1 : 0);
                    String substring3 = length2 > length ? str.substring(length, length2) : "";
                    if (indexOf3 > 0) {
                        lowerCase = str.substring(0, indexOf3 - 1);
                        substring = substring3;
                    } else {
                        substring = substring3;
                        lowerCase = "";
                    }
                } else {
                    substring = "";
                }
                int indexOf4 = lowerCase.toLowerCase().indexOf("._sub");
                if (indexOf4 > 0) {
                    str5 = w(lowerCase.substring(0, indexOf4));
                    lowerCase = lowerCase.substring(indexOf4 + 5);
                }
                String str6 = str5;
                str5 = str4;
                str2 = str6;
                w = substring2;
                HashMap hashMap = new HashMap(5);
                hashMap.put(ekp.a, w(substring));
                hashMap.put(ekp.b, str5);
                hashMap.put(ekp.c, w(lowerCase));
                hashMap.put(ekp.d, w);
                hashMap.put(ekp.e, str2);
                return hashMap;
            }
            int indexOf5 = lowerCase.indexOf(46);
            w = w(str.substring(0, indexOf5));
            substring = w(str.substring(indexOf5));
        }
        lowerCase = "";
        str2 = lowerCase;
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put(ekp.a, w(substring));
        hashMap2.put(ekp.b, str5);
        hashMap2.put(ekp.c, w(lowerCase));
        hashMap2.put(ekp.d, w);
        hashMap2.put(ekp.e, str2);
        return hashMap2;
    }

    public static String v(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = i + i2;
        while (i < i5) {
            int i6 = i + 1;
            byte b = bArr[i];
            int i7 = b & 255;
            switch (i7 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = i6;
                    continue;
                    stringBuffer.append((char) i7);
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i += 2;
                    if (i < i2) {
                        i3 = (b & 63) << 4;
                        i4 = bArr[i6] & 15;
                        break;
                    } else {
                        return null;
                    }
                case 12:
                case 13:
                    if (i6 < i2) {
                        i3 = (b & 31) << 6;
                        i += 2;
                        i4 = bArr[i6] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    int i8 = i + 3;
                    if (i8 >= i2) {
                        return null;
                    }
                    int i9 = (bArr[i6] & 63) << 6;
                    i7 = (bArr[i + 2] & 63) | i9 | ((b & 15) << 12);
                    i = i8;
                    continue;
                    stringBuffer.append((char) i7);
            }
            i7 = i3 | i4;
            stringBuffer.append((char) i7);
        }
        return stringBuffer.toString();
    }

    public static String w(String str) {
        String trim = str.trim();
        if (trim.startsWith(".")) {
            trim = trim.substring(1);
        }
        if (trim.startsWith("_")) {
            trim = trim.substring(1);
        }
        return trim.endsWith(".") ? f1d.d(1, 0, trim) : trim;
    }

    public static void y(ByteArrayOutputStream byteArrayOutputStream, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= 1 && charAt <= 127) {
                byteArrayOutputStream.write(charAt);
            } else if (charAt > 2047) {
                byteArrayOutputStream.write(((charAt >> '\f') & 15) | 224);
                byteArrayOutputStream.write(((charAt >> 6) & 63) | 128);
                byteArrayOutputStream.write((charAt & '?') | 128);
            } else {
                byteArrayOutputStream.write(((charAt >> 6) & 31) | 192);
                byteArrayOutputStream.write((charAt & '?') | 128);
            }
        }
    }

    @Override // defpackage.d77
    public final void S(e77 e77Var) {
        this.q.S(e77Var);
    }

    @Override // defpackage.fkp
    public final String b() {
        Inet4Address[] c = c();
        Inet6Address[] d = d();
        int length = c.length + d.length;
        String[] strArr = new String[length];
        for (int i = 0; i < c.length; i++) {
            strArr[i] = c[i].getHostAddress();
        }
        for (int i2 = 0; i2 < d.length; i2++) {
            strArr[c.length + i2] = "[" + d[i2].getHostAddress() + "]";
        }
        return length > 0 ? strArr[0] : "";
    }

    @Override // defpackage.fkp
    public final Inet4Address[] c() {
        Set set = this.m;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    @Override // defpackage.fkp
    public final Inet6Address[] d() {
        Set set = this.n;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // defpackage.fkp
    public final String e() {
        String str = this.e;
        return str != null ? str : "";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && f().equals(((a) obj).f());
    }

    @Override // defpackage.fkp
    public final String f() {
        String str = this.b;
        if (str == null) {
            str = "local";
        }
        String str2 = this.c;
        if (str2 == null) {
            str2 = "tcp";
        }
        String str3 = this.d;
        if (str3 == null) {
            str3 = "";
        }
        String e = e();
        StringBuilder sb = new StringBuilder();
        sb.append(e.length() > 0 ? e.concat(".") : "");
        sb.append(str3.length() > 0 ? hrg.q("_", str3, ".") : "");
        return vz1.s(sb, str2.length() > 0 ? hrg.q("_", str2, ".") : "", str, ".");
    }

    @Override // defpackage.fkp
    public final String g() {
        String str = this.f;
        return str != null ? str : "";
    }

    @Override // defpackage.fkp
    public final byte[] h() {
        byte[] bArr = this.k;
        return (bArr == null || bArr.length <= 0) ? w67.l : bArr;
    }

    public final int hashCode() {
        return f().hashCode();
    }

    @Override // defpackage.fkp
    public final String i() {
        String str = this.b;
        if (str == null) {
            str = "local";
        }
        String str2 = this.c;
        if (str2 == null) {
            str2 = "tcp";
        }
        String str3 = this.d;
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3.length() > 0 ? hrg.q("_", str3, ".") : "");
        return vz1.s(sb, str2.length() > 0 ? hrg.q("_", str2, ".") : "", str, ".");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // defpackage.fkp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean j() {
        boolean z;
        boolean z2;
        z = false;
        if (t() != null) {
            if (this.m.size() <= 0 && this.n.size() <= 0) {
                z2 = false;
                if (z2 && h() != null) {
                    if (h().length > 0) {
                        z = true;
                    }
                }
            }
            z2 = true;
            if (z2) {
                if (h().length > 0) {
                }
            }
        }
        return z;
    }

    public final ArrayList k(x67 x67Var, int i, a4e a4eVar) {
        ArrayList arrayList = new ArrayList();
        if (x67Var != x67.CLASS_ANY && x67Var != x67.CLASS_IN) {
            return arrayList;
        }
        if (g().length() > 0) {
            arrayList.add(new t67(u(), x67.CLASS_IN, false, i, f()));
        }
        String i2 = i();
        x67 x67Var2 = x67.CLASS_IN;
        arrayList.add(new t67(i2, x67Var2, false, i, f()));
        arrayList.add(new u67(f(), x67Var2, true, i, this.j, this.i, this.h, a4eVar.a));
        arrayList.add(new v67(f(), x67Var2, true, i, h()));
        return arrayList;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        a aVar = new a(s(), this.h, this.i, this.j, this.p, this.k);
        for (Inet6Address inet6Address : d()) {
            aVar.n.add(inet6Address);
        }
        for (Inet4Address inet4Address : c()) {
            aVar.m.add(inet4Address);
        }
        return aVar;
    }

    public final String p() {
        if (this.o == null) {
            this.o = f().toLowerCase();
        }
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        r0.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Map q() {
        Map map;
        int i;
        try {
        } catch (Exception e) {
            r.log(Level.WARNING, "Malformed TXT Field ", (Throwable) e);
        } finally {
        }
        if (this.l == null && h() != null) {
            Hashtable hashtable = new Hashtable();
            int i2 = 0;
            while (true) {
                if (i2 >= h().length) {
                    break;
                }
                int i3 = i2 + 1;
                int i4 = h()[i2] & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i4 == 0 || (i = i3 + i4) > h().length) {
                    break;
                }
                int i5 = 0;
                while (i5 < i4 && h()[i3 + i5] != 61) {
                    i5++;
                }
                String v = v(h(), i3, i5);
                if (v == null) {
                    hashtable.clear();
                    break;
                }
                if (i5 == i4) {
                    hashtable.put(v, fkp.a);
                    i2 = i3;
                } else {
                    int i6 = i5 + 1;
                    int i7 = i4 - i6;
                    byte[] bArr = new byte[i7];
                    System.arraycopy(h(), i3 + i6, bArr, 0, i7);
                    hashtable.put(v, bArr);
                    i2 = i;
                }
            }
            this.l = hashtable;
        }
        map = this.l;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return map;
    }

    public final synchronized String r(String str) {
        byte[] bArr = (byte[]) q().get(str);
        if (bArr == null) {
            return null;
        }
        if (bArr == fkp.a) {
            return PListParser.TAG_TRUE;
        }
        return v(bArr, 0, bArr.length);
    }

    public final HashMap s() {
        HashMap hashMap = new HashMap(5);
        String str = this.b;
        if (str == null) {
            str = "local";
        }
        hashMap.put(ekp.a, str);
        String str2 = this.c;
        if (str2 == null) {
            str2 = "tcp";
        }
        hashMap.put(ekp.b, str2);
        String str3 = this.d;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(ekp.c, str3);
        hashMap.put(ekp.d, e());
        hashMap.put(ekp.e, g());
        return hashMap;
    }

    public final String t() {
        String str = this.g;
        return str != null ? str : "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + a.class.getSimpleName() + "@" + System.identityHashCode(this) + StringUtil.SPACE);
        sb.append("name: '");
        sb.append((e().length() > 0 ? e() + "." : "").concat(u()));
        sb.append("' address: '");
        Set set = this.m;
        int size = set.size();
        Set set2 = this.n;
        ArrayList arrayList = new ArrayList(set2.size() + size);
        arrayList.addAll(set);
        arrayList.addAll(set2);
        InetAddress[] inetAddressArr = (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
        if (inetAddressArr.length > 0) {
            for (InetAddress inetAddress : inetAddressArr) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(this.h);
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(this.h);
        }
        sb.append("' status: '");
        sb.append(this.q.toString());
        sb.append(this.p ? "' is persistent," : "',");
        sb.append(" has ");
        sb.append(j() ? "" : "NO ");
        sb.append("data");
        if (h().length > 0) {
            Map q = q();
            if (q.isEmpty()) {
                sb.append(" empty");
            } else {
                sb.append(StringUtil.LF);
                for (String str : q.keySet()) {
                    StringBuilder u = ouj.u(StringUtil.TAB, str, ": ");
                    u.append(new String((byte[]) q.get(str)));
                    u.append(StringUtil.LF);
                    sb.append(u.toString());
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final String u() {
        String str;
        String g = g();
        if (g.length() > 0) {
            str = "_" + g.toLowerCase() + "._sub.";
        } else {
            str = "";
        }
        return str.concat(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(h67 h67Var, long j, j67 j67Var) {
        p2f p2fVar;
        List list;
        fkp fkpVar;
        ArrayList arrayList;
        if (!(j67Var instanceof w67) || j67Var.h(j)) {
            return;
        }
        int ordinal = j67Var.e().ordinal();
        boolean z = true;
        if (ordinal == 1) {
            if (j67Var.c().equalsIgnoreCase(t())) {
                this.m.add((Inet4Address) ((s67) j67Var).m);
                if (j()) {
                }
            }
            synchronized (this) {
            }
        } else if (ordinal == 12) {
            if (g().length() == 0 && j67Var.f().length() != 0) {
                this.f = j67Var.f();
                if (j()) {
                }
            }
            synchronized (this) {
            }
        } else if (ordinal == 16) {
            if (j67Var.c().equalsIgnoreCase(f())) {
                this.k = ((v67) j67Var).m;
                this.l = null;
                if (j()) {
                }
            }
            synchronized (this) {
            }
        } else {
            if (ordinal != 28) {
                if (ordinal == 33 && j67Var.c().equalsIgnoreCase(f())) {
                    u67 u67Var = (u67) j67Var;
                    String str = this.g;
                    if (str != null && str.equalsIgnoreCase(u67Var.p)) {
                        z = false;
                    }
                    this.g = u67Var.p;
                    this.h = u67Var.o;
                    this.i = u67Var.n;
                    this.j = u67Var.m;
                    if (z) {
                        this.m.clear();
                        this.n.clear();
                        Iterator it = h67Var.f(this.g, y67.TYPE_A, x67.CLASS_IN).iterator();
                        while (it.hasNext()) {
                            x(h67Var, j, (j67) it.next());
                        }
                        Iterator it2 = h67Var.f(this.g, y67.TYPE_AAAA, x67.CLASS_IN).iterator();
                        while (it2.hasNext()) {
                            x(h67Var, j, (j67) it2.next());
                        }
                    }
                    if (j() && (p2fVar = this.q.a) != null) {
                        dkp dkpVar = new dkp(p2fVar, i(), e(), this);
                        list = (List) p2fVar.d.get(dkpVar.a.toLowerCase());
                        if (list != null && !list.isEmpty() && (fkpVar = dkpVar.c) != null && fkpVar.j()) {
                            synchronized (list) {
                                arrayList = new ArrayList(list);
                            }
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                p2fVar.m.submit(new pv7((cdg) it3.next(), dkpVar, false, 18));
                            }
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
                return;
            }
            if (j67Var.c().equalsIgnoreCase(t())) {
                this.n.add((Inet6Address) ((s67) j67Var).m);
                if (j()) {
                    dkp dkpVar2 = new dkp(p2fVar, i(), e(), this);
                    list = (List) p2fVar.d.get(dkpVar2.a.toLowerCase());
                    if (list != null) {
                        synchronized (list) {
                        }
                    }
                }
            }
            synchronized (this) {
            }
        }
    }

    public a(Map map, int i, int i2, int i3, boolean z, byte[] bArr) {
        HashMap l = l(map);
        this.b = (String) l.get(ekp.a);
        this.c = (String) l.get(ekp.b);
        this.d = (String) l.get(ekp.c);
        this.e = (String) l.get(ekp.d);
        this.f = (String) l.get(ekp.e);
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = bArr;
        this.q = new gkp(this);
        this.p = z;
        this.m = Collections.synchronizedSet(new LinkedHashSet());
        this.n = Collections.synchronizedSet(new LinkedHashSet());
    }
}
