package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class heh {
    public static final heh a;
    public static final heh b;
    public static final heh c;
    public static final /* synthetic */ heh[] d;

    static {
        heh hehVar = new heh("BOTH_DIMENSIONS", 0);
        a = hehVar;
        heh hehVar2 = new heh("VERTICAL", 1);
        b = hehVar2;
        heh hehVar3 = new heh("HORIZONTAL", 2);
        c = hehVar3;
        d = new heh[]{hehVar, hehVar2, hehVar3};
    }

    public static heh valueOf(String str) {
        return (heh) Enum.valueOf(heh.class, str);
    }

    public static heh[] values() {
        return (heh[]) d.clone();
    }
}
