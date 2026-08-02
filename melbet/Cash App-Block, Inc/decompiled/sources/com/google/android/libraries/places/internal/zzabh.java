package com.google.android.libraries.places.internal;

import com.google.common.base.Ascii;
import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.UnmodifiableIterator;

/* loaded from: classes4.dex */
public abstract class zzabh {
    public static final ImmutableSet zzb = ImmutableSet.construct(4, "http", "https", "mailto", "ftp");
    public static final ImmutableSet zzc = ImmutableSet.of((Object) "audio/3gpp2", (Object) "audio/3gpp", (Object) "audio/aac", (Object) "audio/midi", (Object) "audio/mp3", (Object) "audio/mp4", (Object[]) new String[]{"audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf"});
    public static final RegularImmutableSet zzd = RegularImmutableSet.EMPTY;

    public static zzabg zza(String str, zzabg zzabgVar) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        String lowerCase = Ascii.toLowerCase(str);
        UnmodifiableIterator it = zzb.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (!lowerCase.startsWith("data:")) {
                    UnmodifiableIterator it2 = zzd.iterator();
                    while (true) {
                        AbstractIndexedListIterator abstractIndexedListIterator = (AbstractIndexedListIterator) it2;
                        if (abstractIndexedListIterator.hasNext()) {
                            if (lowerCase.startsWith(String.valueOf(Ascii.toLowerCase(((zzabc) abstractIndexedListIterator.next()).name()).replace('_', '-')).concat(":"))) {
                                break;
                            }
                        } else {
                            for (int i2 = 0; i2 < str.length() && (charAt = str.charAt(i2)) != '#' && charAt != '/'; i2++) {
                                if (charAt != ':') {
                                    if (charAt == '?') {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return zzabgVar;
                }
                String lowerCase2 = Ascii.toLowerCase(str);
                if (lowerCase2.startsWith("data:") && lowerCase2.length() > 5) {
                    int i3 = 5;
                    while (i3 < lowerCase2.length() && (charAt3 = lowerCase2.charAt(i3)) != ';' && charAt3 != ',') {
                        i3++;
                    }
                    if (zzc.contains(lowerCase2.substring(5, i3)) && lowerCase2.startsWith(";base64,", i3) && (i = i3 + 8) < lowerCase2.length()) {
                        while (i < lowerCase2.length() && (charAt2 = lowerCase2.charAt(i)) != '=') {
                            if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                                break;
                            }
                            i++;
                        }
                        while (i < lowerCase2.length()) {
                            if (lowerCase2.charAt(i) == '=') {
                                i++;
                            }
                        }
                    }
                }
                return zzabgVar;
            }
            if (lowerCase.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                break;
            }
        }
        return new zzabg(str);
    }
}
