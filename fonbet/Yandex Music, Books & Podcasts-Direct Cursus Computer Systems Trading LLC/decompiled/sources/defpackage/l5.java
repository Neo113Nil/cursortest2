package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebView;
import com.yandex.music.shared.auth.proto.a;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import retrofit2.Call;

/* loaded from: classes.dex */
public final class l5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(wc wcVar, int i, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.m = wcVar;
        this.k = i;
    }

    private final Object k(Object obj) {
        j1g j1gVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            wn1 wn1Var = ((wm1) this.l).a;
            dn1 dn1Var = (dn1) this.m;
            this.k = 1;
            om1 om1Var = wn1Var.f;
            u51 u51Var = dn1Var.c;
            boolean z = dn1Var.a.f;
            if (z) {
                j1gVar = j1g.b;
            } else {
                if (z) {
                    b6e.s();
                    return null;
                }
                j1gVar = j1g.a;
            }
            j1g j1gVar2 = j1gVar;
            Object f = ((mc1) ((dc1) om1Var.a.getValue())).f(u51Var, j1gVar2, System.currentTimeMillis(), this);
            if (f != nm6Var) {
                f = Unit.a;
            }
            if (f != nm6Var) {
                f = Unit.a;
            }
            if (f == nm6Var) {
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
                return new l5((uoi) this.l, (k4e) this.m, continuation, 0);
            case 1:
                return new l5((uoi) this.l, (l4e) this.m, continuation, 1);
            case 2:
                l5 l5Var = new l5((AccessibilityManager) this.m, continuation, 2);
                l5Var.l = obj;
                return l5Var;
            case 3:
                return new l5((rev) this.l, (aqi) this.m, continuation, 3);
            case 4:
                return new l5((aqi) this.l, (dgv) this.m, continuation, 4);
            case 5:
                l5 l5Var2 = new l5((wc) this.m, this.k, continuation);
                l5Var2.l = obj;
                return l5Var2;
            case 6:
                return new l5((Intent) this.l, (Context) this.m, continuation, 6);
            case 7:
                return new l5((si) this.l, this.m, continuation, 7);
            case 8:
                l5 l5Var3 = new l5((il) this.m, continuation, 8);
                l5Var3.l = obj;
                return l5Var3;
            case 9:
                return new l5((yr) this.l, (String) this.m, continuation, 9);
            case 10:
                return new l5((ss) this.l, (String) this.m, continuation, 10);
            case 11:
                return new l5((hy) this.l, (e10) this.m, continuation, 11);
            case 12:
                return new l5((y40) this.m, continuation, 12);
            case 13:
                return new l5((y40) this.l, (vbc) this.m, continuation, 13);
            case 14:
                return new l5((a60) this.l, (fvf) this.m, continuation, 14);
            case 15:
                return new l5((e60) this.m, continuation, 15);
            case 16:
                return new l5((e60) this.l, (vbc) this.m, continuation, 16);
            case 17:
                return new l5((p90) this.l, (zma) this.m, continuation, 17);
            case 18:
                return new l5((ch0) this.l, (qne) this.m, continuation, 18);
            case 19:
                l5 l5Var4 = new l5((th0) this.m, continuation, 19);
                l5Var4.l = obj;
                return l5Var4;
            case 20:
                l5 l5Var5 = new l5((jhm) this.m, continuation, 20);
                l5Var5.l = obj;
                return l5Var5;
            case 21:
                return new l5((ww0) this.l, (String) this.m, continuation, 21);
            case 22:
                return new l5((b21) this.m, continuation, 22);
            case 23:
                return new l5((c51) this.l, (rce) this.m, continuation, 23);
            case 24:
                return new l5((g51) this.l, (String) this.m, continuation, 24);
            case 25:
                return new l5((o3k) this.l, (aqi) this.m, continuation, 25);
            case 26:
                return new l5((ld1) this.l, (rce) this.m, continuation, 26);
            case 27:
                return new l5((jm1) this.l, (String) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new l5((wm1) this.l, (dn1) this.m, continuation, 28);
            default:
                return new l5((go1) this.l, (Collection) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 19:
                ((l5) create((rne) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((l5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0252, code lost:
    
        if (r2.collect(r5, r20) == r3) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0206, code lost:
    
        if (r5 == r3) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0379, code lost:
    
        if (defpackage.bzf.D(getContext()).P(new defpackage.mp3(7, r3), r20) == r0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04d7, code lost:
    
        if (r0.collect(r3, r20) == r2) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x02cf -> B:116:0x02d3). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fir firVar;
        Object h;
        Object g;
        y40 y40Var;
        Object p;
        e60 e60Var;
        mm6 mm6Var;
        rar y;
        Object c;
        Object f;
        Object a;
        Object g2;
        int i = 5;
        int i2 = 10;
        int i3 = 3;
        int i4 = 6;
        int i5 = 2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    uoi uoiVar = (uoi) this.l;
                    k4e k4eVar = (k4e) this.m;
                    this.k = 1;
                    if (uoiVar.a(k4eVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    uoi uoiVar2 = (uoi) this.l;
                    l4e l4eVar = (l4e) this.m;
                    this.k = 1;
                    if (uoiVar2.a(l4eVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.m;
                ltm ltmVar = (ltm) this.l;
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    gb gbVar = new gb(0, ltmVar);
                    accessibilityManager.addTouchExplorationStateChangeListener(gbVar);
                    hb hbVar = new hb(z2 ? 1 : 0, accessibilityManager, gbVar);
                    this.l = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, hbVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rev revVar = (rev) this.l;
                WebView webView = (WebView) ((aqi) this.m).getValue();
                if (webView == null) {
                    return Unit.a;
                }
                this.k = 1;
                revVar.a(webView, this);
                return nm6Var4;
            case 4:
                aqi aqiVar = (aqi) this.l;
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (((WebView) aqiVar.getValue()) == null) {
                        return Unit.a;
                    }
                    eno s0 = szf.s0(new z3(i4, (dgv) this.m));
                    oc ocVar = new oc(aqiVar, z3 ? 1 : 0);
                    this.k = 1;
                    if (s0.collect(ocVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                a aVar = (a) this.l;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (aVar == null || (firVar = (fir) aVar.m30toBuilder()) == null) {
                    return null;
                }
                wc wcVar = (wc) this.m;
                int i11 = this.k;
                String h2 = wcVar.h();
                firVar.d();
                a aVar2 = (a) firVar.b;
                aVar2.getClass();
                h2.getClass();
                aVar2.a = h2;
                if (wcVar.a() != null) {
                    String a2 = wcVar.a();
                    firVar.d();
                    a aVar3 = (a) firVar.b;
                    aVar3.getClass();
                    a2.getClass();
                    aVar3.g = a2;
                } else {
                    firVar.d();
                    a aVar4 = (a) firVar.b;
                    aVar4.getClass();
                    aVar4.g = a.l.g;
                }
                String b = wcVar.b();
                firVar.d();
                a aVar5 = (a) firVar.b;
                aVar5.getClass();
                b.getClass();
                aVar5.k = b;
                String g3 = wcVar.g();
                firVar.d();
                a aVar6 = (a) firVar.b;
                aVar6.getClass();
                g3.getClass();
                aVar6.c = g3;
                firVar.d();
                ((a) firVar.b).b = i11;
                String str = wcVar.c().a;
                firVar.d();
                a aVar7 = (a) firVar.b;
                aVar7.getClass();
                str.getClass();
                aVar7.i = str;
                boolean j = wcVar.j();
                firVar.d();
                ((a) firVar.b).d = j;
                boolean i12 = wcVar.i();
                firVar.d();
                ((a) firVar.b).e = i12;
                boolean f2 = wcVar.f();
                firVar.d();
                ((a) firVar.b).f = f2;
                boolean d = wcVar.d();
                firVar.d();
                ((a) firVar.b).j = d;
                firVar.d();
                a aVar8 = (a) firVar.b;
                aVar8.getClass();
                aVar8.h = o3d.emptyProtobufList();
                List e = wcVar.e();
                firVar.d();
                a aVar9 = (a) firVar.b;
                rse rseVar = aVar9.h;
                if (!((u8) rseVar).a) {
                    aVar9.h = o3d.mutableCopy(rseVar);
                }
                c8.addAll(e, aVar9.h);
                return (a) firVar.b();
            case 6:
                Intent intent = (Intent) this.l;
                nm6 nm6Var7 = nm6.a;
                int i13 = this.k;
                try {
                    if (i13 == 0) {
                        qgg.h0(obj);
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            throw new IllegalArgumentException("The intent must have action parameters extras.");
                        }
                        Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                        if (bundle == null) {
                            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                        }
                        moi a3 = ng.a(new lg[0]);
                        LinkedHashMap linkedHashMap = a3.a;
                        for (String str2 : bundle.keySet()) {
                            kg kgVar = new kg(str2);
                            Object obj2 = bundle.get(str2);
                            linkedHashMap.get(kgVar);
                            if (obj2 == null) {
                                linkedHashMap.remove(kgVar);
                            } else {
                                linkedHashMap.put(kgVar, obj2);
                            }
                        }
                        if (extras.containsKey("android.widget.extra.CHECKED")) {
                            kg kgVar2 = zsd.k;
                            Boolean valueOf = Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED"));
                            linkedHashMap.get(kgVar2);
                            linkedHashMap.put(kgVar2, valueOf);
                        }
                        String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                        if (string == null) {
                            throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                        }
                        if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                            throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                        }
                        rv0 rv0Var = new rv0(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
                        Context context = (Context) this.m;
                        this.k = 1;
                        Class<?> cls = Class.forName(string);
                        if (!ue.class.isAssignableFrom(cls)) {
                            throw new IllegalStateException("Provided class must implement ActionCallback.");
                        }
                        Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                        newInstance.getClass();
                        Object onAction = ((ue) newInstance).onAction(context, rv0Var, a3, this);
                        if (onAction != nm6.a) {
                            onAction = Unit.a;
                        }
                        if (onAction == nm6Var7) {
                            return nm6Var7;
                        }
                    } else {
                        if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vdr vdrVar = ((si) this.l).a;
                qi qiVar = new qi(this.m, continuation, z4 ? 1 : 0);
                this.k = 1;
                Object h0 = zsd.h0(vdrVar, qiVar, this);
                return h0 == nm6Var8 ? nm6Var8 : h0;
            case 8:
                il ilVar = (il) this.m;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var9 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rar y2 = x97.y(mm6Var2, null, null, new hl(ilVar, continuation, z6 ? 1 : 0), 3);
                    dl dlVar = ilVar.b;
                    mqs mqsVar = ilVar.a;
                    mqsVar.getClass();
                    u21 b2 = ((jul) dlVar.b.getValue()).b(mqsVar);
                    gl glVar = new gl(z5 ? 1 : 0, ilVar, y2);
                    this.l = null;
                    this.k = 1;
                    if (b2.collect(glVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i16 = this.k;
                if (i16 != 0) {
                    if (i16 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yr yrVar = (yr) this.l;
                String str3 = (String) this.m;
                this.k = 1;
                Object d2 = yrVar.d(str3, this);
                return d2 == nm6Var10 ? nm6Var10 : d2;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    ss ssVar = (ss) this.l;
                    String str4 = (String) this.m;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str5 = ((frt) qdcVar.C(I)).c().a;
                    str5.getClass();
                    et etVar = ssVar.a;
                    List c2 = t75.c(str4);
                    this.k = 1;
                    h = etVar.h(str5, c2, this);
                    if (h == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    h = obj;
                }
                return (oq) CollectionsKt.firstOrNull((List) h);
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    String str6 = ((hy) this.l).d;
                    if (str6 != null) {
                        j0q j0qVar = ((e10) this.m).C0;
                        this.k = 1;
                        if (j0qVar.emit(str6, this) == nm6Var12) {
                            return nm6Var12;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                y40 y40Var2 = (y40) this.m;
                jyr jyrVar = y40Var2.o;
                nm6 nm6Var13 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    u40 u40Var = (u40) jyrVar.getValue();
                    this.l = y40Var2;
                    this.k = 1;
                    g = ((v55) u40Var.b.getValue()).g(this);
                    if (g == nm6Var13) {
                        return nm6Var13;
                    }
                    y40Var = y40Var2;
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y40Var = (y40) this.l;
                    qgg.h0(obj);
                    g = obj;
                }
                y40.G(y40Var, (fea) g);
                ox6.B(new u21(i2, y40Var2.l, ((yx4) ((u40) jyrVar.getValue()).a.getValue()).c(null), new w40(3, y40Var2, y40.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0)), ot0.F(y40Var2), new ri(i3, y40Var2));
                return Unit.a;
            case 13:
                y40 y40Var3 = (y40) this.l;
                nm6 nm6Var14 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    z40 z40Var = (z40) y40Var3.p.getValue();
                    vbc vbcVar = (vbc) this.m;
                    z40Var.getClass();
                    fea a4 = z40.a(vbcVar);
                    y40.G(y40Var3, a4);
                    u40 u40Var2 = (u40) y40Var3.o.getValue();
                    this.k = 1;
                    Object a5 = lmm.a(((v55) u40Var2.b.getValue()).r(), new e55(a4, null), this);
                    Object obj3 = a5;
                    if (a5 != nm6Var14) {
                        obj3 = Unit.a;
                    }
                    if (obj3 != nm6Var14) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == nm6Var14) {
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
                    z50 z50Var = ((a60) this.l).j;
                    o50 o50Var = new o50((fvf) this.m, z7 ? 1 : 0);
                    this.k = 1;
                    if (z50Var.collect(o50Var, this) == nm6Var15) {
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
                e60 e60Var2 = (e60) this.m;
                jyr jyrVar2 = e60Var2.o;
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    u50 u50Var = (u50) jyrVar2.getValue();
                    this.l = e60Var2;
                    this.k = 1;
                    p = ((v55) u50Var.b.getValue()).p(this);
                    if (p != nm6Var16) {
                        e60Var = e60Var2;
                    }
                    return nm6Var16;
                }
                if (i22 != 1) {
                    if (i22 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e60 e60Var3 = (e60) this.l;
                qgg.h0(obj);
                e60Var = e60Var3;
                p = obj;
                e60.a(e60Var, (kja) p);
                xdr xdrVar = e60Var2.q;
                xdr xdrVar2 = e60Var2.l;
                yx4 yx4Var = (yx4) ((u50) jyrVar2.getValue()).a.getValue();
                ub7 Q = zsd.Q(xdrVar, xdrVar2, new ez(yx4.y(new pjc[]{((e6q) yx4Var.a).e}, new sx4(yx4Var, z, continuation, z8 ? 1 : 0)), i3), new b60(4, e60Var2, e60.class, "prepareState", "prepareState(Lcom/yandex/music/shared/ui/models/api/filter/CachedTrackFilterType;Ljava/util/List;Lcom/yandex/music/collection/skeleton_blocks/api/downloaded_tracks/CachedFilteredTracks;)Lcom/yandex/music/screen/downloadedmusic/ui/alltracks/AllTracksState;", 4, 0));
                ri riVar = new ri(4, e60Var2);
                this.l = null;
                this.k = 2;
                break;
            case 16:
                e60 e60Var4 = (e60) this.l;
                nm6 nm6Var17 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    h60 h60Var = (h60) e60Var4.p.getValue();
                    vbc vbcVar2 = (vbc) this.m;
                    h60Var.getClass();
                    kja a6 = h60.a(vbcVar2);
                    e60.a(e60Var4, a6);
                    u50 u50Var2 = (u50) e60Var4.o.getValue();
                    this.k = 1;
                    Object a7 = lmm.a(((v55) u50Var2.b.getValue()).r(), new n55(a6, null), this);
                    Object obj4 = a7;
                    if (a7 != nm6Var17) {
                        obj4 = Unit.a;
                    }
                    if (obj4 != nm6Var17) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                p90 p90Var = (p90) this.l;
                nm6 nm6Var18 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    long f3 = yzt.f(p90Var.a1() ? -1.0f : 1.0f, ((zma) this.m).a);
                    float c3 = p90Var.I == bxj.a ? yzt.c(f3) : yzt.b(f3);
                    this.k = 1;
                    if (p90.V0(p90Var, c3, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i24 != 1 && i24 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    d5 d5Var = d5.D;
                    this.k = 1;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xpi i26 = ((ch0) this.l).i();
                if (i26 == null) {
                    return Unit.a;
                }
                ri riVar2 = new ri(i, (qne) this.m);
                this.k = 2;
                ((x0q) i26).collect(riVar2, this);
                return nm6Var19;
            case 19:
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    rne rneVar = (rne) this.l;
                    th0 th0Var = (th0) this.m;
                    this.l = rneVar;
                    this.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(this));
                    zt3Var.s();
                    lcs lcsVar = th0Var.b;
                    muk mukVar = lcsVar.a;
                    mukVar.a();
                    lcsVar.b.set(new pcs(lcsVar, mukVar));
                    zt3Var.u(new al(i4, rneVar, th0Var));
                    if (zt3Var.q() == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 20:
                nm6 nm6Var21 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    mm6Var = (mm6) this.l;
                    if (gld.T(mm6Var)) {
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mm6Var = (mm6) this.l;
                    qgg.h0(obj);
                    jhm jhmVar = (jhm) this.m;
                    int[] iArr = jhmVar.A;
                    int i29 = iArr[0];
                    int i30 = iArr[1];
                    jhmVar.l.getLocationOnScreen(iArr);
                    if (i29 == iArr[0] || i30 != iArr[1]) {
                        jhmVar.u();
                    }
                    if (gld.T(mm6Var)) {
                        d5 d5Var2 = d5.E;
                        this.l = mm6Var;
                        this.k = 1;
                        if (getContext().get(d51.g) != null) {
                            l1j.f();
                            return null;
                        }
                        if (bzf.D(getContext()).P(d5Var2, this) == nm6Var21) {
                            return nm6Var21;
                        }
                        jhm jhmVar2 = (jhm) this.m;
                        int[] iArr2 = jhmVar2.A;
                        int i292 = iArr2[0];
                        int i302 = iArr2[1];
                        jhmVar2.l.getLocationOnScreen(iArr2);
                        if (i292 == iArr2[0]) {
                        }
                        jhmVar2.u();
                        if (gld.T(mm6Var)) {
                            return Unit.a;
                        }
                    }
                }
            case 21:
                ww0 ww0Var = (ww0) this.l;
                nm6 nm6Var22 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    s9f[] s9fVarArr = ww0.e;
                    wb7 wb7Var = (wb7) ww0Var.c.getValue();
                    vw0 vw0Var = new vw0(ww0Var, (String) this.m, null);
                    this.k = 1;
                    if (lmm.a(wb7Var, vw0Var, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                b21 b21Var = (b21) this.m;
                nm6 nm6Var23 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    y = x97.y(b21Var.f, null, null, new hl(b21Var, continuation, i4), 3);
                    ia0 ia0Var = b21Var.b;
                    this.l = y;
                    this.k = 1;
                    c = ((ab1) ((jyr) ia0Var.n).getValue()).c(((c01) ia0Var.a).a, this);
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y = (rar) this.l;
                    qgg.h0(obj);
                    c = obj;
                }
                List list = (List) c;
                if (list == null) {
                    list = c5b.a;
                }
                b21Var.i = list;
                qj1 qj1Var = (qj1) b21Var.h.getValue();
                qj1Var.getClass();
                list.getClass();
                w11 w11Var = qj1Var.b;
                yc4 s02 = zsd.s0(zsd.b0(new ez(((g2q) w11Var.c.getValue()).c.d(w11Var.a.a), i)), new qk(list, qj1Var, continuation, i5));
                gl glVar2 = new gl(i5, b21Var, y);
                this.l = null;
                this.k = 2;
                break;
            case 23:
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 != 0) {
                    if (i33 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cce cceVar = ((c51) this.l).b;
                rce rceVar = (rce) this.m;
                this.k = 1;
                Object a8 = cceVar.a(rceVar, this);
                return a8 == nm6Var24 ? nm6Var24 : a8;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    g51 g51Var = (g51) this.l;
                    String str7 = (String) this.m;
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(frt.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    String str8 = ((frt) qdcVar2.C(I2)).c().a;
                    str8.getClass();
                    p51 p51Var = g51Var.a;
                    List c4 = t75.c(str7);
                    this.k = 1;
                    f = p51Var.f(str8, c4, this);
                    if (f == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    f = obj;
                }
                return (c01) CollectionsKt.firstOrNull((List) f);
            case 25:
                nm6 nm6Var26 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    o3k o3kVar = (o3k) this.l;
                    int b3 = ((v71) ((aqi) this.m).getValue()).b();
                    this.k = 1;
                    if (o3k.g(o3kVar, b3, null, this, 6) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                int i36 = this.k;
                if (i36 != 0) {
                    if (i36 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cce cceVar2 = ((ld1) this.l).c;
                rce rceVar2 = (rce) this.m;
                this.k = 1;
                Object a9 = cceVar2.a(rceVar2, this);
                return a9 == nm6Var27 ? nm6Var27 : a9;
            case 27:
                nm6 nm6Var28 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    z91 z91Var = (z91) ((jm1) this.l).g.getValue();
                    String str9 = (String) this.m;
                    this.k = 1;
                    a = z91Var.a(str9, wh1.a, true, this);
                    if (a == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                rj6 rj6Var = (rj6) a;
                if (rj6Var instanceof qj6) {
                    return ((s91) ((qj6) rj6Var).a).a;
                }
                if (rj6Var instanceof pj6) {
                    throw ((pj6) rj6Var).a();
                }
                b6e.s();
                return null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return k(obj);
            default:
                nm6 nm6Var29 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<ArtistDto>>> d3 = ((go1) this.l).a.d(new o3f((Collection) this.m), "no-cache");
                    this.k = 1;
                    g2 = uwf.g(d3, this);
                    if (g2 == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i38 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g2 = obj;
                }
                rj6 rj6Var2 = (rj6) g2;
                if (!(rj6Var2 instanceof qj6)) {
                    if (rj6Var2 instanceof pj6) {
                        return rj6Var2;
                    }
                    b6e.s();
                    return null;
                }
                List<ArtistDto> list2 = (List) ((qj6) rj6Var2).a;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (ArtistDto artistDto : list2) {
                    arrayList.add(artistDto != null ? lxe.C(artistDto) : null);
                }
                return new qj6(arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
