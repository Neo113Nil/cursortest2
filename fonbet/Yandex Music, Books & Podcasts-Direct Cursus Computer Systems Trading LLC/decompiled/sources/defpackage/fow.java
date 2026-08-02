package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class fow {
    public static final ovk b;
    public static final fow c;
    public static final fow d;
    public static final fow e;
    public static final fow f;
    public static final fow g;
    public static final fow h;
    public static final fow i;
    public static final fow j;
    public static final fow k;
    public static final fow l;
    public static final /* synthetic */ fow[] m;
    public static final /* synthetic */ rdb n;
    public final String a;

    static {
        fow fowVar = new fow("IOS", 0, "ios");
        c = fowVar;
        fow fowVar2 = new fow("APPLE_TV", 1, "apple_tv");
        d = fowVar2;
        fow fowVar3 = new fow("ANDROID", 2, ConstantDeviceInfo.APP_PLATFORM);
        e = fowVar3;
        fow fowVar4 = new fow("ANDROID_TV", 3, "android_tv");
        f = fowVar4;
        fow fowVar5 = new fow("WEB", 4, "web");
        g = fowVar5;
        fow fowVar6 = new fow("WEB_TV", 5, "web_tv");
        h = fowVar6;
        fow fowVar7 = new fow("WEB_DESKTOP", 6, "web_desktop");
        i = fowVar7;
        fow fowVar8 = new fow("SMART_SPEAKER", 7, "smart_speaker");
        j = fowVar8;
        fow fowVar9 = new fow("ANDROID_WEAR", 8, "android_wear");
        k = fowVar9;
        fow fowVar10 = new fow("UNKNOWN", 9, "unknown");
        l = fowVar10;
        fow[] fowVarArr = {fowVar, fowVar2, fowVar3, fowVar4, fowVar5, fowVar6, fowVar7, fowVar8, fowVar9, fowVar10};
        m = fowVarArr;
        n = new rdb(fowVarArr);
        b = new ovk();
    }

    public fow(String str, int i2, String str2) {
        this.a = str2;
    }

    public static fow valueOf(String str) {
        return (fow) Enum.valueOf(fow.class, str);
    }

    public static fow[] values() {
        return (fow[]) m.clone();
    }
}
