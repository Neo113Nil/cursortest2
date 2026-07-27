package B2;

import a2.C0426e;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.RecyclerView;
import b2.InterfaceC0525b;
import com.google.android.gms.internal.ads.AbstractC2547Fa;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2790Tf;
import com.google.android.gms.internal.ads.InterfaceC2671Mf;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Yu;
import com.onesignal.core.activities.PermissionsActivity;
import e2.C4469b;
import f2.C4500c;
import h0.AbstractC4556b;
import h2.InterfaceC4566c;
import j1.AbstractC4591d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.C4711c;
import org.json.JSONException;
import org.json.JSONObject;
import p7.InterfaceC4864a;
import q7.InterfaceC4936e;
import t0.C5038a;

/* loaded from: classes.dex */
public final class N implements LD, N3.c, InterfaceC4936e, InterfaceC0525b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f195n;

    /* renamed from: u, reason: collision with root package name */
    public Object f196u;

    /* renamed from: v, reason: collision with root package name */
    public Object f197v;

    /* renamed from: w, reason: collision with root package name */
    public Object f198w;

    /* renamed from: x, reason: collision with root package name */
    public Object f199x;

    /* renamed from: y, reason: collision with root package name */
    public Object f200y;

    public /* synthetic */ N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f195n = i;
        this.f196u = obj;
        this.f197v = obj2;
        this.f198w = obj3;
        this.f199x = obj4;
        this.f200y = obj5;
    }

    public static N i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        N n9 = new N(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) n9.f199x)) {
            try {
                ((ArrayDeque) n9.f199x).clear();
                String string = ((SharedPreferences) n9.f196u).getString((String) n9.f197v, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) n9.f198w)) {
                    String[] split = string.split((String) n9.f198w, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) n9.f199x).add(str);
                        }
                    }
                    return n9;
                }
                return n9;
            } finally {
            }
        }
    }

    @Override // N3.c
    public Object a(Class cls) {
        if (!((Set) this.f196u).contains(N3.r.a(cls))) {
            throw new B0.c("Attempting to request an undeclared dependency " + cls + com.anythink.core.common.d.j.f12535z);
        }
        Object a9 = ((N3.c) this.f200y).a(cls);
        if (!cls.equals(V3.a.class)) {
            return a9;
        }
        return new N3.s();
    }

    @Override // N3.c
    public Set b(N3.r rVar) {
        if (((Set) this.f198w).contains(rVar)) {
            return ((N3.c) this.f200y).b(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // N3.c
    public Y3.a c(Class cls) {
        return f(N3.r.a(cls));
    }

    @Override // N3.c
    public Y3.a d(N3.r rVar) {
        if (((Set) this.f199x).contains(rVar)) {
            return ((N3.c) this.f200y).d(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    @Override // N3.c
    public Object e(N3.r rVar) {
        if (((Set) this.f196u).contains(rVar)) {
            return ((N3.c) this.f200y).e(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency " + rVar + com.anythink.core.common.d.j.f12535z);
    }

    @Override // N3.c
    public Y3.a f(N3.r rVar) {
        if (((Set) this.f197v).contains(rVar)) {
            return ((N3.c) this.f200y).f(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    public boolean g(int i) {
        ArrayList arrayList = (ArrayList) this.f198w;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C5038a c5038a = (C5038a) arrayList.get(i4);
            int i9 = c5038a.f40667a;
            if (i9 != 8) {
                if (i9 == 1) {
                    int i10 = c5038a.f40668b;
                    int i11 = c5038a.f40669c + i10;
                    while (i10 < i11) {
                        if (m(i10, i4 + 1) == i) {
                            return true;
                        }
                        i10++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m(c5038a.f40669c, i4 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        return new C4469b((Executor) ((InterfaceC4864a) this.f196u).get(), (C0426e) ((InterfaceC4864a) this.f197v).get(), (C4500c) ((Y2.e) this.f198w).get(), (g2.d) ((InterfaceC4864a) this.f199x).get(), (InterfaceC4566c) ((InterfaceC4864a) this.f200y).get());
    }

    @Override // q7.InterfaceC4936e
    public Object getValue() {
        S s3 = (S) this.f200y;
        if (s3 != null) {
            return s3;
        }
        Y2.e eVar = new Y2.e((X) ((PermissionsActivity.f) this.f197v).invoke(), (V) ((PermissionsActivity.e) this.f198w).invoke(), (AbstractC4556b) ((PermissionsActivity.g) this.f199x).invoke());
        Class a9 = ((kotlin.jvm.internal.d) this.f196u).a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        S t9 = eVar.t(a9);
        this.f200y = t9;
        return t9;
    }

    public void h() {
        ArrayList arrayList = (ArrayList) this.f198w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h8.d) this.f199x).d((C5038a) arrayList.get(i));
        }
        t(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f197v;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C5038a c5038a = (C5038a) arrayList2.get(i4);
            int i9 = c5038a.f40667a;
            h8.d dVar = (h8.d) this.f199x;
            if (i9 == 1) {
                dVar.d(c5038a);
                dVar.l(c5038a.f40668b, c5038a.f40669c);
            } else if (i9 == 2) {
                dVar.d(c5038a);
                int i10 = c5038a.f40668b;
                int i11 = c5038a.f40669c;
                RecyclerView recyclerView = (RecyclerView) dVar.f38261u;
                recyclerView.O(i10, i11, true);
                recyclerView.f5344L0 = true;
                recyclerView.f5339I0.f40596c += i11;
            } else if (i9 == 4) {
                dVar.d(c5038a);
                dVar.k(c5038a.f40668b, c5038a.f40669c);
            } else if (i9 == 8) {
                dVar.d(c5038a);
                dVar.m(c5038a.f40668b, c5038a.f40669c);
            }
        }
        t(arrayList2);
    }

    public void j(C5038a c5038a) {
        int i;
        int i4 = c5038a.f40667a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u7 = u(c5038a.f40668b, i4);
        int i9 = c5038a.f40668b;
        int i10 = c5038a.f40667a;
        if (i10 == 2) {
            i = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c5038a);
            }
            i = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < c5038a.f40669c; i12++) {
            int u9 = u((i * i12) + c5038a.f40668b, c5038a.f40667a);
            int i13 = c5038a.f40667a;
            if (i13 == 2 ? u9 != u7 : !(i13 == 4 && u9 == u7 + 1)) {
                C5038a r9 = r(i13, u7, i11);
                k(r9, i9);
                ((N.c) this.f196u).c(r9);
                if (c5038a.f40667a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                u7 = u9;
            } else {
                i11++;
            }
        }
        ((N.c) this.f196u).c(c5038a);
        if (i11 > 0) {
            C5038a r10 = r(c5038a.f40667a, u7, i11);
            k(r10, i9);
            ((N.c) this.f196u).c(r10);
        }
    }

    public void k(C5038a c5038a, int i) {
        h8.d dVar = (h8.d) this.f199x;
        dVar.d(c5038a);
        int i4 = c5038a.f40667a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            dVar.k(i, c5038a.f40669c);
        } else {
            int i9 = c5038a.f40669c;
            RecyclerView recyclerView = (RecyclerView) dVar.f38261u;
            recyclerView.O(i, i9, true);
            recyclerView.f5344L0 = true;
            recyclerView.f5339I0.f40596c += i9;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        BinderC0278l binderC0278l = (BinderC0278l) this.f200y;
        AtomicBoolean atomicBoolean = binderC0278l.f265V;
        u uVar = (u) obj;
        Yu P32 = BinderC0278l.P3((J3.a) this.f196u, (C2790Tf) this.f197v);
        atomicBoolean.set(true);
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31833x8)).booleanValue();
        Vu vu = (Vu) this.f199x;
        InterfaceC2671Mf interfaceC2671Mf = (InterfaceC2671Mf) this.f198w;
        if (!booleanValue) {
            if (interfaceC2671Mf != null) {
                try {
                    interfaceC2671Mf.b("QueryInfo generation has been disabled.");
                } catch (RemoteException e6) {
                    String concat = "QueryInfo generation has been disabled.".concat(e6.toString());
                    int i = t2.C.f40822b;
                    u2.i.c(concat);
                }
            }
            if (!((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() || P32 == null) {
                return;
            }
            vu.h("QueryInfo generation has been disabled.");
            vu.b(false);
            P32.a(vu);
            P32.h();
            return;
        }
        try {
            try {
                if (uVar == null) {
                    if (interfaceC2671Mf != null) {
                        interfaceC2671Mf.B3(null, null, null);
                    }
                    vu.b(true);
                    if (!((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() || P32 == null) {
                        return;
                    }
                    P32.a(vu);
                    P32.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(uVar.f304b).optString("request_id", ""))) {
                        int i4 = t2.C.f40822b;
                        u2.i.f("The request ID is empty in request JSON.");
                        if (interfaceC2671Mf != null) {
                            interfaceC2671Mf.b("Internal error: request ID is empty in request JSON.");
                        }
                        vu.h("Request ID empty");
                        vu.b(false);
                        if (!((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() || P32 == null) {
                            return;
                        }
                        P32.a(vu);
                        P32.h();
                        return;
                    }
                    Bundle bundle = uVar.f306d;
                    boolean z8 = binderC0278l.J;
                    String str = binderC0278l.f254K;
                    String str2 = binderC0278l.f255L;
                    if (z8 && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, binderC0278l.f256M.get());
                    }
                    if (binderC0278l.f253I && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(binderC0278l.f258O)) {
                            binderC0278l.f258O = p2.j.f39798C.f39803c.E(binderC0278l.f270v, binderC0278l.f257N.f41217n);
                        }
                        bundle.putString(str, binderC0278l.f258O);
                    }
                    if (interfaceC2671Mf != null) {
                        interfaceC2671Mf.B3(uVar.f303a, bundle, uVar.f304b);
                    }
                    vu.b(true);
                    if (!((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() || P32 == null) {
                        return;
                    }
                    P32.a(vu);
                    P32.h();
                } catch (JSONException e9) {
                    int i9 = t2.C.f40822b;
                    u2.i.f("Failed to create JSON object from the request string.");
                    if (interfaceC2671Mf != null) {
                        String obj2 = e9.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        interfaceC2671Mf.b(sb.toString());
                    }
                    vu.c(e9);
                    vu.b(false);
                    p2.j.f39798C.f39808h.d("SignalGeneratorImpl.generateSignals.onSuccess", e9);
                    if (!((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() || P32 == null) {
                        return;
                    }
                    P32.a(vu);
                    P32.h();
                }
            } catch (RemoteException e10) {
                vu.c(e10);
                vu.b(false);
                int i10 = t2.C.f40822b;
                u2.i.d("", e10);
                p2.j.f39798C.f39808h.d("SignalGeneratorImpl.generateSignals.onSuccess", e10);
                if (!((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() || P32 == null) {
                    return;
                }
                P32.a(vu);
                P32.h();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() && P32 != null) {
                P32.a(vu);
                P32.h();
            }
            throw th;
        }
    }

    public int m(int i, int i4) {
        ArrayList arrayList = (ArrayList) this.f198w;
        int size = arrayList.size();
        while (i4 < size) {
            C5038a c5038a = (C5038a) arrayList.get(i4);
            int i9 = c5038a.f40667a;
            if (i9 == 8) {
                int i10 = c5038a.f40668b;
                if (i10 == i) {
                    i = c5038a.f40669c;
                } else {
                    if (i10 < i) {
                        i--;
                    }
                    if (c5038a.f40669c <= i) {
                        i++;
                    }
                }
            } else {
                int i11 = c5038a.f40668b;
                if (i11 > i) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = c5038a.f40669c;
                    if (i < i11 + i12) {
                        return -1;
                    }
                    i -= i12;
                } else if (i9 == 1) {
                    i += c5038a.f40669c;
                }
            }
            i4++;
        }
        return i;
    }

    public boolean n() {
        return ((ArrayList) this.f197v).size() > 0;
    }

    public void o(String str, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        I1.b bVar = (I1.b) this.f198w;
        bVar.getClass();
        K3.b.p(str);
        K3.b.q(value, str);
        bVar.g(str);
        K3.b.b(bVar, str, value);
    }

    public void p(String method, e8.u uVar) {
        kotlin.jvm.internal.h.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (uVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(D.y.k("method ", method, " must have a request body.").toString());
            }
        } else if (!com.bumptech.glide.h.x(method)) {
            throw new IllegalArgumentException(D.y.k("method ", method, " must not have a request body.").toString());
        }
        this.f197v = method;
        this.f199x = uVar;
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.D8)).booleanValue()) {
            p2.j.f39798C.f39808h.e("SignalGeneratorImpl.generateSignals", th);
        } else {
            p2.j.f39798C.f39808h.d("SignalGeneratorImpl.generateSignals", th);
        }
        Yu P32 = BinderC0278l.P3((J3.a) this.f196u, (C2790Tf) this.f197v);
        if (((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue() && P32 != null) {
            Vu vu = (Vu) this.f199x;
            vu.c(th);
            vu.b(false);
            P32.a(vu);
            P32.h();
        }
        InterfaceC2671Mf interfaceC2671Mf = (InterfaceC2671Mf) this.f198w;
        if (interfaceC2671Mf == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            interfaceC2671Mf.b(message);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.d("", e6);
        }
    }

    public C5038a r(int i, int i4, int i9) {
        C5038a c5038a = (C5038a) ((N.c) this.f196u).a();
        if (c5038a != null) {
            c5038a.f40667a = i;
            c5038a.f40668b = i4;
            c5038a.f40669c = i9;
            return c5038a;
        }
        C5038a c5038a2 = new C5038a();
        c5038a2.f40667a = i;
        c5038a2.f40668b = i4;
        c5038a2.f40669c = i9;
        return c5038a2;
    }

    public void s(C5038a c5038a) {
        ((ArrayList) this.f198w).add(c5038a);
        int i = c5038a.f40667a;
        h8.d dVar = (h8.d) this.f199x;
        if (i == 1) {
            dVar.l(c5038a.f40668b, c5038a.f40669c);
            return;
        }
        if (i == 2) {
            int i4 = c5038a.f40668b;
            int i9 = c5038a.f40669c;
            RecyclerView recyclerView = (RecyclerView) dVar.f38261u;
            recyclerView.O(i4, i9, false);
            recyclerView.f5344L0 = true;
            return;
        }
        if (i == 4) {
            dVar.k(c5038a.f40668b, c5038a.f40669c);
        } else if (i == 8) {
            dVar.m(c5038a.f40668b, c5038a.f40669c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c5038a);
        }
    }

    public void t(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5038a c5038a = (C5038a) arrayList.get(i);
            c5038a.getClass();
            ((N.c) this.f196u).c(c5038a);
        }
        arrayList.clear();
    }

    public String toString() {
        switch (this.f195n) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f196u) + ", mProviderPackage: " + ((String) this.f197v) + ", mQuery: " + ((String) this.f198w) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f199x;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public int u(int i, int i4) {
        int i9;
        int i10;
        ArrayList arrayList = (ArrayList) this.f198w;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5038a c5038a = (C5038a) arrayList.get(size);
            int i11 = c5038a.f40667a;
            if (i11 == 8) {
                int i12 = c5038a.f40668b;
                int i13 = c5038a.f40669c;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i < i10 || i > i9) {
                    if (i < i12) {
                        if (i4 == 1) {
                            c5038a.f40668b = i12 + 1;
                            c5038a.f40669c = i13 + 1;
                        } else if (i4 == 2) {
                            c5038a.f40668b = i12 - 1;
                            c5038a.f40669c = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i4 == 1) {
                        c5038a.f40669c = i13 + 1;
                    } else if (i4 == 2) {
                        c5038a.f40669c = i13 - 1;
                    }
                    i++;
                } else {
                    if (i4 == 1) {
                        c5038a.f40668b = i12 + 1;
                    } else if (i4 == 2) {
                        c5038a.f40668b = i12 - 1;
                    }
                    i--;
                }
            } else {
                int i14 = c5038a.f40668b;
                if (i14 <= i) {
                    if (i11 == 1) {
                        i -= c5038a.f40669c;
                    } else if (i11 == 2) {
                        i += c5038a.f40669c;
                    }
                } else if (i4 == 1) {
                    c5038a.f40668b = i14 + 1;
                } else if (i4 == 2) {
                    c5038a.f40668b = i14 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C5038a c5038a2 = (C5038a) arrayList.get(size2);
            if (c5038a2.f40667a == 8) {
                int i15 = c5038a2.f40669c;
                if (i15 == c5038a2.f40668b || i15 < 0) {
                    arrayList.remove(size2);
                    ((N.c) this.f196u).c(c5038a2);
                }
            } else if (c5038a2.f40669c <= 0) {
                arrayList.remove(size2);
                ((N.c) this.f196u).c(c5038a2);
            }
        }
        return i;
    }

    public /* synthetic */ N(boolean z8) {
        this.f195n = 7;
    }

    public N(BinderC0278l binderC0278l, J3.a aVar, C2790Tf c2790Tf, InterfaceC2671Mf interfaceC2671Mf, Vu vu) {
        this.f195n = 0;
        this.f196u = aVar;
        this.f197v = c2790Tf;
        this.f198w = interfaceC2671Mf;
        this.f199x = vu;
        Objects.requireNonNull(binderC0278l);
        this.f200y = binderC0278l;
    }

    public N(Drawable.Callback callback) {
        this.f195n = 4;
        this.f196u = new S0.l(9, false);
        this.f197v = new HashMap();
        this.f198w = new HashMap();
        this.f200y = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC4591d.b("LottieDrawable must be inside of a view for images to work.");
            this.f199x = null;
        } else {
            this.f199x = ((View) callback).getContext().getAssets();
        }
    }

    public N(kotlin.jvm.internal.d dVar, PermissionsActivity.f fVar, PermissionsActivity.e eVar, PermissionsActivity.g gVar) {
        this.f195n = 3;
        this.f196u = dVar;
        this.f197v = fVar;
        this.f198w = eVar;
        this.f199x = gVar;
    }

    public N(N3.b bVar, N3.c cVar) {
        this.f195n = 2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (N3.j jVar : bVar.f2156c) {
            int i = jVar.f2179c;
            boolean z8 = i == 0;
            int i4 = jVar.f2178b;
            N3.r rVar = jVar.f2177a;
            if (z8) {
                if (i4 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i == 2) {
                hashSet3.add(rVar);
            } else if (i4 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!bVar.f2160g.isEmpty()) {
            hashSet.add(N3.r.a(V3.a.class));
        }
        this.f196u = Collections.unmodifiableSet(hashSet);
        this.f197v = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f198w = Collections.unmodifiableSet(hashSet4);
        this.f199x = Collections.unmodifiableSet(hashSet5);
        this.f200y = cVar;
    }

    public N(String str, String str2, String str3, List list) {
        this.f195n = 1;
        str.getClass();
        this.f196u = str;
        str2.getClass();
        this.f197v = str2;
        this.f198w = str3;
        list.getClass();
        this.f199x = list;
        this.f200y = str + "-" + str2 + "-" + str3;
    }

    public N(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f195n = 8;
        this.f199x = new ArrayDeque();
        this.f196u = sharedPreferences;
        this.f197v = "topic_operation_queue";
        this.f198w = ",";
        this.f200y = scheduledThreadPoolExecutor;
    }

    public N(h8.d dVar) {
        this.f195n = 11;
        this.f196u = new N.c(30);
        this.f197v = new ArrayList();
        this.f198w = new ArrayList();
        this.f199x = dVar;
        this.f200y = new i8.m(this);
    }

    public N() {
        this.f195n = 7;
        this.f200y = r7.q.f40359n;
        this.f197v = "GET";
        this.f198w = new I1.b(4);
    }

    public N(h8.e taskRunner) {
        this.f195n = 10;
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f196u = taskRunner;
        this.f199x = l8.n.f39148a;
        this.f200y = C4711c.f39105a;
    }
}
