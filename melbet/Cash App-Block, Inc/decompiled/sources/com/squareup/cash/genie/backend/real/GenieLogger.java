package com.squareup.cash.genie.backend.real;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import timber.log.Timber;
import xyz.block.genie.GenieLogLevel;

/* loaded from: classes.dex */
public final class GenieLogger {
    public static void log(GenieLogLevel genieLogLevel, String str) {
        int ordinal = genieLogLevel.ordinal();
        if (ordinal == 0) {
            Timber.Forest.d(str, new Object[0]);
            return;
        }
        if (ordinal == 1) {
            Timber.Forest.i(str, new Object[0]);
            return;
        }
        if (ordinal == 2) {
            Timber.Forest.w(str, new Object[0]);
        } else if (ordinal == 3) {
            Timber.Forest.e(str, new Object[0]);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
