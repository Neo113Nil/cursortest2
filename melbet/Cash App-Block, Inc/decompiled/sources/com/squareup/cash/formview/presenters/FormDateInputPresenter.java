package com.squareup.cash.formview.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.formview.viewmodels.FormDateInputViewModel;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class FormDateInputPresenter implements MoleculePresenter {
    public static final DateTimeFormatter ALL_OFFSET_FORMATTER;
    public final AndroidClock clock;
    public final DateTimeFormatter dateFormat;
    public final FormDateInputViewModel defaultViewModel;
    public final FormBlocker.Element.DateInputElement element;
    public final OffsetDateTime maxDate;
    public final OffsetDateTime minDate;

    /* loaded from: classes.dex */
    public interface Factory {

        public final class Impl implements Factory {
            public final MetroFactory delegateFactory;

            public Impl(MetroFactory metroFactory) {
                this.delegateFactory = metroFactory;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider clock;

        public MetroFactory(LambdaProvider lambdaProvider) {
            this.clock = lambdaProvider;
        }
    }

    static {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HH:MM", "+00:00").optionalEnd().optionalStart().appendOffset("+HHMM", "+0000").optionalEnd().optionalStart().appendOffset("+HH", "Z").optionalEnd().toFormatter();
        formatter.getClass();
        ALL_OFFSET_FORMATTER = formatter;
    }

    public FormDateInputPresenter(AndroidClock androidClock, FormBlocker.Element.DateInputElement dateInputElement) {
        Object failure;
        FormDateInputViewModel.Status status;
        OffsetDateTime parse;
        OffsetDateTime parse2;
        this.clock = androidClock;
        this.element = dateInputElement;
        String str = dateInputElement.minimum_date;
        DateTimeFormatter dateTimeFormatter = ALL_OFFSET_FORMATTER;
        this.minDate = (str == null || (parse2 = OffsetDateTime.parse(str, dateTimeFormatter)) == null) ? LocalDate.of(1900, Month.JANUARY, 1).atStartOfDay(ZoneId.of(androidClock.timeZone().getID())).toOffsetDateTime() : parse2;
        String str2 = dateInputElement.maximum_date;
        this.maxDate = (str2 == null || (parse = OffsetDateTime.parse(str2, dateTimeFormatter)) == null) ? LocalDate.of(2100, Month.JANUARY, 1).atStartOfDay(ZoneId.of(androidClock.timeZone().getID())).toOffsetDateTime() : parse;
        this.dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        try {
            Result.Companion companion = Result.Companion;
            failure = LocalDate.parse(dateInputElement.default_value);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        failure = failure instanceof Result.Failure ? failure : this.dateFormat.format((LocalDate) failure);
        String str3 = (String) (failure instanceof Result.Failure ? null : failure);
        SubmitFormRequest.ElementResult.DateInputResult parse3 = str3 != null ? parse(str3) : null;
        if (parse3 != null) {
            status = FormDateInputViewModel.Status.VALID;
        } else {
            Boolean bool = this.element.is_optional;
            status = bool != null ? bool.booleanValue() : false ? FormDateInputViewModel.Status.VALID : FormDateInputViewModel.Status.WAITING_FOR_INPUT;
        }
        FormDateInputViewModel.Status status2 = status;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        simpleDateFormat.setLenient(false);
        String upperCase = "MM/dd/yyyy".toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.defaultViewModel = new FormDateInputViewModel(simpleDateFormat, upperCase, "XX/XX/XXXX", str3, status2, parse3 == null ? new SubmitFormRequest.ElementResult.DateInputResult((Integer) null, (Integer) null, (Integer) null, 15) : parse3);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final FormDateInputViewModel models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1832338470);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, mutableState2, mutableState, 2));
        FormDateInputViewModel.Status status = (FormDateInputViewModel.Status) mutableState.getValue();
        FormDateInputViewModel formDateInputViewModel = this.defaultViewModel;
        if (status == null) {
            status = formDateInputViewModel.status;
        }
        FormDateInputViewModel.Status status2 = status;
        SubmitFormRequest.ElementResult.DateInputResult dateInputResult = (SubmitFormRequest.ElementResult.DateInputResult) mutableState2.getValue();
        if (dateInputResult == null) {
            dateInputResult = formDateInputViewModel.dateInputResult;
        }
        SimpleDateFormat simpleDateFormat = formDateInputViewModel.dateFormat;
        String str = formDateInputViewModel.hint;
        String str2 = formDateInputViewModel.formattingMask;
        String str3 = formDateInputViewModel.defaultText;
        str.getClass();
        FormDateInputViewModel formDateInputViewModel2 = new FormDateInputViewModel(simpleDateFormat, str, str2, str3, status2, dateInputResult);
        gapComposer.end(false);
        return formDateInputViewModel2;
    }

    public final SubmitFormRequest.ElementResult.DateInputResult parse(String str) {
        try {
            OffsetDateTime offsetDateTime = LocalDate.parse(str, this.dateFormat).atStartOfDay(ZoneId.of(this.clock.timeZone().getID())).toOffsetDateTime();
            if (offsetDateTime.isBefore(this.minDate) || offsetDateTime.isAfter(this.maxDate)) {
                return null;
            }
            return new SubmitFormRequest.ElementResult.DateInputResult(Integer.valueOf(offsetDateTime.getDayOfMonth()), Integer.valueOf(offsetDateTime.getMonthValue()), Integer.valueOf(offsetDateTime.getYear()), 8);
        } catch (DateTimeParseException unused) {
            return null;
        }
    }
}
