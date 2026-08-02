package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$StructureType;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class tnd implements uxs {
    public static final tnd a;
    private static final SerialDescriptor descriptor;

    static {
        tnd tndVar = new tnd();
        a = tndVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto", tndVar, 9);
        pluginGeneratedSerialDescriptor.j("positionId", false);
        pluginGeneratedSerialDescriptor.j("structureType", false);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("forActiveOffers", true);
        pluginGeneratedSerialDescriptor.j("tariffOffer", true);
        pluginGeneratedSerialDescriptor.j("optionOffers", true);
        pluginGeneratedSerialDescriptor.j("legalInfo", false);
        pluginGeneratedSerialDescriptor.j("silentInvoiceAvailable", true);
        pluginGeneratedSerialDescriptor.j("invoices", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = spd.j;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), und.a, qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(lpd.a), i3yVarArr[5].getValue(), bod.a, z96.a, i3yVarArr[8].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = spd.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        String str = null;
        CompositeOfferDto$StructureType compositeOfferDto$StructureType = null;
        wnd wndVar = null;
        List list2 = null;
        qpd qpdVar = null;
        List list3 = null;
        kod kodVar = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    compositeOfferDto$StructureType = (CompositeOfferDto$StructureType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), compositeOfferDto$StructureType);
                    i |= 2;
                    break;
                case 2:
                    wndVar = (wnd) b.A(serialDescriptor, 2, und.a, wndVar);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    qpdVar = (qpd) b.s(serialDescriptor, 4, lpd.a, qpdVar);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    kodVar = (kod) b.A(serialDescriptor, 6, bod.a, kodVar);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new spd(i, str, compositeOfferDto$StructureType, wndVar, list2, qpdVar, list3, kodVar, z2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        spd spdVar = (spd) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = spd.j;
        String str = spdVar.a;
        List list = spdVar.i;
        boolean z = spdVar.h;
        List list2 = spdVar.f;
        qpd qpdVar = spdVar.e;
        List list3 = spdVar.d;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), spdVar.b);
        b.e(serialDescriptor, 2, und.a, spdVar.c);
        if (b.F() || list3 != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), list3);
        }
        if (b.F() || qpdVar != null) {
            b.g(serialDescriptor, 4, lpd.a, qpdVar);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(list2, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), list2);
        }
        b.e(serialDescriptor, 6, bod.a, spdVar.g);
        if (b.F() || z) {
            b.n(serialDescriptor, 7, z);
        }
        if (b.F() || !jl40.l(list, emptyList)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
