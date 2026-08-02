package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.mvg;
import defpackage.nfn0;
import defpackage.ny61;
import defpackage.ofn0;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersRemainingActionsViewHolder$setLeadImage$1", f = "ScootersRemainingActionsViewHolder.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersRemainingActionsViewHolder$setLeadImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ ofn0 $image;
    final /* synthetic */ ListItemComponent $this_setLeadImage;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRemainingActionsViewHolder$setLeadImage$1(g gVar, ofn0 ofn0Var, ListItemComponent listItemComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$image = ofn0Var;
        this.$this_setLeadImage = listItemComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRemainingActionsViewHolder$setLeadImage$1(this.this$0, this.$image, this.$this_setLeadImage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRemainingActionsViewHolder$setLeadImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Bitmap bitmap = null;
        if (i == 0) {
            kotlin.b.b(obj);
            pav pavVar = this.this$0.R;
            if (pavVar != null) {
                g16 b = pavVar.b().b(((nfn0) this.$image).a);
                this.label = 1;
                obj = ru.yandex.taxi.utils.a.b(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.$this_setLeadImage.getLeadImageView().setPadding(0, 0, 0, 0);
            this.$this_setLeadImage.getLeadImageView().setImageBitmap(bitmap);
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        bitmap = (Bitmap) obj;
        this.$this_setLeadImage.getLeadImageView().setPadding(0, 0, 0, 0);
        this.$this_setLeadImage.getLeadImageView().setImageBitmap(bitmap);
        return zy11.a;
    }
}
