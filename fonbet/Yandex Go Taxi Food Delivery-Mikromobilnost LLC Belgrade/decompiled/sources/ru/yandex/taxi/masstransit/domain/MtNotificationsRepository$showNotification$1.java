package ru.yandex.taxi.masstransit.domain;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.masstransit.design.ui_components.IconNotificationComponent;
import defpackage.fq30;
import defpackage.g16;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.obv;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtNotificationsRepository$showNotification$1", f = "MtNotificationsRepository.kt", l = {60, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtNotificationsRepository$showNotification$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    final /* synthetic */ String $iconTag;
    final /* synthetic */ CharSequence $subtitle;
    final /* synthetic */ long $timeout;
    final /* synthetic */ CharSequence $title;
    Object L$0;
    int label;
    final /* synthetic */ fq30 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.domain.MtNotificationsRepository$showNotification$1$1", f = "MtNotificationsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.domain.MtNotificationsRepository$showNotification$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ long $delay;
        final /* synthetic */ Bitmap $icon;
        final /* synthetic */ CharSequence $subtitle;
        final /* synthetic */ long $timeout;
        final /* synthetic */ CharSequence $title;
        int label;
        final /* synthetic */ fq30 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fq30 fq30Var, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2, long j, long j2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fq30Var;
            this.$icon = bitmap;
            this.$title = charSequence;
            this.$subtitle = charSequence2;
            this.$delay = j;
            this.$timeout = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$icon, this.$title, this.$subtitle, this.$delay, this.$timeout, continuation);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            fq30 fq30Var = this.this$0;
            Context context = fq30Var.a;
            String uuid = UUID.randomUUID().toString();
            fq30Var.f.add(uuid);
            IconNotificationComponent iconNotificationComponent = new IconNotificationComponent(context, uuid, this.$icon, this.$title, this.$subtitle);
            fq30 fq30Var2 = this.this$0;
            tje.N(fq30Var2.d, null, null, new MtNotificationsRepository$showNotification$2(this.$delay, fq30Var2, iconNotificationComponent, this.$timeout, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtNotificationsRepository$showNotification$1(String str, fq30 fq30Var, CharSequence charSequence, CharSequence charSequence2, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$iconTag = str;
        this.this$0 = fq30Var;
        this.$title = charSequence;
        this.$subtitle = charSequence2;
        this.$delay = j;
        this.$timeout = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtNotificationsRepository$showNotification$1(this.$iconTag, this.this$0, this.$title, this.$subtitle, this.$delay, this.$timeout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtNotificationsRepository$showNotification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (defpackage.tje.k0(r2, r6, r16) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r2 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$iconTag;
            if (str != null) {
                g16 c = this.this$0.b.b().i(new obv(str, null, 6, 0)).c();
                this.L$0 = null;
                this.label = 1;
                b = ru.yandex.taxi.utils.a.b(c, this);
            } else {
                bitmap = null;
                this.this$0.e.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, bitmap, this.$title, this.$subtitle, this.$delay, this.$timeout, null);
                this.L$0 = null;
                this.label = 2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        bitmap = (Bitmap) b;
        this.this$0.e.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, bitmap, this.$title, this.$subtitle, this.$delay, this.$timeout, null);
        this.L$0 = null;
        this.label = 2;
    }
}
