package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.y;
import com.bumptech.glide.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class aqd implements x7o, adu, y6a, vip, wc3 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public aqd(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = Collections.synchronizedMap(new LinkedHashMap());
                this.c = Collections.synchronizedMap(new LinkedHashMap());
                break;
            case 9:
                this.b = new AtomicReference();
                this.c = new xy0(0);
                break;
            case 12:
                this.b = new AtomicLong();
                this.c = new AtomicLong();
                break;
            case 27:
                x0q b = y0q.b(0, 1, oi3.b, 1);
                this.b = b;
                this.c = new dkn(b);
                break;
            default:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
        }
    }

    public static int l(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static aqd q(String... strArr) {
        try {
            pn3[] pn3VarArr = new pn3[strArr.length];
            hi3 hi3Var = new hi3();
            for (int i = 0; i < strArr.length; i++) {
                n7f.N(hi3Var, strArr[i]);
                hi3Var.readByte();
                pn3VarArr[i] = hi3Var.g0(hi3Var.b);
            }
            String[] strArr2 = (String[]) strArr.clone();
            int i2 = qwj.d;
            return new aqd(3, strArr2, s7g.y(pn3VarArr));
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }

    @Override // defpackage.vip
    public uip b(xip xipVar, s2i s2iVar) {
        lcg lcgVar;
        sgr i;
        njp njpVar = (njp) this.b;
        vip vipVar = (vip) this.c;
        a23 a23Var = (a23) njpVar;
        a23Var.getClass();
        b23 b23Var = (b23) xipVar.a.getAttributes().a.get(vwb.a);
        k3i k3iVar = xipVar.b;
        ConcurrentHashMap concurrentHashMap = b23Var.c;
        String str = k3iVar.c;
        boolean z = k3iVar.f;
        if (!z || (lcgVar = (lcg) concurrentHashMap.get(str)) == null) {
            n nVar = b23Var.b;
            int i2 = b23Var.a;
            rjp rjpVar = (rjp) nVar.b;
            cee ceeVar = (cee) rjpVar.b;
            Object obj = (c9p) rjpVar.a;
            Object obj2 = ceeVar.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            try {
                lcgVar = leu.S(((f9p) obj).a(i2));
            } catch (Exception e) {
                jde jdeVar = new jde();
                jdeVar.m(e);
                lcgVar = jdeVar;
            }
            if (z) {
                concurrentHashMap.putIfAbsent(str, lcgVar);
                lcgVar.a(new pv7(lcgVar, new nsh(b23Var, str, lcgVar), false, 9), e48.a);
            }
        }
        if (!lcgVar.isDone()) {
            akk akkVar = new akk();
            lcgVar.a(new pv7(lcgVar, new kkp(21, xipVar, akkVar, s2iVar, vipVar, false), false, 9), a23Var.a);
            return akkVar;
        }
        try {
            i = (sgr) leu.O(lcgVar);
        } catch (CancellationException | ExecutionException e2) {
            sgr h = sgr.n.h(e2);
            String message = e2.getMessage();
            i = message != null ? h.i(message) : h;
        }
        if (i.g()) {
            return vipVar.b(xipVar, s2iVar);
        }
        xipVar.a(i, new s2i());
        return new z13();
    }

    @Override // defpackage.y6a
    public void c(int i, boolean z) {
        g6p g6pVar = (g6p) this.b;
        z6p z6pVar = (z6p) this.c;
        g6pVar.f0(z6pVar.b, z6pVar.c, i, z);
    }

    @Override // defpackage.wc3
    public void d(az6 az6Var) {
        q6k.y((eu1) this.c, az6Var);
    }

    public LinkedHashMap e(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hmi hmiVar = (hmi) it.next();
            jji jjiVar = (jji) ((ConcurrentHashMap) this.c).get(hmiVar);
            if (jjiVar != null) {
                linkedHashMap.put(hmiVar, jjiVar);
            }
        }
        return linkedHashMap;
    }

    public void f() {
        View rootView = ((ViewGroup) ((hn5) this.b).findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) ((jyr) this.c).getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory g(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(StringUtils.COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public ffb h(xee xeeVar, j4x j4xVar) {
        iwe iweVar = (iwe) this.c;
        Map map = (Map) iweVar.b;
        if (xeeVar.equals(new hgb(408)) || xeeVar.equals(new hgb(503))) {
            return null;
        }
        if (!(xeeVar instanceof hgb)) {
            List list = (List) map.get(xeeVar);
            if (list != null) {
                return (ffb) CollectionsKt.S(list, j4xVar.b);
            }
            return null;
        }
        Map map2 = (Map) ((AtomicReference) iweVar.c).get();
        if (map2 != null) {
            List list2 = (List) map2.get(xeeVar);
            if (list2 != null) {
                return (ffb) CollectionsKt.S(list2, j4xVar.b);
            }
            return null;
        }
        List list3 = (List) map.get(xeeVar);
        if (list3 != null) {
            return (ffb) CollectionsKt.S(list3, j4xVar.b);
        }
        return null;
    }

    public kfh i() {
        return (kfh) ((x6k) this.c).getValue();
    }

    @Override // defpackage.wc3
    public void invoke() {
        ((Function1) q6k.F((eu1) this.c)).invoke(((Object[]) this.b)[0]);
    }

    public b1o j(Context context, a aVar, nyf nyfVar, y yVar, boolean z) {
        xut.a();
        xut.a();
        HashMap hashMap = (HashMap) this.b;
        b1o b1oVar = (b1o) hashMap.get(nyfVar);
        if (b1oVar != null) {
            return b1oVar;
        }
        xyf xyfVar = new xyf(nyfVar);
        ddl ddlVar = (ddl) this.c;
        l48 l48Var = new l48(this, yVar);
        ddlVar.getClass();
        b1o b1oVar2 = new b1o(aVar, xyfVar, l48Var, context);
        hashMap.put(nyfVar, b1oVar2);
        xyfVar.b(new hzf(this, nyfVar));
        if (z) {
            b1oVar2.b();
        }
        return b1oVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(n8g n8gVar, cg6 cg6Var) {
        oli oliVar;
        int i;
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        if (cg6Var instanceof oli) {
            oliVar = (oli) cg6Var;
            int i2 = oliVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oliVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oliVar.k;
                nm6 nm6Var = nm6.a;
                i = oliVar.m;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    for (Object obj2 : n8gVar) {
                        if (concurrentHashMap.get((hmi) obj2) == null) {
                            q.add(obj2);
                        }
                    }
                    if (q.isEmpty()) {
                        return new qj6(e(n8gVar));
                    }
                    nli nliVar = (nli) this.b;
                    oliVar.j = n8gVar;
                    oliVar.m = 1;
                    obj = nliVar.b(q, oliVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n8gVar = oliVar.j;
                    qgg.h0(obj);
                }
                rj6 rj6Var = (rj6) obj;
                z = rj6Var instanceof qj6;
                if (!z) {
                    for (Map.Entry entry : ((Map) ((qj6) rj6Var).a).entrySet()) {
                        concurrentHashMap.put((hmi) entry.getKey(), (jji) entry.getValue());
                    }
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                if (!z) {
                    return new qj6(e(n8gVar));
                }
                if (rj6Var instanceof pj6) {
                    return rj6Var;
                }
                b6e.s();
                return null;
            }
        }
        oliVar = new oli(this, cg6Var);
        Object obj3 = oliVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oliVar.m;
        if (i != 0) {
        }
        rj6 rj6Var2 = (rj6) obj3;
        z = rj6Var2 instanceof qj6;
        if (!z) {
        }
        if (!z) {
        }
    }

    public ViewGroup m() {
        return (ViewGroup) ((jyr) this.c).getValue();
    }

    public ukh n() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.a) this.b).a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new wkh(transportControls) : new ukh(transportControls);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 13:
                mgk mgkVar = (mgk) obj;
                mgkVar.getClass();
                jek jekVar = (jek) this.b;
                jekVar.f = mgkVar;
                jekVar.g = mgkVar.a;
                jekVar.h = true;
                ((x7o) this.c).onSuccess(mgkVar);
                break;
            default:
                en enVar = (en) obj;
                enVar.getClass();
                hpo hpoVar = (hpo) ((x3n) this.b).d;
                j5n j5nVar = new j5n(8, (e47) this.c, enVar);
                if (hpoVar.a) {
                    j5nVar.invoke();
                    break;
                }
                break;
        }
    }

    public void p() {
        ((SparseIntArray) this.b).clear();
    }

    public void r(xph xphVar) {
        if (xphVar == null) {
            xq0.x("callback must not be null");
            return;
        }
        if (!((Set) this.c).add(xphVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        xphVar.f(handler);
        android.support.v4.media.session.a aVar = (android.support.v4.media.session.a) this.b;
        aVar.a.registerCallback(xphVar.a, handler);
        synchronized (aVar.b) {
            if (aVar.e.d() != null) {
                nkh nkhVar = new nkh(xphVar);
                aVar.d.put(xphVar, nkhVar);
                xphVar.c = nkhVar;
                try {
                    aVar.e.d().x0(nkhVar);
                    xphVar.e(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                xphVar.c = null;
                aVar.c.add(xphVar);
            }
        }
    }

    public void s() {
        ViewParent parent = m().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(m());
        }
    }

    public void t(xph xphVar) {
        if (xphVar == null) {
            xq0.x("callback must not be null");
        } else {
            if (!((Set) this.c).remove(xphVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.a) this.b).b(xphVar);
            } finally {
                xphVar.f(null);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 19:
                String str = "[ ";
                if (((i3r) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = su4.m(((i3r) this.b).h[i], StringUtil.SPACE, dfi.k(str));
                    }
                }
                StringBuilder m = tlm.m(str, "] ");
                m.append((i3r) this.b);
                return m.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 13:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                ((x7o) this.c).x(bfkVar);
                break;
            default:
                bfk bfkVar2 = (bfk) obj;
                bfkVar2.getClass();
                hpo hpoVar = (hpo) ((x3n) this.b).d;
                j5n j5nVar = new j5n(7, (e47) this.c, bfkVar2);
                if (hpoVar.a) {
                    j5nVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wc3
    public void a() {
    }

    public /* synthetic */ aqd(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ aqd(ViewGroup viewGroup, View view, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = view2;
    }

    public aqd(String str, int[] iArr) {
        this.a = 11;
        str.getClass();
        this.b = str;
        this.c = iArr;
    }

    public aqd(nli nliVar) {
        this.a = 10;
        this.b = nliVar;
        this.c = new ConcurrentHashMap();
    }

    public aqd(Object[] objArr) {
        this.a = 26;
        this.b = objArr;
        this.c = new eu1(null);
    }

    public aqd(String str) {
        this.a = 16;
        Exception exc = new Exception();
        this.b = str;
        this.c = exc;
    }

    public aqd(q76 q76Var, iwe iweVar) {
        this.a = 22;
        q76Var.getClass();
        this.b = q76Var;
        this.c = iweVar;
    }

    public aqd(ddl ddlVar) {
        this.a = 4;
        this.b = new HashMap();
        this.c = ddlVar;
    }

    public aqd(mpf mpfVar, kfh kfhVar) {
        this.a = 2;
        this.b = mpfVar;
        this.c = szf.g0(kfhVar);
    }

    public aqd(m5d m5dVar) {
        this.a = 21;
        this.b = m5dVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new n5d(m5dVar, new int[]{1}));
    }

    public aqd(psm psmVar) {
        this.a = 19;
        this.c = psmVar;
    }

    public aqd(Context context) {
        this.a = 8;
        this.c = null;
        this.b = context;
    }

    public aqd(hn5 hn5Var) {
        this.a = 28;
        this.b = hn5Var;
        this.c = btf.b(new eyq(8, this));
    }

    public aqd(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 7;
        if (mediaSessionCompat$Token != null) {
            this.c = Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new qkh(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new android.support.v4.media.session.a(context, mediaSessionCompat$Token);
                return;
            }
        }
        xq0.x("sessionToken must not be null");
        throw null;
    }

    public aqd(njp njpVar, vip vipVar) {
        this.a = 25;
        o2g.O(njpVar, "interceptor");
        this.b = njpVar;
        this.c = vipVar;
    }

    public aqd(i8h i8hVar, beg begVar) {
        this.a = 6;
        this.c = i8hVar;
        this.b = begVar;
    }

    public /* synthetic */ aqd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
