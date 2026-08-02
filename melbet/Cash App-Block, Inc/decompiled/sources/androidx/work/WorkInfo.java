package androidx.work;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class WorkInfo {
    public final Constraints constraints;
    public final int generation;
    public final UUID id;
    public final long initialDelayMillis;
    public final long nextScheduleTimeMillis;
    public final Data outputData;
    public final PeriodicityInfo periodicityInfo;
    public final Data progress;
    public final int runAttemptCount;
    public final State state;
    public final int stopReason;
    public final HashSet tags;

    public final class PeriodicityInfo {
        public final long flexIntervalMillis;
        public final long repeatIntervalMillis;

        public PeriodicityInfo(long j, long j2) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PeriodicityInfo.class.equals(obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.flexIntervalMillis) + (Long.hashCode(this.repeatIntervalMillis) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.repeatIntervalMillis);
            sb.append(", flexIntervalMillis=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flexIntervalMillis, '}');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State BLOCKED;
        public static final State CANCELLED;
        public static final State ENQUEUED;
        public static final State FAILED;
        public static final State RUNNING;
        public static final State SUCCEEDED;

        static {
            State state = new State("ENQUEUED", 0);
            ENQUEUED = state;
            State state2 = new State("RUNNING", 1);
            RUNNING = state2;
            State state3 = new State("SUCCEEDED", 2);
            SUCCEEDED = state3;
            State state4 = new State("FAILED", 3);
            FAILED = state4;
            State state5 = new State("BLOCKED", 4);
            BLOCKED = state5;
            State state6 = new State("CANCELLED", 5);
            CANCELLED = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public WorkInfo(UUID uuid, State state, HashSet hashSet, Data data, Data data2, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j2, int i3) {
        uuid.getClass();
        data.getClass();
        data2.getClass();
        this.id = uuid;
        this.state = state;
        this.tags = hashSet;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i;
        this.generation = i2;
        this.constraints = constraints;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j2;
        this.stopReason = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && Intrinsics.areEqual(this.id, workInfo.id) && this.state == workInfo.state && Intrinsics.areEqual(this.outputData, workInfo.outputData) && this.constraints.equals(workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && Intrinsics.areEqual(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && this.tags.equals(workInfo.tags)) {
            return Intrinsics.areEqual(this.progress, workInfo.progress);
        }
        return false;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.constraints.hashCode() + ((((((this.progress.hashCode() + ((this.tags.hashCode() + ((this.outputData.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.runAttemptCount) * 31) + this.generation) * 31)) * 31, 31, this.initialDelayMillis);
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return Integer.hashCode(this.stopReason) + Recorder$$ExternalSyntheticOutline2.m((m + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31, 31, this.nextScheduleTimeMillis);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }
}
