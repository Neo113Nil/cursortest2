package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class AFj1gSDK {
    final Intent getCurrencyIso4217Code;

    public AFj1gSDK(Intent intent) {
        intent.getClass();
        this.getCurrencyIso4217Code = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0013, B:7:0x0057, B:13:0x005f, B:24:0x004f, B:29:0x000b, B:15:0x0031, B:18:0x0041, B:20:0x0048, B:21:0x004e, B:4:0x0003), top: B:3:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t, boolean z) {
        T t2;
        Throwable m4120exceptionOrNullimpl;
        ?? r7;
        Throwable m4120exceptionOrNullimpl2;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.Companion;
                t2 = function0.invoke();
            } finally {
                ReflectionFactory reflectionFactory = Reflection.factory;
                KClass[] kClassArr = {reflectionFactory.getOrCreateKotlinClass(ConcurrentModificationException.class), reflectionFactory.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(t2);
                T t3 = t2;
                if (m4120exceptionOrNullimpl != null) {
                }
                m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(t3);
                if (m4120exceptionOrNullimpl2 != null) {
                }
                return t;
            }
            ReflectionFactory reflectionFactory2 = Reflection.factory;
            KClass[] kClassArr2 = {reflectionFactory2.getOrCreateKotlinClass(ConcurrentModificationException.class), reflectionFactory2.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(t2);
            T t32 = t2;
            if (m4120exceptionOrNullimpl != null) {
                try {
                    if (!ArraysKt___ArraysKt.contains(kClassArr2, reflectionFactory2.getOrCreateKotlinClass(m4120exceptionOrNullimpl.getClass()))) {
                        throw m4120exceptionOrNullimpl;
                    }
                    if (z) {
                        r7 = getRevenue(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m4120exceptionOrNullimpl, false, false);
                        r7 = t;
                    }
                    t32 = r7;
                } catch (Throwable th) {
                }
            }
            m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(t32);
            if (m4120exceptionOrNullimpl2 != null) {
                t = t32;
            } else {
                AFLogger.afErrorLog(str, m4120exceptionOrNullimpl2, false, false);
            }
        }
        return t;
    }

    public final String AFAdRevenueData(final String str) {
        str.getClass();
        return (String) getRevenue(new Function0<String>() { // from class: com.appsflyer.internal.AFj1gSDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(str);
            }
        }, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final <T extends Parcelable> T H_(final String str) {
        str.getClass();
        return (T) getRevenue(new Function0<T>() { // from class: com.appsflyer.internal.AFj1gSDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(str);
            }
        }, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(final String str, final long j) {
        str.getClass();
        return (Intent) getRevenue(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1gSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(str, j);
            }
        }, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean getMediationNetwork(final String str) {
        str.getClass();
        Boolean bool = (Boolean) getRevenue(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1gSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(str));
            }
        }, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
