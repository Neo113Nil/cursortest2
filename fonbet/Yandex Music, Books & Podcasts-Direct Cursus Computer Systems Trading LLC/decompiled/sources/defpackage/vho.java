package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vho {
    public static final vho a;
    public static final /* synthetic */ vho[] b;

    /* JADX INFO: Fake field, exist only in values array */
    vho EF0;

    static {
        vho vhoVar = new vho("DEVELOPMENT", 0);
        vho vhoVar2 = new vho("PRODUCTION", 1);
        a = vhoVar2;
        b = new vho[]{vhoVar, vhoVar2};
    }

    public static vho valueOf(String str) {
        return (vho) Enum.valueOf(vho.class, str);
    }

    public static vho[] values() {
        return (vho[]) b.clone();
    }
}
