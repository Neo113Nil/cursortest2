package defpackage;

import android.content.Context;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.usecases.j;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class vtf extends yr31 {
    public final j b;
    public final n0 c = ffx.c(0, 0, null, 7);
    public ResultType w;

    public vtf(j jVar) {
        this.b = jVar;
    }

    public static String W(TextRes textRes, Context context) {
        return textRes instanceof TextRes.StringText ? ((TextRes.StringText) textRes).getText() : textRes instanceof TextRes.IntRes ? context.getString(((TextRes.IntRes) textRes).getResId()) : "";
    }
}
