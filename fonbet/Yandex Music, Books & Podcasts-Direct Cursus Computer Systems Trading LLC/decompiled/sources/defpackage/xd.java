package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xd {
    public static final /* synthetic */ xd[] b;
    public static final /* synthetic */ rdb c;
    public final String a;

    static {
        xd[] xdVarArr = {new xd("Kids", 0, "kids"), new xd("MobilePopular", 1, "mobile_popular"), new xd("MobilePodcasts", 2, "mobile_podcasts"), new xd("MobileAudiobooks", 3, "mobile_audiobooks"), new xd("NonMusic", 4, "non_music")};
        b = xdVarArr;
        c = new rdb(xdVarArr);
    }

    public xd(String str, int i, String str2) {
        this.a = str2;
    }

    public static xd valueOf(String str) {
        return (xd) Enum.valueOf(xd.class, str);
    }

    public static xd[] values() {
        return (xd[]) b.clone();
    }
}
