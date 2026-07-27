package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class OC implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f26664a;

    public OC(Pattern pattern) {
        pattern.getClass();
        this.f26664a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f26664a.matcher(str).matches();
    }
}
