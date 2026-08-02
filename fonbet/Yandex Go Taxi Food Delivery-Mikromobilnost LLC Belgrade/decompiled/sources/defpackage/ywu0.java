package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.BubbleOrientation;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;

/* loaded from: classes5.dex */
public final /* synthetic */ class ywu0 implements uxs {
    public static final ywu0 a;
    private static final SerialDescriptor descriptor;

    static {
        ywu0 ywu0Var = new ywu0();
        a = ywu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.Style", ywu0Var, 10);
        pluginGeneratedSerialDescriptor.j("bg_color", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("hide_chevron", true);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("paddings", true);
        pluginGeneratedSerialDescriptor.j("margins", true);
        pluginGeneratedSerialDescriptor.j("safe_zone", true);
        pluginGeneratedSerialDescriptor.j("corner_radius", true);
        pluginGeneratedSerialDescriptor.j("structure", true);
        pluginGeneratedSerialDescriptor.j("orientation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = dxu0.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), z96.a, qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(rn6.a), qke.n(wm6.a), nor.a, qke.n(h6w.a), i3yVarArr[8].getValue(), i3yVarArr[9].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = dxu0.k;
        b.getClass();
        float f = 0.0f;
        BubbleOrientation bubbleOrientation = null;
        BubbleStructure bubbleStructure = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        List list = null;
        tn6 tn6Var = null;
        ym6 ym6Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    tn6Var = (tn6) b.s(serialDescriptor, 4, rn6.a, tn6Var);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    ym6Var = (ym6) b.s(serialDescriptor, 5, wm6.a, ym6Var);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    f = b.y(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    num = (Integer) b.s(serialDescriptor, 7, h6w.a, num);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    bubbleStructure = (BubbleStructure) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), bubbleStructure);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    bubbleOrientation = (BubbleOrientation) b.A(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), bubbleOrientation);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new dxu0(i, str, str2, z2, list, tn6Var, ym6Var, f, num, bubbleStructure, bubbleOrientation);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dxu0 dxu0Var = (dxu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dxu0.k;
        if (b.F() || dxu0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, dxu0Var.a);
        }
        if (b.F() || dxu0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, dxu0Var.b);
        }
        if (b.F() || dxu0Var.c) {
            b.n(serialDescriptor, 2, dxu0Var.c);
        }
        if (b.F() || dxu0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), dxu0Var.d);
        }
        if (b.F() || dxu0Var.e != null) {
            b.g(serialDescriptor, 4, rn6.a, dxu0Var.e);
        }
        if (b.F() || dxu0Var.f != null) {
            b.g(serialDescriptor, 5, wm6.a, dxu0Var.f);
        }
        if (b.F() || Float.compare(dxu0Var.g, 0.0f) != 0) {
            b.z(serialDescriptor, 6, dxu0Var.g);
        }
        if (b.F() || dxu0Var.h != null) {
            b.g(serialDescriptor, 7, h6w.a, dxu0Var.h);
        }
        if (b.F() || dxu0Var.i != BubbleStructure.UNKNOWN) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), dxu0Var.i);
        }
        if (b.F() || dxu0Var.j != BubbleOrientation.UNKNOWN) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), dxu0Var.j);
        }
        b.c(serialDescriptor);
    }
}
