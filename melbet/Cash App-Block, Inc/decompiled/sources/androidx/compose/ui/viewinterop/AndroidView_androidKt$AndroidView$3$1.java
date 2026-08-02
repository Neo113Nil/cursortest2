package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$3$1 extends Lambda implements Function2 {
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE;
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE$1;
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE$2;
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE$3;
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE$4;
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE$5;
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE$6;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE = new AndroidView_androidKt$AndroidView$3$1(i, 0);
        INSTANCE$1 = new AndroidView_androidKt$AndroidView$3$1(i, 1);
        INSTANCE$2 = new AndroidView_androidKt$AndroidView$3$1(i, 2);
        INSTANCE$3 = new AndroidView_androidKt$AndroidView$3$1(i, 3);
        INSTANCE$4 = new AndroidView_androidKt$AndroidView$3$1(i, 4);
        INSTANCE$5 = new AndroidView_androidKt$AndroidView$3$1(i, 5);
        INSTANCE$6 = new AndroidView_androidKt$AndroidView$3$1(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidView_androidKt$AndroidView$3$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.$r8$classId) {
            case 0:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setUpdateBlock((Function1) obj2);
                break;
            case 1:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setReleaseBlock((Function1) obj2);
                break;
            case 2:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setModifier((Modifier) obj2);
                break;
            case 3:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setDensity((Density) obj2);
                break;
            case 4:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setLifecycleOwner((LifecycleOwner) obj2);
                break;
            case 5:
                AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj).setSavedStateRegistryOwner((SavedStateRegistryOwner) obj2);
                break;
            default:
                ViewFactoryHolder access$requireViewFactoryHolder = AndroidView_androidKt.access$requireViewFactoryHolder((LayoutNode) obj);
                int ordinal = ((LayoutDirection) obj2).ordinal();
                if (ordinal != 0) {
                    i = 1;
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    i = 0;
                }
                access$requireViewFactoryHolder.setLayoutDirection(i);
                break;
        }
        return Unit.INSTANCE;
    }
}
