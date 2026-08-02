package defpackage;

import com.yandex.go.shortcuts.dto.response.ButtonStackItem;
import com.yandex.go.shortcuts.dto.response.InfoStackItem;
import com.yandex.go.shortcuts.dto.response.PriceStackItem;
import com.yandex.go.shortcuts.dto.response.RatingStackItem;
import com.yandex.go.shortcuts.dto.response.StackCommon$StackItemType;
import com.yandex.go.shortcuts.dto.response.ThumbStackItem;
import com.yandex.go.shortcuts.dto.response.e3;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class qyt0 extends lnt {
    public static final qyt0 f = new qyt0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e3.INSTANCE.serializer(), qoi0.a(e3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        StackCommon$StackItemType stackCommon$StackItemType = StackCommon$StackItemType.THUMB;
        f9 f9Var = new f9((String) h().invoke(stackCommon$StackItemType), ThumbStackItem.Companion.serializer(), qoi0.a(ThumbStackItem.class));
        StackCommon$StackItemType stackCommon$StackItemType2 = StackCommon$StackItemType.INFO;
        f9 f9Var2 = new f9((String) h().invoke(stackCommon$StackItemType2), InfoStackItem.Companion.serializer(), qoi0.a(InfoStackItem.class));
        StackCommon$StackItemType stackCommon$StackItemType3 = StackCommon$StackItemType.BUTTON;
        f9 f9Var3 = new f9((String) h().invoke(stackCommon$StackItemType3), ButtonStackItem.Companion.serializer(), qoi0.a(ButtonStackItem.class));
        StackCommon$StackItemType stackCommon$StackItemType4 = StackCommon$StackItemType.RATING;
        f9 f9Var4 = new f9((String) h().invoke(stackCommon$StackItemType4), RatingStackItem.Companion.serializer(), qoi0.a(RatingStackItem.class));
        StackCommon$StackItemType stackCommon$StackItemType5 = StackCommon$StackItemType.PRICE;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, new f9((String) h().invoke(stackCommon$StackItemType5), PriceStackItem.Companion.serializer(), qoi0.a(PriceStackItem.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return StackCommon$StackItemType.Companion.serializer();
    }
}
