package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.Enumeration;
import java.util.Hashtable;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class wc4 extends xa {
    public static final t2 c;
    public static final t2 d;
    public static final t2 e;
    public static final t2 f;
    public static final t2 g;
    public static final t2 h;
    public static final t2 i;
    public static final t2 j;
    public static final Hashtable k;
    public static final Hashtable l;
    public static final wc4 m;
    public final Hashtable a;
    public final Hashtable b;

    static {
        t2 f2 = ly3.f("2.5.4.6");
        c = f2;
        t2 f3 = ly3.f("2.5.4.10");
        t2 f4 = ly3.f("2.5.4.11");
        t2 f5 = ly3.f("2.5.4.12");
        t2 f6 = ly3.f("2.5.4.3");
        d = f6;
        e = ly3.f("2.5.4.5");
        t2 f7 = ly3.f("2.5.4.9");
        t2 f8 = ly3.f("2.5.4.5");
        t2 f9 = ly3.f("2.5.4.7");
        t2 f10 = ly3.f("2.5.4.8");
        t2 f11 = ly3.f("2.5.4.4");
        t2 f12 = ly3.f("2.5.4.42");
        t2 f13 = ly3.f("2.5.4.43");
        t2 f14 = ly3.f("2.5.4.44");
        t2 f15 = ly3.f("2.5.4.45");
        t2 f16 = ly3.f("2.5.4.13");
        t2 f17 = ly3.f("2.5.4.15");
        t2 f18 = ly3.f("2.5.4.17");
        t2 f19 = ly3.f("2.5.4.46");
        f = f19;
        t2 f20 = ly3.f("2.5.4.65");
        t2 f21 = ly3.f("2.5.4.72");
        t2 f22 = ly3.f("1.3.6.1.5.5.7.9.1");
        g = f22;
        t2 f23 = ly3.f("1.3.6.1.5.5.7.9.2");
        t2 f24 = ly3.f("1.3.6.1.5.5.7.9.3");
        t2 f25 = ly3.f("1.3.6.1.5.5.7.9.4");
        t2 f26 = ly3.f("1.3.6.1.5.5.7.9.5");
        t2 f27 = ly3.f("1.3.36.8.3.14");
        t2 f28 = ly3.f("2.5.4.16");
        new t2("2.5.4.54").t();
        t2 t2Var = tc51.a;
        h = t2Var;
        t2 t2Var2 = tc51.b;
        t2 t2Var3 = tc51.c;
        t2 t2Var4 = a490.b;
        i = t2Var4;
        t2 t2Var5 = a490.c;
        t2 t2Var6 = a490.d;
        t2 t2Var7 = new t2("0.9.2342.19200300.100.1.25");
        j = t2Var7;
        t2 t2Var8 = new t2("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        k = hashtable;
        Hashtable hashtable2 = new Hashtable();
        l = hashtable2;
        hashtable.put(f2, CA20Status.STATUS_REQUEST_C);
        hashtable.put(f3, "O");
        hashtable.put(f5, "T");
        hashtable.put(f4, "OU");
        hashtable.put(f6, "CN");
        hashtable.put(f9, "L");
        hashtable.put(f10, "ST");
        hashtable.put(f8, "SERIALNUMBER");
        hashtable.put(t2Var4, "E");
        hashtable.put(t2Var7, "DC");
        hashtable.put(t2Var8, "UID");
        hashtable.put(f7, "STREET");
        hashtable.put(f11, "SURNAME");
        hashtable.put(f12, "GIVENNAME");
        hashtable.put(f13, "INITIALS");
        hashtable.put(f14, "GENERATION");
        hashtable.put(f16, "DESCRIPTION");
        hashtable.put(f21, "ROLE");
        hashtable.put(t2Var6, "unstructuredAddress");
        hashtable.put(t2Var5, "unstructuredName");
        hashtable.put(f15, "UniqueIdentifier");
        hashtable.put(f19, "DN");
        hashtable.put(f20, "Pseudonym");
        hashtable.put(f28, "PostalAddress");
        hashtable.put(f27, "NameAtBirth");
        hashtable.put(f25, "CountryOfCitizenship");
        hashtable.put(f26, "CountryOfResidence");
        hashtable.put(f24, "Gender");
        hashtable.put(f23, "PlaceOfBirth");
        hashtable.put(f22, "DateOfBirth");
        hashtable.put(f18, "PostalCode");
        hashtable.put(f17, "BusinessCategory");
        hashtable.put(t2Var, "TelephoneNumber");
        hashtable.put(t2Var2, PlusAcquisitionSmartOffer.Texts.NAME);
        hashtable.put(t2Var3, "organizationIdentifier");
        hashtable2.put("c", f2);
        hashtable2.put("o", f3);
        hashtable2.put("t", f5);
        hashtable2.put("ou", f4);
        hashtable2.put("cn", f6);
        hashtable2.put("l", f9);
        hashtable2.put("st", f10);
        hashtable2.put("sn", f11);
        hashtable2.put("serialnumber", f8);
        hashtable2.put("street", f7);
        hashtable2.put("emailaddress", t2Var4);
        hashtable2.put("dc", t2Var7);
        hashtable2.put("e", t2Var4);
        hashtable2.put("uid", t2Var8);
        hashtable2.put("surname", f11);
        hashtable2.put("givenname", f12);
        hashtable2.put("initials", f13);
        hashtable2.put("generation", f14);
        hashtable2.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, f16);
        hashtable2.put("role", f21);
        hashtable2.put("unstructuredaddress", t2Var6);
        hashtable2.put("unstructuredname", t2Var5);
        hashtable2.put("uniqueidentifier", f15);
        hashtable2.put("dn", f19);
        hashtable2.put("pseudonym", f20);
        hashtable2.put("postaladdress", f28);
        hashtable2.put("nameatbirth", f27);
        hashtable2.put("countryofcitizenship", f25);
        hashtable2.put("countryofresidence", f26);
        hashtable2.put("gender", f24);
        hashtable2.put("placeofbirth", f23);
        hashtable2.put("dateofbirth", f22);
        hashtable2.put("postalcode", f18);
        hashtable2.put("businesscategory", f17);
        hashtable2.put("telephonenumber", t2Var);
        hashtable2.put("name", t2Var2);
        hashtable2.put("organizationidentifier", t2Var3);
        m = new wc4();
    }

    public wc4() {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = k;
        Enumeration keys = hashtable2.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable.put(nextElement, hashtable2.get(nextElement));
        }
        this.b = hashtable;
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = l;
        Enumeration keys2 = hashtable4.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            hashtable3.put(nextElement2, hashtable4.get(nextElement2));
        }
        this.a = hashtable3;
    }

    @Override // defpackage.xa
    public final z1 b(t2 t2Var, String str) {
        return (t2Var.l(i) || t2Var.l(j)) ? new wpf(str) : t2Var.l(g) ? new f2(str) : (t2Var.l(c) || t2Var.l(e) || t2Var.l(f) || t2Var.l(h)) ? new gqf(str) : super.b(t2Var, str);
    }

    @Override // defpackage.xa
    public final String e(ic51 ic51Var) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (u4i0 u4i0Var : (u4i0[]) ic51Var.w.clone()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(HexString.CHAR_COMMA);
            }
            int length = u4i0Var.a.a.length;
            Hashtable hashtable = this.b;
            if (length > 1) {
                yc3[] i2 = u4i0Var.i();
                boolean z2 = true;
                for (int i3 = 0; i3 != i2.length; i3++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('+');
                    }
                    w2v.a(stringBuffer, i2[i3], hashtable);
                }
            } else if (u4i0Var.h() != null) {
                w2v.a(stringBuffer, u4i0Var.h(), hashtable);
            }
        }
        return stringBuffer.toString();
    }

    public final t2 f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i2 = 0; i2 != charArray.length; i2++) {
            char c2 = charArray[i2];
            if ('a' <= c2 && 'z' >= c2) {
                charArray[i2] = (char) (c2 - ' ');
                z = true;
            }
        }
        if ((z ? new String(charArray) : str).startsWith("OID.")) {
            return new t2(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new t2(str);
        }
        t2 t2Var = (t2) this.a.get(ruu0.c(str));
        if (t2Var != null) {
            return t2Var;
        }
        ny61.g(oyr.p("Unknown object id - ", str, " - passed to distinguished name"));
        return null;
    }
}
