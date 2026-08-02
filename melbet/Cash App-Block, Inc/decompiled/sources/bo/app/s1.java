package bo.app;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.braze.models.BrazeGeofence;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements GeneratedSerializer {
    public static final s1 a;
    private static final SerialDescriptor descriptor;

    static {
        s1 s1Var = new s1();
        a = s1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.braze.models.BrazeGeofence", s1Var, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("latitude", false);
        pluginGeneratedSerialDescriptor.addElement("longitude", false);
        pluginGeneratedSerialDescriptor.addElement("radius", false);
        pluginGeneratedSerialDescriptor.addElement("cooldown_enter", false);
        pluginGeneratedSerialDescriptor.addElement("cooldown_exit", false);
        pluginGeneratedSerialDescriptor.addElement("analytics_enabled_enter", false);
        pluginGeneratedSerialDescriptor.addElement("analytics_enabled_exit", false);
        pluginGeneratedSerialDescriptor.addElement("enter_events", false);
        pluginGeneratedSerialDescriptor.addElement("exit_events", false);
        pluginGeneratedSerialDescriptor.addElement("notification_responsiveness", false);
        pluginGeneratedSerialDescriptor.addElement("distanceFromGeofenceRefresh", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, doubleSerializer, doubleSerializer, intSerializer, intSerializer, intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, intSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        boolean z5 = true;
        while (z5) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d = beginStructure.decodeDoubleElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d2 = beginStructure.decodeDoubleElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = beginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = beginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i4 = beginStructure.decodeIntElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    z4 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    i5 = beginStructure.decodeIntElement(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    d3 = beginStructure.decodeDoubleElement(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new BrazeGeofence(i, str, d, d2, i2, i3, i4, z, z2, z3, z4, i5, d3, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BrazeGeofence brazeGeofence = (BrazeGeofence) obj;
        encoder.getClass();
        brazeGeofence.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        BrazeGeofence.write$Self$android_sdk_base_release(brazeGeofence, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
