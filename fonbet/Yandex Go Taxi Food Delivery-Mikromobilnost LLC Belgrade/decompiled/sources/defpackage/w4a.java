package defpackage;

import com.yandex.go.chargers.multiorder.select_to_return.ChargersMultiOrderSelectToReturnModalView;

/* loaded from: classes12.dex */
public final class w4a implements y4a {
    public final /* synthetic */ ChargersMultiOrderSelectToReturnModalView a;

    public w4a(ChargersMultiOrderSelectToReturnModalView chargersMultiOrderSelectToReturnModalView) {
        this.a = chargersMultiOrderSelectToReturnModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        s3a s3aVar;
        s3aVar = this.a.adapter;
        s3aVar.submitList(((c5a) obj).a, null);
    }
}
