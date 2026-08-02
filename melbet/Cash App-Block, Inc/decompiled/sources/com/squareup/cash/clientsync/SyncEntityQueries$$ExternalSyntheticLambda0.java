package com.squareup.cash.clientsync;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncEntityQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalTabContentQueries f$1;

    public /* synthetic */ SyncEntityQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                SyncEntityQueries$select$2 syncEntityQueries$select$2 = SyncEntityQueries$select$2.INSTANCE;
                break;
            case 2:
                SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
                break;
            case 3:
                SyncEntityQueries$selectAll$2 syncEntityQueries$selectAll$2 = SyncEntityQueries$selectAll$2.INSTANCE;
                break;
            default:
                SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
                break;
        }
        this.f$1 = localTabContentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        SyncValueType syncValueType;
        SyncEntityType syncEntityType;
        SyncTopic syncTopic;
        String str2;
        SyncValueType syncValueType2;
        SyncEntityType syncEntityType2;
        SyncTopic syncTopic2;
        String str3;
        SyncValueType syncValueType3;
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        switch (i) {
            case 0:
                SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                zzb zzbVar = (zzb) localTabContentQueries.local_tab_contentAdapter;
                zzbVar.getClass();
                Long l = androidCursor.getLong(0);
                l.getClass();
                SyncTopic syncTopic3 = new SyncTopic((int) l.longValue());
                String string2 = androidCursor.getString(1);
                string2.getClass();
                zzbVar.getClass();
                Long l2 = androidCursor.getLong(2);
                l2.getClass();
                SyncEntityType syncEntityType3 = new SyncEntityType((int) l2.longValue());
                byte[] bytes = androidCursor.getBytes(3);
                bytes.getClass();
                Long l3 = androidCursor.getLong(4);
                Long l4 = androidCursor.getLong(5);
                if (l4 != null) {
                    str = string2;
                    syncValueType = new SyncValueType((int) l4.longValue());
                    syncTopic = syncTopic3;
                    syncEntityType = syncEntityType3;
                } else {
                    str = string2;
                    syncValueType = null;
                    syncEntityType = syncEntityType3;
                    syncTopic = syncTopic3;
                }
                return syncEntityQueries$selectAllWithEntityType$2.invoke(syncTopic, str, syncEntityType, bytes, l3, syncValueType);
            case 1:
                SyncEntityQueries$select$2 syncEntityQueries$select$2 = SyncEntityQueries$select$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l5 = androidCursor2.getLong(0);
                l5.getClass();
                SyncTopic syncTopic4 = new SyncTopic((int) l5.longValue());
                String string3 = androidCursor2.getString(1);
                string3.getClass();
                ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l6 = androidCursor2.getLong(2);
                l6.getClass();
                SyncEntityType syncEntityType4 = new SyncEntityType((int) l6.longValue());
                byte[] bytes2 = androidCursor2.getBytes(3);
                bytes2.getClass();
                Long l7 = androidCursor2.getLong(4);
                Long l8 = androidCursor2.getLong(5);
                if (l8 != null) {
                    str2 = string3;
                    syncValueType2 = new SyncValueType((int) l8.longValue());
                    syncTopic2 = syncTopic4;
                    syncEntityType2 = syncEntityType4;
                } else {
                    str2 = string3;
                    syncValueType2 = null;
                    syncEntityType2 = syncEntityType4;
                    syncTopic2 = syncTopic4;
                }
                return syncEntityQueries$select$2.invoke(syncTopic2, str2, syncEntityType2, bytes2, l7, syncValueType2);
            case 2:
                SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                zzb zzbVar2 = (zzb) localTabContentQueries.local_tab_contentAdapter;
                zzbVar2.getClass();
                Long l9 = androidCursor3.getLong(0);
                l9.getClass();
                SyncTopic syncTopic5 = new SyncTopic((int) l9.longValue());
                String string4 = androidCursor3.getString(1);
                string4.getClass();
                zzbVar2.getClass();
                Long l10 = androidCursor3.getLong(2);
                l10.getClass();
                SyncEntityType syncEntityType5 = new SyncEntityType((int) l10.longValue());
                byte[] bytes3 = androidCursor3.getBytes(3);
                bytes3.getClass();
                Long l11 = androidCursor3.getLong(4);
                Long l12 = androidCursor3.getLong(5);
                if (l12 != null) {
                    SyncValueType syncValueType4 = new SyncValueType((int) l12.longValue());
                    str3 = string4;
                    syncValueType3 = syncValueType4;
                } else {
                    str3 = string4;
                    syncValueType3 = null;
                }
                return syncEntityQueries$selectAllWithValueType$2.invoke(syncTopic5, str3, syncEntityType5, bytes3, l11, syncValueType3);
            default:
                SyncEntityQueries$selectAll$2 syncEntityQueries$selectAll$2 = SyncEntityQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l13 = androidCursor4.getLong(0);
                l13.getClass();
                SyncTopic syncTopic6 = new SyncTopic((int) l13.longValue());
                String string5 = androidCursor4.getString(1);
                string5.getClass();
                ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l14 = androidCursor4.getLong(2);
                l14.getClass();
                SyncEntityType syncEntityType6 = new SyncEntityType((int) l14.longValue());
                byte[] bytes4 = androidCursor4.getBytes(3);
                bytes4.getClass();
                Long l15 = androidCursor4.getLong(4);
                Long l16 = androidCursor4.getLong(5);
                return syncEntityQueries$selectAll$2.invoke(syncTopic6, string5, syncEntityType6, bytes4, l15, l16 != null ? new SyncValueType((int) l16.longValue()) : null);
        }
    }
}
