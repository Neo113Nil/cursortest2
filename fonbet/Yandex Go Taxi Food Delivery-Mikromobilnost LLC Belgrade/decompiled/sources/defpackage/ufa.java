package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassesBuyStatusResponseDto$Failed;
import com.yandex.go.chargers.passes.data.ChargersPassesBuyStatusResponseDto$Pending;
import com.yandex.go.chargers.passes.data.ChargersPassesBuyStatusResponseDto$Success;
import java.util.Arrays;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes12.dex */
public final class ufa extends xqt {
    public static final ufa e = new ufa();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, vfa.INSTANCE.serializer(), qoi0.a(vfa.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return ACSPConstants.STATUS;
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("success", ChargersPassesBuyStatusResponseDto$Success.Companion.serializer(), qoi0.a(ChargersPassesBuyStatusResponseDto$Success.class)), new f9("pending", ChargersPassesBuyStatusResponseDto$Pending.Companion.serializer(), qoi0.a(ChargersPassesBuyStatusResponseDto$Pending.class)), new f9("failed", ChargersPassesBuyStatusResponseDto$Failed.Companion.serializer(), qoi0.a(ChargersPassesBuyStatusResponseDto$Failed.class)));
    }
}
