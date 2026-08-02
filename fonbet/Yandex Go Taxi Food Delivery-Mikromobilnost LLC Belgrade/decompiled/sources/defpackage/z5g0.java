package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes12.dex */
public final /* synthetic */ class z5g0 implements uxs {
    public static final z5g0 a;
    private static final SerialDescriptor descriptor;

    static {
        z5g0 z5g0Var = new z5g0();
        a = z5g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.qrcode.QrCodeCutout", z5g0Var, 5);
        pluginGeneratedSerialDescriptor.j("height", false);
        pluginGeneratedSerialDescriptor.j("width", false);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.X, false);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.Y, false);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.CORNER_RADIUS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        udx udxVar = udx.a;
        return new KSerializer[]{udxVar, udxVar, udxVar, udxVar, udxVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        d dVar = null;
        d dVar2 = null;
        d dVar3 = null;
        d dVar4 = null;
        d dVar5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dVar = (d) b.A(serialDescriptor, 0, udx.a, dVar);
                i |= 1;
            } else if (v == 1) {
                dVar2 = (d) b.A(serialDescriptor, 1, udx.a, dVar2);
                i |= 2;
            } else if (v == 2) {
                dVar3 = (d) b.A(serialDescriptor, 2, udx.a, dVar3);
                i |= 4;
            } else if (v == 3) {
                dVar4 = (d) b.A(serialDescriptor, 3, udx.a, dVar4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                dVar5 = (d) b.A(serialDescriptor, 4, udx.a, dVar5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new b6g0(i, dVar, dVar2, dVar3, dVar4, dVar5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b6g0 b6g0Var = (b6g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        udx udxVar = udx.a;
        d dVar = b6g0Var.a;
        d dVar2 = b6g0Var.e;
        b.e(serialDescriptor, 0, udxVar, dVar);
        b.e(serialDescriptor, 1, udxVar, b6g0Var.b);
        b.e(serialDescriptor, 2, udxVar, b6g0Var.c);
        b.e(serialDescriptor, 3, udxVar, b6g0Var.d);
        if (b.F() || !jl40.l(dVar2, qcx.b(0))) {
            b.e(serialDescriptor, 4, udxVar, dVar2);
        }
        b.c(serialDescriptor);
    }
}
