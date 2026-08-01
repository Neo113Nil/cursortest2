package p4;

import a.AbstractC0422a;
import android.content.Context;
import kotlin.jvm.internal.h;
import u7.C5093k;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C5093k f39773a = AbstractC0422a.q(f.f39772n);

    public static v4.b a() {
        c cVar = (c) f39773a.getValue();
        h.c(cVar, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (v4.b) cVar;
    }

    public static final Object b(Context context, B7.c cVar) {
        return ((c) f39773a.getValue()).initWithContext(context, cVar);
    }
}
