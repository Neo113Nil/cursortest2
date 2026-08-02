package androidx.work.impl.model;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import coil3.size.DimensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class WorkSpecDao_Impl$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ WorkSpecDao_Impl$$ExternalSyntheticLambda13(long j, String str, int i) {
        this.$r8$classId = i;
        this.f$1 = j;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteStatement prepare;
        int i = this.$r8$classId;
        String str = this.f$2;
        long j = this.f$1;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    prepare.bindLong(1, j);
                    prepare.bindText(2, str);
                    prepare.step();
                    int totalChangedRows = DimensionKt.getTotalChangedRows(sQLiteConnection);
                    prepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            default:
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    prepare.bindLong(1, j);
                    prepare.bindText(2, str);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
        }
    }
}
