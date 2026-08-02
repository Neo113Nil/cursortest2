package defpackage;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class vkv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultOutgoingCallType.values().length];
        try {
            iArr[DefaultOutgoingCallType.VOIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultOutgoingCallType.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultOutgoingCallType.ALWAYS_ASK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
