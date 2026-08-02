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
    public final /* synthetic */ int f27060a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27061b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27062c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27063d;

    /* renamed from: e, reason: collision with root package name */
    public Object f27064e;

    public ME(int i) {
        this.f27060a = i;
        switch (i) {
            case 1:
                this.f27061b = new HashMap();
                this.f27062c = new HashMap();
                this.f27063d = new HashMap();
                this.f27064e = new HashMap();
                break;
            case 2:
                this.f27061b = null;
                this.f27062c = null;
                this.f27063d = null;
                this.f27064e = FE.f25522I;
                break;
            case 3:
                this.f27061b = null;
                this.f27062c = null;
                this.f27063d = null;
                this.f27064e = C3956tE.f35036y;
                break;
            default:
                this.f27061b = null;
                this.f27062c = null;
                this.f27063d = null;
                this.f27064e = C3956tE.f35022k;
                break;
        }
    }

    public void a(int i) {
        switch (this.f27060a) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f27061b = Integer.valueOf(i);
                return;
            default:
                this.f27061b = Integer.valueOf(i);
                return;
        }
    }

    public void b(TF tf) {
        BG bg = new BG(tf.f28493a, C4120wG.class);
        HashMap hashMap = (HashMap) this.f27061b;
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
        this.f27062c = 12;
    }

    public void d(int i) {
        this.f27062c = Integer.valueOf(i);
    }

    public void e(RF rf) {
        rf.getClass();
        AG ag = new AG(C4120wG.class, rf.f27941a);
        HashMap hashMap = (HashMap) this.f27062c;
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
        this.f27063d = 16;
    }

    public void g(C3527lG c3527lG) {
        BG bg = new BG(c3527lG.f32534a, C4174xG.class);
        HashMap hashMap = (HashMap) this.f27063d;
        if (!hashMap.containsKey(bg)) {
            hashMap.put(bg, c3527lG);
            return;
        }
        C3527lG c3527lG2 = (C3527lG) hashMap.get(bg);
        if (!c3527lG2.equals(c3527lG) || !c3527lG.equals(c3527lG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(bg.toString()));
        }
    }

    public void h(C3419jG c3419jG) {
        c3419jG.getClass();
        AG ag = new AG(C4174xG.class, c3419jG.f32009a);
        HashMap hashMap = (HashMap) this.f27064e;
        if (!hashMap.containsKey(ag)) {
            hashMap.put(ag, c3419jG);
            return;
        }
        C3419jG c3419jG2 = (C3419jG) hashMap.get(ag);
        if (!c3419jG2.equals(c3419jG) || !c3419jG.equals(c3419jG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ag.toString()));
        }
    }

    public NE i() {
        Integer num = (Integer) this.f27061b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f27062c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f27063d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        ((Integer) this.f27062c).getClass();
        ((Integer) this.f27063d).getClass();
        return new NE(intValue, (C3956tE) this.f27064e);
    }

    public LG j() {
        Integer num = (Integer) this.f27061b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f27062c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((KG) this.f27063d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f27061b));
        }
        Integer num2 = (Integer) this.f27062c;
        int intValue = num2.intValue();
        KG kg = (KG) this.f27063d;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (kg == KG.f26642b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (kg == KG.f26643c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (kg == KG.f26644d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (kg == KG.f26645e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (kg != KG.f26646f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new LG(((Integer) this.f27061b).intValue(), ((Integer) this.f27062c).intValue(), (FE) this.f27064e, (KG) this.f27063d);
    }

    public ZI k() {
        C3902sE c3902sE = (C3902sE) this.f27061b;
        if (c3902sE == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        YI yi = (YI) this.f27062c;
        if (yi == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        C3579mE c3579mE = (C3579mE) this.f27063d;
        if (c3579mE == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        C3956tE c3956tE = (C3956tE) this.f27064e;
        if (yi == YI.f29441c && c3579mE != C3579mE.f32699G) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        YI yi2 = YI.f29442d;
        C3579mE c3579mE2 = C3579mE.f32701I;
        if (yi == yi2 && c3579mE != C3579mE.f32700H && c3579mE != c3579mE2) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (yi != YI.f29443e || c3579mE == c3579mE2) {
            return new ZI(c3902sE, yi, c3579mE, c3956tE);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public ME(SQ sq, boolean[] zArr) {
        this.f27060a = 6;
        this.f27061b = sq;
        this.f27062c = zArr;
        int i = sq.f28274a;
        this.f27063d = new boolean[i];
        this.f27064e = new boolean[i];
    }

    public /* synthetic */ ME(AudioTrack audioTrack, C4042ut c4042ut) {
        this.f27060a = 5;
        this.f27061b = audioTrack;
        this.f27062c = c4042ut;
        Handler p9 = AbstractC3182eu.p();
        this.f27063d = p9;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.gP
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                ME me = ME.this;
                if (((C3268gP) me.f27064e) == null) {
                    return;
                }
                AbstractC3066cl.j().execute(new RunnableC3071cq(29, me, audioRouting));
            }
        };
        this.f27064e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p9);
    }

    public ME(DP dp) {
        this.f27060a = 4;
        this.f27061b = dp;
        this.f27062c = null;
        this.f27063d = AbstractC3627n8.f33468a;
        this.f27064e = null;
    }

    public ME(CG cg) {
        this.f27060a = 1;
        this.f27061b = new HashMap(cg.f24847a);
        this.f27062c = new HashMap(cg.f24848b);
        this.f27063d = new HashMap(cg.f24849c);
        this.f27064e = new HashMap(cg.f24850d);
    }
}
