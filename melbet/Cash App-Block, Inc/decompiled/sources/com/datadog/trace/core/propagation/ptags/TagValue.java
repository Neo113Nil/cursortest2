package com.datadog.trace.core.propagation.ptags;

import androidx.media3.extractor.mkv.Sniffer;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.datadog.trace.core.propagation.ptags.TagElement;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class TagValue extends TagElement {
    public static final Sniffer valueCache = new Sniffer(128, 13);
    public final int hash;
    public final int source;
    public final CharSequence[] values;

    static {
        TagElement.Encoding encoding2 = TagElement.Encoding.DATADOG;
    }

    public TagValue(TagElement.Encoding encoding2, int i, CharSequence charSequence, int i2, int i3) {
        CharSequence[] charSequenceArr = new CharSequence[TagElement.Encoding.numValues];
        this.values = charSequenceArr;
        int ordinal = encoding2.ordinal();
        this.source = ordinal;
        this.hash = i;
        if (i2 != 0 || i3 != charSequence.length()) {
            StringBuilder sb = new StringBuilder(i3 - i2);
            sb.append(charSequence, i2, i3);
            charSequence = sb.toString();
        }
        charSequenceArr[ordinal] = charSequence;
    }

    public static char convertDDtoW3C(char c) {
        if (c == ',' || c == ';' || c == '~') {
            return '_';
        }
        if (c == '=') {
            return '~';
        }
        return c;
    }

    public static char convertW3CtoDD(char c) {
        if (c == '~') {
            return '=';
        }
        return c;
    }

    public static TagValue from(TagElement.Encoding encoding2, CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i < 0 || i2 <= 0 || charSequence.length() < i2) {
            return null;
        }
        if (encoding2 == TagElement.Encoding.W3C) {
            return (TagValue) valueCache.computeIfAbsent(charSequence, i, i2, new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(29), new TransportImpl$$ExternalSyntheticLambda0(1), new TransportImpl$$ExternalSyntheticLambda0(2));
        }
        return (TagValue) valueCache.computeIfAbsent(charSequence, i, i2, new TransportImpl$$ExternalSyntheticLambda0(3), new TransportImpl$$ExternalSyntheticLambda0(4), new TransportImpl$$ExternalSyntheticLambda0(5));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.source;
        CharSequence[] charSequenceArr = this.values;
        return i2 == 0 ? charSequenceArr[i2].charAt(i) : convertW3CtoDD(charSequenceArr[i2].charAt(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TagValue.class == obj.getClass()) {
            TagValue tagValue = (TagValue) obj;
            int i = tagValue.source;
            if (this.hash == tagValue.hash) {
                CharSequence[] charSequenceArr = this.values;
                int i2 = this.source;
                CharSequence charSequence = charSequenceArr[i2];
                CharSequence charSequence2 = tagValue.values[i];
                int length = charSequence.length();
                if (length == charSequence2.length()) {
                    if (i2 == i) {
                        for (int i3 = 0; i3 < length; i3++) {
                            if (charSequence.charAt(i3) == charSequence2.charAt(i3)) {
                            }
                        }
                        return true;
                    }
                    TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0 = i2 == 0 ? new TransportImpl$$ExternalSyntheticLambda0(6) : new TransportImpl$$ExternalSyntheticLambda0(7);
                    TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda02 = i == 0 ? new TransportImpl$$ExternalSyntheticLambda0(6) : new TransportImpl$$ExternalSyntheticLambda0(7);
                    for (int i4 = 0; i4 < length; i4++) {
                        if (transportImpl$$ExternalSyntheticLambda0.convert(charSequence.charAt(i4)) == transportImpl$$ExternalSyntheticLambda02.convert(charSequence2.charAt(i4))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.datadog.trace.core.propagation.ptags.TagElement
    public final CharSequence forType(TagElement.Encoding encoding2) {
        int ordinal = encoding2.ordinal();
        CharSequence[] charSequenceArr = this.values;
        CharSequence charSequence = charSequenceArr[ordinal];
        if (charSequence == null) {
            int i = this.source;
            charSequence = charSequenceArr[i];
            int length = charSequence.length();
            TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0 = i == 0 ? new TransportImpl$$ExternalSyntheticLambda0(8) : new TransportImpl$$ExternalSyntheticLambda0(7);
            StringBuilder sb = null;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                char convert = transportImpl$$ExternalSyntheticLambda0.convert(charAt);
                if (convert != charAt && sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                }
                if (sb != null) {
                    sb.append(convert);
                }
            }
            if (sb != null) {
                charSequence = sb.toString();
            }
            charSequenceArr[ordinal] = charSequence;
        }
        return charSequence;
    }

    public final int hashCode() {
        return this.hash;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.values[this.source].length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.values[this.source].subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.values[this.source].toString();
    }

    public static TagValue from(CharSequence charSequence) {
        return from(TagElement.Encoding.DATADOG, charSequence, charSequence == null ? -1 : 0, charSequence != null ? charSequence.length() : -1);
    }
}
