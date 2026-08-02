package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class DateInputKt {
    public static final PaddingValuesImpl InputTextFieldPadding = SpacerKt.m297PaddingValuesa9UjIt4$default(24.0f, 10.0f, 24.0f, RecyclerView.DECELERATION_RATE, 8);
    public static final float InputTextNonErroneousBottomPadding = 16.0f;

    public static final void DateInputContent(Long l, Function1 function1, CalendarModelImpl calendarModelImpl, IntRange intRange, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i) {
        String replace;
        String replace2;
        String replace3;
        int i2;
        DateInputFormat dateInputFormat;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-432341251);
        int i3 = i | (gapComposer.changed(l) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(calendarModelImpl) ? 256 : 128) | (gapComposer.changedInstance(intRange) ? 2048 : 1024) | (gapComposer.changed(datePickerFormatterImpl) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(datePickerDefaults$AllDates$1) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(datePickerColors) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(focusRequester) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean changed = gapComposer.changed(calendarModelImpl.locale);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                Locale locale = calendarModelImpl.locale;
                replace = new Regex("[^dMy/\\-.]").replace(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale), "");
                replace2 = new Regex("d{1,2}").replace(replace, "dd");
                replace3 = new Regex("M{1,2}").replace(replace2, "MM");
                String removeSuffix = StringsKt.removeSuffix(StringsKt__StringsJVMKt.replace$default(new Regex("y{1,4}").replace(replace3, "yyyy"), "My", "M/y"), ".");
                MatcherMatchResult find = new Regex("[/\\-.]").find(removeSuffix);
                find.getClass();
                MatchGroup matchGroup = find.groups.get(0);
                matchGroup.getClass();
                rememberedValue = new DateInputFormat(removeSuffix, matchGroup.value.charAt(0));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) rememberedValue;
            String m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_input_invalid_for_pattern);
            String m568getString2EP1pXo2 = Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_input_invalid_year_range);
            String m568getString2EP1pXo3 = Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_input_invalid_not_allowed);
            boolean changed2 = gapComposer.changed(dateInputFormat2) | ((57344 & i3) == 16384);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                i2 = 0;
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(intRange, datePickerDefaults$AllDates$1, dateInputFormat, datePickerFormatterImpl, m568getString2EP1pXo, m568getString2EP1pXo2, m568getString2EP1pXo3);
                gapComposer.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            } else {
                dateInputFormat = dateInputFormat2;
                i2 = 0;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            String upperCase = dateInputFormat.patternWithDelimiters.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String m568getString2EP1pXo4 = Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_input_label);
            Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), InputTextFieldPadding);
            dateInputValidator2.getClass();
            Locale locale2 = calendarModelImpl.locale;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-752164549, new ButtonKt$Button$2.AnonymousClass1(1, m568getString2EP1pXo4, upperCase), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1179434278, new DateInputKt$DateInputContent$3(upperCase, i2), gapComposer);
            int i4 = i3 << 3;
            m520DateInputTextFieldxJ3Ic0Y(padding, l, function1, calendarModelImpl, rememberComposableLambda, rememberComposableLambda2, dateInputValidator2, dateInputFormat, locale2, datePickerColors, focusRequester, gapComposer, (i4 & 112) | 1794054 | (i4 & 896) | (i4 & 7168), (i3 >> 18) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(l, function1, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, focusRequester, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    /* renamed from: DateInputTextField-xJ3Ic0Y, reason: not valid java name */
    public static final void m520DateInputTextFieldxJ3Ic0Y(final Modifier modifier, Long l, final Function1 function1, final CalendarModelImpl calendarModelImpl, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final DateInputValidator dateInputValidator, final DateInputFormat dateInputFormat, final Locale locale, DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        GapComposer gapComposer;
        int i5;
        int i6;
        int i7;
        int i8;
        MutableState mutableState;
        Object sliderKt$$ExternalSyntheticLambda4;
        NeverEqualPolicy neverEqualPolicy;
        int i9;
        ?? r2;
        DateInputFormat dateInputFormat2;
        MutableState mutableState2;
        final Long l2 = l;
        CalendarModelImpl calendarModelImpl2 = calendarModelImpl;
        Locale locale2 = locale;
        DatePickerColors datePickerColors2 = datePickerColors;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1456309913);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(l2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(calendarModelImpl2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changed(0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(dateInputFormat) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changedInstance(locale2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(datePickerColors2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(focusRequester) ? 32 : 16;
        }
        int i10 = i4;
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(11);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue, (Composer) gapComposer2, MLKEMEngine.KyberPolyBytes);
            Object[] objArr2 = {(TextFieldValue) rememberSaveable.getValue()};
            int i11 = 29360128 & i3;
            boolean changed = gapComposer2.changed(rememberSaveable) | (i11 == 8388608) | gapComposer2.changedInstance(calendarModelImpl2);
            int i12 = i3 & 234881024;
            boolean changedInstance = changed | (i12 == 67108864) | gapComposer2.changedInstance(locale2);
            int i13 = i3 & 3670016;
            boolean z = changedInstance | (i13 == 1048576);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy2) {
                i5 = i13;
                i6 = i11;
                i7 = i12;
                i8 = 8388608;
                rememberedValue2 = new ta$$ExternalSyntheticLambda1(dateInputValidator, calendarModelImpl2, dateInputFormat, locale2, rememberSaveable, 1);
                calendarModelImpl2 = calendarModelImpl2;
                mutableState = rememberSaveable;
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                i5 = i13;
                mutableState = rememberSaveable;
                i6 = i11;
                i7 = i12;
                i8 = 8388608;
            }
            MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer2, 0);
            boolean isBlank = StringsKt.isBlank((CharSequence) mutableState3.getValue());
            float f = InputTextNonErroneousBottomPadding;
            if (!isBlank) {
                if (!((16.0f >= RecyclerView.DECELERATION_RATE) & (4.0f >= RecyclerView.DECELERATION_RATE) & (16.0f >= RecyclerView.DECELERATION_RATE) & (RecyclerView.DECELERATION_RATE >= RecyclerView.DECELERATION_RATE))) {
                    InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
                }
                f -= RecyclerView.DECELERATION_RATE + 4.0f;
            }
            float f2 = f;
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            boolean changed2 = ((i3 & 896) == 256) | (i7 == 67108864) | gapComposer2.changed(mutableState) | gapComposer2.changed(mutableState3) | gapComposer2.changedInstance(calendarModelImpl2) | gapComposer2.changedInstance(locale2) | (i6 == i8) | (i5 == 1048576);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                MutableState mutableState4 = mutableState;
                neverEqualPolicy = neverEqualPolicy2;
                i9 = 32;
                r2 = 0;
                CalendarModelImpl calendarModelImpl3 = calendarModelImpl2;
                sliderKt$$ExternalSyntheticLambda4 = new androidx.compose.material.SliderKt$$ExternalSyntheticLambda4(dateInputFormat, mutableState3, function1, calendarModelImpl3, locale2, dateInputValidator, mutableState4, 1);
                dateInputFormat2 = dateInputFormat;
                calendarModelImpl2 = calendarModelImpl3;
                locale2 = locale2;
                mutableState2 = mutableState3;
                mutableState = mutableState4;
                gapComposer2.updateRememberedValue(sliderKt$$ExternalSyntheticLambda4);
            } else {
                sliderKt$$ExternalSyntheticLambda4 = rememberedValue3;
                neverEqualPolicy = neverEqualPolicy2;
                i9 = 32;
                mutableState2 = mutableState3;
                r2 = 0;
                dateInputFormat2 = dateInputFormat;
            }
            Function1 function12 = (Function1) sliderKt$$ExternalSyntheticLambda4;
            int i14 = i9;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, 7);
            boolean changed3 = gapComposer2.changed(mutableState2);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue4 == neverEqualPolicy3) {
                rememberedValue4 = new DateInputKt$$ExternalSyntheticLambda5(r2, mutableState2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, r2, (Function1) rememberedValue4);
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            if (focusRequester != null) {
                modifier2 = FocusTraversalKt.focusRequester(modifier2, focusRequester);
            }
            datePickerColors2 = datePickerColors;
            MenuKt.OutlinedTextField(textFieldValue, function12, semantics.then(modifier2), false, null, composableLambdaImpl, composableLambdaImpl2, Expect_jvmKt.rememberComposableLambda(-357881838, new DateInputKt$DateInputTextField$3(mutableState2, r2), gapComposer2), !StringsKt.isBlank((CharSequence) mutableState2.getValue()), new DateVisualTransformation(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, 3, 7, (Boolean) null, 113), null, true, 0, 0, null, datePickerColors2.dateTextFieldColors, gapComposer2, (i3 << 6) & 33030144);
            gapComposer = gapComposer2;
            Unit unit = Unit.INSTANCE;
            boolean z2 = (i10 & 112) == i14 ? true : r2;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z2 || rememberedValue5 == neverEqualPolicy3) {
                rememberedValue5 = new DateInputKt$DateInputTextField$4$1(focusRequester, null, r2);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
            boolean changedInstance2 = gapComposer.changedInstance(calendarModelImpl2) | ((i3 & 112) == i14 ? true : r2) | (i7 == 67108864 ? true : r2) | gapComposer.changedInstance(locale2) | gapComposer.changed(mutableState);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == neverEqualPolicy3) {
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(l, calendarModelImpl2, dateInputFormat, locale, mutableState, null, 1);
                l2 = l;
                gapComposer.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                rememberedValue6 = moleculeKt$immediateClockFlow$1$1$1;
            } else {
                l2 = l;
            }
            Updater.LaunchedEffect(gapComposer, l2, (Function2) rememberedValue6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final DatePickerColors datePickerColors3 = datePickerColors2;
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    DateInputKt.m520DateInputTextFieldxJ3Ic0Y(Modifier.this, l2, function1, calendarModelImpl, composableLambdaImpl, composableLambdaImpl2, dateInputValidator, dateInputFormat, locale, datePickerColors3, focusRequester, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
