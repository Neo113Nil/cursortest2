package S0;

import D1.C0297b;
import D1.C0299d;
import R2.InterfaceC0377c;
import R2.w;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0484x;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import androidx.fragment.app.C;
import androidx.fragment.app.N;
import androidx.work.impl.WorkDatabase_Impl;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.GzopStretegygamesActivity;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC2665Km;
import com.google.android.gms.internal.ads.AbstractC2979b4;
import com.google.android.gms.internal.ads.AbstractC2991bG;
import com.google.android.gms.internal.ads.AbstractC3066cl;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC2486Ad;
import com.google.android.gms.internal.ads.C2493Ak;
import com.google.android.gms.internal.ads.C2682Lm;
import com.google.android.gms.internal.ads.C2685Lp;
import com.google.android.gms.internal.ads.C2814Ti;
import com.google.android.gms.internal.ads.C2867Wl;
import com.google.android.gms.internal.ads.C3019br;
import com.google.android.gms.internal.ads.C3058cd;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3113de;
import com.google.android.gms.internal.ads.C3166ee;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3290gu;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.C3500kq;
import com.google.android.gms.internal.ads.C3558lu;
import com.google.android.gms.internal.ads.C4127wN;
import com.google.android.gms.internal.ads.C4206xv;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.CallableC3572m7;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.InterfaceC2728Oh;
import com.google.android.gms.internal.ads.InterfaceC2883Xl;
import com.google.android.gms.internal.ads.InterfaceC3544lg;
import com.google.android.gms.internal.ads.InterfaceC3598mg;
import com.google.android.gms.internal.ads.InterfaceC3765pl;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import com.google.android.gms.internal.ads.InterfaceC3891s3;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.PN;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.RunnableC3176eo;
import com.google.android.gms.internal.ads.RunnableC3996u0;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.U3;
import com.google.android.gms.internal.ads.U4;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.V3;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.W3;
import com.google.android.gms.internal.ads.WH;
import com.google.android.gms.internal.ads.YG;
import com.google.android.gms.internal.ads.Z8;
import com.google.android.gms.internal.ads.ZG;
import d2.InterfaceC4460b;
import i1.C4585b;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.C4741a;
import m2.v;
import n2.InterfaceC4769d;
import u0.C5060i;
import w2.z;
import x1.InterfaceC5183a;
import z2.AbstractC5224a;
import z2.InterfaceC5226c;

/* loaded from: classes.dex */
public final class e implements u1.k, C2.b, InterfaceC4460b, Y0.o, InterfaceC3891s3, InterfaceC0377c, InterfaceC5226c, KD, InterfaceC3765pl, InterfaceC2728Oh, InterfaceC2883Xl, YG {

