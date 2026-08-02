package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Action;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class xn31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action.values().length];
        try {
            iArr[Action.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action.SUCCESSFUL_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
