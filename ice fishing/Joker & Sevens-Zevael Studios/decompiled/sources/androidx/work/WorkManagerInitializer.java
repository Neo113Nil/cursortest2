package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import k4.b;
import o4.o;
import p4.n;
import p6.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f742a = o.f("WrkMgrInitializer");

    @Override // k4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // k4.b
    public final Object b(Context context) {
        o.d().a(f742a, "Initializing WorkManager with default configuration.");
        n.b(context, new o4.b(new i()));
        return n.a(context);
    }
}
