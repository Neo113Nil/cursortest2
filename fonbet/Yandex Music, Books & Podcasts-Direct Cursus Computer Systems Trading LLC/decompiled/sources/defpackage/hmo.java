package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class hmo extends imo {
    public final Path f;
    public final /* synthetic */ mmo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmo(mmo mmoVar, Path path, float f) {
        super(mmoVar, f, 0.0f);
        this.g = mmoVar;
        this.f = path;
    }

    @Override // defpackage.imo, defpackage.u7g
    public final void S(String str) {
        mmo mmoVar = this.g;
        if (mmoVar.d1()) {
            kmo kmoVar = (kmo) mmoVar.d;
            if (kmoVar.b) {
                ((Canvas) mmoVar.b).drawTextOnPath(str, this.f, this.c, this.d, kmoVar.d);
            }
            kmo kmoVar2 = (kmo) mmoVar.d;
            if (kmoVar2.c) {
                ((Canvas) mmoVar.b).drawTextOnPath(str, this.f, this.c, this.d, kmoVar2.e);
            }
        }
        this.c = ((kmo) mmoVar.d).d.measureText(str) + this.c;
    }
}
