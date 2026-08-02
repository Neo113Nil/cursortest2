package com.yandex.passport.data.network;

import com.connectsdk.service.airplay.PListParser;
import defpackage.cg6;
import defpackage.cvt;
import defpackage.g0o;
import defpackage.ime;
import defpackage.nm6;
import defpackage.q5g;
import defpackage.qgg;
import defpackage.twh;
import defpackage.w1g;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class ac implements com.yandex.passport.data.network.core.d {
    public final /* synthetic */ int a;
    public final com.yandex.passport.data.network.core.t b;
    public final com.yandex.passport.data.network.core.l c;

    public ac(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 2:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 3:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 4:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 5:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 6:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 7:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            default:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
        }
    }

    @Override // com.yandex.passport.data.network.core.d
    public final /* bridge */ /* synthetic */ Object a(Object obj, com.yandex.passport.data.network.core.a aVar) {
        switch (this.a) {
            case 0:
                return b((yb) obj, aVar);
            case 1:
                return c((ec) obj, aVar);
            case 2:
                return d((com.yandex.passport.data.network.token.a) obj, aVar);
            case 3:
                return e((com.yandex.passport.data.network.token.g) obj, aVar);
            case 4:
                return f((com.yandex.passport.data.network.token.n) obj, aVar);
            case 5:
                return g((com.yandex.passport.data.network.token.t) obj, aVar);
            case 6:
                return h((com.yandex.passport.data.network.token.c0) obj, aVar);
            default:
                return i((com.yandex.passport.data.network.token.i0) obj, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(yb ybVar, cg6 cg6Var) {
        zb zbVar;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (cg6Var instanceof zb) {
            zbVar = (zb) cg6Var;
            int i2 = zbVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zbVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zbVar.k;
                nm6 nm6Var = nm6.a;
                i = zbVar.m;
                twh twhVar = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) com.appsflyer.internal.k.j(ybVar.b, this.b, ybVar.a).b);
                    oVar2.J("/2/change_avatar/");
                    oVar2.F("Ya-Consumer-Authorization", "OAuth " + ybVar.c);
                    oVar2.S("default", PListParser.TAG_TRUE);
                    Pattern pattern = twh.e;
                    try {
                        twhVar = q5g.C("image/jpeg");
                    } catch (IllegalArgumentException unused) {
                    }
                    byte[] bArr = ybVar.d;
                    bArr.getClass();
                    int length = bArr.length;
                    cvt.c(bArr.length, 0, length);
                    g0o g0oVar = new g0o(twhVar, length, bArr);
                    ime imeVar = oVar2.e;
                    imeVar.getClass();
                    ((ArrayList) imeVar.d).add(w1g.u("file", "avatar.jpg", g0oVar));
                    zbVar.j = oVar2;
                    zbVar.m = 1;
                    if (this.c.b(oVar2, zbVar) == nm6Var) {
                        return nm6Var;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = zbVar.j;
                    qgg.h0(obj);
                }
                return oVar.z();
            }
        }
        zbVar = new zb(this, cg6Var);
        Object obj2 = zbVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zbVar.m;
        twh twhVar2 = null;
        if (i != 0) {
        }
        return oVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(ec ecVar, cg6 cg6Var) {
        ic icVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof ic) {
            icVar = (ic) cg6Var;
            int i2 = icVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                icVar.m = i2 - Integer.MIN_VALUE;
                Object obj = icVar.k;
                nm6 nm6Var = nm6.a;
                i = icVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, ecVar.a).b, "/1/bundle/mobile/validate/phone_number/");
                    k.S("track_id", ecVar.b);
                    k.S("phone_number", ecVar.c);
                    k.S("validate_for_call", PListParser.TAG_TRUE);
                    icVar.j = k;
                    icVar.m = 1;
                    if (this.c.b(k, icVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = icVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        icVar = new ic(this, cg6Var);
        Object obj2 = icVar.k;
        nm6 nm6Var2 = nm6.a;
        i = icVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(com.yandex.passport.data.network.token.a aVar, cg6 cg6Var) {
        com.yandex.passport.data.network.token.b bVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof com.yandex.passport.data.network.token.b) {
            bVar = (com.yandex.passport.data.network.token.b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) com.appsflyer.internal.k.j(0L, this.b, aVar.a).b);
                    pVar2.J("/1/token");
                    pVar2.S("grant_type", "authorization_code");
                    pVar2.S("client_id", aVar.b);
                    pVar2.S("client_secret", aVar.c);
                    pVar2.S("code", aVar.d);
                    pVar2.S("code_verifier", aVar.e);
                    bVar.j = pVar2;
                    bVar.m = 1;
                    if (this.c.b(pVar2, bVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = bVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        bVar = new com.yandex.passport.data.network.token.b(this, cg6Var);
        Object obj2 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(com.yandex.passport.data.network.token.g gVar, cg6 cg6Var) {
        com.yandex.passport.data.network.token.h hVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof com.yandex.passport.data.network.token.h) {
            hVar = (com.yandex.passport.data.network.token.h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hVar.k;
                nm6 nm6Var = nm6.a;
                i = hVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(gVar.e, this.b, gVar.a).b, "/1/bundle/oauth/token_by_sessionid");
                    k.F("Ya-Client-Host", gVar.b);
                    k.F("Ya-Client-Cookie", gVar.c);
                    k.S("client_id", gVar.f);
                    k.S("client_secret", gVar.g);
                    String str = gVar.d;
                    if (str != null) {
                        k.S("track_id", str);
                    }
                    hVar.j = k;
                    hVar.m = 1;
                    if (this.c.b(k, hVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = hVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        hVar = new com.yandex.passport.data.network.token.h(this, cg6Var);
        Object obj2 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(com.yandex.passport.data.network.token.n nVar, cg6 cg6Var) {
        com.yandex.passport.data.network.token.o oVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof com.yandex.passport.data.network.token.o) {
            oVar = (com.yandex.passport.data.network.token.o) cg6Var;
            int i2 = oVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oVar.k;
                nm6 nm6Var = nm6.a;
                i = oVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) com.appsflyer.internal.k.j(0L, this.b, nVar.a).b);
                    pVar2.J("/1/token");
                    pVar2.S("grant_type", "device_code");
                    pVar2.S("client_id", nVar.c);
                    pVar2.S("client_secret", nVar.d);
                    pVar2.S("code", nVar.b);
                    oVar.j = pVar2;
                    oVar.m = 1;
                    if (this.c.b(pVar2, oVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = oVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        oVar = new com.yandex.passport.data.network.token.o(this, cg6Var);
        Object obj2 = oVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(com.yandex.passport.data.network.token.t tVar, cg6 cg6Var) {
        com.yandex.passport.data.network.token.u uVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof com.yandex.passport.data.network.token.u) {
            uVar = (com.yandex.passport.data.network.token.u) cg6Var;
            int i2 = uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.m = i2 - Integer.MIN_VALUE;
                Object obj = uVar.k;
                nm6 nm6Var = nm6.a;
                i = uVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, tVar.a).b, "/1/external_auth_by_oauth");
                    k.S("client_id", tVar.c);
                    k.S("client_secret", tVar.d);
                    k.S("social_task_id", tVar.b);
                    uVar.j = k;
                    uVar.m = 1;
                    if (this.c.b(k, uVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = uVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        uVar = new com.yandex.passport.data.network.token.u(this, cg6Var);
        Object obj2 = uVar.k;
        nm6 nm6Var2 = nm6.a;
        i = uVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(com.yandex.passport.data.network.token.c0 c0Var, cg6 cg6Var) {
        com.yandex.passport.data.network.token.d0 d0Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof com.yandex.passport.data.network.token.d0) {
            d0Var = (com.yandex.passport.data.network.token.d0) cg6Var;
            int i2 = d0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = d0Var.k;
                nm6 nm6Var = nm6.a;
                i = d0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, c0Var.a).b, "/1/oauth/token");
                    k.S("client_id", c0Var.c);
                    k.S("client_secret", c0Var.d);
                    k.S("track_id", c0Var.b);
                    d0Var.j = k;
                    d0Var.m = 1;
                    if (this.c.b(k, d0Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = d0Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        d0Var = new com.yandex.passport.data.network.token.d0(this, cg6Var);
        Object obj2 = d0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = d0Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(com.yandex.passport.data.network.token.i0 i0Var, cg6 cg6Var) {
        com.yandex.passport.data.network.token.j0 j0Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof com.yandex.passport.data.network.token.j0) {
            j0Var = (com.yandex.passport.data.network.token.j0) cg6Var;
            int i2 = j0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = j0Var.k;
                nm6 nm6Var = nm6.a;
                i = j0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, i0Var.a).b, "/1/bundle/auth/forward_by_track/exchange");
                    k.S("client_id", i0Var.c);
                    k.S("client_secret", i0Var.d);
                    k.S("track_id", i0Var.b);
                    j0Var.j = k;
                    j0Var.m = 1;
                    if (this.c.b(k, j0Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = j0Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        j0Var = new com.yandex.passport.data.network.token.j0(this, cg6Var);
        Object obj2 = j0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = j0Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }
}
