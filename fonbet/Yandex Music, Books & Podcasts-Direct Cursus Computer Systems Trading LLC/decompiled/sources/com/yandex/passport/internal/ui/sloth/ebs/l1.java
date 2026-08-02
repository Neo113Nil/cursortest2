package com.yandex.passport.internal.ui.sloth.ebs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l1 {
    public static final i0 a;
    public static final l1 b;
    public static final l1 c;
    public static final l1 d;
    public static final l1 e;
    public static final l1 f;
    public static final l1 g;
    public static final l1 h;
    public static final /* synthetic */ l1[] i;

    static {
        l1 l1Var = new l1("IOEXCEPTION", 0);
        b = l1Var;
        l1 l1Var2 = new l1("JSON_EXCEPTION", 1);
        c = l1Var2;
        l1 l1Var3 = new l1("SERIALIZATION_EXCEPTION", 2);
        d = l1Var3;
        l1 l1Var4 = new l1("INVALID_TOKEN", 3);
        e = l1Var4;
        l1 l1Var5 = new l1("BACKEND_ERROR_EXCEPTION", 4);
        f = l1Var5;
        l1 l1Var6 = new l1("FAILED_RESPONSE_EXCEPTION", 5);
        g = l1Var6;
        l1 l1Var7 = new l1("TRACK_ID_IS_NULL", 6);
        l1 l1Var8 = new l1("ESIA_CONSENT_APPLICATION_IS_NULL", 7);
        l1 l1Var9 = new l1("ESIA_CONSENT_CONSUMER_NULL", 8);
        l1 l1Var10 = new l1("ESIA_CONSENT_SCOPE_IS_NULL", 9);
        l1 l1Var11 = new l1("RETRYING_TRACK_ID_INIT_REQUEST_FAILED", 10);
        l1 l1Var12 = new l1("INSTALL_ID_IS_NULL", 11);
        l1 l1Var13 = new l1("FACE_RECOGNIZED_IS_FALSE", 12);
        l1 l1Var14 = new l1("FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE", 13);
        l1 l1Var15 = new l1("UNKNOWN", 14);
        h = l1Var15;
        i = new l1[]{l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6, l1Var7, l1Var8, l1Var9, l1Var10, l1Var11, l1Var12, l1Var13, l1Var14, l1Var15};
        a = new i0();
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) i.clone();
    }
}
