package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vdk {
    public static final vdk a;
    public static final vdk b;
    public static final /* synthetic */ vdk[] c;

    static {
        vdk vdkVar = new vdk("NoSelectedMethod", 0);
        a = vdkVar;
        vdk vdkVar2 = new vdk("InvalidCvn", 1);
        b = vdkVar2;
        c = new vdk[]{vdkVar, vdkVar2};
    }

    public static vdk valueOf(String str) {
        return (vdk) Enum.valueOf(vdk.class, str);
    }

    public static vdk[] values() {
        return (vdk[]) c.clone();
    }
}
