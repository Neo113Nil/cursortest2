package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes4.dex */
public final class AFj1iSDK {
    final Intent getMediationNetwork;

    public AFj1iSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    public final <T extends Parcelable> T J_(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getCurrencyIso4217Code(new Function0<T>() { // from class: com.appsflyer.internal.AFj1iSDK.4
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: L_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1iSDK.this.getMediationNetwork.getParcelableExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final String AFAdRevenueData(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getCurrencyIso4217Code(new Function0<String>() { // from class: com.appsflyer.internal.AFj1iSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1iSDK.this.getMediationNetwork.getStringExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean getMediationNetwork(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getCurrencyIso4217Code(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1iSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1iSDK.this.getMediationNetwork.hasExtra(str));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Intent K_(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getCurrencyIso4217Code(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1iSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: M_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1iSDK.this.getMediationNetwork.putExtra(str, j);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t, boolean z) {
        Object m6239constructorimpl;
        Object m6239constructorimpl2;
        Object obj;
        Object m6239constructorimpl3;
        synchronized (this.getMediationNetwork) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFj1iSDK aFj1iSDK = this;
                m6239constructorimpl = Result.m6239constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable m6242exceptionOrNullimpl = Result.m6242exceptionOrNullimpl(m6239constructorimpl);
            if (m6242exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m6239constructorimpl2 = Result.m6239constructorimpl(ResultKt.createFailure(th2));
                }
                if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(m6242exceptionOrNullimpl.getClass()))) {
                    if (z) {
                        obj = getCurrencyIso4217Code(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m6242exceptionOrNullimpl, false, false);
                        obj = t;
                    }
                    m6239constructorimpl2 = Result.m6239constructorimpl(obj);
                    m6239constructorimpl = m6239constructorimpl2;
                } else {
                    throw m6242exceptionOrNullimpl;
                }
            }
            KClass[] kClassArr2 = {Reflection.getOrCreateKotlinClass(RuntimeException.class)};
            Throwable m6242exceptionOrNullimpl2 = Result.m6242exceptionOrNullimpl(m6239constructorimpl);
            if (m6242exceptionOrNullimpl2 != null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m6239constructorimpl3 = Result.m6239constructorimpl(ResultKt.createFailure(th3));
                }
                if (ArraysKt.contains(kClassArr2, Reflection.getOrCreateKotlinClass(m6242exceptionOrNullimpl2.getClass()))) {
                    AFLogger.afErrorLog(str, m6242exceptionOrNullimpl2, false, false);
                    m6239constructorimpl3 = Result.m6239constructorimpl(t);
                    m6239constructorimpl = (T) m6239constructorimpl3;
                } else {
                    throw m6242exceptionOrNullimpl2;
                }
            }
            ResultKt.throwOnFailure(m6239constructorimpl);
        }
        return (T) m6239constructorimpl;
    }
}
