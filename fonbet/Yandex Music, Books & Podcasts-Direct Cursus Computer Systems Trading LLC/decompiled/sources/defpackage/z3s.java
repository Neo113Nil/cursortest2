package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z3s {
    public static final jkl b;
    public static final List c;
    public static final z3s d;
    public static final /* synthetic */ z3s[] e;
    public static final /* synthetic */ rdb f;
    public final String a;

    static {
        z3s z3sVar = new z3s("New", 0, "new");
        d = z3sVar;
        z3s z3sVar2 = new z3s("Popular", 1, "popular");
        z3s[] z3sVarArr = {z3sVar, z3sVar2};
        e = z3sVarArr;
        f = new rdb(z3sVarArr);
        b = new jkl();
        c = u75.h(z3sVar, z3sVar2);
    }

    public z3s(String str, int i, String str2) {
        this.a = str2;
    }

    public static z3s valueOf(String str) {
        return (z3s) Enum.valueOf(z3s.class, str);
    }

    public static z3s[] values() {
        return (z3s[]) e.clone();
    }
}
