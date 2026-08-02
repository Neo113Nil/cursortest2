package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$logMessage$1", f = "PlaidCrashReporter.kt", l = {66}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0094a5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0114c5 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094a5(C0114c5 c0114c5, String str, Continuation<? super C0094a5> continuation) {
        super(2, continuation);
        this.b = c0114c5;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0094a5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0094a5(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List split$default;
        List subList;
        Crash a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0114c5 c0114c5 = this.b;
            X6 x6 = c0114c5.a;
            C0099b0 c0099b0 = c0114c5.b;
            String str = this.c;
            c0099b0.getClass();
            str.getClass();
            UUID randomUUID = UUID.randomUUID();
            c0099b0.f = randomUUID;
            randomUUID.getClass();
            String uuid = randomUUID.toString();
            uuid.getClass();
            String replace$default = StringsKt__StringsJVMKt.replace$default(uuid, "-", "");
            String format2 = ((SimpleDateFormat) c0099b0.g.getValue()).format(new Date());
            format2.getClass();
            CrashLogLevel crashLogLevel = CrashLogLevel.WARNING;
            String release = c0099b0.b.getRelease();
            if (StringsKt.contains((CharSequence) str, (CharSequence) "com.plaid.internal.core.networking.models.NetworkException", false)) {
                try {
                    split$default = StringsKt__StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
                    subList = split$default.subList(0, 1);
                } catch (Throwable unused) {
                }
                String a2 = c0099b0.c.a();
                DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
                debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"ad3c3c24-0fa0-504e-84f0-421b8bbfa16a"}[0], null, 2, null));
                a = c0099b0.a(new Crash(replace$default, str, format2, crashLogLevel, null, null, null, null, null, null, null, release, null, a2, null, subList, null, null, debugMetaInterface, 219120, null));
                this.a = 1;
                if (x6.a(a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            subList = null;
            String a22 = c0099b0.c.a();
            DebugMetaInterface debugMetaInterface2 = new DebugMetaInterface();
            debugMetaInterface2.getDebugImages().add(new DebugImage(new String[]{"ad3c3c24-0fa0-504e-84f0-421b8bbfa16a"}[0], null, 2, null));
            a = c0099b0.a(new Crash(replace$default, str, format2, crashLogLevel, null, null, null, null, null, null, null, release, null, a22, null, subList, null, null, debugMetaInterface2, 219120, null));
            this.a = 1;
            if (x6.a(a, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
