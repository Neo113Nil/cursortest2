package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class axj {
    public static final /* synthetic */ axj[] a = {new axj("Horizontal", 0), new axj("Vertical", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    axj EF5;

    public static axj valueOf(String str) {
        return (axj) Enum.valueOf(axj.class, str);
    }

    public static axj[] values() {
        return (axj[]) a.clone();
    }
}
