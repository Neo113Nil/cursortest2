package androidx.constraintlayout.core.motion;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes3.dex */
public final class CustomVariable {
    public float mFloatValue;
    public int mIntegerValue;
    public String mName;
    public int mType;

    public final String toString() {
        String m = CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder(), this.mName, ':');
        switch (this.mType) {
            case 900:
                StringBuilder m2 = Boxes$$ExternalSyntheticOutline1.m(m);
                m2.append(this.mIntegerValue);
                return m2.toString();
            case 901:
                StringBuilder m3 = Boxes$$ExternalSyntheticOutline1.m(m);
                m3.append(this.mFloatValue);
                return m3.toString();
            case 902:
                return m.concat("#".concat(Recorder$$ExternalSyntheticOutline1.m(this.mIntegerValue, new StringBuilder("00000000")).substring(r3.length() - 8)));
            case 903:
                return m.concat("null");
            default:
                return m.concat("????");
        }
    }
}
