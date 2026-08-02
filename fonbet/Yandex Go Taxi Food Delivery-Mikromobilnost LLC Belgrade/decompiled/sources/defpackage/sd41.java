package defpackage;

import com.yandex.quark.webchat.params.WebChatParams;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class sd41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebChatParams.DialogSessionMode.values().length];
        try {
            iArr[WebChatParams.DialogSessionMode.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebChatParams.DialogSessionMode.SPLIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebChatParams.DialogSessionMode.NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
