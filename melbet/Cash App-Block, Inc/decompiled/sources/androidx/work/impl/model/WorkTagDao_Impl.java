package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.room.TransactorKt;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkTagDao_Impl {
    public final RoomDatabase __db;
    public final AnonymousClass1 __insertAdapterOfWorkTag = new AnonymousClass1(0);

    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends Countries {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.util.cash.Countries
        public final void bind(SQLiteStatement sQLiteStatement, Object obj) {
            int i;
            int i2;
            byte[] byteArray;
            byte[] byteArray2;
            int i3 = 3;
            switch (this.$r8$classId) {
                case 0:
                    WorkTag workTag = (WorkTag) obj;
                    sQLiteStatement.getClass();
                    workTag.getClass();
                    sQLiteStatement.bindText(1, workTag.tag);
                    sQLiteStatement.bindText(2, workTag.workSpecId);
                    return;
                case 1:
                    Dependency dependency = (Dependency) obj;
                    sQLiteStatement.getClass();
                    dependency.getClass();
                    sQLiteStatement.bindText(1, dependency.getWorkSpecId());
                    sQLiteStatement.bindText(2, dependency.getPrerequisiteId());
                    return;
                case 2:
                    Preference preference = (Preference) obj;
                    sQLiteStatement.getClass();
                    preference.getClass();
                    sQLiteStatement.bindText(1, preference.key);
                    sQLiteStatement.bindLong(2, preference.value.longValue());
                    return;
                case 3:
                    SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
                    sQLiteStatement.getClass();
                    systemIdInfo.getClass();
                    sQLiteStatement.bindText(1, systemIdInfo.workSpecId);
                    sQLiteStatement.bindLong(2, systemIdInfo.generation);
                    sQLiteStatement.bindLong(3, systemIdInfo.systemId);
                    return;
                case 4:
                    WorkName workName = (WorkName) obj;
                    sQLiteStatement.getClass();
                    workName.getClass();
                    sQLiteStatement.bindText(1, workName.name);
                    sQLiteStatement.bindText(2, workName.workSpecId);
                    return;
                case 5:
                    WorkProgress workProgress = (WorkProgress) obj;
                    sQLiteStatement.getClass();
                    workProgress.getClass();
                    sQLiteStatement.bindText(1, workProgress.getWorkSpecId());
                    Data data = Data.EMPTY;
                    sQLiteStatement.bindBlob(2, Strings.toByteArrayInternalV1(workProgress.getProgress()));
                    return;
                default:
                    WorkSpec workSpec = (WorkSpec) obj;
                    sQLiteStatement.getClass();
                    workSpec.getClass();
                    sQLiteStatement.bindText(1, workSpec.id);
                    sQLiteStatement.bindLong(2, TransactorKt.stateToInt(workSpec.state));
                    sQLiteStatement.bindText(3, workSpec.workerClassName);
                    sQLiteStatement.bindText(4, workSpec.inputMergerClassName);
                    Data data2 = Data.EMPTY;
                    sQLiteStatement.bindBlob(5, Strings.toByteArrayInternalV1(workSpec.input));
                    sQLiteStatement.bindBlob(6, Strings.toByteArrayInternalV1(workSpec.output));
                    sQLiteStatement.bindLong(7, workSpec.initialDelay);
                    sQLiteStatement.bindLong(8, workSpec.intervalDuration);
                    sQLiteStatement.bindLong(9, workSpec.flexDuration);
                    sQLiteStatement.bindLong(10, workSpec.runAttemptCount);
                    BackoffPolicy backoffPolicy = workSpec.backoffPolicy;
                    backoffPolicy.getClass();
                    int ordinal = backoffPolicy.ordinal();
                    if (ordinal == 0) {
                        i = 0;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        i = 1;
                    }
                    sQLiteStatement.bindLong(11, i);
                    sQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                    sQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                    sQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                    sQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                    sQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
                    OutOfQuotaPolicy outOfQuotaPolicy = workSpec.outOfQuotaPolicy;
                    outOfQuotaPolicy.getClass();
                    int ordinal2 = outOfQuotaPolicy.ordinal();
                    if (ordinal2 == 0) {
                        i2 = 0;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        i2 = 1;
                    }
                    sQLiteStatement.bindLong(17, i2);
                    sQLiteStatement.bindLong(18, workSpec.periodCount);
                    sQLiteStatement.bindLong(19, workSpec.generation);
                    sQLiteStatement.bindLong(20, workSpec.nextScheduleTimeOverride);
                    sQLiteStatement.bindLong(21, workSpec.nextScheduleTimeOverrideGeneration);
                    sQLiteStatement.bindLong(22, workSpec.stopReason);
                    String str = workSpec.traceTag;
                    if (str == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, str);
                    }
                    Boolean bool = workSpec.backOffOnSystemInterruptions;
                    if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindLong(24, r9.intValue());
                    }
                    Constraints constraints = workSpec.constraints;
                    NetworkType networkType = constraints.requiredNetworkType;
                    networkType.getClass();
                    int ordinal3 = networkType.ordinal();
                    if (ordinal3 == 0) {
                        i3 = 0;
                    } else if (ordinal3 == 1) {
                        i3 = 1;
                    } else if (ordinal3 == 2) {
                        i3 = 2;
                    } else if (ordinal3 != 3) {
                        if (ordinal3 == 4) {
                            i3 = 4;
                        } else {
                            if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                                OptionalProvider$$ExternalSyntheticLambda0.m$2("Could not convert ", networkType, " to int");
                                return;
                            }
                            i3 = 5;
                        }
                    }
                    sQLiteStatement.bindLong(25, i3);
                    NetworkRequestCompat networkRequestCompat = constraints.requiredNetworkRequestCompat;
                    networkRequestCompat.getClass();
                    NetworkRequest networkRequest = (NetworkRequest) networkRequestCompat.wrapped;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                int[] transportTypesCompat = NetworkRequest28.getTransportTypesCompat(networkRequest);
                                int[] capabilitiesCompat = NetworkRequest28.getCapabilitiesCompat(networkRequest);
                                objectOutputStream.writeInt(transportTypesCompat.length);
                                for (int i4 : transportTypesCompat) {
                                    objectOutputStream.writeInt(i4);
                                }
                                objectOutputStream.writeInt(capabilitiesCompat.length);
                                for (int i5 : capabilitiesCompat) {
                                    objectOutputStream.writeInt(i5);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } finally {
                            }
                        } finally {
                        }
                    }
                    sQLiteStatement.bindBlob(26, byteArray);
                    sQLiteStatement.bindLong(27, constraints.requiresCharging ? 1L : 0L);
                    sQLiteStatement.bindLong(28, constraints.requiresDeviceIdle ? 1L : 0L);
                    sQLiteStatement.bindLong(29, constraints.requiresBatteryNotLow ? 1L : 0L);
                    sQLiteStatement.bindLong(30, constraints.requiresStorageNotLow ? 1L : 0L);
                    sQLiteStatement.bindLong(31, constraints.contentTriggerUpdateDelayMillis);
                    sQLiteStatement.bindLong(32, constraints.contentTriggerMaxDelayMillis);
                    Set<Constraints.ContentUriTrigger> set = constraints.contentUriTriggers;
                    set.getClass();
                    if (set.isEmpty()) {
                        byteArray2 = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                            try {
                                objectOutputStream2.writeInt(set.size());
                                for (Constraints.ContentUriTrigger contentUriTrigger : set) {
                                    objectOutputStream2.writeUTF(contentUriTrigger.getUri().toString());
                                    objectOutputStream2.writeBoolean(contentUriTrigger.isTriggeredForDescendants());
                                }
                                objectOutputStream2.close();
                                byteArrayOutputStream2.close();
                                byteArray2 = byteArrayOutputStream2.toByteArray();
                                byteArray2.getClass();
                            } finally {
                            }
                        } finally {
                        }
                    }
                    sQLiteStatement.bindBlob(33, byteArray2);
                    return;
            }
        }

        @Override // com.squareup.util.cash.Countries
        public final String createQuery() {
            switch (this.$r8$classId) {
                case 0:
                    return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                case 1:
                    return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                case 2:
                    return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                case 3:
                    return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                case 4:
                    return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                case 5:
                    return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
                default:
                    return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }
    }

    public WorkTagDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }
}
