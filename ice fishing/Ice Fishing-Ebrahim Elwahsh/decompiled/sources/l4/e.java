package l4;

import E7.l;
import android.content.Context;
import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import q7.v;
import v5.InterfaceC5129b;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class e extends h implements l {

    /* renamed from: n, reason: collision with root package name */
    public int f39049n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NotificationOpenedActivityHMS f39050u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Intent f39051v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, InterfaceC5133d interfaceC5133d) {
        super(1, interfaceC5133d);
        this.f39050u = notificationOpenedActivityHMS;
        this.f39051v = intent;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
        return new e(this.f39050u, this.f39051v, interfaceC5133d);
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        return ((e) create((InterfaceC5133d) obj)).invokeSuspend(v.f40183a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // x7.AbstractC5217a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f39049n;
        v vVar = v.f40183a;
        NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.f39050u;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            Context applicationContext = notificationOpenedActivityHMS.getApplicationContext();
            kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
            this.f39049n = 1;
            obj = g.b(applicationContext, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return vVar;
            }
            com.bumptech.glide.f.r(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC5129b interfaceC5129b = (InterfaceC5129b) g.a().getService(InterfaceC5129b.class);
            this.f39049n = 2;
            if (interfaceC5129b.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, this.f39051v, this) == enumC5179a) {
                return enumC5179a;
            }
        }
        return vVar;
    }
}
