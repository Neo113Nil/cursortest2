package defpackage;

import com.yandex.messaging.internal.entities.TechBaseMessage;
import java.util.Date;

/* loaded from: classes15.dex */
public final /* synthetic */ class uab implements r3z {
    public final /* synthetic */ Date a;
    public final /* synthetic */ TechBaseMessage b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ uab(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        this.a = date;
        this.b = techBaseMessage;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.r3z
    public final Object b(s3z s3zVar) {
        return s3zVar.k(this.a, this.b, this.c, this.d);
    }
}
