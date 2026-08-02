package io.opentelemetry.proto2.common.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import java.util.List;

/* loaded from: classes4.dex */
public interface EntityRefOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    String getDescriptionKeys(int i);

    ByteString getDescriptionKeysBytes(int i);

    int getDescriptionKeysCount();

    List<String> getDescriptionKeysList();

    String getIdKeys(int i);

    ByteString getIdKeysBytes(int i);

    int getIdKeysCount();

    List<String> getIdKeysList();

    String getSchemaUrl();

    ByteString getSchemaUrlBytes();

    String getType();

    ByteString getTypeBytes();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
