package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes.dex */
public final class ux1 extends Exception {
    public ux1(String str, tx1 tx1Var) {
        super(str + StringUtil.SPACE + tx1Var);
    }

    public ux1(tx1 tx1Var) {
        this("Unhandled input format:", tx1Var);
    }
}
