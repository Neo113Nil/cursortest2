package ru.yandex.video.m3.preload_manager;

import defpackage.chs;
import defpackage.inm;
import defpackage.ngl;
import defpackage.nnm;
import defpackage.uif;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class f extends uif implements Function0 {
    public final /* synthetic */ inm r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(inm inmVar) {
        super(0);
        this.r = inmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        inm inmVar = this.r;
        try {
            Iterator it = inmVar.j.d().iterator();
            while (it.hasNext()) {
                inmVar.m.d((nnm) it.next(), new PreloadException.CanceledOperationException.CanceledPendingRequest("Canceled pending requests while waiting in queue", null, 2, null));
            }
            inmVar.n.a();
        } catch (Throwable th) {
            chs chsVar = inmVar.l;
            chsVar.getClass();
            ngl.r(chsVar, "PreloadManagerImpl", "cancelAllPreloads", null, th, new Object[0], 4);
        }
        return Unit.a;
    }
}
