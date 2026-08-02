package com.yandex.passport.data.network;

import com.appsflyer.AdRevenueScheme;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class g implements com.yandex.passport.data.network.core.d {
    public final /* synthetic */ int a;
    public final com.yandex.passport.data.network.core.t b;
    public final com.yandex.passport.data.network.core.l c;

    public g(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar, int i) {
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
            case 8:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 9:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 10:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 11:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 12:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 13:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 14:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 15:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 16:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 17:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 18:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 19:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 20:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 21:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 22:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 23:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 24:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 25:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 26:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 27:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                tVar.getClass();
                lVar.getClass();
                this.b = tVar;
                this.c = lVar;
                break;
            case 29:
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(fa faVar, cg6 cg6Var) {
        ga gaVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof ga) {
            gaVar = (ga) cg6Var;
            int i2 = gaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gaVar.k;
                nm6 nm6Var = nm6.a;
                i = gaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) this.b.a(faVar.a, faVar.e).b, "/1/revoke_token");
                    k.S("client_id", faVar.b);
                    k.S("client_secret", faVar.c);
                    k.S("access_token", faVar.d);
                    gaVar.j = k;
                    gaVar.m = 1;
                    if (this.c.b(k, gaVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = gaVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        gaVar = new ga(this, cg6Var);
        Object obj2 = gaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gaVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(ra raVar, cg6 cg6Var) {
        sa saVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof sa) {
            saVar = (sa) cg6Var;
            int i2 = saVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saVar.m = i2 - Integer.MIN_VALUE;
                Object obj = saVar.k;
                nm6 nm6Var = nm6.a;
                i = saVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) com.appsflyer.internal.k.j(0L, this.b, raVar.a).b);
                    pVar2.J(raVar.g ? "/1/bundle/phone/confirm_tracked_secure/submit/" : "/1/bundle/phone/confirm/submit/");
                    pVar2.S("track_id", raVar.b);
                    pVar2.S("number", raVar.c);
                    pVar2.S("display_language", raVar.d);
                    pVar2.S(AdRevenueScheme.COUNTRY, raVar.e);
                    pVar2.S("gps_package_name", raVar.f);
                    pVar2.S("confirm_method", "by_sms");
                    saVar.j = pVar2;
                    saVar.m = 1;
                    if (this.c.b(pVar2, saVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = saVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        saVar = new sa(this, cg6Var);
        Object obj2 = saVar.k;
        nm6 nm6Var2 = nm6.a;
        i = saVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(xa xaVar, cg6 cg6Var) {
        ya yaVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof ya) {
            yaVar = (ya) cg6Var;
            int i2 = yaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yaVar.k;
                nm6 nm6Var = nm6.a;
                i = yaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) com.appsflyer.internal.k.j(0L, this.b, xaVar.a).b);
                    pVar2.J(xaVar.d ? "/1/bundle/phone/confirm_tracked_secure/commit/" : "/1/bundle/phone/confirm/commit/");
                    pVar2.S("track_id", xaVar.b);
                    pVar2.S("code", xaVar.c);
                    yaVar.j = pVar2;
                    yaVar.m = 1;
                    if (this.c.b(pVar2, yaVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = yaVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        yaVar = new ya(this, cg6Var);
        Object obj2 = yaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yaVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(eb ebVar, cg6 cg6Var) {
        fb fbVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof fb) {
            fbVar = (fb) cg6Var;
            int i2 = fbVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fbVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fbVar.k;
                nm6 nm6Var = nm6.a;
                i = fbVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, ebVar.d).b, "1/bundle/biometrics/ebs/start_session/");
                    k.F("Authorization", "OAuth ".concat(ebVar.a.e()));
                    k.S("track_id", ebVar.b);
                    String str = ebVar.c;
                    if (str != null) {
                        k.S("flow_id", str);
                    }
                    fbVar.j = k;
                    fbVar.m = 1;
                    if (this.c.b(k, fbVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = fbVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        fbVar = new fb(this, cg6Var);
        Object obj2 = fbVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fbVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(kb kbVar, cg6 cg6Var) {
        lb lbVar;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof lb) {
            lbVar = (lb) cg6Var;
            int i2 = lbVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbVar.m = i2 - Integer.MIN_VALUE;
                Object obj = lbVar.k;
                nm6 nm6Var = nm6.a;
                i = lbVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.models.g gVar = kbVar.a;
                    String str = kbVar.c;
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) com.appsflyer.internal.k.j(0L, this.b, gVar).b, 0);
                    nVar2.J("/1/bundle/suggest/mobile_language/");
                    nVar2.F("Ya-Client-Accept-Language", str);
                    nVar2.O("language", str);
                    nVar2.O("track_id", kbVar.b);
                    lbVar.j = nVar2;
                    lbVar.m = 1;
                    if (this.c.b(nVar2, lbVar) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = lbVar.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        lbVar = new lb(this, cg6Var);
        Object obj2 = lbVar.k;
        nm6 nm6Var2 = nm6.a;
        i = lbVar.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    @Override // com.yandex.passport.data.network.core.d
    public final /* bridge */ /* synthetic */ Object a(Object obj, com.yandex.passport.data.network.core.a aVar) {
        switch (this.a) {
            case 0:
                return b((e) obj, aVar);
            case 1:
                return c((x) obj, aVar);
            case 2:
                return d((e0) obj, aVar);
            case 3:
                return e((k0) obj, aVar);
            case 4:
                return f((h1) obj, aVar);
            case 5:
                return g((n1) obj, aVar);
            case 6:
                return h((u1) obj, aVar);
            case 7:
                return i((b2) obj, aVar);
            case 8:
                return j((k2) obj, aVar);
            case 9:
                return k((z2) obj, aVar);
            case 10:
                return l((k3) obj, aVar);
            case 11:
                return m((u3) obj, aVar);
            case 12:
                return n((d4) obj, aVar);
            case 13:
                return o((j4) obj, aVar);
            case 14:
                return p((p4) obj, aVar);
            case 15:
                return q((u5) obj, aVar);
            case 16:
                return r((j6) obj, aVar);
            case 17:
                return s((s6) obj, aVar);
            case 18:
                return t((z6) obj, aVar);
            case 19:
                return u((f7) obj, aVar);
            case 20:
                return v((o8) obj, aVar);
            case 21:
                return w((i9) obj, aVar);
            case 22:
                return x((s9) obj, aVar);
            case 23:
                return y((v9) obj, aVar);
            case 24:
                return z((y9) obj, aVar);
            case 25:
                return A((fa) obj, aVar);
            case 26:
                return B((ra) obj, aVar);
            case 27:
                return C((xa) obj, aVar);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return D((eb) obj, aVar);
            default:
                return E((kb) obj, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(e eVar, cg6 cg6Var) {
        f fVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, eVar.a).b, "/1/bundle/mobile/auth/password/");
                    k.S("track_id", eVar.b);
                    k.S("password", eVar.c);
                    String str = eVar.d;
                    if (str != null) {
                        k.S("avatar_url", str);
                    }
                    k.S("password_source", eVar.f);
                    fVar.j = k;
                    fVar.m = 1;
                    if (this.c.b(k, fVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = fVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(x xVar, cg6 cg6Var) {
        y yVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i2 = yVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yVar.k;
                nm6 nm6Var = nm6.a;
                i = yVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, xVar.c).b, "1/bundle/biometrics/ebs/init_session/");
                    String str = xVar.b;
                    if (str != null) {
                        k.S("flow_id", str);
                    }
                    k.S("biometric_session_id", xVar.d);
                    k.F("Authorization", "OAuth ".concat(xVar.a.e()));
                    yVar.j = k;
                    yVar.m = 1;
                    if (this.c.b(k, yVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = yVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        yVar = new y(this, cg6Var);
        Object obj2 = yVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(e0 e0Var, cg6 cg6Var) {
        f0 f0Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof f0) {
            f0Var = (f0) cg6Var;
            int i2 = f0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.k;
                nm6 nm6Var = nm6.a;
                i = f0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) com.appsflyer.internal.k.j(0L, this.b, e0Var.d).b, 0);
                    nVar2.J("1/bundle/biometrics/ebs/check_face_recognized/");
                    nVar2.F("Authorization", "OAuth ".concat(e0Var.a.e()));
                    nVar2.O("track_id", e0Var.b);
                    String str = e0Var.c;
                    if (str != null) {
                        nVar2.O("flow_id", str);
                    }
                    f0Var.j = nVar2;
                    f0Var.m = 1;
                    if (this.c.b(nVar2, f0Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = f0Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        f0Var = new f0(this, cg6Var);
        Object obj2 = f0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = f0Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(k0 k0Var, cg6 cg6Var) {
        l0 l0Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof l0) {
            l0Var = (l0) cg6Var;
            int i2 = l0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = l0Var.k;
                nm6 nm6Var = nm6.a;
                i = l0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(k0Var.e, this.b, k0Var.d).b, "/1/does_profile_exist_by_token");
                    k.F("Authorization", "Bearer " + k0Var.a);
                    k.S("token", k0Var.b);
                    k.S("client_id", k0Var.c);
                    k.S("provider", "ya");
                    l0Var.j = k;
                    l0Var.m = 1;
                    if (this.c.b(k, l0Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = l0Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        l0Var = new l0(this, cg6Var);
        Object obj2 = l0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = l0Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(h1 h1Var, cg6 cg6Var) {
        i1 i1Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof i1) {
            i1Var = (i1) cg6Var;
            int i2 = i1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = i1Var.k;
                nm6 nm6Var = nm6.a;
                i = i1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) this.b.a(h1Var.a, null).b, "/1/suggest/country/");
                    k.S("track_id", h1Var.b);
                    i1Var.j = k;
                    i1Var.m = 1;
                    if (this.c.b(k, i1Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = i1Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        i1Var = new i1(this, cg6Var);
        Object obj2 = i1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = i1Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(n1 n1Var, cg6 cg6Var) {
        o1 o1Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof o1) {
            o1Var = (o1) cg6Var;
            int i2 = o1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = o1Var.k;
                nm6 nm6Var = nm6.a;
                i = o1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(n1Var.b, this.b, n1Var.a).b, "/1/device/authorize/commit/");
                    k.F("Ya-Consumer-Authorization", "OAuth " + n1Var.c);
                    k.S("code", n1Var.d);
                    k.S("client_id", n1Var.e);
                    k.S("language", n1Var.f);
                    o1Var.j = k;
                    o1Var.m = 1;
                    if (this.c.b(k, o1Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = o1Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        o1Var = new o1(this, cg6Var);
        Object obj2 = o1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = o1Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(u1 u1Var, cg6 cg6Var) {
        v1 v1Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof v1) {
            v1Var = (v1) cg6Var;
            int i2 = v1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = v1Var.k;
                nm6 nm6Var = nm6.a;
                i = v1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(u1Var.b, this.b, u1Var.a).b, "/1/device/authorize/submit/");
                    k.F("Ya-Consumer-Authorization", "OAuth " + u1Var.c);
                    k.S("code", u1Var.d);
                    k.S("client_id", u1Var.e);
                    k.S("language", u1Var.f);
                    v1Var.j = k;
                    v1Var.m = 1;
                    if (this.c.b(k, v1Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = v1Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        v1Var = new v1(this, cg6Var);
        Object obj2 = v1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = v1Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(b2 b2Var, cg6 cg6Var) {
        c2 c2Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof c2) {
            c2Var = (c2) cg6Var;
            int i2 = c2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = c2Var.k;
                nm6 nm6Var = nm6.a;
                i = c2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(b2Var.b, this.b, b2Var.a).b, "/1/bundle/account/phonish/disable_auth_by_xtoken");
                    k.F("Ya-Consumer-Authorization", "OAuth " + b2Var.c);
                    c2Var.j = k;
                    c2Var.m = 1;
                    if (this.c.b(k, c2Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = c2Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        c2Var = new c2(this, cg6Var);
        Object obj2 = c2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = c2Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(k2 k2Var, cg6 cg6Var) {
        o2 o2Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof o2) {
            o2Var = (o2) cg6Var;
            int i2 = o2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = o2Var.k;
                nm6 nm6Var = nm6.a;
                i = o2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) this.b.a(k2Var.a, null).b, 0);
                    nVar2.J("/1/bundle/experiments/by_device_id/");
                    nVar2.O("device_id", k2Var.b);
                    o2Var.j = nVar2;
                    o2Var.m = 1;
                    if (this.c.b(nVar2, o2Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = o2Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        o2Var = new o2(this, cg6Var);
        Object obj2 = o2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = o2Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(z2 z2Var, cg6 cg6Var) {
        a3 a3Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof a3) {
            a3Var = (a3) cg6Var;
            int i2 = a3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = a3Var.k;
                nm6 nm6Var = nm6.a;
                i = a3Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) this.b.a(z2Var.a, null).b, 0);
                    nVar2.J("/1/badges-specification.json");
                    a3Var.j = nVar2;
                    a3Var.m = 1;
                    if (this.c.b(nVar2, a3Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = a3Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        a3Var = new a3(this, cg6Var);
        Object obj2 = a3Var.k;
        nm6 nm6Var2 = nm6.a;
        i = a3Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(k3 k3Var, cg6 cg6Var) {
        l3 l3Var;
        int i;
        com.yandex.passport.common.network.q qVar;
        if (cg6Var instanceof l3) {
            l3Var = (l3) cg6Var;
            int i2 = l3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = l3Var.k;
                nm6 nm6Var = nm6.a;
                i = l3Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n j = com.appsflyer.internal.k.j(k3Var.b, this.b, k3Var.a);
                    qVar = new com.yandex.passport.common.network.q((String) j.b, new m3(0, j, k3Var));
                    qVar.J("/external-score");
                    l3Var.j = qVar;
                    l3Var.m = 1;
                    if (this.c.b(qVar, l3Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qVar = l3Var.j;
                    qgg.h0(obj);
                }
                return qVar.z();
            }
        }
        l3Var = new l3(this, cg6Var);
        Object obj2 = l3Var.k;
        nm6 nm6Var2 = nm6.a;
        i = l3Var.m;
        if (i != 0) {
        }
        return qVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(u3 u3Var, cg6 cg6Var) {
        v3 v3Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof v3) {
            v3Var = (v3) cg6Var;
            int i2 = v3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = v3Var.k;
                nm6 nm6Var = nm6.a;
                i = v3Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(u3Var.c, this.b, u3Var.b).b, "/1/bundle/family/get_neochild_code/");
                    k.F("Ya-Consumer-Authorization", "OAuth ".concat(u3Var.a.e()));
                    String str = u3Var.d;
                    if (str != null) {
                        k.S("client_id", str);
                    }
                    String str2 = u3Var.e;
                    if (str2 != null) {
                        k.S("client_secret", str2);
                    }
                    k.S("neochild_uid", u3Var.f);
                    v3Var.j = k;
                    v3Var.m = 1;
                    if (this.c.b(k, v3Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = v3Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        v3Var = new v3(this, cg6Var);
        Object obj2 = v3Var.k;
        nm6 nm6Var2 = nm6.a;
        i = v3Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(d4 d4Var, cg6 cg6Var) {
        e4 e4Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof e4) {
            e4Var = (e4) cg6Var;
            int i2 = e4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = e4Var.k;
                nm6 nm6Var = nm6.a;
                i = e4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) com.appsflyer.internal.k.j(d4Var.b, this.b, d4Var.a).b);
                    pVar2.J("/1/token");
                    pVar2.S("grant_type", "x-token");
                    pVar2.S("access_token", d4Var.c.d());
                    pVar2.S("client_id", d4Var.d);
                    pVar2.S("client_secret", d4Var.e);
                    e4Var.j = pVar2;
                    e4Var.m = 1;
                    if (this.c.b(pVar2, e4Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = e4Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        e4Var = new e4(this, cg6Var);
        Object obj2 = e4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = e4Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(j4 j4Var, cg6 cg6Var) {
        k4 k4Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof k4) {
            k4Var = (k4) cg6Var;
            int i2 = k4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = k4Var.k;
                nm6 nm6Var = nm6.a;
                i = k4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, j4Var.a).b, "/1/bundle/auth/oauth/code_for_am/");
                    k.F("Ya-Client-Cookie", j4Var.b);
                    k.F("Ya-Client-Host", j4Var.c);
                    k.S("client_id", j4Var.d);
                    k.S("client_secret", j4Var.e);
                    k4Var.j = k;
                    k4Var.m = 1;
                    if (this.c.b(k, k4Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = k4Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        k4Var = new k4(this, cg6Var);
        Object obj2 = k4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = k4Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(p4 p4Var, cg6 cg6Var) {
        q4 q4Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof q4) {
            q4Var = (q4) cg6Var;
            int i2 = q4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = q4Var.k;
                nm6 nm6Var = nm6.a;
                i = q4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(p4Var.b, this.b, p4Var.a).b, "/1/bundle/auth/oauth/code_for_am/");
                    k.F("Authorization", "OAuth ".concat(p4Var.c.e()));
                    String str = p4Var.d;
                    if (str != null) {
                        k.S("client_id", str);
                    }
                    String str2 = p4Var.e;
                    if (str2 != null) {
                        k.S("client_secret", str2);
                    }
                    q4Var.j = k;
                    q4Var.m = 1;
                    if (this.c.b(k, q4Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = q4Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        q4Var = new q4(this, cg6Var);
        Object obj2 = q4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = q4Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(u5 u5Var, cg6 cg6Var) {
        v5 v5Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof v5) {
            v5Var = (v5) cg6Var;
            int i2 = v5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = v5Var.k;
                nm6 nm6Var = nm6.a;
                i = v5Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) this.b.a(u5Var.a, null).b, 0);
                    nVar2.J("/1/am/config.json");
                    v5Var.j = nVar2;
                    v5Var.m = 1;
                    if (this.c.b(nVar2, v5Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = v5Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        v5Var = new v5(this, cg6Var);
        Object obj2 = v5Var.k;
        nm6 nm6Var2 = nm6.a;
        i = v5Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(j6 j6Var, cg6 cg6Var) {
        k6 k6Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof k6) {
            k6Var = (k6) cg6Var;
            int i2 = k6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = k6Var.k;
                nm6 nm6Var = nm6.a;
                i = k6Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(j6Var.b, this.b, j6Var.a).b, "/1/bundle/auth/token/instantly/");
                    k.F("Ya-Client-Host", j6Var.d);
                    k.F("Ya-Client-Cookie", "");
                    k.F("Ya-Consumer-Authorization", "OAuth " + j6Var.c);
                    k6Var.j = k;
                    k6Var.m = 1;
                    if (this.c.b(k, k6Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = k6Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        k6Var = new k6(this, cg6Var);
        Object obj2 = k6Var.k;
        nm6 nm6Var2 = nm6.a;
        i = k6Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(s6 s6Var, cg6 cg6Var) {
        t6 t6Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof t6) {
            t6Var = (t6) cg6Var;
            int i2 = t6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = t6Var.k;
                nm6 nm6Var = nm6.a;
                i = t6Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, s6Var.a).b, "/1/device/code/");
                    k.S("client_id", s6Var.d);
                    k.S("device_name", s6Var.b);
                    k.S("client_bound", s6Var.c ? "yes" : "no");
                    t6Var.j = k;
                    t6Var.m = 1;
                    if (this.c.b(k, t6Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = t6Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        t6Var = new t6(this, cg6Var);
        Object obj2 = t6Var.k;
        nm6 nm6Var2 = nm6.a;
        i = t6Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(z6 z6Var, cg6 cg6Var) {
        a7 a7Var;
        int i;
        String str;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof a7) {
            a7Var = (a7) cg6Var;
            int i2 = a7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = a7Var.k;
                nm6 nm6Var = nm6.a;
                i = a7Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) com.appsflyer.internal.k.j(z6Var.b, this.b, z6Var.a).b);
                    pVar2.J("/1/token");
                    pVar2.S("grant_type", "urn:ietf:params:oauth:grant-type:master-xtoken");
                    com.yandex.passport.common.account.a aVar = z6Var.e;
                    if (aVar == null || (str = aVar.a) == null) {
                        str = "";
                    }
                    pVar2.S("access_token", str);
                    pVar2.S("target_uid", String.valueOf(z6Var.f));
                    pVar2.S("client_id", z6Var.c);
                    pVar2.S("client_secret", z6Var.d);
                    a7Var.j = pVar2;
                    a7Var.m = 1;
                    if (this.c.b(pVar2, a7Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = a7Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        a7Var = new a7(this, cg6Var);
        Object obj2 = a7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = a7Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(f7 f7Var, cg6 cg6Var) {
        g7 g7Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof g7) {
            g7Var = (g7) cg6Var;
            int i2 = g7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = g7Var.k;
                nm6 nm6Var = nm6.a;
                i = g7Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) com.appsflyer.internal.k.j(f7Var.b, this.b, f7Var.a).b, 0);
                    nVar2.J("/1/bundle/push/2fa/get_code/");
                    nVar2.F("Ya-Consumer-Authorization", "OAuth " + f7Var.c.d());
                    nVar2.O("track_id", f7Var.d);
                    g7Var.j = nVar2;
                    g7Var.m = 1;
                    if (this.c.b(nVar2, g7Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = g7Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        g7Var = new g7(this, cg6Var);
        Object obj2 = g7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = g7Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(o8 o8Var, cg6 cg6Var) {
        p8 p8Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof p8) {
            p8Var = (p8) cg6Var;
            int i2 = p8Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p8Var.m = i2 - Integer.MIN_VALUE;
                Object obj = p8Var.k;
                nm6 nm6Var = nm6.a;
                i = p8Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) com.appsflyer.internal.k.j(o8Var.b, this.b, o8Var.a).b, 0);
                    nVar2.J("/1/track/get");
                    nVar2.F("Ya-Consumer-Authorization", "OAuth ".concat(o8Var.d.e()));
                    nVar2.O("process_tag", o8Var.c);
                    p8Var.j = nVar2;
                    p8Var.m = 1;
                    if (this.c.b(nVar2, p8Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = p8Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        p8Var = new p8(this, cg6Var);
        Object obj2 = p8Var.k;
        nm6 nm6Var2 = nm6.a;
        i = p8Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(i9 i9Var, cg6 cg6Var) {
        j9 j9Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof j9) {
            j9Var = (j9) cg6Var;
            int i2 = j9Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j9Var.m = i2 - Integer.MIN_VALUE;
                Object obj = j9Var.k;
                nm6 nm6Var = nm6.a;
                i = j9Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, i9Var.c).b, "1/bundle/biometrics/ebs/make_jwt");
                    k.F("Authorization", "OAuth ".concat(i9Var.a.e()));
                    k.S("install_id", i9Var.b);
                    j9Var.j = k;
                    j9Var.m = 1;
                    if (this.c.b(k, j9Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = j9Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        j9Var = new j9(this, cg6Var);
        Object obj2 = j9Var.k;
        nm6 nm6Var2 = nm6.a;
        i = j9Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(s9 s9Var, cg6 cg6Var) {
        t9 t9Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof t9) {
            t9Var = (t9) cg6Var;
            int i2 = t9Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t9Var.m = i2 - Integer.MIN_VALUE;
                Object obj = t9Var.k;
                nm6 nm6Var = nm6.a;
                i = t9Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(s9Var.b, this.b, s9Var.a).b, "/1/bundle/push/subscribe/");
                    k.F("Ya-Consumer-Authorization", "OAuth " + s9Var.c.d());
                    k.O("push_platform", s9Var.e);
                    k.S("device_token", s9Var.d);
                    k.S("am_version", "7.54.1");
                    k.S("pushes_enabled_on_device", String.valueOf(s9Var.f));
                    k.S("user_is_logged_in", String.valueOf(s9Var.g));
                    t9Var.j = k;
                    t9Var.m = 1;
                    if (this.c.b(k, t9Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = t9Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        t9Var = new t9(this, cg6Var);
        Object obj2 = t9Var.k;
        nm6 nm6Var2 = nm6.a;
        i = t9Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(v9 v9Var, cg6 cg6Var) {
        w9 w9Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof w9) {
            w9Var = (w9) cg6Var;
            int i2 = w9Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9Var.m = i2 - Integer.MIN_VALUE;
                Object obj = w9Var.k;
                nm6 nm6Var = nm6.a;
                i = w9Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) this.b.a(v9Var.a, v9Var.d).b, "/1/bundle/push/unsubscribe/");
                    k.O("push_platform", v9Var.c);
                    k.S("uid", v9Var.b);
                    w9Var.j = k;
                    w9Var.m = 1;
                    if (this.c.b(k, w9Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = w9Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        w9Var = new w9(this, cg6Var);
        Object obj2 = w9Var.k;
        nm6 nm6Var2 = nm6.a;
        i = w9Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(y9 y9Var, cg6 cg6Var) {
        aa aaVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof aa) {
            aaVar = (aa) cg6Var;
            int i2 = aaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aaVar.k;
                nm6 nm6Var = nm6.a;
                i = aaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, y9Var.a).b, "/1/bundle/mobile/register/phonish/");
                    k.S("track_id", y9Var.b);
                    aaVar.j = k;
                    aaVar.m = 1;
                    if (this.c.b(k, aaVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = aaVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        aaVar = new aa(this, cg6Var);
        Object obj2 = aaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aaVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }
}
