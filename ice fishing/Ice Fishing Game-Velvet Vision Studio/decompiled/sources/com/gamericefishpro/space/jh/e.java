package com.gamericefishpro.space.jh;

import com.gamericefishpro.space.fc.l;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e extends l {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.ei.l implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.gamericefishpro.space.gd.b prefs) {
        super(a.INSTANCE, "subscriptions", prefs);
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }

    @Override // com.gamericefishpro.space.fc.k, com.gamericefishpro.space.fc.c
    public void replaceAll(List<d> models, String tag) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!Intrinsics.a(tag, "HYDRATE")) {
            super.replaceAll(models, tag);
            return;
        }
        synchronized (models) {
            try {
                for (d dVar : models) {
                    if (dVar.getType() == g.PUSH) {
                        d dVar2 = (d) get(dVar.getId());
                        if (dVar2 == null) {
                            break;
                        }
                        dVar.setSdk(dVar2.getSdk());
                        dVar.setDeviceOS(dVar2.getDeviceOS());
                        dVar.setCarrier(dVar2.getCarrier());
                        dVar.setAppVersion(dVar2.getAppVersion());
                        dVar.setStatus(dVar2.getStatus());
                        break;
                    }
                }
                super.replaceAll(models, tag);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
