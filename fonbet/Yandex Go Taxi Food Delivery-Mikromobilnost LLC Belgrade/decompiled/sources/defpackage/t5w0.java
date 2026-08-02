package defpackage;

import com.yandex.go.navigator.order.NavigationOrder$NavigationType;
import ru.yandex.taxi.linked_order.models.data.LinkedOrderType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class t5w0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LinkedOrderType.values().length];
        try {
            iArr[LinkedOrderType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkedOrderType.AMBULANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[NavigationOrder$NavigationType.values().length];
        try {
            iArr2[NavigationOrder$NavigationType.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NavigationOrder$NavigationType.WALKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
