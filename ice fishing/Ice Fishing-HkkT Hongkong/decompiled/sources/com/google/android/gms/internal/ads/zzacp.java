package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.net.HttpHeaders;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzacp implements zzadb {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final zzaco zzc = new zzaco(new zzacn() { // from class: com.google.android.gms.internal.ads.zzacl
        @Override // com.google.android.gms.internal.ads.zzacn
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzaco zzd = new zzaco(new zzacn() { // from class: com.google.android.gms.internal.ads.zzacm
        @Override // com.google.android.gms.internal.ads.zzacn
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzacu.class).getConstructor(new Class[0]);
        }
    });
    private zzgaa zze;
    private final zzakp zzf = new zzakk();

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e0 A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01e0, B:15:0x01e3, B:20:0x0391, B:21:0x0394, B:23:0x0399, B:26:0x039f, B:28:0x03a2, B:32:0x03a5, B:33:0x03ac, B:35:0x03b2, B:42:0x01ec, B:44:0x01f4, B:47:0x01fe, B:50:0x020a, B:52:0x0212, B:55:0x021c, B:58:0x0227, B:61:0x0232, B:64:0x023d, B:66:0x0245, B:68:0x024d, B:71:0x0257, B:73:0x0265, B:76:0x026f, B:79:0x027a, B:81:0x0282, B:83:0x0290, B:85:0x029e, B:88:0x02ae, B:90:0x02bc, B:93:0x02c6, B:95:0x02ce, B:97:0x02d6, B:99:0x02de, B:102:0x02e8, B:104:0x02f0, B:107:0x0300, B:109:0x0308, B:112:0x0312, B:114:0x031a, B:117:0x0323, B:119:0x032b, B:122:0x0334, B:125:0x033f, B:128:0x034a, B:131:0x0355, B:133:0x035d, B:136:0x0366, B:151:0x0048, B:152:0x0050, B:155:0x01a9, B:177:0x0055, B:180:0x0061, B:183:0x006c, B:186:0x0078, B:189:0x0084, B:192:0x008f, B:195:0x009b, B:198:0x00a6, B:201:0x00b1, B:204:0x00bd, B:207:0x00c8, B:210:0x00d4, B:213:0x00df, B:216:0x00ea, B:219:0x00f5, B:222:0x0101, B:225:0x010c, B:228:0x0118, B:231:0x0124, B:234:0x0130, B:237:0x013c, B:240:0x0148, B:243:0x0153, B:246:0x015e, B:249:0x0169, B:252:0x0174, B:255:0x017f, B:258:0x0189, B:261:0x0194, B:264:0x019e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0048 A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01e0, B:15:0x01e3, B:20:0x0391, B:21:0x0394, B:23:0x0399, B:26:0x039f, B:28:0x03a2, B:32:0x03a5, B:33:0x03ac, B:35:0x03b2, B:42:0x01ec, B:44:0x01f4, B:47:0x01fe, B:50:0x020a, B:52:0x0212, B:55:0x021c, B:58:0x0227, B:61:0x0232, B:64:0x023d, B:66:0x0245, B:68:0x024d, B:71:0x0257, B:73:0x0265, B:76:0x026f, B:79:0x027a, B:81:0x0282, B:83:0x0290, B:85:0x029e, B:88:0x02ae, B:90:0x02bc, B:93:0x02c6, B:95:0x02ce, B:97:0x02d6, B:99:0x02de, B:102:0x02e8, B:104:0x02f0, B:107:0x0300, B:109:0x0308, B:112:0x0312, B:114:0x031a, B:117:0x0323, B:119:0x032b, B:122:0x0334, B:125:0x033f, B:128:0x034a, B:131:0x0355, B:133:0x035d, B:136:0x0366, B:151:0x0048, B:152:0x0050, B:155:0x01a9, B:177:0x0055, B:180:0x0061, B:183:0x006c, B:186:0x0078, B:189:0x0084, B:192:0x008f, B:195:0x009b, B:198:0x00a6, B:201:0x00b1, B:204:0x00bd, B:207:0x00c8, B:210:0x00d4, B:213:0x00df, B:216:0x00ea, B:219:0x00f5, B:222:0x0101, B:225:0x010c, B:228:0x0118, B:231:0x0124, B:234:0x0130, B:237:0x013c, B:240:0x0148, B:243:0x0153, B:246:0x015e, B:249:0x0169, B:252:0x0174, B:255:0x017f, B:258:0x0189, B:261:0x0194, B:264:0x019e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0399 A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01e0, B:15:0x01e3, B:20:0x0391, B:21:0x0394, B:23:0x0399, B:26:0x039f, B:28:0x03a2, B:32:0x03a5, B:33:0x03ac, B:35:0x03b2, B:42:0x01ec, B:44:0x01f4, B:47:0x01fe, B:50:0x020a, B:52:0x0212, B:55:0x021c, B:58:0x0227, B:61:0x0232, B:64:0x023d, B:66:0x0245, B:68:0x024d, B:71:0x0257, B:73:0x0265, B:76:0x026f, B:79:0x027a, B:81:0x0282, B:83:0x0290, B:85:0x029e, B:88:0x02ae, B:90:0x02bc, B:93:0x02c6, B:95:0x02ce, B:97:0x02d6, B:99:0x02de, B:102:0x02e8, B:104:0x02f0, B:107:0x0300, B:109:0x0308, B:112:0x0312, B:114:0x031a, B:117:0x0323, B:119:0x032b, B:122:0x0334, B:125:0x033f, B:128:0x034a, B:131:0x0355, B:133:0x035d, B:136:0x0366, B:151:0x0048, B:152:0x0050, B:155:0x01a9, B:177:0x0055, B:180:0x0061, B:183:0x006c, B:186:0x0078, B:189:0x0084, B:192:0x008f, B:195:0x009b, B:198:0x00a6, B:201:0x00b1, B:204:0x00bd, B:207:0x00c8, B:210:0x00d4, B:213:0x00df, B:216:0x00ea, B:219:0x00f5, B:222:0x0101, B:225:0x010c, B:228:0x0118, B:231:0x0124, B:234:0x0130, B:237:0x013c, B:240:0x0148, B:243:0x0153, B:246:0x015e, B:249:0x0169, B:252:0x0174, B:255:0x017f, B:258:0x0189, B:261:0x0194, B:264:0x019e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03b2 A[Catch: all -> 0x03bf, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01e0, B:15:0x01e3, B:20:0x0391, B:21:0x0394, B:23:0x0399, B:26:0x039f, B:28:0x03a2, B:32:0x03a5, B:33:0x03ac, B:35:0x03b2, B:42:0x01ec, B:44:0x01f4, B:47:0x01fe, B:50:0x020a, B:52:0x0212, B:55:0x021c, B:58:0x0227, B:61:0x0232, B:64:0x023d, B:66:0x0245, B:68:0x024d, B:71:0x0257, B:73:0x0265, B:76:0x026f, B:79:0x027a, B:81:0x0282, B:83:0x0290, B:85:0x029e, B:88:0x02ae, B:90:0x02bc, B:93:0x02c6, B:95:0x02ce, B:97:0x02d6, B:99:0x02de, B:102:0x02e8, B:104:0x02f0, B:107:0x0300, B:109:0x0308, B:112:0x0312, B:114:0x031a, B:117:0x0323, B:119:0x032b, B:122:0x0334, B:125:0x033f, B:128:0x034a, B:131:0x0355, B:133:0x035d, B:136:0x0366, B:151:0x0048, B:152:0x0050, B:155:0x01a9, B:177:0x0055, B:180:0x0061, B:183:0x006c, B:186:0x0078, B:189:0x0084, B:192:0x008f, B:195:0x009b, B:198:0x00a6, B:201:0x00b1, B:204:0x00bd, B:207:0x00c8, B:210:0x00d4, B:213:0x00df, B:216:0x00ea, B:219:0x00f5, B:222:0x0101, B:225:0x010c, B:228:0x0118, B:231:0x0124, B:234:0x0130, B:237:0x013c, B:240:0x0148, B:243:0x0153, B:246:0x015e, B:249:0x0169, B:252:0x0174, B:255:0x017f, B:258:0x0189, B:261:0x0194, B:264:0x019e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ec A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01e0, B:15:0x01e3, B:20:0x0391, B:21:0x0394, B:23:0x0399, B:26:0x039f, B:28:0x03a2, B:32:0x03a5, B:33:0x03ac, B:35:0x03b2, B:42:0x01ec, B:44:0x01f4, B:47:0x01fe, B:50:0x020a, B:52:0x0212, B:55:0x021c, B:58:0x0227, B:61:0x0232, B:64:0x023d, B:66:0x0245, B:68:0x024d, B:71:0x0257, B:73:0x0265, B:76:0x026f, B:79:0x027a, B:81:0x0282, B:83:0x0290, B:85:0x029e, B:88:0x02ae, B:90:0x02bc, B:93:0x02c6, B:95:0x02ce, B:97:0x02d6, B:99:0x02de, B:102:0x02e8, B:104:0x02f0, B:107:0x0300, B:109:0x0308, B:112:0x0312, B:114:0x031a, B:117:0x0323, B:119:0x032b, B:122:0x0334, B:125:0x033f, B:128:0x034a, B:131:0x0355, B:133:0x035d, B:136:0x0366, B:151:0x0048, B:152:0x0050, B:155:0x01a9, B:177:0x0055, B:180:0x0061, B:183:0x006c, B:186:0x0078, B:189:0x0084, B:192:0x008f, B:195:0x009b, B:198:0x00a6, B:201:0x00b1, B:204:0x00bd, B:207:0x00c8, B:210:0x00d4, B:213:0x00df, B:216:0x00ea, B:219:0x00f5, B:222:0x0101, B:225:0x010c, B:228:0x0118, B:231:0x0124, B:234:0x0130, B:237:0x013c, B:240:0x0148, B:243:0x0153, B:246:0x015e, B:249:0x0169, B:252:0x0174, B:255:0x017f, B:258:0x0189, B:261:0x0194, B:264:0x019e), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzacu[] zza(Uri uri, Map map) {
        String str;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        zzacu[] zzacuVarArr;
        int i4;
        ArrayList arrayList = new ArrayList(20);
        List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
            if (str != null) {
                String zze = zzcb.zze(str);
                switch (zze.hashCode()) {
                    case -2123537834:
                        if (zze.equals("audio/eac3-joc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384011:
                        if (zze.equals("video/mp2p")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384007:
                        if (zze.equals("video/mp2t")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662095187:
                        if (zze.equals("video/webm")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1606874997:
                        if (zze.equals("audio/amr-wb")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464690:
                        if (zze.equals("image/heif")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487394660:
                        if (zze.equals("image/jpeg")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487018032:
                        if (zze.equals("image/webp")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248337486:
                        if (zze.equals("application/mp4")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1079884372:
                        if (zze.equals("video/x-msvideo")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (zze.equals("text/vtt")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879272239:
                        if (zze.equals("image/bmp")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879258763:
                        if (zze.equals("image/png")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -387023398:
                        if (zze.equals("audio/x-matroska")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -43467528:
                        if (zze.equals("application/webm")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 13915911:
                        if (zze.equals("video/x-flv")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078296:
                        if (zze.equals("audio/ac3")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078297:
                        if (zze.equals("audio/ac4")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078669:
                        if (zze.equals("audio/amr")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187090232:
                        if (zze.equals("audio/mp4")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187091926:
                        if (zze.equals("audio/ogg")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187099443:
                        if (zze.equals("audio/wav")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331848029:
                        if (zze.equals("video/mp4")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1503095341:
                        if (zze.equals("audio/3gpp")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504578661:
                        if (zze.equals("audio/eac3")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504619009:
                        if (zze.equals("audio/flac")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504824762:
                        if (zze.equals("audio/midi")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504831518:
                        if (zze.equals("audio/mpeg")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505118770:
                        if (zze.equals("audio/webm")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2039520277:
                        if (zze.equals("video/x-matroska")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
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
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        i = 20;
                        break;
                }
                if (i != -1) {
                    zzb(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                        if (lastPathSegment.endsWith(".ac4")) {
                            i2 = 1;
                        } else {
                            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                if (lastPathSegment.endsWith(".amr")) {
                                    i2 = 3;
                                } else if (lastPathSegment.endsWith(".flac")) {
                                    i2 = 4;
                                } else if (lastPathSegment.endsWith(".flv")) {
                                    i2 = 5;
                                } else {
                                    if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                        if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                            if (lastPathSegment.endsWith(".mp3")) {
                                                i2 = 7;
                                            } else {
                                                if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                    if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                        if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                            if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                                if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                    if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                        if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                            if (lastPathSegment.endsWith(".avi")) {
                                                                                i2 = 16;
                                                                            } else if (lastPathSegment.endsWith(".png")) {
                                                                                i2 = 17;
                                                                            } else if (lastPathSegment.endsWith(".webp")) {
                                                                                i2 = 18;
                                                                            } else {
                                                                                if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                                                    if (lastPathSegment.endsWith(".heic")) {
                                                                                        i2 = 20;
                                                                                    }
                                                                                }
                                                                                i2 = 19;
                                                                            }
                                                                        }
                                                                        i2 = 14;
                                                                    }
                                                                    i2 = 13;
                                                                }
                                                                i2 = 12;
                                                            }
                                                            i2 = 11;
                                                        }
                                                        i2 = 10;
                                                    }
                                                    i2 = 9;
                                                }
                                                i2 = 8;
                                            }
                                        }
                                        i2 = 6;
                                    }
                                    i2 = 15;
                                }
                            }
                            i2 = 2;
                        }
                        if (i2 != -1 && i2 != i) {
                            zzb(i2, arrayList);
                        }
                        int[] iArr = zza;
                        for (i3 = 0; i3 < 20; i3++) {
                            int i5 = iArr[i3];
                            if (i5 != i && i5 != i2) {
                                zzb(i5, arrayList);
                            }
                        }
                        zzacuVarArr = new zzacu[arrayList.size()];
                        for (i4 = 0; i4 < arrayList.size(); i4++) {
                            zzacuVarArr[i4] = (zzacu) arrayList.get(i4);
                        }
                    }
                    i2 = 0;
                    if (i2 != -1) {
                        zzb(i2, arrayList);
                    }
                    int[] iArr2 = zza;
                    while (i3 < 20) {
                    }
                    zzacuVarArr = new zzacu[arrayList.size()];
                    while (i4 < arrayList.size()) {
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                }
                int[] iArr22 = zza;
                while (i3 < 20) {
                }
                zzacuVarArr = new zzacu[arrayList.size()];
                while (i4 < arrayList.size()) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i2 = -1;
            if (i2 != -1) {
            }
            int[] iArr222 = zza;
            while (i3 < 20) {
            }
            zzacuVarArr = new zzacu[arrayList.size()];
            while (i4 < arrayList.size()) {
            }
        }
        str = null;
        if (str != null) {
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i2 = -1;
        if (i2 != -1) {
        }
        int[] iArr2222 = zza;
        while (i3 < 20) {
        }
        zzacuVarArr = new zzacu[arrayList.size()];
        while (i4 < arrayList.size()) {
        }
        return zzacuVarArr;
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzamn());
                break;
            case 1:
                list.add(new zzamq());
                break;
            case 2:
                list.add(new zzamt(0));
                break;
            case 3:
                list.add(new zzaei(0));
                break;
            case 4:
                zzacu zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzafa(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzafd());
                break;
            case 6:
                list.add(new zzahy(0));
                break;
            case 7:
                list.add(new zzaig(0));
                break;
            case 8:
                list.add(new zzajc(this.zzf, 32, null, null, zzgaa.zzl(), null));
                list.add(new zzajh(this.zzf, 16));
                break;
            case 9:
                list.add(new zzajw());
                break;
            case 10:
                list.add(new zzanw());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgaa.zzl();
                }
                list.add(new zzaog(1, 1, this.zzf, new zzfw(0L), new zzamv(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaos());
                break;
            case 14:
                list.add(new zzafj(0));
                break;
            case 15:
                zzacu zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaen());
                break;
            case 17:
                list.add(new zzakh());
                break;
            case 18:
                list.add(new zzaox());
                break;
            case 19:
                list.add(new zzaeu());
                break;
            case 20:
                list.add(new zzafi());
                break;
        }
    }
}
