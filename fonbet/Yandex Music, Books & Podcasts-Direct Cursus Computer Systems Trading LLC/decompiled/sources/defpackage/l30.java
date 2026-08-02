package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l30 extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public l30(yav yavVar) {
        this.b = new WeakReference(yavVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        xqh xqhVar;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                dsn dsnVar = (dsn) this.b.get();
                if (dsnVar != null) {
                    SparseArray sparseArray = dsnVar.h;
                    jsn jsnVar = dsnVar.i;
                    ArrayList arrayList = jsnVar.k;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    esn esnVar = null;
                    esn esnVar2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == dsnVar.g) {
                                dsnVar.g = 0;
                                if (jsnVar.n == dsnVar) {
                                    jsnVar.l();
                                }
                            }
                            if (((gsn) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                gsn.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (dsnVar.f == 0 && i3 == dsnVar.g && i4 >= 1) {
                                    dsnVar.g = 0;
                                    dsnVar.f = i4;
                                    bz2 t = bz2.t(bundle);
                                    if (jsnVar.n == dsnVar) {
                                        jsnVar.g(t);
                                    }
                                    if (jsnVar.n == dsnVar) {
                                        jsnVar.o = true;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((esn) arrayList.get(i5)).a(jsnVar.n);
                                        }
                                        fqh fqhVar = jsnVar.e;
                                        if (fqhVar != null) {
                                            dsn dsnVar2 = jsnVar.n;
                                            int i6 = dsnVar2.d;
                                            dsnVar2.d = i6 + 1;
                                            dsnVar2.b(10, i6, 0, fqhVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                gsn gsnVar = (gsn) sparseArray.get(i3);
                                if (gsnVar != null) {
                                    sparseArray.remove(i3);
                                    gsnVar.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((gsn) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    gsn.a(bundle3, string);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (dsnVar.f != 0) {
                                    bz2 t2 = bz2.t(bundle4);
                                    if (jsnVar.n == dsnVar) {
                                        jsnVar.g(t2);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                gsn gsnVar2 = (gsn) sparseArray.get(i3);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    gsnVar2.b(bundle5);
                                    break;
                                } else {
                                    gsnVar2.getClass();
                                    gsn.a(bundle5, "DynamicGroupRouteController is created without valid route id.");
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (dsnVar.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    dqh dqhVar = bundle7 != null ? new dqh(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            xqhVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            xqhVar = new xqh(bundle9 != null ? new dqh(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(xqhVar);
                                    }
                                    if (jsnVar.n == dsnVar) {
                                        Iterator it2 = arrayList.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                esn esnVar3 = (esn) it2.next();
                                                if (esnVar3.b() == i4) {
                                                    esnVar2 = esnVar3;
                                                }
                                            }
                                        }
                                        if (esnVar2 instanceof hsn) {
                                            ((hsn) esnVar2).l(dqhVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (jsnVar.n == dsnVar) {
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        esn esnVar4 = (esn) it3.next();
                                        if (esnVar4.b() == i4) {
                                            esnVar = esnVar4;
                                        }
                                    }
                                }
                                h5n h5nVar = jsnVar.p;
                                if (h5nVar != null && (esnVar instanceof zqh)) {
                                    zqh zqhVar = (zqh) esnVar;
                                    yld yldVar = (yld) ((d18) h5nVar.b).c;
                                    if (yldVar.e == zqhVar) {
                                        yldVar.i(yldVar.c(), 2);
                                    }
                                }
                                arrayList.remove(esnVar);
                                esnVar.c();
                                jsnVar.m();
                                break;
                            }
                            break;
                    }
                    int i7 = jsn.q;
                    break;
                }
                break;
            default:
                yav yavVar = (yav) this.b.get();
                if (yavVar != null) {
                    yavVar.a();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l30() {
    }

    public l30(dsn dsnVar) {
        this.b = new WeakReference(dsnVar);
    }
}
