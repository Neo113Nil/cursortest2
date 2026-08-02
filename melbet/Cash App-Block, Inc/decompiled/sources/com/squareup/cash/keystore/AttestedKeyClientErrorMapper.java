package com.squareup.cash.keystore;

import android.os.Build;
import com.squareup.protos.common.signing.AndroidKeyStoreException;
import com.squareup.protos.common.signing.AttestedKeyClientError;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public abstract class AttestedKeyClientErrorMapper {
    public static final Regex INTERNAL_KEYSTORE_CODE_REGEX = new Regex("internal Keystore code: (-?\\d+)");

    public static AttestedKeyClientError toClientError(Throwable th) {
        Integer num;
        AndroidKeyStoreException androidKeyStoreException;
        Integer num2;
        Boolean bool;
        Boolean bool2;
        Integer num3;
        Boolean bool3;
        String str;
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        Object failure5;
        String name = th.getClass().getName();
        String message = th.getMessage();
        String stackTraceToString = ExceptionsKt__ExceptionsKt.stackTraceToString(th);
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Throwable th2 = th;
        while (true) {
            num = null;
            if (th2 == null || newSetFromMap.contains(th2)) {
                break;
            }
            newSetFromMap.add(th2);
            if (th2.getClass().getName().equals("android.security.KeyStoreException")) {
                break;
            }
            Throwable cause = th2.getCause();
            th2 = (cause == null || cause == th2) ? null : cause;
        }
        th2 = null;
        if (th2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    Result.Companion companion = Result.Companion;
                    Object invoke = th2.getClass().getMethod("getNumericErrorCode", null).invoke(th2, null);
                    if (!(invoke instanceof Integer)) {
                        invoke = null;
                    }
                    failure = (Integer) invoke;
                } catch (Throwable th3) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th3);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                Integer num4 = (Integer) failure;
                try {
                    Object invoke2 = th2.getClass().getMethod("isSystemError", null).invoke(th2, null);
                    if (!(invoke2 instanceof Boolean)) {
                        invoke2 = null;
                    }
                    failure2 = (Boolean) invoke2;
                } catch (Throwable th4) {
                    Result.Companion companion3 = Result.Companion;
                    failure2 = new Result.Failure(th4);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                Boolean bool4 = (Boolean) failure2;
                try {
                    Object invoke3 = th2.getClass().getMethod("isTransientFailure", null).invoke(th2, null);
                    if (!(invoke3 instanceof Boolean)) {
                        invoke3 = null;
                    }
                    failure3 = (Boolean) invoke3;
                } catch (Throwable th5) {
                    Result.Companion companion4 = Result.Companion;
                    failure3 = new Result.Failure(th5);
                }
                if (failure3 instanceof Result.Failure) {
                    failure3 = null;
                }
                Boolean bool5 = (Boolean) failure3;
                try {
                    Object invoke4 = th2.getClass().getMethod("getRetryPolicy", null).invoke(th2, null);
                    if (!(invoke4 instanceof Integer)) {
                        invoke4 = null;
                    }
                    failure4 = (Integer) invoke4;
                } catch (Throwable th6) {
                    Result.Companion companion5 = Result.Companion;
                    failure4 = new Result.Failure(th6);
                }
                if (failure4 instanceof Result.Failure) {
                    failure4 = null;
                }
                Integer num5 = (Integer) failure4;
                try {
                    Object invoke5 = th2.getClass().getMethod("requiresUserAuthentication", null).invoke(th2, null);
                    if (!(invoke5 instanceof Boolean)) {
                        invoke5 = null;
                    }
                    failure5 = (Boolean) invoke5;
                } catch (Throwable th7) {
                    Result.Companion companion6 = Result.Companion;
                    failure5 = new Result.Failure(th7);
                }
                if (failure5 instanceof Result.Failure) {
                    failure5 = null;
                }
                bool3 = (Boolean) failure5;
                num2 = num4;
                bool = bool4;
                bool2 = bool5;
                num3 = num5;
            } else {
                num2 = null;
                bool = null;
                bool2 = null;
                num3 = null;
                bool3 = null;
            }
            String th8 = th2.toString();
            th8.getClass();
            MatcherMatchResult find = INTERNAL_KEYSTORE_CODE_REGEX.find(th8);
            if (find != null && (str = (String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(1)) != null) {
                num = StringsKt.toIntOrNull(str);
            }
            androidKeyStoreException = new AndroidKeyStoreException(num2, num, bool, bool2, num3, bool3, ByteString.EMPTY);
        } else {
            androidKeyStoreException = null;
        }
        return new AttestedKeyClientError(name, message, stackTraceToString, androidKeyStoreException, ByteString.EMPTY);
    }
}
