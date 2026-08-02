package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.messaging.internal.displayname.AvatarType;

/* loaded from: classes15.dex */
public final class zyj implements e1k {
    public final int a;
    public final /* synthetic */ int b;
    public final zog c;
    public final int w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zyj(q0k q0kVar, zog zogVar, int i, nl21 nl21Var) {
        this(i);
        this.b = 1;
        this.y = q0kVar;
        this.x = nl21Var;
        this.w = i != 0 ? q0kVar.a.getResources().getDimensionPixelSize(i) : 0;
        this.c = zogVar;
        zogVar.a(this);
    }

    public final void a(czj czjVar, gb4 gb4Var) {
        int i = this.b;
        Object obj = this.y;
        int i2 = this.a;
        switch (i) {
            case 0:
                ((x6f0) ((j5b) this.x).a).d(new d2b(i2 != 0 ? gb4Var.a(((azj) obj).a) : new EmptyDrawable(0, 0), czjVar.a, czjVar.d.booleanValue()));
                break;
            default:
                z83.d(gb4Var, null);
                if (((nl21) this.x) != null) {
                    Drawable a = i2 != 0 ? gb4Var.a(((q0k) obj).a) : new EmptyDrawable(0, 0);
                    ((nl21) this.x).B(new o0k(czjVar.a, a, a instanceof EmptyDrawable ? AvatarType.EMPTY : gb4Var instanceof pe2 ? AvatarType.ICON : AvatarType.PLACEHOLDER));
                    break;
                }
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e1k e1kVar;
        e1k e1kVar2;
        int i = this.b;
        zog zogVar = this.c;
        switch (i) {
            case 0:
                zq60 zq60Var = zogVar.a;
                zq60Var.d(this);
                if (zq60Var.isEmpty() && (e1kVar = zogVar.g) != null) {
                    e1kVar.close();
                    zogVar.g = null;
                    break;
                }
                break;
            default:
                this.x = null;
                zq60 zq60Var2 = zogVar.a;
                zq60Var2.d(this);
                if (zq60Var2.isEmpty() && (e1kVar2 = zogVar.g) != null) {
                    e1kVar2.close();
                    zogVar.g = null;
                    break;
                }
                break;
        }
    }

    public zyj(int i) {
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zyj(azj azjVar, zog zogVar, int i, j5b j5bVar) {
        this(i);
        this.b = 0;
        this.y = azjVar;
        this.x = j5bVar;
        this.w = i != 0 ? azjVar.a.getResources().getDimensionPixelSize(i) : 0;
        this.c = zogVar;
        zogVar.a(this);
    }
}
