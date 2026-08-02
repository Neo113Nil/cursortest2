package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class de0 implements lp4 {
    public final ClipboardManager a;

    public de0(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
    }
}
