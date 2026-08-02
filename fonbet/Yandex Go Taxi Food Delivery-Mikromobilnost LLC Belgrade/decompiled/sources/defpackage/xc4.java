package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.Hashtable;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class xc4 extends ya {
    public static final u2 c;
    public static final u2 d;
    public static final u2 e;
    public static final u2 f;
    public static final u2 g;
    public static final u2 h;
    public static final u2 i;
    public static final u2 j;
    public static final Hashtable k;
    public static final Hashtable l;
    public static final xc4 m;
    public final Hashtable b = ya.b(k);
    public final Hashtable a = ya.b(l);

    static {
        u2 e2 = xvz.e("2.5.4.6");
        c = e2;
        u2 e3 = xvz.e("2.5.4.10");
        u2 e4 = xvz.e("2.5.4.11");
        u2 e5 = xvz.e("2.5.4.12");
        u2 e6 = xvz.e("2.5.4.3");
        d = e6;
        new u2("2.5.4.5").B();
        u2 B = new u2("2.5.4.9").B();
        u2 e7 = xvz.e("2.5.4.5");
        e = e7;
        u2 e8 = xvz.e("2.5.4.7");
        u2 e9 = xvz.e("2.5.4.8");
        u2 e10 = xvz.e("2.5.4.4");
        u2 e11 = xvz.e("2.5.4.42");
        u2 e12 = xvz.e("2.5.4.43");
        u2 e13 = xvz.e("2.5.4.44");
        u2 e14 = xvz.e("2.5.4.45");
        u2 e15 = xvz.e("2.5.4.13");
        u2 e16 = xvz.e("2.5.4.15");
        u2 e17 = xvz.e("2.5.4.17");
        u2 e18 = xvz.e("2.5.4.46");
        f = e18;
        u2 e19 = xvz.e("2.5.4.65");
        u2 e20 = xvz.e("2.5.4.72");
        u2 e21 = xvz.e("1.3.6.1.5.5.7.9.1");
        g = e21;
        u2 e22 = xvz.e("1.3.6.1.5.5.7.9.2");
        u2 e23 = xvz.e("1.3.6.1.5.5.7.9.3");
        u2 e24 = xvz.e("1.3.6.1.5.5.7.9.4");
        u2 e25 = xvz.e("1.3.6.1.5.5.7.9.5");
        u2 e26 = xvz.e("1.3.36.8.3.14");
        u2 e27 = xvz.e("2.5.4.16");
        new u2("2.5.4.54").B();
        u2 u2Var = uc51.F4;
        h = u2Var;
        u2 u2Var2 = uc51.G4;
        u2 u2Var3 = uc51.I4;
        u2 u2Var4 = b490.r3;
        i = u2Var4;
        u2 u2Var5 = b490.s3;
        u2 u2Var6 = b490.y3;
        u2 u2Var7 = new u2("0.9.2342.19200300.100.1.25");
        j = u2Var7;
        u2 u2Var8 = new u2("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        k = hashtable;
        Hashtable hashtable2 = new Hashtable();
        l = hashtable2;
        hashtable.put(e2, CA20Status.STATUS_REQUEST_C);
        hashtable.put(e3, "O");
        hashtable.put(e5, "T");
        hashtable.put(e4, "OU");
        hashtable.put(e6, "CN");
        hashtable.put(e8, "L");
        hashtable.put(e9, "ST");
        hashtable.put(e7, "SERIALNUMBER");
        hashtable.put(u2Var4, "E");
        hashtable.put(u2Var7, "DC");
        hashtable.put(u2Var8, "UID");
        hashtable.put(B, "STREET");
        hashtable.put(e10, "SURNAME");
        hashtable.put(e11, "GIVENNAME");
        hashtable.put(e12, "INITIALS");
        hashtable.put(e13, "GENERATION");
        hashtable.put(e15, "DESCRIPTION");
        hashtable.put(e20, "ROLE");
        hashtable.put(u2Var6, "unstructuredAddress");
        hashtable.put(u2Var5, "unstructuredName");
        hashtable.put(e14, "UniqueIdentifier");
        hashtable.put(e18, "DN");
        hashtable.put(e19, "Pseudonym");
        hashtable.put(e27, "PostalAddress");
        hashtable.put(e26, "NameAtBirth");
        hashtable.put(e24, "CountryOfCitizenship");
        hashtable.put(e25, "CountryOfResidence");
        hashtable.put(e23, "Gender");
        hashtable.put(e22, "PlaceOfBirth");
        hashtable.put(e21, "DateOfBirth");
        hashtable.put(e17, "PostalCode");
        hashtable.put(e16, "BusinessCategory");
        hashtable.put(u2Var, "TelephoneNumber");
        hashtable.put(u2Var2, PlusAcquisitionSmartOffer.Texts.NAME);
        hashtable.put(u2Var3, "organizationIdentifier");
        hashtable2.put("c", e2);
        hashtable2.put("o", e3);
        hashtable2.put("t", e5);
        hashtable2.put("ou", e4);
        hashtable2.put("cn", e6);
        hashtable2.put("l", e8);
        hashtable2.put("st", e9);
        hashtable2.put("sn", e10);
        hashtable2.put("serialnumber", e7);
        hashtable2.put("street", B);
        hashtable2.put("emailaddress", u2Var4);
        hashtable2.put("dc", u2Var7);
        hashtable2.put("e", u2Var4);
        hashtable2.put("uid", u2Var8);
        hashtable2.put("surname", e10);
        hashtable2.put("givenname", e11);
        hashtable2.put("initials", e12);
        hashtable2.put("generation", e13);
        hashtable2.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, e15);
        hashtable2.put("role", e20);
        hashtable2.put("unstructuredaddress", u2Var6);
        hashtable2.put("unstructuredname", u2Var5);
        hashtable2.put("uniqueidentifier", e14);
        hashtable2.put("dn", e18);
        hashtable2.put("pseudonym", e19);
        hashtable2.put("postaladdress", e27);
        hashtable2.put("nameatbirth", e26);
        hashtable2.put("countryofcitizenship", e24);
        hashtable2.put("countryofresidence", e25);
        hashtable2.put("gender", e23);
        hashtable2.put("placeofbirth", e22);
        hashtable2.put("dateofbirth", e21);
        hashtable2.put("postalcode", e17);
        hashtable2.put("businesscategory", e16);
        hashtable2.put("telephonenumber", u2Var);
        hashtable2.put("name", u2Var2);
        hashtable2.put("organizationidentifier", u2Var3);
        m = new xc4();
    }

    @Override // defpackage.ya
    public final String d(jc51 jc51Var) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (v4i0 v4i0Var : jc51Var.n()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(HexString.CHAR_COMMA);
            }
            x2v.a(stringBuffer, v4i0Var, this.b);
        }
        return stringBuffer.toString();
    }
}
