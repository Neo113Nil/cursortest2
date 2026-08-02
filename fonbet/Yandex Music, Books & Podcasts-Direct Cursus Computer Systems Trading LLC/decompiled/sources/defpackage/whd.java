package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class whd {
    public static final ovn c;
    public static final whd d;
    public static final /* synthetic */ whd[] e;
    public static final /* synthetic */ rdb f;
    public final String a;
    public final boolean b;

    static {
        whd whdVar = new whd(0, 4, "MUSIC_ON_STATION", "music_thick");
        whd whdVar2 = new whd(1, 4, "MUSIC_ON_SERVER", "music_thin");
        whd whdVar3 = new whd(2, 4, "MUSIC_RADIO", "radio");
        whd whdVar4 = new whd(3, 2, "VIDEO", "video");
        whd whdVar5 = new whd(4, 6, "UNKNOWN", "unknown");
        d = whdVar5;
        whd[] whdVarArr = {whdVar, whdVar2, whdVar3, whdVar4, whdVar5};
        e = whdVarArr;
        f = new rdb(whdVarArr);
        c = new ovn();
    }

    public whd(int i, int i2, String str, String str2) {
        boolean z = (i2 & 2) == 0;
        this.a = str2;
        this.b = z;
    }

    public static whd valueOf(String str) {
        return (whd) Enum.valueOf(whd.class, str);
    }

    public static whd[] values() {
        return (whd[]) e.clone();
    }
}
