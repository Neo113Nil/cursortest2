package com.yandex.passport.sloth.command.performers;

import com.connectsdk.service.airplay.PListParser;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.data.t0;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uah;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;
    public final a1 b;

    public a0(com.yandex.passport.sloth.v vVar, a1 a1Var) {
        vVar.getClass();
        a1Var.getClass();
        this.a = vVar;
        this.b = a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(t0 t0Var, cg6 cg6Var) {
        z zVar;
        int i;
        String str;
        if (cg6Var instanceof z) {
            zVar = (z) cg6Var;
            int i2 = zVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zVar.j;
                nm6 nm6Var = nm6.a;
                i = zVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str2 = t0Var.a;
                    Map map = t0Var.b;
                    Map j = uah.j(map, new Pair("conditions_met", PListParser.TAG_TRUE));
                    a1 a1Var = this.b;
                    a1Var.getClass();
                    str2.getClass();
                    j.getClass();
                    com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) a1Var.a;
                    oVar.getClass();
                    if (oVar.a()) {
                        oVar.a.a(str2, j);
                    }
                    if (Intrinsics.d(t0Var.a, "pwl-metrics") && (str = (String) map.get(Constants.KEY_PAGE)) != null) {
                        com.yandex.passport.sloth.r rVar = new com.yandex.passport.sloth.r(str);
                        zVar.l = 1;
                        if (this.a.b(rVar, zVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(com.yandex.passport.sloth.command.v.b);
            }
        }
        zVar = new z(this, cg6Var);
        Object obj2 = zVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.b);
    }
}
