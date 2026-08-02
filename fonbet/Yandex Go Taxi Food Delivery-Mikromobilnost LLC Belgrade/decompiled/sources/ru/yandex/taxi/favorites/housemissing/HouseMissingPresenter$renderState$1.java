package ru.yandex.taxi.favorites.housemissing;

import android.graphics.drawable.Drawable;
import defpackage.e9s;
import defpackage.evu0;
import defpackage.ftu;
import defpackage.ktu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q47;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.housemissing.HouseMissingPresenter$renderState$1", f = "HouseMissingPresenter.kt", l = {HProv.PP_HASHOID, HProv.PP_CIPHEROID, HProv.PP_SIGNATUREOID, HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HouseMissingPresenter$renderState$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HouseMissingPresenter$renderState$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HouseMissingPresenter$renderState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HouseMissingPresenter$renderState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormattedText b;
        String str;
        ftu ftuVar;
        CharSequence charSequence;
        ftu ftuVar2;
        String str2;
        Object f;
        CharSequence charSequence2;
        ftu ftuVar3;
        CharSequence charSequence3;
        Object Kg;
        Drawable drawable;
        ftu ftuVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FavoritesCreateRegularAddressExperiment favoritesCreateRegularAddressExperiment = this.this$0.C;
            FormattedText b2 = e9s.b(favoritesCreateRegularAddressExperiment.d, favoritesCreateRegularAddressExperiment);
            FavoritesCreateRegularAddressExperiment favoritesCreateRegularAddressExperiment2 = this.this$0.C;
            b = e9s.b(favoritesCreateRegularAddressExperiment2.e, favoritesCreateRegularAddressExperiment2);
            String str3 = this.this$0.C.f;
            if (str3 == null || evu0.J(str3)) {
                str3 = null;
            }
            ftu ftuVar5 = (ftu) this.this$0.Dg();
            c cVar = this.this$0.x;
            this.L$0 = null;
            this.L$1 = b;
            this.L$2 = str3;
            this.L$3 = ftuVar5;
            this.label = 1;
            obj = c.i(cVar, b2, null, this, 30);
            if (obj != coroutineSingletons) {
                str = str3;
                ftuVar = ftuVar5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$4;
                ftuVar2 = (ftu) this.L$3;
                str2 = (String) this.L$2;
                kotlin.b.b(obj);
                CharSequence charSequence4 = (CharSequence) obj;
                e eVar = this.this$0.z;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = ftuVar2;
                this.L$4 = charSequence;
                this.L$5 = charSequence4;
                this.label = 3;
                f = e.f(eVar, str2, null, this, 6);
                if (f != coroutineSingletons) {
                    CharSequence charSequence5 = charSequence;
                    charSequence2 = charSequence4;
                    obj = f;
                    ftuVar3 = ftuVar2;
                    charSequence3 = charSequence5;
                    Drawable drawable2 = (Drawable) obj;
                    b bVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = ftuVar3;
                    this.L$4 = charSequence3;
                    this.L$5 = charSequence2;
                    this.L$6 = drawable2;
                    this.label = 4;
                    Kg = b.Kg(bVar, this);
                    if (Kg != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                drawable = (Drawable) this.L$6;
                charSequence2 = (CharSequence) this.L$5;
                charSequence3 = (CharSequence) this.L$4;
                ftuVar4 = (ftu) this.L$3;
                kotlin.b.b(obj);
                ftuVar4.uf(new ktu(charSequence3, charSequence2, drawable, new q47((List) obj, 1)));
                return zy11.a;
            }
            charSequence2 = (CharSequence) this.L$5;
            charSequence3 = (CharSequence) this.L$4;
            ftuVar3 = (ftu) this.L$3;
            kotlin.b.b(obj);
            Drawable drawable22 = (Drawable) obj;
            b bVar2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = ftuVar3;
            this.L$4 = charSequence3;
            this.L$5 = charSequence2;
            this.L$6 = drawable22;
            this.label = 4;
            Kg = b.Kg(bVar2, this);
            if (Kg != coroutineSingletons) {
                drawable = drawable22;
                ftuVar4 = ftuVar3;
                obj = Kg;
                ftuVar4.uf(new ktu(charSequence3, charSequence2, drawable, new q47((List) obj, 1)));
                return zy11.a;
            }
            return coroutineSingletons;
        }
        ftuVar = (ftu) this.L$3;
        str = (String) this.L$2;
        b = (FormattedText) this.L$1;
        kotlin.b.b(obj);
        CharSequence charSequence6 = (CharSequence) obj;
        c cVar2 = this.this$0.x;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = str;
        this.L$3 = ftuVar;
        this.L$4 = charSequence6;
        this.label = 2;
        Object i2 = c.i(cVar2, b, null, this, 30);
        if (i2 != coroutineSingletons) {
            ftu ftuVar6 = ftuVar;
            charSequence = charSequence6;
            obj = i2;
            ftuVar2 = ftuVar6;
            str2 = str;
            CharSequence charSequence42 = (CharSequence) obj;
            e eVar2 = this.this$0.z;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = ftuVar2;
            this.L$4 = charSequence;
            this.L$5 = charSequence42;
            this.label = 3;
            f = e.f(eVar2, str2, null, this, 6);
            if (f != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
