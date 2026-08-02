package com.braze.ui.contentcards;

import android.os.Bundle;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.braze.enums.Channel;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/BrazeContentCardUtils;", "", "<init>", "()V", "", "Lcom/braze/models/cards/Card;", "cards", "defaultCardHandling", "(Ljava/util/List;)Ljava/util/List;", "card", "Lcom/braze/ui/actions/UriAction;", "getUriActionForCard", "(Lcom/braze/models/cards/Card;)Lcom/braze/ui/actions/UriAction;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeContentCardUtils {
    public static final BrazeContentCardUtils INSTANCE = new BrazeContentCardUtils();

    private BrazeContentCardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultCardHandling$lambda$0(Card card, Card card2) {
        card.getClass();
        card2.getClass();
        if (card.getIsPinned() && !card2.getIsPinned()) {
            return -1;
        }
        if (!card.getIsPinned() && card2.getIsPinned()) {
            return 1;
        }
        if (card.getCreated() > card2.getCreated()) {
            return -1;
        }
        if (card.getCreated() < card2.getCreated()) {
            return 1;
        }
        if (card.getId().compareTo(card2.getId()) > 0) {
            return -1;
        }
        return card.getId().compareTo(card2.getId()) < 0 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUriActionForCard$lambda$0() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    public final List<Card> defaultCardHandling(List<? extends Card> cards) {
        cards.getClass();
        ng$$ExternalSyntheticLambda0 ng__externalsyntheticlambda0 = new ng$$ExternalSyntheticLambda0(23);
        ArrayList arrayList = new ArrayList();
        for (Object obj : cards) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, ng__externalsyntheticlambda0);
    }

    public final UriAction getUriActionForCard(Card card) {
        card.getClass();
        String url = card.getUrl();
        if (url == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(22), 6, (Object) null);
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : card.getExtras().keySet()) {
            bundle.putString(str, card.getExtras().get(str));
        }
        return BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), Channel.CONTENT_CARD);
    }
}
