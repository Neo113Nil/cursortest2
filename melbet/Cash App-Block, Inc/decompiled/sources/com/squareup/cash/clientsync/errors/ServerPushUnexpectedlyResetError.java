package com.squareup.cash.clientsync.errors;

import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ServerPushUnexpectedlyResetError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServerPushUnexpectedlyResetError extends ClientSyncReportedError {
    public final StreamResetException cause;
    public final String groupingDescriptor;
    public final String message;
    public final Map metadata;

    public ServerPushUnexpectedlyResetError(StreamResetException streamResetException, ErrorCode errorCode, Lifecycle.State state, Map map, Reward$Adapter reward$Adapter) {
        errorCode.getClass();
        state.getClass();
        map.getClass();
        this.message = "CLIENTSYNC SyncEntity streaming suspended unexpectedly.";
        this.cause = streamResetException;
        this.groupingDescriptor = "ServerPushUnexpectedlyResetError:" + errorCode;
        Pair pair = new Pair("code", Boxes$$ExternalSyntheticOutline1.m(errorCode.httpCode, errorCode.name(), ":"));
        Pair pair2 = new Pair("currentLifecycleState", state.name());
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = StringsKt.isBlank((CharSequence) entry.getValue()) ? "null" : "redacted non-null value";
            arrayList.add(entry.getKey() + "=" + str);
        }
        this.metadata = MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(pair, pair2, new Pair("requestMetadata", CollectionsKt.joinToString$default(arrayList, "; ", null, null, 0, null, null, 62))), MapsKt__MapsKt.mapOf(new Pair("startup", (Long) reward$Adapter.avatarsAdapter), new Pair("workerLoopStart", (Long) reward$Adapter.reward_selection_stateAdapter), new Pair("lifecycleStateStart", (Long) reward$Adapter.boost_detail_bottom_upsellAdapter), new Pair("handshakeStart", (Long) reward$Adapter.app_linksAdapter), new Pair("handshakeFinish", (Long) reward$Adapter.program_detail_rowsAdapter), new Pair("lastNudge", (Long) reward$Adapter.boost_detail_rowsAdapter), new Pair(BreadcrumbHelper.Category.ERROR, (Long) reward$Adapter.boost_attributesAdapter)))));
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
