package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.internal.consent_sdk.C4323b;
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
import m2.C4741a;
import org.json.JSONObject;
import p2.C4831b;
import r2.C4906k;
import s2.C4969z0;
import z2.InterfaceC5226c;

/* loaded from: classes2.dex */
public final class Qx implements Q4, InterfaceC3598mg, InterfaceC5226c, KD, Eu, InterfaceC3765pl, InterfaceC2745Ph, InterfaceC2498Ap {

    /* renamed from: v, reason: collision with root package name */
    public static Qx f27893v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27894n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27895u;

    public /* synthetic */ Qx(int i, Object obj) {
        this.f27894n = i;
        this.f27895u = obj;
    }

    public static final Qx f(Context context) {
        Qx qx;
        synchronized (Qx.class) {
            try {
                if (f27893v == null) {
                    f27893v = new Qx(context);
                }
                qx = f27893v;
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
        D2.c cVar;
        D2.b bVar;
        switch (this.f27894n) {
            case 17:
                Yt yt = (Yt) obj;
                S0.c cVar2 = ((C2730Oj) this.f27895u).f27418d;
                Iterator it = ((ArrayList) yt.f29533b.f25832w).iterator();
                while (it.hasNext()) {
                    Xt xt = (Xt) it.next();
                    String str = xt.f29378a;
                    Map map = (Map) cVar2.f2902u;
                    boolean containsKey = map.containsKey(str);
                    JSONObject jSONObject = xt.f29379b;
                    if (containsKey && jSONObject != null) {
                        C2610Hi c2610Hi = (C2610Hi) map.get(str);
                        switch (c2610Hi.f26101a) {
                            case 0:
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Aa)).booleanValue()) {
                                    C2786Ro c2786Ro = (C2786Ro) c2610Hi.f26102b;
                                    synchronized (c2786Ro) {
                                        c2786Ro.f28038p = jSONObject;
                                    }
                                    break;
                                } else {
                                    continue;
                                }
                            case 1:
                                D2.a aVar = null;
                                if (jSONObject.has("AvailableMemoryTier")) {
                                    int optInt = jSONObject.optInt("AvailableMemoryTier", -1);
                                    D2.b[] values = D2.b.values();
                                    int length = values.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            bVar = values[i];
                                            if (bVar.f594n != optInt) {
                                                i++;
                                            }
                                        } else {
                                            bVar = null;
                                        }
                                    }
                                    if (bVar != null) {
                                        ((D2.d) c2610Hi.f26102b).f601d.set(bVar);
                                    }
                                }
                                if (jSONObject.has("AvailableProcessorTier")) {
                                    int optInt2 = jSONObject.optInt("AvailableProcessorTier", -1);
                                    D2.c[] values2 = D2.c.values();
                                    int length2 = values2.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < length2) {
                                            cVar = values2[i4];
                                            if (cVar.f597n != optInt2) {
                                                i4++;
                                            }
                                        } else {
                                            cVar = null;
                                        }
                                    }
                                    if (cVar != null) {
                                        ((D2.d) c2610Hi.f26102b).f602e.set(cVar);
                                    }
                                }
                                if (jSONObject.has("AdvertisedMemoryTier")) {
                                    int optInt3 = jSONObject.optInt("AdvertisedMemoryTier", -1);
                                    D2.a[] values3 = D2.a.values();
                                    int length3 = values3.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length3) {
                                            D2.a aVar2 = values3[i6];
                                            if (aVar2.f591n == optInt3) {
                                                aVar = aVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    if (aVar != null) {
                                        D2.d dVar = (D2.d) c2610Hi.f26102b;
                                        synchronized (dVar) {
                                            dVar.f600c.set(aVar);
                                            dVar.f598a.getSharedPreferences("admob", 0).edit().putInt("advertised_memory_tier", aVar.f591n).apply();
                                        }
                                        break;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            default:
                                ((C2539Df) ((C3067cm) c2610Hi.f26102b).f30366v).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong(com.anythink.expressad.foundation.d.d.f19383u));
                                break;
                        }
                    } else {
                        Map map2 = (Map) cVar2.f2903v;
                        if (map2.containsKey(str) && jSONObject != null) {
                            InterfaceC2508Bi interfaceC2508Bi = (InterfaceC2508Bi) map2.get(str);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            interfaceC2508Bi.a(hashMap);
                        }
                    }
                }
                return yt;
            default:
                C2821Tp.j((SQLiteDatabase) obj, (x2.l) this.f27895u);
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public void b(MessageDigest[] messageDigestArr, long j6, int i) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f27895u;
        synchronized (byteBuffer) {
            int i4 = (int) j6;
            byteBuffer.position(i4);
            byteBuffer.limit(i4 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public long c() {
        return ((ByteBuffer) this.f27895u).capacity();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2498Ap
    public /* synthetic */ P3.a d(C2759Qe c2759Qe) {
        return ((BinderC2600Gp) ((InterfaceC3158eN) ((C4297ze) this.f27895u).f36135w).f()).V3(c2759Qe, Binder.getCallingUid());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O3 e(K0 k02, V2 v22, int i) {
        int i4;
        C3550lm c3550lm;
        int i6 = 0;
        O3 o32 = null;
        loop0: while (true) {
            int i9 = 0;
            do {
                int i10 = i9 % 10;
                Cr cr = (Cr) this.f27895u;
                if (i10 == 0) {
                    if (i9 != 0) {
                        byte[] bArr = cr.f24997a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i4 = 0;
                } else {
                    i4 = i10;
                }
                boolean z6 = true;
                int i11 = i9 == 0 ? 10 : 1;
                try {
                    int i12 = i10 + 10;
                    k02.E(cr.f24997a, i12 - i11, i11, false);
                    cr.E(i4);
                    cr.C(i12);
                    if (cr.B() < 3) {
                        int i13 = cr.f24998b;
                        int i14 = cr.f24999c;
                        throw new IndexOutOfBoundsException(D.x.o(new StringBuilder(String.valueOf(i13).length() + 17 + String.valueOf(i14).length()), "position=", i13, ", limit=", i14));
                    }
                    int O8 = cr.O();
                    int i15 = cr.f24998b - 3;
                    cr.f24998b = i15;
                    if (O8 != 4801587) {
                        if (SK.a(cr.J()) != -1) {
                            break loop0;
                        }
                        if (i9 == 0) {
                            cr.A(20);
                        }
                        i9++;
                    } else {
                        cr.G(6);
                        int g9 = cr.g();
                        int i16 = g9 + 10;
                        if (o32 == null) {
                            byte[] bArr2 = new byte[i16];
                            System.arraycopy(cr.f24997a, i15, bArr2, 0, 10);
                            k02.E(bArr2, 10, g9, false);
                            ArrayList arrayList = new ArrayList();
                            Cr cr2 = new Cr(bArr2, i16);
                            if (cr2.B() < 10) {
                                AbstractC2991bG.y("Id3Decoder", "Data too short to be an ID3 tag");
                            } else {
                                int O9 = cr2.O();
                                if (O9 != 4801587) {
                                    AbstractC2991bG.y("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(O9))));
                                } else {
                                    int K7 = cr2.K();
                                    cr2.G(1);
                                    int K8 = cr2.K();
                                    int g10 = cr2.g();
                                    if (K7 == 2) {
                                        if ((K8 & 64) != 0) {
                                            AbstractC2991bG.y("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                        }
                                        c3550lm = new C3550lm(K7, K7 >= 4 && (K8 & 128) != 0, g10);
                                    } else {
                                        if (K7 == 3) {
                                            if ((K8 & 64) != 0) {
                                                int b9 = cr2.b();
                                                cr2.G(b9);
                                                g10 -= b9 + 4;
                                            }
                                        } else if (K7 == 4) {
                                            if ((K8 & 64) != 0) {
                                                int g11 = cr2.g();
                                                cr2.G(g11 - 4);
                                                g10 -= g11;
                                            }
                                            if ((K8 & 16) != 0) {
                                                g10 -= 10;
                                            }
                                        } else {
                                            com.IceFishing.LiveIceFishing.k.t(K7, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder", new StringBuilder(String.valueOf(K7).length() + 46));
                                        }
                                        c3550lm = new C3550lm(K7, K7 >= 4 && (K8 & 128) != 0, g10);
                                    }
                                    if (c3550lm != null) {
                                        int i17 = cr2.f24998b;
                                        int i18 = c3550lm.f32624a;
                                        int i19 = i18 == 2 ? 6 : 10;
                                        boolean z9 = c3550lm.f32625b;
                                        int i20 = c3550lm.f32626c;
                                        if (z9) {
                                            i20 = MA.I(i20, cr2);
                                        }
                                        cr2.C(i17 + i20);
                                        if (MA.t(cr2, i18, i19, false)) {
                                            z6 = false;
                                        } else if (i18 != 4 || !MA.t(cr2, 4, i19, true)) {
                                            com.IceFishing.LiveIceFishing.k.t(i18, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder", new StringBuilder(String.valueOf(i18).length() + 45));
                                        }
                                        while (cr2.B() >= i19) {
                                            AbstractC2923a2 x9 = MA.x(i18, cr2, z6, v22);
                                            if (x9 != null) {
                                                arrayList.add(x9);
                                            }
                                        }
                                        o32 = new O3(arrayList);
                                    }
                                    o32 = null;
                                }
                            }
                            c3550lm = null;
                            if (c3550lm != null) {
                            }
                            o32 = null;
                        } else {
                            k02.d(g9, false);
                        }
                        i6 += i16;
                    }
                } catch (EOFException unused) {
                }
            } while (i9 <= i);
        }
        k02.f26573y = 0;
        k02.d(i6, false);
        return o32;
    }

    public SP[] g(Handler handler, HN hn, HN hn2) {
        boolean z6 = false;
        C3437jh c3437jh = (C3437jh) this.f27895u;
        c3437jh.getClass();
        C3107dP c3107dP = C3107dP.f30547z;
        Context context = c3437jh.f32077n;
        C3644nP c3644nP = new C3644nP(context);
        AbstractC2792Sd.H(!c3644nP.f33506c);
        c3644nP.f33506c = true;
        if (c3644nP.f33509f == null) {
            c3644nP.f33509f = new C3504ku(new InterfaceC3170ei[0]);
        }
        if (c3644nP.f33508e == null) {
            if (c3644nP.f33510g == null) {
                c3644nP.f33510g = new S0.s(context);
            }
            if (c3644nP.f33507d == null) {
                c3644nP.f33507d = V2.f28863C;
            }
            C4297ze c4297ze = new C4297ze(context);
            KO ko = context != null ? null : c3644nP.f33505b;
            Context context2 = (Context) c4297ze.f36133u;
            if (context2 == null) {
                c4297ze.f36134v = ko;
            }
            S0.s sVar = c3644nP.f33510g;
            c4297ze.f36135w = sVar;
            if (sVar == null) {
                c4297ze.f36135w = new S0.s(context2);
            }
            C4323b c4323b = new C4323b();
            Context context3 = (Context) c4297ze.f36133u;
            c4323b.f36417a = context3;
            S0.s sVar2 = (S0.s) c4297ze.f36135w;
            sVar2.getClass();
            c4323b.i = sVar2;
            c4323b.f36421e = (KO) c4297ze.f36134v;
            c4323b.f36418b = context3 != null ? new C4042ut(c4323b) : null;
            c4323b.f36420d = V2.f28873y;
            c3644nP.f33508e = c4323b;
        } else {
            AbstractC2792Sd.H(c3644nP.f33510g == null);
            AbstractC2792Sd.H(c3644nP.f33507d == null);
        }
        C3967tP c3967tP = new C3967tP(context, new C3216fa(context, z6), handler, hn2, new C3859rP(c3644nP));
        Y y7 = new Y();
        y7.f29399b = context;
        y7.f29400c = C3107dP.f30547z;
        y7.f29401d = new C3216fa(context, z6);
        y7.f29400c = c3107dP;
        y7.f29402e = handler;
        y7.f29403f = hn;
        AbstractC2792Sd.H(!y7.f29398a);
        Handler handler2 = (Handler) y7.f29402e;
        AbstractC2792Sd.H((handler2 == null && ((HN) y7.f29403f) == null) || !(handler2 == null || ((HN) y7.f29403f) == null));
        y7.f29398a = true;
        return new SP[]{c3967tP, new Z(y7)};
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        switch (this.f27894n) {
            case 11:
                try {
                    ((InterfaceC2605Hd) this.f27895u).a(c4741a.a());
                    break;
                } catch (RemoteException e9) {
                    x2.i.d("", e9);
                    return;
                }
            default:
                try {
                    ((InterfaceC2571Fd) this.f27895u).a(c4741a.a());
                    break;
                } catch (RemoteException e10) {
                    x2.i.d("", e10);
                }
        }
    }

    public void l(boolean z6) {
        synchronized (Qx.class) {
            try {
                S0.e eVar = (S0.e) this.f27895u;
                eVar.J(Boolean.valueOf(z6), "paidv2_publisher_option");
                if (!z6) {
                    eVar.R("paidv2_creation_time");
                    eVar.R("paidv2_id");
                    eVar.R("vendor_scoped_gpid_v2_id");
                    eVar.R("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List m(C3516l5 c3516l5) {
        String str;
        int i;
        List list;
        Cr cr = new Cr((byte[]) c3516l5.f32489v);
        ArrayList arrayList = (C3523lC) this.f27895u;
        while (cr.B() > 0) {
            int K7 = cr.K();
            int K8 = cr.f24998b + cr.K();
            if (K7 == 134) {
                arrayList = new ArrayList();
                int K9 = cr.K() & 31;
                for (int i4 = 0; i4 < K9; i4++) {
                    String k9 = cr.k(3, StandardCharsets.UTF_8);
                    int K10 = cr.K();
                    boolean z6 = (K10 & 128) != 0;
                    if (z6) {
                        i = K10 & 63;
                        str = com.anythink.basead.exoplayer.k.o.f9228X;
                    } else {
                        str = com.anythink.basead.exoplayer.k.o.f9227W;
                        i = 1;
                    }
                    byte K11 = (byte) cr.K();
                    cr.G(1);
                    if (z6) {
                        int i6 = K11 & com.anythink.core.common.s.a.c.f17104b;
                        byte[] bArr = AbstractC4305zm.f36216a;
                        list = Collections.singletonList(i6 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C3322hP c3322hP = new C3322hP();
                    c3322hP.e(str);
                    c3322hP.f31549d = k9;
                    c3322hP.f31543M = i;
                    c3322hP.f31561q = list;
                    arrayList.add(new DP(c3322hP));
                }
            }
            cr.E(K8);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f27894n) {
            case 16:
                C2814Ti c2814Ti = (C2814Ti) this.f27895u;
                St st = c2814Ti.f28569y;
                c2814Ti.f28553A.b(true == C4906k.f40186C.f40196h.i(c2814Ti.f28564n) ? 2 : 1, c2814Ti.f28570z.b(c2814Ti.f28568x, st, false, "", (String) obj, st.f28393c, null, null));
                break;
            case 25:
                ((C2650Jo) obj).f26506F = true;
                ((BinderC2918Zo) this.f27895u).f29736w.b();
                break;
            default:
                Yt yt = (Yt) obj;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32870O2)).booleanValue()) {
                    ((C3661np) this.f27895u).f33567k.O(yt);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        int i = this.f27894n;
    }

    public Qx(int i) {
        this.f27894n = i;
        switch (i) {
            case 2:
                this.f27895u = new Cr(10);
                break;
            case 7:
                this.f27895u = Collections.EMPTY_LIST;
                break;
            case 13:
                this.f27895u = new WeakHashMap();
                break;
            default:
                this.f27895u = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2745Ph
    /* renamed from: c, reason: collision with other method in class */
    public void mo7c() {
        switch (this.f27894n) {
            case 23:
                ((Z8) this.f27895u).d();
                break;
            default:
                P3.a a9 = ((C3) this.f27895u).a();
                String str = "persistFlags";
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.D8)).booleanValue()) {
                    MA.f(a9, "persistFlags", AbstractC3436jg.f32062h);
                    break;
                } else {
                    C3579mE c3579mE = new C3579mE(str, 6);
                    a9.a(new LD(0, a9, c3579mE), AbstractC3436jg.f32062h);
                    break;
                }
        }
    }

    public Qx(Context context) {
        this.f27894n = 0;
        if (S0.e.f2906w == null) {
            S0.e.f2906w = new S0.e(context);
        }
        this.f27895u = S0.e.f2906w;
    }

    public Qx(InterfaceC2535Db interfaceC2535Db) {
        Context context;
        this.f27894n = 8;
        this.f27895u = interfaceC2535Db;
        try {
            context = (Context) Y2.b.D0(interfaceC2535Db.b0());
        } catch (RemoteException | NullPointerException e9) {
            x2.i.d("", e9);
            context = null;
        }
        if (context != null) {
            try {
                ((InterfaceC2535Db) this.f27895u).L3(new Y2.b(new C4831b(context)));
            } catch (RemoteException e10) {
                x2.i.d("", e10);
            }
        }
    }

    public Qx(C2874Xc c2874Xc, C2858Wc c2858Wc) {
        this.f27894n = 10;
        this.f27895u = c2858Wc;
        Objects.requireNonNull(c2874Xc);
    }

    public Qx(BinderC2809Td binderC2809Td, InterfaceC2571Fd interfaceC2571Fd) {
        this.f27894n = 12;
        this.f27895u = interfaceC2571Fd;
        Objects.requireNonNull(binderC2809Td);
    }

    public Qx(BinderC2809Td binderC2809Td, InterfaceC2605Hd interfaceC2605Hd) {
        this.f27894n = 11;
        this.f27895u = interfaceC2605Hd;
        Objects.requireNonNull(binderC2809Td);
    }

    public Qx(C2814Ti c2814Ti) {
        this.f27894n = 16;
        Objects.requireNonNull(c2814Ti);
        this.f27895u = c2814Ti;
    }

    public Qx(C2632In c2632In) {
        this.f27894n = 24;
        Objects.requireNonNull(c2632In);
        this.f27895u = c2632In;
    }

    public Qx(BinderC2918Zo binderC2918Zo) {
        this.f27894n = 25;
        Objects.requireNonNull(binderC2918Zo);
        this.f27895u = binderC2918Zo;
    }

    public Qx(C3661np c3661np) {
        this.f27894n = 26;
        Objects.requireNonNull(c3661np);
        this.f27895u = c3661np;
    }

    public Qx(ByteBuffer byteBuffer) {
        this.f27894n = 5;
        this.f27895u = byteBuffer.slice();
    }

    private final void i(Throwable th) {
    }

    private final void j(Throwable th) {
    }

    private final void k(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a, reason: collision with other method in class */
    public void mo6a(Object obj) {
        switch (this.f27894n) {
            case 10:
                C2740Pc c2740Pc = (C2740Pc) obj;
                w2.z.k("Getting a new session for JS Engine.");
                c2740Pc.getClass();
                ((C3490kg) ((C2858Wc) this.f27895u).f256u).b(new C2906Zc(c2740Pc));
                break;
            case 18:
                ((InterfaceC2510Bk) obj).c((C4969z0) this.f27895u);
                break;
            case 19:
                ((InterfaceC2816Tk) obj).b((s2.g1) this.f27895u);
                break;
            case 20:
                ((InterfaceC3603ml) obj).A((H9) this.f27895u);
                break;
            default:
                ((InterfaceC2664Kl) obj).c((E2.s) this.f27895u);
                break;
        }
    }
}
