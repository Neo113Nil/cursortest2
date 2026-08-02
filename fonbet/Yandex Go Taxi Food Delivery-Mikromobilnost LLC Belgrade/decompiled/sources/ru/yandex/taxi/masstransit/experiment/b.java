package ru.yandex.taxi.masstransit.experiment;

import defpackage.i3y;
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
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment", bVar, 1);
        pluginGeneratedSerialDescriptor.j("redirect_vertical", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MtMainRedirectExperiment.c[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtMainRedirectExperiment.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        MtMainRedirectExperiment.RedirectVertical redirectVertical = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                redirectVertical = (MtMainRedirectExperiment.RedirectVertical) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), redirectVertical);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new MtMainRedirectExperiment(i, redirectVertical);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtMainRedirectExperiment mtMainRedirectExperiment = (MtMainRedirectExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtMainRedirectExperiment.c;
        if (b.F() || mtMainRedirectExperiment.b != MtMainRedirectExperiment.RedirectVertical.TRANSPORT) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), mtMainRedirectExperiment.b);
        }
        b.c(serialDescriptor);
    }
}
