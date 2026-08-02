package com.yandex.passport.internal.core.linkage;

import com.yandex.passport.api.exception.k;
import com.yandex.passport.api.exception.p;
import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.report.reporters.t;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class b {
    public final e a;
    public final i b;
    public final h c;
    public final com.yandex.passport.internal.network.mappers.d d;

    public b(e eVar, i iVar, h hVar, com.yandex.passport.internal.network.mappers.d dVar) {
        this.a = eVar;
        this.b = iVar;
        this.c = hVar;
        this.d = dVar;
    }

    public final void a(f fVar, f fVar2) {
        com.yandex.passport.internal.network.mappers.d dVar = this.d;
        i iVar = this.b;
        com.yandex.passport.internal.d a = this.a.a();
        l e = a.e(fVar);
        if (e == null) {
            throw new com.yandex.passport.api.exception.b(fVar);
        }
        f fVar3 = e.b;
        l e2 = a.e(fVar2);
        if (e2 == null) {
            throw new com.yandex.passport.api.exception.b(fVar2);
        }
        try {
            e.d.d();
            try {
                e2.d.d();
                if (e.e.h == 10) {
                    e = e2;
                    e2 = e;
                }
                try {
                    this.c.a(fVar3.a).b(e.d, e2.d);
                } catch (com.yandex.passport.common.exception.a unused) {
                    throw new com.yandex.passport.api.exception.a();
                } catch (com.yandex.passport.data.exceptions.h e3) {
                    if ("yandex_token.invalid".equals(e3.getMessage())) {
                        iVar.d(dVar.a(e), t.e);
                        throw new com.yandex.passport.api.exception.a(e.b);
                    }
                    if (!"provider_token.invalid".equals(e3.getMessage())) {
                        throw new k(e3.getMessage());
                    }
                    iVar.d(dVar.a(e2), t.e);
                    throw new com.yandex.passport.api.exception.a(e2.b);
                } catch (IOException e4) {
                    e = e4;
                    throw new p(e);
                } catch (JSONException e5) {
                    e = e5;
                    throw new p(e);
                }
            } catch (com.yandex.passport.common.exception.a unused2) {
                iVar.d(dVar.a(e2), t.e);
                throw new com.yandex.passport.api.exception.a(e2.b);
            }
        } catch (com.yandex.passport.common.exception.a unused3) {
            iVar.d(dVar.a(e), t.e);
            throw new com.yandex.passport.api.exception.a(fVar3);
        }
    }
}
