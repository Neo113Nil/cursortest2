package com.onesignal.inAppMessages.internal.lifecycle.impl;

import I7.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.v;

/* loaded from: classes2.dex */
public final class a extends com.onesignal.common.events.b implements T4.b {

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0207a extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0207a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    public static final class b extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    public static final class c extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessagePageChanged(this.$message, this.$page);
        }
    }

    public static final class d extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessageWasDismissed(this.$message);
        }
    }

    public static final class e extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessageWasDisplayed(this.$message);
        }
    }

    public static final class f extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessageWillDismiss(this.$message);
        }
    }

    public static final class g extends i implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T4.a) obj);
            return v.f41353a;
        }

        public final void invoke(T4.a it) {
            h.e(it, "it");
            it.onMessageWillDisplay(this.$message);
        }
    }

    @Override // T4.b
    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.c action) {
        h.e(message, "message");
        h.e(action, "action");
        fire(new C0207a(message, action));
    }

    @Override // T4.b
    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.c action) {
        h.e(message, "message");
        h.e(action, "action");
        fire(new b(message, action));
    }

    @Override // T4.b
    public void messagePageChanged(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.g page) {
        h.e(message, "message");
        h.e(page, "page");
        fire(new c(message, page));
    }

    @Override // T4.b
    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a message) {
        h.e(message, "message");
        fire(new d(message));
    }

    @Override // T4.b
    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a message) {
        h.e(message, "message");
        fire(new e(message));
    }

    @Override // T4.b
    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a message) {
        h.e(message, "message");
        fire(new f(message));
    }

    @Override // T4.b
    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a message) {
        h.e(message, "message");
        fire(new g(message));
    }
}
