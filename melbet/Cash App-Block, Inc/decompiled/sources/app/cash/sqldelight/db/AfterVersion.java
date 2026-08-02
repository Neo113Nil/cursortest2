package app.cash.sqldelight.db;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class AfterVersion {
    public final long afterVersion;
    public final Function1 block;

    public AfterVersion(long j, Function1 function1) {
        this.afterVersion = j;
        this.block = function1;
    }
}
