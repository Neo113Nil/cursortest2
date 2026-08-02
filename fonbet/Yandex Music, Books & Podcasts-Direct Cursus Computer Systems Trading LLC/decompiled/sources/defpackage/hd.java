package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class hd {
    public static final hd a;
    public static final /* synthetic */ hd[] b;

    static {
        hd hdVar = new hd("kassa", 0);
        a = hdVar;
        b = new hd[]{hdVar};
    }

    public static hd valueOf(String str) {
        return (hd) Enum.valueOf(hd.class, str);
    }

    public static hd[] values() {
        return (hd[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "kassa";
    }
}
