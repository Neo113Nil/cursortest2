package androidx.glance.appwidget;

import android.util.Log;
import androidx.glance.AndroidResourceImageProvider;
import androidx.glance.BackgroundModifier$Image;
import androidx.glance.Emittable;
import androidx.glance.EmittableImage;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionModifier;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.layout.WidthModifier;
import com.squareup.cash.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class RadioButtonKt$isSelectableGroup$1 extends Lambda implements Function1 {
    public static final RadioButtonKt$isSelectableGroup$1 INSTANCE;
    public static final RadioButtonKt$isSelectableGroup$1 INSTANCE$1;
    public static final RadioButtonKt$isSelectableGroup$1 INSTANCE$2;
    public static final RadioButtonKt$isSelectableGroup$1 INSTANCE$3;
    public static final RadioButtonKt$isSelectableGroup$1 INSTANCE$4;
    public static final RadioButtonKt$isSelectableGroup$1 INSTANCE$5;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE$1 = new RadioButtonKt$isSelectableGroup$1(i, 1);
        INSTANCE$2 = new RadioButtonKt$isSelectableGroup$1(i, 2);
        INSTANCE$3 = new RadioButtonKt$isSelectableGroup$1(i, 3);
        INSTANCE$4 = new RadioButtonKt$isSelectableGroup$1(i, 4);
        INSTANCE$5 = new RadioButtonKt$isSelectableGroup$1(i, 5);
        INSTANCE = new RadioButtonKt$isSelectableGroup$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioButtonKt$isSelectableGroup$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EmittableImage emittableImage;
        EmittableImage emittableImage2;
        boolean z = true;
        r0 = true;
        boolean z2 = true;
        z = true;
        z = true;
        switch (this.$r8$classId) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.valueOf(((GlanceModifier.Element) obj) instanceof ActionModifier);
            case 2:
                GlanceModifier.Element element = (GlanceModifier.Element) obj;
                if (!(element instanceof WidthModifier) && !(element instanceof HeightModifier) && !(element instanceof CornerRadiusModifier)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                Emittable emittable = (Emittable) obj;
                if (emittable instanceof EmittableSizeBox) {
                    return emittable;
                }
                if (!emittable.getModifier().any(new RadioButtonKt$isSelectableGroup$1(true ? 1 : 0, 6))) {
                    return emittable;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                GlanceModifier modifier = emittable.getModifier();
                boolean any = modifier.any(INSTANCE$4);
                GlanceModifier.Companion companion = GlanceModifier.Companion.$$INSTANCE;
                Pair pair = any ? (Pair) modifier.foldIn(new Pair(null, companion), SizeBoxKt$SizeBox$1$2$1.INSTANCE$16) : new Pair(null, modifier);
                BackgroundModifier$Image backgroundModifier$Image = (BackgroundModifier$Image) pair.first;
                GlanceModifier glanceModifier = (GlanceModifier) pair.second;
                if (backgroundModifier$Image == null || !(backgroundModifier$Image instanceof BackgroundModifier$Image)) {
                    emittableImage = null;
                } else {
                    emittableImage = new EmittableImage();
                    emittableImage.modifier = SizeModifiersKt.fillMaxSize(companion);
                    emittableImage.provider = backgroundModifier$Image.imageProvider;
                    emittableImage.contentScale = 2;
                }
                if (((Number) glanceModifier.foldIn(0, SizeBoxKt$SizeBox$1$2$1.INSTANCE$18)).intValue() > 1) {
                    Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                Pair pair2 = glanceModifier.any(INSTANCE$5) ? (Pair) glanceModifier.foldIn(new Pair(null, companion), SizeBoxKt$SizeBox$1$2$1.INSTANCE$17) : new Pair(null, glanceModifier);
                ActionModifier actionModifier = (ActionModifier) pair2.first;
                GlanceModifier glanceModifier2 = (GlanceModifier) pair2.second;
                arrayList.add(actionModifier);
                if (actionModifier != null) {
                    AndroidResourceImageProvider androidResourceImageProvider = new AndroidResourceImageProvider(R.drawable.glance_ripple);
                    emittableImage2 = new EmittableImage();
                    emittableImage2.modifier = SizeModifiersKt.fillMaxSize(companion);
                    emittableImage2.provider = androidResourceImageProvider;
                } else {
                    emittableImage2 = null;
                }
                ExtractedSizeModifiers extractedSizeModifiers = glanceModifier2.any(INSTANCE$2) ? (ExtractedSizeModifiers) glanceModifier2.foldIn(new ExtractedSizeModifiers((GlanceModifier) null, 3), SizeBoxKt$SizeBox$1$2$1.INSTANCE$11) : new ExtractedSizeModifiers(glanceModifier2, 1);
                GlanceModifier glanceModifier3 = extractedSizeModifiers.sizeModifiers;
                GlanceModifier glanceModifier4 = extractedSizeModifiers.nonSizeModifiers;
                arrayList.add(glanceModifier3);
                arrayList2.add(SizeModifiersKt.fillMaxSize(glanceModifier4));
                EmittableBox emittableBox = new EmittableBox();
                emittableBox.modifier = NormalizeCompositionTreeKt.collect(arrayList);
                emittable.setModifier(NormalizeCompositionTreeKt.collect(arrayList2));
                ArrayList arrayList3 = emittableBox.children;
                if (emittableImage != null) {
                    arrayList3.add(emittableImage);
                }
                arrayList3.add(emittable);
                if (emittableImage2 != null) {
                    arrayList3.add(emittableImage2);
                }
                return emittableBox;
            case 4:
                return Boolean.valueOf(((GlanceModifier.Element) obj) instanceof BackgroundModifier$Image);
            case 5:
                return Boolean.valueOf(((GlanceModifier.Element) obj) instanceof ActionModifier);
            default:
                GlanceModifier.Element element2 = (GlanceModifier.Element) obj;
                if (!(element2 instanceof BackgroundModifier$Image) && !(element2 instanceof ActionModifier)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
