package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class rqg extends i9 {
    public static final rqg a = new rqg();
    public static final i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(7));

    @Override // defpackage.i9
    public final myi a(sjd sjdVar, String str) {
        return ((ssp0) b.getValue()).a(sjdVar, str);
    }

    @Override // defpackage.i9
    public final KSerializer b(Encoder encoder, Object obj) {
        return ((ssp0) b.getValue()).b(encoder, (trg) obj);
    }

    @Override // defpackage.i9
    public final lfx c() {
        return qoi0.a(trg.class);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return ((ssp0) b.getValue()).getDescriptor();
    }
}
