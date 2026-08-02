package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class kvi {
    public static final kvi a;
    public static final kvi b;
    public static final /* synthetic */ kvi[] c;

    static {
        kvi kviVar = new kvi("BookShelf", 0);
        a = kviVar;
        kvi kviVar2 = new kvi("NewEpisodes", 1);
        b = kviVar2;
        c = new kvi[]{kviVar, kviVar2};
    }

    public static kvi valueOf(String str) {
        return (kvi) Enum.valueOf(kvi.class, str);
    }

    public static kvi[] values() {
        return (kvi[]) c.clone();
    }
}
