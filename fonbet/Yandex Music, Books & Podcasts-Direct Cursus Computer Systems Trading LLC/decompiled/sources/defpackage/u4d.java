package defpackage;

import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class u4d extends v8n {
    public final c c;
    public final dgr d;
    public final gxc e;

    public u4d(c cVar, dgr dgrVar, gxc gxcVar) {
        super(cVar);
        this.c = cVar;
        this.d = dgrVar;
        this.e = gxcVar;
    }

    @Override // defpackage.v8n
    public final Object a(w8n w8nVar) {
        return w8nVar.o(this);
    }

    @Override // defpackage.v8n
    public final String b() {
        return "GenerativeQueueDescriptor{}";
    }
}
