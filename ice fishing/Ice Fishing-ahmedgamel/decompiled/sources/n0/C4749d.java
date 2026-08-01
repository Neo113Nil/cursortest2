package n0;

import L3.F;
import S7.AbstractC0406y;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.h;
import l0.C4654a;
import p0.AbstractC4822a;
import p0.AbstractC4825d;
import p0.C4824c;
import p0.e;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4749d {

    /* renamed from: a, reason: collision with root package name */
    public final C4824c f39459a;

    public C4749d(C4824c c4824c) {
        this.f39459a = c4824c;
    }

    public static final C4749d b(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C4654a c4654a = C4654a.f38880a;
        sb.append(i >= 30 ? c4654a.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        C4824c c4824c = (i >= 30 ? c4654a.a() : 0) >= 5 ? new C4824c(context) : null;
        if (c4824c != null) {
            return new C4749d(c4824c);
        }
        return null;
    }

    public N3.a a(AbstractC4822a deletionRequest) {
        h.e(deletionRequest, "deletionRequest");
        throw null;
    }

    public N3.a c() {
        return F.b(AbstractC0406y.c(AbstractC0406y.b(S7.F.f2915a), new C4746a(this, null), 3));
    }

    public N3.a d(Uri attributionSource, InputEvent inputEvent) {
        h.e(attributionSource, "attributionSource");
        return F.b(AbstractC0406y.c(AbstractC0406y.b(S7.F.f2915a), new C4747b(this, attributionSource, inputEvent, null), 3));
    }

    public N3.a e(Uri trigger) {
        h.e(trigger, "trigger");
        return F.b(AbstractC0406y.c(AbstractC0406y.b(S7.F.f2915a), new C4748c(this, trigger, null), 3));
    }

    public N3.a f(AbstractC4825d request) {
        h.e(request, "request");
        throw null;
    }

    public N3.a g(e request) {
        h.e(request, "request");
        throw null;
    }
}
