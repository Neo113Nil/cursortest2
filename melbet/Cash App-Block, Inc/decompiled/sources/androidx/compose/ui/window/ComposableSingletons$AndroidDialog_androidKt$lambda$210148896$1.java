package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1 INSTANCE;
    public static final ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE = new ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1(i, 0);
        INSTANCE$1 = new ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
