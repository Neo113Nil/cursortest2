package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class n extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public static final n f2240b = new n(1);

    @Override // C1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        D1.i.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
