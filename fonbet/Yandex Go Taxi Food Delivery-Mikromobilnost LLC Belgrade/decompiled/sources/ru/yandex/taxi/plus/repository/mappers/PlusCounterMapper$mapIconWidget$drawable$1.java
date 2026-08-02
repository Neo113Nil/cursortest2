package ru.yandex.taxi.plus.repository.mappers;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.g16;
import defpackage.hld0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.repository.mappers.PlusCounterMapper$mapIconWidget$drawable$1", f = "PlusCounterMapper.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusCounterMapper$mapIconWidget$drawable$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $iconUrl;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusCounterMapper$mapIconWidget$drawable$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$iconUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusCounterMapper$mapIconWidget$drawable$1(this.this$0, this.$iconUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusCounterMapper$mapIconWidget$drawable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g16 b = this.this$0.a.b().b(this.$iconUrl);
                this.label = 1;
                obj = b.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            hld0 hld0Var = this.this$0.b;
            hld0Var.getClass();
            return new BitmapDrawable(hld0Var.a.getResources(), (Bitmap) obj);
        } catch (Exception unused) {
            this.this$0.c.c("MicroWidgetBadgeMapper:LOADING_IMAGE", "Failed upload image with url " + this.$iconUrl, null);
            return new FormattedTextConverter$EmptyDrawable();
        }
    }
}
