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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4187xc implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35808b;

    public /* synthetic */ C4187xc(int i, Object obj) {
        this.f35807a = i;
        this.f35808b = obj;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        int length;
        C4126wM c4126wM;
        C3955tD u6;
        C4043uu c4043uu;
        C3827qt c3827qt;
        int i = 0;
        int i4 = 5;
        int i6 = 2;
        int i9 = 1;
        switch (this.f35807a) {
            case 0:
                C4079vc c4079vc = (C4079vc) obj;
                C3490kg c3490kg = new C3490kg();
                BinderC4133wc binderC4133wc = new BinderC4133wc(this, c3490kg);
                Parcel F02 = c4079vc.F0();
                AbstractC3411j8.c(F02, (C3971tc) this.f35808b);
                AbstractC3411j8.e(F02, binderC4133wc);
                c4079vc.h1(F02, 2);
                return c3490kg;
            case 1:
                C4244yf c4244yf = (C4244yf) this.f35808b;
                Map map = (Map) obj;
                c4244yf.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                Object obj2 = c4244yf.f35978h;
                                synchronized (obj2) {
                                    try {
                                        length = optJSONArray.length();
                                        synchronized (obj2) {
                                            c4126wM = (C4126wM) c4244yf.f35972b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (c4126wM == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    AbstractC2659Kg.i(sb.toString());
                                } else {
                                    for (int i10 = 0; i10 < length; i10++) {
                                        String string = optJSONArray.getJSONObject(i10).getString("threat_type");
                                        c4126wM.h();
                                        ((C4234yM) c4126wM.f28504u).G(string);
                                    }
                                    c4244yf.f35976f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e9) {
                        if (((Boolean) AbstractC2872Xa.f29304a.r()).booleanValue()) {
                            int i11 = w2.z.f41712b;
                            x2.i.b("Failed to get SafeBrowsing metadata", e9);
                        }
                        return QC.k(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c4244yf.f35976f) {
                    synchronized (c4244yf.f35978h) {
                        C3157eM c3157eM = c4244yf.f35971a;
                        c3157eM.h();
                        ((FM) c3157eM.f28504u).O(10);
                    }
                }
                boolean z6 = c4244yf.f35976f;
                if (!(z6 && c4244yf.f35977g.f36143z) && (!(c4244yf.f35980k && c4244yf.f35977g.f36142y) && (z6 || !c4244yf.f35977g.f36140w))) {
                    return ND.f27257u;
                }
                synchronized (c4244yf.f35978h) {
                    try {
                        for (C4126wM c4126wM2 : c4244yf.f35972b.values()) {
                            C3157eM c3157eM2 = c4244yf.f35971a;
                            C4234yM c4234yM = (C4234yM) c4126wM2.j();
                            c3157eM2.h();
                            ((FM) c3157eM2.f28504u).H(c4234yM);
                        }
                        C3157eM c3157eM3 = c4244yf.f35971a;
                        ArrayList arrayList = c4244yf.f35973c;
                        c3157eM3.h();
                        ((FM) c3157eM3.f28504u).M(arrayList);
                        ArrayList arrayList2 = c4244yf.f35974d;
                        c3157eM3.h();
                        ((FM) c3157eM3.f28504u).N(arrayList2);
                        if (((Boolean) AbstractC2872Xa.f29304a.r()).booleanValue()) {
                            String A9 = ((FM) c3157eM3.f28504u).A();
                            String C8 = ((FM) c3157eM3.f28504u).C();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(A9).length() + 38 + String.valueOf(C8).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(A9);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(C8);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (C4234yM c4234yM2 : Collections.unmodifiableList(((FM) c3157eM3.f28504u).B())) {
                                sb3.append("    [");
                                sb3.append(c4234yM2.B());
                                sb3.append("] ");
                                sb3.append(c4234yM2.A());
                            }
                            AbstractC2659Kg.i(sb3.toString());
                        }
                        w2.p a9 = new w2.r(c4244yf.f35975e).a(1, c4244yf.f35977g.f36138u, null, ((FM) c3157eM3.j()).b());
                        if (((Boolean) AbstractC2872Xa.f29304a.r()).booleanValue()) {
                            a9.f32256n.a(Y6.f29432u, AbstractC3436jg.f32055a);
                        }
                        u6 = QC.u(a9, L2.f26823d, AbstractC3436jg.f32062h);
                    } finally {
                    }
                }
                return u6;
            case 2:
                String str2 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Eb);
                Uri.Builder builder = (Uri.Builder) this.f35808b;
                builder.appendQueryParameter(str2, "12");
                return QC.c(builder.toString());
            case 3:
                ((C3887s) this.f35808b).w((Throwable) obj);
                return ND.f27257u;
            case 4:
                return ((C4146wp) this.f35808b).d((C2759Qe) obj);
            case 5:
                C4308zp c4308zp = (C4308zp) obj;
                return QC.c(new Yt(new C3557lt(i6, ((C3607mp) this.f35808b).f33364c), C2590Gf.d(new InputStreamReader(c4308zp.f36226a), c4308zp.f36227b.f27825F)));
            case 6:
                C3661np c3661np = (C3661np) this.f35808b;
                return QC.c(new Yt(new C3557lt(i6, c3661np.f33561d), C2590Gf.d(new StringReader(((JSONObject) obj).toString()), c3661np.f33571o)));
            case 7:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f35808b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(com.anythink.core.common.m.b.g.f15312j, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return QC.c(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            case 8:
                Throwable th = (Throwable) obj;
                Qr qr = (Qr) this.f35808b;
                qr.getClass();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32957Y2)).booleanValue()) {
                    C3061cg c3061cg = C4906k.f40186C.f40196h;
                    int f2 = ((Ps) qr.f27875c).f();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(f2).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(f2);
                    c3061cg.d(sb4.toString(), th);
                }
                return ND.f27257u;
            case 9:
                Throwable th2 = (Throwable) obj;
                ((Vs) this.f35808b).f29054c.a(new RunnableC3493kj(20, th2));
                String str5 = "";
                return QC.c(th2 instanceof SecurityException ? new C3288gs(str5, i6, i9) : th2 instanceof IllegalStateException ? new C3288gs(str5, 3, i9) : th2 instanceof IllegalArgumentException ? new C3288gs(str5, 4, i9) : th2 instanceof TimeoutException ? new C3288gs(str5, i4, i9) : new C3288gs(str5, i, i9));
            case 10:
                return QC.c(new Tr((String) ((C3180es) this.f35808b).f30780c, i4));
            case 11:
                Au au = (Au) obj;
                T8 t82 = (T8) this.f35808b;
                t82.getClass();
                if (au == null || (c4043uu = au.f24536a) == null || (c3827qt = au.f24537b) == null) {
                    throw new C3231fp(1, "Empty prefetch");
                }
                C9 A10 = H9.A();
                A9 B3 = B9.B();
                B3.h();
                ((B9) B3.f28504u).C();
                E9 B9 = E9.B();
                B3.h();
                ((B9) B3.f28504u).D(B9);
                A10.h();
                ((H9) A10.f28504u).B((B9) B3.j());
                c4043uu.f35367a.c().f27420f.a((H9) A10.j());
                return t82.n(c4043uu, c3827qt.f34198b);
            case 12:
                C3130dw c3130dw = (C3130dw) this.f35808b;
                Exception exc = (Exception) obj;
                synchronized (c3130dw) {
                    c3130dw.f30650b = true;
                    throw exc;
                }
            case 13:
                return QC.c(((Eu) this.f35808b).a(obj));
            case 14:
                Ly ly = (Ly) obj;
                if (ly != null) {
                    return QC.c(ly);
                }
                Oy oy = (Oy) this.f35808b;
                oy.f27478e.b(51);
                return QC.t(ID.s(QC.o(new Ny(oy, oy.f27479f), oy.f27477d)), C2576Fi.f25620n, GD.f25742n);
            case 15:
                return ((Lz) this.f35808b).f26989b.d();
            default:
                return ((Uz) this.f35808b).f28852c.f();
        }
    }

    public /* synthetic */ C4187xc(C3130dw c3130dw, C4201xq c4201xq) {
        this.f35807a = 12;
        this.f35808b = c3130dw;
    }

    public C4187xc(P1.h hVar, C3971tc c3971tc) {
        this.f35807a = 0;
        this.f35808b = c3971tc;
        Objects.requireNonNull(hVar);
    }

    public C4187xc(Oy oy) {
        this.f35807a = 14;
        Objects.requireNonNull(oy);
        this.f35808b = oy;
    }
}
