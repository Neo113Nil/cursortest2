package com.squareup.cash.clientsync.errors;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientsync.errors.ClientSyncError;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.util.android.Emails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/clientsync/errors/SyncValuesWithoutType;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "com/squareup/util/android/SecurePixelCopy", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncValuesWithoutType extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String groupingIdentifier = "SyncValuesWithoutType";
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final List values;

        public Metadata(List list) {
            list.getClass();
            this.values = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && Intrinsics.areEqual(this.values, ((Metadata) obj).values);
        }

        public final List getValues() {
            return this.values;
        }

        public final int hashCode() {
            return this.values.hashCode();
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            List list = this.values;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Emails.getErrorMetadata((SyncEntity) it.next()));
            }
            return MapsKt__MapsJVMKt.mapOf(new Pair("values", arrayList));
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Metadata(values=", ")", this.values);
        }
    }

    public SyncValuesWithoutType(Metadata metadata) {
        this.metadata = metadata;
        this.message = "The sync values have no valueType: ".concat(CollectionsKt.joinToString$default(metadata.values, null, null, null, 0, null, null, 63));
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncError
    public final String getGroupingIdentifier() {
        return this.groupingIdentifier;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncError
    public final ClientSyncError.Metadata getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncError
    public final Metadata getMetadata() {
        return this.metadata;
    }
}
