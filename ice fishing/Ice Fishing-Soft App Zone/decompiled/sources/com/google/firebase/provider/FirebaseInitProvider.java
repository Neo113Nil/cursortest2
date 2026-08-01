package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowMapperEngine;
import com.google.android.datatransport.WinterFlowSingletonSessionManager;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.firebase.WinterFlowSyntaxEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final WinterFlowSingletonSessionManager WinterFlowVariableVersionControl = new WinterFlowSingletonSessionManager(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean WinterFlowTransactionManagerStrategy = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
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
            AtomicBoolean atomicBoolean = WinterFlowTransactionManagerStrategy;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (WinterFlowSyntaxEvent.WinterFlowResponseEngine) {
                try {
                    if (WinterFlowSyntaxEvent.WinterFlowTransactionAgent.containsKey("[DEFAULT]")) {
                        WinterFlowSyntaxEvent.WinterFlowHookDataSource();
                    } else {
                        WinterFlowMapperEngine WinterFlowRouterStructure = WinterFlowMapperEngine.WinterFlowRouterStructure(context);
                        if (WinterFlowRouterStructure != null) {
                            WinterFlowSyntaxEvent.WinterFlowVariableVersionControl(context, WinterFlowRouterStructure);
                        }
                    }
                } finally {
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            WinterFlowTransactionManagerStrategy.set(false);
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
