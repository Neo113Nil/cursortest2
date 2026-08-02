package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earningstracker.applets.presenters.EarningsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzhw implements ModelJsonParser {
    public static Applet earningsApplet(JCAContext jCAContext, EarningsAppletTilePresenter$Factory$Impl earningsAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.EARNINGS, (DerivedStateFlow) jCAContext.provider, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(22, earningsAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static void zza(int i, int i2) {
        String zzb;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zzb = zzhx.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zzb = zzhx.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }

    public static void zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            Path$$ExternalSyntheticBUOutline0.m(zzh(i, i2, "index"));
        }
    }

    public static void zzf(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzh(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzh(i2, i3, "end index") : zzhx.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzh(int i, int i2, String str) {
        if (i < 0) {
            return zzhx.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzhx.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }
}
