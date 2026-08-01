package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class k extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public static final k f2237b = new k(1);

    @Override // C1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        D1.i.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
