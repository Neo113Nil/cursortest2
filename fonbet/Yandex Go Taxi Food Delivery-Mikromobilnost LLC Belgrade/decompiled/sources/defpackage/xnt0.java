package defpackage;

import com.yandex.go.navigator.repository.VoiceMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xnt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VoiceMode.values().length];
        try {
            iArr[VoiceMode.TURN_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoiceMode.ACCIDENTS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VoiceMode.ALL_SOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
