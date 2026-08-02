package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x3i {
    public static final x3i a;
    public static final x3i b;
    public static final x3i c;
    public static final /* synthetic */ x3i[] d;

    static {
        x3i x3iVar = new x3i("DO_NOT_INIT", 0);
        a = x3iVar;
        x3i x3iVar2 = new x3i("PAYMENT_SDK_DIALOG", 1);
        b = x3iVar2;
        x3i x3iVar3 = new x3i("CORE", 2);
        c = x3iVar3;
        d = new x3i[]{x3iVar, x3iVar2, x3iVar3};
    }

    public static x3i valueOf(String str) {
        return (x3i) Enum.valueOf(x3i.class, str);
    }

    public static x3i[] values() {
        return (x3i[]) d.clone();
    }
}
