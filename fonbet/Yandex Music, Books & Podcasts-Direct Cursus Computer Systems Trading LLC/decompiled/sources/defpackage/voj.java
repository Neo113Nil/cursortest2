package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class voj {
    public static final voj a;
    public static final voj b;
    public static final voj c;
    public static final voj d;
    public static final /* synthetic */ voj[] e;

    static {
        voj vojVar = new voj("NONE", 0);
        a = vojVar;
        voj vojVar2 = new voj("BASIC", 1);
        b = vojVar2;
        voj vojVar3 = new voj("HEADERS", 2);
        c = vojVar3;
        voj vojVar4 = new voj("BODY", 3);
        d = vojVar4;
        e = new voj[]{vojVar, vojVar2, vojVar3, vojVar4};
    }

    public static voj valueOf(String str) {
        return (voj) Enum.valueOf(voj.class, str);
    }

    public static voj[] values() {
        return (voj[]) e.clone();
    }
}
