package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl;

import android.content.Intent;
import defpackage.abe;
import defpackage.fza0;
import defpackage.ny61;
import defpackage.s9e;
import defpackage.w511;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes6.dex */
public final class a {
    public final abe a;
    public final fza0 b;

    public a(abe abeVar, fza0 fza0Var) {
        this.a = abeVar;
        this.b = fza0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, ContinuationImpl continuationImpl) {
        ContactPickerInteractor$getContactFromIntent$1 contactPickerInteractor$getContactFromIntent$1;
        int i;
        if (continuationImpl instanceof ContactPickerInteractor$getContactFromIntent$1) {
            contactPickerInteractor$getContactFromIntent$1 = (ContactPickerInteractor$getContactFromIntent$1) continuationImpl;
            int i2 = contactPickerInteractor$getContactFromIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactPickerInteractor$getContactFromIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactPickerInteractor$getContactFromIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactPickerInteractor$getContactFromIntent$1.label;
                if (i != 0) {
                    b.b(obj);
                    s9e f = this.a.f(intent);
                    if (f != null) {
                        return f;
                    }
                    contactPickerInteractor$getContactFromIntent$1.L$0 = null;
                    contactPickerInteractor$getContactFromIntent$1.label = 1;
                    obj = b(intent, contactPickerInteractor$getContactFromIntent$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (s9e) obj;
            }
        }
        contactPickerInteractor$getContactFromIntent$1 = new ContactPickerInteractor$getContactFromIntent$1(this, continuationImpl);
        Object obj3 = contactPickerInteractor$getContactFromIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactPickerInteractor$getContactFromIntent$1.label;
        if (i != 0) {
        }
        return (s9e) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Intent intent, ContinuationImpl continuationImpl) {
        ContactPickerInteractor$getContactFromIntentViaPermission$1 contactPickerInteractor$getContactFromIntentViaPermission$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof ContactPickerInteractor$getContactFromIntentViaPermission$1) {
            contactPickerInteractor$getContactFromIntentViaPermission$1 = (ContactPickerInteractor$getContactFromIntentViaPermission$1) continuationImpl;
            int i2 = contactPickerInteractor$getContactFromIntentViaPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactPickerInteractor$getContactFromIntentViaPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactPickerInteractor$getContactFromIntentViaPermission$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactPickerInteractor$getContactFromIntentViaPermission$1.label;
                if (i != 0) {
                    b.b(obj);
                    contactPickerInteractor$getContactFromIntentViaPermission$1.L$0 = intent;
                    contactPickerInteractor$getContactFromIntentViaPermission$1.label = 1;
                    obj = c(contactPickerInteractor$getContactFromIntentViaPermission$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intent = (Intent) contactPickerInteractor$getContactFromIntentViaPermission$1.L$0;
                    b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return this.a.f(intent);
                }
                if (!booleanValue) {
                    return null;
                }
                w511.b();
                return null;
            }
        }
        contactPickerInteractor$getContactFromIntentViaPermission$1 = new ContactPickerInteractor$getContactFromIntentViaPermission$1(this, continuationImpl);
        Object obj3 = contactPickerInteractor$getContactFromIntentViaPermission$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactPickerInteractor$getContactFromIntentViaPermission$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ContactPickerInteractor$requestPermission$1 contactPickerInteractor$requestPermission$1;
        int i;
        if (continuationImpl instanceof ContactPickerInteractor$requestPermission$1) {
            contactPickerInteractor$requestPermission$1 = (ContactPickerInteractor$requestPermission$1) continuationImpl;
            int i2 = contactPickerInteractor$requestPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactPickerInteractor$requestPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactPickerInteractor$requestPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactPickerInteractor$requestPermission$1.label;
                if (i != 0) {
                    b.b(obj);
                    Permission permission = Permission.READ_CONTACTS;
                    contactPickerInteractor$requestPermission$1.label = 1;
                    obj = this.b.a(permission, contactPickerInteractor$requestPermission$1);
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
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            }
        }
        contactPickerInteractor$requestPermission$1 = new ContactPickerInteractor$requestPermission$1(this, continuationImpl);
        Object obj2 = contactPickerInteractor$requestPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactPickerInteractor$requestPermission$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        return bool2;
    }
}
