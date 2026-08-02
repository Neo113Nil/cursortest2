package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jxe {
    public static final jxe a;
    public static final jxe b;
    public static final /* synthetic */ jxe[] c;

    static {
        jxe jxeVar = new jxe("Width", 0);
        a = jxeVar;
        jxe jxeVar2 = new jxe("Height", 1);
        b = jxeVar2;
        c = new jxe[]{jxeVar, jxeVar2};
    }

    public static jxe valueOf(String str) {
        return (jxe) Enum.valueOf(jxe.class, str);
    }

    public static jxe[] values() {
        return (jxe[]) c.clone();
    }
}
