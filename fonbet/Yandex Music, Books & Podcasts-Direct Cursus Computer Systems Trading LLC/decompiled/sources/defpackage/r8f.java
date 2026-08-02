package defpackage;

import android.R;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.catalog.juicybottommenu.adapter.holders.a;
import ru.yandex.music.catalog.juicybottommenu.adapter.holders.b;
import ru.yandex.music.catalog.juicybottommenu.adapter.holders.c;
import ru.yandex.music.ui.view.EllipsizingTextView;

/* loaded from: classes4.dex */
public final class r8f extends qon {
    public final kxi d;
    public final w8f e;
    public final w8f f;
    public final ArrayList g = new ArrayList();
    public List h = c5b.a;
    public String i;
    public Object j;
    public n1u k;
    public n68 l;

    public r8f(kxi kxiVar, w8f w8fVar, w8f w8fVar2) {
        this.d = kxiVar;
        this.e = w8fVar;
        this.f = w8fVar2;
    }

    @Override // defpackage.qon
    public final int c() {
        return this.g.size();
    }

    @Override // defpackage.qon
    public final int f(int i) {
        return v(i).ordinal();
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        String str;
        if (opnVar instanceof q8f) {
            Object obj = this.j;
            if (obj != null) {
                ((s13) opnVar).e(obj);
            } else {
                str = "View holder HEADER_TYPE_ID are bound, but header is null";
                su4.s(2, null, str, null);
            }
        } else {
            boolean z = opnVar instanceof b;
            ArrayList arrayList = this.g;
            if (z) {
                Object obj2 = arrayList.get(i);
                obj2.getClass();
                String str2 = ((z7f) obj2).a;
                if (str2 == null) {
                    su4.s(2, null, "View holder DESCRIPTION_TYPE_ID are bound, but description and its actions are null", null);
                }
                if (str2 != null) {
                    ((b) opnVar).e(str2);
                } else {
                    b bVar = (b) opnVar;
                    Context context = bVar.a.getContext();
                    EllipsizingTextView ellipsizingTextView = (EllipsizingTextView) bVar.w.a(b.x[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    context.getClass();
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(weo.M(context, R.attr.textColorLink));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "");
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                    ellipsizingTextView.setText(new SpannedString(spannableStringBuilder));
                }
            } else if (opnVar instanceof a) {
                Object obj3 = arrayList.get(i);
                obj3.getClass();
                ((a) opnVar).e(((y7f) obj3).a);
            } else if (opnVar instanceof c) {
                Object obj4 = arrayList.get(i);
                obj4.getClass();
                ((c) opnVar).e(null);
            } else if (!(opnVar instanceof cxa)) {
                if (opnVar instanceof blu) {
                    Object obj5 = arrayList.get(i);
                    obj5.getClass();
                    n1u n1uVar = ((e8f) obj5).a;
                    blu bluVar = (blu) opnVar;
                    String str3 = n1uVar.a;
                    String str4 = n1uVar.d;
                    Function1 function1 = n1uVar.g;
                    String str5 = n1uVar.e;
                    d85 d85Var = n1uVar.f;
                    alu aluVar = n1uVar.b;
                    xes xesVar = n1uVar.c;
                    str3.getClass();
                    aluVar.getClass();
                    function1.getClass();
                    bluVar.u.setContent(new wn5(new zku(aluVar, bluVar, xesVar, new f4m(22, function1), str3, str4, d85Var, str5, 0), 2074933994, true));
                } else if (opnVar instanceof r68) {
                    Object obj6 = arrayList.get(i);
                    obj6.getClass();
                    n68 n68Var = ((a8f) obj6).a;
                    n68Var.getClass();
                    List list = n68Var.a;
                    ((r68) opnVar).u.setContent(new wn5(new p68(q68.a, list, 0), 24901305, true));
                } else {
                    str = "Unknown view holder";
                    su4.s(2, null, str, null);
                }
            }
        }
        opnVar.a.setAccessibilityDelegate(new fb(3, this));
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        switch (v8f.values()[i].ordinal()) {
            case 0:
                return new q8f(viewGroup);
            case 1:
                return new b(viewGroup, this.e);
            case 2:
                Context context = viewGroup.getContext();
                context.getClass();
                return new blu(new ComposeView(context, null, 0, 6, null), this.d);
            case 3:
                return new a(viewGroup);
            case 4:
                return new c(viewGroup);
            case 5:
                return new cxa(new View(viewGroup.getContext()));
            case 6:
                Context context2 = viewGroup.getContext();
                context2.getClass();
                return new r68(new ComposeView(context2, null, 0, 6, null));
            default:
                b6e.s();
                return null;
        }
    }

    public final int u(int i) {
        f8f f8fVar = (f8f) this.g.get(i);
        if ((f8fVar instanceof c8f) || (f8fVar instanceof z7f)) {
            return -1;
        }
        if (f8fVar instanceof y7f) {
            return ((y7f) f8fVar).a.b.a;
        }
        if (f8fVar instanceof d8f) {
            throw null;
        }
        if ((f8fVar instanceof b8f) || (f8fVar instanceof e8f) || (f8fVar instanceof a8f)) {
            return -1;
        }
        b6e.s();
        return 0;
    }

    public final v8f v(int i) {
        f8f f8fVar = (f8f) this.g.get(i);
        if (f8fVar instanceof c8f) {
            return v8f.a;
        }
        if (f8fVar instanceof z7f) {
            return v8f.b;
        }
        if (f8fVar instanceof y7f) {
            return v8f.d;
        }
        if (f8fVar instanceof d8f) {
            return v8f.e;
        }
        if (f8fVar instanceof b8f) {
            return v8f.f;
        }
        if (f8fVar instanceof e8f) {
            return v8f.c;
        }
        if (f8fVar instanceof a8f) {
            return v8f.g;
        }
        b6e.s();
        return null;
    }

    public final void w(List list, String str, Object obj, n1u n1uVar, n68 n68Var) {
        list.getClass();
        this.h = list;
        this.i = str;
        this.j = obj;
        this.k = n1uVar;
        this.l = n68Var;
        ArrayList arrayList = this.g;
        arrayList.clear();
        Object obj2 = this.j;
        if (obj2 != null) {
            arrayList.add(new c8f(obj2));
        }
        n68 n68Var2 = this.l;
        if (n68Var2 != null) {
            arrayList.add(new a8f(n68Var2));
        }
        String str2 = this.i;
        if (str2 != null) {
            arrayList.add(new z7f(str2));
        }
        n1u n1uVar2 = this.k;
        if (n1uVar2 != null) {
            arrayList.add(new e8f(n1uVar2));
        }
        List<vf> list2 = this.h;
        ArrayList arrayList2 = new ArrayList();
        for (vf vfVar : list2) {
            f8f y7fVar = vfVar instanceof xb5 ? new y7f((xb5) vfVar) : vfVar instanceof n9s ? new d8f() : null;
            if (y7fVar != null) {
                arrayList2.add(y7fVar);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.add(b8f.a);
        g();
    }
}
