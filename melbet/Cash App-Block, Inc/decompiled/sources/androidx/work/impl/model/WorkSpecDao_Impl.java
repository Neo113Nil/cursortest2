package androidx.work.impl.model;

import androidx.collection.ArrayMap;
import androidx.collection.IndexBasedArrayIterator;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkTagDao_Impl;
import coil3.size.SizeKt;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkSpecDao_Impl {
    public final RoomDatabase __db;
    public final WorkTagDao_Impl.AnonymousClass1 __insertAdapterOfWorkSpec = new WorkTagDao_Impl.AnonymousClass1(6);

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    public final void __fetchRelationshipWorkProgressAsandroidxWorkData(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayMap.KeySet keySet = (ArrayMap.KeySet) arrayMap.keySet();
        ArrayMap arrayMap2 = ArrayMap.this;
        if (arrayMap2.isEmpty()) {
            return;
        }
        if (arrayMap.size > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, new WorkSpecDao_Impl$$ExternalSyntheticLambda20(this, sQLiteConnection, 0));
            return;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(arrayMap2.size, m);
        m.append(")");
        SQLiteStatement prepare = sQLiteConnection.prepare(m.toString());
        Iterator it = keySet.iterator();
        int i = 1;
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
            if (!indexBasedArrayIterator.hasNext()) {
                try {
                    break;
                } finally {
                    prepare.close();
                }
            } else {
                prepare.bindText(i, (String) indexBasedArrayIterator.next());
                i++;
            }
        }
        prepare.getClass();
        int columnIndexOf = SizeKt.columnIndexOf(prepare, "work_spec_id");
        if (columnIndexOf == -1) {
            return;
        }
        while (prepare.step()) {
            List list = (List) arrayMap.get(prepare.getText(columnIndexOf));
            if (list != null) {
                byte[] blob = prepare.getBlob(0);
                Data data = Data.EMPTY;
                list.add(Strings.fromByteArray(blob));
            }
        }
    }

    public final void __fetchRelationshipWorkTagAsjavaLangString(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayMap.KeySet keySet = (ArrayMap.KeySet) arrayMap.keySet();
        ArrayMap arrayMap2 = ArrayMap.this;
        if (arrayMap2.isEmpty()) {
            return;
        }
        if (arrayMap.size > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, new WorkSpecDao_Impl$$ExternalSyntheticLambda20(this, sQLiteConnection, 1));
            return;
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(arrayMap2.size, m);
        m.append(")");
        SQLiteStatement prepare = sQLiteConnection.prepare(m.toString());
        Iterator it = keySet.iterator();
        int i = 1;
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
            if (!indexBasedArrayIterator.hasNext()) {
                try {
                    break;
                } finally {
                    prepare.close();
                }
            } else {
                prepare.bindText(i, (String) indexBasedArrayIterator.next());
                i++;
            }
        }
        prepare.getClass();
        int columnIndexOf = SizeKt.columnIndexOf(prepare, "work_spec_id");
        if (columnIndexOf == -1) {
            return;
        }
        while (prepare.step()) {
            List list = (List) arrayMap.get(prepare.getText(columnIndexOf));
            if (list != null) {
                list.add(prepare.getText(0));
            }
        }
    }

    public final WorkInfo.State getState(String str) {
        str.getClass();
        return (WorkInfo.State) DBUtil.performBlocking(this.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 6));
    }

    public final WorkSpec getWorkSpec(String str) {
        str.getClass();
        return (WorkSpec) DBUtil.performBlocking(this.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 9));
    }

    public final void markWorkSpecScheduled(long j, String str) {
        str.getClass();
        ((Number) DBUtil.performBlocking(this.__db, false, true, new WorkSpecDao_Impl$$ExternalSyntheticLambda13(j, str, 0))).intValue();
    }

    public final void resetWorkSpecNextScheduleTimeOverride(int i, String str) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new WorkSpecDao_Impl$$ExternalSyntheticLambda4(str, i, 2));
    }

    public final void setLastEnqueueTime(long j, String str) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new WorkSpecDao_Impl$$ExternalSyntheticLambda13(j, str, 1));
    }

    public final void setState(WorkInfo.State state, String str) {
        str.getClass();
        ((Number) DBUtil.performBlocking(this.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(17, state, str))).intValue();
    }

    public final void setStopReason(int i, String str) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new WorkSpecDao_Impl$$ExternalSyntheticLambda4(i, str));
    }
}
