package app.cash.inputfieldtext.saver;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RealInputFieldTextSaver implements Saver {
    public static final RealInputFieldTextSaver INSTANCE = new RealInputFieldTextSaver();

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public final Object mo380restore(Object obj) {
        Pair pair = (Pair) obj;
        String str = (String) pair.first;
        Object obj2 = pair.second;
        return Intrinsics.areEqual(str != null ? Class.forName(str) : null, TextFieldStateInputFieldText.class) ? new TextFieldStateInputFieldText(TextFieldState.Saver.restore(obj2)) : new InputFieldText.Simple(obj2.toString());
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object save(SaveableHolder saveableHolder, Object obj) {
        InputFieldText inputFieldText = (InputFieldText) obj;
        saveableHolder.getClass();
        inputFieldText.getClass();
        if (!(inputFieldText instanceof TextFieldStateInputFieldText)) {
            return new Pair(null, inputFieldText.getValue().toString());
        }
        List save = TextFieldState.Saver.save(saveableHolder, ((TextFieldStateInputFieldText) inputFieldText).textFieldState);
        if (save != null) {
            return new Pair(TextFieldStateInputFieldText.class.getName(), save);
        }
        return null;
    }
}
