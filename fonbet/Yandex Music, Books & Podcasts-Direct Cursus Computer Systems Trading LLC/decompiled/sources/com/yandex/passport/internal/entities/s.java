package com.yandex.passport.internal.entities;

import android.content.pm.Signature;
import android.util.Base64;
import defpackage.t75;
import defpackage.uah;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class s {
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final s f;
    public static final s g;
    public static final Object h;
    public final List a;
    public final Signature[] b;

    static {
        byte[] decode = Base64.decode("rKQF3tiyXLLoxtppQl0rQwfQh8Enb8Bq1ZQnMczFHbo=", 0);
        c = decode;
        byte[] decode2 = Base64.decode("HanLri3MxqWNbJR76UzbtzPWXaTRdw+hSlNky0oo60k=", 0);
        d = decode2;
        e = Base64.decode("+W185YaP0Dh3wF6PWAzgc55WjrJCxMX398YiHh5p75Y=", 0);
        f = new s(t75.c(decode), new Signature[0]);
        new s(t75.c(decode2), new Signature[0]);
        g = new s(t75.c(new byte[0]), new Signature[0]);
        h = uah.e(new Pair("com.edadeal.android", "Ucyt+WfG7scFrG9ix/DZjXnG3IJ9xqlHqcHBWZfJRC0="), new Pair("ru.kinopoisk", "bmQ8wpHeuihpnDrkPvnJoa7NZi0UUtd473a2MH7txIU="), new Pair("ru.foodfox.client", "3bydYEVOdzTJomTdNLyOSwskCDmcBgzr7HX+DHBhgMc="), new Pair("ru.auto.ara", "JixOZnbLEArntZeEyjeuy0WMm+mdwqN5IeXYw78PTjk="), new Pair("com.deliveryclub", "Oey4SFV8MM29BUDKKHPppyHtJtcaWDsj9NPTnzUekLk="), new Pair("com.scb.android", "q\\/6Eilpo3MC4DTSH01kxzZATSxRkzz29iymP5o1K3Lc="), new Pair("com.zebrainy.skazbuka", "QjM\\\\/yweNUDwGqMuNleLUWlqiyFov71hRR2Mcxoz9NYk="), new Pair("ru.vseapteki", "nmVYHwla4iKhErfvVWYhuh7vCDZLb3vYAHfdfes6DbY="), new Pair("uz.allplay.app", "UbaGU2rO43WTeRiGncAbrDbwCfiMjG3xN1NfwXCz64E="), new Pair("uz.allplay.apptv", "409SkfHnCWPyWHcHrgy7J2VQ8peroUd3P/YTLwmUrjw="), new Pair("jamhome.ru.lktsj", "+zAtZrdNtZYevaXkDN7rvyCOgV8UfSGB3afDdHfipZU="), new Pair("ru.berizaryad", "ejaKxCA91wCo1mYxoBY9Um\\/Gx7HbjgCWiX3kebaXheE="), new Pair("com.yandex.scooters", "0Fp2Qr9Mv0Cv38tO4qaq38AKDwiIMtiVJ1etcaVqH00="));
    }

    public s(List list, Signature[] signatureArr) {
        list.getClass();
        this.a = list;
        this.b = signatureArr;
    }

    public final boolean a(String str) {
        str.getClass();
        byte[] decode = Base64.decode(str, 0);
        decode.getClass();
        return Arrays.equals(b(), decode);
    }

    public final byte[] b() {
        return (byte[]) CollectionsKt.Q(this.a);
    }

    public final boolean c() {
        return Arrays.equals(d, b()) || Arrays.equals(e, b());
    }

    public final boolean d() {
        return Arrays.equals(c, b());
    }

    public final boolean e(s sVar) {
        sVar.getClass();
        if (!d() || sVar.c()) {
            return c() && sVar.c();
        }
        return true;
    }
}
