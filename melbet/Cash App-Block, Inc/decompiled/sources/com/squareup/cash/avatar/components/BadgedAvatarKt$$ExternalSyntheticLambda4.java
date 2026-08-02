package com.squareup.cash.avatar.components;

import android.content.Context;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.credentials.Credential;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.InputError;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import coil3.request.ImageRequest;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.RealSizeResolver;
import coil3.size.Size;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ToastBinding;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantSection;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetHomeKt;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.util.cash.Countries;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgedAvatarKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BadgedAvatarKt$$ExternalSyntheticLambda4(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 14;
        int i3 = this.f$0;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                PainterRequest painterRequest = (PainterRequest) obj;
                ((Integer) obj3).getClass();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-1577151117);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
                builder.data = painterRequest.url;
                DimensionKt.Dimension(i3);
                builder.sizeResolver = new RealSizeResolver(new Size(new Dimension.Pixels(i3), Dimension.Undefined.INSTANCE));
                ImageRequest build = builder.build();
                if (realImageLoader == null) {
                    gapComposer.startReplaceGroup(481242778);
                    realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
                } else {
                    gapComposer.startReplaceGroup(481241786);
                }
                gapComposer.end(false);
                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(build, realImageLoader, null, gapComposer, 0, 60);
                gapComposer.end(false);
                break;
            case 1:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    composableLambdaImpl.invoke(lazyItemScopeImpl, Integer.valueOf(i3), gapComposer2, Integer.valueOf(intValue & 14));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                InputError inputError = (InputError) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, i3 + " / " + ((InputError.TextTooLong) inputError).maxLength, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                ToastBinding toastBinding = (ToastBinding) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RealToastIconScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Trace.m1190Iconww6aTOc(Countries.painterResource(i3, 0, gapComposer4), (String) toastBinding.iconContentDescription$delegate.getValue(), (Modifier) null, 0L, gapComposer4, Painter.$stable, 12);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                MerchantSection merchantSection = (MerchantSection) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (i3 > 0) {
                        gapComposer5.startReplaceGroup(1029195703);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
                    } else {
                        gapComposer5.startReplaceGroup(1840321670);
                    }
                    gapComposer5.end(false);
                    ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-648695197, new CashtagViewKt$$ExternalSyntheticLambda10(merchantSection, 17), gapComposer5), (Modifier) null, (Function2) null, (Function0) null, (Function2) null, gapComposer5, 6, 30);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (!gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    gapComposer6.skipToGroupEnd();
                } else if (i3 == cardStylePickerViewModel.sections.size() - 1) {
                    gapComposer6.startReplaceGroup(-1422922144);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer6, null);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(-1422855370);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer6, null);
                    gapComposer6.end(false);
                }
                break;
            case 6:
                TextStyle textStyle = (TextStyle) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                    float mo231toDpGaN1DYA = ((Density) gapComposer7.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(textStyle.spanStyle.fontSize) * 0.6f;
                    String stringResource = Room.stringResource(gapComposer7, R.string.prepurchase_card_view_loading);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, mo231toDpGaN1DYA * i3, ((Density) gapComposer7.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(textStyle.paragraphStyle.lineHeight)), 1.0f);
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier alpha = AlphaKt.alpha(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), RecyclerView.DECELERATION_RATE);
                    boolean changed = gapComposer7.changed(stringResource);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 1);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    BoxKt.Box(SemanticsModifierKt.semantics(alpha, false, (Function1) rememberedValue), gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow infoRow = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow) obj4;
                PrepurchaseCashCardPlanningViewModel.LoadableText loadableText = (PrepurchaseCashCardPlanningViewModel.LoadableText) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj2);
                TextStyle textStyle2 = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                if (loadableText instanceof PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded) {
                    gapComposer8.startReplaceGroup(-1051796975);
                    Credential credential = infoRow.action;
                    if ((credential != null ? (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.ActionIconStyle) credential.data : null) == PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.ActionIconStyle.TRAILING_CARET) {
                        gapComposer8.startReplaceGroup(-1051711074);
                        String str = ((PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded) loadableText).text;
                        Painter painter = Icons.SubtlePush16.painter(gapComposer8);
                        Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        zzacp.m2014InlineIconTextQqsJerU(str, painter, null, colors2.semantic.icon.standard, null, textStyle2, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer8, Painter.$stable << 3, 24576, 16340);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-1051426401);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer8, (Modifier) null, textStyle2, (TextLineBalancing) null, ((PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded) loadableText).text, (Map) null, (Function1) null, false);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(false);
                } else {
                    gapComposer8.startReplaceGroup(-1051312414);
                    List list = PrepurchasePlanningSheetHomeKt.listItemLengths;
                    LocaleToggleKt.LoadingTextShimmerBox(((Number) list.get(i3 % list.size())).intValue(), null, textStyle2, gapComposer8, 0, 2);
                    gapComposer8.end(false);
                }
                break;
            default:
                Function0 function0 = (Function0) obj4;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    modalButtonScope.PrimaryModalButton(function0, null, false, Expect_jvmKt.rememberComposableLambda(-1048719245, new TabToolbarsKt$$ExternalSyntheticLambda21(i3, i2), gapComposer9), gapComposer9, ((intValue7 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgedAvatarKt$$ExternalSyntheticLambda4(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }
}
