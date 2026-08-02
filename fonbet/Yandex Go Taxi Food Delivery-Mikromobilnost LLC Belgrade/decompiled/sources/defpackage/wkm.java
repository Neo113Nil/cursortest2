package defpackage;

import com.yandex.go.navigator.incidents.IncidentType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class wkm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IncidentType.values().length];
        try {
            iArr[IncidentType.Camera.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IncidentType.Police.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IncidentType.RoadWorks.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IncidentType.Accident.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
