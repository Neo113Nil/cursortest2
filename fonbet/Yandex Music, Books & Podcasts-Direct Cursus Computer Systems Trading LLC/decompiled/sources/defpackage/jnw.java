package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jnw {
    public static final jnw a;
    public static final jnw b;
    public static final jnw c;
    public static final /* synthetic */ jnw[] d;

    static {
        jnw jnwVar = new jnw("Default", 0);
        a = jnwVar;
        jnw jnwVar2 = new jnw("Basic", 1);
        b = jnwVar2;
        jnw jnwVar3 = new jnw("GoAway", 2);
        c = jnwVar3;
        d = new jnw[]{jnwVar, jnwVar2, jnwVar3};
    }

    public static jnw valueOf(String str) {
        return (jnw) Enum.valueOf(jnw.class, str);
    }

    public static jnw[] values() {
        return (jnw[]) d.clone();
    }
}
