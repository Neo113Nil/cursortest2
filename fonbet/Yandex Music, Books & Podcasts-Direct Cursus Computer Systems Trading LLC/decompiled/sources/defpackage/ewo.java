package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ewo {
    public static final ewo a;
    public static final ewo b;
    public static final ewo c;
    public static final /* synthetic */ ewo[] d;

    static {
        ewo ewoVar = new ewo("None", 0);
        a = ewoVar;
        ewo ewoVar2 = new ewo("Vertical", 1);
        b = ewoVar2;
        ewo ewoVar3 = new ewo("Horizontal", 2);
        c = ewoVar3;
        d = new ewo[]{ewoVar, ewoVar2, ewoVar3};
    }

    public static ewo valueOf(String str) {
        return (ewo) Enum.valueOf(ewo.class, str);
    }

    public static ewo[] values() {
        return (ewo[]) d.clone();
    }
}
