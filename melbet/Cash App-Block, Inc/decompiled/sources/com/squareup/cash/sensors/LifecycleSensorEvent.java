package com.squareup.cash.sensors;

import android.hardware.SensorEvent;

/* loaded from: classes7.dex */
public interface LifecycleSensorEvent {

    public final class Data implements LifecycleSensorEvent {
        public final SensorEvent event;

        public Data(SensorEvent sensorEvent) {
            this.event = sensorEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && this.event.equals(((Data) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "Data(event=" + this.event + ")";
        }
    }

    public final class MissingSensor implements LifecycleSensorEvent {
        public static final MissingSensor INSTANCE = new MissingSensor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingSensor);
        }

        public final int hashCode() {
            return 880871439;
        }

        public final String toString() {
            return "MissingSensor";
        }
    }
}
