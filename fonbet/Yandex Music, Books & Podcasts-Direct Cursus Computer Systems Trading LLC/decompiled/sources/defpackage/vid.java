package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class vid {
    public static final vid a;
    public static final vid b;
    public static final /* synthetic */ vid[] c;

    static {
        vid vidVar = new vid("GLAGOL_CONTENT_ERROR", 0);
        a = vidVar;
        vid vidVar2 = new vid("GLAGOL_STATION_ERROR", 1);
        b = vidVar2;
        c = new vid[]{vidVar, vidVar2};
    }

    public static vid valueOf(String str) {
        return (vid) Enum.valueOf(vid.class, str);
    }

    public static vid[] values() {
        return (vid[]) c.clone();
    }
}
