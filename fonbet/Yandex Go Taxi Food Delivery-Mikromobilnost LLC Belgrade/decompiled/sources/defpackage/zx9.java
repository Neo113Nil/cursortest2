package defpackage;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import com.yandex.go.chargers.error.data.model.ChargersErrorDto;
import java.io.BufferedInputStream;
import kotlin.Result;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class zx9 extends py9 {
    public final wnt b;

    public zx9(wnt wntVar) {
        this.b = wntVar;
    }

    @Override // defpackage.py9
    public final cy9 b(Throwable th) {
        Object failure;
        BufferedInputStream N = s8o.N(th);
        if (N == null) {
            return null;
        }
        try {
            failure = ((ChargersErrorDto) ((xnt) this.b).b(N, ChargersErrorDto.Companion.serializer())).a;
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, "Error occurred while parsing error message");
        }
        if (!(failure instanceof Result.Failure)) {
            ChargersErrorDetailsDto chargersErrorDetailsDto = (ChargersErrorDetailsDto) failure;
            String str = chargersErrorDetailsDto.a;
            FormattedText formattedText = chargersErrorDetailsDto.b;
            FormattedText formattedText2 = chargersErrorDetailsDto.c;
            oeu O = s8o.O(th);
            failure = new cy9(str, O != null ? O.a("X-YaTraceId") : null, formattedText, formattedText2);
        }
        return (cy9) (failure instanceof Result.Failure ? null : failure);
    }
}
