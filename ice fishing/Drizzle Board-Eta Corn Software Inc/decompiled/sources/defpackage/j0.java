package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.kolosta.rejin.jilosa.core.common.Application;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j0 implements ul {
    public final Object VgvYg0wo;
    public volatile tl wxUZMvaN;
    public final /* synthetic */ int NCTxEWno = 1;
    public final Object MdtA4re8 = new Object();

    public j0(tg0 tg0Var) {
        this.VgvYg0wo = tg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    public static final Context MdtA4re8(ig0 ig0Var) {
        ig0 ig0Var2 = ig0Var;
        while ((ig0Var2 instanceof ContextWrapper) && !(ig0Var2 instanceof Activity)) {
            ig0Var2 = ig0Var2.getBaseContext();
        }
        return ig0Var2;
    }

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        switch (this.NCTxEWno) {
            case 0:
                if (((la) this.wxUZMvaN) == null) {
                    synchronized (this.MdtA4re8) {
                        try {
                            if (((la) this.wxUZMvaN) == null) {
                                this.wxUZMvaN = new la(new k0((Application) ((tg0) this.VgvYg0wo).MdtA4re8, false));
                            }
                        } finally {
                        }
                    }
                }
                return (la) this.wxUZMvaN;
            default:
                if (((ja) this.wxUZMvaN) == null) {
                    synchronized (this.MdtA4re8) {
                        try {
                            if (((ja) this.wxUZMvaN) == null) {
                                this.wxUZMvaN = qoPGr6Ce();
                            }
                        } finally {
                        }
                    }
                }
                return (ja) this.wxUZMvaN;
        }
    }

    public ja qoPGr6Ce() {
        li liVar = (li) this.VgvYg0wo;
        ni niVar = liVar.I5GHvsYW;
        if ((niVar == null ? null : niVar.Ey6iv0m0) == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        ej0.P7K7Inc8((niVar == null ? null : niVar.Ey6iv0m0) instanceof vl, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (niVar == null ? null : niVar.Ey6iv0m0).getClass());
        ni niVar2 = liVar.I5GHvsYW;
        ga gaVar = (ga) ((pi) fn.ow5vqvCr(niVar2 != null ? niVar2.Ey6iv0m0 : null, pi.class));
        la laVar = gaVar.qoPGr6Ce;
        return new ja(gaVar.MdtA4re8);
    }

    public j0(li liVar) {
        this.VgvYg0wo = liVar;
    }
}
