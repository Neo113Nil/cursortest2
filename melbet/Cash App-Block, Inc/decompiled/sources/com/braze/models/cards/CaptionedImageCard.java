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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/braze/models/cards/CaptionedImageCard;", "Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a9;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lbo/app/e9;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;Lcom/braze/storage/ICardStorageProvider;Lbo/app/e9;)V", "", "toString", "()Ljava/lang/String;", "imageUrl", "Ljava/lang/String;", "getImageUrl", "altImageText", "getAltImageText", "title", "getTitle", "description", "getDescription", "url", "getUrl", "domain", "getDomain", "", "aspectRatio", "F", "getAspectRatio", "()F", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CaptionedImageCard extends Card {
    private final String altImageText;
    private final float aspectRatio;
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String imageUrl;
    private final String title;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageCard(JSONObject jSONObject, a9 a9Var, ICardStorageProvider<?> iCardStorageProvider, e9 e9Var) {
        super(jSONObject, a9Var, iCardStorageProvider, e9Var);
        jSONObject.getClass();
        String string2 = jSONObject.getString(CardKey.CAPTIONED_IMAGE_IMAGE.getKey());
        string2.getClass();
        this.imageUrl = string2;
        this.altImageText = JsonUtils.getOptionalString(jSONObject, CardKey.CAPTIONED_IMAGE_ALT_IMAGE.getKey());
        String string3 = jSONObject.getString(CardKey.CAPTIONED_IMAGE_TITLE.getKey());
        string3.getClass();
        this.title = string3;
        String string4 = jSONObject.getString(CardKey.CAPTIONED_IMAGE_DESCRIPTION.getKey());
        string4.getClass();
        this.description = string4;
        this.url = JsonUtils.getOptionalString(jSONObject, CardKey.CAPTIONED_IMAGE_URL.getKey());
        this.domain = JsonUtils.getOptionalString(jSONObject, CardKey.CAPTIONED_IMAGE_DOMAIN.getKey());
        this.aspectRatio = (float) jSONObject.optDouble(CardKey.CAPTIONED_IMAGE_ASPECT_RATIO.getKey(), 0.0d);
        this.cardType = CardType.CAPTIONED_IMAGE;
    }

    public final String getAltImageText() {
        return this.altImageText;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
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

    public final String getImageUrl() {
        return this.imageUrl;
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
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.description;
        String url = getUrl();
        String str4 = this.domain;
        float f = this.aspectRatio;
        String card = super.toString();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n            CaptionedImageCard{imageUrl='", str, "'\n            title='", str2, "'\n            description='");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, "'\n            url='", url, "'\n            domain='");
        m.append(str4);
        m.append("'\n            aspectRatio=");
        m.append(f);
        m.append("\n            ");
        m.append(card);
        m.append("}\n\n        ");
        return StringsKt__IndentKt.replaceIndent(m.toString());
    }
}
