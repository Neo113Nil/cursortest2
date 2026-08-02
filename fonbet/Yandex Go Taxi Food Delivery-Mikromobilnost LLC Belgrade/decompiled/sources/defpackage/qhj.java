package defpackage;

import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.core.network.impl.internal.network.a;
import java.util.Map;
import kotlin.random.Random;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes12.dex */
public final class qhj extends a implements phj {
    @Override // com.yandex.fintechsdk.core.network.impl.internal.network.a
    public final Map a() {
        String key = Header.RequestId.getKey();
        Random.a.getClass();
        return g8e.z(key, String.valueOf(Math.abs(Random.b.i(1000000000000000000L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED))));
    }
}
