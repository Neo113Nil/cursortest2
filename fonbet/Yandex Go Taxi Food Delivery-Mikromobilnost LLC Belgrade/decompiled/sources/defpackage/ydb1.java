package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.adjust.sdk.Constants;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ydb1 {
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, zls zlsVar, zls zlsVar2, zls zlsVar3, zls zlsVar4, to5 to5Var, SlotSize slotSize, boolean z, fid fidVar, int i, int i2) {
        int i3;
        zls zlsVar5;
        zls zlsVar6;
        zls zlsVar7;
        zls zlsVar8;
        int i4;
        to5 to5Var2;
        int i5;
        dmw0 dmw0Var;
        int i6;
        int i7;
        f530 f530Var2;
        SlotSize slotSize2;
        zls zlsVar9;
        zls zlsVar10;
        zls zlsVar11;
        zls zlsVar12;
        to5 to5Var3;
        boolean z2;
        aii0 v;
        f530 f530Var3;
        zls zlsVar13;
        zls zlsVar14;
        zls zlsVar15;
        SlotSize slotSize3;
        int i8;
        boolean z3;
        zls zlsVar16;
        zls zlsVar17;
        zls zlsVar18;
        zls zlsVar19;
        int i9;
        int i10;
        zls zlsVar20;
        int i11;
        zls zlsVar21;
        to5 to5Var4 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-752513346);
        dmw0 dmw0Var2 = btsVar.a;
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                zls zlsVar22 = zlsVar;
                boolean e = btsVar.e(zlsVar22);
                zlsVar20 = zlsVar22;
                if (e) {
                    i11 = 32;
                    zlsVar21 = zlsVar22;
                    i3 |= i11;
                    zlsVar5 = zlsVar21;
                }
            } else {
                zlsVar20 = zlsVar;
            }
            i11 = 16;
            zlsVar21 = zlsVar20;
            i3 |= i11;
            zlsVar5 = zlsVar21;
        } else {
            zlsVar5 = zlsVar;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            zlsVar6 = zlsVar2;
            i3 |= btsVar.e(zlsVar6) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    zlsVar7 = zlsVar3;
                    if (btsVar.e(zlsVar7)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    zlsVar7 = zlsVar3;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                zlsVar7 = zlsVar3;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    zlsVar8 = zlsVar4;
                    if (btsVar.e(zlsVar8)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    zlsVar8 = zlsVar4;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                zlsVar8 = zlsVar4;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                to5Var2 = to5Var;
                i3 |= btsVar.k(to5Var2) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    dmw0Var = dmw0Var2;
                    i3 |= btsVar.c(slotSize == null ? -1 : slotSize.ordinal()) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= btsVar.a(z) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        if (btsVar.V(i3 & 1, (i3 & 4793491) != 4793490)) {
                            btsVar.a0();
                            int i14 = i & 1;
                            f530 f530Var4 = c530.a;
                            if (i14 == 0 || btsVar.C()) {
                                f530Var3 = i12 != 0 ? f530Var4 : f530Var;
                                zls zlsVar23 = zlsVar5;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    zlsVar23 = p8y.a;
                                }
                                if (i13 != 0) {
                                    qdd.a.getClass();
                                    zlsVar13 = qdd.b;
                                } else {
                                    zlsVar13 = zlsVar6;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    zlsVar14 = x901.a;
                                } else {
                                    zlsVar14 = zlsVar7;
                                }
                                if ((i2 & 16) != 0) {
                                    zlsVar15 = ka01.a;
                                    i3 &= -57345;
                                } else {
                                    zlsVar15 = zlsVar8;
                                }
                                if (i4 != 0) {
                                    to5Var2 = to5Var4;
                                }
                                slotSize3 = i5 != 0 ? SlotSize.L : slotSize;
                                i8 = i3;
                                zlsVar19 = zlsVar23;
                                zlsVar18 = zlsVar14;
                                if (i7 != 0) {
                                    z3 = false;
                                    zlsVar17 = zlsVar23;
                                    zlsVar16 = zlsVar14;
                                    btsVar.u();
                                    if (z3) {
                                        f530Var4 = ljs0.h(f530Var4, slotSize3.getSize());
                                    }
                                    oz40 n = f.n(slotSize3, btsVar);
                                    boolean z4 = z3;
                                    f530 k = ljs0.a(f530Var3, slotSize3.getSize(), slotSize3.getSize()).k(f530Var4);
                                    lhl0 a = khl0.a(lr20.a, to5Var4, btsVar, 48);
                                    int hashCode = Long.hashCode(btsVar.T);
                                    r1b0 o = btsVar.o();
                                    f530 d = b.d(btsVar, k);
                                    ohd.G1.getClass();
                                    f530Var2 = f530Var3;
                                    sls slsVar = d.b;
                                    if (dmw0Var != null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar.i0();
                                    if (btsVar.S) {
                                        btsVar.n(slsVar);
                                    } else {
                                        btsVar.r0();
                                    }
                                    wls wlsVar = d.f;
                                    qje.W(btsVar, wlsVar, a);
                                    wls wlsVar2 = d.e;
                                    qje.W(btsVar, wlsVar2, o);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    wls wlsVar3 = d.g;
                                    qje.W(btsVar, wlsVar3, valueOf);
                                    tls tlsVar = d.h;
                                    qje.M(btsVar, tlsVar);
                                    wls wlsVar4 = d.d;
                                    qje.W(btsVar, wlsVar4, d);
                                    Object Q = btsVar.Q();
                                    SlotSize slotSize4 = slotSize3;
                                    o430 o430Var = did.a;
                                    if (Q == o430Var) {
                                        Q = new ibp0(n);
                                        btsVar.o0(Q);
                                    }
                                    ibp0 ibp0Var = (ibp0) Q;
                                    int i15 = i8;
                                    zlsVar17.invoke(ibp0Var, btsVar, Integer.valueOf((i8 & 112) | 6));
                                    zls zlsVar24 = zlsVar17;
                                    zls zlsVar25 = zlsVar13;
                                    if (1.0f <= 0.0d) {
                                        gxv.a("invalid weight; must be greater than zero");
                                    }
                                    f530 k2 = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).k(new pa31(to5Var2));
                                    z910 d2 = pi6.d(x4c.b, false);
                                    to5 to5Var5 = to5Var2;
                                    int hashCode2 = Long.hashCode(btsVar.T);
                                    r1b0 o2 = btsVar.o();
                                    f530 d3 = b.d(btsVar, k2);
                                    btsVar.i0();
                                    zls zlsVar26 = zlsVar15;
                                    if (btsVar.S) {
                                        btsVar.n(slsVar);
                                    } else {
                                        btsVar.r0();
                                    }
                                    qje.W(btsVar, wlsVar, d2);
                                    qje.W(btsVar, wlsVar2, o2);
                                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                                    qje.W(btsVar, wlsVar4, d3);
                                    Object Q2 = btsVar.Q();
                                    if (Q2 == o430Var) {
                                        Q2 = new ebp0(n);
                                        btsVar.o0(Q2);
                                    }
                                    zlsVar25.invoke((ebp0) Q2, btsVar, Integer.valueOf(((i15 >> 3) & 112) | 6));
                                    btsVar.t(true);
                                    zlsVar16.invoke(ibp0Var, btsVar, Integer.valueOf(((i15 >> 6) & 112) | 6));
                                    zlsVar26.invoke(ibp0Var, btsVar, Integer.valueOf(((i15 >> 9) & 112) | 6));
                                    btsVar.t(true);
                                    zlsVar10 = zlsVar25;
                                    zlsVar11 = zlsVar16;
                                    zlsVar12 = zlsVar26;
                                    to5Var3 = to5Var5;
                                    zlsVar9 = zlsVar24;
                                    z2 = z4;
                                    slotSize2 = slotSize4;
                                }
                            } else {
                                btsVar.Y();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                f530Var3 = f530Var;
                                i8 = i3;
                                zlsVar13 = zlsVar6;
                                zlsVar18 = zlsVar7;
                                zlsVar15 = zlsVar8;
                                slotSize3 = slotSize;
                                zlsVar19 = zlsVar5;
                            }
                            z3 = z;
                            zlsVar17 = zlsVar19;
                            zlsVar16 = zlsVar18;
                            btsVar.u();
                            if (z3) {
                            }
                            oz40 n2 = f.n(slotSize3, btsVar);
                            boolean z42 = z3;
                            f530 k3 = ljs0.a(f530Var3, slotSize3.getSize(), slotSize3.getSize()).k(f530Var4);
                            lhl0 a2 = khl0.a(lr20.a, to5Var4, btsVar, 48);
                            int hashCode3 = Long.hashCode(btsVar.T);
                            r1b0 o3 = btsVar.o();
                            f530 d4 = b.d(btsVar, k3);
                            ohd.G1.getClass();
                            f530Var2 = f530Var3;
                            sls slsVar2 = d.b;
                            if (dmw0Var != null) {
                            }
                        } else {
                            btsVar.Y();
                            f530Var2 = f530Var;
                            slotSize2 = slotSize;
                            zlsVar9 = zlsVar5;
                            zlsVar10 = zlsVar6;
                            zlsVar11 = zlsVar7;
                            zlsVar12 = zlsVar8;
                            to5Var3 = to5Var2;
                            z2 = z;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new s07(f530Var2, zlsVar9, zlsVar10, zlsVar11, zlsVar12, to5Var3, slotSize2, z2, i, i2);
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if (btsVar.V(i3 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                dmw0Var = dmw0Var2;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if (btsVar.V(i3 & 1, (i3 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            to5Var2 = to5Var;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            dmw0Var = dmw0Var2;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if (btsVar.V(i3 & 1, (i3 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        zlsVar6 = zlsVar2;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        to5Var2 = to5Var;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        dmw0Var = dmw0Var2;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if (btsVar.V(i3 & 1, (i3 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0501, code lost:
    
        if ("Spreadtrum".equalsIgnoreCase(r10) == false) goto L296;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0591  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a73 b(ep7 ep7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        HashSet hashSet;
        Locale locale;
        boolean z4;
        String str2;
        String str3;
        jlg0 jlg0Var = jlg0.c;
        jlg0Var.getClass();
        try {
            ilg0 ilg0Var = (ilg0) jlg0Var.a.c().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num = (Integer) ep7Var.a(key);
            if (ilg0Var.a(num != null && num.intValue() == 2, AeFpsRangeLegacyQuirk.class)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(ep7Var));
            }
            if (ilg0Var.a(false, AspectRatioLegacyApi21Quirk.class)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet2 = JpegHalCorruptImageQuirk.a;
            String str4 = Build.DEVICE;
            Locale locale2 = Locale.US;
            if (ilg0Var.a(hashSet2.contains(str4.toLowerCase(locale2)), JpegHalCorruptImageQuirk.class)) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet3 = JpegCaptureDownsizingQuirk.a;
            String str5 = Build.MODEL;
            if (ilg0Var.a(hashSet3.contains(str5.toLowerCase(locale2)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, JpegCaptureDownsizingQuirk.class)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num2 = (Integer) ep7Var.a(key);
            if (ilg0Var.a(num2 != null && num2.intValue() == 2, CamcorderProfileResolutionQuirk.class)) {
                arrayList.add(new CamcorderProfileResolutionQuirk(ep7Var));
            }
            String str6 = Build.HARDWARE;
            if (ilg0Var.a(("samsungexynos7420".equalsIgnoreCase(str6) || "universal7420".equalsIgnoreCase(str6)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, CaptureNoResponseQuirk.class)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num3 = (Integer) ep7Var.a(key);
            if (ilg0Var.a(num3 != null && num3.intValue() == 2, LegacyCameraOutputConfigNullPointerQuirk.class)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (ilg0Var.a(false, LegacyCameraSurfaceCleanupQuirk.class)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            if (ilg0Var.a(ImageCaptureWashedOutImageQuirk.a.contains(str5.toUpperCase(locale2)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, ImageCaptureWashedOutImageQuirk.class)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            if (ilg0Var.a(CameraNoResponseWhenEnablingFlashQuirk.a.contains(str5.toUpperCase(locale2)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, CameraNoResponseWhenEnablingFlashQuirk.class)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str7 = Build.BRAND;
            if (ilg0Var.a(("motorola".equalsIgnoreCase(str7) && "MotoG3".equalsIgnoreCase(str5)) || (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str7) && "SM-G532F".equalsIgnoreCase(str5)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str7) && "SM-J700F".equalsIgnoreCase(str5)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str7) && "SM-A920F".equalsIgnoreCase(str5)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str7) && "SM-J415F".equalsIgnoreCase(str5)) || (Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str7) && "Mi A1".equalsIgnoreCase(str5))))), YuvImageOnePixelShiftQuirk.class)) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator it = FlashTooSlowQuirk.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                    if (((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        z = true;
                    }
                }
            }
            z = false;
            if (ilg0Var.a(z, FlashTooSlowQuirk.class)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (ilg0Var.a(Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, AfRegionFlipHorizontallyQuirk.class)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num4 = (Integer) ep7Var.a(key2);
            if (ilg0Var.a(num4 != null && num4.intValue() == 2, ConfigureSurfaceToSecondarySessionFailQuirk.class)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num5 = (Integer) ep7Var.a(key2);
            if (ilg0Var.a(num5 != null && num5.intValue() == 2, PreviewOrientationIncorrectQuirk.class)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num6 = (Integer) ep7Var.a(key2);
            if (ilg0Var.a(num6 != null && num6.intValue() == 2, CaptureSessionStuckQuirk.class)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List list = ImageCaptureFlashNotFireQuirk.b;
            String str8 = Build.MODEL;
            Locale locale3 = Locale.US;
            if (ilg0Var.a((list.contains(str8.toLowerCase(locale3)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.a.contains(str8.toLowerCase(locale3)), ImageCaptureFlashNotFireQuirk.class)) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            if (ilg0Var.a(ImageCaptureWithFlashUnderexposureQuirk.a.contains(str8.toLowerCase(locale3)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1, ImageCaptureWithFlashUnderexposureQuirk.class)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            if (ilg0Var.a(ImageCaptureFailWithAutoFlashQuirk.a.contains(str8.toLowerCase(locale3)) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, ImageCaptureFailWithAutoFlashQuirk.class)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num7 = (Integer) ep7Var.a(key2);
            if (ilg0Var.a(num7 != null && num7.intValue() == 2, IncorrectCaptureStateQuirk.class)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                    if (((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (ilg0Var.a(z2, TorchFlashRequiredFor3aUpdateQuirk.class)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(ep7Var));
            }
            String str9 = Build.MANUFACTURER;
            if (ilg0Var.a(("HUAWEI".equalsIgnoreCase(str9) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str9) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str9) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str9) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str9) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str9) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))), PreviewStretchWhenVideoCaptureIsBoundQuirk.class)) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (ilg0Var.a("Huawei".equalsIgnoreCase(str9), PreviewDelayWhenVideoCaptureIsBoundQuirk.class)) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            if (!ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e() && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f() && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.i() && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g()) {
                String str10 = Build.MODEL;
                if ((!"pixel 4 xl".equalsIgnoreCase(str10) || Build.VERSION.SDK_INT != 29) && ((!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e13".equalsIgnoreCase(str10)) && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h() && !of91.d())) {
                    z3 = false;
                    if (ilg0Var.a(z3, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class)) {
                        arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                    }
                    str = Build.MODEL;
                    if (ilg0Var.a(!"Pixel 8".equalsIgnoreCase(str) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, TemporalNoiseQuirk.class)) {
                        arrayList.add(new TemporalNoiseQuirk());
                    }
                    hashSet = ImageCaptureFailedForVideoSnapshotQuirk.a;
                    locale = Locale.US;
                    if (!hashSet.contains(str.toLowerCase(locale))) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            str3 = Build.SOC_MANUFACTURER;
                        }
                        String str11 = Build.HARDWARE;
                        if (!str11.toLowerCase(locale).startsWith("ums")) {
                            String str12 = Build.BRAND;
                            if ((!"itel".equalsIgnoreCase(str12) || !str11.toLowerCase(locale).startsWith("sp")) && (!"HUAWEI".equalsIgnoreCase(str12) || !"FIG-LX1".equalsIgnoreCase(str))) {
                                z4 = false;
                                if (ilg0Var.a(z4, ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                                    arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                                }
                                str2 = Build.BRAND;
                                if (ilg0Var.a(!"motorola".equalsIgnoreCase(str2) && "moto e20".equalsIgnoreCase(str) && ep7Var.c.equals("1"), CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class)) {
                                    arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
                                }
                                if (ilg0Var.a(!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str2) && Build.DEVICE.equalsIgnoreCase("m55xq"), AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class)) {
                                    arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
                                }
                                a73 a73Var = new a73((List) arrayList);
                                a73.e(a73Var);
                                sgb1.g(3, "CameraQuirks");
                                return a73Var;
                            }
                        }
                    }
                    z4 = true;
                    if (ilg0Var.a(z4, ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                    }
                    str2 = Build.BRAND;
                    if (ilg0Var.a(!"motorola".equalsIgnoreCase(str2) && "moto e20".equalsIgnoreCase(str) && ep7Var.c.equals("1"), CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class)) {
                    }
                    if (ilg0Var.a(!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str2) && Build.DEVICE.equalsIgnoreCase("m55xq"), AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class)) {
                    }
                    a73 a73Var2 = new a73((List) arrayList);
                    a73.e(a73Var2);
                    sgb1.g(3, "CameraQuirks");
                    return a73Var2;
                }
            }
            z3 = true;
            if (ilg0Var.a(z3, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class)) {
            }
            str = Build.MODEL;
            if (ilg0Var.a(!"Pixel 8".equalsIgnoreCase(str) && ((Integer) ep7Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0, TemporalNoiseQuirk.class)) {
            }
            hashSet = ImageCaptureFailedForVideoSnapshotQuirk.a;
            locale = Locale.US;
            if (!hashSet.contains(str.toLowerCase(locale))) {
            }
            z4 = true;
            if (ilg0Var.a(z4, ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            }
            str2 = Build.BRAND;
            if (ilg0Var.a(!"motorola".equalsIgnoreCase(str2) && "moto e20".equalsIgnoreCase(str) && ep7Var.c.equals("1"), CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class)) {
            }
            if (ilg0Var.a(!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str2) && Build.DEVICE.equalsIgnoreCase("m55xq"), AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class)) {
            }
            a73 a73Var22 = new a73((List) arrayList);
            a73.e(a73Var22);
            sgb1.g(3, "CameraQuirks");
            return a73Var22;
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
        }
    }

    public static void c(e2v0 e2v0Var, int i, c9e c9eVar) {
        long c = e2v0Var.c(i);
        List i2 = e2v0Var.i(c);
        if (i2.isEmpty()) {
            return;
        }
        if (i == e2v0Var.g() - 1) {
            ny61.k();
            return;
        }
        long c2 = e2v0Var.c(i + 1) - e2v0Var.c(i);
        if (c2 > 0) {
            c9eVar.accept(new tdf(i2, c, c2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(e2v0 e2v0Var, p2v0 p2v0Var, c9e c9eVar) {
        int h;
        boolean z;
        int i;
        long j = p2v0Var.b;
        if (j == -9223372036854775807L) {
            h = 0;
        } else {
            h = e2v0Var.h(j);
            if (h == -1) {
                h = e2v0Var.g();
            }
            if (h > 0 && e2v0Var.c(h - 1) == j) {
                h--;
            }
        }
        if (j != -9223372036854775807L && h < e2v0Var.g()) {
            List i2 = e2v0Var.i(j);
            long c = e2v0Var.c(h);
            if (!i2.isEmpty()) {
                long j2 = p2v0Var.b;
                if (j2 < c) {
                    c9eVar.accept(new tdf(i2, j2, c - j2));
                    z = true;
                    for (i = h; i < e2v0Var.g(); i++) {
                        c(e2v0Var, i, c9eVar);
                    }
                    if (p2v0Var.a) {
                        return;
                    }
                    if (z) {
                        h--;
                    }
                    for (int i3 = 0; i3 < h; i3++) {
                        c(e2v0Var, i3, c9eVar);
                    }
                    if (z) {
                        c9eVar.accept(new tdf(e2v0Var.i(j), e2v0Var.c(h), j - e2v0Var.c(h)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < e2v0Var.g()) {
        }
        if (p2v0Var.a) {
        }
    }
}
