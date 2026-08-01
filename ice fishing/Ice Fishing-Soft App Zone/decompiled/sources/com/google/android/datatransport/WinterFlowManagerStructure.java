package com.google.android.datatransport;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerStructure extends WinterFlowStackLibrary implements WinterFlowAlgorithmPlatform, WinterFlowJSONHelper {
    public static final WinterFlowMiddlewareInterface WinterFlowTransactionAgent = WinterFlowNodePipeline.WinterFlowRouterStructure;
    public final Context WinterFlowArrayNetwork;
    public WinterFlowConfiguration WinterFlowResponseEngine;
    public final WinterFlowSchedulerParser WinterFlowRouterRouter;
    public WinterFlowFrameworkLibrary WinterFlowSyntax;
    public final WinterFlowMiddlewareInterface WinterFlowTransactionManagerStrategy;
    public final Set WinterFlowUnitTestResponse;
    public final Handler WinterFlowVariableVersionControl;

    public WinterFlowManagerStructure(Context context, WinterFlowWidgetInterface winterFlowWidgetInterface, WinterFlowSchedulerParser winterFlowSchedulerParser) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.WinterFlowArrayNetwork = context;
        this.WinterFlowVariableVersionControl = winterFlowWidgetInterface;
        this.WinterFlowRouterRouter = winterFlowSchedulerParser;
        this.WinterFlowUnitTestResponse = (Set) winterFlowSchedulerParser.WinterFlowCacheManagerAgent;
        this.WinterFlowTransactionManagerStrategy = WinterFlowTransactionAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowJSONHelper
    public final void WinterFlowArrayNetwork(ConnectionResult connectionResult) {
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(connectionResult);
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmPlatform
    public final void WinterFlowCacheManagerAgent() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        WinterFlowFrameworkLibrary winterFlowFrameworkLibrary = this.WinterFlowSyntax;
        winterFlowFrameworkLibrary.getClass();
        int i = 2;
        try {
            winterFlowFrameworkLibrary.WinterFlowEventEmitterController.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                try {
                    if ("<<default account>>".equals(account.name)) {
                        Context context = winterFlowFrameworkLibrary.WinterFlowCacheManagerAgent;
                        ReentrantLock reentrantLock = WinterFlowQueryFunction.WinterFlowCacheManagerAgent;
                        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(context);
                        ReentrantLock reentrantLock2 = WinterFlowQueryFunction.WinterFlowCacheManagerAgent;
                        reentrantLock2.lock();
                        try {
                            WinterFlowQueryFunction winterFlowQueryFunction = WinterFlowQueryFunction.WinterFlowArrayNetwork;
                            if (winterFlowQueryFunction == null) {
                                winterFlowQueryFunction = new WinterFlowQueryFunction(context.getApplicationContext());
                                WinterFlowQueryFunction.WinterFlowArrayNetwork = winterFlowQueryFunction;
                            }
                            reentrantLock2.unlock();
                            String WinterFlowRouterStructure = winterFlowQueryFunction.WinterFlowRouterStructure("defaultGoogleSignInAccount");
                            if (!TextUtils.isEmpty(WinterFlowRouterStructure)) {
                                StringBuilder sb = new StringBuilder(20 + String.valueOf(WinterFlowRouterStructure).length());
                                sb.append("googleSignInAccount:");
                                sb.append(WinterFlowRouterStructure);
                                String WinterFlowRouterStructure2 = winterFlowQueryFunction.WinterFlowRouterStructure(sb.toString());
                                if (WinterFlowRouterStructure2 != null) {
                                    try {
                                        googleSignInAccount = GoogleSignInAccount.WinterFlowRouterStructure(WinterFlowRouterStructure2);
                                    } catch (JSONException unused) {
                                    }
                                    Integer num = winterFlowFrameworkLibrary.WinterFlowCompilerVariable;
                                    WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(num);
                                    WinterFlowTestingProcess winterFlowTestingProcess = new WinterFlowTestingProcess(2, account, num.intValue(), googleSignInAccount);
                                    WinterFlowBandwidthSystem winterFlowBandwidthSystem = (WinterFlowBandwidthSystem) winterFlowFrameworkLibrary.WinterFlowRouterRouter();
                                    obtain = Parcel.obtain();
                                    obtain.writeInterfaceToken(winterFlowBandwidthSystem.WinterFlowArrayNetwork);
                                    int i2 = WinterFlowListenerManager.WinterFlowRouterStructure;
                                    obtain.writeInt(1);
                                    int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(obtain, 20293);
                                    WinterFlowWorkerVersionControl.WinterFlowResolverController(obtain, 1, 4);
                                    obtain.writeInt(1);
                                    WinterFlowWorkerVersionControl.WinterFlowBatchUI(obtain, 2, winterFlowTestingProcess, 0);
                                    WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(obtain, WinterFlowConsumerUserManager);
                                    obtain.writeStrongBinder(this);
                                    obtain2 = Parcel.obtain();
                                    winterFlowBandwidthSystem.WinterFlowCacheManagerAgent.transact(12, obtain, obtain2, 0);
                                    obtain2.readException();
                                    obtain.recycle();
                                    obtain2.recycle();
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    winterFlowBandwidthSystem.WinterFlowCacheManagerAgent.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain.recycle();
                    obtain2.recycle();
                    return;
                } catch (Throwable th2) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th2;
                }
            } catch (RemoteException unused2) {
                return;
            }
            googleSignInAccount = null;
            Integer num2 = winterFlowFrameworkLibrary.WinterFlowCompilerVariable;
            WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(num2);
            WinterFlowTestingProcess winterFlowTestingProcess2 = new WinterFlowTestingProcess(2, account, num2.intValue(), googleSignInAccount);
            WinterFlowBandwidthSystem winterFlowBandwidthSystem2 = (WinterFlowBandwidthSystem) winterFlowFrameworkLibrary.WinterFlowRouterRouter();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(winterFlowBandwidthSystem2.WinterFlowArrayNetwork);
            int i22 = WinterFlowListenerManager.WinterFlowRouterStructure;
            obtain.writeInt(1);
            int WinterFlowConsumerUserManager2 = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(obtain, 20293);
            WinterFlowWorkerVersionControl.WinterFlowResolverController(obtain, 1, 4);
            obtain.writeInt(1);
            WinterFlowWorkerVersionControl.WinterFlowBatchUI(obtain, 2, winterFlowTestingProcess2, 0);
            WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(obtain, WinterFlowConsumerUserManager2);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException unused3) {
            this.WinterFlowVariableVersionControl.post(new WinterFlowProtocolThread(i, this, new WinterFlowRouterQueue(1, new ConnectionResult(8, null, null), null)));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmPlatform
    public final void WinterFlowRouterStructure(int i) {
        WinterFlowConfiguration winterFlowConfiguration = this.WinterFlowResponseEngine;
        WinterFlowCacheTransactionManager winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) winterFlowConfiguration.WinterFlowResponseEngine.WinterFlowResponseEngine.get(winterFlowConfiguration.WinterFlowTransactionManagerStrategy);
        if (winterFlowCacheTransactionManager != null) {
            if (winterFlowCacheTransactionManager.WinterFlowTransactionAgent) {
                winterFlowCacheTransactionManager.WinterFlowThreadListener(new ConnectionResult(17, null, null));
            } else {
                winterFlowCacheTransactionManager.WinterFlowRouterStructure(i);
            }
        }
    }
}
