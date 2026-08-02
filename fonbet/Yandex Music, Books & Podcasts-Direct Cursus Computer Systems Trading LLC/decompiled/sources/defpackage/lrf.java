package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.yandex.music.shared.playback.api.commands.ChangeMediaOutputTargetCommand;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.a1;
import com.yandex.passport.api.b1;
import com.yandex.passport.api.c1;
import com.yandex.passport.api.d1;
import com.yandex.passport.api.z0;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public final class lrf implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lrf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0179, code lost:
    
        if (r3.T(r14, null, r4) != r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
    
        if (r2 == r5) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(af5 af5Var, Continuation continuation) {
        l6i l6iVar;
        int i;
        int i2;
        int i3;
        int i4;
        gcc gccVar;
        gcc gccVar2;
        boolean booleanValue;
        n1p n1pVar;
        t1p t1pVar;
        af5 af5Var2 = af5Var;
        j7i j7iVar = (j7i) this.b;
        if (continuation instanceof l6i) {
            l6iVar = (l6i) continuation;
            int i5 = l6iVar.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                l6iVar.p = i5 - Integer.MIN_VALUE;
                Object obj = l6iVar.n;
                Object obj2 = nm6.a;
                i = l6iVar.p;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    af5 af5Var3 = j7iVar.x;
                    String str = af5Var3 != null ? af5Var3.a : null;
                    String str2 = af5Var2.a;
                    n1p n1pVar2 = af5Var2.b;
                    boolean d = Intrinsics.d(str, str2);
                    i2 = !d ? 1 : 0;
                    l6p l6pVar = (l6p) j7iVar.B.getValue();
                    k6p k6pVar = l6pVar instanceof k6p ? (k6p) l6pVar : null;
                    boolean d2 = Intrinsics.d(k6pVar != null ? k6pVar.c : null, n1pVar2);
                    i3 = !d2 ? 1 : 0;
                    if (d) {
                        i4 = 1;
                    } else {
                        j7iVar.J = null;
                        i4 = 1;
                        x97.y((mm6) this.c, null, null, new k6i(j7iVar, continuation2, 0), 3);
                        Iterator it = xz0.w(new r2f[]{j7iVar.K, j7iVar.L}).iterator();
                        while (it.hasNext()) {
                            ((r2f) it.next()).g(null);
                        }
                    }
                    j7iVar.C.l(n1pVar2);
                    if (!(l6pVar instanceof i6p) && ((!(l6pVar instanceof h6p) || ((h6p) l6pVar).g) && d && d2)) {
                        return Unit.a;
                    }
                    xdr xdrVar = j7iVar.D;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    if (d) {
                        List list = j7iVar.F.a;
                        if (list == null) {
                            list = c5b.a;
                        }
                        gccVar = new gcc(j7i.K(list));
                    } else {
                        gccVar = new gcc(c5b.a);
                    }
                    gccVar2 = gccVar;
                    l6iVar.j = af5Var2;
                    l6iVar.k = gccVar2;
                    l6iVar.l = i2;
                    l6iVar.m = i3;
                    l6iVar.p = i4;
                    obj = j7i.a(j7iVar, l6iVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = l6iVar.m;
                    i2 = l6iVar.l;
                    gccVar2 = l6iVar.k;
                    af5 af5Var4 = l6iVar.j;
                    qgg.h0(obj);
                    i3 = i6;
                    af5Var2 = af5Var4;
                }
                gcc gccVar3 = gccVar2;
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue || !((n1pVar = af5Var2.b) == null || (t1pVar = n1pVar.c) == t1p.a || t1pVar == t1p.b)) {
                    j7iVar.X = 0L;
                } else {
                    j7iVar.X = j7iVar.N().a();
                }
                String str3 = af5Var2.a;
                n1p n1pVar3 = af5Var2.b;
                l6p k6pVar2 = new k6p(new Pair(str3, n1pVar3 == null ? n1pVar3.a : null), gccVar3, n1pVar3, ((Boolean) j7iVar.D.getValue()).booleanValue(), j7iVar.P(), i2 == 0 ? null : j7iVar.J, false, j7iVar.S(af5Var2.b, booleanValue));
                l6iVar.j = null;
                l6iVar.k = null;
                l6iVar.l = i2;
                l6iVar.m = i3;
                l6iVar.p = 2;
            }
        }
        l6iVar = new l6i(this, continuation);
        Object obj3 = l6iVar.n;
        Object obj22 = nm6.a;
        i = l6iVar.p;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        gcc gccVar32 = gccVar2;
        booleanValue = ((Boolean) obj3).booleanValue();
        if (booleanValue) {
        }
        j7iVar.X = 0L;
        String str32 = af5Var2.a;
        n1p n1pVar32 = af5Var2.b;
        l6p k6pVar22 = new k6p(new Pair(str32, n1pVar32 == null ? n1pVar32.a : null), gccVar32, n1pVar32, ((Boolean) j7iVar.D.getValue()).booleanValue(), j7iVar.P(), i2 == 0 ? null : j7iVar.J, false, j7iVar.S(af5Var2.b, booleanValue));
        l6iVar.j = null;
        l6iVar.k = null;
        l6iVar.l = i2;
        l6iVar.m = i3;
        l6iVar.p = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(List list, Continuation continuation) {
        tcj tcjVar;
        nm6 nm6Var;
        int i;
        ArrayList arrayList;
        String str;
        long j;
        String w;
        String str2;
        Album$AlbumType d;
        jzb jzbVar;
        String str3;
        ArrayList arrayList2;
        List<Object> list2;
        rar rarVar;
        qcj qcjVar;
        vcj vcjVar = (vcj) this.b;
        mqs mqsVar = vcjVar.k;
        if (continuation instanceof tcj) {
            tcjVar = (tcj) continuation;
            int i2 = tcjVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tcjVar.u = i2 - Integer.MIN_VALUE;
                Object obj = tcjVar.s;
                nm6Var = nm6.a;
                i = tcjVar.u;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean n = mqsVar.n();
                    if (n) {
                        ArrayList J = xp3.J(mqsVar.f, c5b.a);
                        arrayList = new ArrayList(v75.o(J, 10));
                        Iterator it = J.iterator();
                        while (it.hasNext()) {
                            zp2 zp2Var = (zp2) it.next();
                            zp2Var.getClass();
                            u51 O = ghh.O(zp2Var);
                            arrayList.add(new r91(h4a.q(O), O));
                        }
                    } else {
                        if (n) {
                            b6e.s();
                            return null;
                        }
                        arrayList = null;
                    }
                    str = mqsVar.c;
                    j = mqsVar.e;
                    w = vz1.w(mqsVar.x0.a);
                    k10 k10Var = mqsVar.d;
                    str2 = k10Var.d;
                    d = k10Var.d();
                    jzb i3 = mqsVar.i();
                    String str4 = mqsVar.z;
                    tcjVar.j = list;
                    tcjVar.k = str;
                    tcjVar.l = w;
                    tcjVar.m = str2;
                    tcjVar.n = d;
                    tcjVar.o = i3;
                    tcjVar.p = str4;
                    tcjVar.q = arrayList;
                    tcjVar.r = j;
                    tcjVar.u = 1;
                    Object a = vcj.a(vcjVar, tcjVar);
                    if (a != nm6Var) {
                        jzbVar = i3;
                        str3 = str4;
                        arrayList2 = arrayList;
                        obj = a;
                        list2 = list;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qcjVar = (qcj) tcjVar.k;
                    List list3 = tcjVar.j;
                    qgg.h0(obj);
                    vcjVar.n.l(qcjVar);
                    return Unit.a;
                }
                j = tcjVar.r;
                ArrayList arrayList3 = tcjVar.q;
                String str5 = tcjVar.p;
                jzb jzbVar2 = tcjVar.o;
                d = tcjVar.n;
                str2 = tcjVar.m;
                w = tcjVar.l;
                str = (String) tcjVar.k;
                list2 = tcjVar.j;
                qgg.h0(obj);
                arrayList2 = arrayList3;
                str3 = str5;
                jzbVar = jzbVar2;
                Album$AlbumType album$AlbumType = d;
                String str6 = str;
                String str7 = str2;
                long j2 = j;
                List list4 = (List) obj;
                list2.getClass();
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                for (Object obj5 : list2) {
                    if (obj5 instanceof kcq) {
                        obj2 = obj5;
                    } else if (obj5 instanceof wbq) {
                        obj3 = obj5;
                    } else if (obj5 instanceof cdq) {
                        obj4 = obj5;
                    }
                }
                kcq kcqVar = (kcq) obj2;
                qcj qcjVar2 = new qcj(str6, j2, w, str7, album$AlbumType, jzbVar, str3, arrayList2, list4, kcqVar == null ? new ubb(kcqVar, (wbq) obj3, (cdq) obj4) : null, bg3.B(list2), bg3.C(list2));
                rarVar = (rar) this.c;
                tcjVar.j = null;
                tcjVar.k = qcjVar2;
                tcjVar.l = null;
                tcjVar.m = null;
                tcjVar.n = null;
                tcjVar.o = null;
                tcjVar.p = null;
                tcjVar.q = null;
                tcjVar.u = 2;
                if (saf.C(rarVar, tcjVar) != nm6Var) {
                    qcjVar = qcjVar2;
                    vcjVar.n.l(qcjVar);
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        tcjVar = new tcj(this, continuation);
        Object obj6 = tcjVar.s;
        nm6Var = nm6.a;
        i = tcjVar.u;
        if (i != 0) {
        }
        Album$AlbumType album$AlbumType2 = d;
        String str62 = str;
        String str72 = str2;
        long j22 = j;
        List list42 = (List) obj6;
        list2.getClass();
        Object obj22 = null;
        Object obj32 = null;
        Object obj42 = null;
        while (r1.hasNext()) {
        }
        kcq kcqVar2 = (kcq) obj22;
        qcj qcjVar22 = new qcj(str62, j22, w, str72, album$AlbumType2, jzbVar, str3, arrayList2, list42, kcqVar2 == null ? new ubb(kcqVar2, (wbq) obj32, (cdq) obj42) : null, bg3.B(list2), bg3.C(list2));
        rarVar = (rar) this.c;
        tcjVar.j = null;
        tcjVar.k = qcjVar22;
        tcjVar.l = null;
        tcjVar.m = null;
        tcjVar.n = null;
        tcjVar.o = null;
        tcjVar.p = null;
        tcjVar.q = null;
        tcjVar.u = 2;
        if (saf.C(rarVar, tcjVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x028c, code lost:
    
        if (r14.emit(r15, r0) != r4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r14.emit(r15, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03dc, code lost:
    
        if (r15.emit(r14, r0) == r4) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0553, code lost:
    
        if (r15.emit(r14, r0) == r4) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x07d8, code lost:
    
        if (r15.emit(r14, r0) == r4) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r14.emit(r15, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0981, code lost:
    
        if (r10 < 0) goto L508;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Type inference failed for: r15v48, types: [mqs] */
    /* JADX WARN: Type inference failed for: r6v22, types: [p9, tsi] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        long j;
        hug hugVar;
        int i;
        n7q n7qVar;
        kug kugVar;
        int i2;
        rjc rjcVar;
        rjc rjcVar2;
        lug lugVar;
        l0h l0hVar;
        int i3;
        x1h x1hVar;
        int i4;
        tri triVar;
        int i5;
        mwk b;
        ?? a;
        gsi gsiVar;
        int i6;
        Object K;
        ssi ssiVar;
        int i7;
        rjc rjcVar3;
        aab aabVar;
        Object obj2;
        rjc rjcVar4;
        aab aabVar2;
        int i8;
        List list;
        pti ptiVar;
        int i9;
        aui auiVar;
        int i10;
        rjc rjcVar5;
        rjc rjcVar6;
        Object obj3;
        raj a2;
        raj a3;
        yui yuiVar;
        int i11;
        qvi qviVar;
        int i12;
        rjc rjcVar7;
        rj6 rj6Var;
        jsi jsiVar;
        uaj uajVar;
        int i13;
        abj abjVar;
        int i14;
        rmj rmjVar;
        int i15;
        y3k y3kVar;
        int i16;
        rjc rjcVar8;
        z3k z3kVar;
        int i17;
        rjc rjcVar9;
        int i18 = this.a;
        r1 = false;
        boolean z = false;
        int i19 = 0;
        r1 = 0;
        int i20 = 0;
        int i21 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        int i22 = 0;
        r1 = false;
        boolean z2 = false;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Continuation continuation2 = null;
        switch (i18) {
            case 0:
                int intValue = ((Number) obj).intValue();
                vqn vqnVar = (vqn) obj4;
                ((x0q) ((mrf) obj5).c.b).a(new roq(vqnVar.a, intValue));
                vqnVar.a = intValue;
                break;
            case 1:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                float floatValue = ((Number) pair.b).floatValue();
                z6g z6gVar = (z6g) obj5;
                long h = ((v6k) obj4).h();
                t6k t6kVar = z6gVar.d;
                v6k v6kVar = z6gVar.e;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (z6gVar.j) {
                    j = uptimeMillis - v6kVar.h();
                    break;
                }
                j = 0;
                t6kVar.h(yhn.c(t6kVar.e() + (h > 0 ? (j * z6gVar.k) / h : 0.0f), 0.0f, 1.0f));
                v6kVar.i(uptimeMillis);
                z6gVar.j = booleanValue;
                z6gVar.k = floatValue;
                z6gVar.g = uptimeMillis;
                z6gVar.h = booleanValue;
                z6gVar.i = floatValue;
                break;
            case 2:
                tre treVar = (tre) obj;
                z7g z7gVar = (z7g) obj4;
                gpi gpiVar = (gpi) obj5;
                if (treVar instanceof k4e ? true : treVar instanceof poc ? true : treVar instanceof rqm) {
                    gpiVar.a(treVar);
                } else if (treVar instanceof l4e) {
                    gpiVar.h(((l4e) treVar).a);
                } else if (treVar instanceof qoc) {
                    gpiVar.h(((qoc) treVar).a);
                } else if (treVar instanceof sqm) {
                    gpiVar.h(((sqm) treVar).a);
                } else if (treVar instanceof qqm) {
                    gpiVar.h(((qqm) treVar).a);
                }
                Object[] objArr = gpiVar.a;
                int i23 = gpiVar.b;
                int i24 = 0;
                for (int i25 = 0; i25 < i23; i25++) {
                    tre treVar2 = (tre) objArr[i25];
                    if (treVar2 instanceof k4e) {
                        z7gVar.getClass();
                        i24 |= 2;
                    } else if (treVar2 instanceof poc) {
                        z7gVar.getClass();
                        i24 |= 1;
                    } else if (treVar2 instanceof rqm) {
                        z7gVar.getClass();
                        i24 |= 4;
                    }
                }
                z7gVar.b.i(i24);
                break;
            case 3:
                ptg ptgVar = (ptg) obj;
                etg etgVar = (etg) obj5;
                jyr jyrVar = etgVar.n;
                jyr jyrVar2 = etgVar.m;
                boolean d = Intrinsics.d(ptgVar, mtg.a);
                gcb gcbVar = gcb.a;
                if (d) {
                    zsg zsgVar = (zsg) jyrVar.getValue();
                    zsgVar.getClass();
                    zsgVar.a(sjb.LoginFailure);
                    ((ysg) jyrVar2.getValue()).a(gcbVar);
                } else if (ptgVar instanceof otg) {
                    zsg zsgVar2 = (zsg) jyrVar.getValue();
                    zsgVar2.getClass();
                    zsgVar2.a(sjb.LoginSuccess);
                    ysg ysgVar = (ysg) jyrVar2.getValue();
                    yxc yxcVar = ((otg) ptgVar).a;
                    Bundle arguments = etgVar.getArguments();
                    ysgVar.a(new hcb(yxcVar, arguments != null ? arguments.getBoolean("auto_login") : false));
                } else if (!(ptgVar instanceof ntg)) {
                    b6e.s();
                    break;
                } else {
                    try {
                        ((Context) obj4).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ntg) ptgVar).a)));
                    } catch (ActivityNotFoundException e) {
                        Assertions.throwOrSkip("LoginFragment", new FailedAssertionException(f1d.g("Failed to open url ", ((ntg) ptgVar).a), e));
                    }
                    ((ysg) jyrVar2.getValue()).a(gcbVar);
                }
                break;
            case 4:
                if (continuation instanceof hug) {
                    hugVar = (hug) continuation;
                    int i26 = hugVar.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        hugVar.k = i26 - Integer.MIN_VALUE;
                        Object obj6 = hugVar.j;
                        nm6 nm6Var = nm6.a;
                        i = hugVar.k;
                        if (i != 0) {
                            qgg.h0(obj6);
                            rjc rjcVar10 = (rjc) obj5;
                            d6l x = p6g.x((e6l) obj);
                            if (x != null && (n7qVar = x.a) != null) {
                                z2 = ((Boolean) wdg.A(n7qVar, ((iug) obj4).a)).booleanValue();
                            }
                            Boolean valueOf = Boolean.valueOf(z2);
                            hugVar.k = 1;
                            if (rjcVar10.emit(valueOf, hugVar) == nm6Var) {
                                break;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                hugVar = new hug(this, continuation);
                Object obj62 = hugVar.j;
                nm6 nm6Var2 = nm6.a;
                i = hugVar.k;
                if (i != 0) {
                }
                break;
            case 5:
                if (continuation instanceof kug) {
                    kugVar = (kug) continuation;
                    int i27 = kugVar.k;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        kugVar.k = i27 - Integer.MIN_VALUE;
                        Object obj7 = kugVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = kugVar.k;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    qgg.h0(obj7);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i22 = kugVar.n;
                                rjcVar2 = kugVar.m;
                                qgg.h0(obj7);
                            }
                        } else {
                            qgg.h0(obj7);
                            rjcVar = (rjc) obj5;
                            d1 d1Var = (d1) obj;
                            if (Intrinsics.d(d1Var, z0.a)) {
                                lugVar = lug.c;
                            } else if (d1Var instanceof a1) {
                                lugVar = lug.b;
                            } else if (Intrinsics.d(d1Var, b1.a)) {
                                lugVar = lug.c;
                            } else if (Intrinsics.d(d1Var, c1.a)) {
                                av0 av0Var = (av0) ((jyr) ((t1f) obj4).b).getValue();
                                kugVar.m = rjcVar;
                                kugVar.n = 0;
                                kugVar.k = 1;
                                if (((iv0) av0Var).b(kugVar) != nm6Var3) {
                                    rjcVar2 = rjcVar;
                                }
                                break;
                            } else {
                                b6e.s();
                                break;
                            }
                            kugVar.m = null;
                            kugVar.n = i22;
                            kugVar.k = 2;
                            break;
                        }
                        rjcVar = rjcVar2;
                        lugVar = lug.a;
                        kugVar.m = null;
                        kugVar.n = i22;
                        kugVar.k = 2;
                    }
                }
                kugVar = new kug(this, continuation);
                Object obj72 = kugVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = kugVar.k;
                if (i2 == 0) {
                }
                rjcVar = rjcVar2;
                lugVar = lug.a;
                kugVar.m = null;
                kugVar.n = i22;
                kugVar.k = 2;
            case 6:
                if (continuation instanceof l0h) {
                    l0hVar = (l0h) continuation;
                    int i28 = l0hVar.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        l0hVar.k = i28 - Integer.MIN_VALUE;
                        Object obj8 = l0hVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = l0hVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj8);
                            yxc yxcVar2 = (yxc) obj;
                            drt drtVar = yxcVar2.a;
                            vat vatVar = new vat(drtVar.a, Boolean.valueOf(drtVar.d), ((q0h) obj4).c.invoke(yxcVar2));
                            l0hVar.k = 1;
                            if (((rjc) obj5).emit(vatVar, l0hVar) == nm6Var4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj8);
                        }
                        break;
                    }
                }
                l0hVar = new l0h(this, continuation);
                Object obj82 = l0hVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = l0hVar.k;
                if (i3 != 0) {
                }
            case 7:
                if (continuation instanceof x1h) {
                    x1hVar = (x1h) continuation;
                    int i29 = x1hVar.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        x1hVar.k = i29 - Integer.MIN_VALUE;
                        Object obj9 = x1hVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = x1hVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar11 = (rjc) obj5;
                            if (((x66) obj).a && (((y1h) obj4).m.getValue() instanceof s1h)) {
                                x1hVar.k = 1;
                                if (rjcVar11.emit(obj, x1hVar) == nm6Var5) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                x1hVar = new x1h(this, continuation);
                Object obj92 = x1hVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = x1hVar.k;
                if (i4 != 0) {
                }
                break;
            case 8:
                hxc hxcVar = (hxc) obj;
                k1l k1lVar = (k1l) ((toh) obj4).c;
                xqn xqnVar = (xqn) obj5;
                Object obj10 = xqnVar.a;
                s84 s84Var = s84.b;
                a3t a3tVar = a3t.a;
                if (obj10 == s84Var && hxcVar.a == s84.f) {
                    if (hxcVar.b) {
                        k1lVar.a(PauseCommand.INSTANCE, a3tVar);
                    }
                    k1lVar.a(new ChangeMediaOutputTargetCommand(moh.a), a3tVar);
                } else if (obj10 == s84.f && hxcVar.a == s84Var) {
                    lg3.d0("chromecast_on");
                    k1lVar.a(new ChangeMediaOutputTargetCommand(ooh.a), a3tVar);
                }
                xqnVar.a = hxcVar.a;
                break;
            case 9:
                break;
            case 10:
                Object T = ((j7i) obj5).T((l6p) obj, (a0p) obj4, continuation);
                if (T != nm6.a) {
                    break;
                }
                break;
            case 11:
                x97.y((mm6) obj5, null, null, new z11((vm0) obj4, ((Boolean) obj).booleanValue(), continuation2, 9), 3);
                break;
            case 12:
                if (continuation instanceof tri) {
                    triVar = (tri) continuation;
                    int i30 = triVar.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        triVar.k = i30 - Integer.MIN_VALUE;
                        Object obj11 = triVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = triVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar12 = (rjc) obj5;
                            n7q n7qVar2 = (n7q) obj;
                            if (n7qVar2 != null && (b = n7qVar2.b()) != null && (a = b.a()) != 0) {
                                a0q C = rvf.C(n7qVar2.b());
                                if (C == null) {
                                    C = n7qVar2.g().getId();
                                }
                                String e2 = ((cvl) obj4).e();
                                C.getClass();
                                if (Intrinsics.d(o8g.i(C, new klx(23)), e2)) {
                                    continuation2 = a;
                                }
                            }
                            if (continuation2 != null) {
                                triVar.k = 1;
                                if (rjcVar12.emit(continuation2, triVar) == nm6Var6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj11);
                        }
                        break;
                    }
                }
                triVar = new tri(this, continuation);
                Object obj112 = triVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = triVar.k;
                if (i5 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof gsi) {
                    gsiVar = (gsi) continuation;
                    int i31 = gsiVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        gsiVar.k = i31 - Integer.MIN_VALUE;
                        Object obj12 = gsiVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = gsiVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar13 = (rjc) obj5;
                            int ordinal = ((lri) obj).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        b6e.s();
                                        break;
                                    }
                                } else {
                                    K = adj.a;
                                    gsiVar.k = 1;
                                    if (rjcVar13.emit(K, gsiVar) == nm6Var7) {
                                        break;
                                    }
                                }
                            }
                            K = weo.K(((hsi) obj4).a, true);
                            gsiVar.k = 1;
                            if (rjcVar13.emit(K, gsiVar) == nm6Var7) {
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                gsiVar = new gsi(this, continuation);
                Object obj122 = gsiVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = gsiVar.k;
                if (i6 != 0) {
                }
            case 14:
                ?? r6 = (tsi) obj4;
                if (continuation instanceof ssi) {
                    ssiVar = (ssi) continuation;
                    int i32 = ssiVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ssiVar.k = i32 - Integer.MIN_VALUE;
                        Object obj13 = ssiVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = ssiVar.k;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    qgg.h0(obj13);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i8 = ssiVar.o;
                                aabVar2 = ssiVar.n;
                                rjcVar4 = ssiVar.m;
                                qgg.h0(obj13);
                            }
                        } else {
                            qgg.h0(obj13);
                            rjcVar3 = (rjc) obj5;
                            kri kriVar = (kri) obj;
                            ssg.a(4, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] collected my shelf entity " + kriVar, null);
                            boolean z3 = kriVar instanceof fri;
                            gri griVar = gri.a;
                            if (z3) {
                                aabVar = lxe.B(((fri) kriVar).a);
                            } else if (kriVar instanceof hri) {
                                aabVar = bfg.J(((hri) kriVar).a);
                            } else if (kriVar instanceof iri) {
                                aabVar = tsi.G(((iri) kriVar).b);
                            } else if (kriVar instanceof jri) {
                                aabVar = tsi.G(((jri) kriVar).a);
                            } else if (!Intrinsics.d(kriVar, griVar)) {
                                b6e.s();
                                break;
                            } else {
                                aabVar = null;
                            }
                            if (aabVar == null) {
                                ssg.a(5, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] domain entity is null", null);
                                list = c5b.a;
                                ssiVar.m = null;
                                ssiVar.n = null;
                                ssiVar.o = i21;
                                ssiVar.k = 2;
                                break;
                            } else {
                                ssiVar.m = rjcVar3;
                                ssiVar.n = aabVar;
                                ssiVar.o = 0;
                                ssiVar.k = 1;
                                if (z3) {
                                    obj2 = r6.q(((fri) kriVar).a.D, ssiVar);
                                } else if (kriVar instanceof hri) {
                                    obj2 = r6.q(op7.c(((hri) kriVar).a), ssiVar);
                                } else if (kriVar instanceof iri) {
                                    obj2 = r6.q(((iri) kriVar).b.x0, ssiVar);
                                } else if (kriVar instanceof jri) {
                                    obj2 = r6.q(((jri) kriVar).a.x0, ssiVar);
                                } else if (!Intrinsics.d(kriVar, griVar)) {
                                    b6e.s();
                                    break;
                                } else {
                                    obj2 = null;
                                }
                                if (obj2 != nm6Var8) {
                                    rjcVar4 = rjcVar3;
                                    aabVar2 = aabVar;
                                    obj13 = obj2;
                                    i8 = 0;
                                }
                                break;
                            }
                        }
                        Bitmap bitmap = (Bitmap) obj13;
                        ssg.a(4, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] bitmap was loaded success = " + (bitmap != null), null);
                        i21 = i8;
                        list = t75.c(new wnv(bitmap, new pnv(aabVar2)));
                        rjcVar3 = rjcVar4;
                        ssiVar.m = null;
                        ssiVar.n = null;
                        ssiVar.o = i21;
                        ssiVar.k = 2;
                    }
                }
                ssiVar = new ssi(this, continuation);
                Object obj132 = ssiVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = ssiVar.k;
                if (i7 == 0) {
                }
                Bitmap bitmap2 = (Bitmap) obj132;
                if (bitmap2 != null) {
                }
                ssg.a(4, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] bitmap was loaded success = " + (bitmap2 != null), null);
                i21 = i8;
                list = t75.c(new wnv(bitmap2, new pnv(aabVar2)));
                rjcVar3 = rjcVar4;
                ssiVar.m = null;
                ssiVar.n = null;
                ssiVar.o = i21;
                ssiVar.k = 2;
            case 15:
                if (continuation instanceof pti) {
                    ptiVar = (pti) continuation;
                    int i33 = ptiVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ptiVar.k = i33 - Integer.MIN_VALUE;
                        Object obj14 = ptiVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i9 = ptiVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj14);
                            v3k E = wxf.E((v3k) obj, new zig((qti) obj4, continuation2, 26));
                            ptiVar.k = 1;
                            if (((rjc) obj5).emit(E, ptiVar) == nm6Var9) {
                                break;
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                ptiVar = new pti(this, continuation);
                Object obj142 = ptiVar.j;
                nm6 nm6Var92 = nm6.a;
                i9 = ptiVar.k;
                if (i9 != 0) {
                }
            case 16:
                if (continuation instanceof aui) {
                    auiVar = (aui) continuation;
                    int i34 = auiVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        auiVar.k = i34 - Integer.MIN_VALUE;
                        Object obj15 = auiVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i10 = auiVar.k;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    qgg.h0(obj15);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i20 = auiVar.n;
                                rjcVar6 = auiVar.m;
                                qgg.h0(obj15);
                            }
                        } else {
                            qgg.h0(obj15);
                            rjcVar5 = (rjc) obj5;
                            tui tuiVar = (tui) obj;
                            if (tuiVar.b.isEmpty()) {
                                obj3 = wti.a;
                                auiVar.m = null;
                                auiVar.n = i20;
                                auiVar.k = 2;
                                break;
                            } else {
                                iwe iweVar = ((bui) obj4).m;
                                auiVar.m = rjcVar5;
                                auiVar.n = 0;
                                auiVar.k = 1;
                                Object k = iweVar.k(tuiVar, auiVar);
                                if (k != nm6Var10) {
                                    obj15 = k;
                                    rjcVar6 = rjcVar5;
                                }
                                break;
                            }
                        }
                        yti ytiVar = new yti((zab) obj15);
                        rjcVar5 = rjcVar6;
                        obj3 = ytiVar;
                        auiVar.m = null;
                        auiVar.n = i20;
                        auiVar.k = 2;
                    }
                }
                auiVar = new aui(this, continuation);
                Object obj152 = auiVar.j;
                nm6 nm6Var102 = nm6.a;
                i10 = auiVar.k;
                if (i10 == 0) {
                }
                yti ytiVar2 = new yti((zab) obj152);
                rjcVar5 = rjcVar6;
                obj3 = ytiVar2;
                auiVar.m = null;
                auiVar.n = i20;
                auiVar.k = 2;
            case 17:
                mqs mqsVar = (mqs) obj;
                iui iuiVar = (iui) obj5;
                xdr xdrVar = iuiVar.c;
                a2 = iuiVar.b.a(mqsVar, false);
                xdrVar.getClass();
                xdrVar.m(null, a2);
                xdr xdrVar2 = iuiVar.g;
                mm6 mm6Var = iuiVar.a;
                Context context = (Context) obj4;
                i00 i00Var = iuiVar.e;
                fdj fdjVar = iuiVar.f;
                i00Var.getClass();
                fdjVar.getClass();
                ydj ydjVar = new ydj(fdjVar, mqsVar, false, mm6Var, context, i00Var, null);
                xdrVar2.getClass();
                xdrVar2.m(null, ydjVar);
                break;
            case 18:
                mqs mqsVar2 = (mqs) obj;
                kui kuiVar = (kui) obj5;
                xdr xdrVar3 = kuiVar.c;
                a3 = kuiVar.b.a(mqsVar2, false);
                xdrVar3.getClass();
                xdrVar3.m(null, a3);
                xdr xdrVar4 = kuiVar.g;
                mm6 mm6Var2 = kuiVar.a;
                Context context2 = (Context) obj4;
                i00 i00Var2 = kuiVar.e;
                fdj fdjVar2 = kuiVar.f;
                i00Var2.getClass();
                fdjVar2.getClass();
                ydj ydjVar2 = new ydj(fdjVar2, mqsVar2, false, mm6Var2, context2, i00Var2, null);
                xdrVar4.getClass();
                xdrVar4.m(null, ydjVar2);
                break;
            case 19:
                if (continuation instanceof yui) {
                    yuiVar = (yui) continuation;
                    int i35 = yuiVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        yuiVar.k = i35 - Integer.MIN_VALUE;
                        Object obj16 = yuiVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i11 = yuiVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj16);
                            rjc rjcVar14 = (rjc) obj5;
                            String string = ((Context) ((jac) obj4).a).getString(R.string.my_shelf_saved_entities_title);
                            List list2 = (List) obj;
                            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((xui) it.next()).b);
                            }
                            tui tuiVar2 = new tui(string, arrayList, null);
                            yuiVar.k = 1;
                            if (rjcVar14.emit(tuiVar2, yuiVar) == nm6Var11) {
                                break;
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj16);
                        }
                        break;
                    }
                }
                yuiVar = new yui(this, continuation);
                Object obj162 = yuiVar.j;
                nm6 nm6Var112 = nm6.a;
                i11 = yuiVar.k;
                if (i11 != 0) {
                }
            case 20:
                if (continuation instanceof qvi) {
                    qviVar = (qvi) continuation;
                    int i36 = qviVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        qviVar.k = i36 - Integer.MIN_VALUE;
                        Object obj17 = qviVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i12 = qviVar.k;
                        if (i12 == 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    qgg.h0(obj17);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i19 = qviVar.n;
                                rjcVar7 = qviVar.m;
                                qgg.h0(obj17);
                            }
                        } else {
                            qgg.h0(obj17);
                            rjc rjcVar15 = (rjc) obj5;
                            ((Boolean) obj).getClass();
                            gui guiVar = (gui) ((rvi) obj4).o.getValue();
                            qviVar.m = rjcVar15;
                            qviVar.n = 0;
                            qviVar.k = 1;
                            Object a4 = guiVar.a(qviVar);
                            if (a4 != nm6Var12) {
                                obj17 = a4;
                                rjcVar7 = rjcVar15;
                            }
                            break;
                        }
                        rj6Var = (rj6) obj17;
                        if (!(rj6Var instanceof qj6)) {
                            jsiVar = (jsi) ((qj6) rj6Var).a;
                        } else if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            break;
                        } else {
                            jsiVar = null;
                        }
                        qviVar.m = null;
                        qviVar.n = i19;
                        qviVar.k = 2;
                        break;
                    }
                }
                qviVar = new qvi(this, continuation);
                Object obj172 = qviVar.j;
                nm6 nm6Var122 = nm6.a;
                i12 = qviVar.k;
                if (i12 == 0) {
                }
                rj6Var = (rj6) obj172;
                if (!(rj6Var instanceof qj6)) {
                }
                qviVar.m = null;
                qviVar.n = i19;
                qviVar.k = 2;
            case 21:
                if (continuation instanceof uaj) {
                    uajVar = (uaj) continuation;
                    int i37 = uajVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        uajVar.k = i37 - Integer.MIN_VALUE;
                        Object obj18 = uajVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i13 = uajVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj18);
                            rjc rjcVar16 = (rjc) obj5;
                            w3g c = ((vaj) obj4).c(((m1g) obj).a == j1g.a);
                            uajVar.k = 1;
                            if (rjcVar16.emit(c, uajVar) == nm6Var13) {
                                break;
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                uajVar = new uaj(this, continuation);
                Object obj182 = uajVar.j;
                nm6 nm6Var132 = nm6.a;
                i13 = uajVar.k;
                if (i13 != 0) {
                }
            case 22:
                if (continuation instanceof abj) {
                    abjVar = (abj) continuation;
                    int i38 = abjVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        abjVar.k = i38 - Integer.MIN_VALUE;
                        Object obj19 = abjVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i14 = abjVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj19);
                            String c2 = ((skr) ((bbj) obj4).j.getValue()).c(R.string.skeleton_landing_error_message);
                            abjVar.k = 1;
                            if (((rjc) obj5).emit(c2, abjVar) == nm6Var14) {
                                break;
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                abjVar = new abj(this, continuation);
                Object obj192 = abjVar.j;
                nm6 nm6Var142 = nm6.a;
                i14 = abjVar.k;
                if (i14 != 0) {
                }
            case 23:
                break;
            case 24:
                if (continuation instanceof rmj) {
                    rmjVar = (rmj) continuation;
                    int i39 = rmjVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        rmjVar.k = i39 - Integer.MIN_VALUE;
                        Object obj20 = rmjVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i15 = rmjVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj20);
                            rjc rjcVar17 = (rjc) obj5;
                            if (!((lja) obj).b.isEmpty() && !((lwc) ((umj) obj4).m.getValue()).a()) {
                                z = true;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z);
                            rmjVar.k = 1;
                            if (rjcVar17.emit(valueOf2, rmjVar) == nm6Var15) {
                                break;
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                rmjVar = new rmj(this, continuation);
                Object obj202 = rmjVar.j;
                nm6 nm6Var152 = nm6.a;
                i15 = rmjVar.k;
                if (i15 != 0) {
                }
                break;
            case 25:
                if (((Boolean) obj).booleanValue()) {
                    ((Function0) obj5).invoke();
                } else {
                    ((Function0) obj4).invoke();
                }
                break;
            case 26:
                Object b2 = w1k.b((w1k) obj5, (pfg) obj4, (q3d) obj, continuation);
                if (b2 != nm6.a) {
                    break;
                }
                break;
            case 27:
                g1k g1kVar = (g1k) obj;
                if (hyf.a != null && Log.isLoggable("Paging", 2)) {
                    Log.v("Paging", "Collected " + g1kVar);
                }
                kvf kvfVar = (kvf) obj5;
                Object V = x97.V(kvfVar.b, new rlg(g1kVar, kvfVar, (v3k) obj4, null, 20), continuation);
                if (V != nm6.a) {
                    break;
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof y3k) {
                    y3kVar = (y3k) continuation;
                    int i40 = y3kVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        y3kVar.k = i40 - Integer.MIN_VALUE;
                        Object obj21 = y3kVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i16 = y3kVar.k;
                        if (i16 == 0) {
                            if (i16 != 1) {
                                if (i16 == 2) {
                                    qgg.h0(obj21);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                rjcVar8 = y3kVar.l;
                                qgg.h0(obj21);
                            }
                        } else {
                            qgg.h0(obj21);
                            rjc rjcVar18 = (rjc) obj5;
                            y3kVar.l = rjcVar18;
                            y3kVar.k = 1;
                            Object a5 = ((g1k) obj).a((z0i) obj4, y3kVar);
                            if (a5 != nm6Var16) {
                                obj21 = a5;
                                rjcVar8 = rjcVar18;
                            }
                            break;
                        }
                        y3kVar.l = null;
                        y3kVar.k = 2;
                        break;
                    }
                }
                y3kVar = new y3k(this, continuation);
                Object obj212 = y3kVar.j;
                nm6 nm6Var162 = nm6.a;
                i16 = y3kVar.k;
                if (i16 == 0) {
                }
                y3kVar.l = null;
                y3kVar.k = 2;
            default:
                if (continuation instanceof z3k) {
                    z3kVar = (z3k) continuation;
                    int i41 = z3kVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        z3kVar.k = i41 - Integer.MIN_VALUE;
                        Object obj22 = z3kVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i17 = z3kVar.k;
                        if (i17 == 0) {
                            if (i17 != 1) {
                                if (i17 == 2) {
                                    qgg.h0(obj22);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                rjcVar9 = z3kVar.l;
                                qgg.h0(obj22);
                            }
                        } else {
                            qgg.h0(obj22);
                            rjc rjcVar19 = (rjc) obj5;
                            z3kVar.l = rjcVar19;
                            z3kVar.k = 1;
                            Object b3 = ((g1k) obj).b((m6i) obj4, z3kVar);
                            if (b3 != nm6Var17) {
                                obj22 = b3;
                                rjcVar9 = rjcVar19;
                            }
                            break;
                        }
                        z3kVar.l = null;
                        z3kVar.k = 2;
                        break;
                    }
                }
                z3kVar = new z3k(this, continuation);
                Object obj222 = z3kVar.j;
                nm6 nm6Var172 = nm6.a;
                i17 = z3kVar.k;
                if (i17 == 0) {
                }
                z3kVar.l = null;
                z3kVar.k = 2;
        }
        return Unit.a;
    }
}
