package yads;

import com.yandex.payment.common.result.ResultType;
import defpackage.o671;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public enum fj3 implements o671 {
    c("default"),
    d(ResultType.RESULT_TYPE_LOADING),
    e("hidden");

    public final String b;

    fj3(String str) {
        this.b = str;
    }

    @Override // defpackage.o671
    public final String a() {
        return String.format("state: %s", Arrays.copyOf(new Object[]{JSONObject.quote(this.b)}, 1));
    }
}
