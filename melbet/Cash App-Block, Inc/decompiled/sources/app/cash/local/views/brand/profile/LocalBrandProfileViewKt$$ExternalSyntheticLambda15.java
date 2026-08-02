package app.cash.local.views.brand.profile;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.primitives.BrandToken;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandProfileViewKt$$ExternalSyntheticLambda15 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalBrandProfileViewModel f$0;

    public /* synthetic */ LocalBrandProfileViewKt$$ExternalSyntheticLambda15(LocalBrandProfileViewModel localBrandProfileViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = localBrandProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Color m;
        long j;
        int i = this.$r8$classId;
        String str = null;
        LocalBrandProfileViewModel localBrandProfileViewModel = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(484077495, new LocalBrandProfileViewKt$$ExternalSyntheticLambda15(localBrandProfileViewModel, i2), gapComposer), gapComposer, 6);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    String str2 = ((LocalBrandProfileViewModel.Content) localBrandProfileViewModel).name;
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 5, 48, 0, 3824, colors.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    coil3.size.SizeKt.AdaptiveStack(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), null, null, null, null, null, Expect_jvmKt.rememberComposableLambda(-1846482519, new LocalBrandProfileViewKt$$ExternalSyntheticLambda15(localBrandProfileViewModel, r2), gapComposer), gapComposer, 1572870, 62);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                UiScope uiScope = (UiScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    LocalBrandProfileViewModel.Content content = (LocalBrandProfileViewModel.Content) localBrandProfileViewModel;
                    LocalImage localImage = content.heroImage;
                    SharedTransitionScope.SharedContentState rememberSharedContentState = uiScope.rememberSharedContentState(new BrandToken(content.brandToken), gapComposer2, (intValue2 << 3) & 112);
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    Modifier aspectRatio = OffsetKt.aspectRatio(0.8f, SizeKt.m290width3ABfNKs(SharedTransitionScope.sharedElement$default(uiScope, modifier, rememberSharedContentState, uiScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), 48.0f), false);
                    LocalColor localColor = localImage != null ? localImage.placeholder_color : null;
                    if (localColor == null) {
                        gapComposer2.startReplaceGroup(-1347027942);
                        gapComposer2.end(false);
                        m = null;
                    } else {
                        gapComposer2.startReplaceGroup(1342020807);
                        m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0));
                    }
                    if (m == null) {
                        gapComposer2.startReplaceGroup(-1346951557);
                        LocalColor localColor2 = content.overrideBackgroundColor;
                        if (localColor2 == null) {
                            gapComposer2.startReplaceGroup(-1346951558);
                            gapComposer2.end(false);
                            m = null;
                        } else {
                            gapComposer2.startReplaceGroup(1342023271);
                            m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor2, gapComposer2, 0));
                        }
                    } else {
                        gapComposer2.startReplaceGroup(1342020078);
                    }
                    gapComposer2.end(false);
                    if (m == null) {
                        gapComposer2.startReplaceGroup(1342025981);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.semantic.background.subtle;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1342020153);
                        gapComposer2.end(false);
                        j = m.value;
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(aspectRatio, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), RecyclerView.DECELERATION_RATE, 12.0f, 1);
                    Float ratio = localImage != null ? LocalViewsKt.getRatio(localImage) : null;
                    if (ratio != null) {
                        modifier = OffsetKt.aspectRatio(ratio.floatValue(), modifier, false);
                    }
                    Modifier modifier2 = modifier;
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    if (localImage == null) {
                        gapComposer2.startReplaceGroup(-1346515295);
                    } else {
                        gapComposer2.startReplaceGroup(1342037344);
                        str = LocalViewsKt.getThemedUrl(localImage, gapComposer2);
                    }
                    gapComposer2.end(false);
                    LocalMapKt.LocalAsyncImage(m300paddingVpY3zN4$default, modifier2, str, ContentScale.Companion.Fit, biasAlignment, null, LocalBrandLocationRowKt.lambda$638752601, gapComposer2, 1600512, 32);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    LocalBrandProfileViewModel.Content content2 = (LocalBrandProfileViewModel.Content) localBrandProfileViewModel;
                    String description = content2.locationStatus.getDescription();
                    if (description != null && !StringsKt.isBlank(description)) {
                        str = content2.locationStatus.getDescription();
                    }
                    String str3 = content2.cashtag;
                    if (str3 == null) {
                        gapComposer3.startReplaceGroup(1380664722);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1380664723);
                        String concat = str3.concat(str != null ? " · " : "");
                        TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                        Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3826, colors3.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, concat, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                    if (str != null) {
                        gapComposer3.startReplaceGroup(1381026028);
                        TextStyle textStyle3 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                        Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3826, colors4.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle3, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1381284537);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
