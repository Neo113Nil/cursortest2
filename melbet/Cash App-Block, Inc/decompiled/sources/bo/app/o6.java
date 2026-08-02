package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class o6 {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) o6.class);
    public static final IntRange e = new IntRange(200, EnumC0170g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, 1);
    public static final IntRange f = new IntRange(400, 499, 1);
    public static final IntRange g = new IntRange(500, 599, 1);
    public Job a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicLong c = new AtomicLong(DateTimeUtils.nowInMilliseconds());

    public static final String c(o6 o6Var) {
        return "Not restarting stream since " + o6Var.a + " is still active.";
    }

    public static final String d(o6 o6Var) {
        return "Started stream job " + o6Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008e -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CoroutineScope coroutineScope, ReceiveChannel receiveChannel, d6 d6Var, ContinuationImpl continuationImpl) {
        h6 h6Var;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        h6 h6Var2;
        Ref$ObjectRef ref$ObjectRef2;
        CoroutineScope coroutineScope2;
        ReceiveChannel receiveChannel2;
        d6 d6Var2;
        if (continuationImpl instanceof h6) {
            h6Var = (h6) continuationImpl;
            int i2 = h6Var.h;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                h6Var.h = i2 - PKIFailureInfo.systemUnavail;
                Object obj = h6Var.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = h6Var.h;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    m.element = "";
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.element = "";
                    ref$ObjectRef = m;
                    h6Var2 = h6Var;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    coroutineScope2 = coroutineScope;
                    receiveChannel2 = receiveChannel;
                    d6Var2 = d6Var;
                    if (JobKt.isActive(coroutineScope2)) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef4 = h6Var.e;
                    Ref$ObjectRef ref$ObjectRef5 = h6Var.d;
                    ?? r7 = h6Var.c;
                    ReceiveChannel receiveChannel3 = h6Var.b;
                    CoroutineScope coroutineScope3 = h6Var.a;
                    SafeTrace.throwOnFailure(obj);
                    h6Var2 = h6Var;
                    receiveChannel2 = receiveChannel3;
                    ref$ObjectRef = ref$ObjectRef5;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    d6Var2 = r7;
                    String str = (String) obj;
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str2 = d;
                    BrazeLogger.brazelog$default(brazeLogger, str2, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 28), 12, (Object) null);
                    if (StringsKt__StringsJVMKt.startsWith(str, "event: ", false)) {
                        ref$ObjectRef.element = str.substring(7);
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(3, ref$ObjectRef), 14, (Object) null);
                    } else if (StringsKt__StringsJVMKt.startsWith(str, "data: ", false)) {
                        ref$ObjectRef2.element = ref$ObjectRef2.element + str.substring(6);
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(4, ref$ObjectRef2), 14, (Object) null);
                    } else if (StringsKt.isBlank(str)) {
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(24, ref$ObjectRef, ref$ObjectRef2), 14, (Object) null);
                        a((String) ref$ObjectRef.element, (String) ref$ObjectRef2.element, d6Var2);
                        ref$ObjectRef2.element = "";
                        ref$ObjectRef.element = "";
                    } else {
                        ref$ObjectRef.element = "";
                        ref$ObjectRef2.element = "";
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 29), 14, (Object) null);
                    }
                    coroutineScope2 = coroutineScope3;
                    if (JobKt.isActive(coroutineScope2)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(16), 12, (Object) null);
                        h6Var2.a = coroutineScope2;
                        h6Var2.b = receiveChannel2;
                        h6Var2.c = d6Var2;
                        h6Var2.d = ref$ObjectRef;
                        h6Var2.e = ref$ObjectRef2;
                        h6Var2.h = 1;
                        Object receive = receiveChannel2.receive(h6Var2);
                        if (receive == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        coroutineScope3 = coroutineScope2;
                        obj = receive;
                        String str3 = (String) obj;
                        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                        String str22 = d;
                        BrazeLogger.brazelog$default(brazeLogger2, str22, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str3, 28), 12, (Object) null);
                        if (StringsKt__StringsJVMKt.startsWith(str3, "event: ", false)) {
                        }
                        coroutineScope2 = coroutineScope3;
                        if (JobKt.isActive(coroutineScope2)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        h6Var = new h6(this, continuationImpl);
        Object obj2 = h6Var.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = h6Var.h;
        if (i != 0) {
        }
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda4(this, 0), 7, (Object) null);
        Job job = this.a;
        if (job != null) {
            job.cancel(null);
        }
        this.a = null;
    }

    public static final String d(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Got call to startStream() for url ", str);
    }

    public static final String c(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse data line:\n", str);
    }

    public static final String b(Ref$ObjectRef ref$ObjectRef) {
        return Boxes$$ExternalSyntheticOutline1.m("Recorded data type: ", ref$ObjectRef.element);
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Got un-actionable stream line:\n", str);
    }

    public static final String b(o6 o6Var) {
        return "Got call to endStreamAndJoin(). Stream job: " + o6Var.a;
    }

    public static final String b(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Not handling event: '", str, "' and data: '", str2, "'");
    }

    public final void a(String str, d6 d6Var, e6 e6Var, f6 f6Var, boolean z) {
        Job job;
        str.getClass();
        d6Var.getClass();
        e6Var.getClass();
        f6Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 1), 7, (Object) null);
        if (z && (job = this.a) != null && job.isActive()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda4(this, 1), 7, (Object) null);
            return;
        }
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new l6(this, null));
        this.a = JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new n6(this, f6Var, e6Var, d6Var, str, null), 3);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda4(this, 2), 7, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(50, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r15, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        i6 i6Var;
        int i;
        int i2;
        if (continuationImpl instanceof i6) {
            i6Var = (i6) continuationImpl;
            int i3 = i6Var.e;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                i6Var.e = i3 - PKIFailureInfo.systemUnavail;
                Object obj = i6Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = i6Var.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda4(this, 3), 14, (Object) null);
                    Job job = this.a;
                    if (job != null) {
                        i6Var.a = null;
                        i2 = 0;
                        i6Var.b = 0;
                        i6Var.e = 1;
                    }
                    this.a = null;
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    this.a = null;
                    return Unit.INSTANCE;
                }
                i2 = i6Var.b;
                SafeTrace.throwOnFailure(obj);
                i6Var.a = null;
                i6Var.b = i2;
                i6Var.e = 2;
            }
        }
        i6Var = new i6(this, continuationImpl);
        Object obj2 = i6Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = i6Var.e;
        if (i != 0) {
        }
    }

    public static final String a(o6 o6Var) {
        return "Got call to endStream(). Stream job: " + o6Var.a;
    }

    public static final String a() {
        return "Waiting to consume new line";
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Received new line: '", str, "'");
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef) {
        return Boxes$$ExternalSyntheticOutline1.m("Recorded event type: ", ref$ObjectRef.element);
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        return "Handling full event on blank line. lastEventType: '" + ref$ObjectRef.element + "' \ndata: '" + ref$ObjectRef2.element + "'";
    }

    public static void a(String str, String str2, Function1 function1) {
        str.getClass();
        str2.getClass();
        function1.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str3 = d;
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str, str2, 12), 14, (Object) null);
        if (str.equals("msg")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 4), 14, (Object) null);
                function1.invoke(i9.a.a(jSONObject));
                return;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new o6$$ExternalSyntheticLambda2(str2, 0), 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str, str2, 13), 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Got event '", str, "' and data: '", str2, "'");
    }

    public static final String a(JSONObject jSONObject) {
        return Recorder$$ExternalSyntheticOutline2.m("Parsed dust message json to:\n", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    public final void a(boolean z) {
        this.b.set(z);
        this.c.set(z ? DateTimeUtils.nowInMilliseconds() : 0L);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(z, this, 4), 12, (Object) null);
    }

    public static final String a(boolean z, o6 o6Var) {
        return "Set stream listening state to " + z + " and stream listen started at " + o6Var.c;
    }
}
