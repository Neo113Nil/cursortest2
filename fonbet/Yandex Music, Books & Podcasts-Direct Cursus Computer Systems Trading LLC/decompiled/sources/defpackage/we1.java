package defpackage;

import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class we1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ xe1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we1(xe1 xe1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = xe1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new we1(this.l, continuation, 0);
            default:
                return new we1(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((we1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        xe1 xe1Var = this.l;
        int i2 = 0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cf1 cf1Var = xe1Var.a;
                bca bcaVar = new bca(zsd.s0((xdr) cf1Var.i.c.b, new ze1(cf1Var, continuation, i2)), 18);
                this.k = 1;
                Object g0 = zsd.g0(bcaVar, this);
                return g0 == nm6Var ? nm6Var : g0;
            default:
                cf1 cf1Var2 = xe1Var.a;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    we1 we1Var = new we1(xe1Var, continuation, i2);
                    this.k = 1;
                    obj = tyf.L(5000L, we1Var, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                u51 u51Var = (u51) obj;
                if (u51Var != null) {
                    ve1 ve1Var = xe1Var.b;
                    int i5 = 0;
                    int i6 = 0;
                    m71 m71Var = new m71(i6, cf1Var2, cf1.class, "requestScrollToBlock", "requestScrollToBlock()V", i5, 15);
                    m71 m71Var2 = new m71(i6, cf1Var2, cf1.class, "markDialogDisplayed", "markDialogDisplayed()V", i5, 16);
                    y yVar = ve1Var.b;
                    pu0 t = pd.t(new qzm[0]);
                    yVar.getClass();
                    cvo cvoVar = cvo.i;
                    sk3.V(yVar, o6m.b(wjb.ArtistPickScreen, new avo(pkb.Artist, u51Var.a), 2), new sai(false), (r11 & 4) != 0 ? "BOTTOM_SHEET_DIALOG_TAG" : "OpenWaveRenameBottomSheet", t, null, new wn5(new fb1(2, m71Var2, u51Var, m71Var), 1967952633, true));
                }
                return Unit.a;
        }
    }
}
