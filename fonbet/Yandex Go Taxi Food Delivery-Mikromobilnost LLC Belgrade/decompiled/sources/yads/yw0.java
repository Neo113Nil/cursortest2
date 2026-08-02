package yads;

import defpackage.k4o;
import defpackage.pt81;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class yw0 {
    public static final pt81 c;
    public static final yw0 d;
    public static final yw0 e;
    public static final yw0 f;
    public static final /* synthetic */ yw0[] g;
    public static final /* synthetic */ k4o h;
    public final String b;

    static {
        yw0 yw0Var = new yw0(0, "INTERSTITIAL", "interstitial");
        d = yw0Var;
        yw0 yw0Var2 = new yw0(1, "REWARDED", "rewarded");
        e = yw0Var2;
        yw0 yw0Var3 = new yw0(2, "APP_OPEN", "appopen");
        f = yw0Var3;
        yw0[] yw0VarArr = {yw0Var, yw0Var2, yw0Var3};
        g = yw0VarArr;
        h = a.a(yw0VarArr);
        c = new pt81();
    }

    public yw0(int i, String str, String str2) {
        this.b = str2;
    }

    public static yw0 valueOf(String str) {
        return (yw0) Enum.valueOf(yw0.class, str);
    }

    public static yw0[] values() {
        return (yw0[]) g.clone();
    }
}
