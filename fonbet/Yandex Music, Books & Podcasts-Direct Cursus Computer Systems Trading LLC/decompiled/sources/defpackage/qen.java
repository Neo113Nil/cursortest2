package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes3.dex */
public abstract class qen {
    public final yen a;
    public final String b;
    public String c;
    public String d;
    public final mtk e;
    public final wdb i;
    public String f = null;
    public String g = null;
    public String h = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public String m = null;
    public String n = null;
    public final String o = a();

    public qen(yen yenVar, String str, String str2, String str3, mtk mtkVar, wdb wdbVar) {
        this.a = yenVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mtkVar;
        this.i = wdbVar;
    }

    public abstract String a();

    public abstract Map b();

    public abstract LinkedHashMap c();

    public abstract Map d();

    public final void e() {
        String str;
        int i;
        Iterator it;
        char c;
        char c2;
        int i2;
        int i3;
        String str2 = this.b;
        if (str2.length() <= 0) {
            xq0.q("Can't create Click Daemon error event w/o project set.");
            return;
        }
        if (this.c.length() <= 0) {
            xq0.q("Can't create Click Daemon error event w/o version set.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("path", this.o);
        String str3 = this.h;
        int i4 = 1;
        pen penVar = new pen(linkedHashMap, 1);
        if (str3 != null && str3.length() > 0) {
            penVar.invoke(str3);
        }
        linkedHashMap.putAll(b());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("-project", str2);
        String str4 = this.c;
        String str5 = this.d;
        char c3 = ' ';
        if (str5 != null) {
            str4 = hrg.l(' ', str4, str5);
        }
        linkedHashMap2.put("-version", str4);
        linkedHashMap2.putAll(d());
        mtk mtkVar = this.e;
        if (mtkVar != null) {
            linkedHashMap2.put("-platform", mtkVar.a);
        }
        String str6 = this.j;
        pen penVar2 = new pen(linkedHashMap2, 2);
        if (str6 != null && str6.length() > 0) {
            penVar2.invoke(str6);
        }
        String str7 = this.k;
        pen penVar3 = new pen(linkedHashMap2, 3);
        if (str7 != null && str7.length() > 0) {
            penVar3.invoke(str7);
        }
        String str8 = this.f;
        if (lsq.z(str8)) {
            str = null;
        } else {
            str8.getClass();
            net e = h.e(str8);
            if (e != null) {
                str = net.a(e.a);
            } else {
                char[] cArr = new char[64];
                long j = Long.MAX_VALUE / 5;
                long j2 = 10;
                int i5 = 63;
                cArr[63] = Character.forDigit((int) ((-1) - (j * j2)), 10);
                while (j > 0) {
                    i5--;
                    cArr[i5] = Character.forDigit((int) (j % j2), 10);
                    j /= j2;
                }
                str = new String(cArr, i5, 64 - i5);
            }
        }
        if (str != null) {
            linkedHashMap2.put("-yandexuid", str);
        }
        String str9 = this.l;
        pen penVar4 = new pen(linkedHashMap2, 4);
        if (str9 != null && str9.length() > 0) {
            penVar4.invoke(str9);
        }
        String str10 = this.m;
        char c4 = 1000;
        if (str10 != null) {
            String str11 = str10.length() <= 1000 ? str10 : null;
            if (str11 != null) {
                linkedHashMap2.put("-additional", str11);
            }
        }
        String str12 = this.n;
        if (str12 != null) {
            linkedHashMap2.put("-page", str12);
        }
        String str13 = this.g;
        int i6 = 0;
        pen penVar5 = new pen(linkedHashMap2, 0);
        if (str13 != null && str13.length() > 0) {
            penVar5.invoke(str13);
        }
        wdb wdbVar = this.i;
        if (wdbVar != null) {
            linkedHashMap2.put("-env", wdbVar.a);
        }
        linkedHashMap2.putAll(c());
        linkedHashMap2.put("-language", "java");
        StringBuilder sb = new StringBuilder();
        int i7 = 10000;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            i7 -= ((String) entry.getValue()).length() + (((String) entry.getKey()).length() + 1);
        }
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str14 = (String) entry2.getKey();
            String str15 = (String) entry2.getValue();
            str14.getClass();
            str15.getClass();
            int length = (sb.length() > 0 ? i7 - 1 : i7) - (str14.length() + i4);
            if (length <= 0) {
                char c5 = c3;
                c2 = c4;
                c = c5;
                it = it2;
                i = i4;
                i2 = i6;
            } else {
                StringBuilder sb2 = new StringBuilder(str15.length());
                ArrayList arrayList = new ArrayList();
                int i8 = i6;
                while (true) {
                    i = i4;
                    if (i8 >= str15.length()) {
                        break;
                    }
                    if (i4w.T(str15.charAt(i8))) {
                        while (i8 < str15.length() && i4w.T(str15.charAt(i8))) {
                            arrayList.add(Character.valueOf(str15.charAt(i8)));
                            if (Character.isHighSurrogate(str15.charAt(i8)) && (i3 = i8 + 1) < str15.length() && Character.isLowSurrogate(str15.charAt(i3))) {
                                arrayList.add(Character.valueOf(str15.charAt(i3)));
                                i8 = i3;
                            }
                            i8++;
                        }
                        char[] cArr2 = new char[arrayList.size()];
                        Iterator it3 = arrayList.iterator();
                        int i9 = 0;
                        while (it3.hasNext()) {
                            cArr2[i9] = ((Character) it3.next()).charValue();
                            i9++;
                        }
                        byte[] bytes = new String(cArr2).getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        int length2 = bytes.length;
                        int i10 = 0;
                        while (i10 < length2) {
                            byte b = bytes[i10];
                            char G = i4w.G((b >> 4) & 15);
                            Iterator it4 = it2;
                            char G2 = i4w.G(b & 15);
                            sb2.append('%');
                            sb2.append(G);
                            sb2.append(G2);
                            i10++;
                            it2 = it4;
                        }
                        arrayList.clear();
                        i4 = i;
                        c3 = ' ';
                    } else {
                        Iterator it5 = it2;
                        char charAt = str15.charAt(i8);
                        if (charAt == ' ') {
                            charAt = '+';
                        }
                        sb2.append(charAt);
                        i8++;
                        c3 = ' ';
                        i4 = i;
                        it2 = it5;
                    }
                }
                it = it2;
                c = c3;
                String sb3 = sb2.toString();
                c2 = 1000;
                int i11 = length > 1000 ? 1000 : length;
                if (i11 < 0 || sb3.length() <= i11) {
                    i2 = 0;
                } else {
                    int i12 = i11 - 2;
                    if ((i12 >= 0 && sb3.charAt(i12) == '%') || (i11 - 1 >= 0 && sb3.charAt(i12) == '%')) {
                        i11 = i12;
                    }
                    i2 = 0;
                    sb3 = sb3.substring(0, i11);
                }
                int length3 = length - sb3.length();
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str14);
                sb.append("=");
                sb.append(sb3);
                i7 = length3;
            }
            char c6 = c2;
            c3 = c;
            c4 = c6;
            i6 = i2;
            i4 = i;
            it2 = it;
        }
        linkedHashMap.put("vars", sb.toString());
        Regex regex = wen.a;
        StringBuilder sb4 = new StringBuilder();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str16 = (String) entry3.getKey();
            String str17 = (String) entry3.getValue();
            Regex regex2 = wen.a;
            regex2.e(str16);
            regex2.e(str17);
            sb4.append("/");
            sb4.append(str16);
            sb4.append("=");
            sb4.append(str17);
        }
        sb4.append("/*");
        this.a.schedule(sb4.toString());
    }
}
