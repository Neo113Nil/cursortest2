package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bms;
import defpackage.g050;
import defpackage.g0j0;
import defpackage.gtq0;
import defpackage.i0j0;
import defpackage.l0j0;
import defpackage.l3y;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.pzt0;
import defpackage.qxi;
import defpackage.rol0;
import defpackage.rzo;
import defpackage.s6y;
import defpackage.sb2;
import defpackage.sue0;
import defpackage.t6;
import defpackage.t6y;
import defpackage.t791;
import defpackage.th40;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.twt0;
import defpackage.vw21;
import defpackage.w511;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.ykp0;
import defpackage.z5w;
import defpackage.zii0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.e;

/* loaded from: classes5.dex */
public abstract class e {
    public final sue0 a;
    public final tse b;
    public final oz40 c;
    public final float d;
    public final t6 e;
    public final g f;
    public final LayoutDirection g;
    public final wls h;
    public final kotlinx.coroutines.sync.a i = gtq0.a();
    public final oz40 j = androidx.compose.runtime.f.j(null);
    public final qxi k = androidx.compose.runtime.f.d(new g0j0(this, 0));
    public final oz40 l = androidx.compose.runtime.f.j(new wu60(0));
    public final oz40 m = androidx.compose.runtime.f.j(new z5w(0));
    public final oz40 n = androidx.compose.runtime.f.j(null);
    public final oz40 o = androidx.compose.runtime.f.j(null);
    public long p = 0;
    public final HashSet q = new HashSet();
    public final oz40 r = androidx.compose.runtime.f.j(null);
    public final androidx.compose.animation.core.a s = new androidx.compose.animation.core.a(new wu60(0), gtq0.k, (Object) null, 12);
    public final rol0 t = androidx.compose.runtime.f.o(new g0j0(this, 1));

