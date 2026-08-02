package androidx.glance.appwidget.proto;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.UncloseableOutputStream;
import androidx.glance.appwidget.protobuf.CodedOutputStream$OutputStreamEncoder;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.ManifestSchemaFactory;
import androidx.glance.appwidget.protobuf.Protobuf;
import androidx.glance.appwidget.protobuf.Schema;
import java.io.FileInputStream;
import java.util.logging.Logger;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class LayoutProtoSerializer implements Serializer {
    public static final LayoutProtoSerializer INSTANCE = new LayoutProtoSerializer();
    public static final LayoutProto$LayoutConfig defaultValue;

    static {
        LayoutProto$LayoutConfig defaultInstance = LayoutProto$LayoutConfig.getDefaultInstance();
        defaultInstance.getClass();
        defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(FileInputStream fileInputStream) {
        try {
            return LayoutProto$LayoutConfig.parseFrom(fileInputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Unit writeTo(Object obj, UncloseableOutputStream uncloseableOutputStream) {
        LayoutProto$LayoutConfig layoutProto$LayoutConfig = (LayoutProto$LayoutConfig) obj;
        layoutProto$LayoutConfig.getClass();
        int serializedSize = layoutProto$LayoutConfig.getSerializedSize(null);
        Logger logger = CodedOutputStream$OutputStreamEncoder.logger;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder = new CodedOutputStream$OutputStreamEncoder(uncloseableOutputStream, serializedSize);
        Protobuf protobuf = Protobuf.INSTANCE;
        protobuf.getClass();
        Schema schemaFor = protobuf.schemaFor(layoutProto$LayoutConfig.getClass());
        ManifestSchemaFactory manifestSchemaFactory = codedOutputStream$OutputStreamEncoder.wrapper;
        if (manifestSchemaFactory == null) {
            manifestSchemaFactory = new ManifestSchemaFactory(codedOutputStream$OutputStreamEncoder);
        }
        schemaFor.writeTo(layoutProto$LayoutConfig, manifestSchemaFactory);
        if (codedOutputStream$OutputStreamEncoder.position > 0) {
            codedOutputStream$OutputStreamEncoder.doFlush();
        }
        return Unit.INSTANCE;
    }
}
