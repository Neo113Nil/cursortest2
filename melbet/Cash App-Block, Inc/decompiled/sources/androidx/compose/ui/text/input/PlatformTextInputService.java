package androidx.compose.ui.text.input;

import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.reflect.full.KClasses$$Lambda$2;

/* loaded from: classes.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    void notifyFocusedRect(Rect rect);

    void showSoftwareKeyboard();

    void startInput();

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0, CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, KClasses$$Lambda$2 kClasses$$Lambda$2, Rect rect, Rect rect2);
}
