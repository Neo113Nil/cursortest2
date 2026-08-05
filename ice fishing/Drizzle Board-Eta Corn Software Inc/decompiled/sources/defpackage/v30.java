package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class v30 {
    public Executor MdtA4re8;
    public l9 NCTxEWno;
    public hn P7K7Inc8;
    public zb VgvYg0wo;
    public e9 qoPGr6Ce;
    public HzhOLUMW wxUZMvaN;
    public final mcXgUFR8 b2ZJblxo = new mcXgUFR8(new zw(0, this, v30.class, "onClosed", "onClosed()V", 0, 2));
    public final ThreadLocal Qr9iLBAD = new ThreadLocal();
    public final LinkedHashMap jb9XjC4I = new LinkedHashMap();
    public boolean eVhOlqcC = true;

    public we MdtA4re8() {
        throw new kw();
    }

    public abstract hn NCTxEWno();

    public LinkedHashMap P7K7Inc8() {
        int ESscZ9M1 = zq.ESscZ9M1(z5.bvfAo0eO(zf.NCTxEWno, 10));
        if (ESscZ9M1 < 16) {
            ESscZ9M1 = 16;
        }
        return new LinkedHashMap(ESscZ9M1);
    }

    public final boolean Qr9iLBAD() {
        if (jb9XjC4I()) {
            zb zbVar = this.VgvYg0wo;
            if (zbVar == null) {
                fn.ytu5o6f4("connectionManager");
                throw null;
            }
            ua0 ua0Var = (ua0) zbVar.b2ZJblxo;
            if (ua0Var == null) {
                m1.Ey6iv0m0("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
                return false;
            }
            if (ua0Var.KlHjfFWx().ow5vqvCr()) {
                return true;
            }
        }
        return false;
    }

    public Set VgvYg0wo() {
        return x5.AxnhUDtd(new ArrayList(z5.bvfAo0eO(zf.NCTxEWno, 10)));
    }

    public final boolean b2ZJblxo() {
        zb zbVar = this.VgvYg0wo;
        if (zbVar != null) {
            return ((ua0) zbVar.b2ZJblxo) != null;
        }
        fn.ytu5o6f4("connectionManager");
        throw null;
    }

    public final Object eVhOlqcC(boolean z, dl dlVar, h9 h9Var) {
        zb zbVar = this.VgvYg0wo;
        if (zbVar != null) {
            return ((u7) zbVar.P7K7Inc8).k3x7lurq(z, dlVar, h9Var);
        }
        fn.ytu5o6f4("connectionManager");
        throw null;
    }

    public final boolean jb9XjC4I() {
        zb zbVar = this.VgvYg0wo;
        if (zbVar == null) {
            fn.ytu5o6f4("connectionManager");
            throw null;
        }
        fk fkVar = (fk) zbVar.Qr9iLBAD;
        if (fkVar != null) {
            return fkVar.isOpen();
        }
        return false;
    }

    public List qoPGr6Ce(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zq.ESscZ9M1(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            p5 p5Var = (p5) entry.getKey();
            p5Var.getClass();
            Class qoPGr6Ce = p5Var.qoPGr6Ce();
            qoPGr6Ce.getClass();
            linkedHashMap2.put(qoPGr6Ce, entry.getValue());
        }
        return wf.NCTxEWno;
    }

    public final hn wxUZMvaN() {
        hn hnVar = this.P7K7Inc8;
        if (hnVar != null) {
            return hnVar;
        }
        fn.ytu5o6f4("internalTracker");
        throw null;
    }
}
