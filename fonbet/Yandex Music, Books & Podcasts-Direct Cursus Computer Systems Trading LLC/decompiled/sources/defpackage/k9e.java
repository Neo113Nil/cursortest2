package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k9e {
    public static final k9e a;
    public static final k9e b;
    public static final k9e c;
    public static final k9e d;
    public static final /* synthetic */ k9e[] e;

    static {
        k9e k9eVar = new k9e("UNIVERSAL", 0);
        a = k9eVar;
        k9e k9eVar2 = new k9e("APPLICATION", 1);
        b = k9eVar2;
        k9e k9eVar3 = new k9e("CONTEXT_SPECIFIC", 2);
        c = k9eVar3;
        k9e k9eVar4 = new k9e("PRIVATE", 3);
        d = k9eVar4;
        e = new k9e[]{k9eVar, k9eVar2, k9eVar3, k9eVar4};
    }

    public static k9e valueOf(String str) {
        return (k9e) Enum.valueOf(k9e.class, str);
    }

    public static k9e[] values() {
        return (k9e[]) e.clone();
    }
}
