package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class yn1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AiWidgetEvaluationSwipeDirection.values().length];
        try {
            iArr[AiWidgetEvaluationSwipeDirection.RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AiWidgetEvaluationSwipeDirection.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
