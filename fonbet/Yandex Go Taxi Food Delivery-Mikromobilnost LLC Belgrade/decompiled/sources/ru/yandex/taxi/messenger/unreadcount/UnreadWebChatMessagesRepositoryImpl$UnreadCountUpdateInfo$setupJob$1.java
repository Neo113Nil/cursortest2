package ru.yandex.taxi.messenger.unreadcount;

import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.f8b;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.of11;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wx11;
import defpackage.z221;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.messenger.unreadcount.UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1", f = "UnreadWebChatMessagesRepositoryImpl.kt", l = {53, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ z221 this$0;
    final /* synthetic */ a this$1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.messenger.unreadcount.UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1$1", f = "UnreadWebChatMessagesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.messenger.unreadcount.UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $chatId;
        int label;
        final /* synthetic */ a this$0;
        final /* synthetic */ z221 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z221 z221Var, String str, Continuation continuation, a aVar) {
            super(2, continuation);
            this.this$0 = aVar;
            this.this$1 = z221Var;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$1, this.$chatId, continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            zy11 zy11Var = zy11.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            if (this.this$0.c) {
                return zy11Var;
            }
            Cancelable cancelable = this.this$0.d;
            if (cancelable != null) {
                cancelable.cancel();
            }
            this.this$0.d = ((WebMessenger) this.this$1.a.get()).b(new f8b(this.$chatId), new of11(18), new wx11(5, this.this$0));
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1(z221 z221Var, String str, Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = z221Var;
        this.this$1 = aVar;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1(this.this$0, this.$chatId, continuation, this.this$1);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnreadWebChatMessagesRepositoryImpl$UnreadCountUpdateInfo$setupJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (defpackage.tje.k0(r8, r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r8.a(r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ru.yandex.taxi.messenger.domain.a aVar = this.this$0.b;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.this$0.c.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$chatId, null, this.this$1);
        this.label = 2;
    }
}
