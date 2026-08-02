package defpackage;

import com.yandex.alicekit.core.permissions.HookPermissionManager$PermissionHookFragment;
import com.yandex.alicekit.core.permissions.b;

/* loaded from: classes11.dex */
public final class xpu extends b {
    public final HookPermissionManager$PermissionHookFragment e;

    public xpu(HookPermissionManager$PermissionHookFragment hookPermissionManager$PermissionHookFragment) {
        super(hookPermissionManager$PermissionHookFragment.requireActivity());
        this.e = hookPermissionManager$PermissionHookFragment;
    }

    @Override // com.yandex.alicekit.core.permissions.b
    public final void h(int i, String[] strArr) {
        this.e.requestPermissions(strArr, i);
    }
}
