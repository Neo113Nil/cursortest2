package ru.yandex.taxi.favorites.rides.settings_modal.domain;

import com.yandex.go.slot.dto.SettingsModalContentItemDto$DividerLine;
import com.yandex.go.slot.dto.SettingsModalContentItemDto$Slot;
import com.yandex.go.slot.dto.SettingsModalContentItemDto$SpacerVertical;
import com.yandex.go.slot.dto.SlotDividerDto$Line;
import com.yandex.go.slot.dto.SlotDividerDto$LineSlot;
import com.yandex.go.slot.dto.d0;
import com.yandex.go.slot.dto.n;
import com.yandex.go.slot.dto.o;
import defpackage.iar0;
import defpackage.jar0;
import defpackage.mar0;
import defpackage.mvg;
import defpackage.nar0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnar0;", "<anonymous>", "(Ltse;)Lnar0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$getContent$2$1$1", f = "SettingsModalInteractor.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SettingsModalInteractor$getContent$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ o $item;
    final /* synthetic */ boolean $withLoadingImages;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsModalInteractor$getContent$2$1$1(a aVar, o oVar, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = oVar;
        this.$index = i;
        this.$withLoadingImages = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsModalInteractor$getContent$2$1$1(this.this$0, this.$item, this.$index, this.$withLoadingImages, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsModalInteractor$getContent$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0.b;
        o oVar = this.$item;
        int i2 = this.$index;
        boolean z = this.$withLoadingImages;
        this.label = 1;
        if (oVar instanceof SettingsModalContentItemDto$Slot) {
            obj2 = bVar.a((SettingsModalContentItemDto$Slot) oVar, i2, z, this);
            if (obj2 != coroutineSingletons) {
                obj2 = (nar0) obj2;
            }
        } else {
            bVar.getClass();
            if (oVar instanceof SettingsModalContentItemDto$SpacerVertical) {
                obj2 = new mar0(((SettingsModalContentItemDto$SpacerVertical) oVar).a.c);
            } else if (oVar instanceof SettingsModalContentItemDto$DividerLine) {
                d0 d0Var = ((SettingsModalContentItemDto$DividerLine) oVar).a;
                obj2 = d0Var instanceof SlotDividerDto$Line ? new iar0(0) : d0Var instanceof SlotDividerDto$LineSlot ? new jar0(0) : new iar0(0);
            } else if (!(oVar instanceof n)) {
                w511.b();
                return null;
            }
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
