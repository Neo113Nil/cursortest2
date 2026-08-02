package androidx.compose.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TextFieldSize {
    public Density density;
    public final ParcelableSnapshotMutableState dirty$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
    public FontFamilyResolverImpl fontFamilyResolver;
    public LayoutDirection layoutDirection;
    public long minSize;
    public TextStyle resolvedStyle;
    public Object typeface;

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamilyResolverImpl fontFamilyResolverImpl, TextStyle textStyle, Object obj) {
        long computeSizeForDefaultText;
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
        computeSizeForDefaultText = TextFieldDelegateKt.computeSizeForDefaultText(this.resolvedStyle, this.density, this.fontFamilyResolver, TextFieldDelegateKt.EmptyTextReplacement, 1);
        this.minSize = computeSizeForDefaultText;
    }

    public static void update$default(TextFieldSize textFieldSize, LayoutDirection layoutDirection, Density density, TextStyle textStyle, int i) {
        if ((i & 1) != 0) {
            layoutDirection = textFieldSize.layoutDirection;
        }
        if ((i & 2) != 0) {
            density = textFieldSize.density;
        }
        FontFamilyResolverImpl fontFamilyResolverImpl = textFieldSize.fontFamilyResolver;
        if ((i & 8) != 0) {
            textStyle = textFieldSize.resolvedStyle;
        }
        Object obj = textFieldSize.typeface;
        LayoutDirection layoutDirection2 = textFieldSize.layoutDirection;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSize.dirty$delegate;
        if (layoutDirection == layoutDirection2 && Intrinsics.areEqual(density, textFieldSize.density) && Intrinsics.areEqual(fontFamilyResolverImpl, textFieldSize.fontFamilyResolver) && Intrinsics.areEqual(textStyle, textFieldSize.resolvedStyle)) {
            if (Intrinsics.areEqual(obj, textFieldSize.typeface)) {
                return;
            }
            textFieldSize.typeface = obj;
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
            return;
        }
        textFieldSize.layoutDirection = layoutDirection;
        textFieldSize.density = density;
        textFieldSize.fontFamilyResolver = fontFamilyResolverImpl;
        textFieldSize.resolvedStyle = textStyle;
        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
    }
}
