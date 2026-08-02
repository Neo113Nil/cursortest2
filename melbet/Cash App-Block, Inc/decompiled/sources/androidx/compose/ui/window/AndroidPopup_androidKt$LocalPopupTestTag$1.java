package androidx.compose.ui.window;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$LocalPopupTestTag$1 extends Lambda implements Function0 {
    public static final AndroidPopup_androidKt$LocalPopupTestTag$1 INSTANCE;
    public static final AndroidPopup_androidKt$LocalPopupTestTag$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new AndroidPopup_androidKt$LocalPopupTestTag$1(i, 1);
        INSTANCE = new AndroidPopup_androidKt$LocalPopupTestTag$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPopup_androidKt$LocalPopupTestTag$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "DEFAULT_TEST_TAG";
            default:
                return Boolean.FALSE;
        }
    }
}
