package defpackage;

import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$CustomTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ValueTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ZeroTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class zok0 extends xqt {
    public static final zok0 e = new zok0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, b.INSTANCE.serializer(), qoi0.a(b.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "choice_type";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("value_choice", RideCardTipsChoiceDto$ValueTipsChoiceDto.Companion.serializer(), qoi0.a(RideCardTipsChoiceDto$ValueTipsChoiceDto.class)), new f9("custom_choice", RideCardTipsChoiceDto$CustomTipsChoiceDto.Companion.serializer(), qoi0.a(RideCardTipsChoiceDto$CustomTipsChoiceDto.class)), new f9("zero_choice", RideCardTipsChoiceDto$ZeroTipsChoiceDto.Companion.serializer(), qoi0.a(RideCardTipsChoiceDto$ZeroTipsChoiceDto.class)));
    }
}
