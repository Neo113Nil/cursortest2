package com.squareup.cash.formview.components.arcade;

import android.icu.text.BreakIterator;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class EmojiAwareMaxLengthTransformation implements Function1 {
    public final int maxCharacters;

    public EmojiAwareMaxLengthTransformation(int i) {
        this.maxCharacters = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmojiAwareMaxLengthTransformation) && this.maxCharacters == ((EmojiAwareMaxLengthTransformation) obj).maxCharacters;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxCharacters);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        String obj2 = str.subSequence(0, str.length()).toString();
        obj2.getClass();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(obj2);
        int i = this.maxCharacters;
        int i2 = 0;
        while (i > 0 && characterInstance.next() != -1) {
            i -= characterInstance.current() - i2;
            if (i < 0) {
                break;
            }
            i2 = characterInstance.current();
        }
        return str.subSequence(0, i2).toString();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxCharacters, "EmojiAwareMaxLengthTransformation(maxCharacters=", ")");
    }
}
