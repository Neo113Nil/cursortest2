package com.squareup.cash.blockers.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.savedstate.SavedStateWriterKt;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.history.views.ReportAbuseViewKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class SignatureViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ SignatureViewKt$$ExternalSyntheticLambda2(int i, int i2, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        Painter painter;
        long j2;
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(R.drawable.temporary_undo_drawable, 0, gapComposer);
                    if (z) {
                        gapComposer.startReplaceGroup(-1212782407);
                        j = MooncakeTheme.getColors(gapComposer).icon;
                    } else {
                        gapComposer.startReplaceGroup(-1212781407);
                        j = MooncakeTheme.getColors(gapComposer).disabledIcon;
                    }
                    gapComposer.end(false);
                    ImageKt.Image(painterResource, "Undo", null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    CheckoutExpandableReviewRowKt.CheckoutReviewRowCaret(z, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
                    if (z) {
                        gapComposer3.startReplaceGroup(-245601261);
                        painter = Icons.CaretUp16.painter(gapComposer3);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-245544655);
                        painter = Icons.CaretDown16.painter(gapComposer3);
                        gapComposer3.end(false);
                    }
                    Painter painter2 = painter;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j3 = colors.semantic.icon.extraSubtle;
                    ImageKt.Image(painter2, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 25008, 40);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                CardStudioViewV2Kt.TrashBin(z, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ReportAbuseViewKt.Pip(z, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, z ? R.string.pools_more_options_manage_people_title : R.string.pools_more_options_view_people_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, z ? R.string.pools_more_options_close_pool_title : R.string.pools_more_options_leave_pool_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                    Painter painterResource2 = Countries.painterResource(R.drawable.filters, 0, gapComposer6);
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 22.0f);
                    if (z) {
                        gapComposer6.startReplaceGroup(-299123243);
                        j2 = MooncakeTheme.getColors(gapComposer6).primaryButtonBackground;
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-299036536);
                        j2 = MooncakeTheme.getColors(gapComposer6).icon;
                        gapComposer6.end(false);
                    }
                    ImageKt.Image(painterResource2, null, m285size3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer6, Painter.$stable | 432, 56);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                SavedStateWriterKt.PagerDot(z, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SignatureViewKt$$ExternalSyntheticLambda2(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }
}
