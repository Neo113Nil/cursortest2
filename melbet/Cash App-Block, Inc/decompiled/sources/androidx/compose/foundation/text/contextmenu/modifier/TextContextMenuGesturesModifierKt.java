package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class TextContextMenuGesturesModifierKt {
    public static final Modifier addTextContextMenuComponentsWithContext(Modifier modifier, Function2 function2) {
        return modifier.then(new AddTextContextMenuDataComponentsWithContextElement(function2));
    }

    public static final Modifier showTextContextMenuOnSecondaryClick(Function2 function2) {
        return new TextContextMenuGestureElement(function2);
    }
}
