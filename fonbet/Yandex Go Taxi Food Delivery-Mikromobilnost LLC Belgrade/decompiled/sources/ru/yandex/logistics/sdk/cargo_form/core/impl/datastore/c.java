package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.dxf0;
import defpackage.e1j;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.ny61;
import defpackage.rle0;
import defpackage.u5s;
import defpackage.xvq;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalStateRepository$special$$inlined$combine$1$3;

/* loaded from: classes5.dex */
public final class c {
    public static final u5s c = new u5s();
    public static final rle0 d = jl40.I("form-preorder-state", new dxf0(new xvq(17)), null, null, 12);
    public final Context a;
    public final JsonAdapter b;

    public c(Context context, Moshi moshi) {
        this.a = context;
        this.b = moshi.adapter(FormStateRestoreModel.class);
    }

    public final Object a(Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(u5s.a(c, this.a), new FormPreorderStateDataStore$clear$2(2, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        FormPreorderStateDataStore$get$1 formPreorderStateDataStore$get$1;
        int i;
        String str2;
        if (continuationImpl instanceof FormPreorderStateDataStore$get$1) {
            formPreorderStateDataStore$get$1 = (FormPreorderStateDataStore$get$1) continuationImpl;
            int i2 = formPreorderStateDataStore$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formPreorderStateDataStore$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formPreorderStateDataStore$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formPreorderStateDataStore$get$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e1j e1jVar = new e1j(u5s.a(c, this.a).getData(), new kme0(str), i3);
                    formPreorderStateDataStore$get$1.L$0 = null;
                    formPreorderStateDataStore$get$1.L$1 = null;
                    formPreorderStateDataStore$get$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(e1jVar, formPreorderStateDataStore$get$1);
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
                str2 = (String) obj;
                if (str2 == null) {
                    return (FormStateRestoreModel) this.b.fromJson(str2);
                }
                return null;
            }
        }
        formPreorderStateDataStore$get$1 = new FormPreorderStateDataStore$get$1(this, continuationImpl);
        Object obj2 = formPreorderStateDataStore$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formPreorderStateDataStore$get$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        FormPreorderStateDataStore$getValue$1 formPreorderStateDataStore$getValue$1;
        int i;
        String str3;
        FormStateRestoreModel formStateRestoreModel;
        Map<String, Object> stateMap;
        if (continuationImpl instanceof FormPreorderStateDataStore$getValue$1) {
            formPreorderStateDataStore$getValue$1 = (FormPreorderStateDataStore$getValue$1) continuationImpl;
            int i2 = formPreorderStateDataStore$getValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formPreorderStateDataStore$getValue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formPreorderStateDataStore$getValue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formPreorderStateDataStore$getValue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e1j e1jVar = new e1j(u5s.a(c, this.a).getData(), new kme0(str), 2);
                    formPreorderStateDataStore$getValue$1.L$0 = null;
                    formPreorderStateDataStore$getValue$1.L$1 = str2;
                    formPreorderStateDataStore$getValue$1.L$2 = null;
                    formPreorderStateDataStore$getValue$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(e1jVar, formPreorderStateDataStore$getValue$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) formPreorderStateDataStore$getValue$1.L$1;
                    kotlin.b.b(obj);
                }
                str3 = (String) obj;
                if (str3 != null || (formStateRestoreModel = (FormStateRestoreModel) this.b.fromJson(str3)) == null || (stateMap = formStateRestoreModel.getStateMap()) == null) {
                    return null;
                }
                return stateMap.get(str2);
            }
        }
        formPreorderStateDataStore$getValue$1 = new FormPreorderStateDataStore$getValue$1(this, continuationImpl);
        Object obj2 = formPreorderStateDataStore$getValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formPreorderStateDataStore$getValue$1.label;
        if (i != 0) {
        }
        str3 = (String) obj2;
        if (str3 != null) {
        }
        return null;
    }

    public final Object d(String str, FormStateRestoreModel formStateRestoreModel, FormInternalStateRepository$special$$inlined$combine$1$3 formInternalStateRepository$special$$inlined$combine$1$3) {
        Object a = androidx.datastore.preferences.core.b.a(u5s.a(c, this.a), new FormPreorderStateDataStore$put$2(str, this, formStateRestoreModel, null), formInternalStateRepository$special$$inlined$combine$1$3);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
