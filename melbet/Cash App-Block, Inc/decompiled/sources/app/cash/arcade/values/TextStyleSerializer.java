package app.cash.arcade.values;

import app.cash.arcade.values.TextStyle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class TextStyleSerializer implements KSerializer {
    public static final TextStyleSerializer INSTANCE = new TextStyleSerializer();
    public static final SerialDescriptorImpl descriptor;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (StringsKt.isBlank("app.cash.arcade.values.TextStyle")) {
            a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
            return;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder("app.cash.arcade.values.TextStyle");
        EmptyList emptyList = EmptyList.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        classSerialDescriptorBuilder.element("id", IntSerializer.descriptor, emptyList, true);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        classSerialDescriptorBuilder.element("token", StringSerializer.descriptor, emptyList, true);
        descriptor = new SerialDescriptorImpl("app.cash.arcade.values.TextStyle", StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.elementNames.size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object id;
        SerialDescriptorImpl serialDescriptorImpl = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptorImpl);
        int i = -1;
        String str = null;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptorImpl);
            if (decodeElementIndex == -1) {
                if (str != null) {
                    id = new TextStyle.Token(str);
                } else {
                    if (i == -1) {
                        a$$ExternalSyntheticBUOutline0.m$3("unexpected TextStyle");
                        return null;
                    }
                    id = new TextStyle.Id(i);
                }
                beginStructure.endStructure(serialDescriptorImpl);
                return id;
            }
            if (decodeElementIndex == 0) {
                i = beginStructure.decodeIntElement(serialDescriptorImpl, 0);
            } else {
                if (decodeElementIndex != 1) {
                    Path$$ExternalSyntheticBUOutline0.m$1(decodeElementIndex, "Unexpected index: ");
                    return null;
                }
                str = beginStructure.decodeStringElement(serialDescriptorImpl, 1);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TextStyle textStyle = (TextStyle) obj;
        textStyle.getClass();
        SerialDescriptorImpl serialDescriptorImpl = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptorImpl);
        if (textStyle instanceof TextStyle.Id) {
            beginStructure.encodeIntElement(0, ((TextStyle.Id) textStyle).id, serialDescriptorImpl);
        } else {
            if (!(textStyle instanceof TextStyle.Token)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            beginStructure.encodeStringElement(serialDescriptorImpl, 1, ((TextStyle.Token) textStyle).id);
        }
        beginStructure.endStructure(serialDescriptorImpl);
    }
}
