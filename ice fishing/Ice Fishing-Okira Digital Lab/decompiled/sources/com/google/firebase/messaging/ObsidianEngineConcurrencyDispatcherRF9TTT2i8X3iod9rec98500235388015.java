package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import androidx.versionedparcelable.VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997;
import androidx.versionedparcelable.XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 implements Runnable {
    public final PowerManager.WakeLock LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final FirebaseMessaging YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("firebase-iid-executor"));
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = firebaseMessaging;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        try {
            return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050();
        FirebaseMessaging firebaseMessaging = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = true;
                }
                if (!firebaseMessaging.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = false;
                    }
                    if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) && !ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800()) {
                    SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver();
                    syncTask$ConnectivityChangeReceiver.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = this;
                    syncTask$ConnectivityChangeReceiver.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = false;
                    }
                } else {
                    firebaseMessaging.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
                }
                if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = false;
                    if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(firebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
