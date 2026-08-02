package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Cancellation$Type;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class thz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LogisticsOrderTracking$Cancellation$Type.values().length];
        try {
            iArr[LogisticsOrderTracking$Cancellation$Type.Free.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogisticsOrderTracking$Cancellation$Type.Paid.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId.values().length];
        try {
            iArr2[LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId.Performer.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId.InApp.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
