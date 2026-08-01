package com.google.android.datatransport;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionProtocol extends WinterFlowTransactionAdapter implements WinterFlowViewModule {
    public final SQLiteStatement WinterFlowTransactionManagerStrategy;

    public WinterFlowTransactionProtocol(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.WinterFlowTransactionManagerStrategy = sQLiteStatement;
    }
}
