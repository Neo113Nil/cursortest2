package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zea {
    public static final zea a;
    public static final zea b;
    public static final /* synthetic */ zea[] c;

    static {
        zea zeaVar = new zea("DOWNLOADED_DATE", 0);
        a = zeaVar;
        zea zeaVar2 = new zea("ALPHABET", 1);
        b = zeaVar2;
        c = new zea[]{zeaVar, zeaVar2};
    }

    public static zea valueOf(String str) {
        return (zea) Enum.valueOf(zea.class, str);
    }

    public static zea[] values() {
        return (zea[]) c.clone();
    }
}
