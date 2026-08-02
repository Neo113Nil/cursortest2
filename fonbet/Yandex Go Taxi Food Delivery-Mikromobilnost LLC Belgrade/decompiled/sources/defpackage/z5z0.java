package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class z5z0 implements KSerializer {
    public static final z5z0 a = new z5z0();
    public static final i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(10));

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        sjd b2 = decoder.b(descriptor);
        b2.getClass();
        long j = 0;
        boolean z = false;
        while (true) {
            z5z0 z5z0Var = a;
            int v = b2.v(z5z0Var.getDescriptor());
            if (v == -1) {
                b2.c(descriptor);
                if (z) {
                    return new zrg(j);
                }
                throw new MissingFieldException("nanoseconds", getDescriptor().h());
            }
            if (v != 0) {
                dr31.c(v);
                throw null;
            }
            j = b2.f(z5z0Var.getDescriptor(), 0);
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
        b2.s(a.getDescriptor(), 0, ((zrg) obj).b);
        b2.c(descriptor);
    }
}
