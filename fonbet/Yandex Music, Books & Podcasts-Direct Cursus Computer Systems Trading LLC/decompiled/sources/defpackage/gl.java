package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.t;
import com.google.android.gms.cast.CastDevice;
import com.yandex.passport.internal.account.f;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class gl implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gl(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(Object obj, Continuation continuation) {
        l76 l76Var;
        int i;
        if (continuation instanceof l76) {
            l76Var = (l76) continuation;
            int i2 = l76Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l76Var.k = i2 - Integer.MIN_VALUE;
                Object obj2 = l76Var.j;
                nm6 nm6Var = nm6.a;
                i = l76Var.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar = (rjc) this.b;
                    Boolean valueOf = Boolean.valueOf(((x66) obj).a && ((m76) this.c).b == k76.a);
                    l76Var.k = 1;
                    if (rjcVar.emit(valueOf, l76Var) == nm6Var) {
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
        l76Var = new l76(this, continuation);
        Object obj22 = l76Var.j;
        nm6 nm6Var2 = nm6.a;
        i = l76Var.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d((!r1.F ? r1.p ? r1.C : r1.G().k : r1.H().k).d(), r2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d((r10.F ? r10.p ? r10.C : r10.G().k : r10.H().k).d(), r2) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj, Continuation continuation) {
        mm6 mm6Var;
        mm6 mm6Var2;
        z07 A;
        Uri uri = (Uri) obj;
        mm6 mm6Var3 = (mm6) this.b;
        u07 u07Var = (u07) this.c;
        boolean d = Intrinsics.d(uri.getHost(), "continue");
        ox3 ox3Var = ox3.a;
        if (!d) {
            if (Intrinsics.d(uri.getHost(), "pay") && Intrinsics.d(uri.getScheme(), "payment-sdk")) {
                z07 A2 = u07Var.A();
            }
            mm6Var = null;
            if (mm6Var != null) {
                z07 A3 = u07Var.A();
                p13 p13Var = u07Var.u;
                k17 k17Var = u07Var.h;
                k17Var.getClass();
                if (p13Var instanceof n13) {
                    k5 k5Var = A3.G().n;
                    if (k5Var != null) {
                        k5Var.invoke();
                    }
                } else if (p13Var instanceof m13) {
                    k5 k5Var2 = A3.H().n;
                    if (k5Var2 != null) {
                        k5Var2.invoke();
                    }
                } else {
                    if (!(p13Var instanceof o13)) {
                        b6e.l(p13Var, "Unsupported BindType: ");
                        return null;
                    }
                    int ordinal = A3.w.ordinal();
                    if (ordinal == 1) {
                        k17Var.e();
                    } else {
                        if (ordinal != 3) {
                            xq0.q("Illegal card input state");
                            return null;
                        }
                        A3.s.m(ox3Var);
                        if (A3.G) {
                            g3j newCard = k17Var.getNewCard();
                            if (newCard == null) {
                                xq0.q("Valid state without correct payment option");
                                return null;
                            }
                            rdp W = klx.W(newCard);
                            s07 s07Var = A3.y;
                            s07Var.getClass();
                            s07Var.invoke(W);
                        } else {
                            ((tdk) A3.m).h.a(new znk(21, A3));
                        }
                    }
                }
            }
            if (((Intrinsics.d(uri.getHost(), "close") || !Intrinsics.d(uri.getScheme(), "payment-sdk")) ? null : mm6Var3) != null) {
                ((tu2) u07Var.k.getValue()).K();
            }
            if (Intrinsics.d(uri.getHost(), "back") && Intrinsics.d(uri.getScheme(), "payment-sdk")) {
                A = u07Var.A();
                if (!Intrinsics.d((A.F ? A.p ? A.C : A.G().k : A.H().k).d(), ox3Var)) {
                    mm6Var2 = mm6Var3;
                    if (mm6Var2 != null) {
                        u07Var.requireActivity().onBackPressed();
                    }
                    if (Intrinsics.d(uri.getHost(), "checkbox") && Intrinsics.d(uri.getScheme(), "payment-sdk")) {
                        z07 A4 = u07Var.A();
                    }
                    mm6Var3 = null;
                    if (mm6Var3 != null) {
                        voi voiVar = u07Var.A().t;
                        if (((Boolean) voiVar.d()) != null) {
                            voiVar.l(Boolean.valueOf(!r11.booleanValue()));
                        }
                    }
                    return Unit.a;
                }
            }
            mm6Var2 = null;
            if (mm6Var2 != null) {
            }
            if (Intrinsics.d(uri.getHost(), "checkbox")) {
                z07 A42 = u07Var.A();
            }
            mm6Var3 = null;
            if (mm6Var3 != null) {
            }
            return Unit.a;
        }
        mm6Var = mm6Var3;
        if (mm6Var != null) {
        }
        if (((Intrinsics.d(uri.getHost(), "close") || !Intrinsics.d(uri.getScheme(), "payment-sdk")) ? null : mm6Var3) != null) {
        }
        if (Intrinsics.d(uri.getHost(), "back")) {
            A = u07Var.A();
            if (!Intrinsics.d((A.F ? A.p ? A.C : A.G().k : A.H().k).d(), ox3Var)) {
            }
        }
        mm6Var2 = null;
        if (mm6Var2 != null) {
        }
        if (Intrinsics.d(uri.getHost(), "checkbox")) {
        }
        mm6Var3 = null;
        if (mm6Var3 != null) {
        }
        return Unit.a;
    }

    private final Object f(Object obj, Continuation continuation) {
        Uri uri = (Uri) obj;
        jyr jyrVar = ((i27) this.c).j;
        mm6 mm6Var = (mm6) this.b;
        if (((Intrinsics.d(uri.getHost(), "confirm") && Intrinsics.d(uri.getScheme(), "payment-sdk")) ? mm6Var : null) != null) {
            ((tu2) jyrVar.getValue()).J();
        }
        if (!Intrinsics.d(uri.getHost(), "decline") || !Intrinsics.d(uri.getScheme(), "payment-sdk")) {
            mm6Var = null;
        }
        if (mm6Var != null) {
            ((tu2) jyrVar.getValue()).G();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e3 A[LOOP:2: B:70:0x01dd->B:72:0x01e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e A[LOOP:3: B:75:0x0208->B:77:0x020e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(List list, Continuation continuation) {
        fl flVar;
        int i;
        List list2;
        y11 y11Var;
        nm6 nm6Var;
        int i2;
        List list3;
        r2f r2fVar;
        f21 f21Var;
        String str;
        switch (this.a) {
            case 0:
                il ilVar = (il) this.b;
                xdr xdrVar = ilVar.d;
                HashMap hashMap = ilVar.f;
                ArrayList arrayList = ilVar.e;
                if (continuation instanceof fl) {
                    flVar = (fl) continuation;
                    int i3 = flVar.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        flVar.m = i3 - Integer.MIN_VALUE;
                        Object obj = flVar.k;
                        nm6 nm6Var2 = nm6.a;
                        i = flVar.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            if (!arrayList.isEmpty()) {
                                arrayList.clear();
                                arrayList.addAll(list);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    evl evlVar = (evl) it.next();
                                    String e = evlVar.a.e();
                                    if (!ilVar.g.contains(e)) {
                                        hashMap.put(e, Boolean.valueOf(evlVar.b));
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    evl evlVar2 = (evl) it2.next();
                                    Boolean bool = (Boolean) hashMap.get(evlVar2.a.e());
                                    arrayList2.add(il.a(evlVar2, bool != null ? bool.booleanValue() : evlVar2.b));
                                }
                                jl jlVar = new jl(arrayList2);
                                xdrVar.getClass();
                                xdrVar.m(null, jlVar);
                                break;
                            } else {
                                rar rarVar = (rar) this.c;
                                flVar.j = list;
                                flVar.m = 1;
                                if (saf.C(rarVar, flVar) != nm6Var2) {
                                    list2 = list;
                                }
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            list2 = flVar.j;
                            qgg.h0(obj);
                        }
                        arrayList.addAll(list2);
                        List<evl> list4 = list2;
                        for (evl evlVar3 : list4) {
                            hashMap.put(evlVar3.a.e(), Boolean.valueOf(evlVar3.b));
                        }
                        ArrayList arrayList3 = new ArrayList(v75.o(list4, 10));
                        for (evl evlVar4 : list4) {
                            arrayList3.add(il.a(evlVar4, evlVar4.b));
                        }
                        jl jlVar2 = new jl(arrayList3);
                        xdrVar.getClass();
                        xdrVar.m(null, jlVar2);
                    }
                }
                flVar = new fl(this, continuation);
                Object obj2 = flVar.k;
                nm6 nm6Var22 = nm6.a;
                i = flVar.m;
                if (i != 0) {
                }
                arrayList.addAll(list2);
                List<evl> list42 = list2;
                while (r1.hasNext()) {
                }
                ArrayList arrayList32 = new ArrayList(v75.o(list42, 10));
                while (r2.hasNext()) {
                }
                jl jlVar22 = new jl(arrayList32);
                xdrVar.getClass();
                xdrVar.m(null, jlVar22);
                break;
            default:
                b21 b21Var = (b21) this.b;
                if (continuation instanceof y11) {
                    y11Var = (y11) continuation;
                    int i4 = y11Var.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        y11Var.n = i4 - Integer.MIN_VALUE;
                        Object obj3 = y11Var.l;
                        nm6Var = nm6.a;
                        i2 = y11Var.n;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    f21Var = y11Var.k;
                                    List list5 = y11Var.j;
                                    qgg.h0(obj3);
                                    b21Var.g.l(f21Var);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                list3 = y11Var.j;
                                qgg.h0(obj3);
                            }
                        } else {
                            qgg.h0(obj3);
                            y11Var.j = list;
                            y11Var.n = 1;
                            obj3 = b21.a(b21Var, y11Var);
                            if (obj3 != nm6Var) {
                                list3 = list;
                            }
                        }
                        lnu lnuVar = (lnu) obj3;
                        wbb wbbVar = (wbb) ((jyr) b21Var.b.e).getValue();
                        c01 c01Var = b21Var.a;
                        String str2 = ((c21) ((jyr) b21Var.b.i).getValue()).b;
                        wbbVar.getClass();
                        c01Var.getClass();
                        String w = vz1.w(c01Var.k);
                        xbb xbbVar = new xbb(w, c01Var.b, str2, (jzb) c01Var.u.getValue(), new rab(c01Var.b, str2 != null ? "" : str2, null, w, (jzb) c01Var.u.getValue(), false, c01Var.p), wbb.a(w, lnuVar, elu.d), new q91(c01Var.b, w, c01Var.p), null, qo6.d);
                        b01 b01Var = b21Var.a.f;
                        String obj4 = (b01Var != null || (str = b01Var.a) == null) ? null : StringsKt.t0(str).toString();
                        List list6 = list3;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : list6) {
                            if (((pj1) obj5).a) {
                                arrayList4.add(obj5);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj6 : list6) {
                            if (!((pj1) obj6).a) {
                                arrayList5.add(obj6);
                            }
                        }
                        l18 l18Var = l18.b;
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        f21 f21Var2 = new f21(xbbVar, obj4, lnuVar, arrayList4, arrayList5, ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h());
                        r2fVar = (r2f) this.c;
                        y11Var.j = null;
                        y11Var.k = f21Var2;
                        y11Var.n = 2;
                        if (saf.C(r2fVar, y11Var) == nm6Var) {
                            f21Var = f21Var2;
                            b21Var.g.l(f21Var);
                        }
                    }
                }
                y11Var = new y11(this, continuation);
                Object obj32 = y11Var.l;
                nm6Var = nm6.a;
                i2 = y11Var.n;
                if (i2 == 0) {
                }
                lnu lnuVar2 = (lnu) obj32;
                wbb wbbVar2 = (wbb) ((jyr) b21Var.b.e).getValue();
                c01 c01Var2 = b21Var.a;
                String str22 = ((c21) ((jyr) b21Var.b.i).getValue()).b;
                wbbVar2.getClass();
                c01Var2.getClass();
                String w2 = vz1.w(c01Var2.k);
                xbb xbbVar2 = new xbb(w2, c01Var2.b, str22, (jzb) c01Var2.u.getValue(), new rab(c01Var2.b, str22 != null ? "" : str22, null, w2, (jzb) c01Var2.u.getValue(), false, c01Var2.p), wbb.a(w2, lnuVar2, elu.d), new q91(c01Var2.b, w2, c01Var2.p), null, qo6.d);
                b01 b01Var2 = b21Var.a.f;
                if (b01Var2 != null) {
                }
                List list62 = list3;
                ArrayList arrayList42 = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList52 = new ArrayList();
                while (r1.hasNext()) {
                }
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                f21 f21Var22 = new f21(xbbVar2, obj4, lnuVar2, arrayList42, arrayList52, ((ulu) ((byb) qdcVar2.C(I2)).c(ern.a(ulu.class))).h());
                r2fVar = (r2f) this.c;
                y11Var.j = null;
                y11Var.k = f21Var22;
                y11Var.n = 2;
                if (saf.C(r2fVar, y11Var) == nm6Var) {
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (defpackage.fk0.c(r2, r3, null, null, r6, 14) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (defpackage.fk0.c(r2, r3, null, null, r6, 14) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(boolean z, Continuation continuation) {
        ct4 ct4Var;
        int i;
        aqi aqiVar = (aqi) this.b;
        if (continuation instanceof ct4) {
            ct4Var = (ct4) continuation;
            int i2 = ct4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ct4Var.l = i2 - Integer.MIN_VALUE;
                ct4 ct4Var2 = ct4Var;
                Object obj = ct4Var2.j;
                nm6 nm6Var = nm6.a;
                i = ct4Var2.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    aqiVar.setValue(Boolean.FALSE);
                    return Unit.a;
                }
                qgg.h0(obj);
                if (z) {
                    aqiVar.setValue(Boolean.TRUE);
                    fk0 fk0Var = (fk0) this.c;
                    Float f = new Float(1.0f);
                    ct4Var2.l = 1;
                } else {
                    fk0 fk0Var2 = (fk0) this.c;
                    Float f2 = new Float(0.0f);
                    ct4Var2.l = 2;
                }
                return nm6Var;
            }
        }
        ct4Var = new ct4(this, continuation);
        ct4 ct4Var22 = ct4Var;
        Object obj2 = ct4Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = ct4Var22.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02f1, code lost:
    
        if (r2.emit(r4, r11) == r8) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x07ac, code lost:
    
        if (r0.emit(r2, r3) != r4) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0841, code lost:
    
        if (r2.emit(r0, r3) == r4) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x082a, code lost:
    
        if (r5 == r4) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x08a5, code lost:
    
        if (r0.emit(r2, r3) != r4) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x09aa, code lost:
    
        if (r0.emit(r2, r3) != r4) goto L537;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [rjc] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        l11 l11Var;
        int i;
        r81 r81Var;
        int i2;
        d91 c91Var;
        jz1 jz1Var;
        int i3;
        rjc rjcVar;
        h22 h22Var;
        int i4;
        Boolean bool;
        n22 n22Var;
        int i5;
        rjc rjcVar2;
        h62 h62Var;
        int i6;
        rjc rjcVar3;
        Object c;
        jg2 jg2Var;
        int i7;
        rjc rjcVar4;
        wm2 wm2Var;
        int i8;
        mp2 mp2Var;
        int i9;
        fx2 fx2Var;
        int i10;
        hf3 hf3Var;
        int i11;
        Pair pair;
        Object value;
        String string;
        h34 h34Var;
        int i12;
        c54 c54Var;
        int i13;
        ?? o0;
        bk4 bk4Var;
        int i14;
        CastDevice d;
        Object obj2;
        mk4 mk4Var;
        int i15;
        z55 z55Var;
        int i16;
        rjc rjcVar5;
        ArrayList arrayList;
        rjc rjcVar6;
        ArrayList<Pair> arrayList2;
        rj6 rj6Var;
        Iterable iterable;
        x1u x1uVar;
        lg5 lg5Var;
        int i17;
        qmu qmuVar;
        Function0 function0;
        Unit unit;
        Object obj3 = obj;
        int i18 = 14;
        int i19 = 0;
        r7 = 0;
        int i20 = 0;
        r7 = false;
        boolean z = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        r10 = null;
        mm6 mm6Var = null;
        r10 = null;
        r10 = null;
        kk4 kk4Var = null;
        f24 f24Var = null;
        switch (this.a) {
            case 0:
                return b((List) obj3, continuation);
            case 1:
                if (continuation instanceof l11) {
                    l11Var = (l11) continuation;
                    int i24 = l11Var.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        l11Var.k = i24 - Integer.MIN_VALUE;
                        Object obj4 = l11Var.j;
                        nm6 nm6Var = nm6.a;
                        i = l11Var.k;
                        if (i != 0) {
                            qgg.h0(obj4);
                            rjc rjcVar7 = (rjc) this.b;
                            v3k E = wxf.E((v3k) obj3, new v3((m11) this.c, (Continuation) r10, 9));
                            l11Var.k = 1;
                            if (rjcVar7.emit(E, l11Var) == nm6Var) {
                                return nm6Var;
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
                l11Var = new l11(this, continuation);
                Object obj42 = l11Var.j;
                nm6 nm6Var2 = nm6.a;
                i = l11Var.k;
                if (i != 0) {
                }
                return Unit.a;
            case 2:
                return b((List) obj3, continuation);
            case 3:
                if (continuation instanceof r81) {
                    r81Var = (r81) continuation;
                    int i25 = r81Var.k;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        r81Var.k = i25 - Integer.MIN_VALUE;
                        Object obj5 = r81Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = r81Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj5);
                            rjc rjcVar8 = (rjc) this.b;
                            Pair pair2 = (Pair) obj3;
                            g81 g81Var = (g81) pair2.a;
                            e73 e73Var = (e73) pair2.b;
                            le3 le3Var = ((x81) this.c).h;
                            le3Var.getClass();
                            o8q o8qVar = (o8q) le3Var.b;
                            g81Var.getClass();
                            if (g81Var.h) {
                                c91Var = new b91(false);
                            } else {
                                String str = ((f81) le3Var.a).d;
                                int i26 = g81Var.e;
                                String b = i26 <= 0 ? null : o8qVar.a.b(R.plurals.artist_familiar_tracks, i26, Arrays.copyOf(new Object[]{Integer.valueOf(i26)}, 1));
                                int i27 = g81Var.f;
                                c91Var = new c91(str, CollectionsKt.X(xz0.w(new String[]{b, i27 > 0 ? o8qVar.a.b(R.plurals.artist_familiar_albums, i27, Arrays.copyOf(new Object[]{Integer.valueOf(i27)}, 1)) : 0}), " • ", null, null, null, 62), g81Var.a > 0 ? j81.a : j81.b);
                            }
                            o81 o81Var = new o81(g81Var, c91Var, e73Var);
                            r81Var.k = 1;
                            if (rjcVar8.emit(o81Var, r81Var) == nm6Var3) {
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
                r81Var = new r81(this, continuation);
                Object obj52 = r81Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = r81Var.k;
                if (i2 != 0) {
                }
                return Unit.a;
            case 4:
                o81 o81Var2 = (o81) obj3;
                x81 x81Var = (x81) this.c;
                tqn tqnVar = (tqn) this.b;
                if (!tqnVar.a) {
                    tqnVar.a = true;
                    rmb rmbVar = x81Var.g;
                    g81 g81Var2 = o81Var2.a;
                    int i28 = g81Var2.g;
                    p43 p43Var = g81Var2.d;
                    rmbVar.g(i28, p43Var != null ? p43Var.a : null);
                }
                x81Var.n.l(o81Var2);
                return Unit.a;
            case 5:
                wn1 wn1Var = (wn1) this.b;
                wn1Var.j.l((bn1) obj3);
                Object emit = ((rjc) this.c).emit(new d73(wn1Var.d), continuation);
                return emit == nm6.a ? emit : Unit.a;
            case 6:
                if (continuation instanceof jz1) {
                    jz1Var = (jz1) continuation;
                    int i29 = jz1Var.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        jz1Var.k = i29 - Integer.MIN_VALUE;
                        Object obj6 = jz1Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = jz1Var.k;
                        Continuation continuation2 = null;
                        if (i3 != 0) {
                            qgg.h0(obj6);
                            rjc rjcVar9 = (rjc) this.b;
                            iw4 iw4Var = (iw4) obj3;
                            kz1 kz1Var = (kz1) this.c;
                            List list = iw4Var.a;
                            List list2 = iw4Var.b;
                            jz1Var.m = rjcVar9;
                            jz1Var.n = 0;
                            jz1Var.k = 1;
                            Object V = x97.V(dm6.b, new n71(kz1Var, list, list2, continuation2, 1), jz1Var);
                            if (V != nm6Var4) {
                                obj6 = V;
                                rjcVar = rjcVar9;
                            }
                            return nm6Var4;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                qgg.h0(obj6);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i19 = jz1Var.n;
                        rjcVar = jz1Var.m;
                        qgg.h0(obj6);
                        jz1Var.m = null;
                        jz1Var.n = i19;
                        jz1Var.k = 2;
                        break;
                    }
                }
                jz1Var = new jz1(this, continuation);
                Object obj62 = jz1Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = jz1Var.k;
                Continuation continuation22 = null;
                if (i3 != 0) {
                }
                jz1Var.m = null;
                jz1Var.n = i19;
                jz1Var.k = 2;
            case 7:
                if (continuation instanceof h22) {
                    h22Var = (h22) continuation;
                    int i30 = h22Var.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        h22Var.k = i30 - Integer.MIN_VALUE;
                        Object obj7 = h22Var.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = h22Var.k;
                        if (i4 != 0) {
                            qgg.h0(obj7);
                            rjc rjcVar10 = (rjc) this.b;
                            hmm hmmVar = (hmm) obj3;
                            Long l = (Long) hmmVar.a(j22.c);
                            if (l != null) {
                                long longValue = l.longValue();
                                Integer num = (Integer) hmmVar.a(j22.d);
                                int intValue = num != null ? num.intValue() : 0;
                                List list3 = j22.e;
                                int i31 = intValue - 1;
                                if (i31 < 0) {
                                    i31 = 0;
                                }
                                bool = Boolean.valueOf(((j22) this.c).a.b() - longValue >= TimeUnit.DAYS.toMillis((long) ((Number) list3.get(i31 % list3.size())).intValue()));
                            } else {
                                bool = Boolean.TRUE;
                            }
                            h22Var.k = 1;
                            if (rjcVar10.emit(bool, h22Var) == nm6Var5) {
                                return nm6Var5;
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
                h22Var = new h22(this, continuation);
                Object obj72 = h22Var.j;
                nm6 nm6Var52 = nm6.a;
                i4 = h22Var.k;
                if (i4 != 0) {
                }
                return Unit.a;
            case 8:
                if (continuation instanceof n22) {
                    n22Var = (n22) continuation;
                    int i32 = n22Var.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        n22Var.k = i32 - Integer.MIN_VALUE;
                        Object obj8 = n22Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = n22Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar11 = (rjc) this.b;
                            z22 z22Var = (z22) this.c;
                            n22Var.m = rjcVar11;
                            n22Var.n = 0;
                            n22Var.k = 1;
                            Object b2 = z22Var.b(n22Var);
                            if (b2 != nm6Var6) {
                                obj8 = b2;
                                rjcVar2 = rjcVar11;
                            }
                            return nm6Var6;
                        }
                        if (i5 != 1) {
                            if (i5 == 2) {
                                qgg.h0(obj8);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i23 = n22Var.n;
                        rjcVar2 = n22Var.m;
                        qgg.h0(obj8);
                        n22Var.m = null;
                        n22Var.n = i23;
                        n22Var.k = 2;
                        break;
                    }
                }
                n22Var = new n22(this, continuation);
                Object obj82 = n22Var.j;
                nm6 nm6Var62 = nm6.a;
                i5 = n22Var.k;
                if (i5 != 0) {
                }
                n22Var.m = null;
                n22Var.n = i23;
                n22Var.k = 2;
            case 9:
                if (continuation instanceof h62) {
                    h62Var = (h62) continuation;
                    int i33 = h62Var.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        h62Var.k = i33 - Integer.MIN_VALUE;
                        Object obj9 = h62Var.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = h62Var.k;
                        if (i6 != 0) {
                            qgg.h0(obj9);
                            rjcVar3 = (rjc) this.b;
                            o62 o62Var = (o62) this.c;
                            h62Var.m = obj3;
                            h62Var.n = rjcVar3;
                            h62Var.o = 0;
                            h62Var.k = 1;
                            c = o62.c(o62Var, (mqs) obj3, h62Var);
                            break;
                        } else {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    qgg.h0(obj9);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i22 = h62Var.o;
                            rjc rjcVar12 = h62Var.n;
                            Object obj10 = h62Var.m;
                            qgg.h0(obj9);
                            rjcVar3 = rjcVar12;
                            obj3 = obj10;
                            c = obj9;
                        }
                        if (((Boolean) c).booleanValue()) {
                            h62Var.m = null;
                            h62Var.n = null;
                            h62Var.o = i22;
                            h62Var.k = 2;
                            break;
                        }
                        return Unit.a;
                    }
                }
                h62Var = new h62(this, continuation);
                Object obj92 = h62Var.j;
                nm6 nm6Var72 = nm6.a;
                i6 = h62Var.k;
                if (i6 != 0) {
                }
                if (((Boolean) c).booleanValue()) {
                }
                return Unit.a;
            case 10:
                ((Boolean) obj3).booleanValue();
                fvf fvfVar = (fvf) this.b;
                fvf fvfVar2 = (fvf) this.c;
                Object m = fvfVar.m(fvfVar2.h(), fvfVar2.i(), continuation);
                return m == nm6.a ? m : Unit.a;
            case 11:
                if (continuation instanceof jg2) {
                    jg2Var = (jg2) continuation;
                    int i34 = jg2Var.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        jg2Var.k = i34 - Integer.MIN_VALUE;
                        Object obj11 = jg2Var.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = jg2Var.k;
                        if (i7 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar13 = (rjc) this.b;
                            av0 av0Var = (av0) ((kg2) this.c).a.getValue();
                            jg2Var.m = rjcVar13;
                            jg2Var.n = 0;
                            jg2Var.k = 1;
                            Object c2 = ((iv0) av0Var).b.c(jg2Var);
                            if (c2 != nm6Var8) {
                                obj11 = c2;
                                rjcVar4 = rjcVar13;
                            }
                            return nm6Var8;
                        }
                        if (i7 != 1) {
                            if (i7 == 2) {
                                qgg.h0(obj11);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i21 = jg2Var.n;
                        rjcVar4 = jg2Var.m;
                        qgg.h0(obj11);
                        f fVar = (f) obj11;
                        String str2 = fVar == null ? fVar.d : null;
                        jg2Var.m = null;
                        jg2Var.n = i21;
                        jg2Var.k = 2;
                        break;
                    }
                }
                jg2Var = new jg2(this, continuation);
                Object obj112 = jg2Var.j;
                nm6 nm6Var82 = nm6.a;
                i7 = jg2Var.k;
                if (i7 != 0) {
                }
                f fVar2 = (f) obj112;
                if (fVar2 == null) {
                }
                jg2Var.m = null;
                jg2Var.n = i21;
                jg2Var.k = 2;
            case 12:
                if (continuation instanceof wm2) {
                    wm2Var = (wm2) continuation;
                    int i35 = wm2Var.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        wm2Var.k = i35 - Integer.MIN_VALUE;
                        Object obj12 = wm2Var.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = wm2Var.k;
                        if (i8 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar14 = (rjc) this.b;
                            pn2 pn2Var = ((Boolean) ((xm2) this.c).a.invoke()).booleanValue() ? (pn2) obj3 : null;
                            if (pn2Var == null) {
                                pn2Var = on2.a;
                            }
                            wm2Var.k = 1;
                            if (rjcVar14.emit(pn2Var, wm2Var) == nm6Var9) {
                                return nm6Var9;
                            }
                        } else {
                            if (i8 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj12);
                        }
                        return Unit.a;
                    }
                }
                wm2Var = new wm2(this, continuation);
                Object obj122 = wm2Var.j;
                nm6 nm6Var92 = nm6.a;
                i8 = wm2Var.k;
                if (i8 != 0) {
                }
                return Unit.a;
            case 13:
                if (continuation instanceof mp2) {
                    mp2Var = (mp2) continuation;
                    int i36 = mp2Var.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        mp2Var.k = i36 - Integer.MIN_VALUE;
                        Object obj13 = mp2Var.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = mp2Var.k;
                        if (i9 != 0) {
                            qgg.h0(obj13);
                            rjc rjcVar15 = (rjc) this.b;
                            ((Boolean) obj3).getClass();
                            Boolean valueOf = Boolean.valueOf(((yxc) this.c).d);
                            mp2Var.k = 1;
                            if (rjcVar15.emit(valueOf, mp2Var) == nm6Var10) {
                                return nm6Var10;
                            }
                        } else {
                            if (i9 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj13);
                        }
                        return Unit.a;
                    }
                }
                mp2Var = new mp2(this, continuation);
                Object obj132 = mp2Var.j;
                nm6 nm6Var102 = nm6.a;
                i9 = mp2Var.k;
                if (i9 != 0) {
                }
                return Unit.a;
            case 14:
                if (continuation instanceof fx2) {
                    fx2Var = (fx2) continuation;
                    int i37 = fx2Var.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        fx2Var.k = i37 - Integer.MIN_VALUE;
                        Object obj14 = fx2Var.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = fx2Var.k;
                        if (i10 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar16 = (rjc) this.b;
                            Long l2 = (Long) ((hmm) obj3).a(((lx2) this.c).f);
                            Long l3 = new Long(l2 != null ? l2.longValue() : 0L);
                            fx2Var.k = 1;
                            if (rjcVar16.emit(l3, fx2Var) == nm6Var11) {
                                return nm6Var11;
                            }
                        } else {
                            if (i10 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj14);
                        }
                        return Unit.a;
                    }
                }
                fx2Var = new fx2(this, continuation);
                Object obj142 = fx2Var.j;
                nm6 nm6Var112 = nm6.a;
                i10 = fx2Var.k;
                if (i10 != 0) {
                }
                return Unit.a;
            case 15:
                Object obj15 = ete.a;
                if (continuation instanceof hf3) {
                    hf3Var = (hf3) continuation;
                    int i38 = hf3Var.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        hf3Var.k = i38 - Integer.MIN_VALUE;
                        Object obj16 = hf3Var.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = hf3Var.k;
                        if (i11 != 0) {
                            qgg.h0(obj16);
                            rjc rjcVar17 = (rjc) this.b;
                            int ordinal = ((ff3) obj3).ordinal();
                            if (ordinal == 0) {
                                obj15 = gte.a;
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                hql hqlVar = (hql) this.c;
                                int i39 = hqlVar == null ? -1 : gf3.a[hqlVar.ordinal()];
                                if (i39 != -1) {
                                    if (i39 == 1) {
                                        obj15 = fte.a;
                                    } else if (i39 != 2) {
                                        b6e.s();
                                        return null;
                                    }
                                }
                            }
                            hf3Var.k = 1;
                            if (rjcVar17.emit(obj15, hf3Var) == nm6Var12) {
                                return nm6Var12;
                            }
                        } else {
                            if (i11 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj16);
                        }
                        return Unit.a;
                    }
                }
                hf3Var = new hf3(this, continuation);
                Object obj162 = hf3Var.j;
                nm6 nm6Var122 = nm6.a;
                i11 = hf3Var.k;
                if (i11 != 0) {
                }
                return Unit.a;
            case 16:
                byc bycVar = (byc) obj3;
                mk3 mk3Var = (mk3) this.b;
                if (bycVar instanceof zxc) {
                    yxc yxcVar = ((zxc) bycVar).a;
                    if (yxcVar != null) {
                        pair = new Pair(Boolean.valueOf(yxcVar.a.d), Boolean.valueOf(yxcVar.d));
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        pair = new Pair(bool2, bool2);
                    }
                } else {
                    if (!Intrinsics.d(bycVar, ayc.a)) {
                        b6e.s();
                        return null;
                    }
                    Boolean bool3 = Boolean.FALSE;
                    pair = new Pair(bool3, bool3);
                }
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                xdr xdrVar = mk3Var.l;
                Resources resources = (Resources) this.c;
                do {
                    value = xdrVar.getValue();
                    kk3 kk3Var = (kk3) value;
                    string = resources.getString(booleanValue ? R.string.change_user : R.string.authorize_btn);
                    string.getClass();
                    kk3Var.getClass();
                } while (!xdrVar.k(value, new kk3(string)));
                if (booleanValue2) {
                    t tVar = (t) mk3Var.k.b;
                    lhs lhsVar = MainScreenActivity.Q0;
                    tVar.startActivity(imp.J(tVar, null, null, null, 14));
                    tVar.finish();
                }
                return Unit.a;
            case 17:
                v3w.l("handling action: ", ((Intent) obj3).getAction(), 3, null, null);
                gos gosVar = gos.i;
                synchronized (gosVar) {
                    gos.j = false;
                }
                gosVar.w((Context) this.b);
                ((fq3) this.c).a();
                return Unit.a;
            case 18:
                if (continuation instanceof h34) {
                    h34Var = (h34) continuation;
                    int i40 = h34Var.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        h34Var.k = i40 - Integer.MIN_VALUE;
                        Object obj17 = h34Var.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = h34Var.k;
                        if (i12 != 0) {
                            qgg.h0(obj17);
                            rjc rjcVar18 = (rjc) this.b;
                            c3g c3gVar = (c3g) obj3;
                            ((j34) this.c).getClass();
                            if (c3gVar.b) {
                                f24Var = f24.g;
                            } else {
                                switch (c3gVar.a.ordinal()) {
                                    case 0:
                                        f24Var = f24.e;
                                        break;
                                    case 1:
                                        f24Var = f24.i;
                                        break;
                                    case 2:
                                        f24Var = f24.h;
                                        break;
                                    case 3:
                                        f24Var = f24.j;
                                        break;
                                    case 4:
                                    case 8:
                                        break;
                                    case 5:
                                        f24Var = f24.f;
                                        break;
                                    case 6:
                                        f24Var = f24.i;
                                        break;
                                    case 7:
                                        f24Var = f24.h;
                                        break;
                                    case 9:
                                        f24Var = f24.e;
                                        break;
                                    default:
                                        b6e.s();
                                        return null;
                                }
                            }
                            if (f24Var != null) {
                                h34Var.k = 1;
                                if (rjcVar18.emit(f24Var, h34Var) == nm6Var13) {
                                    return nm6Var13;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj17);
                        }
                        return Unit.a;
                    }
                }
                h34Var = new h34(this, continuation);
                Object obj172 = h34Var.j;
                nm6 nm6Var132 = nm6.a;
                i12 = h34Var.k;
                if (i12 != 0) {
                }
                return Unit.a;
            case 19:
                if (continuation instanceof c54) {
                    c54Var = (c54) continuation;
                    int i41 = c54Var.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        c54Var.k = i41 - Integer.MIN_VALUE;
                        Object obj18 = c54Var.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = c54Var.k;
                        if (i13 != 0) {
                            qgg.h0(obj18);
                            ?? r2 = (rjc) this.b;
                            e44 e44Var = (e44) obj3;
                            y8p y8pVar = ((d54) this.c).i;
                            ArrayList z2 = y7g.z((o34) y8pVar.b);
                            if (e44Var == null) {
                                o0 = new ArrayList(v75.o(z2, 10));
                                Iterator it = z2.iterator();
                                while (it.hasNext()) {
                                    o0.add(y8pVar.a((f24) it.next(), null));
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList(v75.o(z2, 10));
                                Iterator it2 = z2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(y8pVar.a((f24) it2.next(), e44Var));
                                }
                                o0 = CollectionsKt.o0(arrayList3, new eh(i18, e44Var));
                            }
                            c54Var.k = 1;
                            if (r2.emit(o0, c54Var) == nm6Var14) {
                                return nm6Var14;
                            }
                        } else {
                            if (i13 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj18);
                        }
                        return Unit.a;
                    }
                }
                c54Var = new c54(this, continuation);
                Object obj182 = c54Var.j;
                nm6 nm6Var142 = nm6.a;
                i13 = c54Var.k;
                if (i13 != 0) {
                }
                return Unit.a;
            case 20:
                if (continuation instanceof bk4) {
                    bk4Var = (bk4) continuation;
                    int i42 = bk4Var.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        bk4Var.k = i42 - Integer.MIN_VALUE;
                        Object obj19 = bk4Var.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = bk4Var.k;
                        if (i14 != 0) {
                            qgg.h0(obj19);
                            rjc rjcVar19 = (rjc) this.b;
                            p84 p84Var = (p84) obj3;
                            if (p84Var != null && (d = p84Var.d()) != null) {
                                String d2 = d.d();
                                dk4 dk4Var = (dk4) this.c;
                                dk4Var.getClass();
                                jk4 c3 = dk4Var.c();
                                c3.getClass();
                                Iterator it3 = ((Iterable) c3.f.getValue()).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = it3.next();
                                        String str3 = ((irh) obj2).c;
                                        str3.getClass();
                                        if (StringsKt.M(str3, d2, false)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                irh irhVar = (irh) obj2;
                                if (irhVar != null) {
                                    kk4Var = jk4.b(irhVar);
                                }
                            }
                            bk4Var.k = 1;
                            if (rjcVar19.emit(kk4Var, bk4Var) == nm6Var15) {
                                return nm6Var15;
                            }
                        } else {
                            if (i14 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj19);
                        }
                        return Unit.a;
                    }
                }
                bk4Var = new bk4(this, continuation);
                Object obj192 = bk4Var.j;
                nm6 nm6Var152 = nm6.a;
                i14 = bk4Var.k;
                if (i14 != 0) {
                }
                return Unit.a;
            case 21:
                if (continuation instanceof mk4) {
                    mk4Var = (mk4) continuation;
                    int i43 = mk4Var.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mk4Var.k = i43 - Integer.MIN_VALUE;
                        Object obj20 = mk4Var.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = mk4Var.k;
                        if (i15 != 0) {
                            qgg.h0(obj20);
                            rjc rjcVar20 = (rjc) this.b;
                            nk4 nk4Var = (nk4) this.c;
                            if (((x66) obj3).a && ((zzi) ((z66) nk4Var.a.getValue()).d().getValue()).b == yzi.a) {
                                z = true;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z);
                            mk4Var.k = 1;
                            if (rjcVar20.emit(valueOf2, mk4Var) == nm6Var16) {
                                return nm6Var16;
                            }
                        } else {
                            if (i15 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj20);
                        }
                        return Unit.a;
                    }
                }
                mk4Var = new mk4(this, continuation);
                Object obj202 = mk4Var.j;
                nm6 nm6Var162 = nm6.a;
                i15 = mk4Var.k;
                if (i15 != 0) {
                }
                return Unit.a;
            case 22:
                ((vn4) this.b).e(obj3);
                Object E2 = ((jtc) this.c).E(continuation);
                return E2 == nm6.a ? E2 : Unit.a;
            case 23:
                return c(((Boolean) obj3).booleanValue(), continuation);
            case 24:
                a65 a65Var = (a65) this.c;
                e0h e0hVar = a65Var.d;
                if (continuation instanceof z55) {
                    z55Var = (z55) continuation;
                    int i44 = z55Var.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        z55Var.k = i44 - Integer.MIN_VALUE;
                        Object obj21 = z55Var.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = z55Var.k;
                        if (i16 != 0) {
                            qgg.h0(obj21);
                            rjcVar5 = (rjc) this.b;
                            List<String> q0 = CollectionsKt.q0((List) obj3, 6);
                            ArrayList arrayList4 = new ArrayList(v75.o(q0, 10));
                            for (String str4 : q0) {
                                arrayList4.add(new Pair(str4, e0hVar.get(str4)));
                            }
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                if (((x1u) ((Pair) next).b) == null) {
                                    arrayList5.add(next);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                            Iterator it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add((String) ((Pair) it5.next()).a);
                            }
                            if (!arrayList6.isEmpty()) {
                                b8u b8uVar = a65Var.c;
                                z55Var.m = rjcVar5;
                                z55Var.n = arrayList4;
                                z55Var.o = 0;
                                z55Var.k = 1;
                                Object b3 = b8uVar.b(arrayList6, z55Var);
                                if (b3 != nm6Var17) {
                                    rjcVar6 = rjcVar5;
                                    obj21 = b3;
                                    arrayList2 = arrayList4;
                                }
                                return nm6Var17;
                            }
                            arrayList = new ArrayList();
                            Iterator it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                x1u x1uVar2 = (x1u) ((Pair) it6.next()).b;
                                if (x1uVar2 != null) {
                                    arrayList.add(x1uVar2);
                                }
                            }
                            z55Var.m = null;
                            z55Var.n = null;
                            z55Var.o = i20;
                            z55Var.k = 2;
                            break;
                        } else {
                            if (i16 != 1) {
                                if (i16 == 2) {
                                    qgg.h0(obj21);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i20 = z55Var.o;
                            arrayList2 = z55Var.n;
                            rjcVar6 = z55Var.m;
                            qgg.h0(obj21);
                        }
                        rj6Var = (rj6) obj21;
                        if (!(rj6Var instanceof qj6)) {
                            Iterable<x1u> iterable2 = (Iterable) ((qj6) rj6Var).a;
                            for (x1u x1uVar3 : iterable2) {
                                e0hVar.put(x1uVar3.a, x1uVar3);
                            }
                            iterable = (List) iterable2;
                        } else {
                            if (!(rj6Var instanceof pj6)) {
                                b6e.s();
                                return null;
                            }
                            iterable = c5b.a;
                        }
                        arrayList = new ArrayList();
                        for (Pair pair3 : arrayList2) {
                            String str5 = (String) pair3.a;
                            x1u x1uVar4 = (x1u) pair3.b;
                            if (x1uVar4 == null) {
                                Iterator it7 = iterable.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        x1uVar = it7.next();
                                        if (Intrinsics.d(((x1u) x1uVar).a, str5)) {
                                        }
                                    } else {
                                        x1uVar = 0;
                                    }
                                }
                                x1uVar4 = x1uVar;
                            }
                            if (x1uVar4 != null) {
                                arrayList.add(x1uVar4);
                            }
                        }
                        rjcVar5 = rjcVar6;
                        z55Var.m = null;
                        z55Var.n = null;
                        z55Var.o = i20;
                        z55Var.k = 2;
                    }
                }
                z55Var = new z55(this, continuation);
                Object obj212 = z55Var.j;
                nm6 nm6Var172 = nm6.a;
                i16 = z55Var.k;
                if (i16 != 0) {
                }
                rj6Var = (rj6) obj212;
                if (!(rj6Var instanceof qj6)) {
                }
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                }
                rjcVar5 = rjcVar6;
                z55Var.m = null;
                z55Var.n = null;
                z55Var.o = i20;
                z55Var.k = 2;
            case 25:
                if (continuation instanceof lg5) {
                    lg5Var = (lg5) continuation;
                    int i45 = lg5Var.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        lg5Var.k = i45 - Integer.MIN_VALUE;
                        Object obj22 = lg5Var.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = lg5Var.k;
                        if (i17 != 0) {
                            qgg.h0(obj22);
                            rjc rjcVar21 = (rjc) this.b;
                            lwu lwuVar = (lwu) obj3;
                            s9p s9pVar = (s9p) this.c;
                            lwuVar.getClass();
                            if (lwuVar.equals(hwu.a)) {
                                qmuVar = qmu.a;
                            } else {
                                if (!(lwuVar instanceof jwu)) {
                                    b6e.s();
                                    return null;
                                }
                                jwu jwuVar = (jwu) lwuVar;
                                if (!s9pVar.b(jwuVar.a().a)) {
                                    qmuVar = qmu.a;
                                } else if (jwuVar instanceof zvu) {
                                    qmuVar = qmu.b;
                                } else if (jwuVar instanceof dwu) {
                                    qmuVar = qmu.d;
                                } else if (jwuVar instanceof ewu) {
                                    qmuVar = qmu.c;
                                } else {
                                    if (!(jwuVar instanceof cwu)) {
                                        b6e.s();
                                        return null;
                                    }
                                    qmuVar = qmu.a;
                                }
                            }
                            lg5Var.k = 1;
                            if (rjcVar21.emit(qmuVar, lg5Var) == nm6Var18) {
                                return nm6Var18;
                            }
                        } else {
                            if (i17 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj22);
                        }
                        return Unit.a;
                    }
                }
                lg5Var = new lg5(this, continuation);
                Object obj222 = lg5Var.j;
                nm6 nm6Var182 = nm6.a;
                i17 = lg5Var.k;
                if (i17 != 0) {
                }
                return Unit.a;
            case 26:
                return d(obj, continuation);
            case 27:
                return e(obj, continuation);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return f(obj, continuation);
            default:
                Uri uri = (Uri) obj3;
                l37 l37Var = (l37) this.c;
                mm6 mm6Var2 = (mm6) this.b;
                if (((Intrinsics.d(uri.getHost(), "close") && Intrinsics.d(uri.getScheme(), "payment-sdk")) ? mm6Var2 : null) != null) {
                    ((tu2) l37Var.h.getValue()).K();
                }
                if (((Intrinsics.d(uri.getHost(), "back") && Intrinsics.d(uri.getScheme(), "payment-sdk")) ? mm6Var2 : null) != null) {
                    Function0 function02 = l37Var.o;
                    if (function02 != null) {
                        function02.invoke();
                    } else {
                        i37 i37Var = l37Var.g;
                        if (i37Var == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        m37 D = i37Var.D();
                        if (D == null) {
                            D = null;
                        }
                        if (D != null && !(D.m instanceof s9o)) {
                            l37Var.requireActivity().onBackPressed();
                        }
                    }
                }
                if (((Intrinsics.d(uri.getHost(), "primary_action") && Intrinsics.d(uri.getScheme(), "payment-sdk")) ? mm6Var2 : null) != null) {
                    Function0 function03 = l37Var.m;
                    if (function03 != null) {
                        function03.invoke();
                        unit = Unit.a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        i37 i37Var2 = l37Var.g;
                        if (i37Var2 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        i37Var2.finish();
                    }
                }
                if (Intrinsics.d(uri.getHost(), "secondary_action") && Intrinsics.d(uri.getScheme(), "payment-sdk")) {
                    mm6Var = mm6Var2;
                }
                if (mm6Var != null && (function0 = l37Var.n) != null) {
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
