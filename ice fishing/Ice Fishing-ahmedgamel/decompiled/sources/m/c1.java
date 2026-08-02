package m;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4359k;
import com.google.android.gms.internal.consent_sdk.C4367m;
import com.google.android.gms.internal.consent_sdk.C4375o;
import com.google.android.gms.internal.consent_sdk.C4409w2;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import d2.InterfaceC4460b;
import i1.C4585b;
import i2.InterfaceC4589c;
import i2.InterfaceC4590d;
import i3.C4591a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import t7.InterfaceC5045a;

/* loaded from: classes.dex */
public final class c1 implements a3, InterfaceC4460b {

    /* renamed from: n, reason: collision with root package name */
    public Object f39192n;

    /* renamed from: u, reason: collision with root package name */
    public Object f39193u;

    /* renamed from: v, reason: collision with root package name */
    public Object f39194v;

    /* renamed from: w, reason: collision with root package name */
    public Object f39195w;

    /* renamed from: x, reason: collision with root package name */
    public Object f39196x;

    /* renamed from: y, reason: collision with root package name */
    public Object f39197y;

    /* renamed from: z, reason: collision with root package name */
    public Object f39198z;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f39192n = obj;
        this.f39193u = obj2;
        this.f39194v = obj3;
        this.f39195w = obj4;
        this.f39196x = obj5;
        this.f39197y = obj6;
        this.f39198z = obj7;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object f() {
        Application application = (Application) ((C4409w2) this.f39192n).f36550u;
        return new C4359k(application, (com.google.android.gms.internal.consent_sdk.r) ((Z2) this.f39194v).f(), (C4343g) ((Z2) this.f39195w).f(), (C4375o) ((C4409w2) this.f39196x).f36550u, (C4367m) this.f39197y, (C4410x) ((Z2) this.f39198z).f());
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        return new h2.i((Context) ((C4585b) this.f39192n).f38152u, (c2.e) ((InterfaceC5045a) this.f39193u).get(), (InterfaceC4590d) ((InterfaceC5045a) this.f39194v).get(), (h2.c) ((b3.e) this.f39195w).get(), (Executor) ((InterfaceC5045a) this.f39196x).get(), (j2.c) ((InterfaceC5045a) this.f39197y).get(), new O2.i(21), new G3.e(21), (InterfaceC4589c) ((InterfaceC5045a) this.f39198z).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public c1(Set set, s.b bVar, String str, String str2, C4591a c4591a) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f39192n = unmodifiableSet;
        s.b bVar2 = bVar == null ? Collections.EMPTY_MAP : bVar;
        this.f39194v = bVar2;
        this.f39195w = str;
        this.f39196x = str2;
        this.f39197y = c4591a == null ? C4591a.f38180b : c4591a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = bVar2.values().iterator();
        if (it.hasNext()) {
            throw D.x.i(it);
        }
        this.f39193u = Collections.unmodifiableSet(hashSet);
    }
}
