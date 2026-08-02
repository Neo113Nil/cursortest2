package defpackage;

import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.messaging.contacts.PermissionState;
import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class yya0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public yya0(b bVar, Permission permission, int i, j18 j18Var) {
        this.a = 0;
        this.c = bVar;
        this.w = permission;
        this.b = i;
        this.x = j18Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        int i2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                PermissionState b = wh91.b(bVar, (Permission) obj4);
                if (b == PermissionState.NEVER_ASK) {
                    bVar.g(i2, mxh0.button_settings, mxh0.button_cancel);
                }
                ((j18) obj2).resumeWith(b);
                return zy11Var;
            case 1:
                gv90 gv90Var = (gv90) obj3;
                if (gv90Var == null) {
                    ny61.g("payload is null");
                    return null;
                }
                ((tls) obj2).invoke(new qgb0(gv90Var, i2, (ArrayList) obj4));
                return zy11Var;
            default:
                long j = ((wu60) obj).a;
                ((oz40) obj4).setValue((n6y) a.S(i2, ((androidx.compose.foundation.lazy.b) obj3).j().k));
                ((yx40) obj2).setIntValue(i2);
                return zy11Var;
        }
    }

    public /* synthetic */ yya0(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
        this.x = obj3;
    }
}
