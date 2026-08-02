package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.d610;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class z510 implements uxs {
    public static final z510 a;
    private static final SerialDescriptor descriptor;

    static {
        z510 z510Var = new z510();
        a = z510Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.paymentcards.experiment.MasstransitTransportCardsExperiment", z510Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("promo_state", true);
        pluginGeneratedSerialDescriptor.j("loading_state", true);
        pluginGeneratedSerialDescriptor.j("max_subtitle_length", true);
        pluginGeneratedSerialDescriptor.j("should_refresh_on_vertical_open", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = d610.h;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), b610.a, e610.a, h6w.a, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d610.h;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        Map map = null;
        d610.a aVar = null;
        d610.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    aVar = (d610.a) b.A(serialDescriptor, 2, b610.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    bVar = (d610.b) b.A(serialDescriptor, 3, e610.a, bVar);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new d610(i, z2, map, aVar, bVar, i2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.c610.a()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (defpackage.jl40.l(r0, new d610.b(0)) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        d610 d610Var = (d610) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d610.h;
        if (b.F() || d610Var.b) {
            b.n(serialDescriptor, 0, d610Var.b);
        }
        if (b.F() || !jl40.l(d610Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), d610Var.c);
        }
        if (!b.F()) {
            d610.a aVar = d610Var.d;
            d610.a.Companion.getClass();
        }
        b.e(serialDescriptor, 2, b610.a, d610Var.d);
        if (!b.F()) {
            d610.b bVar = d610Var.e;
            d610.b.Companion.getClass();
        }
        b.e(serialDescriptor, 3, e610.a, d610Var.e);
        if (b.F() || d610Var.f != 6) {
            b.A(4, d610Var.f, serialDescriptor);
        }
        if (b.F() || d610Var.g) {
            b.n(serialDescriptor, 5, d610Var.g);
        }
        b.c(serialDescriptor);
    }
}
