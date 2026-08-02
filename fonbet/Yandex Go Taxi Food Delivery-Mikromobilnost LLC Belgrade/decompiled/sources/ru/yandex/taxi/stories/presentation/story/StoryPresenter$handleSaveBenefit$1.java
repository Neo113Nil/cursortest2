package ru.yandex.taxi.stories.presentation.story;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ar4;
import defpackage.avj0;
import defpackage.br4;
import defpackage.cr4;
import defpackage.dr4;
import defpackage.gqu0;
import defpackage.gw00;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.PromoBannerActivationStatus;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.communications.api.dto.q0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.presentation.story.StoryPresenter$handleSaveBenefit$1", f = "StoryPresenter.kt", l = {764}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StoryPresenter$handleSaveBenefit$1 extends SuspendLambda implements wls {
    final /* synthetic */ gqu0 $button;
    final /* synthetic */ String $coupon;
    final /* synthetic */ gqu0 $loadingButton;
    final /* synthetic */ StoryWidgets.a $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPresenter$handleSaveBenefit$1(g gVar, String str, StoryWidgets.a aVar, gqu0 gqu0Var, gqu0 gqu0Var2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$coupon = str;
        this.$payload = aVar;
        this.$button = gqu0Var;
        this.$loadingButton = gqu0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryPresenter$handleSaveBenefit$1(this.this$0, this.$coupon, this.$payload, this.$button, this.$loadingButton, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoryPresenter$handleSaveBenefit$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [gqu0] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [gqu0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ru.yandex.taxi.stories.presentation.story.g] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [ru.yandex.taxi.stories.presentation.story.g] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g gVar;
        gqu0 gqu0Var;
        gqu0 gqu0Var2;
        ?? r3;
        gqu0 gqu0Var3;
        ?? r1;
        Object a;
        gqu0 gqu0Var4;
        String str;
        StoryWidgets.a aVar;
        gqu0 gqu0Var5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                gVar = this.this$0;
                String str2 = this.$coupon;
                StoryWidgets.a aVar2 = this.$payload;
                gqu0Var = this.$button;
                gqu0Var2 = this.$loadingButton;
                try {
                    com.yandex.go.benefits_center.activation.data.b bVar = gVar.s;
                    this.L$0 = gVar;
                    this.L$1 = str2;
                    this.L$2 = aVar2;
                    this.L$3 = gqu0Var;
                    this.L$4 = gqu0Var2;
                    this.L$5 = gVar;
                    this.L$6 = gqu0Var;
                    this.L$7 = gqu0Var2;
                    this.label = 1;
                    a = bVar.a(str2, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r3 = gVar;
                    gqu0Var4 = gqu0Var2;
                    str = str2;
                    aVar = aVar2;
                    gqu0Var5 = gqu0Var;
                } catch (Throwable unused) {
                    r3 = gVar;
                    gqu0Var3 = gqu0Var;
                    r1 = gqu0Var2;
                    r3.v(r1, new gqu0(((avj0) r3.u.a).h(kyh0.benefits_center_promo_default_error), gqu0Var3.b, gqu0Var3.c, gqu0Var3.d, false, false, 48));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r1 = (gqu0) this.L$7;
                gqu0Var3 = (gqu0) this.L$6;
                r3 = (g) this.L$5;
                gqu0 gqu0Var6 = (gqu0) this.L$4;
                gqu0 gqu0Var7 = (gqu0) this.L$3;
                StoryWidgets.a aVar3 = (StoryWidgets.a) this.L$2;
                String str3 = (String) this.L$1;
                g gVar2 = (g) this.L$0;
                try {
                    kotlin.b.b(obj);
                    str = str3;
                    aVar = aVar3;
                    gqu0Var5 = gqu0Var7;
                    gqu0Var2 = gqu0Var6;
                    gqu0Var = gqu0Var3;
                    gVar = gVar2;
                    a = obj;
                    gqu0Var4 = r1;
                    r3 = r3;
                } catch (Throwable unused2) {
                    r3.v(r1, new gqu0(((avj0) r3.u.a).h(kyh0.benefits_center_promo_default_error), gqu0Var3.b, gqu0Var3.c, gqu0Var3.d, false, false, 48));
                    return zy11.a;
                }
            }
            try {
                dr4 dr4Var = (dr4) a;
                try {
                    if (dr4Var instanceof cr4) {
                        try {
                            String a2 = gVar.v.a(gw00.e(new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, str)));
                            gVar.v(gqu0Var2, new gqu0(aVar.i, gqu0Var5.b, gqu0Var5.c, new q0(StoryWidgets.ActionType.DEEPLINK, new StoryWidgets.a(a2, null, null, null, 510, null)), true, false, 48));
                            gVar.B = PromoBannerActivationStatus.ACTIVATED;
                        } catch (Throwable unused3) {
                            obj = gqu0Var4;
                            r1 = obj;
                            gqu0Var3 = gqu0Var;
                            r3.v(r1, new gqu0(((avj0) r3.u.a).h(kyh0.benefits_center_promo_default_error), gqu0Var3.b, gqu0Var3.c, gqu0Var3.d, false, false, 48));
                            return zy11.a;
                        }
                    } else if (dr4Var instanceof ar4) {
                        String str4 = gqu0Var5.b;
                        String str5 = gqu0Var5.c;
                        StoryWidgets.ActionType actionType = StoryWidgets.ActionType.SAVE_BENEFIT;
                        String str6 = aVar.i;
                        gVar.v(gqu0Var2, new gqu0((String) null, str4, str5, new q0(actionType, new StoryWidgets.a(null, ((avj0) gVar.u.a).h(kyh0.try_again), ((avj0) gVar.u.a).h(kyh0.benefits_center_promo_promocode_error_subtitle), str, 103, str6)), true, false, 48));
                        gVar.B = PromoBannerActivationStatus.ERROR;
                    } else {
                        if (!(dr4Var instanceof br4)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str7 = ((br4) dr4Var).a;
                        if (str7 == null) {
                            str7 = ((avj0) gVar.u.a).h(kyh0.benefits_center_promo_default_error);
                        }
                        gVar.v(gqu0Var2, new gqu0(str7, gqu0Var5.b, gqu0Var5.c, gqu0Var5.d, false, false, 48));
                    }
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                r1 = gqu0Var4;
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
