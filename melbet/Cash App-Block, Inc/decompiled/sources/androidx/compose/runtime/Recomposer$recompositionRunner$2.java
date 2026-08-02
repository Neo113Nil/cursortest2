package androidx.compose.runtime;

import androidx.lifecycle.Lifecycle;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.core.navigationcontainer.api.PresenterElement;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.ui.BreadcrumbListener;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $block;
    public final /* synthetic */ Object $parentFrameClock;
    public final /* synthetic */ int $r8$classId = 0;
    public Object L$0;
    public Object L$1;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Continuation continuation, SessionManager sessionManager, RealTabProvider.MetroFactory metroFactory, Lifecycle lifecycle, BreadcrumbListener.MetroFactory metroFactory2) {
        super(2, continuation);
        this.L$1 = sessionManager;
        this.this$0 = metroFactory;
        this.$block = lifecycle;
        this.$parentFrameClock = metroFactory2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$parentFrameClock;
        switch (i) {
            case 0:
                Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2((Recomposer) this.this$0, (Recomposer$runRecomposeAndApplyChanges$2) this.$block, (MonotonicFrameClock) obj2, continuation);
                recomposer$recompositionRunner$2.L$0 = obj;
                return recomposer$recompositionRunner$2;
            case 1:
                Recomposer$recompositionRunner$2 recomposer$recompositionRunner$22 = new Recomposer$recompositionRunner$2((Function0) obj2, continuation);
                recomposer$recompositionRunner$22.$block = obj;
                return recomposer$recompositionRunner$22;
            case 2:
                Recomposer$recompositionRunner$2 recomposer$recompositionRunner$23 = new Recomposer$recompositionRunner$2((Ui) this.L$1, (PresenterElement) this.this$0, (List) this.$block, (Screen) obj2, continuation);
                recomposer$recompositionRunner$23.L$0 = obj;
                return recomposer$recompositionRunner$23;
            default:
                Recomposer$recompositionRunner$2 recomposer$recompositionRunner$24 = new Recomposer$recompositionRunner$2(continuation, (SessionManager) this.L$1, (RealTabProvider.MetroFactory) this.this$0, (Lifecycle) this.$block, (BreadcrumbListener.MetroFactory) obj2);
                recomposer$recompositionRunner$24.L$0 = obj;
                return recomposer$recompositionRunner$24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 1:
                ((Recomposer$recompositionRunner$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((Recomposer$recompositionRunner$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #8 {all -> 0x00fe, blocks: (B:50:0x0116, B:51:0x0159, B:53:0x0148, B:58:0x0163, B:63:0x00fa), top: B:42:0x00e4 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlinx.coroutines.channels.Channel] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15, types: [coil3.Extras$Key, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0161 -> B:47:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0175 -> B:47:0x0148). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Ui ui, PresenterElement presenterElement, List list, Screen screen, Continuation continuation) {
        super(2, continuation);
        this.L$1 = ui;
        this.this$0 = presenterElement;
        this.$block = list;
        this.$parentFrameClock = screen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        super(2, continuation);
        this.this$0 = recomposer;
        this.$block = recomposer$runRecomposeAndApplyChanges$2;
        this.$parentFrameClock = monotonicFrameClock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$parentFrameClock = function0;
    }
}
