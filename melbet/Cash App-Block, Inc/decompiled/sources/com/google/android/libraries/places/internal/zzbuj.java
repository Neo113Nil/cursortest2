package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.VerifyException;
import com.google.common.collect.ImmutableList;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Objects;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbuj {
    public static final BitSet zza = BitSet.valueOf(new long[]{287948901175001088L});
    public static final BitSet zzb = BitSet.valueOf(new long[]{0, 576460743847706622L});
    public static final BitSet zzc = BitSet.valueOf(new long[]{288063250384289792L, 576460743847706622L});
    public static final BitSet zzd = BitSet.valueOf(new long[]{288054454291267584L, 5188146764422578174L});
    public static final BitSet zze;
    public static final BitSet zzf;
    public static final BitSet zzg;
    public static final BitSet zzh;
    public static final BitSet zzi;
    public static final BitSet zzj;
    public static final char[] zzs;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;

    static {
        BitSet.valueOf(new long[]{-8935000888854970368L, 671088641});
        BitSet.valueOf(new long[]{2882338748320710656L});
        BitSet.valueOf(new long[]{-6052662140534259712L, 671088641});
        zze = BitSet.valueOf(new long[]{3170393202611978240L, 5188146764422578174L});
        zzf = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578174L});
        zzg = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578175L});
        zzh = BitSet.valueOf(new long[]{3458764316252045312L, 5188146764422578175L});
        BitSet valueOf = BitSet.valueOf(new long[]{-5764607720602730496L, 5188146764422578175L});
        zzi = valueOf;
        zzj = valueOf;
        zzs = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public zzbuj(zzbui zzbuiVar) {
        String str = zzbuiVar.zza;
        Trace.checkNotNull(str, "scheme");
        this.zzl = str;
        this.zzm = zzbuiVar.zze;
        String str2 = zzbuiVar.zzf;
        this.zzn = str2;
        this.zzo = zzbuiVar.zzg;
        String str3 = zzbuiVar.zzb;
        this.zzp = str3;
        this.zzq = zzbuiVar.zzc;
        this.zzr = zzbuiVar.zzd;
        if (str2 == null) {
            if (str3.startsWith("//")) {
                a$$ExternalSyntheticBUOutline0.m$3("No authority -- Path cannot start with '//'");
                throw null;
            }
        } else {
            if (str3.isEmpty() || str3.startsWith("/")) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Has authority -- Non-empty path must start with '/'");
            throw null;
        }
    }

    public static zzbuj zza(String str) {
        int i;
        zzbui zzbuiVar = new zzbui(0);
        int length = str.length();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt != ':') {
                    if (charAt == '/' || charAt == '?' || charAt == '#') {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        i2 = -1;
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Missing required scheme.");
            return null;
        }
        zzbuiVar.zzb(str.substring(0, i2));
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        if (i4 < length && str.charAt(i3) == '/' && str.charAt(i4) == '/') {
            int i5 = i2 + 3;
            i3 = i5;
            while (i3 < length) {
                char charAt2 = str.charAt(i3);
                if (charAt2 == '/' || charAt2 == '?' || charAt2 == '#') {
                    break;
                }
                i3++;
            }
            String substring = str.substring(i5, i3);
            int indexOf = substring.indexOf(64);
            if (indexOf >= 0) {
                String substring2 = substring.substring(0, indexOf);
                zzl(substring2, "userInfo", zzf, null);
                zzbuiVar.zze = substring2;
            }
            int i6 = indexOf >= 0 ? indexOf + 1 : 0;
            int length2 = substring.length() - 1;
            while (true) {
                if (length2 >= i6) {
                    char charAt3 = substring.charAt(length2);
                    if (charAt3 == ':') {
                        i = length2;
                        break;
                    }
                    if (charAt3 == ']' || !zza.get(charAt3)) {
                        break;
                    }
                    length2--;
                } else {
                    break;
                }
            }
            if (i < 0) {
                zzbuiVar.zzi(substring.substring(i6, substring.length()));
            } else {
                zzbuiVar.zzi(substring.substring(i6, i));
                String substring3 = substring.substring(i + 1);
                if (!substring3.isEmpty()) {
                    try {
                        Integer.parseInt(substring3);
                    } catch (NumberFormatException e) {
                        Handlers$$ExternalSyntheticBUOutline0.m("Invalid port", e);
                        return null;
                    }
                }
                zzbuiVar.zzg = substring3;
            }
        }
        int i7 = i3;
        while (i7 < length) {
            char charAt4 = str.charAt(i7);
            if (charAt4 == '?' || charAt4 == '#') {
                break;
            }
            i7++;
        }
        String substring4 = str.substring(i3, i7);
        zzi(substring4, null);
        zzbuiVar.zzb = substring4;
        if (i7 < length && str.charAt(i7) == '?') {
            int i8 = i7 + 1;
            int i9 = i8;
            while (i9 < length && str.charAt(i9) != '#') {
                i9++;
            }
            String substring5 = str.substring(i8, i9);
            zzl(substring5, "query", zzi, null);
            zzbuiVar.zzc = substring5;
            i7 = i9;
        }
        if (i7 < length && str.charAt(i7) == '#') {
            String substring6 = str.substring(i7 + 1);
            zzl(substring6, BreadcrumbHelper.Category.FRAGMENT, zzj, null);
            zzbuiVar.zzd = substring6;
        }
        return zzbuiVar.zzk();
    }

    public static String zzg(String str, BitSet bitSet) {
        if (str == null) {
            return null;
        }
        CharsetEncoder newEncoder = StandardCharsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        try {
            ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
            StringBuilder sb = new StringBuilder();
            while (encode.hasRemaining()) {
                byte b = encode.get();
                int i = b & 255;
                if (bitSet.get(i)) {
                    sb.append((char) i);
                } else {
                    sb.append('%');
                    char[] cArr = zzs;
                    sb.append(cArr[(b & 240) >> 4]);
                    sb.append(cArr[b & 15]);
                }
            }
            return sb.toString();
        } catch (MalformedInputException e) {
            Handlers$$ExternalSyntheticBUOutline0.m("Malformed input", e);
            return null;
        } catch (CharacterCodingException e2) {
            throw new VerifyException(e2);
        }
    }

    public static void zzi(String str, ImmutableList.Builder builder) {
        String substring;
        int length;
        int i = str.startsWith("/");
        while (i < str.length()) {
            int indexOf = str.indexOf(47, i);
            if (indexOf >= 0) {
                substring = str.substring(i, indexOf);
                length = indexOf + 1;
            } else {
                substring = str.substring(i);
                length = str.length();
            }
            if (builder != null) {
                builder.m2032add((Object) zzm(substring));
            } else {
                zzl(substring, "path segment", zzg, null);
            }
            i = length;
        }
        if (!str.endsWith("/") || builder == null) {
            return;
        }
        builder.m2032add("");
    }

    public static void zzl(String str, String str2, BitSet bitSet, ByteBuffer byteBuffer) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                int i2 = i + 2;
                if (i2 >= str.length()) {
                    StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(i).length() + 38, 2, str2) + str.length());
                    sb.append("Invalid percent-encoding at index ");
                    sb.append(i);
                    sb.append(" of ");
                    sb.append(str2);
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, ": ", str));
                    return;
                }
                int digit = Character.digit(str.charAt(i + 1), 16);
                int digit2 = Character.digit(str.charAt(i2), 16);
                if (digit == -1 || digit2 == -1) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + str2.length() + 31 + 5 + str.length());
                    sb2.append("Invalid hex digit in ");
                    sb2.append(str2);
                    sb2.append(" at index ");
                    sb2.append(i);
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, " of: ", str));
                    return;
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) ((digit << 4) | digit2));
                }
                i = i2;
            } else {
                if (bitSet != null && !bitSet.get(charAt)) {
                    StringBuilder sb3 = new StringBuilder(str2.length() + 31 + String.valueOf(i).length());
                    sb3.append("Invalid character in ");
                    sb3.append(str2);
                    sb3.append(" at index ");
                    sb3.append(i);
                    throw new IllegalArgumentException(sb3.toString());
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) charAt);
                }
            }
            i++;
        }
    }

    public static String zzm(String str) {
        if (str == null || str.indexOf(37) == -1) {
            return str;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        zzl(str, "input", null, allocate);
        allocate.flip();
        try {
            CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(allocate).toString();
        } catch (CharacterCodingException e) {
            throw new VerifyException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbuj)) {
            return false;
        }
        zzbuj zzbujVar = (zzbuj) obj;
        return Objects.equals(this.zzl, zzbujVar.zzl) && Objects.equals(this.zzm, zzbujVar.zzm) && Objects.equals(this.zzn, zzbujVar.zzn) && Objects.equals(this.zzo, zzbujVar.zzo) && Objects.equals(this.zzp, zzbujVar.zzp) && Objects.equals(this.zzq, zzbujVar.zzq) && Objects.equals(this.zzr, zzbujVar.zzr);
    }

    public final int hashCode() {
        return Objects.hash(this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzl);
        sb.append(':');
        if (this.zzn != null) {
            sb.append("//");
            zzk(sb);
        }
        sb.append(this.zzp);
        String str = this.zzq;
        if (str != null) {
            sb.append('?');
            sb.append(str);
        }
        String str2 = this.zzr;
        if (str2 != null) {
            sb.append('#');
            sb.append(str2);
        }
        return sb.toString();
    }

    public final void zzk(StringBuilder sb) {
        String str = this.zzm;
        if (str != null) {
            sb.append(str);
            sb.append('@');
        }
        String str2 = this.zzn;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.zzo;
        if (str3 != null) {
            sb.append(':');
            sb.append(str3);
        }
    }
}
