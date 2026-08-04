package com.gamericefishpro.space.yd;

import com.gamericefishpro.space.ei.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.dc.b implements com.gamericefishpro.space.xd.b {

    /* JADX INFO: renamed from: com.gamericefishpro.space.yd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0075a extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.c $action;
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0075a(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.c $action;
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;
        final /* synthetic */ com.gamericefishpro.space.qd.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessagePageChanged(this.$message, this.$page);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWasDismissed(this.$message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWasDisplayed(this.$message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWillDismiss(this.$message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.xd.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.xd.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWillDisplay(this.$message);
        }
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messageActionOccurredOnMessage(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.qd.c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        fire(new C0075a(message, action));
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messageActionOccurredOnPreview(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.qd.c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        fire(new b(message, action));
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messagePageChanged(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.qd.g page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        fire(new c(message, page));
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messageWasDismissed(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new d(message));
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messageWasDisplayed(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new e(message));
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messageWillDismiss(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new f(message));
    }

    @Override // com.gamericefishpro.space.xd.b
    public void messageWillDisplay(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new g(message));
    }
}
