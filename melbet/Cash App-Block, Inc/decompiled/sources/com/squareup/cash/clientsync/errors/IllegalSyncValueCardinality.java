package com.squareup.cash.clientsync.errors;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.errors.ClientSyncError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/clientsync/errors/IllegalSyncValueCardinality;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "com/squareup/util/MathsKt", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IllegalSyncValueCardinality extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String groupingIdentifier;
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final String valueName;
        public final ArrayList values;

        public Metadata(String str, ArrayList arrayList) {
            str.getClass();
            this.valueName = str;
            this.values = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.areEqual(this.valueName, metadata.valueName) && this.values.equals(metadata.values);
        }

        public final int hashCode() {
            return this.values.hashCode() + (this.valueName.hashCode() * 31);
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            return MapsKt__MapsKt.mapOf(new Pair("valueName", this.valueName), new Pair("values", this.values));
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.values, "Metadata(valueName=", this.valueName, ", values=", ")");
        }
    }

    public IllegalSyncValueCardinality(Metadata metadata) {
        this.metadata = metadata;
        String str = metadata.valueName;
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Expected 0..1 sync values of type ", str, " but found more");
        this.groupingIdentifier = str;
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
}
