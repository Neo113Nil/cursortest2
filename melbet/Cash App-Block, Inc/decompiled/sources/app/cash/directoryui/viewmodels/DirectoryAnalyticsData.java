package app.cash.directoryui.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DirectoryAnalyticsData {
    public final EntityType entityType;
    public final EventType eventType;
    public final ItemAnalyticsData item;
    public final String remoteSuggestionType;
    public final SectionAnalyticsData section;
    public final String suggestionStrategy;
    public final TapSurface tapSurface;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EntityType {
        public static final /* synthetic */ EntityType[] $VALUES;
        public static final EntityType APP_FEATURE;
        public static final EntityType AP_STORE;
        public static final EntityType BOOST_MERCHANT;
        public static final EntityType CAP;
        public static final EntityType CASH_AFTERPAY;
        public static final EntityType CUSTOMER;
        public static final EntityType LOCAL_BRAND;
        public static final EntityType OFFER;
        public static final EntityType PRODUCT;
        public static final EntityType REGULAR_MERCHANT;
        public static final EntityType SQ_MERCHANT;
        public static final EntityType STOCK;

        static {
            EntityType entityType = new EntityType("CUSTOMER", 0);
            CUSTOMER = entityType;
            EntityType entityType2 = new EntityType("REGULAR_MERCHANT", 1);
            REGULAR_MERCHANT = entityType2;
            EntityType entityType3 = new EntityType("AP_STORE", 2);
            AP_STORE = entityType3;
            EntityType entityType4 = new EntityType("CASH_AFTERPAY", 3);
            CASH_AFTERPAY = entityType4;
            EntityType entityType5 = new EntityType("BOOST_MERCHANT", 4);
            BOOST_MERCHANT = entityType5;
            EntityType entityType6 = new EntityType("PRODUCT", 5);
            PRODUCT = entityType6;
            EntityType entityType7 = new EntityType("SQ_MERCHANT", 6);
            SQ_MERCHANT = entityType7;
            EntityType entityType8 = new EntityType("APP_FEATURE", 7);
            APP_FEATURE = entityType8;
            EntityType entityType9 = new EntityType("STOCK", 8);
            STOCK = entityType9;
            EntityType entityType10 = new EntityType("OFFER", 9);
            OFFER = entityType10;
            EntityType entityType11 = new EntityType("CAP", 10);
            CAP = entityType11;
            EntityType entityType12 = new EntityType("LOCAL_BRAND", 11);
            LOCAL_BRAND = entityType12;
            $VALUES = new EntityType[]{entityType, entityType2, entityType3, entityType4, entityType5, entityType6, entityType7, entityType8, entityType9, entityType10, entityType11, entityType12};
        }

        public static EntityType valueOf(String str) {
            return (EntityType) Enum.valueOf(EntityType.class, str);
        }

        public static EntityType[] values() {
            return (EntityType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EventType {
        public static final /* synthetic */ EventType[] $VALUES;
        public static final EventType TAP_PROFILE_DIRECTORY_ITEM;
        public static final EventType VIEW_PROFILE_DIRECTORY_ITEM;

        /* JADX INFO: Fake field, exist only in values array */
        EventType EF0;

        static {
            EventType eventType = new EventType("VIEW_PROFILE_DIRECTORY_SECTION", 0);
            EventType eventType2 = new EventType("VIEW_PROFILE_DIRECTORY_ITEM", 1);
            VIEW_PROFILE_DIRECTORY_ITEM = eventType2;
            EventType eventType3 = new EventType("TAP_PROFILE_DIRECTORY_ITEM", 2);
            TAP_PROFILE_DIRECTORY_ITEM = eventType3;
            $VALUES = new EventType[]{eventType, eventType2, eventType3, new EventType("DISMISS_PROFILE_DIRECTORY_ITEM", 3)};
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public final class SectionAnalyticsData {
        public final SectionContext context;
        public final String id;
        public final Integer index;
        public final String serverId;
        public final String titleText;

        public SectionAnalyticsData(String str, String str2, String str3, Integer num, int i) {
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            str3 = (i & 8) != 0 ? null : str3;
            num = (i & 128) != 0 ? null : num;
            SectionContext sectionContext = SectionContext.BROWSE;
            this.id = str;
            this.serverId = str2;
            this.titleText = str3;
            this.index = num;
            this.context = sectionContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionAnalyticsData)) {
                return false;
            }
            SectionAnalyticsData sectionAnalyticsData = (SectionAnalyticsData) obj;
            return Intrinsics.areEqual(this.id, sectionAnalyticsData.id) && Intrinsics.areEqual(this.serverId, sectionAnalyticsData.serverId) && Intrinsics.areEqual(this.titleText, sectionAnalyticsData.titleText) && Intrinsics.areEqual(this.index, sectionAnalyticsData.index) && this.context == sectionAnalyticsData.context;
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.serverId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
            String str3 = this.titleText;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 923521;
            Integer num = this.index;
            return this.context.hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 28629151);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionAnalyticsData(id=", this.id, ", serverId=", this.serverId, ", header=null, titleText=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.titleText, ", title=null, subtitle=null, actionButton=null, index=", this.index, ", numberOfSections=null, numberOfItems=null, type=null, layout=null, context=");
            m.append(this.context);
            m.append(")");
            return m.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SectionContext {
        public static final /* synthetic */ SectionContext[] $VALUES;
        public static final SectionContext BROWSE;

        /* JADX INFO: Fake field, exist only in values array */
        SectionContext EF0;

        static {
            SectionContext sectionContext = new SectionContext("SEARCH", 0);
            SectionContext sectionContext2 = new SectionContext("BROWSE", 1);
            BROWSE = sectionContext2;
            $VALUES = new SectionContext[]{sectionContext, sectionContext2, new SectionContext("DISCOVER_BNPL_CAROUSEL", 2)};
        }

        public static SectionContext valueOf(String str) {
            return (SectionContext) Enum.valueOf(SectionContext.class, str);
        }

        public static SectionContext[] values() {
            return (SectionContext[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TapSurface {
        public static final /* synthetic */ TapSurface[] $VALUES;
        public static final TapSurface ACTION_BUTTON;
        public static final TapSurface ITEM;

        static {
            TapSurface tapSurface = new TapSurface("ITEM", 0);
            ITEM = tapSurface;
            TapSurface tapSurface2 = new TapSurface("ACTION_BUTTON", 1);
            ACTION_BUTTON = tapSurface2;
            $VALUES = new TapSurface[]{tapSurface, tapSurface2, new TapSurface("SECTION_HEADER", 2)};
        }

        public static TapSurface valueOf(String str) {
            return (TapSurface) Enum.valueOf(TapSurface.class, str);
        }

        public static TapSurface[] values() {
            return (TapSurface[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DirectoryAnalyticsData(SectionAnalyticsData sectionAnalyticsData, ItemAnalyticsData itemAnalyticsData, String str, String str2, EntityType entityType, int i) {
        this(sectionAnalyticsData, itemAnalyticsData, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, null, (i & 32) != 0 ? null : entityType, EventType.VIEW_PROFILE_DIRECTORY_ITEM);
    }

    public static DirectoryAnalyticsData copy$default(DirectoryAnalyticsData directoryAnalyticsData, ItemAnalyticsData itemAnalyticsData, TapSurface tapSurface, EventType eventType, int i) {
        SectionAnalyticsData sectionAnalyticsData = directoryAnalyticsData.section;
        if ((i & 2) != 0) {
            itemAnalyticsData = directoryAnalyticsData.item;
        }
        ItemAnalyticsData itemAnalyticsData2 = itemAnalyticsData;
        String str = directoryAnalyticsData.remoteSuggestionType;
        String str2 = directoryAnalyticsData.suggestionStrategy;
        if ((i & 16) != 0) {
            tapSurface = directoryAnalyticsData.tapSurface;
        }
        TapSurface tapSurface2 = tapSurface;
        EntityType entityType = directoryAnalyticsData.entityType;
        if ((i & 64) != 0) {
            eventType = directoryAnalyticsData.eventType;
        }
        EventType eventType2 = eventType;
        directoryAnalyticsData.getClass();
        directoryAnalyticsData.getClass();
        directoryAnalyticsData.getClass();
        sectionAnalyticsData.getClass();
        itemAnalyticsData2.getClass();
        eventType2.getClass();
        return new DirectoryAnalyticsData(sectionAnalyticsData, itemAnalyticsData2, str, str2, tapSurface2, entityType, eventType2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectoryAnalyticsData)) {
            return false;
        }
        DirectoryAnalyticsData directoryAnalyticsData = (DirectoryAnalyticsData) obj;
        return Intrinsics.areEqual(this.section, directoryAnalyticsData.section) && Intrinsics.areEqual(this.item, directoryAnalyticsData.item) && Intrinsics.areEqual(this.remoteSuggestionType, directoryAnalyticsData.remoteSuggestionType) && Intrinsics.areEqual(this.suggestionStrategy, directoryAnalyticsData.suggestionStrategy) && this.tapSurface == directoryAnalyticsData.tapSurface && this.entityType == directoryAnalyticsData.entityType && this.eventType == directoryAnalyticsData.eventType;
    }

    public final int hashCode() {
        int hashCode = (this.item.hashCode() + (this.section.hashCode() * 31)) * 31;
        String str = this.remoteSuggestionType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suggestionStrategy;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TapSurface tapSurface = this.tapSurface;
        int hashCode4 = (hashCode3 + (tapSurface == null ? 0 : tapSurface.hashCode())) * 31;
        EntityType entityType = this.entityType;
        return (this.eventType.hashCode() + ((hashCode4 + (entityType != null ? entityType.hashCode() : 0)) * 31)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryAnalyticsData(section=");
        sb.append(this.section);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", remoteSuggestionType=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.remoteSuggestionType, ", suggestionStrategy=", this.suggestionStrategy, ", tapSurface=");
        sb.append(this.tapSurface);
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", offerType=null, offerId=null)");
        return sb.toString();
    }

    public DirectoryAnalyticsData(SectionAnalyticsData sectionAnalyticsData, ItemAnalyticsData itemAnalyticsData, String str, String str2, TapSurface tapSurface, EntityType entityType, EventType eventType) {
        this.section = sectionAnalyticsData;
        this.item = itemAnalyticsData;
        this.remoteSuggestionType = str;
        this.suggestionStrategy = str2;
        this.tapSurface = tapSurface;
        this.entityType = entityType;
        this.eventType = eventType;
    }

    public final class ItemAnalyticsData {
        public final Integer absoluteIndex;
        public final String appFeatureName;
        public final String appFeatureRoute;
        public final com.squareup.cash.cdf.browser.EntityType browserEntityType;
        public final String businessName;
        public final String businessToken;
        public final String entityAttributes;
        public final String entityName;
        public final String entityToken;
        public final String entityType;
        public final Integer indexCol;
        public final Integer indexRow;
        public final String merchantTags;
        public final Integer numberOfItems;
        public final String queryToken;

        public /* synthetic */ ItemAnalyticsData(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5, String str6, String str7, com.squareup.cash.cdf.browser.EntityType entityType, String str8, String str9, String str10, int i) {
            this((i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : num4, (i & 16384) != 0 ? null : str4, (65536 & i) != 0 ? null : str5, (131072 & i) != 0 ? null : str6, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : entityType, (1048576 & i) != 0 ? null : str8, (2097152 & i) != 0 ? null : str9, (i & 4194304) != 0 ? null : str10);
        }

        public static ItemAnalyticsData copy$default(ItemAnalyticsData itemAnalyticsData, Integer num) {
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            String str = itemAnalyticsData.entityToken;
            String str2 = itemAnalyticsData.entityType;
            String str3 = itemAnalyticsData.entityAttributes;
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            Integer num2 = itemAnalyticsData.indexRow;
            Integer num3 = itemAnalyticsData.indexCol;
            Integer num4 = itemAnalyticsData.numberOfItems;
            itemAnalyticsData.getClass();
            String str4 = itemAnalyticsData.queryToken;
            itemAnalyticsData.getClass();
            String str5 = itemAnalyticsData.entityName;
            String str6 = itemAnalyticsData.businessToken;
            String str7 = itemAnalyticsData.businessName;
            com.squareup.cash.cdf.browser.EntityType entityType = itemAnalyticsData.browserEntityType;
            String str8 = itemAnalyticsData.appFeatureName;
            String str9 = itemAnalyticsData.appFeatureRoute;
            String str10 = itemAnalyticsData.merchantTags;
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            itemAnalyticsData.getClass();
            return new ItemAnalyticsData(str, str2, str3, num, num2, num3, num4, str4, str5, str6, str7, entityType, str8, str9, str10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemAnalyticsData)) {
                return false;
            }
            ItemAnalyticsData itemAnalyticsData = (ItemAnalyticsData) obj;
            return Intrinsics.areEqual(this.entityToken, itemAnalyticsData.entityToken) && Intrinsics.areEqual(this.entityType, itemAnalyticsData.entityType) && Intrinsics.areEqual(this.entityAttributes, itemAnalyticsData.entityAttributes) && Intrinsics.areEqual(this.absoluteIndex, itemAnalyticsData.absoluteIndex) && Intrinsics.areEqual(this.indexRow, itemAnalyticsData.indexRow) && Intrinsics.areEqual(this.indexCol, itemAnalyticsData.indexCol) && Intrinsics.areEqual(this.numberOfItems, itemAnalyticsData.numberOfItems) && Intrinsics.areEqual(this.queryToken, itemAnalyticsData.queryToken) && Intrinsics.areEqual(this.entityName, itemAnalyticsData.entityName) && Intrinsics.areEqual(this.businessToken, itemAnalyticsData.businessToken) && Intrinsics.areEqual(this.businessName, itemAnalyticsData.businessName) && this.browserEntityType == itemAnalyticsData.browserEntityType && Intrinsics.areEqual(this.appFeatureName, itemAnalyticsData.appFeatureName) && Intrinsics.areEqual(this.appFeatureRoute, itemAnalyticsData.appFeatureRoute) && Intrinsics.areEqual(this.merchantTags, itemAnalyticsData.merchantTags);
        }

        public final int hashCode() {
            String str = this.entityToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.entityType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.entityAttributes;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.absoluteIndex;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 923521;
            Integer num2 = this.indexRow;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.indexCol;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.numberOfItems;
            int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 961;
            String str4 = this.queryToken;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 961;
            String str5 = this.entityName;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.businessToken;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.businessName;
            int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            com.squareup.cash.cdf.browser.EntityType entityType = this.browserEntityType;
            int hashCode12 = (hashCode11 + (entityType == null ? 0 : entityType.hashCode())) * 31;
            String str8 = this.appFeatureName;
            int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.appFeatureRoute;
            int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.merchantTags;
            return (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 1742810335;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ItemAnalyticsData(id=null, titleText=null, subtitleText=null, entityToken=", this.entityToken, ", entityType=", this.entityType, ", entityAttributes=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.entityAttributes, ", absoluteIndex=", this.absoluteIndex, ", matchedAliasLength=null, matchedFields=null, index=null, indexRow=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.indexRow, ", indexCol=", this.indexCol, ", numberOfItems=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.numberOfItems, ", contactStatus=null, queryToken=", this.queryToken, ", actionUrl=null, entityName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.entityName, ", businessToken=", this.businessToken, ", businessName=");
            m.append(this.businessName);
            m.append(", browserEntityType=");
            m.append(this.browserEntityType);
            m.append(", appFeatureName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.appFeatureName, ", appFeatureRoute=", this.appFeatureRoute, ", merchantTags=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.merchantTags, ", stockTicker=null, pathwayRank=null, isC4bBusiness=null, isMultipleAccountHolder=null, isFirstLinkedAccount=null, accountHolderToken=null, isLinkedAccount=null)");
        }

        public ItemAnalyticsData(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5, String str6, String str7, com.squareup.cash.cdf.browser.EntityType entityType, String str8, String str9, String str10) {
            this.entityToken = str;
            this.entityType = str2;
            this.entityAttributes = str3;
            this.absoluteIndex = num;
            this.indexRow = num2;
            this.indexCol = num3;
            this.numberOfItems = num4;
            this.queryToken = str4;
            this.entityName = str5;
            this.businessToken = str6;
            this.businessName = str7;
            this.browserEntityType = entityType;
            this.appFeatureName = str8;
            this.appFeatureRoute = str9;
            this.merchantTags = str10;
        }
    }
}
