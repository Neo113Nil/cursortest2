package com.squareup.cash.deposits.physical.view.details;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import com.google.android.datatransport.cct.StringMerger;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocationDetailSheetView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LocationDetailsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LocationDetailSheetView$$ExternalSyntheticLambda0(LocationDetailsViewModel locationDetailsViewModel, Function1 function1) {
        this.f$0 = locationDetailsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        LocationDetailsViewModel locationDetailsViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    StringMerger.LocationDetailSheet(locationDetailsViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj3 = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    String stringResource = Room.stringResource(gapComposer2, R.string.address_long_press_content_description);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(6, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Recipient$$ExternalSyntheticLambda2(5);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer2, ImageKt.m184combinedClickableauXiCPI$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, stringResource, function0, (Function0) rememberedValue3, 412), (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel.getAddress(), (Map) null, (Function1) null, false);
                    String locationDescription = locationDetailsViewModel.getLocationDescription();
                    if (locationDescription == null) {
                        gapComposer2.startReplaceGroup(283966099);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(283966100);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDescription, (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                StringMerger.LocationDetailSheet(locationDetailsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocationDetailSheetView$$ExternalSyntheticLambda0(LocationDetailsViewModel locationDetailsViewModel, Function1 function1, int i) {
        this.f$0 = locationDetailsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ LocationDetailSheetView$$ExternalSyntheticLambda0(Function1 function1, LocationDetailsViewModel locationDetailsViewModel) {
        this.f$1 = function1;
        this.f$0 = locationDetailsViewModel;
    }
}
