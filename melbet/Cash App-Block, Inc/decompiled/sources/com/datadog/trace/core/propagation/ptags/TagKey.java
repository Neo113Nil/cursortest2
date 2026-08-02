package com.datadog.trace.core.propagation.ptags;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.core.propagation.ptags.TagElement;

/* loaded from: classes4.dex */
public final class TagKey extends TagElement {
    public static final Sniffer keyCache = new Sniffer(64, 13);
    public final String[] keys = new String[TagElement.Encoding.numValues];
    public final String none;

    /* renamed from: $r8$lambda$8z9Ke-nwP_OfhfQNk5ATmRvRPro, reason: not valid java name */
    public static int m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro(int i, int i2, String str) {
        int min = Integer.min(str.length(), i2);
        int i3 = 0;
        if (i >= 0 && min > 0) {
            while (i < min) {
                i3 = (i3 * 31) + str.charAt(i);
                i++;
            }
        }
        return i3;
    }

    /* renamed from: $r8$lambda$dt7V_JXILPo-GSIpzmR0kf2gmiM, reason: not valid java name */
    public static boolean m1916$r8$lambda$dt7V_JXILPoGSIpzmR0kf2gmiM(String str, int i, int i2, TagKey tagKey) {
        int min = Integer.min(str.length(), i2);
        if (i < 0 || min < 0 || min - i != tagKey.none.length()) {
            return false;
        }
        int i3 = 0;
        boolean z = true;
        while (z && i < min) {
            z = str.charAt(i) == tagKey.none.charAt(i3);
            i++;
            i3++;
        }
        return z;
    }

    public TagKey(String str, int i, int i2) {
        this.none = (i == 0 && i2 == str.length()) ? str : str.substring(i, i2);
        for (TagElement.Encoding encoding2 : TagElement.Encoding.cachedValues) {
            this.keys[encoding2.ordinal()] = encoding2.prefix + this.none;
        }
    }

    public static TagKey from(TagElement.Encoding encoding2, String str, int i, int i2) {
        Object tagKey;
        String str2 = encoding2.prefix;
        int i3 = 1;
        Object obj = null;
        if (str == null ? true : isHeaderInvalid(str, i, i2, str2)) {
            return null;
        }
        int length = i + str2.length();
        Sniffer sniffer = keyCache;
        int i4 = sniffer.peekLength;
        Sniffer[] snifferArr = (Sniffer[]) sniffer.scratch;
        if (str != null) {
            int m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro = m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro(length, i2, str);
            int i5 = m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro & i4;
            int i6 = m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro;
            while (true) {
                int i7 = i6 & i4;
                Sniffer sniffer2 = snifferArr[i7];
                int i8 = 12;
                if (sniffer2 != null) {
                    Object obj2 = sniffer2.scratch;
                    if (m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro == sniffer2.peekLength && m1916$r8$lambda$dt7V_JXILPoGSIpzmR0kf2gmiM(str, length, i2, (TagKey) obj2)) {
                        obj = obj2;
                        break;
                    }
                    if (i3 == 3) {
                        tagKey = new TagKey(str, length, i2);
                        snifferArr[i5] = new Sniffer(m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro, tagKey, i8);
                        break;
                    }
                    i6 = Integer.reverseBytes(i6 * (-1640532531)) * (-1640532531);
                    i3++;
                } else {
                    tagKey = new TagKey(str, length, i2);
                    snifferArr[i7] = new Sniffer(m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro, tagKey, i8);
                    break;
                }
            }
            obj = tagKey;
        }
        return (TagKey) obj;
    }

    public static boolean isHeaderInvalid(String str, int i, int i2, String str2) {
        int length = str2 == null ? 0 : str2.length();
        int length2 = str.length();
        if (i < 0 || i2 <= 0 || i2 - i <= length || length2 <= length || length2 < i2) {
            return true;
        }
        return (str2 == null || str.startsWith(str2, i)) ? false : true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.none.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TagKey.class != obj.getClass()) {
            return false;
        }
        return this.none.equals(((TagKey) obj).none);
    }

    @Override // com.datadog.trace.core.propagation.ptags.TagElement
    public final CharSequence forType(TagElement.Encoding encoding2) {
        return this.keys[encoding2.ordinal()];
    }

    public final int hashCode() {
        return this.none.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.none.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.none.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.none;
    }

    public static TagKey from(String str) {
        Object tagKey;
        if (isHeaderInvalid(str, 0, str.length(), null)) {
            return null;
        }
        int length = str.length();
        Sniffer sniffer = keyCache;
        int i = sniffer.peekLength;
        Sniffer[] snifferArr = (Sniffer[]) sniffer.scratch;
        int m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro = m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro(0, length, str);
        int i2 = m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro & i;
        int i3 = 1;
        int i4 = m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro;
        while (true) {
            int i5 = i4 & i;
            Sniffer sniffer2 = snifferArr[i5];
            int i6 = 12;
            if (sniffer2 == null) {
                tagKey = new TagKey(str, 0, length);
                snifferArr[i5] = new Sniffer(m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro, tagKey, i6);
                break;
            }
            Object obj = sniffer2.scratch;
            if (m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro == sniffer2.peekLength && m1916$r8$lambda$dt7V_JXILPoGSIpzmR0kf2gmiM(str, 0, length, (TagKey) obj)) {
                tagKey = obj;
                break;
            }
            if (i3 == 3) {
                tagKey = new TagKey(str, 0, length);
                snifferArr[i2] = new Sniffer(m1915$r8$lambda$8z9KenwP_OfhfQNk5ATmRvRPro, tagKey, i6);
                break;
            }
            i4 = Integer.reverseBytes(i4 * (-1640532531)) * (-1640532531);
            i3++;
        }
        return (TagKey) tagKey;
    }
}
