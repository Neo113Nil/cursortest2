package defpackage;

/* loaded from: classes.dex */
public final class shh extends qhh {
    public final /* synthetic */ nuh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shh(nuh nuhVar) {
        super(nuhVar);
        this.k = nuhVar;
    }

    @Override // defpackage.gs4
    public final xth s() {
        nuh nuhVar = this.k;
        jhh jhhVar = nuhVar.f;
        if (jhhVar == null) {
            xq0.q("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
        if (jhhVar != nuhVar.c) {
            return jhhVar.d;
        }
        mhh mhhVar = (mhh) this.b;
        mhhVar.getClass();
        return new xth(mhhVar.getCurrentBrowserInfo());
    }
}
