package com.gamericefishpro.space.f7;

import android.media.MediaPlayer;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.oh.s;
import com.gamericefishpro.space.pi.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new e((String) this.e, aVar, 0);
            default:
                return new e((com.gamericefishpro.space.w7.b) this.e, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                try {
                    String externalId = (String) obj2;
                    s sVar = com.gamericefishpro.space.xb.c.a;
                    Intrinsics.checkNotNullParameter(externalId, "externalId");
                    ((com.gamericefishpro.space.xb.a) com.gamericefishpro.space.xb.c.a.getValue()).login(externalId);
                    break;
                } catch (Exception unused) {
                }
                break;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) obj2;
                if (!bVar.g) {
                    bVar.g = true;
                    bVar.b();
                }
                if (bVar.b == null) {
                    MediaPlayer mediaPlayerCreate = MediaPlayer.create(bVar.a, R.raw.music);
                    if (mediaPlayerCreate != null) {
                        mediaPlayerCreate.setLooping(true);
                    } else {
                        mediaPlayerCreate = null;
                    }
                    bVar.b = mediaPlayerCreate;
                }
                bVar.b();
                break;
        }
        return Unit.a;
    }
}
