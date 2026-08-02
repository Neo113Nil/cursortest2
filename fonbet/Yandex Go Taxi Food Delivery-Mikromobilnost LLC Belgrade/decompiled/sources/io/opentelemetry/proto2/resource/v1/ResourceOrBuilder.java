package io.opentelemetry.proto2.resource.v1;

import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto2.common.v1.EntityRef;
import io.opentelemetry.proto2.common.v1.KeyValue;
import java.util.List;

/* loaded from: classes4.dex */
public interface ResourceOrBuilder extends zt10 {
    KeyValue getAttributes(int i);

    int getAttributesCount();

    List<KeyValue> getAttributesList();

    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    int getDroppedAttributesCount();

    EntityRef getEntityRefs(int i);

    int getEntityRefsCount();

    List<EntityRef> getEntityRefsList();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
