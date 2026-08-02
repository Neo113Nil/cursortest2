package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes4.dex */
public abstract class zak {
    public static final int zaa;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zaa(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }
}
