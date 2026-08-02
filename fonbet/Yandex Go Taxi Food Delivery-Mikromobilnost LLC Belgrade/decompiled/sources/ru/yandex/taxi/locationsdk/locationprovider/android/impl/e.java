package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import defpackage.fi9;
import defpackage.la2;
import defpackage.rcz;
import defpackage.sls;
import defpackage.tpr;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

/* loaded from: classes9.dex */
public abstract class e {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.US));
        decimalFormat.setMaximumFractionDigits(8);
        a = decimalFormat;
    }

    public static fi9 a(tpr tprVar, AndroidLocationProviderType androidLocationProviderType, la2 la2Var, rcz rczVar, sls slsVar) {
        return kotlinx.coroutines.flow.e.i(new AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1(tprVar, la2Var, slsVar, androidLocationProviderType, rczVar, null));
    }
}
