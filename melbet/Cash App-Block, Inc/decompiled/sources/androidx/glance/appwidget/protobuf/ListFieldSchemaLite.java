package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.Internal;

/* loaded from: classes3.dex */
public final class ListFieldSchemaLite {
    public static Internal.ProtobufList mutableListAt(Object obj, long j) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j);
        if (((AbstractProtobufList) protobufList).isMutable) {
            return protobufList;
        }
        int size = protobufList.size();
        ProtobufArrayList mutableCopyWithCapacity = ((ProtobufArrayList) protobufList).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        UnsafeUtil.putObject(obj, j, mutableCopyWithCapacity);
        return mutableCopyWithCapacity;
    }
}
