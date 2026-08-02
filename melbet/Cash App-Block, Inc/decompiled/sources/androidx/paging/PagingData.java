package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class PagingData {
    public final Function0 cachedPageEvent;
    public final Flow flow;
    public final HintReceiver hintReceiver;
    public final UiReceiver uiReceiver;
    public static final PagingData$Companion$NOOP_UI_RECEIVER$1 NOOP_UI_RECEIVER = new PagingData$Companion$NOOP_UI_RECEIVER$1();
    public static final PagingData$Companion$NOOP_UI_RECEIVER$1 NOOP_HINT_RECEIVER = new PagingData$Companion$NOOP_UI_RECEIVER$1();

    /* renamed from: androidx.paging.PagingData$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    public PagingData(Flow flow, UiReceiver uiReceiver, HintReceiver hintReceiver, Function0 function0) {
        uiReceiver.getClass();
        hintReceiver.getClass();
        this.flow = flow;
        this.uiReceiver = uiReceiver;
        this.hintReceiver = hintReceiver;
        this.cachedPageEvent = function0;
    }
}
