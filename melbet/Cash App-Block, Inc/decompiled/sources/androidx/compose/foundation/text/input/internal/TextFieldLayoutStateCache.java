package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements State, StateObject {
    public TextMeasurer textMeasurer;
    public final ParcelableSnapshotMutableState nonMeasureInputs$delegate = new ParcelableSnapshotMutableState(null, NonMeasureInputs.mutationPolicy);
    public final ParcelableSnapshotMutableState measureInputs$delegate = new ParcelableSnapshotMutableState(null, MeasureInputs.mutationPolicy);
    public CacheRecord record = new CacheRecord();

    public final class CacheRecord extends StateRecord {
        public List annotations;
        public TextRange composition;
        public long constraints;
        public float densityValue;
        public FontFamilyResolverImpl fontFamilyResolver;
        public float fontScale;
        public LayoutDirection layoutDirection;
        public TextLayoutResult layoutResult;
        public boolean singleLine;
        public boolean softWrap;
        public TextStyle textStyle;
        public CharSequence visualText;

        public CacheRecord() {
            super(SnapshotKt.currentSnapshot().getSnapshotId());
            this.densityValue = Float.NaN;
            this.fontScale = Float.NaN;
            this.constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.visualText = cacheRecord.visualText;
            this.annotations = cacheRecord.annotations;
            this.composition = cacheRecord.composition;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create() {
            return new CacheRecord();
        }

        public final String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", annotations=" + this.annotations + ", composition=" + this.composition + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m1029toStringimpl(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }
    }

    public final class MeasureInputs {
        public static final SingleLineCodepointTransformation mutationPolicy = new SingleLineCodepointTransformation(2);
        public final long constraints;
        public final MeasureScope density;
        public final float densityValue;
        public final FontFamilyResolverImpl fontFamilyResolver;
        public final float fontScale;
        public final LayoutDirection layoutDirection;

        public MeasureInputs(MeasureScope measureScope, LayoutDirection layoutDirection, FontFamilyResolverImpl fontFamilyResolverImpl, long j) {
            this.density = measureScope;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = fontFamilyResolverImpl;
            this.constraints = j;
            this.densityValue = measureScope.getDensity();
            this.fontScale = measureScope.getFontScale();
        }

        public final String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m1029toStringimpl(this.constraints)) + ')';
        }
    }

    public final class NonMeasureInputs {
        public static final SingleLineCodepointTransformation mutationPolicy = new SingleLineCodepointTransformation(3);
        public final boolean isKeyboardTypePhone;
        public final boolean singleLine;
        public final boolean softWrap;
        public final TransformedTextFieldState textFieldState;
        public final TextStyle textStyle;

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, boolean z3) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z;
            this.softWrap = z2;
            this.isKeyboardTypePhone = z3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb.append(this.textFieldState);
            sb.append(", textStyle=");
            sb.append(this.textStyle);
            sb.append(", singleLine=");
            sb.append(this.singleLine);
            sb.append(", softWrap=");
            sb.append(this.softWrap);
            sb.append(", isKeyboardTypePhone=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isKeyboardTypePhone, ')');
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.record;
    }

    public final TextLayoutResult getOrComputeLayout(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        List list;
        Locale locale;
        CharSequence charSequence;
        TextStyle textStyle;
        TextFieldCharSequence visualText = nonMeasureInputs.textFieldState.getVisualText();
        List list2 = visualText.composingAnnotations;
        List list3 = visualText.outputAnnotations;
        List list4 = list2;
        if ((list4 == null || list4.isEmpty()) && ((list = list3) == null || list.isEmpty())) {
            list2 = null;
        } else if (list4 == null || list4.isEmpty()) {
            list2 = list3;
        } else {
            List list5 = list3;
            if (list5 != null && !list5.isEmpty()) {
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.addAll(list4);
                createListBuilder.addAll(list5);
                list2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            }
        }
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.current(this.record);
        TextLayoutResult textLayoutResult = cacheRecord.layoutResult;
        if (textLayoutResult != null && (charSequence = cacheRecord.visualText) != null && StringsKt__StringsJVMKt.contentEquals(charSequence, visualText) && Intrinsics.areEqual(cacheRecord.annotations, list2) && Intrinsics.areEqual(cacheRecord.composition, visualText.composition) && cacheRecord.singleLine == nonMeasureInputs.singleLine && cacheRecord.softWrap == nonMeasureInputs.softWrap && cacheRecord.layoutDirection == measureInputs.layoutDirection && cacheRecord.densityValue == measureInputs.density.getDensity() && cacheRecord.fontScale == measureInputs.density.getFontScale() && Constraints.m1019equalsimpl0(cacheRecord.constraints, measureInputs.constraints) && Intrinsics.areEqual(cacheRecord.fontFamilyResolver, measureInputs.fontFamilyResolver) && !textLayoutResult.multiParagraph.intrinsics.getHasStaleResolvedFonts()) {
            TextStyle textStyle2 = cacheRecord.textStyle;
            boolean hasSameLayoutAffectingAttributes = textStyle2 != null ? textStyle2.hasSameLayoutAffectingAttributes(nonMeasureInputs.textStyle) : false;
            TextStyle textStyle3 = cacheRecord.textStyle;
            boolean z = textStyle3 != null && (textStyle3 == (textStyle = nonMeasureInputs.textStyle) || textStyle3.spanStyle.hasSameNonLayoutAttributes$ui_text(textStyle.spanStyle));
            if (hasSameLayoutAffectingAttributes && z) {
                return textLayoutResult;
            }
            if (hasSameLayoutAffectingAttributes) {
                TextLayoutInput textLayoutInput = textLayoutResult.layoutInput;
                return new TextLayoutResult(new TextLayoutInput(textLayoutInput.text, nonMeasureInputs.textStyle, textLayoutInput.placeholders, textLayoutInput.maxLines, textLayoutInput.softWrap, textLayoutInput.overflow, textLayoutInput.density, textLayoutInput.layoutDirection, textLayoutInput.fontFamilyResolver, textLayoutInput.constraints), textLayoutResult.multiParagraph, textLayoutResult.size);
            }
        }
        TextMeasurer textMeasurer = this.textMeasurer;
        if (textMeasurer == null) {
            textMeasurer = new TextMeasurer(measureInputs.fontFamilyResolver, measureInputs.density, measureInputs.layoutDirection, 1);
            this.textMeasurer = textMeasurer;
        }
        TextMeasurer textMeasurer2 = textMeasurer;
        boolean z2 = nonMeasureInputs.isKeyboardTypePhone;
        TextStyle textStyle4 = nonMeasureInputs.textStyle;
        if (z2) {
            LocaleList localeList = textStyle4.spanStyle.localeList;
            if (localeList == null || (locale = localeList.get()) == null) {
                locale = PlatformLocaleKt.platformLocaleDelegate.getCurrent().get();
            }
            byte directionality = Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(locale.platformLocale).getDigitStrings()[0], 0));
            textStyle4 = textStyle4.merge(new TextStyle(0L, 0L, null, null, 0L, 0L, 0, (directionality == 1 || directionality == 2) ? 2 : 1, 0L, null, 16711679));
        }
        TextLayoutResult m980measurexDpz5zY$default = TextMeasurer.m980measurexDpz5zY$default(textMeasurer2, new AnnotatedString(visualText.text.toString(), list2 == null ? EmptyList.INSTANCE : list2), textStyle4, nonMeasureInputs.softWrap, nonMeasureInputs.singleLine ? 1 : Integer.MAX_VALUE, measureInputs.constraints, measureInputs.layoutDirection, measureInputs.density, measureInputs.fontFamilyResolver, 1060);
        if (!m980measurexDpz5zY$default.equals(textLayoutResult)) {
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            if (!currentSnapshot.getReadOnly()) {
                CacheRecord cacheRecord2 = this.record;
                synchronized (SnapshotKt.lock) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.writableRecord(cacheRecord2, this, currentSnapshot);
                    cacheRecord3.visualText = visualText;
                    cacheRecord3.annotations = list2;
                    cacheRecord3.composition = visualText.composition;
                    cacheRecord3.singleLine = nonMeasureInputs.singleLine;
                    cacheRecord3.softWrap = nonMeasureInputs.softWrap;
                    cacheRecord3.textStyle = nonMeasureInputs.textStyle;
                    cacheRecord3.layoutDirection = measureInputs.layoutDirection;
                    cacheRecord3.densityValue = measureInputs.densityValue;
                    cacheRecord3.fontScale = measureInputs.fontScale;
                    cacheRecord3.constraints = measureInputs.constraints;
                    cacheRecord3.fontFamilyResolver = measureInputs.fontFamilyResolver;
                    cacheRecord3.layoutResult = m980measurexDpz5zY$default;
                }
                SnapshotKt.notifyWrite(currentSnapshot, this);
                return m980measurexDpz5zY$default;
            }
        }
        return m980measurexDpz5zY$default;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = (NonMeasureInputs) this.nonMeasureInputs$delegate.getValue();
        if (nonMeasureInputs == null || (measureInputs = (MeasureInputs) this.measureInputs$delegate.getValue()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.record = (CacheRecord) stateRecord;
    }
}
