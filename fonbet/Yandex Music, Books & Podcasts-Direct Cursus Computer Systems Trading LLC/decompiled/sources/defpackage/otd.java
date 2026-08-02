package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes5.dex */
public final class otd implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ otd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(vat vatVar, Continuation continuation) {
        k0h k0hVar;
        int i;
        q0h q0hVar = (q0h) this.b;
        xdr xdrVar = q0hVar.g;
        if (continuation instanceof k0h) {
            k0hVar = (k0h) continuation;
            int i2 = k0hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = k0hVar.k;
                nm6 nm6Var = nm6.a;
                i = k0hVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = (String) vatVar.a;
                    boolean booleanValue = ((Boolean) vatVar.b).booleanValue();
                    Boolean bool = (Boolean) vatVar.c;
                    boolean booleanValue2 = bool.booleanValue();
                    xdr xdrVar2 = (xdr) ((bqi) q0hVar.k.getValue());
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                    if (!((Boolean) q0hVar.b.invoke()).booleanValue() || !booleanValue || !booleanValue2) {
                        xdrVar.l(null);
                        return Unit.a;
                    }
                    k0hVar.j = xdrVar;
                    k0hVar.m = 1;
                    obj = q0h.b(q0hVar, str, k0hVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = k0hVar.j;
                    qgg.h0(obj);
                }
                xdrVar.l(obj);
                return Unit.a;
            }
        }
        k0hVar = new k0h(this, continuation);
        Object obj2 = k0hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = k0hVar.m;
        if (i != 0) {
        }
        xdrVar.l(obj2);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [rke] */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        mle mleVar;
        gle gleVar;
        gle gleVar2;
        int i = 4;
        int i2 = 1;
        Continuation continuation2 = null;
        continuation2 = null;
        switch (this.a) {
            case 0:
                if (((lyf) obj).compareTo(lyf.c) <= 0) {
                    ntd ntdVar = (ntd) this.b;
                    ftd ftdVar = ntdVar.o;
                    ftdVar.getClass();
                    xod b = ftdVar.b();
                    if (b != null) {
                        ((uod) men.t(ntdVar, es5.g)).a(b);
                    }
                    ftdVar.d.setValue(null);
                }
                return Unit.a;
            case 1:
                ivd ivdVar = (ivd) this.b;
                fud fudVar = ivdVar.g;
                if (fudVar != null) {
                    fudVar.d();
                }
                if (!(ivdVar.d() instanceof as1)) {
                    x97.y(ivdVar.b, null, null, new hvd(ivdVar, continuation2, 3), 3);
                }
                return Unit.a;
            case 2:
                ((e65) ((qdc) this.b).b).invoke();
                return Unit.a;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((cyd) this.b).c.setValue(bool);
                return Unit.a;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Context requireContext = ((h1e) this.b).requireContext();
                requireContext.getClass();
                jyr jyrVar = ogp.h;
                if (jyrVar == null || (gleVar2 = (gle) jyrVar.getValue()) == null || (mleVar = (mle) gleVar2.b.getValue()) == null) {
                    mleVar = mle.b;
                }
                kle b2 = booleanValue ? mleVar.b() : mleVar.e();
                b2.getClass();
                jyr jyrVar2 = ogp.h;
                if (jyrVar2 != null && (gleVar = (gle) jyrVar2.getValue()) != null) {
                    continuation2 = (rke) gleVar.a.getValue();
                }
                if (continuation2 != null) {
                    rke.a(requireContext).c(b2);
                }
                return Unit.a;
            case 5:
                tge tgeVar = (tge) this.b;
                ssg.a(4, null, "Requesting app update info", null);
                try {
                    ((tax) tgeVar.b.getValue()).a().addOnCompleteListener(new g3a(25, tgeVar));
                } catch (RemoteException e) {
                    ssg.a(6, null, "Failed to request app update info", e);
                }
                return Unit.a;
            case 6:
                fle fleVar = ((dle) this.b).b;
                Set set = fle.e;
                Object b3 = fleVar.b((lke) obj, true, continuation);
                return b3 == nm6.a ? b3 : Unit.a;
            case 7:
                List<evl> list = (List) obj;
                uu5 uu5Var = (uu5) this.b;
                ArrayList arrayList = (ArrayList) uu5Var.e;
                HashMap hashMap = (HashMap) uu5Var.f;
                if (arrayList.isEmpty()) {
                    u7f u7fVar = (u7f) uu5Var.k;
                    if (u7fVar != null) {
                        u7fVar.invoke(list);
                    }
                    arrayList.addAll(list);
                    for (evl evlVar : list) {
                        hashMap.put(evlVar.a.e(), Boolean.valueOf(evlVar.b));
                    }
                    w7f w7fVar = (w7f) uu5Var.j;
                    if (w7fVar != null) {
                        BottomSheetBehavior bottomSheetBehavior = ((x7f) w7fVar.a.a).k;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setDraggable(true);
                        }
                        ((View) w7fVar.d.a(w7f.f[0])).setVisibility(8);
                    }
                } else {
                    arrayList.clear();
                    arrayList.addAll(list);
                    for (evl evlVar2 : list) {
                        String e2 = evlVar2.a.e();
                        if (!((LinkedHashSet) uu5Var.g).contains(e2)) {
                            hashMap.put(e2, Boolean.valueOf(evlVar2.b));
                            w7f w7fVar2 = (w7f) uu5Var.j;
                            if (w7fVar2 != null) {
                                w7fVar2.a(evlVar2);
                            }
                        }
                    }
                }
                return Unit.a;
            case 8:
                List list2 = (List) obj;
                z8f z8fVar = (z8f) this.b;
                ArrayList arrayList2 = new ArrayList();
                eh ehVar = new eh();
                list2.getClass();
                arrayList2.addAll(list2);
                List o0 = CollectionsKt.o0(arrayList2, ehVar);
                ArrayList arrayList3 = new ArrayList(v75.o(o0, 10));
                Iterator it = o0.iterator();
                while (it.hasNext()) {
                    xe xeVar = (xe) it.next();
                    z8fVar.getClass();
                    xeVar.getClass();
                    xb5 xb5Var = xeVar.a;
                    pwl pwlVar = (pwl) z8fVar.o;
                    mqs mqsVar = (mqs) z8fVar.j;
                    dh dhVar = xeVar.b;
                    pwlVar.getClass();
                    mqsVar.getClass();
                    dhVar.getClass();
                    nmb nmbVar = pwlVar.b;
                    String str = mqsVar.a;
                    String str2 = mqsVar.c;
                    imb b4 = pwl.b(dhVar);
                    if (b4 != null) {
                        nmbVar.getClass();
                        str.getClass();
                        str2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("page_type", "object");
                        linkedHashMap.put("track_id", str);
                        linkedHashMap.put("track_name", str2);
                        dfi.p(i2, "action_type", b4.a, "_meta", linkedHashMap);
                        nmbVar.C("TrackActions.ActionButton.Showed", linkedHashMap);
                    }
                    arrayList3.add(new xb5(new zya(22, xb5Var, new zya(23, z8fVar, xeVar)), xb5Var.c, xb5Var.d, xb5Var.e, xb5Var.f, xb5Var.g, xb5Var.b, xb5Var.j ? Integer.valueOf(R.attr.iconDisabled) : xb5Var.h, xb5Var.i, xb5Var.j, xb5Var.k, xb5Var.l, xb5Var.m));
                    it = it;
                    i2 = 1;
                }
                z8fVar.c = arrayList3;
                p8f p8fVar = (p8f) z8fVar.e;
                if (p8fVar != null) {
                    p8fVar.e = arrayList3;
                    p8fVar.c();
                }
                return Unit.a;
            case 9:
                ((fdf) this.b).k.l((pdf) obj);
                return Unit.a;
            case 10:
                ((gdf) this.b).l.l((qdf) obj);
                return Unit.a;
            case 11:
                ((cff) this.b).k.l((nff) obj);
                return Unit.a;
            case 12:
                ((dff) this.b).k.l((off) obj);
                return Unit.a;
            case 13:
                xdr xdrVar = ((ggf) this.b).d;
                Boolean bool2 = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool2);
                return Unit.a;
            case 14:
                ((fhf) this.b).k.l((shf) obj);
                return Unit.a;
            case 15:
                ((ghf) this.b).k.l((thf) obj);
                return Unit.a;
            case 16:
                if (((j1g) obj) == j1g.a) {
                    ((l5v) this.b).f();
                }
                return Unit.a;
            case 17:
                rjf rjfVar = ((tjf) this.b).f;
                boolean z = ((lwu) obj) instanceof ewu;
                v3w.n(z, (xdr) rjfVar.m, null);
                l5v l5vVar = (l5v) rjfVar.f;
                if (l5vVar != null) {
                    l5vVar.setPlaying(z);
                }
                return Unit.a;
            case 18:
                xdr xdrVar2 = ((elf) this.b).v;
                Boolean bool3 = Boolean.FALSE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool3);
                return Unit.a;
            case 19:
                nmf nmfVar = (nmf) this.b;
                nmfVar.a.a.l(null);
                Object a = nmfVar.b.a((xxq) obj, continuation);
                return a == nm6.a ? a : Unit.a;
            case 20:
                ((lvf) this.b).e.setValue((mb5) obj);
                return Unit.a;
            case 21:
                zzf zzfVar = (zzf) this.b;
                if (((vzf) zzfVar.c.getValue()).a() == uzf.a) {
                    rar rarVar = zzfVar.d;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    qld.I(1000L, new v1e(26, zzfVar));
                }
                return Unit.a;
            case 22:
                qmg qmgVar = (qmg) this.b;
                synchronized (qmgVar.p) {
                    lmg lmgVar = lmg.a;
                    qmgVar.g = lmgVar;
                    qmgVar.h = lmgVar;
                    qmgVar.i = lmgVar;
                    qmgVar.j = lmgVar;
                }
                return Unit.a;
            case 23:
                return b((vat) obj, continuation);
            case 24:
                ((y1h) this.b).G();
                return Unit.a;
            case 25:
                ((e3h) this.b).i.l((f4h) obj);
                return Unit.a;
            case 26:
                obh.c = new Pair(new Float(((Number) obj).floatValue()), ((obh) this.b).a);
                return Unit.a;
            case 27:
                ((xdr) this.b).l((rnh) obj);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((xdr) ((j7i) this.b).k).l(((af5) obj).a);
                return Unit.a;
            default:
                MusicBrowserService musicBrowserService = (MusicBrowserService) this.b;
                for (String str3 : (Collection) obj) {
                    if (str3 == null) {
                        xq0.x("parentId cannot be null in notifyChildrenChanged");
                        return null;
                    }
                    dn9 dn9Var = musicBrowserService.a;
                    ((mhh) dn9Var.c).notifyChildrenChanged(str3);
                    ((bih) dn9Var.e).e.post(new e8h(i, dn9Var, str3));
                }
                return Unit.a;
        }
    }
}
