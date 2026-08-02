package p4;

import N3.C;
import android.content.Context;
import kotlin.jvm.internal.h;
import u7.C5085k;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C5085k f39820a = C.O(f.f39819n);

    public static v4.b a() {
        c cVar = (c) f39820a.getValue();
        h.c(cVar, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (v4.b) cVar;
    }

    public static final Object b(Context context, B7.c cVar) {
        return ((c) f39820a.getValue()).initWithContext(context, cVar);
    }
}
