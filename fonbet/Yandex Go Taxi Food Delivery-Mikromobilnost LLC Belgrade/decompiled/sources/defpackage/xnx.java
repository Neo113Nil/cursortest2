package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;

/* loaded from: classes3.dex */
public final class xnx implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final u1g c;

    public /* synthetic */ xnx(n3w n3wVar, u1g u1gVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = u1gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        u1g u1gVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new KycPhotoV2Fragment((hox) n3wVar.a, (npx) u1gVar.get());
            default:
                return new PhotoFragment((pjb0) n3wVar.a, (npx) u1gVar.get());
        }
    }
}
