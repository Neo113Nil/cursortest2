package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.data.api.model.SkeletonDataDto;
import com.yandex.music.shared.skeleton.data.network.LandingSkeletonApi;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.music.shared.utils.file.SharedFileProvider;
import com.yandex.plus.pay.internal.feature.payment.inapp.google.g;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.glagol.data.b;

/* loaded from: classes.dex */
public final class akc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public Object k;
    public int l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akc(f4d f4dVar, e5d e5dVar, j1g j1gVar, Continuation continuation) {
        super(2, continuation);
        this.j = 9;
        j1g j1gVar2 = j1g.a;
        this.k = f4dVar;
        this.m = e5dVar;
        this.n = j1gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:7:0x0039, B:9:0x0041, B:10:0x004f, B:17:0x005d, B:19:0x002c, B:23:0x0060, B:26:0x0065, B:27:0x0066, B:34:0x0026, B:12:0x0050, B:14:0x0056), top: B:2:0x0005 }] */
    /* JADX WARN: Type inference failed for: r3v6, types: [qln] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0036 -> B:7:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        zi3 zi3Var;
        si3 si3Var;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        try {
            if (i == 0) {
                qgg.h0(obj);
                zi3Var = (zi3) this.n;
                si3Var = new si3(zi3Var);
                this.k = zi3Var;
                this.m = si3Var;
                this.l = 1;
                obj = si3Var.c(this);
                zi3Var = zi3Var;
                if (obj == nm6Var) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                si3Var = (si3) this.m;
                ?? r3 = (qln) this.k;
                qgg.h0(obj);
                zi3Var = r3;
                if (((Boolean) obj).booleanValue()) {
                    boolean z = false;
                    fmd.b.set(false);
                    synchronized (g2r.b) {
                        upi upiVar = g2r.i.h;
                        if (upiVar != null && upiVar.i()) {
                            z = true;
                        }
                    }
                    if (z) {
                        g2r.a();
                    }
                    this.k = zi3Var;
                    this.m = si3Var;
                    this.l = 1;
                    obj = si3Var.c(this);
                    zi3Var = zi3Var;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        zi3Var.g(null);
                        return Unit.a;
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r1.emit(r0, r10) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (defpackage.y2x.o(500, r10) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r1.emit(null, r10) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (defpackage.y2x.o(1000, r10) == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        lke lkeVar = (lke) this.m;
        rjc rjcVar = (rjc) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            qgg.h0(obj);
            this.k = rjcVar;
            this.l = 1;
        } else if (i == 1) {
            qgg.h0(obj);
        } else if (i == 2) {
            qgg.h0(obj);
            this.k = rjcVar;
            this.l = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ((xqn) this.n).a = lkeVar;
                return Unit.a;
            }
            qgg.h0(obj);
            this.k = null;
            this.l = 4;
        }
        this.k = rjcVar;
        this.l = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0057, code lost:
    
        if (r11 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        LandingSkeletonApi landingSkeletonApi;
        String str;
        rj6 J;
        rj6 lj6Var;
        cjf cjfVar = (cjf) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        Continuation continuation = null;
        boolean z = false;
        if (i == 0) {
            qgg.h0(obj);
            landingSkeletonApi = (LandingSkeletonApi) cjfVar.f.getValue();
            str = cjfVar.a;
            cmf cmfVar = cjfVar.d;
            if (cmfVar != null) {
                this.m = landingSkeletonApi;
                this.k = str;
                this.l = 1;
                obj = x97.V(dm6.b, new amf(cmfVar, continuation, 1), this);
            }
            Call<MusicBackendResponse<SkeletonDataDto>> a = landingSkeletonApi.a(str, z, "only-if-cached, max-stale=300000000");
            this.m = null;
            this.k = cjfVar;
            this.l = 2;
            obj = swf.N(a, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cjfVar = (cjf) this.k;
                qgg.h0(obj);
                bii biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    snq t1 = gut.t1((SkeletonDataDto) ((aii) biiVar).a, cjfVar.c, cjfVar.e);
                    if (t1 == null) {
                        J = new nj6(null);
                    } else {
                        lj6Var = new qj6(t1);
                        J = lj6Var;
                    }
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i2 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    J = new kj6(i2, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                } else if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    lj6Var = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    J = lj6Var;
                } else {
                    if (!(biiVar instanceof zhi)) {
                        b6e.s();
                        return null;
                    }
                    J = uwf.J((zhi) biiVar);
                }
                return u7g.Y(J);
            }
            str = (String) this.k;
            landingSkeletonApi = (LandingSkeletonApi) this.m;
            qgg.h0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            z = true;
        }
        Call<MusicBackendResponse<SkeletonDataDto>> a2 = landingSkeletonApi.a(str, z, "only-if-cached, max-stale=300000000");
        this.m = null;
        this.k = cjfVar;
        this.l = 2;
        obj = swf.N(a2, this);
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            xqn i2 = hrg.i(obj);
            eno s0 = szf.s0(new nnf((ml4) this.k, 0));
            tl0 tl0Var = new tl0(23, i2, (ruq) this.m, (pwq) this.n);
            this.l = 1;
            if (s0.collect(tl0Var, this) == nm6Var) {
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

    private final Object p(Object obj) {
        ltf ltfVar = (ltf) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        int i2 = 1;
        try {
            if (i == 0) {
                qgg.h0(obj);
                fk0 fk0Var = ltfVar.p;
                Float f = new Float(0.0f);
                wdc wdcVar = (wdc) this.m;
                ktf ktfVar = new ktf((xod) this.n, ltfVar, i2);
                this.l = 1;
                if (fk0.c(fk0Var, f, wdcVar, ktfVar, this, 4) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            ltfVar.k.setValue(Boolean.TRUE);
            ltfVar.e(false);
            return Unit.a;
        } catch (Throwable th) {
            int i3 = ltf.t;
            ltfVar.e(false);
            throw th;
        }
    }

    private final Object q(Object obj) {
        i5g i5gVar;
        nsh nshVar = (nsh) this.n;
        nu1 nu1Var = (nu1) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            qgg.h0(obj);
            i5g i5gVar2 = new i5g(nu1Var);
            t3g t3gVar = (t3g) nshVar.c;
            this.k = i5gVar2;
            this.l = 1;
            Object h = t3gVar.h(nu1Var, this);
            if (h == nm6Var) {
                return nm6Var;
            }
            i5gVar = i5gVar2;
            obj = h;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i5gVar = (i5g) this.k;
            qgg.h0(obj);
        }
        j5g j5gVar = new j5g(i5gVar, ((Boolean) obj).booleanValue());
        xdr xdrVar = (xdr) nshVar.d;
        xdrVar.getClass();
        xdrVar.m(null, j5gVar);
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aur, kotlin.jvm.functions.Function2] */
    private final Object s(Object obj) {
        vs3 vs3Var = (vs3) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        try {
            if (i == 0) {
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.k;
                ?? r2 = (aur) this.m;
                this.l = 1;
                obj = r2.invoke(mm6Var, this);
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
            vs3Var.a(obj);
        } catch (CancellationException unused) {
            vs3Var.d = true;
            ys3 ys3Var = vs3Var.b;
            if (ys3Var != null && ys3Var.b.cancel(true)) {
                vs3Var.a = null;
                vs3Var.b = null;
                vs3Var.c = null;
            }
        } catch (Throwable th) {
            vs3Var.b(th);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (defpackage.x97.V(r0, r1, r11) == r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r0 == r9) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object t(Object obj) {
        Object b;
        teg tegVar = (teg) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            qgg.h0(obj);
            t4a t4aVar = tegVar.a;
            t5a t5aVar = ((reg) this.m).a;
            this.l = 1;
            b = t4a.b(t4aVar, t5aVar, null, false, true, false, this, 48);
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
            b = obj;
        }
        l4a l4aVar = (l4a) b;
        a aVar = tegVar.c;
        n71 n71Var = new n71(l4aVar, (dn9) this.n, tegVar, (Continuation) null, 17);
        this.l = 2;
    }

    private final Object u(Object obj) {
        nrf nrfVar;
        String str;
        xh1 xh1Var = (xh1) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            qgg.h0(obj);
            mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
            nrf nrfVar2 = new nrf("collection_downloaded_sections_id", "COLLECTION_DOWNLOADED_SECTIONS");
            String c = xh1Var.e().c(R.string.more_in_downloaded);
            wia wiaVar = (wia) xh1Var.j.getValue();
            this.k = nrfVar2;
            this.m = c;
            this.l = 1;
            Object d = wiaVar.d(20, this);
            if (d == nm6Var) {
                return nm6Var;
            }
            nrfVar = nrfVar2;
            obj = d;
            str = c;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.m;
            nrfVar = (nrf) this.k;
            qgg.h0(obj);
        }
        return new fia(nrfVar, str, ((Number) obj).intValue());
    }

    private final Object v(Object obj) {
        fkg fkgVar = (fkg) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        wb7 wb7Var = (wb7) fkgVar.b.getValue();
        rfg rfgVar = new rfg(fkgVar, (String) this.m, (f5q) this.n, (Continuation) null, 1);
        this.l = 1;
        Object a = lmm.a(wb7Var, rfgVar, this);
        return a == nm6Var ? nm6Var : a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r0v21, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                akc akcVar = new akc((pyc) this.m, (i64) obj2, continuation);
                akcVar.k = obj;
                return akcVar;
            case 1:
                akc akcVar2 = new akc((rjc) obj2, continuation, 1);
                akcVar2.m = ((gd4) obj).a;
                return akcVar2;
            case 2:
                return new akc((pjc) this.k, (mm6) this.m, (AtomicReference) obj2, continuation, 2);
            case 3:
                akc akcVar3 = new akc((xdr) this.m, (g) obj2, continuation, 3);
                akcVar3.k = obj;
                return akcVar3;
            case 4:
                akc akcVar4 = new akc((pjc[]) this.m, continuation, (sh2) obj2);
                akcVar4.k = obj;
                return akcVar4;
            case 5:
                return new akc((uoi) this.k, (tre) this.m, (qa8) obj2, continuation, 5);
            case 6:
                akc akcVar5 = new akc((uwc) obj2, continuation, 6);
                akcVar5.k = obj;
                return akcVar5;
            case 7:
                return new akc((n7b) this.k, (iz7) this.m, (File) obj2, continuation, 7);
            case 8:
                return new akc((m78) this.k, (e4d) this.m, (String) obj2, continuation, 8);
            case 9:
                j1g j1gVar = j1g.a;
                return new akc((f4d) this.k, (e5d) this.m, (j1g) obj2, continuation);
            case 10:
                akc akcVar6 = new akc((mm6) this.m, (Function1) obj2, continuation, 10);
                akcVar6.k = obj;
                return akcVar6;
            case 11:
                return new akc((odd) this.k, (String) this.m, (gx4) obj2, continuation, 11);
            case 12:
                return new akc((iz7) this.k, (ned) this.m, (med[]) obj2, continuation, 12);
            case 13:
                akc akcVar7 = new akc((ohd) this.m, (dkd) obj2, continuation, 13);
                akcVar7.k = obj;
                return akcVar7;
            case 14:
                return new akc((b) this.m, (qhd) obj2, continuation, 14);
            case 15:
                return new akc((b) this.k, (List) this.m, (qhd) obj2, continuation, 15);
            case 16:
                return new akc((sid) this.k, (e4d) this.m, (String) obj2, continuation, 16);
            case 17:
                return new akc((zi3) obj2, continuation, 17);
            case 18:
                return new akc((ivd) obj2, continuation, 18);
            case 19:
                akc akcVar8 = new akc((ige) obj2, continuation, 19);
                akcVar8.k = obj;
                return akcVar8;
            case 20:
                akc akcVar9 = new akc((lke) this.m, (xqn) obj2, continuation, 20);
                akcVar9.k = obj;
                return akcVar9;
            case 21:
                return new akc((cjf) obj2, continuation, 21);
            case 22:
                return new akc((ml4) this.k, (ruq) this.m, (pwq) obj2, continuation, 22);
            case 23:
                return new akc((ltf) this.k, (wdc) this.m, (xod) obj2, continuation, 23);
            case 24:
                return new akc((nu1) this.m, (nsh) obj2, continuation, 24);
            case 25:
                akc akcVar10 = new akc((Function2) this.m, (vs3) obj2, continuation);
                akcVar10.k = obj;
                return akcVar10;
            case 26:
                return new akc((teg) this.k, (reg) this.m, (dn9) obj2, continuation, 26);
            case 27:
                return new akc((xh1) obj2, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new akc((fkg) this.k, (String) this.m, (f5q) obj2, continuation, 28);
            default:
                return new akc((xlg) this.k, (ykf) this.m, (cvl) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 1:
                Object obj3 = ((gd4) obj).a;
                akc akcVar = new akc((rjc) this.n, (Continuation) obj2, 1);
                akcVar.m = obj3;
                break;
        }
        return ((akc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0438, code lost:
    
        if (defpackage.ohd.b(r12, r2, r10, r20) == r0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x044d, code lost:
    
        if (((defpackage.oc4) r11).d.m(r1, r20) != r0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06eb, code lost:
    
        if (r0.emit(r3, r20) == r2) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x06de, code lost:
    
        if (r3 == r2) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x06c5, code lost:
    
        if (r0.emit(null, r20) == r2) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010b, code lost:
    
        if (r1.e("restore_purchase_presenter", true, r20) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (r7 == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
    
        if (r0.o(r20) == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c7, code lost:
    
        if (r2 == r1) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c9 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0305 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0313 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0337 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0343 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0374 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0381 A[Catch: Exception -> 0x023d, IOException -> 0x03b8, TryCatch #10 {IOException -> 0x03b8, Exception -> 0x023d, blocks: (B:119:0x0236, B:120:0x02c3, B:122:0x02c9, B:124:0x02d7, B:133:0x02df, B:136:0x02e5, B:137:0x02ea, B:138:0x0240, B:139:0x02ff, B:141:0x0305, B:142:0x0313, B:145:0x0319, B:146:0x031e, B:147:0x0247, B:148:0x0331, B:150:0x0337, B:151:0x0343, B:154:0x0349, B:155:0x034e, B:156:0x024e, B:158:0x036e, B:160:0x0374, B:161:0x0381, B:164:0x0386, B:165:0x038b, B:167:0x025b, B:169:0x03a7, B:175:0x027e, B:177:0x0282, B:180:0x028a, B:181:0x0290, B:182:0x0293, B:183:0x0298, B:184:0x0299, B:185:0x02a1, B:188:0x02eb, B:191:0x031f, B:194:0x034f, B:197:0x038c, B:200:0x039c, B:203:0x03ab), top: B:113:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Type inference failed for: r2v2, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object, kotlin.Unit] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        slc slcVar;
        Object a;
        Object k;
        Object a2;
        boolean z;
        hgp hgpVar;
        z3q k1qVar;
        Object b;
        Object c;
        Object a3;
        Object b2;
        Object a4;
        rj6 rj6Var;
        z3q a2qVar;
        rj6 rj6Var2;
        rj6 rj6Var3;
        rj6 rj6Var4;
        Boolean bool;
        Object V;
        Object a5;
        ivd ivdVar;
        Object g0;
        rar B;
        Object V2;
        int i = 0;
        int i2 = 1;
        Object obj2 = 0;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        z3q z3qVar = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    Object obj3 = this.k;
                    ?? r2 = (aur) this.m;
                    i64 i64Var = (i64) this.n;
                    this.l = 1;
                    if (r2.invoke(i64Var, obj3, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                Object obj4 = this.m;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.n;
                    if (!(obj4 instanceof fd4)) {
                        this.m = null;
                        this.k = obj4;
                        this.l = 1;
                        if (rjcVar.emit(obj4, this) == nm6Var2) {
                            return nm6Var2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj4 = this.k;
                    qgg.h0(obj);
                }
                return obj4 instanceof ed4 ? Boolean.FALSE : Boolean.TRUE;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.l;
                try {
                    if (i5 == 0) {
                        qgg.h0(obj);
                        pjc pjcVar = (pjc) this.k;
                        okc okcVar = new okc((AtomicReference) this.n, 0);
                        this.l = 1;
                        if (pjcVar.collect(okcVar, this) == nm6Var3) {
                            return nm6Var3;
                        }
                    } else {
                        if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                } catch (CancellationException e) {
                    gld.L((mm6) this.m, e);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.l;
                if (i6 != 0) {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slcVar = (slc) this.k;
                    try {
                        qgg.h0(obj);
                    } catch (p2 e2) {
                        e = e2;
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                rjc rjcVar2 = (rjc) this.k;
                xdr xdrVar = (xdr) this.m;
                slc slcVar2 = new slc((g) this.n, rjcVar2);
                try {
                    this.k = slcVar2;
                    this.l = 1;
                    xdrVar.collect(slcVar2, this);
                    return nm6Var4;
                } catch (p2 e3) {
                    e = e3;
                    slcVar = slcVar2;
                }
                if (e.a != slcVar) {
                    throw e;
                }
                saf.K(getContext());
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i7 = this.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = (rjc) this.k;
                    pjc[] pjcVarArr = (pjc[]) this.m;
                    wg wgVar = wg.s;
                    l1 l1Var = new l1((Continuation) obj2, this.n, 26);
                    this.l = 1;
                    if (tt0.y(rjcVar3, l1Var, this, wgVar, pjcVarArr) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i8 = this.l;
                if (i8 == 0) {
                    qgg.h0(obj);
                    uoi uoiVar = (uoi) this.k;
                    tre treVar = (tre) this.m;
                    this.l = 1;
                    if (uoiVar.a(treVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                qa8 qa8Var = (qa8) this.n;
                if (qa8Var != null) {
                    qa8Var.a();
                }
                return Unit.a;
            case 6:
                rjc rjcVar4 = (rjc) this.k;
                nm6 nm6Var7 = nm6.a;
                int i9 = this.l;
                if (i9 == 0) {
                    qgg.h0(obj);
                    this.k = rjcVar4;
                    this.l = 1;
                    break;
                } else if (i9 == 1) {
                    qgg.h0(obj);
                } else if (i9 == 2) {
                    rjcVar4 = (rjc) this.m;
                    qgg.h0(obj);
                    a = obj;
                    this.k = null;
                    this.m = null;
                    this.l = 3;
                    break;
                } else {
                    if (i9 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xwc xwcVar = (xwc) ((uwc) this.n).d.getValue();
                this.k = null;
                this.m = rjcVar4;
                this.l = 2;
                a = xwcVar.a(this);
                break;
            case 7:
                File file = (File) this.n;
                iz7 iz7Var = (iz7) this.m;
                n7b n7bVar = (n7b) this.k;
                nm6 nm6Var8 = nm6.a;
                int i10 = this.l;
                if (i10 == 0) {
                    qgg.h0(obj);
                    int i11 = SharedFileProvider.g;
                    Uri a0 = c9g.a0((FullInfoActivity) iz7Var.a, file);
                    this.l = 1;
                    k = FullInfoActivity.k((FullInfoActivity) n7bVar.a, a0, this);
                    if (k == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    k = obj;
                }
                if (!((Boolean) k).booleanValue()) {
                    iz7Var.l = null;
                    file.delete();
                    hag.x((FullInfoActivity) n7bVar.a, R.string.playlist_upload_cover_error_message, 0);
                }
                return Unit.a;
            case 8:
                e4d e4dVar = (e4d) this.m;
                m78 m78Var = (m78) this.k;
                LinkedHashMap linkedHashMap = (LinkedHashMap) m78Var.e;
                StationId stationId = (StationId) m78Var.b;
                nm6 nm6Var9 = nm6.a;
                int i12 = this.l;
                if (i12 == 0) {
                    qgg.h0(obj);
                    ssg.a(4, null, "Send feedback=" + e4dVar + " for station=" + stationId, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    ReentrantLock reentrantLock = (ReentrantLock) m78Var.d;
                    reentrantLock.lock();
                    try {
                        Long l = (Long) linkedHashMap.get(e4dVar);
                        if (currentTimeMillis - (l != null ? l.longValue() : 0L) < m78Var.a) {
                            ssg.a(4, null, "Skip sending feedback=" + e4dVar + " for station=" + stationId + " due to delay", null);
                            return Boolean.FALSE;
                        }
                        linkedHashMap.put(e4dVar, new Long(currentTimeMillis));
                        reentrantLock.unlock();
                        z3d z3dVar = new z3d(e4dVar, currentTimeMillis);
                        b5d b5dVar = (b5d) ((jyr) m78Var.c).getValue();
                        d5d N = ox6.N(stationId);
                        String str = (String) this.n;
                        this.l = 1;
                        a2 = b5dVar.a(N, z3dVar, str, this);
                        if (a2 == nm6Var9) {
                            return nm6Var9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                rj6 rj6Var5 = (rj6) a2;
                if (rj6Var5 instanceof qj6) {
                    z = ((d4d) ((qj6) rj6Var5).a).a;
                } else {
                    if (!(rj6Var5 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, null, "Failed to send feedback=" + e4dVar + " for station=" + stationId, ((pj6) rj6Var5).a());
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                e5d e5dVar = (e5d) this.m;
                f4d f4dVar = (f4d) this.k;
                nm6 nm6Var10 = nm6.a;
                int i13 = this.l;
                if (i13 == 0) {
                    qgg.h0(obj);
                    long j = f4dVar.d;
                    this.l = 1;
                    if (y2x.p(j, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (f4dVar.a(e5dVar).getValue() == ((j1g) this.n)) {
                    f4dVar.b(e5dVar, j1g.b);
                }
                return Unit.a;
            case 10:
                pfm pfmVar = (pfm) this.k;
                nm6 nm6Var11 = nm6.a;
                int i14 = this.l;
                if (i14 == 0) {
                    qgg.h0(obj);
                    zqc zqcVar = new zqc((mm6) this.m, (Function1) this.n, obj2, i2);
                    this.k = null;
                    this.l = 1;
                    if (((iur) pfmVar).S0(zqcVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                Object obj5 = (String) this.m;
                xdr xdrVar2 = ((odd) this.k).o;
                nm6 nm6Var12 = nm6.a;
                int i15 = this.l;
                try {
                    if (i15 == 0) {
                        qgg.h0(obj);
                        xdrVar2.l(obj5);
                        gx4 gx4Var = (gx4) this.n;
                        this.l = 1;
                        if (gx4Var.invoke(this) == nm6Var12) {
                            return nm6Var12;
                        }
                    } else {
                        if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    xdrVar2.k(obj5, null);
                    obj2 = Unit.a;
                    return obj2;
                } catch (Throwable th2) {
                    xdrVar2.k(obj5, obj2);
                    throw th2;
                }
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i16 = this.l;
                if (i16 == 0) {
                    qgg.h0(obj);
                    iz7 iz7Var2 = (iz7) this.k;
                    ned nedVar = (ned) this.m;
                    med[] medVarArr = (med[]) this.n;
                    this.l = 1;
                    if (iz7.a(iz7Var2, nedVar, medVarArr, 20L, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                iz7 iz7Var3 = (iz7) this.k;
                ReentrantLock reentrantLock2 = (ReentrantLock) iz7Var3.c;
                reentrantLock2.lock();
                try {
                    iz7Var3.d = null;
                    reentrantLock2.unlock();
                    return Unit.a;
                } finally {
                    reentrantLock2.unlock();
                }
            case 13:
                dkd dkdVar = (dkd) this.n;
                ohd ohdVar = (ohd) this.m;
                ltm ltmVar = (ltm) this.k;
                nm6 nm6Var14 = nm6.a;
                int i17 = this.l;
                Continuation continuation = null;
                if (i17 == 0) {
                    qgg.h0(obj);
                    try {
                        y76 y76Var = ohdVar.b;
                        Context context = ohdVar.a;
                        String str2 = dkdVar.b;
                        zi3 g = men.g(16, 4, oi3.b);
                        v56 discoverConnections = y76Var.discoverConnections(context, str2, new khd(g, ohdVar));
                        discoverConnections.getClass();
                        g.y(new at5(y76Var, discoverConnections));
                        ssg.a(3, null, "start discovery", null);
                        ((oc4) ltmVar).q0(new lhd(i, g));
                        d57 d57Var = new d57(ltmVar, ohdVar, dkdVar, continuation, 17);
                        this.k = null;
                        this.l = 2;
                        break;
                    } catch (shd unused) {
                        fhd fhdVar = fhd.a;
                        this.k = ltmVar;
                        this.l = 1;
                        break;
                    }
                } else {
                    if (i17 == 1) {
                        qgg.h0(obj);
                        ((oc4) ltmVar).p0(null);
                        return Unit.a;
                    }
                    if (i17 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                b bVar = (b) this.m;
                qhd qhdVar = (qhd) this.n;
                nm6 nm6Var15 = nm6.a;
                try {
                } catch (IOException unused2) {
                } catch (Exception e4) {
                    ssg.a(6, null, "unknown network exception", e4);
                    throw e4;
                }
                switch (this.l) {
                    case 0:
                        qgg.h0(obj);
                        if (((z3q) bVar.j.c).e().a(qhdVar)) {
                            return (z3q) bVar.j.c;
                        }
                        String str3 = qhdVar.a;
                        if (str3 != null && !StringsKt.U(str3)) {
                            switch (qhdVar.b.ordinal()) {
                                case 0:
                                    StationId f = StationId.f(str3);
                                    f.getClass();
                                    if (f.equals(StationId.a)) {
                                        if (z3qVar == null) {
                                            z3qVar = new k1q(qhdVar);
                                        }
                                        hgpVar = bVar.j;
                                        this.k = z3qVar;
                                        this.l = 6;
                                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                            return z3qVar;
                                        }
                                        return nm6Var15;
                                    }
                                    this.k = null;
                                    this.l = 1;
                                    b = b.b(bVar, f, qhdVar, this);
                                    if (b == nm6Var15) {
                                        return nm6Var15;
                                    }
                                    k1qVar = (z3q) b;
                                    z3qVar = k1qVar;
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                case 1:
                                    l0t l0tVar = (l0t) bVar.e.getValue();
                                    psd psdVar = new psd(2);
                                    psdVar.b = "Glagol";
                                    psdVar.a("Appending track entity");
                                    this.l = 2;
                                    c = l0tVar.c(str3, psdVar, this);
                                    if (c == nm6Var15) {
                                        return nm6Var15;
                                    }
                                    rj6Var = (rj6) c;
                                    if (rj6Var instanceof qj6) {
                                        if (!(rj6Var instanceof pj6)) {
                                            throw new x7j();
                                        }
                                        if (z3qVar == null) {
                                        }
                                        hgpVar = bVar.j;
                                        this.k = z3qVar;
                                        this.l = 6;
                                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                        }
                                        return nm6Var15;
                                    }
                                    a2qVar = new a2q((mqs) ((qj6) rj6Var).a, qhdVar);
                                    z3qVar = a2qVar;
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                case 2:
                                    yr yrVar = (yr) bVar.g.getValue();
                                    this.l = 3;
                                    a3 = yrVar.a(str3, this);
                                    if (a3 == nm6Var15) {
                                        return nm6Var15;
                                    }
                                    rj6Var2 = (rj6) a3;
                                    if (rj6Var2 instanceof qj6) {
                                        if (!(rj6Var2 instanceof pj6)) {
                                            throw new x7j();
                                        }
                                        if (z3qVar == null) {
                                        }
                                        hgpVar = bVar.j;
                                        this.k = z3qVar;
                                        this.l = 6;
                                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                        }
                                        return nm6Var15;
                                    }
                                    a2qVar = new c1q((oq) ((qj6) rj6Var2).a, qhdVar);
                                    z3qVar = a2qVar;
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                case 3:
                                    k21 k21Var = (k21) bVar.f.getValue();
                                    this.l = 4;
                                    b2 = k21.b(k21Var, str3, true, this, 28);
                                    if (b2 == nm6Var15) {
                                        return nm6Var15;
                                    }
                                    rj6Var3 = (rj6) b2;
                                    if (rj6Var3 instanceof qj6) {
                                        if (!(rj6Var3 instanceof pj6)) {
                                            throw new x7j();
                                        }
                                        if (z3qVar == null) {
                                        }
                                        hgpVar = bVar.j;
                                        this.k = z3qVar;
                                        this.l = 6;
                                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                        }
                                        return nm6Var15;
                                    }
                                    a2qVar = new e1q(((i21) ((qj6) rj6Var3).a).a, qhdVar);
                                    z3qVar = a2qVar;
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                case 4:
                                    l18 l18Var = l18.b;
                                    bdt I = hag.I(kvn.class);
                                    qdc qdcVar = l18Var.a;
                                    qdcVar.getClass();
                                    kvn kvnVar = (kvn) qdcVar.C(I);
                                    List c2 = t75.c(str3);
                                    this.l = 5;
                                    a4 = kvnVar.a(c2, this);
                                    if (a4 == nm6Var15) {
                                        return nm6Var15;
                                    }
                                    rj6Var4 = (rj6) a4;
                                    if (!(rj6Var4 instanceof qj6)) {
                                        cvl cvlVar = (cvl) CollectionsKt.firstOrNull((List) ((qj6) rj6Var4).a);
                                        if (cvlVar != null) {
                                            a2qVar = new r1q(cvlVar, qhdVar);
                                            z3qVar = a2qVar;
                                        }
                                    } else if (!(rj6Var4 instanceof pj6)) {
                                        throw new x7j();
                                    }
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                case 5:
                                case 7:
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                case 6:
                                    k1qVar = new h1q(qhdVar);
                                    z3qVar = k1qVar;
                                    if (z3qVar == null) {
                                    }
                                    hgpVar = bVar.j;
                                    this.k = z3qVar;
                                    this.l = 6;
                                    if (hgpVar.x(z3qVar, this) != nm6Var15) {
                                    }
                                    return nm6Var15;
                                default:
                                    throw new x7j();
                            }
                        }
                        k1qVar = new k1q(qhdVar);
                        z3qVar = k1qVar;
                        if (z3qVar == null) {
                        }
                        hgpVar = bVar.j;
                        this.k = z3qVar;
                        this.l = 6;
                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                        }
                        return nm6Var15;
                    case 1:
                        qgg.h0(obj);
                        b = obj;
                        k1qVar = (z3q) b;
                        z3qVar = k1qVar;
                        if (z3qVar == null) {
                        }
                        hgpVar = bVar.j;
                        this.k = z3qVar;
                        this.l = 6;
                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                        }
                        return nm6Var15;
                    case 2:
                        qgg.h0(obj);
                        c = obj;
                        rj6Var = (rj6) c;
                        if (rj6Var instanceof qj6) {
                        }
                        break;
                    case 3:
                        qgg.h0(obj);
                        a3 = obj;
                        rj6Var2 = (rj6) a3;
                        if (rj6Var2 instanceof qj6) {
                        }
                        break;
                    case 4:
                        qgg.h0(obj);
                        b2 = obj;
                        rj6Var3 = (rj6) b2;
                        if (rj6Var3 instanceof qj6) {
                        }
                        break;
                    case 5:
                        qgg.h0(obj);
                        a4 = obj;
                        rj6Var4 = (rj6) a4;
                        if (!(rj6Var4 instanceof qj6)) {
                        }
                        if (z3qVar == null) {
                        }
                        hgpVar = bVar.j;
                        this.k = z3qVar;
                        this.l = 6;
                        if (hgpVar.x(z3qVar, this) != nm6Var15) {
                        }
                        return nm6Var15;
                    case 6:
                        z3q z3qVar2 = (z3q) this.k;
                        qgg.h0(obj);
                        return z3qVar2;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i18 = this.l;
                if (i18 != 0) {
                    if (i18 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b bVar2 = (b) this.k;
                List list = (List) this.m;
                String str4 = ((qhd) this.n).a;
                this.l = 1;
                Object Q = gld.Q(new ov(bVar2, list, str4, (Continuation) null), this);
                return Q == nm6Var16 ? nm6Var16 : Q;
            case 16:
                sid sidVar = (sid) this.k;
                nm6 nm6Var17 = nm6.a;
                int i19 = this.l;
                if (i19 == 0) {
                    qgg.h0(obj);
                    m78 m78Var2 = (m78) sidVar.f;
                    bool = null;
                    Object[] objArr = 0;
                    if (m78Var2 != null) {
                        e4d e4dVar2 = (e4d) this.m;
                        String str5 = (String) this.n;
                        this.l = 1;
                        V = x97.V(dm6.b, new akc(m78Var2, e4dVar2, str5, objArr == true ? 1 : 0, 8), this);
                        break;
                    }
                    if (Intrinsics.d(bool, Boolean.TRUE)) {
                        ced cedVar = sidVar.a;
                        this.l = 2;
                        break;
                    }
                    return Unit.a;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                V = obj;
                bool = (Boolean) V;
                if (Intrinsics.d(bool, Boolean.TRUE)) {
                }
                return Unit.a;
            case 17:
                return k(obj);
            case 18:
                ivd ivdVar2 = (ivd) this.n;
                nm6 nm6Var18 = nm6.a;
                int i20 = this.l;
                if (i20 == 0) {
                    qgg.h0(obj);
                    String str6 = ivdVar2.a;
                    pce pceVar = new pce(ivdVar2.d);
                    pceVar.c = str6;
                    pceVar.e(lmq.c);
                    pceVar.j = xee.L(xz0.X(new e7t[]{new i83(1)}));
                    rce a6 = pceVar.a();
                    cce cceVar = ivdVar2.e;
                    this.k = ivdVar2;
                    this.m = ivdVar2;
                    this.l = 1;
                    a5 = cceVar.a(a6, this);
                    if (a5 == nm6Var18) {
                        return nm6Var18;
                    }
                    ivdVar = ivdVar2;
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ivd ivdVar3 = (ivd) this.m;
                    ivd ivdVar4 = (ivd) this.k;
                    qgg.h0(obj);
                    ivdVar = ivdVar3;
                    ivdVar2 = ivdVar4;
                    a5 = obj;
                }
                bs1 e5 = ivd.e(ivdVar, (sce) a5);
                ivdVar2.getClass();
                ivdVar2.k.setValue(e5);
                return Unit.a;
            case 19:
                ige igeVar = (ige) this.n;
                lge lgeVar = igeVar.m;
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var19 = nm6.a;
                int i21 = this.l;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc g2 = igeVar.k.g();
                    this.k = mm6Var;
                    this.l = 1;
                    g0 = zsd.g0(g2, this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        B = (rar) this.m;
                        qgg.h0(obj);
                        B.g(null);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                }
                if (!((xxq) g0).a()) {
                    ssg.a(6, null, "restorePurchases: user is not authorized", null);
                    return Unit.a;
                }
                B = ox6.B(zsd.d0(lgeVar.j, 1), mm6Var, new ds1(i2, igeVar));
                this.k = null;
                this.m = B;
                this.l = 2;
                break;
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
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return v(obj);
            default:
                nm6 nm6Var20 = nm6.a;
                int i22 = this.l;
                try {
                    if (i22 == 0) {
                        qgg.h0(obj);
                        xlg xlgVar = (xlg) this.k;
                        ykf ykfVar = (ykf) this.m;
                        cvl cvlVar2 = (cvl) this.n;
                        String str7 = xlgVar.e.c().a;
                        str7.getClass();
                        f44 f44Var = new f44(xlgVar, ykfVar, (Continuation) null, xlgVar, str7, cvlVar2);
                        mn7 mn7Var = dm6.b;
                        this.l = 1;
                        V2 = x97.V(mn7Var, f44Var, this);
                        if (V2 == nm6Var20) {
                            return nm6Var20;
                        }
                    } else {
                        if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V2 = obj;
                    }
                    return (rrl) V2;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (IllegalStateException e7) {
                    cvl cvlVar3 = (cvl) this.n;
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist ", cvlVar3.b, ", id ", cvlVar3.e()), e7));
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public akc(pyc pycVar, i64 i64Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.m = (aur) pycVar;
        this.n = i64Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ akc(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ akc(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ akc(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public akc(Function2 function2, vs3 vs3Var, Continuation continuation) {
        super(2, continuation);
        this.j = 25;
        this.m = (aur) function2;
        this.n = vs3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akc(pjc[] pjcVarArr, Continuation continuation, sh2 sh2Var) {
        super(2, continuation);
        this.j = 4;
        this.m = pjcVarArr;
        this.n = sh2Var;
    }
}
