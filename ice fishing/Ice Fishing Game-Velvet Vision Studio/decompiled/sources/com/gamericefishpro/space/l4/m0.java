package com.gamericefishpro.space.l4;

import com.gamericefishpro.space.i9.y3;
import java.io.FileOutputStream;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends f0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, com.gamericefishpro.space.vh.c cVar) {
        l0 l0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i = l0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                l0Var.w = i - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object obj2 = l0Var.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = l0Var.w;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj2);
            if (this.b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
            try {
                com.gamericefishpro.space.p4.g gVar = com.gamericefishpro.space.p4.g.a;
                w0 w0Var = new w0(fileOutputStream3);
                l0Var.d = fileOutputStream3;
                l0Var.e = fileOutputStream3;
                l0Var.w = 1;
                if (gVar.b(obj, w0Var) == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = l0Var.e;
            fileOutputStream = l0Var.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    y3.s(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.a;
        y3.s(fileOutputStream, null);
        return Unit.a;
    }
}
