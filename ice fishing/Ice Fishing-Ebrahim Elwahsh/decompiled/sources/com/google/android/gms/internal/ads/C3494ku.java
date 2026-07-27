package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3494ku {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f32485a;

    public C3494ku() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31490L7));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f32485a = pattern;
    }
}
