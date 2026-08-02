package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import com.appsflyer.internal.k;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.passport.api.exception.h;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.internal.account.d;
import com.yandex.passport.internal.credentials.f;
import com.yandex.passport.internal.entities.w;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.network.client.g;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.c;
import com.yandex.passport.internal.report.diary.b0;
import com.yandex.passport.internal.report.diary.e0;
import com.yandex.passport.internal.report.diary.h0;
import com.yandex.passport.internal.report.diary.i0;
import com.yandex.passport.internal.report.diary.j0;
import com.yandex.passport.internal.report.diary.k0;
import com.yandex.passport.internal.report.diary.l0;
import com.yandex.passport.internal.report.diary.m0;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.o9;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.t9;
import com.yandex.passport.internal.report.u9;
import com.yandex.passport.internal.usecase.authorize.m;
import com.yandex.passport.internal.usecase.authorize.o;
import com.yandex.passport.internal.usecase.j2;
import com.yandex.passport.internal.usecase.l2;
import com.yandex.passport.internal.util.p;
import com.yandex.plus.bdui.plus.checkout.content.controller.f0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.x5;
import com.yandex.plus.core.network.api.utils.a;
import com.yandex.plus.home.feature.webviews.internal.container.i;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.uri.j;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public final class y7b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;
    public Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(tur turVar, aqi aqiVar, mur murVar, Object obj, vdr vdrVar, si siVar, wn5 wn5Var, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.l = turVar;
        this.p = aqiVar;
        this.q = murVar;
        this.n = obj;
        this.r = vdrVar;
        this.m = siVar;
        this.o = wn5Var;
    }

    private final Object k(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                throw ouj.e(obj);
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        x0q x0qVar = ((tur) this.l).a;
        fa3 fa3Var = new fa3((aqi) this.p, (mur) this.q, this.n, (vdr) this.r, (si) this.m, (wn5) this.o);
        this.k = 1;
        x0qVar.collect(fa3Var, this);
        return nm6Var;
    }

    private final Object l(Object obj) {
        vts vtsVar = (vts) this.l;
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
        uts utsVar = (uts) vtsVar.b.getValue();
        nbo nboVar = (nbo) vtsVar.a.getValue();
        maa maaVar = (maa) this.p;
        nboVar.getClass();
        qbo qboVar = (qbo) nbo.b(maaVar).a;
        zvs zvsVar = (zvs) this.q;
        be6 be6Var = (be6) this.r;
        vzg vzgVar = (vzg) this.m;
        String str = (String) this.n;
        gy1 gy1Var = (gy1) this.o;
        this.k = 1;
        utsVar.getClass();
        Object V = x97.V(dm6.b, new rts(utsVar, zvsVar, vzgVar, gy1Var, str, be6Var, qboVar, null), this);
        return V == nm6Var ? nm6Var : V;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (r6.emit(r7, r10) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001c, B:9:0x0050, B:15:0x0061, B:17:0x0069, B:25:0x0034, B:27:0x0047), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008b -> B:8:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        rjc rjcVar;
        si3 si3Var;
        rjc rjcVar2;
        si3 si3Var2;
        Object c;
        hw6 hw6Var = (hw6) this.r;
        ContentResolver contentResolver = (ContentResolver) this.p;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                rjcVar = (rjc) this.n;
                contentResolver.registerContentObserver((Uri) this.q, false, hw6Var);
                si3Var = new si3((zi3) this.m);
                this.n = rjcVar;
                this.l = si3Var;
                this.k = 1;
                c = si3Var.c(this);
                if (c != nm6Var) {
                }
            } else if (i == 1) {
                si3Var2 = (si3) this.l;
                rjcVar2 = (rjc) this.n;
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                si3Var2 = (si3) this.l;
                rjcVar2 = (rjc) this.n;
                qgg.h0(obj);
                rjcVar = rjcVar2;
                si3Var = si3Var2;
                this.n = rjcVar;
                this.l = si3Var;
                this.k = 1;
                c = si3Var.c(this);
                if (c != nm6Var) {
                    return nm6Var;
                }
                si3 si3Var3 = si3Var;
                rjcVar2 = rjcVar;
                obj = c;
                si3Var2 = si3Var3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(hw6Var);
                    return Unit.a;
                }
                si3Var2.d();
                Float f = new Float(Settings.Global.getFloat(((Context) this.o).getContentResolver(), "animator_duration_scale", 1.0f));
                this.n = rjcVar2;
                this.l = si3Var2;
                this.k = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(hw6Var);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r11 == r3) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        b bVar;
        g a;
        String str;
        f b;
        Object g;
        String str2;
        w wVar = (w) this.m;
        d dVar = (d) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            bVar = wVar.a;
            a = dVar.a.a(a.L(bVar));
            str = wVar.b;
            x xVar = dVar.c;
            com.yandex.passport.common.core.b L = a.L(bVar);
            b = xVar.b(L);
            if (b == null) {
                throw new h(a.P(L));
            }
            l2 l2Var = dVar.i;
            j2 j2Var = new j2(a.L(bVar), null);
            this.l = bVar;
            this.p = a;
            this.q = str;
            this.r = b;
            this.k = 1;
            g = l2Var.g(j2Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                return obj;
            }
            b = (f) this.r;
            str = (String) this.q;
            a = (g) this.p;
            bVar = (b) this.l;
            qgg.h0(obj);
            g = obj;
        }
        f fVar = b;
        String str3 = str;
        g gVar = a;
        Object obj2 = ((z7o) g).a;
        qgg.h0(obj2);
        com.yandex.passport.internal.network.response.d i2 = gVar.i(str3, false, false, fVar, (String) obj2, null, null);
        boolean z = i2.a;
        String str4 = i2.c;
        ArrayList arrayList = i2.e;
        if (!z || str4 == null || !arrayList.contains(com.yandex.passport.internal.network.response.b.PASSWORD)) {
            List list = i2.f;
            if (list == null || (str2 = (String) list.get(0)) == null) {
                str2 = "start failed";
            }
            throw new com.yandex.passport.data.exceptions.h(str2);
        }
        o oVar = dVar.g;
        m mVar = new m(a.L(bVar), str4, wVar.c, wVar.d, (com.yandex.passport.internal.analytics.a) this.o);
        this.l = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.k = 2;
        Object g2 = oVar.g(mVar, this);
        return g2 == nm6Var ? nm6Var : g2;
    }

    private final Object p(Object obj) {
        String str;
        Uri uri;
        Uri uri2 = (Uri) this.r;
        com.yandex.passport.internal.links.g gVar = (com.yandex.passport.internal.links.g) this.q;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                g0 g0Var = gVar.s;
                g0Var.getClass();
                uri2.getClass();
                g0Var.n(t9.d, new c(uri2));
                String queryParameter = uri2.getQueryParameter("pay_session_id");
                String str2 = "";
                if (queryParameter == null) {
                    queryParameter = "";
                }
                String queryParameter2 = uri2.getQueryParameter("pay_url");
                if (queryParameter2 != null) {
                    str2 = queryParameter2;
                }
                Uri parse = Uri.parse(str2);
                com.yandex.passport.internal.links.g.L(gVar, parse);
                com.yandex.passport.internal.report.d dVar = gVar.x;
                dVar.getClass();
                dVar.d = new c("pay_session_id", queryParameter);
                l lVar = (l) this.m;
                com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) this.n;
                this.l = queryParameter;
                this.p = parse;
                this.k = 1;
                Object M = com.yandex.passport.internal.links.g.M(gVar, lVar, lVar2, this);
                if (M == nm6Var) {
                    return nm6Var;
                }
                str = queryParameter;
                obj = M;
                uri = parse;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.p;
                str = (String) this.l;
                qgg.h0(obj);
            }
            g0 g0Var2 = gVar.s;
            g0Var2.getClass();
            g0Var2.p(u9.d);
            gVar.z.m(new com.yandex.passport.internal.links.b(uri, (l) obj, str, (String) this.o));
        } catch (Exception e) {
            g0 g0Var3 = gVar.s;
            g0Var3.getClass();
            g0Var3.n(o9.d, new ff(e));
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x010c, code lost:
    
        if (r11 == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0079, code lost:
    
        if (r11 == r2) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        String str;
        Object a;
        Object k;
        m0 m0Var = (m0) this.r;
        l0 l0Var = (l0) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            String str2 = (String) this.q;
            if (str2 == null) {
                if (l0Var instanceof k0) {
                    str2 = ((k0) l0Var).a.a;
                } else if (l0Var instanceof h0) {
                    str2 = "AccountNotAuthorized";
                } else if (l0Var instanceof i0) {
                    str2 = "Autologin";
                } else {
                    if (!(l0Var instanceof j0)) {
                        b6e.s();
                        return null;
                    }
                    str2 = "AutologinRetry";
                }
            }
            str = str2;
            e0 e0Var = m0Var.c;
            m0Var.b.getClass();
            com.yandex.passport.internal.database.diary.a aVar = new com.yandex.passport.internal.database.diary.a(str, System.currentTimeMillis(), true);
            this.p = null;
            this.l = str;
            this.k = 1;
            a = e0Var.a(aVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.l;
            qgg.h0(obj);
            a = ((z7o) obj).a;
        }
        Bundle bundle = (Bundle) this.o;
        r7o r7oVar = z7o.b;
        if (!(a instanceof t7o)) {
            b0 b0Var = m0Var.d;
            this.p = null;
            this.l = null;
            this.n = a;
            this.k = 2;
            b0Var.getClass();
            if (l0Var instanceof h0) {
                com.yandex.passport.internal.properties.b bVar = (com.yandex.passport.internal.properties.b) k.h(bundle, p.class, "account-not-authorized-properties");
                if (bVar == null) {
                    xq0.q("no account-not-authorized-properties key in bundle");
                    return null;
                }
                k = b0Var.c(str, "AccountNotAuthorizedProperties", bVar, this);
                if (k != nm6Var) {
                    k = Unit.a;
                }
                if (k != nm6Var) {
                    k = Unit.a;
                }
            } else if (l0Var instanceof i0) {
                com.yandex.passport.internal.properties.g gVar = (com.yandex.passport.internal.properties.g) k.h(bundle, p.class, "passport-auto-login-properties");
                if (gVar == null) {
                    xq0.q("Bundle has no ".concat(com.yandex.passport.internal.properties.g.class.getSimpleName()));
                    return null;
                }
                k = b0Var.f(str, "AutoLoginProperties", gVar, this);
                if (k != nm6Var) {
                    k = Unit.a;
                }
                if (k != nm6Var) {
                    k = Unit.a;
                }
            } else if (l0Var instanceof j0) {
                k = b0Var.g(str, bundle, this);
                if (k != nm6Var) {
                    k = Unit.a;
                }
            } else {
                if (!(l0Var instanceof k0)) {
                    b6e.s();
                    return null;
                }
                k = b0Var.k(str, ((k0) l0Var).a, bundle, this);
                if (k != nm6Var) {
                    k = Unit.a;
                }
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r5 == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (defpackage.y2x.o(r12, r17) == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj) {
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar;
        Object g;
        Object e;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar2;
        CharSequence charSequence;
        Object g2;
        CharSequence charSequence2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar3;
        CharSequence charSequence3;
        PlusPayRichText plusPayRichText;
        CharSequence charSequence4;
        Object g3;
        CharSequence charSequence5;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar4;
        f0 f0Var = (f0) this.m;
        com.yandex.plus.log.api.b bVar2 = f0Var.f;
        x5 x5Var = (x5) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar5)) {
                bVar2.c(aVar5, "PlusPayPresaleContentController", hrg.m(x5Var.b, " ms", new StringBuilder("setDelayedOfferSuggestion() waiting ")));
            }
            long j = x5Var.b;
            this.k = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.l;
                    qgg.h0(obj);
                    g = obj;
                    CharSequence charSequence6 = (CharSequence) g;
                    com.yandex.plus.bdui.plus.checkout.content.m mVar = x5Var.d;
                    this.l = aVar;
                    this.p = charSequence6;
                    this.k = 3;
                    e = f0.e(f0Var, mVar, this);
                    if (e != nm6Var) {
                        aVar2 = aVar;
                        charSequence = charSequence6;
                        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b) e;
                        PlusPayRichText plusPayRichText2 = x5Var.e;
                        this.l = aVar2;
                        this.p = charSequence;
                        this.q = bVar3;
                        this.k = 4;
                        g2 = f0Var.g(plusPayRichText2, this);
                        if (g2 != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i == 3) {
                    charSequence = (CharSequence) this.p;
                    aVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.l;
                    qgg.h0(obj);
                    e = obj;
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar32 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b) e;
                    PlusPayRichText plusPayRichText22 = x5Var.e;
                    this.l = aVar2;
                    this.p = charSequence;
                    this.q = bVar32;
                    this.k = 4;
                    g2 = f0Var.g(plusPayRichText22, this);
                    if (g2 != nm6Var) {
                        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar6 = aVar2;
                        charSequence2 = charSequence;
                        bVar = bVar32;
                        aVar3 = aVar6;
                        charSequence3 = (CharSequence) g2;
                        plusPayRichText = x5Var.f;
                        if (plusPayRichText != null) {
                        }
                    }
                    return nm6Var;
                }
                if (i != 4) {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence7 = (CharSequence) this.r;
                    bVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b) this.q;
                    charSequence5 = (CharSequence) this.p;
                    aVar4 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.l;
                    qgg.h0(obj);
                    charSequence3 = charSequence7;
                    g3 = obj;
                    charSequence4 = (CharSequence) g3;
                    charSequence2 = charSequence5;
                    aVar3 = aVar4;
                    aVar3.h(charSequence2, bVar, charSequence3, charSequence4);
                    return Unit.a;
                }
                bVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b) this.q;
                charSequence2 = (CharSequence) this.p;
                aVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.l;
                qgg.h0(obj);
                g2 = obj;
                charSequence3 = (CharSequence) g2;
                plusPayRichText = x5Var.f;
                if (plusPayRichText != null) {
                    charSequence4 = null;
                    aVar3.h(charSequence2, bVar, charSequence3, charSequence4);
                    return Unit.a;
                }
                this.l = aVar3;
                this.p = charSequence2;
                this.q = bVar;
                this.r = charSequence3;
                this.k = 5;
                g3 = f0Var.g(plusPayRichText, this);
                if (g3 != nm6Var) {
                    charSequence5 = charSequence2;
                    aVar4 = aVar3;
                    charSequence4 = (CharSequence) g3;
                    charSequence2 = charSequence5;
                    aVar3 = aVar4;
                    aVar3.h(charSequence2, bVar, charSequence3, charSequence4);
                    return Unit.a;
                }
                return nm6Var;
            }
            qgg.h0(obj);
        }
        com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar7)) {
            bVar2.c(aVar7, "PlusPayPresaleContentController", "setDelayedOfferSuggestion(); set presale offer suggestion loadingText=" + x5Var.c + ", suggestionContent=" + x5Var.d + ", originalOfferButtonText=" + x5Var.e + ", legalText=" + x5Var.f);
        }
        aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.o;
        PlusPayRichText plusPayRichText3 = x5Var.c;
        this.l = aVar;
        this.k = 2;
        g = f0Var.g(plusPayRichText3, this);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new y7b((c8b) this.l, (xqn) this.p, (xqn) this.q, (rce) this.m, this.n, (xqn) this.r, (hib) this.o, continuation);
            case 1:
                return new y7b((c8b) this.l, (rce) this.m, this.n, (rwj) this.p, (hib) this.o, (xwh) this.q, (mr1) this.r, continuation);
            case 2:
                y7b y7bVar = new y7b((hqi) this.r, (zue) this.m, (Function1) this.o, continuation);
                y7bVar.q = obj;
                return y7bVar;
            case 3:
                y7b y7bVar2 = new y7b((hqi) this.r, (ave) this.m, (Function1) this.o, continuation);
                y7bVar2.q = obj;
                return y7bVar2;
            case 4:
                return new y7b((fkg) this.m, (String) this.n, (String) this.o, continuation, 4);
            case 5:
                return new y7b((j6i) this.r, (mqs) this.m, (String) this.n, (Function1) this.o, continuation);
            case 6:
                y7b y7bVar3 = new y7b((hqi) this.r, (mqi) this.m, (Function1) this.o, continuation);
                y7bVar3.q = obj;
                return y7bVar3;
            case 7:
                return new y7b((k1l) this.l, (anx) this.p, (g4q) this.q, (g4q) this.r, (PlaybackCommand$QueueLaunch) this.m, (ii3) this.n, (Integer) this.o, continuation, 7);
            case 8:
                return new y7b((ujm) this.o, continuation, 8);
            case 9:
                y7b y7bVar4 = new y7b((Function0) this.o, continuation, 9);
                y7bVar4.m = obj;
                return y7bVar4;
            case 10:
                return new y7b((tur) this.l, (aqi) this.p, (mur) this.q, this.n, (vdr) this.r, (si) this.m, (wn5) this.o, continuation);
            case 11:
                return new y7b((vts) this.l, (maa) this.p, (zvs) this.q, (be6) this.r, (vzg) this.m, (String) this.n, (gy1) this.o, continuation, 11);
            case 12:
                y7b y7bVar5 = new y7b((ContentResolver) this.p, (Uri) this.q, (hw6) this.r, (zi3) this.m, (Context) this.o, continuation);
                y7bVar5.n = obj;
                return y7bVar5;
            case 13:
                return new y7b((w) this.m, (d) this.n, (com.yandex.passport.internal.analytics.a) this.o, continuation, 13);
            case 14:
                return new y7b((com.yandex.passport.internal.links.g) this.q, (Uri) this.r, (l) this.m, (com.yandex.passport.internal.properties.l) this.n, (String) this.o, continuation);
            case 15:
                y7b y7bVar6 = new y7b((String) this.q, (m0) this.r, (l0) this.m, (Bundle) this.o, continuation);
                y7bVar6.p = obj;
                return y7bVar6;
            case 16:
                return new y7b((f0) this.m, (x5) this.n, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.o, continuation, 16);
            default:
                return new y7b((t) this.p, (j) this.q, (String) this.r, (String) this.m, (Map) this.n, (String) this.o, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 9:
                ((y7b) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 10:
                ((y7b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((y7b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0315, code lost:
    
        r10 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.t.e(r0, r9, r2, r3, r4, r8, r13, r7, r28) == r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04a6, code lost:
    
        if (defpackage.anx.p(r0, r1, r2, r3, r4, r28) == r6) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0463, code lost:
    
        if (r1 == r6) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.t.g(r0, r9, r2, r3, r1, r8, r6, r28) == r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0706, code lost:
    
        if (r4 == r2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x06c5, code lost:
    
        if (r7 == r2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06b4, code lost:
    
        if (r6 == r2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.t.i(r0, r9, r2, r1, r4, r11, r8, r13, r6, r28) == r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.t.f(r0, r9, r1, r3, r4, r8, r6, r13, r8, r28) == r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        if (r8 == r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0050, code lost:
    
        if (r7 == r12) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0329 A[LOOP:0: B:90:0x0265->B:107:0x0329, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0267 A[Catch: all -> 0x0196, TryCatch #11 {all -> 0x0196, blocks: (B:82:0x0191, B:84:0x0249, B:89:0x0262, B:91:0x0267, B:94:0x0270, B:96:0x0285, B:98:0x0293, B:100:0x029d, B:105:0x02c6, B:110:0x02d5, B:116:0x02ef, B:118:0x02f8, B:128:0x0325, B:129:0x0328, B:132:0x02ae, B:141:0x02b9, B:148:0x01b8, B:151:0x01d7, B:112:0x02e4, B:115:0x02ec, B:124:0x0321, B:125:0x0324), top: B:76:0x0171, inners: #16 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v112, types: [h5n] */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int, oqi] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int, oqi] */
    /* JADX WARN: Type inference failed for: r2v69, types: [int, oqi] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97, types: [h5n] */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v31, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0314 -> B:80:0x0315). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Unit unit;
        vkn f;
        Bitmap bitmap;
        boolean z;
        xue xueVar;
        oqi oqiVar;
        ?? r4;
        zue zueVar;
        zue zueVar2;
        xue xueVar2;
        Object invoke;
        oqi oqiVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        yue yueVar;
        oqi oqiVar3;
        ?? r42;
        ave aveVar;
        ave aveVar2;
        yue yueVar2;
        Object invoke2;
        oqi oqiVar4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        Object b;
        String str;
        Object b2;
        Object c2;
        String str2;
        String str3;
        Collection collection;
        List w0;
        Object b3;
        Object b4;
        String str4;
        String str5;
        String str6;
        List list;
        String str7;
        x3n x3nVar;
        String str8;
        Object V;
        mqs mqsVar;
        qe5 qe5Var;
        Function1 function1;
        kqi kqiVar;
        oqi oqiVar5;
        mqi mqiVar;
        mqi mqiVar2;
        kqi kqiVar2;
        Object invoke3;
        oqi oqiVar6;
        AtomicReference atomicReference5;
        AtomicReference atomicReference6;
        Object h0;
        String w;
        Object a;
        String str9;
        ArrayList arrayList;
        String str10;
        jzb jzbVar;
        xdr xdrVar;
        rjc rjcVar;
        Function1 hxoVar;
        h5n h5nVar;
        upi upiVar;
        lc4 lc4Var;
        Object obj2;
        Object obj3;
        Set set;
        int i;
        upi upiVar2;
        long j;
        Object a2;
        com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar;
        Object g0;
        int i2 = 10;
        ?? r2 = 6;
        int i3 = 0;
        int i4 = 2;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                c8b c8bVar = (c8b) this.l;
                r3r r3rVar = (r3r) ((xqn) this.p).a;
                on5 on5Var = (on5) ((xqn) this.q).a;
                rce rceVar = (rce) this.m;
                Object obj4 = this.n;
                rwj rwjVar = (rwj) ((xqn) this.r).a;
                hib hibVar = (hib) this.o;
                this.k = 1;
                Object b5 = c8b.b(c8bVar, r3rVar, on5Var, rceVar, obj4, rwjVar, hibVar, this);
                return b5 == nm6Var ? nm6Var : b5;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    c8b c8bVar2 = (c8b) this.l;
                    rce rceVar2 = (rce) this.m;
                    Object obj5 = this.n;
                    rwj rwjVar2 = (rwj) this.p;
                    hib hibVar2 = (hib) this.o;
                    this.k = 1;
                    c = c8b.c(c8bVar2, rceVar2, obj5, rwjVar2, hibVar2, this);
                    if (c == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                v7b v7bVar = (v7b) c;
                czr czrVar = ((c8b) this.l).b;
                synchronized (czrVar) {
                    try {
                        skn sknVar = (skn) czrVar.a.get();
                        if (sknVar != null) {
                            if (czrVar.b == null) {
                                Context context = sknVar.a;
                                czrVar.b = context;
                                context.registerComponentCallbacks(czrVar);
                            }
                            unit = Unit.a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            czrVar.b();
                        }
                    } finally {
                    }
                }
                mka mkaVar = ((c8b) this.l).d;
                xwh xwhVar = (xwh) this.q;
                if (((rce) this.m).q.b && (f = ((skn) mkaVar.a).f()) != null && xwhVar != null) {
                    Drawable drawable = v7bVar.a;
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(v7bVar.b));
                        String str11 = v7bVar.d;
                        if (str11 != null) {
                            linkedHashMap.put("coil#disk_cache_key", str11);
                        }
                        f.a.q(new xwh(xwhVar.a, xee.M(xwhVar.b)), bitmap, xee.M(linkedHashMap));
                        z = true;
                        Drawable drawable2 = v7bVar.a;
                        rce rceVar3 = (rce) this.m;
                        bb7 bb7Var = v7bVar.c;
                        xwh xwhVar2 = !z ? (xwh) this.q : null;
                        String str12 = v7bVar.d;
                        boolean z2 = v7bVar.b;
                        mr1 mr1Var = (mr1) this.r;
                        Bitmap.Config[] configArr = k.a;
                        return new bqr(drawable2, rceVar3, bb7Var, xwhVar2, str12, z2, mr1Var == null && mr1Var.a);
                    }
                }
                z = false;
                Drawable drawable22 = v7bVar.a;
                rce rceVar32 = (rce) this.m;
                bb7 bb7Var2 = v7bVar.c;
                if (!z) {
                }
                String str122 = v7bVar.d;
                boolean z22 = v7bVar.b;
                mr1 mr1Var2 = (mr1) this.r;
                Bitmap.Config[] configArr2 = k.a;
                return new bqr(drawable22, rceVar32, bb7Var2, xwhVar2, str122, z22, mr1Var2 == null && mr1Var2.a);
            case 2:
                zue zueVar3 = (zue) this.m;
                nm6 nm6Var3 = nm6.a;
                ?? r22 = this.k;
                try {
                    try {
                        if (r22 == 0) {
                            qgg.h0(obj);
                            mm6 mm6Var = (mm6) this.q;
                            hqi hqiVar = (hqi) this.r;
                            CoroutineContext.Element element = mm6Var.getCoroutineContext().get(o6c.l);
                            element.getClass();
                            xue xueVar3 = new xue(hqiVar, (r2f) element);
                            AtomicReference atomicReference7 = zueVar3.a;
                            while (true) {
                                xue xueVar4 = (xue) atomicReference7.get();
                                if (xueVar4 != null && xueVar3.a.compareTo(xueVar4.a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference7.compareAndSet(xueVar4, xueVar3)) {
                                    if (atomicReference7.get() != xueVar4) {
                                        break;
                                    }
                                }
                                if (xueVar4 != null) {
                                    xueVar4.b.g(null);
                                }
                                qqi qqiVar = zueVar3.b;
                                aur aurVar = (aur) this.o;
                                this.q = xueVar3;
                                this.l = qqiVar;
                                this.n = aurVar;
                                this.p = zueVar3;
                                this.k = 1;
                                if (qqiVar.a(this) != nm6Var3) {
                                    xueVar = xueVar3;
                                    oqiVar = qqiVar;
                                    r4 = aurVar;
                                }
                            }
                        } else {
                            if (r22 != 1) {
                                if (r22 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                zueVar2 = (zue) this.n;
                                oqiVar2 = (oqi) this.l;
                                xueVar2 = (xue) this.q;
                                try {
                                    qgg.h0(obj);
                                    invoke = obj;
                                    atomicReference2 = zueVar2.a;
                                    while (!atomicReference2.compareAndSet(xueVar2, null) && atomicReference2.get() == xueVar2) {
                                    }
                                    oqiVar2.b(null);
                                    return invoke;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = zueVar2.a;
                                    while (!atomicReference.compareAndSet(xueVar2, null) && atomicReference.get() == xueVar2) {
                                    }
                                    throw th;
                                }
                            }
                            zueVar3 = (zue) this.p;
                            Function1 function12 = (Function1) this.n;
                            oqiVar = (oqi) this.l;
                            xue xueVar5 = (xue) this.q;
                            qgg.h0(obj);
                            xueVar = xueVar5;
                            r4 = function12;
                        }
                        this.q = xueVar;
                        this.l = oqiVar;
                        this.n = zueVar;
                        this.p = null;
                        this.k = 2;
                        invoke = r4.invoke(this);
                        if (invoke != nm6Var3) {
                            zueVar2 = zueVar;
                            oqiVar2 = oqiVar;
                            xueVar2 = xueVar;
                            atomicReference2 = zueVar2.a;
                            while (!atomicReference2.compareAndSet(xueVar2, null)) {
                            }
                            oqiVar2.b(null);
                            return invoke;
                        }
                        return nm6Var3;
                    } catch (Throwable th2) {
                        th = th2;
                        zueVar2 = zueVar;
                        xueVar2 = xueVar;
                        atomicReference = zueVar2.a;
                        while (!atomicReference.compareAndSet(xueVar2, null)) {
                        }
                        throw th;
                    }
                    zueVar = zueVar3;
                } finally {
                }
                break;
            case 3:
                ave aveVar3 = (ave) this.m;
                nm6 nm6Var4 = nm6.a;
                ?? r23 = this.k;
                try {
                    try {
                        if (r23 == 0) {
                            qgg.h0(obj);
                            mm6 mm6Var2 = (mm6) this.q;
                            hqi hqiVar2 = (hqi) this.r;
                            CoroutineContext.Element element2 = mm6Var2.getCoroutineContext().get(o6c.l);
                            element2.getClass();
                            yue yueVar3 = new yue(hqiVar2, (r2f) element2);
                            AtomicReference atomicReference8 = aveVar3.a;
                            while (true) {
                                yue yueVar4 = (yue) atomicReference8.get();
                                if (yueVar4 != null && yueVar3.a.compareTo(yueVar4.a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference8.compareAndSet(yueVar4, yueVar3)) {
                                    if (atomicReference8.get() != yueVar4) {
                                        break;
                                    }
                                }
                                if (yueVar4 != null) {
                                    yueVar4.b.g(null);
                                }
                                qqi qqiVar2 = aveVar3.b;
                                aur aurVar2 = (aur) this.o;
                                this.q = yueVar3;
                                this.l = qqiVar2;
                                this.n = aurVar2;
                                this.p = aveVar3;
                                this.k = 1;
                                if (qqiVar2.a(this) != nm6Var4) {
                                    yueVar = yueVar3;
                                    oqiVar3 = qqiVar2;
                                    r42 = aurVar2;
                                }
                            }
                        } else {
                            if (r23 != 1) {
                                if (r23 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                aveVar2 = (ave) this.n;
                                oqiVar4 = (oqi) this.l;
                                yueVar2 = (yue) this.q;
                                try {
                                    qgg.h0(obj);
                                    invoke2 = obj;
                                    atomicReference4 = aveVar2.a;
                                    while (!atomicReference4.compareAndSet(yueVar2, null) && atomicReference4.get() == yueVar2) {
                                    }
                                    oqiVar4.b(null);
                                    return invoke2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    atomicReference3 = aveVar2.a;
                                    while (!atomicReference3.compareAndSet(yueVar2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            aveVar3 = (ave) this.p;
                            Function1 function13 = (Function1) this.n;
                            oqiVar3 = (oqi) this.l;
                            yue yueVar5 = (yue) this.q;
                            qgg.h0(obj);
                            yueVar = yueVar5;
                            r42 = function13;
                        }
                        this.q = yueVar;
                        this.l = oqiVar3;
                        this.n = aveVar;
                        this.p = null;
                        this.k = 2;
                        invoke2 = r42.invoke(this);
                        if (invoke2 != nm6Var4) {
                            aveVar2 = aveVar;
                            oqiVar4 = oqiVar3;
                            yueVar2 = yueVar;
                            atomicReference4 = aveVar2.a;
                            while (!atomicReference4.compareAndSet(yueVar2, null)) {
                            }
                            oqiVar4.b(null);
                            return invoke2;
                        }
                        return nm6Var4;
                    } catch (Throwable th4) {
                        th = th4;
                        aveVar2 = aveVar;
                        yueVar2 = yueVar;
                        atomicReference3 = aveVar2.a;
                        while (!atomicReference3.compareAndSet(yueVar2, null) && atomicReference3.get() == yueVar2) {
                        }
                        throw th;
                    }
                    aveVar = aveVar3;
                } finally {
                }
                break;
            case 4:
                String str13 = (String) this.n;
                fkg fkgVar = (fkg) this.m;
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    b = fkg.b(fkgVar, str13, "idForFrom", this);
                    break;
                } else if (i7 == 1) {
                    qgg.h0(obj);
                    b = obj;
                } else {
                    if (i7 == 2) {
                        str = (String) this.l;
                        qgg.h0(obj);
                        b2 = obj;
                        String str14 = (String) b2;
                        this.l = str;
                        this.p = str14;
                        this.k = 3;
                        c2 = fkg.c(fkgVar, str13, "seeds", this);
                        if (c2 != nm6Var5) {
                            str2 = str;
                            str3 = str14;
                            collection = (Collection) c2;
                            if (collection != null) {
                            }
                        }
                        return nm6Var5;
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            String str15 = (String) this.r;
                            list = (List) this.q;
                            str5 = (String) this.p;
                            str6 = (String) this.l;
                            qgg.h0(obj);
                            str4 = str15;
                            b4 = obj;
                            String str16 = (String) b4;
                            str7 = (String) this.o;
                            if (str7 == null && !Intrinsics.d(str16, str7)) {
                                return null;
                            }
                            s9p E = o8g.E(list);
                            if (str6 == null) {
                                str6 = o8g.t(E);
                            }
                            String str17 = str6;
                            if (str5 == null) {
                                str5 = "";
                            }
                            return new yku(E, str17, str5, str4, xku.b);
                        }
                        List list2 = (List) this.q;
                        str3 = (String) this.p;
                        str2 = (String) this.l;
                        qgg.h0(obj);
                        w0 = list2;
                        b3 = obj;
                        String str18 = (String) b3;
                        this.l = str2;
                        this.p = str3;
                        this.q = w0;
                        this.r = str18;
                        this.k = 5;
                        b4 = fkg.b(fkgVar, str13, "sessionId", this);
                        if (b4 != nm6Var5) {
                            str4 = str18;
                            str5 = str3;
                            str6 = str2;
                            list = w0;
                            String str162 = (String) b4;
                            str7 = (String) this.o;
                            if (str7 == null) {
                            }
                            s9p E2 = o8g.E(list);
                            if (str6 == null) {
                            }
                            String str172 = str6;
                            if (str5 == null) {
                            }
                            return new yku(E2, str172, str5, str4, xku.b);
                        }
                        return nm6Var5;
                    }
                    str3 = (String) this.p;
                    str2 = (String) this.l;
                    qgg.h0(obj);
                    c2 = obj;
                    collection = (Collection) c2;
                    if (collection != null) {
                        return null;
                    }
                    if (collection.isEmpty()) {
                        collection = null;
                    }
                    if (collection != null && (w0 = CollectionsKt.w0(collection)) != null) {
                        this.l = str2;
                        this.p = str3;
                        this.q = w0;
                        this.k = 4;
                        b3 = fkg.b(fkgVar, str13, "waveDescription", this);
                        break;
                    } else {
                        return null;
                    }
                }
                str = (String) b;
                this.l = str;
                this.k = 2;
                b2 = fkg.b(fkgVar, str13, "name", this);
                break;
            case 5:
                j6i j6iVar = (j6i) this.r;
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    x3nVar = j6iVar.a;
                    j7i j7iVar = j6iVar.b;
                    str8 = j7iVar.y;
                    mqs mqsVar2 = (mqs) this.m;
                    this.l = x3nVar;
                    this.p = str8;
                    this.q = mqsVar2;
                    this.k = 1;
                    V = x97.V(dm6.b, new d7i(j7iVar, continuation, 0), this);
                    if (V == nm6Var6) {
                        return nm6Var6;
                    }
                    mqsVar = mqsVar2;
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqsVar = (mqs) this.q;
                    String str19 = (String) this.p;
                    x3nVar = (x3n) this.l;
                    qgg.h0(obj);
                    str8 = str19;
                    V = obj;
                }
                List list3 = (List) V;
                n5p n5pVar = j6iVar.r;
                String str20 = (String) this.n;
                x3nVar.getClass();
                str8.getClass();
                mqsVar.getClass();
                list3.getClass();
                str20.getClass();
                c3x.C((androidx.fragment.app.t) x3nVar.a);
                z1p Q = p1g.Q(n5pVar);
                if (Q == null) {
                    qe5Var = x3nVar.e0(str8, str20, list3);
                } else {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(e.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    qe5 h = l3l.h(new ru.yandex.music.common.media.context.g(Page.SEARCH, str8).h(), list3, ((kxi) x3nVar.c).a(str20));
                    h.j = new tb(Q);
                    qe5Var = h;
                }
                int indexOf = list3.indexOf(mqsVar);
                qe5Var.g = mqsVar;
                qe5Var.e = indexOf;
                ((Function1) this.o).invoke(x3nVar.D0(qe5Var.b(), mqsVar));
                return Unit.a;
            case 6:
                mqi mqiVar3 = (mqi) this.m;
                nm6 nm6Var7 = nm6.a;
                ?? r24 = this.k;
                try {
                    try {
                        if (r24 == 0) {
                            qgg.h0(obj);
                            mm6 mm6Var3 = (mm6) this.q;
                            hqi hqiVar3 = (hqi) this.r;
                            CoroutineContext.Element element3 = mm6Var3.getCoroutineContext().get(o6c.l);
                            element3.getClass();
                            kqi kqiVar3 = new kqi(hqiVar3, (r2f) element3);
                            mqi.a(mqiVar3, kqiVar3);
                            qqi qqiVar3 = mqiVar3.b;
                            function1 = (Function1) this.o;
                            this.q = kqiVar3;
                            this.l = qqiVar3;
                            this.n = function1;
                            this.p = mqiVar3;
                            this.k = 1;
                            if (qqiVar3.a(this) != nm6Var7) {
                                kqiVar = kqiVar3;
                                oqiVar5 = qqiVar3;
                            }
                            return nm6Var7;
                        }
                        if (r24 != 1) {
                            if (r24 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mqiVar2 = (mqi) this.n;
                            oqiVar6 = (oqi) this.l;
                            kqiVar2 = (kqi) this.q;
                            try {
                                qgg.h0(obj);
                                invoke3 = obj;
                                atomicReference6 = mqiVar2.a;
                                while (!atomicReference6.compareAndSet(kqiVar2, null) && atomicReference6.get() == kqiVar2) {
                                }
                                oqiVar6.b(null);
                                return invoke3;
                            } catch (Throwable th5) {
                                th = th5;
                                atomicReference5 = mqiVar2.a;
                                while (!atomicReference5.compareAndSet(kqiVar2, null) && atomicReference5.get() == kqiVar2) {
                                }
                                throw th;
                            }
                        }
                        mqiVar3 = (mqi) this.p;
                        Function1 function14 = (Function1) this.n;
                        oqiVar5 = (oqi) this.l;
                        kqi kqiVar4 = (kqi) this.q;
                        qgg.h0(obj);
                        kqiVar = kqiVar4;
                        function1 = function14;
                        this.q = kqiVar;
                        this.l = oqiVar5;
                        this.n = mqiVar;
                        this.p = null;
                        this.k = 2;
                        invoke3 = function1.invoke(this);
                        if (invoke3 != nm6Var7) {
                            mqiVar2 = mqiVar;
                            oqiVar6 = oqiVar5;
                            kqiVar2 = kqiVar;
                            atomicReference6 = mqiVar2.a;
                            while (!atomicReference6.compareAndSet(kqiVar2, null)) {
                            }
                            oqiVar6.b(null);
                            return invoke3;
                        }
                        return nm6Var7;
                    } catch (Throwable th6) {
                        th = th6;
                        mqiVar2 = mqiVar;
                        kqiVar2 = kqiVar;
                        atomicReference5 = mqiVar2.a;
                        while (!atomicReference5.compareAndSet(kqiVar2, null)) {
                        }
                        throw th;
                    }
                    mqiVar = mqiVar3;
                } finally {
                }
            case 7:
                Integer num = (Integer) this.o;
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, k1l.i, "waiting for batchId=" + num + " to finish", null);
                    x0q x0qVar = (x0q) ((k1l) this.l).g.g;
                    seg segVar = new seg(num, continuation, 15);
                    this.k = 1;
                    h0 = zsd.h0(x0qVar, segVar, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    h0 = obj;
                }
                boolean z3 = ((v1o) h0).b;
                ssg.a(3, k1l.i, "batchId=" + num + " finished with result=" + z3, null);
                if (!z3) {
                    return Unit.a;
                }
                anx anxVar = (anx) this.p;
                g4q g4qVar = (g4q) this.q;
                g4q g4qVar2 = (g4q) this.r;
                PlaybackCommand$QueueLaunch playbackCommand$QueueLaunch = (PlaybackCommand$QueueLaunch) this.m;
                ii3 ii3Var = (ii3) this.n;
                this.k = 2;
                break;
            case 8:
                ujm ujmVar = (ujm) this.o;
                kjm kjmVar = ujmVar.k;
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    List list4 = kjmVar.a;
                    ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        u51 L = ghh.L((ljm) it.next());
                        arrayList2.add(new r91(new q91(L.b, vz1.w(kg5.M(L.c, WebPath$Storage.AVATARS)), false), L));
                    }
                    xdr xdrVar2 = ujmVar.p;
                    w = vz1.w(kjmVar.e);
                    String str21 = kjmVar.f;
                    jzb jzbVar2 = kjmVar.l;
                    njm njmVar = ujmVar.l;
                    Date date = kjmVar.c;
                    njmVar.getClass();
                    date.getClass();
                    String L2 = saf.L(date);
                    this.l = xdrVar2;
                    this.p = w;
                    this.q = str21;
                    this.r = jzbVar2;
                    this.m = L2;
                    this.n = arrayList2;
                    this.k = 1;
                    a = ujm.a(ujmVar, this);
                    if (a == nm6Var9) {
                        return nm6Var9;
                    }
                    str9 = L2;
                    arrayList = arrayList2;
                    str10 = str21;
                    jzbVar = jzbVar2;
                    xdrVar = xdrVar2;
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList3 = (ArrayList) this.n;
                    String str22 = (String) this.m;
                    jzb jzbVar3 = (jzb) this.r;
                    String str23 = (String) this.q;
                    w = (String) this.p;
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                    arrayList = arrayList3;
                    str9 = str22;
                    jzbVar = jzbVar3;
                    str10 = str23;
                    a = obj;
                }
                rjm rjmVar = new rjm(w, str10, jzbVar, str9, arrayList, (List) a);
                xdrVar.getClass();
                xdrVar.m(null, rjmVar);
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i11 = this.k;
                try {
                    if (i11 == 0) {
                        qgg.h0(obj);
                        rjcVar = (rjc) this.m;
                        upi upiVar3 = new upi();
                        hxoVar = new hxo(i2, upiVar3);
                        zi3 g = men.g(Integer.MAX_VALUE, 6, null);
                        q2r q2rVar = new q2r(i3, g);
                        sfm sfmVar = g2r.a;
                        g2r.f(dpo.X);
                        synchronized (g2r.b) {
                            g2r.g = CollectionsKt.h0((Collection) g2r.g, q2rVar);
                        }
                        h5n h5nVar2 = new h5n(11, q2rVar);
                        try {
                            b2r u = g2r.k().u(hxoVar);
                            Function0 function0 = (Function0) this.o;
                            try {
                                b2r j2 = u.j();
                                try {
                                    Object invoke4 = function0.invoke();
                                    u.c();
                                    this.m = rjcVar;
                                    this.l = upiVar3;
                                    this.p = hxoVar;
                                    this.q = g;
                                    this.r = h5nVar2;
                                    this.n = invoke4;
                                    this.k = 1;
                                    if (rjcVar.emit(invoke4, this) != nm6Var10) {
                                        h5nVar = h5nVar2;
                                        upiVar = upiVar3;
                                        lc4Var = g;
                                        obj2 = invoke4;
                                    }
                                    return nm6Var10;
                                } finally {
                                    b2r.q(j2);
                                }
                            } finally {
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            r2 = h5nVar2;
                            r2.b();
                            throw th;
                        }
                    }
                    if (i11 == 1) {
                        obj2 = this.n;
                        h5n h5nVar3 = (h5n) this.r;
                        lc4Var = (lc4) this.q;
                        hxoVar = (Function1) this.p;
                        upiVar = (upi) this.l;
                        rjcVar = (rjc) this.m;
                        qgg.h0(obj);
                        h5nVar = h5nVar3;
                    } else if (i11 == 2) {
                        obj2 = this.n;
                        h5n h5nVar4 = (h5n) this.r;
                        lc4Var = (lc4) this.q;
                        hxoVar = (Function1) this.p;
                        upiVar = (upi) this.l;
                        rjcVar = (rjc) this.m;
                        qgg.h0(obj);
                        obj3 = obj;
                        r2 = h5nVar4;
                        set = (Set) obj3;
                        i = i3;
                        while (true) {
                            if (i != 0) {
                                Object[] objArr = upiVar.b;
                                long[] jArr = upiVar.a;
                                int length = jArr.length - i4;
                                if (length >= 0) {
                                    int i12 = i3;
                                    while (true) {
                                        long j3 = jArr[i12];
                                        upiVar2 = upiVar;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                if ((j3 & 255) < 128) {
                                                    j = j3;
                                                    if (set.contains(objArr[(i12 << 3) + i14])) {
                                                    }
                                                } else {
                                                    j = j3;
                                                }
                                                j3 = j >> 8;
                                            }
                                            if (i13 != 8) {
                                            }
                                        }
                                        if (i12 != length) {
                                            i12++;
                                            upiVar = upiVar2;
                                        }
                                    }
                                } else {
                                    upiVar2 = upiVar;
                                }
                                i = 0;
                                set = (Set) gd4.b(lc4Var.k());
                                if (set != null) {
                                    upiVar = upiVar2;
                                    i3 = 0;
                                    i4 = 2;
                                } else {
                                    if (i != 0) {
                                        upiVar2.c();
                                        b2r u2 = g2r.k().u(hxoVar);
                                        Function0 function02 = (Function0) this.o;
                                        try {
                                            try {
                                                Object invoke5 = function02.invoke();
                                                u2.c();
                                                if (!Intrinsics.d(invoke5, obj2)) {
                                                    this.m = rjcVar;
                                                    upiVar = upiVar2;
                                                    this.l = upiVar;
                                                    this.p = hxoVar;
                                                    this.q = lc4Var;
                                                    this.r = r2;
                                                    this.n = invoke5;
                                                    this.k = 3;
                                                    if (rjcVar.emit(invoke5, this) != nm6Var10) {
                                                        obj2 = invoke5;
                                                    }
                                                    return nm6Var10;
                                                }
                                                i3 = 0;
                                                i4 = 2;
                                                h5nVar = r2;
                                            } catch (Throwable th8) {
                                                throw th8;
                                            }
                                            b2r j4 = u2.j();
                                        } finally {
                                        }
                                    }
                                    upiVar = upiVar2;
                                    i3 = 0;
                                    i4 = 2;
                                    h5nVar = r2;
                                }
                            } else {
                                upiVar2 = upiVar;
                            }
                            i = 1;
                            set = (Set) gd4.b(lc4Var.k());
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i11 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.n;
                        r2 = (h5n) this.r;
                        lc4Var = (lc4) this.q;
                        hxoVar = (Function1) this.p;
                        upiVar = (upi) this.l;
                        rjcVar = (rjc) this.m;
                        qgg.h0(obj);
                        i3 = 0;
                        i4 = 2;
                        h5nVar = r2;
                    }
                    this.m = rjcVar;
                    this.l = upiVar;
                    this.p = hxoVar;
                    this.q = lc4Var;
                    this.r = h5nVar;
                    this.n = obj2;
                    this.k = i4;
                    obj3 = lc4Var.l(this);
                    r2 = h5nVar;
                    if (obj3 == nm6Var10) {
                        return nm6Var10;
                    }
                    set = (Set) obj3;
                    i = i3;
                    while (true) {
                        if (i != 0) {
                        }
                        i = 1;
                        set = (Set) gd4.b(lc4Var.k());
                        if (set != null) {
                        }
                        upiVar = upiVar2;
                        i3 = 0;
                        i4 = 2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r2.b();
                    throw th;
                }
                break;
            case 10:
                return k(obj);
            case 11:
                return l(obj);
            case 12:
                return n(obj);
            case 13:
                return o(obj);
            case 14:
                return p(obj);
            case 15:
                return q(obj);
            case 16:
                return s(obj);
            default:
                t tVar = (t) this.p;
                String str24 = (String) this.r;
                nm6 nm6Var11 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        com.yandex.plus.home.payment.google.d dVar = tVar.l;
                        this.k = 1;
                        a2 = dVar.c.a(new com.yandex.plus.home.payment.google.a(dVar, continuation, i3), this);
                        break;
                    case 1:
                        qgg.h0(obj);
                        a2 = obj;
                        aVar = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) a2;
                        bca bcaVar = new bca(tVar.J, 18);
                        this.l = aVar;
                        this.k = 2;
                        g0 = zsd.g0(bcaVar, this);
                        break;
                    case 2:
                        aVar = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) this.l;
                        qgg.h0(obj);
                        g0 = obj;
                        zne zneVar = (zne) g0;
                        i iVar = new i(tVar.n, tVar.o, null, null, null);
                        j jVar = (j) this.q;
                        if (!(jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.b)) {
                            com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar2 = aVar;
                            if (!(jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.f)) {
                                if (!(jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.g)) {
                                    if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.e) {
                                        com.yandex.plus.home.feature.webviews.internal.uri.e eVar = (com.yandex.plus.home.feature.webviews.internal.uri.e) jVar;
                                        String str25 = str24 != null ? str24 : "";
                                        String str26 = (String) this.m;
                                        Map map = (Map) this.n;
                                        boolean z4 = eVar.b;
                                        this.l = null;
                                        this.k = 6;
                                        break;
                                    } else if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.a) {
                                        tVar.K.removeView(tVar.L);
                                        tVar.p(zneVar, null);
                                    } else if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.c) {
                                        tVar.o(((com.yandex.plus.home.feature.webviews.internal.uri.c) jVar).a);
                                    } else {
                                        if (!(jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.h)) {
                                            b6e.s();
                                            return null;
                                        }
                                        tVar.o(((com.yandex.plus.home.feature.webviews.internal.uri.h) jVar).a);
                                    }
                                    return Unit.a;
                                }
                                com.yandex.plus.home.feature.webviews.internal.uri.g gVar = (com.yandex.plus.home.feature.webviews.internal.uri.g) jVar;
                                String str27 = str24 == null ? "" : str24;
                                String str28 = (String) this.m;
                                Map map2 = (Map) this.n;
                                String str29 = (String) this.o;
                                this.l = null;
                                this.k = 5;
                                break;
                            } else {
                                com.yandex.plus.home.feature.webviews.internal.uri.f fVar = (com.yandex.plus.home.feature.webviews.internal.uri.f) jVar;
                                String str30 = str24 == null ? "" : str24;
                                String str31 = (String) this.m;
                                Map map3 = (Map) this.n;
                                this.l = null;
                                this.k = 4;
                                break;
                            }
                        } else {
                            com.yandex.plus.home.feature.webviews.internal.uri.b bVar = (com.yandex.plus.home.feature.webviews.internal.uri.b) jVar;
                            String str32 = str24 == null ? "" : str24;
                            String str33 = (String) this.m;
                            Map map4 = (Map) this.n;
                            this.l = null;
                            this.k = 3;
                            break;
                        }
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(c8b c8bVar, xqn xqnVar, xqn xqnVar2, rce rceVar, Object obj, xqn xqnVar3, hib hibVar, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.l = c8bVar;
        this.p = xqnVar;
        this.q = xqnVar2;
        this.m = rceVar;
        this.n = obj;
        this.r = xqnVar3;
        this.o = hibVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(j6i j6iVar, mqs mqsVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.r = j6iVar;
        this.m = mqsVar;
        this.n = str;
        this.o = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y7b(hqi hqiVar, zue zueVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.r = hqiVar;
        this.m = zueVar;
        this.o = (aur) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y7b(hqi hqiVar, ave aveVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.r = hqiVar;
        this.m = aveVar;
        this.o = (aur) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(hqi hqiVar, mqi mqiVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.r = hqiVar;
        this.m = mqiVar;
        this.o = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(c8b c8bVar, rce rceVar, Object obj, rwj rwjVar, hib hibVar, xwh xwhVar, mr1 mr1Var, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = c8bVar;
        this.m = rceVar;
        this.n = obj;
        this.p = rwjVar;
        this.o = hibVar;
        this.q = xwhVar;
        this.r = mr1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(ContentResolver contentResolver, Uri uri, hw6 hw6Var, zi3 zi3Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.j = 12;
        this.p = contentResolver;
        this.q = uri;
        this.r = hw6Var;
        this.m = zi3Var;
        this.o = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(com.yandex.passport.internal.links.g gVar, Uri uri, l lVar, com.yandex.passport.internal.properties.l lVar2, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 14;
        this.q = gVar;
        this.r = uri;
        this.m = lVar;
        this.n = lVar2;
        this.o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(t tVar, j jVar, String str, String str2, Map map, String str3, Continuation continuation) {
        super(2, continuation);
        this.j = 17;
        this.p = tVar;
        this.q = jVar;
        this.r = str;
        this.m = str2;
        this.n = map;
        this.o = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.m = obj5;
        this.n = obj6;
        this.o = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7b(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7b(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7b(String str, m0 m0Var, l0 l0Var, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.j = 15;
        this.q = str;
        this.r = m0Var;
        this.m = l0Var;
        this.o = bundle;
    }
}
