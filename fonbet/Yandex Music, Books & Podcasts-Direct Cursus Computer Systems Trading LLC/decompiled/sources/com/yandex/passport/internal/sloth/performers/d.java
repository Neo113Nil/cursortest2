package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.u;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.n2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uah;
import defpackage.xq0;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class d implements t {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n2b a(cg6 cg6Var) {
        c cVar;
        int i;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.j;
                    nm6 nm6Var = nm6.a;
                    i = cVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.passport.sloth.command.d dVar = new com.yandex.passport.sloth.command.d("otp_obtaining_error_".concat("OTP service is misconfigured"));
                        return dVar instanceof s ? new l2b(dVar) : new m2b(dVar);
                    }
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    String str = (String) obj;
                    if (str != null) {
                        return new l2b(new u(uah.p(new Pair[]{new Pair("otp", str)})));
                    }
                    com.yandex.passport.sloth.command.d dVar2 = new com.yandex.passport.sloth.command.d("otp_obtaining_error_".concat("Cannot generate OTP from the data"));
                    return dVar2 instanceof s ? new l2b(dVar2) : new m2b(dVar2);
                }
            }
            if (i != 0) {
            }
        } catch (Throwable unused) {
            com.yandex.passport.sloth.command.d dVar3 = new com.yandex.passport.sloth.command.d("otp_obtaining_error_".concat("Error getting OTP"));
            return dVar3 instanceof s ? new l2b(dVar3) : new m2b(dVar3);
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final /* bridge */ /* synthetic */ Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        return a(fVar);
    }
}
