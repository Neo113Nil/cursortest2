package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class xft implements uxs {
    public static final xft a;
    private static final SerialDescriptor descriptor;

    static {
        xft xftVar = new xft();
        a = xftVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.viewcoordinates.GetViewCoordinatesBduiAction", xftVar, 5);
        pluginGeneratedSerialDescriptor.j("view_id", false);
        pluginGeneratedSerialDescriptor.j("height_variable", true);
        pluginGeneratedSerialDescriptor.j("width_variable", true);
        pluginGeneratedSerialDescriptor.j("x_variable", true);
        pluginGeneratedSerialDescriptor.j("y_variable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new zft(str, str2, str3, str4, i, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zft zftVar = (zft) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = zftVar.a;
        String str2 = zftVar.e;
        String str3 = zftVar.d;
        String str4 = zftVar.c;
        String str5 = zftVar.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 1, auu0.a, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 2, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 3, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
