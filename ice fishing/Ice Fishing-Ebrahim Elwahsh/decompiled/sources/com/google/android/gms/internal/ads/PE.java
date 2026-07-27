package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class PE {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26881a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26882b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26883c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26884d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26885e;

    public PE(int i) {
        this.f26881a = i;
        switch (i) {
            case 1:
                this.f26882b = new HashMap();
                this.f26883c = new HashMap();
                this.f26884d = new HashMap();
                this.f26885e = new HashMap();
                break;
            case 2:
                this.f26882b = null;
                this.f26883c = null;
                this.f26884d = null;
                this.f26885e = QG.f27135e;
                break;
            case 3:
                this.f26882b = null;
                this.f26883c = null;
                this.f26884d = null;
                this.f26885e = LE.f26123G;
                break;
            default:
                this.f26882b = null;
                this.f26883c = null;
                this.f26884d = null;
                this.f26885e = C3731pE.f33353A;
                break;
        }
    }

    public void a(int i) {
        switch (this.f26881a) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f26882b = Integer.valueOf(i);
                return;
            default:
                this.f26882b = Integer.valueOf(i);
                return;
        }
    }

    public void b(XF xf) {
        GG gg = new GG(xf.f28624a, BG.class);
        HashMap hashMap = (HashMap) this.f26882b;
        if (!hashMap.containsKey(gg)) {
            hashMap.put(gg, xf);
            return;
        }
        XF xf2 = (XF) hashMap.get(gg);
        if (!xf2.equals(xf) || !xf.equals(xf2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(gg.toString()));
        }
    }

    public void c() {
        this.f26883c = 12;
    }

    public void d(int i) {
        this.f26883c = Integer.valueOf(i);
    }

    public void e(VF vf) {
        vf.getClass();
        FG fg = new FG(BG.class, vf.f28228a);
        HashMap hashMap = (HashMap) this.f26883c;
        if (!hashMap.containsKey(fg)) {
            hashMap.put(fg, vf);
            return;
        }
        VF vf2 = (VF) hashMap.get(fg);
        if (!vf2.equals(vf) || !vf.equals(vf2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(fg.toString()));
        }
    }

    public void f() {
        this.f26884d = 16;
    }

    public void g(C3733pG c3733pG) {
        GG gg = new GG(c3733pG.f33374a, CG.class);
        HashMap hashMap = (HashMap) this.f26884d;
        if (!hashMap.containsKey(gg)) {
            hashMap.put(gg, c3733pG);
            return;
        }
        C3733pG c3733pG2 = (C3733pG) hashMap.get(gg);
        if (!c3733pG2.equals(c3733pG) || !c3733pG.equals(c3733pG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(gg.toString()));
        }
    }

    public void h(C3625nG c3625nG) {
        c3625nG.getClass();
        FG fg = new FG(CG.class, c3625nG.f32845a);
        HashMap hashMap = (HashMap) this.f26885e;
        if (!hashMap.containsKey(fg)) {
            hashMap.put(fg, c3625nG);
            return;
        }
        C3625nG c3625nG2 = (C3625nG) hashMap.get(fg);
        if (!c3625nG2.equals(c3625nG) || !c3625nG.equals(c3625nG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(fg.toString()));
        }
    }

    public QE i() {
        Integer num = (Integer) this.f26882b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f26883c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f26884d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        ((Integer) this.f26883c).getClass();
        ((Integer) this.f26884d).getClass();
        return new QE(intValue, (C3731pE) this.f26885e);
    }

    public RG j() {
        Integer num = (Integer) this.f26882b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f26883c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((PG) this.f26884d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f26882b));
        }
        Integer num2 = (Integer) this.f26883c;
        int intValue = num2.intValue();
        PG pg = (PG) this.f26884d;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (pg == PG.f26893b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (pg == PG.f26894c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (pg == PG.f26895d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (pg == PG.f26896e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (pg != PG.f26897f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new RG(((Integer) this.f26882b).intValue(), ((Integer) this.f26883c).intValue(), (QG) this.f26885e, (PG) this.f26884d);
    }

    public C3306hJ k() {
        HE he = (HE) this.f26882b;
        if (he == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        C3252gJ c3252gJ = (C3252gJ) this.f26883c;
        if (c3252gJ == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        GE ge = (GE) this.f26884d;
        if (ge == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        LE le = (LE) this.f26885e;
        if (c3252gJ == C3252gJ.f30976c && ge != GE.f25124m) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        C3252gJ c3252gJ2 = C3252gJ.f30977d;
        GE ge2 = GE.f25126o;
        if (c3252gJ == c3252gJ2 && ge != GE.f25125n && ge != ge2) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (c3252gJ != C3252gJ.f30978e || ge == ge2) {
            return new C3306hJ(he, c3252gJ, ge, le);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public PE(C3041cR c3041cR, boolean[] zArr) {
        this.f26881a = 6;
        this.f26882b = c3041cR;
        this.f26883c = zArr;
        int i = c3041cR.f29710a;
        this.f26884d = new boolean[i];
        this.f26885e = new boolean[i];
    }

    public /* synthetic */ PE(AudioTrack audioTrack, C4086vt c4086vt) {
        this.f26881a = 5;
        this.f26882b = audioTrack;
        this.f26883c = c4086vt;
        Handler p6 = AbstractC3548lu.p();
        this.f26884d = p6;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.tP
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                PE pe = PE.this;
                if (((C3957tP) pe.f26885e) == null) {
                    return;
                }
                AbstractC3217fl.j().execute(new RunnableC3903sP(0, pe, audioRouting));
            }
        };
        this.f26885e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p6);
    }

    public PE(TP tp) {
        this.f26881a = 4;
        this.f26882b = tp;
        this.f26883c = null;
        this.f26884d = AbstractC3832r8.f33969a;
        this.f26885e = null;
    }

    public PE(HG hg) {
        this.f26881a = 1;
        this.f26882b = new HashMap(hg.f25340a);
        this.f26883c = new HashMap(hg.f25341b);
        this.f26884d = new HashMap(hg.f25342c);
        this.f26885e = new HashMap(hg.f25343d);
    }
}
