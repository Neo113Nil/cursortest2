package androidx.glance.layout;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class BoxKt$Box$2$1 extends Lambda implements Function2 {
    public static final BoxKt$Box$2$1 INSTANCE;
    public static final BoxKt$Box$2$1 INSTANCE$1;
    public static final BoxKt$Box$2$1 INSTANCE$2;
    public static final BoxKt$Box$2$1 INSTANCE$3;
    public static final BoxKt$Box$2$1 INSTANCE$4;
    public static final BoxKt$Box$2$1 INSTANCE$5;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE = new BoxKt$Box$2$1(i, 0);
        INSTANCE$1 = new BoxKt$Box$2$1(i, 1);
        INSTANCE$2 = new BoxKt$Box$2$1(i, 2);
        INSTANCE$3 = new BoxKt$Box$2$1(i, 3);
        INSTANCE$4 = new BoxKt$Box$2$1(i, 4);
        INSTANCE$5 = new BoxKt$Box$2$1(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoxKt$Box$2$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((EmittableBox) obj).modifier = (GlanceModifier) obj2;
                break;
            case 1:
                ((EmittableBox) obj).contentAlignment = (Alignment) obj2;
                break;
            case 2:
                ((EmittableColumn) obj).modifier = (GlanceModifier) obj2;
                break;
            case 3:
                ((EmittableColumn) obj).horizontalAlignment = ((Alignment.Horizontal) obj2).value;
                break;
            case 4:
                ((EmittableColumn) obj).verticalAlignment = ((Alignment.Vertical) obj2).value;
                break;
            default:
                ((EmittableSpacer) obj).modifier = (GlanceModifier) obj2;
                break;
        }
        return Unit.INSTANCE;
    }
}
