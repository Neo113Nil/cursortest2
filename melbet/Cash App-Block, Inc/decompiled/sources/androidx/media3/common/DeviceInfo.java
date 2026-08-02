package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;

/* loaded from: classes3.dex */
public final class DeviceInfo {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int minVolume = 0;
    public final int maxVolume = 0;

    public final class Builder {
        public static final Builder DEFAULT = new Builder();

        public Builder() {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        }
    }

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
        Util.intToStringMaxRadix(2);
        Util.intToStringMaxRadix(3);
    }

    public DeviceInfo(Builder builder) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume;
    }

    public final int hashCode() {
        return (((16337 + this.minVolume) * 31) + this.maxVolume) * 31;
    }
}
