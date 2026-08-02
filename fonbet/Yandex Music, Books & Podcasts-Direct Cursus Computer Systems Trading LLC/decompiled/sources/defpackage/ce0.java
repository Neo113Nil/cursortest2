package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ce0 implements kp4 {
    public final de0 a;

    public ce0(de0 de0Var) {
        this.a = de0Var;
    }

    public final Unit a(dp4 dp4Var) {
        ClipboardManager clipboardManager = this.a.a;
        if (dp4Var != null) {
            clipboardManager.setPrimaryClip(dp4Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            jo0.c(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return Unit.a;
    }
}
