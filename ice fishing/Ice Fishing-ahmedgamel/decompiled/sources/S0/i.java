package S0;

import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import android.util.JsonWriter;
import androidx.work.impl.WorkDatabase_Impl;
import b.C0512b;
import b.InterfaceC0514d;
import com.google.android.gms.internal.ads.C2524Ch;
import com.google.android.gms.internal.consent_sdk.C4339f;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4371n;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.O;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import d2.InterfaceC4460b;
import f6.C4522a;
import i2.InterfaceC4590d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import p.BinderC4819e;
import t7.InterfaceC5045a;
import u0.C5060i;

/* loaded from: classes.dex */
public final class i implements a3, InterfaceC4460b, x2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2916n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2917u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2918v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2919w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2920x;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2916n = i;
        this.f2917u = obj;
        this.f2918v = obj2;
        this.f2919w = obj3;
        this.f2920x = obj4;
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((s.k) this.f2918v).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public Object b(final C4522a c4522a, String str) {
        return ((ConcurrentHashMap) this.f2917u).computeIfAbsent(str, new Function() { // from class: a7.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                S0.i iVar = S0.i.this;
                iVar.getClass();
                int i = Y6.a.f3909e;
                C4522a c4522a2 = c4522a;
                if (c4522a2 == null) {
                    c4522a2 = C4522a.f37475w;
                }
                Object apply = ((Function) iVar.f2920x).apply(Y6.a.a(str2, null, null, c4522a2));
                synchronized (iVar.f2918v) {
                    ((Set) iVar.f2919w).add(apply);
                }
                return apply;
            }
        });
    }

    public g c(j jVar) {
        C5060i a9 = C5060i.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = jVar.f2921a;
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        a9.g(2, jVar.f2922b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2917u;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int c9 = com.bumptech.glide.e.c(m9, "work_spec_id");
            int c10 = com.bumptech.glide.e.c(m9, "generation");
            int c11 = com.bumptech.glide.e.c(m9, "system_id");
            g gVar = null;
            String string = null;
            if (m9.moveToFirst()) {
                if (!m9.isNull(c9)) {
                    string = m9.getString(c9);
                }
                gVar = new g(string, m9.getInt(c10), m9.getInt(c11));
            }
            return gVar;
        } finally {
            m9.close();
            a9.j();
        }
    }

    public void d(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2917u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2918v).q(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void e(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f2917u) {
            try {
                try {
                    ((C0512b) ((InterfaceC0514d) this.f2918v)).t0((BinderC4819e) this.f2919w, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public /* bridge */ /* synthetic */ Object f() {
        switch (this.f2916n) {
            case 4:
                return g();
            default:
                return new W0((C4343g) ((Z2) this.f2917u).f(), ((C2524Ch) this.f2918v).f(), (C4371n) ((Z2) this.f2919w).f(), (C4410x) ((Z2) this.f2920x).f());
        }
    }

    public n g() {
        return new n((O) ((Z2) this.f2917u).f(), ((C4339f) this.f2918v).a(), (C4343g) ((Z2) this.f2919w).f(), (C4410x) ((Z2) this.f2920x).f(), 5);
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        return new h2.j((Executor) ((InterfaceC5045a) this.f2917u).get(), (InterfaceC4590d) ((InterfaceC5045a) this.f2918v).get(), (h2.c) ((b3.e) this.f2919w).get(), (j2.c) ((InterfaceC5045a) this.f2920x).get());
    }

    @Override // x2.e
    public void j(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f2917u);
        jsonWriter.name("verb").value((String) this.f2918v);
        jsonWriter.endObject();
        x2.f.d(jsonWriter, (Map) this.f2919w);
        byte[] bArr = (byte[]) this.f2920x;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f2916n = 0;
        this.f2917u = workDatabase_Impl;
        this.f2918v = new b(workDatabase_Impl, 2);
        this.f2919w = new h(workDatabase_Impl, 0);
        this.f2920x = new h(workDatabase_Impl, 1);
    }

    public i(Context context, b3.e eVar) {
        this.f2916n = 2;
        kotlin.jvm.internal.h.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        Q0.a aVar = new Q0.a(applicationContext, eVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext2, "context.applicationContext");
        Q0.a aVar2 = new Q0.a(applicationContext2, eVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext3, "context.applicationContext");
        String str = Q0.j.f2476a;
        Q0.i iVar = new Q0.i(applicationContext3, eVar);
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext4, "context.applicationContext");
        Q0.a aVar3 = new Q0.a(applicationContext4, eVar, 2);
        this.f2917u = aVar;
        this.f2918v = aVar2;
        this.f2919w = iVar;
        this.f2920x = aVar3;
    }

    public i() {
        this.f2916n = 1;
        this.f2917u = new N.c(10);
        this.f2918v = new s.k();
        this.f2919w = new ArrayList();
        this.f2920x = new HashSet();
    }

    public i(Function function) {
        this.f2916n = 3;
        this.f2917u = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f2918v = new Object();
        this.f2919w = Collections.newSetFromMap(new IdentityHashMap());
        this.f2920x = function;
    }

    public i(InterfaceC0514d interfaceC0514d, BinderC4819e binderC4819e, ComponentName componentName) {
        this.f2916n = 7;
        this.f2917u = new Object();
        this.f2918v = interfaceC0514d;
        this.f2919w = binderC4819e;
        this.f2920x = componentName;
    }
}
