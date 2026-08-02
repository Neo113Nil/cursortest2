package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xgr {
    public static final xgr e;
    public static final xgr f;
    public static final xgr g;
    public static final xgr h;
    public static final xgr i;
    public static final xgr j;
    public static final xgr k;
    public static final xgr l;
    public static final xgr m;
    public static final xgr n;
    public static final xgr o;
    public static final xgr p;
    public static final xgr q;
    public static final xgr r;
    public static final /* synthetic */ xgr[] s;
    public static final /* synthetic */ rdb t;
    public final String a;
    public final float b;
    public final boolean c;
    public final boolean d;

    static {
        xgr xgrVar = new xgr("SESSION_START", 0, "session_start", 0.0f, 12);
        e = xgrVar;
        xgr xgrVar2 = new xgr("APP_VISIBLE", 1, "app_visible", 1.0f, 12);
        f = xgrVar2;
        xgr xgrVar3 = new xgr("PAYWALL_START", 2, "paywall_start", 2.0f, 12);
        g = xgrVar3;
        xgr xgrVar4 = new xgr("OFFERS_LOADING_START", 3, "offers_loading_start", 3.0f, 12);
        h = xgrVar4;
        xgr xgrVar5 = new xgr("OFFERS_LOADING_FAILURE", 4, "offers_loading_fail", 5.0f, 8);
        i = xgrVar5;
        xgr xgrVar6 = new xgr("OFFERS_LOADING_EMPTY", 5, "offers_loading_empty", 5.0f, 8);
        j = xgrVar6;
        xgr xgrVar7 = new xgr("OFFERS_LOADING_SUCCESS", 6, "offers_loading_success", 5.0f, 12);
        k = xgrVar7;
        xgr xgrVar8 = new xgr("PAY_BUTTON_VISIBLE", 7, "pay_button_visible", 6.0f, 12);
        l = xgrVar8;
        xgr xgrVar9 = new xgr("PROMO_CODE_FLOW_START", 8, "promo_code_flow_start", 7.0f, 8);
        m = xgrVar9;
        xgr xgrVar10 = new xgr("RESTORE_INAPP_FLOW_START", 9, "restore_inapp_flow_start", 7.0f, 8);
        n = xgrVar10;
        xgr xgrVar11 = new xgr("PAYMENT_FLOW_START", 10, "payment_flow_start", 7.0f, 4);
        o = xgrVar11;
        xgr xgrVar12 = new xgr("PAYMENT_FLOW_FAILURE", 11, "payment_flow_failure", 8.0f, 8);
        p = xgrVar12;
        xgr xgrVar13 = new xgr("PAYMENT_FLOW_CANCEL", 12, "payment_flow_cancel", 8.0f, 8);
        q = xgrVar13;
        xgr xgrVar14 = new xgr("PAYMENT_FLOW_SUCCESS", 13, "payment_flow_success", 8.0f, 8);
        r = xgrVar14;
        xgr[] xgrVarArr = {xgrVar, xgrVar2, xgrVar3, xgrVar4, xgrVar5, xgrVar6, xgrVar7, xgrVar8, xgrVar9, xgrVar10, xgrVar11, xgrVar12, xgrVar13, xgrVar14};
        s = xgrVarArr;
        t = new rdb(xgrVarArr);
    }

    public xgr(String str, int i2, String str2, float f2, int i3) {
        boolean z = (i3 & 4) == 0;
        boolean z2 = (i3 & 8) == 0;
        this.a = str2;
        this.b = f2;
        this.c = z;
        this.d = z2;
    }

    public static xgr valueOf(String str) {
        return (xgr) Enum.valueOf(xgr.class, str);
    }

    public static xgr[] values() {
        return (xgr[]) s.clone();
    }
}
