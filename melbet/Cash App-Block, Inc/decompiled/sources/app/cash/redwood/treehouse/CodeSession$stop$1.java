package app.cash.redwood.treehouse;

import android.view.Choreographer;
import androidx.camera.camera2.pipe.internal.FrameImpl;
import app.cash.redwood.protocol.RedwoodVersion;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineApiMismatchException;
import app.cash.zipline.ZiplineScopedKt;
import coil3.Extras;
import com.squareup.cash.treehouse.ui.PathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CodeSession$stop$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ZiplineCodeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CodeSession$stop$1(ZiplineCodeSession ziplineCodeSession, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = ziplineCodeSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ZiplineCodeSession ziplineCodeSession = this.this$0;
        switch (i) {
            case 0:
                return new CodeSession$stop$1(ziplineCodeSession, continuation, 0);
            default:
                return new CodeSession$stop$1(ziplineCodeSession, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CodeSession$stop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ZiplineCodeSession ziplineCodeSession = this.this$0;
                ziplineCodeSession.ziplineScope.close();
                Zipline zipline = ziplineCodeSession.zipline;
                zipline.close();
                ziplineCodeSession.leakDetector.watchReference(zipline, "code session stopped");
                JobKt.cancel(ziplineCodeSession.scope, (CancellationException) null);
                ziplineCodeSession.eventPublisher.rootElement = null;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ZiplineCodeSession ziplineCodeSession2 = this.this$0;
                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ZiplineScopedKt.withScope(ziplineCodeSession2.appService, ziplineCodeSession2.ziplineScope);
                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 5, new Object[0]);
                call.getClass();
                AppLifecycle$Companion$Adapter$GeneratedOutboundService appLifecycle$Companion$Adapter$GeneratedOutboundService = (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call;
                try {
                    Object call2 = appLifecycle$Companion$Adapter$GeneratedOutboundService.callHandler.call(appLifecycle$Companion$Adapter$GeneratedOutboundService, 3, new Object[0]);
                    call2.getClass();
                    str = ((RedwoodVersion) call2).value;
                } catch (ZiplineApiMismatchException unused) {
                    RedwoodVersion.Companion.getClass();
                    str = RedwoodVersion.Unknown;
                }
                ziplineCodeSession2._guestProtocolVersion = str;
                Extras.Key key = ziplineCodeSession2.frameClockFactory;
                ContextScope contextScope = ziplineCodeSession2.scope;
                AndroidTreehouseDispatchers androidTreehouseDispatchers = ziplineCodeSession2.dispatchers;
                key.getClass();
                contextScope.getClass();
                Choreographer choreographer = (Choreographer) key.f61default;
                choreographer.getClass();
                Object call3 = appLifecycle$Companion$Adapter$GeneratedOutboundService.callHandler.call(appLifecycle$Companion$Adapter$GeneratedOutboundService, 0, new RealAppLifecycleHost(appLifecycle$Companion$Adapter$GeneratedOutboundService, new FrameImpl(choreographer, contextScope, androidTreehouseDispatchers), ziplineCodeSession2.eventPublisher, ziplineCodeSession2));
                call3.getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
