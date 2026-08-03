package com.onesignal.inAppMessages.internal.lifecycle.impl;

import ac.o;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends com.onesignal.common.events.b implements n9.b {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0029a extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0029a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessagePageChanged(this.$message, this.$page);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessageWasDismissed(this.$message);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessageWasDisplayed(this.$message);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessageWillDismiss(this.$message);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return o.f277a;
        }

        public final void invoke(n9.a aVar) {
            j.e(aVar, "it");
            aVar.onMessageWillDisplay(this.$message);
        }
    }

    @Override // n9.b
    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        j.e(aVar, "message");
        j.e(cVar, "action");
        fire(new C0029a(aVar, cVar));
    }

    @Override // n9.b
    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        j.e(aVar, "message");
        j.e(cVar, "action");
        fire(new b(aVar, cVar));
    }

    @Override // n9.b
    public void messagePageChanged(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        j.e(aVar, "message");
        j.e(gVar, "page");
        fire(new c(aVar, gVar));
    }

    @Override // n9.b
    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar) {
        j.e(aVar, "message");
        fire(new d(aVar));
    }

    @Override // n9.b
    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar) {
        j.e(aVar, "message");
        fire(new e(aVar));
    }

    @Override // n9.b
    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a aVar) {
        j.e(aVar, "message");
        fire(new f(aVar));
    }

    @Override // n9.b
    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a aVar) {
        j.e(aVar, "message");
        fire(new g(aVar));
    }
}
