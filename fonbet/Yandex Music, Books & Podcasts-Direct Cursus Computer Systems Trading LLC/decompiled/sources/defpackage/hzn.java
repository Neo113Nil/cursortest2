package defpackage;

/* loaded from: classes4.dex */
public final class hzn extends pxm {
    public final /* synthetic */ int c = 1;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzn(String str, String str2, String str3) {
        super(str, str2);
        str.getClass();
        this.d = str3;
    }

    @Override // defpackage.pxm
    public final void d(p3i p3iVar) {
        switch (this.c) {
            case 0:
                super.d(p3iVar);
                mj3 mj3Var = (mj3) this.d;
                p3iVar.d("uuid", (String) mj3Var.d);
                p3iVar.d("codec", (String) mj3Var.e);
                p3iVar.c(Integer.valueOf(mj3Var.c), "bitrate");
                p3iVar.c(Long.valueOf(mj3Var.b), "bufferedDurationMs");
                p3iVar.e("hasBuffer", mj3Var.a);
                p3iVar.c(500, "bufferForPlaybackMs");
                break;
            default:
                super.d(p3iVar);
                p3iVar.d("uuid", (String) this.d);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzn(String str, String str2, mj3 mj3Var) {
        super(str, str2);
        str.getClass();
        this.d = mj3Var;
    }
}
