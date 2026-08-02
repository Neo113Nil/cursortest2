package androidx.glance;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.ContentScale;
import androidx.glance.semantics.SemanticsModifier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ImageKt$Image$2$1 extends Lambda implements Function2 {
    public static final ImageKt$Image$2$1 INSTANCE;
    public static final ImageKt$Image$2$1 INSTANCE$1;
    public static final ImageKt$Image$2$1 INSTANCE$2;
    public static final ImageKt$Image$2$1 INSTANCE$3;
    public static final ImageKt$Image$2$1 INSTANCE$4;
    public static final ImageKt$Image$2$1 INSTANCE$5;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE$1 = new ImageKt$Image$2$1(i, 1);
        INSTANCE = new ImageKt$Image$2$1(i, 0);
        INSTANCE$2 = new ImageKt$Image$2$1(i, 2);
        INSTANCE$3 = new ImageKt$Image$2$1(i, 3);
        INSTANCE$4 = new ImageKt$Image$2$1(i, 4);
        INSTANCE$5 = new ImageKt$Image$2$1(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageKt$Image$2$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((EmittableImage) obj).provider = (ImageProvider) obj2;
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                GlanceModifier.Element element = (GlanceModifier.Element) obj2;
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 2:
                ((EmittableImage) obj).modifier = (GlanceModifier) obj2;
                return Unit.INSTANCE;
            case 3:
                ((ContentScale) obj2).getClass();
                ((EmittableImage) obj).contentScale = 1;
                return Unit.INSTANCE;
            case 4:
                EmittableImage emittableImage = (EmittableImage) obj;
                if (obj2 == null) {
                    emittableImage.getClass();
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            default:
                GlanceModifier.Element element2 = (GlanceModifier.Element) obj2;
                return element2 instanceof SemanticsModifier ? element2 : obj;
        }
    }
}
