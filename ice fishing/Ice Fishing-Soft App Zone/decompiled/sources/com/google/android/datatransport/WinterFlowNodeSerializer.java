package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Region;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeSerializer implements WinterFlowAPIScheduler, WinterFlowDecoratorRuntime, WinterFlowEventPipeline {
    public Object WinterFlowVariableVersionControl;

    public WinterFlowNodeSerializer(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.WinterFlowVariableVersionControl = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowBandwidthObject(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return ((WinterFlowStackProvider) this.WinterFlowVariableVersionControl).WinterFlowBandwidthObject(j, winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    public int WinterFlowCacheManagerAgent(Context context, com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        int i;
        int i2;
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(context);
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowSyntaxEvent);
        int WinterFlowTransactionManagerStrategy = winterFlowSyntaxEvent.WinterFlowTransactionManagerStrategy();
        SparseIntArray sparseIntArray = (SparseIntArray) this.WinterFlowVariableVersionControl;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(WinterFlowTransactionManagerStrategy, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.WinterFlowVariableVersionControl;
        synchronized (sparseIntArray2) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i3);
                    if (keyAt > WinterFlowTransactionManagerStrategy && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = WinterFlowWidgetDebug.WinterFlowArrayNetwork.WinterFlowHookDataSource(context, WinterFlowTransactionManagerStrategy);
            }
            sparseIntArray2.put(WinterFlowTransactionManagerStrategy, i2);
        }
        return i2;
    }

    public void WinterFlowHookDataSource(WinterFlowLibraryInterface winterFlowLibraryInterface) {
        ((Region) this.WinterFlowVariableVersionControl).set(winterFlowLibraryInterface.WinterFlowRouterStructure, winterFlowLibraryInterface.WinterFlowHookDataSource, winterFlowLibraryInterface.WinterFlowCacheManagerAgent, winterFlowLibraryInterface.WinterFlowArrayNetwork);
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorRuntime, com.google.android.datatransport.WinterFlowFrontendAgent
    public boolean WinterFlowRouterStructure() {
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowSyntax(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return ((WinterFlowStackProvider) this.WinterFlowVariableVersionControl).WinterFlowSyntax(j, winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowThreadListener(WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return ((WinterFlowStackProvider) this.WinterFlowVariableVersionControl).WinterFlowThreadListener(winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public long WinterFlowVariableVersionControl(WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return ((WinterFlowStackProvider) this.WinterFlowVariableVersionControl).WinterFlowVariableVersionControl(winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowEventPipeline
    public void accept(Object obj, Object obj2) {
        WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) obj2;
        WinterFlowIDERuntime winterFlowIDERuntime = (WinterFlowIDERuntime) ((WinterFlowFrameworkClass) obj).WinterFlowRouterRouter();
        WinterFlowTransactionManagerParser winterFlowTransactionManagerParser = (WinterFlowTransactionManagerParser) this.WinterFlowVariableVersionControl;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(winterFlowIDERuntime.WinterFlowArrayNetwork);
        int i = WinterFlowListenerManager.WinterFlowRouterStructure;
        if (winterFlowTransactionManagerParser == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            winterFlowTransactionManagerParser.writeToParcel(obtain, 0);
        }
        try {
            winterFlowIDERuntime.WinterFlowCacheManagerAgent.transact(1, obtain, null, 1);
            obtain.recycle();
            winterFlowArrayEngine.WinterFlowRouterStructure(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAPIScheduler
    public WinterFlowSingletonProcess get(int i) {
        return (WinterFlowClassMechanism) this.WinterFlowVariableVersionControl;
    }

    public WinterFlowNodeSerializer(int i) {
        switch (i) {
            case 10:
                Object obj = WinterFlowWidgetDebug.WinterFlowCacheManagerAgent;
                this.WinterFlowVariableVersionControl = new SparseIntArray();
                break;
            case 11:
            default:
                this.WinterFlowVariableVersionControl = new Region();
                break;
            case 12:
                this.WinterFlowVariableVersionControl = Collections.synchronizedMap(new WinterFlowUnitTestSystem(0));
                break;
        }
    }

    public /* synthetic */ WinterFlowNodeSerializer(Object obj) {
        this.WinterFlowVariableVersionControl = obj;
    }
}
