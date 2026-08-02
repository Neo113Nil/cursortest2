package androidx.compose.foundation;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.TransactorKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.util.Strings;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ImageKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ImageKt$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteStatement prepare;
        WorkInfo.State state;
        WorkSpec workSpec;
        Boolean bool;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 5);
                return Unit.INSTANCE;
            case 1:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (prepare.step()) {
                        arrayList.add(prepare.getText(0));
                    }
                    return arrayList;
                } finally {
                }
            case 2:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                prepare = sQLiteConnection2.prepare("SELECT long_value FROM Preference where `key`=?");
                try {
                    prepare.bindText(1, str);
                    return (!prepare.step() || prepare.isNull(0)) ? null : Long.valueOf(prepare.getLong(0));
                } finally {
                }
            case 3:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                prepare = sQLiteConnection3.prepare("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 4:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                prepare = sQLiteConnection4.prepare("DELETE from WorkProgress where work_spec_id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 5:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                prepare = sQLiteConnection5.prepare("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (prepare.step()) {
                        String text = prepare.getText(0);
                        WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(1));
                        text.getClass();
                        WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                        idAndState.id = text;
                        idAndState.state = intToState;
                        arrayList2.add(idAndState);
                    }
                    return arrayList2;
                } finally {
                }
            case 6:
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                prepare = sQLiteConnection6.prepare("SELECT state FROM workspec WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    if (prepare.step()) {
                        Integer valueOf = prepare.isNull(0) ? null : Integer.valueOf((int) prepare.getLong(0));
                        if (valueOf != null) {
                            state = TransactorKt.intToState(valueOf.intValue());
                            return state;
                        }
                    }
                    state = null;
                    return state;
                } finally {
                }
            case 7:
                SQLiteConnection sQLiteConnection7 = (SQLiteConnection) obj;
                sQLiteConnection7.getClass();
                prepare = sQLiteConnection7.prepare("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (prepare.step()) {
                        arrayList3.add(prepare.getText(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 8:
                SQLiteConnection sQLiteConnection8 = (SQLiteConnection) obj;
                sQLiteConnection8.getClass();
                prepare = sQLiteConnection8.prepare("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    int totalChangedRows = DimensionKt.getTotalChangedRows(sQLiteConnection8);
                    prepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            case 9:
                SQLiteConnection sQLiteConnection9 = (SQLiteConnection) obj;
                sQLiteConnection9.getClass();
                prepare = sQLiteConnection9.prepare("SELECT * FROM workspec WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    int columnIndexOrThrow = SizeKt.getColumnIndexOrThrow(prepare, "id");
                    int columnIndexOrThrow2 = SizeKt.getColumnIndexOrThrow(prepare, "state");
                    int columnIndexOrThrow3 = SizeKt.getColumnIndexOrThrow(prepare, "worker_class_name");
                    int columnIndexOrThrow4 = SizeKt.getColumnIndexOrThrow(prepare, "input_merger_class_name");
                    int columnIndexOrThrow5 = SizeKt.getColumnIndexOrThrow(prepare, "input");
                    int columnIndexOrThrow6 = SizeKt.getColumnIndexOrThrow(prepare, "output");
                    int columnIndexOrThrow7 = SizeKt.getColumnIndexOrThrow(prepare, "initial_delay");
                    int columnIndexOrThrow8 = SizeKt.getColumnIndexOrThrow(prepare, "interval_duration");
                    int columnIndexOrThrow9 = SizeKt.getColumnIndexOrThrow(prepare, "flex_duration");
                    int columnIndexOrThrow10 = SizeKt.getColumnIndexOrThrow(prepare, "run_attempt_count");
                    int columnIndexOrThrow11 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_policy");
                    int columnIndexOrThrow12 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
                    int columnIndexOrThrow13 = SizeKt.getColumnIndexOrThrow(prepare, "last_enqueue_time");
                    int columnIndexOrThrow14 = SizeKt.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
                    int columnIndexOrThrow15 = SizeKt.getColumnIndexOrThrow(prepare, "schedule_requested_at");
                    int columnIndexOrThrow16 = SizeKt.getColumnIndexOrThrow(prepare, "run_in_foreground");
                    int columnIndexOrThrow17 = SizeKt.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
                    int columnIndexOrThrow18 = SizeKt.getColumnIndexOrThrow(prepare, "period_count");
                    int columnIndexOrThrow19 = SizeKt.getColumnIndexOrThrow(prepare, "generation");
                    int columnIndexOrThrow20 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
                    int columnIndexOrThrow21 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
                    int columnIndexOrThrow22 = SizeKt.getColumnIndexOrThrow(prepare, "stop_reason");
                    int columnIndexOrThrow23 = SizeKt.getColumnIndexOrThrow(prepare, "trace_tag");
                    int columnIndexOrThrow24 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
                    int columnIndexOrThrow25 = SizeKt.getColumnIndexOrThrow(prepare, "required_network_type");
                    int columnIndexOrThrow26 = SizeKt.getColumnIndexOrThrow(prepare, "required_network_request");
                    int columnIndexOrThrow27 = SizeKt.getColumnIndexOrThrow(prepare, "requires_charging");
                    int columnIndexOrThrow28 = SizeKt.getColumnIndexOrThrow(prepare, "requires_device_idle");
                    int columnIndexOrThrow29 = SizeKt.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
                    int columnIndexOrThrow30 = SizeKt.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
                    int columnIndexOrThrow31 = SizeKt.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
                    int columnIndexOrThrow32 = SizeKt.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
                    int columnIndexOrThrow33 = SizeKt.getColumnIndexOrThrow(prepare, "content_uri_triggers");
                    if (prepare.step()) {
                        String text2 = prepare.getText(columnIndexOrThrow);
                        WorkInfo.State intToState2 = TransactorKt.intToState((int) prepare.getLong(columnIndexOrThrow2));
                        String text3 = prepare.getText(columnIndexOrThrow3);
                        String text4 = prepare.getText(columnIndexOrThrow4);
                        byte[] blob = prepare.getBlob(columnIndexOrThrow5);
                        Data data = Data.EMPTY;
                        Data fromByteArray = Strings.fromByteArray(blob);
                        Data fromByteArray2 = Strings.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                        long j = prepare.getLong(columnIndexOrThrow7);
                        long j2 = prepare.getLong(columnIndexOrThrow8);
                        long j3 = prepare.getLong(columnIndexOrThrow9);
                        int i2 = (int) prepare.getLong(columnIndexOrThrow10);
                        BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                        long j4 = prepare.getLong(columnIndexOrThrow12);
                        long j5 = prepare.getLong(columnIndexOrThrow13);
                        long j6 = prepare.getLong(columnIndexOrThrow14);
                        long j7 = prepare.getLong(columnIndexOrThrow15);
                        boolean z = ((int) prepare.getLong(columnIndexOrThrow16)) != 0;
                        OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(columnIndexOrThrow17));
                        int i3 = (int) prepare.getLong(columnIndexOrThrow18);
                        int i4 = (int) prepare.getLong(columnIndexOrThrow19);
                        long j8 = prepare.getLong(columnIndexOrThrow20);
                        int i5 = (int) prepare.getLong(columnIndexOrThrow21);
                        int i6 = (int) prepare.getLong(columnIndexOrThrow22);
                        String text5 = prepare.isNull(columnIndexOrThrow23) ? null : prepare.getText(columnIndexOrThrow23);
                        Integer valueOf2 = prepare.isNull(columnIndexOrThrow24) ? null : Integer.valueOf((int) prepare.getLong(columnIndexOrThrow24));
                        if (valueOf2 != null) {
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        workSpec = new WorkSpec(text2, intToState2, text3, text4, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(columnIndexOrThrow26)), TransactorKt.intToNetworkType((int) prepare.getLong(columnIndexOrThrow25)), ((int) prepare.getLong(columnIndexOrThrow27)) != 0, ((int) prepare.getLong(columnIndexOrThrow28)) != 0, ((int) prepare.getLong(columnIndexOrThrow29)) != 0, ((int) prepare.getLong(columnIndexOrThrow30)) != 0, prepare.getLong(columnIndexOrThrow31), prepare.getLong(columnIndexOrThrow32), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(columnIndexOrThrow33))), i2, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i3, i4, j8, i5, i6, text5, bool);
                    } else {
                        workSpec = null;
                    }
                    return workSpec;
                } finally {
                }
            case 10:
                SQLiteConnection sQLiteConnection10 = (SQLiteConnection) obj;
                sQLiteConnection10.getClass();
                prepare = sQLiteConnection10.prepare("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (prepare.step()) {
                        byte[] blob2 = prepare.getBlob(0);
                        Data data2 = Data.EMPTY;
                        arrayList4.add(Strings.fromByteArray(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 11:
                SQLiteConnection sQLiteConnection11 = (SQLiteConnection) obj;
                sQLiteConnection11.getClass();
                prepare = sQLiteConnection11.prepare("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    int totalChangedRows2 = DimensionKt.getTotalChangedRows(sQLiteConnection11);
                    prepare.close();
                    return Integer.valueOf(totalChangedRows2);
                } finally {
                }
            case 12:
                SQLiteConnection sQLiteConnection12 = (SQLiteConnection) obj;
                sQLiteConnection12.getClass();
                prepare = sQLiteConnection12.prepare("DELETE FROM workspec WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 13:
                SQLiteConnection sQLiteConnection13 = (SQLiteConnection) obj;
                sQLiteConnection13.getClass();
                prepare = sQLiteConnection13.prepare("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (prepare.step()) {
                        arrayList5.add(prepare.getText(0));
                    }
                    return arrayList5;
                } finally {
                }
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver2, str);
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 15:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str);
                return Unit.INSTANCE;
            case 16:
                SessionState sessionState = (SessionState) obj;
                sessionState.getClass();
                if (!(sessionState instanceof SessionState.Initiated)) {
                    return null;
                }
                SessionState.Initiated initiated = (SessionState.Initiated) sessionState;
                return MapsKt__MapsKt.mapOf(new Pair("User-Agent", str), new Pair("Authorization", CameraSelector$$ExternalSyntheticOutline0.m("App ", initiated.getAppToken(), "-", initiated.getSessionToken())));
            default:
                FilesKt__FileReadWriteKt.writeText$default((File) obj, str);
                return Unit.INSTANCE;
        }
    }
}
