package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.messaging.contacts.PermissionState;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public abstract class wh91 {
    public static final yp5 a = new yp5(2);

    public static final void a(ViewPager2 viewPager2) {
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
    }

    public static final PermissionState b(b bVar, Permission permission) {
        Activity activity = bVar.a;
        String permissionString = permission.getPermissionString();
        return (qke.h(activity, permissionString) == 0 || bi91.g(activity, Collections.singleton(permissionString)) || !activity.getSharedPreferences("PermissionUtils.Prefs", 0).getStringSet("prefs_key_answered_permission_set", Collections.EMPTY_SET).contains(permissionString)) ? bVar.b(permission) ? PermissionState.GRANTED : PermissionState.DENIED : PermissionState.NEVER_ASK;
    }

    public static final Object c(b bVar, Permission permission, int i, int i2, ContinuationImpl continuationImpl) {
        PermissionState b = b(bVar, permission);
        PermissionState permissionState = PermissionState.GRANTED;
        if (b == permissionState) {
            return permissionState;
        }
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        j18Var.w(new xzr(bVar, i, 2));
        PermissionState b2 = b(bVar, permission);
        PermissionState permissionState2 = PermissionState.NEVER_ASK;
        if (b2 == permissionState2) {
            bVar.g(i2, mxh0.button_settings, mxh0.button_cancel);
            j18Var.resumeWith(permissionState2);
        } else {
            iza0 iza0Var = new iza0();
            iza0Var.a = i;
            iza0Var.b.add(permission);
            hza0 a2 = iza0Var.a();
            bVar.d(i);
            yya0 yya0Var = new yya0(bVar, permission, i2, j18Var);
            SparseArray sparseArray = bVar.b;
            sparseArray.get(i);
            z83.i();
            sparseArray.put(i, yya0Var);
            bVar.e(a2);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
