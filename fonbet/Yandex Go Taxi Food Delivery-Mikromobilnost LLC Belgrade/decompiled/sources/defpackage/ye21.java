package defpackage;

import com.yandex.urbanads.UrbanAdsCreativeParams$Format;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ye21 implements uxs {
    public static final ye21 a;
    private static final SerialDescriptor descriptor;

    static {
        ye21 ye21Var = new ye21();
        a = ye21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UrbanAdsCreativeParams", ye21Var, 7);
        pluginGeneratedSerialDescriptor.j("format", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_PAGE, false);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("row", true);
        pluginGeneratedSerialDescriptor.j("column", true);
        pluginGeneratedSerialDescriptor.j("overrides", true);
        pluginGeneratedSerialDescriptor.j("animateChanges", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = bf21.h;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0.a, qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n((KSerializer) i3yVarArr[5].getValue()), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bf21.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    urbanAdsCreativeParams$Format = (UrbanAdsCreativeParams$Format) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), urbanAdsCreativeParams$Format);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) b.s(serialDescriptor, 3, h6w.a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) b.s(serialDescriptor, 4, h6w.a, num3);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new bf21(i, urbanAdsCreativeParams$Format, str, num, num2, num3, map, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bf21 bf21Var = (bf21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = bf21.h;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format = bf21Var.a;
        boolean z = bf21Var.g;
        Map map = bf21Var.f;
        Integer num = bf21Var.e;
        Integer num2 = bf21Var.d;
        Integer num3 = bf21Var.c;
        b.e(serialDescriptor, 0, kSerializer, urbanAdsCreativeParams$Format);
        b.o(serialDescriptor, 1, bf21Var.b);
        if (b.F() || num3 != null) {
            b.g(serialDescriptor, 2, h6w.a, num3);
        }
        if (b.F() || num2 != null) {
            b.g(serialDescriptor, 3, h6w.a, num2);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 4, h6w.a, num);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), map);
        }
        if (b.F() || !z) {
            b.n(serialDescriptor, 6, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
