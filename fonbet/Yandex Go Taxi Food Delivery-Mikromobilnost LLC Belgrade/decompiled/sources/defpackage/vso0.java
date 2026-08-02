package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.zso0;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class vso0 implements uxs {
    public static final vso0 a;
    private static final SerialDescriptor descriptor;

    static {
        vso0 vso0Var = new vso0();
        a = vso0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersRidingTogetherCommunicationExperiment", vso0Var, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("riding_info_view", true);
        pluginGeneratedSerialDescriptor.j("finish_info_view", true);
        pluginGeneratedSerialDescriptor.j("recheck_delay_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zso0.g;
        xso0 xso0Var = xso0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), qke.n(xso0Var), qke.n(xso0Var), qke.n(pnz.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zso0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        zso0.a aVar = null;
        zso0.a aVar2 = null;
        Long l = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                aVar = (zso0.a) b.s(serialDescriptor, 2, xso0.a, aVar);
                i |= 4;
            } else if (v == 3) {
                aVar2 = (zso0.a) b.s(serialDescriptor, 3, xso0.a, aVar2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                l = (Long) b.s(serialDescriptor, 4, pnz.a, l);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new zso0(i, z2, map, aVar, aVar2, l);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zso0 zso0Var = (zso0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zso0.g;
        if (b.F() || zso0Var.b) {
            b.n(serialDescriptor, 0, zso0Var.b);
        }
        if (b.F() || !jl40.l(zso0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), zso0Var.c);
        }
        if (b.F() || zso0Var.d != null) {
            b.g(serialDescriptor, 2, xso0.a, zso0Var.d);
        }
        if (b.F() || zso0Var.e != null) {
            b.g(serialDescriptor, 3, xso0.a, zso0Var.e);
        }
        if (b.F() || zso0Var.f != null) {
            b.g(serialDescriptor, 4, pnz.a, zso0Var.f);
        }
        b.c(serialDescriptor);
    }
}
