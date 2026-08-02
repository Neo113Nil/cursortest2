package ru.yandex.taxi.scooters.presentation.finish_info.statistics;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.mnn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.onn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsCard$bindMapImage$1", f = "ScootersFinishInfoStatisticsCard.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoStatisticsCard$bindMapImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $mapViewHeight;
    final /* synthetic */ e $mediaInfoConverter;
    final /* synthetic */ onn0 $uiState;
    int label;
    final /* synthetic */ ScootersFinishInfoStatisticsCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoStatisticsCard$bindMapImage$1(e eVar, onn0 onn0Var, ScootersFinishInfoStatisticsCard scootersFinishInfoStatisticsCard, int i, Continuation continuation) {
        super(2, continuation);
        this.$mediaInfoConverter = eVar;
        this.$uiState = onn0Var;
        this.this$0 = scootersFinishInfoStatisticsCard;
        this.$mapViewHeight = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoStatisticsCard$bindMapImage$1(this.$mediaInfoConverter, this.$uiState, this.this$0, this.$mapViewHeight, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoStatisticsCard$bindMapImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mnn0 mnn0Var;
        mnn0 mnn0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.$mediaInfoConverter;
            String str = this.$uiState.d;
            this.label = 1;
            obj = e.k(eVar, str, null, this, 14);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        mnn0Var = this.this$0.binding;
        GoImageView goImageView = mnn0Var.c;
        c.D(goImageView.getLayoutParams().width, this.$mapViewHeight, goImageView);
        goImageView.setVisibility(bitmapDrawable != null ? 0 : 8);
        goImageView.setImageDrawable(bitmapDrawable);
        mnn0Var2 = this.this$0.binding;
        mnn0Var2.d.setVisibility(8);
        return zy11.a;
    }
}
