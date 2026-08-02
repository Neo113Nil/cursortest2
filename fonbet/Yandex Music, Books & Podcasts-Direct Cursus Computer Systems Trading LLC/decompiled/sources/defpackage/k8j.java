package defpackage;

/* loaded from: classes.dex */
public class k8j {
    public final eqi a = new eqi(new y7j[16]);
    public final gpi b = new gpi(10);

    public boolean a(ovg ovgVar, wof wofVar, fmq fmqVar, boolean z) {
        eqi eqiVar = this.a;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((y7j) objArr[i2]).a(ovgVar, wofVar, fmqVar, z) || z2;
        }
        return z2;
    }

    public void b(fmq fmqVar) {
        eqi eqiVar = this.a;
        int i = eqiVar.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((y7j) eqiVar.a[i]).d.b == 0) {
                eqiVar.m(i);
            }
        }
    }
}
