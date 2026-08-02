package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrtq;", "Ltsa0;", "Companion", "ptq", "qtq", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class rtq implements tsa0 {
    public static final qtq Companion = new qtq();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(3))};
    public final String a;
    public final TaxiOrderFeedbackFlow b;

    public /* synthetic */ rtq(int i, String str, TaxiOrderFeedbackFlow taxiOrderFeedbackFlow) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = TaxiOrderFeedbackFlow.FORCE_SCREEN;
        } else {
            this.b = taxiOrderFeedbackFlow;
        }
    }

    public static final void d(rtq rtqVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(rtqVar.a, "")) {
            yjdVar.o(serialDescriptor, 0, rtqVar.a);
        }
        if (!yjdVar.F() && rtqVar.b == TaxiOrderFeedbackFlow.FORCE_SCREEN) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), rtqVar.b);
    }

    @Override // defpackage.tsa0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final TaxiOrderFeedbackFlow getB() {
        return this.b;
    }

    public rtq() {
        TaxiOrderFeedbackFlow taxiOrderFeedbackFlow = TaxiOrderFeedbackFlow.FORCE_SCREEN;
        this.a = "";
        this.b = taxiOrderFeedbackFlow;
    }
}
