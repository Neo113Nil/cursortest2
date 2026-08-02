package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class knu {
    public static final /* synthetic */ knu[] a = {new knu("ENTITY", 0), new knu("JUICYDIALOG", 1), new knu("COLLECTION", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    knu EF5;

    public static knu valueOf(String str) {
        return (knu) Enum.valueOf(knu.class, str);
    }

    public static knu[] values() {
        return (knu[]) a.clone();
    }
}
