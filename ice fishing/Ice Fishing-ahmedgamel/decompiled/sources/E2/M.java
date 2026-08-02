package E2;

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
import b4.InterfaceC0524a;
import com.google.android.gms.internal.ads.AbstractC2653Ka;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2861Wf;
import com.google.android.gms.internal.ads.InterfaceC2743Pf;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Vu;
import com.onesignal.core.activities.PermissionsActivity;
import d2.InterfaceC4460b;
import e4.InterfaceC4481a;
import h.C4543G;
import h0.AbstractC4559b;
import i2.InterfaceC4590d;
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
import l1.AbstractC4668c;
import org.json.JSONException;
import org.json.JSONObject;
import p8.C4857c;
import r2.C4900e;
import r2.C4906k;
import t0.C5005a;
import t7.InterfaceC5045a;
import u7.InterfaceC5079e;

/* loaded from: classes.dex */
public final class M implements KD, T3.c, InterfaceC5079e, InterfaceC4460b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f760n;

    /* renamed from: u, reason: collision with root package name */
    public Object f761u;

    /* renamed from: v, reason: collision with root package name */
    public Object f762v;

    /* renamed from: w, reason: collision with root package name */
    public Object f763w;

    /* renamed from: x, reason: collision with root package name */
    public Object f764x;

    /* renamed from: y, reason: collision with root package name */
    public Object f765y;

    public /* synthetic */ M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f760n = i;
        this.f761u = obj;
        this.f762v = obj2;
        this.f763w = obj3;
        this.f764x = obj4;
        this.f765y = obj5;
    }

    public static M i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        M m9 = new M(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) m9.f764x)) {
            try {
                ((ArrayDeque) m9.f764x).clear();
                String string = ((SharedPreferences) m9.f761u).getString((String) m9.f762v, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) m9.f763w)) {
                    String[] split = string.split((String) m9.f763w, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) m9.f764x).add(str);
                        }
                    }
                    return m9;
                }
                return m9;
            } finally {
            }
        }
    }

    @Override // T3.c
    public Object a(Class cls) {
        if (!((Set) this.f761u).contains(T3.r.a(cls))) {
            throw new B0.c("Attempting to request an undeclared dependency " + cls + com.anythink.core.common.d.j.f13164z);
        }
        Object a9 = ((T3.c) this.f765y).a(cls);
        if (!cls.equals(InterfaceC0524a.class)) {
            return a9;
        }
        return new T3.s();
    }

    @Override // T3.c
    public Object b(T3.r rVar) {
        if (((Set) this.f761u).contains(rVar)) {
            return ((T3.c) this.f765y).b(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency " + rVar + com.anythink.core.common.d.j.f13164z);
    }

    @Override // T3.c
    public InterfaceC4481a c(T3.r rVar) {
        if (((Set) this.f762v).contains(rVar)) {
            return ((T3.c) this.f765y).c(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // T3.c
    public InterfaceC4481a d(T3.r rVar) {
        if (((Set) this.f764x).contains(rVar)) {
            return ((T3.c) this.f765y).d(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    @Override // T3.c
    public InterfaceC4481a e(Class cls) {
        return c(T3.r.a(cls));
    }

    @Override // T3.c
    public Set f(T3.r rVar) {
        if (((Set) this.f763w).contains(rVar)) {
            return ((T3.c) this.f765y).f(rVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    public boolean g(int i) {
        ArrayList arrayList = (ArrayList) this.f763w;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C5005a c5005a = (C5005a) arrayList.get(i4);
            int i6 = c5005a.f40695a;
            if (i6 != 8) {
                if (i6 == 1) {
                    int i9 = c5005a.f40696b;
                    int i10 = c5005a.f40697c + i9;
                    while (i9 < i10) {
                        if (l(i9, i4 + 1) == i) {
                            return true;
                        }
                        i9++;
                    }
                } else {
                    continue;
                }
            } else {
                if (l(c5005a.f40697c, i4 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        return new g2.b((Executor) ((InterfaceC5045a) this.f761u).get(), (c2.e) ((InterfaceC5045a) this.f762v).get(), (h2.c) ((b3.e) this.f763w).get(), (InterfaceC4590d) ((InterfaceC5045a) this.f764x).get(), (j2.c) ((InterfaceC5045a) this.f765y).get());
    }

    @Override // u7.InterfaceC5079e
    public Object getValue() {
        S s9 = (S) this.f765y;
        if (s9 != null) {
            return s9;
        }
        b3.e eVar = new b3.e((X) ((PermissionsActivity.f) this.f762v).invoke(), (V) ((PermissionsActivity.e) this.f763w).invoke(), (AbstractC4559b) ((PermissionsActivity.g) this.f764x).invoke());
        Class a9 = ((kotlin.jvm.internal.d) this.f761u).a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        S u6 = eVar.u(a9);
        this.f765y = u6;
        return u6;
    }

    public void h() {
        ArrayList arrayList = (ArrayList) this.f763w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C4900e) this.f764x).a((C5005a) arrayList.get(i));
        }
        s(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f762v;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C5005a c5005a = (C5005a) arrayList2.get(i4);
            int i6 = c5005a.f40695a;
            C4900e c4900e = (C4900e) this.f764x;
            if (i6 == 1) {
                c4900e.a(c5005a);
                c4900e.f(c5005a.f40696b, c5005a.f40697c);
            } else if (i6 == 2) {
                c4900e.a(c5005a);
                int i9 = c5005a.f40696b;
                int i10 = c5005a.f40697c;
                RecyclerView recyclerView = (RecyclerView) c4900e.f40152n;
                recyclerView.O(i9, i10, true);
                recyclerView.f5190G0 = true;
                recyclerView.f5184D0.f40624c += i10;
            } else if (i6 == 4) {
                c4900e.a(c5005a);
                c4900e.d(c5005a.f40696b, c5005a.f40697c);
            } else if (i6 == 8) {
                c4900e.a(c5005a);
                c4900e.g(c5005a.f40696b, c5005a.f40697c);
            }
        }
        s(arrayList2);
    }

    public void j(C5005a c5005a) {
        int i;
        int i4 = c5005a.f40695a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int t6 = t(c5005a.f40696b, i4);
        int i6 = c5005a.f40696b;
        int i9 = c5005a.f40695a;
        if (i9 == 2) {
            i = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c5005a);
            }
            i = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < c5005a.f40697c; i11++) {
            int t9 = t((i * i11) + c5005a.f40696b, c5005a.f40695a);
            int i12 = c5005a.f40695a;
            if (i12 == 2 ? t9 != t6 : !(i12 == 4 && t9 == t6 + 1)) {
                C5005a q8 = q(i12, t6, i10);
                k(q8, i6);
                ((N.c) this.f761u).c(q8);
                if (c5005a.f40695a == 4) {
                    i6 += i10;
                }
                i10 = 1;
                t6 = t9;
            } else {
                i10++;
            }
        }
        ((N.c) this.f761u).c(c5005a);
        if (i10 > 0) {
            C5005a q9 = q(c5005a.f40695a, t6, i10);
            k(q9, i6);
            ((N.c) this.f761u).c(q9);
        }
    }

    public void k(C5005a c5005a, int i) {
        C4900e c4900e = (C4900e) this.f764x;
        c4900e.a(c5005a);
        int i4 = c5005a.f40695a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c4900e.d(i, c5005a.f40697c);
        } else {
            int i6 = c5005a.f40697c;
            RecyclerView recyclerView = (RecyclerView) c4900e.f40152n;
            recyclerView.O(i, i6, true);
            recyclerView.f5190G0 = true;
            recyclerView.f5184D0.f40624c += i6;
        }
    }

    public int l(int i, int i4) {
        ArrayList arrayList = (ArrayList) this.f763w;
        int size = arrayList.size();
        while (i4 < size) {
            C5005a c5005a = (C5005a) arrayList.get(i4);
            int i6 = c5005a.f40695a;
            if (i6 == 8) {
                int i9 = c5005a.f40696b;
                if (i9 == i) {
                    i = c5005a.f40697c;
                } else {
                    if (i9 < i) {
                        i--;
                    }
                    if (c5005a.f40697c <= i) {
                        i++;
                    }
                }
            } else {
                int i10 = c5005a.f40696b;
                if (i10 > i) {
                    continue;
                } else if (i6 == 2) {
                    int i11 = c5005a.f40697c;
                    if (i < i10 + i11) {
                        return -1;
                    }
                    i -= i11;
                } else if (i6 == 1) {
                    i += c5005a.f40697c;
                }
            }
            i4++;
        }
        return i;
    }

    public boolean m() {
        return ((ArrayList) this.f762v).size() > 0;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        BinderC0314k binderC0314k = (BinderC0314k) this.f765y;
        AtomicBoolean atomicBoolean = binderC0314k.f828V;
        s sVar = (s) obj;
        Vu d42 = BinderC0314k.d4((P3.a) this.f761u, (C2861Wf) this.f762v);
        atomicBoolean.set(true);
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33194x8)).booleanValue();
        Su su = (Su) this.f764x;
        InterfaceC2743Pf interfaceC2743Pf = (InterfaceC2743Pf) this.f763w;
        if (!booleanValue) {
            if (interfaceC2743Pf != null) {
                try {
                    interfaceC2743Pf.b("QueryInfo generation has been disabled.");
                } catch (RemoteException e9) {
                    String concat = "QueryInfo generation has been disabled.".concat(e9.toString());
                    int i = w2.z.f41712b;
                    x2.i.c(concat);
                }
            }
            if (!((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() || d42 == null) {
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
                if (sVar == null) {
                    if (interfaceC2743Pf != null) {
                        interfaceC2743Pf.l3(null, null, null);
                    }
                    su.a(true);
                    if (!((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() || d42 == null) {
                        return;
                    }
                    d42.a(su);
                    d42.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(sVar.f867b).optString("request_id", ""))) {
                        int i4 = w2.z.f41712b;
                        x2.i.f("The request ID is empty in request JSON.");
                        if (interfaceC2743Pf != null) {
                            interfaceC2743Pf.b("Internal error: request ID is empty in request JSON.");
                        }
                        su.S("Request ID empty");
                        su.a(false);
                        if (!((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() || d42 == null) {
                            return;
                        }
                        d42.a(su);
                        d42.h();
                        return;
                    }
                    Bundle bundle = sVar.f869d;
                    boolean z6 = binderC0314k.J;
                    String str = binderC0314k.f817K;
                    String str2 = binderC0314k.f818L;
                    if (z6 && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, binderC0314k.f819M.get());
                    }
                    if (binderC0314k.f816I && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(binderC0314k.f821O)) {
                            binderC0314k.f821O = C4906k.f40186C.f40191c.E(binderC0314k.f833v, binderC0314k.f820N.f41845n);
                        }
                        bundle.putString(str, binderC0314k.f821O);
                    }
                    if (interfaceC2743Pf != null) {
                        interfaceC2743Pf.l3(sVar.f866a, bundle, sVar.f867b);
                    }
                    su.a(true);
                    if (!((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() || d42 == null) {
                        return;
                    }
                    d42.a(su);
                    d42.h();
                } catch (JSONException e10) {
                    int i6 = w2.z.f41712b;
                    x2.i.f("Failed to create JSON object from the request string.");
                    if (interfaceC2743Pf != null) {
                        String obj2 = e10.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        interfaceC2743Pf.b(sb.toString());
                    }
                    su.d(e10);
                    su.a(false);
                    C4906k.f40186C.f40196h.d("SignalGeneratorImpl.generateSignals.onSuccess", e10);
                    if (!((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() || d42 == null) {
                        return;
                    }
                    d42.a(su);
                    d42.h();
                }
            } catch (RemoteException e11) {
                su.d(e11);
                su.a(false);
                int i9 = w2.z.f41712b;
                x2.i.d("", e11);
                C4906k.f40186C.f40196h.d("SignalGeneratorImpl.generateSignals.onSuccess", e11);
                if (!((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() || d42 == null) {
                    return;
                }
                d42.a(su);
                d42.h();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() && d42 != null) {
                d42.a(su);
                d42.h();
            }
            throw th;
        }
    }

    public void o(String str, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        I1.d dVar = (I1.d) this.f763w;
        dVar.getClass();
        X2.a.k(str);
        X2.a.l(value, str);
        dVar.g(str);
        X2.a.b(dVar, str, value);
    }

    public void p(String method, i8.t tVar) {
        kotlin.jvm.internal.h.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (tVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(D.x.l("method ", method, " must have a request body.").toString());
            }
        } else if (!X2.a.p(method)) {
            throw new IllegalArgumentException(D.x.l("method ", method, " must not have a request body.").toString());
        }
        this.f762v = method;
        this.f764x = tVar;
    }

    public C5005a q(int i, int i4, int i6) {
        C5005a c5005a = (C5005a) ((N.c) this.f761u).a();
        if (c5005a != null) {
            c5005a.f40695a = i;
            c5005a.f40696b = i4;
            c5005a.f40697c = i6;
            return c5005a;
        }
        C5005a c5005a2 = new C5005a();
        c5005a2.f40695a = i;
        c5005a2.f40696b = i4;
        c5005a2.f40697c = i6;
        return c5005a2;
    }

    public void r(C5005a c5005a) {
        ((ArrayList) this.f763w).add(c5005a);
        int i = c5005a.f40695a;
        C4900e c4900e = (C4900e) this.f764x;
        if (i == 1) {
            c4900e.f(c5005a.f40696b, c5005a.f40697c);
            return;
        }
        if (i == 2) {
            int i4 = c5005a.f40696b;
            int i6 = c5005a.f40697c;
            RecyclerView recyclerView = (RecyclerView) c4900e.f40152n;
            recyclerView.O(i4, i6, false);
            recyclerView.f5190G0 = true;
            return;
        }
        if (i == 4) {
            c4900e.d(c5005a.f40696b, c5005a.f40697c);
        } else if (i == 8) {
            c4900e.g(c5005a.f40696b, c5005a.f40697c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c5005a);
        }
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5005a c5005a = (C5005a) arrayList.get(i);
            c5005a.getClass();
            ((N.c) this.f761u).c(c5005a);
        }
        arrayList.clear();
    }

    public int t(int i, int i4) {
        int i6;
        int i9;
        ArrayList arrayList = (ArrayList) this.f763w;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5005a c5005a = (C5005a) arrayList.get(size);
            int i10 = c5005a.f40695a;
            if (i10 == 8) {
                int i11 = c5005a.f40696b;
                int i12 = c5005a.f40697c;
                if (i11 < i12) {
                    i9 = i11;
                    i6 = i12;
                } else {
                    i6 = i11;
                    i9 = i12;
                }
                if (i < i9 || i > i6) {
                    if (i < i11) {
                        if (i4 == 1) {
                            c5005a.f40696b = i11 + 1;
                            c5005a.f40697c = i12 + 1;
                        } else if (i4 == 2) {
                            c5005a.f40696b = i11 - 1;
                            c5005a.f40697c = i12 - 1;
                        }
                    }
                } else if (i9 == i11) {
                    if (i4 == 1) {
                        c5005a.f40697c = i12 + 1;
                    } else if (i4 == 2) {
                        c5005a.f40697c = i12 - 1;
                    }
                    i++;
                } else {
                    if (i4 == 1) {
                        c5005a.f40696b = i11 + 1;
                    } else if (i4 == 2) {
                        c5005a.f40696b = i11 - 1;
                    }
                    i--;
                }
            } else {
                int i13 = c5005a.f40696b;
                if (i13 <= i) {
                    if (i10 == 1) {
                        i -= c5005a.f40697c;
                    } else if (i10 == 2) {
                        i += c5005a.f40697c;
                    }
                } else if (i4 == 1) {
                    c5005a.f40696b = i13 + 1;
                } else if (i4 == 2) {
                    c5005a.f40696b = i13 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C5005a c5005a2 = (C5005a) arrayList.get(size2);
            if (c5005a2.f40695a == 8) {
                int i14 = c5005a2.f40697c;
                if (i14 == c5005a2.f40696b || i14 < 0) {
                    arrayList.remove(size2);
                    ((N.c) this.f761u).c(c5005a2);
                }
            } else if (c5005a2.f40697c <= 0) {
                arrayList.remove(size2);
                ((N.c) this.f761u).c(c5005a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f760n) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f761u) + ", mProviderPackage: " + ((String) this.f762v) + ", mQuery: " + ((String) this.f763w) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f764x;
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

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.D8)).booleanValue()) {
            C4906k.f40186C.f40196h.e("SignalGeneratorImpl.generateSignals", th);
        } else {
            C4906k.f40186C.f40196h.d("SignalGeneratorImpl.generateSignals", th);
        }
        Vu d42 = BinderC0314k.d4((P3.a) this.f761u, (C2861Wf) this.f762v);
        if (((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue() && d42 != null) {
            Su su = (Su) this.f764x;
            su.d(th);
            su.a(false);
            d42.a(su);
            d42.h();
        }
        InterfaceC2743Pf interfaceC2743Pf = (InterfaceC2743Pf) this.f763w;
        if (interfaceC2743Pf == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            interfaceC2743Pf.b(message);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.d("", e9);
        }
    }

    public /* synthetic */ M(boolean z6) {
        this.f760n = 7;
    }

    public M(BinderC0314k binderC0314k, P3.a aVar, C2861Wf c2861Wf, InterfaceC2743Pf interfaceC2743Pf, Su su) {
        this.f760n = 0;
        this.f761u = aVar;
        this.f762v = c2861Wf;
        this.f763w = interfaceC2743Pf;
        this.f764x = su;
        Objects.requireNonNull(binderC0314k);
        this.f765y = binderC0314k;
    }

    public M(Drawable.Callback callback) {
        this.f760n = 4;
        this.f761u = new LP(1);
        this.f762v = new HashMap();
        this.f763w = new HashMap();
        this.f765y = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC4668c.b("LottieDrawable must be inside of a view for images to work.");
            this.f764x = null;
        } else {
            this.f764x = ((View) callback).getContext().getAssets();
        }
    }

    public M(kotlin.jvm.internal.d dVar, PermissionsActivity.f fVar, PermissionsActivity.e eVar, PermissionsActivity.g gVar) {
        this.f760n = 3;
        this.f761u = dVar;
        this.f762v = fVar;
        this.f763w = eVar;
        this.f764x = gVar;
    }

    public M(T3.b bVar, T3.c cVar) {
        this.f760n = 2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (T3.j jVar : bVar.f3171c) {
            int i = jVar.f3194c;
            boolean z6 = i == 0;
            int i4 = jVar.f3193b;
            T3.r rVar = jVar.f3192a;
            if (z6) {
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
        if (!bVar.f3175g.isEmpty()) {
            hashSet.add(T3.r.a(InterfaceC0524a.class));
        }
        this.f761u = Collections.unmodifiableSet(hashSet);
        this.f762v = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f763w = Collections.unmodifiableSet(hashSet4);
        this.f764x = Collections.unmodifiableSet(hashSet5);
        this.f765y = cVar;
    }

    public M(String str, String str2, String str3, List list) {
        this.f760n = 1;
        str.getClass();
        this.f761u = str;
        str2.getClass();
        this.f762v = str2;
        this.f763w = str3;
        list.getClass();
        this.f764x = list;
        this.f765y = str + "-" + str2 + "-" + str3;
    }

    public M(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f760n = 9;
        this.f764x = new ArrayDeque();
        this.f761u = sharedPreferences;
        this.f762v = "topic_operation_queue";
        this.f763w = ",";
        this.f765y = scheduledThreadPoolExecutor;
    }

    public M(C4900e c4900e) {
        this.f760n = 11;
        this.f761u = new N.c(30);
        this.f762v = new ArrayList();
        this.f763w = new ArrayList();
        this.f764x = c4900e;
        this.f765y = new C4543G(this);
    }

    public M() {
        this.f760n = 7;
        this.f765y = v7.q.f41222n;
        this.f762v = "GET";
        this.f763w = new I1.d(3);
    }

    public M(l8.d taskRunner) {
        this.f760n = 10;
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f761u = taskRunner;
        this.f764x = p8.n.f39915a;
        this.f765y = C4857c.f39872a;
    }
}
