package com.google.android.datatransport;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerProcess extends WinterFlowAdapterAPI {
    public final boolean WinterFlowBandwidthObject;
    public boolean WinterFlowConcurrencyThread;
    public final int WinterFlowOrchestrationSubsystem;
    public Scope[] WinterFlowResponseEngine;
    public String WinterFlowRouterRouter;
    public Account WinterFlowServerProtocol;
    public WinterFlowDebugDatabaseSchema[] WinterFlowServiceUtility;
    public final String WinterFlowSingletonPlatform;
    public IBinder WinterFlowSyntax;
    public WinterFlowDebugDatabaseSchema[] WinterFlowThreadListener;
    public Bundle WinterFlowTransactionAgent;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;
    public static final Parcelable.Creator<WinterFlowManagerProcess> CREATOR = new WinterFlowStackFramework(27);
    public static final Scope[] WinterFlowVariableBandwidth = new Scope[0];
    public static final WinterFlowDebugDatabaseSchema[] WinterFlowBatchUI = new WinterFlowDebugDatabaseSchema[0];

    public WinterFlowManagerProcess(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr, WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? WinterFlowVariableBandwidth : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr3 = WinterFlowBatchUI;
        winterFlowDebugDatabaseSchemaArr = winterFlowDebugDatabaseSchemaArr == null ? winterFlowDebugDatabaseSchemaArr3 : winterFlowDebugDatabaseSchemaArr;
        winterFlowDebugDatabaseSchemaArr2 = winterFlowDebugDatabaseSchemaArr2 == null ? winterFlowDebugDatabaseSchemaArr3 : winterFlowDebugDatabaseSchemaArr2;
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i3;
        if ("com.google.android.gms".equals(str)) {
            this.WinterFlowRouterRouter = "com.google.android.gms";
        } else {
            this.WinterFlowRouterRouter = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = WinterFlowJavaFrontend.WinterFlowArrayNetwork;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface winterFlowBandwidthComponent = queryLocalInterface instanceof WinterFlowBandwidthRefactoring ? (WinterFlowBandwidthRefactoring) queryLocalInterface : new WinterFlowBandwidthComponent(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    account2 = ((WinterFlowBandwidthComponent) winterFlowBandwidthComponent).WinterFlowRouterStructure();
                } catch (RemoteException unused) {
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
            this.WinterFlowServerProtocol = account2;
        } else {
            this.WinterFlowSyntax = iBinder;
            this.WinterFlowServerProtocol = account;
        }
        this.WinterFlowResponseEngine = scopeArr;
        this.WinterFlowTransactionAgent = bundle;
        this.WinterFlowThreadListener = winterFlowDebugDatabaseSchemaArr;
        this.WinterFlowServiceUtility = winterFlowDebugDatabaseSchemaArr2;
        this.WinterFlowBandwidthObject = z;
        this.WinterFlowOrchestrationSubsystem = i4;
        this.WinterFlowConcurrencyThread = z2;
        this.WinterFlowSingletonPlatform = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WinterFlowStackFramework.WinterFlowRouterStructure(this, parcel, i);
    }
}
