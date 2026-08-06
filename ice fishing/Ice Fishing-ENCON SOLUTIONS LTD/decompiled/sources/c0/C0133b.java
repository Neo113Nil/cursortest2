package c0;

import androidx.window.sidecar.SidecarDisplayFeature;
import t1.l;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133b extends kotlin.jvm.internal.j implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final C0133b f2639e = new C0133b(1);

    @Override // t1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        boolean z2 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
