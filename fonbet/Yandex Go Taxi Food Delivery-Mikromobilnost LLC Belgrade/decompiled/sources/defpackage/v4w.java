package defpackage;

import defpackage.u4w;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class v4w implements uxs {
    public static final v4w a;
    private static final SerialDescriptor descriptor;

    static {
        v4w v4wVar = new v4w();
        a = v4wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Insurance.ProviderInfo", v4wVar, 2);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("sections", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a, u4w.b.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = u4w.b.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new u4w.b(i, formattedText, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u4w.b bVar = (u4w.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = u4w.b.c;
        if (b.F() || !jl40.l(bVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), bVar.b);
        }
        b.c(serialDescriptor);
    }
}
