package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class aq extends bq implements to {
    public final vo P7K7Inc8;
    public final /* synthetic */ nt b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(nt ntVar, vo voVar, qj qjVar) {
        super(ntVar, qjVar);
        this.b2ZJblxo = ntVar;
        this.P7K7Inc8 = voVar;
    }

    @Override // defpackage.bq
    public final boolean MdtA4re8(vo voVar) {
        return this.P7K7Inc8 == voVar;
    }

    @Override // defpackage.bq
    public final void NCTxEWno() {
        this.P7K7Inc8.b2ZJblxo().P7K7Inc8(this);
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        vo voVar2 = this.P7K7Inc8;
        po poVar = voVar2.b2ZJblxo().MdtA4re8;
        if (poVar != po.NCTxEWno) {
            po poVar2 = null;
            while (poVar2 != poVar) {
                qoPGr6Ce(wxUZMvaN());
                poVar2 = poVar;
                poVar = voVar2.b2ZJblxo().MdtA4re8;
            }
            return;
        }
        nt ntVar = this.b2ZJblxo;
        ntVar.getClass();
        nt.qoPGr6Ce("removeObserver");
        bq bqVar = (bq) ntVar.NCTxEWno.NCTxEWno(this.NCTxEWno);
        if (bqVar == null) {
            return;
        }
        bqVar.NCTxEWno();
        bqVar.qoPGr6Ce(false);
    }

    @Override // defpackage.bq
    public final boolean wxUZMvaN() {
        return this.P7K7Inc8.b2ZJblxo().MdtA4re8.compareTo(po.VgvYg0wo) >= 0;
    }
}
