package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class rba {
    public static final rba a;
    public static final rba b;
    public static final rba c;
    public static final /* synthetic */ rba[] d;

    static {
        rba rbaVar = new rba("NotDownloaded", 0);
        a = rbaVar;
        rba rbaVar2 = new rba("InProgress", 1);
        b = rbaVar2;
        rba rbaVar3 = new rba("Downloaded", 2);
        c = rbaVar3;
        d = new rba[]{rbaVar, rbaVar2, rbaVar3};
    }

    public static rba valueOf(String str) {
        return (rba) Enum.valueOf(rba.class, str);
    }

    public static rba[] values() {
        return (rba[]) d.clone();
    }
}
