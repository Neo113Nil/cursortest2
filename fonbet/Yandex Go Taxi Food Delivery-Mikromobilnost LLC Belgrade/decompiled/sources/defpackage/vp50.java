package defpackage;

import ru.rt.ebs.cryptosdk.core.networkClient.entities.NetworkClientMethod;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class vp50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkClientMethod.values().length];
        try {
            iArr[NetworkClientMethod.GET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkClientMethod.POST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
