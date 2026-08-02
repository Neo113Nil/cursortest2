package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kem {
    public static final kem a;
    public static final kem b;
    public static final /* synthetic */ kem[] c;

    static {
        kem kemVar = new kem("NonMusic", 0);
        a = kemVar;
        kem kemVar2 = new kem("Kids", 1);
        b = kemVar2;
        c = new kem[]{kemVar, kemVar2};
    }

    public static kem valueOf(String str) {
        return (kem) Enum.valueOf(kem.class, str);
    }

    public static kem[] values() {
        return (kem[]) c.clone();
    }
}
