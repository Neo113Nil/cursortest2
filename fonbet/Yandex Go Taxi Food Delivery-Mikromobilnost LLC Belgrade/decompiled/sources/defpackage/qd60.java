package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class qd60 implements uxs {
    public static final qd60 a;
    private static final SerialDescriptor descriptor;

    static {
        qd60 qd60Var = new qd60();
        a = qd60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.NoWhitelistedRequirements", qd60Var, 1);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{td60.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = td60.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new td60(i, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        td60 td60Var = (td60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = td60.b;
        if (b.F() || !jl40.l(td60Var.a, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), td60Var.a);
        }
        b.c(serialDescriptor);
    }
}
