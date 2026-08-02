package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import androidx.work.Logger$LogcatLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class NetworkRequest28 {
    public static final int[] defaultCapabilities = {13, 15, 14};

    public static NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
                String str = NetworkRequestCompat.TAG;
                String str2 = NetworkRequestCompat.TAG;
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ignoring adding capability '", i, '\'');
                if (logger$LogcatLogger.mLoggingLevel <= 5) {
                    Log.w(str2, m, e);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = defaultCapabilities[i2];
            if (!ArraysKt___ArraysKt.contains(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
                    String str3 = NetworkRequestCompat.TAG;
                    String str4 = NetworkRequestCompat.TAG;
                    String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ignoring removing default capability '", i3, '\'');
                    if (logger$LogcatLogger2.mLoggingLevel <= 5) {
                        Log.w(str4, m2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new NetworkRequestCompat(build);
    }

    public static final int[] getCapabilitiesCompat(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.capabilities(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    public static final int[] getTransportTypesCompat(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.transportTypes(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasTransport(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.toIntArray(arrayList);
    }
}
