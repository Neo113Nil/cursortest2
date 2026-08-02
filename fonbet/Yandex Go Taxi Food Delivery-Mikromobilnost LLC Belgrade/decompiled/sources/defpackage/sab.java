package defpackage;

import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public final /* synthetic */ class sab implements r3z {
    public final /* synthetic */ Date a;
    public final /* synthetic */ String b;
    public final /* synthetic */ UnsupportedMessageData c;

    public /* synthetic */ sab(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        this.a = date;
        this.b = str;
        this.c = unsupportedMessageData;
    }

    @Override // defpackage.r3z
    public final Object b(s3z s3zVar) {
        return s3zVar.g(this.a, this.b, this.c);
    }
}
