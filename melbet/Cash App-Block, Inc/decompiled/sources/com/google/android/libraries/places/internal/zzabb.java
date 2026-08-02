package com.google.android.libraries.places.internal;

import androidx.media3.extractor.mkv.Sniffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class zzabb {
    public static final Sniffer zzb;

    static {
        zzmv zzmvVar = new zzmv(1);
        HashMap hashMap = zzmvVar.zza;
        hashMap.put('\"', "&quot;");
        hashMap.put('\'', "&#39;");
        hashMap.put('&', "&amp;");
        hashMap.put('<', "&lt;");
        hashMap.put('>', "&gt;");
        zzb = new Sniffer(zzmvVar, hashMap);
    }

    public static String zza(String str) {
        int i;
        char[] cArr;
        Sniffer sniffer = zzb;
        sniffer.getClass();
        char[][] cArr2 = (char[][]) sniffer.scratch;
        int i2 = sniffer.peekLength;
        str.getClass();
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt < i2 && cArr2[charAt] != null) {
                int length = str.length();
                char[] cArr3 = (char[]) zzwm.zza.get();
                Objects.requireNonNull(cArr3);
                int length2 = cArr3.length;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt2 >= i2 || (cArr = cArr2[charAt2]) == null) {
                        cArr = null;
                    }
                    if (cArr != null) {
                        int i7 = i3 - i4;
                        int i8 = i5 + i7;
                        int length3 = cArr.length;
                        int i9 = i8 + length3;
                        if (length2 < i9) {
                            int i10 = length - i3;
                            length2 = i10 + i10 + i9;
                            if (length2 < 0) {
                                a$$ExternalSyntheticBUOutline0.m$1((Object) "Cannot increase internal buffer any further");
                                return null;
                            }
                            char[] cArr4 = new char[length2];
                            if (i5 > 0) {
                                System.arraycopy(cArr3, 0, cArr4, 0, i5);
                            }
                            cArr3 = cArr4;
                        }
                        if (i7 > 0) {
                            str.getChars(i4, i3, cArr3, i5);
                            i5 = i8;
                        }
                        if (length3 > 0) {
                            System.arraycopy(cArr, 0, cArr3, i5, length3);
                            i5 += length3;
                        }
                        i4 = i6;
                    }
                    i3 = i6;
                }
                int i11 = length - i4;
                if (i11 > 0) {
                    int i12 = i11 + i5;
                    if (length2 >= i12) {
                        i = 0;
                    } else {
                        if (i12 < 0) {
                            a$$ExternalSyntheticBUOutline0.m$1((Object) "Cannot increase internal buffer any further");
                            return null;
                        }
                        char[] cArr5 = new char[i12];
                        if (i5 > 0) {
                            i = 0;
                            System.arraycopy(cArr3, 0, cArr5, 0, i5);
                        } else {
                            i = 0;
                        }
                        cArr3 = cArr5;
                    }
                    str.getChars(i4, length, cArr3, i5);
                    i5 = i12;
                } else {
                    i = 0;
                }
                return new String(cArr3, i, i5);
            }
            i3++;
        }
        return str;
    }
}
