package defpackage;

import java.util.Locale;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes14.dex */
public final class wfk0 implements KSerializer {
    public static final wfk0 a = new wfk0();
    public static final o2f0 b = d6z.a("RideCardDataSourceType", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String lowerCase = decoder.p().toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -934610874) {
            if (hashCode != -599445191) {
                if (hashCode == 644280914 && lowerCase.equals("defaults")) {
                    return sfk0.a;
                }
            } else if (lowerCase.equals("complete")) {
                return rfk0.a;
            }
        } else if (lowerCase.equals("remote")) {
            return ufk0.a;
        }
        yci0.m("Unknown RideCardDataSourceType");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str;
        vfk0 vfk0Var = (vfk0) obj;
        vfk0Var.getClass();
        if (vfk0Var instanceof sfk0) {
            str = "defaults";
        } else if (vfk0Var instanceof rfk0) {
            str = "complete";
        } else {
            if (!(vfk0Var instanceof ufk0)) {
                w511.b();
                return;
            }
            str = "remote";
        }
        encoder.t(str);
    }
}
