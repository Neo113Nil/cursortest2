package androidx.compose.foundation;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Focusable.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final /* synthetic */ class FocusableNode$applySemantics$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    FocusableNode$applySemantics$1(Object obj) {
        super(0, obj, FocusableNode.class, "requestFocus", "requestFocus()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((FocusableNode) this.receiver).requestFocus());
    }
}
