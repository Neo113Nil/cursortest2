package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zop {
    public static final zop a;
    public static final zop b;
    public static final zop c;
    public static final zop d;
    public static final zop e;
    public static final zop f;
    public static final zop g;
    public static final /* synthetic */ zop[] h;

    static {
        zop zopVar = new zop("Repeat", 0);
        a = zopVar;
        zop zopVar2 = new zop("Shuffle", 1);
        b = zopVar2;
        zop zopVar3 = new zop("Lyrics", 2);
        c = zopVar3;
        zop zopVar4 = new zop("Timer", 3);
        d = zopVar4;
        zop zopVar5 = new zop("Quality", 4);
        e = zopVar5;
        zop zopVar6 = new zop("Download", 5);
        f = zopVar6;
        zop zopVar7 = new zop("Speed", 6);
        g = zopVar7;
        h = new zop[]{zopVar, zopVar2, zopVar3, zopVar4, zopVar5, zopVar6, zopVar7};
    }

    public static zop valueOf(String str) {
        return (zop) Enum.valueOf(zop.class, str);
    }

    public static zop[] values() {
        return (zop[]) h.clone();
    }
}
