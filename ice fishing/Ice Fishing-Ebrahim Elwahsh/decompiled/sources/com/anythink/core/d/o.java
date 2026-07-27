package com.anythink.core.d;

import D.y;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.h.bm;
import com.anythink.core.d.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17624a = "o";

    /* renamed from: b, reason: collision with root package name */
    private n f17625b;

    public o(n nVar) {
        this.f17625b = nVar;
    }

    public o() {
    }

    public final void a(Context context, final bm bmVar) {
        if (bmVar == null) {
            return;
        }
        a(context, bmVar, new com.anythink.core.common.m.q() { // from class: com.anythink.core.d.o.1
            @Override // com.anythink.core.common.m.q
            public final void onLoadCanceled(int i) {
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str, AdError adError) {
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                l a9;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    try {
                        jSONObject.put(l.a.ac, System.currentTimeMillis());
                        int optInt = jSONObject.optInt(l.a.av, 0);
                        if (o.this.f17625b != null && (a9 = o.this.f17625b.a(bmVar.d(), optInt)) != null) {
                            a9.a(jSONObject, bmVar.d());
                        }
                    } catch (Throwable th) {
                        Log.e(o.f17624a, "parse place strategy error:" + th.getMessage());
                    }
                    l a10 = l.a(bmVar.d(), jSONObject);
                    if (o.this.f17625b == null || a10 == null) {
                        return;
                    }
                    String unused = o.f17624a;
                    bmVar.d();
                    bmVar.h();
                    a10.aZ();
                    n nVar = o.this.f17625b;
                    String d2 = bmVar.d();
                    if (a10.at() != 1) {
                        jSONObject = null;
                    }
                    nVar.a(d2, a10, jSONObject, a10.aZ());
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadStart(int i) {
            }
        });
    }

    public final void a(final Context context, final bm bmVar, com.anythink.core.common.m.q qVar) {
        if (bmVar == null) {
            return;
        }
        com.anythink.core.common.d.t.b().T();
        if (bmVar.n()) {
            com.anythink.core.common.g.c.a();
            if (com.anythink.core.common.g.c.c()) {
                final com.anythink.core.common.m.n nVar = new com.anythink.core.common.m.n(qVar);
                com.anythink.core.common.i.a();
                String c4 = com.anythink.core.common.i.c();
                final String f6 = com.anythink.core.common.v.q.f(c4);
                new com.anythink.core.common.m.s(context, bmVar).a(c4).a(0, (com.anythink.core.common.m.q) nVar);
                com.anythink.core.common.g.c.a().a(new com.anythink.core.common.g.d() { // from class: com.anythink.core.d.o.2
                    @Override // com.anythink.core.common.g.d
                    public final void a(String str) {
                        String unused = o.f17624a;
                        if (TextUtils.isEmpty(str) || str.equals(f6)) {
                            String l9 = y.l("The cdnDomain(", str, ") is not equal to curPlDomain(", f6, ").");
                            nVar.onLoadError(0, l9, ErrorCode.getErrorCode(ErrorCode.exception, "", l9));
                            return;
                        }
                        boolean a9 = nVar.a();
                        String unused2 = o.f17624a;
                        bmVar.d();
                        if (a9) {
                            return;
                        }
                        com.anythink.core.common.g.c.a();
                        com.anythink.core.common.i.a();
                        String b9 = com.anythink.core.common.g.c.b(com.anythink.core.common.i.c(), str);
                        String unused3 = o.f17624a;
                        new com.anythink.core.common.m.s(context, bmVar).a(b9).s().a(0, (com.anythink.core.common.m.q) nVar);
                    }
                });
                return;
            }
        }
        new com.anythink.core.common.m.s(context, bmVar).a(0, qVar);
    }
}
