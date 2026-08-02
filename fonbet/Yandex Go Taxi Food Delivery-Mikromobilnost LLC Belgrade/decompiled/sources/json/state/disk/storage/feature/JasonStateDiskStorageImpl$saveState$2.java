package json.state.disk.storage.feature;

import defpackage.d6x;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.s7s0;
import defpackage.tjr;
import defpackage.tse;
import defpackage.unr0;
import defpackage.uza;
import defpackage.wls;
import defpackage.xfz;
import defpackage.zcx;
import defpackage.zjr;
import defpackage.zy11;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "json.state.disk.storage.feature.JasonStateDiskStorageImpl$saveState$2", f = "JasonStateDiskStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class JasonStateDiskStorageImpl$saveState$2 extends SuspendLambda implements wls {
    final /* synthetic */ d6x $state;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JasonStateDiskStorageImpl$saveState$2(c cVar, d6x d6xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$state = d6xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JasonStateDiskStorageImpl$saveState$2(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JasonStateDiskStorageImpl$saveState$2 jasonStateDiskStorageImpl$saveState$2 = (JasonStateDiskStorageImpl$saveState$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jasonStateDiskStorageImpl$saveState$2.invokeSuspend(zy11Var);
        return zy11Var;
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
            zcx zcxVar = this.this$0.d;
            byte[] bytes = zcxVar.c(this.$state, gtq0.H(zcxVar.b, qoi0.e(d6x.class))).getBytes(uza.a);
            c cVar = this.this$0;
            cVar.getClass();
            File file = new File(cVar.a.getFilesDir(), cVar.b);
            file.createNewFile();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            try {
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            } finally {
            }
        } catch (Exception e) {
            zjr zjrVar = this.this$0.c;
            String type = ErrorTypes.JS_SCENARIO_SAVE_FAILED.getType();
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
                Integer num2 = num.intValue() > 0 ? num : null;
                if (num2 == null || (str = num2.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            tjr tjrVar2 = tjrVar;
            zjrVar.d(FlexLogLevel.ERROR, "Failed to save Jason state on disk", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        }
        return zy11.a;
    }
}
