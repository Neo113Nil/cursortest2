package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ffw {
    public static final /* synthetic */ ffw[] a = {new ffw("Production", 0), new ffw("Qa", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ffw EF5;

    public static ffw valueOf(String str) {
        return (ffw) Enum.valueOf(ffw.class, str);
    }

    public static ffw[] values() {
        return (ffw[]) a.clone();
    }
}
