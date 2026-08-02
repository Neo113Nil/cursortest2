package defpackage;

import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.ui.view.CompoundImageView;

/* loaded from: classes6.dex */
public final class js5 extends klx {
    public final /* synthetic */ int m;
    public final /* synthetic */ CompoundImageView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js5(CompoundImageView compoundImageView, int i) {
        super(17);
        this.m = i;
        this.n = compoundImageView;
    }

    @Override // defpackage.klx
    public final void U(LinkedList linkedList) {
        switch (this.m) {
            case 0:
                for (int i = 0; i < 16; i++) {
                    String str = (String) linkedList.get(i % linkedList.size());
                    CompoundImageView compoundImageView = this.n;
                    compoundImageView.a.add(new is5(compoundImageView, str));
                }
                break;
            default:
                String str2 = (String) CollectionsKt.Q(linkedList);
                CompoundImageView compoundImageView2 = this.n;
                compoundImageView2.a.add(new is5(compoundImageView2, str2));
                break;
        }
    }

    @Override // defpackage.klx
    public final int X(int i) {
        switch (this.m) {
            case 0:
                return i / 2;
            default:
                return i;
        }
    }

    @Override // defpackage.klx
    public final void Y(int i) {
        switch (this.m) {
            case 0:
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = 0;
                    while (i3 < 4) {
                        float f = i / 4;
                        int i4 = i3 + 1;
                        ((is5) this.n.a.get((i2 * 4) + i3)).a((int) ((i3 * f) + 0.5f), (int) ((i2 * f) + 0.5f), (int) ((i4 * f) + 0.5f), (int) (((i2 + 1) * f) + 0.5f));
                        i3 = i4;
                    }
                }
                break;
            default:
                ((is5) this.n.a.get(0)).a(0, 0, i, i);
                break;
        }
    }
}
