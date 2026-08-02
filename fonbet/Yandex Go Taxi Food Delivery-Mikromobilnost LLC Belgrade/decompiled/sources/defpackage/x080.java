package defpackage;

import ru.yandex.taxi.net.tracker.models.TrackPoint$Remote$Source;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class x080 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.DRIVING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveState.TRANSPORTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TrackPoint$Remote$Source.values().length];
        try {
            iArr2[TrackPoint$Remote$Source.TAXIROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TrackPoint$Remote$Source.WEBSOCKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
