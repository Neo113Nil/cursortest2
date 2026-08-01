package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class l extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f2238b = new l(1);

    @Override // C1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        D1.i.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
