package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c6v {
    public static final c6v a;
    public static final c6v b;
    public static final /* synthetic */ c6v[] c;

    static {
        c6v c6vVar = new c6v("Online", 0);
        a = c6vVar;
        c6v c6vVar2 = new c6v("Offline", 1);
        b = c6vVar2;
        c = new c6v[]{c6vVar, c6vVar2};
    }

    public static c6v valueOf(String str) {
        return (c6v) Enum.valueOf(c6v.class, str);
    }

    public static c6v[] values() {
        return (c6v[]) c.clone();
    }
}
