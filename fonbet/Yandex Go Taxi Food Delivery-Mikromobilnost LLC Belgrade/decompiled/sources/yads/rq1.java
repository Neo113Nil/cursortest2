package yads;

import defpackage.e681;
import defpackage.gw00;
import defpackage.k4o;
import defpackage.tcc;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class rq1 {
    public static final e681 c;
    public static final LinkedHashMap d;
    public static final rq1 e;
    public static final rq1 f;
    public static final rq1 g;
    public static final rq1 h;
    public static final rq1 i;
    public static final rq1 j;
    public static final rq1 k;
    public static final rq1 l;
    public static final rq1 m;
    public static final rq1 n;
    public static final rq1 o;
    public static final rq1 p;
    public static final rq1 q;
    public static final rq1 r;
    public static final rq1 s;
    public static final rq1 t;
    public static final rq1 u;
    public static final rq1 v;
    public static final rq1 w;
    public static final rq1 x;
    public static final /* synthetic */ rq1[] y;
    public final String b;

    static {
        rq1 rq1Var = new rq1(0, "APPLOVIN", "applovin");
        e = rq1Var;
        rq1 rq1Var2 = new rq1(1, "APPLOVIN_MAX", "applovin_max");
        f = rq1Var2;
        rq1 rq1Var3 = new rq1(2, "APPNEXT", "appnext");
        g = rq1Var3;
        rq1 rq1Var4 = new rq1(3, "BIGOADS", "bigoads");
        h = rq1Var4;
        rq1 rq1Var5 = new rq1(4, "CHARTBOOST", "chartboost");
        i = rq1Var5;
        rq1 rq1Var6 = new rq1(5, "ADMOB", "admob");
        j = rq1Var6;
        rq1 rq1Var7 = new rq1(6, "ADMANAGER", "admanager");
        k = rq1Var7;
        rq1 rq1Var8 = new rq1(7, "DIGITAL_TURBINE", "digitalturbine");
        l = rq1Var8;
        rq1 rq1Var9 = new rq1(8, "INMOBI", "inmobi");
        m = rq1Var9;
        rq1 rq1Var10 = new rq1(9, "IRONSOURCE", "ironsource");
        n = rq1Var10;
        rq1 rq1Var11 = new rq1(10, "MINTEGRAL", "mintegral");
        o = rq1Var11;
        rq1 rq1Var12 = new rq1(11, "MYTARGET", "mytarget");
        p = rq1Var12;
        rq1 rq1Var13 = new rq1(12, "PANGLE", "pangle");
        q = rq1Var13;
        rq1 rq1Var14 = new rq1(13, "PETALADS", "petalads");
        r = rq1Var14;
        rq1 rq1Var15 = new rq1(14, "STARTAPP", "startapp");
        s = rq1Var15;
        rq1 rq1Var16 = new rq1(15, "TAPJOY", "tapjoy");
        t = rq1Var16;
        rq1 rq1Var17 = new rq1(16, "UNITYADS", "unityads");
        u = rq1Var17;
        rq1 rq1Var18 = new rq1(17, "VUNGLE", "vungle");
        v = rq1Var18;
        rq1 rq1Var19 = new rq1(18, "ZMATICOO", "zmaticoo");
        w = rq1Var19;
        rq1 rq1Var20 = new rq1(19, "UNDEFINED", StringUtils.UNDEFINED);
        x = rq1Var20;
        rq1[] rq1VarArr = {rq1Var, rq1Var2, rq1Var3, rq1Var4, rq1Var5, rq1Var6, rq1Var7, rq1Var8, rq1Var9, rq1Var10, rq1Var11, rq1Var12, rq1Var13, rq1Var14, rq1Var15, rq1Var16, rq1Var17, rq1Var18, rq1Var19, rq1Var20};
        y = rq1VarArr;
        k4o a = a.a(rq1VarArr);
        c = new e681();
        int d2 = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2 < 16 ? 16 : d2);
        for (Object obj : a) {
            linkedHashMap.put(((rq1) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public rq1(int i2, String str, String str2) {
        this.b = str2;
    }

    public static rq1 valueOf(String str) {
        return (rq1) Enum.valueOf(rq1.class, str);
    }

    public static rq1[] values() {
        return (rq1[]) y.clone();
    }
}
