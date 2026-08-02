package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt$platformDefaultKeyMapping$1 {
    /* renamed from: map-ZmokQxo, reason: not valid java name */
    public final KeyCommand m357mapZmokQxo(KeyEvent keyEvent) {
        int m355getModifiersZmokQxo = KeyMappingKt.m355getModifiersZmokQxo(keyEvent);
        int i = KeyMappingKt.AltShift;
        KeyCommand keyCommand = null;
        if (KeyMappingKt.m354equalsimpl0(m355getModifiersZmokQxo, 9)) {
            long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
            int i2 = Key.$r8$clinit;
            if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m777getDirectionLeftEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_LINE_LEFT;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m778getDirectionRightEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_LINE_RIGHT;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m779getDirectionUpEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_HOME;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m776getDirectionDownEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_END;
            }
        } else if (KeyMappingKt.m354equalsimpl0(m355getModifiersZmokQxo, 1)) {
            long m782getKeyZmokQxo2 = KeyEventType.m782getKeyZmokQxo(keyEvent);
            int i3 = Key.$r8$clinit;
            if (Key.m771equalsimpl0(m782getKeyZmokQxo2, KeyEventType.m777getDirectionLeftEK5gGoQ())) {
                keyCommand = KeyCommand.LINE_LEFT;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo2, KeyEventType.m778getDirectionRightEK5gGoQ())) {
                keyCommand = KeyCommand.LINE_RIGHT;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo2, KeyEventType.m779getDirectionUpEK5gGoQ())) {
                keyCommand = KeyCommand.HOME;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo2, KeyEventType.m776getDirectionDownEK5gGoQ())) {
                keyCommand = KeyCommand.END;
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo2, KeyEventType.m774getBackspaceEK5gGoQ())) {
                keyCommand = KeyCommand.DELETE_FROM_LINE_START;
            }
        }
        return keyCommand == null ? KeyMappingKt.defaultKeyMapping.m123mapZmokQxo(keyEvent) : keyCommand;
    }
}
