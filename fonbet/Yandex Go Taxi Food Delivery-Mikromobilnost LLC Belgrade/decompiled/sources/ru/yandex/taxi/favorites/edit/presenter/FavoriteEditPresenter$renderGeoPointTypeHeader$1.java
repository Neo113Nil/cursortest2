package ru.yandex.taxi.favorites.edit.presenter;

import defpackage.cgp;
import defpackage.e81;
import defpackage.ffp;
import defpackage.h81;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.presenter.FavoriteEditPresenter$renderGeoPointTypeHeader$1", f = "FavoriteEditPresenter.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteEditPresenter$renderGeoPointTypeHeader$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteEditPresenter$renderGeoPointTypeHeader$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoriteEditPresenter$renderGeoPointTypeHeader$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteEditPresenter$renderGeoPointTypeHeader$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h81 h81Var;
        CharSequence charSequence;
        FormattedText formattedText;
        FormattedText formattedText2;
        Object i;
        CharSequence charSequence2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        CharSequence charSequence3 = null;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ffp a = this.this$0.B.f.a();
            e81 e81Var = a != null ? a.d : null;
            h81Var = e81Var != null ? e81Var.a : null;
            if (h81Var == null || (formattedText = h81Var.a) == null) {
                charSequence = null;
                if (h81Var != null && (formattedText2 = h81Var.b) != null) {
                    ru.yandex.taxi.widget.c cVar = this.this$0.D;
                    this.L$0 = null;
                    this.L$1 = charSequence;
                    this.L$2 = null;
                    this.label = 2;
                    i = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, this, 30);
                    if (i != coroutineSingletons) {
                        charSequence2 = charSequence;
                        obj = i;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                    }
                    return coroutineSingletons;
                }
                ((cgp) this.this$0.Dg()).renderHeader(charSequence, charSequence3);
                return zy11.a;
            }
            ru.yandex.taxi.widget.c cVar2 = this.this$0.D;
            this.L$0 = h81Var;
            this.L$1 = null;
            this.label = 1;
            obj = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, this, 30);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence2 = (CharSequence) this.L$1;
                kotlin.b.b(obj);
                charSequence3 = (CharSequence) obj;
                charSequence = charSequence2;
                ((cgp) this.this$0.Dg()).renderHeader(charSequence, charSequence3);
                return zy11.a;
            }
            h81Var = (h81) this.L$0;
            kotlin.b.b(obj);
        }
        charSequence = (CharSequence) obj;
        if (h81Var != null) {
            ru.yandex.taxi.widget.c cVar3 = this.this$0.D;
            this.L$0 = null;
            this.L$1 = charSequence;
            this.L$2 = null;
            this.label = 2;
            i = ru.yandex.taxi.widget.c.i(cVar3, formattedText2, null, this, 30);
            if (i != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        ((cgp) this.this$0.Dg()).renderHeader(charSequence, charSequence3);
        return zy11.a;
    }
}
