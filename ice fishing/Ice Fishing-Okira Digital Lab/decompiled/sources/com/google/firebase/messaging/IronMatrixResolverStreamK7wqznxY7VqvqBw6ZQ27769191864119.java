package com.google.firebase.messaging;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import androidx.versionedparcelable.CrimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698;
import androidx.versionedparcelable.ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026;
import java.io.IOException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 implements Runnable {
    public static Boolean NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public static Boolean ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public static final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = new Object();
    public final long BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final Context RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final CrimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final PowerManager.WakeLock YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119(CrimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698 crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698, Context context, ObsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026 obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026, long j) {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = context;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = j;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obsidianEngineStreamInterpreterX0jdeB4LCRLUld2oW868257633594026;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Context context) {
        boolean booleanValue;
        synchronized (UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
            try {
                Boolean bool = NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context) {
        boolean booleanValue;
        synchronized (UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
            try {
                Boolean bool = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        CrimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698 crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        Context context = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context);
        PowerManager.WakeLock wakeLock = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(true);
                    if (!this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) {
                        crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(false);
                        if (!AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context)) {
                            return;
                        }
                    } else {
                        if (!ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context) || ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495()) {
                            if (crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(false);
                            } else {
                                crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
                            }
                            if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        TopicsSyncTask$ConnectivityChangeReceiver topicsSyncTask$ConnectivityChangeReceiver = new TopicsSyncTask$ConnectivityChangeReceiver();
                        topicsSyncTask$ConnectivityChangeReceiver.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = this;
                        context.registerReceiver(topicsSyncTask$ConnectivityChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                } catch (Throwable th) {
                    if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                e.getMessage();
                crimsonRouteBinaryTreeContainerQSjhBOoPwB5MOFMDh532602996536698.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(false);
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context)) {
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused3) {
        }
    }
}
