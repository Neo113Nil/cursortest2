package C2;

import a.AbstractC0422a;
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
import b2.InterfaceC0515b;
import c4.InterfaceC0542a;
import com.google.android.gms.internal.ads.AbstractC2633Ka;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2838Wf;
import com.google.android.gms.internal.ads.InterfaceC2723Pf;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Vu;
import com.onesignal.core.activities.PermissionsActivity;
import g1.C4522b;
import g1.C4523c;
import g2.InterfaceC4527d;
import h0.AbstractC4554b;
import j1.AbstractC4599c;
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
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import p8.C4857c;
import t0.C5006a;
import t7.InterfaceC5044a;
import u7.InterfaceC5087e;

/* loaded from: classes.dex */
public final class N implements KD, R3.c, InterfaceC5087e, InterfaceC0515b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f300n;

    /* renamed from: u, reason: collision with root package name */
    public Object f301u;

    /* renamed from: v, reason: collision with root package name */
    public Object f302v;

    /* renamed from: w, reason: collision with root package name */
    public Object f303w;

    /* renamed from: x, reason: collision with root package name */
    public Object f304x;

    /* renamed from: y, reason: collision with root package name */
    public Object f305y;

    public /* synthetic */ N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f300n = i;
        this.f301u = obj;
        this.f302v = obj2;
        this.f303w = obj3;
        this.f304x = obj4;
        this.f305y = obj5;
    }

    public static N i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        N n9 = new N(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) n9.f304x)) {
            try {
                ((ArrayDeque) n9.f304x).clear();
                String string = ((SharedPreferences) n9.f301u).getString((String) n9.f302v, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) n9.f303w)) {
                    String[] split = string.split((String) n9.f303w, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) n9.f304x).add(str);
                        }
                    }
                    return n9;
                }
                return n9;
            } finally {
            }
        }
    }

    @Override // R3.c
    public Object a(Class cls) {
        if (!((Set) this.f301u).contains(R3.r.a(cls))) {
            throw new B0.c("Attempting to request an undeclared dependency " + cls + com.anythink.core.common.d.j.f12378z);
        }
        Object a9 = ((R3.c) this.f305y).a(cls);
        if (!cls.equals(Z3.a.class)) {
            return a9;
        }
        return new R3.s();
    }

    @Override // R3.c
    public InterfaceC0542a b(Class cls) {
        return e(R3.r.a(cls));
    }

    @Override // R3.c
    public Set c(R3.r rVar) {
        if (((Set) this.f303w).contains(rVar)) {
            return ((R3.c) this.f305y).c(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // R3.c
    public Object d(R3.r rVar) {
        if (((Set) this.f301u).contains(rVar)) {
            return ((R3.c) this.f305y).d(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency " + rVar + com.anythink.core.common.d.j.f12378z);
    }

    @Override // R3.c
    public InterfaceC0542a e(R3.r rVar) {
        if (((Set) this.f302v).contains(rVar)) {
            return ((R3.c) this.f305y).e(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // R3.c
    public InterfaceC0542a f(R3.r rVar) {
        if (((Set) this.f304x).contains(rVar)) {
            return ((R3.c) this.f305y).f(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    public boolean g(int i) {
        ArrayList arrayList = (ArrayList) this.f303w;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C5006a c5006a = (C5006a) arrayList.get(i6);
            int i9 = c5006a.f40641a;
            if (i9 != 8) {
                if (i9 == 1) {
                    int i10 = c5006a.f40642b;
                    int i11 = c5006a.f40643c + i10;
                    while (i10 < i11) {
                        if (l(i10, i6 + 1) == i) {
                            return true;
                        }
                        i10++;
                    }
                } else {
                    continue;
                }
            } else {
                if (l(c5006a.f40643c, i6 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new e2.b((Executor) ((InterfaceC5044a) this.f301u).get(), (a2.f) ((InterfaceC5044a) this.f302v).get(), (f2.c) ((Z2.e) this.f303w).get(), (InterfaceC4527d) ((InterfaceC5044a) this.f304x).get(), (h2.c) ((InterfaceC5044a) this.f305y).get());
    }

    @Override // u7.InterfaceC5087e
    public Object getValue() {
        S s9 = (S) this.f305y;
        if (s9 != null) {
            return s9;
        }
        Z2.e eVar = new Z2.e((X) ((PermissionsActivity.f) this.f302v).invoke(), (V) ((PermissionsActivity.e) this.f303w).invoke(), (AbstractC4554b) ((PermissionsActivity.g) this.f304x).invoke());
        Class a9 = ((kotlin.jvm.internal.d) this.f301u).a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        S r9 = eVar.r(a9);
        this.f305y = r9;
        return r9;
    }

    public void h() {
        ArrayList arrayList = (ArrayList) this.f303w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C4522b) this.f304x).z((C5006a) arrayList.get(i));
        }
        s(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f302v;
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C5006a c5006a = (C5006a) arrayList2.get(i6);
            int i9 = c5006a.f40641a;
            C4522b c4522b = (C4522b) this.f304x;
            if (i9 == 1) {
                c4522b.z(c5006a);
                c4522b.N(c5006a.f40642b, c5006a.f40643c);
            } else if (i9 == 2) {
                c4522b.z(c5006a);
                int i10 = c5006a.f40642b;
                int i11 = c5006a.f40643c;
                RecyclerView recyclerView = (RecyclerView) c4522b.f37625u;
                recyclerView.O(i10, i11, true);
                recyclerView.f5232L0 = true;
                recyclerView.f5227I0.f40574c += i11;
            } else if (i9 == 4) {
                c4522b.z(c5006a);
                c4522b.M(c5006a.f40642b, c5006a.f40643c);
            } else if (i9 == 8) {
                c4522b.z(c5006a);
                c4522b.P(c5006a.f40642b, c5006a.f40643c);
            }
        }
        s(arrayList2);
    }

    public void j(C5006a c5006a) {
        int i;
        int i6 = c5006a.f40641a;
        if (i6 == 1 || i6 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int t6 = t(c5006a.f40642b, i6);
        int i9 = c5006a.f40642b;
        int i10 = c5006a.f40641a;
        if (i10 == 2) {
            i = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c5006a);
            }
            i = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < c5006a.f40643c; i12++) {
            int t9 = t((i * i12) + c5006a.f40642b, c5006a.f40641a);
            int i13 = c5006a.f40641a;
            if (i13 == 2 ? t9 != t6 : !(i13 == 4 && t9 == t6 + 1)) {
                C5006a q8 = q(i13, t6, i11);
                k(q8, i9);
                ((N.c) this.f301u).c(q8);
                if (c5006a.f40641a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                t6 = t9;
            } else {
                i11++;
            }
        }
        ((N.c) this.f301u).c(c5006a);
        if (i11 > 0) {
            C5006a q9 = q(c5006a.f40641a, t6, i11);
            k(q9, i9);
            ((N.c) this.f301u).c(q9);
        }
    }

    public void k(C5006a c5006a, int i) {
        C4522b c4522b = (C4522b) this.f304x;
        c4522b.z(c5006a);
        int i6 = c5006a.f40641a;
        if (i6 != 2) {
            if (i6 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c4522b.M(i, c5006a.f40643c);
        } else {
            int i9 = c5006a.f40643c;
            RecyclerView recyclerView = (RecyclerView) c4522b.f37625u;
            recyclerView.O(i, i9, true);
            recyclerView.f5232L0 = true;
            recyclerView.f5227I0.f40574c += i9;
        }
    }

    public int l(int i, int i6) {
        ArrayList arrayList = (ArrayList) this.f303w;
        int size = arrayList.size();
        while (i6 < size) {
            C5006a c5006a = (C5006a) arrayList.get(i6);
            int i9 = c5006a.f40641a;
            if (i9 == 8) {
                int i10 = c5006a.f40642b;
                if (i10 == i) {
                    i = c5006a.f40643c;
                } else {
                    if (i10 < i) {
                        i--;
                    }
                    if (c5006a.f40643c <= i) {
                        i++;
                    }
                }
            } else {
                int i11 = c5006a.f40642b;
                if (i11 > i) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = c5006a.f40643c;
                    if (i < i11 + i12) {
                        return -1;
                    }
                    i -= i12;
                } else if (i9 == 1) {
                    i += c5006a.f40643c;
                }
            }
            i6++;
        }
        return i;
    }

    public boolean m() {
        return ((ArrayList) this.f302v).size() > 0;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        BinderC0278k binderC0278k = (BinderC0278k) this.f305y;
        AtomicBoolean atomicBoolean = binderC0278k.f368V;
        t tVar = (t) obj;
        Vu d42 = BinderC0278k.d4((N3.a) this.f301u, (C2838Wf) this.f302v);
        atomicBoolean.set(true);
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32415x8)).booleanValue();
        Su su = (Su) this.f304x;
        InterfaceC2723Pf interfaceC2723Pf = (InterfaceC2723Pf) this.f303w;
        if (!booleanValue) {
            if (interfaceC2723Pf != null) {
                try {
                    interfaceC2723Pf.b("QueryInfo generation has been disabled.");
                } catch (RemoteException e9) {
                    String concat = "QueryInfo generation has been disabled.".concat(e9.toString());
                    int i = u2.z.f41322b;
                    v2.i.c(concat);
                }
            }
            if (!((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() || d42 == null) {
                return;
            }
            su.S("QueryInfo generation has been disabled.");
            su.a(false);
            d42.a(su);
            d42.h();
            return;
        }
        try {
            try {
                if (tVar == null) {
                    if (interfaceC2723Pf != null) {
                        interfaceC2723Pf.s3(null, null, null);
                    }
                    su.a(true);
                    if (!((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() || d42 == null) {
                        return;
                    }
                    d42.a(su);
                    d42.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(tVar.f408b).optString("request_id", ""))) {
                        int i6 = u2.z.f41322b;
                        v2.i.f("The request ID is empty in request JSON.");
                        if (interfaceC2723Pf != null) {
                            interfaceC2723Pf.b("Internal error: request ID is empty in request JSON.");
                        }
                        su.S("Request ID empty");
                        su.a(false);
                        if (!((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() || d42 == null) {
                            return;
                        }
                        d42.a(su);
                        d42.h();
                        return;
                    }
                    Bundle bundle = tVar.f410d;
                    boolean z3 = binderC0278k.J;
                    String str = binderC0278k.f357K;
                    String str2 = binderC0278k.f358L;
                    if (z3 && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, binderC0278k.f359M.get());
                    }
                    if (binderC0278k.f356I && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(binderC0278k.f361O)) {
                            binderC0278k.f361O = C4835j.f39733C.f39738c.E(binderC0278k.f373v, binderC0278k.f360N.f41391n);
                        }
                        bundle.putString(str, binderC0278k.f361O);
                    }
                    if (interfaceC2723Pf != null) {
                        interfaceC2723Pf.s3(tVar.f407a, bundle, tVar.f408b);
                    }
                    su.a(true);
                    if (!((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() || d42 == null) {
                        return;
                    }
                    d42.a(su);
                    d42.h();
                } catch (JSONException e10) {
                    int i9 = u2.z.f41322b;
                    v2.i.f("Failed to create JSON object from the request string.");
                    if (interfaceC2723Pf != null) {
                        String obj2 = e10.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        interfaceC2723Pf.b(sb.toString());
                    }
                    su.d(e10);
                    su.a(false);
                    C4835j.f39733C.f39743h.d("SignalGeneratorImpl.generateSignals.onSuccess", e10);
                    if (!((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() || d42 == null) {
                        return;
                    }
                    d42.a(su);
                    d42.h();
                }
            } catch (RemoteException e11) {
                su.d(e11);
                su.a(false);
                int i10 = u2.z.f41322b;
                v2.i.d("", e11);
                C4835j.f39733C.f39743h.d("SignalGeneratorImpl.generateSignals.onSuccess", e11);
                if (!((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() || d42 == null) {
                    return;
                }
                d42.a(su);
                d42.h();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() && d42 != null) {
                d42.a(su);
                d42.h();
            }
            throw th;
        }
    }

    public void o(String str, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        G1.e eVar = (G1.e) this.f303w;
        eVar.getClass();
        com.bumptech.glide.f.h(str);
        com.bumptech.glide.f.i(value, str);
        eVar.d(str);
        com.bumptech.glide.f.f(eVar, str, value);
    }

    public void p(String method, i8.t tVar) {
        kotlin.jvm.internal.h.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (tVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(D.y.o("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC0422a.s(method)) {
            throw new IllegalArgumentException(D.y.o("method ", method, " must not have a request body.").toString());
        }
        this.f302v = method;
        this.f304x = tVar;
    }

    public C5006a q(int i, int i6, int i9) {
        C5006a c5006a = (C5006a) ((N.c) this.f301u).a();
        if (c5006a != null) {
            c5006a.f40641a = i;
            c5006a.f40642b = i6;
            c5006a.f40643c = i9;
            return c5006a;
        }
        C5006a c5006a2 = new C5006a();
        c5006a2.f40641a = i;
        c5006a2.f40642b = i6;
        c5006a2.f40643c = i9;
        return c5006a2;
    }

    public void r(C5006a c5006a) {
        ((ArrayList) this.f303w).add(c5006a);
        int i = c5006a.f40641a;
        C4522b c4522b = (C4522b) this.f304x;
        if (i == 1) {
            c4522b.N(c5006a.f40642b, c5006a.f40643c);
            return;
        }
        if (i == 2) {
            int i6 = c5006a.f40642b;
            int i9 = c5006a.f40643c;
            RecyclerView recyclerView = (RecyclerView) c4522b.f37625u;
            recyclerView.O(i6, i9, false);
            recyclerView.f5232L0 = true;
            return;
        }
        if (i == 4) {
            c4522b.M(c5006a.f40642b, c5006a.f40643c);
        } else if (i == 8) {
            c4522b.P(c5006a.f40642b, c5006a.f40643c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c5006a);
        }
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5006a c5006a = (C5006a) arrayList.get(i);
            c5006a.getClass();
            ((N.c) this.f301u).c(c5006a);
        }
        arrayList.clear();
    }

    public int t(int i, int i6) {
        int i9;
        int i10;
        ArrayList arrayList = (ArrayList) this.f303w;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5006a c5006a = (C5006a) arrayList.get(size);
            int i11 = c5006a.f40641a;
            if (i11 == 8) {
                int i12 = c5006a.f40642b;
                int i13 = c5006a.f40643c;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i < i10 || i > i9) {
                    if (i < i12) {
                        if (i6 == 1) {
                            c5006a.f40642b = i12 + 1;
                            c5006a.f40643c = i13 + 1;
                        } else if (i6 == 2) {
                            c5006a.f40642b = i12 - 1;
                            c5006a.f40643c = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i6 == 1) {
                        c5006a.f40643c = i13 + 1;
                    } else if (i6 == 2) {
                        c5006a.f40643c = i13 - 1;
                    }
                    i++;
                } else {
                    if (i6 == 1) {
                        c5006a.f40642b = i12 + 1;
                    } else if (i6 == 2) {
                        c5006a.f40642b = i12 - 1;
                    }
                    i--;
                }
            } else {
                int i14 = c5006a.f40642b;
                if (i14 <= i) {
                    if (i11 == 1) {
                        i -= c5006a.f40643c;
                    } else if (i11 == 2) {
                        i += c5006a.f40643c;
                    }
                } else if (i6 == 1) {
                    c5006a.f40642b = i14 + 1;
                } else if (i6 == 2) {
                    c5006a.f40642b = i14 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C5006a c5006a2 = (C5006a) arrayList.get(size2);
            if (c5006a2.f40641a == 8) {
                int i15 = c5006a2.f40643c;
                if (i15 == c5006a2.f40642b || i15 < 0) {
                    arrayList.remove(size2);
                    ((N.c) this.f301u).c(c5006a2);
                }
            } else if (c5006a2.f40643c <= 0) {
                arrayList.remove(size2);
                ((N.c) this.f301u).c(c5006a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f300n) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f301u) + ", mProviderPackage: " + ((String) this.f302v) + ", mQuery: " + ((String) this.f303w) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f304x;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i6 = 0; i6 < list2.size(); i6++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i6), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.D8)).booleanValue()) {
            C4835j.f39733C.f39743h.e("SignalGeneratorImpl.generateSignals", th);
        } else {
            C4835j.f39733C.f39743h.d("SignalGeneratorImpl.generateSignals", th);
        }
        Vu d42 = BinderC0278k.d4((N3.a) this.f301u, (C2838Wf) this.f302v);
        if (((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue() && d42 != null) {
            Su su = (Su) this.f304x;
            su.d(th);
            su.a(false);
            d42.a(su);
            d42.h();
        }
        InterfaceC2723Pf interfaceC2723Pf = (InterfaceC2723Pf) this.f303w;
        if (interfaceC2723Pf == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            interfaceC2723Pf.b(message);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.d("", e9);
        }
    }

    public /* synthetic */ N(boolean z3) {
        this.f300n = 8;
    }

    public N(BinderC0278k binderC0278k, N3.a aVar, C2838Wf c2838Wf, InterfaceC2723Pf interfaceC2723Pf, Su su) {
        this.f300n = 0;
        this.f301u = aVar;
        this.f302v = c2838Wf;
        this.f303w = interfaceC2723Pf;
        this.f304x = su;
        Objects.requireNonNull(binderC0278k);
        this.f305y = binderC0278k;
    }

    public N(Drawable.Callback callback) {
        this.f300n = 4;
        this.f301u = new c1.i();
        this.f302v = new HashMap();
        this.f303w = new HashMap();
        this.f305y = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC4599c.b("LottieDrawable must be inside of a view for images to work.");
            this.f304x = null;
        } else {
            this.f304x = ((View) callback).getContext().getAssets();
        }
    }

    public N(kotlin.jvm.internal.d dVar, PermissionsActivity.f fVar, PermissionsActivity.e eVar, PermissionsActivity.g gVar) {
        this.f300n = 3;
        this.f301u = dVar;
        this.f302v = fVar;
        this.f303w = eVar;
        this.f304x = gVar;
    }

    public N(R3.b bVar, R3.c cVar) {
        this.f300n = 2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (R3.j jVar : bVar.f2716c) {
            int i = jVar.f2739c;
            boolean z3 = i == 0;
            int i6 = jVar.f2738b;
            R3.r rVar = jVar.f2737a;
            if (z3) {
                if (i6 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i == 2) {
                hashSet3.add(rVar);
            } else if (i6 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!bVar.f2720g.isEmpty()) {
            hashSet.add(R3.r.a(Z3.a.class));
        }
        this.f301u = Collections.unmodifiableSet(hashSet);
        this.f302v = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f303w = Collections.unmodifiableSet(hashSet4);
        this.f304x = Collections.unmodifiableSet(hashSet5);
        this.f305y = cVar;
    }

    public N(String str, String str2, String str3, List list) {
        this.f300n = 1;
        str.getClass();
        this.f301u = str;
        str2.getClass();
        this.f302v = str2;
        this.f303w = str3;
        list.getClass();
        this.f304x = list;
        this.f305y = str + "-" + str2 + "-" + str3;
    }

    public N(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f300n = 9;
        this.f304x = new ArrayDeque();
        this.f301u = sharedPreferences;
        this.f302v = "topic_operation_queue";
        this.f303w = ",";
        this.f305y = scheduledThreadPoolExecutor;
    }

    public N(C4522b c4522b) {
        this.f300n = 11;
        this.f301u = new N.c(30);
        this.f302v = new ArrayList();
        this.f303w = new ArrayList();
        this.f304x = c4522b;
        this.f305y = new C4523c(29, this);
    }

    public N() {
        this.f300n = 8;
        this.f305y = v7.q.f41443n;
        this.f302v = "GET";
        this.f303w = new G1.e(3);
    }

    public N(l8.d taskRunner) {
        this.f300n = 10;
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f301u = taskRunner;
        this.f304x = p8.n.f39868a;
        this.f305y = C4857c.f39825a;
    }
}
