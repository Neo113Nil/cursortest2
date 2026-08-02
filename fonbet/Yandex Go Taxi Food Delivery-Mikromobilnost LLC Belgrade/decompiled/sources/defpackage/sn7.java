package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.j;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class sn7 extends uo7 {
    public final /* synthetic */ int a;
    public final Object b;

    public sn7(ax31 ax31Var) {
        this.a = 3;
        this.b = new WeakReference(ax31Var);
    }

    @Override // defpackage.uo7
    public void b(int i, ap7 ap7Var) {
        CaptureResult m;
        CaptureResult.Key key;
        CaptureResult m2;
        CaptureResult.Key key2;
        int i2;
        switch (this.a) {
            case 0:
                tn7 tn7Var = (tn7) this.b;
                dy40 dy40Var = tn7Var.b;
                un7 un7Var = tn7Var.a;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    un7Var.a();
                    if (un7Var.c && (m2 = ap7Var.m()) != null) {
                        key2 = CaptureResult.EXTENSION_CURRENT_TYPE;
                        Integer num = (Integer) m2.get(key2);
                        if (num != null) {
                            int intValue = num.intValue();
                            if (intValue != 0) {
                                i2 = 4;
                                int i4 = 1;
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        i4 = 3;
                                        if (intValue == 3) {
                                            i2 = 2;
                                        } else if (intValue != 4) {
                                            ny61.g(oyr.e(')', intValue, "Unavailable Camera2 extension mode ("));
                                            return;
                                        }
                                    }
                                    i2 = i4;
                                }
                            } else {
                                i2 = 5;
                            }
                            if (tn7Var.d.getAndSet(i2) != i2 && dy40Var != null) {
                                dy40Var.m(Integer.valueOf(intValue));
                            }
                        }
                    }
                }
                if (i3 >= 34) {
                    un7Var.a();
                    if (!un7Var.b || (m = ap7Var.m()) == null) {
                        return;
                    }
                    key = CaptureResult.EXTENSION_STRENGTH;
                    Integer num2 = (Integer) m.get(key);
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (tn7Var.c.getAndSet(intValue2) == intValue2 || dy40Var == null) {
                            return;
                        }
                        dy40Var.m(Integer.valueOf(intValue2));
                        return;
                    }
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                c920 c920Var = (c920) this.b;
                synchronized (c920Var.a) {
                    try {
                        if (c920Var.x) {
                            return;
                        }
                        c920Var.B.put(ap7Var.getTimestamp(), new bp7(ap7Var));
                        c920Var.e();
                        return;
                    } finally {
                    }
                }
            case 3:
                ax31 ax31Var = (ax31) ((WeakReference) this.b).get();
                if (ax31Var != null) {
                    Iterator it = ax31Var.a.iterator();
                    while (it.hasNext()) {
                        jyq0 jyq0Var = ((j) it.next()).o;
                        Iterator it2 = jyq0Var.g.e.iterator();
                        while (it2.hasNext()) {
                            ((uo7) it2.next()).b(i, new bx31(ap7Var, jyq0Var.g.g, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.uo7
    public void d(int i, int i2) {
        switch (this.a) {
            case 1:
                geb1.f().execute(new xm2(this, i2, 3));
                break;
        }
    }

    @Override // defpackage.uo7
    public void e(int i) {
        switch (this.a) {
            case 1:
                geb1.f().execute(new dn7(10, this));
                break;
        }
    }

    public /* synthetic */ sn7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
