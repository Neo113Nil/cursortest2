package com.squareup.cash.clientsync.errors;

import com.squareup.cash.clientsync.errors.ClientSyncError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__IndentKt;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/clientsync/errors/SyncEntityShadowException;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "com/squareup/util/android/Keyboards", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncEntityShadowException extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Throwable cause;
    public final String groupingIdentifier;
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final KClass mainStoreClass;
        public final KClass shadowStoreClass;

        public Metadata(KClass kClass, KClass kClass2) {
            kClass.getClass();
            kClass2.getClass();
            this.mainStoreClass = kClass;
            this.shadowStoreClass = kClass2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.areEqual(this.mainStoreClass, metadata.mainStoreClass) && Intrinsics.areEqual(this.shadowStoreClass, metadata.shadowStoreClass);
        }

        public final int hashCode() {
            return Long.hashCode(9L) + ((this.shadowStoreClass.hashCode() + (this.mainStoreClass.hashCode() * 31)) * 31);
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            return MapsKt__MapsKt.mapOf(new Pair("mainStoreClass", this.mainStoreClass.getSimpleName()), new Pair("shadowStoreClass", this.shadowStoreClass.getSimpleName()), new Pair("bootstrapMigrationVersion", 9L));
        }

        public final String toString() {
            return "Metadata(mainStoreClass=" + this.mainStoreClass + ", shadowStoreClass=" + this.shadowStoreClass + ", bootstrapMigrationVersion=9)";
        }
    }

    public SyncEntityShadowException(String str, Throwable th, Metadata metadata) {
        this.cause = th;
        this.metadata = metadata;
        String simpleName = metadata.mainStoreClass.getSimpleName();
        String simpleName2 = metadata.shadowStoreClass.getSimpleName();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    ", str, ":\n    - Main store: ", simpleName, "\n    - Shadow store: ");
        m.append(simpleName2);
        m.append("\n    - Bootstrap Migration Version: 9\n  ");
        this.message = StringsKt__IndentKt.replaceIndent(m.toString());
        this.groupingIdentifier = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SyncEntityShadowException:", str, ":9");
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
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
