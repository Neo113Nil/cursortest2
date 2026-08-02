package defpackage;

import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public final class vab implements s3z {
    @Override // defpackage.s3z
    public final Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return new sab(date, str, unsupportedMessageData);
    }

    @Override // defpackage.s3z
    public final Object j(my40 my40Var, boolean z) {
        return new qab(my40Var, z, 0);
    }

    @Override // defpackage.s3z
    public final Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        return new uab(date, techBaseMessage, str, z);
    }

    @Override // defpackage.s3z
    public final Object l(Date date) {
        return new tab(date);
    }

    @Override // defpackage.s3z
    public final Object m(Date date, RemovedMessageData removedMessageData) {
        return new rab(date, removedMessageData);
    }

    @Override // defpackage.s3z
    public final Object o(my40 my40Var, boolean z) {
        return new qab(my40Var, z, 1);
    }
}
