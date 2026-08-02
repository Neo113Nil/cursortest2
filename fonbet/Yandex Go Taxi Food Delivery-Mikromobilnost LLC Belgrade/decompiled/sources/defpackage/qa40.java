package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class qa40 implements uxs {
    public static final qa40 a;
    private static final SerialDescriptor descriptor;

    static {
        qa40 qa40Var = new qa40();
        a = qa40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutInfoResponse", qa40Var, 5);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("order_info", true);
        pluginGeneratedSerialDescriptor.j("screen_data", true);
        pluginGeneratedSerialDescriptor.j("analytics_info", true);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_TOKEN, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{la40.e, bb40.a, sb40.a, ba40.a, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ka40 ka40Var = null;
        db40 db40Var = null;
        vb40 vb40Var = null;
        da40 da40Var = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                ka40Var = (ka40) b.A(serialDescriptor, 0, la40.e, ka40Var);
                i |= 1;
            } else if (v == 1) {
                db40Var = (db40) b.A(serialDescriptor, 1, bb40.a, db40Var);
                i |= 2;
            } else if (v == 2) {
                vb40Var = (vb40) b.A(serialDescriptor, 2, sb40.a, vb40Var);
                i |= 4;
            } else if (v == 3) {
                da40Var = (da40) b.A(serialDescriptor, 3, ba40.a, da40Var);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new sa40(i, ka40Var, db40Var, vb40Var, da40Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sa40 sa40Var = (sa40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ra40 ra40Var = sa40.Companion;
        if (b.F() || !jl40.l(sa40Var.a, ma40.INSTANCE)) {
            b.e(serialDescriptor, 0, la40.e, sa40Var.a);
        }
        if (b.F() || !jl40.l(sa40Var.b, new db40(0))) {
            b.e(serialDescriptor, 1, bb40.a, sa40Var.b);
        }
        if (b.F() || !jl40.l(sa40Var.c, new vb40(0))) {
            b.e(serialDescriptor, 2, sb40.a, sa40Var.c);
        }
        if (b.F() || !jl40.l(sa40Var.d, new da40(0))) {
            b.e(serialDescriptor, 3, ba40.a, sa40Var.d);
        }
        if (b.F() || !jl40.l(sa40Var.e, "")) {
            b.o(serialDescriptor, 4, sa40Var.e);
        }
        b.c(serialDescriptor);
    }
}
