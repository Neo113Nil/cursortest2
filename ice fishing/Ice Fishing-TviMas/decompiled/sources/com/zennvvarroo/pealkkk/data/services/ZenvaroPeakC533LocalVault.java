package com.zennvvarroo.pealkkk.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ZenvaroPeakC533LocalVault.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533LocalVault;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", SDKConstants.PARAM_VALUE, "", "finalUrl", "getFinalUrl", "()Ljava/lang/String;", "setFinalUrl", "(Ljava/lang/String;)V", "", "hasLaunchedBefore", "getHasLaunchedBefore", "()Z", "setHasLaunchedBefore", "(Z)V", "initial", "getInitial", "setInitial", "prefs", "Landroid/content/SharedPreferences;", "status", "getStatus", "setStatus", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroPeakC533LocalVault {
    public static final int $stable = 8;
    private final SharedPreferences prefs;

    public ZenvaroPeakC533LocalVault(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("GoldenSproutUpdateManagerPrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    public final String getInitial() {
        return this.prefs.getString("GoldenSproutUpdateManagerInitial", null);
    }

    public final void setInitial(String str) {
        this.prefs.edit().putString("GoldenSproutUpdateManagerInitial", str).apply();
    }

    public final boolean getStatus() {
        return this.prefs.getBoolean("GoldenSproutUpdateManagerStatus", false);
    }

    public final void setStatus(boolean z) {
        this.prefs.edit().putBoolean("GoldenSproutUpdateManagerStatus", z).apply();
    }

    public final String getFinalUrl() {
        return this.prefs.getString("GoldenSproutUpdateManagerFinal", null);
    }

    public final void setFinalUrl(String str) {
        this.prefs.edit().putString("GoldenSproutUpdateManagerFinal", str).apply();
    }

    public final boolean getHasLaunchedBefore() {
        return this.prefs.getBoolean("hasLaunchedBefore", false);
    }

    public final void setHasLaunchedBefore(boolean z) {
        this.prefs.edit().putBoolean("hasLaunchedBefore", z).apply();
    }
}
