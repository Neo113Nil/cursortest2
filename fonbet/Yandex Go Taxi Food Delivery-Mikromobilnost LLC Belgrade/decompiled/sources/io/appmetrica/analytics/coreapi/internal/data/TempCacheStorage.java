package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collection;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u0018J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage;", "", "", "scope", "", ClidProvider.TIMESTAMP, "", Constants.KEY_DATA, "Lzy11;", "put", "(Ljava/lang/String;J[B)V", "Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "get", "(Ljava/lang/String;)Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "", "limit", "", "(Ljava/lang/String;I)Ljava/util/Collection;", "id", "remove", "(J)V", "interval", "removeOlderThan", "(Ljava/lang/String;J)V", "Entry", "core-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface TempCacheStorage {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "", Constants.KEY_DATA, "", "getData", "()[B", "id", "", "getId", "()J", "scope", "", "getScope", "()Ljava/lang/String;", ClidProvider.TIMESTAMP, "getTimestamp", "core-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Entry {
        byte[] getData();

        long getId();

        String getScope();

        long getTimestamp();
    }

    Entry get(String scope);

    Collection<Entry> get(String scope, int limit);

    void put(String scope, long timestamp, byte[] data);

    void remove(long id);

    void removeOlderThan(String scope, long interval);
}
