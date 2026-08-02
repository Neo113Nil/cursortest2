package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rhn {
    public static final rhn a;
    public static final rhn b;
    public static final /* synthetic */ rhn[] c;

    static {
        rhn rhnVar = new rhn("Read", 0);
        a = rhnVar;
        rhn rhnVar2 = new rhn("ReadWrite", 1);
        b = rhnVar2;
        c = new rhn[]{rhnVar, rhnVar2, new rhn("ReadWriteFullSync", 2), new rhn("ReadWriteDataSync", 3)};
    }

    public static rhn valueOf(String str) {
        return (rhn) Enum.valueOf(rhn.class, str);
    }

    public static rhn[] values() {
        return (rhn[]) c.clone();
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "r";
        }
        if (ordinal == 1) {
            return "rw";
        }
        if (ordinal == 2) {
            return "rws";
        }
        if (ordinal == 3) {
            return "rwd";
        }
        b6e.s();
        return null;
    }
}
