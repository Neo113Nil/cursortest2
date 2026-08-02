package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class van implements uxs {
    public static final van a;
    private static final SerialDescriptor descriptor;

    static {
        van vanVar = new van();
        a = vanVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.EarlyAuthorizationExperiment", vanVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("blocking_authorization", true);
        pluginGeneratedSerialDescriptor.j("auth_before_permissions", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("onboarding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xan.g;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, i3yVarArr[3].getValue(), qke.n(abn.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xan.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Map map = null;
        cbn cbnVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z3 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                z4 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                map = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                cbnVar = (cbn) b.s(serialDescriptor, 4, abn.a, cbnVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new xan(i, z2, z3, z4, map, cbnVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xan xanVar = (xan) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xan.g;
        if (b.F() || xanVar.b) {
            b.n(serialDescriptor, 0, xanVar.b);
        }
        if (b.F() || xanVar.c) {
            b.n(serialDescriptor, 1, xanVar.c);
        }
        if (b.F() || xanVar.d) {
            b.n(serialDescriptor, 2, xanVar.d);
        }
        if (b.F() || !jl40.l(xanVar.e, b.f())) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), xanVar.e);
        }
        if (b.F() || xanVar.f != null) {
            b.g(serialDescriptor, 4, abn.a, xanVar.f);
        }
        b.c(serialDescriptor);
    }
}
