package ru.yandex.logistics.sdk.cargo_form.core.impl.interactor;

import com.yandex.delivery.mapper.model.PointType;
import defpackage.a0t;
import defpackage.b7s;
import defpackage.bhh;
import defpackage.c7s;
import defpackage.i5s;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.q6s;
import defpackage.s9e;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zqb0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormRestoreAddressModel;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormStateRestoreModel;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.e;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;

/* loaded from: classes5.dex */
public final class d {
    public final c7s a;
    public final e b;
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c c;
    public final zqb0 d;

    public d(c7s c7sVar, e eVar, ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c cVar, zqb0 zqb0Var) {
        this.a = c7sVar;
        this.b = eVar;
        this.c = cVar;
        this.d = zqb0Var;
    }

    public static oo0 d(FormRestoreAddressModel formRestoreAddressModel, boolean z) {
        return new oo0(formRestoreAddressModel.getTitle(), z ? PointType.SOURCE : PointType.DESTINATION, formRestoreAddressModel.getUri(), formRestoreAddressModel.getSubtitle(), formRestoreAddressModel.getFullText(), new a0t(formRestoreAddressModel.getCoordinates().getLatitude(), formRestoreAddressModel.getCoordinates().getLongitude(), 0.0d), formRestoreAddressModel.getLocality(), 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FormStateRestoreInteractorImpl$getFormOpenParams$1 formStateRestoreInteractorImpl$getFormOpenParams$1;
        int i;
        FormStateRestoreModel formStateRestoreModel;
        if (continuationImpl instanceof FormStateRestoreInteractorImpl$getFormOpenParams$1) {
            formStateRestoreInteractorImpl$getFormOpenParams$1 = (FormStateRestoreInteractorImpl$getFormOpenParams$1) continuationImpl;
            int i2 = formStateRestoreInteractorImpl$getFormOpenParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formStateRestoreInteractorImpl$getFormOpenParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formStateRestoreInteractorImpl$getFormOpenParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formStateRestoreInteractorImpl$getFormOpenParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    formStateRestoreInteractorImpl$getFormOpenParams$1.L$0 = null;
                    formStateRestoreInteractorImpl$getFormOpenParams$1.label = 1;
                    obj = this.b.b(str, formStateRestoreInteractorImpl$getFormOpenParams$1);
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
                formStateRestoreModel = (FormStateRestoreModel) obj;
                if (formStateRestoreModel == null) {
                    return new i5s(formStateRestoreModel.getMode(), formStateRestoreModel.getScenario());
                }
                return null;
            }
        }
        formStateRestoreInteractorImpl$getFormOpenParams$1 = new FormStateRestoreInteractorImpl$getFormOpenParams$1(this, continuationImpl);
        Object obj2 = formStateRestoreInteractorImpl$getFormOpenParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formStateRestoreInteractorImpl$getFormOpenParams$1.label;
        if (i != 0) {
        }
        formStateRestoreModel = (FormStateRestoreModel) obj2;
        if (formStateRestoreModel == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v3, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, bhh bhhVar, ContinuationImpl continuationImpl) {
        FormStateRestoreInteractorImpl$restoreFormState$1 formStateRestoreInteractorImpl$restoreFormState$1;
        int i;
        bhh bhhVar2;
        FormStateRestoreModel formStateRestoreModel;
        Object value;
        LinkedHashMap linkedHashMap;
        if (continuationImpl instanceof FormStateRestoreInteractorImpl$restoreFormState$1) {
            formStateRestoreInteractorImpl$restoreFormState$1 = (FormStateRestoreInteractorImpl$restoreFormState$1) continuationImpl;
            int i2 = formStateRestoreInteractorImpl$restoreFormState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formStateRestoreInteractorImpl$restoreFormState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formStateRestoreInteractorImpl$restoreFormState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formStateRestoreInteractorImpl$restoreFormState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    formStateRestoreInteractorImpl$restoreFormState$1.L$0 = null;
                    formStateRestoreInteractorImpl$restoreFormState$1.L$1 = bhhVar;
                    formStateRestoreInteractorImpl$restoreFormState$1.label = 1;
                    obj = this.b.b(str, formStateRestoreInteractorImpl$restoreFormState$1);
                    bhhVar2 = bhhVar;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r8 = (tls) formStateRestoreInteractorImpl$restoreFormState$1.L$1;
                    kotlin.b.b(obj);
                    bhhVar2 = r8;
                }
                formStateRestoreModel = (FormStateRestoreModel) obj;
                zy11 zy11Var = zy11.a;
                if (formStateRestoreModel != null) {
                    return zy11Var;
                }
                String mode = formStateRestoreModel.getMode();
                Map<String, Object> stateMap = formStateRestoreModel.getStateMap();
                r0 r0Var = this.a.a;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(mode, new b7s(stateMap, false));
                } while (!r0Var.k(value, linkedHashMap));
                bhhVar2.invoke(formStateRestoreModel.getRoute());
                return zy11Var;
            }
        }
        formStateRestoreInteractorImpl$restoreFormState$1 = new FormStateRestoreInteractorImpl$restoreFormState$1(this, continuationImpl);
        Object obj2 = formStateRestoreInteractorImpl$restoreFormState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formStateRestoreInteractorImpl$restoreFormState$1.label;
        if (i != 0) {
        }
        formStateRestoreModel = (FormStateRestoreModel) obj2;
        zy11 zy11Var2 = zy11.a;
        if (formStateRestoreModel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, q6s q6sVar, ContinuationImpl continuationImpl) {
        FormStateRestoreInteractorImpl$restorePreorderFormState$1 formStateRestoreInteractorImpl$restorePreorderFormState$1;
        int i;
        FormStateRestoreModel formStateRestoreModel;
        s9e s9eVar;
        s9e s9eVar2;
        if (continuationImpl instanceof FormStateRestoreInteractorImpl$restorePreorderFormState$1) {
            formStateRestoreInteractorImpl$restorePreorderFormState$1 = (FormStateRestoreInteractorImpl$restorePreorderFormState$1) continuationImpl;
            int i2 = formStateRestoreInteractorImpl$restorePreorderFormState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formStateRestoreInteractorImpl$restorePreorderFormState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formStateRestoreInteractorImpl$restorePreorderFormState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formStateRestoreInteractorImpl$restorePreorderFormState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    formStateRestoreInteractorImpl$restorePreorderFormState$1.L$0 = null;
                    formStateRestoreInteractorImpl$restorePreorderFormState$1.L$1 = q6sVar;
                    formStateRestoreInteractorImpl$restorePreorderFormState$1.label = 1;
                    obj = this.c.b(str, formStateRestoreInteractorImpl$restorePreorderFormState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q6sVar = (q6s) formStateRestoreInteractorImpl$restorePreorderFormState$1.L$1;
                    kotlin.b.b(obj);
                }
                formStateRestoreModel = (FormStateRestoreModel) obj;
                if (formStateRestoreModel != null) {
                    String mode = formStateRestoreModel.getMode();
                    Map<String, Object> stateMap = formStateRestoreModel.getStateMap();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : stateMap.entrySet()) {
                        if (q6sVar.b.contains(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    this.a.a(mode, linkedHashMap);
                    List list = q6sVar.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        arrayList.add((intValue < 0 || intValue >= formStateRestoreModel.getPickupPointsRoute().size()) ? null : formStateRestoreModel.getPickupPointsRoute().get(intValue));
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    int i3 = 0;
                    if (!q6sVar.a.contains(new Integer(0))) {
                        arrayList2.add(0, null);
                    }
                    if (!arrayList2.isEmpty()) {
                        FormRestoreAddressModel formRestoreAddressModel = (FormRestoreAddressModel) arrayList2.get(0);
                        zqb0 zqb0Var = this.d;
                        if (formRestoreAddressModel != null) {
                            oo0 d = d(formRestoreAddressModel, true);
                            ContactDto contact = formRestoreAddressModel.getContact();
                            if (contact != null) {
                                String name = contact.getName();
                                if (name == null) {
                                    name = "";
                                }
                                s9eVar2 = new s9e(name, contact.getPhone());
                            } else {
                                s9eVar2 = new s9e(i3);
                            }
                            zqb0Var.b(0, d);
                            zqb0Var.c(0, s9eVar2);
                        }
                        if (arrayList2.size() >= 2) {
                            List<FormRestoreAddressModel> M = kotlin.collections.a.M(kotlin.collections.a.J(arrayList2, 1));
                            ArrayList arrayList3 = new ArrayList(tcc.n(M, 10));
                            for (FormRestoreAddressModel formRestoreAddressModel2 : M) {
                                oo0 d2 = d(formRestoreAddressModel2, false);
                                ContactDto contact2 = formRestoreAddressModel2.getContact();
                                if (contact2 != null) {
                                    String name2 = contact2.getName();
                                    if (name2 == null) {
                                        name2 = "";
                                    }
                                    s9eVar = new s9e(name2, contact2.getPhone());
                                } else {
                                    s9eVar = new s9e(i3);
                                }
                                arrayList3.add(new Pair(d2, s9eVar));
                            }
                            if (!arrayList3.isEmpty()) {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    Pair pair = (Pair) next;
                                    zqb0Var.b(i4, (oo0) pair.c());
                                    zqb0Var.c(i4, (s9e) pair.f());
                                    i3 = i4;
                                }
                            }
                        }
                    }
                }
                return zy11.a;
            }
        }
        formStateRestoreInteractorImpl$restorePreorderFormState$1 = new FormStateRestoreInteractorImpl$restorePreorderFormState$1(this, continuationImpl);
        Object obj2 = formStateRestoreInteractorImpl$restorePreorderFormState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formStateRestoreInteractorImpl$restorePreorderFormState$1.label;
        if (i != 0) {
        }
        formStateRestoreModel = (FormStateRestoreModel) obj2;
        if (formStateRestoreModel != null) {
        }
        return zy11.a;
    }
}
