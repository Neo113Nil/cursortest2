package com.google.android.datatransport;

import java.io.Closeable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowSyntaxDebug extends Closeable {
    WinterFlowSchedulerSyntax WinterFlowEventEmitterController();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
