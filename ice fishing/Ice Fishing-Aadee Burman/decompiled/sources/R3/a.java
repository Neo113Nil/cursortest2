package R3;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3209fq;
import com.google.android.gms.internal.ads.C3472kl;
import com.google.android.gms.internal.ads.C3731pa;
import com.google.android.gms.internal.ads.InterfaceC3101dq;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.Tv;
import com.google.android.gms.internal.ads.Uv;
import com.google.android.gms.internal.ads.Vv;
import com.google.android.gms.internal.ads.Xw;
import com.google.android.gms.internal.ads.Zv;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import u2.z;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3101dq {

    /* renamed from: n, reason: collision with root package name */
    public String f2707n;

    /* renamed from: u, reason: collision with root package name */
    public int f2708u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2709v;

    /* renamed from: w, reason: collision with root package name */
    public final Serializable f2710w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f2711x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2712y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2713z;

    public /* synthetic */ a(String str, String str2, String str3, int i, WebView webView, String str4, int i6) {
        this.f2707n = str;
        this.f2710w = str2;
        this.f2711x = str3;
        this.f2708u = i;
        this.f2712y = webView;
        this.f2713z = str4;
        this.f2709v = i6;
    }

    public void a(j jVar) {
        if (((HashSet) this.f2710w).contains(jVar.f2737a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f2711x).add(jVar);
    }

    public b b() {
        if (((e) this.f2713z) != null) {
            return new b(this.f2707n, new HashSet((HashSet) this.f2710w), new HashSet((HashSet) this.f2711x), this.f2708u, this.f2709v, (e) this.f2713z, (HashSet) this.f2712y);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101dq
    /* renamed from: c */
    public Object mo3c() {
        String str = this.f2707n;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str2 = (String) this.f2710w;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        C3731pa c3731pa = new C3731pa(str, str2);
        Zv k9 = C3472kl.k("javascript");
        String str3 = (String) this.f2711x;
        Zv k10 = C3472kl.k(str3);
        int i = this.f2708u;
        Vv m4 = C3472kl.m(com.anythink.basead.exoplayer.f.f.b(i));
        Zv zv = Zv.NONE;
        if (k9 == zv) {
            int i6 = z.f41319b;
            v2.i.f("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (m4 == null) {
            String A9 = com.anythink.basead.exoplayer.f.f.A(i);
            int i9 = z.f41319b;
            v2.i.f("Omid js session error; Unable to parse creative type: ".concat(A9));
            return null;
        }
        if (m4 == Vv.VIDEO && k10 == zv) {
            String valueOf = String.valueOf(str3);
            int i10 = z.f41319b;
            v2.i.f("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf));
            return null;
        }
        C3 c32 = new C3(c3731pa, (WebView) this.f2712y, (String) this.f2713z, "", Tv.JAVASCRIPT);
        Xw b9 = Xw.b(m4, C3472kl.l(com.anythink.basead.exoplayer.f.f.c(this.f2709v)), k9, k10, true);
        if (MA.f26253E.f27159u) {
            return new C3209fq(new Uv(b9, c32, UUID.randomUUID().toString()), c32);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public a(Class cls, Class[] clsArr) {
        this.f2707n = null;
        HashSet hashSet = new HashSet();
        this.f2710w = hashSet;
        this.f2711x = new HashSet();
        this.f2708u = 0;
        this.f2709v = 0;
        this.f2712y = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            X2.e.z(cls2, "Null interface");
            ((HashSet) this.f2710w).add(r.a(cls2));
        }
    }

    public a(r rVar, r[] rVarArr) {
        this.f2707n = null;
        HashSet hashSet = new HashSet();
        this.f2710w = hashSet;
        this.f2711x = new HashSet();
        this.f2708u = 0;
        this.f2709v = 0;
        this.f2712y = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            X2.e.z(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f2710w, rVarArr);
    }
}
