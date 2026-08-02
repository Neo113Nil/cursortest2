package ru.yandex.taxi.costcenters.api;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.costcenters.api.CostCenterField", aVar, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("order_flows", true);
        pluginGeneratedSerialDescriptor.j("required", true);
        pluginGeneratedSerialDescriptor.j("format", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CostCenterField.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), z96.a, i3yVarArr[4].getValue(), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CostCenterField.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        List list = null;
        CostCenterField.InputFormat inputFormat = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    inputFormat = (CostCenterField.InputFormat) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), inputFormat);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CostCenterField(i, str, str2, list, z2, inputFormat, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CostCenterField costCenterField = (CostCenterField) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CostCenterField.g;
        if (b.F() || !jl40.l(costCenterField.a, "")) {
            b.o(serialDescriptor, 0, costCenterField.a);
        }
        if (b.F() || !jl40.l(costCenterField.b, "")) {
            b.o(serialDescriptor, 1, costCenterField.b);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(costCenterField.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), costCenterField.c);
        }
        if (b.F() || costCenterField.d) {
            b.n(serialDescriptor, 3, costCenterField.d);
        }
        if (b.F() || costCenterField.e != CostCenterField.InputFormat.MIXED) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), costCenterField.e);
        }
        if (b.F() || !jl40.l(costCenterField.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), costCenterField.f);
        }
        b.c(serialDescriptor);
    }
}
