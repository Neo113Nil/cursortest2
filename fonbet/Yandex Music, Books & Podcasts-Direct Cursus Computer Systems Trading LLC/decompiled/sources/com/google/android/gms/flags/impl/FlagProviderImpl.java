package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import defpackage.j7x;
import defpackage.l9e;
import defpackage.qgg;
import defpackage.tzw;
import defpackage.ywf;
import defpackage.zhj;

@DynamiteApi
/* loaded from: classes.dex */
public class FlagProviderImpl extends j7x {
    public boolean a;
    public SharedPreferences h;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // defpackage.s8x
    public boolean getBooleanFlagValue(@NonNull String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.h;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) qgg.m0(new tzw(0, sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // defpackage.s8x
    public int getIntFlagValue(@NonNull String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.h;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) qgg.m0(new tzw(5, sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // defpackage.s8x
    public long getLongFlagValue(@NonNull String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.h;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) qgg.m0(new tzw(6, sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // defpackage.s8x
    @NonNull
    public String getStringFlagValue(@NonNull String str, @NonNull String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) qgg.m0(new tzw(7, this.h, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // defpackage.s8x
    public void init(@NonNull l9e l9eVar) {
        Context context = (Context) zhj.T0(l9eVar);
        if (this.a) {
            return;
        }
        try {
            this.h = ywf.P(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
