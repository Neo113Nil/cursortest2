package defpackage;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class z8p implements uxs {
    public static final z8p a;
    private static final SerialDescriptor descriptor;

    static {
        z8p z8pVar = new z8p();
        a = z8pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.failure_notificator.FailureNotificatorExperiment", z8pVar, 12);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("defaultHeader", true);
        pluginGeneratedSerialDescriptor.j("defaultDescription", true);
        pluginGeneratedSerialDescriptor.j("noInternetHeader", true);
        pluginGeneratedSerialDescriptor.j("noInternetDescription", true);
        pluginGeneratedSerialDescriptor.j("notificatorTimeMs", true);
        pluginGeneratedSerialDescriptor.j("notificatorInternetTimeMs", true);
        pluginGeneratedSerialDescriptor.j("notificatorLingeringTimeMs", true);
        pluginGeneratedSerialDescriptor.j("notificatorShowAnywayMs", true);
        pluginGeneratedSerialDescriptor.j("skipRetries", true);
        pluginGeneratedSerialDescriptor.j("shouldShowServerError", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b9p.n;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{z96Var, auu0Var, auu0Var, auu0Var, auu0Var, pnzVar, pnzVar, pnzVar, pnzVar, h6w.a, z96Var, i3yVarArr[11].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b9p.n;
        b.getClass();
        Object obj = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        boolean z3 = true;
        Map map = null;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j = b.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j3 = b.f(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    j4 = b.f(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i2 = b.h(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    z2 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    map = (Map) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), map);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new b9p(i, z, str, str2, str3, str4, j, j2, j3, j4, i2, z2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b9p b9pVar = (b9p) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b9p.n;
        if (b.F() || b9pVar.b) {
            b.n(serialDescriptor, 0, b9pVar.b);
        }
        if (b.F() || !jl40.l(b9pVar.c, "")) {
            b.o(serialDescriptor, 1, b9pVar.c);
        }
        if (b.F() || !jl40.l(b9pVar.d, "")) {
            b.o(serialDescriptor, 2, b9pVar.d);
        }
        if (b.F() || !jl40.l(b9pVar.e, "")) {
            b.o(serialDescriptor, 3, b9pVar.e);
        }
        if (b.F() || !jl40.l(b9pVar.f, "")) {
            b.o(serialDescriptor, 4, b9pVar.f);
        }
        if (b.F() || b9pVar.g != 7000) {
            b.s(serialDescriptor, 5, b9pVar.g);
        }
        if (b.F() || b9pVar.h != MapiClientImpl.RETRIES_TIME_MILLIS) {
            b.s(serialDescriptor, 6, b9pVar.h);
        }
        if (b.F() || b9pVar.i != 2000) {
            b.s(serialDescriptor, 7, b9pVar.i);
        }
        if (b.F() || b9pVar.j != DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
            b.s(serialDescriptor, 8, b9pVar.j);
        }
        if (b.F() || b9pVar.k != 0) {
            b.A(9, b9pVar.k, serialDescriptor);
        }
        if (b.F() || !b9pVar.l) {
            b.n(serialDescriptor, 10, b9pVar.l);
        }
        if (b.F() || !jl40.l(b9pVar.m, b.f())) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), b9pVar.m);
        }
        b.c(serialDescriptor);
    }
}
