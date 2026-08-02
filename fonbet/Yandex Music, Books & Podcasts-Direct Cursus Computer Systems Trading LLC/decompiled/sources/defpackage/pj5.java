package defpackage;

import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Toast;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$UiType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class pj5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[InternalCommunicationTrigger$UiType.values().length];
        try {
            iArr[InternalCommunicationTrigger$UiType.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InternalCommunicationTrigger$UiType.BOTTOMSHEET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InternalCommunicationTrigger$UiType.BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InternalCommunicationTrigger$UiType.DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InternalCommunicationTrigger$UiType.DYNAMIC_OVERLAY_SHEET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InternalCommunicationTrigger$UiType.TOAST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[InternalCommunicationTrigger$Toast.Data.ToastType.values().length];
        try {
            iArr2[InternalCommunicationTrigger$Toast.Data.ToastType.SIMPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
