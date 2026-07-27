package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class L0 implements R0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f26082v = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: w, reason: collision with root package name */
    public static final C2881Yl f26083w = new C2881Yl((K0) T2.f27685G);

    /* renamed from: x, reason: collision with root package name */
    public static final C2881Yl f26084x = new C2881Yl((K0) T2.f27684F);

    /* renamed from: n, reason: collision with root package name */
    public C3675oC f26085n;

    /* renamed from: u, reason: collision with root package name */
    public final T2 f26086u = new T2(18);

    @Override // com.google.android.gms.internal.ads.R0
    public final synchronized O0[] a() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void b(int i, ArrayList arrayList) {
        T2 t22 = this.f26086u;
        switch (i) {
            case 0:
                arrayList.add(new C2909a4());
                break;
            case 1:
                arrayList.add(new C3018c4());
                break;
            case 2:
                arrayList.add(new C3073d4());
                break;
            case 3:
                arrayList.add(new C3610n1());
                break;
            case 4:
                O0 n9 = f26083w.n(0);
                if (n9 == null) {
                    arrayList.add(new B1());
                    break;
                } else {
                    arrayList.add(n9);
                    break;
                }
            case 5:
                arrayList.add(new D1());
                break;
            case 6:
                arrayList.add(new C3773q2(new C3503l2(), 0, t22));
                break;
            case 7:
                arrayList.add(new C3988u2());
                break;
            case 8:
                arrayList.add(new N2(t22, 704, C3675oC.f33115x));
                arrayList.add(new S2(t22, 160));
                break;
            case 9:
                arrayList.add(new C3126e3());
                break;
            case 10:
                arrayList.add(new C4206y4());
                break;
            case 11:
                if (this.f26085n == null) {
                    SB sb = UB.f27942u;
                    this.f26085n = C3675oC.f33115x;
                }
                arrayList.add(new B4(t22, new It(), new Rx(4, this.f26085n)));
                break;
            case 12:
                I4 i4 = new I4();
                i4.f25524c = 0;
                i4.f25525d = -1L;
                i4.f25527f = -1;
                i4.f25528g = -1L;
                arrayList.add(i4);
                break;
            case 14:
                arrayList.add(new I1(1));
                break;
            case 15:
                O0 n10 = f26084x.n(new Object[0]);
                if (n10 != null) {
                    arrayList.add(n10);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C3718p1(t22));
                break;
            case 17:
                arrayList.add(new C4203y1(1));
                break;
            case 18:
                arrayList.add(new C4149x1(1));
                break;
            case 19:
                arrayList.add(new C4203y1(0));
                break;
            case 20:
                arrayList.add(new I1(0));
                break;
            case 21:
                arrayList.add(new C4149x1(0));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x03b6, code lost:
    
        if (r14 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03b8, code lost:
    
        b(r14, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0201 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b8, B:21:0x03bb, B:23:0x03c0, B:26:0x03c6, B:28:0x03c9, B:32:0x03cc, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0387, B:117:0x038f, B:119:0x039a, B:121:0x03a2, B:124:0x03ab, B:139:0x004e, B:140:0x0056, B:143:0x01c7, B:166:0x005b, B:169:0x0067, B:172:0x0073, B:175:0x007f, B:178:0x008b, B:181:0x0096, B:184:0x00a1, B:187:0x00ac, B:190:0x00b7, B:193:0x00c3, B:196:0x00cf, B:199:0x00da, B:202:0x00e5, B:205:0x00f0, B:208:0x00fb, B:211:0x0107, B:214:0x0113, B:217:0x011f, B:220:0x012b, B:223:0x0137, B:226:0x0143, B:229:0x014f, B:232:0x015b, B:235:0x0167, B:238:0x0172, B:241:0x017d, B:244:0x0188, B:247:0x0193, B:250:0x019e, B:253:0x01a8, B:256:0x01b2, B:259:0x01bc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03c0 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b8, B:21:0x03bb, B:23:0x03c0, B:26:0x03c6, B:28:0x03c9, B:32:0x03cc, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0387, B:117:0x038f, B:119:0x039a, B:121:0x03a2, B:124:0x03ab, B:139:0x004e, B:140:0x0056, B:143:0x01c7, B:166:0x005b, B:169:0x0067, B:172:0x0073, B:175:0x007f, B:178:0x008b, B:181:0x0096, B:184:0x00a1, B:187:0x00ac, B:190:0x00b7, B:193:0x00c3, B:196:0x00cf, B:199:0x00da, B:202:0x00e5, B:205:0x00f0, B:208:0x00fb, B:211:0x0107, B:214:0x0113, B:217:0x011f, B:220:0x012b, B:223:0x0137, B:226:0x0143, B:229:0x014f, B:232:0x015b, B:235:0x0167, B:238:0x0172, B:241:0x017d, B:244:0x0188, B:247:0x0193, B:250:0x019e, B:253:0x01a8, B:256:0x01b2, B:259:0x01bc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b8, B:21:0x03bb, B:23:0x03c0, B:26:0x03c6, B:28:0x03c9, B:32:0x03cc, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0387, B:117:0x038f, B:119:0x039a, B:121:0x03a2, B:124:0x03ab, B:139:0x004e, B:140:0x0056, B:143:0x01c7, B:166:0x005b, B:169:0x0067, B:172:0x0073, B:175:0x007f, B:178:0x008b, B:181:0x0096, B:184:0x00a1, B:187:0x00ac, B:190:0x00b7, B:193:0x00c3, B:196:0x00cf, B:199:0x00da, B:202:0x00e5, B:205:0x00f0, B:208:0x00fb, B:211:0x0107, B:214:0x0113, B:217:0x011f, B:220:0x012b, B:223:0x0137, B:226:0x0143, B:229:0x014f, B:232:0x015b, B:235:0x0167, B:238:0x0172, B:241:0x017d, B:244:0x0188, B:247:0x0193, B:250:0x019e, B:253:0x01a8, B:256:0x01b2, B:259:0x01bc), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized O0[] d(Uri uri, Map map) {
        ArrayList arrayList;
        char c4;
        int i;
        String lastPathSegment;
        int i4;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i9 = 20;
            if (str != null) {
                String h9 = K4.h(str);
                switch (h9.hashCode()) {
                    case -2123537834:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8578B)) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1662384011:
                        if (h9.equals("video/mp2p")) {
                            c4 = 20;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1662384007:
                        if (h9.equals("video/mp2t")) {
                            c4 = 21;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1662095187:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8606f)) {
                            c4 = '\f';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1606874997:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.J)) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1487656890:
                        if (h9.equals("image/avif")) {
                            c4 = 31;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1487464693:
                        if (h9.equals("image/heic")) {
                            c4 = 30;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1487464690:
                        if (h9.equals("image/heif")) {
                            c4 = 29;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1487394660:
                        if (h9.equals("image/jpeg")) {
                            c4 = 24;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1487018032:
                        if (h9.equals("image/webp")) {
                            c4 = 27;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1248337486:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8592Q)) {
                            c4 = 18;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1079884372:
                        if (h9.equals("video/x-msvideo")) {
                            c4 = 25;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1004728940:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8590O)) {
                            c4 = 23;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -879272239:
                        if (h9.equals("image/bmp")) {
                            c4 = 28;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -879258763:
                        if (h9.equals("image/png")) {
                            c4 = 26;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -387023398:
                        if (h9.equals("audio/x-matroska")) {
                            c4 = 11;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -43467528:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8593R)) {
                            c4 = 14;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 13915911:
                        if (h9.equals("video/x-flv")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187078296:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8625z)) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187078297:
                        if (h9.equals("audio/ac4")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187078669:
                        if (h9.equals("audio/amr")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187090232:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8616q)) {
                            c4 = 17;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187091926:
                        if (h9.equals("audio/ogg")) {
                            c4 = 19;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187099443:
                        if (h9.equals("audio/wav")) {
                            c4 = 22;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1331848029:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8605e)) {
                            c4 = 16;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1503095341:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8585I)) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1504578661:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8577A)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1504619009:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8586K)) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1504824762:
                        if (h9.equals("audio/midi")) {
                            c4 = '\t';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1504831518:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8619t)) {
                            c4 = 15;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1505118770:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8618s)) {
                            c4 = '\r';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2039520277:
                        if (h9.equals("video/x-matroska")) {
                            c4 = '\n';
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case '\b':
                        i = 5;
                        break;
                    case '\t':
                        i = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case 21:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                }
                if (i != -1) {
                    b(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i9 = 0;
                    } else if (lastPathSegment.endsWith(".ac4")) {
                        i9 = 1;
                    } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i9 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i9 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i9 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i9 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i9 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i9 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i9 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i9 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i9 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i9 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i9 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i9 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i9 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i9 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i9 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i9 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i9 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i9 = 19;
                    } else if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                        if (lastPathSegment.endsWith(".avif")) {
                            i9 = 21;
                        }
                    }
                    int[] iArr = f26082v;
                    for (i4 = 0; i4 < 21; i4++) {
                        int i10 = iArr[i4];
                        if (i10 != i && i10 != i9) {
                            b(i10, arrayList);
                        }
                    }
                }
                i9 = -1;
                int[] iArr2 = f26082v;
                while (i4 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i9 = -1;
            int[] iArr22 = f26082v;
            while (i4 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (O0[]) arrayList.toArray(new O0[0]);
    }
}
