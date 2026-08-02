package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll37;", "Landroidx/fragment/app/o;", "<init>", "()V", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class l37 extends o {
    public i37 g;
    public gc8 i;
    public cib j;
    public bf k;
    public dt8 l;
    public Function0 m;
    public Function0 n;
    public Function0 o;
    public final jyr h = btf.b(new j37(this, 0));
    public final he0 p = new he0(24, this);
    public final jyr q = btf.b(new j37(this, 1));

    public static void x(l37 l37Var, Function0 function0, Function0 function02, q37 q37Var, int i) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        if ((i & 4) != 0) {
            q37Var = null;
        }
        l37Var.m = function0;
        l37Var.n = function02;
        l37Var.o = q37Var;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        i37 i37Var = this.g;
        if (i37Var == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) i37Var.b(this, s79.class);
        requireActivity().getClass();
        requireActivity().getApplicationContext().getClass();
        requireActivity().getApplication().getClass();
        s77 s77Var = (s77) s79Var;
        bf a = s77Var.a();
        a4g.s(a);
        this.k = a;
        dt8 c = s77Var.c();
        a4g.s(c);
        this.l = c;
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_dk_result_fragment, viewGroup, false);
        if (inflate == null) {
            jj4.j("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.j = new cib(linearLayout, linearLayout);
        return linearLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        ((vb8) this.q.getValue()).b.h().f(new axt("isLightTheme", E));
        Continuation continuation = null;
        x97.y(wyf.F(getLifecycle()), null, null, new bv6(this, continuation, 8), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new k37(this, continuation, 1), 3);
        u9o u9oVar = (u9o) requireArguments().getParcelable("ARG_RESULT_TYPE");
        Long valueOf = u9oVar != null ? Long.valueOf(u9oVar.d()) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        if (longValue > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(this.p, longValue);
        }
        i37 i37Var = this.g;
        if (i37Var == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        m37 D = i37Var.D();
        m37 m37Var = D != null ? D : null;
        if (m37Var != null) {
            if (u9oVar == null) {
                xq0.q("Required value was null.");
                return;
            }
            Context requireContext = requireContext();
            requireContext.getClass();
            m37Var.m = u9oVar;
            x97.y(ot0.F(m37Var), null, null, new vn1(m37Var, u9oVar, requireContext, E, (Continuation) null), 3);
        }
        if ((u9oVar instanceof s9o) || u9oVar == null) {
            return;
        }
        y(u9oVar);
    }

    public final void y(u9o u9oVar) {
        String str;
        String str2;
        String str3;
        wds i = u9oVar.i();
        String str4 = null;
        if (i instanceof uds) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(((uds) i).a);
            }
            str = null;
        } else {
            if (i instanceof vds) {
                str = ((vds) i).a;
            }
            str = null;
        }
        if (str == null) {
            str = "";
        }
        wds h = u9oVar.h();
        if (h instanceof uds) {
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(((uds) h).a);
            }
            str2 = null;
        } else {
            if (h instanceof vds) {
                str2 = ((vds) h).a;
            }
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        wds g = u9oVar.g();
        if (g instanceof uds) {
            Context context3 = getContext();
            if (context3 != null) {
                str3 = context3.getString(((uds) g).a);
            }
            str3 = null;
        } else {
            if (g instanceof vds) {
                str3 = ((vds) g).a;
            }
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        wds e = u9oVar.e();
        if (e instanceof uds) {
            Context context4 = getContext();
            if (context4 != null) {
                str4 = context4.getString(((uds) e).a);
            }
        } else if (e instanceof vds) {
            str4 = ((vds) e).a;
        }
        String str5 = str4 != null ? str4 : "";
        gc8 gc8Var = this.i;
        if (gc8Var != null) {
            gc8Var.N("result_screen_screen_type", u9oVar.j());
            gc8Var.N("result_screen_has_back_button", String.valueOf(u9oVar.k()));
            gc8Var.N("result_screen_has_close_button", String.valueOf(u9oVar.l()));
            gc8Var.N("result_screen_title_text", str);
            gc8Var.N("result_screen_subtitle_text", str2);
            gc8Var.N("result_screen_main_button_text", str3);
            gc8Var.N("result_screen_complementary_button_text", str5);
            q9o f = u9oVar.f();
            if (f != null) {
                gc8Var.N("result_screen_identifier", f.d());
            }
        }
    }
}
