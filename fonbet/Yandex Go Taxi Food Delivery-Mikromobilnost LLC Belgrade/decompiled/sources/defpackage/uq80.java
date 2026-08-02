package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TextMessageData;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public final class uq80 implements s3z, a9b, kab {
    public final Handler a = new Handler();
    public final ServerMessageRef b;
    public emn c;

    public uq80(emn emnVar, ServerMessageRef serverMessageRef) {
        this.c = emnVar;
        this.b = serverMessageRef;
    }

    @Override // defpackage.a9b
    public final void B(j9b j9bVar) {
        r3z c;
        vq80 vq80Var;
        if (this.c == null || (c = j9bVar.b().c(this.b)) == null || (vq80Var = (vq80) c.b(this)) == null) {
            return;
        }
        this.c.b(vq80Var);
    }

    @Override // defpackage.a9b
    public final void close() {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        this.c = null;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return null;
    }

    @Override // defpackage.s3z
    public final Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        throw new IllegalArgumentException();
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object l(Date date) {
        return null;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object m(Date date, RemovedMessageData removedMessageData) {
        return null;
    }

    @Override // defpackage.s3z
    public final Object o(my40 my40Var, boolean z) {
        PlainMessage.Image image = null;
        if (!my40Var.c) {
            MessageData messageData = my40Var.g;
            if ((messageData instanceof TextMessageData) || (messageData instanceof GalleryMessageData)) {
                String str = messageData.text;
                if (str == null) {
                    str = "";
                }
                if (messageData instanceof GalleryMessageData) {
                    PlainMessage.Item[] itemArr = ((GalleryMessageData) messageData).items;
                    if (itemArr.length > 0) {
                        image = itemArr[0].image;
                    }
                }
                return new vq80(str, image);
            }
        }
        return null;
    }

    @Override // defpackage.kab
    public final void v(r3z r3zVar) {
        this.a.post(new sd30(23, this, (vq80) r3zVar.b(this)));
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        return ((m8g) s020Var).d().m(this, this.b);
    }
}
