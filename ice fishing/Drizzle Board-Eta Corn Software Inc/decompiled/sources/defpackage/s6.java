package defpackage;

import android.view.View;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements View.OnClickListener {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ Object wxUZMvaN;

    public /* synthetic */ s6(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.NCTxEWno;
        Object obj = this.wxUZMvaN;
        Object obj2 = this.MdtA4re8;
        switch (i) {
            case 0:
                ((b2ZJblxo) ((u6) obj2).wxUZMvaN).ow5vqvCr((py) obj);
                break;
            case 1:
                ((ix) ((u6) obj2).wxUZMvaN).ow5vqvCr((w6) obj);
                break;
            case 2:
                ((ix) ((u6) obj2).wxUZMvaN).ow5vqvCr((String) obj);
                break;
            case 3:
                ((sb0) ((u6) obj2).wxUZMvaN).ow5vqvCr((c10) obj);
                break;
            case 4:
                String str = (String) obj;
                List list = PairShelfFragment.f7oeun2L;
                wx nSmgoSB5 = ((PairShelfFragment) obj2).nSmgoSB5();
                str.getClass();
                x90 x90Var = nSmgoSB5.MdtA4re8;
                Set set = (Set) x90Var.Qr9iLBAD();
                x90Var.eVhOlqcC(null, set.contains(str) ? p60.sjUBp5pO(set, str) : p60.OxcuoDLp(set, str));
                break;
            case 5:
                ((ay) obj2).MdtA4re8.ow5vqvCr((py) obj);
                break;
            case 6:
                ((ix) ((u6) obj2).wxUZMvaN).ow5vqvCr((String) obj);
                break;
            case 7:
                ((t40) ((u6) obj2).wxUZMvaN).ow5vqvCr((py) obj);
                break;
            case 8:
                ((b2ZJblxo) ((u6) obj2).wxUZMvaN).ow5vqvCr((t70) obj);
                break;
            case 9:
                ((sb0) ((u6) obj2).wxUZMvaN).ow5vqvCr((k1) obj);
                break;
            default:
                ((t40) ((u6) obj2).wxUZMvaN).ow5vqvCr((k80) obj);
                break;
        }
    }
}
