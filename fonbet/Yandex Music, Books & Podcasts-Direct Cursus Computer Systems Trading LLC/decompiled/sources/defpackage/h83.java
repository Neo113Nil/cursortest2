package defpackage;

import dev.chrisbanes.haze.HazeSourceElement;
import dev.chrisbanes.haze.a;

/* loaded from: classes3.dex */
public final class h83 implements f83 {
    public final cib a;

    public h83(cib cibVar) {
        this.a = cibVar;
    }

    @Override // defpackage.f83
    public final yci a(yci yciVar, o6g o6gVar, tka tkaVar) {
        yciVar.getClass();
        float f = gtd.a;
        return a.a(yciVar, this.a, gtd.a(10, 2, d85.m), new g83(o6gVar, tkaVar));
    }

    @Override // defpackage.f83
    public final yci b(yci yciVar) {
        yciVar.getClass();
        return yciVar.f(new HazeSourceElement(this.a));
    }
}
