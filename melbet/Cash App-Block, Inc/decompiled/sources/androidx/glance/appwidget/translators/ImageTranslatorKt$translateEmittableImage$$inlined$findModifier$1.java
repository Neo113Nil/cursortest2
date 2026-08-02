package androidx.glance.appwidget.translators;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1 extends Lambda implements Function2 {
    public static final ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1 INSTANCE;
    public static final ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE = new ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1(i, 0);
        INSTANCE$1 = new ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                GlanceModifier.Element element = (GlanceModifier.Element) obj2;
                return element instanceof WidthModifier ? element : obj;
            default:
                GlanceModifier.Element element2 = (GlanceModifier.Element) obj2;
                return element2 instanceof HeightModifier ? element2 : obj;
        }
    }
}
