package n0;

import O7.AbstractC0399y;
import O7.F;
import S0.f;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.h;
import l0.C4683a;
import p0.AbstractC4852a;
import p0.AbstractC4855d;
import p0.C4854c;
import p0.e;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4804d {

    /* renamed from: a, reason: collision with root package name */
    public final C4854c f39628a;

    public C4804d(C4854c c4854c) {
        this.f39628a = c4854c;
    }

    public static final C4804d b(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C4683a c4683a = C4683a.f39022a;
        sb.append(i >= 30 ? c4683a.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        C4854c c4854c = (i >= 30 ? c4683a.a() : 0) >= 5 ? new C4854c(context) : null;
        if (c4854c != null) {
            return new C4804d(c4854c);
        }
        return null;
    }

    public J3.a a(AbstractC4852a deletionRequest) {
        h.e(deletionRequest, "deletionRequest");
        throw null;
    }

    public J3.a c() {
        return f.b(AbstractC0399y.c(AbstractC0399y.b(F.f2551a), new C4801a(this, null), 3));
    }

    public J3.a d(Uri attributionSource, InputEvent inputEvent) {
        h.e(attributionSource, "attributionSource");
        return f.b(AbstractC0399y.c(AbstractC0399y.b(F.f2551a), new C4802b(this, attributionSource, inputEvent, null), 3));
    }

    public J3.a e(Uri trigger) {
        h.e(trigger, "trigger");
        return f.b(AbstractC0399y.c(AbstractC0399y.b(F.f2551a), new C4803c(this, trigger, null), 3));
    }

    public J3.a f(AbstractC4855d request) {
        h.e(request, "request");
        throw null;
    }

    public J3.a g(e request) {
        h.e(request, "request");
        throw null;
    }
}
