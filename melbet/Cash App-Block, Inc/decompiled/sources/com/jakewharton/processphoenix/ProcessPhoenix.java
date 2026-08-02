package com.jakewharton.processphoenix;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.stock.OrderSide;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;

/* loaded from: classes4.dex */
public abstract class ProcessPhoenix {
    public static PersistentOrderedMap emptyOf$kotlinx_collections_immutable() {
        PersistentOrderedMap persistentOrderedMap = PersistentOrderedMap.EMPTY;
        persistentOrderedMap.getClass();
        return persistentOrderedMap;
    }

    public static final OrderSide toCdf(com.squareup.protos.franklin.investing.resources.OrderSide orderSide) {
        orderSide.getClass();
        int ordinal = orderSide.ordinal();
        if (ordinal == 0) {
            return OrderSide.BUY;
        }
        if (ordinal == 1 || ordinal == 2) {
            return OrderSide.SELL;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static void triggerRebirth(Context context) {
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Intent leanbackLaunchIntentForPackage = packageManager.hasSystemFeature("android.software.leanback") ? packageManager.getLeanbackLaunchIntentForPackage(packageName) : null;
        if (leanbackLaunchIntentForPackage == null) {
            leanbackLaunchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        }
        if (leanbackLaunchIntentForPackage == null) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
            return;
        }
        Intent[] intentArr = {leanbackLaunchIntentForPackage};
        intentArr[0].addFlags(268468224);
        Intent intent = new Intent(context, (Class<?>) PhoenixActivity.class);
        intent.addFlags(268435456);
        intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
        intent.putExtra("phoenix_main_process_pid", Process.myPid());
        context.startActivity(intent);
    }
}
