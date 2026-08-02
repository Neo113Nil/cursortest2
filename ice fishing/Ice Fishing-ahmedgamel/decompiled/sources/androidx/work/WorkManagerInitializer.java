package androidx.work;

import B0.b;
import J0.r;
import K0.p;
import android.content.Context;
import c4.e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5320a = r.f("WrkMgrInitializer");

    @Override // B0.b
    public final Object create(Context context) {
        r.d().a(f5320a, "Initializing WorkManager with default configuration.");
        p.c(context, new J0.b(new e()));
        return p.b(context);
    }

    @Override // B0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
