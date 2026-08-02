package com.google.android.datatransport.runtime;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder implements ObjectEncoder {
    public static final AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder INSTANCE = new AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder();
    public static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = new FieldDescriptor("currentCacheSizeBytes", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(1))));
    public static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = new FieldDescriptor("maxCacheSizeBytes", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(Protobuf.class, new AtProtobuf$ProtobufImpl(2))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        StorageMetrics storageMetrics = (StorageMetrics) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, storageMetrics.current_cache_size_bytes_);
        objectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, storageMetrics.max_cache_size_bytes_);
    }
}
