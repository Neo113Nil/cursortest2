package com.datadog.android.internal.telemetry;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class InternalTelemetryEvent {

    public final class Configuration extends InternalTelemetryEvent {
        public final int batchProcessingLevel;
        public final long batchSize;
        public final long batchUploadFrequency;
        public final boolean trackErrors;
        public final boolean useProxy;

        public Configuration(boolean z, long j, long j2, boolean z2, int i) {
            this.trackErrors = z;
            this.batchSize = j;
            this.batchUploadFrequency = j2;
            this.useProxy = z2;
            this.batchProcessingLevel = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return this.trackErrors == configuration.trackErrors && this.batchSize == configuration.batchSize && this.batchUploadFrequency == configuration.batchUploadFrequency && this.useProxy == configuration.useProxy && this.batchProcessingLevel == configuration.batchProcessingLevel;
        }

        public final int hashCode() {
            return Integer.hashCode(this.batchProcessingLevel) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.trackErrors) * 31, 31, this.batchSize), 31, this.batchUploadFrequency), 31, this.useProxy), 31, false);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Configuration(trackErrors=");
            sb.append(this.trackErrors);
            sb.append(", batchSize=");
            sb.append(this.batchSize);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.batchUploadFrequency, ", batchUploadFrequency=", ", useProxy=", sb);
            sb.append(this.useProxy);
            sb.append(", useLocalEncryption=false, batchProcessingLevel=");
            sb.append(this.batchProcessingLevel);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class InterceptorInstantiated extends InternalTelemetryEvent {
        public static final InterceptorInstantiated INSTANCE = new InterceptorInstantiated();
    }

    public abstract class Log extends InternalTelemetryEvent {
        public final Map additionalProperties;
        public final String message;

        public final class Debug extends Log {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Debug(String str, Map map) {
                super(str, map);
                str.getClass();
            }
        }

        public final class Error extends Log {
            public final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String str, Throwable th, Map map) {
                super(str, map);
                str.getClass();
                this.error = th;
            }
        }

        public Log(String str, Map map) {
            this.message = str;
            this.additionalProperties = map;
        }
    }

    public final class Metric extends InternalTelemetryEvent {
        public final Map additionalProperties;
        public final String message;

        public Metric(String str, Map map) {
            str.getClass();
            this.message = str;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) obj;
            return Intrinsics.areEqual(this.message, metric.message) && Intrinsics.areEqual(this.additionalProperties, metric.additionalProperties);
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Map map = this.additionalProperties;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            return "Metric(message=" + this.message + ", additionalProperties=" + this.additionalProperties + ")";
        }
    }
}
