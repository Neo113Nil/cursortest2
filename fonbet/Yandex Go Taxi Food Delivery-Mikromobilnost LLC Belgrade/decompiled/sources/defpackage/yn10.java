package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import java.util.Collections;

/* loaded from: classes3.dex */
public final /* synthetic */ class yn10 implements ev31 {
    public final /* synthetic */ Context a;

    public /* synthetic */ yn10(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        Throwable th;
        fxy0 fxy0Var;
        dn10 dn10Var = (dn10) obj;
        u8j0 u8j0Var = dn10Var.a;
        pk10 pk10Var = (pk10) u8j0Var.a();
        String str = (pk10Var == null || (fxy0Var = pk10Var.c) == null) ? null : (String) fxy0Var.a(this.a);
        b bVar = ColorModel.Hex.Companion;
        ColorModel attr = new ColorModel.Attr(ung0.ybColor_background_secondary);
        bVar.getClass();
        ColorModel a = b.a(str);
        ColorModel colorModel = a == null ? attr : a;
        boolean z = u8j0Var instanceof s8j0;
        s8j0 s8j0Var = z ? (s8j0) u8j0Var : null;
        kao a2 = (s8j0Var == null || (th = s8j0Var.a) == null) ? null : r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
        boolean z2 = dn10Var.d;
        boolean z3 = u8j0Var instanceof t8j0;
        stz0 stz0Var = new stz0(Text.Empty.INSTANCE, null, colorModel, null, null, otz0.a, z3, null, null, null, null, null, 32602);
        pk10 pk10Var2 = (pk10) u8j0Var.a();
        rr51 rr51Var = pk10Var2 != null ? pk10Var2.b : null;
        z1x0 z1x0Var = (z3 || z) ? new z1x0(new ColorModel.Raw(0), null) : new z1x0(colorModel, null);
        pk10 pk10Var3 = (pk10) u8j0Var.a();
        return new ao10(z2, a2, stz0Var, rr51Var, pk10Var3 != null ? pk10Var3.a : null, z3 ? new eal(sks0.b, false, null, 6) : null, Collections.singletonList(new c5z(LocalVariableName.IS_NFC_BUTTON_AVAILABLE.getVarName(), String.valueOf(dn10Var.c))), z1x0Var);
    }
}
