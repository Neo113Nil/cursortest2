package I1;

import D.G;
import D.x;
import D1.C;
import J3.q;
import P.u;
import Q2.C0365j;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.C2590Gf;
import com.google.android.gms.internal.ads.C2821Tp;
import com.google.android.gms.internal.ads.C3027c;
import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.C3131dx;
import com.google.android.gms.internal.ads.C3344hu;
import com.google.android.gms.internal.ads.C3571m6;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.C3733p6;
import com.google.android.gms.internal.ads.C4152wv;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.F8;
import com.google.android.gms.internal.ads.G8;
import com.google.android.gms.internal.ads.InterfaceC3352i1;
import com.google.android.gms.internal.ads.K0;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.L5;
import com.google.android.gms.internal.ads.RC;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f8.j;
import f8.l;
import f8.s;
import f8.y;
import g8.o;
import h.C4549e;
import h.C4550f;
import h.C4551g;
import h.DialogInterfaceC4552h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.jvm.internal.h;
import l.n;
import l1.C4666a;
import l3.InterfaceC4673a;
import l3.m;
import r2.C4906k;
import u7.AbstractC5075a;
import u7.C5076b;
import u7.v;
import v7.C5117h;
import w.AbstractC5128c;
import w1.w;
import w2.z;
import x2.f;
import x2.i;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class a implements b, InterfaceC3352i1, KD, InterfaceC4673a, u, x2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1302n;

    /* renamed from: u, reason: collision with root package name */
    public int f1303u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1304v;

    public /* synthetic */ a(char c9, int i) {
        this.f1302n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, C5076b c5076b, B7.a aVar2) {
        o oVar;
        int i;
        byte f2;
        LinkedHashMap linkedHashMap;
        G g9;
        a aVar3;
        byte b9;
        LinkedHashMap linkedHashMap2;
        if (aVar2 instanceof o) {
            oVar = (o) aVar2;
            int i4 = oVar.f37756z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oVar.f37756z = i4 - Integer.MIN_VALUE;
                Object obj = oVar.f37754x;
                A7.a aVar4 = A7.a.f215n;
                i = oVar.f37756z;
                if (i != 0) {
                    Q3.b.s(obj);
                    G g10 = (G) aVar.f1304v;
                    f2 = g10.f((byte) 6);
                    if (g10.r() == 4) {
                        G.n(g10, "Unexpected leading comma", 0, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = oVar.f37753w;
                    linkedHashMap2 = oVar.f37752v;
                    aVar3 = oVar.f37751u;
                    C5076b c5076b2 = oVar.f37750n;
                    Q3.b.s(obj);
                    linkedHashMap2.put(str, (l) obj);
                    b9 = ((G) aVar3.f1304v).e();
                    if (b9 != 4) {
                        if (b9 != 7) {
                            G.n((G) aVar3.f1304v, "Expected end of the object or comma", 0, 6);
                            throw null;
                        }
                        G g11 = (G) aVar3.f1304v;
                        if (b9 != 6) {
                            g11.f((byte) 7);
                        } else if (b9 == 4) {
                            g8.l.e(g11, "object");
                            throw null;
                        }
                        return new y(linkedHashMap2);
                    }
                    f2 = b9;
                    aVar = aVar3;
                    linkedHashMap = linkedHashMap2;
                    c5076b = c5076b2;
                }
                g9 = (G) aVar.f1304v;
                if (g9.b()) {
                    byte b10 = f2;
                    aVar3 = aVar;
                    b9 = b10;
                    linkedHashMap2 = linkedHashMap;
                    G g112 = (G) aVar3.f1304v;
                    if (b9 != 6) {
                    }
                    return new y(linkedHashMap2);
                }
                String i6 = g9.i();
                g9.f((byte) 5);
                oVar.f37750n = c5076b;
                oVar.f37751u = aVar;
                oVar.f37752v = linkedHashMap;
                oVar.f37753w = i6;
                oVar.f37756z = 1;
                c5076b.getClass();
                c5076b.f41045u = oVar;
                return aVar4;
            }
        }
        oVar = new o(aVar, aVar2);
        Object obj2 = oVar.f37754x;
        A7.a aVar42 = A7.a.f215n;
        i = oVar.f37756z;
        if (i != 0) {
        }
        g9 = (G) aVar.f1304v;
        if (g9.b()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC4552h b() {
        C0365j c0365j = (C0365j) this.f1304v;
        DialogInterfaceC4552h dialogInterfaceC4552h = new DialogInterfaceC4552h((ContextThemeWrapper) c0365j.f2568v, this.f1303u);
        View view = (View) c0365j.f2572z;
        C4551g c4551g = dialogInterfaceC4552h.f37923y;
        if (view != null) {
            c4551g.f37911n = view;
        } else {
            CharSequence charSequence = (CharSequence) c0365j.f2571y;
            if (charSequence != null) {
                c4551g.f37902d = charSequence;
                TextView textView = c4551g.f37909l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) c0365j.f2570x;
            if (drawable != null) {
                c4551g.f37907j = drawable;
                ImageView imageView = c4551g.f37908k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c4551g.f37908k.setImageDrawable(drawable);
                }
            }
        }
        if (c0365j.f2564B != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) c0365j.f2569w).inflate(c4551g.f37915r, (ViewGroup) null);
            int i = c0365j.f2566n ? c4551g.f37916s : c4551g.f37917t;
            Object obj = c0365j.f2564B;
            ?? r72 = obj;
            if (obj == null) {
                r72 = new C4550f((ContextThemeWrapper) c0365j.f2568v, i, R.id.text1, null);
            }
            c4551g.f37912o = r72;
            c4551g.f37913p = c0365j.f2567u;
            if (((DialogInterface.OnClickListener) c0365j.f2565C) != null) {
                alertController$RecycleListView.setOnItemClickListener(new C4549e(c0365j, c4551g));
            }
            if (c0365j.f2566n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c4551g.f37903e = alertController$RecycleListView;
        }
        dialogInterfaceC4552h.setCancelable(true);
        dialogInterfaceC4552h.setCanceledOnTouchOutside(true);
        dialogInterfaceC4552h.setOnCancelListener(null);
        dialogInterfaceC4552h.setOnDismissListener(null);
        n nVar = (n) c0365j.f2563A;
        if (nVar != null) {
            dialogInterfaceC4552h.setOnKeyListener(nVar);
        }
        return dialogInterfaceC4552h;
    }

    public void c(int i, int i4) {
        int i6 = i4 + i;
        char[] cArr = (char[]) this.f1304v;
        if (cArr.length <= i6) {
            int i9 = i * 2;
            if (i6 < i9) {
                i6 = i9;
            }
            char[] copyOf = Arrays.copyOf(cArr, i6);
            h.d(copyOf, "copyOf(...)");
            this.f1304v = copyOf;
        }
    }

    public boolean d() {
        return ((C4666a) this.f1304v) != null;
    }

    @Override // I1.b
    public w e(w wVar, u1.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) wVar.get()).compress((Bitmap.CompressFormat) this.f1304v, this.f1303u, byteArrayOutputStream);
        wVar.a();
        return new C(byteArrayOutputStream.toByteArray());
    }

    @Override // P.u
    public boolean f(View view) {
        ((BottomSheetBehavior) this.f1304v).B(this.f1303u);
        return true;
    }

    @Override // l3.InterfaceC4673a
    public Object g(m mVar) {
        if (!mVar.i()) {
            return Boolean.FALSE;
        }
        C3131dx c3131dx = (C3131dx) mVar.g();
        byte[] b9 = ((C3733p6) ((C3571m6) this.f1304v).j()).b();
        c3131dx.getClass();
        q qVar = new q(c3131dx, b9);
        qVar.f1503b = this.f1303u;
        qVar.b();
        return Boolean.TRUE;
    }

    public void h(int i, y8.c cVar) {
        while (true) {
            int i4 = i >> 1;
            if (i4 == 0) {
                break;
            }
            y8.c cVar2 = ((y8.c[]) this.f1304v)[i4];
            h.b(cVar2);
            if (h.g(0L, cVar.f41973c - cVar2.f41973c) <= 0) {
                break;
            }
            cVar2.f41917f = i;
            ((y8.c[]) this.f1304v)[i] = cVar2;
            i = i4;
        }
        ((y8.c[]) this.f1304v)[i] = cVar;
        cVar.f41917f = i;
    }

    public l i() {
        l yVar;
        Object obj;
        G g9 = (G) this.f1304v;
        byte r9 = g9.r();
        if (r9 == 1) {
            return l(true);
        }
        if (r9 == 0) {
            return l(false);
        }
        if (r9 != 6) {
            if (r9 == 8) {
                return k();
            }
            G.n(g9, "Cannot read Json element because of unexpected ".concat(g8.l.j(r9)), 0, 6);
            throw null;
        }
        int i = this.f1303u + 1;
        this.f1303u = i;
        if (i == 200) {
            g8.n nVar = new g8.n(this, null);
            A7.a aVar = AbstractC5075a.f41043a;
            C5076b c5076b = new C5076b();
            c5076b.f41044n = nVar;
            c5076b.f41045u = c5076b;
            A7.a aVar2 = AbstractC5075a.f41043a;
            c5076b.f41046v = aVar2;
            while (true) {
                obj = c5076b.f41046v;
                InterfaceC5240d interfaceC5240d = c5076b.f41045u;
                if (interfaceC5240d == null) {
                    break;
                }
                if (h.a(aVar2, obj)) {
                    try {
                        g8.n nVar2 = c5076b.f41044n;
                        kotlin.jvm.internal.u.b(3, nVar2);
                        g8.n nVar3 = new g8.n(nVar2.f37749w, interfaceC5240d);
                        nVar3.f37748v = c5076b;
                        Object invokeSuspend = nVar3.invokeSuspend(v.f41073a);
                        if (invokeSuspend != A7.a.f215n) {
                            interfaceC5240d.resumeWith(invokeSuspend);
                        }
                    } catch (Throwable th) {
                        interfaceC5240d.resumeWith(Q3.b.b(th));
                    }
                } else {
                    c5076b.f41046v = aVar2;
                    interfaceC5240d.resumeWith(obj);
                }
            }
            Q3.b.s(obj);
            yVar = (l) obj;
        } else {
            byte f2 = g9.f((byte) 6);
            if (g9.r() == 4) {
                G.n(g9, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!g9.b()) {
                    break;
                }
                String i4 = g9.i();
                g9.f((byte) 5);
                linkedHashMap.put(i4, i());
                f2 = g9.e();
                if (f2 != 4) {
                    if (f2 != 7) {
                        G.n(g9, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (f2 == 6) {
                g9.f((byte) 7);
            } else if (f2 == 4) {
                g8.l.e(g9, "object");
                throw null;
            }
            yVar = new y(linkedHashMap);
        }
        this.f1303u--;
        return yVar;
    }

    @Override // x2.e
    public /* synthetic */ void j(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f1303u);
        jsonWriter.endObject();
        f.d(jsonWriter, (Map) this.f1304v);
        jsonWriter.endObject();
    }

    public f8.e k() {
        G g9 = (G) this.f1304v;
        byte e9 = g9.e();
        if (g9.r() == 4) {
            G.n(g9, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (g9.b()) {
            arrayList.add(i());
            e9 = g9.e();
            if (e9 != 4) {
                boolean z6 = e9 == 9;
                int i = g9.f333u;
                if (!z6) {
                    G.n(g9, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (e9 == 8) {
            g9.f((byte) 9);
        } else if (e9 == 4) {
            g8.l.e(g9, "array");
            throw null;
        }
        return new f8.e(arrayList);
    }

    public f8.C l(boolean z6) {
        G g9 = (G) this.f1304v;
        String j6 = !z6 ? g9.j() : g9.i();
        return (z6 || !h.a(j6, "null")) ? new s(j6, z6) : f8.v.INSTANCE;
    }

    public void m() {
        g8.b bVar = g8.b.f37734c;
        char[] array = (char[]) this.f1304v;
        bVar.getClass();
        h.e(array, "array");
        synchronized (bVar) {
            int i = bVar.f35585a;
            if (array.length + i < g8.a.f37733a) {
                bVar.f35585a = i + array.length;
                ((C5117h) bVar.f35586b).addLast(array);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f1302n) {
            case 7:
                String a9 = k.a(this.f1303u);
                C4906k.f40186C.f40198k.getClass();
                ((C3069co) ((C2590Gf) this.f1304v).f25833x).c(a9, System.currentTimeMillis());
                break;
            default:
                String str = (String) obj;
                C3344hu c3344hu = (C3344hu) this.f1304v;
                St st = c3344hu.f31738a;
                if (!st.f28405i0) {
                    c3344hu.f31740c.b(str, st.f28434x0, c3344hu.f31742e, null);
                    break;
                } else {
                    String str2 = c3344hu.f31739b.f28801b;
                    C4152wv c4152wv = c3344hu.f31741d;
                    c4152wv.getClass();
                    C4906k.f40186C.f40198k.getClass();
                    C3732p5 c3732p5 = new C3732p5(str2, str, this.f1303u, System.currentTimeMillis());
                    C2821Tp c2821Tp = c4152wv.f35684a;
                    c2821Tp.getClass();
                    c2821Tp.a(new S0.l(17, c2821Tp, c3732p5));
                    break;
                }
        }
    }

    public void o(y8.c node) {
        y8.c cVar;
        h.e(node, "node");
        int i = node.f41917f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i4 = this.f1303u;
        y8.c cVar2 = ((y8.c[]) this.f1304v)[i4];
        h.b(cVar2);
        node.f41917f = -1;
        ((y8.c[]) this.f1304v)[i4] = null;
        this.f1303u = i4 - 1;
        if (node == cVar2) {
            return;
        }
        int g9 = h.g(0L, cVar2.f41973c - node.f41973c);
        if (g9 == 0) {
            ((y8.c[]) this.f1304v)[i] = cVar2;
            cVar2.f41917f = i;
            return;
        }
        if (g9 >= 0) {
            h(i, cVar2);
            return;
        }
        while (true) {
            int i6 = i << 1;
            int i9 = i6 + 1;
            int i10 = this.f1303u;
            if (i9 > i10) {
                if (i6 > i10) {
                    break;
                }
                cVar = ((y8.c[]) this.f1304v)[i6];
                h.b(cVar);
            } else {
                cVar = ((y8.c[]) this.f1304v)[i6];
                h.b(cVar);
                y8.c cVar3 = ((y8.c[]) this.f1304v)[i9];
                h.b(cVar3);
                if (h.g(0L, cVar3.f41973c - cVar.f41973c) >= 0) {
                    cVar = cVar3;
                }
            }
            if (h.g(0L, cVar.f41973c - cVar2.f41973c) <= 0) {
                break;
            }
            int i11 = cVar.f41917f;
            cVar.f41917f = i;
            ((y8.c[]) this.f1304v)[i] = cVar;
            i = i11;
        }
        ((y8.c[]) this.f1304v)[i] = cVar2;
        cVar2.f41917f = i;
    }

    public void p(String text) {
        h.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        c(this.f1303u, length);
        text.getChars(0, text.length(), (char[]) this.f1304v, this.f1303u);
        this.f1303u += length;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public String q(ArrayList arrayList) {
        char c9;
        int i;
        char c10 = 5;
        int i4 = 1;
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r52 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            sb.append(((String) arrayList.get(i6)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        C3027c c3027c = new C3027c(16);
        int i9 = this.f1303u;
        PriorityQueue priorityQueue = new PriorityQueue(i9, c3027c);
        int i10 = 0;
        while (i10 < split.length) {
            String[] v9 = SK.v(split[i10], r52);
            if (v9.length != 0) {
                int length = v9.length;
                if (length >= 6) {
                    long y7 = AbstractC2792Sd.y(v9, 6);
                    i = i4;
                    AbstractC2792Sd.n(i9, y7, AbstractC2792Sd.t(v9, r52, 6), 6, priorityQueue);
                    long j6 = y7;
                    int i11 = i;
                    while (true) {
                        int length2 = v9.length;
                        if (i11 >= length2 - 5) {
                            break;
                        }
                        int e9 = SK.e(v9[i11 - 1]);
                        long e10 = SK.e(v9[i11 + 5]);
                        String t6 = AbstractC2792Sd.t(v9, i11, 6);
                        long u6 = (((e10 + 2147483647L) % 1073807359) + (((((j6 + 1073807359) - ((((e9 + 2147483647L) % 1073807359) * AbstractC2792Sd.u(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                        AbstractC2792Sd.n(i9, u6, t6, length2, priorityQueue);
                        split = split;
                        j6 = u6;
                        i11++;
                        c10 = 5;
                    }
                } else {
                    AbstractC2792Sd.n(i9, AbstractC2792Sd.y(v9, length), AbstractC2792Sd.t(v9, r52, length), length, priorityQueue);
                    i = i4;
                }
                c9 = c10;
            } else {
                c9 = c10;
                i = i4;
            }
            i10++;
            split = split;
            c10 = c9;
            i4 = i;
            r52 = 0;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((F8) this.f1304v).R1(((G8) it.next()).f25728b));
            } catch (IOException e11) {
                int i12 = z.f41712b;
                i.d("Error while writing hash to byteStream", e11);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e12) {
            int i13 = z.f41712b;
            i.d("HashManager: Unable to convert to Base64.", e12);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e13) {
            int i14 = z.f41712b;
            i.d("HashManager: Unable to convert to Base64.", e13);
            return "";
        }
    }

    public void r() {
        int i = this.f1303u;
        long[] jArr = (long[]) this.f1304v;
        if (i == jArr.length) {
            this.f1304v = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.f1304v;
        int i4 = this.f1303u;
        this.f1303u = i4 + 1;
        jArr2[i4] = 0;
    }

    public void s(int i, byte[] bArr) {
        int i4 = 1777080124;
        int i6 = 1777080124;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        char c9 = 0;
        int i21 = 0;
        char c10 = 0;
        char c11 = 0;
        while (true) {
            if (i6 == 719824015) {
                int i22 = (-235787554) + i6;
                i6 += 799411447;
                if (i9 == i10) {
                    i6 = i22;
                }
            } else if (i6 == 1519235462) {
                int[] iArr = (int[]) this.f1304v;
                i11 += (((i12 << i13) ^ (i12 >>> i14)) + i12) ^ (i9 + iArr[i9 & i15]);
                i9 += i16;
                i12 += (iArr[(i9 >>> i17) & i15] + i9) ^ (((i11 << i13) ^ (i11 >>> i14)) + i11);
                i6 -= 799411447;
            } else {
                if (i6 != i4) {
                    bArr[0] = (byte) (i11 >> i18);
                    bArr[1] = (byte) ((((i11 >> i19) & i20) << i18) >> i18);
                    bArr[c9] = (byte) ((((i11 >> i21) & i20) << i18) >> i18);
                    bArr[i15] = (byte) (((i11 & i20) << i18) >> i18);
                    bArr[i13] = (byte) (i12 >> i18);
                    bArr[i14] = (byte) ((((i12 >> i19) & i20) << i18) >> i18);
                    bArr[c10] = (byte) ((((i12 >> i21) & i20) << i18) >> i18);
                    bArr[c11] = (byte) (((i12 & i20) << i18) >> i18);
                    return;
                }
                i6 -= 1057256109;
                i11 = this.f1303u;
                i15 = 3;
                i20 = p.f9259b;
                c11 = 7;
                c10 = 6;
                c9 = 2;
                i18 = 24;
                i17 = 11;
                i16 = 1340169305;
                i14 = 5;
                i13 = 4;
                i10 = -64255200;
                i19 = 16;
                i21 = 8;
                i12 = i;
                i9 = 0;
            }
            i4 = 1777080124;
        }
    }

    public String toString() {
        switch (this.f1302n) {
            case 4:
                RC rc = (RC) this.f1304v;
                ArrayList arrayList = new ArrayList(rc.f27936u);
                for (int i = 0; i < rc.f27936u; i++) {
                    arrayList.add(AbstractC3182eu.a(rc.a(i)));
                }
                String a9 = AbstractC3182eu.a(this.f1303u);
                String obj = arrayList.toString();
                StringBuilder sb = new StringBuilder(AbstractC5128c.j(a9.length() + 37, 1, obj));
                sb.append("UnsupportedBrands{major=");
                sb.append(a9);
                sb.append(", compatible=");
                sb.append(obj);
                sb.append("}");
                return sb.toString();
            case 13:
                return new String((char[]) this.f1304v, 0, this.f1303u);
            default:
                return super.toString();
        }
    }

    public long u(K0 k02) {
        int i;
        Cr cr = (Cr) this.f1304v;
        int i4 = 0;
        k02.E(cr.f24997a, 0, 1, false);
        int i6 = cr.f24997a[0] & 255;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while (true) {
            i = i10 + 1;
            if ((i6 & i9) != 0) {
                break;
            }
            i9 >>= 1;
            i10 = i;
        }
        int i11 = i6 & (~i9);
        k02.E(cr.f24997a, 1, i10, false);
        while (i4 < i10) {
            i4++;
            i11 = (cr.f24997a[i4] & 255) + (i11 << 8);
        }
        this.f1303u += i;
        return i11;
    }

    public void v(long[] jArr) {
        int i = this.f1303u;
        int length = jArr.length;
        int i4 = i + length;
        long[] jArr2 = (long[]) this.f1304v;
        int length2 = jArr2.length;
        if (i4 > length2) {
            this.f1304v = Arrays.copyOf(jArr2, Math.max(length2 + length2, i4));
        }
        System.arraycopy(jArr, 0, (long[]) this.f1304v, this.f1303u, length);
        this.f1303u = i4;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f1302n) {
            case 7:
                break;
            default:
                C4906k.f40186C.f40196h.d("BufferingUrlPinger.attributionReportingManager", th);
                break;
        }
    }

    public long x(int i) {
        if (i >= 0 && i < this.f1303u) {
            return ((long[]) this.f1304v)[i];
        }
        int i4 = this.f1303u;
        throw new IndexOutOfBoundsException(x.o(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i4).length()), "Invalid index ", i, ", size is ", i4));
    }

    public /* synthetic */ a(int i, Object obj, int i4) {
        this.f1302n = i4;
        this.f1303u = i;
        this.f1304v = obj;
    }

    public /* synthetic */ a(Object obj, int i, int i4) {
        this.f1302n = i4;
        this.f1304v = obj;
        this.f1303u = i;
    }

    public a(boolean z6, boolean z9, boolean z10) {
        this.f1302n = 12;
        int i = 1;
        if (!z6 && !z9 && !z10) {
            i = 0;
        }
        this.f1303u = i;
    }

    public a(int i, int i4) {
        this.f1302n = i4;
        switch (i4) {
            case 8:
                this.f1304v = new long[i];
                break;
            default:
                this.f1304v = new F8(3);
                this.f1303u = i;
                break;
        }
    }

    public a(int i, int i4, int[] iArr) {
        RC rc;
        this.f1302n = i4;
        switch (i4) {
            case 5:
                int length = iArr.length;
                if (length == 4) {
                    this.f1303u = i;
                    this.f1304v = iArr;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(Wv.b(length, 44));
                    sb.append(L5.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb.append(length);
                    sb.append(L5.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb.toString());
                }
            default:
                this.f1303u = i;
                if (iArr != null) {
                    int[] copyOf = Arrays.copyOf(iArr, iArr.length);
                    rc = new RC(copyOf, copyOf.length);
                } else {
                    rc = RC.f27934v;
                }
                this.f1304v = rc;
                return;
        }
    }

    public a(O2.b bVar, int i) {
        this.f1302n = 2;
        R2.w.h(bVar);
        this.f1304v = bVar;
        this.f1303u = i;
    }

    public a(C2590Gf c2590Gf, int i) {
        this.f1302n = 7;
        this.f1303u = i;
        Objects.requireNonNull(c2590Gf);
        this.f1304v = c2590Gf;
    }

    public a(C3344hu c3344hu, int i) {
        this.f1302n = 10;
        this.f1303u = i;
        Objects.requireNonNull(c3344hu);
        this.f1304v = c3344hu;
    }

    public a(j jVar, G g9) {
        this.f1302n = 14;
        this.f1304v = g9;
    }

    public a(byte b9, int i) {
        this.f1302n = i;
        switch (i) {
            case 3:
                this.f1304v = new Cr(8);
                break;
            case 16:
                this.f1303u = p.f9259b;
                this.f1304v = null;
                break;
            default:
                this.f1304v = Bitmap.CompressFormat.JPEG;
                this.f1303u = 100;
                break;
        }
    }

    public a(Context context) {
        this.f1302n = 15;
        int e9 = DialogInterfaceC4552h.e(context, 0);
        this.f1304v = new C0365j(new ContextThemeWrapper(context, DialogInterfaceC4552h.e(context, e9)));
        this.f1303u = e9;
    }

    private final void t(Throwable th) {
    }
}
