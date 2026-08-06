package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f6757a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0651p enumC0651p) {
        if (activity != null && this.f6757a.get(activity) == enumC0651p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f6757a.put(activity, enumC0651p);
        return true;
    }
}
