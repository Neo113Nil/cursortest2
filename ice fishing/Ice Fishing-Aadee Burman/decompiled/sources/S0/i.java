package S0;

import L3.F;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import android.util.JsonWriter;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.u;
import androidx.work.impl.WorkDatabase_Impl;
import b.C0508b;
import b.InterfaceC0510d;
import b0.C0511a;
import b0.C0512b;
import com.google.android.gms.internal.ads.C2504Ch;
import com.google.android.gms.internal.consent_sdk.C4316f;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4348n;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.O;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import k.AbstractC4615b;
import k.C4619f;
import k.InterfaceC4614a;
import l.MenuC4640B;
import l.t;
import p.BinderC4815e;
import u0.C5059i;

/* loaded from: classes.dex */
public final class i implements a3, InterfaceC4614a, v2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2787n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2788u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2789v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2790w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2791x;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2787n = i;
        this.f2788u = obj;
        this.f2789v = obj2;
        this.f2790w = obj3;
        this.f2791x = obj4;
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((s.k) this.f2789v).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // k.InterfaceC4614a
    public boolean b(AbstractC4615b abstractC4615b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2788u).onActionItemClicked(e(abstractC4615b), new t((Context) this.f2789v, (I.a) menuItem));
    }

    @Override // k.InterfaceC4614a
    public boolean c(AbstractC4615b abstractC4615b, l.m mVar) {
        C4619f e9 = e(abstractC4615b);
        s.k kVar = (s.k) this.f2791x;
        Menu menu = (Menu) kVar.getOrDefault(mVar, null);
        if (menu == null) {
            menu = new MenuC4640B((Context) this.f2789v, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f2788u).onPrepareActionMode(e9, menu);
    }

    @Override // v2.e
    public void d(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f2788u);
        jsonWriter.name("verb").value((String) this.f2789v);
        jsonWriter.endObject();
        v2.f.d(jsonWriter, (Map) this.f2790w);
        byte[] bArr = (byte[]) this.f2791x;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public C4619f e(AbstractC4615b abstractC4615b) {
        ArrayList arrayList = (ArrayList) this.f2790w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4619f c4619f = (C4619f) arrayList.get(i);
            if (c4619f != null && c4619f.f38500b == abstractC4615b) {
                return c4619f;
            }
        }
        C4619f c4619f2 = new C4619f((Context) this.f2789v, abstractC4615b);
        arrayList.add(c4619f2);
        return c4619f2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public /* bridge */ /* synthetic */ Object f() {
        switch (this.f2787n) {
            case 4:
                return l();
            default:
                return new W0((C4320g) ((Z2) this.f2788u).f(), ((C2504Ch) this.f2789v).f(), (C4348n) ((Z2) this.f2790w).f(), (C4387x) ((Z2) this.f2791x).f());
        }
    }

    @Override // k.InterfaceC4614a
    public boolean g(AbstractC4615b abstractC4615b, l.m mVar) {
        C4619f e9 = e(abstractC4615b);
        s.k kVar = (s.k) this.f2791x;
        Menu menu = (Menu) kVar.getOrDefault(mVar, null);
        if (menu == null) {
            menu = new MenuC4640B((Context) this.f2789v, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f2788u).onCreateActionMode(e9, menu);
    }

    public g h(j jVar) {
        C5059i a9 = C5059i.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = jVar.f2792a;
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        a9.g(2, jVar.f2793b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2788u;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int m9 = F.m(m4, "work_spec_id");
            int m10 = F.m(m4, "generation");
            int m11 = F.m(m4, "system_id");
            g gVar = null;
            String string = null;
            if (m4.moveToFirst()) {
                if (!m4.isNull(m9)) {
                    string = m4.getString(m9);
                }
                gVar = new g(string, m4.getInt(m10), m4.getInt(m11));
            }
            return gVar;
        } finally {
            m4.close();
            a9.j();
        }
    }

    @Override // k.InterfaceC4614a
    public void i(AbstractC4615b abstractC4615b) {
        ((ActionMode.Callback) this.f2788u).onDestroyActionMode(e(abstractC4615b));
    }

    public void j(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2788u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2789v).q(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void k(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f2788u) {
            try {
                try {
                    ((C0508b) ((InterfaceC0510d) this.f2789v)).w0((BinderC4815e) this.f2790w, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n l() {
        return new n((O) ((Z2) this.f2788u).f(), ((C4316f) this.f2789v).a(), (C4320g) ((Z2) this.f2790w).f(), (C4387x) ((Z2) this.f2791x).f(), 5);
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f2787n = 0;
        this.f2788u = workDatabase_Impl;
        this.f2789v = new b(workDatabase_Impl, 2);
        this.f2790w = new h(workDatabase_Impl, 0);
        this.f2791x = new h(workDatabase_Impl, 1);
    }

    public i(Context context, Z2.e eVar) {
        this.f2787n = 2;
        kotlin.jvm.internal.h.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        Q0.a aVar = new Q0.a(applicationContext, eVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext2, "context.applicationContext");
        Q0.a aVar2 = new Q0.a(applicationContext2, eVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext3, "context.applicationContext");
        String str = Q0.j.f2641a;
        Q0.i iVar = new Q0.i(applicationContext3, eVar);
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext4, "context.applicationContext");
        Q0.a aVar3 = new Q0.a(applicationContext4, eVar, 2);
        this.f2788u = aVar;
        this.f2789v = aVar2;
        this.f2790w = iVar;
        this.f2791x = aVar3;
    }

    public i() {
        this.f2787n = 1;
        this.f2788u = new N.c(10);
        this.f2789v = new s.k();
        this.f2790w = new ArrayList();
        this.f2791x = new HashSet();
    }

    public i(Typeface typeface, C0512b c0512b) {
        int i;
        int i6;
        int i9;
        int i10;
        this.f2787n = 3;
        this.f2791x = typeface;
        this.f2788u = c0512b;
        this.f2790w = new androidx.emoji2.text.r(1024);
        int a9 = c0512b.a(6);
        if (a9 != 0) {
            int i11 = a9 + c0512b.f2042n;
            i = ((ByteBuffer) c0512b.f2045w).getInt(((ByteBuffer) c0512b.f2045w).getInt(i11) + i11);
        } else {
            i = 0;
        }
        this.f2789v = new char[i * 2];
        int a10 = c0512b.a(6);
        if (a10 != 0) {
            int i12 = a10 + c0512b.f2042n;
            i6 = ((ByteBuffer) c0512b.f2045w).getInt(((ByteBuffer) c0512b.f2045w).getInt(i12) + i12);
        } else {
            i6 = 0;
        }
        for (int i13 = 0; i13 < i6; i13++) {
            u uVar = new u(this, i13);
            C0511a b9 = uVar.b();
            int a11 = b9.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b9.f2045w).getInt(a11 + b9.f2042n) : 0, (char[]) this.f2789v, i13 * 2);
            C0511a b10 = uVar.b();
            int a12 = b10.a(16);
            if (a12 != 0) {
                int i14 = a12 + b10.f2042n;
                i9 = ((ByteBuffer) b10.f2045w).getInt(((ByteBuffer) b10.f2045w).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            F.d("invalid metadata codepoint length", i9 > 0);
            C0511a b11 = uVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i15 = a13 + b11.f2042n;
                i10 = ((ByteBuffer) b11.f2045w).getInt(((ByteBuffer) b11.f2045w).getInt(i15) + i15);
            } else {
                i10 = 0;
            }
            ((androidx.emoji2.text.r) this.f2790w).a(uVar, 0, i10 - 1);
        }
    }

    public i(InterfaceC0510d interfaceC0510d, BinderC4815e binderC4815e, ComponentName componentName) {
        this.f2787n = 7;
        this.f2788u = new Object();
        this.f2789v = interfaceC0510d;
        this.f2790w = binderC4815e;
        this.f2791x = componentName;
    }

    public i(Context context, ActionMode.Callback callback) {
        this.f2787n = 6;
        this.f2789v = context;
        this.f2788u = callback;
        this.f2790w = new ArrayList();
        this.f2791x = new s.k();
    }
}
