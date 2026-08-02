package androidx.datastore.preferences;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.datastore.preferences.protobuf.AbstractProtobufList;
import androidx.datastore.preferences.protobuf.ByteString$LiteralByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyStringList;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection;
import androidx.datastore.preferences.protobuf.ProtobufArrayList;
import androidx.datastore.preferences.protobuf.RawMessageInfo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PreferencesProto$StringSet extends GeneratedMessageLite {
    private static final PreferencesProto$StringSet DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private Internal.ProtobufList strings_ = ProtobufArrayList.EMPTY_LIST;

    public final class Builder extends GeneratedMessageLite.Builder {
    }

    static {
        PreferencesProto$StringSet preferencesProto$StringSet = new PreferencesProto$StringSet();
        DEFAULT_INSTANCE = preferencesProto$StringSet;
        GeneratedMessageLite.registerDefaultInstance(PreferencesProto$StringSet.class, preferencesProto$StringSet);
    }

    public static void access$2700(PreferencesProto$StringSet preferencesProto$StringSet, Iterable iterable) {
        Internal.ProtobufList protobufList = preferencesProto$StringSet.strings_;
        if (!((AbstractProtobufList) protobufList).isMutable) {
            int size = protobufList.size();
            preferencesProto$StringSet.strings_ = ((ProtobufArrayList) protobufList).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = preferencesProto$StringSet.strings_;
        Charset charset = Internal.UTF_8;
        if (iterable instanceof LazyStringList) {
            List underlyingElements = ((LazyStringList) iterable).getUnderlyingElements();
            if (list != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            list.size();
            Iterator it = underlyingElements.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ByteString$LiteralByteString) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                ByteString$LiteralByteString.copyFrom(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof PrimitiveNonBoxingCollection) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                a$$ExternalSyntheticBUOutline0.m$2(str);
                return;
            }
            list.add(obj);
        }
    }

    public static PreferencesProto$StringSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.dynamicMethod(5));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new PreferencesProto$StringSet();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (PreferencesProto$StringSet.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return null;
        }
    }

    public final Internal.ProtobufList getStringsList() {
        return this.strings_;
    }
}
