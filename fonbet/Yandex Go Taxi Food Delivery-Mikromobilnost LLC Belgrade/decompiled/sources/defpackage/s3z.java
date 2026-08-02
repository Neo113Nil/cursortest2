package defpackage;

import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public interface s3z {
    Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData);

    default Object j(my40 my40Var, boolean z) {
        return o(my40Var, z);
    }

    Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z);

    Object l(Date date);

    Object m(Date date, RemovedMessageData removedMessageData);

    Object o(my40 my40Var, boolean z);
}
