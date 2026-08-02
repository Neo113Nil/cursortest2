package com.squareup.cash.qrcodes.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public abstract class QrCodeProfileViewEvent {

    public final class Back extends QrCodeProfileViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1571912055;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    /* loaded from: classes6.dex */
    public final class Loaded extends QrCodeProfileViewEvent {
        public final Integer backgroundColor;
        public final Integer logoColor;
        public final Integer size;

        public Loaded(Integer num, Integer num2, Integer num3) {
            this.backgroundColor = num;
            this.logoColor = num2;
            this.size = num3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.backgroundColor.equals(loaded.backgroundColor) && this.logoColor.equals(loaded.logoColor) && this.size.equals(loaded.size);
        }

        public final int hashCode() {
            return this.size.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.backgroundColor.hashCode() * 31, 31, this.logoColor);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", logoColor=");
            sb.append(this.logoColor);
            sb.append(", size=");
            return NavAction$$ExternalSyntheticOutline0.m(sb, this.size, ")");
        }
    }

    public final class Scan extends QrCodeProfileViewEvent {
        public static final Scan INSTANCE = new Scan();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Scan);
        }

        public final int hashCode() {
            return 1572420365;
        }

        public final String toString() {
            return "Scan";
        }
    }

    public final class Share extends QrCodeProfileViewEvent {
        public static final Share INSTANCE = new Share();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Share);
        }

        public final int hashCode() {
            return 1500540239;
        }

        public final String toString() {
            return "Share";
        }
    }
}
