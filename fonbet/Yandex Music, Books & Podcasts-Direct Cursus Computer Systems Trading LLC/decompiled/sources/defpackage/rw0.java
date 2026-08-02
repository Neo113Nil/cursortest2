package defpackage;

import com.yandex.plus.pay.api.model.AppDistribution;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class rw0 {
    public static final o6c c;
    public static final rw0 d;
    public static final /* synthetic */ rw0[] e;
    public static final /* synthetic */ rdb f;
    public final String a;
    public final String b;

    static {
        rw0 rw0Var = new rw0("GOOGLE_STORE", 0, "Google", AppDistribution.GOOGLE_STORE);
        rw0 rw0Var2 = new rw0("SAMSUNG_STORE", 1, "Samsung", AppDistribution.SAMSUNG_STORE);
        rw0 rw0Var3 = new rw0("HUAWEI_STORE", 2, "Huawei", AppDistribution.HUAWEI_STORE);
        rw0 rw0Var4 = new rw0("XIAOMI_STORE", 3, "Xiaomi", AppDistribution.XIAOMI_STORE);
        rw0 rw0Var5 = new rw0("RUSTORE_STORE", 4, "RuStore", "RuStore");
        rw0 rw0Var6 = new rw0("DEV", 5, "Dev", "Dev");
        d = rw0Var6;
        rw0[] rw0VarArr = {rw0Var, rw0Var2, rw0Var3, rw0Var4, rw0Var5, rw0Var6};
        e = rw0VarArr;
        f = new rdb(rw0VarArr);
        c = new o6c(14);
    }

    public rw0(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static rw0 valueOf(String str) {
        return (rw0) Enum.valueOf(rw0.class, str);
    }

    public static rw0[] values() {
        return (rw0[]) e.clone();
    }
}
