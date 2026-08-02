package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.core.common.e.a;

/* loaded from: classes.dex */
final class f {

    /* renamed from: F, reason: collision with root package name */
    private static final String f7834F = "und";

    /* renamed from: a, reason: collision with root package name */
    private static final String f7835a = "MetadataUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7836b = af.f("nam");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7837c = af.f("trk");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7838d = af.f("cmt");

    /* renamed from: e, reason: collision with root package name */
    private static final int f7839e = af.f(a.C0077a.f13698k);

    /* renamed from: f, reason: collision with root package name */
    private static final int f7840f = af.f("ART");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7841g = af.f("too");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7842h = af.f("alb");
    private static final int i = af.f("com");

    /* renamed from: j, reason: collision with root package name */
    private static final int f7843j = af.f("wrt");

    /* renamed from: k, reason: collision with root package name */
    private static final int f7844k = af.f("lyr");

    /* renamed from: l, reason: collision with root package name */
    private static final int f7845l = af.f("gen");

    /* renamed from: m, reason: collision with root package name */
    private static final int f7846m = af.f("covr");

    /* renamed from: n, reason: collision with root package name */
    private static final int f7847n = af.f("gnre");

    /* renamed from: o, reason: collision with root package name */
    private static final int f7848o = af.f("grp");

    /* renamed from: p, reason: collision with root package name */
    private static final int f7849p = af.f("disk");

    /* renamed from: q, reason: collision with root package name */
    private static final int f7850q = af.f("trkn");

    /* renamed from: r, reason: collision with root package name */
    private static final int f7851r = af.f("tmpo");

    /* renamed from: s, reason: collision with root package name */
    private static final int f7852s = af.f("cpil");

    /* renamed from: t, reason: collision with root package name */
    private static final int f7853t = af.f("aART");

    /* renamed from: u, reason: collision with root package name */
    private static final int f7854u = af.f("sonm");

    /* renamed from: v, reason: collision with root package name */
    private static final int f7855v = af.f("soal");

    /* renamed from: w, reason: collision with root package name */
    private static final int f7856w = af.f("soar");

    /* renamed from: x, reason: collision with root package name */
    private static final int f7857x = af.f("soaa");

    /* renamed from: y, reason: collision with root package name */
    private static final int f7858y = af.f("soco");

    /* renamed from: z, reason: collision with root package name */
    private static final int f7859z = af.f("rtng");

    /* renamed from: A, reason: collision with root package name */
    private static final int f7829A = af.f("pgap");

    /* renamed from: B, reason: collision with root package name */
    private static final int f7830B = af.f("sosn");

    /* renamed from: C, reason: collision with root package name */
    private static final int f7831C = af.f("tvsh");

    /* renamed from: D, reason: collision with root package name */
    private static final int f7832D = af.f(com.anythink.basead.exoplayer.g.b.i.f8113a);

