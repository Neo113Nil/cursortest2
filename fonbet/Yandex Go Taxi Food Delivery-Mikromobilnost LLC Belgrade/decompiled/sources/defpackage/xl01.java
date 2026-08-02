package defpackage;

import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.SuggestEntity$BehaviourEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetState$SelectAccount$Type;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class xl01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BottomSheetState$SelectAccount$Type.values().length];
        try {
            iArr[BottomSheetState$SelectAccount$Type.SUBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomSheetState$SelectAccount$Type.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SuggestEntity$BehaviourEntity.values().length];
        try {
            iArr2[SuggestEntity$BehaviourEntity.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SuggestEntity$BehaviourEntity.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ControlState.values().length];
        try {
            iArr3[ControlState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ControlState.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
