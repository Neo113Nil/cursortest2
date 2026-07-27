package m;

import android.app.Application;
import android.content.Context;
import b2.InterfaceC0515b;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4336k;
import com.google.android.gms.internal.consent_sdk.C4344m;
import com.google.android.gms.internal.consent_sdk.C4352o;
import com.google.android.gms.internal.consent_sdk.C4386w2;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import g2.InterfaceC4526c;
import g2.InterfaceC4527d;
import g3.C4528a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import t7.InterfaceC5044a;

/* loaded from: classes.dex */
public final class b1 implements a3, InterfaceC0515b {

    /* renamed from: n, reason: collision with root package name */
    public Object f39121n;

    /* renamed from: u, reason: collision with root package name */
    public Object f39122u;

    /* renamed from: v, reason: collision with root package name */
    public Object f39123v;

    /* renamed from: w, reason: collision with root package name */
    public Object f39124w;

    /* renamed from: x, reason: collision with root package name */
    public Object f39125x;

    /* renamed from: y, reason: collision with root package name */
    public Object f39126y;

    /* renamed from: z, reason: collision with root package name */
    public Object f39127z;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f39121n = obj;
        this.f39122u = obj2;
        this.f39123v = obj3;
        this.f39124w = obj4;
        this.f39125x = obj5;
        this.f39126y = obj6;
        this.f39127z = obj7;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object f() {
        Application application = (Application) ((C4386w2) this.f39121n).f35781u;
        return new C4336k(application, (com.google.android.gms.internal.consent_sdk.r) ((Z2) this.f39123v).f(), (C4320g) ((Z2) this.f39124w).f(), (C4352o) ((C4386w2) this.f39125x).f35781u, (C4344m) this.f39126y, (C4387x) ((Z2) this.f39127z).f());
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new f2.i((Context) ((G3.e) this.f39121n).f1072n, (a2.f) ((InterfaceC5044a) this.f39122u).get(), (InterfaceC4527d) ((InterfaceC5044a) this.f39123v).get(), (f2.c) ((Z2.e) this.f39124w).get(), (Executor) ((InterfaceC5044a) this.f39125x).get(), (h2.c) ((InterfaceC5044a) this.f39126y).get(), new E3.e(), new a4.e(), (InterfaceC4526c) ((InterfaceC5044a) this.f39127z).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public b1(Set set, s.b bVar, String str, String str2, C4528a c4528a) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f39121n = unmodifiableSet;
        s.b bVar2 = bVar == null ? Collections.EMPTY_MAP : bVar;
        this.f39123v = bVar2;
        this.f39124w = str;
        this.f39125x = str2;
        this.f39126y = c4528a == null ? C4528a.f37653b : c4528a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = bVar2.values().iterator();
        if (it.hasNext()) {
            throw D.y.j(it);
        }
        this.f39122u = Collections.unmodifiableSet(hashSet);
    }
}
