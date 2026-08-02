package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$RatingSelector;
import com.yandex.go.taxi.order.models.api.response.rating_selector.RatingSelectorHintDto;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class tmk0 implements lck0 {
    public final /* synthetic */ RideCardItemDto$RatingSelector a;

    public tmk0(RideCardItemDto$RatingSelector rideCardItemDto$RatingSelector, umk0 umk0Var) {
        this.a = rideCardItemDto$RatingSelector;
    }

    @Override // defpackage.lck0
    public final Object a(int i, ibk0 ibk0Var, UiStateDrawableWrapper uiStateDrawableWrapper, w8i0 w8i0Var, Continuation continuation) {
        Object obj;
        RideCardItemDto$RatingSelector rideCardItemDto$RatingSelector = this.a;
        String str = rideCardItemDto$RatingSelector.a;
        Iterator it = rideCardItemDto$RatingSelector.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            RatingSelectorHintDto ratingSelectorHintDto = (RatingSelectorHintDto) obj;
            if (ratingSelectorHintDto.b.isEmpty() || ratingSelectorHintDto.b.contains(Integer.valueOf(i))) {
                break;
            }
        }
        RatingSelectorHintDto ratingSelectorHintDto2 = (RatingSelectorHintDto) obj;
        return new vmk0(str, rideCardItemDto$RatingSelector.b, i, ratingSelectorHintDto2 != null ? ratingSelectorHintDto2.a : null, uiStateDrawableWrapper, w8i0Var, ibk0Var);
    }
}
