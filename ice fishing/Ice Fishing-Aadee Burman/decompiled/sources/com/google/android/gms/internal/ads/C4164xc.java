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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4164xc implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35029b;

    public /* synthetic */ C4164xc(int i, Object obj) {
        this.f35028a = i;
        this.f35029b = obj;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        int length;
        C4103wM c4103wM;
        C3932tD u3;
        C4020uu c4020uu;
        C3804qt c3804qt;
        int i = 0;
        int i6 = 5;
        int i9 = 2;
        int i10 = 1;
        switch (this.f35028a) {
            case 0:
                C4056vc c4056vc = (C4056vc) obj;
                C3467kg c3467kg = new C3467kg();
                BinderC4110wc binderC4110wc = new BinderC4110wc(this, c3467kg);
                Parcel H02 = c4056vc.H0();
                AbstractC3388j8.c(H02, (C3948tc) this.f35029b);
                AbstractC3388j8.e(H02, binderC4110wc);
                c4056vc.h1(H02, 2);
                return c3467kg;
            case 1:
                C4221yf c4221yf = (C4221yf) this.f35029b;
                Map map = (Map) obj;
                c4221yf.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                Object obj2 = c4221yf.f35188h;
                                synchronized (obj2) {
                                    try {
                                        length = optJSONArray.length();
                                        synchronized (obj2) {
                                            c4103wM = (C4103wM) c4221yf.f35182b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (c4103wM == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    AbstractC2639Kg.i(sb.toString());
                                } else {
                                    for (int i11 = 0; i11 < length; i11++) {
                                        String string = optJSONArray.getJSONObject(i11).getString("threat_type");
                                        c4103wM.h();
                                        ((C4211yM) c4103wM.f27721u).G(string);
                                    }
                                    c4221yf.f35186f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e9) {
                        if (((Boolean) AbstractC2849Xa.f28532a.r()).booleanValue()) {
                            int i12 = u2.z.f41319b;
                            v2.i.b("Failed to get SafeBrowsing metadata", e9);
                        }
                        return QC.k(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c4221yf.f35186f) {
                    synchronized (c4221yf.f35188h) {
                        C3134eM c3134eM = c4221yf.f35181a;
                        c3134eM.h();
                        ((FM) c3134eM.f27721u).O(10);
                    }
                }
                boolean z3 = c4221yf.f35186f;
                if (!(z3 && c4221yf.f35187g.f35370z) && (!(c4221yf.f35190k && c4221yf.f35187g.f35369y) && (z3 || !c4221yf.f35187g.f35367w))) {
                    return ND.f26473u;
                }
                synchronized (c4221yf.f35188h) {
                    try {
                        for (C4103wM c4103wM2 : c4221yf.f35182b.values()) {
                            C3134eM c3134eM2 = c4221yf.f35181a;
                            C4211yM c4211yM = (C4211yM) c4103wM2.j();
                            c3134eM2.h();
                            ((FM) c3134eM2.f27721u).H(c4211yM);
                        }
                        C3134eM c3134eM3 = c4221yf.f35181a;
                        ArrayList arrayList = c4221yf.f35183c;
                        c3134eM3.h();
                        ((FM) c3134eM3.f27721u).M(arrayList);
                        ArrayList arrayList2 = c4221yf.f35184d;
                        c3134eM3.h();
                        ((FM) c3134eM3.f27721u).N(arrayList2);
                        if (((Boolean) AbstractC2849Xa.f28532a.r()).booleanValue()) {
                            String A9 = ((FM) c3134eM3.f27721u).A();
                            String C8 = ((FM) c3134eM3.f27721u).C();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(A9).length() + 38 + String.valueOf(C8).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(A9);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(C8);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (C4211yM c4211yM2 : Collections.unmodifiableList(((FM) c3134eM3.f27721u).B())) {
                                sb3.append("    [");
                                sb3.append(c4211yM2.B());
                                sb3.append("] ");
                                sb3.append(c4211yM2.A());
                            }
                            AbstractC2639Kg.i(sb3.toString());
                        }
                        u2.p a9 = new u2.r(c4221yf.f35185e).a(1, c4221yf.f35187g.f35365u, null, ((FM) c3134eM3.j()).b());
                        if (((Boolean) AbstractC2849Xa.f28532a.r()).booleanValue()) {
                            a9.f31479n.a(Y6.f28655u, AbstractC3413jg.f31268a);
                        }
                        u3 = QC.u(a9, L2.f26023d, AbstractC3413jg.f31275h);
                    } finally {
                    }
                }
                return u3;
            case 2:
                String str2 = (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.Eb);
                Uri.Builder builder = (Uri.Builder) this.f35029b;
                builder.appendQueryParameter(str2, "12");
                return QC.c(builder.toString());
            case 3:
                ((C3864s) this.f35029b).w((Throwable) obj);
                return ND.f26473u;
            case 4:
                return ((C4123wp) this.f35029b).d((C2739Qe) obj);
            case 5:
                C4285zp c4285zp = (C4285zp) obj;
                return QC.c(new Yt(new C3534lt(i9, ((C3584mp) this.f35029b).f32586c), C2570Gf.d(new InputStreamReader(c4285zp.f35457a), c4285zp.f35458b.f27040F)));
            case 6:
                C3638np c3638np = (C3638np) this.f35029b;
                return QC.c(new Yt(new C3534lt(i9, c3638np.f32774d), C2570Gf.d(new StringReader(((JSONObject) obj).toString()), c3638np.f32784o)));
            case 7:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f35029b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(com.anythink.core.common.m.b.g.f14526j, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return QC.c(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            case 8:
                Throwable th = (Throwable) obj;
                Qr qr = (Qr) this.f35029b;
                qr.getClass();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32178Y2)).booleanValue()) {
                    C3038cg c3038cg = C4835j.f39730C.f39740h;
                    int f3 = ((Ps) qr.f27119c).f();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(f3).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(f3);
                    c3038cg.d(sb4.toString(), th);
                }
                return ND.f26473u;
            case 9:
                Throwable th2 = (Throwable) obj;
                Vs vs = (Vs) this.f35029b;
                vs.getClass();
                vs.f28256c.a(new RunnableC3470kj(20, th2));
                String str5 = "";
                return QC.c(th2 instanceof SecurityException ? new C3265gs(str5, i9, i10) : th2 instanceof IllegalStateException ? new C3265gs(str5, 3, i10) : th2 instanceof IllegalArgumentException ? new C3265gs(str5, 4, i10) : th2 instanceof TimeoutException ? new C3265gs(str5, i6, i10) : new C3265gs(str5, i, i10));
            case 10:
                return QC.c(new Tr((String) ((C3157es) this.f35029b).f29991c, i6));
            case 11:
                Au au = (Au) obj;
                T8 t82 = (T8) this.f35029b;
                t82.getClass();
                if (au == null || (c4020uu = au.f23764a) == null || (c3804qt = au.f23765b) == null) {
                    throw new C3208fp(1, "Empty prefetch");
                }
                C9 A10 = H9.A();
                A9 B9 = B9.B();
                B9.h();
                ((B9) B9.f27721u).C();
                E9 B10 = E9.B();
                B9.h();
                ((B9) B9.f27721u).D(B10);
                A10.h();
                ((H9) A10.f27721u).B((B9) B9.j());
                c4020uu.f34604a.c().f26644f.a((H9) A10.j());
                return t82.n(c4020uu, c3804qt.f33431b);
            case 12:
                C3054cw c3054cw = (C3054cw) this.f35029b;
                Exception exc = (Exception) obj;
                synchronized (c3054cw) {
                    c3054cw.f29645b = true;
                    throw exc;
                }
            case 13:
                return QC.c(((Eu) this.f35029b).a(obj));
            case 14:
                Ly ly = (Ly) obj;
                if (ly != null) {
                    return QC.c(ly);
                }
                Oy oy = (Oy) this.f35029b;
                oy.f26695e.b(51);
                return QC.t(ID.s(QC.o(new Ny(oy, oy.f26696f), oy.f26694d)), C2556Fi.f24831n, GD.f24952n);
            case 15:
                return ((Lz) this.f35029b).f26198b.d();
            default:
                return ((Uz) this.f35029b).f28055c.f();
        }
    }

    public /* synthetic */ C4164xc(C3054cw c3054cw, C4178xq c4178xq) {
        this.f35028a = 12;
        this.f35029b = c3054cw;
    }

    public C4164xc(N1.h hVar, C3948tc c3948tc) {
        this.f35028a = 0;
        this.f35029b = c3948tc;
        Objects.requireNonNull(hVar);
    }

    public C4164xc(Oy oy) {
        this.f35028a = 14;
        Objects.requireNonNull(oy);
        this.f35029b = oy;
    }
}
