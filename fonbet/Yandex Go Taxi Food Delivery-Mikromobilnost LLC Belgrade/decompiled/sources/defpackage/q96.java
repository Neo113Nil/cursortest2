package defpackage;

import com.yandex.xplat.common.JSONItemKind;

/* loaded from: classes2.dex */
public final class q96 extends jnl {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q96(String str, int i, Object obj) {
        super(str, obj);
        this.c = i;
    }

    @Override // defpackage.jnl
    public final Object c(y3x y3xVar) {
        switch (this.c) {
            case 0:
                if (y3xVar.a == JSONItemKind.f21boolean) {
                    return Boolean.valueOf(((u96) y3xVar).b);
                }
                return null;
            default:
                if (y3xVar.a == JSONItemKind.string) {
                    return ((ktu0) y3xVar).b;
                }
                return null;
        }
    }

    @Override // defpackage.jnl
    public final y3x d(Object obj) {
        switch (this.c) {
            case 0:
                return new u96(((Boolean) obj).booleanValue());
            default:
                return new ktu0((String) obj);
        }
    }
}
