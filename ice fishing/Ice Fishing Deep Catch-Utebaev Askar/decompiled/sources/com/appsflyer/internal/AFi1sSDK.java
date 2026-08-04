package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1sSDK extends AFi1rSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1sSDK$4, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass4 extends m.d implements Function1<Network, NetworkInfo> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: z_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1sSDK.this.getCurrencyIso4217Code;
            Intrinsics.b(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getCurrencyIso4217Code() {
        Network[] allNetworks;
        Object next;
        ConnectivityManager connectivityManager = this.getCurrencyIso4217Code;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            Intrinsics.checkNotNullParameter(allNetworks, "<this>");
            Sequence lVar = allNetworks.length == 0 ? p.b.f223a : new kotlin.collections.l(0, allNetworks);
            if (lVar != null) {
                AnonymousClass4 transform = new AnonymousClass4();
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                Intrinsics.checkNotNullParameter(transform, "transform");
                p.h hVar = new p.h(lVar, transform);
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                p.f predicate = p.f.f232a;
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                p.c cVar = new p.c(new p.d(hVar, predicate));
                do {
                    if (!cVar.hasNext()) {
                        next = null;
                        break;
                    }
                    next = cVar.next();
                } while (!AFi1rSDK.x_((NetworkInfo) next));
                NetworkInfo networkInfo = (NetworkInfo) next;
                if (networkInfo != null) {
                    int type = networkInfo.getType();
                    if (type != 0) {
                        return type != 1 ? "unknown" : "WIFI";
                    }
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final boolean getRevenue() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getCurrencyIso4217Code;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getCurrencyIso4217Code;
                Intrinsics.b(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (y_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Failed collecting ivc data", e2);
            return false;
        }
    }
}
