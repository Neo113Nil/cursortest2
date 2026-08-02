package defpackage;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.ybsdk.feature.pfm.internal.data.local.PfmLocalFilter$Settings;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FeedFilterBottomSheetContent$SelectableList;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FeedFilterBottomSheetContent$ToggleList;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterContent$Icon;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterContent$IconAndTitle;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterContent$Title;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterInnerContent$DateFilter;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterInnerContent$FeedFilter;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$NodeContent$EmptyContent;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$NodeContent$ViewNodeContent;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmMoney$Currency$FiatCurrency;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmMoney$Currency$LoyaltyCurrency;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmNodeText$MultipleText;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmNodeText$SingleText;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmTextContent$Amount;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmTextContent$Plain;
import com.ybsdk.feature.pfm.internal.data.network.dto.a;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes8.dex */
public abstract class zbb0 {
    public static final PolymorphicJsonAdapterFactory a = PolymorphicJsonAdapterFactory.of(hcb0.class, "filter_type").withSubtype(PfmResponse$FilterInnerContent$FeedFilter.class, "CUSTOM").withSubtype(PfmResponse$FilterInnerContent$DateFilter.class, "DATE");
    public static final PolymorphicJsonAdapterFactory b = PolymorphicJsonAdapterFactory.of(fcb0.class, "content_type").withSubtype(PfmResponse$FeedFilterBottomSheetContent$SelectableList.class, "SELECTABLE").withSubtype(PfmResponse$FeedFilterBottomSheetContent$ToggleList.class, "TOGGLE");
    public static final PolymorphicJsonAdapterFactory c = PolymorphicJsonAdapterFactory.of(kcb0.class, "content_type").withSubtype(PfmResponse$PfmTextContent$Plain.class, "PLAIN").withSubtype(PfmResponse$PfmTextContent$Amount.class, "AMOUNT");
    public static final PolymorphicJsonAdapterFactory d = PolymorphicJsonAdapterFactory.of(jcb0.class, "content_type").withSubtype(PfmResponse$PfmNodeText$SingleText.class, "SINGLE").withSubtype(PfmResponse$PfmNodeText$MultipleText.class, "MULTIPLE");
    public static final PolymorphicJsonAdapterFactory e = PolymorphicJsonAdapterFactory.of(icb0.class, "node_type").withSubtype(PfmResponse$NodeContent$ViewNodeContent.class, "VIEW").withSubtype(PfmResponse$NodeContent$EmptyContent.class, JCSP.ROOT_STORE_NAME).withDefaultValue(new PfmResponse$NodeContent$EmptyContent(PfmResponse.NodeType.UNKNOWN));
    public static final PolymorphicJsonAdapterFactory f = PolymorphicJsonAdapterFactory.of(gcb0.class, "content_type").withSubtype(PfmResponse$FilterContent$Icon.class, "ICON").withSubtype(PfmResponse$FilterContent$Title.class, "TITLE").withSubtype(PfmResponse$FilterContent$IconAndTitle.class, "ICON_AND_TITLE");
    public static final PolymorphicJsonAdapterFactory g = PolymorphicJsonAdapterFactory.of(a.class, "currency_type").withSubtype(PfmResponse$PfmMoney$Currency$FiatCurrency.class, "FIAT").withSubtype(PfmResponse$PfmMoney$Currency$LoyaltyCurrency.class, Card.CARD_TYPE_LOYALTY);
    public static final PolymorphicJsonAdapterFactory h = PolymorphicJsonAdapterFactory.of(ybb0.class, "filter_type").withSubtype(PfmLocalFilter$Settings.class, "settings");
}
