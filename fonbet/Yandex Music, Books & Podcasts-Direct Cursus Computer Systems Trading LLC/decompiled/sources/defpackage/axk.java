package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class axk {
    public static final axk a;
    public static final axk b;
    public static final /* synthetic */ axk[] c;

    static {
        axk axkVar = new axk("Available", 0);
        a = axkVar;
        axk axkVar2 = new axk("OnlyBetweenItems", 1);
        axk axkVar3 = new axk("Unavailable", 2);
        b = axkVar3;
        c = new axk[]{axkVar, axkVar2, axkVar3};
    }

    public static axk valueOf(String str) {
        return (axk) Enum.valueOf(axk.class, str);
    }

    public static axk[] values() {
        return (axk[]) c.clone();
    }
}
