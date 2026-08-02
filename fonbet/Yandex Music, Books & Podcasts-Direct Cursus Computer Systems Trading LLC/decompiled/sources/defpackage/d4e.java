package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class d4e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4e b;

    public /* synthetic */ d4e(f4e f4eVar, int i) {
        this.a = i;
        this.b = f4eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        Socket socket;
        switch (this.a) {
            case 0:
                f4e f4eVar = this.b;
                rv8 rv8Var = (rv8) f4eVar.j.get();
                if (rv8Var != null) {
                    gc8 gc8Var = f4eVar.a;
                    gc8Var.M(rv8Var, gc8Var.getDataTag());
                    return;
                }
                return;
            case 1:
                f4e f4eVar2 = this.b;
                if (f4eVar2.i.get()) {
                    int i = i9f.a;
                    String str = f4eVar2.c;
                    int i2 = f4eVar2.d;
                    f4eVar2.b(g4e.b);
                    try {
                        r7o r7oVar = z7o.b;
                        socket = new Socket(str, i2);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            t7oVar = CollectionsKt.X(t7g.E(bufferedReader), "", null, null, null, 62);
                            bufferedReader.close();
                            socket.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        int i3 = i9f.a;
                        f4eVar2.b(new h4e(a));
                        a.printStackTrace();
                    }
                    if (!(t7oVar instanceof t7o)) {
                        String str2 = (String) t7oVar;
                        int i4 = i9f.a;
                        ArrayList arrayList = new ArrayList();
                        v07 v07Var = new v07(5, arrayList);
                        int hashCode = str2.hashCode();
                        if (hashCode == f4eVar2.g) {
                            f4eVar2.a.postDelayed(new d4e(f4eVar2, 2), 250L);
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str2);
                                qc9 qc9Var = new qc9(v07Var);
                                if (jSONObject.has("card") && jSONObject.has("templates")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                                    JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                                    qc9Var.e(jSONObject2);
                                    int i5 = rv8.i;
                                    t7oVar2 = fgq.y(qc9Var, jSONObject3);
                                } else if (jSONObject.has("card")) {
                                    JSONObject jSONObject4 = jSONObject.getJSONObject("card");
                                    int i6 = rv8.i;
                                    t7oVar2 = fgq.y(qc9Var, jSONObject4);
                                } else {
                                    int i7 = rv8.i;
                                    t7oVar2 = fgq.y(qc9Var, jSONObject);
                                }
                            } catch (Throwable th2) {
                                r7o r7oVar3 = z7o.b;
                                t7oVar2 = new t7o(th2);
                            }
                            Throwable a2 = z7o.a(t7oVar2);
                            if (a2 != null) {
                                int i8 = i9f.a;
                                f4eVar2.b(new h4e(a2));
                            }
                            if (t7oVar2 instanceof t7o) {
                                t7oVar2 = null;
                            }
                            rv8 rv8Var2 = (rv8) t7oVar2;
                            if (rv8Var2 != null) {
                                rv8 divData = f4eVar2.a.getDivData();
                                if (f4eVar2.j.get() == null && divData != null) {
                                    int i9 = i9f.a;
                                    JSONObject r = divData.r();
                                    String str3 = f4eVar2.c;
                                    int i10 = f4eVar2.e;
                                    String jSONObject5 = r.toString();
                                    try {
                                        socket = new Socket(str3, i10);
                                        try {
                                            PrintWriter printWriter = new PrintWriter((Writer) new OutputStreamWriter(socket.getOutputStream()), true);
                                            printWriter.println(jSONObject5);
                                            printWriter.flush();
                                            socket.close();
                                            t7oVar3 = Unit.a;
                                        } finally {
                                        }
                                    } catch (Throwable th3) {
                                        r7o r7oVar4 = z7o.b;
                                        t7oVar3 = new t7o(th3);
                                    }
                                    Throwable a3 = z7o.a(t7oVar3);
                                    if (a3 != null) {
                                        int i11 = i9f.a;
                                        a3.printStackTrace();
                                        f4eVar2.a(a3);
                                    }
                                    if (!(t7oVar3 instanceof t7o)) {
                                        int i12 = i9f.a;
                                    }
                                    int i13 = i9f.a;
                                    f4eVar2.j.set(divData);
                                }
                                synchronized (d51.l) {
                                }
                                qht qhtVar = qht.a;
                                if (qhtVar.a()) {
                                    f4eVar2.a.y();
                                    f4eVar2.a.M(rv8Var2, new dw8(UUID.randomUUID().toString()));
                                    dfb b = f4eVar2.a.getViewComponent$div_release().i().b(rv8Var2, f4eVar2.a.getDataTag());
                                    if (b != null) {
                                        b.c();
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        f4eVar2.a((Throwable) it.next());
                                    }
                                    f4eVar2.g = hashCode;
                                    f4eVar2.b(g4e.a);
                                    int i14 = i9f.a;
                                } else {
                                    qhtVar.b(new e4e(f4eVar2, rv8Var2, arrayList, hashCode));
                                }
                            }
                        }
                    }
                    int i15 = i9f.a;
                    f4eVar2.k = f4eVar2.b.schedule(f4eVar2.l, 2L, TimeUnit.SECONDS);
                    return;
                }
                return;
            default:
                this.b.b(g4e.c);
                return;
        }
    }
}
