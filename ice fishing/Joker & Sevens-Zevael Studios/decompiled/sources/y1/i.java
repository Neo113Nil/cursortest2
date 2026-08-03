package y1;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f8554a;

    public i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        pc.j.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f8554a = (ClipboardManager) systemService;
    }
}
