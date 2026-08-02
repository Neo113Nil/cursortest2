package p4;

import B7.h;
import I7.l;
import android.content.Context;
import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import u7.v;
import z5.InterfaceC5236b;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class e extends h implements l {

    /* renamed from: n, reason: collision with root package name */
    public int f39816n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NotificationOpenedActivityHMS f39817u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Intent f39818v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, InterfaceC5240d interfaceC5240d) {
        super(1, interfaceC5240d);
        this.f39817u = notificationOpenedActivityHMS;
        this.f39818v = intent;
    }

    @Override // B7.a
    public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
        return new e(this.f39817u, this.f39818v, interfaceC5240d);
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        return ((e) create((InterfaceC5240d) obj)).invokeSuspend(v.f41073a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // B7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f39816n;
        v vVar = v.f41073a;
        NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.f39817u;
        if (i == 0) {
            Q3.b.s(obj);
            Context applicationContext = notificationOpenedActivityHMS.getApplicationContext();
            kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
            this.f39816n = 1;
            obj = g.b(applicationContext, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
                return vVar;
            }
            Q3.b.s(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC5236b interfaceC5236b = (InterfaceC5236b) g.a().getService(InterfaceC5236b.class);
            this.f39816n = 2;
            if (interfaceC5236b.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, this.f39818v, this) == aVar) {
                return aVar;
            }
        }
        return vVar;
    }
}
