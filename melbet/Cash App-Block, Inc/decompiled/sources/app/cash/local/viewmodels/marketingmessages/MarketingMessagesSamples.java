package app.cash.local.viewmodels.marketingmessages;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class MarketingMessagesSamples {
    public static final MarketingMessagesViewModel Empty;
    public static final MarketingMessagesViewModel Loading;
    public static final MarketingMessagesViewModel LongCopy;
    public static final MarketingMessagesViewModel Populated;
    public static final MarketingMessageData marketingMessageA;
    public static final MarketingMessageData marketingMessageWithOffer;

    static {
        BrandSpot brandSpot = new BrandSpot("brand-token", null);
        LocalColor localColor = new LocalColor("#041C7B", "#041C7B");
        LocalColor localColor2 = new LocalColor("#170998", "#170998");
        LocalColor localColor3 = new LocalColor("#1E754C", "#1E754C");
        LocalColor localColor4 = new LocalColor("#D9480F", "#D9480F");
        LocalImage localImage = new LocalImage("fake:///bufo-art.png", "fake:///bufo-art.png", (Long) 512L, (Long) 512L, localColor, 32);
        Instant ofEpochMilli = Instant.ofEpochMilli(1697286400000L);
        ofEpochMilli.getClass();
        MarketingMessageData marketingMessageData = new MarketingMessageData("sample-message-a", "Swing by for a cold brew and 10% off your first order.", localImage, "nightswimcoffee", ofEpochMilli, localColor, new LocalColor("#FFFFFF", "#FFFFFF"), brandSpot, new LocalImage("fake:///rangoon_bistro.png", "fake:///rangoon_bistro.png", (Long) 64L, (Long) 64L, localColor, 32), null, null);
        marketingMessageA = marketingMessageData;
        LocalImage localImage2 = new LocalImage("fake:///fake-profile.png", "fake:///fake-profile.png", (Long) 512L, (Long) 512L, localColor2, 32);
        Instant ofEpochMilli2 = Instant.ofEpochMilli(1697372800000L);
        ofEpochMilli2.getClass();
        MarketingMessageData m1253copyjf4iykI$default = MarketingMessageData.m1253copyjf4iykI$default(marketingMessageData, "Reserve a seat for Saturday's show and enjoy a complimentary flight.", localImage2, "solsticecafe", ofEpochMilli2, localColor2, null, null, 1729);
        LocalImage localImage3 = new LocalImage("fake:///bufo-art.png", "fake:///bufo-art.png", (Long) 512L, (Long) 512L, localColor3, 32);
        Instant ofEpochMilli3 = Instant.ofEpochMilli(1697459200000L);
        ofEpochMilli3.getClass();
        MarketingMessageData m1253copyjf4iykI$default2 = MarketingMessageData.m1253copyjf4iykI$default(marketingMessageData, "Local pastry chefs take over our counter this Sunday only.", localImage3, "thekiosk", ofEpochMilli3, localColor3, null, null, 1729);
        LocalImage localImage4 = new LocalImage("fake:///rangoon_bistro.png", "fake:///rangoon_bistro.png", (Long) 512L, (Long) 512L, localColor4, 32);
        Instant ofEpochMilli4 = Instant.ofEpochMilli(1697545600000L);
        ofEpochMilli4.getClass();
        List<MarketingMessageData> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MarketingMessageData[]{marketingMessageData, m1253copyjf4iykI$default, m1253copyjf4iykI$default2, MarketingMessageData.m1253copyjf4iykI$default(marketingMessageData, "Pre-order peonies and we'll have them ready for pickup.", localImage4, "flowerbar", ofEpochMilli4, localColor4, null, null, 1729)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        for (MarketingMessageData marketingMessageData2 : listOf) {
            arrayList.add(new MarketingMessagesViewModel.MessageTile(marketingMessageData2.image, Recorder$$ExternalSyntheticOutline2.m("$", marketingMessageData2.cashtag), marketingMessageData2.message, marketingMessageData2.logo, marketingMessageData2.backgroundColor, marketingMessageData2.foregroundColor, "2h", marketingMessageData2, null));
        }
        MarketingMessagesViewModel marketingMessagesViewModel = new MarketingMessagesViewModel(arrayList, 14);
        Populated = marketingMessagesViewModel;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            MarketingMessagesViewModel.MessageTile messageTile = (MarketingMessagesViewModel.MessageTile) next;
            if (i2 == 0) {
                messageTile = MarketingMessagesViewModel.MessageTile.copy$default(messageTile, null, 507);
            }
            arrayList2.add(messageTile);
            i2 = i3;
        }
        LongCopy = MarketingMessagesViewModel.copy$default(marketingMessagesViewModel, arrayList2, 14);
        EmptyList emptyList = EmptyList.INSTANCE;
        Empty = new MarketingMessagesViewModel(emptyList, 14);
        Loading = new MarketingMessagesViewModel(emptyList, 12);
        marketingMessageWithOffer = MarketingMessageData.m1253copyjf4iykI$default(marketingMessageA, null, null, null, null, null, new MarketingMessageOfferDetails(null, "10% off", "Valid today", "sample-offer", "SAVE10", null, null, null, null, emptyList, null, "10% off", null, null), null, 1535);
        MarketingMessagesViewModel marketingMessagesViewModel2 = Populated;
        List list = marketingMessagesViewModel2.messages;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            MarketingMessagesViewModel.MessageTile messageTile2 = (MarketingMessagesViewModel.MessageTile) obj;
            if (i == 0) {
                messageTile2 = MarketingMessagesViewModel.MessageTile.copy$default(messageTile2, marketingMessageWithOffer, 383);
            }
            arrayList3.add(messageTile2);
            i = i4;
        }
        MarketingMessagesViewModel copy$default = MarketingMessagesViewModel.copy$default(marketingMessagesViewModel2, arrayList3, 6);
        MessageFilter messageFilter = MessageFilter.ALL;
        List list2 = copy$default.messages;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (((MarketingMessagesViewModel.MessageTile) obj2).marketingMessage.offerDetails != null) {
                arrayList4.add(obj2);
            }
        }
        MarketingMessagesViewModel.copy$default(copy$default, arrayList4, 10);
        EmptyList emptyList2 = EmptyList.INSTANCE;
        MessageFilter messageFilter2 = MessageFilter.ALL;
        emptyList2.getClass();
    }
}
