package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;

/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m350consumeZmokQxo(KeyEvent keyEvent) {
        int m791getUtf16CodePointZmokQxo = KeyEventType.m791getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & m791getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(m791getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(m791getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), m791getUtf16CodePointZmokQxo);
        Integer valueOf = deadChar != 0 ? Integer.valueOf(deadChar) : null;
        if (valueOf != null) {
            m791getUtf16CodePointZmokQxo = valueOf.intValue();
        }
        return Integer.valueOf(m791getUtf16CodePointZmokQxo);
    }
}
