package androidx.compose.animation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.sheet.EducationalSheetKt$EducationalTiledHeroImage$1$1$1;
import app.cash.local.views.sheet.HeroShape;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$3$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$4$1;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$13 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Object $content;
    public final /* synthetic */ Object $enter;
    public final /* synthetic */ Object $exit;
    public final /* synthetic */ Object $modifier;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_AnimatedVisibility;
    public final /* synthetic */ Function1 $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedVisibilityKt$AnimatedVisibility$13(Transition transition, Function1 function1, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, Function3 function3, int i, int i2) {
        super(2);
        this.$r8$classId = i2;
        this.$this_AnimatedVisibility = transition;
        this.$visible = function1;
        this.$modifier = modifier;
        this.$enter = enterTransitionImpl;
        this.$exit = exitTransitionImpl;
        this.$content = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Color m;
        long j;
        int i = this.$r8$classId;
        Object obj3 = this.$enter;
        Object obj4 = this.$content;
        Object obj5 = this.$this_AnimatedVisibility;
        Object obj6 = this.$modifier;
        Object obj7 = this.$exit;
        final int i2 = this.$$changed;
        int i3 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                Function1 function1 = this.$visible;
                AnimatedContentKt.AnimatedVisibility((Transition) obj5, function1, (Modifier) obj6, (EnterTransitionImpl) obj3, (ExitTransitionImpl) obj7, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Number) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                Function1 function12 = this.$visible;
                AnimatedContentKt.AnimatedVisibilityImpl((Transition) obj5, function12, (Modifier) obj6, (EnterTransitionImpl) obj3, (ExitTransitionImpl) obj7, (Function3) obj4, (Composer) obj, updateChangedFlags2);
                break;
            default:
                Composer composer = (Composer) obj;
                EducationalSheetModel.Image.TiledHeroImage tiledHeroImage = (EducationalSheetModel.Image.TiledHeroImage) obj7;
                ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) obj6;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer = (GapComposer) composer;
                    if (gapComposer.getSkipping()) {
                        gapComposer.skipToGroupEnd();
                        break;
                    }
                }
                ((MutableState) obj5).setValue(Unit.INSTANCE);
                constraintLayoutScope.getClass();
                constraintLayoutScope.reset();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(261943590);
                ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) constraintLayoutScope.createRefs().mClientFragmentManager;
                ConstrainedLayoutReference createRef = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef2 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef3 = constraintLayoutScope2.createRef();
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj8 = Composer.Companion.Empty;
                if (rememberedValue == obj8) {
                    rememberedValue = EducationalSheetKt$EducationalTiledHeroImage$1$1$1.INSTANCE;
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier constrainAs = ConstraintLayoutScope.constrainAs(companion, createRef, (Function1) rememberedValue);
                Float ratio = LocalViewsKt.getRatio(tiledHeroImage.heroImage);
                ratio.getClass();
                BoxKt.Box(ClipKt.paint$default(ClipKt.clip(OffsetKt.aspectRatio(ratio.floatValue(), constrainAs, false), new HeroShape()), AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer2, (String) obj4), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, 54), gapComposer2, 0);
                LocalImage localImage = tiledHeroImage.tileImage;
                String themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer2);
                boolean changed = gapComposer2.changed(createRef);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed || rememberedValue2 == obj8) {
                    rememberedValue2 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef, i3);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(ConstraintLayoutScope.constrainAs(companion, createRef2, (Function1) rememberedValue2), 60.0f), 72.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(RecyclerView.DECELERATION_RATE, 12.0f, 13)), RecyclerView.DECELERATION_RATE, 8.0f, 8.0f, RecyclerView.DECELERATION_RATE, 9);
                LocalColor localColor = localImage.placeholder_color;
                if (localColor == null) {
                    gapComposer2.startReplaceGroup(263106088);
                    z = false;
                    gapComposer2.end(false);
                    m = null;
                } else {
                    z = false;
                    gapComposer2.startReplaceGroup(-130060039);
                    m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0));
                }
                if (m == null) {
                    gapComposer2.startReplaceGroup(-130057713);
                    j = Strings.getColors(gapComposer2).semantic.background.subtle;
                    gapComposer2.end(z);
                } else {
                    gapComposer2.startReplaceGroup(-130060751);
                    gapComposer2.end(z);
                    j = m.value;
                }
                Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(12.0f, m302paddingqDBjuR0$default, j, 4.0f);
                boolean z2 = z;
                LocalMapKt.LocalAsyncImage(m2, null, themedUrl, ContentScale.Companion.Fit, null, null, null, gapComposer2, 3072, 114);
                boolean changed2 = gapComposer2.changed(createRef2) | gapComposer2.changed(createRef);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue3 == obj8) {
                    rememberedValue3 = new QuickPayViewKt$QuickPay$1$1$1$3$1(createRef2, createRef, 1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Modifier constrainAs2 = ConstraintLayoutScope.constrainAs(companion, createRef3, (Function1) rememberedValue3);
                String str = tiledHeroImage.caption;
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyXSmall, 0L, Room.getSp(10), null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, Room.getSp(20), null, null, 0, 16646109);
                final Function1 function13 = this.$visible;
                boolean changed3 = gapComposer2.changed(function13) | gapComposer2.changed(i2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue4 == obj8) {
                    rememberedValue4 = new Function2() { // from class: app.cash.local.views.sheet.EducationalSheetKt$EducationalTiledHeroImage$1$4$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            String str2 = (String) obj9;
                            str2.getClass();
                            ((String) obj10).getClass();
                            function13.invoke(new EducationalSheetEvent.OnUrlClick(i2, str2));
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue4, constrainAs2, m994copyp1EtxEg$default, 0L, null, null, null, 3, 0, 5, gapComposer2, 100663296, 752);
                gapComposer2.end(z2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$13(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, EducationalSheetModel.Image.TiledHeroImage tiledHeroImage, String str, Function1 function1, int i) {
        super(2);
        this.$r8$classId = 2;
        this.$this_AnimatedVisibility = mutableState;
        this.$modifier = constraintLayoutScope;
        this.$enter = function0;
        this.$exit = tiledHeroImage;
        this.$content = str;
        this.$visible = function1;
        this.$$changed = i;
    }
}
