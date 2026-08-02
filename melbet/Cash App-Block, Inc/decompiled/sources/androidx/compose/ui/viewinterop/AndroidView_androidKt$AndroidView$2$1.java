package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AndroidView_androidKt$AndroidView$2$1 extends Lambda implements Function2 {
    public static final AndroidView_androidKt$AndroidView$2$1 INSTANCE;
    public static final AndroidView_androidKt$AndroidView$2$1 INSTANCE$1;
    public static final AndroidView_androidKt$AndroidView$2$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE = new AndroidView_androidKt$AndroidView$2$1(i, 0);
        INSTANCE$1 = new AndroidView_androidKt$AndroidView$2$1(i, 1);
        INSTANCE$2 = new AndroidView_androidKt$AndroidView$2$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidView_androidKt$AndroidView$2$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setResetBlock((Function1) obj2);
                break;
            case 1:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setUpdateBlock((Function1) obj2);
                break;
            default:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setReleaseBlock((Function1) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
