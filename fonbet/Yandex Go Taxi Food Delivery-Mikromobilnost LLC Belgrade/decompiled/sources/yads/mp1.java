package yads;

import defpackage.gq71;
import defpackage.k4o;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class mp1 {
    public static final gq71 c;
    public static final mp1 d;
    public static final mp1 e;
    public static final /* synthetic */ mp1[] f;
    public static final /* synthetic */ k4o g;
    public final String b;

    static {
        mp1 mp1Var = new mp1(0, "INTERSTITIAL", "interstitial");
        d = mp1Var;
        mp1 mp1Var2 = new mp1(1, "REWARDED", "rewarded");
        mp1 mp1Var3 = new mp1(2, "BANNER", "banner");
        mp1 mp1Var4 = new mp1(3, "NATIVE", "native");
        e = mp1Var4;
        mp1[] mp1VarArr = {mp1Var, mp1Var2, mp1Var3, mp1Var4};
        f = mp1VarArr;
        g = a.a(mp1VarArr);
        c = new gq71();
    }

    public mp1(int i, String str, String str2) {
        this.b = str2;
    }

    public static mp1 valueOf(String str) {
        return (mp1) Enum.valueOf(mp1.class, str);
    }

    public static mp1[] values() {
        return (mp1[]) f.clone();
    }
}
