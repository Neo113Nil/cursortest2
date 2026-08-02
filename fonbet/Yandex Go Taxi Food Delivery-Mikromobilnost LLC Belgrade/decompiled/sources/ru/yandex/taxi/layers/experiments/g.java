package ru.yandex.taxi.layers.experiments;

import com.yandex.go.dto.response.Action$Payload;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
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
public final /* synthetic */ class g implements uxs {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment.OnboardingZoomPolicy", gVar, 2);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("object_types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScreenModeMapProvidersExperiment.a.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScreenModeMapProvidersExperiment.a.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Action$Payload.Mode mode = null;
        jsq0 jsq0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                mode = (Action$Payload.Mode) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), mode);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ScreenModeMapProvidersExperiment.a(i, mode, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScreenModeMapProvidersExperiment.a aVar = (ScreenModeMapProvidersExperiment.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScreenModeMapProvidersExperiment.a.c;
        if (b.F() || aVar.a != Action$Payload.Mode.ALL_OBJECT_TYPES) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        b.c(serialDescriptor);
    }
}
