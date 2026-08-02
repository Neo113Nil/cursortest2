package com.yandex.passport.internal.features;

import com.yandex.passport.internal.flags.d;
import com.yandex.passport.internal.flags.g;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.m;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.suh;
import defpackage.yxm;

/* loaded from: classes4.dex */
public final class a {
    public static final /* synthetic */ s9f[] J = {new yxm(a.class, "slothReporting", "getSlothReporting()Z", 0), f1d.c(ern.a, a.class, "bouncerReporting", "getBouncerReporting()Z", 0), new yxm(a.class, "accountUpgradeReporting", "getAccountUpgradeReporting()Z", 0), new yxm(a.class, "challengeReporting", "getChallengeReporting()Z", 0), new yxm(a.class, "experimentsReporting", "getExperimentsReporting()Z", 0), new yxm(a.class, "pushReporting", "getPushReporting()Z", 0), new yxm(a.class, "tokenActionReporting", "getTokenActionReporting()Z", 0), new yxm(a.class, "backendReporting", "getBackendReporting()Z", 0), new yxm(a.class, "autoLoginReporting", "getAutoLoginReporting()Z", 0), new yxm(a.class, "userInfoReporting", "getUserInfoReporting()Z", 0), new yxm(a.class, "bindPhoneNumberReporting", "getBindPhoneNumberReporting()Z", 0), new yxm(a.class, "getAuthorizationUrlReporting", "getGetAuthorizationUrlReporting()Z", 0), new yxm(a.class, "suggestedLanguageReporting", "getSuggestedLanguageReporting()Z", 0), new yxm(a.class, "sendAuthToTrackReporting", "getSendAuthToTrackReporting()Z", 0), new yxm(a.class, "authorizationReporting", "getAuthorizationReporting()Z", 0), new yxm(a.class, "socialReporting", "getSocialReporting()Z", 0), new yxm(a.class, "passportInitReporting", "getPassportInitReporting()Z", 0), new yxm(a.class, "stashReporting", "getStashReporting()Z", 0), new yxm(a.class, "announcementReporting", "getAnnouncementReporting()Z", 0), new yxm(a.class, "linkAuthReporting", "getLinkAuthReporting()Z", 0), new yxm(a.class, "localUidReporting", "getLocalUidReporting()Z", 0), new yxm(a.class, "accountDeleteForeverReporting", "getAccountDeleteForeverReporting()Z", 0), new yxm(a.class, "warmUpWebViewReporting", "getWarmUpWebViewReporting()Z", 0), new yxm(a.class, "xTokenRotationReporting", "getXTokenRotationReporting()Z", 0), new yxm(a.class, "authSdkReporting", "getAuthSdkReporting()Z", 0), new yxm(a.class, "webCardReporting", "getWebCardReporting()Z", 0), new yxm(a.class, "standaloneReporting", "getStandaloneReporting()Z", 0), new yxm(a.class, "exitReasonReporting", "getExitReasonReporting()Z", 0), new yxm(a.class, "phonishReporting", "getPhonishReporting()Z", 0), new yxm(a.class, "webAmReporting", "getWebAmReporting()Z", 0), new yxm(a.class, "encryptReporting", "getEncryptReporting()Z", 0), new yxm(a.class, "managingPlusDevicesReporting", "getManagingPlusDevicesReporting()Z", 0), new yxm(a.class, "tombstoneReporter", "getTombstoneReporter()Z", 0)};
    public final suh A;
    public final suh B;
    public final suh C;
    public final suh D;
    public final suh E;
    public final suh F;
    public final suh G;
    public final suh H;
    public final suh I;
    public final i a;
    public final com.yandex.passport.internal.flags.a b;
    public final boolean c;
    public final suh d;
    public final suh e;
    public final suh f;
    public final suh g;
    public final suh h;
    public final suh i;
    public final suh j;
    public final suh k;
    public final suh l;
    public final suh m;
    public final suh n;
    public final suh o;
    public final suh p;
    public final suh q;
    public final suh r;
    public final suh s;
    public final suh t;
    public final suh u;
    public final suh v;
    public final suh w;
    public final suh x;
    public final suh y;
    public final suh z;

    public a(i iVar) {
        iVar.getClass();
        iVar.getClass();
        this.a = iVar;
        this.b = m.a;
        this.c = true;
        this.d = a(m.b);
        this.e = a(m.c);
        this.f = a(m.d);
        this.g = a(m.e);
        this.h = a(m.f);
        this.i = a(m.g);
        this.j = a(m.h);
        this.k = a(m.i);
        this.l = a(m.k);
        this.m = a(m.j);
        this.n = a(m.l);
        this.o = a(m.m);
        this.p = a(m.o);
        this.q = a(m.p);
        this.r = a(m.q);
        this.s = a(m.n);
        this.t = a(m.r);
        this.u = a(m.s);
        this.v = a(m.t);
        this.w = a(m.v);
        this.x = a(m.w);
        a(m.u);
        this.y = a(m.x);
        this.z = a(m.y);
        this.A = a(m.z);
        this.B = a(m.A);
        this.C = a(m.B);
        this.D = a(m.C);
        this.E = a(m.D);
        this.F = a(m.E);
        this.G = a(m.F);
        this.H = a(m.G);
        this.I = a(m.H);
    }

    public final suh a(g gVar) {
        gVar.getClass();
        return new suh(29, this, gVar);
    }

    public final boolean b() {
        com.yandex.passport.internal.flags.a aVar = this.b;
        boolean z = this.c;
        i iVar = this.a;
        if (z) {
            return ((Boolean) iVar.b(aVar)).booleanValue();
        }
        d dVar = iVar.a;
        dVar.getClass();
        aVar.getClass();
        String str = (String) ((com.yandex.passport.internal.util.storage.a) dVar.a.getValue(dVar, d.b[0])).a.get(aVar.a);
        Boolean bool = (Boolean) (str != null ? aVar.a(str) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
