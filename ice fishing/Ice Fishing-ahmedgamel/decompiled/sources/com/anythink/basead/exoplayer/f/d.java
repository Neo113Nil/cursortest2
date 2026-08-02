package com.anythink.basead.exoplayer.f;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.IceFishing.LiveIceFishing.k;
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
    private static final String f8035a = "MediaCodecUtil";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8037c = "OMX.MTK.AUDIO.DECODER.RAW";

    /* renamed from: g, reason: collision with root package name */
    private static final SparseIntArray f8041g;

    /* renamed from: h, reason: collision with root package name */
    private static final SparseIntArray f8042h;
    private static final String i = "avc1";

    /* renamed from: j, reason: collision with root package name */
    private static final String f8043j = "avc2";

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Integer> f8044k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f8045l = "hev1";

    /* renamed from: m, reason: collision with root package name */
    private static final String f8046m = "hvc1";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8036b = "OMX.google.raw.decoder";

    /* renamed from: d, reason: collision with root package name */
    private static final com.anythink.basead.exoplayer.f.a f8038d = com.anythink.basead.exoplayer.f.a.a(f8036b);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f8039e = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<a, List<com.anythink.basead.exoplayer.f.a>> f8040f = new HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private static int f8047n = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8048a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8049b;

        public a(String str, boolean z6) {
            this.f8048a = str;
            this.f8049b = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f8048a, aVar.f8048a) && this.f8049b == aVar.f8049b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f8048a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f8049b ? 1231 : 1237);
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
            return o.f9237h.equals(str);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8041g = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f8042h = sparseIntArray2;
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
        f8044k = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        k.u(16, hashMap, "L63", 64, "L90");
        k.u(256, hashMap, "L93", 1024, "L120");
        k.u(4096, hashMap, "L123", 16384, "L150");
        k.u(com.anythink.basead.exoplayer.b.aX, hashMap, "L153", 262144, "L156");
        k.u(com.anythink.basead.exoplayer.h.o.f8528d, hashMap, "L180", 4194304, "L183");
        k.u(com.anythink.basead.exoplayer.b.bc, hashMap, "L186", 2, "H30");
        k.u(8, hashMap, "H60", 32, "H63");
        k.u(128, hashMap, "H90", 512, "H93");
        k.u(2048, hashMap, "H120", 8192, "H123");
        k.u(32768, hashMap, "H150", 131072, "H153");
        k.u(524288, hashMap, "H156", 2097152, "H180");
        k.u(8388608, hashMap, "H183", 33554432, "H186");
    }

    private d() {
    }

    private static int a(int i4) {
        if (i4 == 1 || i4 == 2) {
            return 25344;
        }
        switch (i4) {
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

    private static void b(String str, boolean z6) {
        try {
            c(str, z6);
        } catch (b e9) {
            Log.e(f8035a, "Codec warming failed", e9);
        }
    }

    private static synchronized List<com.anythink.basead.exoplayer.f.a> c(String str, boolean z6) {
        synchronized (d.class) {
            try {
                a aVar = new a(str, z6);
                HashMap<a, List<com.anythink.basead.exoplayer.f.a>> hashMap = f8040f;
                List<com.anythink.basead.exoplayer.f.a> list = hashMap.get(aVar);
                if (list != null) {
                    return list;
                }
                int i4 = af.f9132a;
                byte b9 = 0;
                c eVar = i4 >= 21 ? new e(z6) : new C0024d(b9);
                ArrayList<com.anythink.basead.exoplayer.f.a> a9 = a(aVar, eVar, str);
                if (z6 && a9.isEmpty() && 21 <= i4 && i4 <= 23) {
                    eVar = new C0024d(b9);
                    a9 = a(aVar, eVar, str);
                    if (!a9.isEmpty()) {
                        Log.w(f8035a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a9.get(0).f7984c);
                    }
                }
                if (o.f9207B.equals(str)) {
                    a9.addAll(a(new a(o.f9206A, aVar.f8049b), eVar, str));
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
        private final int f8050a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f8051b;

        public e(boolean z6) {
            this.f8050a = z6 ? 1 : 0;
        }

        private void c() {
            if (this.f8051b == null) {
                this.f8051b = new MediaCodecList(this.f8050a).getCodecInfos();
            }
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final int a() {
            c();
            return this.f8051b.length;
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean b() {
            return true;
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final MediaCodecInfo a(int i) {
            c();
            return this.f8051b[i];
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }
    }

    public static com.anythink.basead.exoplayer.f.a a() {
        return f8038d;
    }

    public static com.anythink.basead.exoplayer.f.a a(String str, boolean z6) {
        List<com.anythink.basead.exoplayer.f.a> c9 = c(str, z6);
        if (c9.isEmpty()) {
            return null;
        }
        return c9.get(0);
    }

    public static int b() {
        if (f8047n == -1) {
            int i4 = 0;
            com.anythink.basead.exoplayer.f.a a9 = a(o.f9237h, false);
            if (a9 != null) {
                MediaCodecInfo.CodecProfileLevel[] a10 = a9.a();
                int length = a10.length;
                int i6 = 0;
                while (i4 < length) {
                    int i9 = a10[i4].level;
                    int i10 = 25344;
                    if (i9 != 1 && i9 != 2) {
                        i10 = 414720;
                        switch (i9) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case com.anythink.basead.exoplayer.b.aX /* 65536 */:
                                i10 = 9437184;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    }
                    i6 = Math.max(i10, i6);
                    i4++;
                }
                i4 = Math.max(i6, af.f9132a >= 21 ? 345600 : 172800);
            }
            f8047n = i4;
        }
        return f8047n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0044, code lost:
    
        if (r6.equals(com.anythink.basead.exoplayer.f.d.i) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> a(String str) {
        int i4 = 2;
        boolean z6 = false;
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
                if (str2.equals(f8043j)) {
                    z6 = true;
                    break;
                }
                z6 = -1;
                break;
            case 3199032:
                if (str2.equals(f8045l)) {
                    z6 = 2;
                    break;
                }
                z6 = -1;
                break;
            case 3214780:
                if (str2.equals(f8046m)) {
                    z6 = 3;
                    break;
                }
                z6 = -1;
                break;
            default:
                z6 = -1;
                break;
        }
        switch (z6) {
            case true:
            case true:
                if (split.length < 4) {
                    Log.w(f8035a, "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                } else {
                    Matcher matcher = f8039e.matcher(split[1]);
                    if (!matcher.matches()) {
                        Log.w(f8035a, "Ignoring malformed HEVC codec string: ".concat(str));
                        break;
                    } else {
                        String group = matcher.group(1);
                        if (!"1".equals(group)) {
                            if (!"2".equals(group)) {
                                Log.w(f8035a, "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                                break;
                            }
                        } else {
                            i4 = 1;
                        }
                        Integer num = f8044k.get(split[3]);
                        if (num != null) {
                            break;
                        } else {
                            Log.w(f8035a, "Unknown HEVC level string: " + matcher.group(1));
                            break;
                        }
                    }
                }
        }
        return null;
    }

    private static boolean b(String str) {
        if (af.f9132a > 22) {
            return false;
        }
        String str2 = af.f9135d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w(f8035a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
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
                Log.w(f8035a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
                return null;
            }
            int i4 = f8041g.get(num.intValue(), -1);
            if (i4 == -1) {
                Log.w(f8035a, "Unknown AVC profile: ".concat(String.valueOf(num)));
                return null;
            }
            int i6 = f8042h.get(valueOf.intValue(), -1);
            if (i6 == -1) {
                Log.w(f8035a, "Unknown AVC level: ".concat(String.valueOf(valueOf)));
                return null;
            }
            return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i6));
        } catch (NumberFormatException unused) {
            Log.w(f8035a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
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
        int i4;
        int i6;
        boolean z6;
        int i9;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z9;
        c cVar2 = cVar;
        try {
            ArrayList<com.anythink.basead.exoplayer.f.a> arrayList = new ArrayList<>();
            String str2 = aVar.f8048a;
            int a9 = cVar2.a();
            boolean b9 = cVar2.b();
            int i10 = 0;
            loop0: while (i10 < a9) {
                MediaCodecInfo a10 = cVar2.a(i10);
                String name = a10.getName();
                if (!a10.isEncoder() && ((b9 || !name.endsWith(".secure")) && (((i4 = af.f9132a) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && (i4 >= 18 || !"OMX.SEC.MP3.Decoder".equals(name))))) {
                    if (i4 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name)) {
                        String str3 = af.f9133b;
                        if (!"a70".equals(str3)) {
                            if ("Xiaomi".equals(af.f9134c) && str3.startsWith("HM")) {
                            }
                        }
                    }
                    if (i4 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str4 = af.f9133b;
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
                    if (i4 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str5 = af.f9133b;
                        if (!"C1504".equals(str5)) {
                            if (!"C1505".equals(str5)) {
                                if (!"C1604".equals(str5)) {
                                }
                            }
                        }
                    }
                    if (i4 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(af.f9134c))) {
                        String str6 = af.f9133b;
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
                    if (i4 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(af.f9134c)) {
                        String str7 = af.f9133b;
                        if (!str7.startsWith(com.anythink.expressad.foundation.g.a.f19858S)) {
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
                    if (i4 > 19 || !af.f9133b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        if (!o.f9207B.equals(str) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                            String[] supportedTypes = a10.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i11 = 0;
                            while (i11 < length) {
                                String str8 = supportedTypes[i11];
                                if (str8.equalsIgnoreCase(str2)) {
                                    try {
                                        capabilitiesForType = a10.getCapabilitiesForType(str8);
                                        i6 = a9;
                                    } catch (Exception e9) {
                                        e = e9;
                                        i6 = a9;
                                    }
                                    try {
                                        boolean a11 = cVar2.a(str2, capabilitiesForType);
                                        z6 = b9;
                                        i9 = i10;
                                        if (af.f9132a <= 22) {
                                            try {
                                                String str9 = af.f9135d;
                                                if (!"ODROID-XU3".equals(str9)) {
                                                    if ("Nexus 10".equals(str9)) {
                                                    }
                                                }
                                                if ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name)) {
                                                    z9 = true;
                                                    if (z6) {
                                                        if (aVar.f8049b == a11) {
                                                        }
                                                        arrayList.add(com.anythink.basead.exoplayer.f.a.a(name, str2, capabilitiesForType, z9, false));
                                                    }
                                                    if (z6 && !aVar.f8049b) {
                                                        arrayList.add(com.anythink.basead.exoplayer.f.a.a(name, str2, capabilitiesForType, z9, false));
                                                    } else if (!z6 && a11) {
                                                        arrayList.add(com.anythink.basead.exoplayer.f.a.a(name + ".secure", str2, capabilitiesForType, z9, true));
                                                        break loop0;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (af.f9132a > 23 && !arrayList.isEmpty()) {
                                                    Log.e(f8035a, "Skipping codec " + name + " (failed to query capabilities)");
                                                    i11++;
                                                    cVar2 = cVar;
                                                    a9 = i6;
                                                    b9 = z6;
                                                    i10 = i9;
                                                } else {
                                                    Log.e(f8035a, "Failed to query codec " + name + " (" + str8 + ")");
                                                    throw e;
                                                }
                                            }
                                        }
                                        z9 = false;
                                        if (z6) {
                                        }
                                        if (z6) {
                                        }
                                        if (!z6) {
                                            arrayList.add(com.anythink.basead.exoplayer.f.a.a(name + ".secure", str2, capabilitiesForType, z9, true));
                                            break loop0;
                                            break loop0;
                                        }
                                        continue;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z6 = b9;
                                        i9 = i10;
                                        if (af.f9132a > 23) {
                                        }
                                        Log.e(f8035a, "Failed to query codec " + name + " (" + str8 + ")");
                                        throw e;
                                    }
                                } else {
                                    i6 = a9;
                                    z6 = b9;
                                    i9 = i10;
                                }
                                i11++;
                                cVar2 = cVar;
                                a9 = i6;
                                b9 = z6;
                                i10 = i9;
                            }
                        }
                        i10++;
                        cVar2 = cVar;
                        a9 = a9;
                        b9 = b9;
                    }
                }
                i10++;
                cVar2 = cVar;
                a9 = a9;
                b9 = b9;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new b(e12, (byte) 0);
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z6 && str.endsWith(".secure"))) {
            return false;
        }
        int i4 = af.f9132a;
        if (i4 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i4 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i4 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = af.f9133b;
            if ("a70".equals(str3) || ("Xiaomi".equals(af.f9134c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i4 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = af.f9133b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i4 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = af.f9133b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i4 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(af.f9134c))) {
            String str6 = af.f9133b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i4 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(af.f9134c)) {
            String str7 = af.f9133b;
            if (str7.startsWith(com.anythink.expressad.foundation.g.a.f19858S) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i4 <= 19 && af.f9133b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (o.f9207B.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void a(List<com.anythink.basead.exoplayer.f.a> list) {
        if (af.f9132a < 26) {
            if (list.size() <= 1 || !f8037c.equals(list.get(0).f7984c)) {
                return;
            }
            for (int i4 = 1; i4 < list.size(); i4++) {
                com.anythink.basead.exoplayer.f.a aVar = list.get(i4);
                if (f8036b.equals(aVar.f7984c)) {
                    list.remove(i4);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        int i4;
        if (strArr.length < 4) {
            Log.w(f8035a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = f8039e.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(f8035a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i4 = 1;
        } else {
            if (!"2".equals(group)) {
                Log.w(f8035a, "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            i4 = 2;
        }
        Integer num = f8044k.get(strArr[3]);
        if (num == null) {
            Log.w(f8035a, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i4), num);
    }
}
