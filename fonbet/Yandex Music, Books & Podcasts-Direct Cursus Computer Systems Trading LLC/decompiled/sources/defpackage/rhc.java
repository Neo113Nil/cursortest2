package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class rhc implements ues {
    public static final phc a;
    public static final ohc b;
    public static final qhc c;
    public static final /* synthetic */ rhc[] d;

    static {
        phc phcVar = new phc();
        a = phcVar;
        ohc ohcVar = new ohc();
        b = ohcVar;
        qhc qhcVar = new qhc();
        c = qhcVar;
        d = new rhc[]{phcVar, ohcVar, qhcVar};
    }

    public static rhc valueOf(String str) {
        return (rhc) Enum.valueOf(rhc.class, str);
    }

    public static rhc[] values() {
        return (rhc[]) d.clone();
    }
}
