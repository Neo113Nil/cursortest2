package defpackage;

import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.internal.view.chat.e;
import com.yandex.messaging.ui.timeline.b;

/* loaded from: classes15.dex */
public final class ycz0 {
    public final ChatSearchToolbarBrick a;
    public final c b;
    public final e c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final dbb g;
    public final b h;
    public boolean i;

    public ycz0(ChatSearchToolbarBrick chatSearchToolbarBrick, c cVar, e eVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, dbb dbbVar, b bVar) {
        this.a = chatSearchToolbarBrick;
        this.b = cVar;
        this.c = eVar;
        this.d = h3yVar;
        this.e = h3yVar2;
        this.f = h3yVar3;
        this.g = dbbVar;
        this.h = bVar;
    }

    public final void a() {
        if (this.i) {
            b bVar = this.h;
            bVar.getClass();
            bVar.c(new d8b(bVar, 2));
            this.i = false;
            this.a.hideSearch();
            c cVar = this.b;
            cVar.M = true;
            cVar.r();
            e eVar = this.c;
            if (eVar.z != null) {
                eVar.C = false;
                eVar.u();
            }
            com.yandex.messaging.input.c cVar2 = (com.yandex.messaging.input.c) this.d.get();
            cVar2.h = false;
            cVar2.c();
        }
    }
}
