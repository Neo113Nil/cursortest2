package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hxe {
    public static final hxe a;
    public static final hxe b;
    public static final /* synthetic */ hxe[] c;

    static {
        hxe hxeVar = new hxe("Min", 0);
        a = hxeVar;
        hxe hxeVar2 = new hxe("Max", 1);
        b = hxeVar2;
        c = new hxe[]{hxeVar, hxeVar2};
    }

    public static hxe valueOf(String str) {
        return (hxe) Enum.valueOf(hxe.class, str);
    }

    public static hxe[] values() {
        return (hxe[]) c.clone();
    }
}
