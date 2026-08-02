package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class go3 {
    public static final go3 a;
    public static final go3 b;
    public static final go3 c;
    public static final go3 d;
    public static final HashMap e;
    public static final /* synthetic */ go3[] f;

    /* JADX INFO: Fake field, exist only in values array */
    go3 EF1;

    static {
        go3 go3Var = new go3("target", 0);
        go3 go3Var2 = new go3("root", 1);
        go3 go3Var3 = new go3("nth_child", 2);
        a = go3Var3;
        go3 go3Var4 = new go3("nth_last_child", 3);
        go3 go3Var5 = new go3("nth_of_type", 4);
        b = go3Var5;
        go3 go3Var6 = new go3("nth_last_of_type", 5);
        c = go3Var6;
        go3 go3Var7 = new go3("first_child", 6);
        go3 go3Var8 = new go3("last_child", 7);
        go3 go3Var9 = new go3("first_of_type", 8);
        go3 go3Var10 = new go3("last_of_type", 9);
        go3 go3Var11 = new go3("only_child", 10);
        go3 go3Var12 = new go3("only_of_type", 11);
        go3 go3Var13 = new go3("empty", 12);
        go3 go3Var14 = new go3("not", 13);
        go3 go3Var15 = new go3("lang", 14);
        go3 go3Var16 = new go3("link", 15);
        go3 go3Var17 = new go3("visited", 16);
        go3 go3Var18 = new go3("hover", 17);
        go3 go3Var19 = new go3("active", 18);
        go3 go3Var20 = new go3("focus", 19);
        go3 go3Var21 = new go3("enabled", 20);
        go3 go3Var22 = new go3("disabled", 21);
        go3 go3Var23 = new go3("checked", 22);
        go3 go3Var24 = new go3("indeterminate", 23);
        go3 go3Var25 = new go3("UNSUPPORTED", 24);
        d = go3Var25;
        f = new go3[]{go3Var, go3Var2, go3Var3, go3Var4, go3Var5, go3Var6, go3Var7, go3Var8, go3Var9, go3Var10, go3Var11, go3Var12, go3Var13, go3Var14, go3Var15, go3Var16, go3Var17, go3Var18, go3Var19, go3Var20, go3Var21, go3Var22, go3Var23, go3Var24, go3Var25};
        e = new HashMap();
        for (go3 go3Var26 : values()) {
            if (go3Var26 != d) {
                e.put(go3Var26.name().replace('_', '-'), go3Var26);
            }
        }
    }

    public static go3 valueOf(String str) {
        return (go3) Enum.valueOf(go3.class, str);
    }

    public static go3[] values() {
        return (go3[]) f.clone();
    }
}
