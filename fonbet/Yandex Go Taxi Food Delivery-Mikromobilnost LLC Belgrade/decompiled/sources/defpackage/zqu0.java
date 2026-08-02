package defpackage;

import com.yandex.go.ridetech.locationsdk.experiment.dto.OnJumpOrDivergenceSimpleDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.SelectSourceDto;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class zqu0 extends wqt {
    public static final zqu0 e = new zqu0();

    @Override // defpackage.h9
    public final String e() {
        return "strategy_type";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("select_source", SelectSourceDto.Companion.serializer(), qoi0.a(SelectSourceDto.class)), new f9("on_jump_or_divergence", OnJumpOrDivergenceSimpleDto.Companion.serializer(), qoi0.a(OnJumpOrDivergenceSimpleDto.class)));
    }
}
