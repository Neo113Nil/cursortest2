package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class nwo {
    public static final nwo a;
    public static final /* synthetic */ nwo[] b;

    static {
        nwo nwoVar = new nwo("SWAP", 0);
        a = nwoVar;
        b = new nwo[]{nwoVar, new nwo("INSERT", 1)};
    }

    public static nwo valueOf(String str) {
        return (nwo) Enum.valueOf(nwo.class, str);
    }

    public static nwo[] values() {
        return (nwo[]) b.clone();
    }
}
