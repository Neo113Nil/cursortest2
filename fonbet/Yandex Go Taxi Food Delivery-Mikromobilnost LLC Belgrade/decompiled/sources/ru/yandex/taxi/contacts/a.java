package ru.yandex.taxi.contacts;

import android.content.Intent;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.ide;
import defpackage.jde;
import defpackage.jst;
import defpackage.lyc;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.v7j0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.phone_select.ContactSecurityException;

/* loaded from: classes5.dex */
public final class a {
    public final jde a;
    public final p1b b;
    public final ru.yandex.taxi.activity.g c;
    public final v7j0 d;

    public a(jde jdeVar, p1b p1bVar, ru.yandex.taxi.activity.g gVar, v7j0 v7j0Var) {
        this.a = jdeVar;
        this.b = p1bVar;
        this.c = gVar;
        this.d = v7j0Var;
    }

    public static ArrayList b(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ide ideVar = (ide) obj;
            if (!evu0.y(ideVar.a, str, true)) {
                String str2 = ideVar.b;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                if (sb2.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (Character.isDigit(charAt2)) {
                            sb3.append(charAt2);
                        }
                    }
                    if (evu0.y(sb3.toString(), sb2, false)) {
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, ContinuationImpl continuationImpl) {
        GetContactsInteractor$getContactFromIntent$1 getContactsInteractor$getContactFromIntent$1;
        Object obj;
        int i;
        if (continuationImpl instanceof GetContactsInteractor$getContactFromIntent$1) {
            getContactsInteractor$getContactFromIntent$1 = (GetContactsInteractor$getContactFromIntent$1) continuationImpl;
            int i2 = getContactsInteractor$getContactFromIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getContactsInteractor$getContactFromIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = getContactsInteractor$getContactFromIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getContactsInteractor$getContactFromIntent$1.label;
                jde jdeVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        ide a = jdeVar.a(intent);
                        if (a != null) {
                            return a;
                        }
                        getContactsInteractor$getContactFromIntent$1.L$0 = intent;
                        getContactsInteractor$getContactFromIntent$1.label = 1;
                        obj = ((com.yandex.go.permission.b) this.d).d(9, getContactsInteractor$getContactFromIntent$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Exception e) {
                        jdeVar.getClass();
                        try {
                            throw e;
                        } catch (SecurityException e2) {
                            jst.e.k(e2, "Security exception while read picked contact with temporary permission");
                            throw new ContactSecurityException();
                        } catch (Exception e3) {
                            jst.e.k(e3, "Error while map contact from cursor");
                            return null;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intent = (Intent) getContactsInteractor$getContactFromIntent$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                jdeVar.getClass();
                try {
                    return jdeVar.a(intent);
                } catch (SecurityException e4) {
                    jst.e.k(e4, "Security exception while read picked contact with temporary permission");
                    throw new ContactSecurityException();
                } catch (Exception e5) {
                    jst.e.k(e5, "Error while map contact from cursor");
                    return null;
                }
            }
        }
        getContactsInteractor$getContactFromIntent$1 = new GetContactsInteractor$getContactFromIntent$1(this, continuationImpl);
        obj = getContactsInteractor$getContactFromIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getContactsInteractor$getContactFromIntent$1.label;
        jde jdeVar2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GetContactsInteractor$requestAllContacts$1 getContactsInteractor$requestAllContacts$1;
        Object obj;
        int i;
        if (continuationImpl instanceof GetContactsInteractor$requestAllContacts$1) {
            getContactsInteractor$requestAllContacts$1 = (GetContactsInteractor$requestAllContacts$1) continuationImpl;
            int i2 = getContactsInteractor$requestAllContacts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getContactsInteractor$requestAllContacts$1.label = i2 - Integer.MIN_VALUE;
                obj = getContactsInteractor$requestAllContacts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getContactsInteractor$requestAllContacts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getContactsInteractor$requestAllContacts$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.d).d(9, getContactsInteractor$requestAllContacts$1);
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
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                jde jdeVar = this.a;
                jdeVar.getClass();
                try {
                    return (List) new lyc(15, jdeVar).invoke();
                } catch (SecurityException e) {
                    jst.e.k(e, "Security exception while reading all contacts");
                    throw new ContactSecurityException();
                } catch (Exception e2) {
                    jst.e.k(e2, "Error while map contact from cursor");
                    return null;
                }
            }
        }
        getContactsInteractor$requestAllContacts$1 = new GetContactsInteractor$requestAllContacts$1(this, continuationImpl);
        obj = getContactsInteractor$requestAllContacts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getContactsInteractor$requestAllContacts$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        GetContactsInteractor$requestContact$1 getContactsInteractor$requestContact$1;
        int i;
        Intent intent;
        if (continuationImpl instanceof GetContactsInteractor$requestContact$1) {
            getContactsInteractor$requestContact$1 = (GetContactsInteractor$requestContact$1) continuationImpl;
            int i2 = getContactsInteractor$requestContact$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getContactsInteractor$requestContact$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getContactsInteractor$requestContact$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getContactsInteractor$requestContact$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getContactsInteractor$requestContact$1.label = 1;
                    obj = bvf0.n(new GetContactsInteractor$openContactsForResult$2(this, null), getContactsInteractor$requestContact$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                intent = (Intent) obj;
                if (intent != null) {
                    return null;
                }
                getContactsInteractor$requestContact$1.L$0 = null;
                getContactsInteractor$requestContact$1.label = 2;
                Object a = a(intent, getContactsInteractor$requestContact$1);
                return a == obj2 ? obj2 : a;
            }
        }
        getContactsInteractor$requestContact$1 = new GetContactsInteractor$requestContact$1(this, continuationImpl);
        Object obj3 = getContactsInteractor$requestContact$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getContactsInteractor$requestContact$1.label;
        if (i != 0) {
        }
        intent = (Intent) obj3;
        if (intent != null) {
        }
    }
}
