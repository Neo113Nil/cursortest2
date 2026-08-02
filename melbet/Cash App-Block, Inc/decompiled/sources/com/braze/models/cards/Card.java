package com.braze.models.cards;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a9;
import bo.app.e2;
import bo.app.e9;
import bo.app.j3;
import bo.app.k1;
import bo.app.r3;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y8;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.models.IPutIntoJson;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0017\u0018\u0000 U2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001VB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010\u000eR\"\u00102\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00101\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u00104R$\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b6\u0010\u000eR\u001d\u00107\u001a\u00020\f8\u0006¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u000eR\"\u0010;\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b;\u0010\u000e\"\u0004\b<\u00104R\"\u0010=\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00101\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u00104R\u001c\u0010?\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010\u0014R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00101R\u0016\u0010G\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00101R\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00101R$\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u00104R*\u0010L\u001a\u00020\f2\u0006\u0010L\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bN\u0010:\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u00104R*\u0010O\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bR\u0010:\u001a\u0004\bP\u0010\u000e\"\u0004\bQ\u00104R\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010\u000eR\u0011\u0010T\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010\u000e¨\u0006W"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a9;", "brazeManager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lbo/app/e9;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;Lcom/braze/storage/ICardStorageProvider;Lbo/app/e9;)V", "", "logImpression", "()Z", "logClick", "forJsonPut", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "isValidCard", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "Lbo/app/a9;", "Lcom/braze/storage/ICardStorageProvider;", "Lbo/app/e9;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "", "created", "J", "getCreated", "()J", "expiresAt", "getExpiresAt", "isRemoved", "Z", "isPinned", "setPinned", "(Z)V", "value", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", "url", "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", "isExpired", "isControl", "Companion", "bo/app/j3", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Card implements IPutIntoJson<JSONObject> {
    public static final j3 Companion = new j3();
    private final a9 brazeManager;
    private final e9 cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private final boolean openUriInWebView;
    private final String url;
    private boolean wasViewedInternal;

    public Card(JSONObject jSONObject, a9 a9Var, ICardStorageProvider<?> iCardStorageProvider, e9 e9Var) {
        jSONObject.getClass();
        this.jsonObject = jSONObject;
        this.brazeManager = a9Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = e9Var;
        this.extras = JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject(CardKey.EXTRAS.getKey()));
        String string2 = jSONObject.getString(CardKey.ID.getKey());
        string2.getClass();
        this.id = string2;
        this.cardType = CardType.DEFAULT;
        this.wasViewedInternal = jSONObject.optBoolean(CardKey.VIEWED.getKey());
        this.isDismissedInternal = jSONObject.optBoolean(CardKey.DISMISSED.getKey(), false);
        this.isPinned = jSONObject.optBoolean(CardKey.PINNED.getKey(), false);
        this.created = jSONObject.getLong(CardKey.CREATED.getKey());
        this.expiresAt = jSONObject.optLong(CardKey.EXPIRES_AT.getKey(), -1L);
        this.openUriInWebView = jSONObject.optBoolean(CardKey.OPEN_URI_IN_WEBVIEW.getKey(), false);
        this.isRemoved = jSONObject.optBoolean(CardKey.REMOVED.getKey(), false);
        this.isDismissibleByUser = jSONObject.optBoolean(CardKey.DISMISSIBLE.getKey(), false);
        this.isIndicatorHighlightedInternal = jSONObject.optBoolean(CardKey.READ.getKey(), this.wasViewedInternal);
        this.isClicked = jSONObject.optBoolean(CardKey.CLICKED.getKey(), false);
        this.isTest = jSONObject.optBoolean(CardKey.IS_TEST.getKey(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$0() {
        return "Cannot dismiss a card more than once. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$2() {
        return "Failed to log card as dismissed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isIndicatorHighlighted_$lambda$0() {
        return "Failed to mark card indicator as highlighted.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidCard$lambda$0() {
        return "Card ID cannot be null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$1(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Logged click for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$2(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to log card clicked for id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$3(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to log card as clicked for id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Logging impression event for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Logging control impression event for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to log card impression for card id: ", card.id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass().equals(other.getClass())) {
            Card card = (Card) other;
            if (this.created == card.created && Intrinsics.areEqual(this.id, card.id)) {
                return true;
            }
        }
        return false;
    }

    public abstract CardType getCardType();

    public final long getCreated() {
        return this.created;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public String getUrl() {
        return this.url;
    }

    /* renamed from: getViewed, reason: from getter */
    public final boolean getWasViewedInternal() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        long j = this.created;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    /* renamed from: isDismissibleByUser, reason: from getter */
    public final boolean getIsDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j = this.expiresAt;
        return j != -1 && j <= DateTimeUtils.nowInSeconds();
    }

    /* renamed from: isIndicatorHighlighted, reason: from getter */
    public final boolean getIsIndicatorHighlightedInternal() {
        return this.isIndicatorHighlightedInternal;
    }

    /* renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    public final boolean isValidCard() {
        if (!StringsKt.isBlank(this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(19), 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        int i = 0;
        int i2 = 1;
        try {
            this.isClicked = true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Card$$ExternalSyntheticLambda1(this, 2), 4, (Object) null);
        }
        if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Card$$ExternalSyntheticLambda1(this, i2), 6, (Object) null);
            return false;
        }
        e9 e9Var = this.cardAnalytics;
        String str = this.id;
        ((r3) e9Var).getClass();
        str.getClass();
        y8 e2 = k1.g.e(str);
        if (e2 != null) {
            ((e2) this.brazeManager).a(e2);
        }
        this.cardStorage.markCardAsClicked(this.id);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Card$$ExternalSyntheticLambda1(this, i), 7, (Object) null);
        return true;
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Card$$ExternalSyntheticLambda1(this, 4), 6, (Object) null);
                e9 e9Var = this.cardAnalytics;
                String str = this.id;
                ((r3) e9Var).getClass();
                str.getClass();
                y8 g = k1.g.g(str);
                if (g != null) {
                    ((e2) this.brazeManager).a(g);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Card$$ExternalSyntheticLambda1(this, 3), 6, (Object) null);
                e9 e9Var2 = this.cardAnalytics;
                String str2 = this.id;
                ((r3) e9Var2).getClass();
                str2.getClass();
                y8 k = k1.g.k(str2);
                if (k != null) {
                    ((e2) this.brazeManager).a(k);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Card$$ExternalSyntheticLambda1(this, 5), 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z) {
        if (this.isDismissedInternal && z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(17), 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard()) {
                    return;
                }
                e9 e9Var = this.cardAnalytics;
                String str = this.id;
                ((r3) e9Var).getClass();
                str.getClass();
                y8 i = k1.g.i(str);
                if (i != null) {
                    ((e2) this.brazeManager).a(i);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Banner$$ExternalSyntheticLambda0(18), 4, (Object) null);
            }
        }
    }

    public final void setIndicatorHighlighted(boolean z) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z;
        if (!z || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e, false, (Function0) new Banner$$ExternalSyntheticLambda0(16), 4, (Object) null);
        }
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        Map<String, String> map = this.extras;
        String str = this.id;
        long j = this.created;
        long j2 = this.expiresAt;
        boolean z = this.wasViewedInternal;
        boolean z2 = this.isIndicatorHighlightedInternal;
        boolean z3 = this.isDismissedInternal;
        boolean z4 = this.isRemoved;
        boolean z5 = this.isPinned;
        boolean z6 = this.isClicked;
        boolean z7 = this.openUriInWebView;
        boolean z8 = this.isDismissibleByUser;
        boolean z9 = this.isTest;
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(this.jsonObject);
        StringBuilder sb = new StringBuilder("\n            Card{\n            extras=");
        sb.append(map);
        sb.append("\n            id='");
        sb.append(str);
        sb.append("'\n            created=");
        sb.append(j);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, "\n            expiresAt=", "\n            viewed=", sb);
        re$$ExternalSyntheticOutline0.m(sb, z, "\n            isRead=", z2, "\n            isDismissed=");
        re$$ExternalSyntheticOutline0.m(sb, z3, "\n            isRemoved=", z4, "\n            isPinned=");
        re$$ExternalSyntheticOutline0.m(sb, z5, "\n            isClicked=", z6, "\n            openUriInWebview=");
        re$$ExternalSyntheticOutline0.m(sb, z7, "\n            isDismissibleByUser=", z8, "\n            isTest=");
        sb.append(z9);
        sb.append("\n            json=");
        sb.append(prettyPrintedString);
        sb.append("\n            }\n\n        ");
        return StringsKt__IndentKt.replaceIndent(sb.toString());
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getValue() {
        return this.jsonObject;
    }
}
