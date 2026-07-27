package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class KC implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f25877a;

    public KC(Pattern pattern) {
        pattern.getClass();
        this.f25877a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f25877a.matcher(str).matches();
    }
}
