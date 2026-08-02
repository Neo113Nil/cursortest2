package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.work.impl.WorkLauncherImpl;

/* loaded from: classes.dex */
public final class ComposeInputMethodManagerImplApi34 extends WorkLauncherImpl {
    @Override // androidx.work.impl.WorkLauncherImpl
    public final void startStylusHandwriting() {
        requireImm().startStylusHandwriting((View) this.processor);
    }
}
