package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class KeyEventType {
    public static final long Key(int i) {
        long j = i << 32;
        int i2 = Key.$r8$clinit;
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m772equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getBack-EK5gGoQ, reason: not valid java name */
    public static long m773getBackEK5gGoQ() {
        return Key.Back;
    }

    /* renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
    public static long m774getBackspaceEK5gGoQ() {
        return Key.Backspace;
    }

    /* renamed from: getDirectionCenter-EK5gGoQ, reason: not valid java name */
    public static long m775getDirectionCenterEK5gGoQ() {
        return Key.DirectionCenter;
    }

    /* renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
    public static long m776getDirectionDownEK5gGoQ() {
        return Key.DirectionDown;
    }

    /* renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
    public static long m777getDirectionLeftEK5gGoQ() {
        return Key.DirectionLeft;
    }

    /* renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
    public static long m778getDirectionRightEK5gGoQ() {
        return Key.DirectionRight;
    }

    /* renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
    public static long m779getDirectionUpEK5gGoQ() {
        return Key.DirectionUp;
    }

    /* renamed from: getEnter-EK5gGoQ, reason: not valid java name */
    public static long m780getEnterEK5gGoQ() {
        return Key.Enter;
    }

    /* renamed from: getEscape-EK5gGoQ, reason: not valid java name */
    public static long m781getEscapeEK5gGoQ() {
        return Key.Escape;
    }

    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m782getKeyZmokQxo(android.view.KeyEvent keyEvent) {
        return Key(keyEvent.getKeyCode());
    }

    /* renamed from: getNavigateNext-EK5gGoQ, reason: not valid java name */
    public static long m783getNavigateNextEK5gGoQ() {
        return Key.NavigateNext;
    }

    /* renamed from: getNavigatePrevious-EK5gGoQ, reason: not valid java name */
    public static long m784getNavigatePreviousEK5gGoQ() {
        return Key.NavigatePrevious;
    }

    /* renamed from: getNumPadEnter-EK5gGoQ, reason: not valid java name */
    public static long m785getNumPadEnterEK5gGoQ() {
        return Key.NumPadEnter;
    }

    /* renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
    public static long m786getPageDownEK5gGoQ() {
        return Key.PageDown;
    }

    /* renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
    public static long m787getPageUpEK5gGoQ() {
        return Key.PageUp;
    }

    /* renamed from: getSpacebar-EK5gGoQ, reason: not valid java name */
    public static long m788getSpacebarEK5gGoQ() {
        return Key.Spacebar;
    }

    /* renamed from: getTab-EK5gGoQ, reason: not valid java name */
    public static long m789getTabEK5gGoQ() {
        return Key.Tab;
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m790getTypeZmokQxo(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m791getUtf16CodePointZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m792isCtrlPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m793isShiftPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final Modifier onKeyEvent(Modifier modifier, Function1 function1) {
        return modifier.then(new KeyInputElement(function1, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, Function1 function1) {
        return modifier.then(new KeyInputElement(null, function1));
    }
}
