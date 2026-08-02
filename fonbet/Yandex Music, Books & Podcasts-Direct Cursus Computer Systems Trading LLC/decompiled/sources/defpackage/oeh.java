package defpackage;

/* loaded from: classes3.dex */
public final class oeh extends cg6 {
    public rxv j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rxv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeh(rxv rxvVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rxvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return rxv.c(this.l, this);
    }
}
