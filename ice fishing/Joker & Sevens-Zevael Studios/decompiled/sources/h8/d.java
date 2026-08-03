package h8;

import ac.m;
import android.content.Context;
import bc.a0;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final m f2870a = a0.y(c.f2869g);

    public static n8.b a() {
        a aVar = (a) f2870a.getValue();
        j.c(aVar, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (n8.b) aVar;
    }

    public static final boolean b(Context context) {
        return ((a) f2870a.getValue()).initWithContext(context, null);
    }
}
