package defpackage;

import com.yandex.go.blockeduser.BlockedUserModalView;

/* loaded from: classes12.dex */
public final class v36 implements c46 {
    public final /* synthetic */ BlockedUserModalView a;

    public v36(BlockedUserModalView blockedUserModalView) {
        this.a = blockedUserModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        w36 binding;
        k46 k46Var = (k46) obj;
        BlockedUserModalView blockedUserModalView = this.a;
        binding = blockedUserModalView.getBinding();
        binding.f.setText(k46Var.a);
        blockedUserModalView.setDescription(k46Var.b);
        blockedUserModalView.render(binding.b, k46Var.c);
        blockedUserModalView.render(binding.d, k46Var.d);
    }
}
