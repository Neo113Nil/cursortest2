package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class InputTextSuggestionState {
    public final boolean isCommittedByInputMethodEditor;

    public InputTextSuggestionState(boolean z) {
        this.isCommittedByInputMethodEditor = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InputTextSuggestionState) {
            return this.isCommittedByInputMethodEditor == ((InputTextSuggestionState) obj).isCommittedByInputMethodEditor;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCommittedByInputMethodEditor) * 31;
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.isCommittedByInputMethodEditor;
    }
}
