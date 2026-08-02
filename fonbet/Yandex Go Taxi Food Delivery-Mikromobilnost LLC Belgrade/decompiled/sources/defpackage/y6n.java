package defpackage;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Alignment;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Type;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class y6n {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DeliveryStateItem$TextWidget$Type.values().length];
        try {
            iArr[DeliveryStateItem$TextWidget$Type.EXPANDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryStateItem$TextWidget$Type.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DeliveryStateItem$TextWidget$Alignment.values().length];
        try {
            iArr2[DeliveryStateItem$TextWidget$Alignment.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DeliveryStateItem$TextWidget$Alignment.LEAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DeliveryStateItem$TextWidget$Alignment.TRAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
