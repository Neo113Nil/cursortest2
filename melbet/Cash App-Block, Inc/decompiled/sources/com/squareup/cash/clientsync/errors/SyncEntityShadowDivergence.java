package com.squareup.cash.clientsync.errors;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientsync.errors.ClientSyncError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__IndentKt;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/clientsync/errors/SyncEntityShadowDivergence;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "com/squareup/util/android/Intents", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SyncEntityShadowDivergence extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String groupingIdentifier;
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final int commonEntities;
        public final int mainEntities;
        public final ArrayList mainExclusiveEntities;
        public final KClass mainStoreClass;
        public final String query;
        public final Map queryParams;
        public final int shadowEntities;
        public final ArrayList shadowExclusiveEntities;
        public final KClass shadowStoreClass;
        public final List unequalEntities;

        public Metadata(String str, Map map, KClass kClass, KClass kClass2, int i, int i2, int i3, List list, ArrayList arrayList, ArrayList arrayList2) {
            map.getClass();
            kClass.getClass();
            kClass2.getClass();
            list.getClass();
            this.query = str;
            this.queryParams = map;
            this.mainStoreClass = kClass;
            this.shadowStoreClass = kClass2;
            this.mainEntities = i;
            this.shadowEntities = i2;
            this.commonEntities = i3;
            this.unequalEntities = list;
            this.mainExclusiveEntities = arrayList;
            this.shadowExclusiveEntities = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return this.query.equals(metadata.query) && Intrinsics.areEqual(this.queryParams, metadata.queryParams) && Intrinsics.areEqual(this.mainStoreClass, metadata.mainStoreClass) && Intrinsics.areEqual(this.shadowStoreClass, metadata.shadowStoreClass) && this.mainEntities == metadata.mainEntities && this.shadowEntities == metadata.shadowEntities && this.commonEntities == metadata.commonEntities && Intrinsics.areEqual(this.unequalEntities, metadata.unequalEntities) && this.mainExclusiveEntities.equals(metadata.mainExclusiveEntities) && this.shadowExclusiveEntities.equals(metadata.shadowExclusiveEntities);
        }

        public final int hashCode() {
            return this.shadowExclusiveEntities.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.mainExclusiveEntities, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.commonEntities, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.shadowEntities, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mainEntities, Recorder$$ExternalSyntheticOutline2.m((this.shadowStoreClass.hashCode() + ((this.mainStoreClass.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.query.hashCode() * 31, this.queryParams, 31)) * 31)) * 31, 31, 9L), 31), 31), 31), 31, this.unequalEntities), 31);
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            return MapsKt__MapsKt.mapOf(new Pair("query", this.query), new Pair("queryParams", this.queryParams), new Pair("mainStoreClass", this.mainStoreClass.getSimpleName()), new Pair("shadowStoreClass", this.shadowStoreClass.getSimpleName()), new Pair("bootstrapMigrationVersion", 9L), new Pair("mainEntities", Integer.valueOf(this.mainEntities)), new Pair("shadowEntities", Integer.valueOf(this.shadowEntities)), new Pair("commonEntities", Integer.valueOf(this.commonEntities)), new Pair("unequalEntities", this.unequalEntities), new Pair("mainExclusiveEntities", this.mainExclusiveEntities), new Pair("shadowExclusiveEntities", this.shadowExclusiveEntities));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(query=");
            sb.append(this.query);
            sb.append(", queryParams=");
            sb.append(this.queryParams);
            sb.append(", mainStoreClass=");
            sb.append(this.mainStoreClass);
            sb.append(", shadowStoreClass=");
            sb.append(this.shadowStoreClass);
            sb.append(", bootstrapMigrationVersion=9, mainEntities=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.mainEntities, this.shadowEntities, ", shadowEntities=", ", commonEntities=", sb);
            sb.append(this.commonEntities);
            sb.append(", unequalEntities=");
            sb.append(this.unequalEntities);
            sb.append(", mainExclusiveEntities=");
            sb.append(this.mainExclusiveEntities);
            sb.append(", shadowExclusiveEntities=");
            sb.append(this.shadowExclusiveEntities);
            sb.append(")");
            return sb.toString();
        }
    }

    public SyncEntityShadowDivergence(Metadata metadata) {
        this.metadata = metadata;
        String str = metadata.query;
        Map map = metadata.queryParams;
        String simpleName = metadata.mainStoreClass.getSimpleName();
        String simpleName2 = metadata.shadowStoreClass.getSimpleName();
        int i = metadata.mainEntities;
        int i2 = metadata.shadowEntities;
        int i3 = metadata.commonEntities;
        List list = metadata.unequalEntities;
        int size = list.size();
        ArrayList arrayList = metadata.mainExclusiveEntities;
        int size2 = arrayList.size();
        ArrayList arrayList2 = metadata.shadowExclusiveEntities;
        int size3 = arrayList2.size();
        StringBuilder sb = new StringBuilder("\n    The main sync entity store and its shadow returned different results for ");
        sb.append(str);
        sb.append(":\n    - Query params: ");
        sb.append(map);
        sb.append("\n    - Main store: ");
        Boxes$$ExternalSyntheticOutline1.m(sb, simpleName, "\n    - Shadow store: ", simpleName2, "\n    - Bootstrap Migration Version: 9\n    - ");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, " entities were returned by in the main store\n    - ", " entities were returned by the shadow store\n    - ", sb);
        Recorder$$ExternalSyntheticOutline1.m105m(i3, size, " common entities were returned by both stores\n    - ", " entities were present in both stores with unequal protos\n        - ", sb);
        sb.append(list);
        sb.append("\n    - ");
        sb.append(size2);
        sb.append(" entities were only returned by the main store\n        - ");
        sb.append(arrayList);
        sb.append("\n    - ");
        sb.append(size3);
        sb.append(" entities were only returned by the shadow store\n        - ");
        sb.append(arrayList2);
        sb.append("\n  ");
        this.message = StringsKt__IndentKt.replaceIndent(sb.toString());
        this.groupingIdentifier = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SyncEntityShadowDivergence:", str, ":9");
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
