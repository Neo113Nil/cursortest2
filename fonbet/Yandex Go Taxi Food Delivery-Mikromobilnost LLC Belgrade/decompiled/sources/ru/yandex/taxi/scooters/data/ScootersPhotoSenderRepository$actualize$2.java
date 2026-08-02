package ru.yandex.taxi.scooters.data;

import defpackage.kpm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.model.PhotoType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll60;", "<anonymous>", "(Ltse;)Ll60;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersPhotoSenderRepository$actualize$2", f = "ScootersPhotoSenderRepository.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPhotoSenderRepository$actualize$2 extends SuspendLambda implements wls {
    final /* synthetic */ PhotoType $photoType;
    final /* synthetic */ List<kpm0> $scooterPhotos;
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotoSenderRepository$actualize$2(v vVar, String str, List list, PhotoType photoType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$sessionId = str;
        this.$scooterPhotos = list;
        this.$photoType = photoType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPhotoSenderRepository$actualize$2(this.this$0, this.$sessionId, this.$scooterPhotos, this.$photoType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotoSenderRepository$actualize$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.scooters.data.mapper.b bVar = this.this$0.d;
        String str = this.$sessionId;
        List<kpm0> list = this.$scooterPhotos;
        PhotoType photoType = this.$photoType;
        this.label = 1;
        Object a = bVar.a(str, list, photoType, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
