package com.squareup.cash.clientsync.errors;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/clientsync/errors/SyncRangeShadowDivergence;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncRangeShadowDivergence extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String groupingIdentifier;
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final ArrayList auditLogEntries;
        public final int commonRanges;
        public final int mainRanges;
        public final int mainRangesExclusive;
        public final KClass mainStoreClass;
        public final int shadowRanges;
        public final int shadowRangesExclusive;
        public final KClass shadowStoreClass;

        public Metadata(KClass kClass, KClass kClass2, ArrayList arrayList, int i, int i2, int i3, int i4, int i5) {
            this.mainStoreClass = kClass;
            this.shadowStoreClass = kClass2;
            this.auditLogEntries = arrayList;
            this.mainRanges = i;
            this.shadowRanges = i2;
            this.commonRanges = i3;
            this.mainRangesExclusive = i4;
            this.shadowRangesExclusive = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return this.mainStoreClass.equals(metadata.mainStoreClass) && this.shadowStoreClass.equals(metadata.shadowStoreClass) && this.auditLogEntries.equals(metadata.auditLogEntries) && this.mainRanges == metadata.mainRanges && this.shadowRanges == metadata.shadowRanges && this.commonRanges == metadata.commonRanges && this.mainRangesExclusive == metadata.mainRangesExclusive && this.shadowRangesExclusive == metadata.shadowRangesExclusive;
        }

        public final int hashCode() {
            return Integer.hashCode(this.shadowRangesExclusive) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mainRangesExclusive, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.commonRanges, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.shadowRanges, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mainRanges, CameraState$Type$EnumUnboxingLocalUtility.m(this.auditLogEntries, Recorder$$ExternalSyntheticOutline2.m((this.shadowStoreClass.hashCode() + (this.mainStoreClass.hashCode() * 31)) * 31, 31, 9L), 31), 31), 31), 31), 31);
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
            return MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair("auditLogEntries", arrayList2), new Pair("mainRanges", Integer.valueOf(this.mainRanges)), new Pair("shadowRanges", Integer.valueOf(this.shadowRanges)), new Pair("commonRanges", Integer.valueOf(this.commonRanges)), new Pair("mainRangesExclusive", Integer.valueOf(this.mainRangesExclusive)), new Pair("shadowRangesExclusive", Integer.valueOf(this.shadowRangesExclusive)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(mainStoreClass=");
            sb.append(this.mainStoreClass);
            sb.append(", shadowStoreClass=");
            sb.append(this.shadowStoreClass);
            sb.append(", bootstrapMigrationVersion=9, auditLogEntries=");
            sb.append(this.auditLogEntries);
            sb.append(", mainRanges=");
            sb.append(this.mainRanges);
            sb.append(", shadowRanges=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.shadowRanges, this.commonRanges, ", commonRanges=", ", mainRangesExclusive=", sb);
            return Recorder$$ExternalSyntheticOutline1.m(this.mainRangesExclusive, this.shadowRangesExclusive, ", shadowRangesExclusive=", ")", sb);
        }
    }

    public SyncRangeShadowDivergence(Metadata metadata) {
        this.metadata = metadata;
        String simpleName = metadata.mainStoreClass.getSimpleName();
        String simpleName2 = metadata.shadowStoreClass.getSimpleName();
        int i = metadata.mainRanges;
        int i2 = metadata.shadowRanges;
        int i3 = metadata.commonRanges;
        int i4 = metadata.mainRangesExclusive;
        int i5 = metadata.shadowRangesExclusive;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    The main sync range store and its shadow contained different sync ranges:\n    - Main store: ", simpleName, "\n    - Shadow store: ", simpleName2, "\n    - Bootstrap Migration Version: 9\n    - ");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, " ranges were present in the main store\n    - ", " ranges were present in the shadow store\n    - ", m);
        Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, " ranges were present in both stores\n    - ", " ranges were only present in the main store\n    - ", m);
        m.append(i5);
        m.append(" ranges were only present in the shadow store\n  ");
        this.message = StringsKt__IndentKt.replaceIndent(m.toString());
        this.groupingIdentifier = "SyncRangeShadowDivergence:9";
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
