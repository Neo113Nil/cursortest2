package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class hH0RRJrNssvh {
    public defpackage.uh1 P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public defpackage.GcLuU6pT9wO9[] WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public abstract defpackage.GcLuU6pT9wO9 JhCgjQRTAOCT();

    public final defpackage.uh1 QiMR8OkAhezm() {
        defpackage.uh1 uh1Var;
        synchronized (this) {
            uh1Var = this.P05cfTpS5W5L;
            if (uh1Var == null) {
                int i = this.oh71FJcDz6S2;
                uh1Var = new defpackage.uh1(1, Integer.MAX_VALUE, defpackage.zb.oh71FJcDz6S2);
                uh1Var.WmetiUbpKU9I(java.lang.Integer.valueOf(i));
                this.P05cfTpS5W5L = uh1Var;
            }
        }
        return uh1Var;
    }

    public abstract defpackage.GcLuU6pT9wO9[] WDYagTQQm9ns();

    public final defpackage.GcLuU6pT9wO9 fWTAfUmVKrZq() {
        defpackage.GcLuU6pT9wO9 gcLuU6pT9wO9;
        defpackage.uh1 uh1Var;
        synchronized (this) {
            try {
                defpackage.GcLuU6pT9wO9[] gcLuU6pT9wO9Arr = this.WDYagTQQm9ns;
                if (gcLuU6pT9wO9Arr == null) {
                    gcLuU6pT9wO9Arr = WDYagTQQm9ns();
                    this.WDYagTQQm9ns = gcLuU6pT9wO9Arr;
                } else if (this.oh71FJcDz6S2 >= gcLuU6pT9wO9Arr.length) {
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(gcLuU6pT9wO9Arr, gcLuU6pT9wO9Arr.length * 2);
                    this.WDYagTQQm9ns = (defpackage.GcLuU6pT9wO9[]) copyOf;
                    gcLuU6pT9wO9Arr = (defpackage.GcLuU6pT9wO9[]) copyOf;
                }
                int i = this.QiMR8OkAhezm;
                do {
                    gcLuU6pT9wO9 = gcLuU6pT9wO9Arr[i];
                    if (gcLuU6pT9wO9 == null) {
                        gcLuU6pT9wO9 = JhCgjQRTAOCT();
                        gcLuU6pT9wO9Arr[i] = gcLuU6pT9wO9;
                    }
                    i++;
                    if (i >= gcLuU6pT9wO9Arr.length) {
                        i = 0;
                    }
                } while (!gcLuU6pT9wO9.ZpBGe2uQfcn8(this));
                this.QiMR8OkAhezm = i;
                this.oh71FJcDz6S2++;
                uh1Var = this.P05cfTpS5W5L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (uh1Var != null) {
            uh1Var.IJ0hOnjhPOri(1);
        }
        return gcLuU6pT9wO9;
    }

    public final void oh71FJcDz6S2(defpackage.GcLuU6pT9wO9 gcLuU6pT9wO9) {
        defpackage.uh1 uh1Var;
        int i;
        defpackage.kl[] giKS3J6vZuNy;
        synchronized (this) {
            try {
                int i2 = this.oh71FJcDz6S2 - 1;
                this.oh71FJcDz6S2 = i2;
                uh1Var = this.P05cfTpS5W5L;
                if (i2 == 0) {
                    this.QiMR8OkAhezm = 0;
                }
                gcLuU6pT9wO9.getClass();
                giKS3J6vZuNy = gcLuU6pT9wO9.giKS3J6vZuNy(this);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        for (defpackage.kl klVar : giKS3J6vZuNy) {
            if (klVar != null) {
                klVar.e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
            }
        }
        if (uh1Var != null) {
            uh1Var.IJ0hOnjhPOri(-1);
        }
    }
}
