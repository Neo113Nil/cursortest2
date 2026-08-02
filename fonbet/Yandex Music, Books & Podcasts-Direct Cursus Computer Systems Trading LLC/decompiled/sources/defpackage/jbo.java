package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jbo {
    public static final jbo a;
    public static final jbo b;
    public static final /* synthetic */ jbo[] c;

    static {
        jbo jboVar = new jbo("NoNetwork", 0);
        a = jboVar;
        jbo jboVar2 = new jbo("Buffering", 1);
        b = jboVar2;
        c = new jbo[]{jboVar, jboVar2};
    }

    public static jbo valueOf(String str) {
        return (jbo) Enum.valueOf(jbo.class, str);
    }

    public static jbo[] values() {
        return (jbo[]) c.clone();
    }
}
