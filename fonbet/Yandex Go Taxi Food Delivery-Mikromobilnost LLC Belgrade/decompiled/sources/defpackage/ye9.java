package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.l;

/* loaded from: classes3.dex */
public final class ye9 implements ev31 {
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0035, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Text f;
        Text b;
        Text text;
        boolean z;
        Text.Resource h;
        Text.Resource resource;
        YbButtonView.a aVar;
        stz0 stz0Var;
        qc70 lVar;
        boolean z2;
        Text.Resource resource2;
        YbButtonView.a aVar2;
        se9 se9Var = (se9) obj;
        boolean z3 = se9Var instanceof le9;
        kao kaoVar = null;
        if (z3) {
            f = ((le9) se9Var).a;
            if (!d.b(f)) {
                f = null;
            }
            if (f == null) {
                f = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_failure_title);
            }
        } else if (se9Var instanceof oe9) {
            f = ((oe9) se9Var).a;
            if (f != null) {
                if (!d.b(f)) {
                    f = null;
                }
            }
            f = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_processing_title);
        } else if (se9Var instanceof re9) {
            f = ((re9) se9Var).a;
            if (!d.b(f)) {
                f = null;
            }
            if (f == null) {
                f = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_success_title);
            }
        } else if (se9Var instanceof pe9) {
            f = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_long_processing_title);
        } else {
            if (!(se9Var instanceof me9)) {
                w511.b();
                return null;
            }
            f = gao.f(((me9) se9Var).a, gao.a);
        }
        Text text2 = f;
        if (z3) {
            b = ((le9) se9Var).b;
            if (!d.b(b)) {
                b = null;
            }
            if (b == null) {
                b = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_failure_description);
            }
        } else if (se9Var instanceof re9) {
            b = ((re9) se9Var).b;
            if (!d.b(b)) {
                text = null;
                z = se9Var instanceof ne9;
                if (!z) {
                    h = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_support_button_title);
                } else if (se9Var instanceof re9) {
                    h = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_success_button_title);
                } else {
                    if (se9Var instanceof oe9) {
                        resource = null;
                        if (resource != null) {
                            aVar = new YbButtonView.a(resource, null, null, null, null, null, null, false, false, null, 4094);
                        } else {
                            aVar = null;
                        }
                        if (z) {
                            stz0Var = new stz0(Text.Empty.INSTANCE, null, null, null, null, new ntz0(0), false, null, null, null, null, null, 32734);
                        } else {
                            if (!(se9Var instanceof qe9) && !(se9Var instanceof re9)) {
                                w511.b();
                                return null;
                            }
                            stz0Var = new stz0(Text.Empty.INSTANCE, null, null, null, null, qtz0.a, false, null, null, null, null, null, 32734);
                        }
                        if (z) {
                            lVar = new l(OperationProgressView.StatusIcon.ERROR);
                        } else if (se9Var instanceof qe9) {
                            lVar = pc70.a;
                        } else {
                            if (!(se9Var instanceof re9)) {
                                w511.b();
                                return null;
                            }
                            lVar = new l(OperationProgressView.StatusIcon.SUCCESS);
                        }
                        qc70 qc70Var = lVar;
                        z2 = se9Var instanceof pe9;
                        if (z2) {
                            Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_logout_button_title);
                            if (!((pe9) se9Var).b) {
                                h2 = null;
                            }
                            resource2 = h2;
                        } else {
                            if (!z && !(se9Var instanceof oe9) && !(se9Var instanceof re9)) {
                                w511.b();
                                return null;
                            }
                            resource2 = null;
                        }
                        if (resource2 != null) {
                            aVar2 = new YbButtonView.a(resource2, null, null, null, null, null, null, false, false, null, 4094);
                        } else {
                            aVar2 = null;
                        }
                        if (se9Var instanceof me9) {
                            kaoVar = r501.a(((me9) se9Var).a, null, null, null, unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_support_button_title), null, null, null, null, null, null, null, null, 65502);
                        } else if (!z3 && !(se9Var instanceof oe9) && !z2 && !(se9Var instanceof re9)) {
                            w511.b();
                            return null;
                        }
                        return new xe9(text2, text, aVar, stz0Var, qc70Var, aVar2, kaoVar);
                    }
                    if (!(se9Var instanceof pe9)) {
                        w511.b();
                        return null;
                    }
                    h = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_support_button_title);
                }
                resource = h;
                if (resource != null) {
                }
                if (z) {
                }
                if (z) {
                }
                qc70 qc70Var2 = lVar;
                z2 = se9Var instanceof pe9;
                if (z2) {
                }
                if (resource2 != null) {
                }
                if (se9Var instanceof me9) {
                }
                return new xe9(text2, text, aVar, stz0Var, qc70Var2, aVar2, kaoVar);
            }
        } else if (se9Var instanceof oe9) {
            b = ((oe9) se9Var).b;
        } else if (se9Var instanceof pe9) {
            b = unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_long_processing_description);
        } else {
            if (!(se9Var instanceof me9)) {
                w511.b();
                return null;
            }
            b = gao.b(((me9) se9Var).a, gao.b);
        }
        text = b;
        z = se9Var instanceof ne9;
        if (!z) {
        }
        resource = h;
        if (resource != null) {
        }
        if (z) {
        }
        if (z) {
        }
        qc70 qc70Var22 = lVar;
        z2 = se9Var instanceof pe9;
        if (z2) {
        }
        if (resource2 != null) {
        }
        if (se9Var instanceof me9) {
        }
        return new xe9(text2, text, aVar, stz0Var, qc70Var22, aVar2, kaoVar);
    }
}
