package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class mq {
    public int MdtA4re8;
    public int NCTxEWno;
    public final Object P7K7Inc8;
    public int VgvYg0wo;
    public final Object b2ZJblxo;
    public final /* synthetic */ int qoPGr6Ce;
    public int wxUZMvaN;

    public mq(int i) {
        this.qoPGr6Ce = 0;
        this.NCTxEWno = i;
        if (i <= 0) {
            m1.sjUBp5pO("maxSize <= 0");
            throw null;
        }
        this.P7K7Inc8 = new vm(1);
        this.b2ZJblxo = new re(24);
    }

    public Object MdtA4re8(Object obj) {
        return null;
    }

    public void NCTxEWno() {
        ((ArrayList) this.P7K7Inc8).clear();
        this.NCTxEWno = Integer.MIN_VALUE;
        this.MdtA4re8 = Integer.MIN_VALUE;
        this.wxUZMvaN = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0015, B:16:0x001d, B:18:0x0021, B:20:0x002e, B:22:0x0040, B:25:0x005f, B:27:0x0065, B:33:0x004a, B:34:0x0050, B:37:0x005b, B:12:0x008a, B:13:0x0091), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OnDfzHZD(int i) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (((re) this.b2ZJblxo)) {
                try {
                    if (this.MdtA4re8 < 0 || (((vm) this.P7K7Inc8).qoPGr6Ce.isEmpty() && this.MdtA4re8 != 0)) {
                        break;
                    }
                    if (this.MdtA4re8 <= i || ((vm) this.P7K7Inc8).qoPGr6Ce.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((vm) this.P7K7Inc8).qoPGr6Ce.entrySet();
                    entrySet.getClass();
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            vm vmVar = (vm) this.P7K7Inc8;
                            key.getClass();
                            vmVar.qoPGr6Ce.remove(key);
                            int i2 = this.MdtA4re8;
                            value.getClass();
                            this.MdtA4re8 = i2 - 1;
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        } else {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            wxUZMvaN(key, value, null);
        }
    }

    public int P7K7Inc8() {
        return ((StaggeredGridLayoutManager) this.b2ZJblxo).RXQxj5Oe ? b2ZJblxo(0, ((ArrayList) this.P7K7Inc8).size()) : b2ZJblxo(r1.size() - 1, -1);
    }

    public Object Qr9iLBAD(Object obj) {
        Object put;
        synchronized (((re) this.b2ZJblxo)) {
            Object obj2 = ((vm) this.P7K7Inc8).qoPGr6Ce.get(obj);
            if (obj2 != null) {
                this.wxUZMvaN++;
                return obj2;
            }
            this.VgvYg0wo++;
            Object MdtA4re8 = MdtA4re8(obj);
            if (MdtA4re8 == null) {
                return null;
            }
            synchronized (((re) this.b2ZJblxo)) {
                put = ((vm) this.P7K7Inc8).qoPGr6Ce.put(obj, MdtA4re8);
                if (put != null) {
                    ((vm) this.P7K7Inc8).qoPGr6Ce.put(obj, put);
                } else {
                    this.MdtA4re8++;
                }
            }
            if (put != null) {
                wxUZMvaN(obj, MdtA4re8, put);
                return put;
            }
            OnDfzHZD(this.NCTxEWno);
            return MdtA4re8;
        }
    }

    public int VgvYg0wo() {
        return ((StaggeredGridLayoutManager) this.b2ZJblxo).RXQxj5Oe ? b2ZJblxo(r1.size() - 1, -1) : b2ZJblxo(0, ((ArrayList) this.P7K7Inc8).size());
    }

    public int b2ZJblxo(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.b2ZJblxo;
        int OnDfzHZD = staggeredGridLayoutManager.OxcuoDLp.OnDfzHZD();
        int jb9XjC4I = staggeredGridLayoutManager.OxcuoDLp.jb9XjC4I();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.P7K7Inc8).get(i);
            int b2ZJblxo = staggeredGridLayoutManager.OxcuoDLp.b2ZJblxo(view);
            int wxUZMvaN = staggeredGridLayoutManager.OxcuoDLp.wxUZMvaN(view);
            boolean z = b2ZJblxo <= jb9XjC4I;
            boolean z2 = wxUZMvaN >= OnDfzHZD;
            if (z && z2 && (b2ZJblxo < OnDfzHZD || wxUZMvaN > jb9XjC4I)) {
                return t10.ytu5o6f4(view);
            }
            i += i3;
        }
        return -1;
    }

    public View eVhOlqcC(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.b2ZJblxo;
        ArrayList arrayList = (ArrayList) this.P7K7Inc8;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.RXQxj5Oe && t10.ytu5o6f4(view2) >= i) || ((!staggeredGridLayoutManager.RXQxj5Oe && t10.ytu5o6f4(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.RXQxj5Oe && t10.ytu5o6f4(view3) <= i) || ((!staggeredGridLayoutManager.RXQxj5Oe && t10.ytu5o6f4(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int jb9XjC4I(int i) {
        int i2 = this.MdtA4re8;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.P7K7Inc8).size() == 0) {
            return i;
        }
        qoPGr6Ce();
        return this.MdtA4re8;
    }

    public int k3x7lurq(int i) {
        ArrayList arrayList = (ArrayList) this.P7K7Inc8;
        int i2 = this.NCTxEWno;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        m90 m90Var = (m90) view.getLayoutParams();
        this.NCTxEWno = ((StaggeredGridLayoutManager) this.b2ZJblxo).OxcuoDLp.b2ZJblxo(view);
        m90Var.getClass();
        return this.NCTxEWno;
    }

    public Object ow5vqvCr(Object obj, Object obj2) {
        Object put;
        synchronized (((re) this.b2ZJblxo)) {
            this.MdtA4re8++;
            put = ((vm) this.P7K7Inc8).qoPGr6Ce.put(obj, obj2);
            if (put != null) {
                this.MdtA4re8--;
            }
        }
        if (put != null) {
            wxUZMvaN(obj, put, obj2);
        }
        OnDfzHZD(this.NCTxEWno);
        return put;
    }

    public void qoPGr6Ce() {
        View view = (View) ((ArrayList) this.P7K7Inc8).get(r0.size() - 1);
        m90 m90Var = (m90) view.getLayoutParams();
        this.MdtA4re8 = ((StaggeredGridLayoutManager) this.b2ZJblxo).OxcuoDLp.wxUZMvaN(view);
        m90Var.getClass();
    }

    public String toString() {
        String str;
        switch (this.qoPGr6Ce) {
            case 0:
                synchronized (((re) this.b2ZJblxo)) {
                    try {
                        int i = this.wxUZMvaN;
                        int i2 = this.VgvYg0wo + i;
                        str = "LruCache[maxSize=" + this.NCTxEWno + ",hits=" + this.wxUZMvaN + ",misses=" + this.VgvYg0wo + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public mq(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.qoPGr6Ce = 1;
        this.b2ZJblxo = staggeredGridLayoutManager;
        this.P7K7Inc8 = new ArrayList();
        this.NCTxEWno = Integer.MIN_VALUE;
        this.MdtA4re8 = Integer.MIN_VALUE;
        this.wxUZMvaN = 0;
        this.VgvYg0wo = i;
    }

    public void wxUZMvaN(Object obj, Object obj2, Object obj3) {
    }
}
