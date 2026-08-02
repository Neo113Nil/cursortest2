package bo.app;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence$iterator$1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n3 {
    public static final n3 a = new n3();

    public static final Card a(JSONObject jSONObject, a9 a9Var, ICardStorageProvider iCardStorageProvider, e9 e9Var) {
        jSONObject.getClass();
        a9Var.getClass();
        iCardStorageProvider.getClass();
        e9Var.getClass();
        CardType cardTypeFromJson = CardKey.INSTANCE.getCardTypeFromJson(jSONObject);
        int i = cardTypeFromJson == null ? -1 : k3.a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            return new ImageOnlyCard(jSONObject, a9Var, iCardStorageProvider, e9Var);
        }
        if (i == 2) {
            return new CaptionedImageCard(jSONObject, a9Var, iCardStorageProvider, e9Var);
        }
        if (i == 3) {
            return new ShortNewsCard(jSONObject, a9Var, iCardStorageProvider, e9Var);
        }
        if (i == 4) {
            return new TextAnnouncementCard(jSONObject, a9Var, iCardStorageProvider, e9Var);
        }
        if (i != 5) {
            return null;
        }
        return new ControlCard(jSONObject, a9Var, iCardStorageProvider, e9Var);
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(a9 a9Var, ICardStorageProvider iCardStorageProvider, e9 e9Var, JSONArray jSONArray, Object obj) {
        obj.getClass();
        try {
            return a(new JSONObject(obj.toString()), a9Var, iCardStorageProvider, e9Var);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n$$ExternalSyntheticLambda0(23, obj, jSONArray), 4, (Object) null);
            return null;
        }
    }

    public static final List a(JSONArray jSONArray, e2 e2Var, x3 x3Var, r3 r3Var) {
        jSONArray.getClass();
        e2Var.getClass();
        x3Var.getClass();
        r3Var.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.asSequence(new TransformingSequence$iterator$1(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(RangesKt___RangesKt.until(0, jSONArray.length())), new l3(jSONArray)), new m3(jSONArray)))), new n3$$ExternalSyntheticLambda0(e2Var, x3Var, r3Var, jSONArray, 0)));
    }
}
