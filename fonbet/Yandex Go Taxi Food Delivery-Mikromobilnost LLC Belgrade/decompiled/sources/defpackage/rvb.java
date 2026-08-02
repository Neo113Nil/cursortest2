package defpackage;

import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rvb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CircularProgressRouter$Payload.Animation.values().length];
        try {
            iArr[CircularProgressRouter$Payload.Animation.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CircularProgressRouter$Payload.Animation.Slide.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CircularProgressRouter$Payload.Animation.Fade.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
