package defpackage;

import com.google.gson.Gson;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsImpressionsParser$WaveWordsViewReportJson;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class y7v {
    public final jyr a = btf.b(new wuu(29));

    public final List a(String str) {
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        Object d = ((Gson) this.a.getValue()).d(str, WaveWordsImpressionsParser$WaveWordsViewReportJson[].class);
        d.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Object[]) d) {
            WaveWordsImpressionsParser$WaveWordsViewReportJson waveWordsImpressionsParser$WaveWordsViewReportJson = (WaveWordsImpressionsParser$WaveWordsViewReportJson) obj;
            waveWordsImpressionsParser$WaveWordsViewReportJson.getClass();
            String cardId = waveWordsImpressionsParser$WaveWordsViewReportJson.getCardId();
            b9v b9vVar = cardId == null ? null : new b9v(cardId);
            if (b9vVar != null) {
                arrayList.add(b9vVar);
            }
        }
        return arrayList;
    }

    public final List b(String str) {
        String bigCardId;
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        Object d = ((Gson) this.a.getValue()).d(str, WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson[].class);
        d.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Object[]) d) {
            WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson waveWordsImpressionsParser$WaveWordsBigCardViewReportJson = (WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson) obj;
            waveWordsImpressionsParser$WaveWordsBigCardViewReportJson.getClass();
            String smallCardId = waveWordsImpressionsParser$WaveWordsBigCardViewReportJson.getSmallCardId();
            c9v c9vVar = (smallCardId == null || (bigCardId = waveWordsImpressionsParser$WaveWordsBigCardViewReportJson.getBigCardId()) == null) ? null : new c9v(smallCardId, bigCardId);
            if (c9vVar != null) {
                arrayList.add(c9vVar);
            }
        }
        return arrayList;
    }
}
