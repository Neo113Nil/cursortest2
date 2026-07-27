package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import androidx.versionedparcelable.AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057;
import androidx.versionedparcelable.GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246;
import androidx.versionedparcelable.KryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389;
import androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214;
import com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            AtomicBoolean atomicBoolean = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) {
                try {
                    if (ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.containsKey("[DEFAULT]")) {
                        ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                    } else {
                        KryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = KryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context);
                        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null) {
                            ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                        }
                    }
                } finally {
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
