package app.cash.cdp.api.providers;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceInfo {
    public final String id;
    public final Screen screen;
    public final Sim sim;

    public final class Screen {
        public final String dpi;
        public final int height;
        public final Orientation orientation;
        public final int width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Orientation {
            public static final /* synthetic */ Orientation[] $VALUES;
            public static final Orientation LANDSCAPE;
            public static final Orientation PORTRAIT;

            static {
                Orientation orientation = new Orientation("PORTRAIT", 0);
                PORTRAIT = orientation;
                Orientation orientation2 = new Orientation("LANDSCAPE", 1);
                LANDSCAPE = orientation2;
                $VALUES = new Orientation[]{orientation, orientation2};
            }

            public static Orientation valueOf(String str) {
                return (Orientation) Enum.valueOf(Orientation.class, str);
            }

            public static Orientation[] values() {
                return (Orientation[]) $VALUES.clone();
            }
        }

        public Screen(int i, int i2, String str, Orientation orientation) {
            str.getClass();
            this.height = i;
            this.width = i2;
            this.dpi = str;
            this.orientation = orientation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.height == screen.height && this.width == screen.width && Intrinsics.areEqual(this.dpi, screen.dpi) && this.orientation == screen.orientation;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, Integer.hashCode(this.height) * 31, 31), 31, this.dpi);
            Orientation orientation = this.orientation;
            return m + (orientation == null ? 0 : orientation.hashCode());
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.height, this.width, "Screen(height=", ", width=", ", dpi=");
            m107m.append(this.dpi);
            m107m.append(", orientation=");
            m107m.append(this.orientation);
            m107m.append(")");
            return m107m.toString();
        }
    }

    public final class Sim {
        public final String countryIso;
        public final String mcc;
        public final String mnc;

        public Sim(String str, String str2, String str3) {
            this.countryIso = str;
            this.mcc = str2;
            this.mnc = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sim)) {
                return false;
            }
            Sim sim = (Sim) obj;
            return this.countryIso.equals(sim.countryIso) && Intrinsics.areEqual(this.mcc, sim.mcc) && Intrinsics.areEqual(this.mnc, sim.mnc);
        }

        public final int hashCode() {
            int hashCode = this.countryIso.hashCode() * 31;
            String str = this.mcc;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mnc;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Sim(countryIso=", this.countryIso, ", mcc=", this.mcc, ", mnc="), this.mnc, ")");
        }
    }

    public DeviceInfo(String str, Screen screen, Sim sim) {
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        str2.getClass();
        str3.getClass();
        this.id = str;
        this.screen = screen;
        this.sim = sim;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        if (!this.id.equals(deviceInfo.id)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        if (!Intrinsics.areEqual(str, str)) {
            return false;
        }
        String str2 = Build.MODEL;
        return Intrinsics.areEqual(str2, str2) && this.screen.equals(deviceInfo.screen) && this.sim.equals(deviceInfo.sim);
    }

    public final int hashCode() {
        return this.sim.hashCode() + ((this.screen.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 961, 31, Build.MANUFACTURER), 31, Build.MODEL)) * 31);
    }

    public final String toString() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceInfo(id=", this.id, ", advertisingId=null, manufacturer=", str, ", model=");
        m.append(str2);
        m.append(", screen=");
        m.append(this.screen);
        m.append(", sim=");
        m.append(this.sim);
        m.append(")");
        return m.toString();
    }
}
