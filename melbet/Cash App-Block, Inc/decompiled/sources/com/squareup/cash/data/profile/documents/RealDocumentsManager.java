package com.squareup.cash.data.profile.documents;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.protos.franklin.common.Platform;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt__StringsKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RealDocumentsManager {
    public final InstrumentQueries categoryQueries;
    public final AppVersion currentVersion;
    public final InstrumentQueries documentQueries;
    public final CoroutineContext ioDispatcher;

    public RealDocumentsManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, String str, CoroutineContext coroutineContext) {
        List split$default;
        this.ioDispatcher = coroutineContext;
        this.documentQueries = cashAccountDatabaseImpl.documentQueries;
        this.categoryQueries = cashAccountDatabaseImpl.documentCategoryQueries;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        this.currentVersion = new AppVersion(Platform.ANDROID, Integer.valueOf(Integer.parseInt((String) split$default.get(0))), Integer.valueOf(Integer.parseInt((String) split$default.get(1))), Integer.valueOf(Integer.parseInt((String) split$default.get(2))), ByteString.EMPTY);
    }
}
