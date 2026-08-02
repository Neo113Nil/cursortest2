package ru.yandex.taxi.preorder.repositories;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.dqe0;
import defpackage.e4a0;
import defpackage.ffx;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.pex0;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.yu1;
import defpackage.zy11;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes9.dex */
public final class g {
    public final dqe0 a;
    public final wiq0 b;
    public final n0 c;

    public g(dqe0 dqe0Var, wiq0 wiq0Var) {
        this.a = dqe0Var;
        this.b = wiq0Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.c = ffx.b(0, 1, bufferOverflow);
        ffx.b(0, 1, bufferOverflow);
    }

    public final lv90 a() {
        return this.a.a.e();
    }

    public final e4a0 b() {
        boolean c = c();
        dqe0 dqe0Var = this.a;
        if (!c) {
            return dqe0Var.a.h();
        }
        Preorder preorder = dqe0Var.a;
        preorder.getClass();
        kv90 kv90Var = lv90.Companion;
        lv90 lv90Var = preorder.w;
        kv90Var.getClass();
        PaymentMethod$Type paymentMethod$Type = lv90Var != null ? lv90Var.a : null;
        return paymentMethod$Type != null ? paymentMethod$Type : e4a0.R3;
    }

    public final boolean c() {
        pex0 m = ((k) this.b).m();
        return m != null && (m.O instanceof yu1);
    }

    public final tpr d() {
        return kotlinx.coroutines.flow.e.t(new n(new d(((k) this.b).j.b()), new PreorderPaymentRepository$useOverridePaymentForAlternativeFlow$2(this, null)));
    }

    public final b e() {
        return new b(new n(this.c, new PreorderPaymentRepository$paymentMethodFlow$1()), this);
    }

    public final void f(lv90 lv90Var) {
        this.a.a.j(lv90Var);
        this.c.g(zy11.a);
    }

    public final void g(lv90 lv90Var, boolean z) {
        this.a.a.w = lv90Var;
        this.a.a.a0 = z;
        this.c.g(zy11.a);
    }
}
