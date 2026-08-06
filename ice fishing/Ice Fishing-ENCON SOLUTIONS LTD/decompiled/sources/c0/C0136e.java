package c0;

import androidx.window.sidecar.SidecarDisplayFeature;
import t1.l;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136e extends kotlin.jvm.internal.j implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final C0136e f2642e = new C0136e(1);

    @Override // t1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
