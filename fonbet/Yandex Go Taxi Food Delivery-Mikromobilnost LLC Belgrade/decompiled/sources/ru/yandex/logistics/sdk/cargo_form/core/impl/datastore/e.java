package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.dxf0;
import defpackage.e1j;
import defpackage.jl40;
import defpackage.k6s;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.rle0;
import defpackage.tpr;
import defpackage.xvq;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class e {
    public static final k6s c = new k6s();
    public static final rle0 d = jl40.I("form-state", new dxf0(new xvq(18)), null, null, 12);
    public final Context a;
    public final JsonAdapter b;

    public e(Context context, Moshi moshi) {
        this.a = context;
        this.b = moshi.adapter(FormStateRestoreModel.class);
    }

    public final Object a(LinkedHashSet linkedHashSet, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(k6s.a(c, this.a), new FormStateDataStore$clearAllExcept$2(linkedHashSet, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        FormStateDataStore$get$1 formStateDataStore$get$1;
        int i;
        String str2;
        if (continuationImpl instanceof FormStateDataStore$get$1) {
            formStateDataStore$get$1 = (FormStateDataStore$get$1) continuationImpl;
            int i2 = formStateDataStore$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formStateDataStore$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formStateDataStore$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formStateDataStore$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e1j e1jVar = new e1j(k6s.a(c, this.a).getData(), new kme0(str), 3);
                    formStateDataStore$get$1.L$0 = null;
                    formStateDataStore$get$1.L$1 = null;
                    formStateDataStore$get$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(e1jVar, formStateDataStore$get$1);
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
        formStateDataStore$get$1 = new FormStateDataStore$get$1(this, continuationImpl);
        Object obj2 = formStateDataStore$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formStateDataStore$get$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        FormStateDataStore$hasKey$1 formStateDataStore$hasKey$1;
        int i;
        if (continuationImpl instanceof FormStateDataStore$hasKey$1) {
            formStateDataStore$hasKey$1 = (FormStateDataStore$hasKey$1) continuationImpl;
            int i2 = formStateDataStore$hasKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formStateDataStore$hasKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formStateDataStore$hasKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formStateDataStore$hasKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr data = k6s.a(c, this.a).getData();
                    formStateDataStore$hasKey$1.L$0 = str;
                    formStateDataStore$hasKey$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(data, formStateDataStore$hasKey$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) formStateDataStore$hasKey$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((mme0) obj).b(new kme0(str)));
            }
        }
        formStateDataStore$hasKey$1 = new FormStateDataStore$hasKey$1(this, continuationImpl);
        Object obj2 = formStateDataStore$hasKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formStateDataStore$hasKey$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((mme0) obj2).b(new kme0(str)));
    }

    public final Object d(String str, FormStateRestoreModel formStateRestoreModel, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(k6s.a(c, this.a), new FormStateDataStore$put$2(str, this, formStateRestoreModel, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
