package defpackage;

import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import com.ybsdk.widgets.common.SuggestView$State$WidthType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class v9v0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SuggestView$State$WidthType.values().length];
        try {
            iArr[SuggestView$State$WidthType.WRAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestView$State$WidthType.DOUBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuggestView$State$WidthType.TRIPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SuggestView$State$Behaviour.values().length];
        try {
            iArr2[SuggestView$State$Behaviour.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SuggestView$State$Behaviour.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
