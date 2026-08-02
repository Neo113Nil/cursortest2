package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class hln {
    public static final hln a;
    public static final hln b;
    public static final hln c;
    public static final /* synthetic */ hln[] d;

    static {
        hln hlnVar = new hln("PlayableChange", 0);
        a = hlnVar;
        hln hlnVar2 = new hln("OutputTargetChange", 1);
        b = hlnVar2;
        hln hlnVar3 = new hln("Restore", 2);
        c = hlnVar3;
        d = new hln[]{hlnVar, hlnVar2, hlnVar3};
    }

    public static hln valueOf(String str) {
        return (hln) Enum.valueOf(hln.class, str);
    }

    public static hln[] values() {
        return (hln[]) d.clone();
    }
}
