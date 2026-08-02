package bo.app;

import com.braze.enums.CardKey;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class l$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JSONObject f$0;

    public /* synthetic */ l$$ExternalSyntheticLambda2(JSONObject jSONObject, int i) {
        this.$r8$classId = i;
        this.f$0 = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String cardTypeFromJson$lambda$0;
        int i = this.$r8$classId;
        JSONObject jSONObject = this.f$0;
        switch (i) {
            case 0:
                return l.b(jSONObject);
            case 1:
                return i9.b(jSONObject);
            case 2:
                return nb.a(jSONObject);
            case 3:
                return nb.b(jSONObject);
            case 4:
                return o6.a(jSONObject);
            case 5:
                return oa.a(jSONObject);
            case 6:
                return og.a(jSONObject);
            case 7:
                return og.b(jSONObject);
            case 8:
                return re.k(jSONObject);
            case 9:
                return sd.a(jSONObject);
            case 10:
                return sf.a(jSONObject);
            case 11:
                return x3.b(jSONObject);
            case 12:
                return x3.c(jSONObject);
            case 13:
                return x3.d(jSONObject);
            case 14:
                return x3.e(jSONObject);
            case 15:
                cardTypeFromJson$lambda$0 = CardKey.Companion.getCardTypeFromJson$lambda$0(jSONObject);
                return cardTypeFromJson$lambda$0;
            case 16:
                return com.braze.support.c.b(jSONObject);
            case 17:
                return com.braze.support.e.b(jSONObject);
            case 18:
                return com.braze.support.f.b(jSONObject);
            case 19:
                return com.braze.support.f.a(jSONObject);
            case 20:
                return com.braze.support.i.a(jSONObject);
            case 21:
                return com.braze.support.i.b(jSONObject);
            default:
                return com.braze.support.i.c(jSONObject);
        }
    }
}
