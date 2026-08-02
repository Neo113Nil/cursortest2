package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.bdui.trigger.network.TriggerApi;
import com.yandex.music.shared.bdui.trigger.network.dto.MediaCrmEventRequestDto;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.LaunchActionInfo;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class zig extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zig(MainScreenActivity mainScreenActivity, Continuation continuation, MainScreenActivity mainScreenActivity2) {
        super(2, continuation);
        this.j = 10;
        this.l = mainScreenActivity;
        this.m = mainScreenActivity2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0078 -> B:9:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        mm6 mm6Var;
        mm6 mm6Var2;
        efi efiVar;
        float n0;
        float n02;
        iyo iyoVar;
        d18 d18Var = (d18) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                mm6Var = (mm6) this.l;
            } else {
                if (i == 1) {
                    mm6 mm6Var3 = (mm6) this.l;
                    qgg.h0(obj);
                    mm6Var2 = mm6Var3;
                    efiVar = (efi) obj;
                    n0 = ((jx7) d18Var.e).n0(cfi.a);
                    n02 = ((jx7) d18Var.e).n0(cfi.b);
                    iyoVar = (iyo) d18Var.b;
                    this.l = mm6Var2;
                    this.k = 2;
                    if (d18.b(d18Var, iyoVar, efiVar, n0, n02, this) != nm6Var) {
                        mm6Var = mm6Var2;
                    }
                    return nm6Var;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mm6 mm6Var4 = (mm6) this.l;
                qgg.h0(obj);
                mm6Var = mm6Var4;
            }
            if (!saf.X(mm6Var.getCoroutineContext())) {
                d18Var.g = null;
                return Unit.a;
            }
            zi3 zi3Var = (zi3) d18Var.f;
            this.l = mm6Var;
            this.k = 1;
            Object l = zi3Var.l(this);
            if (l == nm6Var) {
                return nm6Var;
            }
            mm6Var2 = mm6Var;
            obj = l;
            efiVar = (efi) obj;
            n0 = ((jx7) d18Var.e).n0(cfi.a);
            n02 = ((jx7) d18Var.e).n0(cfi.b);
            iyoVar = (iyo) d18Var.b;
            this.l = mm6Var2;
            this.k = 2;
            if (d18.b(d18Var, iyoVar, efiVar, n0, n02, this) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th) {
            d18Var.g = null;
            throw th;
        }
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            fvf fvfVar = (fvf) this.l;
            int i2 = ((v0s) this.m).a;
            this.k = 1;
            apo apoVar = fvf.w;
            if (fvfVar.m(i2, 0, this) == nm6Var) {
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

    private final Object n(Object obj) {
        xsi xsiVar = (xsi) this.l;
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
        iwe iweVar = ((qti) this.m).m;
        this.l = null;
        this.k = 1;
        Object C = iweVar.C(xsiVar, this);
        return C == nm6Var ? nm6Var : C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, nu1] */
    private final Object o(Object obj) {
        jyr jyrVar = ((pui) this.l).i;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ((z3g) jyrVar.getValue()).b(this.m);
            yc4 a = ((z3g) jyrVar.getValue()).a();
            this.k = 1;
            obj = zsd.i0(a, this);
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
        m1g m1gVar = (m1g) obj;
        j1g j1gVar = m1gVar != null ? m1gVar.a : null;
        int i2 = j1gVar == null ? -1 : nui.a[j1gVar.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                ((z3g) jyrVar.getValue()).c();
            } else if (i2 == 2) {
                ((z3g) jyrVar.getValue()).c();
            } else if (i2 != 3) {
                b6e.s();
                return null;
            }
        }
        return Unit.a;
    }

    private final Object p(Object obj) {
        mqs mqsVar = (mqs) this.m;
        pui puiVar = (pui) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pjc w = ((t3g) puiVar.h.getValue()).w(mqsVar);
            this.k = 1;
            obj = zsd.i0(w, this);
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
        j1g j1gVar = (j1g) obj;
        int i2 = j1gVar == null ? -1 : oui.a[j1gVar.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                ((t3g) puiVar.h.getValue()).t(mqsVar);
            } else if (i2 == 2) {
                ((t3g) puiVar.h.getValue()).t(mqsVar);
            } else if (i2 != 3) {
                b6e.s();
                return null;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zig((xh1) this.l, (y35) this.m, continuation, 0);
            case 1:
                return new zig((klg) this.l, (cvl) this.m, continuation, 1);
            case 2:
                return new zig((klg) this.l, (Collection) this.m, continuation, 2);
            case 3:
                return new zig((xlg) this.l, (Collection) this.m, continuation, 3);
            case 4:
                return new zig((ltm) this.l, (mqs) this.m, continuation, 4);
            case 5:
                return new zig((yk3) this.l, (g1h) this.m, continuation, 5);
            case 6:
                return new zig((d5h) this.l, (MainDatabase) this.m, continuation, 6);
            case 7:
                return new zig((h5h) this.l, (String) this.m, continuation, 7);
            case 8:
                return new zig((MainScreenActivity) this.l, (Intent) this.m, continuation, 8);
            case 9:
                return new zig((MainScreenActivity) this.l, (rf3) this.m, continuation, 9);
            case 10:
                return new zig((MainScreenActivity) this.l, continuation, (MainScreenActivity) this.m);
            case 11:
                return new zig((r2f) this.l, (nbh) this.m, continuation, 11);
            case 12:
                zig zigVar = new zig((nbh) this.m, continuation, 12);
                zigVar.l = obj;
                return zigVar;
            case 13:
                return new zig((NoopCallbackCommand) this.l, (zi3) this.m, continuation, 13);
            case 14:
                zig zigVar2 = new zig((Context) this.m, continuation, 14);
                zigVar2.l = obj;
                return zigVar2;
            case 15:
                zig zigVar3 = new zig((hmh) this.m, continuation, 15);
                zigVar3.l = obj;
                return zigVar3;
            case 16:
                zig zigVar4 = new zig((wnh) this.m, continuation, 16);
                zigVar4.l = obj;
                return zigVar4;
            case 17:
                return new zig((iuh) this.l, (jc0) this.m, continuation, 17);
            case 18:
                return new zig((j7i) this.l, (zrj) this.m, continuation, 18);
            case 19:
                return new zig((j7i) this.l, (String) this.m, continuation, 19);
            case 20:
                return new zig((j7i) this.l, (mqs) this.m, continuation, 20);
            case 21:
                zig zigVar5 = new zig((lc4) this.m, continuation, 21);
                zigVar5.l = obj;
                return zigVar5;
            case 22:
                zig zigVar6 = new zig((d18) this.m, continuation, 22);
                zigVar6.l = obj;
                return zigVar6;
            case 23:
                return new zig((iyo) this.l, (Function2) this.m, continuation, 23);
            case 24:
                return new zig((MusicBrowserService) this.m, continuation, 24);
            case 25:
                return new zig((fvf) this.l, (v0s) this.m, continuation, 25);
            case 26:
                zig zigVar7 = new zig((qti) this.m, continuation, 26);
                zigVar7.l = obj;
                return zigVar7;
            case 27:
                return new zig((pui) this.l, this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new zig((pui) this.l, (mqs) this.m, continuation, 28);
            default:
                return new zig((ulf) this.l, (fk0) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((zig) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028b, code lost:
    
        if (r1.emit(r0, r17) == r2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x027e, code lost:
    
        if (r3.emit(r6, r17) == r2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04d3, code lost:
    
        if (r0 == r2) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r0 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0307, code lost:
    
        if (r0 == r2) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r0 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x06f2, code lost:
    
        if (r1 == r0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06d7, code lost:
    
        if (r1.j0(r17) == r0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0a01, code lost:
    
        if (r1.d.m(r2, r17) == r0) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x09df, code lost:
    
        if (defpackage.y2x.o(2000, r17) == r0) goto L441;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v112, types: [int] */
    /* JADX WARN: Type inference failed for: r1v113, types: [r2f] */
    /* JADX WARN: Type inference failed for: r1v117, types: [r2f] */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g0;
        Object V;
        Object V2;
        Object j;
        gm5 gm5Var;
        Object obj2;
        Object D;
        Object b;
        Object t7oVar;
        Object O;
        Object vc0Var;
        boolean d;
        n7q n7qVar;
        t1u t1uVar;
        s9p s9pVar;
        Object u;
        Object l;
        Object s;
        Object c;
        Object c2;
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        v8n v8nVar = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        switch (this.j) {
            case 0:
                xh1 xh1Var = (xh1) this.l;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) xh1Var.a.getValue()).g();
                    this.k = 1;
                    g0 = zsd.g0(g, this);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                }
                if (((Boolean) ((wst) xh1Var.b.getValue()).a((xxq) g0).f(vye.e)).booleanValue()) {
                    return null;
                }
                y35 y35Var = (y35) this.m;
                return new ptv(new nrf(y35Var.a, y35Var.b), new onq("/feed/wizard/entry-block", new Integer(0)));
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    klg klgVar = (klg) this.l;
                    cvl cvlVar = (cvl) this.m;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    ((frt) qdcVar.C(I)).c().a.getClass();
                    xlg a = klgVar.a();
                    this.k = 1;
                    a.getClass();
                    V = x97.V(dm6.b, new rlg(a, cvlVar, (Continuation) null), this);
                    if (V == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                return (cvl) V;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    klg klgVar2 = (klg) this.l;
                    Collection collection = (Collection) this.m;
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(frt.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    ((frt) qdcVar2.C(I2)).c().a.getClass();
                    xlg a2 = klgVar2.a();
                    this.k = 1;
                    a2.getClass();
                    V2 = x97.V(dm6.b, new zig(a2, collection, z ? 1 : 0, i2), this);
                    if (V2 == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V2 = obj;
                }
                return (List) V2;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    xlg xlgVar = (xlg) this.l;
                    Collection collection2 = (Collection) this.m;
                    String str = xlgVar.e.c().a;
                    str.getClass();
                    this.k = 1;
                    j = xlgVar.a.j(str, collection2, this);
                    if (j == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j = obj;
                }
                return (List) j;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ktm ktmVar = (ktm) ((ltm) this.l);
                ktmVar.getClass();
                o3h o3hVar = new o3h((mqs) this.m, new g2h(null));
                this.k = 2;
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    t1f t1fVar = (t1f) ((yk3) this.l).b;
                    g1h g1hVar = (g1h) this.m;
                    this.k = 1;
                    if (((z1h) t1fVar.b).a.c(new i3h(new h3h(g1hVar.a, new f3h(g1hVar.b, g1hVar.c, g1hVar.d.a, g1hVar.f))), this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                d5h d5hVar = (d5h) this.l;
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    msa msaVar = nsa.b;
                    long M = yd5.M(60, ssa.SECONDS);
                    this.k = 1;
                    if (y2x.p(M, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!((Boolean) d5hVar.e.getValue()).booleanValue()) {
                    return Unit.a;
                }
                Cursor query = ((MainDatabase) this.m).j().getReadableDatabase().query("SELECT (SELECT COUNT(*) FROM track) + (SELECT COUNT(*) FROM album) + (SELECT COUNT(*) FROM artist) + (SELECT COUNT(*) FROM playlist)");
                try {
                    Cursor cursor = query;
                    long j2 = cursor.moveToFirst() ? cursor.getLong(0) : 0L;
                    yd5.q(query, null);
                    if (((Boolean) ((e1n) d5hVar.d.getValue()).a.getValue()).booleanValue()) {
                        ssg.a(4, "DatabaseStats", dfi.d(j2, "recordLibraryItemCount "), null);
                    }
                    Object obj3 = ComponentHistograms.b;
                    lyd b2 = xee.B().b("Db.Library.ItemCount", 0, 1000000, 100);
                    if (j2 > 2147483647L) {
                        j2 = 2147483647L;
                    }
                    b2.b((int) j2);
                    return Unit.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yd5.q(query, th);
                        throw th2;
                    }
                }
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                h5h h5hVar = (h5h) this.l;
                String str2 = (String) this.m;
                synchronized (h5hVar) {
                    try {
                        str2.getClass();
                        HashMap hashMap = h5hVar.a;
                        Object obj4 = hashMap.get(str2);
                        Object obj5 = obj4;
                        if (obj4 == null) {
                            gm5 j3 = hld.j();
                            hashMap.put(str2, j3);
                            obj5 = j3;
                        }
                        gm5Var = (gm5) obj5;
                    } finally {
                    }
                }
                this.k = 1;
                Object s2 = gm5Var.s(this);
                return s2 == nm6Var8 ? nm6Var8 : s2;
            case 8:
                MainScreenActivity mainScreenActivity = (MainScreenActivity) this.l;
                Object obj6 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    oh7 oh7Var = (oh7) mainScreenActivity.I0.getValue();
                    String stringExtra = ((Intent) this.m).getStringExtra("extra.communication.screen.id");
                    if (stringExtra == null) {
                        return Unit.a;
                    }
                    this.k = 1;
                    oh7Var.getClass();
                    ssg.a(3, "DeeplinkCommunicationTriggerProcessor", "onDeeplinkOpened", null);
                    if (mainScreenActivity.isFinishing() || mainScreenActivity.isInMultiWindowMode()) {
                        obj2 = Unit.a;
                    } else {
                        Parcelable.Creator<zh5> creator = zh5.CREATOR;
                        zh5 zh5Var = (zh5) zh5.d.get("music-deeplink");
                        if (zh5Var == null) {
                            obj2 = Unit.a;
                        } else {
                            jyr jyrVar = k3j.e;
                            boolean x = ixf.x();
                            jyr jyrVar2 = oh7Var.a;
                            if (x) {
                                Object D2 = xv7.D((xj5) jyrVar2.getValue(), zh5Var, mainScreenActivity, stringExtra, this);
                                obj2 = D2;
                                if (D2 != obj6) {
                                    obj2 = Unit.a;
                                }
                            } else {
                                xj5 xj5Var = (xj5) jyrVar2.getValue();
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(byb.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                xj5Var.f(zh5Var, mainScreenActivity, ((yg5) ((byb) qdcVar3.C(I3)).c(ern.a(yg5.class))).h(), stringExtra);
                                obj2 = Unit.a;
                            }
                        }
                    }
                    if (obj2 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                MainScreenActivity mainScreenActivity2 = (MainScreenActivity) this.l;
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    lhs lhsVar = MainScreenActivity.Q0;
                    h7h H = mainScreenActivity2.H();
                    rf3 rf3Var = (rf3) this.m;
                    this.k = 1;
                    H.getClass();
                    if (mainScreenActivity2.isFinishing()) {
                        D = Unit.a;
                    } else if (rf3Var == rf3.i) {
                        D = H.d(mainScreenActivity2, this);
                        if (D != nm6Var9) {
                            D = Unit.a;
                        }
                    } else {
                        zh5 b3 = h7h.b(rf3Var);
                        if (b3 == null) {
                            D = Unit.a;
                        } else {
                            ssg.a(3, "MainScreenCommunicationTriggerProcessor", "try to open trigger on tab " + rf3Var, null);
                            D = xv7.D(H.a(), b3, mainScreenActivity2, null, this);
                            if (D != nm6Var9) {
                                D = Unit.a;
                            }
                        }
                    }
                    if (D == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                MainScreenActivity mainScreenActivity3 = (MainScreenActivity) this.l;
                jyr jyrVar3 = mainScreenActivity3.G;
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    lhs lhsVar2 = MainScreenActivity.Q0;
                    d6m d6mVar = (d6m) jyrVar3.getValue();
                    this.k = 1;
                    b = ((j6m) d6mVar).b(this);
                    if (b == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                if (((Boolean) b).booleanValue()) {
                    lhs lhsVar3 = MainScreenActivity.Q0;
                    mainScreenActivity3.H().e();
                    j6m j6mVar = (j6m) ((d6m) jyrVar3.getValue());
                    x97.y(j6mVar.d, null, null, new g2l(j6mVar, z2 ? 1 : 0, 13), 3);
                } else {
                    MainScreenActivity.F((MainScreenActivity) this.m);
                }
                return Unit.a;
            case 11:
                Object obj7 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    r2f r2fVar = (r2f) this.l;
                    if (r2fVar != null) {
                        this.k = 1;
                        break;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                nbh nbhVar = (nbh) this.m;
                this.k = 2;
                Object V3 = x97.V(bgc.a, new zig((Object) nbhVar, (Continuation) (z3 ? 1 : 0), 12), this);
                Object obj8 = V3;
                if (V3 != obj7) {
                    obj8 = Unit.a;
                    break;
                }
                break;
            case 12:
                nbh nbhVar2 = (nbh) this.m;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new dmg(8, nbhVar2));
                    ckg ckgVar = new ckg((Object) nbhVar2, (Object) mm6Var, (Continuation) (z4 ? 1 : 0), i);
                    this.l = null;
                    this.k = 1;
                    if (zsd.O(s0, ckgVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                NoopCallbackCommand noopCallbackCommand = (NoopCallbackCommand) this.l;
                zi3 zi3Var = (zi3) this.m;
                acp acpVar = new acp(getContext());
                acpVar.g(noopCallbackCommand.getChannel().f(), new xc(i3, 27, z6 ? 1 : 0));
                acpVar.g(zi3Var.f(), new xc(i3, 28, z5 ? 1 : 0));
                this.k = 1;
                Object d2 = acpVar.d(this);
                return d2 == nm6Var12 ? nm6Var12 : d2;
            case 14:
                Context context = (Context) this.m;
                ltm ltmVar = (ltm) this.l;
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    l83 l83Var = new l83(10, ltmVar);
                    fx1.l(context, l83Var, cih.a);
                    y6g y6gVar = new y6g(6, context, l83Var);
                    this.l = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, y6gVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                try {
                    if (i19 == 0) {
                        qgg.h0(obj);
                        hmh hmhVar = (hmh) this.m;
                        r7o r7oVar = z7o.b;
                        Call<Unit> b4 = ((TriggerApi) hmhVar.b.getValue()).b(new MediaCrmEventRequestDto("SHOWN_PAYWALL", null));
                        this.l = null;
                        this.k = 1;
                        O = swf.O(b4, Unit.class, this);
                        if (O == nm6Var14) {
                            return nm6Var14;
                        }
                    } else {
                        if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        O = obj;
                    }
                    bii biiVar = (bii) O;
                    if (biiVar instanceof aii) {
                        t7oVar = new qj6(((aii) biiVar).a);
                    } else if (biiVar instanceof xhi) {
                        int i20 = ((xhi) biiVar).b;
                        String name = ((xhi) biiVar).c.getName();
                        String str3 = name == null ? "" : name;
                        String message = ((xhi) biiVar).c.getMessage();
                        t7oVar = new kj6(i20, ((xhi) biiVar).c.getDetails(), str3, message == null ? "" : message, ((xhi) biiVar).a);
                    } else if (biiVar instanceof yhi) {
                        t7oVar = new lj6(((yhi) biiVar).b, ((yhi) biiVar).c, ((yhi) biiVar).a);
                    } else {
                        if (!(biiVar instanceof zhi)) {
                            throw new x7j();
                        }
                        t7oVar = uwf.J((zhi) biiVar);
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (Throwable th3) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th3);
                }
                Throwable a3 = z7o.a(t7oVar);
                if (a3 != null) {
                    ssg.a(5, null, "failed to send media crm event: SHOWN_PAYWALL", a3);
                }
                return Unit.a;
            case 16:
                unh unhVar = (unh) this.l;
                nm6 nm6Var15 = nm6.a;
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
                wnh wnhVar = (wnh) this.m;
                this.l = null;
                this.k = 1;
                Object a4 = wnh.a(wnhVar, unhVar, this);
                return a4 == nm6Var15 ? nm6Var15 : a4;
            case 17:
                iuh iuhVar = (iuh) this.l;
                mmo mmoVar = iuhVar.b;
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    vwk vwkVar = (vwk) iuhVar.d.getValue();
                    jc0 jc0Var = (jc0) this.m;
                    this.k = 1;
                    if (jc0Var instanceof ec0) {
                        vc0Var = vwkVar.a((ec0) jc0Var, this);
                        break;
                    } else if (jc0Var instanceof fc0) {
                        vc0Var = vwkVar.b((fc0) jc0Var, this);
                        break;
                    } else if (jc0Var instanceof gc0) {
                        vc0Var = vwkVar.c((gc0) jc0Var, this);
                        break;
                    } else {
                        vwkVar.getClass();
                        if (jc0Var instanceof hc0) {
                            hc0 hc0Var = (hc0) jc0Var;
                            vc0Var = new uc0(hc0Var.b, hc0Var.a);
                            break;
                        } else {
                            if (!(jc0Var instanceof ic0)) {
                                b6e.s();
                                return null;
                            }
                            vc0Var = new vc0(((ic0) jc0Var).a);
                            break;
                        }
                    }
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
                    vc0Var = obj;
                }
                wc0 wc0Var = (wc0) vc0Var;
                wc0Var.getClass();
                boolean z9 = wc0Var instanceof vc0;
                vc0 vc0Var2 = z9 ? (vc0) wc0Var : null;
                if (vc0Var2 == null) {
                    d = false;
                } else {
                    d6l x2 = p6g.x((e6l) ((oq7) ((jyr) mmoVar.g).getValue()).a.c.getValue());
                    ArrayList R = (x2 == null || (n7qVar = x2.a) == null || (t1uVar = (t1u) wdg.A(n7qVar, new rxk())) == null || (s9pVar = t1uVar.a) == null) ? null : o8g.R(s9pVar);
                    d = Intrinsics.d(R != null ? CollectionsKt.A0(R) : null, CollectionsKt.A0(o8g.R(vc0Var2.a)));
                }
                if (!d) {
                    this.k = 2;
                    boolean a5 = wc0Var.a();
                    jyr jyrVar4 = (jyr) mmoVar.c;
                    if (!a5) {
                        ((lc0) jyrVar4.getValue()).a();
                        qec qecVar = (qec) mmoVar.d;
                        if (wc0Var instanceof qc0) {
                            qc0 qc0Var = (qc0) wc0Var;
                            oq oqVar = qc0Var.a;
                            mqs mqsVar = qc0Var.b;
                            LaunchActionInfo launchActionInfo = LaunchActionInfo.DEFAULT;
                            a6l a0 = mmo.a0();
                            qecVar.getClass();
                            oqVar.getClass();
                            launchActionInfo.getClass();
                            c b5 = new h(Page.ALBUM, launchActionInfo).b(oqVar);
                            LinkedList linkedList = oqVar.F;
                            linkedList.getClass();
                            qe5 h = l3l.h(b5, linkedList, a0);
                            if (mqsVar != null) {
                                int indexOf = linkedList.indexOf(mqsVar);
                                h.g = mqsVar;
                                h.e = indexOf;
                            }
                            v8nVar = h.b();
                        } else if (wc0Var instanceof rc0) {
                            rc0 rc0Var = (rc0) wc0Var;
                            c01 c01Var = rc0Var.a;
                            List list = rc0Var.b;
                            LaunchActionInfo launchActionInfo2 = LaunchActionInfo.DEFAULT;
                            a6l a02 = mmo.a0();
                            qecVar.getClass();
                            list.getClass();
                            launchActionInfo2.getClass();
                            v8nVar = l3l.h(new h(Page.ARTIST, launchActionInfo2).d(c01Var), list, a02).b();
                        } else if (wc0Var instanceof uc0) {
                            uc0 uc0Var = (uc0) wc0Var;
                            List list2 = uc0Var.a;
                            int i23 = uc0Var.b;
                            LaunchActionInfo launchActionInfo3 = LaunchActionInfo.DEFAULT;
                            a6l a03 = mmo.a0();
                            qecVar.getClass();
                            list2.getClass();
                            launchActionInfo3.getClass();
                            qe5 h2 = l3l.h(new h(Page.TRACK, launchActionInfo3).h(), list2, a03);
                            h2.g = null;
                            h2.e = i23;
                            v8nVar = h2.b();
                        } else if (wc0Var instanceof tc0) {
                            rrl rrlVar = ((tc0) wc0Var).a;
                            LaunchActionInfo launchActionInfo4 = LaunchActionInfo.DEFAULT;
                            a6l a04 = mmo.a0();
                            qecVar.getClass();
                            launchActionInfo4.getClass();
                            List list3 = rrlVar.c;
                            cvl cvlVar2 = rrlVar.a;
                            if (list3 == null) {
                                list3 = c5b.a;
                            }
                            cvlVar2.getClass();
                            c f = e.f(new h(ivf.I(cvlVar2) ? Page.OWN_PLAYLISTS : Page.USER_PLAYLIST, launchActionInfo4), cvlVar2);
                            list3.getClass();
                            v8nVar = l3l.h(f, list3, a04).b();
                        } else if (z9) {
                            ArrayList R2 = o8g.R(((vc0) wc0Var).a);
                            LaunchActionInfo launchActionInfo5 = LaunchActionInfo.DEFAULT;
                            a6l a05 = mmo.a0();
                            qecVar.getClass();
                            launchActionInfo5.getClass();
                            v8nVar = y5g.Y(R2, new qdc((e) qecVar.b, new h(Page.RADIO, launchActionInfo5)), null, null, a05, launchActionInfo5.a, null, new r0q(0), true, UibcKeyCode.TV_KEYCODE_REWIND);
                        } else if (!(wc0Var instanceof sc0)) {
                            b6e.s();
                            return null;
                        }
                        if (v8nVar != null) {
                            u = mmoVar.u(v8nVar, this);
                            if (u != nm6Var16) {
                                u = Unit.a;
                                break;
                            }
                        } else {
                            u = Unit.a;
                            break;
                        }
                    } else {
                        lc0 lc0Var = (lc0) jyrVar4.getValue();
                        eth ethVar = (eth) lc0Var.b.getValue();
                        String string = lc0Var.a.getString(R.string.blank_tracks_title);
                        string.getClass();
                        ethVar.a(new ulp(string));
                        u = Unit.a;
                        break;
                    }
                } else {
                    return Unit.a;
                }
                break;
            case 18:
                zrj zrjVar = (zrj) this.m;
                j7i j7iVar = (j7i) this.l;
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    grh grhVar = (grh) j7iVar.p.b;
                    String str4 = zrjVar.a;
                    grhVar.j = str4;
                    x0q x0qVar = j7iVar.w;
                    af5 af5Var = new af5(str4, null);
                    this.k = 1;
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x0q x0qVar2 = j7iVar.A;
                String str5 = zrjVar.a;
                this.k = 2;
                break;
            case 19:
                String str6 = (String) this.m;
                j7i j7iVar2 = (j7i) this.l;
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    grh grhVar2 = (grh) j7iVar2.p.b;
                    grhVar2.getClass();
                    str6.getClass();
                    grhVar2.c = Math.abs(str6.length() - ((String) grhVar2.j).length()) + grhVar2.c;
                    grhVar2.j = str6;
                    af5 af5Var2 = new af5(str6, null);
                    x0q x0qVar3 = j7iVar2.w;
                    this.k = 1;
                    if (x0qVar3.emit(af5Var2, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    j7i j7iVar3 = (j7i) this.l;
                    mmo mmoVar2 = j7iVar3.u;
                    mqs mqsVar2 = (mqs) this.m;
                    mmoVar2.getClass();
                    mqsVar2.getClass();
                    j6p j6pVar = new j6p(new v7p(oo6.a.a(mqsVar2), mqsVar2, e4p.e));
                    this.k = 1;
                    if (j7iVar3.T(j6pVar, null, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var20 = nm6.a;
                ?? r1 = this.k;
                try {
                    if (r1 == 0) {
                        qgg.h0(obj);
                        rar y = x97.y((mm6) this.l, null, null, new jud(i3, i, z7 ? 1 : 0), 3);
                        lc4 lc4Var = (lc4) this.m;
                        this.l = y;
                        this.k = 1;
                        l = lc4Var.l(this);
                        r1 = y;
                        if (l == nm6Var20) {
                            return nm6Var20;
                        }
                    } else {
                        if (r1 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r2f r2fVar2 = (r2f) this.l;
                        qgg.h0(obj);
                        l = obj;
                        r1 = r2fVar2;
                    }
                    return (efi) l;
                } finally {
                    r1.g(null);
                }
            case 22:
                return k(obj);
            case 23:
                nm6 nm6Var21 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    iyo iyoVar = (iyo) this.l;
                    hqi hqiVar = hqi.b;
                    Function2 function2 = (Function2) this.m;
                    this.k = 1;
                    if (iyoVar.e(hqiVar, function2, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                MusicBrowserService musicBrowserService = (MusicBrowserService) this.m;
                nm6 nm6Var22 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    ((kbn) musicBrowserService.j.getValue()).d("MusicBrowser.start", false);
                    ssg.a(4, "MusicBrowserService", "await sessionToken", null);
                    psh pshVar = (psh) musicBrowserService.i.getValue();
                    this.l = musicBrowserService;
                    this.k = 1;
                    s = ((pvh) pshVar.j.getValue()).a.s(this);
                    if (s == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    musicBrowserService = (MusicBrowserService) this.l;
                    qgg.h0(obj);
                    s = obj;
                }
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) s;
                if (mediaSessionCompat$Token == null) {
                    musicBrowserService.getClass();
                    xq0.x("Session token may not be null");
                    return null;
                }
                if (musicBrowserService.f != null) {
                    xq0.q("The session token has already been set");
                    return null;
                }
                musicBrowserService.f = mediaSessionCompat$Token;
                dn9 dn9Var = musicBrowserService.a;
                ((bih) dn9Var.e).e.e(new e8h(i2, dn9Var, mediaSessionCompat$Token));
                ssg.a(4, "MusicBrowserService", "sessionToken set", null);
                return Unit.a;
            case 25:
                return l(obj);
            case 26:
                return n(obj);
            case 27:
                return o(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return p(obj);
            default:
                nm6 nm6Var23 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    boolean z10 = ((ulf) this.l).a.a;
                    fk0 fk0Var = (fk0) this.m;
                    if (!z10) {
                        float floatValue = ((Number) fk0Var.e()).floatValue();
                        fk0 fk0Var2 = (fk0) this.m;
                        Float f2 = new Float(1.0f);
                        int i30 = (int) (((1.0f - floatValue) * 800) / 0.5f);
                        if (i30 < 200) {
                            i30 = 200;
                        }
                        act S = weo.S(i30, 0, nya.d, 2);
                        this.k = 2;
                        c = fk0.c(fk0Var2, f2, S, null, this, 12);
                        break;
                    } else {
                        Float f3 = new Float(0.5f);
                        vje C = weo.C(weo.S(800, 0, nya.d, 2), jyn.b, 0L, 4);
                        this.k = 1;
                        c2 = fk0.c(fk0Var, f3, C, null, this, 12);
                        break;
                    }
                    return nm6Var23;
                }
                if (i29 == 1) {
                    qgg.h0(obj);
                    c2 = obj;
                } else {
                    if (i29 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zig(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zig(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
