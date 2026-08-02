package ru.yandex.taxi.settings.main;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import com.yandex.go.user_profile.main_menu.profile.models.UserProfileStyle;
import defpackage.aff0;
import defpackage.cne0;
import defpackage.evu0;
import defpackage.kj;
import defpackage.m500;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o600;
import defpackage.tse;
import defpackage.u500;
import defpackage.wls;
import defpackage.yj21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuPresenter$onProfileSelected$1", f = "NativeMenuPresenter.kt", l = {SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NativeMenuPresenter$onProfileSelected$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuPresenter$onProfileSelected$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuPresenter$onProfileSelected$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeMenuPresenter$onProfileSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar2 = this.this$0;
            o600 o600Var = (o600) fVar2.T.get();
            this.L$0 = fVar2;
            this.label = 1;
            Enum a = ((com.yandex.go.user_profile.main_menu.profile.domain.c) o600Var).a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            fVar = fVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = (f) this.L$0;
            kotlin.b.b(obj);
        }
        UserProfileStyle userProfileStyle = (UserProfileStyle) obj;
        fVar.getClass();
        if (userProfileStyle == UserProfileStyle.V2) {
            m500 m500Var = fVar.A;
            yj21 yj21Var = m500Var.a;
            String str = yj21Var.b.a().a;
            ru.yandex.taxi.startup.launch.h hVar = yj21Var.c;
            String l = ((cne0) hVar.b).l("user_status", null);
            if (l == null) {
                l = "";
            }
            if (((UserPhotoUploadingExperiment) yj21Var.a.a().b()).b) {
                String l2 = ((cne0) hVar.b).l("user_photo_status", null);
                z = (l2 == null || l2.equals("not_found")) ? false : true;
            } else {
                kj Ig = yj21Var.d.a.Ig();
                z = !(Ig != null ? Ig.i : true);
            }
            m500Var.a("Menu.ProfileTapped", new Pair("user_status", l), new Pair("photo_flg", Boolean.valueOf(z)), new Pair("user_name_flg", Boolean.valueOf(true ^ (str == null || evu0.J(str)))));
        }
        u500 u500Var = fVar.D;
        u500Var.getClass();
        u500Var.d(MainMenuProcessor$MenuEntry.PROFILE, new aff0(userProfileStyle, false));
        return zy11.a;
    }
}
