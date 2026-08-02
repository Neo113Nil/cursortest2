package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerId;
import com.google.android.gms.internal.mlkit_genai_prompt.zzado;

/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public final long backgroundSelectionColor;
    public final Modifier modifier;
    public StaticTextSelectionParams params = StaticTextSelectionParams.Empty;
    public MultiWidgetSelectionDelegate selectable;
    public final long selectableId;
    public final SelectionRegistrar selectionRegistrar;

    public SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2) {
        Modifier then;
        this.selectableId = j;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j2;
        Modifier makeSelectionModifier = zzado.makeSelectionModifier(j, new SelectionController$$ExternalSyntheticLambda0(this, 2), selectionRegistrar);
        PointerIcon.Companion.getClass();
        then = makeSelectionModifier.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
        this.modifier = then;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = this.selectable;
        if (multiWidgetSelectionDelegate != null) {
            ((SelectionRegistrarImpl) this.selectionRegistrar).unsubscribe(multiWidgetSelectionDelegate);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = this.selectable;
        if (multiWidgetSelectionDelegate != null) {
            ((SelectionRegistrarImpl) this.selectionRegistrar).unsubscribe(multiWidgetSelectionDelegate);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = new MultiWidgetSelectionDelegate(this.selectableId, new SelectionController$$ExternalSyntheticLambda0(this, 0), new SelectionController$$ExternalSyntheticLambda0(this, 1));
        ((SelectionRegistrarImpl) this.selectionRegistrar).subscribe(multiWidgetSelectionDelegate);
        this.selectable = multiWidgetSelectionDelegate;
    }
}
