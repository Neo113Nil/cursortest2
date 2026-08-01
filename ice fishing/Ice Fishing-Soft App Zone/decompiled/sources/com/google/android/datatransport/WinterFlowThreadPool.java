package com.google.android.datatransport;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPool extends WinterFlowServiceProviderLoader {
    public final SparseIntArray WinterFlowArrayNetwork;
    public int WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public int WinterFlowTransactionAgent;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final Parcel WinterFlowVariableVersionControl;

    public WinterFlowThreadPool(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new WinterFlowUnitTestSystem(0), new WinterFlowUnitTestSystem(0), new WinterFlowUnitTestSystem(0));
    }

    @Override // com.google.android.datatransport.WinterFlowServiceProviderLoader
    public final void WinterFlowRouterRouter(int i) {
        int i2 = this.WinterFlowSyntax;
        SparseIntArray sparseIntArray = this.WinterFlowArrayNetwork;
        Parcel parcel = this.WinterFlowVariableVersionControl;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.WinterFlowSyntax = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // com.google.android.datatransport.WinterFlowServiceProviderLoader
    public final WinterFlowThreadPool WinterFlowRouterStructure() {
        Parcel parcel = this.WinterFlowVariableVersionControl;
        int dataPosition = parcel.dataPosition();
        int i = this.WinterFlowResponseEngine;
        if (i == this.WinterFlowTransactionManagerStrategy) {
            i = this.WinterFlowUnitTestResponse;
        }
        return new WinterFlowThreadPool(parcel, dataPosition, i, this.WinterFlowRouterRouter + "  ", this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
    }

    @Override // com.google.android.datatransport.WinterFlowServiceProviderLoader
    public final boolean WinterFlowVariableVersionControl(int i) {
        while (true) {
            int i2 = this.WinterFlowResponseEngine;
            int i3 = this.WinterFlowTransactionAgent;
            if (i2 >= this.WinterFlowUnitTestResponse) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.WinterFlowResponseEngine;
            Parcel parcel = this.WinterFlowVariableVersionControl;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.WinterFlowTransactionAgent = parcel.readInt();
            this.WinterFlowResponseEngine += readInt;
        }
    }

    public WinterFlowThreadPool(Parcel parcel, int i, int i2, String str, WinterFlowUnitTestSystem winterFlowUnitTestSystem, WinterFlowUnitTestSystem winterFlowUnitTestSystem2, WinterFlowUnitTestSystem winterFlowUnitTestSystem3) {
        super(winterFlowUnitTestSystem, winterFlowUnitTestSystem2, winterFlowUnitTestSystem3);
        this.WinterFlowArrayNetwork = new SparseIntArray();
        this.WinterFlowSyntax = -1;
        this.WinterFlowTransactionAgent = -1;
        this.WinterFlowVariableVersionControl = parcel;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = i2;
        this.WinterFlowResponseEngine = i;
        this.WinterFlowRouterRouter = str;
    }
}
