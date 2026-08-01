package z;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387i {

    /* renamed from: a, reason: collision with root package name */
    public int f4868a;

    /* renamed from: b, reason: collision with root package name */
    public final C0390l f4869b;

    /* renamed from: c, reason: collision with root package name */
    public final C0389k f4870c;

    /* renamed from: d, reason: collision with root package name */
    public final C0388j f4871d;
    public final C0391m e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4872f;

    public C0387i() {
        C0390l c0390l = new C0390l();
        c0390l.f4944a = 0;
        c0390l.f4945b = 0;
        c0390l.f4946c = 1.0f;
        c0390l.f4947d = Float.NaN;
        this.f4869b = c0390l;
        C0389k c0389k = new C0389k();
        c0389k.f4937a = -1;
        c0389k.f4938b = 0;
        c0389k.f4939c = -1;
        c0389k.f4940d = Float.NaN;
        c0389k.e = Float.NaN;
        c0389k.f4941f = Float.NaN;
        c0389k.f4942g = -1;
        c0389k.f4943h = null;
        c0389k.i = -1;
        this.f4870c = c0389k;
        C0388j c0388j = new C0388j();
        c0388j.f4899a = false;
        c0388j.f4905d = -1;
        c0388j.e = -1;
        c0388j.f4908f = -1.0f;
        c0388j.f4910g = true;
        c0388j.f4912h = -1;
        c0388j.i = -1;
        c0388j.j = -1;
        c0388j.f4916k = -1;
        c0388j.f4918l = -1;
        c0388j.f4920m = -1;
        c0388j.f4922n = -1;
        c0388j.f4924o = -1;
        c0388j.f4926p = -1;
        c0388j.f4927q = -1;
        c0388j.f4928r = -1;
        c0388j.f4929s = -1;
        c0388j.f4930t = -1;
        c0388j.f4931u = -1;
        c0388j.f4932v = -1;
        c0388j.f4933w = 0.5f;
        c0388j.f4934x = 0.5f;
        c0388j.f4935y = null;
        c0388j.f4936z = -1;
        c0388j.f4874A = 0;
        c0388j.f4875B = RecyclerView.f2111C0;
        c0388j.f4876C = -1;
        c0388j.f4877D = -1;
        c0388j.f4878E = -1;
        c0388j.f4879F = 0;
        c0388j.f4880G = 0;
        c0388j.f4881H = 0;
        c0388j.f4882I = 0;
        c0388j.J = 0;
        c0388j.f4883K = 0;
        c0388j.f4884L = 0;
        c0388j.f4885M = Integer.MIN_VALUE;
        c0388j.f4886N = Integer.MIN_VALUE;
        c0388j.f4887O = Integer.MIN_VALUE;
        c0388j.f4888P = Integer.MIN_VALUE;
        c0388j.f4889Q = Integer.MIN_VALUE;
        c0388j.f4890R = Integer.MIN_VALUE;
        c0388j.f4891S = Integer.MIN_VALUE;
        c0388j.f4892T = -1.0f;
        c0388j.f4893U = -1.0f;
        c0388j.f4894V = 0;
        c0388j.f4895W = 0;
        c0388j.f4896X = 0;
        c0388j.f4897Y = 0;
        c0388j.f4898Z = 0;
        c0388j.f4900a0 = 0;
        c0388j.f4902b0 = 0;
        c0388j.f4904c0 = 0;
        c0388j.f4906d0 = 1.0f;
        c0388j.f4907e0 = 1.0f;
        c0388j.f4909f0 = -1;
        c0388j.f4911g0 = 0;
        c0388j.f4913h0 = -1;
        c0388j.f4919l0 = false;
        c0388j.f4921m0 = false;
        c0388j.f4923n0 = true;
        c0388j.f4925o0 = 0;
        this.f4871d = c0388j;
        C0391m c0391m = new C0391m();
        c0391m.f4949a = RecyclerView.f2111C0;
        c0391m.f4950b = RecyclerView.f2111C0;
        c0391m.f4951c = RecyclerView.f2111C0;
        c0391m.f4952d = 1.0f;
        c0391m.e = 1.0f;
        c0391m.f4953f = Float.NaN;
        c0391m.f4954g = Float.NaN;
        c0391m.f4955h = -1;
        c0391m.i = RecyclerView.f2111C0;
        c0391m.j = RecyclerView.f2111C0;
        c0391m.f4956k = RecyclerView.f2111C0;
        c0391m.f4957l = false;
        c0391m.f4958m = RecyclerView.f2111C0;
        this.e = c0391m;
        this.f4872f = new HashMap();
    }

    public final void a(C0383e c0383e) {
        C0388j c0388j = this.f4871d;
        c0383e.e = c0388j.f4912h;
        c0383e.f4818f = c0388j.i;
        c0383e.f4820g = c0388j.j;
        c0383e.f4822h = c0388j.f4916k;
        c0383e.i = c0388j.f4918l;
        c0383e.j = c0388j.f4920m;
        c0383e.f4826k = c0388j.f4922n;
        c0383e.f4828l = c0388j.f4924o;
        c0383e.f4830m = c0388j.f4926p;
        c0383e.f4832n = c0388j.f4927q;
        c0383e.f4834o = c0388j.f4928r;
        c0383e.f4840s = c0388j.f4929s;
        c0383e.f4841t = c0388j.f4930t;
        c0383e.f4842u = c0388j.f4931u;
        c0383e.f4843v = c0388j.f4932v;
        ((ViewGroup.MarginLayoutParams) c0383e).leftMargin = c0388j.f4879F;
        ((ViewGroup.MarginLayoutParams) c0383e).rightMargin = c0388j.f4880G;
        ((ViewGroup.MarginLayoutParams) c0383e).topMargin = c0388j.f4881H;
        ((ViewGroup.MarginLayoutParams) c0383e).bottomMargin = c0388j.f4882I;
        c0383e.f4784A = c0388j.f4890R;
        c0383e.f4785B = c0388j.f4889Q;
        c0383e.f4845x = c0388j.f4886N;
        c0383e.f4847z = c0388j.f4888P;
        c0383e.f4788E = c0388j.f4933w;
        c0383e.f4789F = c0388j.f4934x;
        c0383e.f4836p = c0388j.f4936z;
        c0383e.f4838q = c0388j.f4874A;
        c0383e.f4839r = c0388j.f4875B;
        c0383e.f4790G = c0388j.f4935y;
        c0383e.f4802T = c0388j.f4876C;
        c0383e.f4803U = c0388j.f4877D;
        c0383e.f4792I = c0388j.f4892T;
        c0383e.f4791H = c0388j.f4893U;
        c0383e.f4793K = c0388j.f4895W;
        c0383e.J = c0388j.f4894V;
        c0383e.f4805W = c0388j.f4919l0;
        c0383e.f4806X = c0388j.f4921m0;
        c0383e.f4794L = c0388j.f4896X;
        c0383e.f4795M = c0388j.f4897Y;
        c0383e.f4798P = c0388j.f4898Z;
        c0383e.f4799Q = c0388j.f4900a0;
        c0383e.f4796N = c0388j.f4902b0;
        c0383e.f4797O = c0388j.f4904c0;
        c0383e.f4800R = c0388j.f4906d0;
        c0383e.f4801S = c0388j.f4907e0;
        c0383e.f4804V = c0388j.f4878E;
        c0383e.f4813c = c0388j.f4908f;
        c0383e.f4809a = c0388j.f4905d;
        c0383e.f4811b = c0388j.e;
        ((ViewGroup.MarginLayoutParams) c0383e).width = c0388j.f4901b;
        ((ViewGroup.MarginLayoutParams) c0383e).height = c0388j.f4903c;
        String str = c0388j.f4917k0;
        if (str != null) {
            c0383e.f4807Y = str;
        }
        c0383e.f4808Z = c0388j.f4925o0;
        c0383e.setMarginStart(c0388j.f4883K);
        c0383e.setMarginEnd(c0388j.J);
        c0383e.a();
    }

    public final Object clone() {
        C0387i c0387i = new C0387i();
        C0388j c0388j = c0387i.f4871d;
        c0388j.getClass();
        C0388j c0388j2 = this.f4871d;
        c0388j.f4899a = c0388j2.f4899a;
        c0388j.f4901b = c0388j2.f4901b;
        c0388j.f4903c = c0388j2.f4903c;
        c0388j.f4905d = c0388j2.f4905d;
        c0388j.e = c0388j2.e;
        c0388j.f4908f = c0388j2.f4908f;
        c0388j.f4910g = c0388j2.f4910g;
        c0388j.f4912h = c0388j2.f4912h;
        c0388j.i = c0388j2.i;
        c0388j.j = c0388j2.j;
        c0388j.f4916k = c0388j2.f4916k;
        c0388j.f4918l = c0388j2.f4918l;
        c0388j.f4920m = c0388j2.f4920m;
        c0388j.f4922n = c0388j2.f4922n;
        c0388j.f4924o = c0388j2.f4924o;
        c0388j.f4926p = c0388j2.f4926p;
        c0388j.f4927q = c0388j2.f4927q;
        c0388j.f4928r = c0388j2.f4928r;
        c0388j.f4929s = c0388j2.f4929s;
        c0388j.f4930t = c0388j2.f4930t;
        c0388j.f4931u = c0388j2.f4931u;
        c0388j.f4932v = c0388j2.f4932v;
        c0388j.f4933w = c0388j2.f4933w;
        c0388j.f4934x = c0388j2.f4934x;
        c0388j.f4935y = c0388j2.f4935y;
        c0388j.f4936z = c0388j2.f4936z;
        c0388j.f4874A = c0388j2.f4874A;
        c0388j.f4875B = c0388j2.f4875B;
        c0388j.f4876C = c0388j2.f4876C;
        c0388j.f4877D = c0388j2.f4877D;
        c0388j.f4878E = c0388j2.f4878E;
        c0388j.f4879F = c0388j2.f4879F;
        c0388j.f4880G = c0388j2.f4880G;
        c0388j.f4881H = c0388j2.f4881H;
        c0388j.f4882I = c0388j2.f4882I;
        c0388j.J = c0388j2.J;
        c0388j.f4883K = c0388j2.f4883K;
        c0388j.f4884L = c0388j2.f4884L;
        c0388j.f4885M = c0388j2.f4885M;
        c0388j.f4886N = c0388j2.f4886N;
        c0388j.f4887O = c0388j2.f4887O;
        c0388j.f4888P = c0388j2.f4888P;
        c0388j.f4889Q = c0388j2.f4889Q;
        c0388j.f4890R = c0388j2.f4890R;
        c0388j.f4891S = c0388j2.f4891S;
        c0388j.f4892T = c0388j2.f4892T;
        c0388j.f4893U = c0388j2.f4893U;
        c0388j.f4894V = c0388j2.f4894V;
        c0388j.f4895W = c0388j2.f4895W;
        c0388j.f4896X = c0388j2.f4896X;
        c0388j.f4897Y = c0388j2.f4897Y;
        c0388j.f4898Z = c0388j2.f4898Z;
        c0388j.f4900a0 = c0388j2.f4900a0;
        c0388j.f4902b0 = c0388j2.f4902b0;
        c0388j.f4904c0 = c0388j2.f4904c0;
        c0388j.f4906d0 = c0388j2.f4906d0;
        c0388j.f4907e0 = c0388j2.f4907e0;
        c0388j.f4909f0 = c0388j2.f4909f0;
        c0388j.f4911g0 = c0388j2.f4911g0;
        c0388j.f4913h0 = c0388j2.f4913h0;
        c0388j.f4917k0 = c0388j2.f4917k0;
        int[] iArr = c0388j2.f4914i0;
        if (iArr == null || c0388j2.f4915j0 != null) {
            c0388j.f4914i0 = null;
        } else {
            c0388j.f4914i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0388j.f4915j0 = c0388j2.f4915j0;
        c0388j.f4919l0 = c0388j2.f4919l0;
        c0388j.f4921m0 = c0388j2.f4921m0;
        c0388j.f4923n0 = c0388j2.f4923n0;
        c0388j.f4925o0 = c0388j2.f4925o0;
        C0389k c0389k = c0387i.f4870c;
        c0389k.getClass();
        C0389k c0389k2 = this.f4870c;
        c0389k2.getClass();
        c0389k.f4937a = c0389k2.f4937a;
        c0389k.f4939c = c0389k2.f4939c;
        c0389k.e = c0389k2.e;
        c0389k.f4940d = c0389k2.f4940d;
        C0390l c0390l = c0387i.f4869b;
        C0390l c0390l2 = this.f4869b;
        c0390l.f4944a = c0390l2.f4944a;
        c0390l.f4946c = c0390l2.f4946c;
        c0390l.f4947d = c0390l2.f4947d;
        c0390l.f4945b = c0390l2.f4945b;
        C0391m c0391m = c0387i.e;
        c0391m.getClass();
        C0391m c0391m2 = this.e;
        c0391m2.getClass();
        c0391m.f4949a = c0391m2.f4949a;
        c0391m.f4950b = c0391m2.f4950b;
        c0391m.f4951c = c0391m2.f4951c;
        c0391m.f4952d = c0391m2.f4952d;
        c0391m.e = c0391m2.e;
        c0391m.f4953f = c0391m2.f4953f;
        c0391m.f4954g = c0391m2.f4954g;
        c0391m.f4955h = c0391m2.f4955h;
        c0391m.i = c0391m2.i;
        c0391m.j = c0391m2.j;
        c0391m.f4956k = c0391m2.f4956k;
        c0391m.f4957l = c0391m2.f4957l;
        c0391m.f4958m = c0391m2.f4958m;
        c0387i.f4868a = this.f4868a;
        return c0387i;
    }
}
