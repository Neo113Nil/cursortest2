package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4164xG implements InterfaceC4272zG, InterfaceC3140eH, InterfaceC3572mH, InterfaceC3865ro, InterfaceC2510Co, InterfaceC3367iQ, YP, InterfaceC3273gn {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35131n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35132u;

    /* renamed from: v, reason: collision with root package name */
    public Object f35133v;

    public C4164xG(int i) {
        this.f35131n = i;
        switch (i) {
            case 4:
                this.f35132u = new HashMap();
                break;
            case 9:
                break;
            case 15:
                this.f35132u = new HashSet();
                break;
            default:
                this.f35132u = null;
                this.f35133v = null;
                break;
        }
    }

    public static final KN O(KN kn, List list) {
        HashMap hashMap = new HashMap(kn.f25958a);
        HashSet hashSet = new HashSet(list);
        for (String str : kn.f25958a.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new KN(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public ByteBuffer A(int i) {
        return ((MediaCodec) this.f35132u).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2510Co
    public /* synthetic */ void C(Object obj, C3526lP c3526lP) {
        ((LO) obj).d((IO) this.f35133v, new C4164xG(c3526lP, ((OO) this.f35132u).f26695e));
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void D(int i) {
        ((MediaCodec) this.f35132u).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public long F(C3197fJ c3197fJ) {
        InterfaceC3572mH interfaceC3572mH = (InterfaceC3572mH) this.f35132u;
        this.f35133v = c3197fJ.f30686a;
        Map map = Collections.EMPTY_MAP;
        try {
            long F8 = interfaceC3572mH.F(c3197fJ);
            Uri i = interfaceC3572mH.i();
            if (i != null) {
                this.f35133v = i;
            }
            interfaceC3572mH.h();
            return F8;
        } catch (Throwable th) {
            Uri i4 = interfaceC3572mH.i();
            if (i4 != null) {
                this.f35133v = i4;
            }
            interfaceC3572mH.h();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void G(int i, int i4, int i9, long j9) {
        ((MediaCodec) this.f35132u).queueInputBuffer(i, 0, i4, j9, i9);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void H(int i, long j9) {
        ((MediaCodec) this.f35132u).releaseOutputBuffer(i, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4272zG
    public Object J(C3838rE c3838rE) {
        return ((C4218yG) this.f35132u).a(c3838rE.f33995a, ((AG) this.f35133v).d());
    }

    public synchronized Map K() {
        try {
            if (((Map) this.f35133v) == null) {
                this.f35133v = Collections.unmodifiableMap(new HashMap((HashMap) this.f35132u));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f35133v;
    }

    public void L(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f35133v;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f35133v = null;
        }
        create = LoudnessCodecController.create(i, HD.f25326n, new XP());
        this.f35133v = create;
        Iterator it = ((HashSet) this.f35132u).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public void M(InterfaceC4279zN interfaceC4279zN) {
        ((List) this.f35132u).add(interfaceC4279zN);
    }

    public /* synthetic */ void N(KN kn) {
        for (Map.Entry entry : new HashMap((HashMap) this.f35132u).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!O(kn, list).equals(O((KN) this.f35133v, list))) {
                throw null;
            }
        }
        this.f35133v = kn;
    }

    public void P(InterfaceC4279zN interfaceC4279zN) {
        ((List) this.f35133v).add(interfaceC4279zN);
    }

    public boolean Q(int i) {
        return ((C3526lP) this.f35132u).f32566a.get(i);
    }

    public C3360iJ R() {
        ECPoint eCPoint;
        C3412jJ c3412jJ = (C3412jJ) this.f35132u;
        if (c3412jJ == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        Mt mt = (Mt) this.f35133v;
        if (mt == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        C3252gJ c3252gJ = c3412jJ.f32098b.f31223b;
        BigInteger order = c3252gJ.f30980b.getOrder();
        BigInteger bigInteger = (BigInteger) mt.f26393u;
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = PF.f26886a;
        ECParameterSpec eCParameterSpec2 = c3252gJ.f30980b;
        if (!PF.b(eCParameterSpec2, eCParameterSpec) && !PF.b(eCParameterSpec2, PF.f26887b) && !PF.b(eCParameterSpec2, PF.f26888c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec2.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec2.getCurve();
        ECPoint generator = eCParameterSpec2.getGenerator();
        PF.a(generator, curve);
        BigInteger a9 = eCParameterSpec2.getCurve().getA();
        BigInteger c4 = PF.c(curve);
        OF d2 = PF.d(ECPoint.POINT_INFINITY, c4);
        OF d3 = PF.d(generator, c4);
        for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
            if (bigInteger.testBit(bitLength)) {
                d2 = PF.f(d2, d3, a9, c4);
                d3 = PF.e(d3, a9, c4);
            } else {
                d3 = PF.f(d2, d3, a9, c4);
                d2 = PF.e(d2, a9, c4);
            }
        }
        if (d2.f26676c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger modInverse = d2.f26676c.modInverse(c4);
            BigInteger mod = modInverse.multiply(modInverse).mod(c4);
            eCPoint = new ECPoint(d2.f26674a.multiply(mod).mod(c4), d2.f26675b.multiply(mod).mod(c4).multiply(modInverse).mod(c4));
        }
        PF.a(eCPoint, curve);
        if (eCPoint.equals(c3412jJ.f32099c)) {
            return new C3360iJ((C3412jJ) this.f35132u, (Mt) this.f35133v);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public AN S() {
        return new AN((List) this.f35132u, (List) this.f35133v);
    }

    public void T(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f35132u).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f35133v) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public void a(DN dn) {
        dn.getClass();
        ((InterfaceC3572mH) this.f35132u).a(dn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3367iQ
    public int b(Object obj) {
        C2986bQ c2986bQ = (C2986bQ) obj;
        HashMap hashMap = AbstractC3419jQ.f32115a;
        c2986bQ.getClass();
        TP tp = (TP) this.f35133v;
        String str = tp.f27776o;
        String str2 = c2986bQ.f29491b;
        return ((str2.equals(str) || str2.equals(AbstractC3419jQ.d(tp))) && c2986bQ.f((Context) this.f35132u, tp, false) && c2986bQ.g(tp)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.YP
    public int c() {
        return ((MediaCodec) this.f35132u).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public ByteBuffer d(int i) {
        return ((MediaCodec) this.f35132u).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public MediaFormat e() {
        return ((MediaCodec) this.f35132u).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void f(ArrayList arrayList) {
        ((MediaCodec) this.f35132u).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void g(Bundle bundle) {
        ((MediaCodec) this.f35132u).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH, com.google.android.gms.internal.ads.KM
    public Map h() {
        return ((InterfaceC3572mH) this.f35132u).h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public Uri i() {
        return ((InterfaceC3572mH) this.f35132u).i();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void j() {
        ((MediaCodec) this.f35132u).flush();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void k() {
        C4164xG c4164xG = (C4164xG) this.f35133v;
        MediaCodec mediaCodec = (MediaCodec) this.f35132u;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && c4164xG != null) {
                c4164xG.T(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && c4164xG != null) {
                c4164xG.T(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void l(Surface surface) {
        ((MediaCodec) this.f35132u).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3140eH
    public byte[] n(int i, byte[] bArr) {
        switch (this.f35131n) {
            case 1:
                if (i > 16) {
                    throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
                }
                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f35132u;
                Mac mac = Mac.getInstance("AESCMAC", (Provider) this.f35133v);
                mac.init(secretKeySpec);
                byte[] doFinal = mac.doFinal(bArr);
                return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
            default:
                return bArr.length <= 64 ? ((C3195fH) this.f35132u).n(i, bArr) : ((C4164xG) this.f35133v).n(i, bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public void o() {
        ((InterfaceC3572mH) this.f35132u).o();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void q() {
        ((MediaCodec) this.f35132u).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void t(int i, FN fn, long j9, int i4) {
        ((MediaCodec) this.f35132u).queueSecureInputBuffer(i, 0, fn.i, j9, i4);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public int v(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f35132u).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.YP
    public void w(int i) {
        ((MediaCodec) this.f35132u).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.JN
    public int z(byte[] bArr, int i, int i4) {
        return ((InterfaceC3572mH) this.f35132u).z(bArr, i, i4);
    }

    public /* synthetic */ C4164xG(int i, Object obj, Object obj2) {
        this.f35131n = i;
        this.f35132u = obj;
        this.f35133v = obj2;
    }

    public C4164xG(int i, int i4) {
        List arrayList;
        Object arrayList2;
        this.f35131n = 5;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.f35132u = arrayList;
        if (i4 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i4);
        }
        this.f35133v = arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        switch (this.f35131n) {
            case 11:
                ((LO) obj).f((KO) this.f35132u, (C4228yQ) this.f35133v);
                break;
            default:
                ((EQ) obj).b(0, ((NP) this.f35132u).f26543a, (C4228yQ) this.f35133v);
                break;
        }
    }

    public /* synthetic */ C4164xG(MediaCodec.CryptoInfo cryptoInfo) {
        this.f35131n = 7;
        this.f35132u = cryptoInfo;
        this.f35133v = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public C4164xG(MediaCodec mediaCodec, C4164xG c4164xG) {
        boolean addMediaCodec;
        this.f35131n = 17;
        this.f35132u = mediaCodec;
        this.f35133v = c4164xG;
        if (Build.VERSION.SDK_INT < 35 || c4164xG == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c4164xG.f35133v;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        PA.T(((HashSet) c4164xG.f35132u).add(mediaCodec));
    }

    public C4164xG(InterfaceC3572mH interfaceC3572mH) {
        this.f35131n = 6;
        this.f35132u = interfaceC3572mH;
        this.f35133v = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    public /* synthetic */ C4164xG(C3093dO c3093dO) {
        this.f35131n = 8;
        Objects.requireNonNull(c3093dO);
        this.f35132u = new HashMap();
        this.f35133v = KN.f25957b;
    }

    public C4164xG(C3526lP c3526lP, SparseArray sparseArray) {
        this.f35131n = 10;
        this.f35132u = c3526lP;
        SparseBooleanArray sparseBooleanArray = c3526lP.f32566a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a9 = c3526lP.a(i);
            KO ko = (KO) sparseArray.get(a9);
            ko.getClass();
            sparseArray2.append(a9, ko);
        }
        this.f35133v = sparseArray2;
    }

    public C4164xG(byte[] bArr, Provider provider) {
        this.f35131n = 1;
        if (XC.e(1)) {
            this.f35132u = new SecretKeySpec(bArr, "AES");
            this.f35133v = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    public C4164xG(Context context) {
        this.f35131n = 14;
        this.f35132u = context == null ? null : context.getApplicationContext();
    }
}
