package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.DateFormat;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class BirthdayPresenter implements MoleculePresenter {
    public static final DateTimeFormatter DATE_FORMAT_OUT = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.US);
    public final BlockersScreens.BirthdayScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final DateFormat dateFormatIn;
    public final LocalDate earliestBirthday = LocalDate.from(DATE_FORMAT_OUT.parse("01/01/1900"));
    public final BetterNavigator.ScreenNavigator navigator;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InternalResult {
        public static final /* synthetic */ InternalResult[] $VALUES;
        public static final InternalResult DONE;
        public static final InternalResult INVALID_SUBMISSION;

        static {
            InternalResult internalResult = new InternalResult("INVALID_SUBMISSION", 0);
            INVALID_SUBMISSION = internalResult;
            InternalResult internalResult2 = new InternalResult("DONE", 1);
            DONE = internalResult2;
            $VALUES = new InternalResult[]{internalResult, internalResult2};
        }

        public static InternalResult valueOf(String str) {
            return (InternalResult) Enum.valueOf(InternalResult.class, str);
        }

        public static InternalResult[] values() {
            return (InternalResult[]) $VALUES.clone();
        }
    }

    public BirthdayPresenter(AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, SecuritySignalsAggregator securitySignalsAggregator, BlockersScreens.BirthdayScreen birthdayScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidDateFormatManager androidDateFormatManager) {
        this.stringManager = androidStringManager;
        this.blockersNavigator = blockersDataNavigator;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.args = birthdayScreen;
        this.navigator = screenNavigator;
        this.dateFormatIn = androidDateFormatManager.getDateFormat("MM/dd/yyyy", androidDateFormatManager.clock.timeZone());
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(64451119);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue == Composer.Companion.Empty) {
            BlockersScreens.BirthdayScreen birthdayScreen = this.args;
            String str3 = (String) birthdayScreen.birthday.getValue();
            DateFormat dateFormat = this.dateFormatIn;
            if (str3 != null) {
                try {
                    str = dateFormat.formatter.format(DATE_FORMAT_OUT.parse(str3));
                } catch (DateTimeException unused) {
                    str = null;
                }
                str2 = str;
            } else {
                str2 = null;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.pattern, dateFormat.formatter.getLocale());
            simpleDateFormat.setLenient(false);
            String str4 = (String) birthdayScreen.titleOverride.getValue();
            AndroidStringManager androidStringManager = this.stringManager;
            if (str4 == null) {
                str4 = androidStringManager.get(R.string.blockers_birthday_title);
            }
            String str5 = androidStringManager.get(R.string.blockers_birthday_description);
            String upperCase = dateFormat.localizedPattern.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            rememberedValue = Updater.mutableStateOf$default(new BirthdayViewModel(false, simpleDateFormat, str2, str4, str5, upperCase, true));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(12, mutableState, this, flow, continuation));
        BirthdayViewModel birthdayViewModel = (BirthdayViewModel) mutableState.getValue();
        gapComposer.end(false);
        return birthdayViewModel;
    }
}
