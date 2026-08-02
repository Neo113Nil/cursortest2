package ru.yandex.taxi.masstransit.tickets;

import com.yandex.go.masstransit.sdk.core.dto.PaymentMethodDto;
import defpackage.a2a0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b4a0;
import defpackage.bts;
import defpackage.c530;
import defpackage.d2a0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.kv90;
import defpackage.ljs0;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.t130;
import defpackage.tls;
import defpackage.wg30;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ydb1;
import defpackage.yte0;
import defpackage.z0a0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.tickets.c;

/* loaded from: classes6.dex */
public final class c {
    public final d2a0 a;
    public final z0a0 b;

    public c(d2a0 d2a0Var, z0a0 z0a0Var) {
        this.a = d2a0Var;
        this.b = z0a0Var;
    }

    public final void a(final f530 f530Var, final yte0 yte0Var, fid fidVar, final int i) {
        int i2;
        aii0 aii0Var;
        wls wlsVar;
        final m1a0 m1a0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(975105239);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(yte0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(this) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            yte0 yte0Var2 = yte0Var != null ? yte0Var : null;
            if (yte0Var2 == null || (m1a0Var = yte0Var2.a) == null) {
                aii0Var = btsVar.v();
                if (aii0Var != null) {
                    final int i3 = 0;
                    wlsVar = new wls(this) { // from class: n840
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            yte0 yte0Var3 = yte0Var;
                            f530 f530Var2 = f530Var;
                            c cVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    cVar.a(f530Var2, yte0Var3, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    cVar.a(f530Var2, yte0Var3, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    aii0Var.d = wlsVar;
                }
                return;
            }
            ydb1.a(f530Var, null, wwg.S(1393329384, true, new wg30(12, m1a0Var), btsVar), null, wwg.S(1861124642, true, new zls() { // from class: ru.yandex.taxi.masstransit.tickets.b
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        f530 o = an91.o(ljs0.n(c530.a, 60.0f, 56.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                        Object Q = btsVar2.Q();
                        o430 o430Var = did.a;
                        if (Q == o430Var) {
                            Q = MtTicketsPaymentRendererImpl$PaymentMethodRow$2$1$1.a;
                            btsVar2.o0(Q);
                        }
                        tls tlsVar = (tls) Q;
                        m1a0 m1a0Var2 = m1a0.this;
                        boolean e = btsVar2.e(m1a0Var2);
                        c cVar = this;
                        boolean k = e | btsVar2.k(cVar);
                        Object Q2 = btsVar2.Q();
                        if (k || Q2 == o430Var) {
                            Q2 = new t130(14, m1a0Var2, cVar);
                            btsVar2.o0(Q2);
                        }
                        androidx.compose.ui.viewinterop.b.a(tlsVar, o, (tls) Q2, btsVar2, 54, 0);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), null, null, true, btsVar, (i2 & 14) | 12607872, 106);
        } else {
            btsVar.Y();
        }
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            final int i4 = 1;
            wlsVar = new wls(this) { // from class: n840
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    yte0 yte0Var3 = yte0Var;
                    f530 f530Var2 = f530Var;
                    c cVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            cVar.a(f530Var2, yte0Var3, fidVar2, vng.O(i5 | 1));
                            break;
                        default:
                            cVar.a(f530Var2, yte0Var3, fidVar2, vng.O(i5 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            aii0Var.d = wlsVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PaymentMethodDto paymentMethodDto, ContinuationImpl continuationImpl) {
        MtTicketsPaymentRendererImpl$prepare$1 mtTicketsPaymentRendererImpl$prepare$1;
        int i;
        PaymentMethod$Type paymentMethod$Type;
        if (continuationImpl instanceof MtTicketsPaymentRendererImpl$prepare$1) {
            mtTicketsPaymentRendererImpl$prepare$1 = (MtTicketsPaymentRendererImpl$prepare$1) continuationImpl;
            int i2 = mtTicketsPaymentRendererImpl$prepare$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsPaymentRendererImpl$prepare$1.label = i2 - Integer.MIN_VALUE;
                MtTicketsPaymentRendererImpl$prepare$1 mtTicketsPaymentRendererImpl$prepare$12 = mtTicketsPaymentRendererImpl$prepare$1;
                Object obj = mtTicketsPaymentRendererImpl$prepare$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsPaymentRendererImpl$prepare$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kv90 kv90Var = lv90.Companion;
                    String str = paymentMethodDto.a;
                    if (str != null) {
                        PaymentMethod$Type.Companion.getClass();
                        paymentMethod$Type = b4a0.a(str);
                    }
                    paymentMethod$Type = PaymentMethod$Type.CARD;
                    String str2 = paymentMethodDto.b;
                    kv90Var.getClass();
                    lv90 b = kv90.b(str2, paymentMethod$Type);
                    mtTicketsPaymentRendererImpl$prepare$12.L$0 = paymentMethodDto;
                    mtTicketsPaymentRendererImpl$prepare$12.label = 1;
                    obj = a2a0.a(this.a, b, null, null, mtTicketsPaymentRendererImpl$prepare$12, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new yte0((m1a0) obj);
            }
        }
        mtTicketsPaymentRendererImpl$prepare$1 = new MtTicketsPaymentRendererImpl$prepare$1(this, continuationImpl);
        MtTicketsPaymentRendererImpl$prepare$1 mtTicketsPaymentRendererImpl$prepare$122 = mtTicketsPaymentRendererImpl$prepare$1;
        Object obj2 = mtTicketsPaymentRendererImpl$prepare$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsPaymentRendererImpl$prepare$122.label;
        if (i != 0) {
        }
        return new yte0((m1a0) obj2);
    }
}
