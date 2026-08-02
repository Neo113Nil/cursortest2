package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3081d implements XA {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3672o f30424n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3350i f30425u;

    public /* synthetic */ C3081d(C3672o c3672o, C3350i c3350i) {
        this.f30424n = c3672o;
        this.f30425u = c3350i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r9 != 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r9.f26995b != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    @Override // com.google.android.gms.internal.ads.XA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        Boolean bool;
        int i;
        M m9;
        Spatializer spatializer;
        boolean isAvailable;
        Spatializer spatializer2;
        boolean isEnabled;
        boolean z6;
        boolean isAvailable2;
        Spatializer spatializer3;
        boolean isEnabled2;
        int i4;
        int i6;
        char c9;
        DP dp = (DP) obj;
        C3672o c3672o = this.f30424n;
        c3672o.getClass();
        if (this.f30425u.f31751A && (((bool = c3672o.i) == null || !bool.booleanValue()) && (i = dp.f25154H) != -1 && i > 2)) {
            String str = dp.f25176o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f9207B)) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187078296:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f9254z)) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1504578661:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f9206A)) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                if (c9 != 0) {
                    if (c9 != 1) {
                        if (c9 != 2) {
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                    M m10 = c3672o.f33616g;
                    if (m10 != null) {
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 32 && (m9 = c3672o.f33616g) != null && m9.f26995b && (spatializer = m9.f26994a) != null) {
                isAvailable = spatializer.isAvailable();
                if (isAvailable && (spatializer2 = c3672o.f33616g.f26994a) != null) {
                    isEnabled = spatializer2.isEnabled();
                    if (isEnabled) {
                        M m11 = c3672o.f33616g;
                        C2764Qj c2764Qj = c3672o.f33617h;
                        Spatializer spatializer4 = m11.f26994a;
                        if (spatializer4 != null && m11.f26995b) {
                            isAvailable2 = spatializer4.isAvailable();
                            if (isAvailable2 && (spatializer3 = m11.f26994a) != null) {
                                isEnabled2 = spatializer3.isEnabled();
                                if (isEnabled2) {
                                    boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9207B);
                                    int i9 = dp.f25154H;
                                    if (equals) {
                                        if (i9 == 16) {
                                            i4 = 12;
                                            i6 = dp.f25155I;
                                            if (i6 != -1 || i9 != i4) {
                                                i6 = AbstractC3182eu.e(i4);
                                            }
                                            if (i6 != 0) {
                                                AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i6);
                                                int i10 = dp.J;
                                                if (i10 != -1) {
                                                    channelMask.setSampleRate(i10);
                                                }
                                                Spatializer spatializer5 = m11.f26994a;
                                                spatializer5.getClass();
                                                z6 = P.c.c(spatializer5).canBeSpatialized(c2764Qj.a(), channelMask.build());
                                                if (!z6) {
                                                }
                                            }
                                        }
                                        i4 = i9;
                                        i6 = dp.f25155I;
                                        if (i6 != -1) {
                                        }
                                        i6 = AbstractC3182eu.e(i4);
                                        if (i6 != 0) {
                                        }
                                    } else if (Objects.equals(str, "audio/iamf")) {
                                        if (i9 == -1) {
                                            i4 = 6;
                                            i6 = dp.f25155I;
                                            if (i6 != -1) {
                                            }
                                            i6 = AbstractC3182eu.e(i4);
                                            if (i6 != 0) {
                                            }
                                        }
                                        i4 = i9;
                                        i6 = dp.f25155I;
                                        if (i6 != -1) {
                                        }
                                        i6 = AbstractC3182eu.e(i4);
                                        if (i6 != 0) {
                                        }
                                    } else {
                                        if (Objects.equals(str, "audio/ac4") && (i9 == 18 || i9 == 21)) {
                                            i4 = 24;
                                            i6 = dp.f25155I;
                                            if (i6 != -1) {
                                            }
                                            i6 = AbstractC3182eu.e(i4);
                                            if (i6 != 0) {
                                            }
                                        }
                                        i4 = i9;
                                        i6 = dp.f25155I;
                                        if (i6 != -1) {
                                        }
                                        i6 = AbstractC3182eu.e(i4);
                                        if (i6 != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        z6 = false;
                        if (!z6) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
