package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f4w {
    public static final /* synthetic */ f4w[] a = {new f4w("NOT_APPLIED", 0), new f4w("APPLIED_IMMEDIATELY", 1), new f4w("APPLIED_FOR_NEXT_RUN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    f4w EF5;

    public static f4w valueOf(String str) {
        return (f4w) Enum.valueOf(f4w.class, str);
    }

    public static f4w[] values() {
        return (f4w[]) a.clone();
    }
}
