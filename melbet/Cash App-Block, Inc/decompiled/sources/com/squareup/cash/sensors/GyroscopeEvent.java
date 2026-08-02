package com.squareup.cash.sensors;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface GyroscopeEvent {

    public final class Data implements GyroscopeEvent {
        public final long timestamp;
        public final float xRot;
        public final float yRot;
        public final float zRot;

        public Data(long j, float f, float f2, float f3) {
            this.xRot = f;
            this.yRot = f2;
            this.zRot = f3;
            this.timestamp = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Float.compare(this.xRot, data.xRot) == 0 && Float.compare(this.yRot, data.yRot) == 0 && Float.compare(this.zRot, data.zRot) == 0 && this.timestamp == data.timestamp;
        }

        public final int hashCode() {
            return Long.hashCode(this.timestamp) + CameraState$Type$EnumUnboxingLocalUtility.m(this.zRot, CameraState$Type$EnumUnboxingLocalUtility.m(this.yRot, Float.hashCode(this.xRot) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data(xRot=", this.xRot, ", yRot=", this.yRot, ", zRot=");
            m.append(this.zRot);
            m.append(", timestamp=");
            m.append(this.timestamp);
            m.append(")");
            return m.toString();
        }
    }

    public final class MissingSensor implements GyroscopeEvent {
        public static final MissingSensor INSTANCE = new MissingSensor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingSensor);
        }

        public final int hashCode() {
            return 330744430;
        }

        public final String toString() {
            return "MissingSensor";
        }
    }
}
