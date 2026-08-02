package defpackage;

import com.yandex.delivery.mapper.model.state.IconStyleState;
import com.yandex.delivery.mapper.model.state.SlotState$Size;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w501 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SlotState$Size.values().length];
        try {
            iArr[SlotState$Size.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotState$Size.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotState$Size.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotState$Size.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SlotState$Size.XL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SlotState$Size.XXL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[IconStyleState.values().length];
        try {
            iArr2[IconStyleState.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[IconStyleState.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[IconStyleState.BRAND.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[IconStyleState.PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[IconStyleState.BRANDXS.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[IconStyleState.USERPIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[IconStyleState.SERVICE.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
    }
}
