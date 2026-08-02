package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.dto.SuggestDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class um01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuggestDto.BehaviourDto.values().length];
        try {
            iArr[SuggestDto.BehaviourDto.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestDto.BehaviourDto.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
