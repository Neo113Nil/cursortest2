package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class zzsa {
    public static final Pattern zzc = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account zza = zzrv.zza;
    public static final Set zzd = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set zze = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
