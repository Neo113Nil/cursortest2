package ru.yandex.taxi.ui.form;

import defpackage.ccj0;
import defpackage.dcj0;
import defpackage.vbj0;
import defpackage.w511;
import defpackage.xu0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.domain.RequirementAddressInputType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class RequirementAddressFormModalView$adapter$2 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        vbj0 vbj0Var = ((dcj0) this.receiver).B;
        int i = ccj0.a[((RequirementAddressInputType) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            w511.b();
                            return null;
                        }
                        vbj0Var.e = str;
                    } else if (booleanValue) {
                        xu0 xu0Var = vbj0Var.b;
                        vbj0Var.b = xu0Var != null ? xu0.a(xu0Var, null, null, str, null, null, 27) : null;
                    } else {
                        xu0 xu0Var2 = vbj0Var.c;
                        vbj0Var.c = xu0Var2 != null ? xu0.a(xu0Var2, null, null, str, null, null, 27) : null;
                    }
                } else if (booleanValue) {
                    xu0 xu0Var3 = vbj0Var.b;
                    vbj0Var.b = xu0Var3 != null ? xu0.a(xu0Var3, null, null, null, null, str, 15) : null;
                } else {
                    xu0 xu0Var4 = vbj0Var.c;
                    vbj0Var.c = xu0Var4 != null ? xu0.a(xu0Var4, null, null, null, null, str, 15) : null;
                }
            } else if (booleanValue) {
                xu0 xu0Var5 = vbj0Var.b;
                vbj0Var.b = xu0Var5 != null ? xu0.a(xu0Var5, null, null, null, str, null, 23) : null;
            } else {
                xu0 xu0Var6 = vbj0Var.c;
                vbj0Var.c = xu0Var6 != null ? xu0.a(xu0Var6, null, null, null, str, null, 23) : null;
            }
        } else if (booleanValue) {
            xu0 xu0Var7 = vbj0Var.b;
            vbj0Var.b = xu0Var7 != null ? xu0.a(xu0Var7, null, str, null, null, null, 29) : null;
        } else {
            xu0 xu0Var8 = vbj0Var.c;
            vbj0Var.c = xu0Var8 != null ? xu0.a(xu0Var8, null, str, null, null, null, 29) : null;
        }
        return zy11.a;
    }
}
