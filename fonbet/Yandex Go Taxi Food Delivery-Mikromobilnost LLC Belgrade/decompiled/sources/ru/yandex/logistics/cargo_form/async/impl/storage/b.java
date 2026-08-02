package ru.yandex.logistics.cargo_form.async.impl.storage;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.dsg;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.rle0;
import defpackage.tpr;
import defpackage.w2s;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes9.dex */
public final class b {
    public static final w2s c = new w2s();
    public static final rle0 d = jl40.I("delivery-form-tasks-data-store", new dxf0(new dsg(23)), null, null, 12);
    public final Context a;
    public final JsonAdapter b;

    public b(Context context, Moshi moshi) {
        this.a = context;
        this.b = moshi.adapter(Object.class);
    }

    public final Object a(String str, Object obj, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(w2s.a(c, this.a), new FormActiveTasksDataStore$addTask$2(str, this, obj, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FormActiveTasksDataStore$getActiveTasks$1 formActiveTasksDataStore$getActiveTasks$1;
        int i;
        if (continuationImpl instanceof FormActiveTasksDataStore$getActiveTasks$1) {
            formActiveTasksDataStore$getActiveTasks$1 = (FormActiveTasksDataStore$getActiveTasks$1) continuationImpl;
            int i2 = formActiveTasksDataStore$getActiveTasks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formActiveTasksDataStore$getActiveTasks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formActiveTasksDataStore$getActiveTasks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formActiveTasksDataStore$getActiveTasks$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr data = w2s.a(c, this.a).getData();
                    formActiveTasksDataStore$getActiveTasks$1.label = 1;
                    obj = e.y(data, formActiveTasksDataStore$getActiveTasks$1);
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
                Map a = ((mme0) obj).a();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : a.entrySet()) {
                    kme0 kme0Var = (kme0) entry.getKey();
                    Object value = entry.getValue();
                    String str = kme0Var.a;
                    Object fromJson = this.b.fromJson((String) value);
                    Pair pair = fromJson == null ? null : new Pair(str, fromJson);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return kotlin.collections.b.s(arrayList);
            }
        }
        formActiveTasksDataStore$getActiveTasks$1 = new FormActiveTasksDataStore$getActiveTasks$1(this, continuationImpl);
        Object obj2 = formActiveTasksDataStore$getActiveTasks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formActiveTasksDataStore$getActiveTasks$1.label;
        if (i != 0) {
        }
        Map a2 = ((mme0) obj2).a();
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        return kotlin.collections.b.s(arrayList2);
    }

    public final Object c(String str, ContinuationImpl continuationImpl) {
        Object a = androidx.datastore.preferences.core.b.a(w2s.a(c, this.a), new FormActiveTasksDataStore$removeTask$2(str, null), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
