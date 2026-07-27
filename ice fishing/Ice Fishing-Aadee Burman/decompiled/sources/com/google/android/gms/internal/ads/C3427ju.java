package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.ju, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3427ju {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f31344a;

    public C3427ju() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32069L7));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f31344a = pattern;
    }
}
