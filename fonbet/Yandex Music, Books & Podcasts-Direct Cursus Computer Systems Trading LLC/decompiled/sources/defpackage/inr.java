package defpackage;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.w;
import com.yandex.media.ynison.service.x;
import com.yandex.passport.api.exception.q;
import com.yandex.passport.api.exception.r;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.analytics.k;
import com.yandex.passport.common.core.f;
import com.yandex.passport.data.exceptions.j;
import com.yandex.passport.data.network.token.i;
import com.yandex.passport.internal.database.auth_cookie.a;
import com.yandex.passport.internal.database.auth_cookie.e;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.methods.b;
import com.yandex.passport.internal.methods.performer.p1;
import com.yandex.passport.internal.methods.q5;
import com.yandex.passport.internal.methods.r3;
import com.yandex.passport.internal.report.c5;
import com.yandex.passport.internal.report.reporters.p;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.internal.ui.domik.t;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.usecase.s;
import com.yandex.passport.internal.usecase.u;
import com.yandex.passport.internal.usecase.ui.o1;
import com.yandex.passport.internal.usecase.ui.q1;
import com.yandex.plus.acquisition.adapter.api.n;
import com.yandex.plus.bdui.action.h;
import com.yandex.plus.bdui.flex.utils.d;
import com.yandex.plus.bdui.flex.utils.g;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.home.common.utils.m;
import com.yandex.plus.home.feature.webviews.internal.settings.domain.c;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b2;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.u1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class inr extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public inr(pfm pfmVar, pyc pycVar, Function1 function1, pqm pqmVar, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.m = pfmVar;
        this.n = (aur) pycVar;
        this.o = (uif) function1;
        this.p = pqmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        if (com.yandex.passport.internal.methods.performer.p1.a(r0, r4, r2, r12) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (com.yandex.passport.internal.methods.performer.p1.a(r0, r4, r13, r12) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        f L;
        String str;
        String d;
        String str2;
        i iVar;
        p1 p1Var = (p1) this.p;
        q5 q5Var = (q5) this.o;
        b bVar = q5Var.d;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    iVar = (i) this.n;
                    str2 = (String) this.m;
                    L = (f) this.l;
                    qgg.h0(obj);
                    iVar.getClass();
                    if (i.i(str2, (List) obj) == null) {
                        this.l = null;
                        this.m = null;
                        this.n = null;
                        this.k = 3;
                    }
                    return Unit.a;
                }
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            qgg.h0(obj);
            return Unit.a;
        }
        qgg.h0(obj);
        L = com.yandex.plus.pay.ui.core.b.L((z1) q5Var.c.c);
        String str3 = (String) bVar.c;
        if (StringsKt.U(str3)) {
            str3 = "passport.yandex.ru";
        }
        if (StringsKt.U(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            if (!StringsKt.M(str3, "://", false)) {
                str3 = "https://".concat(str3);
            }
            com.yandex.passport.common.url.b bVar2 = new com.yandex.passport.common.url.b(str3);
            if (!com.yandex.passport.common.url.b.n(str3)) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                str = bVar2.a;
                d = str == null ? com.yandex.passport.common.url.b.d(str) : null;
                if (d != null) {
                    throw new q((String) bVar.c);
                }
                if (((Boolean) q5Var.e.c).booleanValue()) {
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                } else {
                    com.yandex.passport.internal.database.auth_cookie.b bVar3 = p1Var.a;
                    this.l = L;
                    this.m = d;
                    i iVar2 = e.d;
                    this.n = iVar2;
                    this.k = 2;
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) bVar3.b).f, new a(bVar3, L, continuation, 1), this);
                    if (V != nm6Var) {
                        str2 = d;
                        obj = V;
                        iVar = iVar2;
                        iVar.getClass();
                        if (i.i(str2, (List) obj) == null) {
                        }
                        return Unit.a;
                    }
                }
            }
        }
        str = null;
        if (str == null) {
        }
        if (d != null) {
        }
        return nm6Var;
    }

    private final Object l(Object obj) {
        com.yandex.passport.internal.ui.domik.username.b bVar = (com.yandex.passport.internal.ui.domik.username.b) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (((String) this.l) == null) {
                bVar.k.l(new com.yandex.passport.internal.ui.f("phone.not_confirmed", new j("Null trackId")));
                return Unit.a;
            }
            bVar.l.m(Boolean.TRUE);
            q1 q1Var = bVar.r;
            l lVar = (l) this.n;
            o1 o1Var = new o1(lVar.b, lVar.d, (String) this.l, (String) this.o, (String) this.p);
            this.k = 1;
            obj = q1Var.g(o1Var, this);
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
        Throwable a = z7o.a(obj2);
        if (a != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "failed upgradePhonish " + a, 8);
            }
            bVar.l.l(Boolean.FALSE);
            if (a instanceof com.yandex.passport.api.exception.j) {
                v vVar = bVar.s;
                com.yandex.passport.api.exception.j jVar = (com.yandex.passport.api.exception.j) a;
                vVar.getClass();
                com.yandex.passport.internal.ui.domik.f fVar = vVar.a;
                fVar.getClass();
                fVar.D = new com.yandex.passport.internal.ui.f("unknown error", jVar);
                fVar.v.m(jVar);
            } else {
                bVar.k.l(new com.yandex.passport.internal.ui.f("phone.not_confirmed", a));
            }
        }
        if (!(obj2 instanceof t7o)) {
            t tVar = (t) obj2;
            v vVar2 = bVar.s;
            vVar2.getClass();
            tVar.getClass();
            vVar2.a.u.m(tVar);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        com.yandex.passport.internal.usecase.a aVar;
        com.yandex.passport.internal.usecase.b bVar;
        com.yandex.passport.internal.analytics.a aVar2;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            aVar = (com.yandex.passport.internal.usecase.a) this.o;
            bVar = (com.yandex.passport.internal.usecase.b) this.p;
            com.yandex.passport.internal.analytics.a aVar3 = com.yandex.passport.internal.analytics.a.p;
            u uVar = bVar.b;
            s sVar = new s(aVar.a, 0L, aVar.b, null, aVar3);
            this.l = bVar;
            this.m = aVar;
            this.n = aVar3;
            this.k = 1;
            obj = uVar.g(sVar, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            aVar2 = aVar3;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = (com.yandex.passport.internal.analytics.a) this.n;
            aVar = (com.yandex.passport.internal.usecase.a) this.m;
            bVar = (com.yandex.passport.internal.usecase.b) this.l;
            qgg.h0(obj);
        }
        Object obj2 = ((z7o) obj).a;
        if (!(obj2 instanceof t7o)) {
            r7o r7oVar = z7o.b;
            l lVar = (l) obj2;
            if (!aVar.c.isEmpty() && !aVar.c.contains(new Integer(lVar.e.h))) {
                throw new com.yandex.passport.common.exception.a("Invalid token. Wrong account type: " + lVar.e.h);
            }
            obj2 = bVar.c.b(lVar, aVar2.d(), true);
        }
        return new z7o(obj2);
    }

    private final Object o(Object obj) {
        Object b;
        com.yandex.plus.bdui.action.a aVar = (com.yandex.plus.bdui.action.a) this.o;
        com.yandex.plus.bdui.action.i iVar = (com.yandex.plus.bdui.action.i) this.n;
        com.yandex.plus.bdui.flex.action.f fVar = (com.yandex.plus.bdui.flex.action.f) this.l;
        com.yandex.plus.log.api.b bVar = fVar.d;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "FlexActionHandler", "Renderables found, rendering...");
            }
            g gVar = (g) fVar.f.getValue();
            d dVar = (d) this.m;
            this.k = 1;
            b = gVar.b(dVar, this);
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
        com.yandex.plus.bdui.action.d dVar2 = (com.yandex.plus.bdui.action.d) this.p;
        r7o r7oVar = z7o.b;
        if (!(b instanceof t7o)) {
            d dVar3 = (d) b;
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
            if (bVar.b(aVar3)) {
                bVar.c(aVar3, "FlexActionHandler", "Rendering succeeded");
            }
            fVar.a(new com.yandex.plus.bdui.action.i(iVar.a, new h(dVar3.b), iVar.c, iVar.d), aVar, dVar2);
        }
        Throwable a = z7o.a(b);
        if (a != null) {
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar4)) {
                bVar.a(aVar4, "FlexActionHandler", "Rendering failed!", a);
            }
            fVar.c(iVar, aVar, a);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r8 == r1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        Object u;
        rjc rjcVar = (rjc) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            m mVar = (m) this.n;
            uh uhVar = (uh) this.o;
            Parcelable parcelable = (Parcelable) this.p;
            this.m = rjcVar;
            this.k = 1;
            u = mVar.u(uhVar, parcelable, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            u = ((z7o) obj).a;
        }
        r7o r7oVar = z7o.b;
        if (!(u instanceof t7o)) {
            this.m = null;
            this.l = u;
            this.k = 2;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        t7o t7oVar;
        Object obj2;
        Throwable a;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l lVar;
        Object V;
        b2 b2Var;
        com.yandex.plus.home.feature.webviews.internal.bridge.b bVar;
        b2 b2Var2 = (b2) this.p;
        String str = b2Var2.b;
        com.yandex.plus.home.feature.webviews.internal.bridge.b bVar2 = (com.yandex.plus.home.feature.webviews.internal.bridge.b) this.o;
        com.yandex.plus.home.analytics.diagnostic.webview.a aVar = bVar2.h;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 0;
        Continuation continuation = null;
        try {
            if (i == 0) {
                qgg.h0(obj);
                r7o r7oVar = z7o.b;
                com.yandex.plus.bdui.plus.content.controller.f fVar = bVar2.f;
                bVar2.e.getClass();
                str.getClass();
                com.yandex.plus.home.feature.webviews.internal.settings.model.a aVar2 = new com.yandex.plus.home.feature.webviews.internal.settings.model.a(str, b2Var2.c);
                kotlinx.coroutines.a aVar3 = (kotlinx.coroutines.a) fVar.b;
                com.yandex.plus.home.feature.webviews.internal.bridge.a aVar4 = new com.yandex.plus.home.feature.webviews.internal.bridge.a(aVar2, fVar, continuation, i2);
                this.n = null;
                this.l = bVar2;
                this.m = b2Var2;
                this.k = 1;
                V = x97.V(aVar3, aVar4, this);
                if (V == nm6Var) {
                    return nm6Var;
                }
                b2Var = b2Var2;
                bVar = bVar2;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b2Var = (b2) this.m;
                com.yandex.plus.home.feature.webviews.internal.bridge.b bVar3 = (com.yandex.plus.home.feature.webviews.internal.bridge.b) this.l;
                qgg.h0(obj);
                bVar = bVar3;
                V = obj;
            }
            com.yandex.plus.core.analytics.logging.b bVar4 = com.yandex.plus.core.analytics.logging.b.c;
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar4, "handleChangeOptionStatusRequestMessage() change success", null);
            bVar.A(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l(b2Var.a, b2Var.b, Boolean.valueOf(((com.yandex.plus.home.feature.webviews.internal.settings.model.a) V).b), true, true, null));
            obj2 = Unit.a;
            r7o r7oVar2 = z7o.b;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(e);
            obj2 = t7oVar;
            a = z7o.a(obj2);
            if (a != null) {
            }
            return Unit.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th);
            obj2 = t7oVar;
            a = z7o.a(obj2);
            if (a != null) {
            }
            return Unit.a;
        }
        a = z7o.a(obj2);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar5 = com.yandex.plus.core.analytics.logging.b.c;
            jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar5, "handleChangeOptionStatusRequestMessage() change error", null);
            if (a instanceof com.yandex.plus.home.feature.webviews.internal.settings.domain.a) {
                throw null;
            }
            if (a instanceof c) {
                aVar.a(str, ((c) a).a, false);
                lVar = new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l(b2Var2.a, b2Var2.b, null, true, false, "UnsupportedSettingType");
            } else if (a instanceof com.yandex.plus.home.feature.webviews.internal.settings.domain.b) {
                aVar.a(str, ((com.yandex.plus.home.feature.webviews.internal.settings.domain.b) a).a, false);
                lVar = new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l(b2Var2.a, b2Var2.b, null, true, false, "OptionIsNotSupported");
            } else {
                aVar.a(str, "Unexpected exception=" + a, false);
                lVar = new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l(b2Var2.a, b2Var2.b, null, true, false, "Unknown");
            }
            bVar2.A(lVar);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r6.u(r5) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        if (r6 == r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj) {
        x0q x0qVar = ((o) this.n).a;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Function1 function1 = (Function1) this.l;
            this.k = 1;
            obj = function1.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                y yVar = (y) this.p;
                yVar.getClass();
                Set Y = xz0.Y(new com.yandex.plus.home.state.b[]{com.yandex.plus.home.state.b.b, com.yandex.plus.home.state.b.c});
                com.yandex.plus.home.state.a aVar = (com.yandex.plus.home.state.a) ((com.yandex.plus.home.internal.di.l) yVar.b).q.getValue();
                aVar.getClass();
                Y.getClass();
                aVar.a.a(Y);
                return Unit.a;
            }
            qgg.h0(obj);
        }
        com.yandex.plus.acquisition.adapter.api.o oVar = (com.yandex.plus.acquisition.adapter.api.o) obj;
        if (!Intrinsics.d(oVar, n.a)) {
            if (oVar instanceof com.yandex.plus.acquisition.adapter.api.m) {
                x0qVar.a(new com.yandex.plus.home.api.purchase.a(com.yandex.plus.home.pay.a.a));
            } else {
                if (!Intrinsics.d(oVar, com.yandex.plus.acquisition.adapter.api.e.a)) {
                    b6e.s();
                    return null;
                }
                x0qVar.a(new com.yandex.plus.home.api.purchase.a(com.yandex.plus.home.pay.a.b));
            }
            return Unit.a;
        }
        ((com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) this.m).a();
        x0qVar.a(com.yandex.plus.home.api.purchase.b.a);
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.o;
        this.k = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object t(Object obj) {
        t7o t7oVar;
        Object obj2;
        Throwable a;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l y;
        b2 b2Var;
        com.yandex.plus.home.feature.webviews.internal.webview.b bVar;
        com.yandex.plus.home.feature.webviews.internal.webview.b bVar2 = (com.yandex.plus.home.feature.webviews.internal.webview.b) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 1;
        Continuation continuation = null;
        try {
            if (i == 0) {
                qgg.h0(obj);
                b2 b2Var2 = (b2) this.p;
                r7o r7oVar = z7o.b;
                com.yandex.plus.bdui.plus.content.controller.f fVar = bVar2.j;
                String str = b2Var2.b;
                bVar2.i.getClass();
                str.getClass();
                com.yandex.plus.home.feature.webviews.internal.settings.model.a aVar = new com.yandex.plus.home.feature.webviews.internal.settings.model.a(str, b2Var2.c);
                kotlinx.coroutines.a aVar2 = (kotlinx.coroutines.a) fVar.b;
                com.yandex.plus.home.feature.webviews.internal.bridge.a aVar3 = new com.yandex.plus.home.feature.webviews.internal.bridge.a(aVar, fVar, continuation, i2);
                this.n = null;
                this.l = bVar2;
                this.m = b2Var2;
                this.k = 1;
                Object V = x97.V(aVar2, aVar3, this);
                if (V == nm6Var) {
                    return nm6Var;
                }
                b2Var = b2Var2;
                bVar = bVar2;
                obj = V;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b2 b2Var3 = (b2) this.m;
                com.yandex.plus.home.feature.webviews.internal.webview.b bVar3 = (com.yandex.plus.home.feature.webviews.internal.webview.b) this.l;
                qgg.h0(obj);
                b2Var = b2Var3;
                bVar = bVar3;
            }
            com.yandex.plus.home.feature.webviews.internal.settings.model.a aVar4 = (com.yandex.plus.home.feature.webviews.internal.settings.model.a) obj;
            com.yandex.plus.log.api.b bVar4 = bVar.u;
            String A = bVar.A();
            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
            if (bVar4.b(aVar5)) {
                bVar4.c(aVar5, A, "handleChangeOptionStatusRequest() change success");
            }
            bVar.C(com.yandex.plus.home.feature.webviews.internal.webview.b.y(bVar, b2Var, Boolean.valueOf(aVar4.b), true, true, null));
            obj2 = Unit.a;
            r7o r7oVar2 = z7o.b;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(e);
            obj2 = t7oVar;
            b2 b2Var4 = (b2) this.p;
            a = z7o.a(obj2);
            if (a != null) {
            }
            return Unit.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th);
            obj2 = t7oVar;
            b2 b2Var42 = (b2) this.p;
            a = z7o.a(obj2);
            if (a != null) {
            }
            return Unit.a;
        }
        b2 b2Var422 = (b2) this.p;
        a = z7o.a(obj2);
        if (a != null) {
            com.yandex.plus.log.api.b bVar5 = bVar2.u;
            com.yandex.plus.home.analytics.diagnostic.webview.a aVar6 = bVar2.l;
            String A2 = bVar2.A();
            com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.b;
            if (bVar5.b(aVar7)) {
                bVar5.c(aVar7, A2, "handleChangeOptionStatusRequest() change error");
            }
            if (a instanceof com.yandex.plus.home.feature.webviews.internal.settings.domain.a) {
                throw null;
            }
            if (a instanceof c) {
                aVar6.a(b2Var422.b, ((c) a).a, false);
                y = com.yandex.plus.home.feature.webviews.internal.webview.b.y(bVar2, b2Var422, null, true, false, "UnsupportedSettingType");
            } else if (a instanceof com.yandex.plus.home.feature.webviews.internal.settings.domain.b) {
                aVar6.a(b2Var422.b, ((com.yandex.plus.home.feature.webviews.internal.settings.domain.b) a).a, false);
                y = com.yandex.plus.home.feature.webviews.internal.webview.b.y(bVar2, b2Var422, null, true, false, "OptionIsNotSupported");
            } else {
                aVar6.a(b2Var422.b, "Unexpected exception=" + a, false);
                y = com.yandex.plus.home.feature.webviews.internal.webview.b.y(bVar2, b2Var422, null, true, false, "Unknown");
            }
            bVar2.C(y);
        }
        return Unit.a;
    }

    private final Object u(Object obj) {
        mm6 mm6Var = (mm6) this.l;
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
        Collection collection = (Collection) this.m;
        ArrayList arrayList = new ArrayList(v75.o(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(x97.p(mm6Var, null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(it.next(), (Continuation) null, (com.yandex.plus.home.plaque.repository.rest.o) this.n, (List) this.o, (Map) this.p), 3));
        }
        this.l = null;
        this.k = 1;
        Object v = ox6.v(arrayList, this);
        return v == nm6Var ? nm6Var : v;
    }

    private final Object v(Object obj) {
        com.yandex.plus.pay.internal.feature.counter_offers.g gVar = (com.yandex.plus.pay.internal.feature.counter_offers.g) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ExternalMediaBillingApi externalMediaBillingApi = gVar.a;
            u1 u1Var = new u1((String) this.n, (String) this.o, com.yandex.plus.core.locale.b.m(gVar.b), (String) this.p, (List) this.m);
            this.k = 1;
            obj = externalMediaBillingApi.d(u1Var, this);
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
        return com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj, new com.yandex.plus.pay.internal.feature.counter_offers.f(0, gVar));
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r5v21, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new inr((nru) this.l, (dzf) this.m, (androidx.fragment.app.y) this.n, (pu0) this.o, (Context) this.p, continuation, 0);
            case 1:
                return new inr((u0q) this.l, (nyf) this.m, (wnr) this.n, (fk0) this.o, (act) this.p, continuation, 1);
            case 2:
                inr inrVar = new inr((es3) this.m, (kur) this.n, (String) this.o, (n7w) this.p, continuation, 2);
                inrVar.l = obj;
                return inrVar;
            case 3:
                inr inrVar2 = new inr((pfm) this.m, (pyc) this.n, (Function1) this.o, (pqm) this.p, continuation);
                inrVar2.l = obj;
                return inrVar2;
            case 4:
                inr inrVar3 = new inr((Function2) this.m, (e7o) this.n, (mm6) this.o, (AtomicReference) this.p, continuation, 4);
                inrVar3.l = obj;
                return inrVar3;
            case 5:
                inr inrVar4 = new inr((Function1) this.m, (Function2) this.n, (Function0) this.o, (Function2) this.p, continuation, 5);
                inrVar4.l = obj;
                return inrVar4;
            case 6:
                return new inr((cvs) this.l, (pbo) this.m, (zvs) this.n, (o5n) this.o, (gy1) this.p, continuation, 6);
            case 7:
                return new inr((Map) this.m, (LinkedHashMap) this.n, (e4t) this.o, (mqs) this.p, continuation, 7);
            case 8:
                return new inr((sdr) this.l, (aqi) this.m, (sbu) this.n, (aqi) this.o, (fk0) this.p, continuation, 8);
            case 9:
                inr inrVar5 = new inr((mu7) this.m, (hxu) this.n, (a5q) this.o, (eu7) this.p, continuation, 9);
                inrVar5.l = obj;
                return inrVar5;
            case 10:
                inr inrVar6 = new inr((hxu) this.m, (a5q) this.n, (Function1) this.o, (eu7) this.p, continuation);
                inrVar6.l = obj;
                return inrVar6;
            case 11:
                return new inr((qvk) this.l, (c0v) this.m, (String) this.n, (List) this.o, (xpt) this.p, continuation, 11);
            case 12:
                return new inr((dzf) this.m, (sdr) this.l, (nbg) this.n, (sdr) this.o, (cx1) this.p, continuation);
            case 13:
                inr inrVar7 = new inr((Context) this.p, (w2r) this.m, (i5f) this.n, (gku) this.o, continuation);
                inrVar7.l = obj;
                return inrVar7;
            case 14:
                return new inr((x) this.m, (akw) this.n, (gow) this.o, (c0) this.p, continuation, 14);
            case 15:
                inr inrVar8 = new inr((Function1) this.m, (fuw) this.n, (tf6) this.o, (Function2) this.p, continuation, 15);
                inrVar8.l = obj;
                return inrVar8;
            case 16:
                return new inr((k) this.n, (String) this.o, (String) this.p, continuation, 16);
            case 17:
                return new inr((pjc) this.l, continuation, (com.yandex.passport.internal.autologin.ui.k) this.m, (gm5) this.n, (Context) this.p, (com.yandex.passport.internal.properties.g) this.o);
            case 18:
                return new inr((r3) this.n, (com.yandex.passport.internal.methods.performer.t) this.o, (f) this.p, continuation, 18);
            case 19:
                return new inr((q5) this.o, (p1) this.p, continuation, 19);
            case 20:
                return new inr((String) this.l, (com.yandex.passport.internal.ui.domik.username.b) this.m, (l) this.n, (String) this.o, (String) this.p, continuation, 20);
            case 21:
                return new inr((com.yandex.passport.internal.usecase.a) this.o, (com.yandex.passport.internal.usecase.b) this.p, continuation, 21);
            case 22:
                return new inr((com.yandex.plus.bdui.flex.action.f) this.l, (d) this.m, (com.yandex.plus.bdui.action.i) this.n, (com.yandex.plus.bdui.action.a) this.o, (com.yandex.plus.bdui.action.d) this.p, continuation, 22);
            case 23:
                inr inrVar9 = new inr((m) this.n, (uh) this.o, (Parcelable) this.p, continuation);
                inrVar9.m = obj;
                return inrVar9;
            case 24:
                inr inrVar10 = new inr((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.o, (b2) this.p, continuation, 24);
                inrVar10.n = obj;
                return inrVar10;
            case 25:
                return new inr((Function1) this.l, (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) this.m, (o) this.n, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.o, (y) this.p, continuation, 25);
            case 26:
                inr inrVar11 = new inr((com.yandex.plus.home.feature.webviews.internal.webview.b) this.o, (b2) this.p, continuation, 26);
                inrVar11.n = obj;
                return inrVar11;
            case 27:
                inr inrVar12 = new inr((Collection) this.m, continuation, (com.yandex.plus.home.plaque.repository.rest.o) this.n, (List) this.o, (Map) this.p);
                inrVar12.l = obj;
                return inrVar12;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new inr((com.yandex.plus.pay.internal.feature.counter_offers.g) this.l, (List) this.m, (String) this.n, (String) this.o, (String) this.p, continuation, 28);
            default:
                return new inr(this.l, continuation, (rjc) this.m, (com.yandex.plus.pay.internal.feature.payment.inapp.google.d) this.n, (xqn) this.o);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((inr) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r2 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x098d, code lost:
    
        if (r4 == r2) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x09e5, code lost:
    
        if (r0 == r7) goto L357;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Type inference failed for: r11v19, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v116, types: [com.yandex.plus.pay.inapp.api.f] */
    /* JADX WARN: Type inference failed for: r1v119, types: [com.yandex.plus.pay.inapp.api.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v122, types: [com.yandex.plus.pay.inapp.api.f] */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v33, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v4, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r9v23, types: [c5b] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:332:0x098d -> B:318:0x0991). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kur kurVar;
        String str;
        Object t7oVar;
        Throwable a;
        Object V;
        Object a2;
        Iterator it;
        Object c;
        Object e;
        hxu hxuVar;
        ou7 ou7Var;
        Object V2;
        pjn pjnVar;
        xab xabVar;
        o4q o4qVar;
        StationId stationId;
        String g;
        String g2;
        ?? r9;
        ?? r11;
        u9n u9nVar;
        Object Q;
        rse p;
        com.yandex.passport.common.analytics.a b;
        Object a3;
        String str2;
        String d;
        i iVar;
        Object V3;
        String str3;
        t7o t7oVar2;
        int i;
        ?? r1;
        Throwable a4;
        int i2 = 13;
        int i3 = 27;
        int i4 = 11;
        int i5 = 3;
        int i6 = 5;
        int i7 = 2;
        int i8 = 1;
        switch (this.j) {
            case 0:
                nru nruVar = (nru) this.l;
                nm6 nm6Var = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    ss3 t = kg5.t(nruVar.f(), ((dzf) this.m).getLifecycle(), lyf.d);
                    pm pmVar = new pm(nruVar, (androidx.fragment.app.y) this.n, (pu0) this.o, (Context) this.p, 16);
                    this.k = 1;
                    if (t.collect(pmVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    ss3 t2 = kg5.t((u0q) this.l, (nyf) this.m, lyf.d);
                    st7 st7Var = new st7((wnr) this.n, (fk0) this.o, (act) this.p, null, 5);
                    this.k = 1;
                    if (zsd.O(t2, st7Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                n7w n7wVar = (n7w) this.p;
                kur kurVar2 = (kur) this.n;
                String str4 = (String) this.o;
                nm6 nm6Var3 = nm6.a;
                int i11 = this.k;
                try {
                    if (i11 == 0) {
                        qgg.h0(obj);
                        es3 es3Var = (es3) this.m;
                        r7o r7oVar = z7o.b;
                        dq7 dq7Var = ca8.a;
                        mn7 mn7Var = mn7.d;
                        l1p l1pVar = new l1p(es3Var, kurVar2, str4, null, 2);
                        kurVar = kurVar2;
                        str = str4;
                        try {
                            this.k = 1;
                            V = x97.V(mn7Var, l1pVar, this);
                            if (V == nm6Var3) {
                                return nm6Var3;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                            if (!(t7oVar instanceof t7o)) {
                            }
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V = obj;
                        kurVar = kurVar2;
                        str = str4;
                    }
                    t7oVar = (PictureDrawable) V;
                    r7o r7oVar3 = z7o.b;
                } catch (Throwable th2) {
                    th = th2;
                    kurVar = kurVar2;
                    str = str4;
                }
                if (!(t7oVar instanceof t7o)) {
                    PictureDrawable pictureDrawable = (PictureDrawable) t7oVar;
                    ((WeakHashMap) kurVar.d.a).put(str, pictureDrawable);
                    n7wVar.W(new cq8(pictureDrawable, t33.a));
                }
                a = z7o.a(t7oVar);
                if (a != null) {
                    if (a instanceof CancellationException) {
                        throw a;
                    }
                    n7wVar.U(new h6(ouj.k('\'', "Failed to load image with url='", str), a));
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    pfm pfmVar = (pfm) this.m;
                    qna qnaVar = new qna(mm6Var, (pyc) this.n, (Function1) this.o, (pqm) this.p, (Continuation) null);
                    this.k = 1;
                    if (xee.v(pfmVar, qnaVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
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
                gjs gjsVar = new gjs((mm6) this.l, (e7o) this.n, (mm6) this.o, (Function2) this.m, (AtomicReference) this.p);
                Function2 function2 = (Function2) this.m;
                this.k = 1;
                Object invoke = function2.invoke(gjsVar, this);
                return invoke == nm6Var5 ? nm6Var5 : invoke;
            case 5:
                int i14 = 4;
                pfm pfmVar2 = (pfm) this.l;
                nm6 nm6Var6 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    x8a x8aVar = new x8a();
                    wqn wqnVar = new wqn();
                    wqnVar.a = 0L;
                    zzq zzqVar = new zzq(5, x8aVar, wqnVar, (Function1) this.m);
                    xes xesVar = new xes(i5, x8aVar, (Function2) this.n);
                    xes xesVar2 = new xes(i14, x8aVar, (Function0) this.o);
                    t2n t2nVar = new t2n(26, wqnVar, x8aVar, (Function2) this.p);
                    this.l = null;
                    this.k = 1;
                    if (wna.f(pfmVar2, zzqVar, xesVar, xesVar2, t2nVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                Object obj2 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    z9c z9cVar = (z9c) ((cvs) this.l).a.getValue();
                    pbo pboVar = (pbo) this.m;
                    zvs zvsVar = (zvs) this.n;
                    o5n o5nVar = (o5n) this.o;
                    gy1 gy1Var = (gy1) this.p;
                    this.k = 1;
                    a2 = z9cVar.a(pboVar, zvsVar, o5nVar, gy1Var, this);
                    break;
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                x9c x9cVar = (x9c) a2;
                zvs zvsVar2 = (zvs) this.n;
                o5n o5nVar2 = (o5n) this.o;
                Uri parse = Uri.parse(x9cVar.e);
                parse.getClass();
                String str5 = x9cVar.d;
                boolean z = x9cVar.f;
                oq4 oq4Var = x9cVar.b;
                int i17 = x9cVar.c;
                o5n o5nVar3 = x9cVar.a;
                List list = x9cVar.g;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ldg.N((String) it2.next()));
                }
                obj2 = new bvs(zvsVar2, o5nVar2, parse, str5, z, oq4Var, i17, o5nVar3, arrayList);
                return obj2;
            case 7:
                mqs mqsVar = (mqs) this.p;
                e4t e4tVar = (e4t) this.o;
                nm6 nm6Var7 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    it = ((Map) this.m).entrySet().iterator();
                } else if (i18 == 1) {
                    it = (Iterator) this.l;
                    qgg.h0(obj);
                    ((Boolean) obj).getClass();
                } else {
                    if (i18 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.l;
                    qgg.h0(obj);
                    c = obj;
                    ((Boolean) c).getClass();
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str6 = (String) entry.getKey();
                    boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    evl evlVar = (evl) ((LinkedHashMap) this.n).get(str6);
                    if (evlVar != null) {
                        cvl cvlVar = evlVar.a;
                        if (evlVar.b != booleanValue) {
                            if (!booleanValue) {
                                this.l = it;
                                this.k = 2;
                                c = e4tVar.c(mqsVar, cvlVar, this);
                                break;
                            } else {
                                this.l = it;
                                this.k = 1;
                                Object a5 = e4tVar.a(mqsVar, cvlVar, this);
                                if (a5 != nm6Var7) {
                                    ((Boolean) a5).getClass();
                                }
                            }
                            return nm6Var7;
                        }
                        continue;
                    }
                }
                ArrayList arrayList2 = e4tVar.e;
                if (!arrayList2.isEmpty()) {
                    arrayList2.clear();
                    qxr.a();
                    neg.A(dyr.e, null);
                }
                return Unit.a;
            case 8:
                sbu sbuVar = (sbu) this.n;
                nm6 nm6Var8 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new ftr(i6, (sdr) this.l, (aqi) this.m, sbuVar));
                    ocu ocuVar = new ocu((aqi) this.o, (fk0) this.p, sbuVar, (Continuation) null, 0);
                    this.k = 1;
                    if (zsd.O(s0, ocuVar, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                a5q a5qVar = (a5q) this.o;
                hxu hxuVar2 = (hxu) this.n;
                qxu qxuVar = (qxu) this.l;
                nm6 nm6Var9 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    mu7 mu7Var = (mu7) this.m;
                    if (mu7Var != null) {
                        mu7Var.g(null);
                    }
                    if (!hxu.a(hxuVar2, a5qVar) || !(qxuVar instanceof mxu)) {
                        ssg.a(3, "WaveProlongationOperation", "Online session creation is completed", null);
                        return qxuVar;
                    }
                    ssg.a(3, "WaveProlongationOperation", "Online session creation is failed, fallback to offline session creation", null);
                    eu7 eu7Var = (eu7) this.p;
                    this.l = null;
                    this.k = 1;
                    e = hxu.e(hxuVar2, eu7Var, a5qVar, this);
                    if (e == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = obj;
                }
                return (qxu) e;
            case 10:
                hxu hxuVar3 = (hxu) this.m;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var10 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ou7 p2 = x97.p(mm6Var2, null, null, new x77((aur) this.o, null, 5), 3);
                vuu b2 = hxuVar3.h.b();
                if (!hxu.a(hxuVar3, (a5q) this.n) || b2 == null) {
                    hxuVar = hxuVar3;
                    ou7Var = null;
                } else {
                    hxuVar = hxuVar3;
                    ou7Var = x97.p(mm6Var2, null, null, new ocu(b2, hxuVar, (eu7) this.p, (a5q) this.n, (Continuation) null, 2), 3);
                }
                a5q a5qVar2 = (a5q) this.n;
                eu7 eu7Var2 = (eu7) this.p;
                acp acpVar = new acp(getContext());
                acpVar.g(p2.G(), new inr(ou7Var, hxuVar, a5qVar2, eu7Var2, (Continuation) null, 9));
                if (ou7Var != null) {
                    acpVar.g(ou7Var.G(), new npt(p2, r13, 21));
                }
                this.l = null;
                this.k = 1;
                Object d2 = acpVar.d(this);
                return d2 == nm6Var10 ? nm6Var10 : d2;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    ocu ocuVar2 = new ocu((c0v) this.m, (String) this.n, (List) this.o, (xpt) this.p, (Continuation) null, 4);
                    mn7 mn7Var2 = dm6.b;
                    this.k = 1;
                    V2 = x97.V(mn7Var2, ocuVar2, this);
                    if (V2 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V2 = obj;
                }
                ((qvk) this.l).i((v8n) V2);
                return Unit.a;
            case 12:
                Object obj3 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new nzv((sdr) this.l, 2));
                    fkn c2 = ((dzf) this.m).getLifecycle().c();
                    f9w f9wVar = f9w.a;
                    hyl hylVar = new hyl(i4, (nbg) this.n, (sdr) this.o, (cx1) this.p);
                    this.k = 1;
                    Object y = tt0.y(hylVar, new l1(f9wVar, r13, 25), this, wg.s, new pjc[]{s02, c2});
                    if (y != nm6.a) {
                        y = Unit.a;
                    }
                    if (y == obj3) {
                        return obj3;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var12 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    ak0 ak0Var = new ak0((Context) this.p, (w2r) this.m, (i5f) this.n, (gku) this.o, 25);
                    pi7 pi7Var = new pi7();
                    vej vejVar = pi7Var.a;
                    ak0Var.invoke(pi7Var);
                    wqr n = a4g.n();
                    dq7 dq7Var2 = ca8.a;
                    mn7.d.getClass();
                    tf6 e2 = gld.e(kotlin.coroutines.e.c(n, wkt.d.I0(1)).plus(new b43(rre.f, i7)));
                    s9f[] s9fVarArr = pi7.h;
                    cke ckeVar = new cke((Context) vejVar.getValue(pi7Var, s9fVarArr[0]));
                    OkHttpClient okHttpClient = (OkHttpClient) ((Function0) pi7Var.b.getValue(pi7Var, s9fVarArr[1])).invoke();
                    Context applicationContext = ((Context) vejVar.getValue(pi7Var, s9fVarArr[0])).getApplicationContext();
                    applicationContext.getClass();
                    ru.yandex.video.m3.ab.api.a aVar = new ru.yandex.video.m3.ab.api.a(okHttpClient, new wnd(applicationContext, 8), ckeVar, (x3f) pi7Var.c.getValue(pi7Var, s9fVarArr[2]), ckeVar.b().a);
                    if (!(((m9s) pi7Var.g.getValue(pi7Var, s9fVarArr[5])) instanceof m9s)) {
                        b6e.s();
                        return null;
                    }
                    i1 z2 = pt0.g.z();
                    znk znkVar = new znk(i8, z2);
                    n1 n1Var = new n1(e2, znkVar, aVar, ((Number) pi7Var.f.getValue(pi7Var, s9fVarArr[4])).longValue());
                    int i25 = pi7Var.e;
                    q1 config = z2.getConfig();
                    config.getClass();
                    if (i25 != 0) {
                        pjnVar = i25 != 1 ? new ozw(i2, config) : new ehv(i3);
                    } else {
                        u76 u76Var = new u76();
                        u76Var.b = config;
                        u76Var.a = new AtomicBoolean(true);
                        pjnVar = u76Var;
                    }
                    oi7 oi7Var = new oi7(znkVar, n1Var, pjnVar, (gku) pi7Var.d.getValue(pi7Var, s9fVarArr[3]));
                    this.k = 1;
                    if (rjcVar.emit(oi7Var, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                akw akwVar = (akw) this.n;
                qkw qkwVar = akwVar.h;
                x xVar = (x) this.m;
                nm6 nm6Var13 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    dae daeVar = new dae(24, new HashMap(), xVar);
                    fhl l = xVar.C().l();
                    switch (l == null ? -1 : pci.a[l.ordinal()]) {
                        case -1:
                        case 5:
                        case 6:
                            xabVar = uab.a;
                            break;
                        case 0:
                        default:
                            b6e.s();
                            return null;
                        case 1:
                            com.yandex.media.ynison.service.u l2 = xVar.C().n().l();
                            l2.getClass();
                            com.yandex.media.ynison.service.s k = l2.l() ? l2.k() : null;
                            rse j = l2.j();
                            if (j.isEmpty()) {
                                List A = xVar.A();
                                A.getClass();
                                if (!A.isEmpty()) {
                                    ssg.a(7, "YnisonModels2", "trackSourcesList is empty. playerQueue=" + xVar, null);
                                }
                            }
                            List A2 = xVar.A();
                            A2.getClass();
                            int r = xVar.r();
                            int m = xVar.C().n().m();
                            if (r != A2.size() - 1 && m <= A2.size() - 1) {
                                A2 = CollectionsKt.M(A2);
                            }
                            List list2 = A2;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (gut.F((com.yandex.media.ynison.service.f) it3.next()) != null) {
                                        o4qVar = o4q.a;
                                        o4q o4qVar2 = o4qVar;
                                        if (xVar.v() == 5) {
                                            StationId f = StationId.f(xVar.u());
                                            if (!Intrinsics.d(f, StationId.a)) {
                                                stationId = f;
                                                g = xVar.C().n().n().g();
                                                if (g == null) {
                                                    g = avf.G("restored");
                                                }
                                                g2 = xVar.C().n().o().g();
                                                if (g2 == null) {
                                                    g2 = weo.t();
                                                }
                                                xabVar = new wab(k, j, o4qVar2, stationId, new gxc(g, g2));
                                                break;
                                            }
                                        }
                                        stationId = null;
                                        g = xVar.C().n().n().g();
                                        if (g == null) {
                                        }
                                        g2 = xVar.C().n().o().g();
                                        if (g2 == null) {
                                        }
                                        xabVar = new wab(k, j, o4qVar2, stationId, new gxc(g, g2));
                                    }
                                }
                            }
                            o4qVar = o4q.b;
                            o4q o4qVar22 = o4qVar;
                            if (xVar.v() == 5) {
                            }
                            stationId = null;
                            g = xVar.C().n().n().g();
                            if (g == null) {
                            }
                            g2 = xVar.C().n().o().g();
                            if (g2 == null) {
                            }
                            xabVar = new wab(k, j, o4qVar22, stationId, new gxc(g, g2));
                            break;
                        case 2:
                            String h = xVar.C().k().h();
                            h.getClass();
                            xabVar = new tab(h);
                            break;
                        case 3:
                            String g3 = xVar.C().j().g();
                            g3.getClass();
                            xabVar = new sab(g3);
                            break;
                        case 4:
                            String h2 = xVar.C().m().h();
                            h2.getClass();
                            xabVar = new vab(h2);
                            break;
                    }
                    List A3 = xVar.A();
                    if (A3 != null) {
                        List list3 = A3;
                        r9 = new ArrayList(v75.o(list3, 10));
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            r9.add(daeVar.invoke(it4.next()));
                        }
                    } else {
                        r9 = c5b.a;
                    }
                    w C = xVar.C();
                    C.getClass();
                    com.yandex.media.ynison.service.v n2 = C.s() ? C.n() : null;
                    if (n2 == null || (p = n2.p()) == null) {
                        r11 = c5b.a;
                    } else {
                        r11 = new ArrayList(v75.o(p, 10));
                        Iterator it5 = p.iterator();
                        while (it5.hasNext()) {
                            r11.add(daeVar.invoke(it5.next()));
                        }
                    }
                    u9nVar = new u9n(xabVar, r9, r11);
                    ArrayList arrayList3 = u9nVar.d;
                    qkwVar.getClass();
                    arrayList3.getClass();
                    v3w.l("keep only ", w1g.J(arrayList3), 2, qkw.d, null);
                    ReentrantLock reentrantLock = qkwVar.a;
                    reentrantLock.lock();
                    try {
                        bjt bjtVar = qkwVar.c;
                        HashSet hashSet = new HashSet();
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            hashSet.add(((t9n) it6.next()).a.a);
                        }
                        bjtVar.k(hashSet);
                        reentrantLock.unlock();
                        wzv wzvVar = new wzv(u9nVar, akwVar, r13, i2);
                        this.l = u9nVar;
                        this.k = 1;
                        Q = gld.Q(wzvVar, this);
                        if (Q == nm6Var13) {
                            return nm6Var13;
                        }
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u9n u9nVar2 = (u9n) this.l;
                    qgg.h0(obj);
                    u9nVar = u9nVar2;
                    Q = obj;
                }
                ejw ejwVar = (ejw) Q;
                akwVar.i = u9nVar.d;
                gow gowVar = (gow) this.o;
                c0 c0Var = (c0) this.p;
                List list4 = u9nVar.b;
                List list5 = u9nVar.c;
                String g4 = xVar.x().g();
                if (g4 == null) {
                    g4 = avf.H();
                }
                String g5 = xVar.B().g();
                if (g5 == null) {
                    g5 = weo.t();
                }
                gxc gxcVar = new gxc(g4, g5);
                qkwVar.getClass();
                list4.getClass();
                list5.getClass();
                if (ejwVar == null) {
                    ejwVar = new bjw(new oaq());
                }
                ejw ejwVar2 = ejwVar;
                return new kkw(ejwVar2, qkwVar.c(list4, ejwVar2, gowVar, c0Var, gxcVar), qkwVar.c(list5, ejwVar2, gowVar, c0Var, gxcVar));
            case 15:
                pfm pfmVar3 = (pfm) this.l;
                Object obj4 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    fuw fuwVar = (fuw) this.n;
                    r0w r0wVar = new r0w(i7, fuwVar);
                    tf6 tf6Var = (tf6) this.o;
                    jv jvVar = new jv(28, tf6Var, fuwVar);
                    dxv dxvVar = new dxv(i3, fuwVar);
                    hav havVar = new hav(20, tf6Var, fuwVar);
                    Function1 function1 = (Function1) this.m;
                    itv itvVar = new itv(16, tf6Var, (Function2) this.p);
                    this.l = null;
                    this.k = 1;
                    Object v = xee.v(pfmVar3, new iuw(dxvVar, function1, itvVar, havVar, r0wVar, jvVar, null), this);
                    if (v != obj4) {
                        v = Unit.a;
                    }
                    if (v == obj4) {
                        return obj4;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                k kVar = (k) this.n;
                nm6 nm6Var14 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    String str7 = (String) this.o;
                    String str8 = (String) this.p;
                    int i29 = k.f;
                    b = kVar.b(str7, str8);
                    com.yandex.passport.common.analytics.f fVar = kVar.b;
                    long c3 = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
                    this.l = kVar;
                    this.m = b;
                    this.k = 1;
                    a3 = fVar.a(c3, this);
                    if (a3 == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.common.analytics.a aVar2 = (com.yandex.passport.common.analytics.a) this.m;
                    k kVar2 = (k) this.l;
                    qgg.h0(obj);
                    a3 = obj;
                    b = aVar2;
                    kVar = kVar2;
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) a3;
                int i30 = k.f;
                kVar.getClass();
                b.getClass();
                String str9 = Build.MANUFACTURER;
                str9.getClass();
                Pair pair = new Pair("manufacturer", str9);
                String str10 = Build.MODEL;
                str10.getClass();
                Pair pair2 = new Pair(CommonUrlParts.MODEL, str10);
                Pair pair3 = new Pair(CommonUrlParts.APP_PLATFORM, String.format(Locale.US, "Android %s (%s)", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE, Build.VERSION.CODENAME}, 2)));
                Pair pair4 = new Pair("am_version_name", "7.54.1(754014992)");
                String str11 = b.d;
                Pair pair5 = new Pair(CommonUrlParts.APP_ID, str11);
                String str12 = b.e;
                Pair pair6 = new Pair(CommonUrlParts.APP_VERSION, str12);
                if (!TextUtils.isEmpty(str12)) {
                    str11 = hrg.l(' ', str11, str12);
                }
                Pair pair7 = new Pair("am_app", str11);
                String str13 = bVar.a;
                if (str13 == null) {
                    str13 = null;
                }
                Pair pair8 = new Pair(CommonUrlParts.DEVICE_ID, str13);
                ?? r3 = bVar.b;
                Map unmodifiableMap = Collections.unmodifiableMap(n7w.G(uah.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("uuid", r3 != 0 ? r3 : null))));
                unmodifiableMap.getClass();
                return unmodifiableMap;
            case 17:
                nm6 nm6Var15 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    com.yandex.passport.internal.autologin.ui.h hVar = new com.yandex.passport.internal.autologin.ui.h((com.yandex.passport.internal.autologin.ui.k) this.m, (gm5) this.n, (Context) this.p, (com.yandex.passport.internal.properties.g) this.o);
                    this.k = 1;
                    if (pjcVar.collect(hVar, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                com.yandex.passport.internal.methods.performer.t tVar = (com.yandex.passport.internal.methods.performer.t) this.o;
                b bVar2 = ((r3) this.n).d;
                f fVar2 = (f) this.p;
                nm6 nm6Var16 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    String str14 = (String) bVar2.c;
                    str14.getClass();
                    if (StringsKt.U(str14)) {
                        str14 = null;
                    }
                    if (str14 != null) {
                        if (!StringsKt.M(str14, "://", false)) {
                            str14 = "https://".concat(str14);
                        }
                        com.yandex.passport.common.url.b bVar3 = new com.yandex.passport.common.url.b(str14);
                        if (!com.yandex.passport.common.url.b.n(str14)) {
                            bVar3 = null;
                        }
                        if (bVar3 != null) {
                            str2 = bVar3.a;
                            d = str2 == null ? com.yandex.passport.common.url.b.d(str2) : null;
                            if (d != null) {
                                throw new q((String) bVar2.c);
                            }
                            iVar = e.d;
                            com.yandex.passport.internal.database.auth_cookie.b bVar4 = tVar.a;
                            this.l = d;
                            this.m = iVar;
                            this.k = 1;
                            V3 = x97.V(((com.yandex.passport.common.coroutine.b) bVar4.b).f, new a(bVar4, fVar2, r13, i8), this);
                            if (V3 == nm6Var16) {
                                return nm6Var16;
                            }
                            str3 = d;
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                    if (d != null) {
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iVar = (i) this.m;
                    str3 = (String) this.l;
                    qgg.h0(obj);
                    V3 = obj;
                }
                iVar.getClass();
                e i33 = i.i(str3, (List) V3);
                if (i33 != null) {
                    p pVar = tVar.c;
                    pVar.getClass();
                    pVar.n(c5.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.f(str3, 12));
                    return new com.yandex.passport.internal.entities.c(i33.a, i33.b, str3);
                }
                throw new r("Cookie for uid " + com.yandex.plus.pay.ui.core.b.J(fVar2).b + " for host " + str3 + " not found.");
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
                Object obj5 = nm6.a;
                int i34 = this.k;
                try {
                    if (i34 == 0) {
                        qgg.h0(obj);
                        ?? r12 = (com.yandex.plus.pay.inapp.api.f) this.l;
                        r7o r7oVar4 = z7o.b;
                        com.yandex.plus.pay.internal.feature.payment.inapp.google.d dVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.d) this.n;
                        this.p = r12;
                        this.k = 1;
                        Object a6 = com.yandex.plus.pay.internal.feature.payment.inapp.google.d.a(dVar, r12, this);
                        i34 = r12;
                        break;
                    } else {
                        if (i34 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r13 = (com.yandex.plus.pay.inapp.api.f) this.p;
                        qgg.h0(obj);
                        i34 = r13;
                    }
                    obj5 = Unit.a;
                    r7o r7oVar5 = z7o.b;
                    r1 = i34;
                } catch (wis e3) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar2 = new t7o(e3);
                    i = i34;
                    obj5 = t7oVar2;
                    r1 = i;
                    a4 = z7o.a(obj5);
                    if (a4 != null) {
                    }
                    if (!(obj5 instanceof t7o)) {
                    }
                    if (obj5 instanceof t7o) {
                    }
                    return obj5;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th4) {
                    r7o r7oVar7 = z7o.b;
                    t7oVar2 = new t7o(th4);
                    i = i34;
                    obj5 = t7oVar2;
                    r1 = i;
                    a4 = z7o.a(obj5);
                    if (a4 != null) {
                    }
                    if (!(obj5 instanceof t7o)) {
                    }
                    if (obj5 instanceof t7o) {
                    }
                    return obj5;
                }
                a4 = z7o.a(obj5);
                if (a4 != null) {
                    ((xqn) this.o).a = r1.U(a4);
                }
                if (!(obj5 instanceof t7o)) {
                    obj5 = r1.a;
                }
                if (obj5 instanceof t7o) {
                    return null;
                }
                return obj5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(dzf dzfVar, sdr sdrVar, nbg nbgVar, sdr sdrVar2, cx1 cx1Var, Continuation continuation) {
        super(2, continuation);
        this.j = 12;
        this.m = dzfVar;
        this.l = sdrVar;
        this.n = nbgVar;
        this.o = sdrVar2;
        this.p = cx1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(pjc pjcVar, Continuation continuation, com.yandex.passport.internal.autologin.ui.k kVar, gm5 gm5Var, Context context, com.yandex.passport.internal.properties.g gVar) {
        super(2, continuation);
        this.j = 17;
        this.l = pjcVar;
        this.m = kVar;
        this.n = gm5Var;
        this.p = context;
        this.o = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public inr(hxu hxuVar, a5q a5qVar, Function1 function1, eu7 eu7Var, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.m = hxuVar;
        this.n = a5qVar;
        this.o = (aur) function1;
        this.p = eu7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(Context context, w2r w2rVar, i5f i5fVar, gku gkuVar, Continuation continuation) {
        super(2, continuation);
        this.j = 13;
        this.p = context;
        this.m = w2rVar;
        this.n = i5fVar;
        this.o = gkuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(m mVar, uh uhVar, Parcelable parcelable, Continuation continuation) {
        super(2, continuation);
        this.j = 23;
        this.n = mVar;
        this.o = uhVar;
        this.p = parcelable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inr(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inr(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inr(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(Object obj, Continuation continuation, rjc rjcVar, com.yandex.plus.pay.internal.feature.payment.inapp.google.d dVar, xqn xqnVar) {
        super(2, continuation);
        this.j = 29;
        this.l = obj;
        this.m = rjcVar;
        this.n = dVar;
        this.o = xqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inr(Collection collection, Continuation continuation, com.yandex.plus.home.plaque.repository.rest.o oVar, List list, Map map) {
        super(2, continuation);
        this.j = 27;
        this.m = collection;
        this.n = oVar;
        this.o = list;
        this.p = map;
    }
}
