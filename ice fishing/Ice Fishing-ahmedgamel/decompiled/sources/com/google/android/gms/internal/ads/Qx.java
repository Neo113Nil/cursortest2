package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.C4631a;
import n2.C4751b;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4920z0;
import x2.InterfaceC5189c;

/* loaded from: classes2.dex */
public final class Qx implements Q4, InterfaceC3575mg, InterfaceC5189c, KD, Eu, InterfaceC3742pl, InterfaceC2725Ph, InterfaceC2478Ap {

    /* renamed from: v, reason: collision with root package name */
    public static Qx f27137v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27138n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27139u;

    public /* synthetic */ Qx(int i, Object obj) {
        this.f27138n = i;
        this.f27139u = obj;
    }

    public static final Qx f(Context context) {
        Qx qx;
        synchronized (Qx.class) {
            try {
                if (f27137v == null) {
                    f27137v = new Qx(context);
                }
                qx = f27137v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.Df] */
    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        B2.c cVar;
        B2.b bVar;
        switch (this.f27138n) {
            case 17:
                Yt yt = (Yt) obj;
                S0.c cVar2 = ((C2710Oj) this.f27139u).f26642d;
                Iterator it = ((ArrayList) yt.f28754b.f25044w).iterator();
                while (it.hasNext()) {
                    Xt xt = (Xt) it.next();
                    String str = xt.f28597a;
                    Map map = (Map) cVar2.f2775u;
                    boolean containsKey = map.containsKey(str);
                    JSONObject jSONObject = xt.f28598b;
                    if (containsKey && jSONObject != null) {
                        C2590Hi c2590Hi = (C2590Hi) map.get(str);
                        switch (c2590Hi.f25348a) {
                            case 0:
                                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Aa)).booleanValue()) {
                                    C2749Qo c2749Qo = (C2749Qo) c2590Hi.f25349b;
                                    synchronized (c2749Qo) {
                                        c2749Qo.f27094p = jSONObject;
                                    }
                                    break;
                                } else {
                                    continue;
                                }
                            case 1:
                                B2.a aVar = null;
                                if (jSONObject.has("AvailableMemoryTier")) {
                                    int optInt = jSONObject.optInt("AvailableMemoryTier", -1);
                                    B2.b[] values = B2.b.values();
                                    int length = values.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            bVar = values[i];
                                            if (bVar.f175n != optInt) {
                                                i++;
                                            }
                                        } else {
                                            bVar = null;
                                        }
                                    }
                                    if (bVar != null) {
                                        ((B2.d) c2590Hi.f25349b).f182d.set(bVar);
                                    }
                                }
                                if (jSONObject.has("AvailableProcessorTier")) {
                                    int optInt2 = jSONObject.optInt("AvailableProcessorTier", -1);
                                    B2.c[] values2 = B2.c.values();
                                    int length2 = values2.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length2) {
                                            cVar = values2[i6];
                                            if (cVar.f178n != optInt2) {
                                                i6++;
                                            }
                                        } else {
                                            cVar = null;
                                        }
                                    }
                                    if (cVar != null) {
                                        ((B2.d) c2590Hi.f25349b).f183e.set(cVar);
                                    }
                                }
                                if (jSONObject.has("AdvertisedMemoryTier")) {
                                    int optInt3 = jSONObject.optInt("AdvertisedMemoryTier", -1);
                                    B2.a[] values3 = B2.a.values();
                                    int length3 = values3.length;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < length3) {
                                            B2.a aVar2 = values3[i9];
                                            if (aVar2.f172n == optInt3) {
                                                aVar = aVar2;
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                    if (aVar != null) {
                                        B2.d dVar = (B2.d) c2590Hi.f25349b;
                                        synchronized (dVar) {
                                            dVar.f181c.set(aVar);
                                            dVar.f179a.getSharedPreferences("admob", 0).edit().putInt("advertised_memory_tier", aVar.f172n).apply();
                                        }
                                        break;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            default:
                                ((C2519Df) ((C2991bm) c2590Hi.f25349b).f29324v).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong(com.anythink.expressad.foundation.d.d.f18596u));
                                break;
                        }
                    } else {
                        Map map2 = (Map) cVar2.f2776v;
                        if (map2.containsKey(str) && jSONObject != null) {
                            InterfaceC2488Bi interfaceC2488Bi = (InterfaceC2488Bi) map2.get(str);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            interfaceC2488Bi.a(hashMap);
                        }
                    }
                }
                return yt;
            default:
                C2800Tp.j((SQLiteDatabase) obj, (v2.l) this.f27139u);
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public void b(MessageDigest[] messageDigestArr, long j6, int i) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f27139u;
        synchronized (byteBuffer) {
            int i6 = (int) j6;
            byteBuffer.position(i6);
            byteBuffer.limit(i6 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public long c() {
        return ((ByteBuffer) this.f27139u).capacity();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2478Ap
    public /* synthetic */ N3.a d(C2739Qe c2739Qe) {
        return ((BinderC2580Gp) ((InterfaceC3135eN) ((C4274ze) this.f27139u).f35362w).f()).V3(c2739Qe, Binder.getCallingUid());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O3 e(K0 k02, V2 v22, int i) {
        int i6;
        C3473km c3473km;
        int i9 = 0;
        O3 o32 = null;
        loop0: while (true) {
            int i10 = 0;
            do {
                int i11 = i10 % 10;
                Cr cr = (Cr) this.f27139u;
                if (i11 == 0) {
                    if (i10 != 0) {
                        byte[] bArr = cr.f24252a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i6 = 0;
                } else {
                    i6 = i11;
                }
                boolean z3 = true;
                int i12 = i10 == 0 ? 10 : 1;
                try {
                    int i13 = i11 + 10;
                    k02.A(cr.f24252a, i13 - i12, i12, false);
                    cr.E(i6);
                    cr.C(i13);
                    if (cr.B() < 3) {
                        int i14 = cr.f24253b;
                        int i15 = cr.f24254c;
                        throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i14).length() + 17 + String.valueOf(i15).length()), "position=", i14, ", limit=", i15));
                    }
                    int O8 = cr.O();
                    int i16 = cr.f24253b - 3;
                    cr.f24253b = i16;
                    if (O8 != 4801587) {
                        if (SK.a(cr.J()) != -1) {
                            break loop0;
                        }
                        if (i10 == 0) {
                            cr.A(20);
                        }
                        i10++;
                    } else {
                        cr.G(6);
                        int g4 = cr.g();
                        int i17 = g4 + 10;
                        if (o32 == null) {
                            byte[] bArr2 = new byte[i17];
                            System.arraycopy(cr.f24252a, i16, bArr2, 0, 10);
                            k02.A(bArr2, 10, g4, false);
                            ArrayList arrayList = new ArrayList();
                            Cr cr2 = new Cr(bArr2, i17);
                            if (cr2.B() < 10) {
                                AbstractC2968bG.y("Id3Decoder", "Data too short to be an ID3 tag");
                            } else {
                                int O9 = cr2.O();
                                if (O9 != 4801587) {
                                    AbstractC2968bG.y("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(O9))));
                                } else {
                                    int K7 = cr2.K();
                                    cr2.G(1);
                                    int K8 = cr2.K();
                                    int g9 = cr2.g();
                                    if (K7 == 2) {
                                        if ((K8 & 64) != 0) {
                                            AbstractC2968bG.y("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                        }
                                        c3473km = new C3473km(K7, K7 >= 4 && (K8 & 128) != 0, g9);
                                    } else {
                                        if (K7 == 3) {
                                            if ((K8 & 64) != 0) {
                                                int b9 = cr2.b();
                                                cr2.G(b9);
                                                g9 -= b9 + 4;
                                            }
                                        } else if (K7 == 4) {
                                            if ((K8 & 64) != 0) {
                                                int g10 = cr2.g();
                                                cr2.G(g10 - 4);
                                                g9 -= g10;
                                            }
                                            if ((K8 & 16) != 0) {
                                                g9 -= 10;
                                            }
                                        } else {
                                            com.anythink.basead.exoplayer.f.f.q(K7, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder", new StringBuilder(String.valueOf(K7).length() + 46));
                                        }
                                        c3473km = new C3473km(K7, K7 >= 4 && (K8 & 128) != 0, g9);
                                    }
                                    if (c3473km != null) {
                                        int i18 = cr2.f24253b;
                                        int i19 = c3473km.f31626a;
                                        int i20 = i19 == 2 ? 6 : 10;
                                        boolean z6 = c3473km.f31627b;
                                        int i21 = c3473km.f31628c;
                                        if (z6) {
                                            i21 = MA.I(i21, cr2);
                                        }
                                        cr2.C(i18 + i21);
                                        if (MA.t(cr2, i19, i20, false)) {
                                            z3 = false;
                                        } else if (i19 != 4 || !MA.t(cr2, 4, i20, true)) {
                                            com.anythink.basead.exoplayer.f.f.q(i19, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder", new StringBuilder(String.valueOf(i19).length() + 45));
                                        }
                                        while (cr2.B() >= i20) {
                                            AbstractC2900a2 x9 = MA.x(i19, cr2, z3, v22);
                                            if (x9 != null) {
                                                arrayList.add(x9);
                                            }
                                        }
                                        o32 = new O3(arrayList);
                                    }
                                    o32 = null;
                                }
                            }
                            c3473km = null;
                            if (c3473km != null) {
                            }
                            o32 = null;
                        } else {
                            k02.c(g4, false);
                        }
                        i9 += i17;
                    }
                } catch (EOFException unused) {
                }
            } while (i10 <= i);
        }
        k02.f25821y = 0;
        k02.c(i9, false);
        return o32;
    }

    public RP[] g(Handler handler, HN hn, HN hn2) {
        boolean z3 = false;
        C3414jh c3414jh = (C3414jh) this.f27139u;
        c3414jh.getClass();
        C3084dP c3084dP = C3084dP.f29775z;
        Context context = c3414jh.f31290n;
        C3621nP c3621nP = new C3621nP(context);
        AbstractC2772Sd.H(!c3621nP.f32728c);
        c3621nP.f32728c = true;
        if (c3621nP.f32731f == null) {
            c3621nP.f32731f = new C3481ku(new InterfaceC3147ei[0]);
        }
        if (c3621nP.f32730e == null) {
            if (c3621nP.f32732g == null) {
                c3621nP.f32732g = new S0.s(context);
            }
            if (c3621nP.f32729d == null) {
                c3621nP.f32729d = V2.f28066C;
            }
            C4274ze c4274ze = new C4274ze(context);
            KO ko = context != null ? null : c3621nP.f32727b;
            Context context2 = (Context) c4274ze.f35360u;
            if (context2 == null) {
                c4274ze.f35361v = ko;
            }
            S0.s sVar = c3621nP.f32732g;
            c4274ze.f35362w = sVar;
            if (sVar == null) {
                c4274ze.f35362w = new S0.s(context2);
            }
            C4300b c4300b = new C4300b();
            Context context3 = (Context) c4274ze.f35360u;
            c4300b.f35648a = context3;
            S0.s sVar2 = (S0.s) c4274ze.f35362w;
            sVar2.getClass();
            c4300b.i = sVar2;
            c4300b.f35652e = (KO) c4274ze.f35361v;
            c4300b.f35649b = context3 != null ? new C4019ut(c4300b) : null;
            c4300b.f35651d = V2.f28076y;
            c3621nP.f32730e = c4300b;
        } else {
            AbstractC2772Sd.H(c3621nP.f32732g == null);
            AbstractC2772Sd.H(c3621nP.f32729d == null);
        }
        C3944tP c3944tP = new C3944tP(context, new C3193fa(context, z3), handler, hn2, new C3836rP(c3621nP));
        Y y7 = new Y();
        y7.f28622b = context;
        y7.f28623c = C3084dP.f29775z;
        y7.f28624d = new C3193fa(context, z3);
        y7.f28623c = c3084dP;
        y7.f28625e = handler;
        y7.f28626f = hn;
        AbstractC2772Sd.H(!y7.f28621a);
        Handler handler2 = (Handler) y7.f28625e;
        AbstractC2772Sd.H((handler2 == null && ((HN) y7.f28626f) == null) || !(handler2 == null || ((HN) y7.f28626f) == null));
        y7.f28621a = true;
        return new RP[]{c3944tP, new Z(y7)};
    }

    public void k(boolean z3) {
        synchronized (Qx.class) {
            try {
                S0.e eVar = (S0.e) this.f27139u;
                eVar.t(Boolean.valueOf(z3), "paidv2_publisher_option");
                if (!z3) {
                    eVar.D("paidv2_creation_time");
                    eVar.D("paidv2_id");
                    eVar.D("vendor_scoped_gpid_v2_id");
                    eVar.D("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List l(C3493l5 c3493l5) {
        String str;
        int i;
        List list;
        Cr cr = new Cr((byte[]) c3493l5.f31709v);
        ArrayList arrayList = (C3500lC) this.f27139u;
        while (cr.B() > 0) {
            int K7 = cr.K();
            int K8 = cr.f24253b + cr.K();
            if (K7 == 134) {
                arrayList = new ArrayList();
                int K9 = cr.K() & 31;
                for (int i6 = 0; i6 < K9; i6++) {
                    String k9 = cr.k(3, StandardCharsets.UTF_8);
                    int K10 = cr.K();
                    boolean z3 = (K10 & 128) != 0;
                    if (z3) {
                        i = K10 & 63;
                        str = com.anythink.basead.exoplayer.k.o.f8442X;
                    } else {
                        str = com.anythink.basead.exoplayer.k.o.f8441W;
                        i = 1;
                    }
                    byte K11 = (byte) cr.K();
                    cr.G(1);
                    if (z3) {
                        int i9 = K11 & com.anythink.core.common.s.a.c.f16317b;
                        byte[] bArr = AbstractC4228ym.f35218a;
                        list = Collections.singletonList(i9 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C3299hP c3299hP = new C3299hP();
                    c3299hP.e(str);
                    c3299hP.f30783d = k9;
                    c3299hP.f30777M = i;
                    c3299hP.f30795q = list;
                    arrayList.add(new DP(c3299hP));
                }
            }
            cr.E(K8);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f27138n) {
            case 16:
                C2793Ti c2793Ti = (C2793Ti) this.f27139u;
                St st = c2793Ti.f27782y;
                c2793Ti.f27766A.b(true == C4835j.f39733C.f39743h.i(c2793Ti.f27777n) ? 2 : 1, c2793Ti.f27783z.b(c2793Ti.f27781x, st, false, "", (String) obj, st.f27610c, null, null));
                break;
            case 25:
                ((C2613Io) obj).f25582F = true;
                ((BinderC2895Zo) this.f27139u).f28966w.b();
                break;
            default:
                Yt yt = (Yt) obj;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32091O2)).booleanValue()) {
                    ((C3638np) this.f27139u).f32780k.O(yt);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        int i = this.f27138n;
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        switch (this.f27138n) {
            case 11:
                try {
                    ((InterfaceC2585Hd) this.f27139u).a(c4631a.a());
                    break;
                } catch (RemoteException e9) {
                    v2.i.d("", e9);
                    return;
                }
            default:
                try {
                    ((InterfaceC2551Fd) this.f27139u).a(c4631a.a());
                    break;
                } catch (RemoteException e10) {
                    v2.i.d("", e10);
                }
        }
    }

    public Qx(int i) {
        this.f27138n = i;
        switch (i) {
            case 2:
                this.f27139u = new Cr(10);
                break;
            case 7:
                this.f27139u = Collections.EMPTY_LIST;
                break;
            case 13:
                this.f27139u = new WeakHashMap();
                break;
            default:
                this.f27139u = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2725Ph
    /* renamed from: c, reason: collision with other method in class */
    public void mo8c() {
        switch (this.f27138n) {
            case 23:
                ((Z8) this.f27139u).d();
                break;
            default:
                N3.a a9 = ((C3) this.f27139u).a();
                String str = "persistFlags";
                if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.D8)).booleanValue()) {
                    MA.f(a9, "persistFlags", AbstractC3413jg.f31275h);
                    break;
                } else {
                    C3556mE c3556mE = new C3556mE(str, 6);
                    a9.a(new LD(0, a9, c3556mE), AbstractC3413jg.f31275h);
                    break;
                }
        }
    }

    public Qx(Context context) {
        this.f27138n = 0;
        if (S0.e.f2779w == null) {
            S0.e.f2779w = new S0.e(context);
        }
        this.f27139u = S0.e.f2779w;
    }

    public Qx(InterfaceC2515Db interfaceC2515Db) {
        Context context;
        this.f27138n = 8;
        this.f27139u = interfaceC2515Db;
        try {
            context = (Context) W2.b.F0(interfaceC2515Db.b0());
        } catch (RemoteException | NullPointerException e9) {
            v2.i.d("", e9);
            context = null;
        }
        if (context != null) {
            try {
                ((InterfaceC2515Db) this.f27139u).Q3(new W2.b(new C4751b(context)));
            } catch (RemoteException e10) {
                v2.i.d("", e10);
            }
        }
    }

    public Qx(C2851Xc c2851Xc, C2835Wc c2835Wc) {
        this.f27138n = 10;
        this.f27139u = c2835Wc;
        Objects.requireNonNull(c2851Xc);
    }

    public Qx(BinderC2788Td binderC2788Td, InterfaceC2551Fd interfaceC2551Fd) {
        this.f27138n = 12;
        this.f27139u = interfaceC2551Fd;
        Objects.requireNonNull(binderC2788Td);
    }

    public Qx(BinderC2788Td binderC2788Td, InterfaceC2585Hd interfaceC2585Hd) {
        this.f27138n = 11;
        this.f27139u = interfaceC2585Hd;
        Objects.requireNonNull(binderC2788Td);
    }

    public Qx(C2793Ti c2793Ti) {
        this.f27138n = 16;
        Objects.requireNonNull(c2793Ti);
        this.f27139u = c2793Ti;
    }

    public Qx(C2595Hn c2595Hn) {
        this.f27138n = 24;
        Objects.requireNonNull(c2595Hn);
        this.f27139u = c2595Hn;
    }

    public Qx(BinderC2895Zo binderC2895Zo) {
        this.f27138n = 25;
        Objects.requireNonNull(binderC2895Zo);
        this.f27139u = binderC2895Zo;
    }

    public Qx(C3638np c3638np) {
        this.f27138n = 26;
        Objects.requireNonNull(c3638np);
        this.f27139u = c3638np;
    }

    public Qx(ByteBuffer byteBuffer) {
        this.f27138n = 5;
        this.f27139u = byteBuffer.slice();
    }

    private final void h(Throwable th) {
    }

    private final void i(Throwable th) {
    }

    private final void j(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a, reason: collision with other method in class */
    public void mo7a(Object obj) {
        switch (this.f27138n) {
            case 10:
                C2720Pc c2720Pc = (C2720Pc) obj;
                u2.z.k("Getting a new session for JS Engine.");
                c2720Pc.getClass();
                ((C3467kg) ((C2835Wc) this.f27139u).f731u).b(new C2883Zc(c2720Pc));
                break;
            case 18:
                ((InterfaceC2490Bk) obj).b((C4920z0) this.f27139u);
                break;
            case 19:
                ((InterfaceC2795Tk) obj).a((q2.g1) this.f27139u);
                break;
            case 20:
                ((InterfaceC3580ml) obj).B((H9) this.f27139u);
                break;
            default:
                ((InterfaceC2627Jl) obj).c((C2.t) this.f27139u);
                break;
        }
    }
}
