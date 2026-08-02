package defpackage;

import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class uid extends v8n {
    public final ced c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uid(c cVar, ced cedVar) {
        super(cVar);
        cedVar.getClass();
        this.c = cedVar;
    }

    @Override // defpackage.v8n
    public final Object a(w8n w8nVar) {
        return w8nVar.b(this);
    }

    @Override // defpackage.v8n
    public final String b() {
        return hrg.q("GlagolRemoteQueueDescriptor{station=", this.c.b.getName(), "}");
    }
}
