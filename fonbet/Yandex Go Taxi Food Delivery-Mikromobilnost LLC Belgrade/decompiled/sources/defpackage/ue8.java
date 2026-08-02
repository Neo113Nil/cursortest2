package defpackage;

import com.yandex.go.design.divider.CardDivider;

/* loaded from: classes.dex */
public final class ue8 extends iq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardDivider b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ue8(CardDivider cardDivider, int i) {
        super(r2);
        this.a = i;
        switch (i) {
            case 4:
                Boolean bool = Boolean.FALSE;
                this.b = cardDivider;
                super(bool);
                break;
            default:
                Boolean bool2 = Boolean.TRUE;
                this.b = cardDivider;
                break;
        }
    }

    @Override // defpackage.iq60
    public final void afterChange(kgx kgxVar, Object obj, Object obj2) {
        int i = this.a;
        CardDivider cardDivider = this.b;
        switch (i) {
            case 0:
                cardDivider.refreshPaintColor();
                break;
            case 1:
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                cardDivider.refreshDividerSize();
                break;
            case 2:
                cardDivider.refreshDividerSize();
                break;
            case 3:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                cardDivider.refreshDividerSize();
                break;
            default:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                cardDivider.refreshDividerSize();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue8(Object obj, CardDivider cardDivider, int i) {
        super(obj);
        this.a = i;
        this.b = cardDivider;
    }
}
