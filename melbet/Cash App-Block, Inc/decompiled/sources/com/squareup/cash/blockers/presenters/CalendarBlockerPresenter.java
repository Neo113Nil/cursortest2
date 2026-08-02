package com.squareup.cash.blockers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.squareup.cash.R;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AnimationDirection;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.CalendarBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class CalendarBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.CalendarBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final AndroidClock clock;
    public final BetterNavigator.ScreenNavigator navigator;
    public final MultiBlockerFacilitator$Resolver resolver;
    public final AndroidStringManager stringManager;

    public CalendarBlockerPresenter(AndroidClock androidClock, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, Analytics analytics, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersScreens.CalendarBlockerScreen calendarBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.args = calendarBlockerScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.resolver = realMultiBlockerFacilitator.getResolver(screenNavigator, calendarBlockerScreen);
    }

    public static LocalDate validPreselectedDate(CalendarBlocker calendarBlocker) {
        String str;
        calendarBlocker.getClass();
        String str2 = calendarBlocker.preselected_date;
        LocalDate localDate = str2 != null ? LocalDateTime.parse(str2, DateTimeFormatter.ISO_DATE_TIME).toLocalDate() : null;
        if (localDate == null) {
            return null;
        }
        String str3 = calendarBlocker.start_date;
        if ((str3 == null || !localDate.isBefore(LocalDateTime.parse(str3, DateTimeFormatter.ISO_DATE_TIME).toLocalDate())) && ((str = calendarBlocker.end_date) == null || !localDate.isAfter(LocalDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME).toLocalDate()))) {
            return localDate;
        }
        Timber.Forest forest = Timber.Forest;
        String str4 = calendarBlocker.start_date;
        String str5 = calendarBlocker.end_date;
        StringBuilder sb = new StringBuilder("Preselected date ");
        sb.append(localDate);
        sb.append(" is out of range [");
        sb.append(str4);
        sb.append(", ");
        forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str5, "]."), new Object[0]);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton;
        CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton2;
        String str;
        AnimationDirection animationDirection;
        BlockersScreens.CalendarBlockerScreen calendarBlockerScreen = this.args;
        CalendarBlocker calendarBlocker = calendarBlockerScreen.calendarBlocker;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1343078930);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(validPreselectedDate(calendarBlocker));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            Boolean bool = calendarBlocker.disabling_toggle_initial_value;
            rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(bool != null ? bool.booleanValue() : false, gapComposer);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1((Object) flow, (Continuation) (0 == true ? 1 : 0), (Object) this, (Object) mutableState3, (State) mutableState, (State) mutableState2, 29));
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            CalendarBlocker.AnimationDirection animationDirection2 = calendarBlocker.submit_animation_direction;
            int i2 = animationDirection2 == null ? -1 : CalendarBlockerPresenterKt$WhenMappings.$EnumSwitchMapping$0[animationDirection2.ordinal()];
            if (i2 == -1 || i2 == 1) {
                animationDirection = AnimationDirection.FORWARD;
            } else {
                if (i2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                animationDirection = AnimationDirection.BACKWARD;
            }
            CalendarBlockerViewModel.Loading loading = new CalendarBlockerViewModel.Loading(animationDirection);
            gapComposer.end(false);
            return loading;
        }
        boolean changed = gapComposer.changed((LocalDate) mutableState.getValue()) | gapComposer.changed(((Boolean) mutableState3.getValue()).booleanValue());
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            LocalDate localDate = (LocalDate) mutableState.getValue();
            Boolean bool2 = (Boolean) mutableState3.getValue();
            boolean booleanValue = bool2.booleanValue();
            if (calendarBlockerScreen.retreatAction != null) {
                toolbarButton2 = CalendarBlockerViewModel.Loaded.ToolbarButton.Back;
            } else if (calendarBlockerScreen.dismissAction != null) {
                toolbarButton2 = CalendarBlockerViewModel.Loaded.ToolbarButton.Close;
            } else {
                toolbarButton = null;
                if (localDate == null) {
                    localDate = validPreselectedDate(calendarBlocker);
                }
                LocalDate localDate2 = localDate;
                str = calendarBlocker.disabling_toggle_label;
                if (str == null) {
                    bool2 = null;
                }
                CalendarBlockerViewModel.Loaded.Toggle toggle = str != null ? new CalendarBlockerViewModel.Loaded.Toggle(str, booleanValue) : null;
                String str2 = calendarBlocker.start_date;
                str2.getClass();
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
                LocalDate localDate3 = LocalDateTime.parse(str2, dateTimeFormatter).toLocalDate();
                localDate3.getClass();
                String str3 = calendarBlocker.end_date;
                str3.getClass();
                LocalDate localDate4 = LocalDateTime.parse(str3, dateTimeFormatter).toLocalDate();
                localDate4.getClass();
                AndroidClock androidClock = this.clock;
                LocalDate localDate5 = Instant.ofEpochMilli(androidClock.millis()).atZone(androidClock.timeZone().toZoneId()).toLocalDate();
                localDate5.getClass();
                String str4 = calendarBlocker.title;
                str4.getClass();
                CalendarBlockerViewModel.Loaded loaded = new CalendarBlockerViewModel.Loaded(toggle, localDate2, localDate3, localDate4, localDate5, str4, this.stringManager.get(R.string.blockers_continue), localDate2 == null || Intrinsics.areEqual(bool2, Boolean.TRUE), toolbarButton, (bool2 == null && bool2.booleanValue()) ? false : true);
                gapComposer.updateRememberedValue(loaded);
                rememberedValue4 = loaded;
            }
            toolbarButton = toolbarButton2;
            if (localDate == null) {
            }
            LocalDate localDate22 = localDate;
            str = calendarBlocker.disabling_toggle_label;
            if (str == null) {
            }
            CalendarBlockerViewModel.Loaded.Toggle toggle2 = str != null ? new CalendarBlockerViewModel.Loaded.Toggle(str, booleanValue) : null;
            String str22 = calendarBlocker.start_date;
            str22.getClass();
            DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_DATE_TIME;
            LocalDate localDate32 = LocalDateTime.parse(str22, dateTimeFormatter2).toLocalDate();
            localDate32.getClass();
            String str32 = calendarBlocker.end_date;
            str32.getClass();
            LocalDate localDate42 = LocalDateTime.parse(str32, dateTimeFormatter2).toLocalDate();
            localDate42.getClass();
            AndroidClock androidClock2 = this.clock;
            LocalDate localDate52 = Instant.ofEpochMilli(androidClock2.millis()).atZone(androidClock2.timeZone().toZoneId()).toLocalDate();
            localDate52.getClass();
            String str42 = calendarBlocker.title;
            str42.getClass();
            CalendarBlockerViewModel.Loaded loaded2 = new CalendarBlockerViewModel.Loaded(toggle2, localDate22, localDate32, localDate42, localDate52, str42, this.stringManager.get(R.string.blockers_continue), localDate22 == null || Intrinsics.areEqual(bool2, Boolean.TRUE), toolbarButton, (bool2 == null && bool2.booleanValue()) ? false : true);
            gapComposer.updateRememberedValue(loaded2);
            rememberedValue4 = loaded2;
        }
        CalendarBlockerViewModel calendarBlockerViewModel = (CalendarBlockerViewModel) rememberedValue4;
        gapComposer.end(false);
        return calendarBlockerViewModel;
    }
}
