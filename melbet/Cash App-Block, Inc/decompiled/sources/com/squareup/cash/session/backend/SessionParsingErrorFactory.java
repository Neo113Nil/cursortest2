package com.squareup.cash.session.backend;

import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$17$1;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.franklin.common.SessionStatus;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SessionParsingErrorFactory implements ProtoParsingError.Factory {
    public static final SessionParsingErrorFactory INSTANCE = new SessionParsingErrorFactory();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getMigratedPrefsSessionState(SharedPreferences sharedPreferences, Moshi moshi, SessionQueries sessionQueries, CoroutineContext coroutineContext, ContinuationImpl continuationImpl) {
        DoubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1 doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1;
        int i;
        Long l;
        String str;
        String str2;
        String str3;
        Session session;
        boolean z;
        SessionStatus sessionStatus;
        if (continuationImpl instanceof DoubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1) {
            doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1 = (DoubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1) continuationImpl;
            int i2 = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.label;
                l = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    sharedPreferences.getClass();
                    SharedPreferencesKeyValue StringKeyValue = Room.StringKeyValue(sharedPreferences, "app-token", null, true);
                    String str4 = (String) StringKeyValue.reader.read(StringKeyValue);
                    SharedPreferencesKeyValue sessionPref = DimensionKt.sessionPref(sharedPreferences, moshi);
                    Session session2 = (Session) sessionPref.reader.read(sessionPref);
                    SharedPreferencesKeyValue StringKeyValue2 = Room.StringKeyValue(sharedPreferences, "customer-token", null, true);
                    String str5 = (String) StringKeyValue2.reader.read(StringKeyValue2);
                    SharedPreferencesKeyValue StringKeyValue3 = Room.StringKeyValue(sharedPreferences, "target-account-token", null, true);
                    String str6 = (String) StringKeyValue3.reader.read(StringKeyValue3);
                    SharedPreferencesKeyValue BooleanKeyValue = Room.BooleanKeyValue(sharedPreferences, "onboarded", false, true);
                    boolean booleanValue = ((Boolean) BooleanKeyValue.reader.read(BooleanKeyValue)).booleanValue();
                    ShoppingWebPresenter$models$17$1 shoppingWebPresenter$models$17$1 = new ShoppingWebPresenter$models$17$1(sessionQueries, str4, str5, str6, session2, booleanValue, (Continuation) null);
                    doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$4 = str4;
                    doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$5 = session2;
                    doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$6 = str5;
                    doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$7 = str6;
                    doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.Z$0 = booleanValue;
                    doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.label = 1;
                    if (JobKt.withContext(coroutineContext, shoppingWebPresenter$models$17$1, doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    session = session2;
                    z = booleanValue;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.Z$0;
                    String str7 = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$7;
                    String str8 = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$6;
                    session = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$5;
                    String str9 = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.L$4;
                    SafeTrace.throwOnFailure(obj);
                    z = z2;
                    str = str9;
                    str3 = str7;
                    str2 = str8;
                }
                String str10 = session == null ? session.token : null;
                if (session != null && (sessionStatus = session.status) != null) {
                    l = new Long(sessionStatus.value);
                }
                return new com.squareup.cash.db.Session(str, str2, str3, str10, l, z);
            }
        }
        doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1 = new DoubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1(continuationImpl);
        Object obj2 = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = doubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1.label;
        l = null;
        if (i != 0) {
        }
        if (session == null) {
        }
        if (session != null) {
            l = new Long(sessionStatus.value);
        }
        return new com.squareup.cash.db.Session(str, str2, str3, str10, l, z);
    }

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new SessionProtoParsingError(str, errorType, str2, exc);
    }
}
