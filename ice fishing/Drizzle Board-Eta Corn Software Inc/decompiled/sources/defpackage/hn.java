package defpackage;

import com.kolosta.rejin.jilosa.data.local.BoardDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hn {
    public final LinkedHashMap MdtA4re8;
    public final ie0 NCTxEWno;
    public final ek P7K7Inc8;
    public final ek VgvYg0wo;
    public final Object b2ZJblxo;
    public final BoardDatabase_Impl qoPGr6Ce;
    public final ReentrantLock wxUZMvaN;

    public hn(BoardDatabase_Impl boardDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.qoPGr6Ce = boardDatabase_Impl;
        ie0 ie0Var = new ie0(boardDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, boardDatabase_Impl.eVhOlqcC, new gn(1, this, hn.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0));
        this.NCTxEWno = ie0Var;
        this.MdtA4re8 = new LinkedHashMap();
        this.wxUZMvaN = new ReentrantLock();
        this.VgvYg0wo = new ek(this, 2);
        int i = 3;
        this.P7K7Inc8 = new ek(this, i);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.b2ZJblxo = new Object();
        ie0Var.k3x7lurq = new e7(i, this);
    }
}
