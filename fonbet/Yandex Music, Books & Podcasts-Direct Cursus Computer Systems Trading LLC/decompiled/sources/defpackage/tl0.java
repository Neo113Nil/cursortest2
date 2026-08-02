package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes.dex */
public final class tl0 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public tl0(tqn tqnVar, rjc rjcVar, Function2 function2) {
        this.a = 18;
        this.b = tqnVar;
        this.c = rjcVar;
        this.d = (aur) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(Object obj, Continuation continuation) {
        ddj ddjVar;
        int i;
        Long a;
        boolean booleanValue;
        r1l r1lVar = ((fdj) this.d).b;
        mqs mqsVar = (mqs) this.c;
        if (continuation instanceof ddj) {
            ddjVar = (ddj) continuation;
            int i2 = ddjVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ddjVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = ddjVar.j;
                nm6 nm6Var = nm6.a;
                i = ddjVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar = (rjc) this.b;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    mqsVar.getClass();
                    long j = mqsVar.e;
                    String str = mqsVar.a;
                    boolean D = a4g.D(gys.ListenStatus, mqsVar);
                    Boolean valueOf = Boolean.valueOf(D);
                    if (D) {
                        valueOf = null;
                    }
                    long longValue = (valueOf == null && (a = r1lVar.a(str)) != null) ? a.longValue() : 0L;
                    Boolean valueOf2 = Boolean.valueOf(D);
                    if (D) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        booleanValue = valueOf2.booleanValue();
                    } else {
                        Boolean d = r1lVar.d(str);
                        booleanValue = d != null ? d.booleanValue() : false;
                    }
                    Object bdjVar = booleanValue2 ? adj.a : booleanValue ? ycj.a : longValue != 0 ? new bdj(fxf.M(mqsVar, longValue, true), j - longValue, longValue / j) : new zcj(fxf.M(mqsVar, j, false));
                    ddjVar.k = 1;
                    if (rjcVar.emit(bdjVar, ddjVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        ddjVar = new ddj(this, continuation);
        Object obj22 = ddjVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ddjVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj, Continuation continuation) {
        ojj ojjVar;
        int i;
        rjc rjcVar;
        if (continuation instanceof ojj) {
            ojjVar = (ojj) continuation;
            int i2 = ojjVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ojjVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = ojjVar.j;
                nm6 nm6Var = nm6.a;
                i = ojjVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar2 = (rjc) this.b;
                    rjj rjjVar = (rjj) this.c;
                    xgd xgdVar = (xgd) this.d;
                    ojjVar.l = rjcVar2;
                    ojjVar.k = 1;
                    Object a = rjj.a(rjjVar, (njj) obj, xgdVar, ojjVar);
                    if (a != nm6Var) {
                        obj2 = a;
                        rjcVar = rjcVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rjcVar = ojjVar.l;
                qgg.h0(obj2);
                ojjVar.l = null;
                ojjVar.k = 2;
            }
        }
        ojjVar = new ojj(this, continuation);
        Object obj22 = ojjVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ojjVar.k;
        if (i != 0) {
        }
        ojjVar.l = null;
        ojjVar.k = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(d6l d6lVar, Continuation continuation) {
        j2l j2lVar;
        int i;
        v0l v0lVar;
        boolean z;
        boolean z2;
        rjc rjcVar;
        i2l i2lVar;
        d6l d6lVar2 = d6lVar;
        kjn kjnVar = kjn.f;
        gos gosVar = gos.e;
        xqn xqnVar = (xqn) this.c;
        xqn xqnVar2 = (xqn) this.b;
        if (continuation instanceof j2l) {
            j2lVar = (j2l) continuation;
            int i2 = j2lVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j2lVar.n = i2 - Integer.MIN_VALUE;
                Object obj = j2lVar.l;
                nm6 nm6Var = nm6.a;
                i = j2lVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    v0lVar = d6lVar2.c;
                    d6l d6lVar3 = (d6l) xqnVar2.a;
                    v0l v0lVar2 = d6lVar3 != null ? d6lVar3.c : null;
                    mwk b = d6lVar2.a.b();
                    mwk mwkVar = (mwk) xqnVar.a;
                    boolean z3 = false;
                    if (mwkVar != null) {
                        b.getClass();
                        if (mwkVar.equals(b)) {
                            z = true;
                        } else {
                            kwk kwkVar = h1b.e;
                            if ((mwkVar.equals(kwkVar) ? false : ((Boolean) dag.p(mwkVar, gosVar)).booleanValue()) != (b.equals(kwkVar) ? false : ((Boolean) dag.p(b, gosVar)).booleanValue())) {
                                z = Intrinsics.d(mwkVar.equals(kwkVar) ? null : (String) dag.p(mwkVar, kjnVar), b.equals(kwkVar) ? null : (String) dag.p(b, kjnVar));
                            }
                        }
                        z2 = v0lVar2 != v0l.d || v0lVar2 == v0l.b || v0lVar2 == v0l.c;
                        boolean z4 = v0lVar != v0l.b;
                        rjcVar = (rjc) this.d;
                        if (z2 && z4 && z) {
                            z3 = true;
                        }
                        i2lVar = new i2l(v0lVar, b, z3, p6g.C(d6lVar2));
                        j2lVar.j = d6lVar2;
                        j2lVar.k = v0lVar;
                        j2lVar.n = 1;
                        if (rjcVar.emit(i2lVar, j2lVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    z = false;
                    if (v0lVar2 != v0l.d) {
                    }
                    if (v0lVar != v0l.b) {
                    }
                    rjcVar = (rjc) this.d;
                    if (z2) {
                        z3 = true;
                    }
                    i2lVar = new i2l(v0lVar, b, z3, p6g.C(d6lVar2));
                    j2lVar.j = d6lVar2;
                    j2lVar.k = v0lVar;
                    j2lVar.n = 1;
                    if (rjcVar.emit(i2lVar, j2lVar) == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v0l v0lVar3 = j2lVar.k;
                    d6l d6lVar4 = j2lVar.j;
                    qgg.h0(obj);
                    v0lVar = v0lVar3;
                    d6lVar2 = d6lVar4;
                }
                xqnVar2.a = d6lVar2;
                if (v0lVar == v0l.d) {
                    xqnVar.a = d6lVar2.a.b();
                }
                return Unit.a;
            }
        }
        j2lVar = new j2l(this, continuation);
        Object obj2 = j2lVar.l;
        nm6 nm6Var2 = nm6.a;
        i = j2lVar.n;
        if (i != 0) {
        }
        xqnVar2.a = d6lVar2;
        if (v0lVar == v0l.d) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0167, code lost:
    
        if (defpackage.saf.C(r1, r4) != r5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(List list, Continuation continuation) {
        u8j u8jVar;
        int i;
        ArrayList arrayList;
        String str;
        List list2;
        Album$AlbumType album$AlbumType;
        ArrayList arrayList2;
        xbb xbbVar;
        z8j z8jVar;
        w8j w8jVar = (w8j) this.b;
        oq oqVar = (oq) this.c;
        if (continuation instanceof u8j) {
            u8jVar = (u8j) continuation;
            int i2 = u8jVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u8jVar.q = i2 - Integer.MIN_VALUE;
                Object obj = u8jVar.o;
                nm6 nm6Var = nm6.a;
                i = u8jVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ((wbb) w8jVar.a.f.getValue()).getClass();
                    String w = vz1.w(oqVar.o);
                    String D = u2x.J(oqVar) ? q7g.D(oqVar) : q7g.w(oqVar);
                    xbb xbbVar2 = new xbb(w, oqVar.b, D, oqVar.i(), new rab(oqVar.b, D == null ? "" : D, null, w, oqVar.i(), false, oqVar.B), null, null, null, qo6.b);
                    Album$AlbumType d = oqVar.d();
                    if (u2x.J(oqVar)) {
                        arrayList = null;
                    } else {
                        List<zp2> list3 = oqVar.n;
                        arrayList = new ArrayList(v75.o(list3, 10));
                        for (zp2 zp2Var : list3) {
                            zp2Var.getClass();
                            u51 O = ghh.O(zp2Var);
                            arrayList.add(new r91(new q91(O.b, vz1.w(kg5.M(O.c, WebPath$Storage.AVATARS)), false), O));
                        }
                    }
                    String str2 = oqVar.f;
                    if (str2 == null || (str = StringsKt.t0(str2).toString()) == null || StringsKt.U(str)) {
                        str = null;
                    }
                    u8jVar.j = xbbVar2;
                    u8jVar.k = d;
                    u8jVar.l = arrayList;
                    u8jVar.m = str;
                    u8jVar.n = list;
                    u8jVar.q = 1;
                    Object a = w8j.a(w8jVar, oqVar, u8jVar);
                    if (a != nm6Var) {
                        list2 = list;
                        album$AlbumType = d;
                        obj = a;
                        arrayList2 = arrayList;
                        xbbVar = xbbVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z8jVar = (z8j) u8jVar.j;
                    qgg.h0(obj);
                    w8jVar.d.l(z8jVar);
                    return Unit.a;
                }
                List list4 = u8jVar.n;
                str = u8jVar.m;
                ArrayList arrayList3 = u8jVar.l;
                Album$AlbumType album$AlbumType2 = u8jVar.k;
                xbb xbbVar3 = (xbb) u8jVar.j;
                qgg.h0(obj);
                list2 = list4;
                arrayList2 = arrayList3;
                album$AlbumType = album$AlbumType2;
                xbbVar = xbbVar3;
                z8jVar = new z8j(xbbVar, album$AlbumType, arrayList2, str, list2, (List) obj);
                r2f r2fVar = (r2f) this.d;
                u8jVar.j = z8jVar;
                u8jVar.k = null;
                u8jVar.l = null;
                u8jVar.m = null;
                u8jVar.n = null;
                u8jVar.q = 2;
            }
        }
        u8jVar = new u8j(this, continuation);
        Object obj2 = u8jVar.o;
        nm6 nm6Var2 = nm6.a;
        i = u8jVar.q;
        if (i != 0) {
        }
        z8jVar = new z8j(xbbVar, album$AlbumType, arrayList2, str, list2, (List) obj2);
        r2f r2fVar2 = (r2f) this.d;
        u8jVar.j = z8jVar;
        u8jVar.k = null;
        u8jVar.l = null;
        u8jVar.m = null;
        u8jVar.n = null;
        u8jVar.q = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x038a, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x043a, code lost:
    
        if (r2.emit(r1, r3) == r6) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0408, code lost:
    
        if (((defpackage.rjc) r11).emit(r1, r3) == r6) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0498, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0502, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0573, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x055a, code lost:
    
        if (r1 == r4) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0895, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0954, code lost:
    
        if (r7.emit(r1, r3) != r4) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x093f, code lost:
    
        if (r2 == r4) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fa, code lost:
    
        if ((r5.equals(r6.b().getString("LAST_KNOWN_STATION", null)) ? r6.a.b() - r6.b().getLong("LAST_KNOWN_STATION_ACTIVE_TIME", 0) : Long.MAX_VALUE) <= 1800000) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Type inference failed for: r10v15, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r10v16, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, pyc] */
    /* JADX WARN: Type inference failed for: r11v15, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v112, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v133 */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        t21 t21Var;
        int i;
        w51 w51Var;
        int i2;
        un1 un1Var;
        int i3;
        nnk nnkVar;
        sz1 sz1Var;
        int i4;
        rjc rjcVar;
        uz1 uz1Var;
        mw2 mw2Var;
        int i5;
        ua3 ua3Var;
        int i6;
        rjc rjcVar2;
        Object value;
        String string;
        ic5 ic5Var;
        int i7;
        ld5 ld5Var;
        int i8;
        ya8 ya8Var;
        int i9;
        xjc xjcVar;
        int i10;
        xqn xqnVar;
        tl0 tl0Var;
        zjc zjcVar;
        int i11;
        xqn xqnVar2;
        tl0 tl0Var2;
        pkc pkcVar;
        int i12;
        rjc rjcVar3;
        jlc jlcVar;
        int i13;
        tl0 tl0Var3;
        jmc jmcVar;
        int i14;
        xqn xqnVar3;
        tl0 tl0Var4;
        wed wedVar;
        int i15;
        Object obj2;
        egd next;
        Object obj3;
        l5g l5gVar;
        int i16;
        rjc rjcVar4;
        z6i z6iVar;
        int i17;
        Object obj4 = obj;
        int i18 = this.a;
        int i19 = 3;
        int i20 = 0;
        int i21 = 0;
        boolean z = false;
        int i22 = 0;
        int i23 = 0;
        Object obj5 = this.d;
        ?? r11 = this.c;
        Object obj6 = this.b;
        r13 = null;
        Pair pair = null;
        switch (i18) {
            case 0:
                d8t d8tVar = (d8t) r11;
                ((jtm) obj6).setValue(Boolean.valueOf(((Boolean) obj4).booleanValue() ? ((Boolean) ((Function2) ((aqi) obj5).getValue()).invoke(d8tVar.c(), d8tVar.d.getValue())).booleanValue() : false));
                return Unit.a;
            case 1:
                if (continuation instanceof t21) {
                    t21Var = (t21) continuation;
                    int i24 = t21Var.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        t21Var.k = i24 - Integer.MIN_VALUE;
                        Object obj7 = t21Var.j;
                        nm6 nm6Var = nm6.a;
                        i = t21Var.k;
                        if (i != 0) {
                            qgg.h0(obj7);
                            kke kkeVar = new kke(((Number) obj4).intValue(), ((x21) r11).c((jx7) obj5));
                            t21Var.k = 1;
                            if (((rjc) obj6).emit(kkeVar, t21Var) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj7);
                        }
                        return Unit.a;
                    }
                }
                t21Var = new t21(this, continuation);
                Object obj72 = t21Var.j;
                nm6 nm6Var2 = nm6.a;
                i = t21Var.k;
                if (i != 0) {
                }
                return Unit.a;
            case 2:
                if (continuation instanceof w51) {
                    w51Var = (w51) continuation;
                    int i25 = w51Var.k;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        w51Var.k = i25 - Integer.MIN_VALUE;
                        Object obj8 = w51Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = w51Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj8);
                            kke kkeVar2 = new kke(((Number) obj4).intValue(), ((z51) r11).c((jx7) obj5));
                            w51Var.k = 1;
                            if (((rjc) obj6).emit(kkeVar2, w51Var) == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj8);
                        }
                        return Unit.a;
                    }
                }
                w51Var = new w51(this, continuation);
                Object obj82 = w51Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = w51Var.k;
                if (i2 != 0) {
                }
                return Unit.a;
            case 3:
                if (continuation instanceof un1) {
                    un1Var = (un1) continuation;
                    int i26 = un1Var.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        un1Var.k = i26 - Integer.MIN_VALUE;
                        Object obj9 = un1Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = un1Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar5 = (rjc) obj6;
                            j1g j1gVar = (j1g) obj4;
                            wn1 wn1Var = (wn1) r11;
                            tm1 tm1Var = (tm1) obj5;
                            u51 u51Var = tm1Var.a;
                            boolean z2 = j1gVar == j1g.a;
                            qm1 qm1Var = wn1Var.g;
                            String str = u51Var.a;
                            u9b u9bVar = u51Var.c;
                            qm1Var.getClass();
                            str.getClass();
                            if (u9bVar == null) {
                                Integer intOrNull = StringsKt.toIntOrNull(str);
                                int intValue = intOrNull != null ? intOrNull.intValue() : 0;
                                nnkVar = new nnk(bg3.W(intValue, "#000000", true), bg3.W(intValue, "#000000", false));
                            } else {
                                nnkVar = new nnk(u9bVar, u9bVar);
                            }
                            String str2 = u51Var.b;
                            u9b u9bVar2 = (u9b) nnkVar.a;
                            v9b I = u9bVar2 != null ? bcx.I(u9bVar2, frv.b()) : null;
                            u9b u9bVar3 = (u9b) nnkVar.b;
                            v9b I2 = u9bVar3 != null ? bcx.I(u9bVar3, frv.b()) : null;
                            String str3 = tm1Var.b;
                            fk1 fk1Var = tm1Var.c;
                            dn1 dn1Var = new dn1(new xn1(str2, I, I2, str3, fk1Var != null ? ot0.B(fk1Var.a, (Locale) wn1Var.h.invoke()) : null, z2), tm1Var.d, u51Var);
                            un1Var.k = 1;
                            if (rjcVar5.emit(dn1Var, un1Var) == nm6Var4) {
                                return nm6Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj9);
                        }
                        return Unit.a;
                    }
                }
                un1Var = new un1(this, continuation);
                Object obj92 = un1Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = un1Var.k;
                if (i3 != 0) {
                }
                return Unit.a;
            case 4:
                if (continuation instanceof sz1) {
                    sz1Var = (sz1) continuation;
                    int i27 = sz1Var.k;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        sz1Var.k = i27 - Integer.MIN_VALUE;
                        Object obj10 = sz1Var.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = sz1Var.k;
                        if (i4 != 0) {
                            qgg.h0(obj10);
                            rjcVar = (rjc) obj6;
                            uz1Var = (uz1) r11;
                            av0 av0Var = (av0) ((jyr) obj5).getValue();
                            sz1Var.m = rjcVar;
                            sz1Var.n = uz1Var;
                            sz1Var.o = 0;
                            sz1Var.k = 1;
                            obj10 = ((iv0) av0Var).a.k(sz1Var);
                            break;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    qgg.h0(obj10);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i23 = sz1Var.o;
                            uz1Var = sz1Var.n;
                            rjcVar = sz1Var.m;
                            qgg.h0(obj10);
                        }
                        v02 e = uz1Var.e((yxc) obj10);
                        sz1Var.m = null;
                        sz1Var.n = null;
                        sz1Var.o = i23;
                        sz1Var.k = 2;
                        break;
                    }
                }
                sz1Var = new sz1(this, continuation);
                Object obj102 = sz1Var.j;
                nm6 nm6Var52 = nm6.a;
                i4 = sz1Var.k;
                if (i4 != 0) {
                }
                v02 e2 = uz1Var.e((yxc) obj102);
                sz1Var.m = null;
                sz1Var.n = null;
                sz1Var.o = i23;
                sz1Var.k = 2;
            case 5:
                if (continuation instanceof mw2) {
                    mw2Var = (mw2) continuation;
                    int i28 = mw2Var.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        mw2Var.k = i28 - Integer.MIN_VALUE;
                        Object obj11 = mw2Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = mw2Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj11);
                            Boolean valueOf = Boolean.valueOf(((rw2) r11).e((Context) obj5, ((Number) obj4).longValue()));
                            mw2Var.k = 1;
                            if (((rjc) obj6).emit(valueOf, mw2Var) == nm6Var6) {
                                return nm6Var6;
                            }
                        } else {
                            if (i5 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj11);
                        }
                        return Unit.a;
                    }
                }
                mw2Var = new mw2(this, continuation);
                Object obj112 = mw2Var.j;
                nm6 nm6Var62 = nm6.a;
                i5 = mw2Var.k;
                if (i5 != 0) {
                }
                return Unit.a;
            case 6:
                if (continuation instanceof ua3) {
                    ua3Var = (ua3) continuation;
                    int i29 = ua3Var.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ua3Var.k = i29 - Integer.MIN_VALUE;
                        Object obj12 = ua3Var.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = ua3Var.k;
                        if (i6 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar6 = (rjc) obj6;
                            mqs mqsVar = (mqs) obj4;
                            dn9 dn9Var = (dn9) r11;
                            oq oqVar = (oq) obj5;
                            ua3Var.m = rjcVar6;
                            ua3Var.n = 0;
                            ua3Var.k = 1;
                            Object j = mqsVar != null ? dn9Var.j(oqVar, mqsVar) : x97.V(dm6.b, new cs1(oqVar, dn9Var, r13, 11), ua3Var);
                            if (j != nm6Var7) {
                                obj12 = j;
                                rjcVar2 = rjcVar6;
                            }
                            return nm6Var7;
                        }
                        if (i6 != 1) {
                            if (i6 == 2) {
                                qgg.h0(obj12);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i22 = ua3Var.n;
                        rjcVar2 = ua3Var.m;
                        qgg.h0(obj12);
                        ua3Var.m = null;
                        ua3Var.n = i22;
                        ua3Var.k = 2;
                        break;
                    }
                }
                ua3Var = new ua3(this, continuation);
                Object obj122 = ua3Var.j;
                nm6 nm6Var72 = nm6.a;
                i6 = ua3Var.k;
                if (i6 != 0) {
                }
                ua3Var.m = null;
                ua3Var.n = i22;
                ua3Var.k = 2;
            case 7:
                xxq xxqVar = (xxq) obj4;
                mk3 mk3Var = (mk3) obj6;
                xdr xdrVar = mk3Var.l;
                Resources resources = (Resources) obj5;
                do {
                    value = xdrVar.getValue();
                    kk3 kk3Var = (kk3) value;
                    string = resources.getString(xxqVar.a() ? R.string.change_user : R.string.authorize_btn);
                    string.getClass();
                    kk3Var.getClass();
                } while (!xdrVar.k(value, new kk3(string)));
                if (v3g.E((dqi) ((xrt) r11).a.getValue()).d) {
                    t tVar = (t) mk3Var.k.b;
                    lhs lhsVar = MainScreenActivity.Q0;
                    tVar.startActivity(imp.J(tVar, null, null, null, 14));
                    tVar.finish();
                }
                return Unit.a;
            case 8:
                int intValue2 = ((Number) obj4).intValue();
                ((u6k) obj6).i(intValue2);
                v25 v25Var = (v25) r11;
                o0s o0sVar = ((q0s) ((y25) obj5).a.get(intValue2)).b;
                v25Var.getClass();
                d35 d35Var = v25Var.b;
                d35Var.getClass();
                xdr xdrVar2 = d35Var.p;
                xdrVar2.getClass();
                xdrVar2.m(null, o0sVar);
                yk3 yk3Var = v25Var.d;
                t0s t0sVar = new t0s(o0sVar, intValue2);
                yk3Var.getClass();
                if (((t0s) yk3Var.e) != null) {
                    yk3Var.a = false;
                }
                yk3Var.e = t0sVar;
                return Unit.a;
            case 9:
                if (continuation instanceof ic5) {
                    ic5Var = (ic5) continuation;
                    int i30 = ic5Var.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        ic5Var.k = i30 - Integer.MIN_VALUE;
                        Object obj13 = ic5Var.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = ic5Var.k;
                        if (i7 != 0) {
                            qgg.h0(obj13);
                            Boolean valueOf2 = Boolean.valueOf(((gp4) ((nc5) r11).d.getValue()).a(((x1u) obj5).i));
                            ic5Var.k = 1;
                            if (((rjc) obj6).emit(valueOf2, ic5Var) == nm6Var8) {
                                return nm6Var8;
                            }
                        } else {
                            if (i7 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj13);
                        }
                        return Unit.a;
                    }
                }
                ic5Var = new ic5(this, continuation);
                Object obj132 = ic5Var.j;
                nm6 nm6Var82 = nm6.a;
                i7 = ic5Var.k;
                if (i7 != 0) {
                }
                return Unit.a;
            case 10:
                if (continuation instanceof ld5) {
                    ld5Var = (ld5) continuation;
                    int i31 = ld5Var.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ld5Var.k = i31 - Integer.MIN_VALUE;
                        Object obj14 = ld5Var.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = ld5Var.k;
                        if (i8 != 0) {
                            qgg.h0(obj14);
                            kke kkeVar3 = new kke(((Number) obj4).intValue(), ((od5) r11).c((jx7) obj5));
                            ld5Var.k = 1;
                            if (((rjc) obj6).emit(kkeVar3, ld5Var) == nm6Var9) {
                                return nm6Var9;
                            }
                        } else {
                            if (i8 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj14);
                        }
                        return Unit.a;
                    }
                }
                ld5Var = new ld5(this, continuation);
                Object obj142 = ld5Var.j;
                nm6 nm6Var92 = nm6.a;
                i8 = ld5Var.k;
                if (i8 != 0) {
                }
                return Unit.a;
            case 11:
                Uri uri = (Uri) obj4;
                o17 o17Var = (o17) r11;
                mm6 mm6Var = (mm6) obj6;
                if (((Intrinsics.d(uri.getHost(), "close") && Intrinsics.d(uri.getScheme(), "payment-sdk")) ? mm6Var : null) != null) {
                    ((tu2) o17Var.h.getValue()).K();
                }
                if (((Intrinsics.d(uri.getHost(), "resend_sms") && Intrinsics.d(uri.getScheme(), "payment-sdk")) ? mm6Var : null) != null) {
                    c27 x = o17Var.x();
                    voi voiVar = x.v;
                    if (Intrinsics.d(voiVar.d(), v17.b)) {
                        g0c g0cVar = x.l;
                        qne b1 = gut.b1(x.G());
                        x60 x60Var = (x60) g0cVar;
                        x60Var.getClass();
                        x60Var.a(b1);
                        voiVar.m(v17.d);
                        w03 w03Var = ((tdk) x.n).h;
                        mfk mfkVar = x.t;
                        String str4 = mfkVar != null ? mfkVar.a : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        w03Var.d(str4, x.G(), x.x);
                    }
                }
                if (!Intrinsics.d(uri.getHost(), "bank_open") || !Intrinsics.d(uri.getScheme(), "payment-sdk")) {
                    mm6Var = null;
                }
                if (mm6Var != null) {
                    String str5 = ((mfk) obj5).b;
                    String concat = (str5 != null ? str5 : "").concat("://");
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(concat));
                    try {
                        t l = o17Var.l();
                        if (l != null) {
                            l.startActivity(intent);
                        }
                        z = true;
                    } catch (ActivityNotFoundException unused) {
                    }
                    g0c g0cVar2 = o17Var.l;
                    if (g0cVar2 == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    ((x60) g0cVar2).a(gut.Y0(concat, z));
                }
                return Unit.a;
            case 12:
                xqn xqnVar4 = (xqn) r11;
                za8 za8Var = (za8) obj6;
                if (continuation instanceof ya8) {
                    ya8Var = (ya8) continuation;
                    int i32 = ya8Var.l;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ya8Var.l = i32 - Integer.MIN_VALUE;
                        Object obj15 = ya8Var.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = ya8Var.l;
                        if (i9 != 0) {
                            qgg.h0(obj15);
                            Object invoke = za8Var.b.invoke(obj4);
                            Object obj16 = xqnVar4.a;
                            if (obj16 == ugj.a || !((Boolean) za8Var.c.invoke(obj16, invoke)).booleanValue()) {
                                xqnVar4.a = invoke;
                                ya8Var.l = 1;
                                if (((rjc) obj5).emit(obj4, ya8Var) == nm6Var10) {
                                    return nm6Var10;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj15);
                        }
                        return Unit.a;
                    }
                }
                ya8Var = new ya8(this, continuation);
                Object obj152 = ya8Var.j;
                nm6 nm6Var102 = nm6.a;
                i9 = ya8Var.l;
                if (i9 != 0) {
                }
                return Unit.a;
            case 13:
                int intValue3 = ((Number) obj4).intValue();
                ((u6k) obj6).i(intValue3);
                eha ehaVar = (eha) r11;
                p0s p0sVar = ((s0s) ((List) obj5).get(intValue3)).b;
                ehaVar.getClass();
                xdr xdrVar3 = ehaVar.b.l;
                xdrVar3.getClass();
                xdrVar3.m(null, p0sVar);
                return Unit.a;
            case 14:
                ((Number) obj4).intValue();
                sj2.k((aqi) obj5, (aqi) obj6, (sub) r11);
                return Unit.a;
            case 15:
                if (continuation instanceof xjc) {
                    xjcVar = (xjc) continuation;
                    int i33 = xjcVar.n;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        xjcVar.n = i33 - Integer.MIN_VALUE;
                        Object obj17 = xjcVar.l;
                        nm6 nm6Var11 = nm6.a;
                        i10 = xjcVar.n;
                        if (i10 != 0) {
                            qgg.h0(obj17);
                            xqnVar = (xqn) obj6;
                            Object obj18 = xqnVar.a;
                            if (obj18 != quj.f) {
                                xjcVar.j = this;
                                xjcVar.k = xqnVar;
                                xjcVar.n = 1;
                                obj4 = ((aur) r11).invoke(obj18, obj4, xjcVar);
                                break;
                            }
                            tl0Var = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    qgg.h0(obj17);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xqn xqnVar5 = xjcVar.k;
                            tl0Var = xjcVar.j;
                            qgg.h0(obj17);
                            xqnVar = xqnVar5;
                            obj4 = obj17;
                        }
                        xqnVar.a = obj4;
                        rjc rjcVar7 = (rjc) tl0Var.d;
                        Object obj19 = ((xqn) tl0Var.b).a;
                        xjcVar.j = null;
                        xjcVar.k = null;
                        xjcVar.n = 2;
                        break;
                    }
                }
                xjcVar = new xjc(this, continuation);
                Object obj172 = xjcVar.l;
                nm6 nm6Var112 = nm6.a;
                i10 = xjcVar.n;
                if (i10 != 0) {
                }
                xqnVar.a = obj4;
                rjc rjcVar72 = (rjc) tl0Var.d;
                Object obj192 = ((xqn) tl0Var.b).a;
                xjcVar.j = null;
                xjcVar.k = null;
                xjcVar.n = 2;
            case 16:
                if (continuation instanceof zjc) {
                    zjcVar = (zjc) continuation;
                    int i34 = zjcVar.n;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        zjcVar.n = i34 - Integer.MIN_VALUE;
                        Object obj20 = zjcVar.l;
                        nm6 nm6Var12 = nm6.a;
                        i11 = zjcVar.n;
                        if (i11 != 0) {
                            qgg.h0(obj20);
                            xqn xqnVar6 = (xqn) obj6;
                            Object obj21 = xqnVar6.a;
                            zjcVar.j = this;
                            zjcVar.k = xqnVar6;
                            zjcVar.n = 1;
                            Object invoke2 = ((cle) r11).invoke(obj21, obj4, zjcVar);
                            if (invoke2 != nm6Var12) {
                                obj20 = invoke2;
                                xqnVar2 = xqnVar6;
                                tl0Var2 = this;
                            }
                            return nm6Var12;
                        }
                        if (i11 != 1) {
                            if (i11 == 2) {
                                qgg.h0(obj20);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqnVar2 = zjcVar.k;
                        tl0Var2 = zjcVar.j;
                        qgg.h0(obj20);
                        xqnVar2.a = obj20;
                        rjc rjcVar8 = (rjc) tl0Var2.d;
                        Object obj22 = ((xqn) tl0Var2.b).a;
                        zjcVar.j = null;
                        zjcVar.k = null;
                        zjcVar.n = 2;
                        break;
                    }
                }
                zjcVar = new zjc(this, continuation);
                Object obj202 = zjcVar.l;
                nm6 nm6Var122 = nm6.a;
                i11 = zjcVar.n;
                if (i11 != 0) {
                }
                xqnVar2.a = obj202;
                rjc rjcVar82 = (rjc) tl0Var2.d;
                Object obj222 = ((xqn) tl0Var2.b).a;
                zjcVar.j = null;
                zjcVar.k = null;
                zjcVar.n = 2;
            case 17:
                if (continuation instanceof pkc) {
                    pkcVar = (pkc) continuation;
                    int i35 = pkcVar.n;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        pkcVar.n = i35 - Integer.MIN_VALUE;
                        Object obj23 = pkcVar.l;
                        nm6 nm6Var13 = nm6.a;
                        i12 = pkcVar.n;
                        if (i12 != 0) {
                            qgg.h0(obj23);
                            Object obj24 = ((AtomicReference) obj6).get();
                            if (obj24 != null) {
                                rjc rjcVar9 = (rjc) r11;
                                pkcVar.j = rjcVar9;
                                pkcVar.k = 0;
                                pkcVar.n = 1;
                                obj23 = ((aur) obj5).invoke(obj4, obj24, pkcVar);
                                if (obj23 != nm6Var13) {
                                    rjcVar3 = rjcVar9;
                                    pkcVar.j = null;
                                    pkcVar.k = i21;
                                    pkcVar.n = 2;
                                }
                                return nm6Var13;
                            }
                            return Unit.a;
                        }
                        if (i12 != 1) {
                            if (i12 == 2) {
                                qgg.h0(obj23);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i21 = pkcVar.k;
                        rjcVar3 = pkcVar.j;
                        qgg.h0(obj23);
                        pkcVar.j = null;
                        pkcVar.k = i21;
                        pkcVar.n = 2;
                        break;
                    }
                }
                pkcVar = new pkc(this, continuation);
                Object obj232 = pkcVar.l;
                nm6 nm6Var132 = nm6.a;
                i12 = pkcVar.n;
                if (i12 != 0) {
                }
            case 18:
                if (continuation instanceof jlc) {
                    jlcVar = (jlc) continuation;
                    int i36 = jlcVar.n;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        jlcVar.n = i36 - Integer.MIN_VALUE;
                        Object obj25 = jlcVar.l;
                        nm6 nm6Var14 = nm6.a;
                        i13 = jlcVar.n;
                        if (i13 == 0) {
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    obj4 = jlcVar.k;
                                    tl0Var3 = jlcVar.j;
                                    qgg.h0(obj25);
                                    if (!((Boolean) obj25).booleanValue()) {
                                        ((tqn) tl0Var3.b).a = true;
                                        rjc rjcVar10 = (rjc) tl0Var3.c;
                                        jlcVar.j = null;
                                        jlcVar.k = null;
                                        jlcVar.n = 3;
                                        break;
                                    }
                                    return Unit.a;
                                }
                                if (i13 != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            qgg.h0(obj25);
                            return Unit.a;
                        }
                        qgg.h0(obj25);
                        if (((tqn) obj6).a) {
                            jlcVar.n = 1;
                            break;
                        } else {
                            jlcVar.j = this;
                            jlcVar.k = obj4;
                            jlcVar.n = 2;
                            obj25 = ((aur) obj5).invoke(obj4, jlcVar);
                            if (obj25 != nm6Var14) {
                                tl0Var3 = this;
                                if (!((Boolean) obj25).booleanValue()) {
                                }
                                return Unit.a;
                            }
                        }
                        return nm6Var14;
                    }
                }
                jlcVar = new jlc(this, continuation);
                Object obj252 = jlcVar.l;
                nm6 nm6Var142 = nm6.a;
                i13 = jlcVar.n;
                if (i13 == 0) {
                }
                return nm6Var142;
            case 19:
                xqn xqnVar7 = (xqn) obj6;
                bqi bqiVar = (bqi) xqnVar7.a;
                if (bqiVar != null) {
                    ((xdr) bqiVar).l(obj4);
                } else {
                    xdr a = ydr.a(obj4);
                    r7o r7oVar = z7o.b;
                    saf.Q(((mm6) r11).getCoroutineContext());
                    ((gm5) obj5).U(new z7o(new fkn(a)));
                    xqnVar7.a = a;
                }
                return Unit.a;
            case 20:
                if (continuation instanceof jmc) {
                    jmcVar = (jmc) continuation;
                    int i37 = jmcVar.n;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        jmcVar.n = i37 - Integer.MIN_VALUE;
                        Object obj26 = jmcVar.l;
                        nm6 nm6Var15 = nm6.a;
                        i14 = jmcVar.n;
                        if (i14 != 0) {
                            qgg.h0(obj26);
                            xqn xqnVar8 = (xqn) obj6;
                            Object obj27 = xqnVar8.a;
                            jmcVar.j = this;
                            jmcVar.k = xqnVar8;
                            jmcVar.n = 1;
                            Object invoke3 = r11.invoke(obj27, obj4, jmcVar);
                            if (invoke3 != nm6Var15) {
                                obj26 = invoke3;
                                xqnVar3 = xqnVar8;
                                tl0Var4 = this;
                            }
                            return nm6Var15;
                        }
                        if (i14 != 1) {
                            if (i14 == 2) {
                                qgg.h0(obj26);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqnVar3 = jmcVar.k;
                        tl0Var4 = jmcVar.j;
                        qgg.h0(obj26);
                        xqnVar3.a = obj26;
                        rjc rjcVar11 = (rjc) tl0Var4.d;
                        Object obj28 = ((xqn) tl0Var4.b).a;
                        jmcVar.j = null;
                        jmcVar.k = null;
                        jmcVar.n = 2;
                        break;
                    }
                }
                jmcVar = new jmc(this, continuation);
                Object obj262 = jmcVar.l;
                nm6 nm6Var152 = nm6.a;
                i14 = jmcVar.n;
                if (i14 != 0) {
                }
                xqnVar3.a = obj262;
                rjc rjcVar112 = (rjc) tl0Var4.d;
                Object obj282 = ((xqn) tl0Var4.b).a;
                jmcVar.j = null;
                jmcVar.k = null;
                jmcVar.n = 2;
            case 21:
                if (continuation instanceof wed) {
                    wedVar = (wed) continuation;
                    int i38 = wedVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        wedVar.k = i38 - Integer.MIN_VALUE;
                        Object obj29 = wedVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = wedVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj29);
                            rjc rjcVar12 = (rjc) obj6;
                            List list = (List) obj4;
                            iz7 iz7Var = (iz7) r11;
                            med[] medVarArr = (med[]) obj5;
                            iz7Var.getClass();
                            jyr jyrVar = (jyr) iz7Var.e;
                            if (xz0.u(medVarArr, med.a) && (r5 = ((agd) jyrVar.getValue()).b().getString("LAST_KNOWN_STATION", null)) != null) {
                                if (((agd) jyrVar.getValue()).b().getBoolean("LAST_KNOWN_STATION_HOLDING_ENABLED", false)) {
                                    agd agdVar = (agd) jyrVar.getValue();
                                    agdVar.getClass();
                                    break;
                                }
                                String string2 = null;
                                if (string2 != null) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj3 = it.next();
                                            egd egdVar = (egd) obj3;
                                            if (Intrinsics.d(egdVar.b.getDeviceId(), string2)) {
                                                unl unlVar = egdVar.g;
                                                if (!Intrinsics.d(unlVar != null ? Boolean.valueOf(lg3.o0(unlVar)) : null, Boolean.FALSE)) {
                                                }
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    egd egdVar2 = (egd) obj3;
                                    if (egdVar2 != null) {
                                        pair = new Pair(egdVar2, med.a);
                                        if (pair != null) {
                                            wedVar.k = 1;
                                            if (rjcVar12.emit(pair, wedVar) == nm6Var16) {
                                                return nm6Var16;
                                            }
                                        }
                                    }
                                }
                            }
                            if (xz0.u(medVarArr, med.b)) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj30 : list) {
                                    egd egdVar3 = (egd) obj30;
                                    unl unlVar2 = egdVar3.g;
                                    if (unlVar2 != null && unlVar2.hasPause()) {
                                        unl unlVar3 = egdVar3.g;
                                        if (Intrinsics.d(unlVar3 != null ? Boolean.valueOf(lg3.o0(unlVar3)) : null, Boolean.TRUE)) {
                                            arrayList.add(obj30);
                                        }
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        String deviceId = ((egd) obj2).b.getDeviceId();
                                        deviceId.getClass();
                                        if (deviceId.equals(((agd) jyrVar.getValue()).b().getString("LAST_KNOWN_STATION", null))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                egd egdVar4 = (egd) obj2;
                                if (egdVar4 == null) {
                                    Iterator it3 = arrayList.iterator();
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (it3.hasNext()) {
                                            Long timeSinceLastVoiceActivity = ((egd) next).f.getTimeSinceLastVoiceActivity();
                                            long longValue = timeSinceLastVoiceActivity != null ? timeSinceLastVoiceActivity.longValue() : Long.MAX_VALUE;
                                            do {
                                                Object next2 = it3.next();
                                                Long timeSinceLastVoiceActivity2 = ((egd) next2).f.getTimeSinceLastVoiceActivity();
                                                long longValue2 = timeSinceLastVoiceActivity2 != null ? timeSinceLastVoiceActivity2.longValue() : Long.MAX_VALUE;
                                                next = next;
                                                if (longValue < longValue2) {
                                                    next = next2;
                                                    longValue = longValue2;
                                                }
                                            } while (it3.hasNext());
                                        }
                                    } else {
                                        next = 0;
                                    }
                                    egdVar4 = next;
                                }
                                if (egdVar4 != null) {
                                    pair = new Pair(egdVar4, med.b);
                                }
                            }
                            if (pair != null) {
                            }
                        } else {
                            if (i15 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj29);
                        }
                        return Unit.a;
                    }
                }
                wedVar = new wed(this, continuation);
                Object obj292 = wedVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = wedVar.k;
                if (i15 != 0) {
                }
                return Unit.a;
            case 22:
                tqn tqnVar = (tqn) obj6;
                if (!tqnVar.a) {
                    tqnVar.a = true;
                    Object emit = ((rjc) r11).emit(obj4, continuation);
                    return emit == nm6.a ? emit : Unit.a;
                }
                throw new tgr(sgr.n.i("Expected one request for " + obj5 + " but received two"), null);
            case 23:
                int intValue4 = ((Number) obj4).intValue();
                xqn xqnVar9 = (xqn) obj6;
                Integer num = (Integer) xqnVar9.a;
                if (num != null) {
                    int intValue5 = num.intValue();
                    ((ruq) r11).a(intValue5);
                    ((pwq) obj5).a(intValue5);
                }
                xqnVar9.a = new Integer(intValue4);
                return Unit.a;
            case 24:
                if (continuation instanceof l5g) {
                    l5gVar = (l5g) continuation;
                    int i39 = l5gVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        l5gVar.k = i39 - Integer.MIN_VALUE;
                        Object obj31 = l5gVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = l5gVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj31);
                            rjc rjcVar13 = (rjc) obj6;
                            ((Boolean) obj4).getClass();
                            l5gVar.m = rjcVar13;
                            l5gVar.n = 0;
                            l5gVar.k = 1;
                            Object b = nsh.b((nsh) r11, (j5g) obj5, l5gVar);
                            if (b != nm6Var17) {
                                obj31 = b;
                                rjcVar4 = rjcVar13;
                            }
                            return nm6Var17;
                        }
                        if (i16 != 1) {
                            if (i16 == 2) {
                                qgg.h0(obj31);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i20 = l5gVar.n;
                        rjcVar4 = l5gVar.m;
                        qgg.h0(obj31);
                        l5gVar.m = null;
                        l5gVar.n = i20;
                        l5gVar.k = 2;
                        break;
                    }
                }
                l5gVar = new l5g(this, continuation);
                Object obj312 = l5gVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = l5gVar.k;
                if (i16 != 0) {
                }
                l5gVar.m = null;
                l5gVar.n = i20;
                l5gVar.k = 2;
            case 25:
                if (continuation instanceof z6i) {
                    z6iVar = (z6i) continuation;
                    int i40 = z6iVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        z6iVar.k = i40 - Integer.MIN_VALUE;
                        Object obj32 = z6iVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = z6iVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj32);
                            v3k v3kVar = (v3k) obj4;
                            a37 a37Var = new a37((Integer) r11, (Integer) obj5, r13, i19);
                            v3kVar.getClass();
                            pjc pjcVar = v3kVar.a;
                            pjcVar.getClass();
                            v3k v3kVar2 = new v3k(new ail(18, pjcVar, new tgp(1, new cle((pyc) a37Var, (Continuation) null, 17))), v3kVar.b, v3kVar.c, xuj.v);
                            z6iVar.k = 1;
                            if (((rjc) obj6).emit(v3kVar2, z6iVar) == nm6Var18) {
                                return nm6Var18;
                            }
                        } else {
                            if (i17 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj32);
                        }
                        return Unit.a;
                    }
                }
                z6iVar = new z6i(this, continuation);
                Object obj322 = z6iVar.j;
                nm6 nm6Var182 = nm6.a;
                i17 = z6iVar.k;
                if (i17 != 0) {
                }
                return Unit.a;
            case 26:
                return c((List) obj4, continuation);
            case 27:
                return d(obj, continuation);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return e(obj, continuation);
            default:
                return b((d6l) obj4, continuation);
        }
    }

    public tl0(aqi aqiVar, aqi aqiVar2, sub subVar) {
        this.a = 14;
        this.d = aqiVar;
        this.b = aqiVar2;
        this.c = subVar;
    }

    public /* synthetic */ tl0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tl0(xqn xqnVar, pyc pycVar, rjc rjcVar) {
        this.a = 15;
        this.b = xqnVar;
        this.c = (aur) pycVar;
        this.d = rjcVar;
    }

    public tl0(xqn xqnVar, xqn xqnVar2, rjc rjcVar, t1f t1fVar) {
        this.a = 29;
        this.b = xqnVar;
        this.c = xqnVar2;
        this.d = rjcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tl0(AtomicReference atomicReference, rjc rjcVar, pyc pycVar) {
        this.a = 17;
        this.b = atomicReference;
        this.c = rjcVar;
        this.d = (aur) pycVar;
    }
}