    /* renamed from: E, reason: collision with root package name */
    private static final String[] f7833E = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x003b, B:18:0x0042, B:20:0x004b, B:22:0x004f, B:25:0x0059, B:27:0x005d, B:30:0x0067, B:32:0x006c, B:35:0x0076, B:37:0x007a, B:40:0x0084, B:42:0x0088, B:44:0x0094, B:48:0x00ad, B:51:0x00bb, B:56:0x00ce, B:57:0x00d7, B:59:0x00db, B:62:0x00e5, B:64:0x00e9, B:67:0x00f3, B:69:0x00f7, B:72:0x0101, B:74:0x0105, B:77:0x010f, B:79:0x0113, B:82:0x011d, B:84:0x0121, B:87:0x012b, B:89:0x012f, B:92:0x0139, B:94:0x013d, B:97:0x0147, B:99:0x014b, B:102:0x0155, B:104:0x0159, B:107:0x0163, B:109:0x0167, B:112:0x0223, B:116:0x0173, B:118:0x0177, B:120:0x0183, B:123:0x0196, B:124:0x01af, B:126:0x01b3, B:129:0x01b9, B:131:0x01bd, B:134:0x01c3, B:136:0x01c7, B:139:0x01d1, B:141:0x01d5, B:144:0x01df, B:146:0x01e3, B:149:0x01ed, B:151:0x01f1, B:154:0x01fb, B:156:0x01ff, B:159:0x0209, B:161:0x020d, B:164:0x0215, B:166:0x0219, B:169:0x023c, B:172:0x0246), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x003b, B:18:0x0042, B:20:0x004b, B:22:0x004f, B:25:0x0059, B:27:0x005d, B:30:0x0067, B:32:0x006c, B:35:0x0076, B:37:0x007a, B:40:0x0084, B:42:0x0088, B:44:0x0094, B:48:0x00ad, B:51:0x00bb, B:56:0x00ce, B:57:0x00d7, B:59:0x00db, B:62:0x00e5, B:64:0x00e9, B:67:0x00f3, B:69:0x00f7, B:72:0x0101, B:74:0x0105, B:77:0x010f, B:79:0x0113, B:82:0x011d, B:84:0x0121, B:87:0x012b, B:89:0x012f, B:92:0x0139, B:94:0x013d, B:97:0x0147, B:99:0x014b, B:102:0x0155, B:104:0x0159, B:107:0x0163, B:109:0x0167, B:112:0x0223, B:116:0x0173, B:118:0x0177, B:120:0x0183, B:123:0x0196, B:124:0x01af, B:126:0x01b3, B:129:0x01b9, B:131:0x01bd, B:134:0x01c3, B:136:0x01c7, B:139:0x01d1, B:141:0x01d5, B:144:0x01df, B:146:0x01e3, B:149:0x01ed, B:151:0x01f1, B:154:0x01fb, B:156:0x01ff, B:159:0x0209, B:161:0x020d, B:164:0x0215, B:166:0x0219, B:169:0x023c, B:172:0x0246), top: B:2:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a.InterfaceC0025a a(s sVar) {
        String str;
        int i4 = sVar.i() + sVar.c();
        int i6 = sVar.i();
        int i9 = (i6 >> 24) & p.f9259b;
        com.anythink.basead.exoplayer.g.b.h hVar = null;
        try {
            if (i9 == 169 || i9 == 65533) {
                int i10 = 16777215 & i6;
                if (i10 == f7838d) {
                    int i11 = sVar.i();
                    if (sVar.i() == a.aK) {
                        sVar.d(8);
                        String e9 = sVar.e(i11 - 16);
                        hVar = new com.anythink.basead.exoplayer.g.b.e("und", e9, e9);
                    } else {
                        Log.w(f7835a, "Failed to parse comment attribute: " + a.c(i6));
                    }
                    sVar.c(i4);
                    return hVar;
                }
                if (i10 != f7836b && i10 != f7837c) {
                    if (i10 != i && i10 != f7843j) {
                        if (i10 == f7839e) {
                            com.anythink.basead.exoplayer.g.b.k a9 = a(i6, "TDRC", sVar);
                            sVar.c(i4);
                            return a9;
                        }
                        if (i10 == f7840f) {
                            com.anythink.basead.exoplayer.g.b.k a10 = a(i6, "TPE1", sVar);
                            sVar.c(i4);
                            return a10;
                        }
                        if (i10 == f7841g) {
                            com.anythink.basead.exoplayer.g.b.k a11 = a(i6, "TSSE", sVar);
                            sVar.c(i4);
                            return a11;
                        }
                        if (i10 == f7842h) {
                            com.anythink.basead.exoplayer.g.b.k a12 = a(i6, "TALB", sVar);
                            sVar.c(i4);
                            return a12;
                        }
                        if (i10 == f7844k) {
                            com.anythink.basead.exoplayer.g.b.k a13 = a(i6, "USLT", sVar);
                            sVar.c(i4);
                            return a13;
                        }
                        if (i10 == f7845l) {
                            com.anythink.basead.exoplayer.g.b.k a14 = a(i6, "TCON", sVar);
                            sVar.c(i4);
                            return a14;
                        }
                        if (i10 == f7848o) {
                            com.anythink.basead.exoplayer.g.b.k a15 = a(i6, "TIT1", sVar);
                            sVar.c(i4);
                            return a15;
                        }
                    }
                    com.anythink.basead.exoplayer.g.b.k a16 = a(i6, "TCOM", sVar);
                    sVar.c(i4);
                    return a16;
                }
                com.anythink.basead.exoplayer.g.b.k a17 = a(i6, "TIT2", sVar);
                sVar.c(i4);
                return a17;
            }
            if (i6 == f7847n) {
                int d9 = d(sVar);
                if (d9 > 0) {
                    String[] strArr = f7833E;
                    if (d9 <= strArr.length) {
                        str = strArr[d9 - 1];
                        if (str == null) {
                            hVar = new com.anythink.basead.exoplayer.g.b.k("TCON", null, str);
                        } else {
                            Log.w(f7835a, "Failed to parse standard genre code");
                        }
                        sVar.c(i4);
                        return hVar;
                    }
                }
                str = null;
                if (str == null) {
                }
                sVar.c(i4);
                return hVar;
            }
            if (i6 == f7849p) {
                com.anythink.basead.exoplayer.g.b.k b9 = b(i6, "TPOS", sVar);
                sVar.c(i4);
                return b9;
            }
            if (i6 == f7850q) {
                com.anythink.basead.exoplayer.g.b.k b10 = b(i6, "TRCK", sVar);
                sVar.c(i4);
                return b10;
            }
            if (i6 == f7851r) {
                com.anythink.basead.exoplayer.g.b.h a18 = a(i6, "TBPM", sVar, true, false);
                sVar.c(i4);
                return a18;
            }
            if (i6 == f7852s) {
                com.anythink.basead.exoplayer.g.b.h a19 = a(i6, "TCMP", sVar, true, true);
                sVar.c(i4);
                return a19;
            }
            if (i6 == f7846m) {
                int i12 = sVar.i();
                if (sVar.i() == a.aK) {
                    int b11 = a.b(sVar.i());
                    String str2 = b11 == 13 ? "image/jpeg" : b11 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        Log.w(f7835a, "Unrecognized cover art flags: ".concat(String.valueOf(b11)));
                    } else {
                        sVar.d(4);
                        int i13 = i12 - 16;
                        byte[] bArr = new byte[i13];
                        sVar.a(bArr, 0, i13);
                        hVar = new com.anythink.basead.exoplayer.g.b.a(str2, null, 3, bArr);
                    }
                } else {
                    Log.w(f7835a, "Failed to parse cover art attribute");
                }
                sVar.c(i4);
                return hVar;
            }
            if (i6 == f7853t) {
                com.anythink.basead.exoplayer.g.b.k a20 = a(i6, "TPE2", sVar);
                sVar.c(i4);
                return a20;
            }
            if (i6 == f7854u) {
                com.anythink.basead.exoplayer.g.b.k a21 = a(i6, "TSOT", sVar);
                sVar.c(i4);
                return a21;
            }
            if (i6 == f7855v) {
                com.anythink.basead.exoplayer.g.b.k a22 = a(i6, "TSO2", sVar);
                sVar.c(i4);
                return a22;
            }
            if (i6 == f7856w) {
                com.anythink.basead.exoplayer.g.b.k a23 = a(i6, "TSOA", sVar);
                sVar.c(i4);
                return a23;
            }
            if (i6 == f7857x) {
                com.anythink.basead.exoplayer.g.b.k a24 = a(i6, "TSOP", sVar);
                sVar.c(i4);
                return a24;
            }
            if (i6 == f7858y) {
                com.anythink.basead.exoplayer.g.b.k a25 = a(i6, "TSOC", sVar);
                sVar.c(i4);
                return a25;
            }
            if (i6 == f7859z) {
                com.anythink.basead.exoplayer.g.b.h a26 = a(i6, "ITUNESADVISORY", sVar, false, false);
                sVar.c(i4);
                return a26;
            }
            if (i6 == f7829A) {
                com.anythink.basead.exoplayer.g.b.h a27 = a(i6, "ITUNESGAPLESS", sVar, false, true);
                sVar.c(i4);
                return a27;
            }
            if (i6 == f7830B) {
                com.anythink.basead.exoplayer.g.b.k a28 = a(i6, "TVSHOWSORT", sVar);
                sVar.c(i4);
                return a28;
            }
            if (i6 == f7831C) {
                com.anythink.basead.exoplayer.g.b.k a29 = a(i6, "TVSHOW", sVar);
                sVar.c(i4);
                return a29;
            }
            if (i6 == f7832D) {
                com.anythink.basead.exoplayer.g.b.h a30 = a(sVar, i4);
                sVar.c(i4);
                return a30;
            }
            Log.d(f7835a, "Skipped unknown metadata entry: " + a.c(i6));
            sVar.c(i4);
            return null;
        } catch (Throwable th) {
            sVar.c(i4);
            throw th;
        }
    }

    private static com.anythink.basead.exoplayer.g.b.k b(int i4, String str, s sVar) {
        int i6 = sVar.i();
        if (sVar.i() == a.aK && i6 >= 22) {
            sVar.d(10);
            int e9 = sVar.e();
            if (e9 > 0) {
                String valueOf = String.valueOf(e9);
                int e10 = sVar.e();
                if (e10 > 0) {
                    valueOf = valueOf + "/" + e10;
                }
                return new com.anythink.basead.exoplayer.g.b.k(str, null, valueOf);
            }
        }
        Log.w(f7835a, "Failed to parse index/count attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.a c(s sVar) {
        int i4 = sVar.i();
        if (sVar.i() != a.aK) {
            Log.w(f7835a, "Failed to parse cover art attribute");
            return null;
        }
        int b9 = a.b(sVar.i());
        String str = b9 == 13 ? "image/jpeg" : b9 == 14 ? "image/png" : null;
        if (str == null) {
            Log.w(f7835a, "Unrecognized cover art flags: ".concat(String.valueOf(b9)));
            return null;
        }
        sVar.d(4);
        int i6 = i4 - 16;
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        return new com.anythink.basead.exoplayer.g.b.a(str, null, 3, bArr);
    }

    private static int d(s sVar) {
        sVar.d(4);
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return sVar.d();
        }
        Log.w(f7835a, "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.anythink.basead.exoplayer.g.b.k b(s sVar) {
        String str;
        int d9 = d(sVar);
        if (d9 > 0) {
            String[] strArr = f7833E;
            if (d9 <= strArr.length) {
                str = strArr[d9 - 1];
                if (str == null) {
                    return new com.anythink.basead.exoplayer.g.b.k("TCON", null, str);
                }
                Log.w(f7835a, "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    private static com.anythink.basead.exoplayer.g.b.k a(int i4, String str, s sVar) {
        int i6 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return new com.anythink.basead.exoplayer.g.b.k(str, null, sVar.e(i6 - 16));
        }
        Log.w(f7835a, "Failed to parse text attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.e a(int i4, s sVar) {
        int i6 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            String e9 = sVar.e(i6 - 16);
            return new com.anythink.basead.exoplayer.g.b.e("und", e9, e9);
        }
        Log.w(f7835a, "Failed to parse comment attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.h a(int i4, String str, s sVar, boolean z6, boolean z9) {
        int d9 = d(sVar);
        if (z9) {
            d9 = Math.min(1, d9);
        }
        if (d9 >= 0) {
            if (z6) {
                return new com.anythink.basead.exoplayer.g.b.k(str, null, Integer.toString(d9));
            }
            return new com.anythink.basead.exoplayer.g.b.e("und", str, Integer.toString(d9));
        }
        Log.w(f7835a, "Failed to parse uint8 attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.h a(s sVar, int i4) {
        String str = null;
        String str2 = null;
        int i6 = -1;
        int i9 = -1;
        while (sVar.c() < i4) {
            int c9 = sVar.c();
            int i10 = sVar.i();
            int i11 = sVar.i();
            sVar.d(4);
            if (i11 == a.aI) {
                str = sVar.e(i10 - 12);
            } else if (i11 == a.aJ) {
                str2 = sVar.e(i10 - 12);
            } else {
                if (i11 == a.aK) {
                    i6 = c9;
                    i9 = i10;
                }
                sVar.d(i10 - 12);
            }
        }
        if (str == null || str2 == null || i6 == -1) {
            return null;
        }
        sVar.c(i6);
        sVar.d(16);
        return new com.anythink.basead.exoplayer.g.b.i(str, str2, sVar.e(i9 - 16));
    }
}
