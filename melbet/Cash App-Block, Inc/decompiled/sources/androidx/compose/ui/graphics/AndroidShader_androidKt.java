package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.presenters.DetailCaptionFormatStringResources;
import com.squareup.cash.offers.presenters.DetailTimeUntilExpirationState;
import com.squareup.cash.offers.viewmodels.OfferCountdownCaptionViewModel;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public abstract class AndroidShader_androidKt {
    public static final int[] makeTransparentColors(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m694toArgb8_81llA(((Color) list.get(i)).value);
        }
        return iArr;
    }

    public static final OfferCountdownCaptionViewModel offerCountdownCaptionModels(AndroidClock androidClock, OfferCountdownTemplateViewModel offerCountdownTemplateViewModel, GapComposer gapComposer, int i) {
        androidClock.getClass();
        offerCountdownTemplateViewModel.getClass();
        boolean changed = gapComposer.changed(offerCountdownTemplateViewModel);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (changed || rememberedValue == obj) {
            Long l = offerCountdownTemplateViewModel.countdownMillis;
            rememberedValue = Updater.mutableStateOf$default(new DetailTimeUntilExpirationState(null, false, l != null && l.longValue() < androidClock.millis()));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        OfferCountdownTemplateViewModel.CountdownFormatStyle countdownFormatStyle = OfferCountdownTemplateViewModel.CountdownFormatStyle.DETAILED;
        DetailCaptionFormatStringResources detailCaptionFormatStringResources = new DetailCaptionFormatStringResources(new OffersHomeQueries$$ExternalSyntheticLambda1(26), new OffersHomeQueries$$ExternalSyntheticLambda1(27), new OffersHomeQueries$$ExternalSyntheticLambda1(28), new OffersHomeQueries$$ExternalSyntheticLambda1(29));
        boolean changedInstance = gapComposer.changedInstance(offerCountdownTemplateViewModel) | gapComposer.changedInstance(androidClock) | gapComposer.changed(mutableState) | gapComposer.changed(detailCaptionFormatStringResources);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == obj) {
            Object musicPresenter$models$1$1 = new MusicPresenter$models$1$1(offerCountdownTemplateViewModel, androidClock, detailCaptionFormatStringResources, mutableState, (Continuation) null);
            gapComposer.updateRememberedValue(musicPresenter$models$1$1);
            rememberedValue2 = musicPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, offerCountdownTemplateViewModel, (Function2) rememberedValue2);
        return new OfferCountdownCaptionViewModel(offerCountdownTemplateViewModel.icon, offerCountdownTemplateViewModel.stringToReplace, ((DetailTimeUntilExpirationState) mutableState.getValue()).useServerCaptionTemplate ? offerCountdownTemplateViewModel.text : null, ((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource, offerCountdownTemplateViewModel.textColor, ((DetailTimeUntilExpirationState) mutableState.getValue()).isExpired);
    }

    public static String truncateAtMiddle$default(String str) {
        str.getClass();
        return str.length() > "...".length() + 12 ? Recorder$$ExternalSyntheticOutline2.m(StringsKt___StringsKt.take(6, str), "...", StringsKt___StringsKt.takeLast(6, str)) : str;
    }

    public static final void validateColorStops(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("colors and colorStops arguments must have equal length.");
        }
    }
}
