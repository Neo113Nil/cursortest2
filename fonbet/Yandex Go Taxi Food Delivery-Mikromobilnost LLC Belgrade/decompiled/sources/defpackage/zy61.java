package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class zy61 extends in71 {
    public final /* synthetic */ int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy61(Context context, fe81 fe81Var, ge71 ge71Var, String str, String str2, sl81 sl81Var, i971 i971Var, dj81 dj81Var, i871 i871Var, y381 y381Var, int i, int i2) {
        super(context, fe81Var, ge71Var, str, str2, sl81Var, i971Var, dj81Var, i871Var, y381Var, i);
        this.J = i2;
    }

    @Override // defpackage.in71
    public boolean e(gb81 gb81Var, int i) {
        switch (this.J) {
            case 0:
                return super.e(gb81Var, i) || 204 == i;
            default:
                return super.e(gb81Var, i);
        }
    }
}
