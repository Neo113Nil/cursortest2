package ru.yandex.taxi.favorites.list.ui.adapter.holder;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.list.ui.adapter.holder.FavoriteAddressHolder$showLeadIcon$1$1", f = "FavoriteAddressHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteAddressHolder$showLeadIcon$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FavoriteAddress $address;
    final /* synthetic */ ListItemComponent $this_with;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAddressHolder$showLeadIcon$1$1(a aVar, FavoriteAddress favoriteAddress, ListItemComponent listItemComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$address = favoriteAddress;
        this.$this_with = listItemComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoriteAddressHolder$showLeadIcon$1$1(this.this$0, this.$address, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteAddressHolder$showLeadIcon$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.S;
            String imageTag = this.$address.getImageTag();
            this.label = 1;
            obj = e.f(eVar, imageTag, null, this, 6);
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
        if (bitmapDrawable != null) {
            this.$this_with.setLeadImage(bitmapDrawable);
        }
        return zy11.a;
    }
}
