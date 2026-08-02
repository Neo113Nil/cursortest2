package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class mur {
    public static final mur a;
    public static final mur b;
    public static final /* synthetic */ mur[] c;

    static {
        mur murVar = new mur("Wheel", 0);
        a = murVar;
        mur murVar2 = new mur("Carousel", 1);
        b = murVar2;
        c = new mur[]{murVar, murVar2, new mur("QueueContext", 2)};
    }

    public static mur valueOf(String str) {
        return (mur) Enum.valueOf(mur.class, str);
    }

    public static mur[] values() {
        return (mur[]) c.clone();
    }
}
