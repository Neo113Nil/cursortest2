package defpackage;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetBehavior;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes5.dex */
public final class t58 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public t58(xqn xqnVar, mm6 mm6Var, gm5 gm5Var) {
        this.a = 13;
        this.b = xqnVar;
        this.c = gm5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(j1g j1gVar, Continuation continuation) {
        wid widVar;
        Object obj;
        int i;
        sid sidVar = (sid) this.b;
        if (continuation instanceof wid) {
            widVar = (wid) continuation;
            int i2 = widVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widVar.l = i2 - Integer.MIN_VALUE;
                obj = widVar.j;
                nm6 nm6Var = nm6.a;
                i = widVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = j1gVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        ecw ecwVar = (ecw) sidVar.f;
                        z3q z3qVar = ((t1q) ((vdr) this.c).getValue()).a;
                        widVar.l = 1;
                        obj = ecwVar.a.invoke(z3qVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    sidVar.b.b();
                }
                return Unit.a;
            }
        }
        widVar = new wid(this, continuation);
        obj = widVar.j;
        nm6 nm6Var2 = nm6.a;
        i = widVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r0.emit(r10, r2) != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        if (r0.emit(r10, r2) == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(List list, Continuation continuation) {
        e98 e98Var;
        int i;
        ArrayList arrayList;
        xdr xdrVar;
        rjc rjcVar = (rjc) this.b;
        vx6 vx6Var = (vx6) this.c;
        if (continuation instanceof e98) {
            e98Var = (e98) continuation;
            int i2 = e98Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e98Var.m = i2 - Integer.MIN_VALUE;
                Object obj = e98Var.k;
                nm6 nm6Var = nm6.a;
                i = e98Var.m;
                int i3 = 1;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    z66 z66Var = (z66) vx6Var.d;
                    xdr xdrVar2 = (xdr) vx6Var.c;
                    if (z66Var.g()) {
                        e98Var.j = xdrVar2;
                        e98Var.m = 1;
                        dq7 dq7Var = ca8.a;
                        obj = x97.V(mn7.d, new ta2(list, continuation2, i3), e98Var);
                        if (obj != nm6Var) {
                            xdrVar = xdrVar2;
                            xdrVar.l(obj);
                            Object value = ((xdr) vx6Var.c).getValue();
                            e98Var.j = null;
                            e98Var.m = 2;
                        }
                    } else {
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((t2m) it.next()).a.a);
                        }
                        List list3 = (List) xdrVar2.getValue();
                        if (list3 != null) {
                            List<mqs> list4 = list3;
                            ArrayList arrayList3 = new ArrayList(v75.o(list4, 10));
                            for (mqs mqsVar : list4) {
                                if (!arrayList2.contains(mqsVar.a)) {
                                    mqsVar = null;
                                }
                                arrayList3.add(mqsVar);
                            }
                            arrayList = new ArrayList();
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                mqs mqsVar2 = (mqs) it2.next();
                                if (mqsVar2 != null) {
                                    arrayList.add(mqsVar2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        e98Var.j = null;
                        e98Var.m = 3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                xdrVar = e98Var.j;
                qgg.h0(obj);
                xdrVar.l(obj);
                Object value2 = ((xdr) vx6Var.c).getValue();
                e98Var.j = null;
                e98Var.m = 2;
            }
        }
        e98Var = new e98(this, continuation);
        Object obj2 = e98Var.k;
        nm6 nm6Var2 = nm6.a;
        i = e98Var.m;
        int i32 = 1;
        Continuation continuation22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0444, code lost:
    
        if (r2.emit(r0, r3) == r4) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05bd, code lost:
    
        if (r2.emit(r0, r3) != r4) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05b0, code lost:
    
        if (r5.invoke(r0, r3) == r4) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0678, code lost:
    
        if (r0.emit(r2, r3) != r4) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06f0, code lost:
    
        if (r2.emit(r0, r3) == r4) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x06d9, code lost:
    
        if (r5 == r4) goto L360;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0174  */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        s58 s58Var;
        int i;
        x78 x78Var;
        int i2;
        dca dcaVar;
        int i3;
        Object daaVar;
        j0b j0bVar;
        int i4;
        t0b t0bVar;
        int i5;
        rjc rjcVar;
        Object c;
        dzb dzbVar;
        int i6;
        rjc rjcVar2;
        yyb yybVar;
        fmc fmcVar;
        int i7;
        hmc hmcVar;
        int i8;
        rjc rjcVar3;
        l2d l2dVar;
        int i9;
        gdd gddVar;
        int i10;
        nhd nhdVar;
        int i11;
        rjc rjcVar4;
        Object obj2;
        rjc rjcVar5;
        rid ridVar;
        int i12;
        g2e g2eVar;
        int i13;
        rge rgeVar;
        int i14;
        ske skeVar;
        int i15;
        zke zkeVar;
        int i16;
        fef fefVar;
        int i17;
        fkf fkfVar;
        int i18;
        Object obj3 = obj;
        int i19 = 0;
        boolean z = false;
        r7 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.a) {
            case 0:
                if (continuation instanceof s58) {
                    s58Var = (s58) continuation;
                    int i23 = s58Var.k;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        s58Var.k = i23 - Integer.MIN_VALUE;
                        Object obj4 = s58Var.j;
                        nm6 nm6Var = nm6.a;
                        i = s58Var.k;
                        if (i != 0) {
                            qgg.h0(obj4);
                            rjc rjcVar6 = (rjc) this.b;
                            if (((x66) obj3).a && ((bw1) this.c).b) {
                                s58Var.k = 1;
                                if (rjcVar6.emit(obj3, s58Var) == nm6Var) {
                                    return nm6Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj4);
                        }
                        return Unit.a;
                    }
                }
                s58Var = new s58(this, continuation);
                Object obj42 = s58Var.j;
                nm6 nm6Var2 = nm6.a;
                i = s58Var.k;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                c88 c88Var = (c88) this.c;
                if (continuation instanceof x78) {
                    x78Var = (x78) continuation;
                    int i24 = x78Var.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        x78Var.k = i24 - Integer.MIN_VALUE;
                        Object obj5 = x78Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = x78Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj5);
                            rjc rjcVar7 = (rjc) this.b;
                            f88 a = c88Var.a.a();
                            if (a != null) {
                                c88.b(c88Var, a);
                            }
                            Long l = new Long(a != null ? a.b : Long.MAX_VALUE);
                            x78Var.k = 1;
                            if (rjcVar7.emit(l, x78Var) == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj5);
                        }
                        return Unit.a;
                    }
                }
                x78Var = new x78(this, continuation);
                Object obj52 = x78Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = x78Var.k;
                if (i2 != 0) {
                }
                return Unit.a;
            case 2:
                return c((List) obj3, continuation);
            case 3:
                us8 us8Var = (us8) obj3;
                if (us8Var instanceof ts8) {
                    g06 g06Var = (g06) this.b;
                    gc8 gc8Var = (gc8) g06Var.d;
                    rs8 rs8Var = ((ts8) us8Var).a;
                    String str = rs8Var.a;
                    rv8 rv8Var = rs8Var.c;
                    ((qy2) this.c).a(str, "DivCommunicationView");
                    sk3.T(gc8Var, rv8Var, new dw8("div-communication"), (dzf) g06Var.a, pd.M());
                }
                return Unit.a;
            case 4:
                m mVar = (m) this.c;
                if (continuation instanceof dca) {
                    dcaVar = (dca) continuation;
                    int i25 = dcaVar.k;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        dcaVar.k = i25 - Integer.MIN_VALUE;
                        Object obj6 = dcaVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = dcaVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj6);
                            rjc rjcVar8 = (rjc) this.b;
                            wba wbaVar = (wba) obj3;
                            if (wbaVar instanceof vba) {
                                daaVar = new faa(m.a(mVar, ((vba) wbaVar).a.size()));
                            } else if (Intrinsics.d(wbaVar, sba.a)) {
                                daaVar = caa.a;
                            } else if (Intrinsics.d(wbaVar, uba.a)) {
                                daaVar = eaa.a;
                            } else {
                                if (!(wbaVar instanceof tba)) {
                                    b6e.s();
                                    return null;
                                }
                                daaVar = new daa(m.a(mVar, ((tba) wbaVar).a.size()));
                            }
                            dcaVar.k = 1;
                            if (rjcVar8.emit(daaVar, dcaVar) == nm6Var4) {
                                return nm6Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj6);
                        }
                        return Unit.a;
                    }
                }
                dcaVar = new dca(this, continuation);
                Object obj62 = dcaVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = dcaVar.k;
                if (i3 != 0) {
                }
                return Unit.a;
            case 5:
                eea eeaVar = (eea) obj3;
                if (Intrinsics.d(eeaVar, cea.a)) {
                    return Unit.a;
                }
                if (!(eeaVar instanceof dea)) {
                    b6e.s();
                    return null;
                }
                if (((dea) eeaVar).a.isEmpty()) {
                    ((yda) this.b).d.B();
                    r2f r2fVar = (r2f) ((xqn) this.c).a;
                    if (r2fVar != null) {
                        r2fVar.g(null);
                    }
                }
                return Unit.a;
            case 6:
                x97.y((mm6) this.b, null, null, new nz5(obj3, this.c, (Continuation) (objArr == true ? 1 : 0), 12), 3);
                return Unit.a;
            case 7:
                x97.y((mm6) this.b, null, null, new f98(obj3, this.c, (Continuation) (objArr2 == true ? 1 : 0), 17), 3);
                return Unit.a;
            case 8:
                if (continuation instanceof j0b) {
                    j0bVar = (j0b) continuation;
                    int i26 = j0bVar.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        j0bVar.k = i26 - Integer.MIN_VALUE;
                        Object obj7 = j0bVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = j0bVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj7);
                            rjc rjcVar9 = (rjc) this.b;
                            how howVar = (how) obj3;
                            if (howVar != null) {
                                ((k0b) this.c).getClass();
                                arrayList = k0b.a(howVar);
                            }
                            if (arrayList != null) {
                                j0bVar.k = 1;
                                if (rjcVar9.emit(arrayList, j0bVar) == nm6Var5) {
                                    return nm6Var5;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj7);
                        }
                        return Unit.a;
                    }
                }
                j0bVar = new j0b(this, continuation);
                Object obj72 = j0bVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = j0bVar.k;
                if (i4 != 0) {
                }
                return Unit.a;
            case 9:
                if (continuation instanceof t0b) {
                    t0bVar = (t0b) continuation;
                    int i27 = t0bVar.k;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        t0bVar.k = i27 - Integer.MIN_VALUE;
                        Object obj8 = t0bVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = t0bVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj8);
                            rjcVar = (rjc) this.b;
                            yza yzaVar = (yza) ((vx6) this.c).d;
                            t0bVar.m = obj3;
                            t0bVar.n = rjcVar;
                            t0bVar.o = 0;
                            t0bVar.k = 1;
                            c = yzaVar.c(t0bVar);
                            break;
                        } else {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    qgg.h0(obj8);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i19 = t0bVar.o;
                            rjc rjcVar10 = t0bVar.n;
                            Object obj9 = t0bVar.m;
                            qgg.h0(obj8);
                            rjcVar = rjcVar10;
                            obj3 = obj9;
                            c = obj8;
                        }
                        if (!((Boolean) c).booleanValue()) {
                            t0bVar.m = null;
                            t0bVar.n = null;
                            t0bVar.o = i19;
                            t0bVar.k = 2;
                            break;
                        }
                        return Unit.a;
                    }
                }
                t0bVar = new t0b(this, continuation);
                Object obj82 = t0bVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = t0bVar.k;
                if (i5 != 0) {
                }
                if (!((Boolean) c).booleanValue()) {
                }
                return Unit.a;
            case 10:
                if (continuation instanceof dzb) {
                    dzbVar = (dzb) continuation;
                    int i28 = dzbVar.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        dzbVar.k = i28 - Integer.MIN_VALUE;
                        Object obj10 = dzbVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = dzbVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj10);
                            rjc rjcVar11 = (rjc) this.b;
                            gzb gzbVar = ((ezb) this.c).a;
                            dzbVar.m = rjcVar11;
                            dzbVar.n = 0;
                            dzbVar.k = 1;
                            Object V = x97.V(dm6.b, new fzb((Object) gzbVar, (Continuation) (objArr3 == true ? 1 : 0), i19), dzbVar);
                            if (V != nm6Var7) {
                                obj10 = V;
                                rjcVar2 = rjcVar11;
                            }
                            return nm6Var7;
                        }
                        if (i6 != 1) {
                            if (i6 == 2) {
                                qgg.h0(obj10);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i21 = dzbVar.n;
                        rjcVar2 = dzbVar.m;
                        qgg.h0(obj10);
                        yybVar = (yyb) obj10;
                        if (yybVar == null) {
                            yybVar = ezb.e;
                        }
                        dzbVar.m = null;
                        dzbVar.n = i21;
                        dzbVar.k = 2;
                        break;
                    }
                }
                dzbVar = new dzb(this, continuation);
                Object obj102 = dzbVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = dzbVar.k;
                if (i6 != 0) {
                }
                yybVar = (yyb) obj102;
                if (yybVar == null) {
                }
                dzbVar.m = null;
                dzbVar.n = i21;
                dzbVar.k = 2;
            case 11:
                if (continuation instanceof fmc) {
                    fmcVar = (fmc) continuation;
                    int i29 = fmcVar.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        fmcVar.k = i29 - Integer.MIN_VALUE;
                        Object obj11 = fmcVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = fmcVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar12 = (rjc) this.b;
                            if (((lm4) this.c).i(obj3)) {
                                fmcVar.k = 1;
                                if (rjcVar12.emit(obj3, fmcVar) == nm6Var8) {
                                    return nm6Var8;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj11);
                        }
                        return Unit.a;
                    }
                }
                fmcVar = new fmc(this, continuation);
                Object obj112 = fmcVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = fmcVar.k;
                if (i7 != 0) {
                }
                return Unit.a;
            case 12:
                if (continuation instanceof hmc) {
                    hmcVar = (hmc) continuation;
                    int i30 = hmcVar.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        hmcVar.k = i30 - Integer.MIN_VALUE;
                        Object obj12 = hmcVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = hmcVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj12);
                            rjcVar3 = (rjc) this.b;
                            ?? r5 = this.c;
                            hmcVar.m = obj3;
                            hmcVar.n = rjcVar3;
                            hmcVar.k = 1;
                            break;
                        } else {
                            if (i8 != 1) {
                                if (i8 == 2) {
                                    qgg.h0(obj12);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rjc rjcVar13 = hmcVar.n;
                            Object obj13 = hmcVar.m;
                            qgg.h0(obj12);
                            rjcVar3 = rjcVar13;
                            obj3 = obj13;
                        }
                        hmcVar.m = null;
                        hmcVar.n = null;
                        hmcVar.k = 2;
                        break;
                    }
                }
                hmcVar = new hmc(this, continuation);
                Object obj122 = hmcVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = hmcVar.k;
                if (i8 != 0) {
                }
                hmcVar.m = null;
                hmcVar.n = null;
                hmcVar.k = 2;
            case 13:
                xqn xqnVar = (xqn) this.b;
                bqi bqiVar = (bqi) xqnVar.a;
                if (bqiVar != null) {
                    ((xdr) bqiVar).l(obj3);
                } else {
                    gm5 gm5Var = (gm5) this.c;
                    xdr a2 = ydr.a(obj3);
                    gm5Var.U(a2);
                    xqnVar.a = a2;
                }
                return Unit.a;
            case 14:
                if (continuation instanceof l2d) {
                    l2dVar = (l2d) continuation;
                    int i31 = l2dVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        l2dVar.k = i31 - Integer.MIN_VALUE;
                        Object obj14 = l2dVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = l2dVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar14 = (rjc) this.b;
                            ((p2d) this.c).getClass();
                            hmm.a aVar = new hmm.a("gdpr_first_authorized_user_id");
                            lpi lpiVar = (lpi) ((hmm) obj3);
                            lpiVar.getClass();
                            Object obj15 = lpiVar.a.get(aVar);
                            l2dVar.k = 1;
                            if (rjcVar14.emit(obj15, l2dVar) == nm6Var10) {
                                return nm6Var10;
                            }
                        } else {
                            if (i9 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj14);
                        }
                        return Unit.a;
                    }
                }
                l2dVar = new l2d(this, continuation);
                Object obj142 = l2dVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = l2dVar.k;
                if (i9 != 0) {
                }
                return Unit.a;
            case 15:
                if (continuation instanceof gdd) {
                    gddVar = (gdd) continuation;
                    int i32 = gddVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        gddVar.k = i32 - Integer.MIN_VALUE;
                        Object obj16 = gddVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = gddVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj16);
                            rjc rjcVar15 = (rjc) this.b;
                            Pair pair = new Pair(((bgd) ((dgd) this.c)).c, Boolean.valueOf(((vhd) obj3).b));
                            gddVar.k = 1;
                            if (rjcVar15.emit(pair, gddVar) == nm6Var11) {
                                return nm6Var11;
                            }
                        } else {
                            if (i10 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj16);
                        }
                        return Unit.a;
                    }
                }
                gddVar = new gdd(this, continuation);
                Object obj162 = gddVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = gddVar.k;
                if (i10 != 0) {
                }
                return Unit.a;
            case 16:
                odd oddVar = (odd) this.b;
                rar rarVar = oddVar.h;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                oddVar.h = x97.y(oddVar.f, null, null, new cdd(oddVar, objArr4 == true ? 1 : 0, i22), 3);
                agd agdVar = oddVar.a;
                String deviceId = ((ced) this.c).b.getDeviceId();
                deviceId.getClass();
                SharedPreferences.Editor edit = agdVar.b().edit();
                edit.putString("LAST_KNOWN_STATION", deviceId);
                edit.putLong("LAST_KNOWN_STATION_ACTIVE_TIME", agdVar.a.b());
                edit.putBoolean("LAST_KNOWN_STATION_HOLDING_ENABLED", true);
                edit.apply();
                return Unit.a;
            case 17:
                if (continuation instanceof nhd) {
                    nhdVar = (nhd) continuation;
                    int i33 = nhdVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        nhdVar.k = i33 - Integer.MIN_VALUE;
                        Object obj17 = nhdVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = nhdVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj17);
                            rjcVar4 = (rjc) this.b;
                            hhd hhdVar = (hhd) obj3;
                            if (hhdVar instanceof ghd) {
                                ohd ohdVar = (ohd) this.c;
                                ghd ghdVar = (ghd) hhdVar;
                                dkd dkdVar = ghdVar.a;
                                List list = ghdVar.b;
                                nhdVar.m = rjcVar4;
                                nhdVar.n = 0;
                                nhdVar.k = 1;
                                Object a3 = ohd.a(ohdVar, dkdVar, list, nhdVar);
                                if (a3 != nm6Var12) {
                                    obj17 = a3;
                                    rjcVar5 = rjcVar4;
                                }
                                return nm6Var12;
                            }
                            if (!(hhdVar instanceof fhd)) {
                                b6e.s();
                                return null;
                            }
                            obj2 = phd.c;
                            nhdVar.m = null;
                            nhdVar.n = i20;
                            nhdVar.k = 2;
                            break;
                        } else {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    qgg.h0(obj17);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i20 = nhdVar.n;
                            rjcVar5 = nhdVar.m;
                            qgg.h0(obj17);
                        }
                        Object obj18 = obj17;
                        rjcVar4 = rjcVar5;
                        obj2 = obj18;
                        nhdVar.m = null;
                        nhdVar.n = i20;
                        nhdVar.k = 2;
                    }
                }
                nhdVar = new nhd(this, continuation);
                Object obj172 = nhdVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = nhdVar.k;
                if (i11 != 0) {
                }
                Object obj182 = obj172;
                rjcVar4 = rjcVar5;
                obj2 = obj182;
                nhdVar.m = null;
                nhdVar.n = i20;
                nhdVar.k = 2;
            case 18:
                if (continuation instanceof rid) {
                    ridVar = (rid) continuation;
                    int i34 = ridVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ridVar.k = i34 - Integer.MIN_VALUE;
                        Object obj19 = ridVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = ridVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj19);
                            rjc rjcVar16 = (rjc) this.b;
                            Pair pair2 = new Pair((j1g) obj3, (m1q) this.c);
                            ridVar.k = 1;
                            if (rjcVar16.emit(pair2, ridVar) == nm6Var13) {
                                return nm6Var13;
                            }
                        } else {
                            if (i12 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj19);
                        }
                        return Unit.a;
                    }
                }
                ridVar = new rid(this, continuation);
                Object obj192 = ridVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = ridVar.k;
                if (i12 != 0) {
                }
                return Unit.a;
            case 19:
                return b((j1g) obj3, continuation);
            case 20:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                s2e s2eVar = (s2e) this.c;
                if (booleanValue) {
                    ((npq) this.b).b(s2eVar.o);
                }
                HomeLandingBottomSheetBehavior homeLandingBottomSheetBehavior = s2eVar.p;
                homeLandingBottomSheetBehavior.setDraggable(booleanValue);
                jyr jyrVar = t5j.e;
                if (wyf.M()) {
                    homeLandingBottomSheetBehavior.setDraggable(false);
                }
                return Unit.a;
            case 21:
                if (!((Boolean) ((u1e) this.b).H.getValue()).booleanValue()) {
                    s2e s2eVar2 = (s2e) this.c;
                    s2eVar2.j().post(new sr7(22, s2eVar2));
                }
                return Unit.a;
            case 22:
                if (continuation instanceof g2e) {
                    g2eVar = (g2e) continuation;
                    int i35 = g2eVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        g2eVar.k = i35 - Integer.MIN_VALUE;
                        Object obj20 = g2eVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = g2eVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj20);
                            rjc rjcVar17 = (rjc) this.b;
                            String c2 = ((skr) ((h2e) this.c).j.getValue()).c(R.string.skeleton_landing_error_message);
                            g2eVar.k = 1;
                            if (rjcVar17.emit(c2, g2eVar) == nm6Var14) {
                                return nm6Var14;
                            }
                        } else {
                            if (i13 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj20);
                        }
                        return Unit.a;
                    }
                }
                g2eVar = new g2e(this, continuation);
                Object obj202 = g2eVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = g2eVar.k;
                if (i13 != 0) {
                }
                return Unit.a;
            case 23:
                if (continuation instanceof rge) {
                    rgeVar = (rge) continuation;
                    int i36 = rgeVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        rgeVar.k = i36 - Integer.MIN_VALUE;
                        Object obj21 = rgeVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = rgeVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj21);
                            rjc rjcVar18 = (rjc) this.b;
                            if (((tge) this.c).c.getValue() == pge.a) {
                                rgeVar.k = 1;
                                if (rjcVar18.emit(obj3, rgeVar) == nm6Var15) {
                                    return nm6Var15;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj21);
                        }
                        return Unit.a;
                    }
                }
                rgeVar = new rge(this, continuation);
                Object obj212 = rgeVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = rgeVar.k;
                if (i14 != 0) {
                }
                return Unit.a;
            case 24:
                int ordinal = ((pge) obj3).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        tge tgeVar = (tge) ((jyr) ((gs4) this.b).a).getValue();
                        MainScreenActivity mainScreenActivity = (MainScreenActivity) this.c;
                        tgeVar.getClass();
                        ssg.a(4, null, "Starting update flow", null);
                        zu0 zu0Var = tgeVar.d;
                        if (zu0Var != null) {
                            tax taxVar = (tax) tgeVar.b.getValue();
                            oge ogeVar = tgeVar.e;
                            synchronized (taxVar) {
                                e5x e5xVar = taxVar.b;
                                synchronized (e5xVar) {
                                    e5xVar.a.e("registerListener", new Object[0]);
                                    if (ogeVar == null) {
                                        throw new NullPointerException("Registered Play Core listener should not be null.");
                                    }
                                    e5xVar.d.add(ogeVar);
                                    e5xVar.a();
                                }
                            }
                            try {
                                ((tax) tgeVar.b.getValue()).getClass();
                                gox.a();
                                PendingIntent pendingIntent = zu0Var.c;
                                if ((pendingIntent != null ? pendingIntent : null) != null && !zu0Var.d) {
                                    zu0Var.d = true;
                                    if (pendingIntent == null) {
                                        pendingIntent = null;
                                    }
                                    mainScreenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 24, null, 0, 0, 0, null);
                                }
                                ssg.a(4, null, "Update intent successfully sent", null);
                                xdr xdrVar = tgeVar.c;
                                pge pgeVar = pge.c;
                                xdrVar.getClass();
                                xdrVar.m(null, pgeVar);
                            } catch (IntentSender.SendIntentException unused) {
                                ssg.a(6, null, "Update flow failed. Failed to send update intent", null);
                                tgeVar.a();
                            }
                        }
                    } else if (ordinal != 2) {
                        if (ordinal == 3) {
                            yfx yfxVar = (yfx) ((gs4) this.b).d;
                            if (yfxVar != null) {
                                View view = (View) yfxVar.b;
                                int[] iArr = b1r.C;
                                b1r g = b1r.g(view, view.getResources().getText(R.string.in_app_update_title), -2);
                                ((TextView) g.i.findViewById(R.id.snackbar_text)).setMaxLines(3);
                                g.h(g.h.getText(R.string.in_app_update_restart), new ol(21, yfxVar));
                                g.i();
                            }
                        } else if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                    }
                }
                return Unit.a;
            case 25:
                if (continuation instanceof ske) {
                    skeVar = (ske) continuation;
                    int i37 = skeVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        skeVar.k = i37 - Integer.MIN_VALUE;
                        Object obj22 = skeVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = skeVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj22);
                            rjc rjcVar19 = (rjc) this.b;
                            lke a4 = ((kle) this.c).a((List) obj3);
                            skeVar.k = 1;
                            if (rjcVar19.emit(a4, skeVar) == nm6Var16) {
                                return nm6Var16;
                            }
                        } else {
                            if (i15 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj22);
                        }
                        return Unit.a;
                    }
                }
                skeVar = new ske(this, continuation);
                Object obj222 = skeVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = skeVar.k;
                if (i15 != 0) {
                }
                return Unit.a;
            case 26:
                if (continuation instanceof zke) {
                    zkeVar = (zke) continuation;
                    int i38 = zkeVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        zkeVar.k = i38 - Integer.MIN_VALUE;
                        Object obj23 = zkeVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = zkeVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj23);
                            rjc rjcVar20 = (rjc) this.b;
                            Integer num = new Integer(((jx7) this.c).L(((cma) obj3).a));
                            zkeVar.k = 1;
                            if (rjcVar20.emit(num, zkeVar) == nm6Var17) {
                                return nm6Var17;
                            }
                        } else {
                            if (i16 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj23);
                        }
                        return Unit.a;
                    }
                }
                zkeVar = new zke(this, continuation);
                Object obj232 = zkeVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = zkeVar.k;
                if (i16 != 0) {
                }
                return Unit.a;
            case 27:
                if (continuation instanceof fef) {
                    fefVar = (fef) continuation;
                    int i39 = fefVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        fefVar.k = i39 - Integer.MIN_VALUE;
                        Object obj24 = fefVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = fefVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj24);
                            rjc rjcVar21 = (rjc) this.b;
                            String c3 = ((skr) ((gef) this.c).j.getValue()).c(R.string.skeleton_landing_error_message);
                            fefVar.k = 1;
                            if (rjcVar21.emit(c3, fefVar) == nm6Var18) {
                                return nm6Var18;
                            }
                        } else {
                            if (i17 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj24);
                        }
                        return Unit.a;
                    }
                }
                fefVar = new fef(this, continuation);
                Object obj242 = fefVar.j;
                nm6 nm6Var182 = nm6.a;
                i17 = fefVar.k;
                if (i17 != 0) {
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                dys dysVar = (dys) obj3;
                l5v l5vVar = (l5v) this.c;
                rjf rjfVar = (rjf) this.b;
                if (rjfVar.a) {
                    l5vVar.setTrackMoodSpecs(dysVar);
                } else if (((dys) rjfVar.o) == null) {
                    l5vVar.d(true);
                }
                rjfVar.o = dysVar;
                return Unit.a;
            default:
                if (continuation instanceof fkf) {
                    fkfVar = (fkf) continuation;
                    int i40 = fkfVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        fkfVar.k = i40 - Integer.MIN_VALUE;
                        Object obj25 = fkfVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = fkfVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj25);
                            rjc rjcVar22 = (rjc) this.b;
                            u64 u64Var = (u64) obj3;
                            hkf hkfVar = (hkf) this.c;
                            if (Intrinsics.d(u64Var, r64.a) || (u64Var instanceof p64)) {
                                z = true;
                            } else if (u64Var instanceof t64) {
                                z = ((List) hkfVar.c.getValue()).contains(((t64) u64Var).a.b);
                            } else if (!(u64Var instanceof q64)) {
                                b6e.s();
                                return null;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            fkfVar.k = 1;
                            if (rjcVar22.emit(valueOf, fkfVar) == nm6Var19) {
                                return nm6Var19;
                            }
                        } else {
                            if (i18 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj25);
                        }
                        return Unit.a;
                    }
                }
                fkfVar = new fkf(this, continuation);
                Object obj252 = fkfVar.j;
                nm6 nm6Var192 = nm6.a;
                i18 = fkfVar.k;
                if (i18 != 0) {
                }
                return Unit.a;
        }
    }

    public t58(vx6 vx6Var, rjc rjcVar) {
        this.a = 2;
        this.c = vx6Var;
        this.b = rjcVar;
    }

    public /* synthetic */ t58(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
