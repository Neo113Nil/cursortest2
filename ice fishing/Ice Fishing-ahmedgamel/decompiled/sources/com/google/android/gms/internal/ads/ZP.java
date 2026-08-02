package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ZP {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f29665a = new HashMap();

    public static synchronized List a(String str, boolean z6, boolean z9) {
        synchronized (ZP.class) {
            try {
                TP tp = new TP(str, z6, z9);
                HashMap hashMap = f29665a;
                List list = (List) hashMap.get(tp);
                if (list != null) {
                    return list;
                }
                ArrayList e9 = e(tp, new I1.a(z6, z9, str.equals("video/mv-hevc")));
                if (z6) {
                    e9.isEmpty();
                }
                if (com.anythink.basead.exoplayer.k.o.f9251w.equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && e9.size() == 1 && ((PP) e9.get(0)).f27597a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        e9.add(PP.a("OMX.google.raw.decoder", com.anythink.basead.exoplayer.k.o.f9251w, com.anythink.basead.exoplayer.k.o.f9251w, null, false, false));
                    }
                    Collections.sort(e9, new VP(C3107dP.f30540A));
                }
                if (Build.VERSION.SDK_INT < 32 && e9.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((PP) e9.get(0)).f27597a)) {
                    e9.add((PP) e9.remove(0));
                }
                RB n9 = RB.n(e9);
                hashMap.put(tp, n9);
                return n9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3523lC b(C3107dP c3107dP, DP dp, boolean z6, boolean z9) {
        Iterable a9;
        String str = dp.f25176o;
        c3107dP.getClass();
        List a10 = a(str, z6, z9);
        String d9 = d(dp);
        if (d9 == null) {
            a9 = C3523lC.f32525x;
        } else {
            c3107dP.getClass();
            a9 = a(d9, z6, z9);
        }
        PB pb = RB.f27933u;
        OB ob = new OB(4);
        ob.b(a10);
        ob.b(a9);
        return ob.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i4) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i4;
        return codecProfileLevel;
    }

    public static String d(DP dp) {
        C3550lm d9;
        boolean z6;
        String str = dp.f25176o;
        if (com.anythink.basead.exoplayer.k.o.f9207B.equals(str)) {
            return com.anythink.basead.exoplayer.k.o.f9206A;
        }
        if (com.anythink.basead.exoplayer.k.o.f9210E.equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return com.anythink.basead.exoplayer.k.o.f9209D;
        }
        if ("video/dolby-vision".equals(str) && (d9 = AbstractC4305zm.d(dp)) != null && (z6 = d9.f32625b)) {
            AbstractC2792Sd.H(z6);
            int i = d9.f32624a;
            if (i == 16 || i == 256) {
                return com.anythink.basead.exoplayer.k.o.i;
            }
            if (i == 512) {
                return com.anythink.basead.exoplayer.k.o.f9237h;
            }
            if (i == 1024) {
                KJ kj = dp.f25152F;
                if (kj != null && kj.f26651c == 6 && kj.f26650b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return com.anythink.basead.exoplayer.k.o.i;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160 A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148 A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(TP tp, I1.a aVar) {
        String str;
        int i;
        String str2;
        String str3;
        boolean z6;
        boolean z9;
        int i4;
        boolean isAlias;
        TP tp2 = tp;
        I1.a aVar2 = aVar;
        String str4 = "secure-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = tp2.f28523a;
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) aVar2.f1304v;
            int i6 = aVar2.f1303u;
            if (mediaCodecInfoArr == null) {
                aVar2.f1304v = new MediaCodecList(i6).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) aVar2.f1304v).length;
            int i9 = 0;
            while (i9 < length) {
                if (((MediaCodecInfo[]) aVar2.f1304v) == null) {
                    aVar2.f1304v = new MediaCodecList(i6).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) aVar2.f1304v)[i9];
                if (Build.VERSION.SDK_INT >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        str = str4;
                        i = i9;
                        i9 = i + 1;
                        tp2 = tp;
                        aVar2 = aVar;
                        str4 = str;
                    }
                }
                int i10 = i9;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length2 = supportedTypes.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            int i12 = i11;
                            str2 = supportedTypes[i12];
                            if (str2.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i11 = i12 + 1;
                        } else {
                            if (str5.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str2 = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str2 = null;
                                    }
                                    str2 = "video/dv_hevc";
                                }
                            } else if (str5.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str2 = "video/x-mvhevc";
                                }
                                str2 = null;
                            } else if (str5.equals(com.anythink.basead.exoplayer.k.o.f9216L) && "OMX.lge.alac.decoder".equals(name)) {
                                str2 = "audio/x-lg-alac";
                            } else if (str5.equals(com.anythink.basead.exoplayer.k.o.f9215K) && "OMX.lge.flac.decoder".equals(name)) {
                                str2 = "audio/x-lg-flac";
                            } else {
                                if (str5.equals(com.anythink.basead.exoplayer.k.o.f9254z) && "OMX.lge.ac3.decoder".equals(name)) {
                                    str2 = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                            i9 = i + 1;
                            tp2 = tp;
                            aVar2 = aVar;
                            str4 = str;
                        }
                    }
                    if (str2 != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                            boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            String str6 = str2;
                            try {
                                if (tp2.f28525c) {
                                    if (!isFeatureSupported) {
                                        str = str4;
                                        i = i10;
                                    }
                                    boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported(str4);
                                    boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired(str4);
                                    z6 = tp2.f28524b;
                                    if (!z6) {
                                    }
                                    if (z6) {
                                    }
                                    i4 = Build.VERSION.SDK_INT;
                                    str = str4;
                                    if (i4 < 29) {
                                    }
                                    f(mediaCodecInfo, str5);
                                    boolean z10 = r2;
                                    if (i4 < 29) {
                                    }
                                    if (z6 == z9) {
                                    }
                                    i = i10;
                                } else {
                                    if (!isFeatureRequired) {
                                        boolean isFeatureSupported22 = capabilitiesForType.isFeatureSupported(str4);
                                        boolean isFeatureRequired22 = capabilitiesForType.isFeatureRequired(str4);
                                        z6 = tp2.f28524b;
                                        if (!z6 || !isFeatureRequired22) {
                                            if (z6) {
                                                z9 = isFeatureSupported22;
                                            } else if (isFeatureSupported22) {
                                                z9 = true;
                                            }
                                            i4 = Build.VERSION.SDK_INT;
                                            str = str4;
                                            boolean isHardwareAccelerated = i4 < 29 ? mediaCodecInfo.isHardwareAccelerated() : !f(mediaCodecInfo, str5);
                                            f(mediaCodecInfo, str5);
                                            boolean z102 = isHardwareAccelerated;
                                            if (i4 < 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                String f2 = AbstractC3066cl.f(mediaCodecInfo.getName());
                                                if (!f2.startsWith("omx.google.") && !f2.startsWith("c2.android.")) {
                                                    f2.startsWith("c2.google.");
                                                }
                                            }
                                            if (z6 == z9) {
                                                i = i10;
                                                str3 = str6;
                                                try {
                                                    arrayList.add(PP.a(name, str5, str3, capabilitiesForType, z102, false));
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                    sb.append("Failed to query codec ");
                                                    sb.append(name);
                                                    sb.append(" (");
                                                    sb.append(str3);
                                                    sb.append(")");
                                                    AbstractC2991bG.H("MediaCodecUtil", sb.toString());
                                                    throw e;
                                                }
                                            }
                                            i = i10;
                                        }
                                    }
                                    str = str4;
                                    i = i10;
                                }
                                i9 = i + 1;
                                tp2 = tp;
                                aVar2 = aVar;
                                str4 = str;
                            } catch (Exception e10) {
                                e = e10;
                                str3 = str6;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str3 = str2;
                        }
                    }
                }
                str = str4;
                i = i10;
                i9 = i + 1;
                tp2 = tp;
                aVar2 = aVar;
                str4 = str;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new UP("Failed to query underlying media codecs", e12);
        }
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (H4.a(str)) {
            return true;
        }
        String f2 = AbstractC3066cl.f(mediaCodecInfo.getName());
        if (f2.startsWith("arc.")) {
            return false;
        }
        if (f2.startsWith("omx.google.") || f2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((f2.startsWith("omx.sec.") && f2.contains(".sw.")) || f2.equals("omx.qcom.video.decoder.hevcswvdec") || f2.startsWith("c2.android.") || f2.startsWith("c2.google.")) {
            return true;
        }
        return (f2.startsWith("omx.") || f2.startsWith("c2.")) ? false : true;
    }
}
