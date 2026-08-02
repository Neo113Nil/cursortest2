package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.passport.R;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.network.k8;
import com.yandex.passport.data.network.l7;
import com.yandex.passport.data.network.m8;
import com.yandex.passport.data.network.o4;
import com.yandex.passport.data.network.q7;
import com.yandex.passport.data.network.r7;
import com.yandex.passport.data.network.xa;
import com.yandex.passport.internal.methods.a4;
import com.yandex.passport.internal.methods.e4;
import com.yandex.passport.internal.methods.e5;
import com.yandex.passport.internal.methods.f4;
import com.yandex.passport.internal.methods.f5;
import com.yandex.passport.internal.methods.g4;
import com.yandex.passport.internal.methods.h5;
import com.yandex.passport.internal.methods.i4;
import com.yandex.passport.internal.methods.j3;
import com.yandex.passport.internal.methods.j4;
import com.yandex.passport.internal.methods.k6;
import com.yandex.passport.internal.methods.l5;
import com.yandex.passport.internal.methods.o5;
import com.yandex.passport.internal.methods.p3;
import com.yandex.passport.internal.methods.r5;
import com.yandex.passport.internal.methods.t5;
import com.yandex.passport.internal.methods.v3;
import com.yandex.passport.internal.methods.w3;
import com.yandex.passport.internal.methods.w4;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.g8;
import com.yandex.passport.internal.usecase.m2;
import com.yandex.passport.internal.usecase.o2;
import com.yandex.passport.internal.usecase.r2;
import com.yandex.passport.internal.usecase.v2;
import defpackage.aur;
import defpackage.avf;
import defpackage.ern;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wis;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.z11;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|2|(1:(1:(4:6|7|8|9)(2:11|12))(1:13))(1:47)|14|15|(2:27|(4:29|(1:31)(1:37)|32|(1:34)(2:35|36))(2:38|(2:40|41)(2:42|43)))(1:17)|18|(2:20|(1:22)(2:25|26))|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r9 == r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        r2 = defpackage.z7o.b;
        r9 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0034, code lost:
    
        if (r9 == r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) this.m;
        u0 u0Var = (u0) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            obj = new t7o(th);
        }
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.internal.usecase.k0 k0Var = u0Var.a;
            this.k = 1;
            obj = k0Var.g(fVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                obj = ((z7o) obj).a;
                qgg.h0(obj);
                return new z7o(obj);
            }
            qgg.h0(obj);
        }
        r7o r7oVar2 = z7o.b;
        if (!(obj instanceof com.yandex.passport.internal.usecase.i0)) {
            if (!(obj instanceof z7o)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                Field declaredField = obj.getClass().getDeclaredField(Constants.KEY_EXCEPTION);
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(obj);
                obj3.getClass();
                throw ((Throwable) obj3);
            }
            Object obj4 = ((z7o) obj).a;
            qgg.h0(obj4);
            if (obj4 instanceof com.yandex.passport.internal.usecase.i0) {
                obj2 = obj4;
            }
            com.yandex.passport.internal.usecase.i0 i0Var = (com.yandex.passport.internal.usecase.i0) obj2;
            if (i0Var == null) {
                throw new ClassCastException("Can't cast " + ((Object) z7o.b(((z7o) obj).a)) + " to " + ern.a(com.yandex.passport.internal.usecase.i0.class));
            }
            obj = i0Var;
        }
        if (!(obj instanceof t7o)) {
            if (!(((com.yandex.passport.internal.usecase.i0) obj) instanceof com.yandex.passport.internal.usecase.h0)) {
                throw new com.yandex.passport.api.exception.f();
            }
            com.yandex.passport.internal.usecase.m1 m1Var = u0Var.b;
            this.k = 2;
            obj = m1Var.g(fVar, this);
        }
        return new z7o(obj);
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) ((w4) this.l).c.c);
            com.yandex.passport.internal.upgrader.e eVar = ((a1) this.m).a;
            this.k = 1;
            if (eVar.g(L, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return new z7o(avf.u(Unit.a));
    }

    private final Object n(Object obj) {
        g1 g1Var = (g1) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) ((f5) this.l).c.c);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "RemoveAccountExplicitlyPerformer started", 8);
                }
                com.yandex.passport.internal.l e = g1Var.b.b(false).e(L);
                if (e == null) {
                    throw new com.yandex.passport.api.exception.b(L);
                }
                com.yandex.passport.internal.core.accounts.y yVar = g1Var.a;
                com.yandex.passport.internal.core.accounts.x xVar = new com.yandex.passport.internal.core.accounts.x(new com.yandex.passport.internal.core.accounts.v(e), true, true, com.yandex.passport.internal.report.reporters.x0.b, true);
                this.k = 1;
                if (yVar.a(xVar) == nm6Var) {
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
        } catch (com.yandex.passport.api.exception.b e2) {
            throw e2;
        } catch (InterruptedException unused) {
            throw new com.yandex.passport.api.exception.t("timeout while waiting for account removal");
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new com.yandex.passport.api.exception.t(e4);
        }
    }

    private final Object o(Object obj) {
        boolean z;
        h1 h1Var = (h1) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) ((e5) this.l).c.c);
                Context context = h1Var.a;
                String packageName = context.getPackageName();
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        z = false;
                        break;
                    }
                    String str = h1.e[i2];
                    packageName.getClass();
                    if (kotlin.text.c.v(packageName, str, false)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    z = context.getResources().getBoolean(R.bool.passport_accounts_remove_allowed);
                }
                com.yandex.passport.internal.analytics.o0 o0Var = h1Var.b;
                o0Var.getClass();
                xy0 xy0Var = new xy0(0);
                xy0Var.put("allowed", String.valueOf(z));
                o0Var.a.b(com.yandex.passport.internal.analytics.p.g, xy0Var);
                if (!z) {
                    throw new com.yandex.passport.api.exception.t("Unauthorized attempt to remove account.");
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "RemoveAccountPerformer started", 8);
                }
                com.yandex.passport.internal.l e = h1Var.d.b(false).e(L);
                if (e == null) {
                    throw new com.yandex.passport.api.exception.b(L);
                }
                com.yandex.passport.internal.core.accounts.y yVar = h1Var.c;
                com.yandex.passport.internal.core.accounts.x xVar = new com.yandex.passport.internal.core.accounts.x(new com.yandex.passport.internal.core.accounts.v(e), true, true, com.yandex.passport.internal.report.reporters.x0.a, false);
                this.k = 1;
                if (yVar.a(xVar) == nm6Var) {
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
        } catch (com.yandex.passport.api.exception.b e2) {
            throw e2;
        } catch (InterruptedException unused) {
            throw new com.yandex.passport.api.exception.t("timeout while waiting for account removal");
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new com.yandex.passport.api.exception.t(e4);
        }
    }

    private final Object p(Object obj) {
        Object b;
        i1 i1Var = (i1) this.m;
        h5 h5Var = (h5) this.l;
        k6 k6Var = h5Var.d;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) h5Var.c.c);
            com.yandex.passport.internal.helper.f fVar = i1Var.a;
            String str = (String) k6Var.c;
            String str2 = (String) h5Var.e.c;
            String str3 = (String) h5Var.f.c;
            this.k = 1;
            b = fVar.b(L, str, str2, str3, this);
            if (b == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            b = ((z7o) obj).a;
        }
        Throwable a = z7o.a(b);
        if (a != null) {
            try {
                if ((a instanceof com.yandex.passport.data.exceptions.a) && ((com.yandex.passport.data.exceptions.a) a).a == BackendError.NUMBER_FOR_PICTURE_CHALLENGE_NEEDED) {
                    throw new com.yandex.passport.api.exception.f(com.yandex.passport.api.exception.g.b);
                }
                throw com.yandex.passport.data.network.token.i.j(i1Var.b, a, (String) k6Var.c, new com.yandex.passport.api.exception.p(a), null, null, null, 56);
            } catch (Throwable th) {
                r7o r7oVar = z7o.b;
                b = new t7o(th);
            }
        }
        return new z7o(b);
    }

    private final Object q(Object obj) {
        Set<String> set;
        l1 l1Var = (l1) this.l;
        k6 k6Var = ((l5) this.m).c;
        Object obj2 = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            String packageName = l1Var.a.getPackageName();
            com.yandex.passport.internal.config.n nVar = l1Var.c;
            com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
            nVar.getClass();
            SharedPreferences a = nVar.a.a(bVar);
            if (a == null || (set = a.getStringSet("vpnManualMode", q5b.a)) == null) {
                set = q5b.a;
            }
            if (!set.contains(packageName) && ((Boolean) k6Var.c).booleanValue()) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, "SetVpnChallengeActivityDisabledPerformer", "Not allowed action", 8);
                }
                throw new com.yandex.passport.api.exception.c();
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, "SetVpnChallengeActivityDisabledPerformer", "Set vpn blocker disabled, disabled = " + ((Boolean) k6Var.c).booleanValue(), 8);
            }
            com.yandex.passport.internal.usecase.vpn.e eVar = l1Var.b;
            boolean booleanValue = ((Boolean) k6Var.c).booleanValue();
            this.k = 1;
            Object V = x97.V(((com.yandex.passport.common.coroutine.b) eVar.a).c, new z11(eVar, booleanValue, (Continuation) null, 23), this);
            if (V != obj2) {
                V = Unit.a;
            }
            if (V == obj2) {
                return obj2;
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

    private final Object s(Object obj) {
        o5 o5Var = (o5) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) o5Var.c.c);
        o2 o2Var = ((n1) this.m).a;
        m2 m2Var = new m2(L, (String) o5Var.d.c, (String) o5Var.e.c, "try_add_plus_device");
        this.k = 1;
        Object g = o2Var.g(m2Var, this);
        return g == nm6Var ? nm6Var : g;
    }

    private final Object t(Object obj) {
        q1 q1Var = (q1) this.m;
        r5 r5Var = (r5) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) r5Var.c.c);
            v2 v2Var = q1Var.a;
            com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
            Uri uri = (Uri) r5Var.d.c;
            aVar.getClass();
            r2 r2Var = new r2(L, com.yandex.passport.common.url.a.a(uri));
            this.k = 1;
            obj = v2Var.g(r2Var, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        Object obj2 = ((z7o) obj).a;
        if (!(obj2 instanceof t7o)) {
            r7o r7oVar = z7o.b;
            ((com.yandex.passport.common.url.b) obj2).getClass();
            obj2 = Unit.a;
        }
        Throwable a = z7o.a(obj2);
        if (a != null) {
            try {
                throw com.yandex.passport.data.network.token.i.j(q1Var.b, a, null, null, null, null, new com.yandex.passport.api.exception.k(String.valueOf(a.getMessage())), 30);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                obj2 = new t7o(th);
            }
        }
        return new z7o(obj2);
    }

    private final Object u(Object obj) {
        k6 k6Var = ((t5) this.m).c;
        r1 r1Var = (r1) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.internal.properties.y yVar = r1Var.a;
            com.yandex.passport.internal.properties.i0 i0Var = (com.yandex.passport.internal.properties.i0) k6Var.c;
            xdr xdrVar = yVar.e;
            i0Var.getClass();
            com.yandex.passport.internal.network.p pVar = i0Var.a;
            if (pVar != null) {
                xdr xdrVar2 = yVar.a;
                xdrVar2.getClass();
                xdrVar2.m(null, pVar);
            }
            Map map = i0Var.b;
            if (map != null) {
                xdr xdrVar3 = yVar.c;
                xdrVar3.getClass();
                xdrVar3.m(null, map);
            }
            List list = i0Var.c;
            if (list == null) {
                list = ((com.yandex.passport.internal.properties.l0) xdrVar.getValue()).a;
            }
            List list2 = i0Var.d;
            if (list2 == null) {
                list2 = ((com.yandex.passport.internal.properties.l0) xdrVar.getValue()).b;
            }
            Map map2 = i0Var.e;
            if (map2 == null) {
                map2 = ((com.yandex.passport.internal.properties.l0) xdrVar.getValue()).c;
            }
            com.yandex.passport.internal.properties.l0 l0Var = new com.yandex.passport.internal.properties.l0(list, list2, map2);
            xdrVar.getClass();
            xdrVar.m(null, l0Var);
            com.yandex.passport.internal.usecase.k1 k1Var = r1Var.b;
            com.yandex.passport.internal.properties.i0 i0Var2 = (com.yandex.passport.internal.properties.i0) k6Var.c;
            this.k = 1;
            if (k1Var.g(i0Var2, this) == nm6Var) {
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

    private final Object v(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.passport.common.domain.a aVar = (com.yandex.passport.common.domain.a) this.l;
            this.k = 1;
            obj = aVar.g(this.m, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        Object obj2 = ((z7o) obj).a;
        qgg.h0(obj2);
        return obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b((com.yandex.passport.internal.methods.z) this.l, (c) this.m, continuation, 0);
            case 1:
                return new b((com.yandex.passport.internal.methods.a0) this.l, (d) this.m, continuation, 1);
            case 2:
                return new b((com.yandex.passport.internal.methods.b0) this.l, (e) this.m, continuation, 2);
            case 3:
                return new b((f) this.l, (com.yandex.passport.internal.methods.c0) this.m, continuation, 3);
            case 4:
                return new b((g) this.l, (com.yandex.passport.internal.methods.d0) this.m, continuation, 4);
            case 5:
                return new b((com.yandex.passport.internal.methods.e0) this.l, (h) this.m, continuation, 5);
            case 6:
                return new b((i) this.l, (com.yandex.passport.internal.methods.g0) this.m, continuation, 6);
            case 7:
                return new b((k) this.l, (com.yandex.passport.internal.methods.h0) this.m, continuation, 7);
            case 8:
                return new b((j3) this.l, (o) this.m, continuation, 8);
            case 9:
                return new b((s) this.l, (p3) this.m, continuation, 9);
            case 10:
                return new b((v3) this.l, (y) this.m, continuation, 10);
            case 11:
                return new b((z) this.l, (w3) this.m, continuation, 11);
            case 12:
                return new b((c0) this.l, (a4) this.m, continuation, 12);
            case 13:
                return new b((e4) this.l, (g0) this.m, continuation, 13);
            case 14:
                return new b((f4) this.l, (h0) this.m, continuation, 14);
            case 15:
                return new b((i0) this.l, (g4) this.m, continuation, 15);
            case 16:
                return new b((i4) this.l, (k0) this.m, continuation, 16);
            case 17:
                return new b((j4) this.l, (l0) this.m, continuation, 17);
            case 18:
                return new b((t0) this.l, (com.yandex.passport.common.core.f) this.m, continuation, 18);
            case 19:
                return new b((u0) this.l, (com.yandex.passport.common.core.f) this.m, continuation, 19);
            case 20:
                return new b((w4) this.l, (a1) this.m, continuation, 20);
            case 21:
                return new b((f5) this.l, (g1) this.m, continuation, 21);
            case 22:
                return new b((e5) this.l, (h1) this.m, continuation, 22);
            case 23:
                return new b((h5) this.l, (i1) this.m, continuation, 23);
            case 24:
                return new b((l1) this.l, (l5) this.m, continuation, 24);
            case 25:
                return new b((o5) this.l, (n1) this.m, continuation, 25);
            case 26:
                return new b((r5) this.l, (q1) this.m, continuation, 26);
            case 27:
                return new b((r1) this.l, (t5) this.m, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new b((com.yandex.passport.common.domain.a) this.l, this.m, continuation, 28);
            default:
                return new b((com.yandex.passport.data.network.core.b) this.l, (xa) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0441, code lost:
    
        if (r0 == r4) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x044e, code lost:
    
        if (r0.c(r17) == r4) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0758 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object g;
        t7o t7oVar;
        Object obj3;
        Throwable a;
        Object g2;
        Object g3;
        Object g4;
        Object g5;
        com.yandex.passport.api.exception.j hVar;
        Object g6;
        Object obj4;
        Object d;
        Object c;
        Object obj5;
        Object obj6;
        Object g7;
        Object g8;
        Object g9;
        Object obj7;
        Object c2;
        Object g10;
        int i = this.j;
        String str = "";
        Object obj8 = this.m;
        Object obj9 = this.l;
        String str2 = null;
        switch (i) {
            case 0:
                c cVar = (c) obj8;
                com.yandex.passport.internal.methods.z zVar = (com.yandex.passport.internal.methods.z) obj9;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) zVar.c.c);
                    String str3 = (String) zVar.d.c;
                    String str4 = (String) zVar.e.c;
                    this.k = 1;
                    Object a2 = c.a(cVar, L, str3, str4, this);
                    if (a2 == nm6Var) {
                        return nm6Var;
                    }
                    obj2 = a2;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = ((z7o) obj).a;
                }
                Throwable a3 = z7o.a(obj2);
                if (a3 != null) {
                    try {
                        com.yandex.passport.data.network.token.i iVar = cVar.f;
                        String message = a3.getMessage();
                        if (message != null) {
                            str = message;
                        }
                        throw com.yandex.passport.data.network.token.i.j(iVar, a3, null, new com.yandex.passport.api.exception.k(str), null, null, null, 58);
                    } catch (Throwable th) {
                        r7o r7oVar = z7o.b;
                        obj2 = new t7o(th);
                    }
                }
                return new z7o(obj2);
            case 1:
                d dVar = (d) obj8;
                com.yandex.passport.internal.methods.a0 a0Var = (com.yandex.passport.internal.methods.a0) obj9;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.b L2 = com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) a0Var.c.c);
                    String str5 = (String) a0Var.d.c;
                    if (str5 != null && str5.length() > 0 && !str5.equals("-")) {
                        str2 = str5;
                    }
                    com.yandex.passport.common.account.a aVar = new com.yandex.passport.common.account.a(str2);
                    List list = (List) a0Var.e.c;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((com.yandex.passport.internal.entities.b) it.next()).a));
                    }
                    com.yandex.passport.internal.usecase.b bVar = dVar.a;
                    com.yandex.passport.internal.usecase.a aVar2 = new com.yandex.passport.internal.usecase.a(L2, aVar, arrayList);
                    this.k = 1;
                    g = bVar.g(aVar2, this);
                    if (g == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                Object obj10 = ((z7o) g).a;
                if (!(obj10 instanceof t7o)) {
                    r7o r7oVar2 = z7o.b;
                    obj10 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj10);
                }
                Throwable a4 = z7o.a(obj10);
                if (a4 != null) {
                    try {
                        com.yandex.passport.data.network.token.i iVar2 = dVar.b;
                        String localizedMessage = a4.getLocalizedMessage();
                        localizedMessage.getClass();
                        throw com.yandex.passport.data.network.token.i.j(iVar2, a4, null, null, null, null, new com.yandex.passport.api.exception.k(localizedMessage), 30);
                    } catch (Throwable th2) {
                        r7o r7oVar3 = z7o.b;
                        obj10 = new t7o(th2);
                    }
                }
                return new z7o(obj10);
            case 2:
                e eVar = (e) obj8;
                com.yandex.passport.internal.methods.b0 b0Var = (com.yandex.passport.internal.methods.b0) obj9;
                k6 k6Var = b0Var.d;
                k6 k6Var2 = b0Var.e;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                try {
                    if (i4 == 0) {
                        qgg.h0(obj);
                        com.yandex.passport.common.core.b L3 = com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) b0Var.c.c);
                        r7o r7oVar4 = z7o.b;
                        if (!Intrinsics.d((m8) k6Var2.c, k8.a)) {
                            String obj11 = ((m8) k6Var2.c).toString();
                            obj11.getClass();
                            throw new com.yandex.passport.api.exception.k(obj11);
                        }
                        com.yandex.passport.internal.usecase.authorize.r rVar = eVar.a;
                        com.yandex.passport.internal.usecase.authorize.p pVar = new com.yandex.passport.internal.usecase.authorize.p(L3, (String) k6Var.c);
                        this.k = 1;
                        g2 = rVar.g(pVar, this);
                        if (g2 == nm6Var3) {
                            return nm6Var3;
                        }
                    } else {
                        if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        g2 = obj;
                    }
                    Object obj12 = ((z7o) g2).a;
                    if (!(obj12 instanceof t7o)) {
                        try {
                            r7o r7oVar5 = z7o.b;
                            obj12 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj12);
                        } catch (Throwable th3) {
                            r7o r7oVar6 = z7o.b;
                            obj12 = new t7o(th3);
                        }
                    }
                    qgg.h0(obj12);
                    obj3 = (com.yandex.passport.internal.account.f) obj12;
                } catch (wis e) {
                    r7o r7oVar7 = z7o.b;
                    t7oVar = new t7o(e);
                    obj3 = t7oVar;
                    a = z7o.a(obj3);
                    if (a != null) {
                    }
                    return new z7o(obj3);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th4) {
                    r7o r7oVar8 = z7o.b;
                    t7oVar = new t7o(th4);
                    obj3 = t7oVar;
                    a = z7o.a(obj3);
                    if (a != null) {
                    }
                    return new z7o(obj3);
                }
                a = z7o.a(obj3);
                if (a != null) {
                    try {
                        com.yandex.passport.internal.report.reporters.e0 e0Var = eVar.c;
                        String str6 = (String) k6Var.c;
                        e0Var.getClass();
                        str6.getClass();
                        e0Var.n(g8.d, new ff(a), new ff(str6, 14));
                        com.yandex.passport.data.network.token.i iVar3 = eVar.b;
                        String message2 = a.getMessage();
                        if (message2 != null) {
                            str = message2;
                        }
                        throw com.yandex.passport.data.network.token.i.j(iVar3, a, null, new com.yandex.passport.api.exception.k(str), null, new com.yandex.passport.api.exception.p(a), null, 42);
                    } catch (Throwable th5) {
                        r7o r7oVar9 = z7o.b;
                        obj3 = new t7o(th5);
                    }
                }
                return new z7o(obj3);
            case 3:
                f fVar = (f) obj9;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.f fVar2 = fVar.a;
                    com.yandex.passport.internal.methods.c0 c0Var = (com.yandex.passport.internal.methods.c0) obj8;
                    com.yandex.passport.internal.usecase.authorize.d dVar2 = new com.yandex.passport.internal.usecase.authorize.d((com.yandex.passport.internal.entities.f) c0Var.c.c, null, (com.yandex.passport.internal.credentials.e) c0Var.d.c, com.yandex.passport.internal.analytics.a.m);
                    this.k = 1;
                    g3 = fVar2.g(dVar2, this);
                    if (g3 == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g3 = obj;
                }
                Object obj13 = ((z7o) g3).a;
                if (!(obj13 instanceof t7o)) {
                    r7o r7oVar10 = z7o.b;
                    obj13 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj13);
                }
                Throwable a5 = z7o.a(obj13);
                if (a5 != null) {
                    try {
                        throw com.yandex.passport.data.network.token.i.j(fVar.b, a5, null, null, new com.yandex.passport.api.exception.i("The specified code is invalid."), new com.yandex.passport.api.exception.p(a5), null, 38);
                    } catch (Throwable th6) {
                        r7o r7oVar11 = z7o.b;
                        obj13 = new t7o(th6);
                    }
                }
                return new z7o(obj13);
            case 4:
                g gVar = (g) obj9;
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.c cVar2 = gVar.a;
                    com.yandex.passport.internal.usecase.authorize.a aVar3 = new com.yandex.passport.internal.usecase.authorize.a((com.yandex.passport.internal.entities.h) ((com.yandex.passport.internal.methods.d0) obj8).c.c, com.yandex.passport.internal.analytics.a.h, null, 0L);
                    this.k = 1;
                    g4 = cVar2.g(aVar3, this);
                    if (g4 == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g4 = obj;
                }
                Object obj14 = ((z7o) g4).a;
                if (!(obj14 instanceof t7o)) {
                    r7o r7oVar12 = z7o.b;
                    obj14 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj14);
                }
                Throwable a6 = z7o.a(obj14);
                if (a6 != null) {
                    try {
                        throw com.yandex.passport.data.network.token.i.j(gVar.b, a6, null, null, new com.yandex.passport.api.exception.k("The specified cookie is invalid."), new com.yandex.passport.api.exception.p(a6), null, 38);
                    } catch (Throwable th7) {
                        r7o r7oVar13 = z7o.b;
                        obj14 = new t7o(th7);
                    }
                }
                return new z7o(obj14);
            case 5:
                h hVar2 = (h) obj8;
                com.yandex.passport.internal.methods.e0 e0Var2 = (com.yandex.passport.internal.methods.e0) obj9;
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.b L4 = com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) e0Var2.c.c);
                    com.yandex.passport.internal.usecase.authorize.i iVar4 = hVar2.a;
                    com.yandex.passport.internal.usecase.authorize.g gVar2 = new com.yandex.passport.internal.usecase.authorize.g(L4, (String) e0Var2.d.c);
                    this.k = 1;
                    g5 = iVar4.g(gVar2, this);
                    if (g5 == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g5 = obj;
                }
                Object obj15 = ((z7o) g5).a;
                if (!(obj15 instanceof t7o)) {
                    r7o r7oVar14 = z7o.b;
                    obj15 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj15);
                }
                Throwable a7 = z7o.a(obj15);
                if (a7 != null) {
                    try {
                        if ("authorization_pending".equals(a7.getMessage())) {
                            hVar = new com.yandex.passport.api.exception.h("authorization_pending");
                        } else {
                            String message3 = a7.getMessage();
                            if (message3 != null) {
                                str = message3;
                            }
                            hVar = new com.yandex.passport.api.exception.k(str);
                        }
                        throw com.yandex.passport.data.network.token.i.j(hVar2.b, a7, null, null, new com.yandex.passport.api.exception.k("invalid_token"), new com.yandex.passport.api.exception.p(a7), hVar, 6);
                    } catch (Throwable th8) {
                        r7o r7oVar15 = z7o.b;
                        obj15 = new t7o(th8);
                    }
                }
                return new z7o(obj15);
            case 6:
                i iVar5 = (i) obj9;
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.l lVar = iVar5.a;
                    com.yandex.passport.internal.usecase.authorize.j jVar = new com.yandex.passport.internal.usecase.authorize.j((com.yandex.passport.internal.entities.t) ((com.yandex.passport.internal.methods.g0) obj8).c.c);
                    this.k = 1;
                    g6 = lVar.g(jVar, this);
                    if (g6 == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g6 = obj;
                }
                Object obj16 = ((z7o) g6).a;
                if (!(obj16 instanceof t7o)) {
                    r7o r7oVar16 = z7o.b;
                    obj16 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj16);
                }
                Throwable a8 = z7o.a(obj16);
                if (a8 != null) {
                    try {
                        com.yandex.passport.data.network.token.i iVar6 = iVar5.b;
                        String message4 = a8.getMessage();
                        if (message4 != null) {
                            str = message4;
                        }
                        throw com.yandex.passport.data.network.token.i.j(iVar6, a8, null, new com.yandex.passport.api.exception.k(str), null, new com.yandex.passport.api.exception.p(a8), null, 42);
                    } catch (Throwable th9) {
                        r7o r7oVar17 = z7o.b;
                        obj16 = new t7o(th9);
                    }
                }
                return new z7o(obj16);
            case 7:
                k kVar = (k) obj9;
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.account.d dVar3 = kVar.a;
                    com.yandex.passport.internal.entities.w wVar = (com.yandex.passport.internal.entities.w) ((com.yandex.passport.internal.methods.h0) obj8).c.c;
                    com.yandex.passport.internal.analytics.a aVar4 = com.yandex.passport.internal.analytics.a.n;
                    this.k = 1;
                    Object a9 = dVar3.a(wVar, aVar4, this);
                    if (a9 == nm6Var8) {
                        return nm6Var8;
                    }
                    obj4 = a9;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj4 = ((z7o) obj).a;
                }
                r7o r7oVar18 = z7o.b;
                if (!(obj4 instanceof t7o)) {
                    obj4 = com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) obj4);
                }
                Throwable a10 = z7o.a(obj4);
                if (a10 != null) {
                    try {
                        throw com.yandex.passport.data.network.token.i.j(kVar.b, a10, null, null, null, null, new com.yandex.passport.api.exception.t(a10), 30);
                    } catch (Throwable th10) {
                        r7o r7oVar19 = z7o.b;
                        obj4 = new t7o(th10);
                    }
                }
                return new z7o(obj4);
            case 8:
                com.yandex.passport.internal.usecase.vpn.e eVar2 = ((o) obj8).a;
                com.yandex.passport.internal.methods.b bVar2 = ((j3) obj9).c;
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        qgg.h0(obj);
                        d = obj;
                        return (com.yandex.passport.internal.entities.a0) d;
                    }
                    if (i10 == 2) {
                        qgg.h0(obj);
                        return (com.yandex.passport.internal.entities.a0) eVar2.l.a.getValue();
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "forceCheck: " + ((Boolean) bVar2.c).booleanValue(), 8);
                }
                if (!((Boolean) bVar2.c).booleanValue()) {
                    this.k = 2;
                    break;
                } else {
                    this.k = 1;
                    d = eVar2.d("data_changed", this);
                    break;
                }
                return nm6Var9;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    s sVar = (s) obj9;
                    com.yandex.passport.internal.filter.l lVar2 = sVar.b;
                    ArrayList g11 = sVar.a.a().g();
                    com.yandex.passport.internal.entities.k kVar2 = (com.yandex.passport.internal.entities.k) ((p3) obj8).c.c;
                    this.k = 1;
                    c = lVar2.c(g11, kVar2, this);
                    if (c == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                Iterable iterable = (Iterable) c;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(com.yandex.plus.core.locale.b.B((com.yandex.passport.internal.l) it2.next()));
                }
                return arrayList2;
            case 10:
                v3 v3Var = (v3) obj9;
                nm6 nm6Var11 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.common.core.f L5 = com.yandex.plus.pay.ui.core.b.L((z1) v3Var.c.c);
                com.yandex.passport.common.core.f L6 = com.yandex.plus.pay.ui.core.b.L((z1) v3Var.d.c);
                com.yandex.passport.internal.usecase.n0 n0Var = ((y) obj8).a;
                com.yandex.passport.internal.usecase.l0 l0Var = new com.yandex.passport.internal.usecase.l0(L5, L6, (com.yandex.passport.internal.credentials.e) v3Var.e.c);
                this.k = 1;
                Object g12 = n0Var.g(l0Var, this);
                return g12 == nm6Var11 ? nm6Var11 : g12;
            case 11:
                z zVar2 = (z) obj9;
                com.yandex.passport.internal.methods.b bVar3 = ((w3) obj8).c;
                nm6 nm6Var12 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.credentials.f a11 = zVar2.c.a(((com.yandex.passport.internal.entities.h) bVar3.c).a);
                String e3 = ((com.yandex.passport.internal.entities.h) bVar3.c).e();
                if (e3 == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                o4 o4Var = zVar2.a;
                com.yandex.passport.internal.network.mappers.b bVar4 = zVar2.d;
                com.yandex.passport.common.core.b L7 = com.yandex.plus.core.network.api.utils.a.L(((com.yandex.passport.internal.entities.h) bVar3.c).a);
                bVar4.getClass();
                com.yandex.passport.data.network.j4 j4Var = new com.yandex.passport.data.network.j4(com.yandex.passport.internal.network.mappers.b.a(L7), e3, ((com.yandex.passport.internal.entities.h) bVar3.c).d(), a11.c, a11.d);
                this.k = 1;
                Object g13 = o4Var.g(j4Var, this);
                return g13 == nm6Var12 ? nm6Var12 : g13;
            case 12:
                a4 a4Var = (a4) obj8;
                c0 c0Var2 = (c0) obj9;
                nm6 nm6Var13 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.helper.f fVar3 = c0Var2.a;
                    com.yandex.passport.common.core.b L8 = com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) a4Var.c.c);
                    String str7 = (String) a4Var.d.c;
                    boolean booleanValue = ((Boolean) a4Var.e.c).booleanValue();
                    this.k = 1;
                    Object a12 = fVar3.a(L8, str7, booleanValue, this);
                    if (a12 == nm6Var13) {
                        return nm6Var13;
                    }
                    obj5 = a12;
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj5 = ((z7o) obj).a;
                }
                Throwable a13 = z7o.a(obj5);
                if (a13 != null) {
                    try {
                        com.yandex.passport.data.network.token.i iVar7 = c0Var2.b;
                        String localizedMessage2 = a13.getLocalizedMessage();
                        if (localizedMessage2 != null) {
                            str = localizedMessage2;
                        }
                        throw com.yandex.passport.data.network.token.i.j(iVar7, a13, null, new com.yandex.passport.api.exception.k(str), null, null, null, 58);
                    } catch (Throwable th11) {
                        r7o r7oVar20 = z7o.b;
                        obj5 = new t7o(th11);
                    }
                }
                return new z7o(obj5);
            case 13:
                e4 e4Var = (e4) obj9;
                nm6 nm6Var14 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f L9 = com.yandex.plus.pay.ui.core.b.L((z1) e4Var.d.c);
                    com.yandex.passport.common.core.f L10 = com.yandex.plus.pay.ui.core.b.L((z1) e4Var.c.c);
                    this.k = 1;
                    Object a14 = g0.a((g0) obj8, L10, L9, this);
                    if (a14 == nm6Var14) {
                        return nm6Var14;
                    }
                    obj6 = a14;
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj6 = ((z7o) obj).a;
                }
                return new z7o(obj6);
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f L11 = com.yandex.plus.pay.ui.core.b.L((z1) ((f4) obj9).c.c);
                    com.yandex.passport.internal.usecase.x0 x0Var = ((h0) obj8).a;
                    this.k = 1;
                    g7 = x0Var.g(L11, this);
                    if (g7 == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g7 = obj;
                }
                Object obj17 = ((z7o) g7).a;
                if (!(obj17 instanceof t7o)) {
                    try {
                        r7o r7oVar21 = z7o.b;
                        obj17 = String.valueOf(((Number) obj17).longValue());
                    } catch (Throwable th12) {
                        r7o r7oVar22 = z7o.b;
                        obj17 = new t7o(th12);
                    }
                }
                return new z7o(obj17);
            case 15:
                g4 g4Var = (g4) obj8;
                k6 k6Var3 = g4Var.d;
                i0 i0Var = (i0) obj9;
                nm6 nm6Var16 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.d1 d1Var = i0Var.a;
                    com.yandex.passport.internal.usecase.c1 c1Var = new com.yandex.passport.internal.usecase.c1(((z1) g4Var.c.c).b, ((com.yandex.passport.internal.entities.t) k6Var3.c).a, null);
                    this.k = 1;
                    g8 = d1Var.g(c1Var, this);
                    if (g8 == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g8 = obj;
                }
                Object obj18 = ((z7o) g8).a;
                Throwable a15 = z7o.a(obj18);
                if (a15 != null) {
                    try {
                        com.yandex.passport.data.network.token.i iVar8 = i0Var.b;
                        String str8 = ((com.yandex.passport.internal.entities.t) k6Var3.c).a;
                        String message5 = a15.getMessage();
                        if (message5 != null) {
                            str = message5;
                        }
                        throw com.yandex.passport.data.network.token.i.j(iVar8, a15, str8, null, null, null, new com.yandex.passport.api.exception.k(str), 28);
                    } catch (Throwable th13) {
                        r7o r7oVar23 = z7o.b;
                        obj18 = new t7o(th13);
                    }
                }
                return new z7o(obj18);
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i18 = this.k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.push.h0 h0Var = (com.yandex.passport.internal.push.h0) ((i4) obj9).c.c;
                long j = h0Var.f;
                String str9 = h0Var.p;
                com.yandex.passport.internal.usecase.d1 d1Var2 = ((k0) obj8).a;
                com.yandex.passport.internal.usecase.c1 c1Var2 = new com.yandex.passport.internal.usecase.c1(j, str9, h0Var.g);
                this.k = 1;
                Object g14 = d1Var2.g(c1Var2, this);
                return g14 == nm6Var17 ? nm6Var17 : g14;
            case 17:
                j4 j4Var2 = (j4) obj9;
                com.yandex.passport.internal.methods.b bVar5 = j4Var2.c;
                nm6 nm6Var18 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.b L12 = com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) bVar5.c);
                    l0 l0Var2 = (l0) obj8;
                    r7 r7Var = l0Var2.a;
                    l0Var2.d.getClass();
                    l7 l7Var = new l7(com.yandex.passport.internal.network.mappers.b.a(L12), (String) j4Var2.d.c);
                    this.k = 1;
                    g9 = r7Var.g(l7Var, this);
                    if (g9 == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g9 = obj;
                }
                Object obj19 = ((z7o) g9).a;
                if (obj19 instanceof t7o) {
                    obj7 = obj19;
                } else {
                    r7o r7oVar24 = z7o.b;
                    q7 q7Var = (q7) obj19;
                    obj7 = new com.yandex.passport.internal.link_auth.e((com.yandex.passport.api.impl.b) bVar5.c, q7Var.b, q7Var.c, q7Var.d, q7Var.e, q7Var.f, q7Var.g);
                }
                qgg.h0(obj7);
                return obj7;
            case 18:
                t0 t0Var = (t0) obj9;
                com.yandex.passport.common.core.f fVar4 = (com.yandex.passport.common.core.f) obj8;
                nm6 nm6Var19 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.l e4 = t0Var.a.a().e(fVar4);
                    if (e4 == null) {
                        throw new com.yandex.passport.api.exception.b(fVar4);
                    }
                    String str10 = e4.d.a;
                    if (str10 == null) {
                        throw new com.yandex.passport.api.exception.a(fVar4);
                    }
                    com.yandex.passport.data.network.core.s sVar2 = t0Var.b;
                    this.k = 1;
                    c2 = ((com.yandex.passport.internal.network.l) sVar2).c(str10, this);
                    if (c2 == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                return new z7o(avf.u(c2));
            case 19:
                return k(obj);
            case 20:
                return l(obj);
            case 21:
                return n(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            case 24:
                return q(obj);
            case 25:
                return s(obj);
            case 26:
                return t(obj);
            case 27:
                return u(obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return v(obj);
            default:
                nm6 nm6Var20 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    g10 = ((com.yandex.passport.data.network.core.b) obj9).g((xa) obj8, this);
                    if (g10 == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g10 = obj;
                }
                Object obj20 = ((z7o) g10).a;
                qgg.h0(obj20);
                return obj20;
        }
    }
}
