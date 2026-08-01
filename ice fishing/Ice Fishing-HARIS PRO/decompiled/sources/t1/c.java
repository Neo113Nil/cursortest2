package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4376a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f4377b;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    static {
        c cVar = new c("SYNCHRONIZED", 0);
        c cVar2 = new c("PUBLICATION", 1);
        c cVar3 = new c("NONE", 2);
        f4376a = cVar3;
        f4377b = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4377b.clone();
    }
}
