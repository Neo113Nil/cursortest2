package defpackage;

import com.yandex.go.inapp_calls.ui.defaultoutgoingcall.DefaultCallTypeModalView;
import com.yandex.go.inapp_calls.ui.defaultoutgoingcall.b;

/* loaded from: classes12.dex */
public final class v7h implements x7h {
    public final /* synthetic */ DefaultCallTypeModalView a;

    public v7h(DefaultCallTypeModalView defaultCallTypeModalView) {
        this.a = defaultCallTypeModalView;
    }

    @Override // defpackage.x7h
    public final void R8(b8h b8hVar) {
        w7h binding;
        b bVar;
        DefaultCallTypeModalView defaultCallTypeModalView = this.a;
        binding = defaultCallTypeModalView.getBinding();
        binding.c.setTitle(b8hVar.a);
        bVar = defaultCallTypeModalView.adapter;
        bVar.b(b8hVar.b);
    }
}
