package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ME {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26269a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26270b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26271c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26272d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26273e;

    public ME(int i) {
        this.f26269a = i;
        switch (i) {
            case 1:
                this.f26270b = new HashMap();
                this.f26271c = new HashMap();
                this.f26272d = new HashMap();
                this.f26273e = new HashMap();
                break;
            case 2:
                this.f26270b = null;
                this.f26271c = null;
                this.f26272d = null;
                this.f26273e = FE.f24766I;
                break;
            case 3:
                this.f26270b = null;
                this.f26271c = null;
                this.f26272d = null;
                this.f26273e = C3933tE.f34250y;
                break;
            default:
                this.f26270b = null;
                this.f26271c = null;
                this.f26272d = null;
                this.f26273e = C3933tE.f34236k;
                break;
        }
    }

    public void a(int i) {
        switch (this.f26269a) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f26270b = Integer.valueOf(i);
                return;
            default:
                this.f26270b = Integer.valueOf(i);
                return;
        }
    }

    public void b(TF tf) {
        BG bg = new BG(tf.f27710a, C4097wG.class);
        HashMap hashMap = (HashMap) this.f26270b;
        if (!hashMap.containsKey(bg)) {
            hashMap.put(bg, tf);
            return;
        }
        TF tf2 = (TF) hashMap.get(bg);
        if (!tf2.equals(tf) || !tf.equals(tf2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(bg.toString()));
        }
    }

    public void c() {
        this.f26271c = 12;
    }

    public void d(int i) {
        this.f26271c = Integer.valueOf(i);
    }

    public void e(RF rf) {
        rf.getClass();
        AG ag = new AG(C4097wG.class, rf.f27185a);
        HashMap hashMap = (HashMap) this.f26271c;
        if (!hashMap.containsKey(ag)) {
            hashMap.put(ag, rf);
            return;
        }
        RF rf2 = (RF) hashMap.get(ag);
        if (!rf2.equals(rf) || !rf.equals(rf2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ag.toString()));
        }
    }

    public void f() {
        this.f26272d = 16;
    }

    public void g(C3504lG c3504lG) {
        BG bg = new BG(c3504lG.f31754a, C4151xG.class);
        HashMap hashMap = (HashMap) this.f26272d;
        if (!hashMap.containsKey(bg)) {
            hashMap.put(bg, c3504lG);
            return;
        }
        C3504lG c3504lG2 = (C3504lG) hashMap.get(bg);
        if (!c3504lG2.equals(c3504lG) || !c3504lG.equals(c3504lG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(bg.toString()));
        }
    }

    public void h(C3396jG c3396jG) {
        c3396jG.getClass();
        AG ag = new AG(C4151xG.class, c3396jG.f31222a);
        HashMap hashMap = (HashMap) this.f26273e;
        if (!hashMap.containsKey(ag)) {
            hashMap.put(ag, c3396jG);
            return;
        }
        C3396jG c3396jG2 = (C3396jG) hashMap.get(ag);
        if (!c3396jG2.equals(c3396jG) || !c3396jG.equals(c3396jG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ag.toString()));
        }
    }

    public NE i() {
        Integer num = (Integer) this.f26270b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f26271c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f26272d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        ((Integer) this.f26271c).getClass();
        ((Integer) this.f26272d).getClass();
        return new NE(intValue, (C3933tE) this.f26273e);
    }

    public LG j() {
        Integer num = (Integer) this.f26270b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f26271c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((KG) this.f26272d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f26270b));
        }
        Integer num2 = (Integer) this.f26271c;
        int intValue = num2.intValue();
        KG kg = (KG) this.f26272d;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (kg == KG.f25890b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (kg == KG.f25891c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (kg == KG.f25892d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (kg == KG.f25893e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (kg != KG.f25894f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new LG(((Integer) this.f26270b).intValue(), ((Integer) this.f26271c).intValue(), (FE) this.f26273e, (KG) this.f26272d);
    }

    public ZI k() {
        C3879sE c3879sE = (C3879sE) this.f26270b;
        if (c3879sE == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        YI yi = (YI) this.f26271c;
        if (yi == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        C3556mE c3556mE = (C3556mE) this.f26272d;
        if (c3556mE == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        C3933tE c3933tE = (C3933tE) this.f26273e;
        if (yi == YI.f28664c && c3556mE != C3556mE.f31919G) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        YI yi2 = YI.f28665d;
        C3556mE c3556mE2 = C3556mE.f31921I;
        if (yi == yi2 && c3556mE != C3556mE.f31920H && c3556mE != c3556mE2) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (yi != YI.f28666e || c3556mE == c3556mE2) {
            return new ZI(c3879sE, yi, c3556mE, c3933tE);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public ME(PQ pq, boolean[] zArr) {
        this.f26269a = 6;
        this.f26270b = pq;
        this.f26271c = zArr;
        int i = pq.f26819a;
        this.f26272d = new boolean[i];
        this.f26273e = new boolean[i];
    }

    public /* synthetic */ ME(AudioTrack audioTrack, C4019ut c4019ut) {
        this.f26269a = 5;
        this.f26270b = audioTrack;
        this.f26271c = c4019ut;
        Handler p9 = AbstractC3159eu.p();
        this.f26272d = p9;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.gP
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                ME me = ME.this;
                if (((C3245gP) me.f26273e) == null) {
                    return;
                }
                AbstractC3043cl.j().execute(new RunnableC3048cq(29, me, audioRouting));
            }
        };
        this.f26273e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p9);
    }

    public ME(DP dp) {
        this.f26269a = 4;
        this.f26270b = dp;
        this.f26271c = null;
        this.f26272d = AbstractC3604n8.f32690a;
        this.f26273e = null;
    }

    public ME(CG cg) {
        this.f26269a = 1;
        this.f26270b = new HashMap(cg.f24084a);
        this.f26271c = new HashMap(cg.f24085b);
        this.f26272d = new HashMap(cg.f24086c);
        this.f26273e = new HashMap(cg.f24087d);
    }
}
