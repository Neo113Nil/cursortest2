package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final /* synthetic */ class lk6 extends ezc implements uyc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        long j;
        switch (this.a) {
            case 0:
                lfm lfmVar = (lfm) obj;
                long j2 = ((enj) obj2).a;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j3 = ((enj) obj4).a;
                float floatValue = ((Number) obj5).floatValue();
                ((Number) obj6).floatValue();
                lfmVar.getClass();
                g6d g6dVar = (g6d) this.receiver;
                g6dVar.getClass();
                rxv rxvVar = g6dVar.a;
                long j4 = g6dVar.c;
                x6k x6kVar = rxvVar.J;
                t6k t6kVar = rxvVar.h;
                lfmVar.getClass();
                if (!((Boolean) rxvVar.B.getValue()).booleanValue()) {
                    float e = t6kVar.e() * floatValue;
                    float f = rxvVar.a;
                    if (e < f) {
                        lfmVar.getClass();
                        float e2 = rxvVar.h.e() * floatValue;
                        rxvVar.n(swf.i(enj.e(j2) / e2, enj.f(j2) / e2), lfmVar);
                        if (booleanValue && e2 >= rxvVar.a) {
                            rxvVar.m(e2);
                        }
                    } else {
                        if (booleanValue) {
                            if (f > e || e > 2.2f) {
                                j = j2;
                            } else {
                                j = j2;
                                rxvVar.n(enj.i(floatValue - 1, enj.g(j4, j3)), lfmVar);
                                rxvVar.m(e);
                            }
                            x6kVar.setValue(new enj(j3));
                            rxvVar.w.setValue(Boolean.valueOf(e >= 1.0f));
                            rxvVar.o(e >= 1.0f);
                            rxvVar.z.setValue(Boolean.valueOf(e >= 1.0f));
                        } else {
                            j = j2;
                        }
                        rxvVar.n(enj.b(t6kVar.e(), j), lfmVar);
                        if (rxvVar.I && !booleanValue) {
                            rxvVar.F.a(new wpe(rxvVar.f(j4, ((enj) x6kVar.getValue()).a)));
                        }
                        rxvVar.I = booleanValue;
                    }
                }
                return Unit.a;
            default:
                return h0.a((h0) this.receiver, ((Boolean) obj).booleanValue(), (w) obj2, (String) obj3, (PlusPayCompositeOfferDetails) obj4, (PlusPayMailingAdsAgreement) obj5, (Continuation) obj6);
        }
    }
}
