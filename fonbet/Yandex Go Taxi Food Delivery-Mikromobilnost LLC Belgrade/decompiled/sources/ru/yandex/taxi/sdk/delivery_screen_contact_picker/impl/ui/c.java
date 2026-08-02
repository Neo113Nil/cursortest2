package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import defpackage.bj91;
import defpackage.efb0;
import defpackage.evu0;
import defpackage.fbe;
import defpackage.ibe;
import defpackage.ny61;
import defpackage.oxh0;
import defpackage.vpr;
import defpackage.yuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public c(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ContactPickerViewModel$special$$inlined$map$1$2$1 contactPickerViewModel$special$$inlined$map$1$2$1;
        int i;
        efb0 efb0Var;
        if (continuation instanceof ContactPickerViewModel$special$$inlined$map$1$2$1) {
            contactPickerViewModel$special$$inlined$map$1$2$1 = (ContactPickerViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = contactPickerViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactPickerViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = contactPickerViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactPickerViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ibe ibeVar = (ibe) obj;
                    String str = (ibeVar == null || (efb0Var = ibeVar.c) == null) ? null : efb0Var.a;
                    fbe fbeVar = (str == null || !(evu0.J(bj91.m(str)) ^ true)) ? null : new fbe(((yuj0) this.b.x.b).a(oxh0.cargoform_contact_picker_next, new Object[0]));
                    contactPickerViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    contactPickerViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    contactPickerViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    contactPickerViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    contactPickerViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    contactPickerViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(fbeVar, contactPickerViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        contactPickerViewModel$special$$inlined$map$1$2$1 = new ContactPickerViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = contactPickerViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactPickerViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
