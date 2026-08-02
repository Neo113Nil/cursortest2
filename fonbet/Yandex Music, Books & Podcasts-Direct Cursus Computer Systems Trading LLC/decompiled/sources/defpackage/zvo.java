package defpackage;

import android.graphics.Paint;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class zvo implements y73 {
    public final htd a;

    public zvo(htd htdVar) {
        this.a = htdVar;
    }

    @Override // defpackage.y73
    public final void a(opf opfVar) {
        ou3 ou3Var = opfVar.a;
        Object obj = itd.a;
        htd htdVar = this.a;
        std stdVar = htdVar.G;
        std stdVar2 = null;
        if (!stdVar.a()) {
            stdVar = null;
        }
        if (stdVar == null) {
            stdVar = htdVar.u.e;
            if (!stdVar.a()) {
                stdVar = null;
            }
            if (stdVar == null) {
                stdVar = htdVar.t.e;
            }
        }
        if (!stdVar.a()) {
            stdVar = null;
        }
        if (stdVar == null) {
            std stdVar3 = (std) CollectionsKt.firstOrNull(itd.c(htdVar));
            if (stdVar3 != null) {
                ai3 ai3Var = stdVar3.c;
                float b = itd.b(htdVar);
                if (Float.isNaN(b)) {
                    b = 0;
                }
                if (ai3Var != null) {
                    stdVar2 = stdVar3;
                } else {
                    if (Float.isNaN(b)) {
                        b = gtd.a;
                    }
                    long j = stdVar3.a;
                    float d = d85.d(j) * ((b / 72) + 1);
                    if (d > 1.0f) {
                        d = 1.0f;
                    }
                    stdVar2 = new std(d85.b(j, d, 0.0f, 0.0f, 0.0f, 14), stdVar3.b, ai3Var);
                }
            }
            if (stdVar2 == null) {
                return;
            } else {
                stdVar = stdVar2;
            }
        }
        if (htdVar.H == 1.0f) {
            q6k.n(opfVar, htdVar.D, stdVar);
            return;
        }
        lo3 lo3Var = v4k.a;
        gh0 a = v4k.a(lo3Var);
        Paint paint = a.a;
        try {
            a.c(htdVar.H);
            mu3 s = ou3Var.b.s();
            try {
                s.m(ywf.d(0L, ou3Var.e()), a);
                q6k.n(opfVar, htdVar.D, stdVar);
                s.k();
                paint.reset();
                lo3Var.c(a);
            } catch (Throwable th) {
                s.k();
                throw th;
            }
        } catch (Throwable th2) {
            paint.reset();
            lo3Var.c(a);
            throw th2;
        }
    }
}
