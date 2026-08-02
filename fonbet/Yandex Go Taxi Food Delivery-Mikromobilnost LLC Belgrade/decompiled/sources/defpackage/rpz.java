package defpackage;

import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class rpz {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LootBoxContentTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
