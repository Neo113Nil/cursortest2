package com.anythink.basead.exoplayer.f;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7249a = "MediaCodecUtil";

    /* renamed from: c, reason: collision with root package name */
    private static final String f7251c = "OMX.MTK.AUDIO.DECODER.RAW";

    /* renamed from: g, reason: collision with root package name */
    private static final SparseIntArray f7255g;

    /* renamed from: h, reason: collision with root package name */
    private static final SparseIntArray f7256h;
    private static final String i = "avc1";

    /* renamed from: j, reason: collision with root package name */
    private static final String f7257j = "avc2";

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Integer> f7258k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f7259l = "hev1";

    /* renamed from: m, reason: collision with root package name */
    private static final String f7260m = "hvc1";

    /* renamed from: b, reason: collision with root package name */
    private static final String f7250b = "OMX.google.raw.decoder";

    /* renamed from: d, reason: collision with root package name */
    private static final com.anythink.basead.exoplayer.f.a f7252d = com.anythink.basead.exoplayer.f.a.a(f7250b);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f7253e = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<a, List<com.anythink.basead.exoplayer.f.a>> f7254f = new HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private static int f7261n = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f7262a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7263b;

        public a(String str, boolean z3) {
            this.f7262a = str;
            this.f7263b = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f7262a, aVar.f7262a) && this.f7263b == aVar.f7263b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f7262a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f7263b ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        public /* synthetic */ b(Throwable th, byte b9) {
            this(th);
        }

        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    /* renamed from: com.anythink.basead.exoplayer.f.d$d, reason: collision with other inner class name */
    public static final class C0024d implements c {
        private C0024d() {
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean b() {
            return false;
        }

        public /* synthetic */ C0024d(byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return o.f8451h.equals(str);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7255g = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f7256h = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, com.anythink.basead.exoplayer.b.aX);
        HashMap hashMap = new HashMap();
        f7258k = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        f.r(16, hashMap, "L63", 64, "L90");
        f.r(256, hashMap, "L93", 1024, "L120");
        f.r(4096, hashMap, "L123", 16384, "L150");
        f.r(com.anythink.basead.exoplayer.b.aX, hashMap, "L153", 262144, "L156");
        f.r(com.anythink.basead.exoplayer.h.o.f7742d, hashMap, "L180", 4194304, "L183");
        f.r(com.anythink.basead.exoplayer.b.bc, hashMap, "L186", 2, "H30");
        f.r(8, hashMap, "H60", 32, "H63");
        f.r(128, hashMap, "H90", 512, "H93");
        f.r(2048, hashMap, "H120", 8192, "H123");
        f.r(32768, hashMap, "H150", 131072, "H153");
        f.r(524288, hashMap, "H156", 2097152, "H180");
        f.r(8388608, hashMap, "H183", 33554432, "H186");
    }

    private d() {
    }

    private static int a(int i6) {
        if (i6 == 1 || i6 == 2) {
            return 25344;
        }
        switch (i6) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case com.anythink.basead.exoplayer.b.aX /* 65536 */:
                return 9437184;
            default:
                return -1;
        }
    }

    private static void b(String str, boolean z3) {
        try {
            c(str, z3);
        } catch (b e9) {
            Log.e(f7249a, "Codec warming failed", e9);
        }
    }

    private static synchronized List<com.anythink.basead.exoplayer.f.a> c(String str, boolean z3) {
        synchronized (d.class) {
            try {
                a aVar = new a(str, z3);
                HashMap<a, List<com.anythink.basead.exoplayer.f.a>> hashMap = f7254f;
                List<com.anythink.basead.exoplayer.f.a> list = hashMap.get(aVar);
                if (list != null) {
                    return list;
                }
                int i6 = af.f8346a;
                byte b9 = 0;
                c eVar = i6 >= 21 ? new e(z3) : new C0024d(b9);
                ArrayList<com.anythink.basead.exoplayer.f.a> a9 = a(aVar, eVar, str);
                if (z3 && a9.isEmpty() && 21 <= i6 && i6 <= 23) {
                    eVar = new C0024d(b9);
                    a9 = a(aVar, eVar, str);
                    if (!a9.isEmpty()) {
                        Log.w(f7249a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a9.get(0).f7198c);
                    }
                }
                if (o.f8421B.equals(str)) {
                    a9.addAll(a(new a(o.f8420A, aVar.f7263b), eVar, str));
                }
                a(a9);
                List<com.anythink.basead.exoplayer.f.a> unmodifiableList = Collections.unmodifiableList(a9);
                hashMap.put(aVar, unmodifiableList);
                return unmodifiableList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f7264a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f7265b;

        public e(boolean z3) {
            this.f7264a = z3 ? 1 : 0;
        }

        private void c() {
            if (this.f7265b == null) {
                this.f7265b = new MediaCodecList(this.f7264a).getCodecInfos();
            }
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final int a() {
            c();
            return this.f7265b.length;
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean b() {
            return true;
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final MediaCodecInfo a(int i) {
            c();
            return this.f7265b[i];
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }
    }

    public static com.anythink.basead.exoplayer.f.a a() {
        return f7252d;
    }

    public static com.anythink.basead.exoplayer.f.a a(String str, boolean z3) {
        List<com.anythink.basead.exoplayer.f.a> c9 = c(str, z3);
        if (c9.isEmpty()) {
            return null;
        }
        return c9.get(0);
    }

    public static int b() {
        if (f7261n == -1) {
            int i6 = 0;
            com.anythink.basead.exoplayer.f.a a9 = a(o.f8451h, false);
            if (a9 != null) {
                MediaCodecInfo.CodecProfileLevel[] a10 = a9.a();
                int length = a10.length;
                int i9 = 0;
                while (i6 < length) {
                    int i10 = a10[i6].level;
                    int i11 = 25344;
                    if (i10 != 1 && i10 != 2) {
                        i11 = 414720;
                        switch (i10) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                break;
                            case 64:
                                i11 = 202752;
                                break;
                            case 128:
                            case 256:
                                break;
                            case 512:
                                i11 = 921600;
                                break;
                            case 1024:
                                i11 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                break;
                            case 8192:
                                i11 = 2228224;
                                break;
                            case 16384:
                                i11 = 5652480;
                                break;
                            case 32768:
                            case com.anythink.basead.exoplayer.b.aX /* 65536 */:
                                i11 = 9437184;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                    }
                    i9 = Math.max(i11, i9);
                    i6++;
                }
                i6 = Math.max(i9, af.f8346a >= 21 ? 345600 : 172800);
            }
            f7261n = i6;
        }
        return f7261n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0044, code lost:
    
        if (r6.equals(com.anythink.basead.exoplayer.f.d.i) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> a(String str) {
        int i6 = 2;
        boolean z3 = false;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        String str2 = split[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3006243:
                break;
            case 3006244:
                if (str2.equals(f7257j)) {
                    z3 = true;
                    break;
                }
                z3 = -1;
                break;
            case 3199032:
                if (str2.equals(f7259l)) {
                    z3 = 2;
                    break;
                }
                z3 = -1;
                break;
            case 3214780:
                if (str2.equals(f7260m)) {
                    z3 = 3;
                    break;
                }
                z3 = -1;
                break;
            default:
                z3 = -1;
                break;
        }
        switch (z3) {
            case true:
            case true:
                if (split.length < 4) {
                    Log.w(f7249a, "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                } else {
                    Matcher matcher = f7253e.matcher(split[1]);
                    if (!matcher.matches()) {
                        Log.w(f7249a, "Ignoring malformed HEVC codec string: ".concat(str));
                        break;
                    } else {
                        String group = matcher.group(1);
                        if (!"1".equals(group)) {
                            if (!"2".equals(group)) {
                                Log.w(f7249a, "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                                break;
                            }
                        } else {
                            i6 = 1;
                        }
                        Integer num = f7258k.get(split[3]);
                        if (num != null) {
                            break;
                        } else {
                            Log.w(f7249a, "Unknown HEVC level string: " + matcher.group(1));
                            break;
                        }
                    }
                }
        }
        return null;
    }

    private static boolean b(String str) {
        if (af.f8346a > 22) {
            return false;
        }
        String str2 = af.f8349d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w(f7249a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            } else {
                Log.w(f7249a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
                return null;
            }
            int i6 = f7255g.get(num.intValue(), -1);
            if (i6 == -1) {
                Log.w(f7249a, "Unknown AVC profile: ".concat(String.valueOf(num)));
                return null;
            }
            int i9 = f7256h.get(valueOf.intValue(), -1);
            if (i9 == -1) {
                Log.w(f7249a, "Unknown AVC level: ".concat(String.valueOf(valueOf)));
                return null;
            }
            return new Pair<>(Integer.valueOf(i6), Integer.valueOf(i9));
        } catch (NumberFormatException unused) {
            Log.w(f7249a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x019c, code lost:
    
        if ("SCV31".equals(r12) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013a, code lost:
    
        if ("C1605".equals(r13) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0257 A[Catch: Exception -> 0x0240, TryCatch #0 {Exception -> 0x0240, blocks: (B:185:0x022d, B:187:0x0237, B:190:0x0242, B:192:0x024a, B:151:0x0257, B:155:0x0265, B:158:0x0260, B:163:0x0272), top: B:184:0x022d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<com.anythink.basead.exoplayer.f.a> a(a aVar, c cVar, String str) {
        int i6;
        int i9;
        boolean z3;
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z6;
        c cVar2 = cVar;
        try {
            ArrayList<com.anythink.basead.exoplayer.f.a> arrayList = new ArrayList<>();
            String str2 = aVar.f7262a;
            int a9 = cVar2.a();
            boolean b9 = cVar2.b();
            int i11 = 0;
            loop0: while (i11 < a9) {
                MediaCodecInfo a10 = cVar2.a(i11);
                String name = a10.getName();
                if (!a10.isEncoder() && ((b9 || !name.endsWith(".secure")) && (((i6 = af.f8346a) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && (i6 >= 18 || !"OMX.SEC.MP3.Decoder".equals(name))))) {
                    if (i6 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name)) {
                        String str3 = af.f8347b;
                        if (!"a70".equals(str3)) {
                            if ("Xiaomi".equals(af.f8348c) && str3.startsWith("HM")) {
                            }
                        }
                    }
                    if (i6 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str4 = af.f8347b;
                        if (!"dlxu".equals(str4)) {
                            if (!"protou".equals(str4)) {
                                if (!"ville".equals(str4)) {
                                    if (!"villeplus".equals(str4)) {
                                        if (!"villec2".equals(str4)) {
                                            if (!str4.startsWith("gee")) {
                                                if (!"C6602".equals(str4)) {
                                                    if (!"C6603".equals(str4)) {
                                                        if (!"C6606".equals(str4)) {
                                                            if (!"C6616".equals(str4)) {
                                                                if (!"L36h".equals(str4)) {
                                                                    if ("SO-02E".equals(str4)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i6 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str5 = af.f8347b;
                        if (!"C1504".equals(str5)) {
                            if (!"C1505".equals(str5)) {
                                if (!"C1604".equals(str5)) {
                                }
                            }
                        }
                    }
                    if (i6 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(af.f8348c))) {
                        String str6 = af.f8347b;
                        if (!str6.startsWith("zeroflte")) {
                            if (!str6.startsWith("zerolte")) {
                                if (!str6.startsWith("zenlte")) {
                                    if (!"SC-05G".equals(str6)) {
                                        if (!"marinelteatt".equals(str6)) {
                                            if (!"404SC".equals(str6)) {
                                                if (!"SC-04G".equals(str6)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i6 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(af.f8348c)) {
                        String str7 = af.f8347b;
                        if (!str7.startsWith(com.anythink.expressad.foundation.g.a.f19071S)) {
                            if (!str7.startsWith("serrano")) {
                                if (!str7.startsWith("jflte")) {
                                    if (!str7.startsWith("santos")) {
                                        if (str7.startsWith("t0")) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i6 > 19 || !af.f8347b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        if (!o.f8421B.equals(str) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                            String[] supportedTypes = a10.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i12 = 0;
                            while (i12 < length) {
                                String str8 = supportedTypes[i12];
                                if (str8.equalsIgnoreCase(str2)) {
                                    try {
                                        capabilitiesForType = a10.getCapabilitiesForType(str8);
                                        i9 = a9;
                                    } catch (Exception e9) {
                                        e = e9;
                                        i9 = a9;
                                    }
                                    try {
                                        boolean a11 = cVar2.a(str2, capabilitiesForType);
                                        z3 = b9;
                                        i10 = i11;
                                        if (af.f8346a <= 22) {
                                            try {
                                                String str9 = af.f8349d;
                                                if (!"ODROID-XU3".equals(str9)) {
                                                    if ("Nexus 10".equals(str9)) {
                                                    }
                                                }
                                                if ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name)) {
                                                    z6 = true;
                                                    if (z3) {
                                                        if (aVar.f7263b == a11) {
                                                        }
                                                        arrayList.add(com.anythink.basead.exoplayer.f.a.a(name, str2, capabilitiesForType, z6, false));
                                                    }
                                                    if (z3 && !aVar.f7263b) {
                                                        arrayList.add(com.anythink.basead.exoplayer.f.a.a(name, str2, capabilitiesForType, z6, false));
                                                    } else if (!z3 && a11) {
                                                        arrayList.add(com.anythink.basead.exoplayer.f.a.a(name + ".secure", str2, capabilitiesForType, z6, true));
                                                        break loop0;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (af.f8346a > 23 && !arrayList.isEmpty()) {
                                                    Log.e(f7249a, "Skipping codec " + name + " (failed to query capabilities)");
                                                    i12++;
                                                    cVar2 = cVar;
                                                    a9 = i9;
                                                    b9 = z3;
                                                    i11 = i10;
                                                } else {
                                                    Log.e(f7249a, "Failed to query codec " + name + " (" + str8 + ")");
                                                    throw e;
                                                }
                                            }
                                        }
                                        z6 = false;
                                        if (z3) {
                                        }
                                        if (z3) {
                                        }
                                        if (!z3) {
                                            arrayList.add(com.anythink.basead.exoplayer.f.a.a(name + ".secure", str2, capabilitiesForType, z6, true));
                                            break loop0;
                                            break loop0;
                                        }
                                        continue;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z3 = b9;
                                        i10 = i11;
                                        if (af.f8346a > 23) {
                                        }
                                        Log.e(f7249a, "Failed to query codec " + name + " (" + str8 + ")");
                                        throw e;
                                    }
                                } else {
                                    i9 = a9;
                                    z3 = b9;
                                    i10 = i11;
                                }
                                i12++;
                                cVar2 = cVar;
                                a9 = i9;
                                b9 = z3;
                                i11 = i10;
                            }
                        }
                        i11++;
                        cVar2 = cVar;
                        a9 = a9;
                        b9 = b9;
                    }
                }
                i11++;
                cVar2 = cVar;
                a9 = a9;
                b9 = b9;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new b(e12, (byte) 0);
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z3, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z3 && str.endsWith(".secure"))) {
            return false;
        }
        int i6 = af.f8346a;
        if (i6 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i6 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i6 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = af.f8347b;
            if ("a70".equals(str3) || ("Xiaomi".equals(af.f8348c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i6 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = af.f8347b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i6 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = af.f8347b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i6 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(af.f8348c))) {
            String str6 = af.f8347b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i6 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(af.f8348c)) {
            String str7 = af.f8347b;
            if (str7.startsWith(com.anythink.expressad.foundation.g.a.f19071S) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i6 <= 19 && af.f8347b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (o.f8421B.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void a(List<com.anythink.basead.exoplayer.f.a> list) {
        if (af.f8346a < 26) {
            if (list.size() <= 1 || !f7251c.equals(list.get(0).f7198c)) {
                return;
            }
            for (int i6 = 1; i6 < list.size(); i6++) {
                com.anythink.basead.exoplayer.f.a aVar = list.get(i6);
                if (f7250b.equals(aVar.f7198c)) {
                    list.remove(i6);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        int i6;
        if (strArr.length < 4) {
            Log.w(f7249a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = f7253e.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(f7249a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i6 = 1;
        } else {
            if (!"2".equals(group)) {
                Log.w(f7249a, "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            i6 = 2;
        }
        Integer num = f7258k.get(strArr[3]);
        if (num == null) {
            Log.w(f7249a, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i6), num);
    }
}
