package ru.yandex.taxi.contacts;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.provider.ContactsContract;
import defpackage.a60;
import defpackage.jde;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/content/Intent;", "<anonymous>", "(Ltse;)Landroid/content/Intent;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.contacts.GetContactsInteractor$openContactsForResult$2", f = "GetContactsInteractor.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class GetContactsInteractor$openContactsForResult$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContactsInteractor$openContactsForResult$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetContactsInteractor$openContactsForResult$2 getContactsInteractor$openContactsForResult$2 = new GetContactsInteractor$openContactsForResult$2(this.this$0, continuation);
        getContactsInteractor$openContactsForResult$2.L$0 = obj;
        return getContactsInteractor$openContactsForResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetContactsInteractor$openContactsForResult$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        qoh h = tje.h(tseVar, null, CoroutineStart.UNDISPATCHED, new GetContactsInteractor$openContactsForResult$2$waitResultAsync$1(this.this$0, null), 1);
        p1b p1bVar = this.this$0.b;
        y50 y50Var = (y50) p1bVar.a;
        ((jde) p1bVar.b).getClass();
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setDataAndType(ContactsContract.Contacts.CONTENT_URI, "vnd.android.cursor.dir/phone_v2");
        a60 a60Var = (a60) y50Var;
        a60Var.getClass();
        try {
            a60Var.e(13, intent);
        } catch (ActivityNotFoundException unused) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object s = h.s(this);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
