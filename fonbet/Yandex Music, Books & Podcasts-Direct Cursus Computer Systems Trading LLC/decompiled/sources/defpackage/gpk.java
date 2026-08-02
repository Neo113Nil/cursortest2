package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gpk {
    public static final gpk a;
    public static final gpk b;
    public static final gpk c;
    public static final /* synthetic */ gpk[] d;

    static {
        gpk gpkVar = new gpk("LIKE", 0);
        a = gpkVar;
        gpk gpkVar2 = new gpk("NEUTRAL", 1);
        b = gpkVar2;
        gpk gpkVar3 = new gpk("DISLIKE", 2);
        c = gpkVar3;
        d = new gpk[]{gpkVar, gpkVar2, gpkVar3};
    }

    public static gpk valueOf(String str) {
        return (gpk) Enum.valueOf(gpk.class, str);
    }

    public static gpk[] values() {
        return (gpk[]) d.clone();
    }
}
