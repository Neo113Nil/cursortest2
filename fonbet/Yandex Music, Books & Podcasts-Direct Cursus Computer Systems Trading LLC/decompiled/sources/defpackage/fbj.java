package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fbj {
    public static final kjn b;
    public static final fbj c;
    public static final /* synthetic */ fbj[] d;
    public static final /* synthetic */ rdb e;
    public final String a;

    static {
        fbj fbjVar = new fbj("NonMusic", 0, "non_music");
        c = fbjVar;
        fbj[] fbjVarArr = {fbjVar, new fbj("MobileAudiobooks", 1, "mobile_audiobooks"), new fbj("MobilePodcasts", 2, "mobile_podcasts")};
        d = fbjVarArr;
        e = new rdb(fbjVarArr);
        b = new kjn(28);
    }

    public fbj(String str, int i, String str2) {
        this.a = str2;
    }

    public static fbj valueOf(String str) {
        return (fbj) Enum.valueOf(fbj.class, str);
    }

    public static fbj[] values() {
        return (fbj[]) d.clone();
    }
}
