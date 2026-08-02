package com.google.android.gms.internal.ads;

import O.C0349t;
import R2.InterfaceC0376b;
import android.content.Context;
import android.content.Intent;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import com.IceFishing.LiveIceFishing.GzopPuzzleLogicActivity;
import com.anythink.basead.ui.BaseATView;
import f6.C4522a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import l3.InterfaceC4673a;
import m2.C4741a;
import r2.C4906k;
import s2.C4969z0;
import v7.AbstractC5119j;
import z2.InterfaceC5226c;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3067cm implements InterfaceC4673a, Y0.o, androidx.emoji2.text.o, InterfaceC2926a5, InterfaceC0376b, InterfaceC5226c, KD, InterfaceC2883Xl, Hu, InterfaceC3765pl, YG, InterfaceC3636nH, InterfaceC3606mo, m6.r {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30364n;

    /* renamed from: u, reason: collision with root package name */
    public Object f30365u;

    /* renamed from: v, reason: collision with root package name */
    public Object f30366v;

    public /* synthetic */ C3067cm(int i, Object obj, Object obj2) {
        this.f30364n = i;
        this.f30365u = obj;
        this.f30366v = obj2;
    }

    public static D1.C D(ImageDecoder.Source source, int i, int i4, u1.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C1.d(i, i4, hVar));
        if (C1.a.x(decodeDrawable)) {
            return new D1.C(2, C1.a.i(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public static void J(C3067cm c3067cm, S0.s sVar) {
        C3504ku c3504ku = (C3504ku) c3067cm.f30365u;
        long[] jArr = (long[]) c3504ku.f32445u;
        C3504ku c3504ku2 = (C3504ku) sVar.f2969u;
        long[] jArr2 = (long[]) c3504ku2.f32445u;
        long[] jArr3 = (long[]) sVar.f2970v;
        AbstractC2991bG.I(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c3504ku.f32446v;
        long[] jArr5 = (long[]) c3504ku2.f32446v;
        long[] jArr6 = (long[]) c3504ku2.f32447w;
        AbstractC2991bG.I(jArr4, jArr5, jArr6);
        AbstractC2991bG.I((long[]) c3504ku.f32447w, jArr6, jArr3);
        AbstractC2991bG.I((long[]) c3067cm.f30366v, jArr2, jArr5);
    }

    public void B(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f30365u).add(D.x.p(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    public boolean C(S0.j jVar) {
        boolean containsKey;
        synchronized (this.f30365u) {
            containsKey = ((LinkedHashMap) this.f30366v).containsKey(jVar);
        }
        return containsKey;
    }

    public K0.j F(S0.j jVar) {
        K0.j jVar2;
        synchronized (this.f30365u) {
            jVar2 = (K0.j) ((LinkedHashMap) this.f30366v).remove(jVar);
        }
        return jVar2;
    }

    public List G(String workSpecId) {
        List J;
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        synchronized (this.f30365u) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f30366v;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.h.a(((S0.j) entry.getKey()).f2921a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f30366v).remove((S0.j) it.next());
                }
                J = AbstractC5119j.J(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return J;
    }

    public K0.j H(S0.j jVar) {
        K0.j jVar2;
        synchronized (this.f30365u) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f30366v;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new K0.j(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                jVar2 = (K0.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar2;
    }

    public void K(ArrayList arrayList) {
        C4115wB c4115wB;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C3200fB) arrayList.get(i)).f31021a == 1) {
                try {
                    c4115wB = new C4115wB((C3200fB) arrayList.get(i));
                } catch (TA unused) {
                    c4115wB = null;
                }
                this.f30366v = c4115wB;
            }
        }
    }

    @Override // Y0.o
    public void OnCall() {
        switch (this.f30364n) {
            case 5:
                ((X0.c) this.f30366v).f3745c.startActivity((Intent) this.f30365u);
                break;
            default:
                ((GzopPuzzleLogicActivity) this.f30366v).startActivity((Intent) this.f30365u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        switch (this.f30364n) {
            case 22:
                Iu iu = (Iu) this.f30365u;
                ((Mu) obj).c((Ju) iu.f26366n, iu.f26367u, (Throwable) this.f30366v);
                break;
            default:
                ((InterfaceC4236yO) obj).m((C4182xO) this.f30365u, (C3699oQ) this.f30366v);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public long b(C2994bJ c2994bJ) {
        InterfaceC3636nH interfaceC3636nH = (InterfaceC3636nH) this.f30365u;
        this.f30366v = c2994bJ.f30067a;
        Map map = Collections.EMPTY_MAP;
        try {
            long b9 = interfaceC3636nH.b(c2994bJ);
            Uri i = interfaceC3636nH.i();
            if (i != null) {
                this.f30366v = i;
            }
            interfaceC3636nH.j();
            return b9;
        } catch (Throwable th) {
            Uri i4 = interfaceC3636nH.i();
            if (i4 != null) {
                this.f30366v = i4;
            }
            interfaceC3636nH.j();
            throw th;
        }
    }

    @Override // m6.r
    /* renamed from: build */
    public m6.q mo56build() {
        return (m6.q) ((S0.i) this.f30365u).b(C4522a.f37475w, (String) this.f30366v);
    }

    @Override // com.google.android.gms.internal.ads.Hu
    /* renamed from: c */
    public void mo3c() {
        C3915sa c3915sa = (C3915sa) ((C3447jr) this.f30365u).f32110d;
        BinderC3861ra binderC3861ra = (BinderC3861ra) this.f30366v;
        Parcel F02 = c3915sa.F0();
        AbstractC3411j8.e(F02, binderC3861ra);
        c3915sa.d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public byte[] d(int i, byte[] bArr) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.f30365u;
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.f30366v);
        mac.init(secretKeySpec);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        try {
            C3558lu c3558lu = (C3558lu) ((C3500kq) this.f30365u).f32421b;
            c3558lu.b(z6);
            try {
                c3558lu.f32644a.R2(new Y2.b(context));
            } catch (Throwable th) {
                throw new C3290gu(th);
            }
        } catch (C3290gu e9) {
            throw new C2867Wl(e9.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f30366v;
    }

    @Override // l3.InterfaceC4673a
    public Object g(l3.m mVar) {
        N2.b bVar = (N2.b) this.f30365u;
        bVar.getClass();
        if (!mVar.i()) {
            return mVar;
        }
        Bundle bundle = (Bundle) mVar.g();
        return (bundle == null || !bundle.containsKey("google.messenger")) ? mVar : bVar.a((Bundle) this.f30366v).j(N2.h.f1927v, N2.d.f1922w);
    }

    @Override // androidx.emoji2.text.o
    public Object getResult() {
        return (androidx.emoji2.text.x) this.f30365u;
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        try {
            String canonicalName = ((BinderC2486Ad) this.f30366v).f24464n.getClass().getCanonicalName();
            int i = c4741a.f39357a;
            String str = c4741a.f39358b;
            String str2 = c4741a.f39359c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            x2.i.a(sb.toString());
            InterfaceC3864rd interfaceC3864rd = (InterfaceC3864rd) this.f30365u;
            interfaceC3864rd.r0(c4741a.a());
            interfaceC3864rd.N3(i, str);
            interfaceC3864rd.j0(i);
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public Uri i() {
        return ((InterfaceC3636nH) this.f30365u).i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public Map j() {
        return ((InterfaceC3636nH) this.f30365u).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0265 A[LOOP:0: B:2:0x0010->B:31:0x0265, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0283 A[EDGE_INSN: B:32:0x0283->B:33:0x0283 BREAK  A[LOOP:0: B:2:0x0010->B:31:0x0265], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2926a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3087d5 k(AbstractC3194f5 abstractC3194f5) {
        J3.q qVar;
        byte[] bArr;
        Throwable c3033c5;
        String str;
        int i;
        int i4;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        C3067cm c3067cm = this;
        C0349t c0349t = abstractC3194f5.f30828E;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                W4 w42 = abstractC3194f5.f30826C;
                if (w42 == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = w42.f29112b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j6 = w42.f29114d;
                    if (j6 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j6)));
                    }
                    map = hashMap;
                }
                ((V2) c3067cm.f30365u).getClass();
                qVar = V2.m(abstractC3194f5, map);
                try {
                    int i6 = qVar.f1502a;
                    List unmodifiableList = Collections.unmodifiableList((ArrayList) qVar.f1504c);
                    if (i6 == 304) {
                        SystemClock.elapsedRealtime();
                        W4 w43 = abstractC3194f5.f30826C;
                        if (w43 != null) {
                            TreeSet treeSet = new TreeSet(comparator);
                            if (!unmodifiableList.isEmpty()) {
                                Iterator it = unmodifiableList.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((Z4) it.next()).f29617a);
                                }
                            }
                            ArrayList arrayList = new ArrayList(unmodifiableList);
                            List list = w43.f29118h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (Z4 z42 : w43.f29118h) {
                                        if (!treeSet.contains(z42.f29617a)) {
                                            arrayList.add(z42);
                                        }
                                    }
                                }
                            } else if (!w43.f29117g.isEmpty()) {
                                for (Map.Entry entry : w43.f29117g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new Z4((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new C3087d5(BaseATView.a.f10564O, w43.f29111a, true, arrayList);
                        }
                        try {
                            return new C3087d5(BaseATView.a.f10564O, null, true, unmodifiableList);
                        } catch (IOException e9) {
                            e = e9;
                            bArr = null;
                            if (e instanceof SocketTimeoutException) {
                            }
                            i = c0349t.f2221a;
                            try {
                                i4 = c0349t.f2222b + 1;
                                c0349t.f2222b = i4;
                                c0349t.f2221a = i + i;
                                if (i4 <= 1) {
                                }
                            } catch (C3302h5 e10) {
                                abstractC3194f5.a(str + "-timeout-giveup [timeout=" + i + "]");
                                throw e10;
                            }
                        }
                    } else {
                        C3786q5 c3786q5 = (C3786q5) qVar.f1505d;
                        if (c3786q5 == null) {
                            c3786q5 = null;
                        }
                        if (c3786q5 != null) {
                            int i9 = qVar.f1503b;
                            C3516l5 c3516l5 = (C3516l5) c3067cm.f30366v;
                            C3839r5 c3839r5 = new C3839r5(c3516l5, i9);
                            try {
                                bArr3 = c3516l5.h(1024);
                                while (true) {
                                    try {
                                        int read = c3786q5.read(bArr3);
                                        if (read == -1) {
                                            break;
                                        }
                                        c3839r5.write(bArr3, 0, read);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            c3786q5.close();
                                            break;
                                        } catch (IOException unused) {
                                            AbstractC3462k5.a("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        c3516l5.n(bArr3);
                                        c3839r5.close();
                                        throw th;
                                    }
                                }
                                byte[] byteArray = c3839r5.toByteArray();
                                try {
                                    c3786q5.close();
                                } catch (IOException unused2) {
                                    AbstractC3462k5.a("Error occurred when closing InputStream", new Object[0]);
                                }
                                c3516l5.n(bArr3);
                                c3839r5.close();
                                bArr2 = byteArray;
                            } catch (Throwable th2) {
                                th = th2;
                                bArr3 = null;
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (AbstractC3462k5.f32156a || elapsedRealtime2 > com.anythink.expressad.video.module.a.a.m.ai) {
                                AbstractC3462k5.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC3194f5, Long.valueOf(elapsedRealtime2), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(i6), Integer.valueOf(c0349t.f2222b));
                            }
                            if (i6 < 200 || i6 > 299) {
                                throw new IOException();
                            }
                            SystemClock.elapsedRealtime();
                            return new C3087d5(i6, bArr2, false, unmodifiableList);
                        } catch (IOException e11) {
                            e = e11;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                                boolean z6 = e instanceof MalformedURLException;
                                String str3 = abstractC3194f5.f30831v;
                                if (z6) {
                                    throw new RuntimeException("Bad URL ".concat(String.valueOf(str3)), e);
                                }
                                if (qVar == null) {
                                    throw new C3140e5(e);
                                }
                                int i10 = qVar.f1502a;
                                AbstractC3462k5.c("Unexpected response code %d for %s", Integer.valueOf(i10), str3);
                                if (bArr != null) {
                                    List<Z4> unmodifiableList2 = Collections.unmodifiableList((ArrayList) qVar.f1504c);
                                    SystemClock.elapsedRealtime();
                                    if (unmodifiableList2 != null) {
                                        if (unmodifiableList2.isEmpty()) {
                                            Map map2 = Collections.EMPTY_MAP;
                                        } else {
                                            TreeMap treeMap = new TreeMap(comparator);
                                            for (Z4 z43 : unmodifiableList2) {
                                                treeMap.put(z43.f29617a, z43.f29618b);
                                            }
                                        }
                                    }
                                    if (unmodifiableList2 != null) {
                                        Collections.unmodifiableList(unmodifiableList2);
                                    }
                                    if (i10 != 401 && i10 != 403) {
                                        if (i10 < 400 || i10 > 499) {
                                            throw new C3033c5();
                                        }
                                        throw new Y4();
                                    }
                                    c3033c5 = new V4();
                                    str = "auth";
                                } else {
                                    c3033c5 = new C3033c5();
                                    str = "network";
                                }
                            } else {
                                c3033c5 = new C3033c5();
                                str = "socket";
                            }
                            i = c0349t.f2221a;
                            i4 = c0349t.f2222b + 1;
                            c0349t.f2222b = i4;
                            c0349t.f2221a = i + i;
                            if (i4 <= 1) {
                                throw c3033c5;
                            }
                            abstractC3194f5.a(str + "-retry [timeout=" + i + "]");
                            c3067cm = this;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (IOException e13) {
                e = e13;
                qVar = null;
            }
            abstractC3194f5.a(str + "-retry [timeout=" + i + "]");
            c3067cm = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public void m(InterfaceC3750pN interfaceC3750pN) {
        interfaceC3750pN.getClass();
        ((InterfaceC3636nH) this.f30365u).m(interfaceC3750pN);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f30364n) {
            case 16:
                List list = ((C2628Ij) obj).f26307a;
                C2679Lj c2679Lj = (C2679Lj) this.f30366v;
                RD rd = c2679Lj.f26960a;
                C3887s c3887s = (C3887s) this.f30365u;
                if (list != null && !list.isEmpty()) {
                    P3.a aVar = ND.f27257u;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aVar = QC.t(QC.r(aVar, Throwable.class, new C4187xc(3, c3887s), rd), new C2645Jj(0, c2679Lj, c3887s, (P3.a) it.next()), rd);
                    }
                    aVar.a(new LD(0, aVar, new S0.c(c2679Lj, c3887s)), rd);
                    break;
                } else {
                    rd.execute(new RunnableC2662Kj(c3887s, 0));
                    break;
                }
            case 17:
                ((C3873rm) this.f30366v).m((View) this.f30365u, (C3232fq) obj);
                break;
            case 18:
                ((InterfaceC4084vh) obj).S0((String) this.f30365u, (InterfaceC3272gc) this.f30366v);
                break;
            default:
                String str = (String) obj;
                try {
                    C2725Oe c2725Oe = (C2725Oe) this.f30366v;
                    C2623Ie c2623Ie = (C2623Ie) this.f30365u;
                    Parcel F02 = c2725Oe.F0();
                    F02.writeString(str);
                    AbstractC3411j8.c(F02, c2623Ie);
                    c2725Oe.d1(F02, 1);
                    break;
                } catch (RemoteException e9) {
                    w2.z.l("Service can't call client", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public void o() {
        ((InterfaceC3636nH) this.f30365u).o();
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
        ((C3490kg) this.f30365u).c(new RuntimeException(D.x.k(i, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i).length() + 23))));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public int r(byte[] bArr, int i, int i4) {
        return ((InterfaceC3636nH) this.f30365u).r(bArr, i, i4);
    }

    public String toString() {
        switch (this.f30364n) {
            case 4:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f30366v.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f30365u;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f30364n) {
            case 16:
                ((C3887s) this.f30365u).w(th);
                C2679Lj c2679Lj = (C2679Lj) this.f30366v;
                c2679Lj.getClass();
                AbstractC3436jg.f32060f.execute(new RunnableC3493kj(1, c2679Lj));
                break;
            case 17:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33118p6)).booleanValue()) {
                    C4906k.f40186C.f40196h.e("omid native display exp", th);
                    break;
                }
                break;
            case 18:
                break;
            default:
                try {
                    C2725Oe c2725Oe = (C2725Oe) this.f30366v;
                    C4969z0 k9 = SK.k(th);
                    w2.m mVar = new w2.m(SK.n(th.getMessage()) ? k9.f40513u : th.getMessage(), k9.f40512n);
                    Parcel F02 = c2725Oe.F0();
                    AbstractC3411j8.c(F02, mVar);
                    c2725Oe.d1(F02, 2);
                    break;
                } catch (RemoteException e9) {
                    w2.z.l("Service can't call client", e9);
                }
        }
    }

    @Override // androidx.emoji2.text.o
    public boolean y(CharSequence charSequence, int i, int i4, androidx.emoji2.text.u uVar) {
        if ((uVar.f4773c & 4) > 0) {
            return true;
        }
        if (((androidx.emoji2.text.x) this.f30365u) == null) {
            this.f30365u = new androidx.emoji2.text.x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((c4.e) this.f30366v).getClass();
        ((androidx.emoji2.text.x) this.f30365u).setSpan(new androidx.emoji2.text.v(uVar), i, i4, 33);
        return true;
    }

    @Override // R2.InterfaceC0376b
    public void z() {
        try {
            ((C3490kg) this.f30365u).b((C4079vc) ((W8) ((P1.h) this.f30366v).f2362n).u());
        } catch (DeadObjectException e9) {
            ((C3490kg) this.f30365u).c(e9);
        }
    }

    public /* synthetic */ C3067cm(Object obj, Object obj2, int i, boolean z6) {
        this.f30364n = i;
        this.f30366v = obj;
        this.f30365u = obj2;
    }

    public C3067cm(P1.h hVar, C3490kg c3490kg) {
        this.f30364n = 12;
        this.f30365u = c3490kg;
        Objects.requireNonNull(hVar);
        this.f30366v = hVar;
    }

    public C3067cm(V2 v22) {
        this.f30364n = 11;
        C3516l5 c3516l5 = new C3516l5(0, false);
        this.f30365u = v22;
        this.f30366v = c3516l5;
    }

    public C3067cm(BinderC2486Ad binderC2486Ad, InterfaceC3864rd interfaceC3864rd) {
        this.f30364n = 13;
        this.f30365u = interfaceC3864rd;
        Objects.requireNonNull(binderC2486Ad);
        this.f30366v = binderC2486Ad;
    }

    public C3067cm(C3332hi c3332hi, Context context, String str) {
        this.f30364n = 15;
        C3374iN a9 = C3374iN.a(context);
        C3266gN c3266gN = c3332hi.f31617O0;
        C4255yq c4255yq = new C4255yq(a9, c3266gN, c3332hi.f31619P0, 5);
        C3266gN a10 = C3266gN.a(new C3343ht(c3266gN, 1));
        C3266gN a11 = C3266gN.a(AbstractC2991bG.J);
        C3266gN a12 = C3266gN.a(new C2729Oi(a9, c3332hi.f31637c, c3332hi.f31612M, c4255yq, a10, a11));
        this.f30365u = C3266gN.a(new C3439jj(a12, a10, a11, 4));
        this.f30366v = C3266gN.a(new C2563Em(C3374iN.b(str), a12, a9, a10, a11, c3332hi.i, c3332hi.f31614N, c3332hi.f31659o));
    }

    public C3067cm(C3873rm c3873rm, View view) {
        this.f30364n = 17;
        this.f30365u = view;
        Objects.requireNonNull(c3873rm);
        this.f30366v = c3873rm;
    }

    public C3067cm(C4036un c4036un, String str, InterfaceC3272gc interfaceC3272gc) {
        this.f30364n = 18;
        this.f30365u = str;
        this.f30366v = interfaceC3272gc;
        Objects.requireNonNull(c4036un);
    }

    public C3067cm(BinderC2600Gp binderC2600Gp, C2725Oe c2725Oe, C2623Ie c2623Ie) {
        this.f30364n = 19;
        this.f30366v = c2725Oe;
        this.f30365u = c2623Ie;
    }

    public C3067cm(C3931sq c3931sq, C3500kq c3500kq, St st) {
        this.f30364n = 20;
        this.f30365u = c3500kq;
        this.f30366v = st;
        Objects.requireNonNull(c3931sq);
    }

    public C3067cm(C3523lC c3523lC, int[] iArr) {
        this.f30364n = 24;
        this.f30365u = RB.n(c3523lC);
        this.f30366v = iArr;
    }

    public C3067cm(InterfaceC3636nH interfaceC3636nH) {
        this.f30364n = 27;
        this.f30365u = interfaceC3636nH;
        this.f30366v = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    public /* synthetic */ C3067cm(Object obj) {
        this.f30364n = 4;
        this.f30366v = obj;
        this.f30365u = new ArrayList();
    }

    public C3067cm(byte[] bArr, Provider provider) {
        this.f30364n = 26;
        if (WC.c(1)) {
            this.f30365u = new SecretKeySpec(bArr, "AES");
            this.f30366v = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3067cm(S0.s sVar) {
        this(25);
        this.f30364n = 25;
        J(this, sVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3067cm(int i) {
        this(25, new C3504ku(20), new long[10]);
        this.f30364n = i;
        switch (i) {
            case 9:
                this.f30365u = ByteBuffer.allocateDirect(500);
                break;
            case 10:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f30365u = byteArrayOutputStream;
                this.f30366v = new DataOutputStream(byteArrayOutputStream);
                break;
            case 23:
                C3128du c3128du = new C3128du(3);
                this.f30365u = c3128du;
                this.f30366v = new C3557lt(5, c3128du);
                break;
            case 25:
                break;
            default:
                this.f30365u = new Object();
                this.f30366v = new LinkedHashMap();
                break;
        }
    }

    public C3067cm(EditText editText) {
        this.f30364n = 7;
        this.f30365u = editText;
        c0.i iVar = new c0.i(editText);
        this.f30366v = iVar;
        editText.addTextChangedListener(iVar);
        if (c0.a.f5623b == null) {
            synchronized (c0.a.f5622a) {
                try {
                    if (c0.a.f5623b == null) {
                        c0.a aVar = new c0.a();
                        try {
                            c0.a.f5624c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c0.a.f5623b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c0.a.f5623b);
    }

    private final void I(Throwable th) {
    }
}
