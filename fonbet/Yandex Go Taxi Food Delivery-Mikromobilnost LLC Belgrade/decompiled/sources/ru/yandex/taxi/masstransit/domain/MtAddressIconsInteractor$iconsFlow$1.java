package ru.yandex.taxi.masstransit.domain;

import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.avj0;
import defpackage.b64;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fc30;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obm;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lfc30;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)Lfc30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtAddressIconsInteractor$iconsFlow$1", f = "MtAddressIconsInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtAddressIconsInteractor$iconsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $sourceTag;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtAddressIconsInteractor$iconsFlow$1(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$sourceTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtAddressIconsInteractor$iconsFlow$1 mtAddressIconsInteractor$iconsFlow$1 = new MtAddressIconsInteractor$iconsFlow$1(this.this$0, this.$sourceTag, continuation);
        mtAddressIconsInteractor$iconsFlow$1.L$0 = obj;
        return mtAddressIconsInteractor$iconsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtAddressIconsInteractor$iconsFlow$1) create((ThemeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ThemeType themeType = (ThemeType) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            String str3 = this.$sourceTag;
            this.L$0 = themeType;
            this.label = 1;
            obj = f.a(fVar, str3, themeType, this);
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
        obm obmVar = (obm) obj;
        f fVar2 = this.this$0;
        String j = b64.j(themeType.name(), "_two_flags");
        Drawable t = vng.t(f1h0.ic_destination_pin_two_flag_24, ((avj0) fVar2.d).a);
        obm obmVar2 = t != null ? new obm(j, t) : null;
        kj Ig = this.this$0.e.a.Ig();
        if (Ig != null) {
            if (Ig.i) {
                Ig = null;
            }
            if (Ig != null && (str = Ig.h) != null && !evu0.J(str)) {
                str2 = str;
            }
        }
        return new fc30(obmVar, obmVar2, str2);
    }
}
