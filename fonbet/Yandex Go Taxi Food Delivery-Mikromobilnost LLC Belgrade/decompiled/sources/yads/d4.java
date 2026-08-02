package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d4 {
    public static final d4 b;
    public static final d4 c;
    public static final d4 d;
    public static final d4 e;
    public static final d4 f;
    public static final d4 g;
    public static final d4 h;
    public static final d4 i;
    public static final d4 j;
    public static final d4 k;
    public static final d4 l;
    public static final d4 m;
    public static final d4 n;
    public static final d4 o;
    public static final d4 p;
    public static final d4 q;
    public static final /* synthetic */ d4[] r;

    static {
        d4 d4Var = new d4("REQUEST_SUCCEEDED_RESPONSE_NOT_FOUND", 0);
        b = d4Var;
        d4 d4Var2 = new d4("REQUEST_SUCCEEDED_RESPONSE_PARAMS_INVALID", 1);
        c = d4Var2;
        d4 d4Var3 = new d4("REQUEST_SUCCEEDED_RESPONSE_NO_CONTENT", 2);
        d = d4Var3;
        d4 d4Var4 = new d4("REQUEST_SUCCEEDED_RESPONSE_CODE_INVALID", 3);
        e = d4Var4;
        d4 d4Var5 = new d4("REQUEST_SUCCEEDED_SERVICE_UNAVAILABLE", 4);
        f = d4Var5;
        d4 d4Var6 = new d4("REQUEST_SUCCEEDED_NO_SUCH_AD_UNIT_ID_ERROR", 5);
        g = d4Var6;
        d4 d4Var7 = new d4("REQUEST_SUCCEEDED_INVALID_SDK_CONFIGURATION", 6);
        h = d4Var7;
        d4 d4Var8 = new d4("REQUEST_FAILED_INVALID_ANDROID_SDK_API", 7);
        i = d4Var8;
        d4 d4Var9 = new d4("REQUEST_FAILED_INVALID_REQUEST_URL", 8);
        j = d4Var9;
        d4 d4Var10 = new d4("REQUEST_FAILED_INVALID_AD_TYPE", 9);
        k = d4Var10;
        d4 d4Var11 = new d4("REQUEST_FAILED_NO_CONNECTION", 10);
        l = d4Var11;
        d4 d4Var12 = new d4("REQUEST_FAILED_TIMEOUT", 11);
        m = d4Var12;
        d4 d4Var13 = new d4("REQUEST_FAILED_AUTH_FAILURE", 12);
        n = d4Var13;
        d4 d4Var14 = new d4("REQUEST_FAILED_CLIENT_ERROR", 13);
        o = d4Var14;
        d4 d4Var15 = new d4("REQUEST_FAILED_PARSE_ERROR", 14);
        p = d4Var15;
        d4 d4Var16 = new d4("REQUEST_FAILED_UNKNOWN", 15);
        q = d4Var16;
        r = new d4[]{d4Var, d4Var2, d4Var3, d4Var4, d4Var5, d4Var6, d4Var7, d4Var8, d4Var9, d4Var10, d4Var11, d4Var12, d4Var13, d4Var14, d4Var15, d4Var16};
    }

    public static d4 valueOf(String str) {
        return (d4) Enum.valueOf(d4.class, str);
    }

    public static d4[] values() {
        return (d4[]) r.clone();
    }
}
