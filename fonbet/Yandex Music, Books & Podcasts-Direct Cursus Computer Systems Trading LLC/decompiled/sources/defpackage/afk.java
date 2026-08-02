package defpackage;

import io.appmetrica.analytics.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class afk {
    public static final afk a;
    public static final afk b;
    public static final afk c;
    public static final afk d;
    public static final afk e;
    public static final afk f;
    public static final /* synthetic */ afk[] g;

    static {
        afk afkVar = new afk(BuildConfig.SDK_BUILD_FLAVOR, 0);
        a = afkVar;
        afk afkVar2 = new afk("mobileBackend", 1);
        b = afkVar2;
        afk afkVar3 = new afk("diehard", 2);
        c = afkVar3;
        afk afkVar4 = new afk("nspk", 3);
        d = afkVar4;
        afk afkVar5 = new afk("external", 4);
        e = afkVar5;
        afk afkVar6 = new afk("passport", 5);
        f = afkVar6;
        g = new afk[]{afkVar, afkVar2, afkVar3, afkVar4, afkVar5, afkVar6};
    }

    public static afk valueOf(String str) {
        return (afk) Enum.valueOf(afk.class, str);
    }

    public static afk[] values() {
        return (afk[]) g.clone();
    }
}
