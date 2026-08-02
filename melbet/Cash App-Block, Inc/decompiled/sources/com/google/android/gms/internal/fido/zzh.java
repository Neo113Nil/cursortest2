package com.google.android.gms.internal.fido;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Box;
import com.google.mlkit.vision.text.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzh {
    public static volatile zzag zze;

    /* renamed from: zza, reason: collision with other field name */
    public static final Object f63zza = new Object();
    public static final zzhn zza = new zzhn("id");
    public static final zzhn zzb = new zzhn("type");

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m = "null";
            } else {
                try {
                    m = obj.toString();
                } catch (Exception e) {
                    String m2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m2), (Throwable) e);
                    m = Boxes$$ExternalSyntheticOutline1.m("<", m2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final zzhp zzb(zzhs zzhsVar) {
        try {
            zzhr zzd = zzhsVar.zzd();
            if (zzd == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = zzd.zzb;
                byte b2 = zzd.zza;
                int i = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long zza2 = zzhsVar.zza();
                    if (zza2 > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    zzc(zza2, b);
                    zzhp[] zzhpVarArr = new zzhp[(int) zza2];
                    while (i < zza2) {
                        zzhpVarArr[i] = zzb(zzhsVar);
                        i++;
                    }
                    return new zzhg(zzcc.zzi(zzhpVarArr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new zzhh(zzhsVar.zzf());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long zzb2 = zzhsVar.zzb();
                        zzc(zzb2 > 0 ? zzb2 : ~zzb2, b);
                        return new zzhk(zzb2);
                    }
                    if (b2 == 64) {
                        zzhsVar.zzj((byte) 64);
                        byte[] zzl = zzhsVar.zzl();
                        int length = zzl.length;
                        zzc(length, b);
                        return new zzhi(zzgu.zzl(length, zzl));
                    }
                    if (b2 != 96) {
                        throw new zzhj("Unidentifiable major type: " + ((b2 >> 5) & 7));
                    }
                    zzhsVar.zzj((byte) 96);
                    String str = new String(zzhsVar.zzl(), StandardCharsets.UTF_8);
                    zzc(str.length(), b);
                    return new zzhn(str);
                }
                long zzc = zzhsVar.zzc();
                if (zzc > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                zzc(zzc, b);
                int i2 = (int) zzc;
                Box[] boxArr = new Box[i2];
                zzhp zzhpVar = null;
                int i3 = 0;
                while (i3 < zzc) {
                    zzhp zzb3 = zzb(zzhsVar);
                    if (zzhpVar != null && zzb3.compareTo(zzhpVar) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + zzhpVar.toString() + "\nCurrent key: " + zzb3.toString());
                    }
                    boxArr[i3] = new Box(14, zzb3, zzb(zzhsVar));
                    i3++;
                    zzhpVar = zzb3;
                }
                TreeMap treeMap = new TreeMap();
                while (i < i2) {
                    Box box = boxArr[i];
                    if (treeMap.containsKey((zzhp) box.mCenter)) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((zzhp) box.mCenter, (zzhp) box.mHalfExtent);
                    i++;
                }
                return new zzhm(zzcj.zzf(treeMap));
            } catch (IOException | RuntimeException e) {
                throw new zzhj(e);
            }
        } catch (IOException e2) {
            throw new zzhj(e2);
        }
    }

    public static final void zzc(long j, byte b) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new zzhf(Boxes$$ExternalSyntheticOutline1.m(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new zzhf(Boxes$$ExternalSyntheticOutline1.m(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new zzhf(Boxes$$ExternalSyntheticOutline1.m(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new zzhf(Boxes$$ExternalSyntheticOutline1.m(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzg(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzg(i2, i3, "end index") : zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzg(int i, int i2, String str) {
        if (i < 0) {
            return zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public static String zza(zzgu zzguVar) {
        StringBuilder sb = new StringBuilder(zzguVar.zzd());
        for (int i = 0; i < zzguVar.zzd(); i++) {
            byte zza2 = zzguVar.zza(i);
            if (zza2 == 34) {
                sb.append("\\\"");
            } else if (zza2 == 39) {
                sb.append("\\'");
            } else if (zza2 != 92) {
                switch (zza2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zza2 >= 32 && zza2 <= 126) {
                            sb.append((char) zza2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zza2 >>> 6) & 3) + 48));
                            sb.append((char) (((zza2 >>> 3) & 7) + 48));
                            sb.append((char) ((zza2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int zza(zzcf zzcfVar) {
        Iterator it = zzcfVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: zza, reason: collision with other method in class */
    public static void m2006zza(int i, int i2) {
        String zza2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza2 = zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza2 = zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza2);
        }
    }

    public static final void zza(StringBuilder sb, Iterator it, zzb zzbVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(zzb.zzd(entry.getKey()));
            sb.append(" : ");
            sb.append(zzb.zzd(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(zzb.zzd(entry2.getKey()));
                sb.append(" : ");
                sb.append(zzb.zzd(entry2.getValue()));
            }
        }
    }

    /* renamed from: zza, reason: collision with other method in class */
    public static boolean m2007zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static byte[] zza(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static boolean zza(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = zzcq.zza;
            }
        } else {
            if (!(collection instanceof zzck)) {
                return false;
            }
            obj = ((zzck) collection).zza;
        }
        return comparator.equals(obj);
    }

    public static int zza(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (zzgg.zza[roundingMode.ordinal()]) {
                case 1:
                    Mod$$ExternalSyntheticBUOutline0.m$2("mode was UNNECESSARY, but rounding was necessary");
                    return 0;
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                        return i3;
                    }
                    if (abs2 <= 0) {
                        return i3;
                    }
                    break;
                default:
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return 0;
            }
            return i3 + i5;
        }
        Mod$$ExternalSyntheticBUOutline0.m$2("/ by zero");
        return 0;
    }
}
