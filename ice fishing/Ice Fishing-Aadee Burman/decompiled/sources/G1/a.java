package G1;

import B1.D;
import D.H;
import H3.q;
import O2.C0360j;
import P.u;
import P2.w;
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
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.C2570Gf;
import com.google.android.gms.internal.ads.C2800Tp;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.C3004c;
import com.google.android.gms.internal.ads.C3108dx;
import com.google.android.gms.internal.ads.C3321hu;
import com.google.android.gms.internal.ads.C3548m6;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.C3710p6;
import com.google.android.gms.internal.ads.C4129wv;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.F8;
import com.google.android.gms.internal.ads.G8;
import com.google.android.gms.internal.ads.InterfaceC3329i1;
import com.google.android.gms.internal.ads.K0;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.L5;
import com.google.android.gms.internal.ads.RC;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.St;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.icefishing.icefishinglive2.AbstractC4404f;
import f8.C;
import f8.j;
import f8.l;
import f8.s;
import f8.y;
import g8.o;
import h.C4545e;
import h.C4546f;
import h.C4547g;
import h.DialogInterfaceC4548h;
import j1.C4597a;
import j3.InterfaceC4604a;
import j3.m;
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
import p2.C4835j;
import u1.x;
import u2.z;
import u7.AbstractC5083a;
import u7.C5084b;
import u7.v;
import v2.i;
import v7.C5127h;
import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class a implements c, InterfaceC3329i1, KD, InterfaceC4604a, u, v2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1049n;

    /* renamed from: u, reason: collision with root package name */
    public int f1050u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1051v;

    public /* synthetic */ a(char c9, int i) {
        this.f1049n = i;
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
    public static final Object b(a aVar, C5084b c5084b, B7.a aVar2) {
        o oVar;
        int i;
        byte f3;
        LinkedHashMap linkedHashMap;
        H h9;
        a aVar3;
        byte b9;
        LinkedHashMap linkedHashMap2;
        if (aVar2 instanceof o) {
            oVar = (o) aVar2;
            int i6 = oVar.f37731z;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                oVar.f37731z = i6 - Integer.MIN_VALUE;
                Object obj = oVar.f37729x;
                A7.a aVar4 = A7.a.f58n;
                i = oVar.f37731z;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    H h10 = (H) aVar.f1051v;
                    f3 = h10.f((byte) 6);
                    if (h10.r() == 4) {
                        H.m(h10, "Unexpected leading comma", 0, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = oVar.f37728w;
                    linkedHashMap2 = oVar.f37727v;
                    aVar3 = oVar.f37726u;
                    C5084b c5084b2 = oVar.f37725n;
                    com.bumptech.glide.d.k(obj);
                    linkedHashMap2.put(str, (l) obj);
                    b9 = ((H) aVar3.f1051v).e();
                    if (b9 != 4) {
                        if (b9 != 7) {
                            H.m((H) aVar3.f1051v, "Expected end of the object or comma", 0, 6);
                            throw null;
                        }
                        H h11 = (H) aVar3.f1051v;
                        if (b9 != 6) {
                            h11.f((byte) 7);
                        } else if (b9 == 4) {
                            g8.l.e(h11, "object");
                            throw null;
                        }
                        return new y(linkedHashMap2);
                    }
                    f3 = b9;
                    aVar = aVar3;
                    linkedHashMap = linkedHashMap2;
                    c5084b = c5084b2;
                }
                h9 = (H) aVar.f1051v;
                if (h9.b()) {
                    byte b10 = f3;
                    aVar3 = aVar;
                    b9 = b10;
                    linkedHashMap2 = linkedHashMap;
                    H h112 = (H) aVar3.f1051v;
                    if (b9 != 6) {
                    }
                    return new y(linkedHashMap2);
                }
                String i9 = h9.i();
                h9.f((byte) 5);
                oVar.f37725n = c5084b;
                oVar.f37726u = aVar;
                oVar.f37727v = linkedHashMap;
                oVar.f37728w = i9;
                oVar.f37731z = 1;
                c5084b.getClass();
                c5084b.f41322u = oVar;
                return aVar4;
            }
        }
        oVar = new o(aVar, aVar2);
        Object obj2 = oVar.f37729x;
        A7.a aVar42 = A7.a.f58n;
        i = oVar.f37731z;
        if (i != 0) {
        }
        h9 = (H) aVar.f1051v;
        if (h9.b()) {
        }
    }

    @Override // P.u
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f1051v).B(this.f1050u);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC4548h c() {
        C0360j c0360j = (C0360j) this.f1051v;
        DialogInterfaceC4548h dialogInterfaceC4548h = new DialogInterfaceC4548h((ContextThemeWrapper) c0360j.f2250v, this.f1050u);
        View view = (View) c0360j.f2254z;
        C4547g c4547g = dialogInterfaceC4548h.f37897y;
        if (view != null) {
            c4547g.f37885n = view;
        } else {
            CharSequence charSequence = (CharSequence) c0360j.f2253y;
            if (charSequence != null) {
                c4547g.f37876d = charSequence;
                TextView textView = c4547g.f37883l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) c0360j.f2252x;
            if (drawable != null) {
                c4547g.f37881j = drawable;
                ImageView imageView = c4547g.f37882k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c4547g.f37882k.setImageDrawable(drawable);
                }
            }
        }
        if (c0360j.f2246B != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) c0360j.f2251w).inflate(c4547g.f37889r, (ViewGroup) null);
            int i = c0360j.f2248n ? c4547g.f37890s : c4547g.f37891t;
            Object obj = c0360j.f2246B;
            ?? r72 = obj;
            if (obj == null) {
                r72 = new C4546f((ContextThemeWrapper) c0360j.f2250v, i, R.id.text1, null);
            }
            c4547g.f37886o = r72;
            c4547g.f37887p = c0360j.f2249u;
            if (((DialogInterface.OnClickListener) c0360j.f2247C) != null) {
                alertController$RecycleListView.setOnItemClickListener(new C4545e(c0360j, c4547g));
            }
            if (c0360j.f2248n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c4547g.f37877e = alertController$RecycleListView;
        }
        dialogInterfaceC4548h.setCancelable(true);
        dialogInterfaceC4548h.setCanceledOnTouchOutside(true);
        dialogInterfaceC4548h.setOnCancelListener(null);
        dialogInterfaceC4548h.setOnDismissListener(null);
        n nVar = (n) c0360j.f2245A;
        if (nVar != null) {
            dialogInterfaceC4548h.setOnKeyListener(nVar);
        }
        return dialogInterfaceC4548h;
    }

    @Override // v2.e
    public /* synthetic */ void d(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f1050u);
        jsonWriter.endObject();
        v2.f.d(jsonWriter, (Map) this.f1051v);
        jsonWriter.endObject();
    }

    public void e(int i, int i6) {
        int i9 = i6 + i;
        char[] cArr = (char[]) this.f1051v;
        if (cArr.length <= i9) {
            int i10 = i * 2;
            if (i9 < i10) {
                i9 = i10;
            }
            char[] copyOf = Arrays.copyOf(cArr, i9);
            h.d(copyOf, "copyOf(...)");
            this.f1051v = copyOf;
        }
    }

    public boolean f() {
        return ((C4597a) this.f1051v) != null;
    }

    @Override // G1.c
    public x g(x xVar, s1.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) xVar.get()).compress((Bitmap.CompressFormat) this.f1051v, this.f1050u, byteArrayOutputStream);
        xVar.a();
        return new D(byteArrayOutputStream.toByteArray());
    }

    @Override // j3.InterfaceC4604a
    public Object h(m mVar) {
        if (!mVar.i()) {
            return Boolean.FALSE;
        }
        C3108dx c3108dx = (C3108dx) mVar.g();
        byte[] b9 = ((C3710p6) ((C3548m6) this.f1051v).j()).b();
        c3108dx.getClass();
        q qVar = new q(c3108dx, b9);
        qVar.f1147b = this.f1050u;
        qVar.b();
        return Boolean.TRUE;
    }

    public void i(int i, y8.c cVar) {
        while (true) {
            int i6 = i >> 1;
            if (i6 == 0) {
                break;
            }
            y8.c cVar2 = ((y8.c[]) this.f1051v)[i6];
            h.b(cVar2);
            if (h.g(0L, cVar.f41999c - cVar2.f41999c) <= 0) {
                break;
            }
            cVar2.f41943f = i;
            ((y8.c[]) this.f1051v)[i] = cVar2;
            i = i6;
        }
        ((y8.c[]) this.f1051v)[i] = cVar;
        cVar.f41943f = i;
    }

    public l j() {
        l yVar;
        Object obj;
        H h9 = (H) this.f1051v;
        byte r9 = h9.r();
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
            H.m(h9, "Cannot read Json element because of unexpected ".concat(g8.l.j(r9)), 0, 6);
            throw null;
        }
        int i = this.f1050u + 1;
        this.f1050u = i;
        if (i == 200) {
            g8.n nVar = new g8.n(this, null);
            A7.a aVar = AbstractC5083a.f41320a;
            C5084b c5084b = new C5084b();
            c5084b.f41321n = nVar;
            c5084b.f41322u = c5084b;
            A7.a aVar2 = AbstractC5083a.f41320a;
            c5084b.f41323v = aVar2;
            while (true) {
                obj = c5084b.f41323v;
                InterfaceC5267d interfaceC5267d = c5084b.f41322u;
                if (interfaceC5267d == null) {
                    break;
                }
                if (h.a(aVar2, obj)) {
                    try {
                        g8.n nVar2 = c5084b.f41321n;
                        kotlin.jvm.internal.u.b(3, nVar2);
                        g8.n nVar3 = new g8.n(nVar2.f37724w, interfaceC5267d);
                        nVar3.f37723v = c5084b;
                        Object invokeSuspend = nVar3.invokeSuspend(v.f41350a);
                        if (invokeSuspend != A7.a.f58n) {
                            interfaceC5267d.resumeWith(invokeSuspend);
                        }
                    } catch (Throwable th) {
                        interfaceC5267d.resumeWith(com.bumptech.glide.d.f(th));
                    }
                } else {
                    c5084b.f41323v = aVar2;
                    interfaceC5267d.resumeWith(obj);
                }
            }
            com.bumptech.glide.d.k(obj);
            yVar = (l) obj;
        } else {
            byte f3 = h9.f((byte) 6);
            if (h9.r() == 4) {
                H.m(h9, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!h9.b()) {
                    break;
                }
                String i6 = h9.i();
                h9.f((byte) 5);
                linkedHashMap.put(i6, j());
                f3 = h9.e();
                if (f3 != 4) {
                    if (f3 != 7) {
                        H.m(h9, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (f3 == 6) {
                h9.f((byte) 7);
            } else if (f3 == 4) {
                g8.l.e(h9, "object");
                throw null;
            }
            yVar = new y(linkedHashMap);
        }
        this.f1050u--;
        return yVar;
    }

    public f8.e k() {
        H h9 = (H) this.f1051v;
        byte e9 = h9.e();
        if (h9.r() == 4) {
            H.m(h9, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (h9.b()) {
            arrayList.add(j());
            e9 = h9.e();
            if (e9 != 4) {
                boolean z3 = e9 == 9;
                int i = h9.f436u;
                if (!z3) {
                    H.m(h9, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (e9 == 8) {
            h9.f((byte) 9);
        } else if (e9 == 4) {
            g8.l.e(h9, "array");
            throw null;
        }
        return new f8.e(arrayList);
    }

    public C l(boolean z3) {
        H h9 = (H) this.f1051v;
        String j6 = !z3 ? h9.j() : h9.i();
        return (z3 || !h.a(j6, "null")) ? new s(j6, z3) : f8.v.INSTANCE;
    }

    public void m() {
        g8.b bVar = g8.b.f37709c;
        char[] array = (char[]) this.f1051v;
        bVar.getClass();
        h.e(array, "array");
        synchronized (bVar) {
            int i = bVar.f34816a;
            if (array.length + i < g8.a.f37708a) {
                bVar.f34816a = i + array.length;
                ((C5127h) bVar.f34817b).addLast(array);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f1049n) {
            case 7:
                String a9 = com.anythink.basead.exoplayer.f.f.a(this.f1050u);
                C4835j.f39730C.f39742k.getClass();
                ((C2993bo) ((C2570Gf) this.f1051v).f25045x).c(a9, System.currentTimeMillis());
                break;
            default:
                String str = (String) obj;
                C3321hu c3321hu = (C3321hu) this.f1051v;
                St st = c3321hu.f30964a;
                if (!st.f27622i0) {
                    c3321hu.f30966c.b(str, st.f27651x0, c3321hu.f30968e, null);
                    break;
                } else {
                    String str2 = c3321hu.f30965b.f28004b;
                    C4129wv c4129wv = c3321hu.f30967d;
                    c4129wv.getClass();
                    C4835j.f39730C.f39742k.getClass();
                    C3709p5 c3709p5 = new C3709p5(str2, str, this.f1050u, System.currentTimeMillis());
                    C2800Tp c2800Tp = c4129wv.f34903a;
                    c2800Tp.getClass();
                    c2800Tp.a(new S0.l(14, c2800Tp, c3709p5));
                    break;
                }
        }
    }

    public void o(y8.c node) {
        y8.c cVar;
        h.e(node, "node");
        int i = node.f41943f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i6 = this.f1050u;
        y8.c cVar2 = ((y8.c[]) this.f1051v)[i6];
        h.b(cVar2);
        node.f41943f = -1;
        ((y8.c[]) this.f1051v)[i6] = null;
        this.f1050u = i6 - 1;
        if (node == cVar2) {
            return;
        }
        int g4 = h.g(0L, cVar2.f41999c - node.f41999c);
        if (g4 == 0) {
            ((y8.c[]) this.f1051v)[i] = cVar2;
            cVar2.f41943f = i;
            return;
        }
        if (g4 >= 0) {
            i(i, cVar2);
            return;
        }
        while (true) {
            int i9 = i << 1;
            int i10 = i9 + 1;
            int i11 = this.f1050u;
            if (i10 > i11) {
                if (i9 > i11) {
                    break;
                }
                cVar = ((y8.c[]) this.f1051v)[i9];
                h.b(cVar);
            } else {
                cVar = ((y8.c[]) this.f1051v)[i9];
                h.b(cVar);
                y8.c cVar3 = ((y8.c[]) this.f1051v)[i10];
                h.b(cVar3);
                if (h.g(0L, cVar3.f41999c - cVar.f41999c) >= 0) {
                    cVar = cVar3;
                }
            }
            if (h.g(0L, cVar.f41999c - cVar2.f41999c) <= 0) {
                break;
            }
            int i12 = cVar.f41943f;
            cVar.f41943f = i;
            ((y8.c[]) this.f1051v)[i] = cVar;
            i = i12;
        }
        ((y8.c[]) this.f1051v)[i] = cVar2;
        cVar2.f41943f = i;
    }

    public void p(String text) {
        h.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(this.f1050u, length);
        text.getChars(0, text.length(), (char[]) this.f1051v, this.f1050u);
        this.f1050u += length;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public String q(ArrayList arrayList) {
        char c9;
        int i;
        char c10 = 5;
        int i6 = 1;
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r52 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            sb.append(((String) arrayList.get(i9)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        C3004c c3004c = new C3004c(16);
        int i10 = this.f1050u;
        PriorityQueue priorityQueue = new PriorityQueue(i10, c3004c);
        int i11 = 0;
        while (i11 < split.length) {
            String[] v9 = SK.v(split[i11], r52);
            if (v9.length != 0) {
                int length = v9.length;
                if (length >= 6) {
                    long y7 = AbstractC2772Sd.y(v9, 6);
                    i = i6;
                    AbstractC2772Sd.n(i10, y7, AbstractC2772Sd.t(v9, r52, 6), 6, priorityQueue);
                    long j6 = y7;
                    int i12 = i;
                    while (true) {
                        int length2 = v9.length;
                        if (i12 >= length2 - 5) {
                            break;
                        }
                        int e9 = SK.e(v9[i12 - 1]);
                        long e10 = SK.e(v9[i12 + 5]);
                        String t6 = AbstractC2772Sd.t(v9, i12, 6);
                        long u3 = (((e10 + 2147483647L) % 1073807359) + (((((j6 + 1073807359) - ((((e9 + 2147483647L) % 1073807359) * AbstractC2772Sd.u(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                        AbstractC2772Sd.n(i10, u3, t6, length2, priorityQueue);
                        split = split;
                        j6 = u3;
                        i12++;
                        c10 = 5;
                    }
                } else {
                    AbstractC2772Sd.n(i10, AbstractC2772Sd.y(v9, length), AbstractC2772Sd.t(v9, r52, length), length, priorityQueue);
                    i = i6;
                }
                c9 = c10;
            } else {
                c9 = c10;
                i = i6;
            }
            i11++;
            split = split;
            c10 = c9;
            i6 = i;
            r52 = 0;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((F8) this.f1051v).Q1(((G8) it.next()).f24938b));
            } catch (IOException e11) {
                int i13 = z.f41319b;
                i.d("Error while writing hash to byteStream", e11);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e12) {
            int i14 = z.f41319b;
            i.d("HashManager: Unable to convert to Base64.", e12);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e13) {
            int i15 = z.f41319b;
            i.d("HashManager: Unable to convert to Base64.", e13);
            return "";
        }
    }

    public void r() {
        int i = this.f1050u;
        long[] jArr = (long[]) this.f1051v;
        if (i == jArr.length) {
            this.f1051v = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.f1051v;
        int i6 = this.f1050u;
        this.f1050u = i6 + 1;
        jArr2[i6] = 0;
    }

    public void s(int i, byte[] bArr) {
        int i6 = 1777080124;
        int i9 = 1777080124;
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
        int i21 = 0;
        char c9 = 0;
        int i22 = 0;
        char c10 = 0;
        char c11 = 0;
        while (true) {
            if (i9 == 719824015) {
                int i23 = (-235787554) + i9;
                i9 += 799411447;
                if (i10 == i11) {
                    i9 = i23;
                }
            } else if (i9 == 1519235462) {
                int[] iArr = (int[]) this.f1051v;
                i12 += (((i13 << i14) ^ (i13 >>> i15)) + i13) ^ (i10 + iArr[i10 & i16]);
                i10 += i17;
                i13 += (iArr[(i10 >>> i18) & i16] + i10) ^ (((i12 << i14) ^ (i12 >>> i15)) + i12);
                i9 -= 799411447;
            } else {
                if (i9 != i6) {
                    bArr[0] = (byte) (i12 >> i19);
                    bArr[1] = (byte) ((((i12 >> i20) & i21) << i19) >> i19);
                    bArr[c9] = (byte) ((((i12 >> i22) & i21) << i19) >> i19);
                    bArr[i16] = (byte) (((i12 & i21) << i19) >> i19);
                    bArr[i14] = (byte) (i13 >> i19);
                    bArr[i15] = (byte) ((((i13 >> i20) & i21) << i19) >> i19);
                    bArr[c10] = (byte) ((((i13 >> i22) & i21) << i19) >> i19);
                    bArr[c11] = (byte) (((i13 & i21) << i19) >> i19);
                    return;
                }
                i9 -= 1057256109;
                i12 = this.f1050u;
                i16 = 3;
                i21 = p.f8473b;
                c11 = 7;
                c10 = 6;
                c9 = 2;
                i19 = 24;
                i18 = 11;
                i17 = 1340169305;
                i15 = 5;
                i14 = 4;
                i11 = -64255200;
                i20 = 16;
                i22 = 8;
                i13 = i;
                i10 = 0;
            }
            i6 = 1777080124;
        }
    }

    public String toString() {
        switch (this.f1049n) {
            case 4:
                RC rc = (RC) this.f1051v;
                ArrayList arrayList = new ArrayList(rc.f27180u);
                for (int i = 0; i < rc.f27180u; i++) {
                    arrayList.add(AbstractC3159eu.a(rc.a(i)));
                }
                String a9 = AbstractC3159eu.a(this.f1050u);
                String obj = arrayList.toString();
                StringBuilder sb = new StringBuilder(u1.h.a(a9.length() + 37, 1, obj));
                sb.append("UnsupportedBrands{major=");
                sb.append(a9);
                sb.append(", compatible=");
                sb.append(obj);
                sb.append("}");
                return sb.toString();
            case 13:
                return new String((char[]) this.f1051v, 0, this.f1050u);
            default:
                return super.toString();
        }
    }

    public long u(K0 k02) {
        int i;
        Cr cr = (Cr) this.f1051v;
        int i6 = 0;
        k02.A(cr.f24252a, 0, 1, false);
        int i9 = cr.f24252a[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while (true) {
            i = i11 + 1;
            if ((i9 & i10) != 0) {
                break;
            }
            i10 >>= 1;
            i11 = i;
        }
        int i12 = i9 & (~i10);
        k02.A(cr.f24252a, 1, i11, false);
        while (i6 < i11) {
            i6++;
            i12 = (cr.f24252a[i6] & 255) + (i12 << 8);
        }
        this.f1050u += i;
        return i12;
    }

    public void v(long[] jArr) {
        int i = this.f1050u;
        int length = jArr.length;
        int i6 = i + length;
        long[] jArr2 = (long[]) this.f1051v;
        int length2 = jArr2.length;
        if (i6 > length2) {
            this.f1051v = Arrays.copyOf(jArr2, Math.max(length2 + length2, i6));
        }
        System.arraycopy(jArr, 0, (long[]) this.f1051v, this.f1050u, length);
        this.f1050u = i6;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f1049n) {
            case 7:
                break;
            default:
                C4835j.f39730C.f39740h.d("BufferingUrlPinger.attributionReportingManager", th);
                break;
        }
    }

    public long x(int i) {
        if (i >= 0 && i < this.f1050u) {
            return ((long[]) this.f1051v)[i];
        }
        int i6 = this.f1050u;
        throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i6).length()), "Invalid index ", i, ", size is ", i6));
    }

    public /* synthetic */ a(int i, Object obj, int i6) {
        this.f1049n = i6;
        this.f1050u = i;
        this.f1051v = obj;
    }

    public /* synthetic */ a(Object obj, int i, int i6) {
        this.f1049n = i6;
        this.f1051v = obj;
        this.f1050u = i;
    }

    public a(boolean z3, boolean z6, boolean z9) {
        this.f1049n = 12;
        int i = 1;
        if (!z3 && !z6 && !z9) {
            i = 0;
        }
        this.f1050u = i;
    }

    public a(int i, int i6) {
        this.f1049n = i6;
        switch (i6) {
            case 8:
                this.f1051v = new long[i];
                break;
            default:
                this.f1051v = new F8(3);
                this.f1050u = i;
                break;
        }
    }

    public a(int i, int i6, int[] iArr) {
        RC rc;
        this.f1049n = i6;
        switch (i6) {
            case 5:
                int length = iArr.length;
                if (length == 4) {
                    this.f1050u = i;
                    this.f1051v = iArr;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(AbstractC4404f.b(length, 44));
                    sb.append(L5.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb.append(length);
                    sb.append(L5.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb.toString());
                }
            default:
                this.f1050u = i;
                if (iArr != null) {
                    int[] copyOf = Arrays.copyOf(iArr, iArr.length);
                    rc = new RC(copyOf, copyOf.length);
                } else {
                    rc = RC.f27178v;
                }
                this.f1051v = rc;
                return;
        }
    }

    public a(M2.b bVar, int i) {
        this.f1049n = 2;
        w.h(bVar);
        this.f1051v = bVar;
        this.f1050u = i;
    }

    public a(C2570Gf c2570Gf, int i) {
        this.f1049n = 7;
        this.f1050u = i;
        Objects.requireNonNull(c2570Gf);
        this.f1051v = c2570Gf;
    }

    public a(C3321hu c3321hu, int i) {
        this.f1049n = 10;
        this.f1050u = i;
        Objects.requireNonNull(c3321hu);
        this.f1051v = c3321hu;
    }

    public a(j jVar, H h9) {
        this.f1049n = 14;
        this.f1051v = h9;
    }

    public a(byte b9, int i) {
        this.f1049n = i;
        switch (i) {
            case 3:
                this.f1051v = new Cr(8);
                break;
            case 16:
                this.f1050u = p.f8473b;
                this.f1051v = null;
                break;
            default:
                this.f1051v = Bitmap.CompressFormat.JPEG;
                this.f1050u = 100;
                break;
        }
    }

    public a(Context context) {
        this.f1049n = 15;
        int e9 = DialogInterfaceC4548h.e(context, 0);
        this.f1051v = new C0360j(new ContextThemeWrapper(context, DialogInterfaceC4548h.e(context, e9)));
        this.f1050u = e9;
    }

    private final void t(Throwable th) {
    }
}
