package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a1t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class w0t implements uxs {
    public static final w0t a;
    private static final SerialDescriptor descriptor;

    static {
        w0t w0tVar = new w0t();
        a = w0tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.object.GeoSharingConfig", w0tVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("track_in_background", true);
        pluginGeneratedSerialDescriptor.j("clientgeo_disable_distance", true);
        pluginGeneratedSerialDescriptor.j("tracking_rate_battery_state", true);
        pluginGeneratedSerialDescriptor.j("request", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(e6m.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, n, y0t.a, b1t.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Double d = null;
        a1t.a aVar = null;
        a1t.b bVar = null;
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
                d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                i |= 4;
            } else if (v == 3) {
                aVar = (a1t.a) b.A(serialDescriptor, 3, y0t.a, aVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bVar = (a1t.b) b.A(serialDescriptor, 4, b1t.a, bVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        a1t a1tVar = new a1t();
        if ((i & 1) == 0) {
            a1tVar.a = false;
        } else {
            a1tVar.a = z2;
        }
        if ((i & 2) == 0) {
            a1tVar.b = false;
        } else {
            a1tVar.b = z3;
        }
        if ((i & 4) == 0) {
            a1tVar.c = null;
        } else {
            a1tVar.c = d;
        }
        if ((i & 8) == 0) {
            a1t.a.Companion.getClass();
            a1tVar.d = a1t.a.d;
        } else {
            a1tVar.d = aVar;
        }
        if ((i & 16) != 0) {
            a1tVar.e = bVar;
            return a1tVar;
        }
        a1t.b.Companion.getClass();
        a1tVar.e = a1t.b.d;
        return a1tVar;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (defpackage.jl40.l(r0, a1t.a.d) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (defpackage.jl40.l(r0, a1t.b.d) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        a1t a1tVar = (a1t) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        x0t x0tVar = a1t.Companion;
        if (b.F() || a1tVar.a) {
            b.n(serialDescriptor, 0, a1tVar.a);
        }
        if (b.F() || a1tVar.b) {
            b.n(serialDescriptor, 1, a1tVar.b);
        }
        if (b.F() || a1tVar.c != null) {
            b.g(serialDescriptor, 2, e6m.a, a1tVar.c);
        }
        if (!b.F()) {
            a1t.a aVar = a1tVar.d;
            a1t.a.Companion.getClass();
        }
        b.e(serialDescriptor, 3, y0t.a, a1tVar.d);
        if (!b.F()) {
            a1t.b bVar = a1tVar.e;
            a1t.b.Companion.getClass();
        }
        b.e(serialDescriptor, 4, b1t.a, a1tVar.e);
        b.c(serialDescriptor);
    }
}
