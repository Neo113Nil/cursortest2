package app.cash.arcade.values.benefitsTable;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/arcade/values/benefitsTable/BenefitsComparisonTableRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableRow;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableRow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class BenefitsComparisonTableRow$$serializer implements GeneratedSerializer {
    public static final BenefitsComparisonTableRow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BenefitsComparisonTableRow$$serializer benefitsComparisonTableRow$$serializer = new BenefitsComparisonTableRow$$serializer();
        INSTANCE = benefitsComparisonTableRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.cash.arcade.values.benefitsTable.BenefitsComparisonTableRow", benefitsComparisonTableRow$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("cell1", false);
        pluginGeneratedSerialDescriptor.addElement("cell2", false);
        pluginGeneratedSerialDescriptor.addElement("cell3", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BenefitsComparisonTableRow.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[2].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final BenefitsComparisonTableRow deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BenefitsComparisonTableRow.$childSerializers;
        boolean z = true;
        int i = 0;
        BenefitsComparisonTableCell benefitsComparisonTableCell = null;
        BenefitsComparisonTableCell benefitsComparisonTableCell2 = null;
        BenefitsComparisonTableCell benefitsComparisonTableCell3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                benefitsComparisonTableCell = (BenefitsComparisonTableCell) beginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), benefitsComparisonTableCell);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                benefitsComparisonTableCell2 = (BenefitsComparisonTableCell) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), benefitsComparisonTableCell2);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                benefitsComparisonTableCell3 = (BenefitsComparisonTableCell) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), benefitsComparisonTableCell3);
                i |= 4;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new BenefitsComparisonTableRow(i, benefitsComparisonTableCell, benefitsComparisonTableCell2, benefitsComparisonTableCell3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BenefitsComparisonTableRow value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BenefitsComparisonTableRow.$childSerializers;
        KSerializer kSerializer = (KSerializer) lazyArr[0].getValue();
        BenefitsComparisonTableCell benefitsComparisonTableCell = value.cell1;
        BenefitsComparisonTableCell benefitsComparisonTableCell2 = value.cell3;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, kSerializer, benefitsComparisonTableCell);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), value.cell2);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || benefitsComparisonTableCell2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), benefitsComparisonTableCell2);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
