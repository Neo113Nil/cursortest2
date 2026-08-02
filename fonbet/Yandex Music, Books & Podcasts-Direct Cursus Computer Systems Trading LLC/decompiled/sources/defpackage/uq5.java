package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class uq5 implements ka8 {
    public final /* synthetic */ int a;
    public volatile boolean b;
    public Object c;

    public /* synthetic */ uq5(int i) {
        this.a = i;
    }

    @Override // defpackage.ka8
    public final void a() {
        switch (this.a) {
            case 0:
                if (this.b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.b) {
                            this.b = true;
                            n8n n8nVar = (n8n) this.c;
                            ArrayList arrayList = null;
                            this.c = null;
                            if (n8nVar != null) {
                                for (Object obj : (Object[]) n8nVar.e) {
                                    if (obj instanceof ka8) {
                                        try {
                                            ((ka8) obj).a();
                                        } catch (Throwable th) {
                                            leu.a0(th);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(th);
                                        }
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new ar5(arrayList);
                                    }
                                    throw aob.a((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (this.b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.b) {
                            this.b = true;
                            LinkedList linkedList = (LinkedList) this.c;
                            ArrayList arrayList2 = null;
                            this.c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((ka8) it.next()).a();
                                    } catch (Throwable th2) {
                                        leu.a0(th2);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(th2);
                                    }
                                }
                                if (arrayList2 != null) {
                                    if (arrayList2.size() != 1) {
                                        throw new ar5(arrayList2);
                                    }
                                    throw aob.a((Throwable) arrayList2.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final boolean b(ka8 ka8Var) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                n8n n8nVar = (n8n) this.c;
                                if (n8nVar == null) {
                                    n8nVar = new n8n(8, (byte) 0);
                                    int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    n8nVar.b = numberOfLeadingZeros - 1;
                                    n8nVar.d = (int) (0.75f * numberOfLeadingZeros);
                                    n8nVar.e = new Object[numberOfLeadingZeros];
                                    this.c = n8nVar;
                                }
                                n8nVar.a(ka8Var);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                ka8Var.a();
                return false;
            default:
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                LinkedList linkedList = (LinkedList) this.c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.c = linkedList;
                                }
                                linkedList.add(ka8Var);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                ka8Var.a();
                return false;
        }
    }

    public final boolean d(ka8 ka8Var) {
        Object obj;
        switch (this.a) {
            case 0:
                if (this.b) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.b) {
                            return false;
                        }
                        n8n n8nVar = (n8n) this.c;
                        if (n8nVar != null) {
                            Object[] objArr = (Object[]) n8nVar.e;
                            int i = n8nVar.b;
                            int hashCode = ka8Var.hashCode() * (-1640531527);
                            int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                            Object obj2 = objArr[i2];
                            if (obj2 != null) {
                                if (obj2.equals(ka8Var)) {
                                    n8nVar.z0(i2, i, objArr);
                                } else {
                                    do {
                                        i2 = (i2 + 1) & i;
                                        obj = objArr[i2];
                                        if (obj == null) {
                                        }
                                    } while (!obj.equals(ka8Var));
                                    n8nVar.z0(i2, i, objArr);
                                }
                                return true;
                            }
                        }
                        return false;
                    } finally {
                    }
                }
            default:
                boolean z = false;
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                LinkedList linkedList = (LinkedList) this.c;
                                if (linkedList != null && linkedList.remove(ka8Var)) {
                                    z = true;
                                }
                            }
                        } finally {
                        }
                    }
                }
                return z;
        }
    }

    public final boolean e(ka8 ka8Var) {
        switch (this.a) {
            case 0:
                if (d(ka8Var)) {
                    ka8Var.a();
                    break;
                }
                break;
            default:
                if (d(ka8Var)) {
                    ((gto) ka8Var).a();
                    break;
                }
                break;
        }
        return true;
    }
}
