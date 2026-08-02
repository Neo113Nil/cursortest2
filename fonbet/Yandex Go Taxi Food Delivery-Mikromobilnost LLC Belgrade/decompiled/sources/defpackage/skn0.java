package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.a;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.experiments.h;

/* loaded from: classes10.dex */
public final /* synthetic */ class skn0 implements uxs {
    public static final skn0 a;
    private static final SerialDescriptor descriptor;

    static {
        skn0 skn0Var = new skn0();
        a = skn0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersExperiment", skn0Var, 11);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("qr", true);
        pluginGeneratedSerialDescriptor.j("support_url", true);
        pluginGeneratedSerialDescriptor.j("logotype_image_tag", true);
        pluginGeneratedSerialDescriptor.j("damage_photo_limit", true);
        pluginGeneratedSerialDescriptor.j("navigation", true);
        pluginGeneratedSerialDescriptor.j("finish_card", true);
        pluginGeneratedSerialDescriptor.j("beginner_config", true);
        pluginGeneratedSerialDescriptor.j("jet", true);
        pluginGeneratedSerialDescriptor.j("scooters_card_v2", true);
        pluginGeneratedSerialDescriptor.j("deposit_hold_polling_config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(t5g0.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, n, qke.n(auu0Var), auu0Var, qke.n(h6w.a), qke.n(y550.a), qke.n(a.a), qke.n(dk5.a), c8x.a, h.a, qke.n(gxi.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ixi ixiVar = null;
        ScootersCardV2 scootersCardV2 = null;
        boolean z2 = true;
        e8x e8xVar = null;
        int i = 0;
        boolean z3 = false;
        v5g0 v5g0Var = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        a650 a650Var = null;
        FinishCard finishCard = null;
        fk5 fk5Var = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    z3 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    v5g0Var = (v5g0) b.s(serialDescriptor, 1, t5g0.a, v5g0Var);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    a650Var = (a650) b.s(serialDescriptor, 5, y550.a, a650Var);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    finishCard = (FinishCard) b.s(serialDescriptor, 6, a.a, finishCard);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    fk5Var = (fk5) b.s(serialDescriptor, 7, dk5.a, fk5Var);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    e8xVar = (e8x) b.A(serialDescriptor, 8, c8x.a, e8xVar);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    scootersCardV2 = (ScootersCardV2) b.A(serialDescriptor, 9, h.a, scootersCardV2);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    ixiVar = (ixi) b.s(serialDescriptor, 10, gxi.a, ixiVar);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new g0(i, z3, v5g0Var, str, str2, num, a650Var, finishCard, fk5Var, e8xVar, scootersCardV2, ixiVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g0 g0Var = (g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        tkn0 tkn0Var = g0.Companion;
        if (b.F() || g0Var.b) {
            b.n(serialDescriptor, 0, g0Var.b);
        }
        if (b.F() || g0Var.c != null) {
            b.g(serialDescriptor, 1, t5g0.a, g0Var.c);
        }
        if (b.F() || g0Var.d != null) {
            b.g(serialDescriptor, 2, auu0.a, g0Var.d);
        }
        if (b.F() || !jl40.l(g0Var.e, "")) {
            b.o(serialDescriptor, 3, g0Var.e);
        }
        if (b.F() || g0Var.f != null) {
            b.g(serialDescriptor, 4, h6w.a, g0Var.f);
        }
        if (b.F() || g0Var.g != null) {
            b.g(serialDescriptor, 5, y550.a, g0Var.g);
        }
        if (b.F() || g0Var.h != null) {
            b.g(serialDescriptor, 6, a.a, g0Var.h);
        }
        if (b.F() || g0Var.i != null) {
            b.g(serialDescriptor, 7, dk5.a, g0Var.i);
        }
        if (b.F() || !jl40.l(g0Var.j, new e8x(0))) {
            b.e(serialDescriptor, 8, c8x.a, g0Var.j);
        }
        if (b.F() || !jl40.l(g0Var.k, new ScootersCardV2(0))) {
            b.e(serialDescriptor, 9, h.a, g0Var.k);
        }
        if (b.F() || g0Var.l != null) {
            b.g(serialDescriptor, 10, gxi.a, g0Var.l);
        }
        b.c(serialDescriptor);
    }
}
