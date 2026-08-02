package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.BucketAdapter;
import com.yandex.messaging.core.net.entities.DefaultIfNullAdapterFactory;
import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWallAdapter;
import com.yandex.messaging.core.net.entities.JsonMapAdapter;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.RequestMessageTypeAdapter;
import com.yandex.messaging.core.net.entities.SyncDataAdapter;
import com.yandex.messaging.core.net.entities.UserOrChatAdapter;
import com.yandex.messaging.core.net.entities.directives.DirectiveAdapter;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.UriJsonAdapter;
import com.yandex.messaging.internal.entities.Base64JsonAdapter;
import com.yandex.messaging.internal.entities.JsonObjectToStringAdapter;
import com.yandex.messaging.internal.entities.MessageDataAdapter;
import com.yandex.messaging.internal.parsing.JsonObjectAdapter;
import com.yandex.messaging.internal.search.GlobalSearchItemTypeAdapter;

/* loaded from: classes15.dex */
public abstract class u830 {
    public static Moshi a() {
        JsonAdapter.Factory factory;
        Moshi.Builder add = new Moshi.Builder().add((JsonAdapter.Factory) cex.a).add(new JsonMapAdapter()).add(new JsonObjectAdapter()).add(new JsonObjectToStringAdapter()).add((JsonAdapter.Factory) new DefaultIfNullAdapterFactory()).add(MessageDataAdapter.c).add((JsonAdapter.Factory) DirectiveAdapter.b).add((JsonAdapter.Factory) new q8b()).add(BucketAdapter.b).add(SyncDataAdapter.b).add(UserOrChatAdapter.c).add(UriJsonAdapter.FACTORY);
        LocalMessageRef.Companion.getClass();
        factory = LocalMessageRef.JSON_ADAPTER_FACTORY;
        return add.add(factory).add(Base64JsonAdapter.FACTORY).add(new RequestMessageTypeAdapter()).add(new GlobalSearchItemTypeAdapter()).add((JsonAdapter.Factory) MessengerSupportContext.b).add((JsonAdapter.Factory) GetChatInfoDataWithJoinWallAdapter.b).build();
    }
}
