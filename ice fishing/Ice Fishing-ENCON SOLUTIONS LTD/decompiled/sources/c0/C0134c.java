package c0;

import androidx.window.sidecar.SidecarDisplayFeature;
import t1.l;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134c extends kotlin.jvm.internal.j implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final C0134c f2640e = new C0134c(1);

    @Override // t1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
