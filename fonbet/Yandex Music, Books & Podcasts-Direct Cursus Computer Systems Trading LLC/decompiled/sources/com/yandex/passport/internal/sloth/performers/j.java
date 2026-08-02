package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.sloth.command.data.j0;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.u;
import com.yandex.passport.sloth.command.v;
import com.yandex.passport.sloth.data.h0;
import com.yandex.passport.sloth.data.o0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.sad;
import defpackage.uah;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class j implements t {
    public final com.yandex.passport.internal.sloth.credentialmanager.d a;
    public final Context b;

    public j(com.yandex.passport.internal.sloth.credentialmanager.d dVar, Context context) {
        dVar.getClass();
        context.getClass();
        this.a = dVar;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.sloth.command.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(com.yandex.passport.sloth.data.m mVar, j0 j0Var, cg6 cg6Var) {
        i iVar;
        int i;
        Object b;
        Throwable a;
        u uVar;
        Object obj = v.b;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = iVar.j;
                nm6 nm6Var = nm6.a;
                i = iVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    o0 o0Var = mVar.a;
                    if (!com.yandex.passport.common.util.a.b(this.b) || (o0Var instanceof h0)) {
                        return new l2b(obj);
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.e eVar = com.yandex.passport.internal.sloth.credentialmanager.e.Login;
                    String str = j0Var.a;
                    iVar.l = 1;
                    b = this.a.b(eVar, str, iVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    b = ((z7o) obj2).a;
                }
                a = z7o.a(b);
                if (a == null) {
                    Throwable cause = a.getCause();
                    if (cause instanceof sad) {
                        obj = new u(uah.p(new Pair[]{new Pair("error", "webauthn." + ((sad) cause).a)}));
                    }
                    return new l2b(obj);
                }
                com.yandex.passport.internal.sloth.credentialmanager.c cVar = (com.yandex.passport.internal.sloth.credentialmanager.c) b;
                if (cVar instanceof com.yandex.passport.internal.sloth.credentialmanager.b) {
                    uVar = new u(uah.p(new Pair[]{new Pair("webauthn", ((com.yandex.passport.internal.sloth.credentialmanager.b) cVar).b)}));
                } else {
                    if (!(cVar instanceof com.yandex.passport.internal.sloth.credentialmanager.a)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar = (com.yandex.passport.internal.sloth.credentialmanager.a) cVar;
                    uVar = new u(uah.p(new Pair[]{new Pair(LegacyAccountType.STRING_LOGIN, aVar.b), new Pair("password", aVar.c), new Pair("isFromDialog", Boolean.valueOf(cVar.a))}));
                }
                return new l2b(uVar);
            }
        }
        iVar = new i(this, cg6Var);
        Object obj22 = iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar.l;
        if (i != 0) {
        }
        a = z7o.a(b);
        if (a == null) {
        }
    }
}
