package defpackage;

import ru.yandex.music.cover.upload.UploadCoverService;

/* loaded from: classes5.dex */
public final class qot extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ UploadCoverService k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qot(UploadCoverService uploadCoverService, cg6 cg6Var) {
        super(cg6Var);
        this.k = uploadCoverService;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object a = UploadCoverService.a(this.k, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
