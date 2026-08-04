package com.gamericefishpro.space.e7;

import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t0.y0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public volatile com.gamericefishpro.space.pi.h b;
    public final AtomicReference a = new AtomicReference(null);
    public volatile String c = "";
    public final com.gamericefishpro.space.vb.c d = new com.gamericefishpro.space.vb.c(11, this);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r10 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        f fVar;
        String strReplace;
        g gVar;
        String str2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.w = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objF = fVar.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = fVar.w;
        com.gamericefishpro.space.th.a aVar2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                str = fVar.e;
                gVar = (g) fVar.d;
                com.gamericefishpro.space.wa.b.P(objF);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) fVar.d;
                com.gamericefishpro.space.wa.b.P(objF);
            }
            String str3 = (String) objF;
            return str3 == null ? str2 : str3;
        }
        com.gamericefishpro.space.wa.b.P(objF);
        this.c = str;
        strReplace = (String) this.a.getAndSet(null);
        if (strReplace != null) {
            if (StringsKt.r(strReplace, "player_id=,") || StringsKt.r(strReplace, "player_id=}")) {
                strReplace = new Regex("player_id=[^,}]*").replace(strReplace, "player_id=" + str);
            }
            if (strReplace != null) {
                gVar = this;
                str2 = strReplace;
                gVar.getClass();
                if (!StringsKt.r(str2, "install_time=") && !StringsKt.r(str2, "install_time=,") && !StringsKt.r(str2, "install_time=}")) {
                    return str2;
                }
                fVar.d = str2;
                fVar.e = null;
                fVar.w = 2;
                objF = a0.F(5000L, new e0(gVar, aVar2, 2), fVar);
            }
            return aVar;
        }
        fVar.d = this;
        fVar.e = str;
        fVar.w = 1;
        objF = a0.F(15000L, new e0(this, aVar2, 2), fVar);
        if (objF != aVar) {
            gVar = this;
        }
        return aVar;
        strReplace = (String) objF;
        if (strReplace == null) {
            return y0.g("{player_id=", str, "}");
        }
        str2 = strReplace;
        gVar.getClass();
        if (!StringsKt.r(str2, "install_time=")) {
        }
        fVar.d = str2;
        fVar.e = null;
        fVar.w = 2;
        objF = a0.F(5000L, new e0(gVar, aVar2, 2), fVar);
    }
}
