package defpackage;

import java.util.Hashtable;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class w4i0 extends ya {
    public static final Hashtable c;
    public static final Hashtable d;
    public static final w4i0 e;
    public final Hashtable b = ya.b(c);
    public final Hashtable a = ya.b(d);

    static {
        u2 e2 = xvz.e("2.5.4.15");
        u2 e3 = xvz.e("2.5.4.6");
        u2 e4 = xvz.e("2.5.4.3");
        u2 e5 = xvz.e("0.9.2342.19200300.100.1.25");
        u2 e6 = xvz.e("2.5.4.13");
        u2 e7 = xvz.e("2.5.4.27");
        u2 e8 = xvz.e("2.5.4.49");
        u2 e9 = xvz.e("2.5.4.46");
        u2 e10 = xvz.e("2.5.4.47");
        u2 e11 = xvz.e("2.5.4.23");
        u2 e12 = xvz.e("2.5.4.44");
        u2 e13 = xvz.e("2.5.4.42");
        u2 e14 = xvz.e("2.5.4.51");
        u2 e15 = xvz.e("2.5.4.43");
        u2 e16 = xvz.e("2.5.4.25");
        u2 e17 = xvz.e("2.5.4.7");
        u2 e18 = xvz.e("2.5.4.31");
        u2 e19 = xvz.e("2.5.4.41");
        u2 e20 = xvz.e("2.5.4.10");
        u2 e21 = xvz.e("2.5.4.11");
        u2 e22 = xvz.e("2.5.4.32");
        u2 e23 = xvz.e("2.5.4.19");
        u2 e24 = xvz.e("2.5.4.16");
        u2 e25 = xvz.e("2.5.4.17");
        u2 e26 = xvz.e("2.5.4.18");
        u2 e27 = xvz.e("2.5.4.28");
        u2 e28 = xvz.e("2.5.4.26");
        u2 e29 = xvz.e("2.5.4.33");
        u2 e30 = xvz.e("2.5.4.14");
        u2 e31 = xvz.e("2.5.4.34");
        u2 e32 = xvz.e("2.5.4.5");
        u2 e33 = xvz.e("2.5.4.4");
        u2 e34 = xvz.e("2.5.4.8");
        u2 e35 = xvz.e("2.5.4.9");
        u2 e36 = xvz.e("2.5.4.20");
        u2 e37 = xvz.e("2.5.4.22");
        u2 e38 = xvz.e("2.5.4.21");
        u2 e39 = xvz.e("2.5.4.12");
        u2 e40 = xvz.e("0.9.2342.19200300.100.1.1");
        u2 e41 = xvz.e("2.5.4.50");
        u2 e42 = xvz.e("2.5.4.35");
        u2 e43 = xvz.e("2.5.4.24");
        u2 e44 = xvz.e("2.5.4.45");
        Hashtable hashtable = new Hashtable();
        c = hashtable;
        Hashtable hashtable2 = new Hashtable();
        d = hashtable2;
        hashtable.put(e2, "businessCategory");
        hashtable.put(e3, "c");
        hashtable.put(e4, "cn");
        hashtable.put(e5, "dc");
        hashtable.put(e6, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        hashtable.put(e7, "destinationIndicator");
        hashtable.put(e8, "distinguishedName");
        hashtable.put(e9, "dnQualifier");
        hashtable.put(e10, "enhancedSearchGuide");
        hashtable.put(e11, "facsimileTelephoneNumber");
        hashtable.put(e12, "generationQualifier");
        hashtable.put(e13, "givenName");
        hashtable.put(e14, "houseIdentifier");
        hashtable.put(e15, "initials");
        hashtable.put(e16, "internationalISDNNumber");
        hashtable.put(e17, "l");
        hashtable.put(e18, "member");
        hashtable.put(e19, "name");
        hashtable.put(e20, "o");
        hashtable.put(e21, "ou");
        hashtable.put(e22, "owner");
        hashtable.put(e23, "physicalDeliveryOfficeName");
        hashtable.put(e24, "postalAddress");
        hashtable.put(e25, "postalCode");
        hashtable.put(e26, "postOfficeBox");
        hashtable.put(e27, "preferredDeliveryMethod");
        hashtable.put(e28, "registeredAddress");
        hashtable.put(e29, "roleOccupant");
        hashtable.put(e30, "searchGuide");
        hashtable.put(e31, "seeAlso");
        hashtable.put(e32, "serialNumber");
        hashtable.put(e33, "sn");
        hashtable.put(e34, "st");
        hashtable.put(e35, "street");
        hashtable.put(e36, "telephoneNumber");
        hashtable.put(e37, "teletexTerminalIdentifier");
        hashtable.put(e38, "telexNumber");
        hashtable.put(e39, "title");
        hashtable.put(e40, "uid");
        hashtable.put(e41, "uniqueMember");
        hashtable.put(e42, "userPassword");
        hashtable.put(e43, "x121Address");
        hashtable.put(e44, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", e2);
        hashtable2.put("c", e3);
        hashtable2.put("cn", e4);
        hashtable2.put("dc", e5);
        hashtable2.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, e6);
        hashtable2.put("destinationindicator", e7);
        hashtable2.put("distinguishedname", e8);
        hashtable2.put("dnqualifier", e9);
        hashtable2.put("enhancedsearchguide", e10);
        hashtable2.put("facsimiletelephonenumber", e11);
        hashtable2.put("generationqualifier", e12);
        hashtable2.put("givenname", e13);
        hashtable2.put("houseidentifier", e14);
        hashtable2.put("initials", e15);
        hashtable2.put("internationalisdnnumber", e16);
        hashtable2.put("l", e17);
        hashtable2.put("member", e18);
        hashtable2.put("name", e19);
        hashtable2.put("o", e20);
        hashtable2.put("ou", e21);
        hashtable2.put("owner", e22);
        hashtable2.put("physicaldeliveryofficename", e23);
        hashtable2.put("postaladdress", e24);
        hashtable2.put("postalcode", e25);
        hashtable2.put("postofficebox", e26);
        hashtable2.put("preferreddeliverymethod", e27);
        hashtable2.put("registeredaddress", e28);
        hashtable2.put("roleoccupant", e29);
        hashtable2.put("searchguide", e30);
        hashtable2.put("seealso", e31);
        hashtable2.put("serialnumber", e32);
        hashtable2.put("sn", e33);
        hashtable2.put("st", e34);
        hashtable2.put("street", e35);
        hashtable2.put("telephonenumber", e36);
        hashtable2.put("teletexterminalidentifier", e37);
        hashtable2.put("telexnumber", e38);
        hashtable2.put("title", e39);
        hashtable2.put("uid", e40);
        hashtable2.put("uniquemember", e41);
        hashtable2.put("userpassword", e42);
        hashtable2.put("x121address", e43);
        hashtable2.put("x500uniqueidentifier", e44);
        e = new w4i0();
    }

    @Override // defpackage.ya
    public final String d(jc51 jc51Var) {
        StringBuffer stringBuffer = new StringBuffer();
        v4i0[] n = jc51Var.n();
        boolean z = true;
        for (int length = n.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(HexString.CHAR_COMMA);
            }
            x2v.a(stringBuffer, n[length], this.b);
        }
        return stringBuffer.toString();
    }
}
