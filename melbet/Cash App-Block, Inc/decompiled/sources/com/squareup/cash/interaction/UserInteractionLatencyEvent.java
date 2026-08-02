package com.squareup.cash.interaction;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class UserInteractionLatencyEvent {
    public final long mem_jvm_heap;
    public final long mem_native_heap;
    public final long presenter_init_ms;
    public final long presenter_start_ms;
    public final String ui_latency_description;
    public final String ui_latency_events;
    public final long ui_latency_raw_ms;
    public final long ui_latency_start_uptime_ms;
    public final long ui_latency_total_ms;
    public final long ui_latency_trigger_ms;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/interaction/UserInteractionLatencyEvent$JsonSentEvent", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class JsonSentEvent {
        public final Object e;
        public final long t;

        public JsonSentEvent(Object obj, long j) {
            this.t = j;
            this.e = obj;
        }
    }

    public UserInteractionLatencyEvent(String str, long j, long j2, long j3, long j4, String str2, long j5, long j6, long j7, long j8) {
        this.ui_latency_description = str;
        this.ui_latency_total_ms = j;
        this.ui_latency_raw_ms = j2;
        this.ui_latency_trigger_ms = j3;
        this.ui_latency_start_uptime_ms = j4;
        this.ui_latency_events = str2;
        this.presenter_init_ms = j5;
        this.presenter_start_ms = j6;
        this.mem_jvm_heap = j7;
        this.mem_native_heap = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInteractionLatencyEvent)) {
            return false;
        }
        UserInteractionLatencyEvent userInteractionLatencyEvent = (UserInteractionLatencyEvent) obj;
        return this.ui_latency_description.equals(userInteractionLatencyEvent.ui_latency_description) && this.ui_latency_total_ms == userInteractionLatencyEvent.ui_latency_total_ms && this.ui_latency_raw_ms == userInteractionLatencyEvent.ui_latency_raw_ms && this.ui_latency_trigger_ms == userInteractionLatencyEvent.ui_latency_trigger_ms && this.ui_latency_start_uptime_ms == userInteractionLatencyEvent.ui_latency_start_uptime_ms && this.ui_latency_events.equals(userInteractionLatencyEvent.ui_latency_events) && this.presenter_init_ms == userInteractionLatencyEvent.presenter_init_ms && this.presenter_start_ms == userInteractionLatencyEvent.presenter_start_ms && this.mem_jvm_heap == userInteractionLatencyEvent.mem_jvm_heap && this.mem_native_heap == userInteractionLatencyEvent.mem_native_heap;
    }

    public final int hashCode() {
        return Long.hashCode(this.mem_native_heap) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((((Long.hashCode(this.ui_latency_start_uptime_ms) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.ui_latency_description.hashCode() * 31, 31, this.ui_latency_total_ms), 31, this.ui_latency_raw_ms), 31, this.ui_latency_trigger_ms)) * 31) - 284840886) * 31, 31, this.ui_latency_events), 31, this.presenter_init_ms), 31, this.presenter_start_ms), 31, this.mem_jvm_heap);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("UserInteractionLatencyEvent(ui_latency_description=", this.ui_latency_description, ", ui_latency_total_ms=", this.ui_latency_total_ms);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.ui_latency_raw_ms, ", ui_latency_raw_ms=", ", ui_latency_trigger_ms=", m);
        m.append(this.ui_latency_trigger_ms);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.ui_latency_start_uptime_ms, ", ui_latency_start_uptime_ms=", ", ui_latency_interaction_type=unknown, ui_latency_events=", m);
        m.append(this.ui_latency_events);
        m.append(", presenter_init_ms=");
        m.append(this.presenter_init_ms);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.presenter_start_ms, ", presenter_start_ms=", ", mem_jvm_heap=", m);
        m.append(this.mem_jvm_heap);
        return Boxes$$ExternalSyntheticOutline1.m(this.mem_native_heap, ", mem_native_heap=", ")", m);
    }
}