    /* renamed from: w, reason: collision with root package name */
    public static e f2906w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2907n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2908u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2909v;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f2907n = i;
        this.f2908u = obj;
        this.f2909v = obj2;
    }

    public static final C4127wN G(C4127wN c4127wN, List list) {
        HashMap hashMap = new HashMap(c4127wN.f35600a);
        HashSet hashSet = new HashSet(list);
        for (String str : c4127wN.f35600a.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new C4127wN(hashMap);
    }

    public synchronized ArrayList A(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            List<K1.e> list = (List) ((HashMap) this.f2909v).get((String) it.next());
            if (list != null) {
                for (K1.e eVar : list) {
                    if ((eVar.f1675a.isAssignableFrom(cls) && cls2.isAssignableFrom(eVar.f1676b)) && !arrayList.contains(eVar.f1676b)) {
                        arrayList.add(eVar.f1676b);
                    }
                }
            }
        }
        return arrayList;
    }

    public void B(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2908u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2909v).q(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public /* synthetic */ void C(String str, int i, String str2, boolean z6) {
        C2682Lm c2682Lm = (C2682Lm) this.f2908u;
        c2682Lm.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) ((Map) this.f2909v).get("id"));
        c2682Lm.f26964b.d(hashMap);
    }

    public int D(Context context, P2.c cVar) {
        w.h(context);
        w.h(cVar);
        int i = cVar.i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2908u;
        int i4 = sparseIntArray.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        int i6 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= sparseIntArray.size()) {
                i6 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i9);
            if (keyAt > i && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i9++;
        }
        if (i6 == -1) {
            i6 = ((O2.f) this.f2909v).c(context, i);
        }
        sparseIntArray.put(i, i6);
        return i6;
    }

    public void E(Eu eu) {
        CallableC3572m7 callableC3572m7 = new CallableC3572m7(5, (C2685Lp) this.f2908u);
        C3383ig c3383ig = (C3383ig) ((RD) this.f2909v);
        P3.a b9 = c3383ig.b(callableC3572m7);
        b9.a(new LD(0, b9, new Ux(this, eu)), c3383ig);
    }

    public /* synthetic */ void F(C4127wN c4127wN) {
        for (Map.Entry entry : new HashMap((HashMap) this.f2908u).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!G(c4127wN, list).equals(G((C4127wN) this.f2909v, list))) {
                throw null;
            }
        }
        this.f2909v = c4127wN;
    }

    public Enum H(Object obj) {
        Enum r02 = (Enum) ((Map) this.f2909v).get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public void I(St st) {
        M("aai", st.f28431w);
        M("request_id", st.f28414n0);
        M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, St.a(st.f28391b));
    }

    public void J(Object obj, String str) {
        boolean commit;
        boolean z6 = obj instanceof String;
        String str2 = (String) this.f2908u;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2909v;
        if (z6) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String valueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", com.IceFishing.LiveIceFishing.k.r(new StringBuilder(valueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", valueOf, " for app ", str2));
                throw new IOException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            commit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        throw new IOException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public Object L(WH wh) {
        Object obj = ((Map) this.f2908u).get(wh);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(wh)));
    }

    public void M(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f2908u).put(str, str2);
    }

    public void N() {
        ((C3230fo) this.f2909v).f31216b.execute(new RunnableC3176eo(this, 1));
    }

    public x2.k O() {
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Of)).booleanValue();
        x2.k kVar = x2.k.f41872n;
        if (!booleanValue) {
            N();
            return kVar;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f2908u;
        C3391io c3391io = ((C3230fo) this.f2909v).f31215a;
        c3391io.getClass();
        if (concurrentHashMap.isEmpty()) {
            int i = z.f41712b;
            x2.i.a("Empty paramMap.");
            return kVar;
        }
        String a9 = c3391io.f31902f.a(concurrentHashMap);
        z.k(a9);
        return c3391io.f31900d.a(null, a9);
    }

    @Override // Y0.o
    public void OnCall() {
        ((GzopStretegygamesActivity) this.f2909v).startActivity((Intent) this.f2908u);
    }

    public void P() {
        ((C3230fo) this.f2909v).f31216b.execute(new RunnableC3176eo(this, 0));
    }

    public void Q(C3058cd c3058cd) {
        Handler handler = (Handler) this.f2908u;
        if (handler != null) {
            handler.post(new RunnableC3996u0(0, this, c3058cd));
        }
    }

    public void R(String str) {
        if (((SharedPreferences) this.f2909v).edit().remove(str).commit()) {
            return;
        }
        int length = str.length();
        String str2 = (String) this.f2908u;
        throw new IOException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(length + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        ((InterfaceC4769d) obj).f((String) this.f2908u, (String) this.f2909v);
    }

    @Override // u1.k
    public int b(u1.h hVar) {
        return 2;
    }

    @Override // u1.InterfaceC5063b
    public boolean c(Object obj, File file, u1.h hVar) {
        return ((C0297b) this.f2909v).c(new C0299d(((BitmapDrawable) ((w1.w) obj).get()).getBitmap(), (InterfaceC5183a) this.f2908u), file, hVar);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public byte[] d(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((ZG) this.f2908u).d(i, bArr) : ((C3067cm) this.f2909v).d(i, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        try {
            C3558lu c3558lu = (C3558lu) ((C3500kq) this.f2908u).f32421b;
            c3558lu.b(z6);
            try {
                c3558lu.f32644a.v2(new Y2.b(context));
            } catch (Throwable th) {
                throw new C3290gu(th);
            }
        } catch (C3290gu e9) {
            throw new C2867Wl(e9.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f2909v;
    }

    public void g(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Bundle bundle, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.g(abstractComponentCallbacksC0479s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentActivityCreated(n9, abstractComponentCallbacksC0479s, bundle);
        }
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        return new c2.e((Context) ((C4585b) this.f2908u).f38152u, (c2.d) ((C4585b) this.f2909v).get());
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        switch (this.f2907n) {
            case 13:
                try {
                    String canonicalName = ((AbstractC5224a) this.f2909v).getClass().getCanonicalName();
                    int i = c4741a.f39357a;
                    String str = c4741a.f39358b;
                    String str2 = c4741a.f39359c;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to load mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    x2.i.a(sb.toString());
                    InterfaceC3864rd interfaceC3864rd = (InterfaceC3864rd) this.f2908u;
                    interfaceC3864rd.r0(c4741a.a());
                    interfaceC3864rd.N3(i, str);
                    interfaceC3864rd.j0(i);
                    break;
                } catch (RemoteException e9) {
                    x2.i.d("", e9);
                    return;
                }
            default:
                try {
                    String canonicalName2 = ((BinderC2486Ad) this.f2909v).f24464n.getClass().getCanonicalName();
                    int i4 = c4741a.f39357a;
                    String str3 = c4741a.f39358b;
                    String str4 = c4741a.f39359c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i4).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i4);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    x2.i.a(sb2.toString());
                    InterfaceC3864rd interfaceC3864rd2 = (InterfaceC3864rd) this.f2908u;
                    interfaceC3864rd2.r0(c4741a.a());
                    interfaceC3864rd2.N3(i4, str3);
                    interfaceC3864rd2.j0(i4);
                    break;
                } catch (RemoteException e10) {
                    x2.i.d("", e10);
                }
        }
    }

    public void i(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractActivityC0484x abstractActivityC0484x = n9.f4836t.f5042A;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.i(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentAttached(n9, abstractComponentCallbacksC0479s, abstractActivityC0484x);
        }
    }

    public void j(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Bundle bundle, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.j(abstractComponentCallbacksC0479s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentCreated(n9, abstractComponentCallbacksC0479s, bundle);
        }
    }

    public void k(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.k(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentDestroyed(n9, abstractComponentCallbacksC0479s);
        }
    }

    public void l(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.l(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentDetached(n9, abstractComponentCallbacksC0479s);
        }
    }

    public void m(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.m(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentPaused(n9, abstractComponentCallbacksC0479s);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f2907n) {
            case 15:
                ((InterfaceC3598mg) this.f2908u).mo6a(obj);
                break;
            case 16:
                String str = (String) obj;
                C2814Ti c2814Ti = (C2814Ti) this.f2909v;
                List a9 = c2814Ti.a();
                A3.r rVar = c2814Ti.f28563L;
                c2814Ti.f28553A.a(c2814Ti.f28570z.b(c2814Ti.f28568x, c2814Ti.f28569y, false, (String) this.f2908u, str, a9, c2814Ti.f28560H, rVar), c2814Ti.f28559G);
                break;
        }
    }

    public void o(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractActivityC0484x abstractActivityC0484x = n9.f4836t.f5042A;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.o(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentPreAttached(n9, abstractComponentCallbacksC0479s, abstractActivityC0484x);
        }
    }

    @Override // R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
        synchronized (((com.bumptech.glide.manager.o) this.f2909v).f24256w) {
            ((Z8) this.f2908u).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // C2.b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        LayoutInflater from = LayoutInflater.from((Context) this.f2908u);
        ViewGroup viewGroup = (ViewGroup) this.f2909v;
        NativeAdView nativeAdView = (NativeAdView) from.inflate(C5248R.layout.admob_native, viewGroup, false);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(C5248R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(C5248R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(C5248R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(C5248R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(C5248R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(C5248R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(C5248R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(C5248R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(C5248R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.e());
        nativeAdView.getMediaView().setMediaContent(nativeAd.h());
        if (nativeAd.c() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.c());
        }
        if (nativeAd.d() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.d());
        }
        C3113de c3113de = ((C3166ee) nativeAd).f30745c;
        if (c3113de == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(c3113de.f30560b);
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.i() == null) {
            nativeAdView.getPriceView().setVisibility(4);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(nativeAd.i());
        }
        if (nativeAd.l() == null) {
            nativeAdView.getStoreView().setVisibility(4);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(nativeAd.l());
        }
        if (nativeAd.k() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.k().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.b() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.b());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
        v a9 = nativeAd.h().a();
        if (nativeAd.h() != null && nativeAd.h().b()) {
            a9.a(new Y0.c());
        }
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView);
    }

    public void p(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Bundle bundle, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.p(abstractComponentCallbacksC0479s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentPreCreated(n9, abstractComponentCallbacksC0479s, bundle);
        }
    }

    public void q(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.q(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentResumed(n9, abstractComponentCallbacksC0479s);
        }
    }

    public void r(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Bundle bundle, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.r(abstractComponentCallbacksC0479s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentSaveInstanceState(n9, abstractComponentCallbacksC0479s, bundle);
        }
    }

    public void s(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.s(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentStarted(n9, abstractComponentCallbacksC0479s);
        }
    }

    public void t(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.t(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentStopped(n9, abstractComponentCallbacksC0479s);
        }
    }

    public void u(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, View view, Bundle bundle, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.u(abstractComponentCallbacksC0479s, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentViewCreated(n9, abstractComponentCallbacksC0479s, view, bundle);
        }
    }

    public void v(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        N n9 = (N) this.f2909v;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = n9.f4838v;
        if (abstractComponentCallbacksC0479s2 != null) {
            abstractComponentCallbacksC0479s2.f().f4828l.v(abstractComponentCallbacksC0479s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2908u).iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (z6) {
                c9.getClass();
            }
            c9.f4785a.onFragmentViewDestroyed(n9, abstractComponentCallbacksC0479s);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f2907n) {
            case 15:
                ((InterfaceC3544lg) this.f2909v).mo0c();
                break;
            case 16:
                C2814Ti c2814Ti = (C2814Ti) this.f2909v;
                C4206xv c4206xv = c2814Ti.f28570z;
                List a9 = c2814Ti.a();
                A3.r rVar = c2814Ti.f28563L;
                c2814Ti.f28553A.a(c4206xv.b(c2814Ti.f28568x, c2814Ti.f28569y, false, (String) this.f2908u, null, a9, c2814Ti.f28560H, rVar), null);
                break;
            default:
                Su su = (Su) this.f2909v;
                su.d(th);
                su.a(false);
                ((Vu) this.f2908u).a(su);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0125, code lost:
    
        if (")".equals(com.google.android.gms.internal.ads.U3.b(r7, r8)) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0403  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        W3 w3;
        String str;
        String sb;
        int i6;
        char c9;
        e eVar = this;
        int i9 = -1;
        int i10 = 1;
        Cr cr = (Cr) eVar.f2908u;
        cr.z(i + i4, bArr);
        cr.E(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i11 = cr.f24998b;
            Charset charset = StandardCharsets.UTF_8;
            String n9 = cr.n(charset);
            String str2 = null;
            if (n9 == null || !n9.startsWith("WEBVTT")) {
                cr.E(i11);
                throw U4.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(cr.n(charset))));
            }
            while (!TextUtils.isEmpty(cr.n(StandardCharsets.UTF_8))) {
                eVar = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z6 = 0;
                int i12 = i9;
                int i13 = 0;
                while (i12 == i9) {
                    i13 = cr.f24998b;
                    String n10 = cr.n(StandardCharsets.UTF_8);
                    i12 = n10 == null ? 0 : "STYLE".equals(n10) ? 2 : n10.startsWith("NOTE") ? i10 : 3;
                }
                cr.E(i13);
                if (i12 == 0) {
                    MA.h(new C4297ze(arrayList2), bVar);
                    return;
                }
                if (i12 == i10) {
                    while (!TextUtils.isEmpty(cr.n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (i12 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        cr.n(StandardCharsets.UTF_8);
                        U3 u32 = (U3) eVar.f2909v;
                        StringBuilder sb2 = u32.f28681b;
                        sb2.setLength(0);
                        int i14 = cr.f24998b;
                        while (!TextUtils.isEmpty(cr.n(StandardCharsets.UTF_8))) {
                        }
                        byte[] bArr2 = cr.f24997a;
                        int i15 = cr.f24998b;
                        Cr cr2 = u32.f28680a;
                        cr2.z(i15, bArr2);
                        cr2.E(i14);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            U3.a(cr2);
                            if (cr2.B() >= 5 && "::cue".equals(cr2.k(5, StandardCharsets.UTF_8))) {
                                int i16 = cr2.f24998b;
                                String b9 = U3.b(cr2, sb2);
                                if (b9 != null) {
                                    if ("{".equals(b9)) {
                                        cr2.E(i16);
                                        str = "";
                                    } else if ("(".equals(b9)) {
                                        int i17 = cr2.f24998b;
                                        int i18 = cr2.f24999c;
                                        int i19 = z6 ? 1 : 0;
                                        while (i17 < i18 && i19 == 0) {
                                            int i20 = i17 + 1;
                                            i19 = ((char) cr2.f24997a[i17]) == ')' ? i10 : z6 ? 1 : 0;
                                            i17 = i20;
                                        }
                                        str = cr2.k((i17 + i9) - cr2.f24998b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        str = str2;
                                    }
                                    if (str == null || !"{".equals(U3.b(cr2, sb2))) {
                                        break;
                                    }
                                    V3 v32 = new V3();
                                    v32.f28876a = "";
                                    v32.f28877b = "";
                                    v32.f28878c = Collections.EMPTY_SET;
                                    v32.f28879d = "";
                                    v32.f28880e = str2;
                                    v32.f28882g = z6;
                                    v32.i = z6;
                                    v32.f28884j = i9;
                                    v32.f28885k = i9;
                                    v32.f28886l = i9;
                                    v32.f28887m = i9;
                                    v32.f28889o = i9;
                                    v32.f28890p = z6;
                                    if (!str.isEmpty()) {
                                        int indexOf = str.indexOf(91);
                                        if (indexOf != i9) {
                                            Matcher matcher = U3.f28678c.matcher(str.substring(indexOf));
                                            if (matcher.matches()) {
                                                String group = matcher.group(i10);
                                                group.getClass();
                                                v32.f28879d = group;
                                            }
                                            str = str.substring(z6 ? 1 : 0, indexOf);
                                        }
                                        String str3 = AbstractC3182eu.f30782a;
                                        String[] split = str.split("\\.", i9);
                                        String str4 = split[z6 ? 1 : 0];
                                        int indexOf2 = str4.indexOf(35);
                                        if (indexOf2 != i9) {
                                            v32.f28877b = str4.substring(z6 ? 1 : 0, indexOf2);
                                            v32.f28876a = str4.substring(indexOf2 + i10);
                                        } else {
                                            v32.f28877b = str4;
                                        }
                                        int length = split.length;
                                        if (length > i10) {
                                            v32.f28878c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i10, length)));
                                        }
                                    }
                                    int i21 = z6 ? 1 : 0;
                                    String str5 = str2;
                                    int i22 = z6;
                                    while (i21 == 0) {
                                        int i23 = cr2.f24998b;
                                        str5 = U3.b(cr2, sb2);
                                        int i24 = (str5 == null || "}".equals(str5)) ? i10 : i22;
                                        if (i24 == 0) {
                                            cr2.E(i23);
                                            U3.a(cr2);
                                            String c10 = U3.c(cr2, sb2);
                                            if (!c10.isEmpty() && ":".equals(U3.b(cr2, sb2))) {
                                                U3.a(cr2);
                                                StringBuilder sb3 = new StringBuilder();
                                                boolean z9 = false;
                                                while (true) {
                                                    if (z9) {
                                                        sb = sb3.toString();
                                                        break;
                                                    }
                                                    int i25 = cr2.f24998b;
                                                    String b10 = U3.b(cr2, sb2);
                                                    if (b10 == null) {
                                                        sb = null;
                                                        break;
                                                    } else if ("}".equals(b10) || ";".equals(b10)) {
                                                        cr2.E(i25);
                                                        z9 = true;
                                                    } else {
                                                        sb3.append(b10);
                                                    }
                                                }
                                                if (sb != null && !sb.isEmpty()) {
                                                    int i26 = cr2.f24998b;
                                                    String b11 = U3.b(cr2, sb2);
                                                    if (!";".equals(b11)) {
                                                        if ("}".equals(b11)) {
                                                            cr2.E(i26);
                                                        }
                                                    }
                                                    if (com.anythink.expressad.foundation.h.k.f20420d.equals(c10)) {
                                                        i6 = 1;
                                                        v32.f28881f = AbstractC2665Km.a(sb, true);
                                                        v32.f28882g = true;
                                                    } else {
                                                        i6 = 1;
                                                        if ("background-color".equals(c10)) {
                                                            v32.f28883h = AbstractC2665Km.a(sb, true);
                                                            v32.i = true;
                                                        } else if ("ruby-position".equals(c10)) {
                                                            if ("over".equals(sb)) {
                                                                v32.f28889o = 1;
                                                            } else if ("under".equals(sb)) {
                                                                v32.f28889o = 2;
                                                            }
                                                        } else if ("text-combine-upright".equals(c10)) {
                                                            v32.f28890p = "all".equals(sb) || sb.startsWith("digits");
                                                        } else if ("text-decoration".equals(c10)) {
                                                            if ("underline".equals(sb)) {
                                                                v32.f28884j = 1;
                                                            }
                                                        } else if ("font-family".equals(c10)) {
                                                            v32.f28880e = AbstractC3066cl.f(sb);
                                                        } else {
                                                            if (!"font-weight".equals(c10)) {
                                                                i6 = 1;
                                                                if ("font-style".equals(c10)) {
                                                                    if ("italic".equals(sb)) {
                                                                        v32.f28886l = 1;
                                                                    }
                                                                } else if ("font-size".equals(c10)) {
                                                                    Matcher matcher2 = U3.f28679d.matcher(AbstractC3066cl.f(sb));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        int hashCode = group2.hashCode();
                                                                        if (hashCode == 37) {
                                                                            if (group2.equals("%")) {
                                                                                c9 = 2;
                                                                                if (c9 == 0) {
                                                                                }
                                                                                String group3 = matcher2.group(i10);
                                                                                group3.getClass();
                                                                                v32.f28888n = Float.parseFloat(group3);
                                                                            }
                                                                            c9 = 65535;
                                                                            if (c9 == 0) {
                                                                            }
                                                                            String group32 = matcher2.group(i10);
                                                                            group32.getClass();
                                                                            v32.f28888n = Float.parseFloat(group32);
                                                                        } else if (hashCode != 3240) {
                                                                            if (hashCode == 3592 && group2.equals("px")) {
                                                                                c9 = 0;
                                                                                if (c9 == 0) {
                                                                                    i10 = 1;
                                                                                    if (c9 == 1) {
                                                                                        v32.f28887m = 2;
                                                                                    } else {
                                                                                        if (c9 != 2) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        v32.f28887m = 3;
                                                                                    }
                                                                                } else {
                                                                                    i10 = 1;
                                                                                    v32.f28887m = 1;
                                                                                }
                                                                                String group322 = matcher2.group(i10);
                                                                                group322.getClass();
                                                                                v32.f28888n = Float.parseFloat(group322);
                                                                            }
                                                                            c9 = 65535;
                                                                            if (c9 == 0) {
                                                                            }
                                                                            String group3222 = matcher2.group(i10);
                                                                            group3222.getClass();
                                                                            v32.f28888n = Float.parseFloat(group3222);
                                                                        } else {
                                                                            if (group2.equals("em")) {
                                                                                c9 = 1;
                                                                                if (c9 == 0) {
                                                                                }
                                                                                String group32222 = matcher2.group(i10);
                                                                                group32222.getClass();
                                                                                v32.f28888n = Float.parseFloat(group32222);
                                                                            }
                                                                            c9 = 65535;
                                                                            if (c9 == 0) {
                                                                            }
                                                                            String group322222 = matcher2.group(i10);
                                                                            group322222.getClass();
                                                                            v32.f28888n = Float.parseFloat(group322222);
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                                                        sb4.append("Invalid font-size: '");
                                                                        sb4.append(sb);
                                                                        sb4.append("'.");
                                                                        AbstractC2991bG.y("WebvttCssParser", sb4.toString());
                                                                    }
                                                                }
                                                            } else if ("bold".equals(sb)) {
                                                                i6 = 1;
                                                                v32.f28885k = 1;
                                                            }
                                                            i21 = i24;
                                                            i22 = 0;
                                                        }
                                                    }
                                                    i10 = i6;
                                                }
                                                i10 = 1;
                                                i21 = i24;
                                                i22 = 0;
                                            }
                                        }
                                        i21 = i24;
                                        i22 = 0;
                                    }
                                    if ("}".equals(str5)) {
                                        arrayList3.add(v32);
                                    }
                                    i9 = -1;
                                    z6 = 0;
                                    str2 = null;
                                }
                            }
                            str = str2;
                            if (str == null) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    Pattern pattern = AbstractC2979b4.f29993a;
                    Charset charset2 = StandardCharsets.UTF_8;
                    String n11 = cr.n(charset2);
                    if (n11 != null) {
                        Pattern pattern2 = AbstractC2979b4.f29993a;
                        Matcher matcher3 = pattern2.matcher(n11);
                        if (matcher3.matches()) {
                            w3 = AbstractC2979b4.b(null, matcher3, cr, arrayList);
                        } else {
                            String n12 = cr.n(charset2);
                            if (n12 != null) {
                                Matcher matcher4 = pattern2.matcher(n12);
                                if (matcher4.matches()) {
                                    w3 = AbstractC2979b4.b(n11.trim(), matcher4, cr, arrayList);
                                }
                            }
                        }
                        if (w3 != null) {
                            arrayList2.add(w3);
                        }
                    }
                    w3 = null;
                    if (w3 != null) {
                    }
                    eVar = this;
                    i9 = -1;
                    str2 = null;
                }
            }
        } catch (U4 e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public Long y(String str) {
        C5060i a9 = C5060i.a(1, "SELECT long_value FROM Preference where `key`=?");
        a9.c(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2908u;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            Long l9 = null;
            if (m9.moveToFirst() && !m9.isNull(0)) {
                l9 = Long.valueOf(m9.getLong(0));
            }
            return l9;
        } finally {
            m9.close();
            a9.j();
        }
    }

    public synchronized List z(String str) {
        List list;
        if (!((ArrayList) this.f2908u).contains(str)) {
            ((ArrayList) this.f2908u).add(str);
        }
        list = (List) ((HashMap) this.f2909v).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f2909v).put(str, list);
        }
        return list;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i, boolean z6) {
        this.f2907n = i;
        this.f2909v = obj;
        this.f2908u = obj2;
    }

    public e(B1.b bVar, InterfaceC3598mg interfaceC3598mg, InterfaceC3544lg interfaceC3544lg) {
        this.f2907n = 15;
        this.f2908u = interfaceC3598mg;
        this.f2909v = interfaceC3544lg;
        Objects.requireNonNull(bVar);
    }

    public e(Context context) {
        this.f2907n = 24;
        this.f2908u = context.getPackageName();
        this.f2909v = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public e(Handler handler, HN hn) {
        this.f2907n = 10;
        if (hn != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f2908u = handler;
        this.f2909v = hn;
    }

    public e(BinderC2486Ad binderC2486Ad, InterfaceC3864rd interfaceC3864rd) {
        this.f2907n = 14;
        this.f2908u = interfaceC3864rd;
        Objects.requireNonNull(binderC2486Ad);
        this.f2909v = binderC2486Ad;
    }

    public e(BinderC2486Ad binderC2486Ad, InterfaceC3864rd interfaceC3864rd, AbstractC5224a abstractC5224a) {
        this.f2907n = 13;
        this.f2908u = interfaceC3864rd;
        this.f2909v = abstractC5224a;
        Objects.requireNonNull(binderC2486Ad);
    }

    public e(C2814Ti c2814Ti, String str) {
        this.f2907n = 16;
        this.f2908u = str;
        Objects.requireNonNull(c2814Ti);
        this.f2909v = c2814Ti;
    }

    public e(C3230fo c3230fo) {
        this.f2907n = 19;
        Objects.requireNonNull(c3230fo);
        this.f2909v = c3230fo;
        this.f2908u = new ConcurrentHashMap();
    }

    public e(C3019br c3019br, C3500kq c3500kq, St st) {
        this.f2907n = 21;
        this.f2908u = c3500kq;
        this.f2909v = st;
        Objects.requireNonNull(c3019br);
    }

    public /* synthetic */ e(PN pn) {
        this.f2907n = 28;
        Objects.requireNonNull(pn);
        this.f2908u = new HashMap();
        this.f2909v = C4127wN.f35599b;
    }

    public e(O2.f fVar) {
        this.f2907n = 5;
        this.f2908u = new SparseIntArray();
        w.h(fVar);
        this.f2909v = fVar;
    }

    public e(int i) {
        this.f2907n = i;
        switch (i) {
            case 11:
                this.f2908u = new Cr();
                this.f2909v = new U3();
                break;
            case 25:
                break;
            default:
                this.f2908u = new ArrayList();
                this.f2909v = new HashMap();
                break;
        }
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f2907n = 0;
        this.f2908u = workDatabase_Impl;
        this.f2909v = new b(workDatabase_Impl, 1);
    }

    public e(N n9) {
        this.f2907n = 7;
        this.f2908u = new CopyOnWriteArrayList();
        this.f2909v = n9;
    }

    public e(O6.a aVar) {
        this.f2907n = 4;
        this.f2908u = aVar;
    }

    private final void K(Object obj) {
    }
}
