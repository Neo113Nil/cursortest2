package com.datadog.android.rum.internal.domain.scope;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.startup.RumTTIDInfo;
import com.datadog.android.rum.model.ActionEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:&\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'\u0082\u0001&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLM¨\u0006N"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "ActionDropped", "ActionSent", "AddCustomTiming", "AddError", "AddFeatureFlagEvaluation", "AddLongTask", "AddResourceTiming", "AddViewAttributes", "AddViewLoadingTime", "AppStartEvent", "AppStartTTFDEvent", "AppStartTTIDEvent", "ApplicationStarted", "ErrorDropped", "ErrorSent", "KeepAlive", "LongTaskDropped", "LongTaskSent", "ResetSession", "ResourceDropped", "ResourceSent", "SdkInit", "SendCustomActionNow", "SetSyntheticsTestAttribute", "StartAction", "StartFeatureOperation", "StartResource", "StartView", "StopAction", "StopFeatureOperation", "StopResource", "StopResourceWithError", "StopView", "TelemetryEventWrapper", "UpdateExternalRefreshRate", "UpdatePerformanceMetric", "WaitForResourceTiming", "WebViewEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewAttributes;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$KeepAlive;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RumRawEvent {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ActionDropped extends RumRawEvent {
        public final Time eventTime;
        public final String viewId;

        public ActionDropped(String str) {
            Time time = new Time();
            this.viewId = str;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionDropped)) {
                return false;
            }
            ActionDropped actionDropped = (ActionDropped) obj;
            return Intrinsics.areEqual(this.viewId, actionDropped.viewId) && Intrinsics.areEqual(this.eventTime, actionDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (this.viewId.hashCode() * 31);
        }

        public final String toString() {
            return "ActionDropped(viewId=" + this.viewId + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ActionSent extends RumRawEvent {
        public final long eventEndTimestampInNanos;
        public final Time eventTime;
        public final int frustrationCount;

        /* renamed from: type, reason: collision with root package name */
        public final ActionEvent.ActionEventActionType f949type;
        public final String viewId;

        public ActionSent(String str, int i, ActionEvent.ActionEventActionType actionEventActionType, long j) {
            Time time = new Time();
            this.viewId = str;
            this.frustrationCount = i;
            this.f949type = actionEventActionType;
            this.eventEndTimestampInNanos = j;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionSent)) {
                return false;
            }
            ActionSent actionSent = (ActionSent) obj;
            return Intrinsics.areEqual(this.viewId, actionSent.viewId) && this.frustrationCount == actionSent.frustrationCount && this.f949type == actionSent.f949type && this.eventEndTimestampInNanos == actionSent.eventEndTimestampInNanos && Intrinsics.areEqual(this.eventTime, actionSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.f949type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.frustrationCount, this.viewId.hashCode() * 31, 31)) * 31, 31, this.eventEndTimestampInNanos);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("ActionSent(viewId=", this.frustrationCount, this.viewId, ", frustrationCount=", ", type=");
            m.append(this.f949type);
            m.append(", eventEndTimestampInNanos=");
            m.append(this.eventEndTimestampInNanos);
            m.append(", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddCustomTiming extends RumRawEvent {
        public final Time eventTime;
        public final String name;

        public AddCustomTiming(String str) {
            Time time = new Time();
            this.name = str;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddCustomTiming)) {
                return false;
            }
            AddCustomTiming addCustomTiming = (AddCustomTiming) obj;
            return Intrinsics.areEqual(this.name, addCustomTiming.name) && Intrinsics.areEqual(this.eventTime, addCustomTiming.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return "AddCustomTiming(name=" + this.name + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddError extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final boolean isFatal;
        public final String message;
        public final int source;
        public final int sourceType;
        public final String stacktrace;
        public final List threads;
        public final Throwable throwable;
        public final Long timeSinceAppStartNs;

        /* renamed from: type, reason: collision with root package name */
        public final String f950type;

        public AddError(String str, int i, Throwable th, String str2, boolean z, Map map, Time time, String str3, int i2, List list, Long l, int i3) {
            str3 = (i3 & 128) != 0 ? null : str3;
            i2 = (i3 & 256) != 0 ? 1 : i2;
            l = (i3 & 1024) != 0 ? null : l;
            str.getClass();
            if (i == 0) {
                throw null;
            }
            map.getClass();
            if (i2 == 0) {
                throw null;
            }
            list.getClass();
            this.message = str;
            this.source = i;
            this.throwable = th;
            this.stacktrace = str2;
            this.isFatal = z;
            this.attributes = map;
            this.eventTime = time;
            this.f950type = str3;
            this.sourceType = i2;
            this.threads = list;
            this.timeSinceAppStartNs = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddError)) {
                return false;
            }
            AddError addError = (AddError) obj;
            return Intrinsics.areEqual(this.message, addError.message) && this.source == addError.source && Intrinsics.areEqual(this.throwable, addError.throwable) && Intrinsics.areEqual(this.stacktrace, addError.stacktrace) && this.isFatal == addError.isFatal && Intrinsics.areEqual(this.attributes, addError.attributes) && Intrinsics.areEqual(this.eventTime, addError.eventTime) && Intrinsics.areEqual(this.f950type, addError.f950type) && this.sourceType == addError.sourceType && Intrinsics.areEqual(this.threads, addError.threads) && Intrinsics.areEqual(this.timeSinceAppStartNs, addError.timeSinceAppStartNs);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.source, this.message.hashCode() * 31, 31);
            Throwable th = this.throwable;
            int hashCode = (m + (th == null ? 0 : th.hashCode())) * 31;
            String str = this.stacktrace;
            int hashCode2 = (this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFatal), this.attributes, 31)) * 31;
            String str2 = this.f950type;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(Thread$State$EnumUnboxingLocalUtility.m(this.sourceType, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.threads);
            Long l = this.timeSinceAppStartNs;
            return m2 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("AddError(message=", this.message, ", source=");
            m3m.append(RumErrorSource$EnumUnboxingLocalUtility.stringValueOf(this.source));
            m3m.append(", throwable=");
            m3m.append(this.throwable);
            m3m.append(", stacktrace=");
            NavAction$$ExternalSyntheticOutline0.m(m3m, this.stacktrace, ", isFatal=", this.isFatal, ", attributes=");
            m3m.append(this.attributes);
            m3m.append(", eventTime=");
            m3m.append(this.eventTime);
            m3m.append(", type=");
            m3m.append(this.f950type);
            m3m.append(", sourceType=");
            switch (this.sourceType) {
                case 1:
                    str = "ANDROID";
                    break;
                case 2:
                    str = "BROWSER";
                    break;
                case 3:
                    str = "REACT_NATIVE";
                    break;
                case 4:
                    str = "FLUTTER";
                    break;
                case 5:
                    str = "NDK";
                    break;
                case 6:
                    str = "NDK_IL2CPP";
                    break;
                default:
                    str = "null";
                    break;
            }
            m3m.append(str);
            m3m.append(", threads=");
            m3m.append(this.threads);
            m3m.append(", timeSinceAppStartNs=");
            m3m.append(this.timeSinceAppStartNs);
            m3m.append(")");
            return m3m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddFeatureFlagEvaluation extends RumRawEvent {
        public final Time eventTime;
        public final String name;
        public final Object value;

        public AddFeatureFlagEvaluation(String str, Object obj) {
            Time time = new Time();
            obj.getClass();
            this.name = str;
            this.value = obj;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddFeatureFlagEvaluation)) {
                return false;
            }
            AddFeatureFlagEvaluation addFeatureFlagEvaluation = (AddFeatureFlagEvaluation) obj;
            return Intrinsics.areEqual(this.name, addFeatureFlagEvaluation.name) && Intrinsics.areEqual(this.value, addFeatureFlagEvaluation.value) && Intrinsics.areEqual(this.eventTime, addFeatureFlagEvaluation.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + ((this.value.hashCode() + (this.name.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AddFeatureFlagEvaluation(name=" + this.name + ", value=" + this.value + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddLongTask extends RumRawEvent {
        public final long durationNs;
        public final Time eventTime;
        public final String target;

        public AddLongTask(long j, String str) {
            Time time = new Time();
            str.getClass();
            this.durationNs = j;
            this.target = str;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddLongTask)) {
                return false;
            }
            AddLongTask addLongTask = (AddLongTask) obj;
            return this.durationNs == addLongTask.durationNs && Intrinsics.areEqual(this.target, addLongTask.target) && Intrinsics.areEqual(this.eventTime, addLongTask.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.durationNs) * 31, 31, this.target);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("AddLongTask(durationNs=", this.durationNs, ", target=", this.target);
            m.append(", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddResourceTiming extends RumRawEvent {
        public final Time eventTime;
        public final Object key;
        public final ResourceTiming timing;

        public AddResourceTiming(Object obj, ResourceTiming resourceTiming) {
            Time time = new Time();
            this.key = obj;
            this.timing = resourceTiming;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddResourceTiming)) {
                return false;
            }
            AddResourceTiming addResourceTiming = (AddResourceTiming) obj;
            return Intrinsics.areEqual(this.key, addResourceTiming.key) && Intrinsics.areEqual(this.timing, addResourceTiming.timing) && Intrinsics.areEqual(this.eventTime, addResourceTiming.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + ((this.timing.hashCode() + (this.key.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AddResourceTiming(key=" + this.key + ", timing=" + this.timing + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewAttributes;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddViewAttributes extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;

        public AddViewAttributes(Map map) {
            Time time = new Time();
            map.getClass();
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddViewAttributes)) {
                return false;
            }
            AddViewAttributes addViewAttributes = (AddViewAttributes) obj;
            return Intrinsics.areEqual(this.attributes, addViewAttributes.attributes) && Intrinsics.areEqual(this.eventTime, addViewAttributes.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (this.attributes.hashCode() * 31);
        }

        public final String toString() {
            return "AddViewAttributes(attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddViewLoadingTime extends RumRawEvent {
        public final Time eventTime = new Time();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddViewLoadingTime) && Intrinsics.areEqual(this.eventTime, ((AddViewLoadingTime) obj).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (Boolean.hashCode(false) * 31);
        }

        public final String toString() {
            return "AddViewLoadingTime(overwrite=false, eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStartEvent extends RumRawEvent {
        public final Time eventTime;
        public final RumStartupScenario scenario;

        public AppStartEvent(RumStartupScenario rumStartupScenario) {
            Time time = new Time();
            this.scenario = rumStartupScenario;
            this.eventTime = time;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStartTTFDEvent extends RumRawEvent {
        public final Time eventTime = new Time();

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStartTTIDEvent extends RumRawEvent {
        public final Time eventTime = new Time();
        public final RumTTIDInfo info;

        public AppStartTTIDEvent(RumTTIDInfo rumTTIDInfo) {
            this.info = rumTTIDInfo;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ApplicationStarted extends RumRawEvent {
        public final long applicationStartupNanos;
        public final Time eventTime;

        public ApplicationStarted(Time time, long j) {
            this.eventTime = time;
            this.applicationStartupNanos = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationStarted)) {
                return false;
            }
            ApplicationStarted applicationStarted = (ApplicationStarted) obj;
            return this.eventTime.equals(applicationStarted.eventTime) && this.applicationStartupNanos == applicationStarted.applicationStartupNanos;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return Long.hashCode(this.applicationStartupNanos) + (this.eventTime.hashCode() * 31);
        }

        public final String toString() {
            return "ApplicationStarted(eventTime=" + this.eventTime + ", applicationStartupNanos=" + this.applicationStartupNanos + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorDropped extends RumRawEvent {
        public final Time eventTime;
        public final String resourceId;
        public final String viewId;

        public ErrorDropped(String str, String str2) {
            Time time = new Time();
            this.viewId = str;
            this.resourceId = str2;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorDropped)) {
                return false;
            }
            ErrorDropped errorDropped = (ErrorDropped) obj;
            return Intrinsics.areEqual(this.viewId, errorDropped.viewId) && Intrinsics.areEqual(this.resourceId, errorDropped.resourceId) && Intrinsics.areEqual(this.eventTime, errorDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            int hashCode = this.viewId.hashCode() * 31;
            String str = this.resourceId;
            return this.eventTime.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorDropped(viewId=", this.viewId, ", resourceId=", this.resourceId, ", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorSent extends RumRawEvent {
        public final Time eventTime;
        public final Long resourceEndTimestampInNanos;
        public final String resourceId;
        public final String viewId;

        public ErrorSent(Long l, String str, String str2) {
            Time time = new Time();
            this.viewId = str;
            this.resourceId = str2;
            this.resourceEndTimestampInNanos = l;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorSent)) {
                return false;
            }
            ErrorSent errorSent = (ErrorSent) obj;
            return Intrinsics.areEqual(this.viewId, errorSent.viewId) && Intrinsics.areEqual(this.resourceId, errorSent.resourceId) && Intrinsics.areEqual(this.resourceEndTimestampInNanos, errorSent.resourceEndTimestampInNanos) && Intrinsics.areEqual(this.eventTime, errorSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            int hashCode = this.viewId.hashCode() * 31;
            String str = this.resourceId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.resourceEndTimestampInNanos;
            return this.eventTime.hashCode() + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorSent(viewId=", this.viewId, ", resourceId=", this.resourceId, ", resourceEndTimestampInNanos=");
            m.append(this.resourceEndTimestampInNanos);
            m.append(", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$KeepAlive;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class KeepAlive extends RumRawEvent {
        public final Time eventTime = new Time();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeepAlive) && Intrinsics.areEqual(this.eventTime, ((KeepAlive) obj).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final String toString() {
            return "KeepAlive(eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LongTaskDropped extends RumRawEvent {
        public final Time eventTime;
        public final boolean isFrozenFrame;
        public final String viewId;

        public LongTaskDropped(String str, boolean z) {
            Time time = new Time();
            this.viewId = str;
            this.isFrozenFrame = z;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongTaskDropped)) {
                return false;
            }
            LongTaskDropped longTaskDropped = (LongTaskDropped) obj;
            return Intrinsics.areEqual(this.viewId, longTaskDropped.viewId) && this.isFrozenFrame == longTaskDropped.isFrozenFrame && Intrinsics.areEqual(this.eventTime, longTaskDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewId.hashCode() * 31, 31, this.isFrozenFrame);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("LongTaskDropped(viewId=", this.viewId, ", isFrozenFrame=", ", eventTime=", this.isFrozenFrame);
            m1540m.append(this.eventTime);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LongTaskSent extends RumRawEvent {
        public final Time eventTime;
        public final boolean isFrozenFrame;
        public final String viewId;

        public LongTaskSent(String str, boolean z) {
            Time time = new Time();
            this.viewId = str;
            this.isFrozenFrame = z;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongTaskSent)) {
                return false;
            }
            LongTaskSent longTaskSent = (LongTaskSent) obj;
            return Intrinsics.areEqual(this.viewId, longTaskSent.viewId) && this.isFrozenFrame == longTaskSent.isFrozenFrame && Intrinsics.areEqual(this.eventTime, longTaskSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewId.hashCode() * 31, 31, this.isFrozenFrame);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("LongTaskSent(viewId=", this.viewId, ", isFrozenFrame=", ", eventTime=", this.isFrozenFrame);
            m1540m.append(this.eventTime);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResetSession extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResourceDropped extends RumRawEvent {
        public final Time eventTime;
        public final String resourceId;
        public final String viewId;

        public ResourceDropped(String str, String str2) {
            Time time = new Time();
            str2.getClass();
            this.viewId = str;
            this.resourceId = str2;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceDropped)) {
                return false;
            }
            ResourceDropped resourceDropped = (ResourceDropped) obj;
            return Intrinsics.areEqual(this.viewId, resourceDropped.viewId) && Intrinsics.areEqual(this.resourceId, resourceDropped.resourceId) && Intrinsics.areEqual(this.eventTime, resourceDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewId.hashCode() * 31, 31, this.resourceId);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResourceDropped(viewId=", this.viewId, ", resourceId=", this.resourceId, ", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResourceSent extends RumRawEvent {
        public final Time eventTime;
        public final long resourceEndTimestampInNanos;
        public final String resourceId;
        public final String viewId;

        public ResourceSent(String str, String str2, long j) {
            Time time = new Time();
            str2.getClass();
            this.viewId = str;
            this.resourceId = str2;
            this.resourceEndTimestampInNanos = j;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceSent)) {
                return false;
            }
            ResourceSent resourceSent = (ResourceSent) obj;
            return Intrinsics.areEqual(this.viewId, resourceSent.viewId) && Intrinsics.areEqual(this.resourceId, resourceSent.resourceId) && this.resourceEndTimestampInNanos == resourceSent.resourceEndTimestampInNanos && Intrinsics.areEqual(this.eventTime, resourceSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewId.hashCode() * 31, 31, this.resourceId), 31, this.resourceEndTimestampInNanos);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResourceSent(viewId=", this.viewId, ", resourceId=", this.resourceId, ", resourceEndTimestampInNanos=");
            m.append(this.resourceEndTimestampInNanos);
            m.append(", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SdkInit extends RumRawEvent {
        public final Time eventTime;
        public final boolean isAppInForeground;

        public SdkInit(boolean z) {
            Time time = new Time();
            this.isAppInForeground = z;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SdkInit)) {
                return false;
            }
            SdkInit sdkInit = (SdkInit) obj;
            return this.isAppInForeground == sdkInit.isAppInForeground && Intrinsics.areEqual(this.eventTime, sdkInit.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (Boolean.hashCode(this.isAppInForeground) * 31);
        }

        public final String toString() {
            return "SdkInit(isAppInForeground=" + this.isAppInForeground + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SendCustomActionNow extends RumRawEvent {
        public final Time eventTime = new Time();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendCustomActionNow) && Intrinsics.areEqual(this.eventTime, ((SendCustomActionNow) obj).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final String toString() {
            return "SendCustomActionNow(eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SetSyntheticsTestAttribute extends RumRawEvent {
        public final Time eventTime;
        public final String resultId;
        public final String testId;

        public SetSyntheticsTestAttribute(String str, String str2) {
            Time time = new Time();
            this.testId = str;
            this.resultId = str2;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSyntheticsTestAttribute)) {
                return false;
            }
            SetSyntheticsTestAttribute setSyntheticsTestAttribute = (SetSyntheticsTestAttribute) obj;
            return Intrinsics.areEqual(this.testId, setSyntheticsTestAttribute.testId) && Intrinsics.areEqual(this.resultId, setSyntheticsTestAttribute.resultId) && Intrinsics.areEqual(this.eventTime, setSyntheticsTestAttribute.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.testId.hashCode() * 31, 31, this.resultId);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SetSyntheticsTestAttribute(testId=", this.testId, ", resultId=", this.resultId, ", eventTime=");
            m.append(this.eventTime);
            m.append(")");
            return m.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartAction extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final String name;

        /* renamed from: type, reason: collision with root package name */
        public final RumActionType f951type;
        public final boolean waitForStop;

        public StartAction(RumActionType rumActionType, String str, boolean z, Map map, Time time) {
            str.getClass();
            map.getClass();
            this.f951type = rumActionType;
            this.name = str;
            this.waitForStop = z;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartAction)) {
                return false;
            }
            StartAction startAction = (StartAction) obj;
            return this.f951type == startAction.f951type && Intrinsics.areEqual(this.name, startAction.name) && this.waitForStop == startAction.waitForStop && Intrinsics.areEqual(this.attributes, startAction.attributes) && this.eventTime.equals(startAction.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f951type.hashCode() * 31, 31, this.name), 31, this.waitForStop), this.attributes, 31);
        }

        public final String toString() {
            return "StartAction(type=" + this.f951type + ", name=" + this.name + ", waitForStop=" + this.waitForStop + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartFeatureOperation extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartResource extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final Object key;
        public final int method;
        public final String url;

        public StartResource(Object obj, String str, int i, Map map, Time time) {
            obj.getClass();
            if (i == 0) {
                throw null;
            }
            map.getClass();
            this.key = obj;
            this.url = str;
            this.method = i;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartResource)) {
                return false;
            }
            StartResource startResource = (StartResource) obj;
            return Intrinsics.areEqual(this.key, startResource.key) && this.url.equals(startResource.url) && this.method == startResource.method && Intrinsics.areEqual(this.attributes, startResource.attributes) && this.eventTime.equals(startResource.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Thread$State$EnumUnboxingLocalUtility.m(this.method, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.url), 31), this.attributes, 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("StartResource(key=");
            sb.append(this.key);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", method=");
            switch (this.method) {
                case 1:
                    str = "POST";
                    break;
                case 2:
                    str = "GET";
                    break;
                case 3:
                    str = "HEAD";
                    break;
                case 4:
                    str = "PUT";
                    break;
                case 5:
                    str = "DELETE";
                    break;
                case 6:
                    str = "PATCH";
                    break;
                case 7:
                    str = "TRACE";
                    break;
                case 8:
                    str = "OPTIONS";
                    break;
                case 9:
                    str = "CONNECT";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(", attributes=");
            sb.append(this.attributes);
            sb.append(", eventTime=");
            sb.append(this.eventTime);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartView extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final RumScopeKey key;

        public StartView(RumScopeKey rumScopeKey, Map map, Time time) {
            rumScopeKey.getClass();
            map.getClass();
            this.key = rumScopeKey;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartView)) {
                return false;
            }
            StartView startView = (StartView) obj;
            return Intrinsics.areEqual(this.key, startView.key) && Intrinsics.areEqual(this.attributes, startView.attributes) && this.eventTime.equals(startView.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.key.hashCode() * 31, this.attributes, 31);
        }

        public final String toString() {
            return "StartView(key=" + this.key + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopAction extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;

        /* renamed from: type, reason: collision with root package name */
        public final RumActionType f952type;

        public StopAction(RumActionType rumActionType, Map map, Time time) {
            map.getClass();
            this.f952type = rumActionType;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopAction)) {
                return false;
            }
            StopAction stopAction = (StopAction) obj;
            return this.f952type == stopAction.f952type && Intrinsics.areEqual(this.attributes, stopAction.attributes) && this.eventTime.equals(stopAction.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            RumActionType rumActionType = this.f952type;
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((rumActionType == null ? 0 : rumActionType.hashCode()) * 961, this.attributes, 31);
        }

        public final String toString() {
            return "StopAction(type=" + this.f952type + ", name=, attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopFeatureOperation extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopResource extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final Object key;
        public final int kind;
        public final Long size;
        public final Long statusCode;

        public StopResource(Object obj, Long l, Long l2, int i, Map map, Time time) {
            obj.getClass();
            if (i == 0) {
                throw null;
            }
            map.getClass();
            this.key = obj;
            this.statusCode = l;
            this.size = l2;
            this.kind = i;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopResource)) {
                return false;
            }
            StopResource stopResource = (StopResource) obj;
            return Intrinsics.areEqual(this.key, stopResource.key) && Intrinsics.areEqual(this.statusCode, stopResource.statusCode) && Intrinsics.areEqual(this.size, stopResource.size) && this.kind == stopResource.kind && Intrinsics.areEqual(this.attributes, stopResource.attributes) && this.eventTime.equals(stopResource.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode() * 31;
            Long l = this.statusCode;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.size;
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Thread$State$EnumUnboxingLocalUtility.m(this.kind, (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31), this.attributes, 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("StopResource(key=");
            sb.append(this.key);
            sb.append(", statusCode=");
            sb.append(this.statusCode);
            sb.append(", size=");
            sb.append(this.size);
            sb.append(", kind=");
            switch (this.kind) {
                case 1:
                    str = "BEACON";
                    break;
                case 2:
                    str = "FETCH";
                    break;
                case 3:
                    str = "XHR";
                    break;
                case 4:
                    str = "DOCUMENT";
                    break;
                case 5:
                    str = "NATIVE";
                    break;
                case 6:
                    str = "UNKNOWN";
                    break;
                case 7:
                    str = "IMAGE";
                    break;
                case 8:
                    str = "JS";
                    break;
                case 9:
                    str = "FONT";
                    break;
                case 10:
                    str = "CSS";
                    break;
                case 11:
                    str = "MEDIA";
                    break;
                case 12:
                    str = "OTHER";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(", attributes=");
            sb.append(this.attributes);
            sb.append(", eventTime=");
            sb.append(this.eventTime);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopResourceWithError extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final Object key;
        public final String message;
        public final int source;
        public final Long statusCode;
        public final Throwable throwable;

        public StopResourceWithError(Object obj, Long l, String str, Throwable th, Map map) {
            Time time = new Time();
            obj.getClass();
            map.getClass();
            this.key = obj;
            this.statusCode = l;
            this.message = str;
            this.source = 1;
            this.throwable = th;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopResourceWithError)) {
                return false;
            }
            StopResourceWithError stopResourceWithError = (StopResourceWithError) obj;
            return Intrinsics.areEqual(this.key, stopResourceWithError.key) && Intrinsics.areEqual(this.statusCode, stopResourceWithError.statusCode) && Intrinsics.areEqual(this.message, stopResourceWithError.message) && this.source == stopResourceWithError.source && Intrinsics.areEqual(this.throwable, stopResourceWithError.throwable) && Intrinsics.areEqual(this.attributes, stopResourceWithError.attributes) && Intrinsics.areEqual(this.eventTime, stopResourceWithError.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode() * 31;
            Long l = this.statusCode;
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((this.throwable.hashCode() + Thread$State$EnumUnboxingLocalUtility.m(this.source, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.message), 31)) * 31, this.attributes, 31);
        }

        public final String toString() {
            return "StopResourceWithError(key=" + this.key + ", statusCode=" + this.statusCode + ", message=" + this.message + ", source=" + RumErrorSource$EnumUnboxingLocalUtility.stringValueOf(this.source) + ", throwable=" + this.throwable + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopView extends RumRawEvent {
        public final Map attributes;
        public final Time eventTime;
        public final RumScopeKey key;

        public StopView(RumScopeKey rumScopeKey, Map map, Time time) {
            map.getClass();
            this.key = rumScopeKey;
            this.attributes = map;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopView)) {
                return false;
            }
            StopView stopView = (StopView) obj;
            return this.key.equals(stopView.key) && Intrinsics.areEqual(this.attributes, stopView.attributes) && this.eventTime.equals(stopView.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.key.hashCode() * 31, this.attributes, 31);
        }

        public final String toString() {
            return "StopView(key=" + this.key + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TelemetryEventWrapper extends RumRawEvent {
        public final InternalTelemetryEvent event;
        public final Time eventTime;

        public TelemetryEventWrapper(InternalTelemetryEvent internalTelemetryEvent) {
            Time time = new Time();
            this.event = internalTelemetryEvent;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TelemetryEventWrapper)) {
                return false;
            }
            TelemetryEventWrapper telemetryEventWrapper = (TelemetryEventWrapper) obj;
            return Intrinsics.areEqual(this.event, telemetryEventWrapper.event) && Intrinsics.areEqual(this.eventTime, telemetryEventWrapper.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (this.event.hashCode() * 31);
        }

        public final String toString() {
            return "TelemetryEventWrapper(event=" + this.event + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UpdateExternalRefreshRate extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UpdatePerformanceMetric extends RumRawEvent {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WaitForResourceTiming extends RumRawEvent {
        public final Time eventTime;
        public final Object key;

        public WaitForResourceTiming(Object obj) {
            Time time = new Time();
            this.key = obj;
            this.eventTime = time;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitForResourceTiming)) {
                return false;
            }
            WaitForResourceTiming waitForResourceTiming = (WaitForResourceTiming) obj;
            return Intrinsics.areEqual(this.key, waitForResourceTiming.key) && Intrinsics.areEqual(this.eventTime, waitForResourceTiming.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode() + (this.key.hashCode() * 31);
        }

        public final String toString() {
            return "WaitForResourceTiming(key=" + this.key + ", eventTime=" + this.eventTime + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WebViewEvent extends RumRawEvent {
        public final Time eventTime = new Time();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebViewEvent) && Intrinsics.areEqual(this.eventTime, ((WebViewEvent) obj).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final String toString() {
            return "WebViewEvent(eventTime=" + this.eventTime + ")";
        }
    }

    public abstract Time getEventTime();
}
