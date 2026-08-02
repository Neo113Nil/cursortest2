package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.app.v1.MarketingMessageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes.dex */
public abstract class MarketingMessageBadging {
    public static final ArrayList GROUP_NAMES;

    static {
        List list = MarketingMessageData.SUPPORTED_TYPES;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarketingMessageType) it.next()).name());
        }
        GROUP_NAMES = arrayList;
    }
}
