package defpackage;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes9.dex */
public final /* synthetic */ class tvx implements uxs {
    public static final tvx a;
    private static final SerialDescriptor descriptor;

    static {
        tvx tvxVar = new tvx();
        a = tvxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.dto.LaunchParam.Accepted", tvxVar, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("accepted_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = vvx.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = vvx.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        TrackableAcceptanceActionParam.Status status = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                status = (TrackableAcceptanceActionParam.Status) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), status);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new vvx(i, status, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        vvx.b((vvx) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
