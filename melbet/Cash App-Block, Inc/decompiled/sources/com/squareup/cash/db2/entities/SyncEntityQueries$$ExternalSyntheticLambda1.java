package com.squareup.cash.db2.entities;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.InstrumentQueries;
import kotlin.jvm.functions.Function1;
import okio.internal.ResourceFileSystem;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncEntityQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ SyncEntityQueries$$ExternalSyntheticLambda1(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                SyncEntityQueries$forEntityIdAndType$2 syncEntityQueries$forEntityIdAndType$2 = SyncEntityQueries$forEntityIdAndType$2.INSTANCE;
                break;
            case 2:
                SyncEntityQueries$selectAll$2 syncEntityQueries$selectAll$2 = SyncEntityQueries$selectAll$2.INSTANCE;
                break;
            default:
                SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l;
        Integer num;
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                ((ResourceFileSystem.Companion) instrumentQueries.instrumentAdapter).getClass();
                Long l2 = androidCursor.getLong(1);
                l2.getClass();
                Integer valueOf = Integer.valueOf((int) l2.longValue());
                byte[] bytes = androidCursor.getBytes(2);
                bytes.getClass();
                Long l3 = androidCursor.getLong(3);
                Long l4 = androidCursor.getLong(4);
                Integer valueOf2 = l4 != null ? Integer.valueOf((int) l4.longValue()) : null;
                Long l5 = androidCursor.getLong(5);
                Long l6 = androidCursor.getLong(6);
                l6.getClass();
                return syncEntityQueries$selectAllWithValueType$2.invoke(m1431m, valueOf, bytes, l3, valueOf2, l5, Integer.valueOf((int) l6.longValue()));
            case 1:
                SyncEntityQueries$forEntityIdAndType$2 syncEntityQueries$forEntityIdAndType$2 = SyncEntityQueries$forEntityIdAndType$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                ((ResourceFileSystem.Companion) instrumentQueries.instrumentAdapter).getClass();
                Long l7 = androidCursor2.getLong(1);
                l7.getClass();
                Integer valueOf3 = Integer.valueOf((int) l7.longValue());
                byte[] bytes2 = androidCursor2.getBytes(2);
                bytes2.getClass();
                Long l8 = androidCursor2.getLong(3);
                Long l9 = androidCursor2.getLong(4);
                if (l9 != null) {
                    num = Integer.valueOf((int) l9.longValue());
                    l = l8;
                } else {
                    l = l8;
                    num = null;
                }
                Long l10 = androidCursor2.getLong(5);
                Long l11 = androidCursor2.getLong(6);
                l11.getClass();
                return syncEntityQueries$forEntityIdAndType$2.invoke(m1431m2, valueOf3, bytes2, l, num, l10, Integer.valueOf((int) l11.longValue()));
            default:
                SyncEntityQueries$selectAll$2 syncEntityQueries$selectAll$2 = SyncEntityQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                ((ResourceFileSystem.Companion) instrumentQueries.instrumentAdapter).getClass();
                Long l12 = androidCursor3.getLong(1);
                l12.getClass();
                Integer valueOf4 = Integer.valueOf((int) l12.longValue());
                byte[] bytes3 = androidCursor3.getBytes(2);
                bytes3.getClass();
                Long l13 = androidCursor3.getLong(3);
                Long l14 = androidCursor3.getLong(4);
                Integer valueOf5 = l14 != null ? Integer.valueOf((int) l14.longValue()) : null;
                Long l15 = androidCursor3.getLong(5);
                Long l16 = androidCursor3.getLong(6);
                l16.getClass();
                return syncEntityQueries$selectAll$2.invoke(m1431m3, valueOf4, bytes3, l13, valueOf5, l15, Integer.valueOf((int) l16.longValue()));
        }
    }
}
