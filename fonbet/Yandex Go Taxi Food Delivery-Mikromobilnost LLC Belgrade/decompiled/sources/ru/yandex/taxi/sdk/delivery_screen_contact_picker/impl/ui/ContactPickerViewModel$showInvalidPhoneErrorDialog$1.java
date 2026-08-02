package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oxh0;
import defpackage.qej;
import defpackage.tje;
import defpackage.tse;
import defpackage.wej;
import defpackage.wls;
import defpackage.yuj0;
import defpackage.zej;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.ContactPickerViewModel$showInvalidPhoneErrorDialog$1", f = "ContactPickerViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ContactPickerViewModel$showInvalidPhoneErrorDialog$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactPickerViewModel$showInvalidPhoneErrorDialog$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactPickerViewModel$showInvalidPhoneErrorDialog$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactPickerViewModel$showInvalidPhoneErrorDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            com.yandex.delivery.utils.dialogmanager.impl.b bVar = dVar.w;
            qej qejVar = new qej(null, ((yuj0) dVar.x.b).a(oxh0.cargoform_contact_picker_invalid_number_error_message, new Object[0]), ((yuj0) this.this$0.x.b).a(oxh0.cargoform_contact_picker_enter_manually, new Object[0]), ((yuj0) this.this$0.x.b).a(oxh0.cargoform_contact_picker_select_from_contact, new Object[0]), null, false, null, null, 209);
            this.label = 1;
            obj = bVar.a(qejVar, this);
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
        boolean z = ((zej) obj) instanceof wej;
        d dVar2 = this.this$0;
        if (z) {
            dVar2.getClass();
            tje.N(ds31.a(dVar2), null, null, new ContactPickerViewModel$onPickExternalContactClicked$1(dVar2, null), 3);
        } else {
            dVar2.X();
        }
        return zy11.a;
    }
}
