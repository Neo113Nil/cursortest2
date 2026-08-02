package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l4c {
    public static final l4c a;
    public static final l4c b;
    public static final /* synthetic */ l4c[] c;

    static {
        l4c l4cVar = new l4c("In", 0);
        a = l4cVar;
        l4c l4cVar2 = new l4c("Out", 1);
        b = l4cVar2;
        c = new l4c[]{l4cVar, l4cVar2};
    }

    public static l4c valueOf(String str) {
        return (l4c) Enum.valueOf(l4c.class, str);
    }

    public static l4c[] values() {
        return (l4c[]) c.clone();
    }
}
