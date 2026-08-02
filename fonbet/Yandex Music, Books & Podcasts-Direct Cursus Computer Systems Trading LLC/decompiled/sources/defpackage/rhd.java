package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class rhd {
    public static final x2i b;
    public static final rhd c;
    public static final rhd d;
    public static final rhd e;
    public static final /* synthetic */ rhd[] f;
    public static final /* synthetic */ rdb g;
    public final String a;

    static {
        rhd rhdVar = new rhd("RADIO", 0, "radio");
        c = rhdVar;
        rhd rhdVar2 = new rhd("TRACK", 1, "track");
        rhd rhdVar3 = new rhd("ALBUM", 2, "album");
        rhd rhdVar4 = new rhd("ARTIST", 3, "artist");
        rhd rhdVar5 = new rhd("PLAYLIST", 4, "playlist");
        rhd rhdVar6 = new rhd("STREAM", 5, "fm_radio");
        rhd rhdVar7 = new rhd("GENERATIVE", 6, "generative");
        d = rhdVar7;
        rhd rhdVar8 = new rhd("OTHER", 7, "");
        e = rhdVar8;
        rhd[] rhdVarArr = {rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8};
        f = rhdVarArr;
        g = new rdb(rhdVarArr);
        b = new x2i(24);
    }

    public rhd(String str, int i, String str2) {
        this.a = str2;
    }

    public static rhd valueOf(String str) {
        return (rhd) Enum.valueOf(rhd.class, str);
    }

    public static rhd[] values() {
        return (rhd[]) f.clone();
    }
}
