package ru.yandex.taxi.layers.experiments;

import com.yandex.go.layers.api.model.params.Mode;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class n implements uxs {
    public static final n a;
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment.ZoomModeByMode", nVar, 4);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("zoom_mode", true);
        pluginGeneratedSerialDescriptor.j("onboarding_zoom_policy", true);
        pluginGeneratedSerialDescriptor.j("zoom_duration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScreenModeMapProvidersExperiment.d.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), g.a, qke.n(pnz.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScreenModeMapProvidersExperiment.d.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        Mode mode = null;
        ScreenModeMapProvidersExperiment.ZoomMode zoomMode = null;
        ScreenModeMapProvidersExperiment.a aVar = null;
        Long l = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                mode = (Mode) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), mode);
                i |= 1;
            } else if (v == 1) {
                zoomMode = (ScreenModeMapProvidersExperiment.ZoomMode) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), zoomMode);
                i |= 2;
            } else if (v == 2) {
                aVar = (ScreenModeMapProvidersExperiment.a) b.A(serialDescriptor, 2, g.a, aVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                l = (Long) b.s(serialDescriptor, 3, pnz.a, l);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScreenModeMapProvidersExperiment.d(i, mode, zoomMode, aVar, l);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScreenModeMapProvidersExperiment.d dVar = (ScreenModeMapProvidersExperiment.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScreenModeMapProvidersExperiment.d.e;
        if (b.F() || dVar.a != Mode.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), dVar.a);
        }
        if (b.F() || dVar.b != ScreenModeMapProvidersExperiment.ZoomMode.ZOOM_IF_NO_OBJECTS) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dVar.b);
        }
        if (b.F() || !jl40.l(dVar.c, new ScreenModeMapProvidersExperiment.a(0))) {
            b.e(serialDescriptor, 2, g.a, dVar.c);
        }
        if (b.F() || dVar.d != null) {
            b.g(serialDescriptor, 3, pnz.a, dVar.d);
        }
        b.c(serialDescriptor);
    }
}
