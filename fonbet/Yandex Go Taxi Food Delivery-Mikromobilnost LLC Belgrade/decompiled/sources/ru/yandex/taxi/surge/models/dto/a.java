package ru.yandex.taxi.surge.models.dto;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.jl40;
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
import ru.yandex.taxi.surge.models.dto.DetailedPriceContent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.DetailedPriceContent.DetailedPriceItem", aVar, 6);
        pluginGeneratedSerialDescriptor.j("slot", true);
        pluginGeneratedSerialDescriptor.j("additional_leading_inset", true);
        pluginGeneratedSerialDescriptor.j("top_inset", true);
        pluginGeneratedSerialDescriptor.j("divider_type", true);
        pluginGeneratedSerialDescriptor.j("tooltip", true);
        pluginGeneratedSerialDescriptor.j("is_header", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DetailedPriceContent.DetailedPriceItem.g;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{SlotItemDto$$serializer.INSTANCE, e6mVar, e6mVar, i3yVarArr[3].getValue(), d.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DetailedPriceContent.DetailedPriceItem.g;
        b.getClass();
        Object obj = null;
        int i = 0;
        boolean z = false;
        SlotItemDto slotItemDto = null;
        DetailedPriceContent.DetailedPriceItem.DividerType dividerType = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z2 = true;
        DetailedPriceContent.a aVar = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    slotItemDto = (SlotItemDto) b.A(serialDescriptor, 0, SlotItemDto$$serializer.INSTANCE, slotItemDto);
                    i |= 1;
                    break;
                case 1:
                    d = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d2 = b.E(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dividerType = (DetailedPriceContent.DetailedPriceItem.DividerType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), dividerType);
                    i |= 8;
                    break;
                case 4:
                    aVar = (DetailedPriceContent.a) b.A(serialDescriptor, 4, d.a, aVar);
                    i |= 16;
                    break;
                case 5:
                    z = b.C(serialDescriptor, 5);
                    i |= 32;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new DetailedPriceContent.DetailedPriceItem(i, slotItemDto, d, d2, dividerType, aVar, z);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DetailedPriceContent.DetailedPriceItem detailedPriceItem = (DetailedPriceContent.DetailedPriceItem) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DetailedPriceContent.DetailedPriceItem.g;
        if (b.F() || !jl40.l(detailedPriceItem.a, new SlotItemDto(0))) {
            b.e(serialDescriptor, 0, SlotItemDto$$serializer.INSTANCE, detailedPriceItem.a);
        }
        if (b.F() || Double.compare(detailedPriceItem.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, detailedPriceItem.b);
        }
        if (b.F() || Double.compare(detailedPriceItem.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, detailedPriceItem.c);
        }
        if (b.F() || detailedPriceItem.d != DetailedPriceContent.DetailedPriceItem.DividerType.UNKNOWN) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), detailedPriceItem.d);
        }
        if (b.F() || !jl40.l(detailedPriceItem.e, new DetailedPriceContent.a(0))) {
            b.e(serialDescriptor, 4, d.a, detailedPriceItem.e);
        }
        if (b.F() || detailedPriceItem.f) {
            b.n(serialDescriptor, 5, detailedPriceItem.f);
        }
        b.c(serialDescriptor);
    }
}
