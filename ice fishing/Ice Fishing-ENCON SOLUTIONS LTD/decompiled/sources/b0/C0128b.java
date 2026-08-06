package b0;

import androidx.window.extensions.layout.WindowLayoutInfo;
import h1.C0239i;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import t1.l;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0128b extends h implements l {
    public C0128b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        i.e(p02, "p0");
        ((f) this.receiver).accept(p02);
        return C0239i.f3393a;
    }
}
