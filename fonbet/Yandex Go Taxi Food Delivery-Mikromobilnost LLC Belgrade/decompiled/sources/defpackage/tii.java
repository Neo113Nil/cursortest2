package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class tii implements uxs {
    public static final tii a;
    private static final SerialDescriptor descriptor;

    static {
        tii tiiVar = new tii();
        a = tiiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.DeliveryPhotocommentExperiment", tiiVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("tariffs_with_photocomments", true);
        pluginGeneratedSerialDescriptor.j("max_point_photocomments", true);
        pluginGeneratedSerialDescriptor.j("max_photo_width", true);
        pluginGeneratedSerialDescriptor.j("max_photo_height", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = vii.g;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), h6wVar, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vii.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                i3 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                i4 = b.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new vii(i, z2, list, i2, i3, i4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vii viiVar = (vii) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vii.g;
        if (b.F() || viiVar.b) {
            b.n(serialDescriptor, 0, viiVar.b);
        }
        if (b.F() || !jl40.l(viiVar.c, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), viiVar.c);
        }
        if (b.F() || viiVar.d != 1) {
            b.A(2, viiVar.d, serialDescriptor);
        }
        if (b.F() || viiVar.e != 0) {
            b.A(3, viiVar.e, serialDescriptor);
        }
        if (b.F() || viiVar.f != 0) {
            b.A(4, viiVar.f, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
