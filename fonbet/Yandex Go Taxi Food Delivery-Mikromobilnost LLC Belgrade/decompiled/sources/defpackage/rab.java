package defpackage;

import com.yandex.messaging.internal.entities.RemovedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public final /* synthetic */ class rab implements r3z {
    public final /* synthetic */ Date a;
    public final /* synthetic */ RemovedMessageData b;

    public /* synthetic */ rab(Date date, RemovedMessageData removedMessageData) {
        this.a = date;
        this.b = removedMessageData;
    }

    @Override // defpackage.r3z
    public final Object b(s3z s3zVar) {
        return s3zVar.m(this.a, this.b);
    }
}
