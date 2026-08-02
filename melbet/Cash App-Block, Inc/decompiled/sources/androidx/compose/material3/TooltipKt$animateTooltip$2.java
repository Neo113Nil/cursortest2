package androidx.compose.material3;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt$InvestingCategoryDetail$1$2$1$1$5$1$1$1$3$2$1;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.pools.viewmodels.ContributionAnimation;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.slf4j.Marker;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final class TooltipKt$animateTooltip$2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $transition;

    public /* synthetic */ TooltipKt$animateTooltip$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$transition = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        TextContextMenuHelperApi28 textContextMenuHelperApi28 = TextContextMenuHelperApi28.INSTANCE;
        Object obj4 = this.$transition;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj;
                ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-1498516085);
                SpringSpec value = MenuKt.value(MotionSchemeKeyTokens.FastSpatial, gapComposer);
                SpringSpec value2 = MenuKt.value(MotionSchemeKeyTokens.FastEffects, gapComposer);
                Transition transition = (Transition) obj4;
                TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                InteractionResult interactionResult = transition.transitionState;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
                boolean booleanValue = ((Boolean) interactionResult.getCurrentState()).booleanValue();
                gapComposer.startReplaceGroup(-1553362193);
                float f = booleanValue ? 1.0f : 0.8f;
                gapComposer.end(false);
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
                gapComposer.startReplaceGroup(-1553362193);
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                gapComposer.end(false);
                Float valueOf2 = Float.valueOf(f2);
                transition.getSegment();
                gapComposer.startReplaceGroup(386845748);
                gapComposer.end(false);
                Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(transition, valueOf, valueOf2, value, twoWayConverterImpl, gapComposer, 196608);
                boolean booleanValue3 = ((Boolean) transition.transitionState.getCurrentState()).booleanValue();
                gapComposer.startReplaceGroup(2073045083);
                float f3 = booleanValue3 ? 1.0f : 0.0f;
                gapComposer.end(false);
                Float valueOf3 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
                gapComposer.startReplaceGroup(2073045083);
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                gapComposer.end(false);
                Float valueOf4 = Float.valueOf(f4);
                transition.getSegment();
                gapComposer.startReplaceGroup(-281714272);
                gapComposer.end(false);
                Modifier m686graphicsLayerAp8cVGQ$default = ColorKt.m686graphicsLayerAp8cVGQ$default(modifier, ((Number) createTransitionAnimation.value$delegate.getValue()).floatValue(), ((Number) createTransitionAnimation.value$delegate.getValue()).floatValue(), ((Number) AnimatableKt.createTransitionAnimation(transition, valueOf3, valueOf4, value2, twoWayConverterImpl, gapComposer, 196608).value$delegate.getValue()).floatValue(), RecyclerView.DECELERATION_RATE, null, 131064);
                gapComposer.end(false);
                break;
            case 1:
                long j = ((Color) obj).value;
                Composer composer = (Composer) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(j) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    DefaultTextContextMenuDropdownProvider_androidKt.m374IconBoxRPmYEkk(((TextContextMenuItem) obj4).leadingIcon, j, gapComposer2, (intValue << 3) & 112);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                long j2 = ((Color) obj).value;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Number) obj3).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    textContextMenuHelperApi28.IconBox((Drawable) obj4, gapComposer3, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                long j3 = ((Color) obj).value;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Number) obj3).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    textContextMenuHelperApi28.IconBox(((RemoteAction) obj4).getIcon(), gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Number) obj3).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    ((Function2) obj4).invoke(gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue5 = ((Number) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj2);
                gapComposer6.startReplaceGroup(-1040990606);
                Image image = ((StackedAvatarViewModel.Avatar) obj4).remoteImage;
                if (image == null) {
                    gapComposer6.startReplaceGroup(1807753058);
                    gapComposer6.end(false);
                } else {
                    r4 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer6, 335409279, image, gapComposer6, false);
                }
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, r4, gapComposer6, intValue5 & 14, 0);
                gapComposer6.end(false);
                break;
            case 6:
                Composer composer5 = (Composer) obj2;
                int intValue6 = ((Number) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    String urlForTheme = ThemablesKt.urlForTheme(((InvestingCryptoAvatarContentModel$Image) ((StockContentModel) obj4).avatar).image, gapComposer7);
                    AvatarSize avatarSize = AvatarSize.Size48;
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors.semantic.icon.standard, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.Remote.Image(urlForTheme, false, null, 0L, InvestingCategoryDetailKt$InvestingCategoryDetail$1$2$1$1$5$1$1$1$3$2$1.INSTANCE, 62), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer7, 3126, 0, 2000);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer6 = (Composer) obj2;
                int intValue7 = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((QuickPayViewModel.Ready) obj4).primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer7 = (Composer) obj2;
                ((Number) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                long j4 = Strings.getColors(composer7).semantic.background.subtle;
                Strings.getSizes(composer7).getClass();
                Object obj5 = DefaultSizes.border.entries;
                ContributionAnimation contributionAnimation = (ContributionAnimation) obj4;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(composer7).semantic.text.standard, composer7, SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, j4, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 13.0f, 3.0f), Strings.getTypography(composer7).bodySmall, (TextLineBalancing) null, Recorder$$ExternalSyntheticOutline2.m(Marker.ANY_NON_NULL_MARKER, contributionAnimation != null ? contributionAnimation.contributionAmountFormatted : null), (Map) null, (Function1) null, false);
                break;
            default:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    PoolListSection.PoolListPerson poolListPerson = (PoolListSection.PoolListPerson) obj4;
                    boolean z = poolListPerson.addedToPool;
                    boolean z2 = poolListPerson.isRequestInFlight;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (z && z2) ? re$$ExternalSyntheticOutline0.m(gapComposer9, -46222659, R.string.pools_removing_people_button_title, gapComposer9, false) : z ? re$$ExternalSyntheticOutline0.m(gapComposer9, -46083841, R.string.pools_remove_people_button_title, gapComposer9, false) : z2 ? re$$ExternalSyntheticOutline0.m(gapComposer9, -45940993, R.string.pools_adding_people_button_title, gapComposer9, false) : re$$ExternalSyntheticOutline0.m(gapComposer9, -45828990, R.string.pools_add_people_button_title, gapComposer9, false), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
