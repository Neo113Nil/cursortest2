package com.anythink.core.d;

import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bm;
import com.anythink.core.common.v.af;
import com.anythink.core.d.n;

/* loaded from: classes.dex */
public class m implements com.anythink.core.common.m.q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18219a = "m";

    /* renamed from: b, reason: collision with root package name */
    private final n f18220b;

    /* renamed from: c, reason: collision with root package name */
    private final bm f18221c;

    /* renamed from: d, reason: collision with root package name */
    private final n.b f18222d;

    /* renamed from: e, reason: collision with root package name */
    private final l f18223e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.t.a f18224f;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f18225g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.core.common.t.b f18226h;

    public m(n nVar, bm bmVar, n.b bVar, l lVar) {
        this.f18220b = nVar;
        this.f18221c = bmVar;
        this.f18222d = bVar;
        this.f18223e = lVar;
    }

    private void a() {
        com.anythink.core.common.t.b bVar;
        com.anythink.core.common.t.a aVar = this.f18224f;
        if (aVar == null || (bVar = this.f18226h) == null) {
            return;
        }
        aVar.b(bVar);
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadCanceled(int i) {
        a();
        n.b bVar = this.f18222d;
        if (bVar == null) {
            return;
        }
        l lVar = this.f18223e;
        if (lVar == null) {
            bVar.a(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
        } else {
            bVar.a(lVar);
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadError(int i, String str, AdError adError) {
        n.b bVar;
        a();
        if (this.f18221c != null) {
            if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                String str2 = this.f18221c.b() + this.f18221c.d() + this.f18221c.c();
                adError.getPlatformCode();
                adError.getPlatformMSG();
                af.a(com.anythink.core.common.d.t.b().g(), u.b.f13641j, str2, System.currentTimeMillis());
                if (com.anythink.core.common.d.t.b().F()) {
                    Log.e("anythink", "Please check these params in your code (AppId: " + this.f18221c.b() + ", AppKey: " + this.f18221c.c() + ", PlacementId: " + this.f18221c.d() + ")");
                }
            }
            if ("699".equals(adError.getPlatformCode())) {
                this.f18220b.a(this.f18221c.b(), this.f18221c.d(), this.f18223e);
                n.b bVar2 = this.f18222d;
                if (bVar2 != null) {
                    bVar2.a(adError);
                    return;
                }
                return;
            }
        }
        l lVar = this.f18223e;
        if (lVar == null && (bVar = this.f18222d) != null) {
            bVar.a(adError);
        } else if (this.f18222d != null) {
            if (lVar.bl()) {
                this.f18222d.a(adError);
            } else {
                this.f18222d.a(this.f18223e);
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        a();
        n.b bVar = this.f18222d;
        if (bVar != null) {
            bVar.b();
        }
        n nVar = this.f18220b;
        if (nVar != null) {
            nVar.a(obj, this.f18221c, this.f18222d, this.f18225g, this.f18223e);
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadStart(int i) {
        n.b bVar = this.f18222d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public m(n nVar, bm bmVar, n.b bVar, l lVar, com.anythink.core.common.t.a aVar, com.anythink.core.common.t.b bVar2, boolean[] zArr) {
        this.f18220b = nVar;
        this.f18221c = bmVar;
        this.f18222d = bVar;
        this.f18224f = aVar;
        this.f18225g = zArr;
        this.f18226h = bVar2;
        this.f18223e = lVar;
    }
}
