package defpackage;

import android.os.Handler;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class rwe0 extends hd2 {
    public final vv90 b;
    public final Handler c;
    public final String w;
    public final t0p x;
    public final rwo y;
    public final dy40 z = new dy40();
    public final dy40 A = new dy40();
    public final ExecutorService B = Executors.newSingleThreadExecutor();
    public ArrayList C = new ArrayList();

    public rwe0(vv90 vv90Var, Handler handler, String str, t0p t0pVar, rwo rwoVar) {
        this.b = vv90Var;
        this.c = handler;
        this.w = str;
        this.x = t0pVar;
        this.y = rwoVar;
    }

    public final ArrayList W() {
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (paymentMethod instanceof PaymentMethod.Card) {
                if (((PaymentMethod.Card) paymentMethod).getFamilyInfo() == null) {
                    arrayList2.add(obj);
                }
            } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void X() {
        String str;
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.PRESELECT;
        sv90Var.getClass();
        iho w0 = sv90.w0(psdkScreen);
        y22 y22Var = (y22) this.y;
        y22Var.a(w0);
        Iterator it = this.C.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.w;
            if (!hasNext) {
                i = -1;
                break;
            }
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            if (!jl40.l(paymentMethod, PaymentMethod.NewCard.INSTANCE) && jl40.l(a8a0.c(paymentMethod), str)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : !jl40.l(a.P(this.C), PaymentMethod.NewCard.INSTANCE) ? 0 : null;
        PaymentMethod paymentMethod2 = valueOf != null ? (PaymentMethod) this.C.get(valueOf.intValue()) : null;
        if (str != null) {
            if (paymentMethod2 == null || !jl40.l(a8a0.c(paymentMethod2), str)) {
                qv90.a.getClass();
                y22Var.a(sv90.m(str));
            } else {
                qv90.a.getClass();
                y22Var.a(sv90.l(str));
            }
        }
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new vcq0((PaymentMethod) it2.next(), false, false, null, null));
        }
        c991.m(this.b, arrayList2, new y4a0(new mwe0(arrayList2, valueOf, !W().isEmpty()), this, z, 22));
    }

    public final void Y(PaymentMethod paymentMethod, boolean z) {
        ((y22) this.y).a(ox21.a(paymentMethod, z));
        if (!(paymentMethod instanceof PaymentMethod.NewCard)) {
            o3a0.e.a(paymentMethod);
        } else {
            this.A.l(new jwe0(z));
        }
    }

    public final void Z(mwe0 mwe0Var) {
        PaymentMethod paymentMethod;
        this.A.l(mwe0Var);
        Integer num = mwe0Var.b;
        if (num != null) {
            paymentMethod = (PaymentMethod) this.C.get(num.intValue());
        } else {
            paymentMethod = null;
        }
        if (paymentMethod instanceof PaymentMethod.NewCard) {
            return;
        }
        o3a0.e.a(paymentMethod);
    }

    public final void a0() {
        ArrayList W = W();
        ArrayList arrayList = new ArrayList(tcc.n(W, 10));
        Iterator it = W.iterator();
        while (it.hasNext()) {
            arrayList.add(new vcq0((PaymentMethod) it.next(), false, true, null, null));
        }
        if (!W.isEmpty()) {
            c991.m(this.b, arrayList, new oy80(27, this, arrayList));
        } else if (this.C.size() == 1) {
            Y((PaymentMethod) a.P(this.C), false);
        } else {
            X();
        }
    }
}
