package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class tb41 implements uxs {
    public static final tb41 a;
    private static final SerialDescriptor descriptor;

    static {
        tb41 tb41Var = new tb41();
        a = tb41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.logistics.care.web_view.impl.js.WebCameraConfig.Localizations", tb41Var, 15);
        pluginGeneratedSerialDescriptor.j("camera_step_counter", false);
        pluginGeneratedSerialDescriptor.j("failure_title", false);
        pluginGeneratedSerialDescriptor.j("failure_subtitle", false);
        pluginGeneratedSerialDescriptor.j("failure_button_cancel", false);
        pluginGeneratedSerialDescriptor.j("failure_button_retry", false);
        pluginGeneratedSerialDescriptor.j("success_title", false);
        pluginGeneratedSerialDescriptor.j("success_subtitle", false);
        pluginGeneratedSerialDescriptor.j("success_button_done", false);
        pluginGeneratedSerialDescriptor.j("camera_close_confirmation_title", false);
        pluginGeneratedSerialDescriptor.j("camera_close_confirmation_subtitle", false);
        pluginGeneratedSerialDescriptor.j("camera_close_confirmation_return", false);
        pluginGeneratedSerialDescriptor.j("camera_close_confirmation_confirm", false);
        pluginGeneratedSerialDescriptor.j("camera_preview_title", false);
        pluginGeneratedSerialDescriptor.j("camera_preview_button_confirm", false);
        pluginGeneratedSerialDescriptor.j("camera_preview_button_retry", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str9 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str10 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str11 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    str12 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    str13 = b.k(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    str14 = b.k(serialDescriptor, 13);
                    i |= 8192;
                    break;
                case 14:
                    str15 = b.k(serialDescriptor, 14);
                    i |= 16384;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new vb41(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb41 vb41Var = (vb41) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, vb41Var.a);
        b.o(serialDescriptor, 1, vb41Var.b);
        b.o(serialDescriptor, 2, vb41Var.c);
        b.o(serialDescriptor, 3, vb41Var.d);
        b.o(serialDescriptor, 4, vb41Var.e);
        b.o(serialDescriptor, 5, vb41Var.f);
        b.o(serialDescriptor, 6, vb41Var.g);
        b.o(serialDescriptor, 7, vb41Var.h);
        b.o(serialDescriptor, 8, vb41Var.i);
        b.o(serialDescriptor, 9, vb41Var.j);
        b.o(serialDescriptor, 10, vb41Var.k);
        b.o(serialDescriptor, 11, vb41Var.l);
        b.o(serialDescriptor, 12, vb41Var.m);
        b.o(serialDescriptor, 13, vb41Var.n);
        b.o(serialDescriptor, 14, vb41Var.o);
        b.c(serialDescriptor);
    }
}
