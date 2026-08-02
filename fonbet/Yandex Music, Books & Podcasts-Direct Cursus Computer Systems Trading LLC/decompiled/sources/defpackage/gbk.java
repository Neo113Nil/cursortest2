package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gbk {
    public static final /* synthetic */ gbk[] a = {new gbk("ISO_DATE_PRECISION", 0), new gbk("ISO_DATE_PRECISION_NO_TIME_ZONE", 1), new gbk("ISO_DATE", 2), new gbk("ISO_NO_TIME_ZONE_DATE", 3), new gbk("SIMPLE_DATE", 4), new gbk("FULL_SIMPLE_DATE", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    gbk EF5;

    public static gbk valueOf(String str) {
        return (gbk) Enum.valueOf(gbk.class, str);
    }

    public static gbk[] values() {
        return (gbk[]) a.clone();
    }
}
