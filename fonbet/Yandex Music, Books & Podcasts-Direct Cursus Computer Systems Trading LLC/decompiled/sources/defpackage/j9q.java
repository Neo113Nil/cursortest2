package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j9q {
    public static final j9q a;
    public static final /* synthetic */ j9q[] b;

    /* JADX INFO: Fake field, exist only in values array */
    j9q EF0;

    static {
        j9q j9qVar = new j9q("ExactOnly", 0);
        j9q j9qVar2 = new j9q("AllowNotExact", 1);
        a = j9qVar2;
        b = new j9q[]{j9qVar, j9qVar2};
    }

    public static j9q valueOf(String str) {
        return (j9q) Enum.valueOf(j9q.class, str);
    }

    public static j9q[] values() {
        return (j9q[]) b.clone();
    }
}
