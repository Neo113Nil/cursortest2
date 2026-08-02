package ru.yandex.taxi.logistics.postcard.presentation;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "isOpened", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/navigation/screen/api/Screen;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.postcard.presentation.PostcardController$getNavCommandFlow$1", f = "PostcardController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PostcardController$getNavCommandFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostcardController$getNavCommandFlow$1(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PostcardController$getNavCommandFlow$1 postcardController$getNavCommandFlow$1 = new PostcardController$getNavCommandFlow$1((Continuation) obj3, this.this$0);
        postcardController$getNavCommandFlow$1.Z$0 = booleanValue;
        postcardController$getNavCommandFlow$1.L$0 = (Screen) obj2;
        return postcardController$getNavCommandFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Screen screen = (Screen) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!z && (this.this$0.d.f() || screen == Screen.MAIN_V4));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
