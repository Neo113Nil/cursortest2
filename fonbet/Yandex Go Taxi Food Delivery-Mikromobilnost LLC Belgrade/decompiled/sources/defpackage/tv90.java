package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.AppInfo;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.GooglePayAllowedCardNetworks;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.MetricaInitMode;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class tv90 {
    public String A;
    public String B;
    public Boolean C;
    public od51 D;
    public ex5 E;
    public final Context a;
    public final PaymentSdkEnvironment b;
    public final ConsoleLoggingMode c;
    public final MetricaInitMode d;
    public Payer e;
    public Merchant f;
    public ox90 g;
    public tw4 h;
    public boolean i;
    public String j;
    public String k;
    public String l;
    public int m = 225;
    public GooglePayData n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public boolean s;
    public AppInfo t;
    public List u;
    public PaymentMethodsFilter v;
    public GooglePayAllowedCardNetworks w;
    public y22 x;
    public rwo y;
    public vv50 z;

    public tv90(Context context, PaymentSdkEnvironment paymentSdkEnvironment, ConsoleLoggingMode consoleLoggingMode, MetricaInitMode metricaInitMode) {
        AppInfo appInfo;
        GooglePayAllowedCardNetworks googlePayAllowedCardNetworks;
        this.a = context;
        this.b = paymentSdkEnvironment;
        this.c = consoleLoggingMode;
        this.d = metricaInitMode;
        AppInfo.Companion.getClass();
        appInfo = AppInfo.Default;
        this.t = appInfo;
        this.u = EmptyList.a;
        this.v = new PaymentMethodsFilter();
        GooglePayAllowedCardNetworks.Companion.getClass();
        googlePayAllowedCardNetworks = GooglePayAllowedCardNetworks.DEFAULT;
        this.w = googlePayAllowedCardNetworks;
        this.B = "";
        this.D = new fmh();
        this.E = new y6h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [rwo] */
    public final yv90 a() {
        Payer payer = this.e;
        if (payer == null) {
            ny61.g("Provide Payer parameter");
            return null;
        }
        Merchant merchant = this.f;
        if (merchant == null) {
            ny61.g("Provide Merchant parameter");
            return null;
        }
        ox90 ox90Var = this.g;
        if (ox90Var == null) {
            ny61.g("Provide payment callbacks");
            return null;
        }
        y22 y22Var = new y22(scc.i(new ve51()), new km0());
        y22 y22Var2 = this.x;
        y22 y22Var3 = y22Var2 == null ? y22Var : y22Var2;
        ?? r5 = this.y;
        y22 y22Var4 = r5 == 0 ? y22Var : r5;
        vv50 vv50Var = this.z;
        if (vv50Var == null) {
            vv50Var = new rwn();
        }
        return new yv90(this.a, payer, merchant, ox90Var, this.h, this.i, this.j, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, te91.c(this.v), this.b, this.c, this.l, this.w, this.d, y22Var3, y22Var, y22Var4, vv50Var, this.A, this.B, this.C, this.D, this.E);
    }
}
