package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vfw {
    public static final /* synthetic */ vfw[] a = {new vfw("FALLBACK_ON_ERROR", 0), new vfw("RESTORE_ON_ERROR", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    vfw EF5;

    public static vfw valueOf(String str) {
        return (vfw) Enum.valueOf(vfw.class, str);
    }

    public static vfw[] values() {
        return (vfw[]) a.clone();
    }
}
