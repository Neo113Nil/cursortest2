package ru.yandex.taxi.masstransit.main.ui.header;

import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.g8e;
import defpackage.km30;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkm30;", "<anonymous>", "(Ltse;)Lkm30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.ui.header.MtMainHeaderInteractor$mapUiState$2", f = "MtMainHeaderInteractor.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMainHeaderInteractor$mapUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $headerTitle;
    final /* synthetic */ String $iconTag;
    final /* synthetic */ String $sourceAddressText;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainHeaderInteractor$mapUiState$2(String str, String str2, String str3, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$iconTag = str;
        this.$headerTitle = str2;
        this.$sourceAddressText = str3;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtMainHeaderInteractor$mapUiState$2 mtMainHeaderInteractor$mapUiState$2 = new MtMainHeaderInteractor$mapUiState$2(this.$iconTag, this.$headerTitle, this.$sourceAddressText, this.this$0, continuation);
        mtMainHeaderInteractor$mapUiState$2.L$0 = obj;
        return mtMainHeaderInteractor$mapUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainHeaderInteractor$mapUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int length = this.$iconTag.length();
            a aVar = this.this$0;
            qoh h = length > 0 ? tje.h(tseVar, null, null, new MtMainHeaderInteractor$mapUiState$2$icon$1(aVar, this.$iconTag, null), 3) : tje.h(tseVar, null, null, new MtMainHeaderInteractor$mapUiState$2$icon$2(aVar, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = h.s(this);
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
        Drawable drawable = (Drawable) obj;
        String str = this.$headerTitle;
        String str2 = this.$sourceAddressText;
        if (str2 == null) {
            str2 = "";
        }
        String h2 = ((avj0) this.this$0.c).h(kyh0.superapp_main_current_address);
        String str3 = this.$sourceAddressText;
        return new km30(drawable, str, str2, g8e.p(h2, Extension.FIX_SPACE, str3 != null ? str3 : ""));
    }
}
