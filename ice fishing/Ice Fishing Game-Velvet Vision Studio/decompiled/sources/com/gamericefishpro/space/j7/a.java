package com.gamericefishpro.space.j7;

import android.media.MediaPlayer;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.w7.b e;
    public final /* synthetic */ v0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(com.gamericefishpro.space.w7.b bVar, v0 v0Var, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.e = bVar;
        this.i = v0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new a(this.e, this.i, aVar, 0);
            case 1:
                return new a(this.e, this.i, aVar, 1);
            default:
                return new a(this.e, this.i, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
        }
        return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        v0 v0Var = this.i;
        com.gamericefishpro.space.w7.b bVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                boolean zBooleanValue = ((Boolean) v0Var.getValue()).booleanValue();
                bVar.i = zBooleanValue;
                if (zBooleanValue) {
                    bVar.b();
                } else {
                    MediaPlayer mediaPlayer = bVar.b;
                    if (mediaPlayer != null) {
                        mediaPlayer.pause();
                    }
                }
                break;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                bVar.h = ((Boolean) v0Var.getValue()).booleanValue();
                break;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                bVar.j = ((Boolean) v0Var.getValue()).booleanValue();
                break;
        }
        return Unit.a;
    }
}
