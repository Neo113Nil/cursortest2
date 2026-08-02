package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zug {
    public static final zug a;
    public static final zug b;
    public static final /* synthetic */ zug[] c;

    static {
        zug zugVar = new zug("Start", 0);
        a = zugVar;
        zug zugVar2 = new zug("End", 1);
        b = zugVar2;
        c = new zug[]{zugVar, zugVar2};
    }

    public static zug valueOf(String str) {
        return (zug) Enum.valueOf(zug.class, str);
    }

    public static zug[] values() {
        return (zug[]) c.clone();
    }
}
