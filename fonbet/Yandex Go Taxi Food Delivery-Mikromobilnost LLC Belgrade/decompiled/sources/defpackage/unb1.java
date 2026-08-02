package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.yandex.go.masstransit.sdk.checkout.impl.uicomponents.ModalTitleSize;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public abstract class unb1 {
    public static final void a(f530 f530Var, CharSequence charSequence, ModalTitleSize modalTitleSize, fid fidVar, int i, int i2) {
        f530 f530Var2;
        ModalTitleSize modalTitleSize2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1329655203);
        int i3 = i | 6 | (btsVar.k(charSequence) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(modalTitleSize == null ? -1 : modalTitleSize.ordinal()) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            ModalTitleSize modalTitleSize3 = i4 != 0 ? ModalTitleSize.M : modalTitleSize;
            j690 paddingValues = modalTitleSize3.getPaddingValues();
            c530 c530Var = c530.a;
            ydb1.a(an91.j(c530Var, paddingValues), null, wwg.S(-2023060622, true, new or9(5, charSequence), btsVar), null, null, null, modalTitleSize3.getSlotSize(), false, btsVar, 384, 186);
            f530Var2 = c530Var;
            modalTitleSize2 = modalTitleSize3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            modalTitleSize2 = modalTitleSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(f530Var2, (Object) charSequence, (Object) modalTitleSize2, i, i2, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pey b(Context context) {
        if (context instanceof pey) {
            return (pey) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Object baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof pey) {
            return (pey) baseContext;
        }
        return null;
    }

    public static d3b1 c(fsy0 fsy0Var) {
        v7b1 v7b1Var = (v7b1) qk20.c().a(v7b1.class);
        gsy0 gsy0Var = (gsy0) v7b1Var.a.b(fsy0Var);
        alo aloVar = v7b1Var.b;
        fsy0Var.getClass();
        return new d3b1(gsy0Var, (Executor) aloVar.a.get(), otb1.e(fsy0Var.b()), fsy0Var);
    }
}
