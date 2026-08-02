package com.google.android.gms.internal.measurement;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class zzyy {
    public final Object[] zza;
    public final zzaaf zza$1;
    public final StringBuilder zzb;
    public int zzc;
    public int zzb$1 = 0;
    public int zzc$1 = -1;

    public zzyy(zzaaf zzaafVar, Object[] objArr, StringBuilder sb) {
        zzky.zza(zzaafVar, "context");
        this.zza$1 = zzaafVar;
        this.zzc = 0;
        this.zza = objArr;
        this.zzb = sb;
    }

    public static void zzm(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(zzzh.zza(obj));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r8 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if ((r8 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(Object obj, zzyz zzyzVar, zzza zzzaVar) {
        String simpleName;
        zzza zzzaVar2;
        boolean z;
        int i = zzyzVar.zzm;
        String str = zzyzVar.zzo;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        StringBuilder sb = this.zzb;
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = obj instanceof Boolean;
            } else if (ordinal == 2) {
                if (!(obj instanceof Character)) {
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        z = Character.isValidCodePoint(((Number) obj).intValue());
                    }
                    z = false;
                }
                z = true;
            } else if (ordinal == 3) {
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        if (!(obj instanceof Byte)) {
                            if (!(obj instanceof Short)) {
                            }
                        }
                    }
                }
                z = true;
            } else {
                if (ordinal != 4) {
                    throw null;
                }
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                    }
                }
                z = true;
            }
            if (!z) {
                zzm(sb, obj, str);
                return;
            }
        }
        int ordinal2 = zzyzVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!zzzaVar.zze()) {
                                int i2 = zzzaVar.zzc;
                                int i3 = i2 & 128;
                                if (i3 == 0) {
                                    zzzaVar2 = zzza.zzb;
                                } else if (i3 != i2 || zzzaVar.zzd != -1 || zzzaVar.zze != -1) {
                                    zzzaVar2 = new zzza(i3, -1, -1);
                                }
                                if (zzzaVar2.equals(zzzaVar)) {
                                    Number number = (Number) obj;
                                    Locale locale = zzzh.zza;
                                    boolean zzk = zzzaVar.zzk();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        zzzh.zzd(sb, longValue, zzk);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        zzzh.zzd(sb, longValue & BodyPartID.bodyIdMax, zzk);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        zzzh.zzd(sb, longValue & 255, zzk);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        zzzh.zzd(sb, longValue & 65535, zzk);
                                        return;
                                    }
                                    if (!(number instanceof BigInteger)) {
                                        a$$ExternalSyntheticBUOutline0.m$1("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                        return;
                                    }
                                    String bigInteger = ((BigInteger) number).toString(16);
                                    if (zzk) {
                                        bigInteger = bigInteger.toUpperCase(zzzh.zza);
                                    }
                                    sb.append(bigInteger);
                                    return;
                                }
                            }
                            zzzaVar2 = zzzaVar;
                            if (zzzaVar2.equals(zzzaVar)) {
                            }
                        }
                    }
                } else if (zzzaVar.zze()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (zzzaVar.zze()) {
                sb.append(obj);
                return;
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zzzh.zza;
                int i4 = zzzaVar.zzc;
                int i5 = i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, zzzh.zza);
                try {
                    formattable.formatTo(formatter, i5, zzzaVar.zzd, zzzaVar.zze);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable out = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        out.append(zzzh.zzf(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (zzzaVar.zze()) {
                sb.append(zzzh.zza(obj));
                return;
            }
        }
        if (!zzzaVar.zze()) {
            int i6 = zzyzVar.zzl;
            if (zzzaVar.zzk()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            zzzaVar.zzl(sb2);
            sb2.append((char) i6);
            str = sb2.toString();
        }
        sb.append(String.format(zzzh.zza, str, obj));
    }
}
