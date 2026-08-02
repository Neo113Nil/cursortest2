package defpackage;

import android.hardware.Sensor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ym21 {
    public final Sensor a;
    public final Sensor b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f;

    public ym21(Sensor sensor, Sensor sensor2, Sensor sensor3, Sensor sensor4, Sensor sensor5, Sensor sensor6) {
        this.a = sensor;
        this.b = sensor2;
        this.c = sensor3;
        this.d = sensor4;
        this.e = sensor5;
        this.f = sensor6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym21)) {
            return false;
        }
        ym21 ym21Var = (ym21) obj;
        return jl40.l(this.a, ym21Var.a) && jl40.l(this.b, ym21Var.b) && jl40.l(this.c, ym21Var.c) && jl40.l(this.d, ym21Var.d) && jl40.l(this.e, ym21Var.e) && jl40.l(this.f, ym21Var.f);
    }

    public final int hashCode() {
        Sensor sensor = this.a;
        int hashCode = (sensor == null ? 0 : sensor.hashCode()) * 31;
        Sensor sensor2 = this.b;
        int hashCode2 = (hashCode + (sensor2 == null ? 0 : sensor2.hashCode())) * 31;
        Sensor sensor3 = this.c;
        int hashCode3 = (hashCode2 + (sensor3 == null ? 0 : sensor3.hashCode())) * 31;
        Sensor sensor4 = this.d;
        int hashCode4 = (hashCode3 + (sensor4 == null ? 0 : sensor4.hashCode())) * 31;
        Sensor sensor5 = this.e;
        int hashCode5 = (hashCode4 + (sensor5 == null ? 0 : sensor5.hashCode())) * 31;
        Sensor sensor6 = this.f;
        return hashCode5 + (sensor6 != null ? sensor6.hashCode() : 0);
    }

    public final String toString() {
        return "ResolvedMotionSensors(accel=" + this.a + ", gyro=" + this.b + ", rotation=" + this.c + ", magnetic=" + this.d + ", pressure=" + this.e + ", stepCounter=" + this.f + Extension.C_BRAKE;
    }
}
