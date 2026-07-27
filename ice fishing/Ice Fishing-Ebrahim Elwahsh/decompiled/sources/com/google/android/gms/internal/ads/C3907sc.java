package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3907sc implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34251b;

    public /* synthetic */ C3907sc(int i, Object obj) {
        this.f34250a = i;
        this.f34251b = obj;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        int length;
        LM lm;
        C3999uD A8;
        C4141wu c4141wu;
        C3870rt c3870rt;
        int i = 0;
        int i4 = 2;
        int i9 = 5;
        int i10 = 1;
        switch (this.f34250a) {
            case 0:
                C3800qc c3800qc = (C3800qc) obj;
                C3320hg c3320hg = new C3320hg();
                BinderC3853rc binderC3853rc = new BinderC3853rc(this, c3320hg);
                Parcel A02 = c3800qc.A0();
                AbstractC3241g8.c(A02, (C3692oc) this.f34251b);
                AbstractC3241g8.e(A02, binderC3853rc);
                c3800qc.N0(A02, 2);
                return c3320hg;
            case 1:
                C4072vf c4072vf = (C4072vf) this.f34251b;
                Map map = (Map) obj;
                c4072vf.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                Object obj2 = c4072vf.f34827h;
                                synchronized (obj2) {
                                    try {
                                        length = optJSONArray.length();
                                        synchronized (obj2) {
                                            lm = (LM) c4072vf.f34821b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (lm == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    AbstractC3194fG.g(sb.toString());
                                } else {
                                    for (int i11 = 0; i11 < length; i11++) {
                                        String string = optJSONArray.getJSONObject(i11).getString("threat_type");
                                        lm.h();
                                        ((MM) lm.f30000u).G(string);
                                    }
                                    c4072vf.f34825f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e6) {
                        if (((Boolean) AbstractC2785Ta.f27789a.r()).booleanValue()) {
                            int i12 = t2.C.f40822b;
                            u2.i.b("Failed to get SafeBrowsing metadata", e6);
                        }
                        return C3686oN.l(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c4072vf.f34825f) {
                    synchronized (c4072vf.f34827h) {
                        C3900sM c3900sM = c4072vf.f34820a;
                        c3900sM.h();
                        ((TM) c3900sM.f30000u).O(10);
                    }
                }
                boolean z8 = c4072vf.f34825f;
                if (!(z8 && c4072vf.f34826g.f35014z) && (!(c4072vf.f34829k && c4072vf.f34826g.f35013y) && (z8 || !c4072vf.f34826g.f35011w))) {
                    return OD.f26665u;
                }
                synchronized (c4072vf.f34827h) {
                    try {
                        for (LM lm2 : c4072vf.f34821b.values()) {
                            C3900sM c3900sM2 = c4072vf.f34820a;
                            MM mm = (MM) lm2.j();
                            c3900sM2.h();
                            ((TM) c3900sM2.f30000u).H(mm);
                        }
                        C3900sM c3900sM3 = c4072vf.f34820a;
                        ArrayList arrayList = c4072vf.f34822c;
                        c3900sM3.h();
                        ((TM) c3900sM3.f30000u).M(arrayList);
                        ArrayList arrayList2 = c4072vf.f34823d;
                        c3900sM3.h();
                        ((TM) c3900sM3.f30000u).N(arrayList2);
                        if (((Boolean) AbstractC2785Ta.f27789a.r()).booleanValue()) {
                            String A9 = ((TM) c3900sM3.f30000u).A();
                            String C7 = ((TM) c3900sM3.f30000u).C();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(A9).length() + 38 + String.valueOf(C7).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(A9);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(C7);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (MM mm2 : Collections.unmodifiableList(((TM) c3900sM3.f30000u).B())) {
                                sb3.append("    [");
                                sb3.append(mm2.B());
                                sb3.append("] ");
                                sb3.append(mm2.A());
                            }
                            AbstractC3194fG.g(sb3.toString());
                        }
                        t2.q a9 = new t2.s(c4072vf.f34824e).a(1, c4072vf.f34826g.f35009u, null, ((TM) c3900sM3.j()).b());
                        if (((Boolean) AbstractC2785Ta.f27789a.r()).booleanValue()) {
                            a9.f31242n.c(U6.f27929u, AbstractC3212fg.f30738a);
                        }
                        A8 = C3686oN.A(a9, J2.f25693d, AbstractC3212fg.f30745h);
                    } finally {
                    }
                }
                return A8;
            case 2:
                String str2 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Eb);
                Uri.Builder builder = (Uri.Builder) this.f34251b;
                builder.appendQueryParameter(str2, "12");
                return C3686oN.c(builder.toString());
            case 3:
                ((r) this.f34251b).q((Throwable) obj);
                return OD.f26665u;
            case 4:
                return ((C4298zp) this.f34251b).c((C2687Ne) obj);
            case 5:
                C2511Cp c2511Cp = (C2511Cp) obj;
                return C3686oN.c(new C2953au(new Mt(i10, ((C3705op) this.f34251b).f33216c), C2518Df.f(new InputStreamReader(c2511Cp.f24249a), c2511Cp.f24250b.f26578F)));
            case 6:
                C3813qp c3813qp = (C3813qp) this.f34251b;
                return C3686oN.c(new C2953au(new Mt(i10, c3813qp.f33884d), C2518Df.f(new StringReader(((JSONObject) obj).toString()), c3813qp.f33894o)));
            case 7:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f34251b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(com.anythink.core.common.m.b.g.f14683j, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return C3686oN.c(jSONObject);
                } catch (JSONException e9) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e9.getCause())));
                }
            case 8:
                Throwable th = (Throwable) obj;
                Sr sr = (Sr) this.f34251b;
                sr.getClass();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31598Y2)).booleanValue()) {
                    C2892Zf c2892Zf = p2.j.f39798C.f39808h;
                    int d2 = ((Rs) sr.f27628c).d();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(d2).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(d2);
                    c2892Zf.d(sb4.toString(), th);
                }
                return OD.f26665u;
            case 9:
                Throwable th2 = (Throwable) obj;
                ((Ws) this.f34251b).f28485c.a(new RunnableC3376ij(20, th2));
                String str5 = "";
                return C3686oN.c(th2 instanceof SecurityException ? new C3438js(str5, i4, i10) : th2 instanceof IllegalStateException ? new C3438js(str5, 3, i10) : th2 instanceof IllegalArgumentException ? new C3438js(str5, 4, i10) : th2 instanceof TimeoutException ? new C3438js(str5, i9, i10) : new C3438js(str5, i, i10));
            case 10:
                return C3686oN.c(new Vr((String) ((C3278gs) this.f34251b).f31113c, i9));
            case 11:
                Cu cu = (Cu) obj;
                Q8 q82 = (Q8) this.f34251b;
                q82.getClass();
                if (cu == null || (c4141wu = cu.f24267a) == null || (c3870rt = cu.f24268b) == null) {
                    throw new C3275gp(1, "Empty prefetch");
                }
                C4265z9 A10 = E9.A();
                C4157x9 B8 = C4211y9.B();
                B8.h();
                ((C4211y9) B8.f30000u).C();
                B9 B9 = B9.B();
                B8.h();
                ((C4211y9) B8.f30000u).D(B9);
                A10.h();
                ((E9) A10.f30000u).B((C4211y9) B8.j());
                c4141wu.f35085a.a().f26742f.I((E9) A10.j());
                return q82.m(c4141wu, c3870rt.f34131b);
            case 12:
                C3173ew c3173ew = (C3173ew) this.f34251b;
                Exception exc = (Exception) obj;
                synchronized (c3173ew) {
                    c3173ew.f30555b = true;
                    throw exc;
                }
            case 13:
                return C3686oN.c(((Gu) this.f34251b).b(obj));
            case 14:
                Ny ny = (Ny) obj;
                if (ny != null) {
                    return C3686oN.c(ny);
                }
                Qy qy = (Qy) this.f34251b;
                qy.f27290e.b(51);
                return C3686oN.y(JD.s(C3686oN.p(new Py(qy, qy.f27291f), qy.f27289d)), C2538Ei.f24801n, HD.f25326n);
            case 15:
                return ((Nz) this.f34251b).f26629b.c();
            default:
                return ((Xz) this.f34251b).f28747c.d();
        }
    }

    public /* synthetic */ C3907sc(C3173ew c3173ew, C2478Aq c2478Aq) {
        this.f34250a = 12;
        this.f34251b = c3173ew;
    }

    public C3907sc(N1.h hVar, C3692oc c3692oc) {
        this.f34250a = 0;
        this.f34251b = c3692oc;
        Objects.requireNonNull(hVar);
    }

    public C3907sc(Qy qy) {
        this.f34250a = 14;
        Objects.requireNonNull(qy);
        this.f34251b = qy;
    }
}
