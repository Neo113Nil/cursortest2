package io.opentelemetry.proto.common.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import java.util.List;

/* loaded from: classes4.dex */
public interface InstrumentationScopeOrBuilder extends zt10 {
    KeyValue getAttributes(int i);

    int getAttributesCount();

    List<KeyValue> getAttributesList();

    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    int getDroppedAttributesCount();

    String getName();

    ByteString getNameBytes();

    String getVersion();

    ByteString getVersionBytes();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
