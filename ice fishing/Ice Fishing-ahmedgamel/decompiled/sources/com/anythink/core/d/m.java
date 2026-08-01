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
    private static final String f17432a = "m";

    /* renamed from: b, reason: collision with root package name */
    private final n f17433b;

    /* renamed from: c, reason: collision with root package name */
    private final bm f17434c;

    /* renamed from: d, reason: collision with root package name */
    private final n.b f17435d;

    /* renamed from: e, reason: collision with root package name */
    private final l f17436e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.t.a f17437f;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f17438g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.core.common.t.b f17439h;

    public m(n nVar, bm bmVar, n.b bVar, l lVar) {
        this.f17433b = nVar;
        this.f17434c = bmVar;
        this.f17435d = bVar;
        this.f17436e = lVar;
    }

    private void a() {
        com.anythink.core.common.t.b bVar;
        com.anythink.core.common.t.a aVar = this.f17437f;
        if (aVar == null || (bVar = this.f17439h) == null) {
            return;
        }
        aVar.b(bVar);
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadCanceled(int i) {
        a();
        n.b bVar = this.f17435d;
        if (bVar == null) {
            return;
        }
        l lVar = this.f17436e;
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
        if (this.f17434c != null) {
            if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                String str2 = this.f17434c.b() + this.f17434c.d() + this.f17434c.c();
                adError.getPlatformCode();
                adError.getPlatformMSG();
                af.a(com.anythink.core.common.d.t.b().g(), u.b.f12855j, str2, System.currentTimeMillis());
                if (com.anythink.core.common.d.t.b().F()) {
                    Log.e("anythink", "Please check these params in your code (AppId: " + this.f17434c.b() + ", AppKey: " + this.f17434c.c() + ", PlacementId: " + this.f17434c.d() + ")");
                }
            }
            if ("699".equals(adError.getPlatformCode())) {
                this.f17433b.a(this.f17434c.b(), this.f17434c.d(), this.f17436e);
                n.b bVar2 = this.f17435d;
                if (bVar2 != null) {
                    bVar2.a(adError);
                    return;
                }
                return;
            }
        }
        l lVar = this.f17436e;
        if (lVar == null && (bVar = this.f17435d) != null) {
            bVar.a(adError);
        } else if (this.f17435d != null) {
            if (lVar.bl()) {
                this.f17435d.a(adError);
            } else {
                this.f17435d.a(this.f17436e);
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        a();
        n.b bVar = this.f17435d;
        if (bVar != null) {
            bVar.b();
        }
        n nVar = this.f17433b;
        if (nVar != null) {
            nVar.a(obj, this.f17434c, this.f17435d, this.f17438g, this.f17436e);
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadStart(int i) {
        n.b bVar = this.f17435d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public m(n nVar, bm bmVar, n.b bVar, l lVar, com.anythink.core.common.t.a aVar, com.anythink.core.common.t.b bVar2, boolean[] zArr) {
        this.f17433b = nVar;
        this.f17434c = bmVar;
        this.f17435d = bVar;
        this.f17437f = aVar;
        this.f17438g = zArr;
        this.f17439h = bVar2;
        this.f17436e = lVar;
    }
}
