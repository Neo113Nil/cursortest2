package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes4.dex */
public final class UTF8BytesString implements CharSequence {

    /* renamed from: string, reason: collision with root package name */
    public final String f977string;

    static {
        create("");
    }

    public UTF8BytesString(String str) {
        this.f977string = str;
    }

    public static UTF8BytesString create(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence instanceof UTF8BytesString ? (UTF8BytesString) charSequence : new UTF8BytesString(String.valueOf(charSequence));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f977string.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return this.f977string.equals(obj instanceof UTF8BytesString ? ((UTF8BytesString) obj).f977string : null);
    }

    public final int hashCode() {
        return this.f977string.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f977string.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f977string.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f977string;
    }
}
