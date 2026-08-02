package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import defpackage.pey;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class vsi0 {
    public final zkl0 a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final fdy d = new fdy(3, this);

    public vsi0(zkl0 zkl0Var) {
        this.a = zkl0Var;
    }

    public final void a(final pey peyVar, Div2View div2View) {
        Lifecycle lifecycle;
        synchronized (this.c) {
            try {
                HashMap hashMap = this.b;
                Object obj = hashMap.get(peyVar);
                if (obj == null) {
                    ngd0 ngd0Var = ngd0.G;
                    ngd0Var.p();
                    fu11 fu11Var = fu11.a;
                    if (fu11Var.a()) {
                        lifecycle = peyVar.getLifecycle();
                    } else {
                        a f = div2View.getViewComponent().f();
                        ngd0Var.p();
                        if (fu11Var.a()) {
                            lifecycle = peyVar.getLifecycle();
                        } else {
                            f.c(new sls() { // from class: com.yandex.div.core.view2.ReleaseManager$addLifecycleListener$lambda$6$lambda$5$$inlined$runMainThreadAction$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    pey.this.getLifecycle().a(this.d);
                                    return zy11.a;
                                }
                            });
                            obj = new WeakHashMap();
                            hashMap.put(peyVar, obj);
                        }
                    }
                    lifecycle.a(this.d);
                    obj = new WeakHashMap();
                    hashMap.put(peyVar, obj);
                }
                ((WeakHashMap) obj).put(div2View, new Object());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
