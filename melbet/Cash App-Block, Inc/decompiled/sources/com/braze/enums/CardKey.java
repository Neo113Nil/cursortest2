package com.braze.enums;

import bo.app.l$$ExternalSyntheticLambda2;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Tags;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0087\u0081\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, d2 = {"Lcom/braze/enums/CardKey;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "ID", "VIEWED", "CREATED", "EXPIRES_AT", "EXTRAS", "OPEN_URI_IN_WEBVIEW", "TYPE", "DISMISSED", "REMOVED", "PINNED", "DISMISSIBLE", "IS_TEST", "READ", "CLICKED", "IMAGE_ONLY_IMAGE", "IMAGE_ONLY_ALT_IMAGE", "IMAGE_ONLY_URL", "IMAGE_ONLY_ASPECT_RATIO", "CAPTIONED_IMAGE_IMAGE", "CAPTIONED_IMAGE_ALT_IMAGE", "CAPTIONED_IMAGE_TITLE", "CAPTIONED_IMAGE_DESCRIPTION", "CAPTIONED_IMAGE_URL", "CAPTIONED_IMAGE_DOMAIN", "CAPTIONED_IMAGE_ASPECT_RATIO", "TEXT_ANNOUNCEMENT_TITLE", "TEXT_ANNOUNCEMENT_DESCRIPTION", "TEXT_ANNOUNCEMENT_URL", "TEXT_ANNOUNCEMENT_DOMAIN", "SHORT_NEWS_IMAGE", "SHORT_NEWS_ALT_IMAGE", "SHORT_NEWS_TITLE", "SHORT_NEWS_DESCRIPTION", "SHORT_NEWS_URL", "SHORT_NEWS_DOMAIN", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardKey[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, CardType> cardTypeMap;
    private final String key;
    public static final CardKey ID = new CardKey("ID", 0, "id");
    public static final CardKey VIEWED = new CardKey("VIEWED", 1, "v");
    public static final CardKey CREATED = new CardKey("CREATED", 2, "ca");
    public static final CardKey EXPIRES_AT = new CardKey("EXPIRES_AT", 3, "ea");
    public static final CardKey EXTRAS = new CardKey("EXTRAS", 4, "e");
    public static final CardKey OPEN_URI_IN_WEBVIEW = new CardKey("OPEN_URI_IN_WEBVIEW", 5, "uw");
    public static final CardKey TYPE = new CardKey("TYPE", 6, "tp");
    public static final CardKey DISMISSED = new CardKey("DISMISSED", 7, "d");
    public static final CardKey REMOVED = new CardKey("REMOVED", 8, "r");
    public static final CardKey PINNED = new CardKey("PINNED", 9, "p");
    public static final CardKey DISMISSIBLE = new CardKey("DISMISSIBLE", 10, "db");
    public static final CardKey IS_TEST = new CardKey("IS_TEST", 11, "t");
    public static final CardKey READ = new CardKey("READ", 12, "read");
    public static final CardKey CLICKED = new CardKey("CLICKED", 13, "cl");
    public static final CardKey IMAGE_ONLY_IMAGE = new CardKey("IMAGE_ONLY_IMAGE", 14, "i");
    public static final CardKey IMAGE_ONLY_ALT_IMAGE = new CardKey("IMAGE_ONLY_ALT_IMAGE", 15, "image_alt");
    public static final CardKey IMAGE_ONLY_URL = new CardKey("IMAGE_ONLY_URL", 16, "u");
    public static final CardKey IMAGE_ONLY_ASPECT_RATIO = new CardKey("IMAGE_ONLY_ASPECT_RATIO", 17, "ar");
    public static final CardKey CAPTIONED_IMAGE_IMAGE = new CardKey("CAPTIONED_IMAGE_IMAGE", 18, "i");
    public static final CardKey CAPTIONED_IMAGE_ALT_IMAGE = new CardKey("CAPTIONED_IMAGE_ALT_IMAGE", 19, "image_alt");
    public static final CardKey CAPTIONED_IMAGE_TITLE = new CardKey("CAPTIONED_IMAGE_TITLE", 20, "tt");
    public static final CardKey CAPTIONED_IMAGE_DESCRIPTION = new CardKey("CAPTIONED_IMAGE_DESCRIPTION", 21, "ds");
    public static final CardKey CAPTIONED_IMAGE_URL = new CardKey("CAPTIONED_IMAGE_URL", 22, "u");
    public static final CardKey CAPTIONED_IMAGE_DOMAIN = new CardKey("CAPTIONED_IMAGE_DOMAIN", 23, "dm");
    public static final CardKey CAPTIONED_IMAGE_ASPECT_RATIO = new CardKey("CAPTIONED_IMAGE_ASPECT_RATIO", 24, "ar");
    public static final CardKey TEXT_ANNOUNCEMENT_TITLE = new CardKey("TEXT_ANNOUNCEMENT_TITLE", 25, "tt");
    public static final CardKey TEXT_ANNOUNCEMENT_DESCRIPTION = new CardKey("TEXT_ANNOUNCEMENT_DESCRIPTION", 26, "ds");
    public static final CardKey TEXT_ANNOUNCEMENT_URL = new CardKey("TEXT_ANNOUNCEMENT_URL", 27, "u");
    public static final CardKey TEXT_ANNOUNCEMENT_DOMAIN = new CardKey("TEXT_ANNOUNCEMENT_DOMAIN", 28, "dm");
    public static final CardKey SHORT_NEWS_IMAGE = new CardKey("SHORT_NEWS_IMAGE", 29, "i");
    public static final CardKey SHORT_NEWS_ALT_IMAGE = new CardKey("SHORT_NEWS_ALT_IMAGE", 30, "image_alt");
    public static final CardKey SHORT_NEWS_TITLE = new CardKey("SHORT_NEWS_TITLE", 31, "tt");
    public static final CardKey SHORT_NEWS_DESCRIPTION = new CardKey("SHORT_NEWS_DESCRIPTION", 32, "ds");
    public static final CardKey SHORT_NEWS_URL = new CardKey("SHORT_NEWS_URL", 33, "u");
    public static final CardKey SHORT_NEWS_DOMAIN = new CardKey("SHORT_NEWS_DOMAIN", 34, "dm");

    private static final /* synthetic */ CardKey[] $values() {
        return new CardKey[]{ID, VIEWED, CREATED, EXPIRES_AT, EXTRAS, OPEN_URI_IN_WEBVIEW, TYPE, DISMISSED, REMOVED, PINNED, DISMISSIBLE, IS_TEST, READ, CLICKED, IMAGE_ONLY_IMAGE, IMAGE_ONLY_ALT_IMAGE, IMAGE_ONLY_URL, IMAGE_ONLY_ASPECT_RATIO, CAPTIONED_IMAGE_IMAGE, CAPTIONED_IMAGE_ALT_IMAGE, CAPTIONED_IMAGE_TITLE, CAPTIONED_IMAGE_DESCRIPTION, CAPTIONED_IMAGE_URL, CAPTIONED_IMAGE_DOMAIN, CAPTIONED_IMAGE_ASPECT_RATIO, TEXT_ANNOUNCEMENT_TITLE, TEXT_ANNOUNCEMENT_DESCRIPTION, TEXT_ANNOUNCEMENT_URL, TEXT_ANNOUNCEMENT_DOMAIN, SHORT_NEWS_IMAGE, SHORT_NEWS_ALT_IMAGE, SHORT_NEWS_TITLE, SHORT_NEWS_DESCRIPTION, SHORT_NEWS_URL, SHORT_NEWS_DOMAIN};
    }

    static {
        CardKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        cardTypeMap = MapsKt__MapsKt.mapOf(new Pair("banner_image", CardType.IMAGE), new Pair("captioned_image", CardType.CAPTIONED_IMAGE), new Pair("text_announcement", CardType.TEXT_ANNOUNCEMENT), new Pair("short_news", CardType.SHORT_NEWS), new Pair("control", CardType.CONTROL));
    }

    private CardKey(String str, int i, String str2) {
        this.key = str2;
    }

    public static CardKey valueOf(String str) {
        return (CardKey) Enum.valueOf(CardKey.class, str);
    }

    public static CardKey[] values() {
        return (CardKey[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/braze/enums/CardKey$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/enums/CardType;", "getCardTypeFromJson", "(Lorg/json/JSONObject;)Lcom/braze/enums/CardType;", "", "IMAGE_ONLY_KEY", "Ljava/lang/String;", "CAPTIONED_IMAGE_KEY", "SHORT_NEWS_KEY", "TEXT_ANNOUNCEMENT_KEY", "CONTROL_KEY", "", "cardTypeMap", "Ljava/util/Map;", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getCardTypeFromJson$lambda$0(JSONObject jSONObject) {
            return "Short News card doesn't contain image url, parsing type as Text Announcement. JSON: " + jSONObject;
        }

        public final CardType getCardTypeFromJson(JSONObject jsonObject) {
            String optionalString;
            jsonObject.getClass();
            String optionalString2 = JsonUtils.getOptionalString(jsonObject, CardKey.TYPE.getKey());
            if (optionalString2 != null && optionalString2.length() != 0 && optionalString2.equals("short_news") && ((optionalString = JsonUtils.getOptionalString(jsonObject, CardKey.SHORT_NEWS_IMAGE.getKey())) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jsonObject, 15), 6, (Object) null);
                optionalString2 = "text_announcement";
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        private Companion() {
        }
    }
}
