package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zov {
    public static final zov a;
    public static final /* synthetic */ zov[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zov EF0;

    static {
        zov zovVar = new zov("FULL_SCREEN_WIDTH", 0);
        zov zovVar2 = new zov("COMPACT_WIDTH", 1);
        a = zovVar2;
        b = new zov[]{zovVar, zovVar2};
    }

    public static zov valueOf(String str) {
        return (zov) Enum.valueOf(zov.class, str);
    }

    public static zov[] values() {
        return (zov[]) b.clone();
    }
}
