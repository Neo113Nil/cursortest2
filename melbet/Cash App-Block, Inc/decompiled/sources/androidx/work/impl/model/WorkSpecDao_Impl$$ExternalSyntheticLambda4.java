package androidx.work.impl.model;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteProgram;
import coil3.size.SizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class WorkSpecDao_Impl$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ WorkSpecDao_Impl$$ExternalSyntheticLambda4(int i, String str) {
        this.$r8$classId = 0;
        this.f$1 = i;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteStatement prepare;
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj2 = this.f$2;
        switch (i) {
            case 0:
                String str = (String) obj2;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    prepare.bindLong(1, i2);
                    prepare.bindText(2, str);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 1:
                String str2 = (String) obj2;
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                prepare = sQLiteConnection2.prepare("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    prepare.bindText(1, str2);
                    prepare.bindLong(2, i2);
                    return prepare.step() ? new SystemIdInfo(prepare.getText(SizeKt.getColumnIndexOrThrow(prepare, "work_spec_id")), (int) prepare.getLong(SizeKt.getColumnIndexOrThrow(prepare, "generation")), (int) prepare.getLong(SizeKt.getColumnIndexOrThrow(prepare, "system_id"))) : null;
                } finally {
                }
            case 2:
                String str3 = (String) obj2;
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                prepare = sQLiteConnection3.prepare("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    prepare.bindText(1, str3);
                    prepare.bindLong(2, i2);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 3:
                String str4 = (String) obj2;
                SupportSQLiteProgram supportSQLiteProgram = (SupportSQLiteProgram) obj;
                supportSQLiteProgram.getClass();
                int i3 = i2 + 1;
                if (str4 == null) {
                    supportSQLiteProgram.bindNull(i3);
                } else {
                    supportSQLiteProgram.bindString(i3, str4);
                }
                return Unit.INSTANCE;
            default:
                Long l = (Long) obj2;
                SupportSQLiteProgram supportSQLiteProgram2 = (SupportSQLiteProgram) obj;
                supportSQLiteProgram2.getClass();
                int i4 = i2 + 1;
                if (l == null) {
                    supportSQLiteProgram2.bindNull(i4);
                } else {
                    supportSQLiteProgram2.bindLong(i4, l.longValue());
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WorkSpecDao_Impl$$ExternalSyntheticLambda4(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$1 = i;
    }
}
