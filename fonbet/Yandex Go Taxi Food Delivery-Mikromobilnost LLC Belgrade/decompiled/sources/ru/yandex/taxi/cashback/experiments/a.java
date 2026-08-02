package ru.yandex.taxi.cashback.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment", aVar, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("plaque_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, PlusSdkWidgetExperiment.d[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlusSdkWidgetExperiment.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        PlusSdkWidgetExperiment.PlaqueType plaqueType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                plaqueType = (PlusSdkWidgetExperiment.PlaqueType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), plaqueType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new PlusSdkWidgetExperiment(i, z2, plaqueType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PlusSdkWidgetExperiment plusSdkWidgetExperiment = (PlusSdkWidgetExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PlusSdkWidgetExperiment.d;
        if (b.F() || !plusSdkWidgetExperiment.b) {
            b.n(serialDescriptor, 0, plusSdkWidgetExperiment.b);
        }
        if (b.F() || plusSdkWidgetExperiment.c != PlusSdkWidgetExperiment.PlaqueType.UNIVERSAL_PLAQUE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), plusSdkWidgetExperiment.c);
        }
        b.c(serialDescriptor);
    }
}
