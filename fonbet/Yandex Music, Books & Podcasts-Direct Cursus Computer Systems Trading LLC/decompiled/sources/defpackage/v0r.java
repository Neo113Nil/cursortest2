package defpackage;

import android.os.Build;
import android.os.Handler;
import android.view.accessibility.AccessibilityManager;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.yandex.payment.sdk.ui.SplashActivity;
import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.cover.upload.UploadCoverService;

/* loaded from: classes3.dex */
public final class v0r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0r(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5.d(r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r5.j0(r4) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            r2f r2fVar = (r2f) this.l;
            this.k = 1;
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
        }
        pqm pqmVar = (pqm) this.m;
        this.k = 2;
    }

    private final Object l(Object obj) {
        Object a;
        y3n y3nVar;
        q2n q2nVar;
        i3n g3nVar;
        Continuation continuation;
        xik xikVar;
        e8s e8sVar = (e8s) this.m;
        c3n c3nVar = e8sVar.p;
        xdr xdrVar = e8sVar.u;
        y6s y6sVar = e8sVar.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        y3n y3nVar2 = null;
        if (i == 0) {
            qgg.h0(obj);
            vek vekVar = (vek) y6sVar.a();
            vekVar.getClass();
            vek.b(vekVar, xgr.h, null, 6);
            xdrVar.getClass();
            xdrVar.m(null, yik.a);
            l7s l7sVar = e8sVar.m;
            this.l = xdrVar;
            this.k = 1;
            a = l7sVar.a(this);
            if (a == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xdrVar = (xdr) this.l;
            qgg.h0(obj);
            a = obj;
        }
        ukj ukjVar = (ukj) a;
        if (ukjVar instanceof skj) {
            lgb lgbVar = ((skj) ukjVar).a;
            y6sVar.getClass();
            sek a2 = y6sVar.a();
            String str = lgbVar.b;
            if (str == null) {
                str = "";
            }
            vek vekVar2 = (vek) a2;
            vekVar2.getClass();
            vek.b(vekVar2, xgr.i, str, 4);
            xikVar = new xik(new e3n(new m3n(c3nVar.a(R.string.purchase_application_title_without_offer), null), c3nVar.a(R.string.purchase_block_empty_description)));
            continuation = null;
        } else {
            if (!(ukjVar instanceof tkj)) {
                b6e.s();
                return null;
            }
            mkj mkjVar = ((tkj) ukjVar).a;
            LinkedHashMap linkedHashMap = mkjVar.b;
            ((zhk) y6sVar.a.getValue()).b(mkjVar);
            if (linkedHashMap.isEmpty()) {
                vek vekVar3 = (vek) y6sVar.a();
                vekVar3.getClass();
                vek.b(vekVar3, xgr.j, null, 6);
            } else {
                vek vekVar4 = (vek) y6sVar.a();
                vekVar4.getClass();
                vek.b(vekVar4, xgr.k, null, 6);
            }
            e8sVar.y = mkjVar;
            final kpm kpmVar = new kpm(13, e8sVar);
            c3nVar.getClass();
            cte cteVar = new cte(19, c3nVar, linkedHashMap, kpmVar);
            final bve bveVar = (bve) linkedHashMap.get("left_button");
            if (bveVar == null) {
                g3nVar = (i3n) cteVar.invoke();
            } else {
                final bve bveVar2 = (bve) linkedHashMap.get("right_button");
                if (bveVar2 == null) {
                    g3nVar = (i3n) cteVar.invoke();
                } else {
                    String str2 = bveVar.d;
                    if (str2 != null) {
                        String str3 = bveVar.e;
                        String str4 = bveVar.f;
                        if (str4 == null) {
                            str4 = str2;
                        }
                        y3nVar2 = new y3n(str2, str3, str4);
                    }
                    y3n y3nVar3 = y3nVar2;
                    if (y3nVar3 == null) {
                        g3nVar = (i3n) cteVar.invoke();
                    } else {
                        String str5 = bveVar2.d;
                        if (str5 == null) {
                            y3nVar = null;
                        } else {
                            String str6 = bveVar2.e;
                            String str7 = bveVar2.f;
                            if (str7 == null) {
                                str7 = str5;
                            }
                            y3nVar = new y3n(str5, str6, str7);
                        }
                        if (y3nVar == null) {
                            g3nVar = (i3n) cteVar.invoke();
                        } else {
                            final b3n d = c3n.d(linkedHashMap);
                            final int i2 = 0;
                            q2n c = c3nVar.c(bveVar, c3n.e("left_button"), new Function1() { // from class: z2n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i3 = i2;
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    switch (i3) {
                                        case 0:
                                            b3n b3nVar = d;
                                            bve bveVar3 = bveVar;
                                            boolean z = false;
                                            if ((b3nVar != null ? b3nVar.a(bveVar3) : false) && booleanValue) {
                                                z = true;
                                            }
                                            kpmVar.J(bveVar3, z);
                                            break;
                                        case 1:
                                            b3n b3nVar2 = d;
                                            bve bveVar4 = bveVar;
                                            boolean z2 = false;
                                            if ((b3nVar2 != null ? b3nVar2.a(bveVar4) : false) && booleanValue) {
                                                z2 = true;
                                            }
                                            kpmVar.J(bveVar4, z2);
                                            break;
                                        default:
                                            b3n b3nVar3 = d;
                                            bve bveVar5 = bveVar;
                                            boolean z3 = false;
                                            if ((b3nVar3 != null ? b3nVar3.a(bveVar5) : false) && booleanValue) {
                                                z3 = true;
                                            }
                                            kpmVar.J(bveVar5, z3);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, new a3n(kpmVar, bveVar, i2));
                            final int i3 = 1;
                            q2n c2 = c3nVar.c(bveVar2, c3n.e("right_button"), new Function1() { // from class: z2n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i32 = i3;
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    switch (i32) {
                                        case 0:
                                            b3n b3nVar = d;
                                            bve bveVar3 = bveVar2;
                                            boolean z = false;
                                            if ((b3nVar != null ? b3nVar.a(bveVar3) : false) && booleanValue) {
                                                z = true;
                                            }
                                            kpmVar.J(bveVar3, z);
                                            break;
                                        case 1:
                                            b3n b3nVar2 = d;
                                            bve bveVar4 = bveVar2;
                                            boolean z2 = false;
                                            if ((b3nVar2 != null ? b3nVar2.a(bveVar4) : false) && booleanValue) {
                                                z2 = true;
                                            }
                                            kpmVar.J(bveVar4, z2);
                                            break;
                                        default:
                                            b3n b3nVar3 = d;
                                            bve bveVar5 = bveVar2;
                                            boolean z3 = false;
                                            if ((b3nVar3 != null ? b3nVar3.a(bveVar5) : false) && booleanValue) {
                                                z3 = true;
                                            }
                                            kpmVar.J(bveVar5, z3);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, new a3n(kpmVar, bveVar2, i3));
                            final bve bveVar3 = (bve) linkedHashMap.get("bottom_button");
                            if (bveVar3 != null) {
                                final int i4 = 2;
                                q2nVar = c3nVar.c(bveVar3, true, new Function1() { // from class: z2n
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i32 = i4;
                                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                                        switch (i32) {
                                            case 0:
                                                b3n b3nVar = d;
                                                bve bveVar32 = bveVar3;
                                                boolean z = false;
                                                if ((b3nVar != null ? b3nVar.a(bveVar32) : false) && booleanValue) {
                                                    z = true;
                                                }
                                                kpmVar.J(bveVar32, z);
                                                break;
                                            case 1:
                                                b3n b3nVar2 = d;
                                                bve bveVar4 = bveVar3;
                                                boolean z2 = false;
                                                if ((b3nVar2 != null ? b3nVar2.a(bveVar4) : false) && booleanValue) {
                                                    z2 = true;
                                                }
                                                kpmVar.J(bveVar4, z2);
                                                break;
                                            default:
                                                b3n b3nVar3 = d;
                                                bve bveVar5 = bveVar3;
                                                boolean z3 = false;
                                                if ((b3nVar3 != null ? b3nVar3.a(bveVar5) : false) && booleanValue) {
                                                    z3 = true;
                                                }
                                                kpmVar.J(bveVar5, z3);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, new a3n(kpmVar, bveVar3, i4));
                            } else {
                                q2nVar = null;
                            }
                            g3nVar = new g3n(c3nVar.b(linkedHashMap), q2nVar, d != null ? d.a : null, y3nVar3, c, y3nVar, c2);
                        }
                    }
                }
            }
            mkj mkjVar2 = e8sVar.y;
            ((zhk) y6sVar.a.getValue()).e();
            if (mkjVar2 != null && !mkjVar2.b.isEmpty()) {
                vek vekVar5 = (vek) y6sVar.a();
                vekVar5.getClass();
                vek.b(vekVar5, xgr.l, null, 6);
            }
            if (y6sVar.f) {
                continuation = null;
            } else {
                y6sVar.f = true;
                hmh hmhVar = (hmh) y6sVar.e.getValue();
                continuation = null;
                x97.y(hmhVar.a, null, null, new zig(hmhVar, continuation, 15), 3);
            }
            xikVar = new xik(g3nVar, mkjVar.c);
        }
        xdrVar.getClass();
        xdrVar.m(continuation, xikVar);
        return Unit.a;
    }

    private final Object n(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            p5d p5dVar = (p5d) this.m;
            ssg.a(4, "TestPlayer", "prepare: playable=" + p5dVar.a + ", play=" + p5dVar.b + ", position=" + p5dVar.d + ", playbackSpeed=" + p5dVar.e + ", mute=" + p5dVar.c, null);
            ((i9s) this.l).g = ((p5d) this.m).a;
            ((i9s) this.l).i = ((p5d) this.m).d;
            ((i9s) this.l).k = tnl.d;
            ((i9s) this.l).l = ((p5d) this.m).e;
            i9s i9sVar = (i9s) this.l;
            i9sVar.h = !Intrinsics.d(i9sVar.g, h1b.e) ? ((Number) dag.p(((i9s) this.l).g, rwd.g)).longValue() : 0L;
            i9s.y((i9s) this.l);
            if (((p5d) this.m).b) {
                i9s i9sVar2 = (i9s) this.l;
                this.k = 1;
                if (i9sVar2.n(this) == nm6Var) {
                    return nm6Var;
                }
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
        int[] iArr;
        Object obj2 = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(3, "TinyMlOfflineRecommender", "save TinyMl recommender state", null);
            aks aksVar = (aks) this.l;
            s9f[] s9fVarArr = aks.g;
            hks hksVar = (hks) aksVar.d.getValue();
            vjs vjsVar = (vjs) this.m;
            synchronized (vjsVar) {
                iArr = vjsVar.a.k;
            }
            this.k = 1;
            cks cksVar = (cks) hksVar.b.getValue();
            cksVar.getClass();
            Object V = x97.V(dm6.b, new av7(cksVar, iArr, continuation, 4), this);
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

    private final Object p(Object obj) {
        nls nlsVar = (nls) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            nlsVar.a.setValue(Boolean.TRUE);
            eno s0 = szf.s0(new wfs(4, nlsVar));
            ryp rypVar = new ryp(26, (lls) this.m);
            this.k = 1;
            if (s0.collect(rypVar, this) == nm6Var) {
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

    private final Object q(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            crs crsVar = (crs) this.l;
            wb7 wb7Var = crsVar.a;
            l1p l1pVar = new l1p((String) this.m, crsVar, (Continuation) null, 3);
            this.k = 1;
            if (lmm.a(wb7Var, l1pVar, this) == nm6Var) {
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

    private final Object s(Object obj) {
        nrs nrsVar = (nrs) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rar y = x97.y((mm6) this.l, null, null, new glp(nrsVar, null, 29), 3);
            pjc a = ((tbb) nrsVar.b.o.getValue()).a();
            jqp jqpVar = new jqp(16, nrsVar, y);
            this.k = 1;
            if (a.collect(jqpVar, this) == nm6Var) {
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

    private final Object t(Object obj) {
        Function0 function0 = (Function0) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                mat matVar = (mat) this.l;
                this.k = 1;
                obj = mat.b(matVar, this);
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
            function0.invoke();
            return Unit.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new v0r((cr) this.l, (h4q) this.m, continuation, 0);
            case 1:
                return new v0r((cr) this.l, (n4q) this.m, continuation, 1);
            case 2:
                return new v0r((g1r) this.l, (pb) this.m, continuation, 2);
            case 3:
                v0r v0rVar = new v0r((tnm) this.m, continuation, 3);
                v0rVar.l = obj;
                return v0rVar;
            case 4:
                v0r v0rVar2 = new v0r((SplashActivity) this.m, continuation, 4);
                v0rVar2.l = obj;
                return v0rVar2;
            case 5:
                return new v0r((t6r) this.l, (String) this.m, continuation, 5);
            case 6:
                return new v0r((s7r) this.m, continuation, 6);
            case 7:
                v0r v0rVar3 = new v0r((wor) this.m, continuation, 7);
                v0rVar3.l = obj;
                return v0rVar3;
            case 8:
                return new v0r((yk3) this.l, (tm0) this.m, continuation, 8);
            case 9:
                return new v0r((two) this.l, (Function1) this.m, continuation, 9);
            case 10:
                return new v0r((Function0) this.l, (two) this.m, continuation, 10);
            case 11:
                v0r v0rVar4 = new v0r((xr7) this.m, continuation, 11);
                v0rVar4.l = obj;
                return v0rVar4;
            case 12:
                v0r v0rVar5 = new v0r((rrr) this.m, continuation, 12);
                v0rVar5.l = obj;
                return v0rVar5;
            case 13:
                return new v0r((Function0) this.l, (u6k) this.m, continuation, 13);
            case 14:
                v0r v0rVar6 = new v0r((jxr) this.m, continuation, 14);
                v0rVar6.l = obj;
                return v0rVar6;
            case 15:
                return new v0r((List) this.l, (eyr) this.m, continuation, 15);
            case 16:
                return new v0r((r2s) this.l, (onq) this.m, continuation, 16);
            case 17:
                v0r v0rVar7 = new v0r((y3s) this.m, continuation, 17);
                v0rVar7.l = obj;
                return v0rVar7;
            case 18:
                return new v0r((k5s) this.l, (rce) this.m, continuation, 18);
            case 19:
                v0r v0rVar8 = new v0r((k5s) this.m, continuation, 19);
                v0rVar8.l = obj;
                return v0rVar8;
            case 20:
                return new v0r((t5s) this.m, continuation, 20);
            case 21:
                return new v0r((r2f) this.l, (pqm) this.m, continuation, 21);
            case 22:
                return new v0r((e8s) this.m, continuation, 22);
            case 23:
                return new v0r((i9s) this.l, (p5d) this.m, continuation, 23);
            case 24:
                return new v0r((aks) this.l, (vjs) this.m, continuation, 24);
            case 25:
                return new v0r((nls) this.l, (lls) this.m, continuation, 25);
            case 26:
                return new v0r((crs) this.l, (String) this.m, continuation, 26);
            case 27:
                return new v0r((mm6) this.l, (nrs) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new v0r((mat) this.l, (Function0) this.m, continuation, 28);
            default:
                return new v0r((UploadCoverService) this.l, (pot) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 7:
                ((v0r) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((v0r) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (defpackage.x97.V(r1, r5, r21) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0771, code lost:
    
        if (r1 == r0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x07e4, code lost:
    
        if (defpackage.lmm.a((defpackage.wb7) r1, r2, r21) == r0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07cf, code lost:
    
        if (r1 == r0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0833, code lost:
    
        if (r1.emit(r2, r21) == r0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0826, code lost:
    
        if (defpackage.x97.V(r2, r3, r21) == r0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x09a4, code lost:
    
        if (r1 == r3) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0969, code lost:
    
        if (defpackage.tnm.c(r2, r21) == r3) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0958, code lost:
    
        if (r0 != r3) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x091c, code lost:
    
        if (defpackage.tnm.c(r2, r21) != r3) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0940, code lost:
    
        if (defpackage.tnm.a(r2, r0, r21) == r3) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x098b, code lost:
    
        if (defpackage.tnm.a(r2, r1, r21) == r3) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        if (r1.collect(r3, r21) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0a2b, code lost:
    
        if (r3.isTouchExplorationEnabled() != false) goto L458;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:330:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08b9 A[Catch: all -> 0x0889, TryCatch #4 {all -> 0x0889, blocks: (B:413:0x0882, B:416:0x08b3, B:418:0x08b9, B:421:0x08d0, B:423:0x08d4, B:426:0x08e0, B:427:0x08e9, B:430:0x08f5, B:432:0x08fd, B:434:0x0908, B:436:0x0914, B:448:0x0890, B:451:0x089c, B:453:0x08a6), top: B:377:0x0845 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x08d4 A[Catch: all -> 0x0889, TryCatch #4 {all -> 0x0889, blocks: (B:413:0x0882, B:416:0x08b3, B:418:0x08b9, B:421:0x08d0, B:423:0x08d4, B:426:0x08e0, B:427:0x08e9, B:430:0x08f5, B:432:0x08fd, B:434:0x0908, B:436:0x0914, B:448:0x0890, B:451:0x089c, B:453:0x08a6), top: B:377:0x0845 }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08fd A[Catch: all -> 0x0889, TryCatch #4 {all -> 0x0889, blocks: (B:413:0x0882, B:416:0x08b3, B:418:0x08b9, B:421:0x08d0, B:423:0x08d4, B:426:0x08e0, B:427:0x08e9, B:430:0x08f5, B:432:0x08fd, B:434:0x0908, B:436:0x0914, B:448:0x0890, B:451:0x089c, B:453:0x08a6), top: B:377:0x0845 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151 A[Catch: IOException -> 0x0154, TRY_LEAVE, TryCatch #2 {IOException -> 0x0154, blocks: (B:71:0x0102, B:73:0x010e, B:75:0x012a, B:77:0x0133, B:79:0x013b, B:81:0x0151, B:87:0x0146, B:88:0x014d), top: B:70:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0182  */
    /* JADX WARN: Type inference failed for: r1v55, types: [bqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:382:0x08fb -> B:366:0x0920). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:386:0x0912 -> B:366:0x0920). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:388:0x091c -> B:366:0x0920). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        zt3 zt3Var;
        Object b;
        mm6 mm6Var;
        Object obj2;
        Object obj3;
        long j2;
        x3r x3rVar;
        zi3 zi3Var;
        Object b2;
        rjc rjcVar;
        Continuation continuation;
        Object a;
        xdr xdrVar;
        Object a2;
        Object i0;
        bqi bqiVar;
        Cancelable cancelable;
        Function2 function2;
        Object a3;
        Object o;
        Object H;
        Object L;
        pkn c;
        cak cakVar;
        Object a4;
        xdr xdrVar2;
        Object a5;
        int i = 14;
        int i2 = 18;
        int i3 = 6;
        int i4 = 4;
        int i5 = 3;
        boolean z = false;
        int i6 = 2;
        int i7 = 1;
        Continuation continuation2 = null;
        switch (this.j) {
            case 0:
                h4q h4qVar = (h4q) this.m;
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "setPlaybackSpeed(speed=" + h4qVar + ")", null);
                    s5d s5dVar = (s5d) ((cr) this.l).h;
                    this.k = 1;
                    if (s5dVar.a(h4qVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                n4q n4qVar = (n4q) this.m;
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "setVolume(volume=" + n4qVar + ")", null);
                    s5d s5dVar2 = (s5d) ((cr) this.l).h;
                    this.k = 1;
                    if (s5dVar2.v(n4qVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                g1r g1rVar = (g1r) this.l;
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (g1rVar != null) {
                        c1r c1rVar = g1rVar.c;
                        r10 = g1rVar.b != null ? 1 : 0;
                        pb pbVar = (pb) this.m;
                        int ordinal = c1rVar.ordinal();
                        long j3 = Long.MAX_VALUE;
                        if (ordinal == 0) {
                            j = 4000;
                        } else if (ordinal == 1) {
                            j = 10000;
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (pbVar != null) {
                            AccessibilityManager accessibilityManager = ((jb0) pbVar).a;
                            if (j < 2147483647L) {
                                int i11 = r10 == 0 ? 3 : 7;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    int s = mi.s(accessibilityManager, (int) j, i11);
                                    if (s != Integer.MAX_VALUE) {
                                        j3 = s;
                                    }
                                } else if (r10 != 0) {
                                    break;
                                }
                                this.k = 1;
                                if (y2x.o(j3, this) == nm6Var3) {
                                    return nm6Var3;
                                }
                                zt3Var = g1rVar.d;
                                if (zt3Var.w()) {
                                }
                            }
                        }
                        j3 = j;
                        this.k = 1;
                        if (y2x.o(j3, this) == nm6Var3) {
                        }
                        zt3Var = g1rVar.d;
                        if (zt3Var.w()) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    zt3Var = g1rVar.d;
                    if (zt3Var.w()) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(n1r.a);
                    }
                }
                return Unit.a;
            case 3:
                tnm tnmVar = (tnm) this.m;
                nm6 nm6Var4 = nm6.a;
                long j4 = 5000;
                try {
                } catch (Throwable th) {
                    th = th;
                    zi3 zi3Var2 = (zi3) tnmVar.e;
                    if (zi3Var2 != null && (r1 = (x3r) gd4.b(zi3Var2.k())) != null) {
                        this.l = th;
                        this.k = 8;
                        break;
                    }
                }
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        mm6Var = (mm6) this.l;
                        if (!gld.T(mm6Var)) {
                            tnmVar.getClass();
                            glp glpVar = new glp(tnmVar, null, 13);
                            this.l = mm6Var;
                            this.k = 1;
                            obj2 = tyf.L(j4, glpVar, this);
                            if (obj2 == nm6Var4) {
                            }
                            x3rVar = (x3r) obj2;
                            if (x3rVar == null) {
                                this.l = mm6Var;
                                this.k = 2;
                                if (tnm.a(tnmVar, x3rVar, this) == nm6Var4) {
                                }
                                j2 = j4;
                                tnmVar.a = System.currentTimeMillis();
                                this.l = mm6Var;
                                this.k = i5;
                                obj3 = tnm.b(tnmVar, this);
                                if (obj3 == nm6Var4) {
                                }
                                if (((Boolean) obj3).booleanValue() && (System.currentTimeMillis() - tnmVar.a >= j2 || ((ArrayList) tnmVar.d).size() >= 30)) {
                                    this.l = mm6Var;
                                    this.k = 4;
                                    break;
                                }
                                j4 = j2;
                                i5 = 3;
                                if (!gld.T(mm6Var)) {
                                    zi3 zi3Var3 = (zi3) tnmVar.e;
                                    if (zi3Var3 != null && (r0 = (x3r) gd4.b(zi3Var3.k())) != null) {
                                        this.l = null;
                                        this.k = 5;
                                        break;
                                    }
                                    zi3Var = (zi3) tnmVar.e;
                                    if (zi3Var != null) {
                                        zi3Var.n(null);
                                    }
                                    tnmVar.e = null;
                                    this.l = null;
                                    this.k = 6;
                                    b2 = tnm.b(tnmVar, this);
                                    break;
                                }
                            } else {
                                j2 = j4;
                                this.l = mm6Var;
                                this.k = i5;
                                obj3 = tnm.b(tnmVar, this);
                                if (obj3 == nm6Var4) {
                                }
                                if (((Boolean) obj3).booleanValue()) {
                                    this.l = mm6Var;
                                    this.k = 4;
                                }
                                j4 = j2;
                                i5 = 3;
                                if (!gld.T(mm6Var)) {
                                }
                            }
                        }
                        return nm6Var4;
                    case 1:
                        mm6Var = (mm6) this.l;
                        qgg.h0(obj);
                        obj2 = obj;
                        x3rVar = (x3r) obj2;
                        if (x3rVar == null) {
                        }
                        break;
                    case 2:
                        mm6Var = (mm6) this.l;
                        qgg.h0(obj);
                        j2 = j4;
                        tnmVar.a = System.currentTimeMillis();
                        this.l = mm6Var;
                        this.k = i5;
                        obj3 = tnm.b(tnmVar, this);
                        if (obj3 == nm6Var4) {
                        }
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        j4 = j2;
                        i5 = 3;
                        if (!gld.T(mm6Var)) {
                        }
                        return nm6Var4;
                    case 3:
                        mm6Var = (mm6) this.l;
                        qgg.h0(obj);
                        obj3 = obj;
                        j2 = 5000;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        j4 = j2;
                        i5 = 3;
                        if (!gld.T(mm6Var)) {
                        }
                        return nm6Var4;
                    case 4:
                        mm6Var = (mm6) this.l;
                        qgg.h0(obj);
                        j2 = 5000;
                        j4 = j2;
                        i5 = 3;
                        if (!gld.T(mm6Var)) {
                        }
                        return nm6Var4;
                    case 5:
                        qgg.h0(obj);
                        zi3Var = (zi3) tnmVar.e;
                        if (zi3Var != null) {
                        }
                        tnmVar.e = null;
                        this.l = null;
                        this.k = 6;
                        b2 = tnm.b(tnmVar, this);
                        break;
                    case 6:
                        qgg.h0(obj);
                        b2 = obj;
                        if (((Boolean) b2).booleanValue()) {
                            this.k = 7;
                            break;
                        }
                        return Unit.a;
                    case 7:
                        qgg.h0(obj);
                        return Unit.a;
                    case 8:
                        th = (Throwable) this.l;
                        qgg.h0(obj);
                        zi3 zi3Var4 = (zi3) tnmVar.e;
                        if (zi3Var4 != null) {
                            zi3Var4.n(null);
                        }
                        tnmVar.e = null;
                        this.l = th;
                        this.k = 9;
                        b = tnm.b(tnmVar, this);
                        break;
                    case 9:
                        th = (Throwable) this.l;
                        qgg.h0(obj);
                        b = obj;
                        if (!((Boolean) b).booleanValue()) {
                            throw th;
                        }
                        this.l = th;
                        this.k = 10;
                        if (tnm.c(tnmVar, this) != nm6Var4) {
                            throw th;
                        }
                        return nm6Var4;
                    case 10:
                        Throwable th2 = (Throwable) this.l;
                        qgg.h0(obj);
                        throw th2;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    rjcVar = (rjc) this.l;
                    dq7 dq7Var = ca8.a;
                    mn7 mn7Var = mn7.d;
                    continuation = null;
                    m6r m6rVar = new m6r((SplashActivity) this.m, continuation, r10);
                    this.l = rjcVar;
                    this.k = 1;
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar = (rjc) this.l;
                    qgg.h0(obj);
                    continuation = null;
                }
                Unit unit = Unit.a;
                this.l = continuation;
                this.k = 2;
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    t6r t6rVar = (t6r) this.l;
                    this.k = 1;
                    a = t6r.a(t6rVar, this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                ejf ejfVar = new ejf((String) this.m, null, i7);
                this.k = 2;
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    s7r s7rVar = (s7r) this.m;
                    xdrVar = s7rVar.d;
                    this.l = xdrVar;
                    this.k = 1;
                    a2 = s7r.a(s7rVar, this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bqiVar = (bqi) this.l;
                        qgg.h0(obj);
                        i0 = obj;
                        hmm hmmVar = (hmm) i0;
                        ((xdr) bqiVar).l(hmmVar == null ? (Long) ((lpi) hmmVar).a.get(new hmm.a("show_time")) : null);
                        return Unit.a;
                    }
                    ?? r1 = (bqi) this.l;
                    qgg.h0(obj);
                    xdrVar = r1;
                    a2 = obj;
                }
                pjc data = ((wb7) a2).getData();
                this.l = xdrVar;
                this.k = 2;
                i0 = zsd.i0(data, this);
                if (i0 != nm6Var7) {
                    bqiVar = xdrVar;
                    hmm hmmVar2 = (hmm) i0;
                    ((xdr) bqiVar).l(hmmVar2 == null ? (Long) ((lpi) hmmVar2).a.get(new hmm.a("show_time")) : null);
                    return Unit.a;
                }
                return nm6Var7;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                if (i15 != 0) {
                    if (i15 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rjc rjcVar2 = (rjc) this.l;
                tqn tqnVar = new tqn();
                wor worVar = (wor) this.m;
                tal talVar = new tal(tqnVar, rjcVar2, 1);
                this.k = 1;
                worVar.collect(talVar, this);
                return nm6Var8;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) ((yk3) this.l).c;
                    Float f = new Float(0.0f);
                    tm0 tm0Var = (tm0) this.m;
                    this.k = 1;
                    if (fk0.c(fk0Var, f, tm0Var, null, this, 12) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
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
                x0q x0qVar = ((two) this.l).c.a;
                ale aleVar = new ale(i7, (Function1) this.m);
                this.k = 1;
                x0qVar.collect(aleVar, this);
                return nm6Var10;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new eyq(11, (two) this.m));
                    dt0 dt0Var = new dt0(i6, i2, null);
                    this.k = 1;
                    if (zsd.h0(s0, dt0Var, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((Function0) this.l).invoke();
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar = (ltm) this.l;
                    vuq vuqVar = new vuq(0, ((xr7) this.m).g.c(new zjj(new kgk(22, ltmVar), new bw0(ltmVar, i5))), sa8.class, "dispose", "dispose()V", 0, 13);
                    this.k = 1;
                    if (y7g.q(ltmVar, vuqVar, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                ltm ltmVar2 = (ltm) this.l;
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    WebMessenger webMessenger = ((rrr) this.m).a;
                    qrr qrrVar = new qrr(ltmVar2, r10);
                    qrr qrrVar2 = new qrr(ltmVar2, i7);
                    final cr crVar = webMessenger.d.t;
                    crVar.getClass();
                    final jlt jltVar = jlt.a;
                    r3s r3sVar = new r3s(i, qrrVar2);
                    nlt nltVar = (nlt) ((ConcurrentHashMap) crVar.d).get(jltVar);
                    if (nltVar != null) {
                        r3sVar.invoke(nltVar);
                    }
                    ((LinkedHashSet) crVar.e).add(jltVar);
                    if (!((LinkedHashMap) crVar.f).containsKey(jltVar)) {
                        ((LinkedHashMap) crVar.f).put(jltVar, new llt());
                    }
                    final klt kltVar = new klt(qrrVar, r3sVar);
                    final llt lltVar = (llt) ((LinkedHashMap) crVar.f).get(jltVar);
                    if (lltVar != null) {
                        synchronized (lltVar) {
                            lltVar.a.add(kltVar);
                        }
                        String str = "*";
                        LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.i;
                        cr crVar2 = (cr) crVar.c;
                        mlt mltVar = new mlt(crVar, jltVar);
                        HashMap hashMap = (HashMap) crVar2.d;
                        HashMap hashMap2 = (HashMap) crVar2.c;
                        Object obj4 = hashMap2.get("*");
                        if (obj4 == null) {
                            ArrayList arrayList = new ArrayList();
                            hashMap2.put("*", arrayList);
                            obj4 = arrayList;
                        }
                        ((List) obj4).add(mltVar);
                        if (crVar2.u().contains("*")) {
                            mltVar.a();
                        } else {
                            mltVar.b();
                        }
                        Integer num = "*".equals("*") ? (Integer) crVar2.g : (Integer) hashMap.get("*");
                        if (num != null) {
                            crVar.U(jltVar, crVar2.v0(mltVar, num));
                        } else if (hashMap.containsKey("*")) {
                            crVar2.O(0, "*", true);
                        }
                        linkedHashMap.put(jltVar, new jdv(crVar2, str, mltVar));
                        cancelable = new Cancelable() { // from class: hlt
                            @Override // com.yandex.messenger.websdk.api.Cancelable
                            public final void cancel() {
                                boolean isEmpty;
                                llt lltVar2 = llt.this;
                                klt kltVar2 = kltVar;
                                cr crVar3 = crVar;
                                jlt jltVar2 = jltVar;
                                synchronized (lltVar2) {
                                    lltVar2.a.remove(kltVar2);
                                }
                                Handler handler = kltVar2.c;
                                if (handler != null) {
                                    handler.removeCallbacksAndMessages(null);
                                }
                                kltVar2.c = null;
                                synchronized (lltVar2) {
                                    isEmpty = lltVar2.a.isEmpty();
                                }
                                if (isEmpty) {
                                    crVar3.getClass();
                                    Cancelable cancelable2 = (Cancelable) ((LinkedHashMap) crVar3.h).get(jltVar2);
                                    if (cancelable2 != null) {
                                        ((LinkedHashMap) crVar3.h).remove(jltVar2);
                                        cancelable2.cancel();
                                    }
                                    Closeable closeable = (Closeable) ((LinkedHashMap) crVar3.i).get(jltVar2);
                                    if (closeable != null) {
                                        ((LinkedHashMap) crVar3.i).remove(jltVar2);
                                        closeable.close();
                                    }
                                    ((LinkedHashSet) crVar3.e).remove(jltVar2);
                                    ((ConcurrentHashMap) crVar3.d).remove(jltVar2);
                                }
                            }
                        };
                    } else {
                        xq0.q("Subscription must be created");
                        cancelable = null;
                    }
                    eyq eyqVar = new eyq(16, cancelable);
                    this.l = null;
                    this.k = 1;
                    if (y7g.q(ltmVar2, eyqVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new mub((u6k) this.m, 2));
                    lf2 lf2Var = new lf2(i6, i, continuation2);
                    this.k = 1;
                    if (zsd.h0(s02, lf2Var, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((Function0) this.l).invoke();
                return Unit.a;
            case 14:
                jxr jxrVar = (jxr) this.m;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str2 = ((frt) qdcVar.C(I)).c().a;
                    str2.getClass();
                    if (!str2.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                        jrk jrkVar = (jrk) jxrVar.e.getValue();
                        this.l = mm6Var2;
                        this.k = 1;
                        if (((ork) jrkVar).a(str2, this) == nm6Var15) {
                            return nm6Var15;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var2) && (function2 = jxrVar.a) != null) {
                    function2.invoke(jxrVar, Boolean.FALSE);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    List list = (List) this.l;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (true) {
                        int i24 = 12;
                        if (it.hasNext()) {
                            te2 te2Var = (te2) it.next();
                            te2Var.getClass();
                            arrayList2.add(new v81(new ub7(i24, zsd.u0(new fs(i3, zsd.I(new z11(false, (Continuation) null))), zsd.M0(zsd.I(new z11(true, (Continuation) null)), new l1(continuation2, te2Var, i3))), new xc(i6, i4, continuation2)), i6));
                        } else {
                            clc clcVar = new clc(zsd.t0(arrayList2), new f7e(i5, i6, continuation2));
                            o7b o7bVar = new o7b(i24, (eyr) this.m);
                            this.k = 1;
                            if (clcVar.collect(o7bVar, this) == nm6Var16) {
                                return nm6Var16;
                            }
                        }
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    if (!((Boolean) ((r2s) this.l).l.getValue()).booleanValue()) {
                        r2s r2sVar = (r2s) this.l;
                        xdr xdrVar3 = r2sVar.g;
                        y2s y2sVar = new y2s(ocg.G(r2sVar.a.c), true);
                        xdrVar3.getClass();
                        xdrVar3.m(null, y2sVar);
                    }
                    r2s r2sVar2 = (r2s) this.l;
                    q2s q2sVar = r2sVar2.b;
                    m2s m2sVar = r2sVar2.a;
                    onq onqVar = (onq) this.m;
                    boolean z2 = r2sVar2.p;
                    this.k = 1;
                    a3 = q2sVar.a(m2sVar, onqVar, z2, this);
                    if (a3 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                rj6 rj6Var = (rj6) a3;
                if (rj6Var instanceof qj6) {
                    ArrayList G = ocg.G((List) ((qj6) rj6Var).a);
                    int a6 = tah.a(v75.o(G, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(a6 >= 16 ? a6 : 16);
                    Iterator it2 = G.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        linkedHashMap2.put(((w1s) next).a, next);
                    }
                    r2s r2sVar3 = (r2s) this.l;
                    xdr xdrVar4 = r2sVar3.g;
                    ArrayList<r0s> arrayList3 = r2sVar3.a.c;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    for (r0s r0sVar : arrayList3) {
                        w1s w1sVar = (w1s) linkedHashMap2.get(r0sVar.a);
                        if (w1sVar == null) {
                            w1sVar = ocg.F(r0sVar);
                        }
                        arrayList4.add(w1sVar);
                    }
                    z2s z2sVar = new z2s(arrayList4);
                    xdrVar4.getClass();
                    xdrVar4.m(null, z2sVar);
                    xdr xdrVar5 = ((r2s) this.l).k;
                    Boolean bool = Boolean.TRUE;
                    xdrVar5.getClass();
                    xdrVar5.m(null, bool);
                    r2s r2sVar4 = (r2s) this.l;
                    kzp kzpVar = r2sVar4.o;
                    if (kzpVar != null) {
                        kzpVar.invoke(new d73(r2sVar4.a));
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!((Boolean) ((r2s) this.l).l.getValue()).booleanValue()) {
                        r2s r2sVar5 = (r2s) this.l;
                        xdr xdrVar6 = r2sVar5.g;
                        y2s y2sVar2 = new y2s(ocg.G(r2sVar5.a.c), false);
                        xdrVar6.getClass();
                        xdrVar6.m(null, y2sVar2);
                    }
                    r2s r2sVar6 = (r2s) this.l;
                    kzp kzpVar2 = r2sVar6.o;
                    if (kzpVar2 != null) {
                        m2s m2sVar2 = r2sVar6.a;
                        ((pj6) rj6Var).a();
                        kzpVar2.invoke(new c73(m2sVar2));
                    }
                }
                ((r2s) this.l).p = false;
                return Unit.a;
            case 17:
                cvl cvlVar = (cvl) this.l;
                nm6 nm6Var18 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    u3g u3gVar = ((y3s) this.m).m;
                    nvl g = cvlVar.g();
                    this.l = cvlVar;
                    this.k = 1;
                    o = ((t3g) u3gVar).o(g, this);
                    if (o == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    o = obj;
                }
                boolean booleanValue = ((Boolean) o).booleanValue();
                v1g v1gVar = new v1g(cvlVar.b, vz1.w(op7.c(cvlVar).a), null, qo6.e);
                int i27 = cvlVar.h;
                return new o3s(v1gVar, new w3g(tt0.C(i27), dag.A(i27, booleanValue), booleanValue), cvlVar);
            case 18:
                l18 l18Var2 = l18.b;
                nm6 nm6Var19 = nm6.a;
                int i28 = this.k;
                try {
                    if (i28 == 0) {
                        qgg.h0(obj);
                        mu7 b3 = hs4.C(((k5s) this.l).a).d((rce) this.m).b();
                        this.k = 1;
                        H = b3.H(this);
                        if (H == nm6Var19) {
                            return nm6Var19;
                        }
                    } else {
                        if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        H = obj;
                    }
                    if (((sce) H).a() == null) {
                        return null;
                    }
                    bdt I2 = hag.I(m4s.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    return Boolean.TRUE;
                } catch (IOException unused) {
                    bdt I3 = hag.I(m4s.class);
                    qdc qdcVar3 = l18Var2.a;
                    qdcVar3.getClass();
                    return Boolean.FALSE;
                }
            case 19:
                l18 l18Var3 = l18.b;
                k5s k5sVar = (k5s) this.m;
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var20 = nm6.a;
                int i29 = this.k;
                try {
                    if (i29 == 0) {
                        qgg.h0(obj);
                        try {
                            c = hs4.C(k5sVar.a).c();
                        } catch (IOException unused2) {
                        }
                        if (c != null) {
                            String c2 = o4s.c();
                            l78 l78Var = c.b;
                            pn3 pn3Var = pn3.d;
                            g78 g2 = l78Var.g(ovn.C(c2).c("SHA-256").e());
                            fo7 fo7Var = g2 != null ? new fo7(4, g2) : null;
                            if (fo7Var != null) {
                                g78 g78Var = (g78) fo7Var.b;
                                if (g78Var.b) {
                                    throw new IllegalStateException("snapshot is closed");
                                }
                                cakVar = (cak) g78Var.a.c.get(1);
                                if (cakVar != null) {
                                    return Boolean.TRUE;
                                }
                                pce pceVar = new pce(k5sVar.a);
                                pceVar.c = o4s.c();
                                pceVar.g = o4s.c();
                                dq3 dq3Var = dq3.ENABLED;
                                pceVar.r = dq3Var;
                                pceVar.q = dq3Var;
                                v0r v0rVar = new v0r(k5sVar, pceVar.a(), continuation2, i2);
                                this.l = mm6Var3;
                                this.k = 1;
                                L = tyf.L(3000L, v0rVar, this);
                                if (L == nm6Var20) {
                                    return nm6Var20;
                                }
                            }
                        }
                        cakVar = null;
                        if (cakVar != null) {
                        }
                        pce pceVar2 = new pce(k5sVar.a);
                        pceVar2.c = o4s.c();
                        pceVar2.g = o4s.c();
                        dq3 dq3Var2 = dq3.ENABLED;
                        pceVar2.r = dq3Var2;
                        pceVar2.q = dq3Var2;
                        v0r v0rVar2 = new v0r(k5sVar, pceVar2.a(), continuation2, i2);
                        this.l = mm6Var3;
                        this.k = 1;
                        L = tyf.L(3000L, v0rVar2, this);
                        if (L == nm6Var20) {
                        }
                    } else {
                        if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        L = obj;
                    }
                    Boolean bool2 = (Boolean) L;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        bdt I4 = hag.I(m4s.class);
                        qdc qdcVar4 = l18Var3.a;
                        qdcVar4.getClass();
                    }
                    return Boolean.valueOf(z);
                } catch (IOException unused3) {
                    bdt I5 = hag.I(m4s.class);
                    qdc qdcVar5 = l18Var3.a;
                    qdcVar5.getClass();
                    return Boolean.FALSE;
                }
            case 20:
                t5s t5sVar = (t5s) this.m;
                xdr xdrVar7 = t5sVar.g;
                nm6 nm6Var21 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    this.l = xdrVar7;
                    this.k = 1;
                    a4 = t5s.a(t5sVar, this);
                    if (a4 != nm6Var21) {
                        xdrVar2 = xdrVar7;
                    }
                    return nm6Var21;
                }
                if (i30 != 1) {
                    if (i30 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xdr xdrVar8 = (xdr) this.l;
                qgg.h0(obj);
                xdrVar2 = xdrVar8;
                a4 = obj;
                xdrVar2.l(a4);
                h7a d0 = zsd.d0(xdrVar7, 1);
                ryp rypVar = new ryp(23, t5sVar);
                this.l = null;
                this.k = 2;
                break;
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                return n(obj);
            case 24:
                return o(obj);
            case 25:
                return p(obj);
            case 26:
                return q(obj);
            case 27:
                return s(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj);
            default:
                pot potVar = (pot) this.m;
                UploadCoverService uploadCoverService = (UploadCoverService) this.l;
                nm6 nm6Var22 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    a5 = UploadCoverService.a(uploadCoverService, potVar, this);
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a5 = ((z7o) obj).a;
                }
                l1p l1pVar = new l1p(uploadCoverService, potVar, a5, null, 4);
                bsd b4 = dm6.b();
                this.k = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0r(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
