package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.List;

/* loaded from: classes3.dex */
public final class rtw implements ev31 {
    public auw a;

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        u8j0 u8j0Var = (u8j0) obj;
        if (u8j0Var instanceof s8j0) {
            return new ytw(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (u8j0Var instanceof t8j0) {
            return new ztw(lnb1.b());
        }
        if (!(u8j0Var instanceof r8j0)) {
            w511.b();
            return null;
        }
        utw utwVar = (utw) ((r8j0) u8j0Var).a;
        List list = utwVar.a;
        PageHeaderEntity pageHeaderEntity = utwVar.c;
        List c = aab1.c(list, new ptw(0, utwVar), new mtw(this));
        Text.Constant i = g8e.i(Text.Companion, pageHeaderEntity.getTitle());
        ThemedImageUrlEntity image = pageHeaderEntity.getImage();
        rbv f = image != null ? job1.f(image, new mtw(2)) : null;
        String description = pageHeaderEntity.getDescription();
        stz0 stz0Var = new stz0(i, description != null ? new Text.Constant(description) : null, null, f, null, new ntz0(0), false, null, null, null, null, null, 32724);
        auw auwVar = this.a;
        auw auwVar2 = new auw(c, stz0Var, vi01.c(auwVar != null ? auwVar.a : null, c), utwVar.b);
        this.a = auwVar2;
        return auwVar2;
    }
}
