package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class vrb implements abu, gt3, ogl {
    public abu a;
    public gt3 b;
    public abu c;
    public gt3 d;

    @Override // defpackage.ogl
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (abu) obj;
            return;
        }
        if (i == 8) {
            this.b = (gt3) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        l6r l6rVar = (l6r) obj;
        if (l6rVar == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = l6rVar.getVideoFrameMetadataListener();
            this.d = l6rVar.getCameraMotionListener();
        }
    }

    @Override // defpackage.abu
    public final void b(long j, long j2, dsc dscVar, MediaFormat mediaFormat) {
        long j3;
        long j4;
        dsc dscVar2;
        MediaFormat mediaFormat2;
        abu abuVar = this.c;
        if (abuVar != null) {
            abuVar.b(j, j2, dscVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            dscVar2 = dscVar;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            dscVar2 = dscVar;
            mediaFormat2 = mediaFormat;
        }
        abu abuVar2 = this.a;
        if (abuVar2 != null) {
            abuVar2.b(j3, j4, dscVar2, mediaFormat2);
        }
    }

    @Override // defpackage.gt3
    public final void c(long j, float[] fArr) {
        gt3 gt3Var = this.d;
        if (gt3Var != null) {
            gt3Var.c(j, fArr);
        }
        gt3 gt3Var2 = this.b;
        if (gt3Var2 != null) {
            gt3Var2.c(j, fArr);
        }
    }

    @Override // defpackage.gt3
    public final void d() {
        gt3 gt3Var = this.d;
        if (gt3Var != null) {
            gt3Var.d();
        }
        gt3 gt3Var2 = this.b;
        if (gt3Var2 != null) {
            gt3Var2.d();
        }
    }
}
