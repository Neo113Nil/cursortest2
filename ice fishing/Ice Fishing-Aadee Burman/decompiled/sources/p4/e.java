package p4;

import B7.h;
import I7.l;
import android.content.Context;
import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import u7.v;
import z5.InterfaceC5263b;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class e extends h implements l {

    /* renamed from: n, reason: collision with root package name */
    public int f39766n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NotificationOpenedActivityHMS f39767u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Intent f39768v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, InterfaceC5267d interfaceC5267d) {
        super(1, interfaceC5267d);
        this.f39767u = notificationOpenedActivityHMS;
        this.f39768v = intent;
    }

    @Override // B7.a
    public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
        return new e(this.f39767u, this.f39768v, interfaceC5267d);
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        return ((e) create((InterfaceC5267d) obj)).invokeSuspend(v.f41350a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // B7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f39766n;
        v vVar = v.f41350a;
        NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.f39767u;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            Context applicationContext = notificationOpenedActivityHMS.getApplicationContext();
            kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
            this.f39766n = 1;
            obj = g.b(applicationContext, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return vVar;
            }
            com.bumptech.glide.d.k(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC5263b interfaceC5263b = (InterfaceC5263b) g.a().getService(InterfaceC5263b.class);
            this.f39766n = 2;
            if (interfaceC5263b.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, this.f39768v, this) == aVar) {
                return aVar;
            }
        }
        return vVar;
    }
}
