package n0;

import N3.C;
import S7.AbstractC0410y;
import S7.F;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.h;
import l0.C4665a;
import p0.AbstractC4826a;
import p0.AbstractC4829d;
import p0.C4828c;
import p0.e;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4763d {

    /* renamed from: a, reason: collision with root package name */
    public final C4828c f39618a;

    public C4763d(C4828c c4828c) {
        this.f39618a = c4828c;
    }

    public static final C4763d b(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C4665a c4665a = C4665a.f38807a;
        sb.append(i >= 30 ? c4665a.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        C4828c c4828c = (i >= 30 ? c4665a.a() : 0) >= 5 ? new C4828c(context) : null;
        if (c4828c != null) {
            return new C4763d(c4828c);
        }
        return null;
    }

    public P3.a a(AbstractC4826a deletionRequest) {
        h.e(deletionRequest, "deletionRequest");
        throw null;
    }

    public P3.a c() {
        return C.z(AbstractC0410y.c(AbstractC0410y.b(F.f2998a), new C4760a(this, null), 3));
    }

    public P3.a d(Uri attributionSource, InputEvent inputEvent) {
        h.e(attributionSource, "attributionSource");
        return C.z(AbstractC0410y.c(AbstractC0410y.b(F.f2998a), new C4761b(this, attributionSource, inputEvent, null), 3));
    }

    public P3.a e(Uri trigger) {
        h.e(trigger, "trigger");
        return C.z(AbstractC0410y.c(AbstractC0410y.b(F.f2998a), new C4762c(this, trigger, null), 3));
    }

    public P3.a f(AbstractC4829d request) {
        h.e(request, "request");
        throw null;
    }

    public P3.a g(e request) {
        h.e(request, "request");
        throw null;
    }
}
