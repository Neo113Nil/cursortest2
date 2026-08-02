package app.cash.cdp.backend.android;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.cdp.integration.CashCdpConfigProvider;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class AndroidSessionIdProvider {
    public final AppForegroundStateProvider appForegroundStateProvider;
    public Long backgroundedTime;
    public final CashCdpConfigProvider configProvider;
    public final Function0 secondsTimestampProvider;
    public final StateFlowImpl sessionId;
    public final Function0 uuidGenerator;

    /* renamed from: app.cash.cdp.backend.android.AndroidSessionIdProvider$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(0, DBUtil.class, "defaultSecondsTimestampProvider", "defaultSecondsTimestampProvider()J", 1);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(System.currentTimeMillis() / 1000);
        }
    }

    /* renamed from: app.cash.cdp.backend.android.AndroidSessionIdProvider$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2(0, DBUtil.class, "defaultUuidGenerator", "defaultUuidGenerator()Ljava/lang/String;", 1);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boxes$$ExternalSyntheticOutline1.m();
        }
    }

    public AndroidSessionIdProvider(CashCdpConfigProvider cashCdpConfigProvider, AppForegroundStateProvider appForegroundStateProvider, CoroutineScope coroutineScope) {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        this.configProvider = cashCdpConfigProvider;
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.secondsTimestampProvider = anonymousClass1;
        this.uuidGenerator = anonymousClass2;
        this.sessionId = FlowKt.MutableStateFlow(anonymousClass2.invoke());
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$4$1$1(this, null, 8), 3);
    }
}
