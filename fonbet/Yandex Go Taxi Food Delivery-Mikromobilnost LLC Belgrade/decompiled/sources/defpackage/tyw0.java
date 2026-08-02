package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class tyw0 extends btn {
    public final WeakReference a;

    public tyw0(SwitchCompat switchCompat) {
        this.a = new WeakReference(switchCompat);
    }

    @Override // defpackage.btn
    public final void a(Throwable th) {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // defpackage.btn
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.onEmojiCompatInitializedForSwitchText();
        }
    }
}
