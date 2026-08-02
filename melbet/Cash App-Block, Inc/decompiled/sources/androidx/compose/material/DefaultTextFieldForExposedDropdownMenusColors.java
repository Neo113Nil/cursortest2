package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Color;
import com.squareup.util.cash.Countries;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {
    public final long backgroundColor;
    public final long cursorColor;
    public final long disabledIndicatorColor;
    public final long disabledLabelColor;
    public final long disabledLeadingIconColor;
    public final long disabledPlaceholderColor;
    public final long disabledTextColor;
    public final long disabledTrailingIconColor;
    public final long errorCursorColor;
    public final long errorIndicatorColor;
    public final long errorLabelColor;
    public final long errorLeadingIconColor;
    public final long errorTrailingIconColor;
    public final long focusedIndicatorColor;
    public final long focusedLabelColor;
    public final long focusedTrailingIconColor;
    public final long leadingIconColor;
    public final long placeholderColor;
    public final long textColor;
    public final long trailingIconColor;
    public final long unfocusedIndicatorColor;
    public final long unfocusedLabelColor;

    public DefaultTextFieldForExposedDropdownMenusColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.textColor = j;
        this.disabledTextColor = j2;
        this.cursorColor = j3;
        this.errorCursorColor = j4;
        this.focusedIndicatorColor = j5;
        this.unfocusedIndicatorColor = j6;
        this.errorIndicatorColor = j7;
        this.disabledIndicatorColor = j8;
        this.leadingIconColor = j9;
        this.disabledLeadingIconColor = j10;
        this.errorLeadingIconColor = j11;
        this.trailingIconColor = j12;
        this.focusedTrailingIconColor = j13;
        this.disabledTrailingIconColor = j14;
        this.errorTrailingIconColor = j15;
        this.backgroundColor = j16;
        this.focusedLabelColor = j17;
        this.unfocusedLabelColor = j18;
        this.disabledLabelColor = j19;
        this.errorLabelColor = j20;
        this.placeholderColor = j21;
        this.disabledPlaceholderColor = j22;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState backgroundColor(GapComposer gapComposer) {
        gapComposer.startReplaceGroup(-28962788);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(this.backgroundColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState cursorColor(boolean z, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-930693132);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? this.errorCursorColor : this.cursorColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldForExposedDropdownMenusColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) obj;
        return Color.m676equalsimpl0(this.textColor, defaultTextFieldForExposedDropdownMenusColors.textColor) && Color.m676equalsimpl0(this.disabledTextColor, defaultTextFieldForExposedDropdownMenusColors.disabledTextColor) && Color.m676equalsimpl0(this.cursorColor, defaultTextFieldForExposedDropdownMenusColors.cursorColor) && Color.m676equalsimpl0(this.errorCursorColor, defaultTextFieldForExposedDropdownMenusColors.errorCursorColor) && Color.m676equalsimpl0(this.focusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.focusedIndicatorColor) && Color.m676equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedIndicatorColor) && Color.m676equalsimpl0(this.errorIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.errorIndicatorColor) && Color.m676equalsimpl0(this.disabledIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.disabledIndicatorColor) && Color.m676equalsimpl0(this.leadingIconColor, defaultTextFieldForExposedDropdownMenusColors.leadingIconColor) && Color.m676equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledLeadingIconColor) && Color.m676equalsimpl0(this.errorLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorLeadingIconColor) && Color.m676equalsimpl0(this.trailingIconColor, defaultTextFieldForExposedDropdownMenusColors.trailingIconColor) && Color.m676equalsimpl0(this.focusedTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.focusedTrailingIconColor) && Color.m676equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledTrailingIconColor) && Color.m676equalsimpl0(this.errorTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorTrailingIconColor) && Color.m676equalsimpl0(this.backgroundColor, defaultTextFieldForExposedDropdownMenusColors.backgroundColor) && Color.m676equalsimpl0(this.focusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.focusedLabelColor) && Color.m676equalsimpl0(this.unfocusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedLabelColor) && Color.m676equalsimpl0(this.disabledLabelColor, defaultTextFieldForExposedDropdownMenusColors.disabledLabelColor) && Color.m676equalsimpl0(this.errorLabelColor, defaultTextFieldForExposedDropdownMenusColors.errorLabelColor) && Color.m676equalsimpl0(this.placeholderColor, defaultTextFieldForExposedDropdownMenusColors.placeholderColor) && Color.m676equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldForExposedDropdownMenusColors.disabledPlaceholderColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.disabledPlaceholderColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.textColor) * 31, 31, this.disabledTextColor), 31, this.cursorColor), 31, this.errorCursorColor), 31, this.focusedIndicatorColor), 31, this.unfocusedIndicatorColor), 31, this.errorIndicatorColor), 31, this.disabledIndicatorColor), 31, this.leadingIconColor), 31, this.disabledLeadingIconColor), 31, this.errorLeadingIconColor), 31, this.trailingIconColor), 31, this.focusedTrailingIconColor), 31, this.disabledTrailingIconColor), 31, this.errorTrailingIconColor), 31, this.backgroundColor), 31, this.focusedLabelColor), 31, this.unfocusedLabelColor), 31, this.disabledLabelColor), 31, this.errorLabelColor), 31, this.placeholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final State indicatorColor(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        State rememberUpdatedState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(476110356);
        long j = !z ? this.disabledIndicatorColor : z2 ? this.errorIndicatorColor : ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer, (i >> 6) & 14).getValue()).booleanValue() ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z) {
            gapComposer.startReplaceGroup(1822093355);
            rememberUpdatedState = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, AnimatableKt.tween$default(150, 0, null, 6), null, gapComposer, 48, 12);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1822196213);
            rememberUpdatedState = Updater.rememberUpdatedState(new Color(j), gapComposer);
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState labelColor(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, GapComposer gapComposer) {
        gapComposer.startReplaceGroup(-1749156593);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(!z ? this.disabledLabelColor : z2 ? this.errorLabelColor : ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer, 0).getValue()).booleanValue() ? this.focusedLabelColor : this.unfocusedLabelColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState leadingIconColor(boolean z, boolean z2, GapComposer gapComposer) {
        gapComposer.startReplaceGroup(-776179197);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(!z ? this.disabledLeadingIconColor : z2 ? this.errorLeadingIconColor : this.leadingIconColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState placeholderColor(boolean z, GapComposer gapComposer) {
        gapComposer.startReplaceGroup(1742462291);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? this.placeholderColor : this.disabledPlaceholderColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState textColor(boolean z, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(394526077);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? this.textColor : this.disabledTextColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState trailingIconColor(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, GapComposer gapComposer) {
        gapComposer.startReplaceGroup(79259602);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(!z ? this.disabledTrailingIconColor : z2 ? this.errorTrailingIconColor : ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer, 0).getValue()).booleanValue() ? this.focusedTrailingIconColor : this.trailingIconColor), gapComposer);
        gapComposer.end(false);
        return rememberUpdatedState;
    }
}
