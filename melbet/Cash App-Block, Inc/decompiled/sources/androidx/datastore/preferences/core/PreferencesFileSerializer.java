package androidx.datastore.preferences.core;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.UncloseableOutputStream;
import androidx.datastore.preferences.PreferencesProto$PreferenceMap;
import androidx.datastore.preferences.PreferencesProto$StringSet;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.ByteString$LiteralByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream$OutputStreamEncoder;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class PreferencesFileSerializer implements Serializer {
    public static final PreferencesFileSerializer INSTANCE = new PreferencesFileSerializer();

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Fragment$5$$ExternalSyntheticOutline0._values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new MutablePreferences(true);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            PreferencesProto$PreferenceMap parseFrom = PreferencesProto$PreferenceMap.parseFrom(fileInputStream);
            MutablePreferences mutablePreferences = new MutablePreferences(false);
            Preferences.Pair[] pairArr = (Preferences.Pair[]) Arrays.copyOf(new Preferences.Pair[0], 0);
            mutablePreferences.checkNotFrozen$datastore_preferences_core_release();
            if (pairArr.length > 0) {
                Preferences.Pair pair = pairArr[0];
                throw null;
            }
            Map preferencesMap = parseFrom.getPreferencesMap();
            preferencesMap.getClass();
            for (Map.Entry entry : preferencesMap.entrySet()) {
                String str = (String) entry.getKey();
                PreferencesProto$Value preferencesProto$Value = (PreferencesProto$Value) entry.getValue();
                str.getClass();
                preferencesProto$Value.getClass();
                int valueCase = preferencesProto$Value.getValueCase();
                switch (valueCase == 0 ? -1 : WhenMappings.$EnumSwitchMapping$0[CameraSelector$$ExternalSyntheticOutline0.ordinal(valueCase)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), Boolean.valueOf(preferencesProto$Value.getBoolean()));
                        break;
                    case 2:
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), Float.valueOf(preferencesProto$Value.getFloat()));
                        break;
                    case 3:
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), Double.valueOf(preferencesProto$Value.getDouble()));
                        break;
                    case 4:
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), Integer.valueOf(preferencesProto$Value.getInteger()));
                        break;
                    case 5:
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), Long.valueOf(preferencesProto$Value.getLong()));
                        break;
                    case 6:
                        Preferences.Key key = new Preferences.Key(str);
                        String string2 = preferencesProto$Value.getString();
                        string2.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(key, string2);
                        break;
                    case 7:
                        Preferences.Key key2 = new Preferences.Key(str);
                        Internal.ProtobufList stringsList = preferencesProto$Value.getStringSet().getStringsList();
                        stringsList.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(key2, CollectionsKt.toSet(stringsList));
                        break;
                    case 8:
                        Preferences.Key key3 = new Preferences.Key(str);
                        ByteString$LiteralByteString bytes = preferencesProto$Value.getBytes();
                        int size = bytes.size();
                        if (size == 0) {
                            bArr = Internal.EMPTY_BYTE_ARRAY;
                        } else {
                            byte[] bArr2 = new byte[size];
                            bytes.copyToInternal(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(key3, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return mutablePreferences.toPreferences();
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Unit writeTo(Object obj, UncloseableOutputStream uncloseableOutputStream) {
        GeneratedMessageLite build;
        Map asMap = ((Preferences) obj).asMap();
        PreferencesProto$PreferenceMap.Builder newBuilder = PreferencesProto$PreferenceMap.newBuilder();
        for (Map.Entry entry : asMap.entrySet()) {
            Preferences.Key key = (Preferences.Key) entry.getKey();
            Object value = entry.getValue();
            String str = key.name;
            if (value instanceof Boolean) {
                PreferencesProto$Value.Builder newBuilder2 = PreferencesProto$Value.newBuilder();
                boolean booleanValue = ((Boolean) value).booleanValue();
                newBuilder2.copyOnWrite();
                PreferencesProto$Value.access$500((PreferencesProto$Value) newBuilder2.instance, booleanValue);
                build = newBuilder2.build();
            } else if (value instanceof Float) {
                PreferencesProto$Value.Builder newBuilder3 = PreferencesProto$Value.newBuilder();
                float floatValue = ((Number) value).floatValue();
                newBuilder3.copyOnWrite();
                PreferencesProto$Value.access$700((PreferencesProto$Value) newBuilder3.instance, floatValue);
                build = newBuilder3.build();
            } else if (value instanceof Double) {
                PreferencesProto$Value.Builder newBuilder4 = PreferencesProto$Value.newBuilder();
                double doubleValue = ((Number) value).doubleValue();
                newBuilder4.copyOnWrite();
                PreferencesProto$Value.access$1900((PreferencesProto$Value) newBuilder4.instance, doubleValue);
                build = newBuilder4.build();
            } else if (value instanceof Integer) {
                PreferencesProto$Value.Builder newBuilder5 = PreferencesProto$Value.newBuilder();
                int intValue = ((Number) value).intValue();
                newBuilder5.copyOnWrite();
                PreferencesProto$Value.access$900((PreferencesProto$Value) newBuilder5.instance, intValue);
                build = newBuilder5.build();
            } else if (value instanceof Long) {
                PreferencesProto$Value.Builder newBuilder6 = PreferencesProto$Value.newBuilder();
                long longValue = ((Number) value).longValue();
                newBuilder6.copyOnWrite();
                PreferencesProto$Value.access$1100((PreferencesProto$Value) newBuilder6.instance, longValue);
                build = newBuilder6.build();
            } else if (value instanceof String) {
                PreferencesProto$Value.Builder newBuilder7 = PreferencesProto$Value.newBuilder();
                newBuilder7.copyOnWrite();
                PreferencesProto$Value.access$1300((PreferencesProto$Value) newBuilder7.instance, (String) value);
                build = newBuilder7.build();
            } else if (value instanceof Set) {
                PreferencesProto$Value.Builder newBuilder8 = PreferencesProto$Value.newBuilder();
                PreferencesProto$StringSet.Builder newBuilder9 = PreferencesProto$StringSet.newBuilder();
                newBuilder9.copyOnWrite();
                PreferencesProto$StringSet.access$2700((PreferencesProto$StringSet) newBuilder9.instance, (Set) value);
                newBuilder8.copyOnWrite();
                PreferencesProto$Value.access$1600((PreferencesProto$Value) newBuilder8.instance, (PreferencesProto$StringSet) newBuilder9.build());
                build = newBuilder8.build();
            } else {
                if (!(value instanceof byte[])) {
                    a$$ExternalSyntheticBUOutline0.m$1(Boxes$$ExternalSyntheticOutline1.m(value, "PreferencesSerializer does not support type: "));
                    return null;
                }
                PreferencesProto$Value.Builder newBuilder10 = PreferencesProto$Value.newBuilder();
                byte[] bArr = (byte[]) value;
                ByteString$LiteralByteString copyFrom = ByteString$LiteralByteString.copyFrom(0, bArr.length, bArr);
                newBuilder10.copyOnWrite();
                PreferencesProto$Value.access$2100((PreferencesProto$Value) newBuilder10.instance, copyFrom);
                build = newBuilder10.build();
            }
            newBuilder.getClass();
            str.getClass();
            newBuilder.copyOnWrite();
            PreferencesProto$PreferenceMap.access$100((PreferencesProto$PreferenceMap) newBuilder.instance).put(str, (PreferencesProto$Value) build);
        }
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = (PreferencesProto$PreferenceMap) newBuilder.build();
        int serializedSize = preferencesProto$PreferenceMap.getSerializedSize(null);
        Logger logger = CodedOutputStream$OutputStreamEncoder.logger;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder = new CodedOutputStream$OutputStreamEncoder(uncloseableOutputStream, serializedSize);
        preferencesProto$PreferenceMap.writeTo(codedOutputStream$OutputStreamEncoder);
        if (codedOutputStream$OutputStreamEncoder.position > 0) {
            codedOutputStream$OutputStreamEncoder.doFlush();
        }
        return Unit.INSTANCE;
    }
}
