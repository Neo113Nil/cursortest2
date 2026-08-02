package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0180h0 {
    public final C0194i5 a;
    public final C0099b0 b;
    public final Gson c;
    public final Type d;

    public C0180h0(C0194i5 c0194i5, C0099b0 c0099b0) {
        c0194i5.getClass();
        c0099b0.getClass();
        this.a = c0194i5;
        this.b = c0099b0;
        this.c = new Gson();
        this.d = new C0109c0().getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0180h0 c0180h0, String str, Type type2, ContinuationImpl continuationImpl) {
        C0162f0 c0162f0;
        int i;
        if (continuationImpl instanceof C0162f0) {
            c0162f0 = (C0162f0) continuationImpl;
            int i2 = c0162f0.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0162f0.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0162f0.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0162f0.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    C0194i5 c0194i5 = c0180h0.a;
                    c0162f0.a = c0180h0;
                    c0162f0.b = type2;
                    c0162f0.e = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0167f5(c0194i5, str, null), c0162f0);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    type2 = c0162f0.b;
                    c0180h0 = c0162f0.a;
                    SafeTrace.throwOnFailure(obj);
                }
                Object fromJson = c0180h0.c.fromJson((String) obj, type2);
                fromJson.getClass();
                return fromJson;
            }
        }
        c0162f0 = new C0162f0(c0180h0, continuationImpl);
        Object obj2 = c0162f0.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0162f0.e;
        if (i != 0) {
        }
        Object fromJson2 = c0180h0.c.fromJson((String) obj2, type2);
        fromJson2.getClass();
        return fromJson2;
    }

    public static String a() {
        return UUID.randomUUID() + ".txt";
    }
}
