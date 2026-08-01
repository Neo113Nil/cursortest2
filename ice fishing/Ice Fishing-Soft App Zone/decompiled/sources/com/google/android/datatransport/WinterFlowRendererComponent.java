package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererComponent implements Iterator, WinterFlowLoaderProcess {
    public final /* synthetic */ int WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public int WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinterFlowRendererComponent(WinterFlowUnitTestSystem winterFlowUnitTestSystem, int i) {
        this(winterFlowUnitTestSystem.WinterFlowUnitTestResponse);
        this.WinterFlowRouterRouter = i;
        switch (i) {
            case 1:
                this.WinterFlowSyntax = winterFlowUnitTestSystem;
                this(winterFlowUnitTestSystem.WinterFlowUnitTestResponse);
                break;
            default:
                this.WinterFlowSyntax = winterFlowUnitTestSystem;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowTransactionManagerStrategy < this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object WinterFlowVariableVersionControl;
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowVariableVersionControl = ((WinterFlowUnitTestSystem) obj).WinterFlowVariableVersionControl(i);
                break;
            case 1:
                WinterFlowVariableVersionControl = ((WinterFlowUnitTestSystem) obj).WinterFlowRouterRouter(i);
                break;
            default:
                WinterFlowVariableVersionControl = ((WinterFlowRepositoryDatabase) obj).WinterFlowTransactionManagerStrategy[i];
                break;
        }
        this.WinterFlowTransactionManagerStrategy++;
        this.WinterFlowUnitTestResponse = true;
        return WinterFlowVariableVersionControl;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Call next() before removing an element.");
            return;
        }
        int i = this.WinterFlowTransactionManagerStrategy - 1;
        this.WinterFlowTransactionManagerStrategy = i;
        int i2 = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowUnitTestSystem) obj).WinterFlowTransactionManagerStrategy(i);
                break;
            case 1:
                ((WinterFlowUnitTestSystem) obj).WinterFlowTransactionManagerStrategy(i);
                break;
            default:
                ((WinterFlowRepositoryDatabase) obj).WinterFlowRouterStructure(i);
                break;
        }
        this.WinterFlowVariableVersionControl--;
        this.WinterFlowUnitTestResponse = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinterFlowRendererComponent(WinterFlowRepositoryDatabase winterFlowRepositoryDatabase) {
        this(winterFlowRepositoryDatabase.WinterFlowUnitTestResponse);
        this.WinterFlowRouterRouter = 2;
        this.WinterFlowSyntax = winterFlowRepositoryDatabase;
    }

    public WinterFlowRendererComponent(int i) {
        this.WinterFlowVariableVersionControl = i;
    }
}
