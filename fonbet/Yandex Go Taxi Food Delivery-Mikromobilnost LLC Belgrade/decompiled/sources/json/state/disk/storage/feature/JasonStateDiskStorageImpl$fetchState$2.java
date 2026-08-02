package json.state.disk.storage.feature;

import defpackage.d6x;
import defpackage.ffx;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.s7s0;
import defpackage.tjr;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.xfz;
import defpackage.zcx;
import defpackage.zjr;
import defpackage.zy11;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld6x;", "<anonymous>", "(Ltse;)Ld6x;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "json.state.disk.storage.feature.JasonStateDiskStorageImpl$fetchState$2", f = "JasonStateDiskStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class JasonStateDiskStorageImpl$fetchState$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JasonStateDiskStorageImpl$fetchState$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JasonStateDiskStorageImpl$fetchState$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JasonStateDiskStorageImpl$fetchState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StackTraceElement stackTraceElement;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            c cVar = this.this$0;
            cVar.getClass();
            File file = new File(cVar.a.getFilesDir(), cVar.b);
            file.createNewFile();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            zcx zcxVar = this.this$0.d;
            return (d6x) ffx.A(zcxVar, gtq0.H(zcxVar.b, qoi0.e(d6x.class)), bufferedInputStream);
        } catch (Exception e) {
            zjr zjrVar = this.this$0.c;
            String type = ErrorTypes.JS_SCENARIO_FETCH_FAILED.getType();
            i3y a = xfz.a(xfz.d(e.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION), new Pair("cause", e));
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                Integer num = new Integer(stackTraceElement.getLineNumber());
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num == null || (str = num.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            tjr tjrVar2 = tjrVar;
            zjrVar.d(FlexLogLevel.ERROR, "Failed to fetch Jason state from disk", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
            return null;
        }
    }
}
