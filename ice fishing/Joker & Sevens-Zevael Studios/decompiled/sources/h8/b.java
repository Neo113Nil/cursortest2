package h8;

import ac.o;
import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import hc.j;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends j implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public int f2865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f2866h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ NotificationOpenedActivityHMS f2867i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Intent f2868j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, fc.d dVar) {
        super(1, dVar);
        this.f2866h = sVar;
        this.f2867i = notificationOpenedActivityHMS;
        this.f2868j = intent;
    }

    @Override // hc.a
    public final fc.d create(fc.d dVar) {
        return new b(this.f2866h, this.f2867i, this.f2868j, dVar);
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        return ((b) create((fc.d) obj)).invokeSuspend(o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f2865g;
        if (i10 == 0) {
            v6.a.W(obj);
            ta.b bVar = (ta.b) this.f2866h.f5683g;
            this.f2865g = 1;
            Object handleHMSNotificationOpenIntent = bVar.handleHMSNotificationOpenIntent(this.f2867i, this.f2868j, this);
            gc.a aVar = gc.a.f2559g;
            if (handleHMSNotificationOpenIntent == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
        }
        return o.f277a;
    }
}
