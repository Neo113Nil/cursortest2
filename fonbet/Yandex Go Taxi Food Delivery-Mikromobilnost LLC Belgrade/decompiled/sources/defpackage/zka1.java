package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;

/* loaded from: classes11.dex */
public abstract class zka1 {
    public static void a(j681 j681Var) {
        if (!j681Var.f) {
            ny61.r("AdSession is not started");
        } else if (j681Var.g) {
            ny61.r("AdSession is finished");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList b(ListBuilder listBuilder, ListBuilder listBuilder2) {
        c6w it = scc.e(listBuilder2).iterator();
        if (!it.c) {
            ny61.p();
            return null;
        }
        int nextInt = it.nextInt();
        if (it.c) {
            float c = c(((fkf0) listBuilder.get(0)).b, ((fkf0) listBuilder2.get(nextInt)).b);
            do {
                int nextInt2 = it.nextInt();
                float c2 = c(((fkf0) listBuilder.get(0)).b, ((fkf0) listBuilder2.get(nextInt2)).b);
                if (Float.compare(c, c2) > 0) {
                    nextInt = nextInt2;
                    c = c2;
                }
            } while (it.c);
        }
        int size = listBuilder.size();
        int size2 = listBuilder2.size();
        ArrayList i = scc.i(listBuilder2.get(nextInt));
        int i2 = nextInt;
        for (int i3 = 1; i3 < size; i3++) {
            int i4 = nextInt - (size - i3);
            if (i4 <= i2) {
                i4 += size2;
            }
            c6w it2 = new d6w(i2 + 1, i4, 1).iterator();
            if (!it2.c) {
                ny61.p();
                return null;
            }
            int nextInt3 = it2.nextInt();
            if (it2.c) {
                float c3 = c(((fkf0) listBuilder.get(i3)).b, ((fkf0) listBuilder2.get(nextInt3 % size2)).b);
                do {
                    int nextInt4 = it2.nextInt();
                    float c4 = c(((fkf0) listBuilder.get(i3)).b, ((fkf0) listBuilder2.get(nextInt4 % size2)).b);
                    if (Float.compare(c3, c4) > 0) {
                        nextInt3 = nextInt4;
                        c3 = c4;
                    }
                } while (it2.c);
            }
            i2 = nextInt3;
            i.add(listBuilder2.get(i2 % size2));
        }
        return i;
    }

    public static final float c(gkp gkpVar, gkp gkpVar2) {
        List list = gkpVar.a;
        List list2 = gkpVar2.a;
        if ((gkpVar instanceof dkp) && (gkpVar2 instanceof dkp) && ((dkp) gkpVar).d != ((dkp) gkpVar2).d) {
            return Float.MAX_VALUE;
        }
        float a = (((jdf) a.Z(list)).a() + ((jdf) a.P(list)).a[0]) / 2.0f;
        float b = (((jdf) a.Z(list)).b() + ((jdf) a.P(list)).a[1]) / 2.0f;
        float a2 = (((jdf) a.Z(list2)).a() + ((jdf) a.P(list2)).a[0]) / 2.0f;
        float f = a - a2;
        float b2 = b - ((((jdf) a.Z(list2)).b() + ((jdf) a.P(list2)).a[1]) / 2.0f);
        return (b2 * b2) + (f * f);
    }

    public static final u8j0 d(u8j0 u8j0Var, tls tlsVar) {
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            return new r8j0(tlsVar.invoke(r8j0Var.a), r8j0Var.b, r8j0Var.c, r8j0Var.d);
        }
        if (u8j0Var instanceof s8j0) {
            return new s8j0(((s8j0) u8j0Var).a);
        }
        if (u8j0Var instanceof t8j0) {
            return new t8j0();
        }
        w511.b();
        return null;
    }

    public static final void e(BaseActivity baseActivity, boolean z) {
        View decorView;
        WindowInsetsController windowInsetsController;
        Window window = baseActivity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            decorView.setSystemUiVisibility(z ? decorView.getSystemUiVisibility() | 8192 : decorView.getSystemUiVisibility() & (-8193));
            return;
        }
        windowInsetsController = decorView.getWindowInsetsController();
        if (windowInsetsController != null) {
            if (z) {
                windowInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                windowInsetsController.setSystemBarsAppearance(0, 8);
            }
        }
    }
}
