package com.braze.models.cards;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a9;
import bo.app.e9;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/braze/models/cards/TextAnnouncementCard;", "Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a9;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lbo/app/e9;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;Lcom/braze/storage/ICardStorageProvider;Lbo/app/e9;)V", "", "toString", "()Ljava/lang/String;", "description", "Ljava/lang/String;", "getDescription", "title", "getTitle", "url", "getUrl", "domain", "getDomain", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextAnnouncementCard extends Card {
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String title;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnouncementCard(JSONObject jSONObject, a9 a9Var, ICardStorageProvider<?> iCardStorageProvider, e9 e9Var) {
        super(jSONObject, a9Var, iCardStorageProvider, e9Var);
        jSONObject.getClass();
        String string2 = jSONObject.getString(CardKey.TEXT_ANNOUNCEMENT_DESCRIPTION.getKey());
        string2.getClass();
        this.description = string2;
        this.title = JsonUtils.getOptionalString(jSONObject, CardKey.TEXT_ANNOUNCEMENT_TITLE.getKey());
        this.url = JsonUtils.getOptionalString(jSONObject, CardKey.TEXT_ANNOUNCEMENT_URL.getKey());
        this.domain = JsonUtils.getOptionalString(jSONObject, CardKey.TEXT_ANNOUNCEMENT_DOMAIN.getKey());
        this.cardType = CardType.TEXT_ANNOUNCEMENT;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        String str = this.description;
        String str2 = this.title;
        String url = getUrl();
        String str3 = this.domain;
        String card = super.toString();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n            TextAnnouncementCard{description='", str, "'\n            title='", str2, "'\n            url='");
        Boxes$$ExternalSyntheticOutline1.m(m, url, "'\n            domain='", str3, "'\n            ");
        m.append(card);
        m.append("}\n\n        ");
        return StringsKt__IndentKt.replaceIndent(m.toString());
    }
}
