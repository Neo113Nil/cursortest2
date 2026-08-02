package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import android.content.Intent;
import defpackage.ds31;
import defpackage.jgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9e;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.data.ContactPickerSecurityException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.ContactPickerViewModel$onExternalContactPicked$1", f = "ContactPickerViewModel.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ContactPickerViewModel$onExternalContactPicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $intent;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactPickerViewModel$onExternalContactPicked$1(Intent intent, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactPickerViewModel$onExternalContactPicked$1(this.$intent, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactPickerViewModel$onExternalContactPicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[Catch: all -> 0x001c, CancellationException -> 0x004d, TryCatch #0 {CancellationException -> 0x004d, blocks: (B:7:0x0018, B:8:0x0046, B:10:0x0053, B:14:0x0063, B:29:0x002d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: all -> 0x001c, CancellationException -> 0x004d, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x004d, blocks: (B:7:0x0018, B:8:0x0046, B:10:0x0053, B:14:0x0063, B:29:0x002d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        d dVar3;
        s9e s9eVar;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Intent intent = this.$intent;
                dVar = this.this$0;
                if (intent == null) {
                    s9eVar = null;
                    if (s9eVar != null) {
                        dVar.getClass();
                        tje.N(ds31.a(dVar), null, null, new ContactPickerViewModel$showInvalidPhoneErrorDialog$1(dVar, null), 3);
                    } else {
                        dVar.getClass();
                        dVar.W(s9eVar.a, s9eVar.b);
                    }
                    return zy11.a;
                }
                try {
                    ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.a aVar = dVar.c;
                    this.L$0 = dVar;
                    this.L$1 = dVar;
                    this.L$2 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = aVar.a(intent, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dVar3 = dVar;
                } catch (Throwable th) {
                    th = th;
                    dVar2 = dVar;
                    z = th instanceof ContactPickerSecurityException;
                    if (!z) {
                        dVar2.getClass();
                        tje.N(ds31.a(dVar2), null, null, new ContactPickerViewModel$showPermissionErrorDialog$1(dVar2, null), 3);
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        jgz jgzVar = jgz.a;
                        jgz.d(th, "Unexpected exception on requestContact", new Object[0]);
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar2 = (d) this.L$1;
                dVar3 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    z = th instanceof ContactPickerSecurityException;
                    if (!z) {
                    }
                    return zy11.a;
                }
            }
            s9eVar = (s9e) obj;
            dVar = dVar3;
            if (s9eVar != null) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
