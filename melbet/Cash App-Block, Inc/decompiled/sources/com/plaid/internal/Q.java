package com.plaid.internal;

import android.app.Application;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Q {
    public static final String a(Application application) {
        application.getClass();
        return String.format("intent://redirect/#Intent;scheme=plaid;package=%s;end;", Arrays.copyOf(new Object[]{application.getApplicationContext().getPackageName()}, 1));
    }
}
