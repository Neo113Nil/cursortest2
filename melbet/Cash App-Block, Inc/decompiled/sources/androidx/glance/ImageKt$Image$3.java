package androidx.glance;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.BoxKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$OpenSource$1$1$2;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewEnvironment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;

/* loaded from: classes3.dex */
public final class ImageKt$Image$3 extends Lambda implements Function2 {
    public final /* synthetic */ Object $contentDescription;
    public final /* synthetic */ Object $modifier;
    public final /* synthetic */ Object $provider;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageKt$Image$3(int i, Object obj, Object obj2, Object obj3) {
        super(2);
        this.$r8$classId = i;
        this.$provider = obj;
        this.$contentDescription = obj2;
        this.$modifier = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.$modifier;
        Object obj4 = this.$contentDescription;
        Object obj5 = this.$provider;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ImageKt.m1115ImageGCr5PR4((BitmapImageProvider) obj5, (String) obj4, (GlanceModifier) obj3, (Composer) obj, 1);
                break;
            case 1:
                ((Number) obj2).intValue();
                RulerKt.MultiMeasureLayout((Modifier) obj5, (ComposableLambdaImpl) obj4, (MeasurePolicy) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            case 2:
                ((Number) obj2).intValue();
                BoxKt.Box((GlanceModifier) obj3, (Alignment) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, 385);
                break;
            case 3:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer = (GapComposer) composer;
                    if (gapComposer.getSkipping()) {
                        gapComposer.skipToGroupEnd();
                        break;
                    }
                }
                ((MutableState) obj5).setValue(Unit.INSTANCE);
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1771214741);
                for (UiGroupElementViewModel uiGroupElementViewModel : ((UiGroupViewModel) obj4).elements) {
                    if (uiGroupElementViewModel instanceof UiGroupElementViewModel.DrawableViewModel) {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        zzrl.ImageOrVisual(uiGroupElementViewModel, RulerKt.layoutId(companion, "imageVisual"), gapComposer2, 0);
                        zzrl.TextAndSpaceElements(0, gapComposer2, RulerKt.layoutId(companion, "text"), (List) obj3);
                        gapComposer2.end(false);
                    }
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                break;
            case 4:
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                obj.getClass();
                viewEnvironment.getClass();
                ((Function4) ((DecorativeViewFactory) obj5).doShowRendering).invoke((View) obj4, (Function2) obj3, obj, viewEnvironment);
                break;
            default:
                ((Number) obj2).intValue();
                KonfettiViewKt.KonfettiView((Modifier) obj5, (List) obj4, (OpenSourceKt$OpenSource$1$1$2) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$3(GlanceModifier glanceModifier, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.$r8$classId = 2;
        this.$modifier = glanceModifier;
        this.$provider = alignment;
        this.$contentDescription = composableLambdaImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageKt$Image$3(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(2);
        this.$r8$classId = i2;
        this.$provider = obj;
        this.$contentDescription = obj2;
        this.$modifier = obj3;
    }
}
