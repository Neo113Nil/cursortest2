package app.cash.arcade.values.benefitsTable;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.TextAlign;
import app.cash.arcade.values.TextStyle;
import app.cash.arcade.values.TextStyleSerializer;
import app.cash.arcade.values.benefitsTable.BenefitsComparisonTableCell;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import designsystem.arcade.ArcadeColors;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"app/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell.IconCell.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$IconCell;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$IconCell;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$IconCell;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class BenefitsComparisonTableCell$IconCell$$serializer implements GeneratedSerializer {
    public static final BenefitsComparisonTableCell$IconCell$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BenefitsComparisonTableCell$IconCell$$serializer benefitsComparisonTableCell$IconCell$$serializer = new BenefitsComparisonTableCell$IconCell$$serializer();
        INSTANCE = benefitsComparisonTableCell$IconCell$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Icon", benefitsComparisonTableCell$IconCell$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("contentDescription", false);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("contentColor", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundColor", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BenefitsComparisonTableCell.IconCell.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), StringSerializer.INSTANCE, lazyArr[2].getValue(), lazyArr[3].getValue(), lazyArr[4].getValue(), TextStyleSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final BenefitsComparisonTableCell.IconCell deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BenefitsComparisonTableCell.IconCell.$childSerializers;
        boolean z = true;
        int i = 0;
        ImageResource imageResource = null;
        String str = null;
        TextAlign textAlign = null;
        Color color = null;
        Color color2 = null;
        TextStyle textStyle = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    imageResource = (ImageResource) beginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), imageResource);
                    i |= 1;
                    break;
                case 1:
                    str = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    textAlign = (TextAlign) beginStructure.decodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), textAlign);
                    i |= 4;
                    break;
                case 3:
                    color = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), color);
                    i |= 8;
                    break;
                case 4:
                    color2 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), color2);
                    i |= 16;
                    break;
                case 5:
                    textStyle = (TextStyle) beginStructure.decodeSerializableElement(serialDescriptor, 5, TextStyleSerializer.INSTANCE, textStyle);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new BenefitsComparisonTableCell.IconCell(i, imageResource, str, textAlign, color, color2, textStyle);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BenefitsComparisonTableCell.IconCell value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BenefitsComparisonTableCell.IconCell.$childSerializers;
        KSerializer kSerializer = (KSerializer) lazyArr[0].getValue();
        ImageResource imageResource = value.icon;
        TextStyle textStyle = value.style;
        Color color = value.backgroundColor;
        Color color2 = value.contentColor;
        TextAlign textAlign = value.alignment;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, kSerializer, imageResource);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.contentDescription);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || textAlign != TextAlign.Natural) {
            beginStructure.encodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), textAlign);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(color2, ArcadeColors.IconStandard)) {
            beginStructure.encodeSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), color2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(color, ArcadeColors.BackgroundApp)) {
            beginStructure.encodeSerializableElement(serialDescriptor, 4, (KSerializer) lazyArr[4].getValue(), color);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(textStyle, new TextStyle.Token(AnnotatedPrivateKey.LABEL))) {
            beginStructure.encodeSerializableElement(serialDescriptor, 5, TextStyleSerializer.INSTANCE, textStyle);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
