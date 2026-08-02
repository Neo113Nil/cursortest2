package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class t630 implements KSerializer {
    public static final t630 a = new t630();
    public static final i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new z530(1));

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        sjd b2 = decoder.b(descriptor);
        b2.getClass();
        boolean z = false;
        int i = 0;
        while (true) {
            t630 t630Var = a;
            int v = b2.v(t630Var.getDescriptor());
            if (v == -1) {
                b2.c(descriptor);
                if (z) {
                    return new xrg(i);
                }
                throw new MissingFieldException("months", getDescriptor().h());
            }
            if (v != 0) {
                dr31.c(v);
                throw null;
            }
            i = b2.h(t630Var.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor descriptor = getDescriptor();
        yjd b2 = encoder.b(descriptor);
        b2.A(0, ((xrg) obj).b, a.getDescriptor());
        b2.c(descriptor);
    }
}
