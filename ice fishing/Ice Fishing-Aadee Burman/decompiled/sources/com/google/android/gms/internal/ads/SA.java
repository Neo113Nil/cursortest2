package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SA extends QA {

    /* renamed from: u, reason: collision with root package name */
    public static final int f27417u = Integer.numberOfLeadingZeros(31);

    /* renamed from: v, reason: collision with root package name */
    public static final SA f27418v = new SA("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.OA
    public final boolean b(char c9) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c9) >>> f27417u) == c9;
    }
}