    public e(sue0 sue0Var, tse tseVar, oz40 oz40Var, float f, t6 t6Var, g gVar, LayoutDirection layoutDirection, wls wlsVar) {
        this.a = sue0Var;
        this.b = tseVar;
        this.c = oz40Var;
        this.d = f;
        this.e = t6Var;
        this.f = gVar;
        this.g = layoutDirection;
        this.h = wlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (((defpackage.l0j0) r7).a() == ((androidx.compose.foundation.lazy.b) r3.b).h()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b8, code lost:
    
        if (((defpackage.l0j0) r7).a() == ((defpackage.l0j0) r13).a()) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final e eVar, Scroller$Direction scroller$Direction, ContinuationImpl continuationImpl) {
        ReorderableLazyCollectionState$moveDraggingItemToEnd$1 reorderableLazyCollectionState$moveDraggingItemToEnd$1;
        int i;
        Scroller$Direction scroller$Direction2;
        l3y d;
        int i2;
        CoroutineSingletons coroutineSingletons;
        long j;
        zii0 b;
        Scroller$Direction scroller$Direction3;
        Object obj;
        l3y l3yVar;
        Object obj2;
        t6 t6Var = eVar.e;
        sue0 sue0Var = eVar.a;
        kotlinx.coroutines.sync.a aVar = eVar.i;
        if (continuationImpl instanceof ReorderableLazyCollectionState$moveDraggingItemToEnd$1) {
            reorderableLazyCollectionState$moveDraggingItemToEnd$1 = (ReorderableLazyCollectionState$moveDraggingItemToEnd$1) continuationImpl;
            int i3 = reorderableLazyCollectionState$moveDraggingItemToEnd$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = reorderableLazyCollectionState$moveDraggingItemToEnd$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reorderableLazyCollectionState$moveDraggingItemToEnd$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    scroller$Direction2 = scroller$Direction;
                    reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$0 = scroller$Direction2;
                    reorderableLazyCollectionState$moveDraggingItemToEnd$1.label = 1;
                    if (aVar.a(reorderableLazyCollectionState$moveDraggingItemToEnd$1) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11Var;
                    }
                    Scroller$Direction scroller$Direction4 = (Scroller$Direction) reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$0;
                    kotlin.b.b(obj3);
                    scroller$Direction2 = scroller$Direction4;
                }
                d = eVar.d();
                if (d != null) {
                    aVar.d(null);
                    return zy11Var;
                }
                int[] iArr = i0j0.c;
                int i4 = iArr[scroller$Direction2.ordinal()];
                if (i4 == 1) {
                    l3y l3yVar2 = (l3y) kotlin.collections.a.b0(sue0Var.e().H());
                    if (l3yVar2 != null) {
                    }
                    i2 = 0;
                } else if (i4 != 2) {
                    w511.b();
                    return null;
                }
                if (i2 != 0) {
                    aVar.d(null);
                    return zy11Var;
                }
                long h = eVar.h(eVar.e());
                eVar.i(h);
                l0j0 l0j0Var = (l0j0) d;
                long b2 = l0j0Var.b();
                long f = wu60.f((Float.floatToRawIntBits((int) (b2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), h);
                long i5 = t791.i(f, rzo.a0(l0j0Var.c()));
                zii0 a = wwg.a(f, i5);
                Scroller$Direction scroller$Direction5 = scroller$Direction2;
                int i6 = i0j0.a[eVar.f().ordinal()];
                if (i6 == 1) {
                    coroutineSingletons = coroutineSingletons2;
                    j = i5;
                    b = zii0.b(a, 0.0f, 0.0f, Float.POSITIVE_INFINITY, 5);
                } else {
                    if (i6 != 2) {
                        w511.b();
                        return null;
                    }
                    coroutineSingletons = coroutineSingletons2;
                    j = i5;
                    b = zii0.b(a, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0f, 10);
                }
                ArrayList D = sue0Var.e().D(t6Var);
                int i7 = ykp0.a[scroller$Direction5.ordinal()];
                if (i7 == 1) {
                    scroller$Direction3 = Scroller$Direction.FORWARD;
                } else {
                    if (i7 != 2) {
                        w511.b();
                        return null;
                    }
                    scroller$Direction3 = Scroller$Direction.BACKWARD;
                }
                final int i8 = 0;
                l3y c = eVar.c(b, D, scroller$Direction3, new tls(eVar) { // from class: h0j0
                    public final /* synthetic */ e b;

                    {
                        this.b = eVar;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i9 = i8;
                        e eVar2 = this.b;
                        l3y l3yVar3 = (l3y) obj4;
                        switch (i9) {
                            case 0:
                                return Boolean.valueOf(((l0j0) l3yVar3).a() != ((b) eVar2.a.b).h());
                            default:
                                l0j0 l0j0Var2 = (l0j0) l3yVar3;
                                if (eVar2.q.contains(((t6y) l0j0Var2.a).k) && l0j0Var2.a() != ((b) eVar2.a.b).h()) {
                                    r1 = true;
                                }
                                return Boolean.valueOf(r1);
                        }
                    }
                });
                if (c == null) {
                    ArrayList D2 = sue0Var.e().D(t6Var);
                    final int i9 = 1;
                    tls tlsVar = new tls(eVar) { // from class: h0j0
                        public final /* synthetic */ e b;

                        {
                            this.b = eVar;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            int i92 = i9;
                            e eVar2 = this.b;
                            l3y l3yVar3 = (l3y) obj4;
                            switch (i92) {
                                case 0:
                                    return Boolean.valueOf(((l0j0) l3yVar3).a() != ((b) eVar2.a.b).h());
                                default:
                                    l0j0 l0j0Var2 = (l0j0) l3yVar3;
                                    if (eVar2.q.contains(((t6y) l0j0Var2.a).k) && l0j0Var2.a() != ((b) eVar2.a.b).h()) {
                                        r1 = true;
                                    }
                                    return Boolean.valueOf(r1);
                            }
                        }
                    };
                    int i10 = iArr[scroller$Direction5.ordinal()];
                    if (i10 == 1) {
                        ListIterator listIterator = D2.listIterator(D2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj = null;
                                break;
                            }
                            obj = listIterator.previous();
                            if (((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                                break;
                            }
                        }
                        l3yVar = (l3y) obj;
                    } else {
                        if (i10 != 2) {
                            w511.b();
                            return null;
                        }
                        Iterator it = D2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((Boolean) tlsVar.invoke(obj2)).booleanValue()) {
                                break;
                            }
                        }
                        l3yVar = (l3y) obj2;
                    }
                    c = l3yVar;
                }
                pzt0 N = tje.N(eVar.b, null, null, new ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1(c, d, null, eVar), 3);
                aVar.d(null);
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$0 = null;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$1 = null;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$2 = null;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$3 = null;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.L$4 = null;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.I$0 = i2;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.J$0 = h;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.J$1 = f;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.J$2 = j;
                reorderableLazyCollectionState$moveDraggingItemToEnd$1.label = 2;
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                return N.u0(reorderableLazyCollectionState$moveDraggingItemToEnd$1) == coroutineSingletons3 ? coroutineSingletons3 : zy11Var;
            }
        }
        reorderableLazyCollectionState$moveDraggingItemToEnd$1 = new ReorderableLazyCollectionState$moveDraggingItemToEnd$1(eVar, continuationImpl);
        Object obj32 = reorderableLazyCollectionState$moveDraggingItemToEnd$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reorderableLazyCollectionState$moveDraggingItemToEnd$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        d = eVar.d();
        if (d != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(1:(1:(4:13|14|15|16)(2:18|19))(7:20|21|22|23|24|(1:26)(1:30)|27))(5:36|37|38|39|(2:41|29)(4:42|24|(0)(0)|27)))(1:43))(3:48|(6:50|(1:52)(2:59|(1:61)(1:62))|(4:54|(1:56)|(1:58)|29)|45|(3:47|39|(0)(0))|29)|63)|44|45|(0)|29))|7|(0)(0)|44|45|(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d3, code lost:
    
        if (kotlinx.coroutines.a.u(1000, r5, r3) != r4) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0155 A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:14:0x0047, B:24:0x0147, B:26:0x0155, B:27:0x01a6, B:30:0x019a, B:39:0x011c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019a A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:14:0x0047, B:24:0x0147, B:26:0x0155, B:27:0x01a6, B:30:0x019a, B:39:0x011c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r2v0, types: [sue0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v14, types: [l3y] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r5v27, types: [l3y] */
    /* JADX WARN: Type inference failed for: r9v12, types: [l3y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, l3y l3yVar, l3y l3yVar2, ContinuationImpl continuationImpl) {
        ReorderableLazyCollectionState$moveItems$1 reorderableLazyCollectionState$moveItems$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        l0j0 l0j0Var;
        l0j0 l0j0Var2;
        l0j0 l0j0Var3;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        l3y l3yVar3;
        int i2;
        bms bmsVar;
        tse tseVar;
        n6y n6yVar;
        n6y n6yVar2;
        l3y l3yVar4;
        l0j0 l0j0Var4;
        l0j0 l0j0Var5;
        l0j0 l0j0Var6;
        int i3;
        z5w z5wVar;
        ?? r2 = eVar.a;
        try {
            if (continuationImpl instanceof ReorderableLazyCollectionState$moveItems$1) {
                reorderableLazyCollectionState$moveItems$1 = (ReorderableLazyCollectionState$moveItems$1) continuationImpl;
                int i4 = reorderableLazyCollectionState$moveItems$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    reorderableLazyCollectionState$moveItems$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = reorderableLazyCollectionState$moveItems$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = reorderableLazyCollectionState$moveItems$1.label;
                    int i5 = 0;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        l0j0Var = (l0j0) l3yVar;
                        l0j0Var2 = (l0j0) l3yVar2;
                        if (l0j0Var.a() != l0j0Var2.a()) {
                            int a = l0j0Var2.a();
                            androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) r2.b;
                            Integer num = a == bVar.h() ? new Integer(l0j0Var.a()) : l0j0Var.a() == bVar.h() ? new Integer(l0j0Var2.a()) : null;
                            if (num != null) {
                                int intValue = num.intValue();
                                int i6 = bVar.i();
                                reorderableLazyCollectionState$moveItems$1.L$0 = l0j0Var;
                                reorderableLazyCollectionState$moveItems$1.L$1 = l0j0Var2;
                                reorderableLazyCollectionState$moveItems$1.L$2 = null;
                                reorderableLazyCollectionState$moveItems$1.label = 1;
                                Object l = bVar.l(intValue, i6, reorderableLazyCollectionState$moveItems$1);
                                if (l != coroutineSingletons) {
                                    l = zy11Var;
                                }
                                if (l != coroutineSingletons) {
                                    l0j0Var3 = l0j0Var2;
                                    l0j0Var = l0j0Var;
                                }
                                return coroutineSingletons;
                            }
                            aVar = eVar.i;
                            reorderableLazyCollectionState$moveItems$1.L$0 = l0j0Var;
                            reorderableLazyCollectionState$moveItems$1.L$1 = l0j0Var2;
                            reorderableLazyCollectionState$moveItems$1.L$2 = null;
                            reorderableLazyCollectionState$moveItems$1.L$3 = aVar;
                            reorderableLazyCollectionState$moveItems$1.I$0 = 0;
                            reorderableLazyCollectionState$moveItems$1.label = 2;
                            if (aVar.a(reorderableLazyCollectionState$moveItems$1) != coroutineSingletons) {
                                g050Var = aVar;
                                l3yVar3 = l0j0Var;
                                i2 = 0;
                                bmsVar = (bms) eVar.c.getValue();
                                tseVar = eVar.b;
                                n6yVar = ((l0j0) l3yVar3).a;
                                n6yVar2 = l0j0Var2.a;
                                reorderableLazyCollectionState$moveItems$1.L$0 = l3yVar3;
                                reorderableLazyCollectionState$moveItems$1.L$1 = l0j0Var2;
                                reorderableLazyCollectionState$moveItems$1.L$2 = null;
                                reorderableLazyCollectionState$moveItems$1.L$3 = g050Var;
                                reorderableLazyCollectionState$moveItems$1.I$0 = i2;
                                reorderableLazyCollectionState$moveItems$1.I$1 = 0;
                                reorderableLazyCollectionState$moveItems$1.label = 3;
                                if (bmsVar.invoke(tseVar, n6yVar, n6yVar2, reorderableLazyCollectionState$moveItems$1) != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return zy11Var;
                    }
                    if (i == 1) {
                        ?? r22 = (l3y) reorderableLazyCollectionState$moveItems$1.L$1;
                        ?? r5 = (l3y) reorderableLazyCollectionState$moveItems$1.L$0;
                        kotlin.b.b(obj);
                        l0j0Var3 = r22;
                        l0j0Var = r5;
                    } else if (i == 2) {
                        int i7 = reorderableLazyCollectionState$moveItems$1.I$0;
                        g050 g050Var2 = (g050) reorderableLazyCollectionState$moveItems$1.L$3;
                        ?? r9 = (l3y) reorderableLazyCollectionState$moveItems$1.L$1;
                        l3y l3yVar5 = (l3y) reorderableLazyCollectionState$moveItems$1.L$0;
                        kotlin.b.b(obj);
                        i2 = i7;
                        g050Var = g050Var2;
                        l0j0Var2 = r9;
                        l3yVar3 = l3yVar5;
                        bmsVar = (bms) eVar.c.getValue();
                        tseVar = eVar.b;
                        n6yVar = ((l0j0) l3yVar3).a;
                        n6yVar2 = l0j0Var2.a;
                        reorderableLazyCollectionState$moveItems$1.L$0 = l3yVar3;
                        reorderableLazyCollectionState$moveItems$1.L$1 = l0j0Var2;
                        reorderableLazyCollectionState$moveItems$1.L$2 = null;
                        reorderableLazyCollectionState$moveItems$1.L$3 = g050Var;
                        reorderableLazyCollectionState$moveItems$1.I$0 = i2;
                        reorderableLazyCollectionState$moveItems$1.I$1 = 0;
                        reorderableLazyCollectionState$moveItems$1.label = 3;
                        if (bmsVar.invoke(tseVar, n6yVar, n6yVar2, reorderableLazyCollectionState$moveItems$1) != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        l3yVar4 = l0j0Var2;
                        l0j0Var4 = (l0j0) l3yVar4;
                        l0j0Var5 = (l0j0) l3yVar3;
                        if (l0j0Var4.a() <= l0j0Var5.a()) {
                        }
                        eVar.o.setValue(z5wVar);
                        eVar.n.setValue(new Integer(l0j0Var6.a()));
                        ReorderableLazyCollectionState$moveItems$2$1 reorderableLazyCollectionState$moveItems$2$1 = new ReorderableLazyCollectionState$moveItems$2$1(eVar, null);
                        reorderableLazyCollectionState$moveItems$1.L$0 = null;
                        reorderableLazyCollectionState$moveItems$1.L$1 = null;
                        reorderableLazyCollectionState$moveItems$1.L$2 = null;
                        reorderableLazyCollectionState$moveItems$1.L$3 = g050Var;
                        reorderableLazyCollectionState$moveItems$1.I$0 = i2;
                        reorderableLazyCollectionState$moveItems$1.I$1 = i3;
                        reorderableLazyCollectionState$moveItems$1.label = 4;
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) reorderableLazyCollectionState$moveItems$1.L$3;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11Var;
                        }
                        i5 = reorderableLazyCollectionState$moveItems$1.I$1;
                        int i8 = reorderableLazyCollectionState$moveItems$1.I$0;
                        g050 g050Var3 = (g050) reorderableLazyCollectionState$moveItems$1.L$3;
                        l3yVar4 = (l3y) reorderableLazyCollectionState$moveItems$1.L$1;
                        l3yVar3 = (l3y) reorderableLazyCollectionState$moveItems$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            i2 = i8;
                            g050Var = g050Var3;
                            l0j0Var4 = (l0j0) l3yVar4;
                            l0j0Var5 = (l0j0) l3yVar3;
                            if (l0j0Var4.a() <= l0j0Var5.a()) {
                                long b = l0j0Var4.b();
                                long c = l0j0Var4.c();
                                l0j0Var6 = l0j0Var4;
                                i3 = i5;
                                long j = ((((int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((((int) (b >> 32)) + ((int) (c >> 32))) << 32);
                                long c2 = l0j0Var5.c();
                                z5wVar = new z5w(((((int) (j >> 32)) - ((int) (c2 >> 32))) << 32) | ((((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            } else {
                                l0j0Var6 = l0j0Var4;
                                i3 = i5;
                                z5wVar = new z5w(l0j0Var6.b());
                            }
                            eVar.o.setValue(z5wVar);
                            eVar.n.setValue(new Integer(l0j0Var6.a()));
                            ReorderableLazyCollectionState$moveItems$2$1 reorderableLazyCollectionState$moveItems$2$12 = new ReorderableLazyCollectionState$moveItems$2$1(eVar, null);
                            reorderableLazyCollectionState$moveItems$1.L$0 = null;
                            reorderableLazyCollectionState$moveItems$1.L$1 = null;
                            reorderableLazyCollectionState$moveItems$1.L$2 = null;
                            reorderableLazyCollectionState$moveItems$1.L$3 = g050Var;
                            reorderableLazyCollectionState$moveItems$1.I$0 = i2;
                            reorderableLazyCollectionState$moveItems$1.I$1 = i3;
                            reorderableLazyCollectionState$moveItems$1.label = 4;
                        } catch (Throwable th) {
                            th = th;
                            r2 = g050Var3;
                            r2.d(null);
                            throw th;
                        }
                    }
                    l0j0Var2 = l0j0Var3;
                    aVar = eVar.i;
                    reorderableLazyCollectionState$moveItems$1.L$0 = l0j0Var;
                    reorderableLazyCollectionState$moveItems$1.L$1 = l0j0Var2;
                    reorderableLazyCollectionState$moveItems$1.L$2 = null;
                    reorderableLazyCollectionState$moveItems$1.L$3 = aVar;
                    reorderableLazyCollectionState$moveItems$1.I$0 = 0;
                    reorderableLazyCollectionState$moveItems$1.label = 2;
                    if (aVar.a(reorderableLazyCollectionState$moveItems$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            l0j0Var2 = l0j0Var3;
            aVar = eVar.i;
            reorderableLazyCollectionState$moveItems$1.L$0 = l0j0Var;
            reorderableLazyCollectionState$moveItems$1.L$1 = l0j0Var2;
            reorderableLazyCollectionState$moveItems$1.L$2 = null;
            reorderableLazyCollectionState$moveItems$1.L$3 = aVar;
            reorderableLazyCollectionState$moveItems$1.I$0 = 0;
            reorderableLazyCollectionState$moveItems$1.label = 2;
            if (aVar.a(reorderableLazyCollectionState$moveItems$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
        }
        reorderableLazyCollectionState$moveItems$1 = new ReorderableLazyCollectionState$moveItems$1(eVar, continuationImpl);
        Object obj2 = reorderableLazyCollectionState$moveItems$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reorderableLazyCollectionState$moveItems$1.label;
        int i52 = 0;
        zy11 zy11Var2 = zy11.a;
    }

    public final l3y c(zii0 zii0Var, ArrayList arrayList, Scroller$Direction scroller$Direction, tls tlsVar) {
        th40 th40Var = new th40(24, this, zii0Var, tlsVar);
        int i = i0j0.c[scroller$Direction.ordinal()];
        Object obj = null;
        if (i == 1) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Boolean) th40Var.invoke(next)).booleanValue()) {
                    obj = next;
                    break;
                }
            }
            return (l3y) obj;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((Boolean) th40Var.invoke(previous)).booleanValue()) {
                obj = previous;
                break;
            }
        }
        return (l3y) obj;
    }

    public final l3y d() {
        Object value = this.j.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        Iterator it = this.a.e().H().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((t6y) ((l0j0) ((l3y) next)).a).k.equals(value)) {
                obj = next;
                break;
            }
        }
        return (l3y) obj;
    }

    public final long e() {
        long b;
        l3y d = d();
        if (d == null) {
            return 0L;
        }
        l0j0 l0j0Var = (l0j0) d;
        int a = l0j0Var.a();
        oz40 oz40Var = this.n;
        Integer num = (Integer) oz40Var.getValue();
        oz40 oz40Var2 = this.o;
        if ((num != null && a == num.intValue()) || ((Integer) oz40Var.getValue()) == null) {
            oz40Var.setValue(null);
            oz40Var2.setValue(null);
            b = l0j0Var.b();
        } else {
            z5w z5wVar = (z5w) oz40Var2.getValue();
            b = z5wVar != null ? z5wVar.a : l0j0Var.b();
        }
        long j = ((wu60) this.l.getValue()).a;
        float f = (int) (((z5w) this.m.getValue()).a >> 32);
        long floatToRawIntBits = (Float.floatToRawIntBits((int) (r4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
        float f2 = (int) (b >> 32);
        long h = h(wu60.e(floatToRawIntBits, (Float.floatToRawIntBits((int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32)));
        i(h);
        return wu60.f(j, h);
    }

    public final Orientation f() {
        return ((s6y) this.a.e().b).o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Integer num, long j, ContinuationImpl continuationImpl) {
        ReorderableLazyCollectionState$onDragStart$1 reorderableLazyCollectionState$onDragStart$1;
        int i;
        Object obj;
        l3y l3yVar;
        long j2;
        if (continuationImpl instanceof ReorderableLazyCollectionState$onDragStart$1) {
            reorderableLazyCollectionState$onDragStart$1 = (ReorderableLazyCollectionState$onDragStart$1) continuationImpl;
            int i2 = reorderableLazyCollectionState$onDragStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reorderableLazyCollectionState$onDragStart$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = reorderableLazyCollectionState$onDragStart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reorderableLazyCollectionState$onDragStart$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sue0 sue0Var = this.a;
                    Iterator it = sue0Var.e().H().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((t6y) ((l0j0) ((l3y) obj)).a).k.equals(num)) {
                            break;
                        }
                    }
                    l3yVar = (l3y) obj;
                    if (l3yVar != null) {
                        long b = ((l0j0) l3yVar).b();
                        int i3 = vw21.a[f().ordinal()];
                        if (i3 == 1) {
                            j2 = b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            j2 = b >> 32;
                        }
                        int i4 = (int) j2;
                        if (i4 < 0) {
                            twt0 G = sb2.G(0.0f, 0.0f, 7, null);
                            reorderableLazyCollectionState$onDragStart$1.L$0 = num;
                            reorderableLazyCollectionState$onDragStart$1.L$1 = l3yVar;
                            reorderableLazyCollectionState$onDragStart$1.L$2 = l3yVar;
                            reorderableLazyCollectionState$onDragStart$1.J$0 = j;
                            reorderableLazyCollectionState$onDragStart$1.I$0 = 0;
                            reorderableLazyCollectionState$onDragStart$1.I$1 = i4;
                            reorderableLazyCollectionState$onDragStart$1.label = 1;
                            if (androidx.compose.foundation.gestures.c.g((androidx.compose.foundation.lazy.b) sue0Var.b, i4, G, reorderableLazyCollectionState$onDragStart$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = reorderableLazyCollectionState$onDragStart$1.J$0;
                l3y l3yVar2 = (l3y) reorderableLazyCollectionState$onDragStart$1.L$2;
                Object obj3 = reorderableLazyCollectionState$onDragStart$1.L$0;
                kotlin.b.b(obj2);
                l3yVar = l3yVar2;
                num = obj3;
                this.j.setValue(num);
                this.m.setValue(new z5w(((l0j0) l3yVar).b()));
                this.p = j;
                return zy11.a;
            }
        }
        reorderableLazyCollectionState$onDragStart$1 = new ReorderableLazyCollectionState$onDragStart$1(this, continuationImpl);
        Object obj22 = reorderableLazyCollectionState$onDragStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reorderableLazyCollectionState$onDragStart$1.label;
        if (i != 0) {
        }
        this.j.setValue(num);
        this.m.setValue(new z5w(((l0j0) l3yVar).b()));
        this.p = j;
        return zy11.a;
    }

    public final long h(long j) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        ((s6y) this.a.e().b).getClass();
        int i = i0j0.a[f().ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return 0L;
            }
            int i2 = i0j0.b[this.g.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    w511.b();
                    return 0L;
                }
                int i3 = vw21.a[Orientation.Horizontal.ordinal()];
                if (i3 == 1) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    float f = -Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                    floatToRawIntBits2 = Float.floatToRawIntBits(f);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return 0L;
                    }
                    float f2 = -Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    floatToRawIntBits = Float.floatToRawIntBits(f2);
                    floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
                }
                return (floatToRawIntBits << 32) | (floatToRawIntBits2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            }
        }
        return j;
    }

    public final long i(long j) {
        int i = i0j0.b[this.g.ordinal()];
        if (i == 1 || i == 2) {
            return j;
        }
        w511.b();
        return 0L;
    }
}
