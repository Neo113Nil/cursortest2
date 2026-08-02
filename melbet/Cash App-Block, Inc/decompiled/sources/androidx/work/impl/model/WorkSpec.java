package androidx.work.impl.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger$LogcatLogger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class WorkSpec {
    public static final a$$ExternalSyntheticBUOutline0 WORK_INFO_MAPPER;
    public final Boolean backOffOnSystemInterruptions;
    public final long backoffDelayDuration;
    public final BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public final long flexDuration;
    public final int generation;
    public final String id;
    public long initialDelay;
    public Data input;
    public final String inputMergerClassName;
    public final long intervalDuration;
    public long lastEnqueueTime;
    public final long minimumRetentionDuration;
    public final long nextScheduleTimeOverride;
    public final int nextScheduleTimeOverrideGeneration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public final Data output;
    public final int periodCount;
    public final int runAttemptCount;
    public final long scheduleRequestedAt;
    public WorkInfo.State state;
    public final int stopReason;
    public String traceTag;
    public final String workerClassName;

    public final class IdAndState {
        public String id;
        public WorkInfo.State state;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public final int hashCode() {
            return this.state.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* loaded from: classes3.dex */
    public final class WorkInfoPojo {
        public final long backoffDelayDuration;
        public final BackoffPolicy backoffPolicy;
        public final Constraints constraints;
        public final long flexDuration;
        public final int generation;
        public final String id;
        public final long initialDelay;
        public final long intervalDuration;
        public final long lastEnqueueTime;
        public final long nextScheduleTimeOverride;
        public final Data output;
        public final int periodCount;
        public final List progress;
        public final int runAttemptCount;
        public final WorkInfo.State state;
        public final int stopReason;
        public final List tags;

        public WorkInfoPojo(String str, WorkInfo.State state, Data data, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
            str.getClass();
            data.getClass();
            list.getClass();
            list2.getClass();
            this.id = str;
            this.state = state;
            this.output = data;
            this.initialDelay = j;
            this.intervalDuration = j2;
            this.flexDuration = j3;
            this.constraints = constraints;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j4;
            this.lastEnqueueTime = j5;
            this.periodCount = i2;
            this.generation = i3;
            this.nextScheduleTimeOverride = j6;
            this.stopReason = i4;
            this.tags = list;
            this.progress = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.areEqual(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && this.constraints.equals(workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && Intrinsics.areEqual(this.tags, workInfoPojo.tags) && Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public final int hashCode() {
            return this.progress.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stopReason, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.generation, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.periodCount, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.backoffPolicy.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.runAttemptCount, (this.constraints.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.output.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.initialDelay), 31, this.intervalDuration), 31, this.flexDuration)) * 31, 31)) * 31, 31, this.backoffDelayDuration), 31, this.lastEnqueueTime), 31), 31), 31, this.nextScheduleTimeOverride), 31), 31, this.tags);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
            sb.append(this.id);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", output=");
            sb.append(this.output);
            sb.append(", initialDelay=");
            sb.append(this.initialDelay);
            sb.append(", intervalDuration=");
            sb.append(this.intervalDuration);
            sb.append(", flexDuration=");
            sb.append(this.flexDuration);
            sb.append(", constraints=");
            sb.append(this.constraints);
            sb.append(", runAttemptCount=");
            sb.append(this.runAttemptCount);
            sb.append(", backoffPolicy=");
            sb.append(this.backoffPolicy);
            sb.append(", backoffDelayDuration=");
            sb.append(this.backoffDelayDuration);
            sb.append(", lastEnqueueTime=");
            sb.append(this.lastEnqueueTime);
            sb.append(", periodCount=");
            sb.append(this.periodCount);
            sb.append(", generation=");
            sb.append(this.generation);
            sb.append(", nextScheduleTimeOverride=");
            sb.append(this.nextScheduleTimeOverride);
            sb.append(", stopReason=");
            sb.append(this.stopReason);
            sb.append(", tags=");
            sb.append(this.tags);
            sb.append(", progress=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.progress, ')');
        }

        public final WorkInfo toWorkInfo() {
            int i;
            long j;
            long j2;
            List list = this.progress;
            Data data = !list.isEmpty() ? (Data) list.get(0) : Data.EMPTY;
            UUID fromString = UUID.fromString(this.id);
            fromString.getClass();
            HashSet hashSet = new HashSet(this.tags);
            long j3 = this.intervalDuration;
            WorkInfo.PeriodicityInfo periodicityInfo = j3 != 0 ? new WorkInfo.PeriodicityInfo(j3, this.flexDuration) : null;
            WorkInfo.State state = WorkInfo.State.ENQUEUED;
            WorkInfo.State state2 = this.state;
            int i2 = this.runAttemptCount;
            long j4 = this.initialDelay;
            if (state2 == state) {
                a$$ExternalSyntheticBUOutline0 a__externalsyntheticbuoutline0 = WorkSpec.WORK_INFO_MAPPER;
                j = j4;
                j2 = Countries.calculateNextRunTime(state2 == state && i2 > 0, i2, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, j3 != 0, j, this.flexDuration, j3, this.nextScheduleTimeOverride);
                i = i2;
            } else {
                i = i2;
                j = j4;
                j2 = Long.MAX_VALUE;
            }
            return new WorkInfo(fromString, state2, hashSet, this.output, data, i, this.generation, this.constraints, j, periodicityInfo, j2, this.stopReason);
        }
    }

    static {
        Logger$LogcatLogger.tagWithPrefix("WorkSpec");
        WORK_INFO_MAPPER = new a$$ExternalSyntheticBUOutline0();
    }

    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? WorkInfo.State.ENQUEUED : state, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? Data.EMPTY : data, (i5 & 32) != 0 ? Data.EMPTY : data2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? Constraints.NONE : constraints, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 4096) != 0 ? 30000L : j4, (i5 & PKIFailureInfo.certRevoked) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public final long calculateNextRunTime() {
        return Countries.calculateNextRunTime(this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0, this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && Intrinsics.areEqual(this.traceTag, workSpec.traceTag) && Intrinsics.areEqual(this.backOffOnSystemInterruptions, workSpec.backOffOnSystemInterruptions);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.stopReason, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.nextScheduleTimeOverrideGeneration, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.generation, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.periodCount, (this.outOfQuotaPolicy.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.backoffPolicy.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.runAttemptCount, (this.constraints.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.output.hashCode() + ((this.input.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.state.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.workerClassName), 31, this.inputMergerClassName)) * 31)) * 31, 31, this.initialDelay), 31, this.intervalDuration), 31, this.flexDuration)) * 31, 31)) * 31, 31, this.backoffDelayDuration), 31, this.lastEnqueueTime), 31, this.minimumRetentionDuration), 31, this.scheduleRequestedAt), 31, this.expedited)) * 31, 31), 31), 31, this.nextScheduleTimeOverride), 31), 31);
        String str = this.traceTag;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.backOffOnSystemInterruptions;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("{WorkSpec: "), this.id, '}');
    }

    public WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        state.getClass();
        str2.getClass();
        str3.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
        backoffPolicy.getClass();
        outOfQuotaPolicy.getClass();
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i2;
        this.generation = i3;
        this.nextScheduleTimeOverride = j8;
        this.nextScheduleTimeOverrideGeneration = i4;
        this.stopReason = i5;
        this.traceTag = str4;
        this.backOffOnSystemInterruptions = bool;
    }
}
