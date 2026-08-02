package com.yandex.passport.internal.provider.communication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.appsflyer.AdRevenueScheme;
import com.yandex.passport.internal.core.accounts.y;
import com.yandex.passport.internal.push.c0;
import com.yandex.passport.internal.push.d1;
import com.yandex.passport.internal.push.h0;
import com.yandex.passport.internal.push.i0;
import com.yandex.passport.internal.push.l0;
import com.yandex.passport.internal.push.m0;
import com.yandex.passport.internal.push.z;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.nb;
import com.yandex.passport.internal.report.o4;
import com.yandex.passport.internal.report.qa;
import com.yandex.passport.internal.report.ra;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.report.te;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.ye;
import com.yandex.passport.internal.sloth.credentialmanager.RequestCredentialManagerActivity;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.g2;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.z0;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.delete.h1;
import com.yandex.passport.internal.ui.challenge.delete.q1;
import com.yandex.passport.internal.ui.challenge.delete.t0;
import com.yandex.passport.internal.ui.challenge.delete.u0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.n0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.router.x;
import com.yandex.passport.internal.usecase.ui.f0;
import com.yandex.passport.internal.usecase.ui.o0;
import com.yandex.passport.internal.usecase.ui.r0;
import defpackage.aur;
import defpackage.b6e;
import defpackage.ca8;
import defpackage.cce;
import defpackage.f9h;
import defpackage.fxf;
import defpackage.gld;
import defpackage.hlr;
import defpackage.hs4;
import defpackage.mm6;
import defpackage.n7w;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.pjc;
import defpackage.q9;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.r0w;
import defpackage.r1w;
import defpackage.r7o;
import defpackage.rce;
import defpackage.rzm;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tyf;
import defpackage.v75;
import defpackage.wu0;
import defpackage.x0q;
import defpackage.x7j;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.y2x;
import defpackage.z7o;
import defpackage.zt3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = obj;
    }

    private final Object k(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pjc pjcVar = (pjc) this.l;
            com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(5, (GlobalRouterActivity) this.m);
            this.k = 1;
            if (pjcVar.collect(aVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            long a = com.yandex.passport.common.time.a.a(0, 0, 50);
            this.l = mm6Var;
            this.k = 1;
            if (y2x.o(a, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        if (gld.T(mm6Var)) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
            }
            ((GlobalRouterActivity) this.m).recreate();
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        GlobalRouterActivity globalRouterActivity = (GlobalRouterActivity) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            int i2 = GlobalRouterActivity.i;
            com.yandex.passport.internal.ui.router.q qVar = (com.yandex.passport.internal.ui.router.q) globalRouterActivity.a.getValue();
            Intent intent = globalRouterActivity.getIntent();
            boolean z = ((Bundle) this.m) != null;
            this.k = 1;
            if (qVar.a(intent, z, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pjc pjcVar = (pjc) this.l;
            com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(6, (LoginRouterActivity) this.m);
            this.k = 1;
            if (pjcVar.collect(aVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c((Message) this.l, (Messenger) this.m, continuation, 0);
            case 1:
                return new c((com.yandex.passport.internal.push.m) this.l, (Bundle) this.m, continuation, 1);
            case 2:
                return new c((com.yandex.passport.common.network.n) this.l, (rce) this.m, continuation, 2);
            case 3:
                return new c((d1) this.l, (m0) this.m, continuation, 3);
            case 4:
                return new c((te) this.m, continuation, 4);
            case 5:
                return new c((com.yandex.passport.internal.sloth.credentialmanager.d) this.l, (RequestCredentialManagerActivity) this.m, continuation, 5);
            case 6:
                return new c((com.yandex.passport.internal.sso.announcing.c) this.l, (com.yandex.passport.common.core.f) this.m, continuation, 6);
            case 7:
                return new c((AccountUpgraderActivity) this.l, (com.yandex.passport.api.v) this.m, continuation, 7);
            case 8:
                return new c((com.yandex.passport.internal.ui.authbytrack.e) this.l, (com.yandex.passport.internal.entities.t) this.m, continuation, 8);
            case 9:
                c cVar = new c((BouncerActivity) this.m, continuation, 9);
                cVar.l = obj;
                return cVar;
            case 10:
                return new c((z0) this.l, (com.yandex.passport.internal.ui.bouncer.s) this.m, continuation, 10);
            case 11:
                return new c((z0) this.l, (com.yandex.passport.common.mvi.f) this.m, continuation, 11);
            case 12:
                return new c((com.yandex.passport.internal.ui.bouncer.s) this.l, (g2) this.m, continuation, 12);
            case 13:
                return new c((pjc) this.l, continuation, (com.yandex.passport.internal.ui.bouncer.s) this.m, 13);
            case 14:
                return new c((pjc) this.l, continuation, (com.yandex.passport.internal.ui.bouncer.loading.i) this.m, 14);
            case 15:
                return new c((com.yandex.passport.internal.ui.bouncer.roundabout.i) this.l, (r1) this.m, continuation, 15);
            case 16:
                c cVar2 = new c((SetCurrentAccountActivity) this.m, continuation, 16);
                cVar2.l = obj;
                return cVar2;
            case 17:
                c cVar3 = new c((DeleteForeverActivity) this.m, continuation, 17);
                cVar3.l = obj;
                return cVar3;
            case 18:
                return new c((q1) this.l, (u0) this.m, continuation, 18);
            case 19:
                return new c((pjc) this.l, continuation, (LogoutBottomSheetActivity) this.m, 19);
            case 20:
                c cVar4 = new c((LogoutBottomSheetActivity) this.m, continuation, 20);
                cVar4.l = obj;
                return cVar4;
            case 21:
                return new c((q0) this.l, (com.yandex.passport.internal.properties.u) this.m, continuation, 21);
            case 22:
                return new c((com.yandex.passport.internal.ui.domik.common.g) this.l, (com.yandex.passport.internal.ui.domik.e) this.m, continuation, 22);
            case 23:
                return new c((com.yandex.passport.internal.ui.domik.identifier.c) this.l, (com.yandex.passport.internal.sloth.credentialmanager.a) this.m, continuation, 23);
            case 24:
                return new c((pjc) this.l, continuation, (com.yandex.passport.internal.ui.domik.relogin.d) this.m, 24);
            case 25:
                return new c((pjc) this.l, continuation, (GlobalRouterActivity) this.m, 25);
            case 26:
                c cVar5 = new c((GlobalRouterActivity) this.m, continuation, 26);
                cVar5.l = obj;
                return cVar5;
            case 27:
                return new c((GlobalRouterActivity) this.l, (Bundle) this.m, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new c((pjc) this.l, continuation, (LoginRouterActivity) this.m, 28);
            default:
                return new c((x) this.l, (com.yandex.passport.internal.properties.l) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 11:
                ((c) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((c) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x042d, code lost:
    
        if (r0 == r2) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03dd, code lost:
    
        if (r3 == r2) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x08d3, code lost:
    
        if (r6 != r5) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x084f, code lost:
    
        if (r6 == r5) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0a08, code lost:
    
        if (r2 == r0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0200, code lost:
    
        if (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0.a(r0, r3, r37) == r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ef, code lost:
    
        if (r3 == r2) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object b2;
        Message message;
        Object c;
        Object a;
        Object V;
        te teVar;
        Object obj2;
        Object g;
        Object V2;
        Object emit;
        Object L;
        Object c2;
        int i = 3;
        int i2 = 6;
        int i3 = 4;
        final int i4 = 2;
        final int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i6 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                try {
                    if (i7 == 0) {
                        qgg.h0(obj);
                        com.yandex.passport.internal.flags.experiments.p pVar = d.d;
                        if (pVar == null) {
                            return Unit.a;
                        }
                        Object obj3 = ((Message) this.l).obj;
                        Bundle bundle = obj3 instanceof Bundle ? (Bundle) obj3 : null;
                        if (bundle == null) {
                            return Unit.a;
                        }
                        bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                        Parcelable parcelable = bundle.getParcelable("IPCCommand");
                        if (parcelable == null) {
                            throw new IllegalStateException("can't get required parcelable IPCCommand");
                        }
                        m mVar = (m) parcelable;
                        if (!(mVar instanceof k)) {
                            if (!(mVar instanceof l)) {
                                throw new x7j();
                            }
                            j jVar = (j) ((rzm) pVar.d).get();
                            this.k = 2;
                            jVar.getClass();
                            b = t.b(jVar, (l) mVar, this);
                            break;
                        } else {
                            f fVar = (f) ((rzm) pVar.c).get();
                            this.k = 1;
                            fVar.getClass();
                            b2 = t.b(fVar, (k) mVar, this);
                            if (b2 == nm6Var) {
                            }
                            message = (Message) b2;
                        }
                        return nm6Var;
                    }
                    if (i7 == 1) {
                        qgg.h0(obj);
                        b2 = obj;
                        message = (Message) b2;
                    } else {
                        if (i7 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        b = obj;
                        message = (Message) b;
                    }
                    ((Messenger) this.m).send(message);
                } catch (RemoteException e) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "", e);
                    }
                }
                return Unit.a;
            case 1:
                Bundle bundle2 = (Bundle) this.m;
                com.yandex.passport.internal.push.m mVar2 = (com.yandex.passport.internal.push.m) this.l;
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.flags.i iVar = mVar2.k;
                    i0 i0Var = mVar2.m;
                    if (((Boolean) iVar.b(com.yandex.passport.internal.flags.o.n0)).booleanValue()) {
                        i0Var.getClass();
                        bundle2.getClass();
                        String string = bundle2.getString("event_name");
                        if ((string == null ? false : string.equals("2fa_pictures_am")) && !mVar2.a.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            i0Var.getClass();
                            try {
                                String string2 = bundle2.getString("uid");
                                if (string2 == null) {
                                    throw new IllegalStateException("missing key uid");
                                }
                                long parseLong = Long.parseLong(string2);
                                String string3 = bundle2.getString("track_id");
                                if (string3 == null) {
                                    throw new IllegalStateException("missing key track_id");
                                }
                                String string4 = bundle2.getString("push_id");
                                String string5 = bundle2.getString("platform");
                                String string6 = bundle2.getString("event_name");
                                String string7 = bundle2.getString("push_service");
                                if (string7 == null) {
                                    throw new IllegalStateException("missing key push_service");
                                }
                                String string8 = bundle2.getString("title");
                                if (string8 == null) {
                                    throw new IllegalStateException("missing key title");
                                }
                                ArrayList b3 = i0.b(bundle2);
                                String string9 = bundle2.getString("2fa_pictures_expire_at");
                                if (string9 == null) {
                                    throw new IllegalStateException("missing key 2fa_pictures_expire_at");
                                }
                                long parseLong2 = Long.parseLong(string9);
                                String string10 = bundle2.getString("2fa_pictures_ttl");
                                if (string10 == null) {
                                    throw new IllegalStateException("missing key 2fa_pictures_ttl");
                                }
                                long parseLong3 = Long.parseLong(string10);
                                String string11 = bundle2.getString(AdRevenueScheme.COUNTRY);
                                String string12 = bundle2.getString("city");
                                String string13 = bundle2.getString("application");
                                String string14 = bundle2.getString("os");
                                String string15 = bundle2.getString("user_ip");
                                boolean parseBoolean = Boolean.parseBoolean(bundle2.getString("is_silent"));
                                long c3 = i0.c(bundle2);
                                int c4 = (int) (i0.c(bundle2) / 1000);
                                String string16 = bundle2.getString("webview_url");
                                if (string16 == null) {
                                    throw new IllegalStateException("missing key webview_url");
                                }
                                c0 c0Var = new c0(parseLong, string3, string4, string5, string6, string7, string8, b3, parseLong2, parseLong3, string11, string12, string13, string14, string15, parseBoolean, c3, c4, string16);
                                w0 w0Var = mVar2.c;
                                w0Var.getClass();
                                w0Var.m(ra.d, m0.e(c0Var));
                                this.k = 1;
                                c = com.yandex.passport.internal.push.m.c(mVar2, c0Var, this);
                                break;
                            } catch (Throwable th) {
                                w0 w0Var2 = i0Var.a;
                                w0Var2.getClass();
                                w0Var2.n(qa.d, new ff("picture_payload", 17, objArr == true ? 1 : 0), new ff(th));
                                throw th;
                            }
                        }
                    }
                    h0 a2 = mVar2.m.a(bundle2);
                    w0 w0Var3 = mVar2.c;
                    w0Var3.getClass();
                    w0Var3.m(ra.d, m0.f(a2));
                    this.k = 2;
                    a = com.yandex.passport.internal.push.m.a(mVar2, a2, this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a = obj;
                        h0 h0Var = (h0) a;
                        if (h0Var != null) {
                            com.yandex.passport.internal.report.reporters.z0 z0Var = mVar2.d;
                            long j = h0Var.f;
                            String str = h0Var.g;
                            String str2 = h0Var.p;
                            boolean b4 = m0.b(h0Var);
                            z0Var.getClass();
                            z0Var.n(nb.d, new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(str, 11), new ff(str2, 14), new com.yandex.passport.internal.report.f(15, b4));
                            if (m0.b(h0Var)) {
                                l0 l0Var = mVar2.n;
                                l0Var.getClass();
                                bundle2.getClass();
                                Set<String> keySet = bundle2.keySet();
                                keySet.getClass();
                                Set<String> set = keySet;
                                int a3 = tah.a(v75.o(set, 10));
                                if (a3 < 16) {
                                    a3 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(a3);
                                for (Object obj4 : set) {
                                    linkedHashMap.put(obj4, bundle2.getString((String) obj4, null));
                                }
                                f9h G = n7w.G(linkedHashMap);
                                if (!G.isEmpty()) {
                                    com.yandex.passport.internal.util.storage.a b5 = l0Var.b();
                                    b5.e = true;
                                    ConcurrentHashMap concurrentHashMap = b5.a;
                                    concurrentHashMap.clear();
                                    concurrentHashMap.putAll(G);
                                    b5.e = false;
                                    b5.a();
                                }
                            }
                        }
                        return h0Var;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                if (((Boolean) c).booleanValue()) {
                    return null;
                }
                h0 a22 = mVar2.m.a(bundle2);
                w0 w0Var32 = mVar2.c;
                w0Var32.getClass();
                w0Var32.m(ra.d, m0.f(a22));
                this.k = 2;
                a = com.yandex.passport.internal.push.m.a(mVar2, a22, this);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cce C = hs4.C((Context) ((com.yandex.passport.common.network.n) this.l).b);
                rce rceVar = (rce) this.m;
                this.k = 1;
                Object a4 = C.a(rceVar, this);
                return a4 == nm6Var3 ? nm6Var3 : a4;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    z zVar = ((d1) this.l).d;
                    com.yandex.passport.internal.push.x c5 = ((m0) this.m).c();
                    this.k = 1;
                    if (zVar.g(c5, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    te teVar2 = (te) this.m;
                    Context context = teVar2.a;
                    this.l = teVar2;
                    this.k = 1;
                    V = x97.V(ca8.a, new wu0(context, continuation, i6), this);
                    if (V == nm6Var5) {
                        return nm6Var5;
                    }
                    teVar = teVar2;
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    teVar = (te) this.l;
                    qgg.h0(obj);
                    V = obj;
                }
                teVar.c = (Map) V;
                String str3 = (String) ((te) this.m).c.get("device_id");
                if (str3 == null) {
                    str3 = "Unknown";
                }
                ye.a(str3, ((te) this.m).b);
                return Unit.a;
            case 5:
                RequestCredentialManagerActivity requestCredentialManagerActivity = (RequestCredentialManagerActivity) this.m;
                nm6 nm6Var6 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.sloth.credentialmanager.d dVar2 = (com.yandex.passport.internal.sloth.credentialmanager.d) this.l;
                    com.yandex.passport.internal.sloth.credentialmanager.e eVar = com.yandex.passport.internal.sloth.credentialmanager.e.AutoLogin;
                    this.k = 1;
                    Object a5 = dVar2.a(true, eVar, this);
                    if (a5 == nm6Var6) {
                        return nm6Var6;
                    }
                    obj2 = a5;
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(obj2 instanceof t7o)) {
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar = (com.yandex.passport.internal.sloth.credentialmanager.a) obj2;
                    aVar.getClass();
                    Intent intent = new Intent();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("username_key", aVar.b);
                    bundle3.putString("password_key", aVar.c);
                    bundle3.putBoolean("is_from_dialog_key", aVar.a);
                    intent.putExtras(bundle3);
                    requestCredentialManagerActivity.setResult(-1, intent);
                    requestCredentialManagerActivity.finish();
                }
                if (z7o.a(obj2) != null) {
                    requestCredentialManagerActivity.finish();
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    y yVar = ((com.yandex.passport.internal.sso.announcing.c) this.l).b;
                    com.yandex.passport.internal.core.accounts.x xVar = new com.yandex.passport.internal.core.accounts.x(new com.yandex.passport.internal.core.accounts.w((com.yandex.passport.common.core.f) this.m), false, false, x0.c, false);
                    this.k = 1;
                    if (yVar.a(xVar) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    AccountUpgraderActivity accountUpgraderActivity = (AccountUpgraderActivity) this.l;
                    com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) this.m;
                    this.k = 1;
                    if (AccountUpgraderActivity.j(accountUpgraderActivity, vVar, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                com.yandex.passport.internal.ui.authbytrack.e eVar2 = (com.yandex.passport.internal.ui.authbytrack.e) this.l;
                nm6 nm6Var9 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.l lVar = eVar2.q;
                    com.yandex.passport.internal.usecase.authorize.j jVar2 = new com.yandex.passport.internal.usecase.authorize.j((com.yandex.passport.internal.entities.t) this.m);
                    this.k = 1;
                    g = lVar.g(jVar2, this);
                    if (g == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                Object obj5 = ((z7o) g).a;
                if (!(obj5 instanceof t7o)) {
                    eVar2.r.m((com.yandex.passport.internal.l) obj5);
                }
                Throwable a6 = z7o.a(obj5);
                if (a6 != null) {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error authorize by track", a6);
                    }
                    eVar2.k.m(eVar2.s.a(a6));
                }
                return Unit.a;
            case 9:
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var10 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    long X = fxf.X(0, 50);
                    this.l = mm6Var;
                    this.k = 1;
                    if (y2x.o(X, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((BouncerActivity) this.m).recreate();
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                z0 z0Var2 = (z0) this.l;
                com.yandex.passport.internal.ui.bouncer.s sVar = (com.yandex.passport.internal.ui.bouncer.s) this.m;
                this.k = 1;
                z0Var2.getClass();
                sVar.a.collect(new com.yandex.passport.common.mvi.c(i6, new com.yandex.passport.common.mvi.j(i6, (x0q) z0Var2.e), z0Var2), this);
                return nm6Var11;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i18 = this.k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                z0 z0Var3 = (z0) this.l;
                com.yandex.passport.common.mvi.f fVar2 = (com.yandex.passport.common.mvi.f) this.m;
                this.k = 1;
                z0Var3.a(fVar2, this);
                return nm6Var12;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((com.yandex.passport.internal.ui.bouncer.s) this.l).a;
                    g2 g2Var = (g2) this.m;
                    this.k = 1;
                    if (x0qVar.emit(g2Var, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar2 = new com.yandex.passport.common.ui.compose.a(i4, (com.yandex.passport.internal.ui.bouncer.s) this.m);
                    this.k = 1;
                    if (pjcVar.collect(aVar2, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar3 = new com.yandex.passport.common.ui.compose.a(i, (com.yandex.passport.internal.ui.bouncer.loading.i) this.m);
                    this.k = 1;
                    if (pjcVar2.collect(aVar3, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                com.yandex.passport.internal.ui.bouncer.roundabout.i iVar2 = (com.yandex.passport.internal.ui.bouncer.roundabout.i) this.l;
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    r1 r1Var = (r1) this.m;
                    this.k = 1;
                    V2 = x97.V(((com.yandex.passport.common.coroutine.b) iVar2.a).c, new com.yandex.passport.internal.storage.a(iVar2, r1Var, continuation, i2), this);
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V2 = obj;
                }
                List list = (List) V2;
                com.yandex.passport.internal.report.reporters.m mVar3 = iVar2.c;
                mVar3.getClass();
                list.getClass();
                List list2 = list;
                mVar3.n(o4.d, new com.yandex.passport.internal.report.a(list2.size(), 20));
                com.yandex.passport.internal.ui.bouncer.roundabout.m mVar4 = iVar2.b;
                this.k = 2;
                mVar4.getClass();
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                mVar4.d.b(new ArrayList(list2), new q9(12, zt3Var));
                Object q = zt3Var.q();
                if (q != nm6Var16) {
                    q = Unit.a;
                    break;
                }
                break;
            case 16:
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var17 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    long X2 = fxf.X(0, 50);
                    this.l = mm6Var2;
                    this.k = 1;
                    if (y2x.o(X2, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var2)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((SetCurrentAccountActivity) this.m).recreate();
                }
                return Unit.a;
            case 17:
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var18 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    long X3 = fxf.X(0, 50);
                    this.l = mm6Var3;
                    this.k = 1;
                    if (y2x.o(X3, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var3)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((DeleteForeverActivity) this.m).recreate();
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    h1 h1Var = ((q1) this.l).l;
                    if (h1Var == null) {
                        Intrinsics.j(CommonUrlParts.MODEL);
                        throw null;
                    }
                    u0 u0Var = (u0) this.m;
                    this.k = 1;
                    x0q x0qVar2 = h1Var.j;
                    if (u0Var.equals(com.yandex.passport.internal.ui.challenge.delete.s.b)) {
                        emit = x0qVar2.emit(new com.yandex.passport.internal.ui.challenge.delete.z0(com.yandex.passport.api.h0.a), this);
                        if (emit != nm6Var19) {
                            emit = Unit.a;
                        }
                    } else if (u0Var.equals(com.yandex.passport.internal.ui.challenge.delete.s.c)) {
                        emit = x0qVar2.emit(new com.yandex.passport.internal.ui.challenge.delete.z0(com.yandex.passport.api.h0.b), this);
                        if (emit != nm6Var19) {
                            emit = Unit.a;
                        }
                    } else if (u0Var.equals(com.yandex.passport.internal.ui.challenge.delete.s.d)) {
                        emit = h1Var.j0(this);
                        if (emit != nm6Var19) {
                            emit = Unit.a;
                        }
                    } else if (u0Var.equals(com.yandex.passport.internal.ui.challenge.delete.s.e)) {
                        emit = h1Var.h0(this);
                        if (emit != nm6Var19) {
                            emit = Unit.a;
                        }
                    } else {
                        if (!(u0Var instanceof t0)) {
                            b6e.s();
                            return null;
                        }
                        emit = x0qVar2.emit(new com.yandex.passport.internal.ui.challenge.delete.z0(new com.yandex.passport.api.i0(((t0) u0Var).a)), this);
                        if (emit != nm6Var19) {
                            emit = Unit.a;
                        }
                    }
                    if (emit == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar3 = (pjc) this.l;
                    com.yandex.passport.internal.ui.challenge.logout.bottomsheet.i iVar3 = new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.i((LogoutBottomSheetActivity) this.m, objArr2 == true ? 1 : 0);
                    this.k = 1;
                    if (pjcVar3.collect(iVar3, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                mm6 mm6Var4 = (mm6) this.l;
                nm6 nm6Var21 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    long a7 = com.yandex.passport.common.time.a.a(0, 0, 50);
                    this.l = mm6Var4;
                    this.k = 1;
                    if (y2x.o(a7, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var4)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((LogoutBottomSheetActivity) this.m).recreate();
                }
                return Unit.a;
            case 21:
                q0 q0Var = (q0) this.l;
                nm6 nm6Var22 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    r1w r1wVar = new r1w(q0Var, continuation, 24);
                    this.k = 1;
                    L = tyf.L(20L, r1wVar, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    L = obj;
                }
                if (((n0) L) == null) {
                    com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) this.m;
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 22:
                final com.yandex.passport.internal.ui.domik.common.g gVar = (com.yandex.passport.internal.ui.domik.common.g) this.l;
                nm6 nm6Var23 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    r0 r0Var = gVar.r;
                    o0 o0Var = new o0((com.yandex.passport.internal.ui.domik.e) this.m, gVar instanceof com.yandex.passport.internal.ui.domik.smsauth.b, new r0w(i2, gVar), new Function1() { // from class: com.yandex.passport.internal.ui.domik.common.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    gVar.L((com.yandex.passport.internal.ui.domik.e) obj6);
                                    break;
                                case 1:
                                    gVar.a((com.yandex.passport.internal.ui.f) obj6);
                                    break;
                                default:
                                    gVar.G(((Boolean) obj6).booleanValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    }, new Function1() { // from class: com.yandex.passport.internal.ui.domik.common.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    gVar.L((com.yandex.passport.internal.ui.domik.e) obj6);
                                    break;
                                case 1:
                                    gVar.a((com.yandex.passport.internal.ui.f) obj6);
                                    break;
                                default:
                                    gVar.G(((Boolean) obj6).booleanValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    }, new Function1() { // from class: com.yandex.passport.internal.ui.domik.common.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i4) {
                                case 0:
                                    gVar.L((com.yandex.passport.internal.ui.domik.e) obj6);
                                    break;
                                case 1:
                                    gVar.a((com.yandex.passport.internal.ui.f) obj6);
                                    break;
                                default:
                                    gVar.G(((Boolean) obj6).booleanValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                    this.k = 1;
                    if (r0Var.g(o0Var, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                com.yandex.passport.internal.ui.domik.identifier.c cVar = (com.yandex.passport.internal.ui.domik.identifier.c) this.l;
                nm6 nm6Var24 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.sloth.credentialmanager.d dVar4 = cVar.t;
                    if (dVar4 == null) {
                        Intrinsics.j("credentialManager");
                        throw null;
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar4 = (com.yandex.passport.internal.sloth.credentialmanager.a) this.m;
                    com.yandex.passport.internal.sloth.credentialmanager.e eVar3 = com.yandex.passport.internal.sloth.credentialmanager.e.Native;
                    this.k = 1;
                    c2 = dVar4.c(aVar4, eVar3, this);
                    if (c2 == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                boolean booleanValue = ((Boolean) c2).booleanValue();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, booleanValue ? "Credentials have been saved to Smart Lock" : "Failed to save credentials to Smart Lock", 8);
                }
                com.yandex.passport.internal.ui.domik.g gVar2 = cVar.v;
                if (gVar2 == null) {
                    com.yandex.passport.internal.analytics.o0 o0Var2 = cVar.r;
                    String d = hlr.d("\n        isAdded = " + cVar.isAdded() + ",\n        isDetached = " + cVar.isDetached() + ",\n        isHidden = " + cVar.isHidden() + ",\n        isInLayout = " + cVar.isInLayout() + ",\n        isRemoving = " + cVar.isRemoving() + ",\n        isResumed = " + cVar.isResumed() + ",\n        isStateSaved = " + cVar.isStateSaved() + ",\n        isVisible = " + cVar.isVisible() + ",\n    ");
                    o0Var2.getClass();
                    xy0 xy0Var = new xy0(0);
                    xy0Var.put(Constants.KEY_MESSAGE, d);
                    xy0Var.put("success", String.valueOf(booleanValue));
                    o0Var2.a.b(com.yandex.passport.internal.analytics.l.d, xy0Var);
                } else {
                    cVar.p.u.m(gVar2);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar4 = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar5 = new com.yandex.passport.common.ui.compose.a(i3, (com.yandex.passport.internal.ui.domik.relogin.d) this.m);
                    this.k = 1;
                    if (pjcVar4.collect(aVar5, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                return k(obj);
            case 26:
                return l(obj);
            case 27:
                return n(obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj);
            default:
                nm6 nm6Var26 = nm6.a;
                int i32 = this.k;
                if (i32 != 0) {
                    if (i32 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.usecase.ui.h0 h0Var2 = ((x) this.l).l;
                f0 f0Var = new f0(((com.yandex.passport.internal.properties.l) this.m).d);
                this.k = 1;
                Object g2 = h0Var2.g(f0Var, this);
                return g2 == nm6Var26 ? nm6Var26 : g2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
