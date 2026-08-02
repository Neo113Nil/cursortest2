package defpackage;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.views.AvatarStackView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class zxd0 extends ss11 {
    public static final /* synthetic */ kgx[] z;
    public final ayd0 a;
    public final FragmentActivity b;
    public final q0k c;
    public final ArrayList w = new ArrayList();
    public boolean x = true;
    public final oji y = new oji(4, this);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("vm", 0, "getVm()Lcom/yandex/messaging/internal/view/timeline/poll/PollRecentVotersBrick$ViewModel;", zxd0.class);
        qoi0.a.getClass();
        z = new kgx[]{mutablePropertyReference1Impl};
    }

    public zxd0(ayd0 ayd0Var, FragmentActivity fragmentActivity, q0k q0kVar) {
        this.a = ayd0Var;
        this.b = fragmentActivity;
        this.c = q0kVar;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        if (this.x) {
            return;
        }
        r();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        ArrayList arrayList = this.w;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e1k) it.next()).close();
        }
        arrayList.clear();
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.a;
    }

    public final void r() {
        yxd0 yxd0Var = (yxd0) this.y.getValue(this, z[0]);
        ayd0 ayd0Var = this.a;
        if (yxd0Var == null) {
            ai91.c(ayd0Var.b, false);
            return;
        }
        if (yxd0Var.c) {
            ai91.f(ayd0Var.x, false);
            ai91.f(ayd0Var.y, false);
            ai91.c(ayd0Var.w, false);
        } else {
            ReducedUserInfo[] reducedUserInfoArr = yxd0Var.a;
            TextView textView = ayd0Var.x;
            AvatarStackView avatarStackView = ayd0Var.w;
            ai91.c(textView, false);
            ai91.c(ayd0Var.y, false);
            if (reducedUserInfoArr == null || reducedUserInfoArr.length == 0) {
                ai91.c(avatarStackView, false);
            } else {
                ai91.f(avatarStackView, false);
                avatarStackView.reserveItems(reducedUserInfoArr.length);
                ArrayList arrayList = this.w;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((e1k) it.next()).close();
                }
                arrayList.clear();
                int length = reducedUserInfoArr.length;
                for (int i = 0; i < length; i++) {
                    arrayList.add(this.c.b(reducedUserInfoArr[i].userId, gvg0.avatar_size_20, new we6(this, i, 9)));
                }
            }
        }
        int i2 = yxd0Var.b;
        TextView textView2 = ayd0Var.z;
        FragmentActivity fragmentActivity = this.b;
        textView2.setText(i2 == 0 ? fragmentActivity.getString(oyh0.messenger_poll_message_no_recent_voters) : fragmentActivity.getResources().getQuantityString(ewh0.messenger_count_recent_voters, i2, Integer.valueOf(i2)));
    }
}
