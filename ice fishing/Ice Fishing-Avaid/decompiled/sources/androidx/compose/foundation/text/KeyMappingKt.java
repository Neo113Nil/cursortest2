package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"commonKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "systemShortcutModifiers", "Landroidx/compose/foundation/text/KeyModifiers;", "commonKeyMapping-VSD1kLU", "(I)Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    /* renamed from: commonKeyMapping-VSD1kLU, reason: not valid java name */
    public static final KeyMapping m1768commonKeyMappingVSD1kLU(final int i) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1767mapZmokQxo(KeyEvent event) {
                int m1812getModifiersZmokQxo = KeyModifiersKt.m1812getModifiersZmokQxo(event);
                if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.m1787plus1uj4btU(i, KeyModifiers.INSTANCE.m1810getShiftAuQ4EfA()))) {
                    if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(event), Key.Companion.m7955getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, i)) {
                    long m7977getKeyZmokQxo = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7712getCEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7776getInsertEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7843getNumPadInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7944getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7952getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7662getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7953getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7955getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1810getShiftAuQ4EfA())) {
                    long m7977getKeyZmokQxo2 = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7734getDirectionLeftEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7836getNumPadDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7735getDirectionRightEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7837getNumPadDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7736getDirectionUpEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7838getNumPadDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7731getDirectionDownEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7835getNumPadDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7857getPageUpEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7849getNumPadPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7856getPageDownEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7848getNumPadPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7810getMoveHomeEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7846getNumPadMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7809getMoveEndEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7845getNumPadMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7776getInsertEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7843getNumPadInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                if (!KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1809getNoneAuQ4EfA())) {
                    return null;
                }
                long m7977getKeyZmokQxo3 = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7734getDirectionLeftEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7836getNumPadDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7735getDirectionRightEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7837getNumPadDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7736getDirectionUpEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7838getNumPadDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7731getDirectionDownEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7835getNumPadDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7730getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7857getPageUpEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7849getNumPadPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7856getPageDownEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7848getNumPadPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7810getMoveHomeEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7846getNumPadMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7809getMoveEndEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7845getNumPadMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7744getEnterEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7841getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7675getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7729getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7859getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7727getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7724getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7905getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping m1768commonKeyMappingVSD1kLU = m1768commonKeyMappingVSD1kLU(KeyModifiers.INSTANCE.m1804getCtrlAuQ4EfA());
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1767mapZmokQxo(KeyEvent event) {
                KeyCommand keyCommand;
                int m1812getModifiersZmokQxo = KeyModifiersKt.m1812getModifiersZmokQxo(event);
                long m7977getKeyZmokQxo = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                KeyCommand keyCommand2 = null;
                if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7675getBackspaceEK5gGoQ())) {
                    if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1809getNoneAuQ4EfA()) || KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1810getShiftAuQ4EfA()) || KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1811getShiftMetaAuQ4EfA())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else {
                        if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1804getCtrlAuQ4EfA()) || KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1807getCtrlShiftAuQ4EfA())) {
                            keyCommand = KeyCommand.DELETE_PREV_WORD;
                        }
                        keyCommand = null;
                    }
                } else {
                    if ((Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7744getEnterEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.Companion.m7841getNumPadEnterEK5gGoQ())) && (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1809getNoneAuQ4EfA()) || KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1810getShiftAuQ4EfA()) || KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1804getCtrlAuQ4EfA()) || KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo, KeyModifiers.INSTANCE.m1807getCtrlShiftAuQ4EfA()))) {
                        keyCommand = KeyCommand.NEW_LINE;
                    }
                    keyCommand = null;
                }
                if (keyCommand != null) {
                    return keyCommand;
                }
                int m1812getModifiersZmokQxo2 = KeyModifiersKt.m1812getModifiersZmokQxo(event);
                if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo2, KeyModifiers.INSTANCE.m1807getCtrlShiftAuQ4EfA())) {
                    long m7977getKeyZmokQxo2 = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7734getDirectionLeftEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7836getNumPadDirectionLeftEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7735getDirectionRightEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7837getNumPadDirectionRightEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7736getDirectionUpEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7838getNumPadDirectionUpEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7731getDirectionDownEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.Companion.m7835getNumPadDirectionDownEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo2, KeyModifiers.INSTANCE.m1804getCtrlAuQ4EfA())) {
                    long m7977getKeyZmokQxo3 = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7734getDirectionLeftEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7836getNumPadDirectionLeftEK5gGoQ())) {
                        keyCommand2 = KeyCommand.LEFT_WORD;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7735getDirectionRightEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7837getNumPadDirectionRightEK5gGoQ())) {
                        keyCommand2 = KeyCommand.RIGHT_WORD;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7736getDirectionUpEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7838getNumPadDirectionUpEK5gGoQ())) {
                        keyCommand2 = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7731getDirectionDownEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7835getNumPadDirectionDownEK5gGoQ())) {
                        keyCommand2 = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7769getHEK5gGoQ())) {
                        keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7729getDeleteEK5gGoQ())) {
                        keyCommand2 = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.Companion.m7674getBackslashEK5gGoQ())) {
                        keyCommand2 = KeyCommand.DESELECT;
                    }
                } else if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo2, KeyModifiers.INSTANCE.m1810getShiftAuQ4EfA())) {
                    long m7977getKeyZmokQxo4 = KeyEvent_androidKt.m7977getKeyZmokQxo(event);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.Companion.m7810getMoveHomeEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.Companion.m7846getNumPadMoveHomeEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.Companion.m7809getMoveEndEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.Companion.m7845getNumPadMoveEndEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyModifiers.m1774equalsimpl0(m1812getModifiersZmokQxo2, KeyModifiers.INSTANCE.m1801getAltAuQ4EfA()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(event), Key.Companion.m7729getDeleteEK5gGoQ())) {
                    keyCommand2 = KeyCommand.DELETE_TO_LINE_END;
                }
                return keyCommand2 == null ? KeyMapping.this.mo1767mapZmokQxo(event) : keyCommand2;
            }
        };
    }
}
