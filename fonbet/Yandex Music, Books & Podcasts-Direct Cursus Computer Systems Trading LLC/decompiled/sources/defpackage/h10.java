package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsLastCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsNextCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class h10 {
    public final f7l a;
    public final k1l b;
    public final k1l c;
    public final kxi d;
    public final ezc e;

    /* JADX WARN: Multi-variable type inference failed */
    public h10(f7l f7lVar, k1l k1lVar, k1l k1lVar2, kxi kxiVar, Function0 function0) {
        f7lVar.getClass();
        k1lVar.getClass();
        k1lVar2.getClass();
        kxiVar.getClass();
        this.a = f7lVar;
        this.b = k1lVar;
        this.c = k1lVar2;
        this.d = kxiVar;
        this.e = (ezc) function0;
    }

    public final void a(String str, oq oqVar, Collection collection) {
        oqVar.getClass();
        collection.getClass();
        this.b.a(new AddPlayablesAsLastCommand(c(str, oqVar, collection)), new b3t("queue_add"));
    }

    public final void b(String str, oq oqVar, Collection collection) {
        oqVar.getClass();
        collection.getClass();
        this.b.a(new AddPlayablesAsNextCommand(c(str, oqVar, collection)), new b3t("queue_add"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ezc, kotlin.jvm.functions.Function0] */
    public final ArrayList c(String str, oq oqVar, Collection collection) {
        String str2 = (String) this.e.invoke();
        kxi kxiVar = this.d;
        gxc gxcVar = new gxc(kxiVar.a.G(), str);
        b6v u0 = y5g.u0(oqVar);
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new jzs((mqs) it.next(), new v80(str2, gxcVar, kxiVar.b), null, null, null, null, u0, false));
        }
        return arrayList;
    }

    public final void d(Collection collection) {
        int i;
        mwk b;
        collection.getClass();
        d6l x = p6g.x((e6l) this.a.c.getValue());
        n7q n7qVar = x != null ? x.a : null;
        Collection collection2 = collection;
        if (CollectionsKt.I(collection2, (n7qVar == null || (b = n7qVar.b()) == null) ? null : b.a())) {
            List B = n7qVar != null ? y7g.B(n7qVar) : null;
            if (B != null) {
                ListIterator listIterator = B.listIterator(B.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (CollectionsKt.I(collection2, ((mwk) listIterator.previous()).a())) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                this.c.b(new eyk(u75.h(new SetQueuePositionCommand(i), new SkipCommand())), new b3t("queue_skip"));
            }
        }
    }
}
