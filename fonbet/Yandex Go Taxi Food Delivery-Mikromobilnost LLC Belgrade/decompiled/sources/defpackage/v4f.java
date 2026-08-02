package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment;
import com.yandex.messaging.ui.folders.e;

/* loaded from: classes15.dex */
public final class v4f implements wls {
    public final /* synthetic */ tic a;
    public final /* synthetic */ m3u0 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ e y;

    public v4f(tic ticVar, m3u0 m3u0Var, oz40 oz40Var, sls slsVar, m3u0 m3u0Var2, e eVar) {
        this.a = ticVar;
        this.b = m3u0Var;
        this.c = oz40Var;
        this.w = slsVar;
        this.x = m3u0Var2;
        this.y = eVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean CreateEditFolderDialogRoot$lambda$9;
        boolean CreateEditFolderDialogRoot$lambda$92;
        int i;
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        m3u0 m3u0Var = this.b;
        CreateEditFolderDialogRoot$lambda$9 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$9(m3u0Var);
        m3u0 m3u0Var2 = this.c;
        if (CreateEditFolderDialogRoot$lambda$9) {
            ((Boolean) m3u0Var2.getValue()).booleanValue();
        }
        CreateEditFolderDialogRoot$lambda$92 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$9(m3u0Var);
        int i2 = 1;
        boolean z = false;
        if (CreateEditFolderDialogRoot$lambda$92 && ((Boolean) m3u0Var2.getValue()).booleanValue()) {
            i = 0;
        } else {
            i = 0;
            z = true;
        }
        g.b(this.a, z, null, k.d(sb2.K(100, i, null, 6), null, 14), k.l(sb2.K(200, i, null, 6), null, 14), null, wwg.S(1788744908, true, new s0n0(i2, this.w, this.x, this.y), fidVar), fidVar, 1600512, 18);
        return zy11.a;
    }
}
