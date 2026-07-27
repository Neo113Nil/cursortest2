package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class N0 implements T0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f26384v = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: w, reason: collision with root package name */
    public static final S0.l f26385w = new S0.l(V2.f28070G);

    /* renamed from: x, reason: collision with root package name */
    public static final S0.l f26386x = new S0.l(V2.f28069F);

    /* renamed from: n, reason: collision with root package name */
    public C3500lC f26387n;

    /* renamed from: u, reason: collision with root package name */
    public final V2 f26388u = new V2(18);

    public final void a(int i, ArrayList arrayList) {
        V2 v22 = this.f26388u;
        switch (i) {
            case 0:
                arrayList.add(new C3009c4());
                break;
            case 1:
                arrayList.add(new C3116e4());
                break;
            case 2:
                arrayList.add(new C3170f4());
                break;
            case 3:
                arrayList.add(new C3705p1());
                break;
            case 4:
                Q0 J = f26385w.J(0);
                if (J == null) {
                    arrayList.add(new D1());
                    break;
                } else {
                    arrayList.add(J);
                    break;
                }
            case 5:
                arrayList.add(new F1());
                break;
            case 6:
                arrayList.add(new C3867s2(new C3598n2(), 0, v22));
                break;
            case 7:
                arrayList.add(new C4137x2());
                break;
            case 8:
                arrayList.add(new Q2(v22, 704, C3500lC.f31745x));
                arrayList.add(new U2(v22, 160));
                break;
            case 9:
                arrayList.add(new C3277h3());
                break;
            case 10:
                arrayList.add(new A4());
                break;
            case 11:
                if (this.f26387n == null) {
                    PB pb = RB.f27177u;
                    this.f26387n = C3500lC.f31745x;
                }
                arrayList.add(new D4(v22, new Dt(), new Qx(4, this.f26387n)));
                break;
            case 12:
                L4 l42 = new L4();
                l42.f26060c = 0;
                l42.f26061d = -1L;
                l42.f26063f = -1;
                l42.f26064g = -1L;
                arrayList.add(l42);
                break;
            case 14:
                arrayList.add(new K1(1));
                break;
            case 15:
                Q0 J2 = f26386x.J(new Object[0]);
                if (J2 != null) {
                    arrayList.add(J2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C3866s1(v22));
                break;
            case 17:
                arrayList.add(new A1(1));
                break;
            case 18:
                arrayList.add(new C4244z1(1));
                break;
            case 19:
                arrayList.add(new A1(0));
                break;
            case 20:
                arrayList.add(new K1(0));
                break;
            case 21:
                arrayList.add(new C4244z1(0));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final synchronized Q0[] c() {
        return d(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x03b6, code lost:
    
        if (r14 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03b8, code lost:
    
        a(r14, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0201 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b8, B:21:0x03bb, B:23:0x03c0, B:26:0x03c6, B:28:0x03c9, B:32:0x03cc, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0387, B:117:0x038f, B:119:0x039a, B:121:0x03a2, B:124:0x03ab, B:139:0x004e, B:140:0x0056, B:143:0x01c7, B:166:0x005b, B:169:0x0067, B:172:0x0073, B:175:0x007f, B:178:0x008b, B:181:0x0096, B:184:0x00a1, B:187:0x00ac, B:190:0x00b7, B:193:0x00c3, B:196:0x00cf, B:199:0x00da, B:202:0x00e5, B:205:0x00f0, B:208:0x00fb, B:211:0x0107, B:214:0x0113, B:217:0x011f, B:220:0x012b, B:223:0x0137, B:226:0x0143, B:229:0x014f, B:232:0x015b, B:235:0x0167, B:238:0x0172, B:241:0x017d, B:244:0x0188, B:247:0x0193, B:250:0x019e, B:253:0x01a8, B:256:0x01b2, B:259:0x01bc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03c0 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b8, B:21:0x03bb, B:23:0x03c0, B:26:0x03c6, B:28:0x03c9, B:32:0x03cc, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0387, B:117:0x038f, B:119:0x039a, B:121:0x03a2, B:124:0x03ab, B:139:0x004e, B:140:0x0056, B:143:0x01c7, B:166:0x005b, B:169:0x0067, B:172:0x0073, B:175:0x007f, B:178:0x008b, B:181:0x0096, B:184:0x00a1, B:187:0x00ac, B:190:0x00b7, B:193:0x00c3, B:196:0x00cf, B:199:0x00da, B:202:0x00e5, B:205:0x00f0, B:208:0x00fb, B:211:0x0107, B:214:0x0113, B:217:0x011f, B:220:0x012b, B:223:0x0137, B:226:0x0143, B:229:0x014f, B:232:0x015b, B:235:0x0167, B:238:0x0172, B:241:0x017d, B:244:0x0188, B:247:0x0193, B:250:0x019e, B:253:0x01a8, B:256:0x01b2, B:259:0x01bc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b8, B:21:0x03bb, B:23:0x03c0, B:26:0x03c6, B:28:0x03c9, B:32:0x03cc, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0387, B:117:0x038f, B:119:0x039a, B:121:0x03a2, B:124:0x03ab, B:139:0x004e, B:140:0x0056, B:143:0x01c7, B:166:0x005b, B:169:0x0067, B:172:0x0073, B:175:0x007f, B:178:0x008b, B:181:0x0096, B:184:0x00a1, B:187:0x00ac, B:190:0x00b7, B:193:0x00c3, B:196:0x00cf, B:199:0x00da, B:202:0x00e5, B:205:0x00f0, B:208:0x00fb, B:211:0x0107, B:214:0x0113, B:217:0x011f, B:220:0x012b, B:223:0x0137, B:226:0x0143, B:229:0x014f, B:232:0x015b, B:235:0x0167, B:238:0x0172, B:241:0x017d, B:244:0x0188, B:247:0x0193, B:250:0x019e, B:253:0x01a8, B:256:0x01b2, B:259:0x01bc), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Q0[] d(Uri uri, Map map) {
        ArrayList arrayList;
        char c9;
        int i;
        String lastPathSegment;
        int i6;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i9 = 20;
            if (str != null) {
                String h9 = H4.h(str);
                switch (h9.hashCode()) {
                    case -2123537834:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8421B)) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1662384011:
                        if (h9.equals("video/mp2p")) {
                            c9 = 20;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1662384007:
                        if (h9.equals("video/mp2t")) {
                            c9 = 21;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1662095187:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8449f)) {
                            c9 = '\f';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1606874997:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.J)) {
                            c9 = 6;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1487656890:
                        if (h9.equals("image/avif")) {
                            c9 = 31;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1487464693:
                        if (h9.equals("image/heic")) {
                            c9 = 30;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1487464690:
                        if (h9.equals("image/heif")) {
                            c9 = 29;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1487394660:
                        if (h9.equals("image/jpeg")) {
                            c9 = 24;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1487018032:
                        if (h9.equals("image/webp")) {
                            c9 = 27;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1248337486:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8435Q)) {
                            c9 = 18;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1079884372:
                        if (h9.equals("video/x-msvideo")) {
                            c9 = 25;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1004728940:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8433O)) {
                            c9 = 23;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -879272239:
                        if (h9.equals("image/bmp")) {
                            c9 = 28;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -879258763:
                        if (h9.equals("image/png")) {
                            c9 = 26;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -387023398:
                        if (h9.equals("audio/x-matroska")) {
                            c9 = 11;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -43467528:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8436R)) {
                            c9 = 14;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 13915911:
                        if (h9.equals("video/x-flv")) {
                            c9 = '\b';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187078296:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8468z)) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187078297:
                        if (h9.equals("audio/ac4")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187078669:
                        if (h9.equals("audio/amr")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187090232:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8459q)) {
                            c9 = 17;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187091926:
                        if (h9.equals("audio/ogg")) {
                            c9 = 19;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 187099443:
                        if (h9.equals("audio/wav")) {
                            c9 = 22;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1331848029:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8448e)) {
                            c9 = 16;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1503095341:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8428I)) {
                            c9 = 5;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1504578661:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8420A)) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1504619009:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8429K)) {
                            c9 = 7;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1504824762:
                        if (h9.equals("audio/midi")) {
                            c9 = '\t';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1504831518:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8462t)) {
                            c9 = 15;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1505118770:
                        if (h9.equals(com.anythink.basead.exoplayer.k.o.f8461s)) {
                            c9 = '\r';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 2039520277:
                        if (h9.equals("video/x-matroska")) {
                            c9 = '\n';
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
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
                    a(i, arrayList);
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
                    int[] iArr = f26384v;
                    for (i6 = 0; i6 < 21; i6++) {
                        int i10 = iArr[i6];
                        if (i10 != i && i10 != i9) {
                            a(i10, arrayList);
                        }
                    }
                }
                i9 = -1;
                int[] iArr2 = f26384v;
                while (i6 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i9 = -1;
            int[] iArr22 = f26384v;
            while (i6 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Q0[]) arrayList.toArray(new Q0[0]);
    }
}
