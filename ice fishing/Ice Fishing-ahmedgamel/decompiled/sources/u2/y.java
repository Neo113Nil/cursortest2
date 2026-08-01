package u2;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public static List f41320b;

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f41319a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f41321c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = f41321c;
        synchronized (obj) {
            HashMap hashMap = f41319a;
            if (hashMap.containsKey(str)) {
                return (List) hashMap.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f41320b == null) {
                            f41320b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f41320b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                hashMap2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    hashMap2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                    hashMap2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    hashMap2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    hashMap2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                    hashMap2.put("widths", b(videoCapabilities.getSupportedWidths()));
                                    hashMap2.put("heights", b(videoCapabilities.getSupportedHeights()));
                                }
                                hashMap2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(hashMap2);
                            }
                        }
                        f41319a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e9) {
                e = e9;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap3);
                f41319a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e10) {
                e = e10;
                HashMap hashMap32 = new HashMap();
                hashMap32.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(hashMap32);
                f41319a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    public static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
