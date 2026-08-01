package androidx.activity;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.i implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public static final H f4430n = new H(1);

    @Override // I7.l
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        kotlin.jvm.internal.h.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
