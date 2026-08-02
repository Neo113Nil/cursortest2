package defpackage;

/* loaded from: classes3.dex */
public enum okb {
    Station("station"),
    Chromecast("chromecast"),
    /* JADX INFO: Fake field, exist only in values array */
    Airplay("airplay"),
    /* JADX INFO: Fake field, exist only in values array */
    Bluetooth("bluetooth"),
    /* JADX INFO: Fake field, exist only in values array */
    Sonos("sonos"),
    /* JADX INFO: Fake field, exist only in values array */
    SamsungSdk("samsung_sdk"),
    /* JADX INFO: Fake field, exist only in values array */
    YandexTv("yandex_tv"),
    Phone("phone"),
    AndroidTv("android_tv"),
    AndroidWear("android_wear"),
    AppleTv("apple_tv"),
    WebTv("web_tv"),
    Web("web"),
    WebDesktop("web_desktop"),
    Unknown("unknown");

    public final String a;

    okb(String str) {
        this.a = str;
    }
}
