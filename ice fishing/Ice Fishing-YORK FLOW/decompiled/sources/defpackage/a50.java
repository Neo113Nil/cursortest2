package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class a50 extends defpackage.h3m55N1URyyK {
    public final defpackage.z40 JhCgjQRTAOCT;
    public final defpackage.rb0 ZpBGe2uQfcn8;
    public final /* synthetic */ int fWTAfUmVKrZq;
    public final defpackage.rb0 giKS3J6vZuNy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a50(defpackage.rb0 rb0Var, defpackage.rb0 rb0Var2, int i) {
        this(rb0Var, rb0Var2, (byte) 0);
        this.fWTAfUmVKrZq = i;
        rb0Var.getClass();
        rb0Var2.getClass();
        switch (i) {
            case 1:
                this(rb0Var, rb0Var2, (byte) 0);
                defpackage.hc1 giKS3J6vZuNy = rb0Var.giKS3J6vZuNy();
                defpackage.hc1 giKS3J6vZuNy2 = rb0Var2.giKS3J6vZuNy();
                giKS3J6vZuNy.getClass();
                giKS3J6vZuNy2.getClass();
                this.JhCgjQRTAOCT = new defpackage.z40("kotlin.collections.LinkedHashMap", giKS3J6vZuNy, giKS3J6vZuNy2);
                break;
            default:
                defpackage.hc1 giKS3J6vZuNy3 = rb0Var.giKS3J6vZuNy();
                defpackage.hc1 giKS3J6vZuNy4 = rb0Var2.giKS3J6vZuNy();
                giKS3J6vZuNy3.getClass();
                giKS3J6vZuNy4.getClass();
                this.JhCgjQRTAOCT = new defpackage.z40("kotlin.collections.HashMap", giKS3J6vZuNy3, giKS3J6vZuNy4);
                break;
        }
    }

    @Override // defpackage.h3m55N1URyyK
    public final int JhCgjQRTAOCT(java.lang.Object obj) {
        switch (this.fWTAfUmVKrZq) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                map.getClass();
                return map.size();
            default:
                java.util.Map map2 = (java.util.Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.rb0
    public final void ZpBGe2uQfcn8(defpackage.up0 up0Var, java.lang.Object obj) {
        JhCgjQRTAOCT(obj);
        giKS3J6vZuNy().getClass();
        java.util.Iterator fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        int i = 0;
        while (fWTAfUmVKrZq.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) fWTAfUmVKrZq.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int i2 = i + 1;
            up0Var.e6mdH7fiFuta(giKS3J6vZuNy(), i, this.ZpBGe2uQfcn8, key);
            i += 2;
            up0Var.e6mdH7fiFuta(giKS3J6vZuNy(), i2, this.giKS3J6vZuNy, value);
        }
    }

    @Override // defpackage.h3m55N1URyyK
    public final java.util.Iterator fWTAfUmVKrZq(java.lang.Object obj) {
        switch (this.fWTAfUmVKrZq) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                java.util.Map map2 = (java.util.Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.rb0
    public final defpackage.hc1 giKS3J6vZuNy() {
        switch (this.fWTAfUmVKrZq) {
        }
        return this.JhCgjQRTAOCT;
    }

    public a50(defpackage.rb0 rb0Var, defpackage.rb0 rb0Var2, byte b) {
        this.ZpBGe2uQfcn8 = rb0Var;
        this.giKS3J6vZuNy = rb0Var2;
    }
}
