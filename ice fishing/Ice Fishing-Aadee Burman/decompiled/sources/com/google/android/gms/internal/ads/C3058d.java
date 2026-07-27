package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3058d implements XA {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3649o f29652n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3327i f29653u;

    public /* synthetic */ C3058d(C3649o c3649o, C3327i c3327i) {
        this.f29652n = c3649o;
        this.f29653u = c3327i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r9 != 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r9.f26204b != false) goto L43;
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
        M m4;
        Spatializer spatializer;
        boolean isAvailable;
        Spatializer spatializer2;
        boolean isEnabled;
        boolean z3;
        boolean isAvailable2;
        Spatializer spatializer3;
        boolean isEnabled2;
        int i6;
        int i9;
        char c9;
        DP dp = (DP) obj;
        C3649o c3649o = this.f29652n;
        c3649o.getClass();
        if (this.f29653u.f30978A && (((bool = c3649o.i) == null || !bool.booleanValue()) && (i = dp.f24409H) != -1 && i > 2)) {
            String str = dp.f24431o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f8421B)) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187078296:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f8468z)) {
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
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f8420A)) {
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
                    M m9 = c3649o.f32829g;
                    if (m9 != null) {
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 32 && (m4 = c3649o.f32829g) != null && m4.f26204b && (spatializer = m4.f26203a) != null) {
                isAvailable = spatializer.isAvailable();
                if (isAvailable && (spatializer2 = c3649o.f32829g.f26203a) != null) {
                    isEnabled = spatializer2.isEnabled();
                    if (isEnabled) {
                        M m10 = c3649o.f32829g;
                        C2744Qj c2744Qj = c3649o.f32830h;
                        Spatializer spatializer4 = m10.f26203a;
                        if (spatializer4 != null && m10.f26204b) {
                            isAvailable2 = spatializer4.isAvailable();
                            if (isAvailable2 && (spatializer3 = m10.f26203a) != null) {
                                isEnabled2 = spatializer3.isEnabled();
                                if (isEnabled2) {
                                    boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8421B);
                                    int i10 = dp.f24409H;
                                    if (equals) {
                                        if (i10 == 16) {
                                            i6 = 12;
                                            i9 = dp.f24410I;
                                            if (i9 != -1 || i10 != i6) {
                                                i9 = AbstractC3159eu.e(i6);
                                            }
                                            if (i9 != 0) {
                                                AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i9);
                                                int i11 = dp.J;
                                                if (i11 != -1) {
                                                    channelMask.setSampleRate(i11);
                                                }
                                                Spatializer spatializer5 = m10.f26203a;
                                                spatializer5.getClass();
                                                z3 = P.c.c(spatializer5).canBeSpatialized(c2744Qj.a(), channelMask.build());
                                                if (!z3) {
                                                }
                                            }
                                        }
                                        i6 = i10;
                                        i9 = dp.f24410I;
                                        if (i9 != -1) {
                                        }
                                        i9 = AbstractC3159eu.e(i6);
                                        if (i9 != 0) {
                                        }
                                    } else if (Objects.equals(str, "audio/iamf")) {
                                        if (i10 == -1) {
                                            i6 = 6;
                                            i9 = dp.f24410I;
                                            if (i9 != -1) {
                                            }
                                            i9 = AbstractC3159eu.e(i6);
                                            if (i9 != 0) {
                                            }
                                        }
                                        i6 = i10;
                                        i9 = dp.f24410I;
                                        if (i9 != -1) {
                                        }
                                        i9 = AbstractC3159eu.e(i6);
                                        if (i9 != 0) {
                                        }
                                    } else {
                                        if (Objects.equals(str, "audio/ac4") && (i10 == 18 || i10 == 21)) {
                                            i6 = 24;
                                            i9 = dp.f24410I;
                                            if (i9 != -1) {
                                            }
                                            i9 = AbstractC3159eu.e(i6);
                                            if (i9 != 0) {
                                            }
                                        }
                                        i6 = i10;
                                        i9 = dp.f24410I;
                                        if (i9 != -1) {
                                        }
                                        i9 = AbstractC3159eu.e(i6);
                                        if (i9 != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
