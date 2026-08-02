package com.squareup.cash.clientsync.errors;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.clientsync.errors.ClientSyncError;
import com.squareup.cash.clientsync.persistence.AuditLogEntry;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__IndentKt;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/clientsync/errors/SyncRangeShadowException;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncRangeShadowException extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Throwable cause;
    public final String groupingIdentifier;
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final ArrayList auditLogEntries;
        public final KClass mainStoreClass;
        public final KClass shadowStoreClass;

        public Metadata(KClass kClass, KClass kClass2, ArrayList arrayList) {
            this.mainStoreClass = kClass;
            this.shadowStoreClass = kClass2;
            this.auditLogEntries = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return this.mainStoreClass.equals(metadata.mainStoreClass) && this.shadowStoreClass.equals(metadata.shadowStoreClass) && this.auditLogEntries.equals(metadata.auditLogEntries);
        }

        public final int hashCode() {
            return this.auditLogEntries.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.shadowStoreClass.hashCode() + (this.mainStoreClass.hashCode() * 31)) * 31, 31, 9L);
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            Pair pair = new Pair("mainStoreClass", this.mainStoreClass.getSimpleName());
            Pair pair2 = new Pair("shadowStoreClass", this.shadowStoreClass.getSimpleName());
            Pair pair3 = new Pair("bootstrapMigrationVersion", 9L);
            ArrayList arrayList = this.auditLogEntries;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AuditLogEntry) it.next()).toString());
            }
            return MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair("auditLogEntries", arrayList2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(mainStoreClass=");
            sb.append(this.mainStoreClass);
            sb.append(", shadowStoreClass=");
            sb.append(this.shadowStoreClass);
            sb.append(", bootstrapMigrationVersion=9, auditLogEntries=");
            return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.auditLogEntries);
        }
    }

    public SyncRangeShadowException(String str, Throwable th, Metadata metadata) {
        this.cause = th;
        this.metadata = metadata;
        String simpleName = metadata.mainStoreClass.getSimpleName();
        String simpleName2 = metadata.shadowStoreClass.getSimpleName();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    ", str, ":\n    - Main store: ", simpleName, "\n    - Shadow store: ");
        m.append(simpleName2);
        m.append("\n    - Bootstrap Migration Version: 9\n  ");
        this.message = StringsKt__IndentKt.replaceIndent(m.toString());
        this.groupingIdentifier = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SyncRangeShadowException:", str, ":9");
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
