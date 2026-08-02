package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class upl {
    public static final upl a;
    public static final upl b;
    public static final /* synthetic */ upl[] c;

    static {
        upl uplVar = new upl("Music", 0);
        a = uplVar;
        upl uplVar2 = new upl("Video", 1);
        b = uplVar2;
        c = new upl[]{uplVar, uplVar2};
    }

    public static upl valueOf(String str) {
        return (upl) Enum.valueOf(upl.class, str);
    }

    public static upl[] values() {
        return (upl[]) c.clone();
    }
}
