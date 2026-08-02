package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ass {
    public final raa a;
    public final z66 b;
    public final xba c;
    public final uaa d;
    public final xdr e = ydr.a(mwj.b);

    public ass(raa raaVar, z66 z66Var, xba xbaVar, uaa uaaVar) {
        this.a = raaVar;
        this.b = z66Var;
        this.c = xbaVar;
        this.d = uaaVar;
    }

    public final xe a(wrs wrsVar, eca ecaVar, Context context, m mVar, qe3 qe3Var, boolean z) {
        boolean z2 = wrsVar instanceof vrs;
        raa raaVar = this.a;
        if (z2) {
            context.getClass();
            ecaVar.getClass();
            uo3 uo3Var = new uo3(z, mVar, qe3Var, this.b, raaVar, ecaVar, context);
            return new vo3(new xb5(uo3Var, Integer.valueOf(R.drawable.ic_download_24), R.string.dialog_action_download, null, null, false, Integer.valueOf(R.string.dialog_action_description_cache), null, false, false, null, 1368), dh.d);
        }
        if (Intrinsics.d(wrsVar, urs.a)) {
            ecaVar.getClass();
            lt3 lt3Var = new lt3(qe3Var, mVar, raaVar, ecaVar, 0);
            return new mt3(new xb5(lt3Var, Integer.valueOf(R.drawable.ic_close_mid_24), R.string.menu_element_cancel_download, null, null, false, Integer.valueOf(R.string.dialog_action_description_cancel_cache), null, false, false, null, 1368), dh.d);
        }
        if (!Intrinsics.d(wrsVar, trs.a)) {
            b6e.s();
            return null;
        }
        ecaVar.getClass();
        lt3 lt3Var2 = new lt3(qe3Var, mVar, raaVar, ecaVar, 1);
        return new eit(new xb5(lt3Var2, Integer.valueOf(R.drawable.ic_trash_24), R.string.dialog_action_delete_from_phone_memory, null, null, false, Integer.valueOf(R.string.dialog_action_description_uncache), null, false, false, null, 1880), dh.d);
    }
}
