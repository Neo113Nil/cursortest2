package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class m extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public static final m f2239b = new m(1);

    @Override // C1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        D1.i.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
