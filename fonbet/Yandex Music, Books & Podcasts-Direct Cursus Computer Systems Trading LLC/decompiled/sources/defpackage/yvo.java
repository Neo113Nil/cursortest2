package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yvo {
    public static final /* synthetic */ yvo[] a = {new yvo("SAVE_TO_DISK", 0), new yvo("SAVE_TO_TEMPORARY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    yvo EF5;

    public static yvo valueOf(String str) {
        return (yvo) Enum.valueOf(yvo.class, str);
    }

    public static yvo[] values() {
        return (yvo[]) a.clone();
    }
}
