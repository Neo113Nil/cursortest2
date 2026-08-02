package T3;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3232fq;
import com.google.android.gms.internal.ads.C3495kl;
import com.google.android.gms.internal.ads.C3754pa;
import com.google.android.gms.internal.ads.EnumC2970aw;
import com.google.android.gms.internal.ads.InterfaceC3124dq;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.Tv;
import com.google.android.gms.internal.ads.Uv;
import com.google.android.gms.internal.ads.Vv;
import com.google.android.gms.internal.ads.Xw;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import w2.z;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3124dq {

    /* renamed from: n, reason: collision with root package name */
    public String f3162n;

    /* renamed from: u, reason: collision with root package name */
    public int f3163u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3164v;

    /* renamed from: w, reason: collision with root package name */
    public final Serializable f3165w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f3166x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f3167y;

    /* renamed from: z, reason: collision with root package name */
    public Object f3168z;

    public /* synthetic */ a(String str, String str2, String str3, int i, WebView webView, String str4, int i4) {
        this.f3162n = str;
        this.f3165w = str2;
        this.f3166x = str3;
        this.f3163u = i;
        this.f3167y = webView;
        this.f3168z = str4;
        this.f3164v = i4;
    }

    public void a(j jVar) {
        if (((HashSet) this.f3165w).contains(jVar.f3192a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f3166x).add(jVar);
    }

    public b b() {
        if (((e) this.f3168z) != null) {
            return new b(this.f3162n, new HashSet((HashSet) this.f3165w), new HashSet((HashSet) this.f3166x), this.f3163u, this.f3164v, (e) this.f3168z, (HashSet) this.f3167y);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3124dq
    /* renamed from: c */
    public Object mo2c() {
        String str = this.f3162n;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str2 = (String) this.f3165w;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        C3754pa c3754pa = new C3754pa(str, str2);
        EnumC2970aw k9 = C3495kl.k("javascript");
        String str3 = (String) this.f3166x;
        EnumC2970aw k10 = C3495kl.k(str3);
        int i = this.f3163u;
        Vv m9 = C3495kl.m(com.IceFishing.LiveIceFishing.k.b(i));
        EnumC2970aw enumC2970aw = EnumC2970aw.NONE;
        if (k9 == enumC2970aw) {
            int i4 = z.f41712b;
            x2.i.f("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (m9 == null) {
            String B3 = com.IceFishing.LiveIceFishing.k.B(i);
            int i6 = z.f41712b;
            x2.i.f("Omid js session error; Unable to parse creative type: ".concat(B3));
            return null;
        }
        if (m9 == Vv.VIDEO && k10 == enumC2970aw) {
            String valueOf = String.valueOf(str3);
            int i9 = z.f41712b;
            x2.i.f("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf));
            return null;
        }
        C3 c32 = new C3(c3754pa, (WebView) this.f3167y, (String) this.f3168z, "", Tv.JAVASCRIPT);
        Xw c9 = Xw.c(m9, C3495kl.l(com.IceFishing.LiveIceFishing.k.c(this.f3164v)), k9, k10, true);
        if (MA.f27044E.f27915u) {
            return new C3232fq(new Uv(c9, c32, UUID.randomUUID().toString()), c32);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public a(Class cls, Class[] clsArr) {
        this.f3162n = null;
        HashSet hashSet = new HashSet();
        this.f3165w = hashSet;
        this.f3166x = new HashSet();
        this.f3163u = 0;
        this.f3164v = 0;
        this.f3167y = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            com.bumptech.glide.g.g(cls2, "Null interface");
            ((HashSet) this.f3165w).add(r.a(cls2));
        }
    }

    public a(r rVar, r[] rVarArr) {
        this.f3162n = null;
        HashSet hashSet = new HashSet();
        this.f3165w = hashSet;
        this.f3166x = new HashSet();
        this.f3163u = 0;
        this.f3164v = 0;
        this.f3167y = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            com.bumptech.glide.g.g(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f3165w, rVarArr);
    }
}
