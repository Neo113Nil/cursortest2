package ru.yandex.video.m3.preload_manager;

import defpackage.inm;
import defpackage.jnm;
import defpackage.mnm;
import defpackage.nnm;
import defpackage.pnm;
import defpackage.su4;
import defpackage.uif;
import defpackage.wnm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class h extends uif implements Function0 {
    public final /* synthetic */ VideoData r;
    public final /* synthetic */ inm s;
    public final /* synthetic */ jnm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(VideoData videoData, inm inmVar, jnm jnmVar) {
        super(0);
        this.r = videoData;
        this.s = inmVar;
        this.t = jnmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VideoData videoData = this.r;
        inm inmVar = this.s;
        pnm pnmVar = inmVar.j;
        try {
            String a = mnm.a(videoData);
            wnm wnmVar = inmVar.n;
            nnm b = pnmVar.b(a);
            jnm jnmVar = this.t;
            if (b != null && !Intrinsics.d(b.c, jnmVar)) {
                pnmVar.getClass();
                jnmVar.getClass();
                pnmVar.e(b);
                pnmVar.a(nnm.a(jnmVar, b), false);
            }
            nnm c = wnmVar.c(a);
            if (c != null && !Intrinsics.d(c.c, jnmVar)) {
                wnmVar.f(jnmVar, c);
            }
        } catch (Throwable th) {
            inmVar.m.c(videoData, new PreloadException.ApiCallError(su4.p(th, new StringBuilder("Error in setPriority: ")), th, 0L, 4, null));
        }
        return Unit.a;
    }
}
