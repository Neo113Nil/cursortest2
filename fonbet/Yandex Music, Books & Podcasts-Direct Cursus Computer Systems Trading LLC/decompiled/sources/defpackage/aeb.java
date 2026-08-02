package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aeb {
    public static final aeb a;
    public static final aeb b;
    public static final aeb c;
    public static final /* synthetic */ aeb[] d;

    static {
        aeb aebVar = new aeb("DATE", 0);
        a = aebVar;
        aeb aebVar2 = new aeb("ALPHABET", 1);
        b = aebVar2;
        aeb aebVar3 = new aeb("PODCASTS", 2);
        c = aebVar3;
        d = new aeb[]{aebVar, aebVar2, aebVar3};
    }

    public static aeb valueOf(String str) {
        return (aeb) Enum.valueOf(aeb.class, str);
    }

    public static aeb[] values() {
        return (aeb[]) d.clone();
    }
}
