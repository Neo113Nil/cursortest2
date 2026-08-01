package com.google.android.datatransport;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowTransactionAdapter implements WinterFlowViewModule {
    public final SQLiteProgram WinterFlowVariableVersionControl;

    public WinterFlowTransactionAdapter(SQLiteProgram sQLiteProgram) {
        this.WinterFlowVariableVersionControl = sQLiteProgram;
    }

    @Override // com.google.android.datatransport.WinterFlowViewModule
    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowVariableVersionControl.clearBindings();
    }

    @Override // com.google.android.datatransport.WinterFlowViewModule
    public final void WinterFlowMapperProtocol(int i, byte[] bArr) {
        this.WinterFlowVariableVersionControl.bindBlob(i, bArr);
    }

    @Override // com.google.android.datatransport.WinterFlowViewModule
    public final void WinterFlowResolverController(String str, int i) {
        str.getClass();
        this.WinterFlowVariableVersionControl.bindString(i, str);
    }

    @Override // com.google.android.datatransport.WinterFlowViewModule
    public final void WinterFlowResponseEngine(int i) {
        this.WinterFlowVariableVersionControl.bindNull(i);
    }

    @Override // com.google.android.datatransport.WinterFlowViewModule
    public final void WinterFlowRouterStructure(int i, long j) {
        this.WinterFlowVariableVersionControl.bindLong(i, j);
    }

    @Override // com.google.android.datatransport.WinterFlowViewModule
    public final void WinterFlowUnitTestResponse(double d, int i) {
        this.WinterFlowVariableVersionControl.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.WinterFlowVariableVersionControl.close();
    }
}
