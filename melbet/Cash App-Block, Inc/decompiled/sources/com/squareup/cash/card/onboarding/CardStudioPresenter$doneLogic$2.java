package com.squareup.cash.card.onboarding;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.db.LocalTabContentQueries;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.screens.Back;
import com.squareup.protos.franklin.cards.TouchData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStudioPresenter$doneLogic$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $isShowingCashtag;
    public final /* synthetic */ boolean $isShowingCashtagButton;
    public final /* synthetic */ TouchData $touchData;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStudioPresenter$doneLogic$2(TouchData touchData, CardStudioPresenter cardStudioPresenter, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$touchData = touchData;
        this.this$0 = cardStudioPresenter;
        this.$isShowingCashtagButton = z;
        this.$isShowingCashtag = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardStudioPresenter$doneLogic$2(this.$touchData, this.this$0, this.$isShowingCashtagButton, this.$isShowingCashtag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardStudioPresenter$doneLogic$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        TouchData touchData = this.$touchData;
        List<TouchData.Stroke> list = touchData.strokes;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List<TouchData.Point> list2 = ((TouchData.Stroke) obj2).points;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        TouchData.Point point = (TouchData.Point) it.next();
                        Float f = touchData.width;
                        f.getClass();
                        float floatValue = f.floatValue();
                        Float f2 = point.x_coordinate;
                        f2.getClass();
                        float floatValue2 = f2.floatValue();
                        if (RecyclerView.DECELERATION_RATE <= floatValue2 && floatValue2 <= floatValue) {
                            Float f3 = touchData.height;
                            f3.getClass();
                            float floatValue3 = f3.floatValue();
                            Float f4 = point.y_coordinate;
                            f4.getClass();
                            float floatValue4 = f4.floatValue();
                            if (RecyclerView.DECELERATION_RATE <= floatValue4 && floatValue4 <= floatValue3) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        TouchData copy$default = TouchData.copy$default(touchData, null, null, arrayList, null, null, 27);
        CardStudioPresenter cardStudioPresenter = this.this$0;
        ((LocalTabContentQueries) cardStudioPresenter.cardStudioQueries).transactionWithWrapper(new CardStudioPresenter$doneLogic$2$$ExternalSyntheticLambda0(cardStudioPresenter, copy$default, this.$isShowingCashtagButton, this.$isShowingCashtag, 0));
        ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(Back.INSTANCE);
        return Unit.INSTANCE;
    }
}
