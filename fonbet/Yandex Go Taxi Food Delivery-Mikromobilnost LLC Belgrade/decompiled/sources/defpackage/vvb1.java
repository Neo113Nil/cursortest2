package defpackage;

import android.os.Handler;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentMethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class vvb1 implements ku3, zme, rr9, dbi0, fen, iko, q5s, k1t0, ee20, eq50, u370, g0a0, s1c0, c5c0, icf0, zoj0, rcr0, ovt0, nbx0, ecy0 {
    public static boolean I;
    public static vvb1 a;
    public static lg z;
    public static final jl1 b = new jl1();
    public static final vvb1 c = new vvb1();
    public static final vvb1 w = new vvb1();
    public static final vvb1 x = new vvb1();
    public static final vvb1 y = new vvb1();
    public static final vvb1 A = new vvb1();
    public static final vvb1 B = new vvb1();
    public static final vvb1 C = new vvb1();
    public static final vvb1 D = new vvb1();
    public static final vvb1 E = new vvb1();
    public static final vvb1 F = new vvb1();
    public static final vvb1 G = new vvb1();
    public static final vvb1 H = new vvb1();
    public static final vvb1 J = new vvb1();
    public static final vvb1 K = new vvb1();
    public static final vvb1 L = new vvb1();
    public static final vvb1 M = new vvb1();
    public static final vvb1 N = new vvb1();
    public static final obo0 O = new obo0();
    public static final vvb1 P = new vvb1();
    public static final vvb1 Q = new vvb1();
    public static final vvb1 R = new vvb1();
    public static final vvb1 S = new vvb1();

    public static nng s(String str, byte[] bArr) {
        return new nng(str, bArr);
    }

    public static nng u(int i, String str, byte[] bArr) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bArr = null;
        }
        return new nng(str, bArr);
    }

    public static ihq0 v(NewCard newCard) {
        gl8 gl8Var = gl8.a;
        String cardNumber = newCard.getCardNumber();
        gl8Var.getClass();
        CardPaymentSystem a2 = gl8.a(cardNumber);
        ArrayList i = scc.i("NEW_CARD");
        String cardNumber2 = newCard.getCardNumber();
        return new ihq0(wme.e(new PaymentMethod("NEW_CARD", i, c.c(cardNumber2.length(), c.d(-4, null, cardNumber2)), a2 != CardPaymentSystem.UNKNOWN ? a2.toString() : "", true, BankName.UnknownBank, null, null, null, PaymentMethodType.Card, null, null, null, null, null, null)), newCard);
    }

    public static a w(smp smpVar) {
        return smpVar.a();
    }

    public static gew x(klr klrVar, hew hewVar) {
        return klrVar.a() ? hewVar : new iew();
    }

    public static byx y(b bVar) {
        return new byx(Screen.CHOOSE_A, new c430(Mode.SHUTTLE, bVar, (un0) null));
    }

    public static synchronized void z() {
        synchronized (vvb1.class) {
            if (a == null) {
                a = new vvb1();
            }
        }
    }

    @Override // defpackage.q5s
    public String a() {
        return "sender_address";
    }

    @Override // defpackage.dbi0
    public void b() {
    }

    @Override // defpackage.k1t0
    public int c(int i, int i2, int i3, int i4) {
        return ((i / 2) - (i2 / 2)) - i3;
    }

    @Override // defpackage.dbi0
    public void d(yab yabVar) {
    }

    @Override // defpackage.iko
    public Object executeDelayed(long j, sls slsVar) {
        h60 h60Var = new h60(0, slsVar);
        i60.a.postDelayed(h60Var, j);
        return h60Var;
    }

    @Override // defpackage.rr9
    public float g() {
        return 5.0f;
    }

    @Override // defpackage.b190
    public /* bridge */ /* synthetic */ Integer getWidth() {
        return null;
    }

    @Override // defpackage.rr9
    public float h() {
        return 10.0f;
    }

    @Override // defpackage.b190
    public void i(lg lgVar) {
        z = lgVar;
    }

    @Override // defpackage.dbi0
    public boolean j() {
        return false;
    }

    @Override // defpackage.q5s
    public String k() {
        return "sender_info_filled";
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        ((rvj0) obj).close();
        return null;
    }

    @Override // defpackage.b190
    public lg m() {
        return z;
    }

    @Override // defpackage.fen
    /* renamed from: n */
    public int getLayoutRes() {
        return 0;
    }

    @Override // defpackage.rr9
    public float o() {
        return 46.0f;
    }

    @Override // defpackage.ecy0
    public void p(String str) {
    }

    @Override // defpackage.ecy0
    public List q() {
        return EmptyList.a;
    }

    @Override // defpackage.rr9
    public float r() {
        return 68.0f;
    }

    @Override // defpackage.iko
    public void removeDelayedExecution(Object obj) {
        Handler handler = i60.a;
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        i60.a.removeCallbacks((Runnable) obj);
    }

    @Override // defpackage.ecy0
    public Map t() {
        return kotlin.collections.b.f();
    }
}
