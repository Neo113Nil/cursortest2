package ru.yandex.taxi.contacts;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import defpackage.a60;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.contacts.SettingsRouter$openSettings$1", f = "SettingsRouter.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SettingsRouter$openSettings$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRouter$openSettings$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsRouter$openSettings$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsRouter$openSettings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            gVar.getClass();
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", gVar.a.getPackageName(), null));
            if (intent.resolveActivity(this.this$0.a.getPackageManager()) != null) {
                a60 a60Var = (a60) this.this$0.b;
                a60Var.getClass();
                try {
                    a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
                } catch (ActivityNotFoundException unused) {
                }
                ru.yandex.taxi.activity.g gVar2 = this.this$0.c;
                this.L$0 = null;
                this.label = 1;
                if (gVar2.d(HProv.PP_DELETE_SAVED_PASSWD, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
