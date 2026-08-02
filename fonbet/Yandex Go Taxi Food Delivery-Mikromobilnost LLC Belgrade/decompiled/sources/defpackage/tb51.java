package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class tb51 implements uxs {
    public static final tb51 a;
    private static final SerialDescriptor descriptor;

    static {
        tb51 tb51Var = new tb51();
        a = tb51Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.transport.nfc.WriteCardKey", tb51Var, 10);
        pluginGeneratedSerialDescriptor.j("block", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        pluginGeneratedSerialDescriptor.j("read_key_id", false);
        pluginGeneratedSerialDescriptor.j("read_key_version", false);
        pluginGeneratedSerialDescriptor.j("read_key_value", false);
        pluginGeneratedSerialDescriptor.j("read_key_type", false);
        pluginGeneratedSerialDescriptor.j("write_key_type", false);
        pluginGeneratedSerialDescriptor.j("write_key_id", false);
        pluginGeneratedSerialDescriptor.j("write_key_version", false);
        pluginGeneratedSerialDescriptor.j("write_key_value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{h6wVar, auu0Var, h6wVar, h6wVar, auu0Var, auu0Var, auu0Var, h6wVar, h6wVar, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i4 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i5 = b.h(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i6 = b.h(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str5 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new xb51(i, i2, str, i3, i4, str2, str3, str4, i5, i6, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xb51 xb51Var = (xb51) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.A(0, xb51Var.a, serialDescriptor);
        b.o(serialDescriptor, 1, xb51Var.b);
        b.A(2, xb51Var.c, serialDescriptor);
        b.A(3, xb51Var.d, serialDescriptor);
        b.o(serialDescriptor, 4, xb51Var.e);
        b.o(serialDescriptor, 5, xb51Var.f);
        b.o(serialDescriptor, 6, xb51Var.g);
        b.A(7, xb51Var.h, serialDescriptor);
        b.A(8, xb51Var.i, serialDescriptor);
        b.o(serialDescriptor, 9, xb51Var.j);
        b.c(serialDescriptor);
    }
}
