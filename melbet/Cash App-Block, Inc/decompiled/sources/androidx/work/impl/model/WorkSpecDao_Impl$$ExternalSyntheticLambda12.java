package androidx.work.impl.model;

import androidx.room.TransactorKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequestCompat;
import coil3.size.SizeKt;
import com.squareup.cash.appmessages.views.TooltipContainerView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.util.Strings;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class WorkSpecDao_Impl$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$1;

    public /* synthetic */ WorkSpecDao_Impl$$ExternalSyntheticLambda12(int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        Integer valueOf;
        int i2 = this.$r8$classId;
        int i3 = this.f$1;
        switch (i2) {
            case 0:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    prepare.bindLong(1, i3);
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
                    ArrayList arrayList = new ArrayList();
                    while (prepare.step()) {
                        String text = prepare.getText(columnIndexOrThrow);
                        int i4 = columnIndexOrThrow13;
                        int i5 = columnIndexOrThrow14;
                        WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(columnIndexOrThrow2));
                        String text2 = prepare.getText(columnIndexOrThrow3);
                        String text3 = prepare.getText(columnIndexOrThrow4);
                        byte[] blob = prepare.getBlob(columnIndexOrThrow5);
                        Data data = Data.EMPTY;
                        Data fromByteArray = Strings.fromByteArray(blob);
                        Data fromByteArray2 = Strings.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                        long j = prepare.getLong(columnIndexOrThrow7);
                        long j2 = prepare.getLong(columnIndexOrThrow8);
                        long j3 = prepare.getLong(columnIndexOrThrow9);
                        int i6 = (int) prepare.getLong(columnIndexOrThrow10);
                        int i7 = columnIndexOrThrow;
                        int i8 = columnIndexOrThrow2;
                        BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                        long j4 = prepare.getLong(columnIndexOrThrow12);
                        long j5 = prepare.getLong(i4);
                        long j6 = prepare.getLong(i5);
                        int i9 = columnIndexOrThrow15;
                        long j7 = prepare.getLong(i9);
                        columnIndexOrThrow15 = i9;
                        int i10 = columnIndexOrThrow16;
                        int i11 = columnIndexOrThrow3;
                        boolean z = ((int) prepare.getLong(i10)) != 0;
                        int i12 = columnIndexOrThrow17;
                        int i13 = columnIndexOrThrow4;
                        OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(i12));
                        int i14 = columnIndexOrThrow18;
                        int i15 = (int) prepare.getLong(i14);
                        int i16 = columnIndexOrThrow19;
                        int i17 = (int) prepare.getLong(i16);
                        int i18 = columnIndexOrThrow20;
                        long j8 = prepare.getLong(i18);
                        int i19 = columnIndexOrThrow21;
                        int i20 = (int) prepare.getLong(i19);
                        columnIndexOrThrow21 = i19;
                        int i21 = columnIndexOrThrow22;
                        int i22 = (int) prepare.getLong(i21);
                        int i23 = columnIndexOrThrow23;
                        Boolean bool = null;
                        String text4 = prepare.isNull(i23) ? null : prepare.getText(i23);
                        int i24 = columnIndexOrThrow24;
                        if (prepare.isNull(i24)) {
                            i = i23;
                            columnIndexOrThrow22 = i21;
                            valueOf = null;
                        } else {
                            i = i23;
                            columnIndexOrThrow22 = i21;
                            valueOf = Integer.valueOf((int) prepare.getLong(i24));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        Boolean bool2 = bool;
                        int i25 = columnIndexOrThrow25;
                        NetworkType intToNetworkType = TransactorKt.intToNetworkType((int) prepare.getLong(i25));
                        int i26 = columnIndexOrThrow26;
                        NetworkRequestCompat networkRequest$work_runtime_release = TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i26));
                        int i27 = columnIndexOrThrow27;
                        boolean z2 = ((int) prepare.getLong(i27)) != 0;
                        int i28 = columnIndexOrThrow28;
                        boolean z3 = ((int) prepare.getLong(i28)) != 0;
                        int i29 = columnIndexOrThrow29;
                        boolean z4 = ((int) prepare.getLong(i29)) != 0;
                        columnIndexOrThrow29 = i29;
                        int i30 = columnIndexOrThrow30;
                        int i31 = columnIndexOrThrow31;
                        int i32 = columnIndexOrThrow32;
                        columnIndexOrThrow31 = i31;
                        int i33 = columnIndexOrThrow33;
                        arrayList.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i30)) != 0, prepare.getLong(i31), prepare.getLong(i32), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(i33))), i6, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i15, i17, j8, i20, i22, text4, bool2));
                        columnIndexOrThrow28 = i28;
                        columnIndexOrThrow4 = i13;
                        columnIndexOrThrow17 = i12;
                        columnIndexOrThrow18 = i14;
                        columnIndexOrThrow19 = i16;
                        columnIndexOrThrow20 = i18;
                        columnIndexOrThrow23 = i;
                        columnIndexOrThrow24 = i24;
                        columnIndexOrThrow25 = i25;
                        columnIndexOrThrow26 = i26;
                        columnIndexOrThrow27 = i27;
                        columnIndexOrThrow33 = i33;
                        columnIndexOrThrow32 = i32;
                        columnIndexOrThrow30 = i30;
                        columnIndexOrThrow = i7;
                        columnIndexOrThrow3 = i11;
                        columnIndexOrThrow13 = i4;
                        columnIndexOrThrow14 = i5;
                        columnIndexOrThrow2 = i8;
                        columnIndexOrThrow16 = i10;
                    }
                    prepare.close();
                    return arrayList;
                } catch (Throwable th) {
                    prepare.close();
                    throw th;
                }
            case 1:
                int i34 = TooltipContainerView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(i3);
            case 2:
                int i35 = TooltipContainerView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(i3);
            case 3:
                int i36 = TooltipContainerView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(i3);
            case 4:
                int i37 = TooltipContainerView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(i3);
            case 5:
                int i38 = TooltipContainerView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(i3);
            default:
                int i39 = TooltipContainerView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(i3);
        }
    }
}
