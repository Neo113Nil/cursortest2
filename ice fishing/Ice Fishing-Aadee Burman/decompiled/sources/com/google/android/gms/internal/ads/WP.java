package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class WP {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28354a = new HashMap();

    public static synchronized List a(String str, boolean z3, boolean z6) {
        synchronized (WP.class) {
            try {
                SP sp = new SP(str, z3, z6);
                HashMap hashMap = f28354a;
                List list = (List) hashMap.get(sp);
                if (list != null) {
                    return list;
                }
                ArrayList e9 = e(sp, new G1.a(z3, z6, str.equals("video/mv-hevc")));
                if (z3) {
                    e9.isEmpty();
                }
                if (com.anythink.basead.exoplayer.k.o.f8465w.equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && e9.size() == 1 && ((OP) e9.get(0)).f26604a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        e9.add(OP.a("OMX.google.raw.decoder", com.anythink.basead.exoplayer.k.o.f8465w, com.anythink.basead.exoplayer.k.o.f8465w, null, false, false));
                    }
                    Collections.sort(e9, new UP(C3084dP.f29768A));
                }
                if (Build.VERSION.SDK_INT < 32 && e9.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((OP) e9.get(0)).f26604a)) {
                    e9.add((OP) e9.remove(0));
                }
                RB n9 = RB.n(e9);
                hashMap.put(sp, n9);
                return n9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3500lC b(C3084dP c3084dP, DP dp, boolean z3, boolean z6) {
        Iterable a9;
        String str = dp.f24431o;
        c3084dP.getClass();
        List a10 = a(str, z3, z6);
        String d2 = d(dp);
        if (d2 == null) {
            a9 = C3500lC.f31745x;
        } else {
            c3084dP.getClass();
            a9 = a(d2, z3, z6);
        }
        PB pb = RB.f27177u;
        OB ob = new OB(4);
        ob.b(a10);
        ob.b(a9);
        return ob.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i6) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i6;
        return codecProfileLevel;
    }

    public static String d(DP dp) {
        C3473km d2;
        boolean z3;
        String str = dp.f24431o;
        if (com.anythink.basead.exoplayer.k.o.f8421B.equals(str)) {
            return com.anythink.basead.exoplayer.k.o.f8420A;
        }
        if (com.anythink.basead.exoplayer.k.o.f8424E.equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return com.anythink.basead.exoplayer.k.o.f8423D;
        }
        if ("video/dolby-vision".equals(str) && (d2 = AbstractC4228ym.d(dp)) != null && (z3 = d2.f31627b)) {
            AbstractC2772Sd.H(z3);
            int i = d2.f31626a;
            if (i == 16 || i == 256) {
                return com.anythink.basead.exoplayer.k.o.i;
            }
            if (i == 512) {
                return com.anythink.basead.exoplayer.k.o.f8451h;
            }
            if (i == 1024) {
                KJ kj = dp.f24407F;
                if (kj != null && kj.f25899c == 6 && kj.f25898b == 1) {
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
    public static ArrayList e(SP sp, G1.a aVar) {
        String str;
        int i;
        String str2;
        String str3;
        boolean z3;
        boolean z6;
        int i6;
        boolean isAlias;
        SP sp2 = sp;
        G1.a aVar2 = aVar;
        String str4 = "secure-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = sp2.f27482a;
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) aVar2.f1051v;
            int i9 = aVar2.f1050u;
            if (mediaCodecInfoArr == null) {
                aVar2.f1051v = new MediaCodecList(i9).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) aVar2.f1051v).length;
            int i10 = 0;
            while (i10 < length) {
                if (((MediaCodecInfo[]) aVar2.f1051v) == null) {
                    aVar2.f1051v = new MediaCodecList(i9).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) aVar2.f1051v)[i10];
                if (Build.VERSION.SDK_INT >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        str = str4;
                        i = i10;
                        i10 = i + 1;
                        sp2 = sp;
                        aVar2 = aVar;
                        str4 = str;
                    }
                }
                int i11 = i10;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length2 = supportedTypes.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            int i13 = i12;
                            str2 = supportedTypes[i13];
                            if (str2.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i12 = i13 + 1;
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
                            } else if (str5.equals(com.anythink.basead.exoplayer.k.o.f8430L) && "OMX.lge.alac.decoder".equals(name)) {
                                str2 = "audio/x-lg-alac";
                            } else if (str5.equals(com.anythink.basead.exoplayer.k.o.f8429K) && "OMX.lge.flac.decoder".equals(name)) {
                                str2 = "audio/x-lg-flac";
                            } else {
                                if (str5.equals(com.anythink.basead.exoplayer.k.o.f8468z) && "OMX.lge.ac3.decoder".equals(name)) {
                                    str2 = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                            i10 = i + 1;
                            sp2 = sp;
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
                                if (sp2.f27484c) {
                                    if (!isFeatureSupported) {
                                        str = str4;
                                        i = i11;
                                    }
                                    boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported(str4);
                                    boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired(str4);
                                    z3 = sp2.f27483b;
                                    if (!z3) {
                                    }
                                    if (z3) {
                                    }
                                    i6 = Build.VERSION.SDK_INT;
                                    str = str4;
                                    if (i6 < 29) {
                                    }
                                    f(mediaCodecInfo, str5);
                                    boolean z9 = r2;
                                    if (i6 < 29) {
                                    }
                                    if (z3 == z6) {
                                    }
                                    i = i11;
                                } else {
                                    if (!isFeatureRequired) {
                                        boolean isFeatureSupported22 = capabilitiesForType.isFeatureSupported(str4);
                                        boolean isFeatureRequired22 = capabilitiesForType.isFeatureRequired(str4);
                                        z3 = sp2.f27483b;
                                        if (!z3 || !isFeatureRequired22) {
                                            if (z3) {
                                                z6 = isFeatureSupported22;
                                            } else if (isFeatureSupported22) {
                                                z6 = true;
                                            }
                                            i6 = Build.VERSION.SDK_INT;
                                            str = str4;
                                            boolean isHardwareAccelerated = i6 < 29 ? mediaCodecInfo.isHardwareAccelerated() : !f(mediaCodecInfo, str5);
                                            f(mediaCodecInfo, str5);
                                            boolean z92 = isHardwareAccelerated;
                                            if (i6 < 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                String f3 = AbstractC3043cl.f(mediaCodecInfo.getName());
                                                if (!f3.startsWith("omx.google.") && !f3.startsWith("c2.android.")) {
                                                    f3.startsWith("c2.google.");
                                                }
                                            }
                                            if (z3 == z6) {
                                                i = i11;
                                                str3 = str6;
                                                try {
                                                    arrayList.add(OP.a(name, str5, str3, capabilitiesForType, z92, false));
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                    sb.append("Failed to query codec ");
                                                    sb.append(name);
                                                    sb.append(" (");
                                                    sb.append(str3);
                                                    sb.append(")");
                                                    AbstractC2968bG.H("MediaCodecUtil", sb.toString());
                                                    throw e;
                                                }
                                            }
                                            i = i11;
                                        }
                                    }
                                    str = str4;
                                    i = i11;
                                }
                                i10 = i + 1;
                                sp2 = sp;
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
                i = i11;
                i10 = i + 1;
                sp2 = sp;
                aVar2 = aVar;
                str4 = str;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new TP("Failed to query underlying media codecs", e12);
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
        String f3 = AbstractC3043cl.f(mediaCodecInfo.getName());
        if (f3.startsWith("arc.")) {
            return false;
        }
        if (f3.startsWith("omx.google.") || f3.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((f3.startsWith("omx.sec.") && f3.contains(".sw.")) || f3.equals("omx.qcom.video.decoder.hevcswvdec") || f3.startsWith("c2.android.") || f3.startsWith("c2.google.")) {
            return true;
        }
        return (f3.startsWith("omx.") || f3.startsWith("c2.")) ? false : true;
    }
}
