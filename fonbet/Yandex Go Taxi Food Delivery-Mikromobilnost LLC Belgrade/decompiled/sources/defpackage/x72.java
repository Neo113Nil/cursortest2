package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class x72 implements j3c {
    public final Context a;
    public ClipboardManager b;

    public x72(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.a.getSystemService("clipboard");
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}
