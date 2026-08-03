package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: KeyMapping.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo1767mapZmokQxo(KeyEvent event) {
            int m1812getModifiersZmokQxo = KeyModifiersKt.m1812getModifiersZmokQxo(event);
            KeyCommand keyCommand = null;
            if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1803getAltShiftAuQ4EfA())) {
                long m7977getKeyZmokQxo = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7734getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7735getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7736getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7731getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1801getAltAuQ4EfA())) {
                long m7977getKeyZmokQxo2 = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7734getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7735getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7736getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7731getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7675getBackspaceEK5gGoQ())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo1767mapZmokQxo(event) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
