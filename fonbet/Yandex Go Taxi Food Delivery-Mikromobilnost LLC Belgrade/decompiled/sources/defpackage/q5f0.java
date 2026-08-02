package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class q5f0 {
    public final Context a;
    public final i3y b;
    public final int c = Process.myPid();
    public final i3y d;
    public final i3y e;
    public boolean f;

    public q5f0(Context context, by21 by21Var) {
        this.a = context;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: p5f0
            public final /* synthetic */ q5f0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                q5f0 q5f0Var = this.b;
                switch (i2) {
                    case 0:
                        return ((s5f0) q5f0Var.e.getValue()).a;
                    default:
                        return udq0.w(q5f0Var.a);
                }
            }
        });
        this.d = a.a(new t9a0(27, by21Var));
        final int i2 = 1;
        this.e = a.a(new sls(this) { // from class: p5f0
            public final /* synthetic */ q5f0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                q5f0 q5f0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((s5f0) q5f0Var.e.getValue()).a;
                    default:
                        return udq0.w(q5f0Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        i3y i3yVar = this.d;
        if (map == null) {
            return gw00.e(new Pair(a(), new o5f0(Process.myPid(), (String) i3yVar.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new o5f0(Process.myPid(), (String) i3yVar.getValue()));
        return b.t(linkedHashMap);
    }
}
