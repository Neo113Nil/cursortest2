package androidx.work;

import B0.b;
import J0.s;
import K0.p;
import M2.i;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5355a = s.f("WrkMgrInitializer");

    @Override // B0.b
    public final Object create(Context context) {
        s.d().a(f5355a, "Initializing WorkManager with default configuration.");
        p.c(context, new J0.b(new i(4)));
        return p.b(context);
    }

    @Override // B0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
