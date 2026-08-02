package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.t;
import com.yandex.passport.api.g;
import com.yandex.passport.api.h;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.properties.g0;
import com.yandex.passport.internal.ui.bouncer.roundabout.n;
import com.yandex.plus.adapter.auth.passport750.i;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.locale.b;
import com.yandex.plus.home.dailyquests.feature.internal.ui.c;
import com.yandex.plus.home.feature.webviews.internal.treasury.d;
import com.yandex.plus.home.plaque.feature.api.context.a;
import com.yandex.plus.home.plaque.feature.internal.e;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class gfl implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gfl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r10.a(r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:24:0x0062, B:30:0x0079), top: B:23:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v2, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(zgl zglVar, Continuation continuation) {
        xnl xnlVar;
        nm6 nm6Var;
        int i;
        uol uolVar;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object p;
        try {
            if (continuation instanceof xnl) {
                xnlVar = (xnl) continuation;
                int i3 = xnlVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xnlVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = xnlVar.n;
                    nm6Var = nm6.a;
                    i = xnlVar.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        uolVar = (uol) this.b;
                        qqiVar = uolVar.g;
                        xnlVar.j = zglVar;
                        xnlVar.k = qqiVar;
                        xnlVar.l = uolVar;
                        i2 = 0;
                        xnlVar.m = 0;
                        xnlVar.p = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = xnlVar.k;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = xnlVar.m;
                        uolVar = xnlVar.l;
                        ?? r4 = xnlVar.k;
                        zgl zglVar2 = xnlVar.j;
                        qgg.h0(obj);
                        i2 = i4;
                        zglVar = zglVar2;
                        qqiVar = r4;
                    }
                    xdh xdhVar = uolVar.d;
                    xnlVar.j = null;
                    xnlVar.k = qqiVar;
                    xnlVar.l = null;
                    xnlVar.m = i2;
                    xnlVar.p = 2;
                    p = ((b9l) xdhVar.d).p(zglVar, xnlVar);
                    if (p == nm6Var) {
                        p = Unit.a;
                    }
                    if (p != nm6Var) {
                        oqiVar = qqiVar;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            xdh xdhVar2 = uolVar.d;
            xnlVar.j = null;
            xnlVar.k = qqiVar;
            xnlVar.l = null;
            xnlVar.m = i2;
            xnlVar.p = 2;
            p = ((b9l) xdhVar2.d).p(zglVar, xnlVar);
            if (p == nm6Var) {
            }
            if (p != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar2 = qqiVar;
            th = th3;
            oqiVar = qqiVar2;
            oqiVar.b(null);
            throw th;
        }
        xnlVar = new xnl(this, continuation);
        Object obj2 = xnlVar.n;
        nm6Var = nm6.a;
        i = xnlVar.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0202, code lost:
    
        if (r2 == r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b8, code lost:
    
        if (r0 == r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        if (r0 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        if (r8 == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r2 == r9) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[Catch: IOException -> 0x009f, TRY_ENTER, TryCatch #0 {IOException -> 0x009f, blocks: (B:40:0x009a, B:42:0x00f8, B:53:0x00e4), top: B:29:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(xxq xxqVar, Continuation continuation) {
        i6m i6mVar;
        int i;
        String str;
        Object d;
        Throwable a;
        e6n e6nVar;
        int i2;
        wb7 c;
        Object g0;
        Object V;
        gyp gypVar;
        int i3;
        xdr xdrVar;
        xxq xxqVar2 = xxqVar;
        int i4 = this.a;
        int i5 = 2;
        Object obj = this.b;
        int i6 = 1;
        Continuation continuation2 = null;
        switch (i4) {
            case 7:
                j6m j6mVar = (j6m) obj;
                z6m z6mVar = j6mVar.b;
                if (continuation instanceof i6m) {
                    i6mVar = (i6m) continuation;
                    int i7 = i6mVar.m;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        i6mVar.m = i7 - Integer.MIN_VALUE;
                        Object obj2 = i6mVar.k;
                        nm6 nm6Var = nm6.a;
                        i = i6mVar.m;
                        if (i != 0) {
                            qgg.h0(obj2);
                            ssg.a(4, "PlusDevicesCenter", "start device registration", null);
                            g gVar = (g) j6mVar.e.getValue();
                            str = "PlusDevicesCenter";
                            z1 d2 = b.d((h) ((hvl) j6mVar.a.b).invoke(), Long.parseLong(xxqVar2.a));
                            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(d2.a);
                            b.getClass();
                            g0 g0Var = new g0(new z1(b, d2.b), "music", "plus");
                            i6mVar.m = 1;
                            d = gVar.d(g0Var, i6mVar);
                            break;
                        } else if (i == 1) {
                            qgg.h0(obj2);
                            d = ((z7o) obj2).a;
                            str = "PlusDevicesCenter";
                        } else if (i == 2) {
                            d = i6mVar.j;
                            qgg.h0(obj2);
                            str = "PlusDevicesCenter";
                            ssg.a(4, str, "device registered successfully", null);
                            a = z7o.a(d);
                            if (a != null) {
                            }
                        } else if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            d = i6mVar.j;
                            qgg.h0(obj2);
                            str = "PlusDevicesCenter";
                            ssg.a(4, str, "device register failed, no limits", null);
                            a = z7o.a(d);
                            if (a != null) {
                                ssg.a(6, str, "device registered failure: " + a, null);
                            }
                            break;
                        }
                        r7o r7oVar = z7o.b;
                        if (!(d instanceof t7o)) {
                            boolean booleanValue = ((Boolean) d).booleanValue();
                            xdr xdrVar2 = j6mVar.h;
                            if (!booleanValue) {
                                xdrVar2.getClass();
                                xdrVar2.m(null, r6m.a);
                                i6mVar.j = d;
                                i6mVar.m = 3;
                                Object c2 = z6mVar.c(true, i6mVar);
                                if (c2 != nm6Var) {
                                    c2 = Unit.a;
                                    break;
                                }
                            } else {
                                xdrVar2.getClass();
                                xdrVar2.m(null, s6m.a);
                                i6mVar.j = d;
                                i6mVar.m = 2;
                                Object c3 = z6mVar.c(false, i6mVar);
                                if (c3 != nm6Var) {
                                    c3 = Unit.a;
                                    break;
                                }
                            }
                            break;
                        }
                        a = z7o.a(d);
                        if (a != null) {
                        }
                    }
                }
                i6mVar = new i6m(this, continuation);
                Object obj22 = i6mVar.k;
                nm6 nm6Var2 = nm6.a;
                i = i6mVar.m;
                if (i != 0) {
                }
                r7o r7oVar2 = z7o.b;
                if (!(d instanceof t7o)) {
                }
                a = z7o.a(d);
                if (a != null) {
                }
                break;
            case 21:
                f6n f6nVar = (f6n) obj;
                try {
                    if (continuation instanceof e6n) {
                        e6nVar = (e6n) continuation;
                        int i8 = e6nVar.n;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            e6nVar.n = i8 - Integer.MIN_VALUE;
                            Object obj3 = e6nVar.l;
                            nm6 nm6Var3 = nm6.a;
                            i2 = e6nVar.n;
                            Continuation continuation3 = null;
                            if (i2 != 0) {
                                qgg.h0(obj3);
                                if (!xxqVar2.a()) {
                                    break;
                                } else {
                                    c = ((dc7) f6nVar.a).c(xxqVar2.a, "quality_settings_migration");
                                    pjc data = c.getData();
                                    e6nVar.j = xxqVar2;
                                    e6nVar.k = c;
                                    e6nVar.n = 1;
                                    g0 = zsd.g0(data, e6nVar);
                                    break;
                                }
                            } else if (i2 == 1) {
                                wb7 wb7Var = e6nVar.k;
                                xxq xxqVar3 = e6nVar.j;
                                qgg.h0(obj3);
                                c = wb7Var;
                                xxqVar2 = xxqVar3;
                                g0 = obj3;
                            } else if (i2 == 2) {
                                xxqVar2 = e6nVar.j;
                                qgg.h0(obj3);
                                xxq xxqVar4 = xxqVar2;
                                i6n i6nVar = f6nVar.c;
                                i7q i7qVar = i7q.f;
                                e6nVar.j = null;
                                e6nVar.k = null;
                                e6nVar.n = 3;
                                V = x97.V(dm6.b, new n71(i6nVar, xxqVar4, i7qVar, continuation3, 27), e6nVar);
                                if (V != nm6Var3) {
                                    V = Unit.a;
                                    break;
                                }
                            } else if (i2 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                qgg.h0(obj3);
                                break;
                            }
                            if (ec7.a((hmm) g0, "is_migration_done") == null) {
                                z0i z0iVar = new z0i(i5, 14, continuation3);
                                e6nVar.j = xxqVar2;
                                e6nVar.k = null;
                                e6nVar.n = 2;
                                obj3 = lmm.a(c, z0iVar, e6nVar);
                                if (obj3 == nm6Var3) {
                                    break;
                                }
                                xxq xxqVar42 = xxqVar2;
                                i6n i6nVar2 = f6nVar.c;
                                i7q i7qVar2 = i7q.f;
                                e6nVar.j = null;
                                e6nVar.k = null;
                                e6nVar.n = 3;
                                V = x97.V(dm6.b, new n71(i6nVar2, xxqVar42, i7qVar2, continuation3, 27), e6nVar);
                                if (V != nm6Var3) {
                                }
                            }
                        }
                    }
                    if (i2 != 0) {
                    }
                    if (ec7.a((hmm) g0, "is_migration_done") == null) {
                    }
                } catch (IOException e) {
                    ssg.a(6, "QualitySettingsMigration", "IOException in QualitySettingsMigration", e);
                    return Unit.a;
                }
                e6nVar = new e6n(this, continuation);
                Object obj32 = e6nVar.l;
                nm6 nm6Var32 = nm6.a;
                i2 = e6nVar.n;
                Continuation continuation32 = null;
                break;
            default:
                if (continuation instanceof gyp) {
                    gypVar = (gyp) continuation;
                    int i9 = gypVar.m;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        gypVar.m = i9 - Integer.MIN_VALUE;
                        Object obj4 = gypVar.k;
                        nm6 nm6Var4 = nm6.a;
                        i3 = gypVar.m;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            hyp hypVar = (hyp) obj;
                            xdr xdrVar3 = hypVar.d;
                            rk rkVar = hypVar.b;
                            gypVar.j = xdrVar3;
                            gypVar.m = 1;
                            Object V2 = x97.V(dm6.b, new qi(rkVar, xxqVar2, continuation2, i6), gypVar);
                            if (V2 == nm6Var4) {
                                break;
                            } else {
                                obj4 = V2;
                                xdrVar = xdrVar3;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            xdrVar = gypVar.j;
                            qgg.h0(obj4);
                        }
                        xdrVar.l(obj4);
                        break;
                    }
                }
                gypVar = new gyp(this, continuation);
                Object obj42 = gypVar.k;
                nm6 nm6Var42 = nm6.a;
                i3 = gypVar.m;
                if (i3 != 0) {
                }
                xdrVar.l(obj42);
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Long] */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        Object obj3;
        pmn pmnVar;
        int i = 5;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        switch (this.a) {
            case 0:
                ((mfl) this.b).b.l((jfl) obj);
                return Unit.a;
            case 1:
                tb1 tb1Var = (tb1) obj;
                if (tb1Var instanceof sb1) {
                    sb1 sb1Var = (sb1) tb1Var;
                    ssg.a(3, "ArtistInformersFeature", "init with config: Enabled(title=" + sb1Var.a + "): " + sb1Var.b, null);
                    ofl.a((ofl) this.b, sb1Var.b);
                } else if (tb1Var instanceof qb1) {
                    ssg.a(3, "ArtistInformersFeature", "init with config: Debug(UNLIMITED)", null);
                    ofl.a((ofl) this.b, ((qb1) tb1Var).a);
                } else {
                    if (!(tb1Var instanceof rb1)) {
                        b6e.s();
                        return null;
                    }
                    if (((ofl) this.b).b.isInitialized()) {
                        ssg.a(3, "ArtistInformersFeature", hrg.q("release with config: Disabled(title=", ((rb1) tb1Var).a, ")"), null);
                        ofl oflVar = (ofl) this.b;
                        efl eflVar = (efl) oflVar.b.getValue();
                        if (eflVar.f.d.a()) {
                            eflVar.f.V();
                            xdr xdrVar = eflVar.i;
                            lel lelVar = lel.a;
                            xdrVar.getClass();
                            xdrVar.m(null, lelVar);
                        }
                        r2f r2fVar = (r2f) oflVar.d.getValue(oflVar, ofl.e[0]);
                        if (r2fVar != null) {
                            r2fVar.g(null);
                        }
                    }
                }
                return Unit.a;
            case 2:
                return b((zgl) obj, continuation);
            case 3:
                bwl bwlVar = (bwl) this.b;
                bwlVar.g.l(null);
                String str = ((xxq) obj).a;
                str.getClass();
                Object b = bwl.b(bwlVar, str, continuation);
                return b == nm6.a ? b : Unit.a;
            case 4:
                t requireActivity = ((gzl) this.b).requireActivity();
                requireActivity.getClass();
                ((Function1) obj).invoke(requireActivity);
                return Unit.a;
            case 5:
                ((a3m) this.b).a.finish();
                return Unit.a;
            case 6:
                v02 v02Var = (v02) obj;
                ((i) ((o5m) this.b).a.getValue()).b.l(v02Var != null ? new Long(v02Var.a) : null);
                return Unit.a;
            case 7:
                return c((xxq) obj, continuation);
            case 8:
                vk vkVar = (vk) obj;
                j6m j6mVar = (j6m) ((jyr) ((xdh) this.b).d).getValue();
                j6mVar.getClass();
                if (Intrinsics.d(vkVar, uk.a)) {
                    ssg.a(4, "PlusDevicesCenter", "device manager: registered successfully", null);
                    xdr xdrVar2 = j6mVar.h;
                    s6m s6mVar = s6m.a;
                    xdrVar2.getClass();
                    xdrVar2.m(null, s6mVar);
                    obj2 = j6mVar.b.c(false, continuation);
                    nm6 nm6Var = nm6.a;
                    if (obj2 != nm6Var) {
                        obj2 = Unit.a;
                    }
                    if (obj2 != nm6Var) {
                        obj2 = Unit.a;
                    }
                } else {
                    if (Intrinsics.d(vkVar, sk.a)) {
                        ssg.a(4, "PlusDevicesCenter", "device manager: registered cancelled", null);
                    } else {
                        if (!(vkVar instanceof tk)) {
                            b6e.s();
                            return null;
                        }
                        v3w.l("device manager: registered failed: ", ((tk) vkVar).a.getMessage(), 6, "PlusDevicesCenter", null);
                    }
                    obj2 = Unit.a;
                }
                Object obj4 = obj2;
                return obj4 == nm6.a ? obj4 : Unit.a;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                com.yandex.plus.home.plaque.plugin.internal.proxy.i iVar = ((ysk) ((g9m) this.b).l.getValue()).a;
                Map b2 = tah.b(new Pair("notification_available", bool));
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                b2.getClass();
                a aVar = new a(b2, e5bVar, e5bVar);
                e eVar = (e) iVar.a.getValue();
                eVar.getClass();
                tf6 tf6Var = eVar.g;
                ((com.yandex.plus.core.dispatcher.a) eVar.h).getClass();
                x97.y(tf6Var, com.yandex.plus.core.dispatcher.a.d, null, new d(eVar, aVar, r11, i), 2);
                return Unit.a;
            case 10:
                if (((t9m) obj) instanceof r9m) {
                    ((aam) this.b).b.a.requireActivity().finish();
                }
                return Unit.a;
            case 11:
                ((tam) this.b).l.l((ram) obj);
                return Unit.a;
            case 12:
                u0s u0sVar = (u0s) obj;
                rbm rbmVar = (rbm) this.b;
                rbmVar.getClass();
                u0sVar.getClass();
                rbmVar.e.b().h(u0sVar);
                return Unit.a;
            case 13:
                t requireActivity2 = ((qbm) this.b).requireActivity();
                requireActivity2.getClass();
                ((Function1) obj).invoke(requireActivity2);
                return Unit.a;
            case 14:
                zcm zcmVar = (zcm) this.b;
                xdr xdrVar3 = zcmVar.b;
                t2i t2iVar = t2i.d;
                xdrVar3.getClass();
                xdrVar3.m(null, t2iVar);
                zcmVar.d = true;
                return Unit.a;
            case 15:
                ((uem) this.b).k.l((yem) obj);
                return Unit.a;
            case 16:
                ou0 ou0Var = (ou0) obj;
                xos xosVar = (xos) this.b;
                ou0Var.getClass();
                int ordinal = ou0Var.ordinal();
                if (ordinal == 0) {
                    xosVar.a().setBackgroundResource(R.color.bg_primary_night);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    xosVar.a().setBackgroundResource(R.color.bg_primary_day);
                }
                return Unit.a;
            case 17:
                boolean z = ((q5k) obj) instanceof p5k;
                gum gumVar = (gum) this.b;
                q13 q13Var = gumVar.h;
                q13 q13Var2 = gumVar.g;
                if (z) {
                    s9f[] s9fVarArr = gum.n;
                    wxf.K((View) q13Var2.a(s9fVarArr[5]), true);
                    wxf.K((View) q13Var.a(s9fVarArr[6]), false);
                } else {
                    s9f[] s9fVarArr2 = gum.n;
                    wxf.K((View) q13Var2.a(s9fVarArr2[5]), false);
                    wxf.K((View) q13Var.a(s9fVarArr2[6]), true);
                }
                return Unit.a;
            case 18:
                soq soqVar = (soq) obj;
                nwm nwmVar = (nwm) this.b;
                fwm fwmVar = nwmVar.h;
                jyr jyrVar = nwmVar.j;
                if (Intrinsics.d(soqVar, qoq.a)) {
                    bx bxVar = (bx) jyrVar.getValue();
                    String str2 = fwmVar.b.a;
                    b80 G = men.G(fwmVar.a);
                    bxVar.getClass();
                    str2.getClass();
                    if (bxVar.c.getValue() instanceof xw) {
                        bxVar.a(str2, G);
                    }
                } else {
                    if (!(soqVar instanceof roq)) {
                        b6e.s();
                        return null;
                    }
                    int i5 = ((roq) soqVar).a;
                    t63 t63Var = nwmVar.f;
                    if (t63Var != null && t63Var.b == i5) {
                        bx bxVar2 = (bx) jyrVar.getValue();
                        String str3 = fwmVar.b.a;
                        b80 G2 = men.G(fwmVar.a);
                        bxVar2.getClass();
                        str3.getClass();
                        if (bxVar2.c.getValue() instanceof xw) {
                            bxVar2.a(str3, G2);
                        }
                    }
                }
                return Unit.a;
            case 19:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) pair.a;
                Pair pair3 = (Pair) pair.b;
                x74 x74Var = (x74) pair2.a;
                x74 x74Var2 = (x74) pair3.a;
                boolean booleanValue = ((Boolean) pair3.b).booleanValue();
                if (Intrinsics.d(x74Var2, x74Var) && !booleanValue) {
                    j2n j2nVar = (j2n) this.b;
                    klx klxVar = u74.a;
                    u74 u74Var = x74Var2.a;
                    klxVar.getClass();
                    u74[] values = u74.values();
                    ArrayList arrayList = new ArrayList();
                    for (u74 u74Var2 : values) {
                        if (u74Var2 != u74Var) {
                            arrayList.add(u74Var2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int ordinal2 = ((u74) it.next()).ordinal();
                        if (ordinal2 != 0 && ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                odd h = j2nVar.h();
                                h.getClass();
                                x97.y(h.f, null, null, new fzb(new cdd(h, r11, i3), h, (Continuation) null), 3);
                            } else if (ordinal2 == 3) {
                                j2nVar.g().b();
                            } else if (ordinal2 == 4) {
                                ((c2c) j2nVar.l.getValue()).getClass();
                            } else if (ordinal2 != 5) {
                                b6e.s();
                                return null;
                            }
                        }
                    }
                    j2nVar.d();
                }
                return Unit.a;
            case 20:
                p4n p4nVar = (p4n) this.b;
                p4nVar.a.a(false);
                p4nVar.f.g();
                x97.y(p4nVar.g, null, null, new o4n(p4nVar, r11, i4), 3);
                return Unit.a;
            case 21:
                return c((xxq) obj, continuation);
            case 22:
                qmu qmuVar = (qmu) obj;
                m7n m7nVar = (m7n) this.b;
                k7n k7nVar = (k7n) m7nVar.g.getValue();
                i7n i7nVar = k7nVar instanceof i7n ? (i7n) k7nVar : null;
                if (i7nVar != null) {
                    boolean z2 = qmuVar != qmu.a;
                    boolean a = qmuVar.a();
                    String str4 = i7nVar.a;
                    String str5 = i7nVar.b;
                    n7n n7nVar = i7nVar.c;
                    n7nVar.getClass();
                    m7nVar.g.setValue(new i7n(str4, str5, n7nVar, z2, a));
                }
                return Unit.a;
            case 23:
                rjf rjfVar = ((com.yandex.plus.home.dailyquests.plugin.internal.proxy.g) ((jyr) ((sfm) this.b).a).getValue()).a;
                if (rjfVar.a) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "DailyQuestsViewManagerImpl.refreshContent() called", null);
                    f fVar = (f) rjfVar.k;
                    FrameLayout frameLayout = (FrameLayout) ((s) rjfVar.i).b;
                    frameLayout.getClass();
                    n nVar = (n) fVar.b;
                    if (nVar != null) {
                        WeakHashMap weakHashMap = wdu.a;
                        if (frameLayout.isAttachedToWindow()) {
                            nVar.onViewDetachedFromWindow(frameLayout);
                            nVar.onViewAttachedToWindow(frameLayout);
                        }
                    }
                    obj3 = x97.V((kotlinx.coroutines.a) rjfVar.l, new c(rjfVar, r11, i2), continuation);
                    if (obj3 != nm6.a) {
                        obj3 = Unit.a;
                    }
                } else {
                    obj3 = Unit.a;
                }
                nm6 nm6Var2 = nm6.a;
                if (obj3 != nm6Var2) {
                    obj3 = Unit.a;
                }
                if (obj3 != nm6Var2) {
                    obj3 = Unit.a;
                }
                return obj3 == nm6Var2 ? obj3 : Unit.a;
            case 24:
                bmn bmnVar = (bmn) obj;
                vmn vmnVar = (vmn) this.b;
                ssg.a(3, "RecognitionViewModel", "progress = " + bmnVar, null);
                if (bmnVar instanceof xln) {
                    xdr xdrVar4 = vmnVar.l;
                    nmn nmnVar = nmn.a;
                    xdrVar4.getClass();
                    xdrVar4.m(null, nmnVar);
                } else if (bmnVar instanceof zln) {
                    zln zlnVar = (zln) bmnVar;
                    boolean z3 = zlnVar.b;
                    if (!z3 || (vmnVar.l.getValue() instanceof rmn)) {
                        xdr xdrVar5 = vmnVar.l;
                        rmn rmnVar = new rmn(z3, zlnVar.a);
                        xdrVar5.getClass();
                        xdrVar5.m(null, rmnVar);
                    } else {
                        xdr xdrVar6 = vmnVar.l;
                        smn smnVar = smn.a;
                        xdrVar6.getClass();
                        xdrVar6.m(null, smnVar);
                    }
                } else if (bmnVar instanceof amn) {
                    xdr xdrVar7 = vmnVar.l;
                    tmn tmnVar = new tmn(((amn) bmnVar).a);
                    xdrVar7.getClass();
                    xdrVar7.m(null, tmnVar);
                } else {
                    if (!(bmnVar instanceof yln)) {
                        b6e.s();
                        return null;
                    }
                    xdr xdrVar8 = vmnVar.l;
                    int ordinal3 = ((yln) bmnVar).a.ordinal();
                    if (ordinal3 == 0) {
                        pmnVar = pmn.a;
                    } else if (ordinal3 == 1) {
                        pmnVar = pmn.b;
                    } else if (ordinal3 == 2) {
                        pmnVar = pmn.c;
                    } else if (ordinal3 == 3) {
                        pmnVar = pmn.d;
                    } else if (ordinal3 == 4) {
                        pmnVar = pmn.e;
                    } else {
                        if (ordinal3 != 5) {
                            b6e.s();
                            return null;
                        }
                        pmnVar = pmn.f;
                    }
                    qmn qmnVar = new qmn(pmnVar);
                    xdrVar8.getClass();
                    xdrVar8.m(null, qmnVar);
                }
                return Unit.a;
            case 25:
                eij eijVar = (eij) this.b;
                if (obj == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!eijVar.d(nullPointerException)) {
                        y5g.g0(nullPointerException);
                    }
                } else if (!eijVar.b()) {
                    eijVar.a.onNext(obj);
                }
                return Unit.a;
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                Object a2 = e3p.a((e3p) this.b, continuation);
                return a2 == nm6.a ? a2 : Unit.a;
            case 27:
                if (!((Boolean) obj).booleanValue()) {
                    ((uoc) ((toc) this.b)).b(8, true, true);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((llp) this.b).c.set((vec) obj);
                return Unit.a;
            default:
                return c((xxq) obj, continuation);
        }
    }
}
