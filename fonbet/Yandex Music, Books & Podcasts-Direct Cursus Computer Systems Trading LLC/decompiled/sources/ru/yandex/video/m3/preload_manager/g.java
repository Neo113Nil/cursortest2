package ru.yandex.video.m3.preload_manager;

import defpackage.inm;
import defpackage.mnm;
import defpackage.nnm;
import defpackage.pnm;
import defpackage.su4;
import defpackage.uif;
import defpackage.wnm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class g extends uif implements Function0 {
    public final /* synthetic */ VideoData r;
    public final /* synthetic */ inm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(VideoData videoData, inm inmVar) {
        super(0);
        this.r = videoData;
        this.s = inmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VideoData videoData = this.r;
        inm inmVar = this.s;
        d dVar = inmVar.m;
        pnm pnmVar = inmVar.j;
        try {
            String a = mnm.a(videoData);
            wnm wnmVar = inmVar.n;
            nnm b = pnmVar.b(a);
            if (b != null) {
                pnmVar.e(b);
                dVar.d(b, new PreloadException.CanceledOperationException.CanceledPendingRequest("Canceled pending request while waiting in queue", null, 2, null));
            }
            nnm c = wnmVar.c(a);
            if (c != null) {
                wnmVar.b(c);
            }
        } catch (Throwable th) {
            dVar.c(videoData, new PreloadException.ApiCallError(su4.p(th, new StringBuilder("Error in cancelPriority: ")), th, 0L, 4, null));
        }
        return Unit.a;
    }
}
