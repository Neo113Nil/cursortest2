package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ekp {
    public static final ekp a;
    public static final ekp b;
    public static final ekp c;
    public static final ekp d;
    public static final ekp e;
    public static final /* synthetic */ ekp[] f;

    static {
        ekp ekpVar = new ekp("Domain", 0);
        a = ekpVar;
        ekp ekpVar2 = new ekp("Protocol", 1);
        b = ekpVar2;
        ekp ekpVar3 = new ekp("Application", 2);
        c = ekpVar3;
        ekp ekpVar4 = new ekp("Instance", 3);
        d = ekpVar4;
        ekp ekpVar5 = new ekp("Subtype", 4);
        e = ekpVar5;
        f = new ekp[]{ekpVar, ekpVar2, ekpVar3, ekpVar4, ekpVar5};
    }

    public static ekp valueOf(String str) {
        return (ekp) Enum.valueOf(ekp.class, str);
    }

    public static ekp[] values() {
        return (ekp[]) f.clone();
    }
}
