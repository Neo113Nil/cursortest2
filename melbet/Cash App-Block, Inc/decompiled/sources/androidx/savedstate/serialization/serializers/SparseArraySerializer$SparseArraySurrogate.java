package androidx.savedstate.serialization.serializers;

import androidx.work.Worker$$ExternalSyntheticLambda1;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class SparseArraySerializer$SparseArraySurrogate<T> {
    public static final PluginGeneratedSerialDescriptor $cachedDescriptor;
    public final List keys;
    public final List values;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(1)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0003\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion", "", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Companion {
        public final <T> KSerializer serializer(final KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new GeneratedSerializer(typeSerial0) { // from class: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$serializer
                private final SerialDescriptor descriptor;
                public final /* synthetic */ KSerializer typeSerial0;

                {
                    typeSerial0.getClass();
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                    pluginGeneratedSerialDescriptor.addElement("keys", false);
                    pluginGeneratedSerialDescriptor.addElement("values", false);
                    this.descriptor = pluginGeneratedSerialDescriptor;
                    this.typeSerial0 = typeSerial0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.serialization.internal.GeneratedSerializer
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{SparseArraySerializer$SparseArraySurrogate.$childSerializers[0].getValue(), new HashSetSerializer(this.typeSerial0, 1)};
                }

                @Override // kotlinx.serialization.KSerializer
                public final SparseArraySerializer$SparseArraySurrogate<T> deserialize(Decoder decoder) {
                    decoder.getClass();
                    SerialDescriptor serialDescriptor = this.descriptor;
                    CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                    Lazy[] lazyArr = SparseArraySerializer$SparseArraySurrogate.$childSerializers;
                    boolean z = true;
                    int i = 0;
                    List list = null;
                    List list2 = null;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        if (decodeElementIndex == -1) {
                            z = false;
                        } else if (decodeElementIndex == 0) {
                            list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), list);
                            i |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                                return null;
                            }
                            list2 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 1, new HashSetSerializer(this.typeSerial0, 1), list2);
                            i |= 2;
                        }
                    }
                    beginStructure.endStructure(serialDescriptor);
                    return new SparseArraySerializer$SparseArraySurrogate<>(i, list, list2);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
                    return this.descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, SparseArraySerializer$SparseArraySurrogate<T> value) {
                    encoder.getClass();
                    value.getClass();
                    SerialDescriptor serialDescriptor = this.descriptor;
                    CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                    beginStructure.encodeSerializableElement(serialDescriptor, 0, (KSerializer) SparseArraySerializer$SparseArraySurrogate.$childSerializers[0].getValue(), value.keys);
                    beginStructure.encodeSerializableElement(serialDescriptor, 1, new HashSetSerializer(this.typeSerial0, 1), value.values);
                    beginStructure.endStructure(serialDescriptor);
                }

                @Override // kotlinx.serialization.internal.GeneratedSerializer
                public final KSerializer[] typeParametersSerializers() {
                    return new KSerializer[]{this.typeSerial0};
                }
            };
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        pluginGeneratedSerialDescriptor.addElement("keys", false);
        pluginGeneratedSerialDescriptor.addElement("values", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ SparseArraySerializer$SparseArraySurrogate(int i, List list, List list2) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, $cachedDescriptor);
            throw null;
        }
        this.keys = list;
        this.values = list2;
    }
}
