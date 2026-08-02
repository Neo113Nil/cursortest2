package defpackage;

import com.yandex.go.flex.common.api.actions.GeoPoint;
import com.yandex.go.flex.common.api.actions.GeoPoint$$serializer;
import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;
import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction$ShortcutInfo$$serializer;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class r210 implements uxs {
    public static final r210 a;
    private static final SerialDescriptor descriptor;

    static {
        r210 r210Var = new r210();
        a = r210Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MasstransitExpectedDestinationAction", r210Var, 4);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("shortcut_info", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(TaxiExpectedDestinationAction$ShortcutInfo$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{GeoPoint$$serializer.INSTANCE, auu0Var, auu0Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        GeoPoint geoPoint = null;
        String str = null;
        String str2 = null;
        TaxiExpectedDestinationAction.ShortcutInfo shortcutInfo = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                geoPoint = (GeoPoint) b.A(serialDescriptor, 0, GeoPoint$$serializer.INSTANCE, geoPoint);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                shortcutInfo = (TaxiExpectedDestinationAction.ShortcutInfo) b.s(serialDescriptor, 3, TaxiExpectedDestinationAction$ShortcutInfo$$serializer.INSTANCE, shortcutInfo);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new t210(i, geoPoint, str, str2, shortcutInfo);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t210 t210Var = (t210) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(t210Var.a, new GeoPoint(0))) {
            b.e(serialDescriptor, 0, GeoPoint$$serializer.INSTANCE, t210Var.a);
        }
        if (b.F() || !jl40.l(t210Var.b, "")) {
            b.o(serialDescriptor, 1, t210Var.b);
        }
        if (b.F() || !jl40.l(t210Var.c, "")) {
            b.o(serialDescriptor, 2, t210Var.c);
        }
        b.g(serialDescriptor, 3, TaxiExpectedDestinationAction$ShortcutInfo$$serializer.INSTANCE, t210Var.d);
        b.c(serialDescriptor);
    }
}
