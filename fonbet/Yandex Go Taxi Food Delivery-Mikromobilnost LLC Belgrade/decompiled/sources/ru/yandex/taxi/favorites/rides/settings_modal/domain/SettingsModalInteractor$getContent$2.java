package ru.yandex.taxi.favorites.rides.settings_modal.domain;

import com.yandex.go.slot.dto.o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lnoh;", "Lnar0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.settings_modal.domain.SettingsModalInteractor$getContent$2", f = "SettingsModalInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SettingsModalInteractor$getContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<o> $contentDto;
    final /* synthetic */ boolean $withLoadingImages;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsModalInteractor$getContent$2(List list, a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$contentDto = list;
        this.this$0 = aVar;
        this.$withLoadingImages = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsModalInteractor$getContent$2 settingsModalInteractor$getContent$2 = new SettingsModalInteractor$getContent$2(this.$contentDto, this.this$0, this.$withLoadingImages, continuation);
        settingsModalInteractor$getContent$2.L$0 = obj;
        return settingsModalInteractor$getContent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsModalInteractor$getContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<o> list = this.$contentDto;
        a aVar = this.this$0;
        boolean z = this.$withLoadingImages;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(tje.h(tseVar, null, null, new SettingsModalInteractor$getContent$2$1$1(aVar, (o) obj2, i, z, null), 3));
            i = i2;
        }
        return arrayList;
    }
}
