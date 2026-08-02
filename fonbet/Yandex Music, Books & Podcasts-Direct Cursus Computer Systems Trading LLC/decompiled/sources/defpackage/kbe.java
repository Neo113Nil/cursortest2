package defpackage;

import android.graphics.ImageDecoder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class kbe extends uif implements Function0 {
    public final /* synthetic */ nbe r;
    public final /* synthetic */ tqn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbe(nbe nbeVar, tqn tqnVar) {
        super(0);
        this.r = nbeVar;
        this.s = tqnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xqn xqnVar = new xqn();
        nbe nbeVar = this.r;
        tce tceVar = nbeVar.a;
        ij3 o = tceVar.o();
        if (o.A0(0L, mcd.b) || o.A0(0L, mcd.a)) {
            tceVar = new p3r(new ikn(new nvc(tceVar.o())), new ji7(nbeVar.b.a, 3), null);
        }
        try {
            return ImageDecoder.decodeDrawable(nbe.b(nbeVar, tceVar), new jbe(xqnVar, nbeVar, this.s));
        } finally {
            ImageDecoder d = b6e.d(xqnVar.a);
            if (d != null) {
                d.close();
            }
            tceVar.close();
        }
    }
}
