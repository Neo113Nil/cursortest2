package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.ju, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3450ju {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f32123a;

    public C3450ju() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32848L7));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f32123a = pattern;
    }
}
