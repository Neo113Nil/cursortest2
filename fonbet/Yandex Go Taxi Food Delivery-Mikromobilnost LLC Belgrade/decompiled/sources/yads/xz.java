package yads;

import defpackage.k4o;
import defpackage.tq81;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class xz {
    public static final tq81 c;
    public static final xz d;
    public static final xz e;
    public static final xz f;
    public static final xz g;
    public static final xz h;
    public static final xz i;
    public static final xz j;
    public static final xz k;
    public static final /* synthetic */ xz[] l;
    public static final /* synthetic */ k4o m;
    public final String b;

    static {
        xz xzVar = new xz(0, "BANNER", "banner");
        d = xzVar;
        xz xzVar2 = new xz(1, "INTERSTITIAL", "interstitial");
        e = xzVar2;
        xz xzVar3 = new xz(2, "REWARDED", "rewarded");
        f = xzVar3;
        xz xzVar4 = new xz(3, "NATIVE", "native");
        g = xzVar4;
        xz xzVar5 = new xz(4, "INSTREAM", "instream");
        h = xzVar5;
        xz xzVar6 = new xz(5, "APPOPENAD", "appopenad");
        i = xzVar6;
        xz xzVar7 = new xz(6, "RETAIL_MEDIA", "retail");
        j = xzVar7;
        xz xzVar8 = new xz(7, "FEED", "feed");
        k = xzVar8;
        xz[] xzVarArr = {xzVar, xzVar2, xzVar3, xzVar4, xzVar5, xzVar6, xzVar7, xzVar8};
        l = xzVarArr;
        m = a.a(xzVarArr);
        c = new tq81();
    }

    public xz(int i2, String str, String str2) {
        this.b = str2;
    }

    public static xz valueOf(String str) {
        return (xz) Enum.valueOf(xz.class, str);
    }

    public static xz[] values() {
        return (xz[]) l.clone();
    }
}
