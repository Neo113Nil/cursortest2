package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w90 {
    public final ArrayList AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public final boolean GWasM1elztuh;
    public boolean OOA6hdeuvCS;
    public final lf1 X1lG3V04pd;
    public f4 Yi7zF1RB1;
    public m90 encWxUiV2;
    public final p51 mOu10nynGul;
    public int xqGvceK5x;

    public w90(t90 t90Var, boolean z) {
        new AtomicReference(null);
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = new f4(5);
        this.X1lG3V04pd = new lf1(t90Var);
        this.AvO7iQsrTN = new ArrayList();
        m90 m90Var = m90.EljAMC1QTz;
        this.encWxUiV2 = m90Var;
        this.mOu10nynGul = vc0.EljAMC1QTz(m90Var);
    }

    public final void AvO7iQsrTN() {
        Object obj = this.X1lG3V04pd.GWasM1elztuh.get();
        if (obj == null) {
            o4.jivtDDk9H("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final t90 t90Var = (t90) obj;
        while (true) {
            f4 f4Var = this.Yi7zF1RB1;
            final int i = 0;
            if (((hg0) f4Var.Yi7zF1RB1).OOA6hdeuvCS == 0) {
                break;
            }
            ir irVar = (ir) f4Var.X1lG3V04pd;
            if (irVar == null) {
                o4.AvO7iQsrTN("Collection is empty.");
                return;
            }
            m90 m90Var = irVar.EljAMC1QTz.GWasM1elztuh;
            ir irVar2 = (ir) f4Var.xqGvceK5x;
            if (irVar2 == null) {
                o4.AvO7iQsrTN("Collection is empty.");
                return;
            }
            m90 m90Var2 = irVar2.EljAMC1QTz.GWasM1elztuh;
            if (m90Var == m90Var2 && this.encWxUiV2 == m90Var2) {
                break;
            }
            this.EljAMC1QTz = false;
            m90 m90Var3 = this.encWxUiV2;
            if (irVar == null) {
                o4.AvO7iQsrTN("Collection is empty.");
                return;
            }
            if (m90Var3.compareTo(m90Var) < 0) {
                f4 f4Var2 = this.Yi7zF1RB1;
                hv hvVar = new hv(this) { // from class: u90
                    public final /* synthetic */ w90 EljAMC1QTz;

                    {
                        this.EljAMC1QTz = this;
                    }

                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj2) {
                        int i2 = i;
                        kc1 kc1Var = kc1.GWasM1elztuh;
                        t90 t90Var2 = t90Var;
                        w90 w90Var = this.EljAMC1QTz;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                s90 s90Var = (s90) entry.getKey();
                                v90 v90Var = (v90) entry.getValue();
                                while (true) {
                                    m90 m90Var4 = v90Var.GWasM1elztuh;
                                    m90 m90Var5 = w90Var.encWxUiV2;
                                    ArrayList arrayList = w90Var.AvO7iQsrTN;
                                    if (m90Var4.compareTo(m90Var5) > 0 && !w90Var.EljAMC1QTz) {
                                        f4 f4Var3 = w90Var.Yi7zF1RB1;
                                        f4Var3.getClass();
                                        s90Var.getClass();
                                        if (!((hg0) f4Var3.Yi7zF1RB1).X1lG3V04pd(s90Var)) {
                                            break;
                                        } else {
                                            j90 j90Var = l90.Companion;
                                            m90 m90Var6 = v90Var.GWasM1elztuh;
                                            j90Var.getClass();
                                            m90Var6.getClass();
                                            int ordinal = m90Var6.ordinal();
                                            l90 l90Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : l90.ON_PAUSE : l90.ON_STOP : l90.ON_DESTROY;
                                            if (l90Var == null) {
                                                o4.Mjvvu5DE(v90Var.GWasM1elztuh, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(l90Var.GWasM1elztuh());
                                                v90Var.GWasM1elztuh(t90Var2, l90Var);
                                                wb.iriv6doqetn(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                s90 s90Var2 = (s90) entry.getKey();
                                v90 v90Var2 = (v90) entry.getValue();
                                while (true) {
                                    m90 m90Var7 = v90Var2.GWasM1elztuh;
                                    m90 m90Var8 = w90Var.encWxUiV2;
                                    ArrayList arrayList2 = w90Var.AvO7iQsrTN;
                                    if (m90Var7.compareTo(m90Var8) < 0 && !w90Var.EljAMC1QTz) {
                                        f4 f4Var4 = w90Var.Yi7zF1RB1;
                                        f4Var4.getClass();
                                        s90Var2.getClass();
                                        if (!((hg0) f4Var4.Yi7zF1RB1).X1lG3V04pd(s90Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(v90Var2.GWasM1elztuh);
                                            j90 j90Var2 = l90.Companion;
                                            m90 m90Var9 = v90Var2.GWasM1elztuh;
                                            j90Var2.getClass();
                                            m90Var9.getClass();
                                            int ordinal2 = m90Var9.ordinal();
                                            l90 l90Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : l90.ON_RESUME : l90.ON_START : l90.ON_CREATE;
                                            if (l90Var2 == null) {
                                                o4.Mjvvu5DE(v90Var2.GWasM1elztuh, "no event up from ");
                                                break;
                                            } else {
                                                v90Var2.GWasM1elztuh(t90Var2, l90Var2);
                                                wb.iriv6doqetn(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                f4Var2.getClass();
                for (ir irVar3 = (ir) f4Var2.xqGvceK5x; irVar3 != null; irVar3 = irVar3.encWxUiV2) {
                    if (!irVar3.mOu10nynGul) {
                        hvVar.mOu10nynGul(irVar3);
                    }
                }
            }
            ir irVar4 = (ir) this.Yi7zF1RB1.xqGvceK5x;
            if (!this.EljAMC1QTz && irVar4 != null && this.encWxUiV2.compareTo(irVar4.EljAMC1QTz.GWasM1elztuh) > 0) {
                f4 f4Var3 = this.Yi7zF1RB1;
                final int i2 = 1;
                hv hvVar2 = new hv(this) { // from class: u90
                    public final /* synthetic */ w90 EljAMC1QTz;

                    {
                        this.EljAMC1QTz = this;
                    }

                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj2) {
                        int i22 = i2;
                        kc1 kc1Var = kc1.GWasM1elztuh;
                        t90 t90Var2 = t90Var;
                        w90 w90Var = this.EljAMC1QTz;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                s90 s90Var = (s90) entry.getKey();
                                v90 v90Var = (v90) entry.getValue();
                                while (true) {
                                    m90 m90Var4 = v90Var.GWasM1elztuh;
                                    m90 m90Var5 = w90Var.encWxUiV2;
                                    ArrayList arrayList = w90Var.AvO7iQsrTN;
                                    if (m90Var4.compareTo(m90Var5) > 0 && !w90Var.EljAMC1QTz) {
                                        f4 f4Var32 = w90Var.Yi7zF1RB1;
                                        f4Var32.getClass();
                                        s90Var.getClass();
                                        if (!((hg0) f4Var32.Yi7zF1RB1).X1lG3V04pd(s90Var)) {
                                            break;
                                        } else {
                                            j90 j90Var = l90.Companion;
                                            m90 m90Var6 = v90Var.GWasM1elztuh;
                                            j90Var.getClass();
                                            m90Var6.getClass();
                                            int ordinal = m90Var6.ordinal();
                                            l90 l90Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : l90.ON_PAUSE : l90.ON_STOP : l90.ON_DESTROY;
                                            if (l90Var == null) {
                                                o4.Mjvvu5DE(v90Var.GWasM1elztuh, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(l90Var.GWasM1elztuh());
                                                v90Var.GWasM1elztuh(t90Var2, l90Var);
                                                wb.iriv6doqetn(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                s90 s90Var2 = (s90) entry.getKey();
                                v90 v90Var2 = (v90) entry.getValue();
                                while (true) {
                                    m90 m90Var7 = v90Var2.GWasM1elztuh;
                                    m90 m90Var8 = w90Var.encWxUiV2;
                                    ArrayList arrayList2 = w90Var.AvO7iQsrTN;
                                    if (m90Var7.compareTo(m90Var8) < 0 && !w90Var.EljAMC1QTz) {
                                        f4 f4Var4 = w90Var.Yi7zF1RB1;
                                        f4Var4.getClass();
                                        s90Var2.getClass();
                                        if (!((hg0) f4Var4.Yi7zF1RB1).X1lG3V04pd(s90Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(v90Var2.GWasM1elztuh);
                                            j90 j90Var2 = l90.Companion;
                                            m90 m90Var9 = v90Var2.GWasM1elztuh;
                                            j90Var2.getClass();
                                            m90Var9.getClass();
                                            int ordinal2 = m90Var9.ordinal();
                                            l90 l90Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : l90.ON_RESUME : l90.ON_START : l90.ON_CREATE;
                                            if (l90Var2 == null) {
                                                o4.Mjvvu5DE(v90Var2.GWasM1elztuh, "no event up from ");
                                                break;
                                            } else {
                                                v90Var2.GWasM1elztuh(t90Var2, l90Var2);
                                                wb.iriv6doqetn(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                f4Var3.getClass();
                for (ir irVar5 = (ir) f4Var3.X1lG3V04pd; irVar5 != null; irVar5 = irVar5.AvO7iQsrTN) {
                    if (!irVar5.mOu10nynGul) {
                        hvVar2.mOu10nynGul(irVar5);
                    }
                }
            }
        }
        this.EljAMC1QTz = false;
        this.mOu10nynGul.mOu10nynGul(this.encWxUiV2);
    }

    public final void EljAMC1QTz(s90 s90Var) {
        s90Var.getClass();
        X1lG3V04pd("removeObserver");
        f4 f4Var = this.Yi7zF1RB1;
        f4Var.getClass();
        ir irVar = (ir) ((hg0) f4Var.Yi7zF1RB1).rQPn8YBR(s90Var);
        if (irVar == null) {
            return;
        }
        ir irVar2 = irVar.encWxUiV2;
        ir irVar3 = irVar.AvO7iQsrTN;
        if (irVar2 == null) {
            f4Var.X1lG3V04pd = irVar3;
        } else {
            irVar2.AvO7iQsrTN = irVar3;
        }
        ir irVar4 = irVar.AvO7iQsrTN;
        if (irVar4 == null) {
            f4Var.xqGvceK5x = irVar2;
        } else {
            irVar4.encWxUiV2 = irVar2;
        }
        irVar.mOu10nynGul = true;
    }

    public final void GWasM1elztuh(s90 s90Var) {
        r90 okVar;
        v90 v90Var;
        t90 t90Var;
        s90Var.getClass();
        X1lG3V04pd("addObserver");
        m90 m90Var = this.encWxUiV2;
        m90 m90Var2 = m90.OOA6hdeuvCS;
        if (m90Var != m90Var2) {
            m90Var2 = m90.EljAMC1QTz;
        }
        v90 v90Var2 = new v90();
        v90Var2.GWasM1elztuh = m90Var2;
        HashMap hashMap = ca0.GWasM1elztuh;
        boolean z = s90Var instanceof r90;
        boolean z2 = s90Var instanceof mk;
        int i = 2;
        if (z && z2) {
            okVar = new ok((mk) s90Var, (r90) s90Var);
        } else if (z2) {
            okVar = new ok((mk) s90Var, (r90) null);
        } else if (z) {
            okVar = (r90) s90Var;
        } else {
            Class<?> cls = s90Var.getClass();
            if (ca0.Yi7zF1RB1(cls) == 2) {
                Object obj = ca0.Yi7zF1RB1.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    ca0.GWasM1elztuh((Constructor) list.get(0), s90Var);
                    throw null;
                }
                int size = list.size();
                wx[] wxVarArr = new wx[size];
                if (size > 0) {
                    ca0.GWasM1elztuh((Constructor) list.get(0), s90Var);
                    throw null;
                }
                okVar = new jt0(i, wxVarArr);
            } else {
                okVar = new ok(s90Var);
            }
        }
        v90Var2.Yi7zF1RB1 = okVar;
        f4 f4Var = this.Yi7zF1RB1;
        f4Var.getClass();
        hg0 hg0Var = (hg0) f4Var.Yi7zF1RB1;
        ir irVar = (ir) hg0Var.AvO7iQsrTN(s90Var);
        if (irVar != null) {
            v90Var = irVar.EljAMC1QTz;
        } else {
            ir irVar2 = new ir(s90Var, v90Var2);
            hg0Var.XnEVoBF0td1l(s90Var, irVar2);
            ir irVar3 = (ir) f4Var.xqGvceK5x;
            if (irVar3 == null) {
                f4Var.X1lG3V04pd = irVar2;
                f4Var.xqGvceK5x = irVar2;
            } else {
                irVar3.AvO7iQsrTN = irVar2;
                irVar2.encWxUiV2 = irVar3;
                f4Var.xqGvceK5x = irVar2;
            }
            v90Var = null;
        }
        if (v90Var == null && (t90Var = (t90) this.X1lG3V04pd.GWasM1elztuh.get()) != null) {
            boolean z3 = this.xqGvceK5x != 0 || this.OOA6hdeuvCS;
            m90 Yi7zF1RB1 = Yi7zF1RB1(s90Var);
            this.xqGvceK5x++;
            while (v90Var2.GWasM1elztuh.compareTo(Yi7zF1RB1) < 0) {
                f4 f4Var2 = this.Yi7zF1RB1;
                f4Var2.getClass();
                if (!((hg0) f4Var2.Yi7zF1RB1).X1lG3V04pd(s90Var)) {
                    break;
                }
                m90 m90Var3 = v90Var2.GWasM1elztuh;
                ArrayList arrayList = this.AvO7iQsrTN;
                arrayList.add(m90Var3);
                j90 j90Var = l90.Companion;
                m90 m90Var4 = v90Var2.GWasM1elztuh;
                j90Var.getClass();
                m90Var4.getClass();
                int ordinal = m90Var4.ordinal();
                l90 l90Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : l90.ON_RESUME : l90.ON_START : l90.ON_CREATE;
                if (l90Var == null) {
                    o4.XnEVoBF0td1l(v90Var2.GWasM1elztuh, "no event up from ");
                    return;
                } else {
                    v90Var2.GWasM1elztuh(t90Var, l90Var);
                    wb.iriv6doqetn(arrayList);
                    Yi7zF1RB1 = Yi7zF1RB1(s90Var);
                }
            }
            if (!z3) {
                AvO7iQsrTN();
            }
            this.xqGvceK5x--;
        }
    }

    public final void OOA6hdeuvCS(m90 m90Var) {
        if (this.encWxUiV2 == m90Var) {
            return;
        }
        t90 t90Var = (t90) this.X1lG3V04pd.GWasM1elztuh.get();
        m90 m90Var2 = this.encWxUiV2;
        m90 m90Var3 = m90.EljAMC1QTz;
        m90 m90Var4 = m90.OOA6hdeuvCS;
        if (m90Var2 == m90Var3 && m90Var == m90Var4) {
            throw new IllegalStateException(("State must be at least '" + m90.AvO7iQsrTN + "' to be moved to '" + m90Var + "' in component " + t90Var).toString());
        }
        if (m90Var2 == m90Var4 && m90Var2 != m90Var) {
            throw new IllegalStateException(("State is '" + m90Var4 + "' and cannot be moved to `" + m90Var + "` in component " + t90Var).toString());
        }
        this.encWxUiV2 = m90Var;
        if (this.OOA6hdeuvCS || this.xqGvceK5x != 0) {
            this.EljAMC1QTz = true;
            return;
        }
        this.OOA6hdeuvCS = true;
        AvO7iQsrTN();
        this.OOA6hdeuvCS = false;
        if (this.encWxUiV2 == m90Var4) {
            this.Yi7zF1RB1 = new f4(5);
        }
    }

    public final void X1lG3V04pd(String str) {
        n4 n4Var;
        if (this.GWasM1elztuh) {
            if (n4.X1lG3V04pd != null) {
                n4Var = n4.X1lG3V04pd;
            } else {
                synchronized (n4.class) {
                    try {
                        if (n4.X1lG3V04pd == null) {
                            n4.X1lG3V04pd = new n4(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                n4Var = n4.X1lG3V04pd;
            }
            ((n4) n4Var.GWasM1elztuh).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            o4.encWxUiV2("Method ", str, " must be called on the main thread");
        }
    }

    public final m90 Yi7zF1RB1(s90 s90Var) {
        f4 f4Var = this.Yi7zF1RB1;
        f4Var.getClass();
        s90Var.getClass();
        ir irVar = (ir) ((hg0) f4Var.Yi7zF1RB1).AvO7iQsrTN(s90Var);
        ir irVar2 = irVar != null ? irVar.encWxUiV2 : null;
        m90 m90Var = irVar2 != null ? irVar2.EljAMC1QTz.GWasM1elztuh : null;
        ArrayList arrayList = this.AvO7iQsrTN;
        m90 m90Var2 = arrayList.isEmpty() ? null : (m90) arrayList.get(arrayList.size() - 1);
        m90 m90Var3 = this.encWxUiV2;
        if (m90Var == null || m90Var.compareTo(m90Var3) >= 0) {
            m90Var = m90Var3;
        }
        return (m90Var2 == null || m90Var2.compareTo(m90Var) >= 0) ? m90Var : m90Var2;
    }

    public final void xqGvceK5x(l90 l90Var) {
        l90Var.getClass();
        X1lG3V04pd("handleLifecycleEvent");
        OOA6hdeuvCS(l90Var.GWasM1elztuh());
    }
}
